package io.github.muntashirakon.adb.android;

import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class AdbMdns {
    public static final String SERVICE_TYPE_ADB = "adb";
    public static final String SERVICE_TYPE_TLS_CONNECT = "adb-tls-connect";
    public static final String SERVICE_TYPE_TLS_PAIRING = "adb-tls-pairing";
    private final OnAdbDaemonDiscoveredListener mAdbDaemonDiscoveredListener;
    private final Context mContext;
    private final NsdManager.DiscoveryListener mDiscoveryListener;
    private final NsdManager mNsdManager;
    private boolean mRegistered;
    private boolean mRunning;
    private String mServiceName;
    private final String mServiceType;

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public interface OnAdbDaemonDiscoveredListener {
        void onPortChanged(InetAddress inetAddress, int i);
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ServiceType {
    }

    public AdbMdns(Context context, String str, OnAdbDaemonDiscoveredListener onAdbDaemonDiscoveredListener) {
        Objects.requireNonNull(context);
        this.mContext = context;
        Objects.requireNonNull(str);
        this.mServiceType = String.format("_%s._tcp", str);
        Objects.requireNonNull(onAdbDaemonDiscoveredListener);
        this.mAdbDaemonDiscoveredListener = onAdbDaemonDiscoveredListener;
        this.mNsdManager = (NsdManager) context.getSystemService("servicediscovery");
        this.mDiscoveryListener = new DiscoveryListener();
    }

    private boolean isPortAvailable(int i) {
        try {
            ServerSocket serverSocket = new ServerSocket();
            try {
                serverSocket.bind(new InetSocketAddress(AndroidUtils.getHostIpAddress(this.mContext), i), 1);
                serverSocket.close();
                return false;
            } catch (Throwable th) {
                try {
                    serverSocket.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDiscoverStop() {
        this.mRegistered = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDiscoveryStart() {
        this.mRegistered = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onServiceFound(NsdServiceInfo nsdServiceInfo) {
        this.mNsdManager.resolveService(nsdServiceInfo, new ResolveListener());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onServiceLost(NsdServiceInfo nsdServiceInfo) {
        String str = this.mServiceName;
        if (str == null || !str.equals(nsdServiceInfo.getServiceName())) {
            return;
        }
        this.mAdbDaemonDiscoveredListener.onPortChanged(nsdServiceInfo.getHost(), -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onServiceResolved(NsdServiceInfo nsdServiceInfo) {
        if (this.mRunning) {
            try {
                ArrayList list = Collections.list(NetworkInterface.getNetworkInterfaces());
                int size = list.size();
                int i = 0;
                while (i < size) {
                    Object obj = list.get(i);
                    i++;
                    ArrayList list2 = Collections.list(((NetworkInterface) obj).getInetAddresses());
                    int size2 = list2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = list2.get(i2);
                        i2++;
                        if (Objects.equals(((InetAddress) obj2).getHostAddress(), nsdServiceInfo.getHost().getHostAddress()) && isPortAvailable(nsdServiceInfo.getPort())) {
                            this.mServiceName = nsdServiceInfo.getServiceName();
                            this.mAdbDaemonDiscoveredListener.onPortChanged(nsdServiceInfo.getHost(), nsdServiceInfo.getPort());
                        }
                    }
                }
            } catch (SocketException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isRunning() {
        return this.mRunning;
    }

    public void start() {
        if (this.mRunning) {
            return;
        }
        this.mRunning = true;
        if (this.mRegistered) {
            return;
        }
        this.mNsdManager.discoverServices(this.mServiceType, 1, this.mDiscoveryListener);
    }

    public void stop() {
        if (this.mRunning) {
            this.mRunning = false;
            if (this.mRegistered) {
                this.mNsdManager.stopServiceDiscovery(this.mDiscoveryListener);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static class DiscoveryListener implements NsdManager.DiscoveryListener {
        private final AdbMdns mAdbMdns;

        private DiscoveryListener(AdbMdns adbMdns) {
            this.mAdbMdns = adbMdns;
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onDiscoveryStarted(String str) {
            this.mAdbMdns.onDiscoveryStart();
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onDiscoveryStopped(String str) {
            this.mAdbMdns.onDiscoverStop();
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onServiceFound(NsdServiceInfo nsdServiceInfo) {
            this.mAdbMdns.onServiceFound(nsdServiceInfo);
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onServiceLost(NsdServiceInfo nsdServiceInfo) {
            this.mAdbMdns.onServiceLost(nsdServiceInfo);
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onStartDiscoveryFailed(String str, int i) {
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onStopDiscoveryFailed(String str, int i) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static class ResolveListener implements NsdManager.ResolveListener {
        private final AdbMdns mAdbMdns;

        private ResolveListener(AdbMdns adbMdns) {
            this.mAdbMdns = adbMdns;
        }

        @Override // android.net.nsd.NsdManager.ResolveListener
        public void onServiceResolved(NsdServiceInfo nsdServiceInfo) {
            this.mAdbMdns.onServiceResolved(nsdServiceInfo);
        }

        @Override // android.net.nsd.NsdManager.ResolveListener
        public void onResolveFailed(NsdServiceInfo nsdServiceInfo, int i) {
        }
    }
}

package io.github.muntashirakon.adb;

import android.content.Context;
import io.github.muntashirakon.adb.android.AdbMdns;
import java.io.Closeable;
import java.io.IOException;
import java.net.InetAddress;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.security.auth.DestroyFailedException;
import p000.C0623f0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbsAdbConnectionManager implements Closeable {
    private AdbConnection mAdbConnection;
    private final Object mLock = new Object();
    private String mHostAddress = "127.0.0.1";
    private int mApi = 1;
    private long mTimeout = Long.MAX_VALUE;
    private TimeUnit mTimeoutUnit = TimeUnit.MILLISECONDS;
    private boolean mThrowOnUnauthorised = false;

    private KeyPair getAdbKeyPair() {
        PrivateKey privateKey = getPrivateKey();
        Objects.requireNonNull(privateKey);
        Certificate certificate = getCertificate();
        Objects.requireNonNull(certificate);
        return new KeyPair(privateKey, certificate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$autoConnect$0(AtomicReference atomicReference, AtomicInteger atomicInteger, CountDownLatch countDownLatch, InetAddress inetAddress, int i) {
        if (inetAddress != null) {
            atomicReference.set(inetAddress.getHostAddress());
            atomicInteger.set(i);
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$autoConnect$1(AtomicReference atomicReference, AtomicInteger atomicInteger, CountDownLatch countDownLatch, InetAddress inetAddress, int i) {
        if (inetAddress != null) {
            atomicReference.set(inetAddress.getHostAddress());
            atomicInteger.set(i);
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$autoConnect$2(AtomicReference atomicReference, AtomicInteger atomicInteger, CountDownLatch countDownLatch, InetAddress inetAddress, int i) {
        if (inetAddress != null) {
            atomicReference.set(inetAddress.getHostAddress());
            atomicInteger.set(i);
        }
        countDownLatch.countDown();
    }

    public boolean autoConnect(Context context, long j) {
        boolean zConnect;
        synchronized (this.mLock) {
            try {
                AtomicInteger atomicInteger = new AtomicInteger(-1);
                AtomicReference atomicReference = new AtomicReference(null);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                AdbMdns adbMdns = new AdbMdns(context, AdbMdns.SERVICE_TYPE_ADB, new C0623f0(atomicReference, atomicInteger, countDownLatch, 0));
                adbMdns.start();
                AdbMdns adbMdns2 = new AdbMdns(context, AdbMdns.SERVICE_TYPE_TLS_CONNECT, new C0623f0(atomicReference, atomicInteger, countDownLatch, 1));
                adbMdns2.start();
                try {
                    if (!countDownLatch.await(j, TimeUnit.MILLISECONDS)) {
                        throw new InterruptedException("Timed out while trying to find a valid host address and port");
                    }
                    adbMdns.stop();
                    adbMdns2.stop();
                    String str = (String) atomicReference.get();
                    int i = atomicInteger.get();
                    if (str == null || i == -1) {
                        throw new IOException("Could not find any valid host address or port");
                    }
                    this.mHostAddress = str;
                    AdbConnection.Builder keyPair = new AdbConnection.Builder(str, i).setApi(this.mApi).setKeyPair(getAdbKeyPair());
                    String deviceName = getDeviceName();
                    Objects.requireNonNull(deviceName);
                    AdbConnection adbConnectionBuild = keyPair.setDeviceName(deviceName).build();
                    this.mAdbConnection = adbConnectionBuild;
                    zConnect = adbConnectionBuild.connect(this.mTimeout, this.mTimeoutUnit, this.mThrowOnUnauthorised);
                } catch (Throwable th) {
                    adbMdns.stop();
                    adbMdns2.stop();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zConnect;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            getPrivateKey().destroy();
        } catch (NoSuchMethodError | DestroyFailedException e) {
            e.printStackTrace();
        }
        AdbConnection adbConnection = this.mAdbConnection;
        if (adbConnection != null) {
            adbConnection.close();
            this.mAdbConnection = null;
        }
    }

    public boolean connect(int i) {
        synchronized (this.mLock) {
            try {
                if (isConnected()) {
                    return false;
                }
                AdbConnection.Builder keyPair = new AdbConnection.Builder(this.mHostAddress, i).setApi(this.mApi).setKeyPair(getAdbKeyPair());
                String deviceName = getDeviceName();
                Objects.requireNonNull(deviceName);
                AdbConnection adbConnectionBuild = keyPair.setDeviceName(deviceName).build();
                this.mAdbConnection = adbConnectionBuild;
                return adbConnectionBuild.connect(this.mTimeout, this.mTimeoutUnit, this.mThrowOnUnauthorised);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean connectTcp(Context context, long j) {
        return autoConnect(context, AdbMdns.SERVICE_TYPE_ADB, j);
    }

    public boolean connectTls(Context context, long j) {
        return autoConnect(context, AdbMdns.SERVICE_TYPE_TLS_CONNECT, j);
    }

    public void disconnect() {
        synchronized (this.mLock) {
            try {
                AdbConnection adbConnection = this.mAdbConnection;
                if (adbConnection != null) {
                    adbConnection.close();
                    this.mAdbConnection = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public AdbConnection getAdbConnection() {
        AdbConnection adbConnection;
        synchronized (this.mLock) {
            adbConnection = this.mAdbConnection;
        }
        return adbConnection;
    }

    public int getApi() {
        return this.mApi;
    }

    public abstract Certificate getCertificate();

    public abstract String getDeviceName();

    public String getHostAddress() {
        return this.mHostAddress;
    }

    public abstract PrivateKey getPrivateKey();

    public long getTimeout() {
        return this.mTimeoutUnit.toMillis(this.mTimeout);
    }

    public TimeUnit getTimeoutUnit() {
        return this.mTimeoutUnit;
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.mLock) {
            try {
                AdbConnection adbConnection = this.mAdbConnection;
                z = adbConnection != null && adbConnection.isConnected() && this.mAdbConnection.isConnectionEstablished();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public boolean isThrowOnUnauthorised() {
        return this.mThrowOnUnauthorised;
    }

    public AdbStream openStream(String str) {
        AdbStream adbStreamOpen;
        synchronized (this.mLock) {
            try {
                AdbConnection adbConnection = this.mAdbConnection;
                if (adbConnection == null || !adbConnection.isConnected()) {
                    throw new IOException("Not connected to ADB.");
                }
                try {
                    adbStreamOpen = this.mAdbConnection.open(str);
                } catch (AdbPairingRequiredException e) {
                    throw new IllegalStateException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return adbStreamOpen;
    }

    public boolean pair(String str, int i, String str2) {
        synchronized (this.mLock) {
            KeyPair adbKeyPair = getAdbKeyPair();
            Objects.requireNonNull(str);
            Objects.requireNonNull(str2);
            PairingConnectionCtx pairingConnectionCtx = new PairingConnectionCtx(str, i, StringCompat.getBytes(str2, "UTF-8"), adbKeyPair, getDeviceName());
            try {
                pairingConnectionCtx.start();
                pairingConnectionCtx.close();
            } catch (Throwable th) {
                try {
                    pairingConnectionCtx.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        return true;
    }

    public void setApi(int i) {
        this.mApi = i;
    }

    public void setHostAddress(String str) {
        Objects.requireNonNull(str);
        this.mHostAddress = str;
    }

    public void setThrowOnUnauthorised(boolean z) {
        this.mThrowOnUnauthorised = z;
    }

    public void setTimeout(long j, TimeUnit timeUnit) {
        this.mTimeout = j;
        this.mTimeoutUnit = timeUnit;
    }

    public AdbStream openStream(int i, String... strArr) {
        AdbStream adbStreamOpen;
        synchronized (this.mLock) {
            try {
                AdbConnection adbConnection = this.mAdbConnection;
                if (adbConnection != null && adbConnection.isConnected()) {
                    try {
                        adbStreamOpen = this.mAdbConnection.open(i, strArr);
                    } catch (AdbPairingRequiredException e) {
                        throw new IllegalStateException(e);
                    }
                } else {
                    throw new IOException("Not connected to ADB.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return adbStreamOpen;
    }

    public boolean pair(int i, String str) {
        return pair(this.mHostAddress, i, str);
    }

    public boolean connect(String str, int i) {
        synchronized (this.mLock) {
            try {
                if (isConnected()) {
                    return false;
                }
                this.mHostAddress = str;
                AdbConnection.Builder keyPair = new AdbConnection.Builder(str, i).setApi(this.mApi).setKeyPair(getAdbKeyPair());
                String deviceName = getDeviceName();
                Objects.requireNonNull(deviceName);
                AdbConnection adbConnectionBuild = keyPair.setDeviceName(deviceName).build();
                this.mAdbConnection = adbConnectionBuild;
                return adbConnectionBuild.connect(this.mTimeout, this.mTimeoutUnit, this.mThrowOnUnauthorised);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean autoConnect(Context context, String str, long j) {
        boolean zConnect;
        synchronized (this.mLock) {
            try {
                AtomicInteger atomicInteger = new AtomicInteger(-1);
                AtomicReference atomicReference = new AtomicReference(null);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                AdbMdns adbMdns = new AdbMdns(context, str, new C0623f0(atomicReference, atomicInteger, countDownLatch, 2));
                adbMdns.start();
                try {
                    if (countDownLatch.await(j, TimeUnit.MILLISECONDS)) {
                        adbMdns.stop();
                        String str2 = (String) atomicReference.get();
                        int i = atomicInteger.get();
                        if (str2 != null && i != -1) {
                            this.mHostAddress = str2;
                            AdbConnection.Builder keyPair = new AdbConnection.Builder(str2, i).setApi(this.mApi).setKeyPair(getAdbKeyPair());
                            String deviceName = getDeviceName();
                            Objects.requireNonNull(deviceName);
                            AdbConnection adbConnectionBuild = keyPair.setDeviceName(deviceName).build();
                            this.mAdbConnection = adbConnectionBuild;
                            zConnect = adbConnectionBuild.connect(this.mTimeout, this.mTimeoutUnit, this.mThrowOnUnauthorised);
                        } else {
                            throw new IOException("Could not find any valid host address or port");
                        }
                    } else {
                        throw new InterruptedException("Timed out while trying to find a valid host address and port");
                    }
                } catch (Throwable th) {
                    adbMdns.stop();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zConnect;
    }
}

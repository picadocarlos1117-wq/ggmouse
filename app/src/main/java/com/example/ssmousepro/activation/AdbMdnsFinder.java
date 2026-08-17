package com.example.ssmousepro.activation;

import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.util.Log;
import com.example.ssmousepro.injection.InjectionMetrics;
import java.net.InetAddress;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import p000.EnumC1530vu;
import p000.InterfaceC0579du;
import p000.InterfaceC1311px;
import p000.ch0;
import p000.f40;
import p000.fk1;
import p000.hp0;
import p000.ny1;
import p000.og0;
import p000.p32;
import p000.ua0;
import p000.z32;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class AdbMdnsFinder {
    public static final AdbMdnsFinder INSTANCE = new AdbMdnsFinder();
    private static final String TAG = "AdbMdnsFinder";
    private static final String TYPE_CONNECT = "_adb-tls-connect._tcp.";
    private static final String TYPE_PAIRING = "_adb-tls-pairing._tcp.";

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class Endpoint {
        private final String host;
        private final int port;

        public Endpoint(String str, int i) {
            str.getClass();
            this.host = str;
            this.port = i;
        }

        public static /* synthetic */ Endpoint copy$default(Endpoint endpoint, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = endpoint.host;
            }
            if ((i2 & 2) != 0) {
                i = endpoint.port;
            }
            return endpoint.copy(str, i);
        }

        public final String component1() {
            return this.host;
        }

        public final int component2() {
            return this.port;
        }

        public final Endpoint copy(String str, int i) {
            str.getClass();
            return new Endpoint(str, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Endpoint)) {
                return false;
            }
            Endpoint endpoint = (Endpoint) obj;
            return hp0.m3214e(this.host, endpoint.host) && this.port == endpoint.port;
        }

        public final String getHost() {
            return this.host;
        }

        public final int getPort() {
            return this.port;
        }

        public int hashCode() {
            return Integer.hashCode(this.port) + (this.host.hashCode() * 31);
        }

        public String toString() {
            return "Endpoint(host=" + this.host + ", port=" + this.port + ")";
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.activation.AdbMdnsFinder$acharConexao$2 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.activation.AdbMdnsFinder$acharConexao$2", m5373f = "AdbMdnsFinder.kt", m5374l = {InjectionMetrics.I_TAP_ID_EXHAUST}, m5375m = "invokeSuspend")
    public static final class C02082 extends ny1 implements ch0 {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02082(Context context, InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
            this.$context = context;
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return new C02082(this.$context, interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C02082) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ua0.m6440Z(obj);
                    return obj;
                }
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ua0.m6440Z(obj);
            AdbMdnsFinder adbMdnsFinder = AdbMdnsFinder.INSTANCE;
            Context context = this.$context;
            this.label = 1;
            Object objDescobrir = adbMdnsFinder.descobrir(context, AdbMdnsFinder.TYPE_CONNECT, this);
            EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
            return objDescobrir == enumC1530vu ? enumC1530vu : objDescobrir;
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.activation.AdbMdnsFinder$acharPareamento$2 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.activation.AdbMdnsFinder$acharPareamento$2", m5373f = "AdbMdnsFinder.kt", m5374l = {24}, m5375m = "invokeSuspend")
    public static final class C02092 extends ny1 implements ch0 {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02092(Context context, InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
            this.$context = context;
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return new C02092(this.$context, interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C02092) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ua0.m6440Z(obj);
                    return obj;
                }
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ua0.m6440Z(obj);
            AdbMdnsFinder adbMdnsFinder = AdbMdnsFinder.INSTANCE;
            Context context = this.$context;
            this.label = 1;
            Object objDescobrir = adbMdnsFinder.descobrir(context, AdbMdnsFinder.TYPE_PAIRING, this);
            EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
            return objDescobrir == enumC1530vu ? enumC1530vu : objDescobrir;
        }
    }

    private AdbMdnsFinder() {
    }

    public static /* synthetic */ Object acharConexao$default(AdbMdnsFinder adbMdnsFinder, Context context, long j, InterfaceC0579du interfaceC0579du, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 10000;
        }
        return adbMdnsFinder.acharConexao(context, j, interfaceC0579du);
    }

    public static /* synthetic */ Object acharPareamento$default(AdbMdnsFinder adbMdnsFinder, Context context, long j, InterfaceC0579du interfaceC0579du, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 8000;
        }
        return adbMdnsFinder.acharPareamento(context, j, interfaceC0579du);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object descobrir(Context context, String str, InterfaceC0579du interfaceC0579du) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(p32.m5148O(interfaceC0579du), 1);
        cancellableContinuationImpl.initCancellability();
        Object systemService = context.getApplicationContext().getSystemService("servicediscovery");
        systemService.getClass();
        final NsdManager nsdManager = (NsdManager) systemService;
        final fk1 fk1Var = new fk1();
        fk1Var.f3843a = new NsdManager.DiscoveryListener() { // from class: com.example.ssmousepro.activation.AdbMdnsFinder$descobrir$2$1
            @Override // android.net.nsd.NsdManager.DiscoveryListener
            public void onServiceFound(NsdServiceInfo nsdServiceInfo) {
                if (nsdServiceInfo == null || !cancellableContinuationImpl.isActive()) {
                    return;
                }
                nsdServiceInfo.getServiceName();
                nsdServiceInfo.getServiceType();
                try {
                    final NsdManager nsdManager2 = nsdManager;
                    final CancellableContinuation<AdbMdnsFinder.Endpoint> cancellableContinuation = cancellableContinuationImpl;
                    final fk1 fk1Var2 = fk1Var;
                    nsdManager2.resolveService(nsdServiceInfo, new NsdManager.ResolveListener() { // from class: com.example.ssmousepro.activation.AdbMdnsFinder$descobrir$2$1$onServiceFound$1
                        @Override // android.net.nsd.NsdManager.ResolveListener
                        public void onResolveFailed(NsdServiceInfo nsdServiceInfo2, int i) {
                            Log.w("AdbMdnsFinder", "resolve fail code=" + i);
                        }

                        @Override // android.net.nsd.NsdManager.ResolveListener
                        public void onServiceResolved(NsdServiceInfo nsdServiceInfo2) {
                            String hostName;
                            if (nsdServiceInfo2 == null || !cancellableContinuation.isActive()) {
                                return;
                            }
                            InetAddress host = nsdServiceInfo2.getHost();
                            if (host == null || (hostName = host.getHostAddress()) == null) {
                                InetAddress host2 = nsdServiceInfo2.getHost();
                                hostName = host2 != null ? host2.getHostName() : null;
                                if (hostName == null) {
                                    return;
                                }
                            }
                            int port = nsdServiceInfo2.getPort();
                            if (port <= 0) {
                                return;
                            }
                            NsdManager nsdManager3 = nsdManager2;
                            try {
                                Object obj = fk1Var2.f3843a;
                                if (obj == null) {
                                    hp0.m3207Q("discoveryListener");
                                    throw null;
                                }
                                nsdManager3.stopServiceDiscovery((NsdManager.DiscoveryListener) obj);
                                cancellableContinuation.resumeWith(new AdbMdnsFinder.Endpoint(hostName, port));
                            } catch (Throwable unused) {
                            }
                        }
                    });
                } catch (Exception e) {
                    Log.w("AdbMdnsFinder", "resolve exception", e);
                }
            }

            @Override // android.net.nsd.NsdManager.DiscoveryListener
            public void onStartDiscoveryFailed(String str2, int i) {
                Log.w("AdbMdnsFinder", "start fail " + str2 + " code=" + i);
                if (cancellableContinuationImpl.isActive()) {
                    cancellableContinuationImpl.resumeWith(null);
                }
            }

            @Override // android.net.nsd.NsdManager.DiscoveryListener
            public void onDiscoveryStarted(String str2) {
            }

            @Override // android.net.nsd.NsdManager.DiscoveryListener
            public void onDiscoveryStopped(String str2) {
            }

            @Override // android.net.nsd.NsdManager.DiscoveryListener
            public void onServiceLost(NsdServiceInfo nsdServiceInfo) {
            }

            @Override // android.net.nsd.NsdManager.DiscoveryListener
            public void onStopDiscoveryFailed(String str2, int i) {
            }
        };
        cancellableContinuationImpl.invokeOnCancellation(new og0() { // from class: com.example.ssmousepro.activation.AdbMdnsFinder$descobrir$2$2
            public final void invoke(Throwable th) {
                AdbMdnsFinder adbMdnsFinder = AdbMdnsFinder.INSTANCE;
                NsdManager nsdManager2 = nsdManager;
                try {
                    Object obj = fk1Var.f3843a;
                    if (obj != null) {
                        nsdManager2.stopServiceDiscovery((NsdManager.DiscoveryListener) obj);
                    } else {
                        hp0.m3207Q("discoveryListener");
                        throw null;
                    }
                } catch (Throwable unused) {
                }
            }

            @Override // p000.og0
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return z32.f13265a;
            }
        });
        try {
            Object obj = fk1Var.f3843a;
            if (obj != null) {
                nsdManager.discoverServices(str, 1, (NsdManager.DiscoveryListener) obj);
                return cancellableContinuationImpl.getResult();
            }
            hp0.m3207Q("discoveryListener");
            throw null;
        } catch (Exception e) {
            Log.e(TAG, "discoverServices", e);
            if (cancellableContinuationImpl.isActive()) {
                cancellableContinuationImpl.resumeWith(null);
            }
        }
    }

    public final Object acharConexao(Context context, long j, InterfaceC0579du interfaceC0579du) {
        return TimeoutKt.withTimeoutOrNull(j, new C02082(context, null), interfaceC0579du);
    }

    public final Object acharPareamento(Context context, long j, InterfaceC0579du interfaceC0579du) {
        return TimeoutKt.withTimeoutOrNull(j, new C02092(context, null), interfaceC0579du);
    }
}

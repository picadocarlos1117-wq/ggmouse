package com.example.ssmousepro.activation;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutKt;
import p000.AbstractC0616eu;
import p000.EnumC1530vu;
import p000.InterfaceC0579du;
import p000.InterfaceC1311px;
import p000.bc1;
import p000.ch0;
import p000.f40;
import p000.ny1;
import p000.og0;
import p000.tl1;
import p000.ua0;
import p000.ul1;
import p000.z32;
import p000.zv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class WifiAdbManager {
    private static final long ATIVANDO_STALE_MS = 45000;
    private static final long CACHE_PING_MS = 4000;
    private static final long CONNECT_TIMEOUT_MS = 10000;
    private static final String KEY_HOST = "last_host";
    private static final String KEY_PAIRED = "paired";
    private static final String KEY_PORT = "last_port";
    private static final String LOG_PATH = "/data/local/tmp/sspro_wifi.log";
    private static final String PREFS = "sspro_wifi_adb";
    private static final String READY_PATH = "/data/local/tmp/sspro_wifi.ready";
    private static final String TAG = "WifiAdbManager";
    private static volatile boolean adbKeepAliveAtivo;
    private static volatile long ativandoDesdeMs;
    private static volatile boolean daemonOk;
    private static volatile String hostConectado;
    private static Thread keepAliveThread;
    private static volatile int portaConectada;
    private static volatile long ultimoPingMs;
    private static volatile boolean ultimoPingOk;
    public static final WifiAdbManager INSTANCE = new WifiAdbManager();
    private static final AtomicBoolean pairingEmCurso = new AtomicBoolean(false);
    private static final AtomicBoolean ativando = new AtomicBoolean(false);
    private static final CoroutineScope scope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.example.ssmousepro.activation.WifiAdbManager$conectarComTimeout$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.activation.WifiAdbManager", m5373f = "WifiAdbManager.kt", m5374l = {403}, m5375m = "conectarComTimeout")
    public static final class C02141 extends AbstractC0616eu {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C02141(InterfaceC0579du interfaceC0579du) {
            super(interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WifiAdbManager.this.conectarComTimeout(null, null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.activation.WifiAdbManager$limparSessao$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.activation.WifiAdbManager$limparSessao$1", m5373f = "WifiAdbManager.kt", m5374l = {360, 364, 368, 373}, m5375m = "invokeSuspend")
    public static final class C02151 extends ny1 implements ch0 {
        int label;

        public C02151(InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return new C02151(interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C02151) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
        
            if (r7.enviar(com.example.ssmousepro.injection.InjectionProtocol.INPUT_STOP, r6) == r5) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
        
            if (r7.enviar("DAEMON_EXIT", r6) == r5) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
        
            if (r7.fechar(r6) == r5) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
        
            if (r7.matarDaemonsOrfaos(r6) == r5) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
        
            return r5;
         */
        @Override // p000.AbstractC0018ah
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                int r0 = r6.label
                r1 = 4
                r2 = 3
                r3 = 2
                r4 = 1
                vu r5 = p000.EnumC1530vu.f11768a
                if (r0 == 0) goto L2b
                if (r0 == r4) goto L27
                if (r0 == r3) goto L23
                if (r0 == r2) goto L1d
                if (r0 != r1) goto L16
                p000.ua0.m6440Z(r7)     // Catch: java.lang.Exception -> L65
                goto L65
            L16:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                p000.f40.m2719o(r6)
                r6 = 0
                return r6
            L1d:
                p000.ua0.m6440Z(r7)     // Catch: java.lang.Exception -> L21
                goto L5a
            L21:
                r7 = move-exception
                goto L53
            L23:
                p000.ua0.m6440Z(r7)     // Catch: java.lang.Exception -> L48
                goto L48
            L27:
                p000.ua0.m6440Z(r7)     // Catch: java.lang.Exception -> L3b
                goto L3b
            L2b:
                p000.ua0.m6440Z(r7)
                com.example.ssmousepro.activation.WifiDaemonClient r7 = com.example.ssmousepro.activation.WifiDaemonClient.INSTANCE     // Catch: java.lang.Exception -> L3b
                java.lang.String r0 = "INPUT_STOP"
                r6.label = r4     // Catch: java.lang.Exception -> L3b
                java.lang.Object r7 = r7.enviar(r0, r6)     // Catch: java.lang.Exception -> L3b
                if (r7 != r5) goto L3b
                goto L64
            L3b:
                com.example.ssmousepro.activation.WifiDaemonClient r7 = com.example.ssmousepro.activation.WifiDaemonClient.INSTANCE     // Catch: java.lang.Exception -> L48
                java.lang.String r0 = "DAEMON_EXIT"
                r6.label = r3     // Catch: java.lang.Exception -> L48
                java.lang.Object r7 = r7.enviar(r0, r6)     // Catch: java.lang.Exception -> L48
                if (r7 != r5) goto L48
                goto L64
            L48:
                com.example.ssmousepro.activation.WifiDaemonClient r7 = com.example.ssmousepro.activation.WifiDaemonClient.INSTANCE     // Catch: java.lang.Exception -> L21
                r6.label = r2     // Catch: java.lang.Exception -> L21
                java.lang.Object r7 = r7.fechar(r6)     // Catch: java.lang.Exception -> L21
                if (r7 != r5) goto L5a
                goto L64
            L53:
                java.lang.String r0 = "WifiAdbManager"
                java.lang.String r2 = "fechar ao limpar sessão"
                android.util.Log.w(r0, r2, r7)
            L5a:
                com.example.ssmousepro.injection.InjectionDaemonManager r7 = com.example.ssmousepro.injection.InjectionDaemonManager.INSTANCE     // Catch: java.lang.Exception -> L65
                r6.label = r1     // Catch: java.lang.Exception -> L65
                java.lang.Object r6 = r7.matarDaemonsOrfaos(r6)     // Catch: java.lang.Exception -> L65
                if (r6 != r5) goto L65
            L64:
                return r5
            L65:
                z32 r6 = p000.z32.f13265a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.example.ssmousepro.activation.WifiAdbManager.C02151.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.activation.WifiAdbManager$pingAgora$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.activation.WifiAdbManager", m5373f = "WifiAdbManager.kt", m5374l = {89, 101}, m5375m = "pingAgora")
    public static final class C02161 extends AbstractC0616eu {
        int I$0;
        int label;
        /* synthetic */ Object result;

        public C02161(InterfaceC0579du interfaceC0579du) {
            super(interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WifiAdbManager.this.pingAgora(this);
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.activation.WifiAdbManager$refreshPingAsync$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.activation.WifiAdbManager$refreshPingAsync$1", m5373f = "WifiAdbManager.kt", m5374l = {80}, m5375m = "invokeSuspend")
    public static final class C02171 extends ny1 implements ch0 {
        final /* synthetic */ og0 $aoTerminar;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02171(og0 og0Var, InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
            this.$aoTerminar = og0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(og0 og0Var, boolean z) {
            og0Var.invoke(Boolean.valueOf(z));
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return new C02171(this.$aoTerminar, interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C02171) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ua0.m6440Z(obj);
                WifiAdbManager wifiAdbManager = WifiAdbManager.INSTANCE;
                this.label = 1;
                obj = wifiAdbManager.pingAgora(this);
                EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                if (obj == enumC1530vu) {
                    return enumC1530vu;
                }
            } else {
                if (i != 1) {
                    f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ua0.m6440Z(obj);
            }
            final boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (this.$aoTerminar != null) {
                Handler handler = WifiAdbManager.mainHandler;
                final og0 og0Var = this.$aoTerminar;
                handler.post(new Runnable() { // from class: com.example.ssmousepro.activation.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        WifiAdbManager.C02171.invokeSuspend$lambda$0(og0Var, zBooleanValue);
                    }
                });
            }
            return z32.f13265a;
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.activation.WifiAdbManager$resolverEndpointConnect$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.activation.WifiAdbManager", m5373f = "WifiAdbManager.kt", m5374l = {433}, m5375m = "resolverEndpointConnect")
    public static final class C02181 extends AbstractC0616eu {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C02181(InterfaceC0579du interfaceC0579du) {
            super(interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WifiAdbManager.this.resolverEndpointConnect(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.activation.WifiAdbManager$resolverEndpointPareamento$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.activation.WifiAdbManager", m5373f = "WifiAdbManager.kt", m5374l = {424}, m5375m = "resolverEndpointPareamento")
    public static final class C02191 extends AbstractC0616eu {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C02191(InterfaceC0579du interfaceC0579du) {
            super(interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WifiAdbManager.this.resolverEndpointPareamento(null, null, null, this);
        }
    }

    private WifiAdbManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object conectarComTimeout(SsproAdbConnectionManager ssproAdbConnectionManager, String str, int i, InterfaceC0579du interfaceC0579du) {
        C02141 c02141;
        String str2;
        Deferred deferred;
        if (interfaceC0579du instanceof C02141) {
            c02141 = (C02141) interfaceC0579du;
            int i2 = c02141.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c02141.label = i2 - Integer.MIN_VALUE;
            } else {
                c02141 = new C02141(interfaceC0579du);
            }
        } else {
            c02141 = new C02141(interfaceC0579du);
        }
        Object obj = c02141.result;
        int i3 = c02141.label;
        boolean z = true;
        if (i3 == 0) {
            ua0.m6440Z(obj);
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(scope, null, null, new WifiAdbManager$conectarComTimeout$tarefa$1(ssproAdbConnectionManager, str, i, null), 3, null);
            WifiAdbManager$conectarComTimeout$resultado$1 wifiAdbManager$conectarComTimeout$resultado$1 = new WifiAdbManager$conectarComTimeout$resultado$1(deferredAsync$default, null);
            c02141.L$0 = ssproAdbConnectionManager;
            c02141.L$1 = str;
            c02141.L$2 = deferredAsync$default;
            c02141.I$0 = i;
            c02141.label = 1;
            Object objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, wifiAdbManager$conectarComTimeout$resultado$1, c02141);
            EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
            if (objWithTimeoutOrNull == enumC1530vu) {
                return enumC1530vu;
            }
            str2 = str;
            deferred = deferredAsync$default;
            obj = objWithTimeoutOrNull;
        } else {
            if (i3 != 1) {
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = c02141.I$0;
            Deferred deferred2 = (Deferred) c02141.L$2;
            String str3 = (String) c02141.L$1;
            SsproAdbConnectionManager ssproAdbConnectionManager2 = (SsproAdbConnectionManager) c02141.L$0;
            ua0.m6440Z(obj);
            str2 = str3;
            deferred = deferred2;
            ssproAdbConnectionManager = ssproAdbConnectionManager2;
        }
        int i4 = i;
        String str4 = str2;
        ul1 ul1Var = (ul1) obj;
        if (ul1Var == null) {
            Log.w(TAG, "Connect " + str4 + ":" + i4 + " estourou 10000ms");
            try {
                ssproAdbConnectionManager.disconnect();
            } catch (Throwable unused) {
            }
            Job.DefaultImpls.cancel$default((Job) deferred, (CancellationException) null, 1, (Object) null);
            return Boolean.FALSE;
        }
        Object obj2 = ul1Var.f11356a;
        Throwable thM6508b = ul1.m6508b(obj2);
        if (thM6508b != null) {
            Log.w(TAG, "Connect " + str4 + ":" + i4 + " falhou: " + thM6508b.getMessage());
        }
        Boolean bool = Boolean.FALSE;
        if (obj2 instanceof tl1) {
            obj2 = bool;
        }
        if (!((Boolean) obj2).booleanValue() && !ssproAdbConnectionManager.isConnected()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: emparelhar-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ Object m7420emparelharyxL6bBk$default(WifiAdbManager wifiAdbManager, Context context, String str, String str2, Integer num, InterfaceC0579du interfaceC0579du, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        return wifiAdbManager.m7422emparelharyxL6bBk(context, str, str2, num, interfaceC0579du);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void encerrarKeepAliveAdb() {
        adbKeepAliveAtivo = false;
        keepAliveThread = null;
        SsproAdbConnectionManager.Companion.fecharSeExistir();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        if (r9 == r10) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object pingAgora(p000.InterfaceC0579du r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.example.ssmousepro.activation.WifiAdbManager.C02161
            if (r0 == 0) goto L13
            r0 = r10
            com.example.ssmousepro.activation.WifiAdbManager$pingAgora$1 r0 = (com.example.ssmousepro.activation.WifiAdbManager.C02161) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.example.ssmousepro.activation.WifiAdbManager$pingAgora$1 r0 = new com.example.ssmousepro.activation.WifiAdbManager$pingAgora$1
            r0.<init>(r10)
        L18:
            java.lang.Object r9 = r0.result
            vu r10 = p000.EnumC1530vu.f11768a
            int r1 = r0.label
            r2 = 0
            java.lang.String r3 = "WifiAdbManager"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L3a
            if (r1 == r5) goto L34
            if (r1 != r4) goto L2e
            p000.ua0.m6440Z(r9)     // Catch: java.lang.Exception -> L81
            goto L75
        L2e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p000.f40.m2719o(r9)
            return r2
        L34:
            p000.ua0.m6440Z(r9)     // Catch: java.lang.Exception -> L38
            goto L48
        L38:
            r9 = move-exception
            goto L4f
        L3a:
            p000.ua0.m6440Z(r9)
            com.example.ssmousepro.activation.WifiDaemonClient r9 = com.example.ssmousepro.activation.WifiDaemonClient.INSTANCE     // Catch: java.lang.Exception -> L38
            r0.label = r5     // Catch: java.lang.Exception -> L38
            java.lang.Object r9 = r9.ping(r0)     // Catch: java.lang.Exception -> L38
            if (r9 != r10) goto L48
            goto L74
        L48:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Exception -> L38
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Exception -> L38
            goto L55
        L4f:
            java.lang.String r1 = "ping falhou"
            android.util.Log.w(r3, r1, r9)
            r9 = r6
        L55:
            if (r9 != 0) goto L64
            com.example.ssmousepro.activation.WifiAdbManager.ultimoPingOk = r6
            long r9 = android.os.SystemClock.elapsedRealtime()
            com.example.ssmousepro.activation.WifiAdbManager.ultimoPingMs = r9
            com.example.ssmousepro.activation.WifiAdbManager.daemonOk = r6
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L64:
            com.example.ssmousepro.activation.WifiDaemonClient r1 = com.example.ssmousepro.activation.WifiDaemonClient.INSTANCE     // Catch: java.lang.Exception -> L81
            java.lang.String r7 = "QRY"
            java.lang.String r8 = "VER"
            r0.I$0 = r9     // Catch: java.lang.Exception -> L81
            r0.label = r4     // Catch: java.lang.Exception -> L81
            java.lang.Object r9 = r1.consultar(r7, r8, r0)     // Catch: java.lang.Exception -> L81
            if (r9 != r10) goto L75
        L74:
            return r10
        L75:
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> L81
            if (r9 == 0) goto L81
            java.lang.CharSequence r9 = p000.zv1.m7383W0(r9)     // Catch: java.lang.Exception -> L81
            java.lang.String r2 = r9.toString()     // Catch: java.lang.Exception -> L81
        L81:
            java.lang.String r9 = "6"
            boolean r9 = p000.hp0.m3214e(r2, r9)
            if (r9 != 0) goto Lac
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Daemon PROTO_REV="
            r9.<init>(r10)
            r9.append(r2)
            java.lang.String r10 = " app=6 — desatualizado"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.w(r3, r9)
            com.example.ssmousepro.activation.WifiAdbManager.ultimoPingOk = r6
            long r9 = android.os.SystemClock.elapsedRealtime()
            com.example.ssmousepro.activation.WifiAdbManager.ultimoPingMs = r9
            com.example.ssmousepro.activation.WifiAdbManager.daemonOk = r6
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        Lac:
            com.example.ssmousepro.activation.WifiAdbManager.ultimoPingOk = r5
            long r9 = android.os.SystemClock.elapsedRealtime()
            com.example.ssmousepro.activation.WifiAdbManager.ultimoPingMs = r9
            com.example.ssmousepro.activation.WifiAdbManager.daemonOk = r5
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ssmousepro.activation.WifiAdbManager.pingAgora(du):java.lang.Object");
    }

    public static /* synthetic */ void refreshPingAsync$default(WifiAdbManager wifiAdbManager, og0 og0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            og0Var = null;
        }
        wifiAdbManager.refreshPingAsync(og0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object resolverEndpointConnect(Context context, String str, InterfaceC0579du interfaceC0579du) {
        C02181 c02181;
        String host;
        if (interfaceC0579du instanceof C02181) {
            c02181 = (C02181) interfaceC0579du;
            int i = c02181.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c02181.label = i - Integer.MIN_VALUE;
            } else {
                c02181 = new C02181(interfaceC0579du);
            }
        } else {
            c02181 = new C02181(interfaceC0579du);
        }
        Object objAcharConexao = c02181.result;
        int i2 = c02181.label;
        if (i2 == 0) {
            ua0.m6440Z(objAcharConexao);
            AdbMdnsFinder adbMdnsFinder = AdbMdnsFinder.INSTANCE;
            c02181.L$0 = context;
            c02181.L$1 = str;
            c02181.label = 1;
            objAcharConexao = adbMdnsFinder.acharConexao(context, 3500L, c02181);
            EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
            if (objAcharConexao == enumC1530vu) {
                return enumC1530vu;
            }
        } else {
            if (i2 != 1) {
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) c02181.L$1;
            context = (Context) c02181.L$0;
            ua0.m6440Z(objAcharConexao);
        }
        AdbMdnsFinder.Endpoint endpoint = (AdbMdnsFinder.Endpoint) objAcharConexao;
        if (endpoint != null) {
            if (str == null) {
                host = endpoint.getHost();
            } else {
                host = zv1.m7371K0(str) ? null : str;
                if (host == null) {
                    host = endpoint.getHost();
                }
            }
            return new bc1(host, new Integer(endpoint.getPort()));
        }
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(PREFS, 0);
        int i3 = sharedPreferences.getInt(KEY_PORT, 0);
        if (str == null) {
            str = sharedPreferences.getString(KEY_HOST, null);
        }
        if (str == null || i3 <= 0) {
            return null;
        }
        return new bc1(str, new Integer(i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object resolverEndpointPareamento(Context context, String str, Integer num, InterfaceC0579du interfaceC0579du) {
        C02191 c02191;
        if (interfaceC0579du instanceof C02191) {
            c02191 = (C02191) interfaceC0579du;
            int i = c02191.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c02191.label = i - Integer.MIN_VALUE;
            } else {
                c02191 = new C02191(interfaceC0579du);
            }
        } else {
            c02191 = new C02191(interfaceC0579du);
        }
        C02191 c02192 = c02191;
        Object objAcharPareamento$default = c02192.result;
        int i2 = c02192.label;
        if (i2 == 0) {
            ua0.m6440Z(objAcharPareamento$default);
            if (str != null && !zv1.m7371K0(str) && num != null && num.intValue() > 0) {
                return new bc1(zv1.m7383W0(str).toString(), num);
            }
            AdbMdnsFinder adbMdnsFinder = AdbMdnsFinder.INSTANCE;
            c02192.L$0 = null;
            c02192.L$1 = null;
            c02192.L$2 = null;
            c02192.label = 1;
            objAcharPareamento$default = AdbMdnsFinder.acharPareamento$default(adbMdnsFinder, context, 0L, c02192, 2, null);
            EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
            if (objAcharPareamento$default == enumC1530vu) {
                return enumC1530vu;
            }
        } else {
            if (i2 != 1) {
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ua0.m6440Z(objAcharPareamento$default);
        }
        AdbMdnsFinder.Endpoint endpoint = (AdbMdnsFinder.Endpoint) objAcharPareamento$default;
        if (endpoint == null) {
            return null;
        }
        return new bc1(endpoint.getHost(), new Integer(endpoint.getPort()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean tentarIniciarAtivacao() {
        AtomicBoolean atomicBoolean = ativando;
        if (atomicBoolean.compareAndSet(false, true)) {
            ativandoDesdeMs = SystemClock.elapsedRealtime();
            return true;
        }
        long j = ativandoDesdeMs;
        long jElapsedRealtime = j > 0 ? SystemClock.elapsedRealtime() - j : 0L;
        if (jElapsedRealtime >= ATIVANDO_STALE_MS) {
            Log.w(TAG, "Flag ativando stale (" + jElapsedRealtime + "ms) — liberando e retentando");
            atomicBoolean.set(false);
            if (atomicBoolean.compareAndSet(false, true)) {
                ativandoDesdeMs = SystemClock.elapsedRealtime();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: conectarEAtivar-gIAlu-s, reason: not valid java name */
    public final Object m7421conectarEAtivargIAlus(Context context, InterfaceC0579du interfaceC0579du) {
        WifiAdbManager$conectarEAtivar$1 wifiAdbManager$conectarEAtivar$1;
        if (interfaceC0579du instanceof WifiAdbManager$conectarEAtivar$1) {
            wifiAdbManager$conectarEAtivar$1 = (WifiAdbManager$conectarEAtivar$1) interfaceC0579du;
            int i = wifiAdbManager$conectarEAtivar$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                wifiAdbManager$conectarEAtivar$1.label = i - Integer.MIN_VALUE;
            } else {
                wifiAdbManager$conectarEAtivar$1 = new WifiAdbManager$conectarEAtivar$1(this, interfaceC0579du);
            }
        } else {
            wifiAdbManager$conectarEAtivar$1 = new WifiAdbManager$conectarEAtivar$1(this, interfaceC0579du);
        }
        Object objWithContext = wifiAdbManager$conectarEAtivar$1.result;
        int i2 = wifiAdbManager$conectarEAtivar$1.label;
        if (i2 == 0) {
            ua0.m6440Z(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            WifiAdbManager$conectarEAtivar$2 wifiAdbManager$conectarEAtivar$2 = new WifiAdbManager$conectarEAtivar$2(context, null);
            wifiAdbManager$conectarEAtivar$1.L$0 = null;
            wifiAdbManager$conectarEAtivar$1.label = 1;
            objWithContext = BuildersKt.withContext(io2, wifiAdbManager$conectarEAtivar$2, wifiAdbManager$conectarEAtivar$1);
            EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
            if (objWithContext == enumC1530vu) {
                return enumC1530vu;
            }
        } else {
            if (i2 != 1) {
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ua0.m6440Z(objWithContext);
        }
        return ((ul1) objWithContext).f11356a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: emparelhar-yxL6bBk, reason: not valid java name */
    public final Object m7422emparelharyxL6bBk(Context context, String str, String str2, Integer num, InterfaceC0579du interfaceC0579du) {
        WifiAdbManager$emparelhar$1 wifiAdbManager$emparelhar$1;
        if (interfaceC0579du instanceof WifiAdbManager$emparelhar$1) {
            wifiAdbManager$emparelhar$1 = (WifiAdbManager$emparelhar$1) interfaceC0579du;
            int i = wifiAdbManager$emparelhar$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                wifiAdbManager$emparelhar$1.label = i - Integer.MIN_VALUE;
            } else {
                wifiAdbManager$emparelhar$1 = new WifiAdbManager$emparelhar$1(this, interfaceC0579du);
            }
        } else {
            wifiAdbManager$emparelhar$1 = new WifiAdbManager$emparelhar$1(this, interfaceC0579du);
        }
        Object objWithContext = wifiAdbManager$emparelhar$1.result;
        int i2 = wifiAdbManager$emparelhar$1.label;
        if (i2 == 0) {
            ua0.m6440Z(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            WifiAdbManager$emparelhar$2 wifiAdbManager$emparelhar$2 = new WifiAdbManager$emparelhar$2(str, context, str2, num, null);
            wifiAdbManager$emparelhar$1.L$0 = null;
            wifiAdbManager$emparelhar$1.L$1 = null;
            wifiAdbManager$emparelhar$1.L$2 = null;
            wifiAdbManager$emparelhar$1.L$3 = null;
            wifiAdbManager$emparelhar$1.label = 1;
            objWithContext = BuildersKt.withContext(io2, wifiAdbManager$emparelhar$2, wifiAdbManager$emparelhar$1);
            EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
            if (objWithContext == enumC1530vu) {
                return enumC1530vu;
            }
        } else {
            if (i2 != 1) {
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ua0.m6440Z(objWithContext);
        }
        return ((ul1) objWithContext).f11356a;
    }

    public final boolean estaConectado() {
        return hostConectado != null && portaConectada > 0;
    }

    public final boolean estaPareado(Context context) {
        context.getClass();
        return context.getApplicationContext().getSharedPreferences(PREFS, 0).getBoolean(KEY_PAIRED, false);
    }

    public final boolean estaProntoParaInjecao() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (ultimoPingOk && jElapsedRealtime - ultimoPingMs < CACHE_PING_MS) {
            return true;
        }
        if ((!daemonOk && !ultimoPingOk) || jElapsedRealtime - ultimoPingMs >= CACHE_PING_MS) {
            refreshPingAsync(null);
        }
        return daemonOk || ultimoPingOk;
    }

    public final void limparSessao(Context context) {
        context.getClass();
        hostConectado = null;
        portaConectada = 0;
        daemonOk = false;
        ultimoPingOk = false;
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new C02151(null), 3, null);
        encerrarKeepAliveAdb();
        context.getApplicationContext().getSharedPreferences(PREFS, 0).edit().putBoolean(KEY_PAIRED, false).remove(KEY_HOST).remove(KEY_PORT).apply();
    }

    public final String mensagemBloqueio(Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT < 30) {
            return "Depuração Wi‑Fi exige Android 11 ou superior. Use Shizuku.";
        }
        if (estaPareado(context)) {
            return !estaProntoParaInjecao() ? "Ative a Depuração Wi‑Fi (botão Ativar) com a Depuração sem fio ligada." : "Depuração Wi‑Fi indisponível.";
        }
        return "Emparelhe a Depuração Wi‑Fi em Configurações → Modo de ativação.";
    }

    public final boolean protocoloCompativel() {
        return daemonOk || ultimoPingOk;
    }

    public final void refreshPingAsync(og0 og0Var) {
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new C02171(og0Var, null), 3, null);
    }

    public final String statusResumo(Context context) {
        context.getClass();
        if (estaProntoParaInjecao()) {
            return "Ativa";
        }
        return estaPareado(context) ? "Pareada — toque em Ativar" : "Não pareada";
    }
}

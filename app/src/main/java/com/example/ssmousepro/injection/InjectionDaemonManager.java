package com.example.ssmousepro.injection;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.content.res.Resources;
import android.os.IBinder;
import android.util.Log;
import com.example.ssmousepro.IAimStateListener;
import com.example.ssmousepro.ICursorPositionProvider;
import com.example.ssmousepro.IInjectionDaemon;
import com.example.ssmousepro.IVirtualCursorListener;
import com.example.ssmousepro.SSMouseProApplication;
import com.example.ssmousepro.ShizukuManager;
import com.example.ssmousepro.activation.ActivationModePrefs;
import com.example.ssmousepro.activation.ModoAtivacao;
import com.example.ssmousepro.activation.PrivilegeShell;
import com.example.ssmousepro.activation.WifiAdbManager;
import com.example.ssmousepro.activation.WifiDaemonClient;
import java.util.Iterator;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import p000.AbstractC0616eu;
import p000.AbstractC1571wy;
import p000.EnumC1530vu;
import p000.InterfaceC0579du;
import p000.InterfaceC1311px;
import p000.ch0;
import p000.f40;
import p000.ny1;
import p000.os1;
import p000.tl1;
import p000.ua0;
import p000.z32;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class InjectionDaemonManager {
    private static final String DAEMON_PROCESS_SUFFIX = "injection";
    private static final String DAEMON_TAG = "ssmousepro_injection_daemon";
    public static final int DAEMON_VERSION = 318;
    private static final String PKILL_ORFAOS = "pkill -f 'com.sousasantoslogic.sspro:injection' 2>/dev/null; pkill -f '[s]spro_wifi_inj' 2>/dev/null; true";
    private static final String TAG = "InjectionDaemonManager";
    private static long bindEmAndamentoAteMs;
    private static final Channel<CmdMsg> cmdChannel;
    private static final InjectionDaemonManager$conexaoDaemon$1 conexaoDaemon;
    private static IVirtualCursorListener cursorListenerPendente;
    private static ICursorPositionProvider cursorProviderPendente;
    private static boolean daemonVinculado;
    private static IInjectionDaemon injectionDaemon;
    private static final CoroutineScope ioScope;
    private static IAimStateListener listenerMiraPendente;
    private static String pacoteAplicativo;
    public static final InjectionDaemonManager INSTANCE = new InjectionDaemonManager();
    private static int daemonVersaoVinculada = -1;

    /* JADX INFO: renamed from: com.example.ssmousepro.injection.InjectionDaemonManager$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.injection.InjectionDaemonManager$1", m5373f = "InjectionDaemonManager.kt", m5374l = {62, 63}, m5375m = "invokeSuspend")
    public static final class C02451 extends ny1 implements ch0 {
        Object L$0;
        Object L$1;
        int label;

        public C02451(InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return new C02451(interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C02451) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0040  */
        /* JADX WARN: Code duplicated, block: B:17:0x004a  */
        /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
        
            if (r8 == r4) goto L19;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0061 -> B:20:0x0064). Please report as a decompilation issue!!! */
        @Override // p000.AbstractC0018ah
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                int r0 = r7.label
                r1 = 0
                r2 = 2
                r3 = 1
                vu r4 = p000.EnumC1530vu.f11768a
                if (r0 == 0) goto L28
                if (r0 == r3) goto L1f
                if (r0 != r2) goto L19
                java.lang.Object r0 = r7.L$1
                com.example.ssmousepro.injection.InjectionDaemonManager$CmdMsg r0 = (com.example.ssmousepro.injection.InjectionDaemonManager.CmdMsg) r0
                java.lang.Object r5 = r7.L$0
                kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
                p000.ua0.m6440Z(r8)
                goto L64
            L19:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                p000.f40.m2719o(r7)
                return r1
            L1f:
                java.lang.Object r0 = r7.L$0
                kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
                p000.ua0.m6440Z(r8)
                r5 = r0
                goto L42
            L28:
                p000.ua0.m6440Z(r8)
                kotlinx.coroutines.channels.Channel r8 = com.example.ssmousepro.injection.InjectionDaemonManager.access$getCmdChannel$p()
                kotlinx.coroutines.channels.ChannelIterator r8 = r8.iterator()
            L33:
                r7.L$0 = r8
                r7.L$1 = r1
                r7.label = r3
                java.lang.Object r0 = r8.hasNext(r7)
                if (r0 != r4) goto L40
                goto L63
            L40:
                r5 = r8
                r8 = r0
            L42:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto La1
                java.lang.Object r8 = r5.next()
                r0 = r8
                com.example.ssmousepro.injection.InjectionDaemonManager$CmdMsg r0 = (com.example.ssmousepro.injection.InjectionDaemonManager.CmdMsg) r0
                com.example.ssmousepro.injection.InjectionDaemonManager r8 = com.example.ssmousepro.injection.InjectionDaemonManager.INSTANCE
                java.lang.String r6 = r0.getComando()
                r7.L$0 = r5
                r7.L$1 = r0
                r7.label = r2
                java.lang.Object r8 = com.example.ssmousepro.injection.InjectionDaemonManager.access$processarComandoRaw(r8, r6, r7)
                if (r8 != r4) goto L64
            L63:
                return r4
            L64:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                boolean r6 = r0 instanceof com.example.ssmousepro.injection.InjectionDaemonManager.CmdMsg.Fire
                if (r6 == 0) goto L8a
                if (r8 != 0) goto L9b
                com.example.ssmousepro.injection.InjectionDaemonManager$CmdMsg$Fire r0 = (com.example.ssmousepro.injection.InjectionDaemonManager.CmdMsg.Fire) r0
                java.lang.String r8 = r0.getComando()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r6 = "Daemon indisponível para comando: "
                r0.<init>(r6)
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                java.lang.String r0 = "InjectionDaemonManager"
                android.util.Log.w(r0, r8)
                goto L9b
            L8a:
                boolean r6 = r0 instanceof com.example.ssmousepro.injection.InjectionDaemonManager.CmdMsg.Await
                if (r6 == 0) goto L9d
                com.example.ssmousepro.injection.InjectionDaemonManager$CmdMsg$Await r0 = (com.example.ssmousepro.injection.InjectionDaemonManager.CmdMsg.Await) r0
                kotlinx.coroutines.CompletableDeferred r0 = r0.getDeferred()
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
                r0.complete(r8)
            L9b:
                r8 = r5
                goto L33
            L9d:
                p000.C0694gy.m3076b()
                return r1
            La1:
                z32 r7 = p000.z32.f13265a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.example.ssmousepro.injection.InjectionDaemonManager.C02451.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.injection.InjectionDaemonManager$desvincularDaemon$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.injection.InjectionDaemonManager", m5373f = "InjectionDaemonManager.kt", m5374l = {293, 298, 303, 307, 339, 339, 339}, m5375m = "desvincularDaemon")
    public static final class C02461 extends AbstractC0616eu {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C02461(InterfaceC0579du interfaceC0579du) {
            super(interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InjectionDaemonManager.this.desvincularDaemon(this);
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.injection.InjectionDaemonManager$desvincularDaemonAsync$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.injection.InjectionDaemonManager$desvincularDaemonAsync$1", m5373f = "InjectionDaemonManager.kt", m5374l = {283}, m5375m = "invokeSuspend")
    public static final class C02471 extends ny1 implements ch0 {
        int label;

        public C02471(InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return new C02471(interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C02471) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                ua0.m6440Z(obj);
                InjectionDaemonManager injectionDaemonManager = InjectionDaemonManager.INSTANCE;
                this.label = 1;
                Object objDesvincularDaemon = injectionDaemonManager.desvincularDaemon(this);
                EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                if (objDesvincularDaemon == enumC1530vu) {
                    return enumC1530vu;
                }
            } else {
                if (i != 1) {
                    f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ua0.m6440Z(obj);
            }
            return z32.f13265a;
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.injection.InjectionDaemonManager$enviarComando$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.injection.InjectionDaemonManager", m5373f = "InjectionDaemonManager.kt", m5374l = {247, 248}, m5375m = "enviarComando")
    public static final class C02481 extends AbstractC0616eu {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C02481(InterfaceC0579du interfaceC0579du) {
            super(interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InjectionDaemonManager.this.enviarComando(null, this);
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.injection.InjectionDaemonManager$matarDaemonsOrfaos$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.injection.InjectionDaemonManager", m5373f = "InjectionDaemonManager.kt", m5374l = {350}, m5375m = "matarDaemonsOrfaos")
    public static final class C02491 extends AbstractC0616eu {
        int label;
        /* synthetic */ Object result;

        public C02491(InterfaceC0579du interfaceC0579du) {
            super(interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InjectionDaemonManager.this.matarDaemonsOrfaos(this);
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.injection.InjectionDaemonManager$processarComandoRaw$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.injection.InjectionDaemonManager", m5373f = "InjectionDaemonManager.kt", m5374l = {257}, m5375m = "processarComandoRaw")
    public static final class C02501 extends AbstractC0616eu {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C02501(InterfaceC0579du interfaceC0579du) {
            super(interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InjectionDaemonManager.this.processarComandoRaw(null, this);
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.injection.InjectionDaemonManager$sincronizarConfigWifi$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.injection.InjectionDaemonManager$sincronizarConfigWifi$1", m5373f = "InjectionDaemonManager.kt", m5374l = {134, 135}, m5375m = "invokeSuspend")
    public static final class C02511 extends ny1 implements ch0 {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        public C02511(InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return new C02511(interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C02511) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
        
            if (r9.enviar(r0, r8) == r6) goto L23;
         */
        @Override // p000.AbstractC0018ah
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                int r0 = r8.label
                r1 = 0
                r2 = 2
                r3 = 1
                r4 = 0
                if (r0 == 0) goto L29
                if (r0 == r3) goto L17
                if (r0 != r2) goto L11
                p000.ua0.m6440Z(r9)     // Catch: java.lang.Exception -> L7c
                goto L84
            L11:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                p000.f40.m2719o(r8)
                return r4
            L17:
                int r0 = r8.I$0
                java.lang.Object r5 = r8.L$3
                java.lang.String r5 = (java.lang.String) r5
                java.lang.Object r5 = r8.L$1
                java.util.Iterator r5 = (java.util.Iterator) r5
                java.lang.Object r6 = r8.L$0
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                p000.ua0.m6440Z(r9)     // Catch: java.lang.Exception -> L7c
                goto L3e
            L29:
                p000.ua0.m6440Z(r9)
                com.example.ssmousepro.injection.FpsDesacelSincronizador r9 = com.example.ssmousepro.injection.FpsDesacelSincronizador.INSTANCE     // Catch: java.lang.Exception -> L7c
                android.content.res.Resources r0 = android.content.res.Resources.getSystem()     // Catch: java.lang.Exception -> L7c
                java.util.List r9 = r9.comandosSincronizar(r0)     // Catch: java.lang.Exception -> L7c
                java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Exception -> L7c
                java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Exception -> L7c
                r5 = r9
                r0 = r1
            L3e:
                boolean r9 = r5.hasNext()     // Catch: java.lang.Exception -> L7c
                vu r6 = p000.EnumC1530vu.f11768a
                if (r9 == 0) goto L63
                java.lang.Object r9 = r5.next()     // Catch: java.lang.Exception -> L7c
                java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> L7c
                com.example.ssmousepro.activation.WifiDaemonClient r7 = com.example.ssmousepro.activation.WifiDaemonClient.INSTANCE     // Catch: java.lang.Exception -> L7c
                r8.L$0 = r4     // Catch: java.lang.Exception -> L7c
                r8.L$1 = r5     // Catch: java.lang.Exception -> L7c
                r8.L$2 = r4     // Catch: java.lang.Exception -> L7c
                r8.L$3 = r4     // Catch: java.lang.Exception -> L7c
                r8.I$0 = r0     // Catch: java.lang.Exception -> L7c
                r8.I$1 = r1     // Catch: java.lang.Exception -> L7c
                r8.label = r3     // Catch: java.lang.Exception -> L7c
                java.lang.Object r9 = r7.enviar(r9, r8)     // Catch: java.lang.Exception -> L7c
                if (r9 != r6) goto L3e
                goto L7b
            L63:
                com.example.ssmousepro.activation.WifiDaemonClient r9 = com.example.ssmousepro.activation.WifiDaemonClient.INSTANCE     // Catch: java.lang.Exception -> L7c
                com.example.ssmousepro.injection.FpsLowSpeedGainConfig r0 = com.example.ssmousepro.injection.FpsLowSpeedGainConfig.INSTANCE     // Catch: java.lang.Exception -> L7c
                java.lang.String r0 = r0.comandoSincronizar()     // Catch: java.lang.Exception -> L7c
                r8.L$0 = r4     // Catch: java.lang.Exception -> L7c
                r8.L$1 = r4     // Catch: java.lang.Exception -> L7c
                r8.L$2 = r4     // Catch: java.lang.Exception -> L7c
                r8.L$3 = r4     // Catch: java.lang.Exception -> L7c
                r8.label = r2     // Catch: java.lang.Exception -> L7c
                java.lang.Object r8 = r9.enviar(r0, r8)     // Catch: java.lang.Exception -> L7c
                if (r8 != r6) goto L84
            L7b:
                return r6
            L7c:
                r8 = move-exception
                java.lang.String r9 = "InjectionDaemonManager"
                java.lang.String r0 = "Falha ao sincronizar config Wi‑Fi"
                android.util.Log.w(r9, r0, r8)
            L84:
                z32 r8 = p000.z32.f13265a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.example.ssmousepro.injection.InjectionDaemonManager.C02511.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.injection.InjectionDaemonManager$vincularDaemon$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.injection.InjectionDaemonManager$vincularDaemon$1", m5373f = "InjectionDaemonManager.kt", m5374l = {175}, m5375m = "invokeSuspend")
    public static final class C02521 extends ny1 implements ch0 {
        int label;

        public C02521(InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return new C02521(interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C02521) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            try {
                if (i == 0) {
                    ua0.m6440Z(obj);
                    WifiDaemonClient wifiDaemonClient = WifiDaemonClient.INSTANCE;
                    this.label = 1;
                    Object objReligarEventos = wifiDaemonClient.religarEventos(this);
                    EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                    if (objReligarEventos == enumC1530vu) {
                        return enumC1530vu;
                    }
                } else {
                    if (i != 1) {
                        f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ua0.m6440Z(obj);
                }
            } catch (Exception e) {
                Log.w(InjectionDaemonManager.TAG, "religarEventos Wi‑Fi", e);
            }
            return z32.f13265a;
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.injection.InjectionDaemonManager$vincularDaemon$2 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.injection.InjectionDaemonManager$vincularDaemon$2", m5373f = "InjectionDaemonManager.kt", m5374l = {221}, m5375m = "invokeSuspend")
    public static final class C02532 extends ny1 implements ch0 {
        final /* synthetic */ os1 $args;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02532(os1 os1Var, InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
            this.$args = os1Var;
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return new C02532(this.$args, interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C02532) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v4, types: [os1] */
        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:32:0x0022
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        @Override // p000.AbstractC0018ah
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                int r0 = r3.label
                r1 = 1
                if (r0 == 0) goto L12
                if (r0 != r1) goto Lb
                p000.ua0.m6440Z(r4)     // Catch: java.lang.Exception -> L22
                goto L22
            Lb:
                java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
                p000.f40.m2719o(r3)
                r3 = 0
                return r3
            L12:
                p000.ua0.m6440Z(r4)
                com.example.ssmousepro.injection.InjectionDaemonManager r4 = com.example.ssmousepro.injection.InjectionDaemonManager.INSTANCE     // Catch: java.lang.Exception -> L22
                r3.label = r1     // Catch: java.lang.Exception -> L22
                java.lang.Object r4 = r4.matarDaemonsOrfaos(r3)     // Catch: java.lang.Exception -> L22
                vu r0 = p000.EnumC1530vu.f11768a
                if (r4 != r0) goto L22
                return r0
            L22:
                os1 r3 = r3.$args     // Catch: java.lang.Exception -> L65
                com.example.ssmousepro.injection.InjectionDaemonManager$conexaoDaemon$1 r4 = com.example.ssmousepro.injection.InjectionDaemonManager.access$getConexaoDaemon$p()     // Catch: java.lang.Exception -> L65
                android.os.IBinder r0 = p000.ps1.f9128a     // Catch: java.lang.Exception -> L65
                java.util.Map r0 = p000.ts1.f11014a     // Catch: java.lang.Exception -> L65
                java.lang.String r0 = r3.f8462d     // Catch: java.lang.Exception -> L65
                if (r0 == 0) goto L31
                goto L37
            L31:
                android.content.ComponentName r0 = r3.f8459a     // Catch: java.lang.Exception -> L65
                java.lang.String r0 = r0.getClassName()     // Catch: java.lang.Exception -> L65
            L37:
                java.util.Map r1 = p000.ts1.f11014a     // Catch: java.lang.Exception -> L65
                java.lang.Object r2 = r1.get(r0)     // Catch: java.lang.Exception -> L65
                ss1 r2 = (p000.ss1) r2     // Catch: java.lang.Exception -> L65
                if (r2 != 0) goto L49
                ss1 r2 = new ss1     // Catch: java.lang.Exception -> L65
                r2.<init>(r3)     // Catch: java.lang.Exception -> L65
                r1.put(r0, r2)     // Catch: java.lang.Exception -> L65
            L49:
                if (r4 == 0) goto L50
                java.util.HashSet r0 = r2.f10539a     // Catch: java.lang.Exception -> L65
                r0.add(r4)     // Catch: java.lang.Exception -> L65
            L50:
                pl0 r4 = p000.ps1.m5322f()     // Catch: android.os.RemoteException -> L5e java.lang.Exception -> L65
                android.os.Bundle r3 = p000.os1.m5056a(r3)     // Catch: android.os.RemoteException -> L5e java.lang.Exception -> L65
                nl0 r4 = (p000.nl0) r4     // Catch: android.os.RemoteException -> L5e java.lang.Exception -> L65
                r4.m4554a(r2, r3)     // Catch: android.os.RemoteException -> L5e java.lang.Exception -> L65
                goto L72
            L5e:
                r3 = move-exception
                java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch: java.lang.Exception -> L65
                r4.<init>(r3)     // Catch: java.lang.Exception -> L65
                throw r4     // Catch: java.lang.Exception -> L65
            L65:
                r3 = move-exception
                r0 = 0
                com.example.ssmousepro.injection.InjectionDaemonManager.access$setBindEmAndamentoAteMs$p(r0)
                java.lang.String r4 = "InjectionDaemonManager"
                java.lang.String r0 = "Erro ao vincular daemon Shizuku"
                android.util.Log.e(r4, r0, r3)
            L72:
                z32 r3 = p000.z32.f13265a
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.example.ssmousepro.injection.InjectionDaemonManager.C02532.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.example.ssmousepro.injection.InjectionDaemonManager$conexaoDaemon$1] */
    static {
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
        ioScope = CoroutineScope;
        cmdChannel = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new C02451(null), 3, null);
        conexaoDaemon = new ServiceConnection() { // from class: com.example.ssmousepro.injection.InjectionDaemonManager$conexaoDaemon$1
            @Override // android.content.ServiceConnection
            public void onBindingDied(ComponentName componentName) {
                Log.w("InjectionDaemonManager", "Binding do daemon morreu: " + (componentName != null ? componentName.getClassName() : null));
                InjectionDaemonManager.INSTANCE.marcarDesconectado();
            }

            @Override // android.content.ServiceConnection
            public void onNullBinding(ComponentName componentName) {
                Log.e("InjectionDaemonManager", "Daemon retornou binder nulo: " + (componentName != null ? componentName.getClassName() : null));
                InjectionDaemonManager.INSTANCE.marcarDesconectado();
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                InjectionDaemonManager.bindEmAndamentoAteMs = 0L;
                InjectionDaemonManager.injectionDaemon = IInjectionDaemon.Stub.asInterface(iBinder);
                InjectionDaemonManager.daemonVinculado = true;
                InjectionDaemonManager.daemonVersaoVinculada = InjectionDaemonManager.DAEMON_VERSION;
                IAimStateListener iAimStateListener = InjectionDaemonManager.listenerMiraPendente;
                if (iAimStateListener != null) {
                    try {
                        IInjectionDaemon iInjectionDaemon = InjectionDaemonManager.injectionDaemon;
                        if (iInjectionDaemon != null) {
                            iInjectionDaemon.registerAimListener(iAimStateListener);
                        }
                    } catch (Exception e) {
                        Log.w("InjectionDaemonManager", "Falha ao registrar listener mira pendente", e);
                    }
                }
                if (InjectionDaemonManager.cursorListenerPendente != null || InjectionDaemonManager.cursorProviderPendente != null) {
                    try {
                        IInjectionDaemon iInjectionDaemon2 = InjectionDaemonManager.injectionDaemon;
                        if (iInjectionDaemon2 != null) {
                            iInjectionDaemon2.registerHandModeCallbacks(InjectionDaemonManager.cursorListenerPendente, InjectionDaemonManager.cursorProviderPendente);
                        }
                    } catch (Exception e2) {
                        Log.w("InjectionDaemonManager", "Falha ao registrar modo mão pendente", e2);
                    }
                }
                InjectionDaemonManager.INSTANCE.sincronizarConfigNoDaemon();
                if (componentName != null) {
                    componentName.getClassName();
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                Log.w("InjectionDaemonManager", "Daemon Shizuku desconectado: " + (componentName != null ? componentName.getClassName() : null));
                InjectionDaemonManager.INSTANCE.marcarDesconectado();
            }
        };
    }

    private InjectionDaemonManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void marcarDesconectado() {
        bindEmAndamentoAteMs = 0L;
        injectionDaemon = null;
        daemonVinculado = false;
        daemonVersaoVinculada = -1;
    }

    private final ModoAtivacao modoAtivo() {
        Object tl1Var;
        try {
            tl1Var = ActivationModePrefs.INSTANCE.modo(SSMouseProApplication.Companion.getInstance());
        } catch (Throwable th) {
            tl1Var = new tl1(th);
        }
        Object obj = ModoAtivacao.SHIZUKU;
        if (tl1Var instanceof tl1) {
            tl1Var = obj;
        }
        return (ModoAtivacao) tl1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object processarComandoRaw(String str, InterfaceC0579du interfaceC0579du) {
        C02501 c02501;
        Object tl1Var;
        if (interfaceC0579du instanceof C02501) {
            c02501 = (C02501) interfaceC0579du;
            int i = c02501.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c02501.label = i - Integer.MIN_VALUE;
            } else {
                c02501 = new C02501(interfaceC0579du);
            }
        } else {
            c02501 = new C02501(interfaceC0579du);
        }
        Object objEnviar = c02501.result;
        int i2 = c02501.label;
        boolean zExecutarComando = false;
        try {
            if (i2 == 0) {
                ua0.m6440Z(objEnviar);
                try {
                    tl1Var = ActivationModePrefs.INSTANCE.modo(SSMouseProApplication.Companion.getInstance());
                } catch (Throwable th) {
                    tl1Var = new tl1(th);
                }
                Object obj = ModoAtivacao.SHIZUKU;
                if (tl1Var instanceof tl1) {
                    tl1Var = obj;
                }
                if (((ModoAtivacao) tl1Var) != ModoAtivacao.WIFI) {
                    IInjectionDaemon iInjectionDaemon = injectionDaemon;
                    if (iInjectionDaemon == null) {
                        String str2 = pacoteAplicativo;
                        if (str2 != null && System.currentTimeMillis() >= bindEmAndamentoAteMs) {
                            Log.w(TAG, "Daemon null — solicitando bind de novo");
                            vincularDaemon(str2);
                        }
                        return Boolean.FALSE;
                    }
                    try {
                        zExecutarComando = iInjectionDaemon.executarComando(str);
                    } catch (Exception e) {
                        Log.e(TAG, "Erro ao enviar comando via binder: " + str, e);
                        marcarDesconectado();
                    }
                    return Boolean.valueOf(zExecutarComando);
                }
                WifiDaemonClient wifiDaemonClient = WifiDaemonClient.INSTANCE;
                c02501.L$0 = str;
                c02501.L$1 = null;
                c02501.label = 1;
                objEnviar = wifiDaemonClient.enviar(str, c02501);
                EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                if (objEnviar == enumC1530vu) {
                    return enumC1530vu;
                }
            } else {
                if (i2 != 1) {
                    f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) c02501.L$0;
                ua0.m6440Z(objEnviar);
            }
            zExecutarComando = ((Boolean) objEnviar).booleanValue();
        } catch (Exception e2) {
            Log.e(TAG, "Erro Wi‑Fi comando: " + str, e2);
        }
        return Boolean.valueOf(zExecutarComando);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sincronizarConfigNoDaemon() {
        IInjectionDaemon iInjectionDaemon = injectionDaemon;
        if (iInjectionDaemon == null) {
            return;
        }
        try {
            Iterator<T> it = FpsDesacelSincronizador.INSTANCE.comandosSincronizar(Resources.getSystem()).iterator();
            while (it.hasNext()) {
                iInjectionDaemon.executarComando((String) it.next());
            }
            iInjectionDaemon.executarComando(FpsLowSpeedGainConfig.INSTANCE.comandoSincronizar());
        } catch (Exception e) {
            Log.w(TAG, "Falha ao sincronizar config no daemon", e);
        }
    }

    private final void sincronizarConfigWifi() {
        BuildersKt__Builders_commonKt.launch$default(ioScope, null, null, new C02511(null), 3, null);
    }

    private final void sincronizarListenersWifi() {
        WifiDaemonClient.INSTANCE.registrarListeners(listenerMiraPendente, cursorListenerPendente, cursorProviderPendente);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c1, code lost:
    
        if (r13.enviar(com.example.ssmousepro.injection.InjectionProtocol.INPUT_STOP, r0) == r9) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d9, code lost:
    
        if (r13.enviar("DAEMON_EXIT", r0) == r9) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ef, code lost:
    
        if (r13.fechar(r0) == r9) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0103, code lost:
    
        if (matarDaemonsOrfaos(r0) == r9) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0162, code lost:
    
        if (matarDaemonsOrfaos(r0) == r9) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x017f, code lost:
    
        if (matarDaemonsOrfaos(r0) == r9) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object desvincularDaemon(p000.InterfaceC0579du r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ssmousepro.injection.InjectionDaemonManager.desvincularDaemon(du):java.lang.Object");
    }

    public final void desvincularDaemonAsync() {
        BuildersKt__Builders_commonKt.launch$default(ioScope, null, null, new C02471(null), 3, null);
    }

    public final void enqueueComando(String str) {
        str.getClass();
        if (ChannelResult.m7485isFailureimpl(cmdChannel.mo7462trySendJP2dKIU(new CmdMsg.Fire(str)))) {
            Log.w(TAG, "Fila de comandos rejeitou: ".concat(str));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object enviarComando(String str, InterfaceC0579du interfaceC0579du) {
        C02481 c02481;
        CompletableDeferred completableDeferred;
        if (interfaceC0579du instanceof C02481) {
            c02481 = (C02481) interfaceC0579du;
            int i = c02481.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c02481.label = i - Integer.MIN_VALUE;
            } else {
                c02481 = new C02481(interfaceC0579du);
            }
        } else {
            c02481 = new C02481(interfaceC0579du);
        }
        Object obj = c02481.result;
        int i2 = c02481.label;
        EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
        if (i2 == 0) {
            ua0.m6440Z(obj);
            CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            Channel<CmdMsg> channel = cmdChannel;
            CmdMsg.Await await = new CmdMsg.Await(str, completableDeferredCompletableDeferred$default);
            c02481.L$0 = null;
            c02481.L$1 = completableDeferredCompletableDeferred$default;
            c02481.label = 1;
            if (channel.send(await, c02481) != enumC1530vu) {
                completableDeferred = completableDeferredCompletableDeferred$default;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ua0.m6440Z(obj);
            return obj;
        }
        completableDeferred = (CompletableDeferred) c02481.L$1;
        ua0.m6440Z(obj);
        c02481.L$0 = null;
        c02481.L$1 = null;
        c02481.label = 2;
        Object objAwait = completableDeferred.await(c02481);
        return objAwait == enumC1530vu ? enumC1530vu : objAwait;
    }

    public final boolean garantirCanalConectado() {
        Object tl1Var;
        try {
            tl1Var = ActivationModePrefs.INSTANCE.modo(SSMouseProApplication.Companion.getInstance());
        } catch (Throwable th) {
            tl1Var = new tl1(th);
        }
        Object obj = ModoAtivacao.SHIZUKU;
        if (tl1Var instanceof tl1) {
            tl1Var = obj;
        }
        if (((ModoAtivacao) tl1Var) == ModoAtivacao.WIFI) {
            return WifiAdbManager.INSTANCE.estaProntoParaInjecao();
        }
        return injectionDaemon != null;
    }

    public final boolean garantirCanalOperacional(String str) {
        Object tl1Var;
        str.getClass();
        pacoteAplicativo = str;
        try {
            tl1Var = ActivationModePrefs.INSTANCE.modo(SSMouseProApplication.Companion.getInstance());
        } catch (Throwable th) {
            tl1Var = new tl1(th);
        }
        Object obj = ModoAtivacao.SHIZUKU;
        if (tl1Var instanceof tl1) {
            tl1Var = obj;
        }
        if (((ModoAtivacao) tl1Var) == ModoAtivacao.WIFI) {
            boolean zEstaProntoParaInjecao = WifiAdbManager.INSTANCE.estaProntoParaInjecao();
            if (zEstaProntoParaInjecao) {
                daemonVinculado = true;
                INSTANCE.sincronizarListenersWifi();
            }
            return zEstaProntoParaInjecao;
        }
        if (injectionDaemon != null && daemonVersaoVinculada != 318) {
            desvincularDaemonAsync();
        }
        IInjectionDaemon iInjectionDaemon = injectionDaemon;
        if (iInjectionDaemon == null) {
            vincularDaemon(str);
            return injectionDaemon != null;
        }
        try {
            iInjectionDaemon.getClass();
            iInjectionDaemon.executarComando(InjectionProtocol.PING);
            return true;
        } catch (Exception e) {
            Log.w(TAG, "PING falhou — reconectando daemon", e);
            marcarDesconectado();
            vincularDaemon(str);
            return false;
        }
    }

    public final boolean isDaemonVinculado() {
        Object tl1Var;
        try {
            tl1Var = ActivationModePrefs.INSTANCE.modo(SSMouseProApplication.Companion.getInstance());
        } catch (Throwable th) {
            tl1Var = new tl1(th);
        }
        Object obj = ModoAtivacao.SHIZUKU;
        if (tl1Var instanceof tl1) {
            tl1Var = obj;
        }
        if (((ModoAtivacao) tl1Var) == ModoAtivacao.WIFI) {
            return WifiAdbManager.INSTANCE.estaProntoParaInjecao();
        }
        return daemonVinculado && injectionDaemon != null;
    }

    public final boolean isSocketConectado() {
        return isDaemonVinculado();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object matarDaemonsOrfaos(InterfaceC0579du interfaceC0579du) {
        C02491 c02491;
        if (interfaceC0579du instanceof C02491) {
            c02491 = (C02491) interfaceC0579du;
            int i = c02491.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c02491.label = i - Integer.MIN_VALUE;
            } else {
                c02491 = new C02491(interfaceC0579du);
            }
        } else {
            c02491 = new C02491(interfaceC0579du);
        }
        Object objExecutar = c02491.result;
        int i2 = c02491.label;
        try {
            if (i2 == 0) {
                ua0.m6440Z(objExecutar);
                PrivilegeShell privilegeShell = PrivilegeShell.INSTANCE;
                c02491.label = 1;
                objExecutar = privilegeShell.executar(PKILL_ORFAOS, c02491);
                EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                if (objExecutar == enumC1530vu) {
                    return enumC1530vu;
                }
            } else {
                if (i2 != 1) {
                    f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ua0.m6440Z(objExecutar);
            }
            ((Boolean) objExecutar).booleanValue();
        } catch (Exception e) {
            Log.w(TAG, "pkill órfãos falhou (sem privilégio?)", e);
        }
        return z32.f13265a;
    }

    public final Object obterDebugExteriorFps(InterfaceC0579du interfaceC0579du) {
        if (modoAtivo() == ModoAtivacao.WIFI) {
            return WifiDaemonClient.INSTANCE.obterDebugExteriorFps(interfaceC0579du);
        }
        IInjectionDaemon iInjectionDaemon = injectionDaemon;
        if (iInjectionDaemon == null) {
            return "";
        }
        try {
            String fpsExteriorDebug = iInjectionDaemon.getFpsExteriorDebug();
            return fpsExteriorDebug == null ? "" : fpsExteriorDebug;
        } catch (Exception e) {
            Log.w(TAG, "Falha ao ler debug exterior FPS", e);
            marcarDesconectado();
            return "";
        }
    }

    public final Object obterPipelineMetrics(InterfaceC0579du interfaceC0579du) {
        if (modoAtivo() == ModoAtivacao.WIFI) {
            return WifiDaemonClient.INSTANCE.obterPipelineMetrics(interfaceC0579du);
        }
        IInjectionDaemon iInjectionDaemon = injectionDaemon;
        if (iInjectionDaemon == null) {
            return null;
        }
        try {
            return iInjectionDaemon.getPipelineMetrics();
        } catch (Exception e) {
            Log.w(TAG, "Falha ao ler métricas do pipeline", e);
            marcarDesconectado();
            return null;
        }
    }

    public final void registrarListenerMira(IAimStateListener iAimStateListener) {
        listenerMiraPendente = iAimStateListener;
        if (modoAtivo() == ModoAtivacao.WIFI) {
            sincronizarListenersWifi();
            return;
        }
        try {
            IInjectionDaemon iInjectionDaemon = injectionDaemon;
            if (iInjectionDaemon != null) {
                iInjectionDaemon.registerAimListener(iAimStateListener);
            }
        } catch (Exception e) {
            Log.w(TAG, "Falha ao registrar listener mira", e);
        }
    }

    public final void registrarModoMao(IVirtualCursorListener iVirtualCursorListener, ICursorPositionProvider iCursorPositionProvider) {
        cursorListenerPendente = iVirtualCursorListener;
        cursorProviderPendente = iCursorPositionProvider;
        if (modoAtivo() == ModoAtivacao.WIFI) {
            sincronizarListenersWifi();
            return;
        }
        try {
            IInjectionDaemon iInjectionDaemon = injectionDaemon;
            if (iInjectionDaemon != null) {
                iInjectionDaemon.registerHandModeCallbacks(iVirtualCursorListener, iCursorPositionProvider);
            }
        } catch (Exception e) {
            Log.w(TAG, "Falha ao registrar modo mão", e);
            marcarDesconectado();
        }
    }

    public final void removerListenerMira() {
        listenerMiraPendente = null;
        if (modoAtivo() == ModoAtivacao.WIFI) {
            sincronizarListenersWifi();
            return;
        }
        try {
            IInjectionDaemon iInjectionDaemon = injectionDaemon;
            if (iInjectionDaemon != null) {
                iInjectionDaemon.unregisterAimListener();
            }
        } catch (Exception e) {
            Log.w(TAG, "Falha ao remover listener mira", e);
        }
    }

    public final void removerModoMao() {
        cursorListenerPendente = null;
        cursorProviderPendente = null;
        if (modoAtivo() == ModoAtivacao.WIFI) {
            sincronizarListenersWifi();
            return;
        }
        try {
            IInjectionDaemon iInjectionDaemon = injectionDaemon;
            if (iInjectionDaemon != null) {
                iInjectionDaemon.unregisterHandModeCallbacks();
            }
        } catch (Exception e) {
            Log.w(TAG, "Falha ao remover modo mão", e);
        }
    }

    public final void vincularDaemon(String str) {
        Object tl1Var;
        str.getClass();
        pacoteAplicativo = str;
        try {
            tl1Var = ActivationModePrefs.INSTANCE.modo(SSMouseProApplication.Companion.getInstance());
        } catch (Throwable th) {
            tl1Var = new tl1(th);
        }
        Object obj = ModoAtivacao.SHIZUKU;
        if (tl1Var instanceof tl1) {
            tl1Var = obj;
        }
        if (((ModoAtivacao) tl1Var) == ModoAtivacao.WIFI) {
            WifiAdbManager wifiAdbManager = WifiAdbManager.INSTANCE;
            if (!wifiAdbManager.estaProntoParaInjecao()) {
                daemonVinculado = false;
                Log.w(TAG, "Modo Wi‑Fi selecionado, mas sessão ADB/injetor não está pronta");
                return;
            } else {
                if (!wifiAdbManager.protocoloCompativel()) {
                    Log.w(TAG, "Daemon Wi‑Fi desatualizado — precisa Ativar de novo");
                    daemonVinculado = false;
                    return;
                }
                daemonVinculado = true;
                daemonVersaoVinculada = DAEMON_VERSION;
                sincronizarConfigWifi();
                sincronizarListenersWifi();
                BuildersKt__Builders_commonKt.launch$default(ioScope, null, null, new C02521(null), 3, null);
                return;
            }
        }
        if (!ShizukuManager.INSTANCE.estaProntoParaInjecao()) {
            Log.w(TAG, "Shizuku indisponível ou sem permissão");
            return;
        }
        if (injectionDaemon != null) {
            if (daemonVersaoVinculada == 318) {
                return;
            } else {
                desvincularDaemonAsync();
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < bindEmAndamentoAteMs) {
            return;
        }
        daemonVinculado = false;
        bindEmAndamentoAteMs = jCurrentTimeMillis + 1500;
        os1 os1Var = new os1(new ComponentName(str, InjectionDaemon.class.getName()));
        os1Var.f8461c = DAEMON_PROCESS_SUFFIX;
        os1Var.f8462d = DAEMON_TAG;
        os1Var.f8463e = false;
        os1Var.f8460b = DAEMON_VERSION;
        BuildersKt__Builders_commonKt.launch$default(ioScope, null, null, new C02532(os1Var, null), 3, null);
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static abstract class CmdMsg {

        /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
        public static final class Await extends CmdMsg {
            private final String comando;
            private final CompletableDeferred<Boolean> deferred;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Await(String str, CompletableDeferred<Boolean> completableDeferred) {
                super(null);
                str.getClass();
                completableDeferred.getClass();
                this.comando = str;
                this.deferred = completableDeferred;
            }

            @Override // com.example.ssmousepro.injection.InjectionDaemonManager.CmdMsg
            public String getComando() {
                return this.comando;
            }

            public final CompletableDeferred<Boolean> getDeferred() {
                return this.deferred;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
        public static final class Fire extends CmdMsg {
            private final String comando;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Fire(String str) {
                super(null);
                str.getClass();
                this.comando = str;
            }

            @Override // com.example.ssmousepro.injection.InjectionDaemonManager.CmdMsg
            public String getComando() {
                return this.comando;
            }
        }

        public /* synthetic */ CmdMsg(AbstractC1571wy abstractC1571wy) {
            this();
        }

        public abstract String getComando();

        private CmdMsg() {
        }
    }
}

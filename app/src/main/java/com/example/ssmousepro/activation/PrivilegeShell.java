package com.example.ssmousepro.activation;

import android.os.Looper;
import android.util.Log;
import com.example.ssmousepro.SSMouseProApplication;
import com.example.ssmousepro.ShizukuManager;
import com.example.ssmousepro.injection.InjectionMetrics;
import io.github.muntashirakon.adb.PairingConnectionCtx;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p000.AbstractC0609en;
import p000.C0694gy;
import p000.EnumC1530vu;
import p000.InterfaceC0579du;
import p000.InterfaceC1311px;
import p000.ch0;
import p000.f40;
import p000.hp0;
import p000.ny1;
import p000.p32;
import p000.ps1;
import p000.rc2;
import p000.tl1;
import p000.ua0;
import p000.z32;
import p000.zv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class PrivilegeShell {
    public static final PrivilegeShell INSTANCE = new PrivilegeShell();
    private static final String TAG = "PrivilegeShell";

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ModoAtivacao.values().length];
            try {
                iArr[ModoAtivacao.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ModoAtivacao.SHIZUKU.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.activation.PrivilegeShell$executar$2 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.activation.PrivilegeShell$executar$2", m5373f = "PrivilegeShell.kt", m5374l = {20}, m5375m = "invokeSuspend")
    public static final class C02112 extends ny1 implements ch0 {
        final /* synthetic */ String $comando;
        int label;

        /* JADX INFO: renamed from: com.example.ssmousepro.activation.PrivilegeShell$executar$2$WhenMappings */
        /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ModoAtivacao.values().length];
                try {
                    iArr[ModoAtivacao.WIFI.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ModoAtivacao.SHIZUKU.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02112(String str, InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
            this.$comando = str;
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return new C02112(this.$comando, interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C02112) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            boolean zExecutarShell = true;
            if (i == 0) {
                ua0.m6440Z(obj);
                int i2 = WhenMappings.$EnumSwitchMapping$0[PrivilegeShell.INSTANCE.modo().ordinal()];
                if (i2 == 1) {
                    WifiDaemonClient wifiDaemonClient = WifiDaemonClient.INSTANCE;
                    String str = this.$comando;
                    this.label = 1;
                    obj = wifiDaemonClient.shellComSaida(str, this);
                    EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                    if (obj == enumC1530vu) {
                        return enumC1530vu;
                    }
                } else {
                    if (i2 != 2) {
                        C0694gy.m3076b();
                        return null;
                    }
                    zExecutarShell = ShizukuManager.INSTANCE.executarShell(this.$comando);
                }
                return Boolean.valueOf(zExecutarShell);
            }
            if (i != 1) {
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ua0.m6440Z(obj);
            if (obj == null) {
                zExecutarShell = false;
            }
            return Boolean.valueOf(zExecutarShell);
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.activation.PrivilegeShell$executarComSaida$2 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.activation.PrivilegeShell$executarComSaida$2", m5373f = "PrivilegeShell.kt", m5374l = {InjectionMetrics.I_TAP_ID_EXHAUST}, m5375m = "invokeSuspend")
    public static final class C02122 extends ny1 implements ch0 {
        final /* synthetic */ String $comando;
        int label;

        /* JADX INFO: renamed from: com.example.ssmousepro.activation.PrivilegeShell$executarComSaida$2$WhenMappings */
        /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ModoAtivacao.values().length];
                try {
                    iArr[ModoAtivacao.WIFI.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ModoAtivacao.SHIZUKU.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02122(String str, InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
            this.$comando = str;
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return new C02122(this.$comando, interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C02122) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ua0.m6440Z(obj);
                PrivilegeShell privilegeShell = PrivilegeShell.INSTANCE;
                int i2 = WhenMappings.$EnumSwitchMapping$0[privilegeShell.modo().ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        return privilegeShell.shellShizukuComSaida(this.$comando);
                    }
                    C0694gy.m3076b();
                    return null;
                }
                WifiDaemonClient wifiDaemonClient = WifiDaemonClient.INSTANCE;
                String str = this.$comando;
                this.label = 1;
                obj = wifiDaemonClient.shellComSaida(str, this);
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
            return (String) obj;
        }
    }

    private PrivilegeShell() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ModoAtivacao modo() {
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
    public final String shellShizukuComSaida(String str) {
        String strM5163c0;
        String str2 = "";
        if (!ShizukuManager.INSTANCE.estaProntoParaInjecao()) {
            Log.w(TAG, "Shell Shizuku indisponível: " + str);
            return null;
        }
        try {
            Method declaredMethod = ps1.class.getDeclaredMethod("d", String[].class, String[].class, String.class);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new String[]{"sh", "-c", str}, null, null);
            objInvoke.getClass();
            Process process = (Process) objInvoke;
            try {
                InputStream inputStream = process.getInputStream();
                inputStream.getClass();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, AbstractC0609en.f3387a), PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE);
                try {
                    strM5163c0 = p32.m5163c0(bufferedReader);
                    bufferedReader.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        rc2.m5797n(bufferedReader, th);
                        throw th2;
                    }
                }
            } catch (Exception unused) {
                strM5163c0 = "";
            }
            try {
                InputStream errorStream = process.getErrorStream();
                errorStream.getClass();
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(errorStream, AbstractC0609en.f3387a), PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE);
                try {
                    String strM5163c1 = p32.m5163c0(bufferedReader2);
                    bufferedReader2.close();
                    str2 = strM5163c1;
                    if (process.waitFor() != 0 && zv1.m7371K0(strM5163c0) && zv1.m7371K0(str2)) {
                        return null;
                    }
                    return strM5163c0.concat(str2);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        rc2.m5797n(bufferedReader2, th3);
                        throw th4;
                    }
                }
            } catch (Exception unused2) {
            }
        } catch (Throwable th5) {
            Log.e(TAG, "Falha shell Shizuku: " + str, th5);
            return null;
        }
    }

    public final Object executar(String str, InterfaceC0579du interfaceC0579du) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C02112(str, null), interfaceC0579du);
    }

    public final Object executarComSaida(String str, InterfaceC0579du interfaceC0579du) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C02122(str, null), interfaceC0579du);
    }

    public final String executarComSaidaOffMain(String str) {
        str.getClass();
        if (hp0.m3214e(Looper.myLooper(), Looper.getMainLooper())) {
            f40.m2719o("PrivilegeShell.executarComSaidaOffMain na main");
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[modo().ordinal()];
        if (i == 1) {
            return WifiDaemonClient.INSTANCE.shellComSaidaOffMain(str);
        }
        if (i == 2) {
            return shellShizukuComSaida(str);
        }
        C0694gy.m3076b();
        return null;
    }
}

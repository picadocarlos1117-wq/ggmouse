package com.example.ssmousepro;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import io.github.muntashirakon.adb.PairingConnectionCtx;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import p000.AbstractC0609en;
import p000.AbstractC1337qm;
import p000.C0694gy;
import p000.nl0;
import p000.p32;
import p000.ps1;
import p000.rc2;
import p000.y60;
import p000.zv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ShizukuManager {
    public static final ShizukuManager INSTANCE = new ShizukuManager();
    private static final String PACOTE_SHIZUKU = "moe.shizuku.privileged.api";
    private static final String TAG = "ShizukuManager";

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public enum StatusShizuku {
        NAO_INSTALADO,
        NAO_RODANDO,
        SEM_PERMISSAO,
        PRONTO;

        private static final /* synthetic */ y60 $ENTRIES = AbstractC1337qm.m5553p(values());

        public static y60 getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusShizuku.values().length];
            try {
                iArr[StatusShizuku.NAO_INSTALADO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusShizuku.NAO_RODANDO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatusShizuku.SEM_PERMISSAO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StatusShizuku.PRONTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ShizukuManager() {
    }

    public final boolean estaProntoParaInjecao() {
        return temPermissao();
    }

    public final boolean executarShell(String str) {
        String strM5163c0;
        str.getClass();
        if (!estaProntoParaInjecao()) {
            Log.w(TAG, "Shell Shizuku indisponível: ".concat(str));
            return false;
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
            int iWaitFor = process.waitFor();
            zv1.m7383W0(strM5163c0).toString();
            return iWaitFor == 0;
        } catch (Throwable th3) {
            Log.e(TAG, "Falha shell Shizuku: ".concat(str), th3);
            return false;
        }
    }

    public final boolean isShizukuDisponivel() {
        try {
            IBinder iBinder = ps1.f9128a;
            return iBinder != null && iBinder.pingBinder();
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean isShizukuInstalado(Context context) {
        context.getClass();
        try {
            context.getPackageManager().getPackageInfo(PACOTE_SHIZUKU, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final String mensagemBloqueioMapeador(Context context) {
        context.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[obterStatus(context).ordinal()];
        if (i == 1) {
            return "Instale o Shizuku para usar o mapeador.";
        }
        if (i == 2) {
            return "Ative o Shizuku (inicie o serviço) antes de abrir o mapeador.";
        }
        if (i == 3) {
            return "Autorize o SS KeyMouse no Shizuku antes de abrir o mapeador.";
        }
        if (i == 4) {
            return "";
        }
        C0694gy.m3076b();
        return null;
    }

    public final StatusShizuku obterStatus(Context context) {
        context.getClass();
        if (!isShizukuInstalado(context)) {
            return StatusShizuku.NAO_INSTALADO;
        }
        if (isShizukuDisponivel()) {
            return !temPermissao() ? StatusShizuku.SEM_PERMISSAO : StatusShizuku.PRONTO;
        }
        return StatusShizuku.NAO_RODANDO;
    }

    public final int obterVersaoShizuku() {
        try {
            return ps1.m5319c();
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final void solicitarPermissao(int i) {
        try {
            if (isShizukuDisponivel()) {
                try {
                    ((nl0) ps1.m5322f()).m4559f(i);
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final boolean temPermissao() {
        try {
            if (isShizukuDisponivel()) {
                if (ps1.f9131d) {
                    return true;
                }
                try {
                    boolean zM4555b = ((nl0) ps1.m5322f()).m4555b();
                    ps1.f9131d = zM4555b;
                    return zM4555b;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}

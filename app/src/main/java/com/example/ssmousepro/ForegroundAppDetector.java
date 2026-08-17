package com.example.ssmousepro;

import android.app.AppOpsManager;
import android.app.usage.UsageEvents;
import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.example.ssmousepro.activation.PrivilegeShell;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p000.AbstractC1337qm;
import p000.AbstractC1377rp;
import p000.AbstractC1414sp;
import p000.C1171o6;
import p000.C1636yp;
import p000.hw1;
import p000.jk1;
import p000.n60;
import p000.qo0;
import p000.x90;
import p000.y90;
import p000.ys0;
import p000.zv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ForegroundAppDetector {
    private static final long INTERVALO_DUMPSYS_RESET_MS = 800;
    private static final long INTERVALO_MIN_DUMPSYS_MS = 10000;
    private static final long JANELA_EVENTOS_INICIAL_MS = 600000;
    private static final long JANELA_EVENTOS_MS = 15000;
    private static final String TAG = "ForegroundAppDetector";
    private static volatile String pacoteMemorizado;
    private static volatile long ultimoDumpsysMs;
    private static volatile long ultimoDumpsysResetMs;
    public static final ForegroundAppDetector INSTANCE = new ForegroundAppDetector();
    private static final List<String> PRIORIDADE_LINHAS_DUMPSYS = AbstractC1414sp.m6124n0("topresumedactivity", "resumedactivity", "mresumedactivity", "mcurrentfocus", "mfocusedapp");
    private static final jk1 REGEX_PACOTE = new jk1("([\\w\\d_.]+)/[\\w.]+");
    private static final jk1 REGEX_COMPONENT = new jk1("ComponentInfo\\{([\\w\\d_.]+)/");
    private static final Set<String> PACOTES_DESKTOP_DEX = AbstractC1337qm.m5531c0("com.sec.android.app.desktoplauncher", "com.samsung.desktopsystemui", "com.sec.android.desktopmode.uiservice", "com.samsung.android.desktopmode", "com.samsung.android.app.cocktailbarservice");
    private static final Set<String> PACOTES_LAUNCHER_HOME = AbstractC1337qm.m5531c0("com.sec.android.app.launcher", "com.google.android.apps.nexuslauncher", "com.android.launcher", "com.android.launcher3", "com.miui.home", "com.huawei.android.launcher", "com.oppo.launcher", "com.realme.launcher", "com.vivo.launcher", "com.nothing.launcher", "com.microsoft.launcher");

    private ForegroundAppDetector() {
    }

    private final boolean ehEventoPrimeiroPlano(int i) {
        if (i == 1) {
            return true;
        }
        return i == 1 && Build.VERSION.SDK_INT >= 29;
    }

    private final String extrairPacoteDaLinha(String str) {
        String str2;
        String str3;
        qo0 qo0VarM3658a = jk1.m3658a(REGEX_COMPONENT, str);
        if (qo0VarM3658a != null && (str3 = (String) AbstractC1377rp.m5871r0(1, qo0VarM3658a.m5586I())) != null) {
            return str3;
        }
        qo0 qo0VarM3658a2 = jk1.m3658a(REGEX_PACOTE, str);
        if (qo0VarM3658a2 == null || (str2 = (String) AbstractC1377rp.m5871r0(1, qo0VarM3658a2.m5586I())) == null) {
            return null;
        }
        return str2;
    }

    private final String extrairPacotePrioritario(List<String> list) {
        String strExtrairPacoteDaLinha;
        String strExtrairPacoteDaLinha2;
        for (String str : PRIORIDADE_LINHAS_DUMPSYS) {
            for (String str2 : list) {
                if (zv1.m7365E0(str2, str, true) && (strExtrairPacoteDaLinha2 = extrairPacoteDaLinha(str2)) != null) {
                    return strExtrairPacoteDaLinha2;
                }
            }
        }
        for (String str3 : list) {
            if (zv1.m7365E0(str3, "mCurrentFocus", true) && (strExtrairPacoteDaLinha = extrairPacoteDaLinha(str3)) != null) {
                return strExtrairPacoteDaLinha;
            }
        }
        return null;
    }

    private final String memorizar(String str) {
        pacoteMemorizado = str;
        return str;
    }

    private final String obterPacoteViaPrivilegio(String str) {
        List<String> listM5511F;
        String strExecutarComSaidaOffMain = PrivilegeShell.INSTANCE.executarComSaidaOffMain(str);
        if (strExecutarComSaidaOffMain == null) {
            return null;
        }
        ys0 ys0Var = new ys0(strExecutarComSaidaOffMain);
        if (ys0Var.hasNext()) {
            Object next = ys0Var.next();
            if (ys0Var.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (ys0Var.hasNext()) {
                    arrayList.add(ys0Var.next());
                }
                listM5511F = arrayList;
            } else {
                listM5511F = AbstractC1337qm.m5511F(next);
            }
        } else {
            listM5511F = n60.f7259a;
        }
        return extrairPacotePrioritario(listM5511F);
    }

    private final String obterPacoteViaUsageEvents(Context context) {
        Object systemService = context.getSystemService("usagestats");
        systemService.getClass();
        UsageStatsManager usageStatsManager = (UsageStatsManager) systemService;
        long jCurrentTimeMillis = System.currentTimeMillis();
        UsageEvents usageEventsQueryEvents = usageStatsManager.queryEvents(jCurrentTimeMillis - (pacoteMemorizado == null ? JANELA_EVENTOS_INICIAL_MS : JANELA_EVENTOS_MS), jCurrentTimeMillis);
        UsageEvents.Event event = new UsageEvents.Event();
        String packageName = null;
        long timeStamp = 0;
        while (usageEventsQueryEvents.hasNextEvent()) {
            usageEventsQueryEvents.getNextEvent(event);
            if (ehEventoPrimeiroPlano(event.getEventType()) && event.getTimeStamp() >= timeStamp) {
                timeStamp = event.getTimeStamp();
                packageName = event.getPackageName();
            }
        }
        if (packageName != null) {
            packageName.equals(pacoteMemorizado);
        }
        return packageName;
    }

    private final boolean pacoteUsadoRecentemente(Context context, String str, long j) {
        Object next;
        try {
            Object systemService = context.getSystemService("usagestats");
            systemService.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            List<UsageStats> listQueryUsageStats = ((UsageStatsManager) systemService).queryUsageStats(4, jCurrentTimeMillis - j, jCurrentTimeMillis);
            if (listQueryUsageStats == null) {
                return false;
            }
            Iterator<T> it = listQueryUsageStats.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!hw1.m3307B0(((UsageStats) next).getPackageName(), str));
            UsageStats usageStats = (UsageStats) next;
            return usageStats != null && jCurrentTimeMillis - usageStats.getLastTimeUsed() <= j;
        } catch (Exception e) {
            Log.w(TAG, "Falha usage stats recente", e);
            return false;
        }
    }

    private final boolean pacoteVisivelNoDumpsys(String str) {
        Iterator it = AbstractC1414sp.m6124n0("dumpsys activity activities", "dumpsys window").iterator();
        while (it.hasNext()) {
            String strExecutarComSaidaOffMain = PrivilegeShell.INSTANCE.executarComSaidaOffMain((String) it.next());
            if (strExecutarComSaidaOffMain != null) {
                int i = 1;
                if (zv1.m7365E0(strExecutarComSaidaOffMain, str, true)) {
                    x90 x90Var = new x90(new y90(new C1636yp(strExecutarComSaidaOffMain, 3), true, new C1171o6(str, i)));
                    while (x90Var.hasNext()) {
                        String lowerCase = ((String) x90Var.next()).toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (zv1.m7365E0(lowerCase, "resumed", false) || zv1.m7365E0(lowerCase, "visible", false) || zv1.m7365E0(lowerCase, "mactivity", false) || zv1.m7365E0(lowerCase, "fullscreen", false) || zv1.m7365E0(lowerCase, "mcurrentfocus", false) || zv1.m7365E0(lowerCase, "topresumed", false) || zv1.m7365E0(lowerCase, "activityrecord", false)) {
                            return true;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pacoteVisivelNoDumpsys$lambda$8(String str, String str2) {
        str2.getClass();
        return zv1.m7365E0(str2, str, true);
    }

    public final boolean ehHomeOuRecentes(String str) {
        if (str != null && !zv1.m7371K0(str)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase.equals("com.android.systemui") || hw1.m3309D0(lowerCase, "com.android.systemui.", false)) {
                return true;
            }
            if ((zv1.m7365E0(lowerCase, "systemui", false) && (zv1.m7365E0(lowerCase, "recents", false) || zv1.m7365E0(lowerCase, "overview", false) || zv1.m7365E0(lowerCase, "sem", false))) || PACOTES_LAUNCHER_HOME.contains(lowerCase)) {
                return true;
            }
            if (zv1.m7365E0(lowerCase, "launcher", false) && !zv1.m7365E0(lowerCase, "desktoplauncher", false) && !ehShellDesktopOuDex(lowerCase)) {
                return true;
            }
        }
        return false;
    }

    public final boolean ehShellDesktopOuDex(String str) {
        if (str == null || zv1.m7371K0(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        Set<String> set = PACOTES_DESKTOP_DEX;
        if (set == null || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                if (lowerCase.equals((String) it.next())) {
                }
            }
            if (zv1.m7365E0(lowerCase, "desktopmode", false) && !zv1.m7365E0(lowerCase, "desktopsystemui", false) && !zv1.m7365E0(lowerCase, "desktoplauncher", false)) {
                return false;
            }
        } else if (zv1.m7365E0(lowerCase, "desktopmode", false)) {
        }
        return true;
    }

    public final boolean emDesktopSamsung(Context context) {
        context.getClass();
        return OverlayDisplayBinder.emModoDexComoGg$default(OverlayDisplayBinder.INSTANCE, context, null, 2, null);
    }

    public final boolean emModoDesktop(Context context) {
        context.getClass();
        return (context.getResources().getConfiguration().uiMode & 15) == 2 || emDesktopSamsung(context);
    }

    public final boolean jogoAindaVisivel(Context context, String str) {
        context.getClass();
        str.getClass();
        if (pacoteVisivelNoDumpsys(str)) {
            return true;
        }
        return temPermissaoUso(context) && pacoteUsadoRecentemente(context, str, 90000L);
    }

    public final String obterFocoParaResetTela(Context context) {
        context.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - ultimoDumpsysResetMs < INTERVALO_DUMPSYS_RESET_MS) {
            String str = pacoteMemorizado;
            return str == null ? obterPacoteEmPrimeiroPlano(context) : str;
        }
        ultimoDumpsysResetMs = jElapsedRealtime;
        String strObterPacoteViaPrivilegio = obterPacoteViaPrivilegio("dumpsys window");
        if (strObterPacoteViaPrivilegio != null) {
            return INSTANCE.memorizar(strObterPacoteViaPrivilegio);
        }
        String strObterPacoteViaPrivilegio2 = obterPacoteViaPrivilegio("dumpsys activity activities");
        return strObterPacoteViaPrivilegio2 != null ? INSTANCE.memorizar(strObterPacoteViaPrivilegio2) : obterPacoteEmPrimeiroPlano(context);
    }

    public final String obterPacoteEmPrimeiroPlano(Context context) {
        context.getClass();
        if (temPermissaoUso(context)) {
            String strObterPacoteViaUsageEvents = obterPacoteViaUsageEvents(context);
            if (strObterPacoteViaUsageEvents != null) {
                return INSTANCE.memorizar(strObterPacoteViaUsageEvents);
            }
            String str = pacoteMemorizado;
            if (str != null) {
                return str;
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - ultimoDumpsysMs < 10000) {
            return pacoteMemorizado;
        }
        ultimoDumpsysMs = jElapsedRealtime;
        String strObterPacoteViaPrivilegio = obterPacoteViaPrivilegio("dumpsys window");
        if (strObterPacoteViaPrivilegio != null) {
            return INSTANCE.memorizar(strObterPacoteViaPrivilegio);
        }
        String strObterPacoteViaPrivilegio2 = obterPacoteViaPrivilegio("dumpsys activity activities");
        return strObterPacoteViaPrivilegio2 != null ? INSTANCE.memorizar(strObterPacoteViaPrivilegio2) : pacoteMemorizado;
    }

    public final boolean temPermissaoUso(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("appops");
        systemService.getClass();
        AppOpsManager appOpsManager = (AppOpsManager) systemService;
        return (Build.VERSION.SDK_INT >= 29 ? appOpsManager.unsafeCheckOpNoThrow("android:get_usage_stats", Process.myUid(), context.getPackageName()) : appOpsManager.checkOpNoThrow("android:get_usage_stats", Process.myUid(), context.getPackageName())) == 0;
    }
}

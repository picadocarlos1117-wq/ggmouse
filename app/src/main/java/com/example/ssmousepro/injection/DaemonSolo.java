package com.example.ssmousepro.injection;

import android.os.Process;
import android.system.Os;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC0609en;
import p000.AbstractC1414sp;
import p000.gw1;
import p000.p32;
import p000.rc2;
import p000.tl1;
import p000.zv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class DaemonSolo {
    public static final DaemonSolo INSTANCE = new DaemonSolo();
    private static final List<String> MARCADORES = AbstractC1414sp.m6124n0(":injection", "sspro_wifi_inj");
    private static final String TAG = "DaemonSolo";

    private DaemonSolo() {
    }

    private final String cmdline(int i) {
        try {
            File file = new File("/proc/" + i + "/cmdline");
            Charset charset = AbstractC0609en.f3387a;
            charset.getClass();
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
            try {
                String strM5163c0 = p32.m5163c0(inputStreamReader);
                inputStreamReader.close();
                String strReplace = strM5163c0.replace((char) 0, ' ');
                strReplace.getClass();
                String string = zv1.m7383W0(strReplace).toString();
                if (string.length() == 0) {
                    return null;
                }
                return string;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rc2.m5797n(inputStreamReader, th);
                    throw th2;
                }
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    private final boolean ehShell(String str) {
        String strM7380T0 = zv1.m7380T0(str, ' ');
        int iM7372L0 = zv1.m7372L0(strM7380T0, '/');
        if (iM7372L0 != -1) {
            strM7380T0 = strM7380T0.substring(iM7372L0 + 1, strM7380T0.length());
        }
        return strM7380T0.equals("sh") || strM7380T0.equals("mksh") || strM7380T0.equals("toybox") || strM7380T0.equals("toolbox");
    }

    public final void garantirInstanciaUnica() {
        Object tl1Var;
        int iIntValue;
        String strCmdline;
        int iMyPid = Process.myPid();
        try {
            tl1Var = Integer.valueOf(Os.getppid());
        } catch (Throwable th) {
            tl1Var = new tl1(th);
        }
        if (tl1Var instanceof tl1) {
            tl1Var = -1;
        }
        int iIntValue2 = ((Number) tl1Var).intValue();
        File[] fileArrListFiles = new File("/proc").listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            String name = file.getName();
            name.getClass();
            Integer numM3069z0 = gw1.m3069z0(name);
            if (numM3069z0 != null && (iIntValue = numM3069z0.intValue()) != iMyPid && iIntValue != iIntValue2 && (strCmdline = cmdline(iIntValue)) != null && zv1.m7365E0(strCmdline, "sspro", false)) {
                List<String> list = MARCADORES;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (zv1.m7365E0(strCmdline, (String) it.next(), false)) {
                            if (!ehShell(strCmdline)) {
                                try {
                                    Process.killProcess(iIntValue);
                                    Log.w(TAG, "Daemon anterior encerrado: pid=" + iIntValue + " (" + strCmdline + ")");
                                    break;
                                } catch (Throwable th2) {
                                    Log.w(TAG, "Falha ao encerrar daemon pid=" + iIntValue, th2);
                                    break;
                                }
                            }
                            break;
                        }
                    }
                }
            }
        }
    }
}

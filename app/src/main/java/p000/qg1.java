package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qg1 {

    /* JADX INFO: renamed from: a */
    public static final hl1 f9497a = new hl1();

    /* JADX INFO: renamed from: b */
    public static final Object f9498b = new Object();

    /* JADX INFO: renamed from: c */
    public static ax0 f9499c = null;

    /* JADX INFO: renamed from: a */
    public static long m5490a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? og1.m4801a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX INFO: renamed from: b */
    public static ax0 m5491b() {
        ax0 ax0Var = new ax0(7);
        f9499c = ax0Var;
        f9497a.set(ax0Var);
        return f9499c;
    }

    /* JADX INFO: renamed from: c */
    public static void m5492c(Context context, boolean z) {
        pg1 pg1VarM5256a;
        int i;
        if (z || f9499c == null) {
            synchronized (f9498b) {
                if (!z) {
                    try {
                        if (f9499c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (Build.VERSION.SDK_INT == 30) {
                    m5491b();
                    return;
                }
                File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length = file.length();
                int i2 = 0;
                boolean z2 = file.exists() && length > 0;
                File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                long length2 = file2.length();
                boolean z3 = file2.exists() && length2 > 0;
                try {
                    long jM5490a = m5490a(context);
                    File file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            pg1VarM5256a = pg1.m5256a(file3);
                        } catch (IOException unused) {
                            m5491b();
                            return;
                        }
                    } else {
                        pg1VarM5256a = null;
                    }
                    if (pg1VarM5256a != null && pg1VarM5256a.f8893c == jM5490a && (i = pg1VarM5256a.f8892b) != 2) {
                        i2 = i;
                    } else if (z2) {
                        i2 = 1;
                    } else if (z3) {
                        i2 = 2;
                    }
                    if (z && z3 && i2 != 1) {
                        i2 = 2;
                    }
                    if (pg1VarM5256a != null && pg1VarM5256a.f8892b == 2 && i2 == 1 && length < pg1VarM5256a.f8894d) {
                        i2 = 3;
                    }
                    pg1 pg1Var = new pg1(1, i2, jM5490a, length2);
                    if (pg1VarM5256a == null || !pg1VarM5256a.equals(pg1Var)) {
                        try {
                            pg1Var.m5257b(file3);
                        } catch (IOException unused2) {
                        }
                    }
                    m5491b();
                } catch (PackageManager.NameNotFoundException unused3) {
                    m5491b();
                }
            }
        }
    }
}

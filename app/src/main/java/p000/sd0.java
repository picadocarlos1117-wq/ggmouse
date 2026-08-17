package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sd0 {

    /* JADX INFO: renamed from: a */
    public static final hw0 f10366a = new hw0(16);

    /* JADX INFO: renamed from: b */
    public static final ThreadPoolExecutor f10367b;

    /* JADX INFO: renamed from: c */
    public static final Object f10368c;

    /* JADX INFO: renamed from: d */
    public static final zs1 f10369d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new el1());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f10367b = threadPoolExecutor;
        f10368c = new Object();
        f10369d = new zs1();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020 A[EDGE_INSN: B:10:0x0020->B:24:0x003d BREAK  A[LOOP:0: B:17:0x002d->B:23:0x003a]] */
    /* JADX INFO: renamed from: a */
    public static rd0 m6084a(String str, Context context, hv0 hv0Var, int i) {
        hw0 hw0Var = f10366a;
        Typeface typeface = (Typeface) hw0Var.get(str);
        if (typeface != null) {
            return new rd0(typeface);
        }
        try {
            C1296pi c1296piM5146L = p32.m5146L(context, hv0Var);
            yd0[] yd0VarArr = (yd0[]) c1296piM5146L.f8902b;
            int i2 = c1296piM5146L.f8901a;
            int i3 = 1;
            if (i2 != 0) {
                if (i2 != 1) {
                    i3 = -3;
                    break;
                }
                i3 = -2;
            } else if (yd0VarArr != null && yd0VarArr.length != 0) {
                i3 = 0;
                for (yd0 yd0Var : yd0VarArr) {
                    int i4 = yd0Var.f12964e;
                    if (i4 != 0) {
                        if (i4 >= 0) {
                            i3 = i4;
                            break;
                        }
                        i3 = -3;
                        break;
                    }
                }
            }
            if (i3 != 0) {
                return new rd0(i3);
            }
            Typeface typefaceMo3231i = q32.f9322a.mo3231i(context, yd0VarArr, i);
            if (typefaceMo3231i == null) {
                return new rd0(-3);
            }
            hw0Var.put(str, typefaceMo3231i);
            return new rd0(typefaceMo3231i);
        } catch (PackageManager.NameNotFoundException unused) {
            return new rd0(-1);
        }
    }
}

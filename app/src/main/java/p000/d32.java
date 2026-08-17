package p000;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class d32 {

    /* JADX INFO: renamed from: e */
    public static volatile C0619ex f2774e;

    /* JADX INFO: renamed from: a */
    public final ax0 f2775a;

    /* JADX INFO: renamed from: b */
    public final ax0 f2776b;

    /* JADX INFO: renamed from: c */
    public final h00 f2777c;

    /* JADX INFO: renamed from: d */
    public final p42 f2778d;

    public d32(ax0 ax0Var, ax0 ax0Var2, h00 h00Var, p42 p42Var, C0599ed c0599ed) {
        this.f2775a = ax0Var;
        this.f2776b = ax0Var2;
        this.f2777c = h00Var;
        this.f2778d = p42Var;
        ((Executor) c0599ed.f3313a).execute(new fs1(c0599ed, 8));
    }

    /* JADX INFO: renamed from: a */
    public static d32 m2216a() {
        C0619ex c0619ex = f2774e;
        if (c0619ex != null) {
            return (d32) c0619ex.f3465g.get();
        }
        f40.m2719o("Not initialized!");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m2217b(Context context) {
        if (f2774e == null) {
            synchronized (d32.class) {
                try {
                    if (f2774e == null) {
                        C0582dx c0582dx = new C0582dx();
                        context.getClass();
                        c0582dx.f3037a = context;
                        f2774e = c0582dx.m2392b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final C1174o9 m2218c(C0831kk c0831kk) {
        Set setUnmodifiableSet = c0831kk instanceof C0831kk ? Collections.unmodifiableSet(C0831kk.f5890d) : Collections.singleton(new t60("proto"));
        C1174o9 c1174o9M2960a = C0674ge.m2960a();
        c0831kk.getClass();
        c1174o9M2960a.f7699b = "cct";
        String str = c0831kk.f5892a;
        String str2 = c0831kk.f5893b;
        if (str2 == null) {
            str2 = "";
        }
        c1174o9M2960a.f7700c = jd0.m3616n("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        return new C1174o9(setUnmodifiableSet, c1174o9M2960a.m4764j(), this, 26);
    }
}

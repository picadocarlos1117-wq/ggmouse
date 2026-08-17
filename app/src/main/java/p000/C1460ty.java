package p000;

import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: renamed from: ty */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1460ty {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1534vy f11034a;

    public /* synthetic */ C1460ty(C1534vy c1534vy) {
        this.f11034a = c1534vy;
    }

    /* JADX INFO: renamed from: a */
    public final void m6353a(int i) {
        C1534vy c1534vy = this.f11034a;
        synchronized (c1534vy) {
            int i2 = c1534vy.f11856m;
            if (i2 == 0 || c1534vy.f11847d) {
                if (i2 == i) {
                    return;
                }
                c1534vy.f11856m = i;
                if (i != 1 && i != 0 && i != 8) {
                    c1534vy.f11854k = c1534vy.m6667a(i);
                    c1534vy.f11846c.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    c1534vy.m6668b(c1534vy.f11851h, c1534vy.f11854k, c1534vy.f11849f > 0 ? (int) (jElapsedRealtime - c1534vy.f11850g) : 0);
                    c1534vy.f11850g = jElapsedRealtime;
                    c1534vy.f11851h = 0L;
                    c1534vy.f11853j = 0L;
                    c1534vy.f11852i = 0L;
                    it1 it1Var = c1534vy.f11848e;
                    ((ArrayList) it1Var.f5157f).clear();
                    it1Var.f5153b = -1;
                    it1Var.f5154c = 0;
                    it1Var.f5155d = 0;
                }
            }
        }
    }
}

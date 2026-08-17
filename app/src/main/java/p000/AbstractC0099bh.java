package p000;

import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: renamed from: bh */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0099bh implements InterfaceC0807jx {

    /* JADX INFO: renamed from: a */
    public final boolean f1365a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f1366b = new ArrayList(1);

    /* JADX INFO: renamed from: c */
    public int f1367c;

    /* JADX INFO: renamed from: d */
    public C1087lx f1368d;

    public AbstractC0099bh(boolean z) {
        this.f1365a = z;
    }

    /* JADX INFO: renamed from: k */
    public final void m989k(int i) {
        boolean z;
        C1087lx c1087lx = this.f1368d;
        int i2 = z42.f13274a;
        for (int i3 = 0; i3 < this.f1367c; i3++) {
            C1534vy c1534vy = (C1534vy) this.f1366b.get(i3);
            boolean z2 = this.f1365a;
            synchronized (c1534vy) {
                kk1 kk1Var = C1534vy.f11837n;
                if (z2) {
                    int i4 = c1087lx.f6541g;
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    c1534vy.f11851h += (long) i;
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m990n() {
        boolean z;
        C1087lx c1087lx = this.f1368d;
        int i = z42.f13274a;
        for (int i2 = 0; i2 < this.f1367c; i2++) {
            C1534vy c1534vy = (C1534vy) this.f1366b.get(i2);
            boolean z2 = this.f1365a;
            synchronized (c1534vy) {
                try {
                    kk1 kk1Var = C1534vy.f11837n;
                    if (z2) {
                        int i3 = c1087lx.f6541g;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        ki0.m3864h(c1534vy.f11849f > 0);
                        c1534vy.f11846c.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i4 = (int) (jElapsedRealtime - c1534vy.f11850g);
                        c1534vy.f11852i += (long) i4;
                        long j = c1534vy.f11853j;
                        long j2 = c1534vy.f11851h;
                        c1534vy.f11853j = j + j2;
                        if (i4 > 0) {
                            c1534vy.f11848e.m3485a((int) Math.sqrt(j2), (j2 * 8000.0f) / i4);
                            if (c1534vy.f11852i >= 2000 || c1534vy.f11853j >= 524288) {
                                c1534vy.f11854k = (long) c1534vy.f11848e.m3488d();
                            }
                            c1534vy.m6668b(c1534vy.f11851h, c1534vy.f11854k, i4);
                            c1534vy.f11850g = jElapsedRealtime;
                            c1534vy.f11851h = 0L;
                        }
                        c1534vy.f11849f--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f1368d = null;
    }

    @Override // p000.InterfaceC0807jx
    /* JADX INFO: renamed from: p */
    public final void mo991p(C1534vy c1534vy) {
        c1534vy.getClass();
        ArrayList arrayList = this.f1366b;
        if (arrayList.contains(c1534vy)) {
            return;
        }
        arrayList.add(c1534vy);
        this.f1367c++;
    }

    /* JADX INFO: renamed from: q */
    public final void m992q() {
        for (int i = 0; i < this.f1367c; i++) {
            ((C1534vy) this.f1366b.get(i)).getClass();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m993r(C1087lx c1087lx) {
        boolean z;
        this.f1368d = c1087lx;
        for (int i = 0; i < this.f1367c; i++) {
            C1534vy c1534vy = (C1534vy) this.f1366b.get(i);
            boolean z2 = this.f1365a;
            synchronized (c1534vy) {
                try {
                    kk1 kk1Var = C1534vy.f11837n;
                    if (z2) {
                        int i2 = c1087lx.f6541g;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (c1534vy.f11849f == 0) {
                            c1534vy.f11846c.getClass();
                            c1534vy.f11850g = SystemClock.elapsedRealtime();
                        }
                        c1534vy.f11849f++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}

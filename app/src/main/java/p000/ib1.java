package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ib1 {

    /* JADX INFO: renamed from: b */
    public final int f4912b;

    /* JADX INFO: renamed from: c */
    public int f4913c;

    /* JADX INFO: renamed from: d */
    public int f4914d;

    /* JADX INFO: renamed from: e */
    public final u91 f4915e;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ l81 f4917g;

    /* JADX INFO: renamed from: a */
    public final C1073lj f4911a = new C1073lj();

    /* JADX INFO: renamed from: f */
    public boolean f4916f = false;

    public ib1(l81 l81Var, int i, int i2, u91 u91Var) {
        this.f4917g = l81Var;
        this.f4912b = i;
        this.f4913c = i2;
        this.f4915e = u91Var;
    }

    /* JADX INFO: renamed from: a */
    public final int m3416a(int i) {
        if (i > 0 && Integer.MAX_VALUE - i < this.f4913c) {
            ca0.m1174f(this.f4912b, "Window size overflow for stream: ");
            return 0;
        }
        int i2 = this.f4913c + i;
        this.f4913c = i2;
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public final void m3417b(int i, C1073lj c1073lj, boolean z) {
        boolean zM6419i;
        do {
            int iMin = Math.min(i, ((f70) this.f4917g.f6262c).f3648b.f13321a.f11696d);
            int i2 = -iMin;
            ((ib1) this.f4917g.f6263d).m3416a(i2);
            m3416a(i2);
            try {
                boolean z2 = false;
                ((f70) this.f4917g.f6262c).m2731c(c1073lj.f6361b == ((long) iMin) && z, this.f4912b, c1073lj, iMin);
                u91 u91Var = this.f4915e;
                synchronized (u91Var.f11200b) {
                    p32.m5193x(u91Var.f11204f, "onStreamAllocated was not called, but it seems the stream is active");
                    int i3 = u91Var.f11203e;
                    boolean z3 = i3 < 32768;
                    int i4 = i3 - iMin;
                    u91Var.f11203e = i4;
                    boolean z4 = i4 < 32768;
                    if (!z3 && z4) {
                        z2 = true;
                    }
                }
                if (z2) {
                    synchronized (u91Var.f11200b) {
                        zM6419i = u91Var.m6419i();
                    }
                    if (zM6419i) {
                        u91Var.f11208j.mo4768p();
                    }
                }
                i -= iMin;
            } catch (IOException e) {
                ca0.m1184p(e);
                return;
            }
        } while (i > 0);
    }

    /* JADX INFO: renamed from: c */
    public final void m3418c(int i, p71 p71Var) {
        int i2 = this.f4913c;
        l81 l81Var = this.f4917g;
        int iMin = Math.min(i, Math.min(i2, ((ib1) l81Var.f6263d).f4913c));
        int i3 = 0;
        while (true) {
            C1073lj c1073lj = this.f4911a;
            long j = c1073lj.f6361b;
            if (j <= 0 || iMin <= 0) {
                return;
            }
            if (iMin >= j) {
                int i4 = (int) j;
                i3 += i4;
                m3417b(i4, c1073lj, this.f4916f);
            } else {
                i3 += iMin;
                m3417b(iMin, c1073lj, false);
            }
            p71Var.f8786b++;
            iMin = Math.min(i - i3, Math.min(this.f4913c, ((ib1) l81Var.f6263d).f4913c));
        }
    }
}

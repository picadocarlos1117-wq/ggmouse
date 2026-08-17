package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: ip */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0762ip {

    /* JADX INFO: renamed from: a */
    public int f5122a;

    /* JADX INFO: renamed from: b */
    public int f5123b = 100;

    /* JADX INFO: renamed from: c */
    public C0799jp f5124c;

    /* JADX INFO: renamed from: b */
    public static int m3466b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* JADX INFO: renamed from: c */
    public static long m3467c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* JADX INFO: renamed from: f */
    public static C0611ep m3468f(byte[] bArr, int i, int i2, boolean z) {
        C0611ep c0611ep = new C0611ep(bArr, i, i2, z);
        try {
            c0611ep.mo2619i(i2);
            return c0611ep;
        } catch (rp0 e) {
            l41.m4045n(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static AbstractC0762ip m3469g(InputStream inputStream) {
        if (inputStream != null) {
            return new C0685gp(inputStream);
        }
        byte[] bArr = no0.f7482b;
        return m3468f(bArr, 0, bArr.length, false);
    }

    /* JADX INFO: renamed from: s */
    public static int m3470s(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw rp0.m5887h();
            }
            i2 |= (i4 & 127) << i3;
            if ((i4 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw rp0.m5887h();
            }
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw rp0.m5884e();
    }

    /* JADX INFO: renamed from: A */
    public abstract int mo2605A();

    /* JADX INFO: renamed from: B */
    public abstract long mo2606B();

    /* JADX INFO: renamed from: C */
    public abstract boolean mo2607C(int i);

    /* JADX INFO: renamed from: a */
    public abstract void mo2615a(int i);

    /* JADX INFO: renamed from: d */
    public abstract int mo2616d();

    /* JADX INFO: renamed from: e */
    public abstract boolean mo2617e();

    /* JADX INFO: renamed from: h */
    public abstract void mo2618h(int i);

    /* JADX INFO: renamed from: i */
    public abstract int mo2619i(int i);

    /* JADX INFO: renamed from: j */
    public abstract boolean mo2620j();

    /* JADX INFO: renamed from: k */
    public abstract C0680gk mo2621k();

    /* JADX INFO: renamed from: l */
    public abstract double mo2622l();

    /* JADX INFO: renamed from: m */
    public abstract int mo2623m();

    /* JADX INFO: renamed from: n */
    public abstract int mo2624n();

    /* JADX INFO: renamed from: o */
    public abstract long mo2625o();

    /* JADX INFO: renamed from: p */
    public abstract float mo2626p();

    /* JADX INFO: renamed from: q */
    public abstract int mo2627q();

    /* JADX INFO: renamed from: r */
    public abstract long mo2628r();

    /* JADX INFO: renamed from: t */
    public abstract int mo2629t();

    /* JADX INFO: renamed from: u */
    public abstract long mo2630u();

    /* JADX INFO: renamed from: v */
    public abstract int mo2631v();

    /* JADX INFO: renamed from: w */
    public abstract long mo2632w();

    /* JADX INFO: renamed from: x */
    public abstract String mo2633x();

    /* JADX INFO: renamed from: y */
    public abstract String mo2634y();

    /* JADX INFO: renamed from: z */
    public abstract int mo2635z();
}

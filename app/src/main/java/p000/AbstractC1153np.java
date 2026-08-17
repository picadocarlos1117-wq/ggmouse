package p000;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: np */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1153np {

    /* JADX INFO: renamed from: b */
    public static final Logger f7490b = Logger.getLogger(AbstractC1153np.class.getName());

    /* JADX INFO: renamed from: c */
    public static final boolean f7491c = k42.f5666e;

    /* JADX INFO: renamed from: a */
    public ay0 f7492a;

    /* JADX INFO: renamed from: a */
    public static int m4582a(int i) {
        if (i >= 0) {
            return m4585d(i);
        }
        return 10;
    }

    /* JADX INFO: renamed from: b */
    public static int m4583b(String str) {
        int length;
        try {
            length = w42.m6707c(str);
        } catch (v42 unused) {
            length = str.getBytes(no0.f7481a).length;
        }
        return m4585d(length) + length;
    }

    /* JADX INFO: renamed from: c */
    public static int m4584c(int i) {
        return m4585d(i << 3);
    }

    /* JADX INFO: renamed from: d */
    public static int m4585d(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* JADX INFO: renamed from: e */
    public static int m4586e(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo3973A(long j);

    /* JADX INFO: renamed from: f */
    public final void m4587f(String str, v42 v42Var) throws C1079lp {
        f7490b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) v42Var);
        byte[] bytes = str.getBytes(no0.f7481a);
        try {
            mo3994y(bytes.length);
            mo3987r(0, bytes.length, bytes);
        } catch (IndexOutOfBoundsException e) {
            throw new C1079lp(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo3976g(byte b);

    /* JADX INFO: renamed from: h */
    public abstract void mo3977h(int i, boolean z);

    /* JADX INFO: renamed from: i */
    public abstract void mo3978i(int i, byte[] bArr);

    /* JADX INFO: renamed from: j */
    public abstract void mo3979j(int i, AbstractC0753ik abstractC0753ik);

    /* JADX INFO: renamed from: k */
    public abstract void mo3980k(AbstractC0753ik abstractC0753ik);

    /* JADX INFO: renamed from: l */
    public abstract void mo3981l(int i, int i2);

    /* JADX INFO: renamed from: m */
    public abstract void mo3982m(int i);

    /* JADX INFO: renamed from: n */
    public abstract void mo3983n(int i, long j);

    /* JADX INFO: renamed from: o */
    public abstract void mo3984o(long j);

    /* JADX INFO: renamed from: p */
    public abstract void mo3985p(int i, int i2);

    /* JADX INFO: renamed from: q */
    public abstract void mo3986q(int i);

    /* JADX INFO: renamed from: r */
    public abstract void mo3987r(int i, int i2, byte[] bArr);

    /* JADX INFO: renamed from: s */
    public abstract void mo3988s(int i, y41 y41Var, qp1 qp1Var);

    /* JADX INFO: renamed from: t */
    public abstract void mo3989t(y41 y41Var);

    /* JADX INFO: renamed from: u */
    public abstract void mo3990u(int i, String str);

    /* JADX INFO: renamed from: v */
    public abstract void mo3991v(String str);

    /* JADX INFO: renamed from: w */
    public abstract void mo3992w(int i, int i2);

    /* JADX INFO: renamed from: x */
    public abstract void mo3993x(int i, int i2);

    /* JADX INFO: renamed from: y */
    public abstract void mo3994y(int i);

    /* JADX INFO: renamed from: z */
    public abstract void mo3995z(int i, long j);
}

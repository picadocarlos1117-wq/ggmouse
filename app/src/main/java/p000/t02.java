package p000;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t02 {

    /* JADX INFO: renamed from: a */
    public static final q02 f10690a = new q02();

    static {
        z42.m7252z(0);
        z42.m7252z(1);
        z42.m7252z(2);
    }

    /* JADX INFO: renamed from: a */
    public int mo2970a(boolean z) {
        return m6176p() ? -1 : 0;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo1054b(Object obj);

    /* JADX INFO: renamed from: c */
    public int mo2971c(boolean z) {
        if (m6176p()) {
            return -1;
        }
        return mo1059o() - 1;
    }

    /* JADX INFO: renamed from: d */
    public final int m6172d(int i, r02 r02Var, s02 s02Var, int i2, boolean z) {
        int i3 = mo1055f(i, r02Var, false).f9651c;
        if (mo1058m(i3, s02Var, 0L).f10193m != i) {
            return i + 1;
        }
        int iMo2972e = mo2972e(i3, i2, z);
        if (iMo2972e == -1) {
            return -1;
        }
        return mo1058m(iMo2972e, s02Var, 0L).f10192l;
    }

    /* JADX INFO: renamed from: e */
    public int mo2972e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo2971c(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo2971c(z) ? mo2970a(z) : i + 1;
        }
        l41.m4046o();
        return 0;
    }

    public final boolean equals(Object obj) {
        int iMo2971c;
        if (this != obj) {
            if (obj instanceof t02) {
                t02 t02Var = (t02) obj;
                if (t02Var.mo1059o() == mo1059o() && t02Var.mo1056h() == mo1056h()) {
                    s02 s02Var = new s02();
                    r02 r02Var = new r02();
                    s02 s02Var2 = new s02();
                    r02 r02Var2 = new r02();
                    for (int i = 0; i < mo1059o(); i++) {
                        if (mo1058m(i, s02Var, 0L).equals(t02Var.mo1058m(i, s02Var2, 0L))) {
                        }
                    }
                    for (int i2 = 0; i2 < mo1056h(); i2++) {
                        if (mo1055f(i2, r02Var, true).equals(t02Var.mo1055f(i2, r02Var2, true))) {
                        }
                    }
                    int iMo2970a = mo2970a(true);
                    if (iMo2970a == t02Var.mo2970a(true) && (iMo2971c = mo2971c(true)) == t02Var.mo2971c(true)) {
                        while (iMo2970a != iMo2971c) {
                            int iMo2972e = mo2972e(iMo2970a, 0, true);
                            if (iMo2972e == t02Var.mo2972e(iMo2970a, 0, true)) {
                                iMo2970a = iMo2972e;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public abstract r02 mo1055f(int i, r02 r02Var, boolean z);

    /* JADX INFO: renamed from: g */
    public r02 mo2973g(Object obj, r02 r02Var) {
        return mo1055f(mo1054b(obj), r02Var, true);
    }

    /* JADX INFO: renamed from: h */
    public abstract int mo1056h();

    public final int hashCode() {
        s02 s02Var = new s02();
        r02 r02Var = new r02();
        int iMo1059o = mo1059o() + 217;
        for (int i = 0; i < mo1059o(); i++) {
            iMo1059o = (iMo1059o * 31) + mo1058m(i, s02Var, 0L).hashCode();
        }
        int iMo1056h = mo1056h() + (iMo1059o * 31);
        for (int i2 = 0; i2 < mo1056h(); i2++) {
            iMo1056h = (iMo1056h * 31) + mo1055f(i2, r02Var, true).hashCode();
        }
        int iMo2970a = mo2970a(true);
        while (iMo2970a != -1) {
            iMo1056h = (iMo1056h * 31) + iMo2970a;
            iMo2970a = mo2972e(iMo2970a, 0, true);
        }
        return iMo1056h;
    }

    /* JADX INFO: renamed from: i */
    public final Pair m6173i(s02 s02Var, r02 r02Var, int i, long j) {
        Pair pairM6174j = m6174j(s02Var, r02Var, i, j, 0L);
        pairM6174j.getClass();
        return pairM6174j;
    }

    /* JADX INFO: renamed from: j */
    public final Pair m6174j(s02 s02Var, r02 r02Var, int i, long j, long j2) {
        ki0.m3860e(i, mo1059o());
        mo1058m(i, s02Var, j2);
        if (j == -9223372036854775807L) {
            j = s02Var.f10190j;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = s02Var.f10192l;
        mo1055f(i2, r02Var, false);
        while (i2 < s02Var.f10193m && r02Var.f9653e != j) {
            int i3 = i2 + 1;
            if (mo1055f(i3, r02Var, false).f9653e > j) {
                break;
            }
            i2 = i3;
        }
        mo1055f(i2, r02Var, true);
        long jMin = j - r02Var.f9653e;
        long j3 = r02Var.f9652d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = r02Var.f9650b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    /* JADX INFO: renamed from: k */
    public int mo2974k(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo2970a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo2970a(z) ? mo2971c(z) : i - 1;
        }
        l41.m4046o();
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public abstract Object mo1057l(int i);

    /* JADX INFO: renamed from: m */
    public abstract s02 mo1058m(int i, s02 s02Var, long j);

    /* JADX INFO: renamed from: n */
    public final void m6175n(int i, s02 s02Var) {
        mo1058m(i, s02Var, 0L);
    }

    /* JADX INFO: renamed from: o */
    public abstract int mo1059o();

    /* JADX INFO: renamed from: p */
    public final boolean m6176p() {
        return mo1059o() == 0;
    }
}

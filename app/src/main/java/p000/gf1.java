package p000;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class gf1 extends t02 {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f4174k = 0;

    /* JADX INFO: renamed from: b */
    public final int f4175b;

    /* JADX INFO: renamed from: c */
    public final vs1 f4176c;

    /* JADX INFO: renamed from: d */
    public final int f4177d;

    /* JADX INFO: renamed from: e */
    public final int f4178e;

    /* JADX INFO: renamed from: f */
    public final int[] f4179f;

    /* JADX INFO: renamed from: g */
    public final int[] f4180g;

    /* JADX INFO: renamed from: h */
    public final t02[] f4181h;

    /* JADX INFO: renamed from: i */
    public final Object[] f4182i;

    /* JADX INFO: renamed from: j */
    public final HashMap f4183j;

    public gf1(t02[] t02VarArr, Object[] objArr, vs1 vs1Var) {
        this.f4176c = vs1Var;
        this.f4175b = vs1Var.f11765b.length;
        int length = t02VarArr.length;
        this.f4181h = t02VarArr;
        this.f4179f = new int[length];
        this.f4180g = new int[length];
        this.f4182i = objArr;
        this.f4183j = new HashMap();
        int length2 = t02VarArr.length;
        int i = 0;
        int iMo1059o = 0;
        int iMo1056h = 0;
        int i2 = 0;
        while (i < length2) {
            t02 t02Var = t02VarArr[i];
            this.f4181h[i2] = t02Var;
            this.f4180g[i2] = iMo1059o;
            this.f4179f[i2] = iMo1056h;
            iMo1059o += t02Var.mo1059o();
            iMo1056h += this.f4181h[i2].mo1056h();
            this.f4183j.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.f4177d = iMo1059o;
        this.f4178e = iMo1056h;
    }

    @Override // p000.t02
    /* JADX INFO: renamed from: a */
    public final int mo2970a(boolean z) {
        if (this.f4175b != 0) {
            int iM2975q = 0;
            if (z) {
                int[] iArr = this.f4176c.f11765b;
                iM2975q = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                t02[] t02VarArr = this.f4181h;
                if (!t02VarArr[iM2975q].m6176p()) {
                    return t02VarArr[iM2975q].mo2970a(z) + this.f4180g[iM2975q];
                }
                iM2975q = m2975q(iM2975q, z);
            } while (iM2975q != -1);
        }
        return -1;
    }

    @Override // p000.t02
    /* JADX INFO: renamed from: b */
    public final int mo1054b(Object obj) {
        int iMo1054b;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.f4183j.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iMo1054b = this.f4181h[iIntValue].mo1054b(obj3)) != -1) {
                return this.f4179f[iIntValue] + iMo1054b;
            }
        }
        return -1;
    }

    @Override // p000.t02
    /* JADX INFO: renamed from: c */
    public final int mo2971c(boolean z) {
        int iM2976r;
        int i = this.f4175b;
        if (i != 0) {
            if (z) {
                int[] iArr = this.f4176c.f11765b;
                iM2976r = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iM2976r = i - 1;
            }
            do {
                t02[] t02VarArr = this.f4181h;
                if (!t02VarArr[iM2976r].m6176p()) {
                    return t02VarArr[iM2976r].mo2971c(z) + this.f4180g[iM2976r];
                }
                iM2976r = m2976r(iM2976r, z);
            } while (iM2976r != -1);
        }
        return -1;
    }

    @Override // p000.t02
    /* JADX INFO: renamed from: e */
    public final int mo2972e(int i, int i2, boolean z) {
        int[] iArr = this.f4180g;
        int iM7229c = z42.m7229c(iArr, i + 1, false, false);
        int i3 = iArr[iM7229c];
        t02[] t02VarArr = this.f4181h;
        int iMo2972e = t02VarArr[iM7229c].mo2972e(i - i3, i2 != 2 ? i2 : 0, z);
        if (iMo2972e != -1) {
            return i3 + iMo2972e;
        }
        int iM2975q = m2975q(iM7229c, z);
        while (iM2975q != -1 && t02VarArr[iM2975q].m6176p()) {
            iM2975q = m2975q(iM2975q, z);
        }
        if (iM2975q != -1) {
            return t02VarArr[iM2975q].mo2970a(z) + iArr[iM2975q];
        }
        if (i2 == 2) {
            return mo2970a(z);
        }
        return -1;
    }

    @Override // p000.t02
    /* JADX INFO: renamed from: f */
    public final r02 mo1055f(int i, r02 r02Var, boolean z) {
        int[] iArr = this.f4179f;
        int iM7229c = z42.m7229c(iArr, i + 1, false, false);
        int i2 = this.f4180g[iM7229c];
        this.f4181h[iM7229c].mo1055f(i - iArr[iM7229c], r02Var, z);
        r02Var.f9651c += i2;
        if (z) {
            Object obj = this.f4182i[iM7229c];
            Object obj2 = r02Var.f9650b;
            obj2.getClass();
            r02Var.f9650b = Pair.create(obj, obj2);
        }
        return r02Var;
    }

    @Override // p000.t02
    /* JADX INFO: renamed from: g */
    public final r02 mo2973g(Object obj, r02 r02Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f4183j.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i = this.f4180g[iIntValue];
        this.f4181h[iIntValue].mo2973g(obj3, r02Var);
        r02Var.f9651c += i;
        r02Var.f9650b = obj;
        return r02Var;
    }

    @Override // p000.t02
    /* JADX INFO: renamed from: h */
    public final int mo1056h() {
        return this.f4178e;
    }

    @Override // p000.t02
    /* JADX INFO: renamed from: k */
    public final int mo2974k(int i, int i2, boolean z) {
        int[] iArr = this.f4180g;
        int iM7229c = z42.m7229c(iArr, i + 1, false, false);
        int i3 = iArr[iM7229c];
        t02[] t02VarArr = this.f4181h;
        int iMo2974k = t02VarArr[iM7229c].mo2974k(i - i3, i2 != 2 ? i2 : 0, z);
        if (iMo2974k != -1) {
            return i3 + iMo2974k;
        }
        int iM2976r = m2976r(iM7229c, z);
        while (iM2976r != -1 && t02VarArr[iM2976r].m6176p()) {
            iM2976r = m2976r(iM2976r, z);
        }
        if (iM2976r != -1) {
            return t02VarArr[iM2976r].mo2971c(z) + iArr[iM2976r];
        }
        if (i2 == 2) {
            return mo2971c(z);
        }
        return -1;
    }

    @Override // p000.t02
    /* JADX INFO: renamed from: l */
    public final Object mo1057l(int i) {
        int[] iArr = this.f4179f;
        int iM7229c = z42.m7229c(iArr, i + 1, false, false);
        return Pair.create(this.f4182i[iM7229c], this.f4181h[iM7229c].mo1057l(i - iArr[iM7229c]));
    }

    @Override // p000.t02
    /* JADX INFO: renamed from: m */
    public final s02 mo1058m(int i, s02 s02Var, long j) {
        int[] iArr = this.f4180g;
        int iM7229c = z42.m7229c(iArr, i + 1, false, false);
        int i2 = iArr[iM7229c];
        int i3 = this.f4179f[iM7229c];
        this.f4181h[iM7229c].mo1058m(i - i2, s02Var, j);
        Object objCreate = this.f4182i[iM7229c];
        Object obj = s02.f10179o;
        Object obj2 = s02Var.f10181a;
        if (obj != obj2) {
            objCreate = Pair.create(objCreate, obj2);
        }
        s02Var.f10181a = objCreate;
        s02Var.f10192l += i3;
        s02Var.f10193m += i3;
        return s02Var;
    }

    @Override // p000.t02
    /* JADX INFO: renamed from: o */
    public final int mo1059o() {
        return this.f4177d;
    }

    /* JADX INFO: renamed from: q */
    public final int m2975q(int i, boolean z) {
        if (!z) {
            if (i < this.f4175b - 1) {
                return i + 1;
            }
            return -1;
        }
        vs1 vs1Var = this.f4176c;
        int i2 = vs1Var.f11766c[i] + 1;
        int[] iArr = vs1Var.f11765b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    /* JADX INFO: renamed from: r */
    public final int m2976r(int i, boolean z) {
        if (!z) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        vs1 vs1Var = this.f4176c;
        int i2 = vs1Var.f11766c[i] - 1;
        if (i2 >= 0) {
            return vs1Var.f11765b[i2];
        }
        return -1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public gf1(ArrayList arrayList, vs1 vs1Var) {
        t02[] t02VarArr = new t02[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            t02VarArr[i2] = ((w21) obj).mo1121a();
            i2++;
        }
        Object[] objArr = new Object[arrayList.size()];
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            objArr[i] = ((w21) obj2).getUid();
            i++;
        }
        this(t02VarArr, objArr, vs1Var);
    }
}

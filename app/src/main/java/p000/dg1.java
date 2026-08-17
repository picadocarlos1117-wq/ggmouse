package p000;

import com.example.ssmousepro.injection.TouchPipeline;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class dg1 extends C0670ga {

    /* JADX INFO: renamed from: f */
    public au1[] f2926f;

    /* JADX INFO: renamed from: g */
    public au1[] f2927g;

    /* JADX INFO: renamed from: h */
    public int f2928h;

    /* JADX INFO: renamed from: i */
    public qo0 f2929i;

    @Override // p000.C0670ga
    /* JADX INFO: renamed from: d */
    public final au1 mo2352d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f2928h; i2++) {
            au1[] au1VarArr = this.f2926f;
            au1 au1Var = au1VarArr[i2];
            if (!zArr[au1Var.f1056b]) {
                qo0 qo0Var = this.f2929i;
                qo0Var.f9548b = au1Var;
                int i3 = 8;
                if (i != -1) {
                    au1 au1Var2 = au1VarArr[i];
                    while (i3 >= 0) {
                        float f = au1Var2.f1062m[i3];
                        float f2 = ((au1) qo0Var.f9548b).f1062m[i3];
                        if (f2 != f) {
                            if (f2 >= f) {
                                break;
                            }
                            i = i2;
                            break;
                            break;
                        }
                        i3--;
                    }
                } else {
                    while (i3 >= 0) {
                        float f3 = ((au1) qo0Var.f9548b).f1062m[i3];
                        if (f3 > TouchPipeline.SIZE) {
                            break;
                        }
                        if (f3 < TouchPipeline.SIZE) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f2926f[i];
    }

    @Override // p000.C0670ga
    /* JADX INFO: renamed from: e */
    public final boolean mo2353e() {
        return this.f2928h == 0;
    }

    @Override // p000.C0670ga
    /* JADX INFO: renamed from: i */
    public final void mo2354i(xs0 xs0Var, C0670ga c0670ga, boolean z) {
        au1 au1Var = c0670ga.f4112a;
        if (au1Var == null) {
            return;
        }
        float[] fArr = au1Var.f1062m;
        C0011aa c0011aa = c0670ga.f4115d;
        int iM131d = c0011aa.m131d();
        for (int i = 0; i < iM131d; i++) {
            au1 au1VarM132e = c0011aa.m132e(i);
            float fM133f = c0011aa.m133f(i);
            qo0 qo0Var = this.f2929i;
            qo0Var.f9548b = au1VarM132e;
            if (au1VarM132e.f1055a) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((au1) qo0Var.f9548b).f1062m;
                    float f = (fArr[i2] * fM133f) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        ((au1) qo0Var.f9548b).f1062m[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((dg1) qo0Var.f9549c).m2356k((au1) qo0Var.f9548b);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != TouchPipeline.SIZE) {
                        float f3 = f2 * fM133f;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        ((au1) qo0Var.f9548b).f1062m[i3] = f3;
                    } else {
                        ((au1) qo0Var.f9548b).f1062m[i3] = 0.0f;
                    }
                }
                m2355j(au1VarM132e);
            }
            this.f4113b = (c0670ga.f4113b * fM133f) + this.f4113b;
        }
        m2356k(au1Var);
    }

    /* JADX INFO: renamed from: j */
    public final void m2355j(au1 au1Var) {
        int i;
        au1[] au1VarArr;
        int i2 = this.f2928h + 1;
        au1[] au1VarArr2 = this.f2926f;
        if (i2 > au1VarArr2.length) {
            au1[] au1VarArr3 = (au1[]) Arrays.copyOf(au1VarArr2, au1VarArr2.length * 2);
            this.f2926f = au1VarArr3;
            this.f2927g = (au1[]) Arrays.copyOf(au1VarArr3, au1VarArr3.length * 2);
        }
        au1[] au1VarArr4 = this.f2926f;
        int i3 = this.f2928h;
        au1VarArr4[i3] = au1Var;
        int i4 = i3 + 1;
        this.f2928h = i4;
        if (i4 > 1 && au1VarArr4[i3].f1056b > au1Var.f1056b) {
            int i5 = 0;
            while (true) {
                i = this.f2928h;
                au1VarArr = this.f2927g;
                if (i5 >= i) {
                    break;
                }
                au1VarArr[i5] = this.f2926f[i5];
                i5++;
            }
            Arrays.sort(au1VarArr, 0, i, new C1158nu(3));
            for (int i6 = 0; i6 < this.f2928h; i6++) {
                this.f2926f[i6] = this.f2927g[i6];
            }
        }
        au1Var.f1055a = true;
        au1Var.m716a(this);
    }

    /* JADX INFO: renamed from: k */
    public final void m2356k(au1 au1Var) {
        int i = 0;
        while (i < this.f2928h) {
            if (this.f2926f[i] == au1Var) {
                while (true) {
                    int i2 = this.f2928h;
                    if (i >= i2 - 1) {
                        this.f2928h = i2 - 1;
                        au1Var.f1055a = false;
                        return;
                    } else {
                        au1[] au1VarArr = this.f2926f;
                        int i3 = i + 1;
                        au1VarArr[i] = au1VarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // p000.C0670ga
    public final String toString() {
        qo0 qo0Var = this.f2929i;
        String str = " goal -> (" + this.f4113b + ") : ";
        for (int i = 0; i < this.f2928h; i++) {
            qo0Var.f9548b = this.f2926f[i];
            str = str + qo0Var + " ";
        }
        return str;
    }
}

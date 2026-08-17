package p000;

import com.example.ssmousepro.injection.TouchPipeline;
import java.util.ArrayList;

/* JADX INFO: renamed from: ga */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class C0670ga {

    /* JADX INFO: renamed from: d */
    public final C0011aa f4115d;

    /* JADX INFO: renamed from: a */
    public au1 f4112a = null;

    /* JADX INFO: renamed from: b */
    public float f4113b = TouchPipeline.SIZE;

    /* JADX INFO: renamed from: c */
    public final ArrayList f4114c = new ArrayList();

    /* JADX INFO: renamed from: e */
    public boolean f4116e = false;

    public C0670ga(C1174o9 c1174o9) {
        this.f4115d = new C0011aa(this, c1174o9);
    }

    /* JADX INFO: renamed from: a */
    public final void m2945a(xs0 xs0Var, int i) {
        au1 au1VarM6965j = xs0Var.m6965j(i);
        C0011aa c0011aa = this.f4115d;
        c0011aa.m134g(au1VarM6965j, 1.0f);
        c0011aa.m134g(xs0Var.m6965j(i), -1.0f);
    }

    /* JADX INFO: renamed from: b */
    public final void m2946b(au1 au1Var, au1 au1Var2, au1 au1Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f4113b = i;
        }
        C0011aa c0011aa = this.f4115d;
        if (z) {
            c0011aa.m134g(au1Var, 1.0f);
            c0011aa.m134g(au1Var2, -1.0f);
            c0011aa.m134g(au1Var3, -1.0f);
        } else {
            c0011aa.m134g(au1Var, -1.0f);
            c0011aa.m134g(au1Var2, 1.0f);
            c0011aa.m134g(au1Var3, 1.0f);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2947c(au1 au1Var, au1 au1Var2, au1 au1Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f4113b = i;
        }
        C0011aa c0011aa = this.f4115d;
        if (z) {
            c0011aa.m134g(au1Var, 1.0f);
            c0011aa.m134g(au1Var2, -1.0f);
            c0011aa.m134g(au1Var3, 1.0f);
        } else {
            c0011aa.m134g(au1Var, -1.0f);
            c0011aa.m134g(au1Var2, 1.0f);
            c0011aa.m134g(au1Var3, -1.0f);
        }
    }

    /* JADX INFO: renamed from: d */
    public au1 mo2352d(boolean[] zArr) {
        return m2948f(zArr, null);
    }

    /* JADX INFO: renamed from: e */
    public boolean mo2353e() {
        return this.f4112a == null && this.f4113b == TouchPipeline.SIZE && this.f4115d.m131d() == 0;
    }

    /* JADX INFO: renamed from: f */
    public final au1 m2948f(boolean[] zArr, au1 au1Var) {
        int i;
        C0011aa c0011aa = this.f4115d;
        int iM131d = c0011aa.m131d();
        au1 au1Var2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iM131d; i2++) {
            float fM133f = c0011aa.m133f(i2);
            if (fM133f < TouchPipeline.SIZE) {
                au1 au1VarM132e = c0011aa.m132e(i2);
                if ((zArr == null || !zArr[au1VarM132e.f1056b]) && au1VarM132e != au1Var && (((i = au1VarM132e.f1066q) == 3 || i == 4) && fM133f < f)) {
                    f = fM133f;
                    au1Var2 = au1VarM132e;
                }
            }
        }
        return au1Var2;
    }

    /* JADX INFO: renamed from: g */
    public final void m2949g(au1 au1Var) {
        au1 au1Var2 = this.f4112a;
        C0011aa c0011aa = this.f4115d;
        if (au1Var2 != null) {
            c0011aa.m134g(au1Var2, -1.0f);
            this.f4112a.f1057c = -1;
            this.f4112a = null;
        }
        float fM135h = c0011aa.m135h(au1Var, true) * (-1.0f);
        this.f4112a = au1Var;
        if (fM135h == 1.0f) {
            return;
        }
        this.f4113b /= fM135h;
        int i = c0011aa.f103h;
        for (int i2 = 0; i != -1 && i2 < c0011aa.f96a; i2++) {
            float[] fArr = c0011aa.f102g;
            fArr[i] = fArr[i] / fM135h;
            i = c0011aa.f101f[i];
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2950h(xs0 xs0Var, au1 au1Var, boolean z) {
        if (au1Var.f1060f) {
            C0011aa c0011aa = this.f4115d;
            float fM130c = c0011aa.m130c(au1Var);
            this.f4113b = (au1Var.f1059e * fM130c) + this.f4113b;
            c0011aa.m135h(au1Var, z);
            if (z) {
                au1Var.m717b(this);
            }
            if (c0011aa.m131d() == 0) {
                this.f4116e = true;
                xs0Var.f12706a = true;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo2354i(xs0 xs0Var, C0670ga c0670ga, boolean z) {
        C0011aa c0011aa = this.f4115d;
        c0011aa.getClass();
        float fM130c = c0011aa.m130c(c0670ga.f4112a);
        c0011aa.m135h(c0670ga.f4112a, z);
        C0011aa c0011aa2 = c0670ga.f4115d;
        int iM131d = c0011aa2.m131d();
        for (int i = 0; i < iM131d; i++) {
            au1 au1VarM132e = c0011aa2.m132e(i);
            c0011aa.m128a(au1VarM132e, c0011aa2.m130c(au1VarM132e) * fM130c, z);
        }
        this.f4113b = (c0670ga.f4113b * fM130c) + this.f4113b;
        if (z) {
            c0670ga.f4112a.m717b(this);
        }
        if (this.f4112a == null || c0011aa.m131d() != 0) {
            return;
        }
        this.f4116e = true;
        xs0Var.f12706a = true;
    }

    public String toString() {
        boolean z;
        String strConcat = (this.f4112a == null ? "0" : "" + this.f4112a).concat(" = ");
        if (this.f4113b != TouchPipeline.SIZE) {
            StringBuilder sbM5344k = AbstractC1308pu.m5344k(strConcat);
            sbM5344k.append(this.f4113b);
            strConcat = sbM5344k.toString();
            z = true;
        } else {
            z = false;
        }
        C0011aa c0011aa = this.f4115d;
        int iM131d = c0011aa.m131d();
        for (int i = 0; i < iM131d; i++) {
            au1 au1VarM132e = c0011aa.m132e(i);
            if (au1VarM132e != null) {
                float fM133f = c0011aa.m133f(i);
                if (fM133f != TouchPipeline.SIZE) {
                    String string = au1VarM132e.toString();
                    if (z) {
                        if (fM133f > TouchPipeline.SIZE) {
                            strConcat = strConcat.concat(" + ");
                        } else {
                            strConcat = strConcat.concat(" - ");
                            fM133f *= -1.0f;
                        }
                    } else if (fM133f < TouchPipeline.SIZE) {
                        strConcat = strConcat.concat("- ");
                        fM133f *= -1.0f;
                    }
                    strConcat = fM133f == 1.0f ? strConcat.concat(string) : strConcat + fM133f + " " + string;
                    z = true;
                }
            }
        }
        return !z ? strConcat.concat("0.0") : strConcat;
    }
}

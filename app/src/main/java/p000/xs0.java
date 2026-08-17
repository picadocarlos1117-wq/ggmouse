package p000;

import com.example.ssmousepro.injection.TouchPipeline;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class xs0 {

    /* JADX INFO: renamed from: p */
    public static boolean f12704p = false;

    /* JADX INFO: renamed from: q */
    public static int f12705q = 1000;

    /* JADX INFO: renamed from: c */
    public final dg1 f12708c;

    /* JADX INFO: renamed from: f */
    public C0670ga[] f12711f;

    /* JADX INFO: renamed from: l */
    public final C1174o9 f12717l;

    /* JADX INFO: renamed from: o */
    public C0670ga f12720o;

    /* JADX INFO: renamed from: a */
    public boolean f12706a = false;

    /* JADX INFO: renamed from: b */
    public int f12707b = 0;

    /* JADX INFO: renamed from: d */
    public int f12709d = 32;

    /* JADX INFO: renamed from: e */
    public int f12710e = 32;

    /* JADX INFO: renamed from: g */
    public boolean f12712g = false;

    /* JADX INFO: renamed from: h */
    public boolean[] f12713h = new boolean[32];

    /* JADX INFO: renamed from: i */
    public int f12714i = 1;

    /* JADX INFO: renamed from: j */
    public int f12715j = 0;

    /* JADX INFO: renamed from: k */
    public int f12716k = 32;

    /* JADX INFO: renamed from: m */
    public au1[] f12718m = new au1[f12705q];

    /* JADX INFO: renamed from: n */
    public int f12719n = 0;

    public xs0() {
        this.f12711f = null;
        this.f12711f = new C0670ga[32];
        m6973s();
        C1174o9 c1174o9 = new C1174o9(5);
        c1174o9.f7699b = new kf1();
        c1174o9.f7700c = new kf1();
        c1174o9.f7701d = new au1[32];
        this.f12717l = c1174o9;
        dg1 dg1Var = new dg1(c1174o9);
        dg1Var.f2926f = new au1[128];
        dg1Var.f2927g = new au1[128];
        dg1Var.f2928h = 0;
        dg1Var.f2929i = new qo0(dg1Var);
        this.f12708c = dg1Var;
        this.f12720o = new C0670ga(c1174o9);
    }

    /* JADX INFO: renamed from: n */
    public static int m6955n(Object obj) {
        au1 au1Var = ((C1082ls) obj).f6506i;
        if (au1Var != null) {
            return (int) (au1Var.f1059e + 0.5f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final au1 m6956a(int i) {
        kf1 kf1Var = (kf1) this.f12717l.f7700c;
        int i2 = kf1Var.f5790b;
        Object obj = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = kf1Var.f5789a;
            Object obj2 = objArr[i3];
            objArr[i3] = null;
            kf1Var.f5790b = i3;
            obj = obj2;
        }
        au1 au1Var = (au1) obj;
        if (au1Var == null) {
            au1Var = new au1(i);
            au1Var.f1066q = i;
        } else {
            au1Var.m718c();
            au1Var.f1066q = i;
        }
        int i4 = this.f12719n;
        int i5 = f12705q;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            f12705q = i6;
            this.f12718m = (au1[]) Arrays.copyOf(this.f12718m, i6);
        }
        au1[] au1VarArr = this.f12718m;
        int i7 = this.f12719n;
        this.f12719n = i7 + 1;
        au1VarArr[i7] = au1Var;
        return au1Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m6957b(au1 au1Var, au1 au1Var2, int i, float f, au1 au1Var3, au1 au1Var4, int i2, int i3) {
        C0670ga c0670gaM6967l = m6967l();
        if (au1Var2 == au1Var3) {
            c0670gaM6967l.f4115d.m134g(au1Var, 1.0f);
            c0670gaM6967l.f4115d.m134g(au1Var4, 1.0f);
            c0670gaM6967l.f4115d.m134g(au1Var2, -2.0f);
        } else {
            C0011aa c0011aa = c0670gaM6967l.f4115d;
            if (f == 0.5f) {
                c0011aa.m134g(au1Var, 1.0f);
                c0670gaM6967l.f4115d.m134g(au1Var2, -1.0f);
                c0670gaM6967l.f4115d.m134g(au1Var3, -1.0f);
                c0670gaM6967l.f4115d.m134g(au1Var4, 1.0f);
                if (i > 0 || i2 > 0) {
                    c0670gaM6967l.f4113b = (-i) + i2;
                }
            } else if (f <= TouchPipeline.SIZE) {
                c0011aa.m134g(au1Var, -1.0f);
                c0670gaM6967l.f4115d.m134g(au1Var2, 1.0f);
                c0670gaM6967l.f4113b = i;
            } else if (f >= 1.0f) {
                c0011aa.m134g(au1Var4, -1.0f);
                c0670gaM6967l.f4115d.m134g(au1Var3, 1.0f);
                c0670gaM6967l.f4113b = -i2;
            } else {
                float f2 = 1.0f - f;
                c0011aa.m134g(au1Var, f2 * 1.0f);
                c0670gaM6967l.f4115d.m134g(au1Var2, f2 * (-1.0f));
                c0670gaM6967l.f4115d.m134g(au1Var3, (-1.0f) * f);
                c0670gaM6967l.f4115d.m134g(au1Var4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    c0670gaM6967l.f4113b = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            c0670gaM6967l.m2945a(this, i3);
        }
        m6958c(c0670gaM6967l);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f5  */
    /* JADX INFO: renamed from: c */
    public final void m6958c(C0670ga c0670ga) {
        boolean z;
        boolean z2;
        au1 au1VarM2948f;
        if (this.f12715j + 1 >= this.f12716k || this.f12714i + 1 >= this.f12710e) {
            m6969o();
        }
        if (c0670ga.f4116e) {
            z = false;
        } else {
            ArrayList arrayList = c0670ga.f4114c;
            if (this.f12711f.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int iM131d = c0670ga.f4115d.m131d();
                    for (int i = 0; i < iM131d; i++) {
                        au1 au1VarM132e = c0670ga.f4115d.m132e(i);
                        if (au1VarM132e.f1057c != -1 || au1VarM132e.f1060f) {
                            arrayList.add(au1VarM132e);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            au1 au1Var = (au1) arrayList.get(i2);
                            if (au1Var.f1060f) {
                                c0670ga.m2950h(this, au1Var, true);
                            } else {
                                c0670ga.mo2354i(this, this.f12711f[au1Var.f1057c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (c0670ga.f4112a != null && c0670ga.f4115d.m131d() == 0) {
                    c0670ga.f4116e = true;
                    this.f12706a = true;
                }
            }
            if (c0670ga.mo2353e()) {
                return;
            }
            float f = c0670ga.f4113b;
            float f2 = TouchPipeline.SIZE;
            if (f < TouchPipeline.SIZE) {
                c0670ga.f4113b = f * (-1.0f);
                C0011aa c0011aa = c0670ga.f4115d;
                int i3 = c0011aa.f103h;
                for (int i4 = 0; i3 != -1 && i4 < c0011aa.f96a; i4++) {
                    float[] fArr = c0011aa.f102g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = c0011aa.f101f[i3];
                }
            }
            int iM131d2 = c0670ga.f4115d.m131d();
            float f3 = 0.0f;
            float f4 = 0.0f;
            au1 au1Var2 = null;
            au1 au1Var3 = null;
            int i5 = 0;
            boolean z4 = false;
            boolean z5 = false;
            while (i5 < iM131d2) {
                float fM133f = c0670ga.f4115d.m133f(i5);
                au1 au1VarM132e2 = c0670ga.f4115d.m132e(i5);
                float f5 = f2;
                if (au1VarM132e2.f1066q == 1) {
                    if (au1Var2 == null) {
                        if (au1VarM132e2.f1065p <= 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        au1Var2 = au1VarM132e2;
                        f3 = fM133f;
                    } else {
                        if (f3 > fM133f) {
                            if (au1VarM132e2.f1065p > 1) {
                                z4 = false;
                            }
                            au1Var2 = au1VarM132e2;
                            f3 = fM133f;
                        } else if (z4 || au1VarM132e2.f1065p > 1) {
                        }
                        z4 = true;
                        au1Var2 = au1VarM132e2;
                        f3 = fM133f;
                    }
                } else if (au1Var2 == null && fM133f < f5) {
                    if (au1Var3 == null) {
                        if (au1VarM132e2.f1065p <= 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        au1Var3 = au1VarM132e2;
                        f4 = fM133f;
                    } else {
                        if (f4 > fM133f) {
                            if (au1VarM132e2.f1065p > 1) {
                                z5 = false;
                            }
                            au1Var3 = au1VarM132e2;
                            f4 = fM133f;
                        } else if (z5 || au1VarM132e2.f1065p > 1) {
                        }
                        z5 = true;
                        au1Var3 = au1VarM132e2;
                        f4 = fM133f;
                    }
                }
                i5++;
                f2 = f5;
            }
            float f6 = f2;
            if (au1Var2 == null) {
                au1Var2 = au1Var3;
            }
            if (au1Var2 == null) {
                z2 = true;
            } else {
                c0670ga.m2949g(au1Var2);
                z2 = false;
            }
            if (c0670ga.f4115d.m131d() == 0) {
                c0670ga.f4116e = true;
            }
            if (z2) {
                if (this.f12714i + 1 >= this.f12710e) {
                    m6969o();
                }
                au1 au1VarM6956a = m6956a(3);
                int i6 = this.f12707b + 1;
                this.f12707b = i6;
                this.f12714i++;
                au1VarM6956a.f1056b = i6;
                C1174o9 c1174o9 = this.f12717l;
                ((au1[]) c1174o9.f7701d)[i6] = au1VarM6956a;
                c0670ga.f4112a = au1VarM6956a;
                int i7 = this.f12715j;
                m6963h(c0670ga);
                if (this.f12715j == i7 + 1) {
                    C0670ga c0670ga2 = this.f12720o;
                    c0670ga2.f4112a = null;
                    c0670ga2.f4115d.m129b();
                    for (int i8 = 0; i8 < c0670ga.f4115d.m131d(); i8++) {
                        c0670ga2.f4115d.m128a(c0670ga.f4115d.m132e(i8), c0670ga.f4115d.m133f(i8), true);
                    }
                    m6972r(this.f12720o);
                    if (au1VarM6956a.f1057c == -1) {
                        if (c0670ga.f4112a == au1VarM6956a && (au1VarM2948f = c0670ga.m2948f(null, au1VarM6956a)) != null) {
                            c0670ga.m2949g(au1VarM2948f);
                        }
                        if (!c0670ga.f4116e) {
                            c0670ga.f4112a.m720e(this, c0670ga);
                        }
                        ((kf1) c1174o9.f7699b).m3823b(c0670ga);
                        this.f12715j--;
                    }
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            au1 au1Var4 = c0670ga.f4112a;
            if (au1Var4 == null) {
                return;
            }
            if (au1Var4.f1066q != 1 && c0670ga.f4113b < f6) {
                return;
            }
        }
        if (z) {
            return;
        }
        m6963h(c0670ga);
    }

    /* JADX INFO: renamed from: d */
    public final void m6959d(au1 au1Var, int i) {
        int i2 = au1Var.f1057c;
        if (i2 == -1) {
            au1Var.m719d(this, i);
            for (int i3 = 0; i3 < this.f12707b + 1; i3++) {
                au1 au1Var2 = ((au1[]) this.f12717l.f7701d)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C0670ga c0670gaM6967l = m6967l();
            c0670gaM6967l.f4112a = au1Var;
            float f = i;
            au1Var.f1059e = f;
            c0670gaM6967l.f4113b = f;
            c0670gaM6967l.f4116e = true;
            m6958c(c0670gaM6967l);
            return;
        }
        C0670ga c0670ga = this.f12711f[i2];
        if (c0670ga.f4116e) {
            c0670ga.f4113b = i;
            return;
        }
        if (c0670ga.f4115d.m131d() == 0) {
            c0670ga.f4116e = true;
            c0670ga.f4113b = i;
            return;
        }
        C0670ga c0670gaM6967l2 = m6967l();
        if (i < 0) {
            c0670gaM6967l2.f4113b = i * (-1);
            c0670gaM6967l2.f4115d.m134g(au1Var, 1.0f);
        } else {
            c0670gaM6967l2.f4113b = i;
            c0670gaM6967l2.f4115d.m134g(au1Var, -1.0f);
        }
        m6958c(c0670gaM6967l2);
    }

    /* JADX INFO: renamed from: e */
    public final void m6960e(au1 au1Var, au1 au1Var2, int i, int i2) {
        if (i2 == 8 && au1Var2.f1060f && au1Var.f1057c == -1) {
            au1Var.m719d(this, au1Var2.f1059e + i);
            return;
        }
        C0670ga c0670gaM6967l = m6967l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            c0670gaM6967l.f4113b = i;
        }
        C0011aa c0011aa = c0670gaM6967l.f4115d;
        if (z) {
            c0011aa.m134g(au1Var, 1.0f);
            c0670gaM6967l.f4115d.m134g(au1Var2, -1.0f);
        } else {
            c0011aa.m134g(au1Var, -1.0f);
            c0670gaM6967l.f4115d.m134g(au1Var2, 1.0f);
        }
        if (i2 != 8) {
            c0670gaM6967l.m2945a(this, i2);
        }
        m6958c(c0670gaM6967l);
    }

    /* JADX INFO: renamed from: f */
    public final void m6961f(au1 au1Var, au1 au1Var2, int i, int i2) {
        C0670ga c0670gaM6967l = m6967l();
        au1 au1VarM6968m = m6968m();
        au1VarM6968m.f1058d = 0;
        c0670gaM6967l.m2946b(au1Var, au1Var2, au1VarM6968m, i);
        if (i2 != 8) {
            c0670gaM6967l.f4115d.m134g(m6965j(i2), (int) (c0670gaM6967l.f4115d.m130c(au1VarM6968m) * (-1.0f)));
        }
        m6958c(c0670gaM6967l);
    }

    /* JADX INFO: renamed from: g */
    public final void m6962g(au1 au1Var, au1 au1Var2, int i, int i2) {
        C0670ga c0670gaM6967l = m6967l();
        au1 au1VarM6968m = m6968m();
        au1VarM6968m.f1058d = 0;
        c0670gaM6967l.m2947c(au1Var, au1Var2, au1VarM6968m, i);
        if (i2 != 8) {
            c0670gaM6967l.f4115d.m134g(m6965j(i2), (int) (c0670gaM6967l.f4115d.m130c(au1VarM6968m) * (-1.0f)));
        }
        m6958c(c0670gaM6967l);
    }

    /* JADX INFO: renamed from: h */
    public final void m6963h(C0670ga c0670ga) {
        int i;
        if (c0670ga.f4116e) {
            c0670ga.f4112a.m719d(this, c0670ga.f4113b);
        } else {
            C0670ga[] c0670gaArr = this.f12711f;
            int i2 = this.f12715j;
            c0670gaArr[i2] = c0670ga;
            au1 au1Var = c0670ga.f4112a;
            au1Var.f1057c = i2;
            this.f12715j = i2 + 1;
            au1Var.m720e(this, c0670ga);
        }
        if (this.f12706a) {
            int i3 = 0;
            while (i3 < this.f12715j) {
                if (this.f12711f[i3] == null) {
                    System.out.println("WTF");
                }
                C0670ga c0670ga2 = this.f12711f[i3];
                if (c0670ga2 != null && c0670ga2.f4116e) {
                    c0670ga2.f4112a.m719d(this, c0670ga2.f4113b);
                    ((kf1) this.f12717l.f7699b).m3823b(c0670ga2);
                    this.f12711f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f12715j;
                        if (i4 >= i) {
                            break;
                        }
                        C0670ga[] c0670gaArr2 = this.f12711f;
                        int i6 = i4 - 1;
                        C0670ga c0670ga3 = c0670gaArr2[i4];
                        c0670gaArr2[i6] = c0670ga3;
                        au1 au1Var2 = c0670ga3.f4112a;
                        if (au1Var2.f1057c == i4) {
                            au1Var2.f1057c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f12711f[i5] = null;
                    }
                    this.f12715j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f12706a = false;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m6964i() {
        for (int i = 0; i < this.f12715j; i++) {
            C0670ga c0670ga = this.f12711f[i];
            c0670ga.f4112a.f1059e = c0670ga.f4113b;
        }
    }

    /* JADX INFO: renamed from: j */
    public final au1 m6965j(int i) {
        if (this.f12714i + 1 >= this.f12710e) {
            m6969o();
        }
        au1 au1VarM6956a = m6956a(4);
        float[] fArr = au1VarM6956a.f1062m;
        int i2 = this.f12707b + 1;
        this.f12707b = i2;
        this.f12714i++;
        au1VarM6956a.f1056b = i2;
        au1VarM6956a.f1058d = i;
        ((au1[]) this.f12717l.f7701d)[i2] = au1VarM6956a;
        dg1 dg1Var = this.f12708c;
        dg1Var.f2929i.f9548b = au1VarM6956a;
        Arrays.fill(fArr, TouchPipeline.SIZE);
        fArr[au1VarM6956a.f1058d] = 1.0f;
        dg1Var.m2355j(au1VarM6956a);
        return au1VarM6956a;
    }

    /* JADX INFO: renamed from: k */
    public final au1 m6966k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f12714i + 1 >= this.f12710e) {
            m6969o();
        }
        if (!(obj instanceof C1082ls)) {
            return null;
        }
        C1082ls c1082ls = (C1082ls) obj;
        au1 au1Var = c1082ls.f6506i;
        if (au1Var == null) {
            c1082ls.m4283k();
            au1Var = c1082ls.f6506i;
        }
        int i = au1Var.f1056b;
        C1174o9 c1174o9 = this.f12717l;
        if (i != -1 && i <= this.f12707b && ((au1[]) c1174o9.f7701d)[i] != null) {
            return au1Var;
        }
        if (i != -1) {
            au1Var.m718c();
        }
        int i2 = this.f12707b + 1;
        this.f12707b = i2;
        this.f12714i++;
        au1Var.f1056b = i2;
        au1Var.f1066q = 1;
        ((au1[]) c1174o9.f7701d)[i2] = au1Var;
        return au1Var;
    }

    /* JADX INFO: renamed from: l */
    public final C0670ga m6967l() {
        Object obj;
        C1174o9 c1174o9 = this.f12717l;
        kf1 kf1Var = (kf1) c1174o9.f7699b;
        int i = kf1Var.f5790b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = kf1Var.f5789a;
            obj = objArr[i2];
            objArr[i2] = null;
            kf1Var.f5790b = i2;
        } else {
            obj = null;
        }
        C0670ga c0670ga = (C0670ga) obj;
        if (c0670ga == null) {
            return new C0670ga(c1174o9);
        }
        c0670ga.f4112a = null;
        c0670ga.f4115d.m129b();
        c0670ga.f4113b = TouchPipeline.SIZE;
        c0670ga.f4116e = false;
        return c0670ga;
    }

    /* JADX INFO: renamed from: m */
    public final au1 m6968m() {
        if (this.f12714i + 1 >= this.f12710e) {
            m6969o();
        }
        au1 au1VarM6956a = m6956a(3);
        int i = this.f12707b + 1;
        this.f12707b = i;
        this.f12714i++;
        au1VarM6956a.f1056b = i;
        ((au1[]) this.f12717l.f7701d)[i] = au1VarM6956a;
        return au1VarM6956a;
    }

    /* JADX INFO: renamed from: o */
    public final void m6969o() {
        int i = this.f12709d * 2;
        this.f12709d = i;
        this.f12711f = (C0670ga[]) Arrays.copyOf(this.f12711f, i);
        C1174o9 c1174o9 = this.f12717l;
        c1174o9.f7701d = (au1[]) Arrays.copyOf((au1[]) c1174o9.f7701d, this.f12709d);
        int i2 = this.f12709d;
        this.f12713h = new boolean[i2];
        this.f12710e = i2;
        this.f12716k = i2;
    }

    /* JADX INFO: renamed from: p */
    public final void m6970p() {
        dg1 dg1Var = this.f12708c;
        if (dg1Var.mo2353e()) {
            m6964i();
            return;
        }
        if (!this.f12712g) {
            m6971q(dg1Var);
            return;
        }
        for (int i = 0; i < this.f12715j; i++) {
            if (!this.f12711f[i].f4116e) {
                m6971q(dg1Var);
                return;
            }
        }
        m6964i();
    }

    /* JADX INFO: renamed from: q */
    public final void m6971q(dg1 dg1Var) {
        for (int i = 0; i < this.f12715j; i++) {
            C0670ga c0670ga = this.f12711f[i];
            int i2 = 1;
            if (c0670ga.f4112a.f1066q != 1) {
                float f = c0670ga.f4113b;
                float f2 = TouchPipeline.SIZE;
                if (f < TouchPipeline.SIZE) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f3 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.f12715j) {
                            C0670ga c0670ga2 = this.f12711f[i6];
                            if (c0670ga2.f4112a.f1066q != i2 && !c0670ga2.f4116e && c0670ga2.f4113b < f2) {
                                int iM131d = c0670ga2.f4115d.m131d();
                                int i8 = 0;
                                while (i8 < iM131d) {
                                    au1 au1VarM132e = c0670ga2.f4115d.m132e(i8);
                                    float fM130c = c0670ga2.f4115d.m130c(au1VarM132e);
                                    if (fM130c > f2) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f4 = au1VarM132e.f1061g[i9] / fM130c;
                                            if ((f4 < f3 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = au1VarM132e.f1056b;
                                                i4 = i6;
                                                f3 = f4;
                                            }
                                        }
                                    }
                                    i8++;
                                    f2 = TouchPipeline.SIZE;
                                }
                            }
                            i6++;
                            f2 = TouchPipeline.SIZE;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            C0670ga c0670ga3 = this.f12711f[i4];
                            c0670ga3.f4112a.f1057c = -1;
                            c0670ga3.m2949g(((au1[]) this.f12717l.f7701d)[i5]);
                            au1 au1Var = c0670ga3.f4112a;
                            au1Var.f1057c = i4;
                            au1Var.m720e(this, c0670ga3);
                        } else {
                            z = true;
                        }
                        if (i3 > this.f12714i / 2) {
                            z = true;
                        }
                        f2 = TouchPipeline.SIZE;
                        i2 = 1;
                    }
                    break;
                }
            }
        }
        m6972r(dg1Var);
        m6964i();
    }

    /* JADX INFO: renamed from: r */
    public final void m6972r(C0670ga c0670ga) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.f12714i; i2++) {
            this.f12713h[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 >= this.f12714i * 2) {
                return;
            }
            au1 au1Var = c0670ga.f4112a;
            if (au1Var != null) {
                this.f12713h[au1Var.f1056b] = true;
            }
            au1 au1VarMo2352d = c0670ga.mo2352d(this.f12713h);
            if (au1VarMo2352d != null) {
                boolean[] zArr = this.f12713h;
                int i4 = au1VarMo2352d.f1056b;
                if (zArr[i4]) {
                    return;
                } else {
                    zArr[i4] = true;
                }
            }
            if (au1VarMo2352d != null) {
                float f = Float.MAX_VALUE;
                int i5 = i;
                int i6 = -1;
                while (i5 < this.f12715j) {
                    C0670ga c0670ga2 = this.f12711f[i5];
                    if (c0670ga2.f4112a.f1066q != 1 && !c0670ga2.f4116e) {
                        C0011aa c0011aa = c0670ga2.f4115d;
                        int i7 = c0011aa.f103h;
                        if (i7 == -1) {
                            z = false;
                            break;
                        }
                        int i8 = i;
                        while (true) {
                            if (i7 == -1 || i8 >= c0011aa.f96a) {
                                z = false;
                                break;
                            } else if (c0011aa.f100e[i7] == au1VarMo2352d.f1056b) {
                                z = true;
                                break;
                            } else {
                                i7 = c0011aa.f101f[i7];
                                i8++;
                            }
                        }
                        if (z) {
                            float fM130c = c0670ga2.f4115d.m130c(au1VarMo2352d);
                            if (fM130c < TouchPipeline.SIZE) {
                                float f2 = (-c0670ga2.f4113b) / fM130c;
                                if (f2 < f) {
                                    i6 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                    i5++;
                    i = 0;
                }
                if (i6 > -1) {
                    C0670ga c0670ga3 = this.f12711f[i6];
                    c0670ga3.f4112a.f1057c = -1;
                    c0670ga3.m2949g(au1VarMo2352d);
                    au1 au1Var2 = c0670ga3.f4112a;
                    au1Var2.f1057c = i6;
                    au1Var2.m720e(this, c0670ga3);
                }
            } else {
                z2 = true;
            }
            i = 0;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m6973s() {
        for (int i = 0; i < this.f12715j; i++) {
            C0670ga c0670ga = this.f12711f[i];
            if (c0670ga != null) {
                ((kf1) this.f12717l.f7699b).m3823b(c0670ga);
            }
            this.f12711f[i] = null;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m6974t() {
        C1174o9 c1174o9;
        int i = 0;
        while (true) {
            c1174o9 = this.f12717l;
            au1[] au1VarArr = (au1[]) c1174o9.f7701d;
            if (i >= au1VarArr.length) {
                break;
            }
            au1 au1Var = au1VarArr[i];
            if (au1Var != null) {
                au1Var.m718c();
            }
            i++;
        }
        kf1 kf1Var = (kf1) c1174o9.f7700c;
        au1[] au1VarArr2 = this.f12718m;
        int length = this.f12719n;
        kf1Var.getClass();
        if (length > au1VarArr2.length) {
            length = au1VarArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            au1 au1Var2 = au1VarArr2[i2];
            int i3 = kf1Var.f5790b;
            Object[] objArr = kf1Var.f5789a;
            if (i3 < objArr.length) {
                objArr[i3] = au1Var2;
                kf1Var.f5790b = i3 + 1;
            }
        }
        this.f12719n = 0;
        Arrays.fill((au1[]) c1174o9.f7701d, (Object) null);
        this.f12707b = 0;
        dg1 dg1Var = this.f12708c;
        dg1Var.f2928h = 0;
        dg1Var.f4113b = TouchPipeline.SIZE;
        this.f12714i = 1;
        for (int i4 = 0; i4 < this.f12715j; i4++) {
            C0670ga c0670ga = this.f12711f[i4];
        }
        m6973s();
        this.f12715j = 0;
        this.f12720o = new C0670ga(c1174o9);
    }
}

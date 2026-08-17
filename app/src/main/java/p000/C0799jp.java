package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: jp */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0799jp {

    /* JADX INFO: renamed from: a */
    public int f5482a;

    /* JADX INFO: renamed from: b */
    public int f5483b;

    /* JADX INFO: renamed from: c */
    public int f5484c;

    /* JADX INFO: renamed from: d */
    public Object f5485d;

    public C0799jp(C1351r c1351r) {
        if (c1351r == null) {
            l41.m4051t("treeDigest == null");
            throw null;
        }
        this.f5485d = c1351r;
        r80 r80VarM4019a = l20.m4019a(c1351r);
        String strMo3527f = r80VarM4019a.mo3527f();
        int iMo3528g = strMo3527f.equals("SHAKE128") ? 32 : strMo3527f.equals("SHAKE256") ? 64 : r80VarM4019a.mo3528g();
        this.f5482a = iMo3528g;
        int i = 16;
        this.f5483b = 16;
        double d = iMo3528g * 8;
        int i2 = 0;
        int i3 = 16;
        int i4 = 0;
        while (true) {
            i3 >>= 1;
            if (i3 == 0) {
                break;
            } else {
                i4++;
            }
        }
        int iCeil = (int) Math.ceil(d / ((double) i4));
        int i5 = 15 * iCeil;
        int i6 = 0;
        while (true) {
            i5 >>= 1;
            if (i5 == 0) {
                break;
            } else {
                i6++;
            }
        }
        while (true) {
            i >>= 1;
            if (i == 0) {
                break;
            } else {
                i2++;
            }
        }
        int iFloor = ((int) Math.floor(i6 / i2)) + 1 + iCeil;
        this.f5484c = iFloor;
        String strMo3527f2 = r80VarM4019a.mo3527f();
        if (strMo3527f2 == null) {
            Map map = v82.f11585b;
            l41.m4051t("algorithmName == null");
            throw null;
        }
        if (((v82) v82.f11585b.get(v82.m6609a(iMo3528g, iFloor, strMo3527f2))) != null) {
            return;
        }
        l41.m4052u(r80VarM4019a.mo3527f(), "cannot find OID for digest algorithm: ");
        throw null;
    }

    /* JADX INFO: renamed from: A */
    public static void m3679A(int i) throws rp0 {
        if ((i & 7) != 0) {
            throw rp0.m5886g();
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m3680z(int i) throws rp0 {
        if ((i & 3) != 0) {
            throw rp0.m5886g();
        }
    }

    /* JADX INFO: renamed from: a */
    public int m3681a() {
        int i = this.f5484c;
        if (i != 0) {
            this.f5482a = i;
            this.f5484c = 0;
        } else {
            this.f5482a = ((AbstractC0762ip) this.f5485d).mo2635z();
        }
        int i2 = this.f5482a;
        if (i2 == 0 || i2 == this.f5483b) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    /* JADX INFO: renamed from: b */
    public void m3682b(Object obj, qp1 qp1Var, u80 u80Var) {
        int i = this.f5483b;
        this.f5483b = ((this.f5482a >>> 3) << 3) | 4;
        try {
            qp1Var.mo905f(obj, this, u80Var);
            if (this.f5482a != this.f5483b) {
                throw rp0.m5886g();
            }
            this.f5483b = i;
        } catch (Throwable th) {
            this.f5483b = i;
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m3683c(Object obj, qp1 qp1Var, u80 u80Var) throws rp0 {
        AbstractC0762ip abstractC0762ip = (AbstractC0762ip) this.f5485d;
        int iMo2605A = abstractC0762ip.mo2605A();
        if (abstractC0762ip.f5122a >= abstractC0762ip.f5123b) {
            throw new rp0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iMo2619i = abstractC0762ip.mo2619i(iMo2605A);
        abstractC0762ip.f5122a++;
        qp1Var.mo905f(obj, this, u80Var);
        abstractC0762ip.mo2615a(0);
        abstractC0762ip.f5122a--;
        abstractC0762ip.mo2618h(iMo2619i);
    }

    /* JADX INFO: renamed from: d */
    public void m3684d(List list) throws rp0 {
        int iMo2635z;
        int iMo2635z2;
        AbstractC0762ip abstractC0762ip = (AbstractC0762ip) this.f5485d;
        boolean z = list instanceof C0829ki;
        int i = this.f5482a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(abstractC0762ip.mo2620j()));
                    if (abstractC0762ip.mo2617e()) {
                        return;
                    } else {
                        iMo2635z = abstractC0762ip.mo2635z();
                    }
                } while (iMo2635z == this.f5482a);
                this.f5484c = iMo2635z;
                return;
            }
            if (i2 != 2) {
                throw rp0.m5883d();
            }
            int iMo2616d = abstractC0762ip.mo2616d() + abstractC0762ip.mo2605A();
            do {
                list.add(Boolean.valueOf(abstractC0762ip.mo2620j()));
            } while (abstractC0762ip.mo2616d() < iMo2616d);
            m3703w(iMo2616d);
            return;
        }
        C0829ki c0829ki = (C0829ki) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                c0829ki.m3836b(abstractC0762ip.mo2620j());
                if (abstractC0762ip.mo2617e()) {
                    return;
                } else {
                    iMo2635z2 = abstractC0762ip.mo2635z();
                }
            } while (iMo2635z2 == this.f5482a);
            this.f5484c = iMo2635z2;
            return;
        }
        if (i3 != 2) {
            throw rp0.m5883d();
        }
        int iMo2616d2 = abstractC0762ip.mo2616d() + abstractC0762ip.mo2605A();
        do {
            c0829ki.m3836b(abstractC0762ip.mo2620j());
        } while (abstractC0762ip.mo2616d() < iMo2616d2);
        m3703w(iMo2616d2);
    }

    /* JADX INFO: renamed from: e */
    public AbstractC0753ik m3685e() throws qp0 {
        m3704x(2);
        return ((AbstractC0762ip) this.f5485d).mo2621k();
    }

    /* JADX INFO: renamed from: f */
    public void m3686f(List list) throws qp0 {
        int iMo2635z;
        AbstractC0762ip abstractC0762ip = (AbstractC0762ip) this.f5485d;
        if ((this.f5482a & 7) != 2) {
            throw rp0.m5883d();
        }
        do {
            list.add(m3685e());
            if (abstractC0762ip.mo2617e()) {
                return;
            } else {
                iMo2635z = abstractC0762ip.mo2635z();
            }
        } while (iMo2635z == this.f5482a);
        this.f5484c = iMo2635z;
    }

    /* JADX INFO: renamed from: g */
    public void m3687g(List list) throws rp0 {
        int iMo2635z;
        int iMo2635z2;
        AbstractC0762ip abstractC0762ip = (AbstractC0762ip) this.f5485d;
        boolean z = list instanceof q30;
        int i = this.f5482a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(abstractC0762ip.mo2622l()));
                    if (abstractC0762ip.mo2617e()) {
                        return;
                    } else {
                        iMo2635z = abstractC0762ip.mo2635z();
                    }
                } while (iMo2635z == this.f5482a);
                this.f5484c = iMo2635z;
                return;
            }
            if (i2 != 2) {
                throw rp0.m5883d();
            }
            int iMo2605A = abstractC0762ip.mo2605A();
            m3679A(iMo2605A);
            int iMo2616d = abstractC0762ip.mo2616d() + iMo2605A;
            do {
                list.add(Double.valueOf(abstractC0762ip.mo2622l()));
            } while (abstractC0762ip.mo2616d() < iMo2616d);
            return;
        }
        q30 q30Var = (q30) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                q30Var.m5439b(abstractC0762ip.mo2622l());
                if (abstractC0762ip.mo2617e()) {
                    return;
                } else {
                    iMo2635z2 = abstractC0762ip.mo2635z();
                }
            } while (iMo2635z2 == this.f5482a);
            this.f5484c = iMo2635z2;
            return;
        }
        if (i3 != 2) {
            throw rp0.m5883d();
        }
        int iMo2605A2 = abstractC0762ip.mo2605A();
        m3679A(iMo2605A2);
        int iMo2616d2 = abstractC0762ip.mo2616d() + iMo2605A2;
        do {
            q30Var.m5439b(abstractC0762ip.mo2622l());
        } while (abstractC0762ip.mo2616d() < iMo2616d2);
    }

    /* JADX INFO: renamed from: h */
    public void m3688h(List list) throws rp0 {
        int iMo2635z;
        int iMo2635z2;
        AbstractC0762ip abstractC0762ip = (AbstractC0762ip) this.f5485d;
        boolean z = list instanceof yn0;
        int i = this.f5482a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC0762ip.mo2623m()));
                    if (abstractC0762ip.mo2617e()) {
                        return;
                    } else {
                        iMo2635z = abstractC0762ip.mo2635z();
                    }
                } while (iMo2635z == this.f5482a);
                this.f5484c = iMo2635z;
                return;
            }
            if (i2 != 2) {
                throw rp0.m5883d();
            }
            int iMo2616d = abstractC0762ip.mo2616d() + abstractC0762ip.mo2605A();
            do {
                list.add(Integer.valueOf(abstractC0762ip.mo2623m()));
            } while (abstractC0762ip.mo2616d() < iMo2616d);
            m3703w(iMo2616d);
            return;
        }
        yn0 yn0Var = (yn0) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                yn0Var.m7099b(abstractC0762ip.mo2623m());
                if (abstractC0762ip.mo2617e()) {
                    return;
                } else {
                    iMo2635z2 = abstractC0762ip.mo2635z();
                }
            } while (iMo2635z2 == this.f5482a);
            this.f5484c = iMo2635z2;
            return;
        }
        if (i3 != 2) {
            throw rp0.m5883d();
        }
        int iMo2616d2 = abstractC0762ip.mo2616d() + abstractC0762ip.mo2605A();
        do {
            yn0Var.m7099b(abstractC0762ip.mo2623m());
        } while (abstractC0762ip.mo2616d() < iMo2616d2);
        m3703w(iMo2616d2);
    }

    /* JADX INFO: renamed from: i */
    public Object m3689i(hb2 hb2Var, Class cls, u80 u80Var) throws rp0 {
        AbstractC0762ip abstractC0762ip = (AbstractC0762ip) this.f5485d;
        switch (hb2Var.ordinal()) {
            case 0:
                m3704x(1);
                return Double.valueOf(abstractC0762ip.mo2622l());
            case 1:
                m3704x(5);
                return Float.valueOf(abstractC0762ip.mo2626p());
            case 2:
                m3704x(0);
                return Long.valueOf(abstractC0762ip.mo2628r());
            case 3:
                m3704x(0);
                return Long.valueOf(abstractC0762ip.mo2606B());
            case 4:
                m3704x(0);
                return Integer.valueOf(abstractC0762ip.mo2627q());
            case 5:
                m3704x(1);
                return Long.valueOf(abstractC0762ip.mo2625o());
            case 6:
                m3704x(5);
                return Integer.valueOf(abstractC0762ip.mo2624n());
            case 7:
                m3704x(0);
                return Boolean.valueOf(abstractC0762ip.mo2620j());
            case 8:
                m3704x(2);
                return abstractC0762ip.mo2634y();
            case 9:
            default:
                f40.m2713i("unsupported field type.");
                return null;
            case 10:
                m3704x(2);
                qp1 qp1VarM4549a = nh1.f7407c.m4549a(cls);
                Object objMo909j = qp1VarM4549a.mo909j();
                m3683c(objMo909j, qp1VarM4549a, u80Var);
                qp1VarM4549a.mo901b(objMo909j);
                return objMo909j;
            case 11:
                return m3685e();
            case 12:
                m3704x(0);
                return Integer.valueOf(abstractC0762ip.mo2605A());
            case 13:
                m3704x(0);
                return Integer.valueOf(abstractC0762ip.mo2623m());
            case 14:
                m3704x(5);
                return Integer.valueOf(abstractC0762ip.mo2629t());
            case 15:
                m3704x(1);
                return Long.valueOf(abstractC0762ip.mo2630u());
            case 16:
                m3704x(0);
                return Integer.valueOf(abstractC0762ip.mo2631v());
            case 17:
                m3704x(0);
                return Long.valueOf(abstractC0762ip.mo2632w());
        }
    }

    /* JADX INFO: renamed from: j */
    public void m3690j(List list) throws rp0 {
        int iMo2635z;
        int iMo2635z2;
        AbstractC0762ip abstractC0762ip = (AbstractC0762ip) this.f5485d;
        boolean z = list instanceof yn0;
        int i = this.f5482a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo2605A = abstractC0762ip.mo2605A();
                m3680z(iMo2605A);
                int iMo2616d = abstractC0762ip.mo2616d() + iMo2605A;
                do {
                    list.add(Integer.valueOf(abstractC0762ip.mo2624n()));
                } while (abstractC0762ip.mo2616d() < iMo2616d);
                return;
            }
            if (i2 != 5) {
                throw rp0.m5883d();
            }
            do {
                list.add(Integer.valueOf(abstractC0762ip.mo2624n()));
                if (abstractC0762ip.mo2617e()) {
                    return;
                } else {
                    iMo2635z = abstractC0762ip.mo2635z();
                }
            } while (iMo2635z == this.f5482a);
            this.f5484c = iMo2635z;
            return;
        }
        yn0 yn0Var = (yn0) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iMo2605A2 = abstractC0762ip.mo2605A();
            m3680z(iMo2605A2);
            int iMo2616d2 = abstractC0762ip.mo2616d() + iMo2605A2;
            do {
                yn0Var.m7099b(abstractC0762ip.mo2624n());
            } while (abstractC0762ip.mo2616d() < iMo2616d2);
            return;
        }
        if (i3 != 5) {
            throw rp0.m5883d();
        }
        do {
            yn0Var.m7099b(abstractC0762ip.mo2624n());
            if (abstractC0762ip.mo2617e()) {
                return;
            } else {
                iMo2635z2 = abstractC0762ip.mo2635z();
            }
        } while (iMo2635z2 == this.f5482a);
        this.f5484c = iMo2635z2;
    }

    /* JADX INFO: renamed from: k */
    public void m3691k(List list) throws rp0 {
        int iMo2635z;
        int iMo2635z2;
        AbstractC0762ip abstractC0762ip = (AbstractC0762ip) this.f5485d;
        boolean z = list instanceof yv0;
        int i = this.f5482a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(abstractC0762ip.mo2625o()));
                    if (abstractC0762ip.mo2617e()) {
                        return;
                    } else {
                        iMo2635z = abstractC0762ip.mo2635z();
                    }
                } while (iMo2635z == this.f5482a);
                this.f5484c = iMo2635z;
                return;
            }
            if (i2 != 2) {
                throw rp0.m5883d();
            }
            int iMo2605A = abstractC0762ip.mo2605A();
            m3679A(iMo2605A);
            int iMo2616d = abstractC0762ip.mo2616d() + iMo2605A;
            do {
                list.add(Long.valueOf(abstractC0762ip.mo2625o()));
            } while (abstractC0762ip.mo2616d() < iMo2616d);
            return;
        }
        yv0 yv0Var = (yv0) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                yv0Var.m7151b(abstractC0762ip.mo2625o());
                if (abstractC0762ip.mo2617e()) {
                    return;
                } else {
                    iMo2635z2 = abstractC0762ip.mo2635z();
                }
            } while (iMo2635z2 == this.f5482a);
            this.f5484c = iMo2635z2;
            return;
        }
        if (i3 != 2) {
            throw rp0.m5883d();
        }
        int iMo2605A2 = abstractC0762ip.mo2605A();
        m3679A(iMo2605A2);
        int iMo2616d2 = abstractC0762ip.mo2616d() + iMo2605A2;
        do {
            yv0Var.m7151b(abstractC0762ip.mo2625o());
        } while (abstractC0762ip.mo2616d() < iMo2616d2);
    }

    /* JADX INFO: renamed from: l */
    public void m3692l(List list) throws rp0 {
        int iMo2635z;
        int iMo2635z2;
        AbstractC0762ip abstractC0762ip = (AbstractC0762ip) this.f5485d;
        boolean z = list instanceof fb0;
        int i = this.f5482a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo2605A = abstractC0762ip.mo2605A();
                m3680z(iMo2605A);
                int iMo2616d = abstractC0762ip.mo2616d() + iMo2605A;
                do {
                    list.add(Float.valueOf(abstractC0762ip.mo2626p()));
                } while (abstractC0762ip.mo2616d() < iMo2616d);
                return;
            }
            if (i2 != 5) {
                throw rp0.m5883d();
            }
            do {
                list.add(Float.valueOf(abstractC0762ip.mo2626p()));
                if (abstractC0762ip.mo2617e()) {
                    return;
                } else {
                    iMo2635z = abstractC0762ip.mo2635z();
                }
            } while (iMo2635z == this.f5482a);
            this.f5484c = iMo2635z;
            return;
        }
        fb0 fb0Var = (fb0) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iMo2605A2 = abstractC0762ip.mo2605A();
            m3680z(iMo2605A2);
            int iMo2616d2 = abstractC0762ip.mo2616d() + iMo2605A2;
            do {
                fb0Var.m2782b(abstractC0762ip.mo2626p());
            } while (abstractC0762ip.mo2616d() < iMo2616d2);
            return;
        }
        if (i3 != 5) {
            throw rp0.m5883d();
        }
        do {
            fb0Var.m2782b(abstractC0762ip.mo2626p());
            if (abstractC0762ip.mo2617e()) {
                return;
            } else {
                iMo2635z2 = abstractC0762ip.mo2635z();
            }
        } while (iMo2635z2 == this.f5482a);
        this.f5484c = iMo2635z2;
    }

    /* JADX INFO: renamed from: m */
    public void m3693m(List list) throws rp0 {
        int iMo2635z;
        int iMo2635z2;
        AbstractC0762ip abstractC0762ip = (AbstractC0762ip) this.f5485d;
        boolean z = list instanceof yn0;
        int i = this.f5482a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC0762ip.mo2627q()));
                    if (abstractC0762ip.mo2617e()) {
                        return;
                    } else {
                        iMo2635z = abstractC0762ip.mo2635z();
                    }
                } while (iMo2635z == this.f5482a);
                this.f5484c = iMo2635z;
                return;
            }
            if (i2 != 2) {
                throw rp0.m5883d();
            }
            int iMo2616d = abstractC0762ip.mo2616d() + abstractC0762ip.mo2605A();
            do {
                list.add(Integer.valueOf(abstractC0762ip.mo2627q()));
            } while (abstractC0762ip.mo2616d() < iMo2616d);
            m3703w(iMo2616d);
            return;
        }
        yn0 yn0Var = (yn0) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                yn0Var.m7099b(abstractC0762ip.mo2627q());
                if (abstractC0762ip.mo2617e()) {
                    return;
                } else {
                    iMo2635z2 = abstractC0762ip.mo2635z();
                }
            } while (iMo2635z2 == this.f5482a);
            this.f5484c = iMo2635z2;
            return;
        }
        if (i3 != 2) {
            throw rp0.m5883d();
        }
        int iMo2616d2 = abstractC0762ip.mo2616d() + abstractC0762ip.mo2605A();
        do {
            yn0Var.m7099b(abstractC0762ip.mo2627q());
        } while (abstractC0762ip.mo2616d() < iMo2616d2);
        m3703w(iMo2616d2);
    }

    /* JADX INFO: renamed from: n */
    public void m3694n(List list) throws rp0 {
        int iMo2635z;
        int iMo2635z2;
        AbstractC0762ip abstractC0762ip = (AbstractC0762ip) this.f5485d;
        boolean z = list instanceof yv0;
        int i = this.f5482a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(abstractC0762ip.mo2628r()));
                    if (abstractC0762ip.mo2617e()) {
                        return;
                    } else {
                        iMo2635z = abstractC0762ip.mo2635z();
                    }
                } while (iMo2635z == this.f5482a);
                this.f5484c = iMo2635z;
                return;
            }
            if (i2 != 2) {
                throw rp0.m5883d();
            }
            int iMo2616d = abstractC0762ip.mo2616d() + abstractC0762ip.mo2605A();
            do {
                list.add(Long.valueOf(abstractC0762ip.mo2628r()));
            } while (abstractC0762ip.mo2616d() < iMo2616d);
            m3703w(iMo2616d);
            return;
        }
        yv0 yv0Var = (yv0) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                yv0Var.m7151b(abstractC0762ip.mo2628r());
                if (abstractC0762ip.mo2617e()) {
                    return;
                } else {
                    iMo2635z2 = abstractC0762ip.mo2635z();
                }
            } while (iMo2635z2 == this.f5482a);
            this.f5484c = iMo2635z2;
            return;
        }
        if (i3 != 2) {
            throw rp0.m5883d();
        }
        int iMo2616d2 = abstractC0762ip.mo2616d() + abstractC0762ip.mo2605A();
        do {
            yv0Var.m7151b(abstractC0762ip.mo2628r());
        } while (abstractC0762ip.mo2616d() < iMo2616d2);
        m3703w(iMo2616d2);
    }

    /* JADX INFO: renamed from: o */
    public void m3695o(List list) throws rp0 {
        int iMo2635z;
        int iMo2635z2;
        AbstractC0762ip abstractC0762ip = (AbstractC0762ip) this.f5485d;
        boolean z = list instanceof yn0;
        int i = this.f5482a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo2605A = abstractC0762ip.mo2605A();
                m3680z(iMo2605A);
                int iMo2616d = abstractC0762ip.mo2616d() + iMo2605A;
                do {
                    list.add(Integer.valueOf(abstractC0762ip.mo2629t()));
                } while (abstractC0762ip.mo2616d() < iMo2616d);
                return;
            }
            if (i2 != 5) {
                throw rp0.m5883d();
            }
            do {
                list.add(Integer.valueOf(abstractC0762ip.mo2629t()));
                if (abstractC0762ip.mo2617e()) {
                    return;
                } else {
                    iMo2635z = abstractC0762ip.mo2635z();
                }
            } while (iMo2635z == this.f5482a);
            this.f5484c = iMo2635z;
            return;
        }
        yn0 yn0Var = (yn0) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iMo2605A2 = abstractC0762ip.mo2605A();
            m3680z(iMo2605A2);
            int iMo2616d2 = abstractC0762ip.mo2616d() + iMo2605A2;
            do {
                yn0Var.m7099b(abstractC0762ip.mo2629t());
            } while (abstractC0762ip.mo2616d() < iMo2616d2);
            return;
        }
        if (i3 != 5) {
            throw rp0.m5883d();
        }
        do {
            yn0Var.m7099b(abstractC0762ip.mo2629t());
            if (abstractC0762ip.mo2617e()) {
                return;
            } else {
                iMo2635z2 = abstractC0762ip.mo2635z();
            }
        } while (iMo2635z2 == this.f5482a);
        this.f5484c = iMo2635z2;
    }

    /* JADX INFO: renamed from: p */
    public void m3696p(List list) throws rp0 {
        int iMo2635z;
        int iMo2635z2;
        AbstractC0762ip abstractC0762ip = (AbstractC0762ip) this.f5485d;
        boolean z = list instanceof yv0;
        int i = this.f5482a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(abstractC0762ip.mo2630u()));
                    if (abstractC0762ip.mo2617e()) {
                        return;
                    } else {
                        iMo2635z = abstractC0762ip.mo2635z();
                    }
                } while (iMo2635z == this.f5482a);
                this.f5484c = iMo2635z;
                return;
            }
            if (i2 != 2) {
                throw rp0.m5883d();
            }
            int iMo2605A = abstractC0762ip.mo2605A();
            m3679A(iMo2605A);
            int iMo2616d = abstractC0762ip.mo2616d() + iMo2605A;
            do {
                list.add(Long.valueOf(abstractC0762ip.mo2630u()));
            } while (abstractC0762ip.mo2616d() < iMo2616d);
            return;
        }
        yv0 yv0Var = (yv0) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                yv0Var.m7151b(abstractC0762ip.mo2630u());
                if (abstractC0762ip.mo2617e()) {
                    return;
                } else {
                    iMo2635z2 = abstractC0762ip.mo2635z();
                }
            } while (iMo2635z2 == this.f5482a);
            this.f5484c = iMo2635z2;
            return;
        }
        if (i3 != 2) {
            throw rp0.m5883d();
        }
        int iMo2605A2 = abstractC0762ip.mo2605A();
        m3679A(iMo2605A2);
        int iMo2616d2 = abstractC0762ip.mo2616d() + iMo2605A2;
        do {
            yv0Var.m7151b(abstractC0762ip.mo2630u());
        } while (abstractC0762ip.mo2616d() < iMo2616d2);
    }

    /* JADX INFO: renamed from: q */
    public void m3697q(List list) throws rp0 {
        int iMo2635z;
        int iMo2635z2;
        AbstractC0762ip abstractC0762ip = (AbstractC0762ip) this.f5485d;
        boolean z = list instanceof yn0;
        int i = this.f5482a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC0762ip.mo2631v()));
                    if (abstractC0762ip.mo2617e()) {
                        return;
                    } else {
                        iMo2635z = abstractC0762ip.mo2635z();
                    }
                } while (iMo2635z == this.f5482a);
                this.f5484c = iMo2635z;
                return;
            }
            if (i2 != 2) {
                throw rp0.m5883d();
            }
            int iMo2616d = abstractC0762ip.mo2616d() + abstractC0762ip.mo2605A();
            do {
                list.add(Integer.valueOf(abstractC0762ip.mo2631v()));
            } while (abstractC0762ip.mo2616d() < iMo2616d);
            m3703w(iMo2616d);
            return;
        }
        yn0 yn0Var = (yn0) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                yn0Var.m7099b(abstractC0762ip.mo2631v());
                if (abstractC0762ip.mo2617e()) {
                    return;
                } else {
                    iMo2635z2 = abstractC0762ip.mo2635z();
                }
            } while (iMo2635z2 == this.f5482a);
            this.f5484c = iMo2635z2;
            return;
        }
        if (i3 != 2) {
            throw rp0.m5883d();
        }
        int iMo2616d2 = abstractC0762ip.mo2616d() + abstractC0762ip.mo2605A();
        do {
            yn0Var.m7099b(abstractC0762ip.mo2631v());
        } while (abstractC0762ip.mo2616d() < iMo2616d2);
        m3703w(iMo2616d2);
    }

    /* JADX INFO: renamed from: r */
    public void m3698r(List list) throws rp0 {
        int iMo2635z;
        int iMo2635z2;
        AbstractC0762ip abstractC0762ip = (AbstractC0762ip) this.f5485d;
        boolean z = list instanceof yv0;
        int i = this.f5482a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(abstractC0762ip.mo2632w()));
                    if (abstractC0762ip.mo2617e()) {
                        return;
                    } else {
                        iMo2635z = abstractC0762ip.mo2635z();
                    }
                } while (iMo2635z == this.f5482a);
                this.f5484c = iMo2635z;
                return;
            }
            if (i2 != 2) {
                throw rp0.m5883d();
            }
            int iMo2616d = abstractC0762ip.mo2616d() + abstractC0762ip.mo2605A();
            do {
                list.add(Long.valueOf(abstractC0762ip.mo2632w()));
            } while (abstractC0762ip.mo2616d() < iMo2616d);
            m3703w(iMo2616d);
            return;
        }
        yv0 yv0Var = (yv0) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                yv0Var.m7151b(abstractC0762ip.mo2632w());
                if (abstractC0762ip.mo2617e()) {
                    return;
                } else {
                    iMo2635z2 = abstractC0762ip.mo2635z();
                }
            } while (iMo2635z2 == this.f5482a);
            this.f5484c = iMo2635z2;
            return;
        }
        if (i3 != 2) {
            throw rp0.m5883d();
        }
        int iMo2616d2 = abstractC0762ip.mo2616d() + abstractC0762ip.mo2605A();
        do {
            yv0Var.m7151b(abstractC0762ip.mo2632w());
        } while (abstractC0762ip.mo2616d() < iMo2616d2);
        m3703w(iMo2616d2);
    }

    /* JADX INFO: renamed from: s */
    public void m3699s(List list, boolean z) throws qp0 {
        String strMo2633x;
        int iMo2635z;
        int iMo2635z2;
        AbstractC0762ip abstractC0762ip = (AbstractC0762ip) this.f5485d;
        if ((this.f5482a & 7) != 2) {
            throw rp0.m5883d();
        }
        if ((list instanceof yr0) && !z) {
            yr0 yr0Var = (yr0) list;
            do {
                yr0Var.mo2500l(m3685e());
                if (abstractC0762ip.mo2617e()) {
                    return;
                } else {
                    iMo2635z2 = abstractC0762ip.mo2635z();
                }
            } while (iMo2635z2 == this.f5482a);
            this.f5484c = iMo2635z2;
            return;
        }
        do {
            if (z) {
                m3704x(2);
                strMo2633x = abstractC0762ip.mo2634y();
            } else {
                m3704x(2);
                strMo2633x = abstractC0762ip.mo2633x();
            }
            list.add(strMo2633x);
            if (abstractC0762ip.mo2617e()) {
                return;
            } else {
                iMo2635z = abstractC0762ip.mo2635z();
            }
        } while (iMo2635z == this.f5482a);
        this.f5484c = iMo2635z;
    }

    /* JADX INFO: renamed from: t */
    public void m3700t(List list) throws rp0 {
        int iMo2635z;
        int iMo2635z2;
        AbstractC0762ip abstractC0762ip = (AbstractC0762ip) this.f5485d;
        boolean z = list instanceof yn0;
        int i = this.f5482a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC0762ip.mo2605A()));
                    if (abstractC0762ip.mo2617e()) {
                        return;
                    } else {
                        iMo2635z = abstractC0762ip.mo2635z();
                    }
                } while (iMo2635z == this.f5482a);
                this.f5484c = iMo2635z;
                return;
            }
            if (i2 != 2) {
                throw rp0.m5883d();
            }
            int iMo2616d = abstractC0762ip.mo2616d() + abstractC0762ip.mo2605A();
            do {
                list.add(Integer.valueOf(abstractC0762ip.mo2605A()));
            } while (abstractC0762ip.mo2616d() < iMo2616d);
            m3703w(iMo2616d);
            return;
        }
        yn0 yn0Var = (yn0) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                yn0Var.m7099b(abstractC0762ip.mo2605A());
                if (abstractC0762ip.mo2617e()) {
                    return;
                } else {
                    iMo2635z2 = abstractC0762ip.mo2635z();
                }
            } while (iMo2635z2 == this.f5482a);
            this.f5484c = iMo2635z2;
            return;
        }
        if (i3 != 2) {
            throw rp0.m5883d();
        }
        int iMo2616d2 = abstractC0762ip.mo2616d() + abstractC0762ip.mo2605A();
        do {
            yn0Var.m7099b(abstractC0762ip.mo2605A());
        } while (abstractC0762ip.mo2616d() < iMo2616d2);
        m3703w(iMo2616d2);
    }

    /* JADX INFO: renamed from: u */
    public void m3701u(List list) throws rp0 {
        int iMo2635z;
        int iMo2635z2;
        AbstractC0762ip abstractC0762ip = (AbstractC0762ip) this.f5485d;
        boolean z = list instanceof yv0;
        int i = this.f5482a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(abstractC0762ip.mo2606B()));
                    if (abstractC0762ip.mo2617e()) {
                        return;
                    } else {
                        iMo2635z = abstractC0762ip.mo2635z();
                    }
                } while (iMo2635z == this.f5482a);
                this.f5484c = iMo2635z;
                return;
            }
            if (i2 != 2) {
                throw rp0.m5883d();
            }
            int iMo2616d = abstractC0762ip.mo2616d() + abstractC0762ip.mo2605A();
            do {
                list.add(Long.valueOf(abstractC0762ip.mo2606B()));
            } while (abstractC0762ip.mo2616d() < iMo2616d);
            m3703w(iMo2616d);
            return;
        }
        yv0 yv0Var = (yv0) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                yv0Var.m7151b(abstractC0762ip.mo2606B());
                if (abstractC0762ip.mo2617e()) {
                    return;
                } else {
                    iMo2635z2 = abstractC0762ip.mo2635z();
                }
            } while (iMo2635z2 == this.f5482a);
            this.f5484c = iMo2635z2;
            return;
        }
        if (i3 != 2) {
            throw rp0.m5883d();
        }
        int iMo2616d2 = abstractC0762ip.mo2616d() + abstractC0762ip.mo2605A();
        do {
            yv0Var.m7151b(abstractC0762ip.mo2606B());
        } while (abstractC0762ip.mo2616d() < iMo2616d2);
        m3703w(iMo2616d2);
    }

    /* JADX INFO: renamed from: v */
    public long m3702v() {
        int i = this.f5483b;
        if (i == 0) {
            ca0.m1185q();
            return 0L;
        }
        long[] jArr = (long[]) this.f5485d;
        int i2 = this.f5482a;
        long j = jArr[i2];
        this.f5482a = this.f5484c & (i2 + 1);
        this.f5483b = i - 1;
        return j;
    }

    /* JADX INFO: renamed from: w */
    public void m3703w(int i) throws rp0 {
        if (((AbstractC0762ip) this.f5485d).mo2616d() != i) {
            throw rp0.m5887h();
        }
    }

    /* JADX INFO: renamed from: x */
    public void m3704x(int i) throws qp0 {
        if ((this.f5482a & 7) != i) {
            throw rp0.m5883d();
        }
    }

    /* JADX INFO: renamed from: y */
    public boolean m3705y() {
        int i;
        AbstractC0762ip abstractC0762ip = (AbstractC0762ip) this.f5485d;
        if (abstractC0762ip.mo2617e() || (i = this.f5482a) == this.f5483b) {
            return false;
        }
        return abstractC0762ip.mo2607C(i);
    }

    public C0799jp(AbstractC0762ip abstractC0762ip) {
        this.f5484c = 0;
        no0.m4572a(abstractC0762ip, "input");
        this.f5485d = abstractC0762ip;
        abstractC0762ip.f5124c = this;
    }
}

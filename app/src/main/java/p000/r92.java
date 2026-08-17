package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r92 implements y10 {

    /* JADX INFO: renamed from: a */
    public int f9845a;

    /* JADX INFO: renamed from: b */
    public C1639ys f9846b;

    /* JADX INFO: renamed from: c */
    public jn1 f9847c;

    /* JADX INFO: renamed from: d */
    public int f9848d;

    /* JADX INFO: renamed from: e */
    public final q20 f9849e = new q20(this);

    /* JADX INFO: renamed from: f */
    public int f9850f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f9851g = false;

    /* JADX INFO: renamed from: h */
    public final a20 f9852h = new a20(this);

    /* JADX INFO: renamed from: i */
    public final a20 f9853i = new a20(this);

    /* JADX INFO: renamed from: j */
    public int f9854j = 1;

    public r92(C1639ys c1639ys) {
        this.f9846b = c1639ys;
    }

    /* JADX INFO: renamed from: b */
    public static void m5747b(a20 a20Var, a20 a20Var2, int i) {
        a20Var.f38l.add(a20Var2);
        a20Var.f32f = i;
        a20Var2.f37k.add(a20Var);
    }

    /* JADX INFO: renamed from: h */
    public static a20 m5748h(C1082ls c1082ls) {
        C1082ls c1082ls2 = c1082ls.f6503f;
        if (c1082ls2 == null) {
            return null;
        }
        C1639ys c1639ys = c1082ls2.f6501d;
        int iM5359z = AbstractC1308pu.m5359z(c1082ls2.f6502e);
        if (iM5359z == 1) {
            return c1639ys.f13090d.f9852h;
        }
        if (iM5359z == 2) {
            return c1639ys.f13092e.f9852h;
        }
        if (iM5359z == 3) {
            return c1639ys.f13090d.f9853i;
        }
        if (iM5359z == 4) {
            return c1639ys.f13092e.f9853i;
        }
        if (iM5359z != 5) {
            return null;
        }
        return c1639ys.f13092e.f11131k;
    }

    /* JADX INFO: renamed from: i */
    public static a20 m5749i(C1082ls c1082ls, int i) {
        C1082ls c1082ls2 = c1082ls.f6503f;
        if (c1082ls2 == null) {
            return null;
        }
        C1639ys c1639ys = c1082ls2.f6501d;
        r92 r92Var = i == 0 ? c1639ys.f13090d : c1639ys.f13092e;
        int iM5359z = AbstractC1308pu.m5359z(c1082ls2.f6502e);
        if (iM5359z == 1 || iM5359z == 2) {
            return r92Var.f9852h;
        }
        if (iM5359z == 3 || iM5359z == 4) {
            return r92Var.f9853i;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m5750c(a20 a20Var, a20 a20Var2, int i, q20 q20Var) {
        a20Var.f38l.add(a20Var2);
        a20Var.f38l.add(this.f9849e);
        a20Var.f34h = i;
        a20Var.f35i = q20Var;
        a20Var2.f37k.add(a20Var);
        q20Var.f37k.add(a20Var);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo3001d();

    /* JADX INFO: renamed from: e */
    public abstract void mo3002e();

    /* JADX INFO: renamed from: f */
    public abstract void mo3003f();

    /* JADX INFO: renamed from: g */
    public final int m5751g(int i, int i2) {
        C1639ys c1639ys = this.f9846b;
        if (i2 == 0) {
            int i3 = c1639ys.f13121v;
            int iMax = Math.max(c1639ys.f13120u, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            int i4 = c1639ys.f13124y;
            int iMax2 = Math.max(c1639ys.f13123x, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: j */
    public long mo3666j() {
        q20 q20Var = this.f9849e;
        if (q20Var.f36j) {
            return q20Var.f33g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo3004k();

    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX INFO: renamed from: l */
    public final void m5752l(C1082ls c1082ls, C1082ls c1082ls2, int i) {
        q20 q20Var;
        float f;
        int i2;
        int i3;
        a20 a20VarM5748h = m5748h(c1082ls);
        a20 a20VarM5748h2 = m5748h(c1082ls2);
        if (a20VarM5748h.f36j && a20VarM5748h2.f36j) {
            int iM4277e = c1082ls.m4277e() + a20VarM5748h.f33g;
            int iM4277e2 = a20VarM5748h2.f33g - c1082ls2.m4277e();
            int i4 = iM4277e2 - iM4277e;
            q20 q20Var2 = this.f9849e;
            if (!q20Var2.f36j && this.f9848d == 3) {
                int i5 = this.f9845a;
                if (i5 == 0) {
                    q20Var2.mo53d(m5751g(i4, i));
                } else if (i5 == 1) {
                    q20Var2.mo53d(Math.min(m5751g(q20Var2.f9308m, i), i4));
                } else if (i5 == 2) {
                    C1639ys c1639ys = this.f9846b;
                    C1639ys c1639ys2 = c1639ys.f13077T;
                    if (c1639ys2 != null) {
                        q20 q20Var3 = (i == 0 ? c1639ys2.f13090d : c1639ys2.f13092e).f9849e;
                        if (q20Var3.f36j) {
                            q20Var2.mo53d(m5751g((int) ((q20Var3.f33g * (i == 0 ? c1639ys.f13122w : c1639ys.f13125z)) + 0.5f), i));
                        }
                    }
                } else if (i5 == 3) {
                    C1639ys c1639ys3 = this.f9846b;
                    r92 r92Var = c1639ys3.f13090d;
                    if (r92Var.f9848d == 3 && r92Var.f9845a == 3) {
                        u52 u52Var = c1639ys3.f13092e;
                        if (u52Var.f9848d != 3 || u52Var.f9845a != 3) {
                            if (i == 0) {
                                r92Var = c1639ys3.f13092e;
                            }
                            q20Var = r92Var.f9849e;
                            if (q20Var.f36j) {
                                f = c1639ys3.f13080W;
                                i2 = q20Var.f33g;
                                if (i == 1) {
                                    i3 = (int) ((i2 / f) + 0.5f);
                                } else {
                                    i3 = (int) ((f * i2) + 0.5f);
                                }
                                q20Var2.mo53d(i3);
                            }
                        }
                    } else {
                        if (i == 0) {
                            r92Var = c1639ys3.f13092e;
                        }
                        q20Var = r92Var.f9849e;
                        if (q20Var.f36j) {
                            f = c1639ys3.f13080W;
                            i2 = q20Var.f33g;
                            if (i == 1) {
                                i3 = (int) ((i2 / f) + 0.5f);
                            } else {
                                i3 = (int) ((f * i2) + 0.5f);
                            }
                            q20Var2.mo53d(i3);
                        }
                    }
                }
            }
            if (q20Var2.f36j) {
                int i6 = q20Var2.f33g;
                a20 a20Var = this.f9853i;
                a20 a20Var2 = this.f9852h;
                if (i6 == i4) {
                    a20Var2.mo53d(iM4277e);
                    a20Var.mo53d(iM4277e2);
                    return;
                }
                C1639ys c1639ys4 = this.f9846b;
                float f2 = i == 0 ? c1639ys4.f13091d0 : c1639ys4.f13093e0;
                if (a20VarM5748h == a20VarM5748h2) {
                    iM4277e = a20VarM5748h.f33g;
                    iM4277e2 = a20VarM5748h2.f33g;
                    f2 = 0.5f;
                }
                a20Var2.mo53d((int) ((((iM4277e2 - iM4277e) - i6) * f2) + iM4277e + 0.5f));
                a20Var.mo53d(a20Var2.f33g + q20Var2.f33g);
            }
        }
    }
}

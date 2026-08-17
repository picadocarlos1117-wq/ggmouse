package p000;

import com.example.ssmousepro.injection.TouchPipeline;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class u52 extends r92 {

    /* JADX INFO: renamed from: k */
    public a20 f11131k;

    /* JADX INFO: renamed from: l */
    public C1295ph f11132l;

    @Override // p000.y10
    /* JADX INFO: renamed from: a */
    public final void mo50a(y10 y10Var) {
        float f;
        float f2;
        float f3;
        int i;
        if (AbstractC1308pu.m5359z(this.f9854j) == 3) {
            C1639ys c1639ys = this.f9846b;
            m5752l(c1639ys.f13067J, c1639ys.f13069L, 1);
            return;
        }
        q20 q20Var = this.f9849e;
        if (q20Var.f29c && !q20Var.f36j && this.f9848d == 3) {
            C1639ys c1639ys2 = this.f9846b;
            int i2 = c1639ys2.f13118s;
            if (i2 == 2) {
                C1639ys c1639ys3 = c1639ys2.f13077T;
                if (c1639ys3 != null) {
                    q20 q20Var2 = c1639ys3.f13092e.f9849e;
                    if (q20Var2.f36j) {
                        q20Var.mo53d((int) ((q20Var2.f33g * c1639ys2.f13125z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                q20 q20Var3 = c1639ys2.f13090d.f9849e;
                if (q20Var3.f36j) {
                    int i3 = c1639ys2.f13081X;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f3 = q20Var3.f33g * c1639ys2.f13080W;
                            i = (int) (f3 + 0.5f);
                        } else if (i3 != 1) {
                            i = 0;
                        } else {
                            f = q20Var3.f33g;
                            f2 = c1639ys2.f13080W;
                        }
                        q20Var.mo53d(i);
                    } else {
                        f = q20Var3.f33g;
                        f2 = c1639ys2.f13080W;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    q20Var.mo53d(i);
                }
            }
        }
        a20 a20Var = this.f9852h;
        boolean z = a20Var.f29c;
        ArrayList arrayList = a20Var.f38l;
        if (z) {
            a20 a20Var2 = this.f9853i;
            boolean z2 = a20Var2.f29c;
            ArrayList arrayList2 = a20Var2.f38l;
            if (z2) {
                if (a20Var.f36j && a20Var2.f36j && q20Var.f36j) {
                    return;
                }
                if (!q20Var.f36j && this.f9848d == 3) {
                    C1639ys c1639ys4 = this.f9846b;
                    if (c1639ys4.f13117r == 0 && !c1639ys4.m7143y()) {
                        a20 a20Var3 = (a20) arrayList.get(0);
                        a20 a20Var4 = (a20) arrayList2.get(0);
                        int i4 = a20Var3.f33g + a20Var.f32f;
                        int i5 = a20Var4.f33g + a20Var2.f32f;
                        a20Var.mo53d(i4);
                        a20Var2.mo53d(i5);
                        q20Var.mo53d(i5 - i4);
                        return;
                    }
                }
                if (!q20Var.f36j && this.f9848d == 3 && this.f9845a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    a20 a20Var5 = (a20) arrayList.get(0);
                    int i6 = (((a20) arrayList2.get(0)).f33g + a20Var2.f32f) - (a20Var5.f33g + a20Var.f32f);
                    int i7 = q20Var.f9308m;
                    if (i6 < i7) {
                        q20Var.mo53d(i6);
                    } else {
                        q20Var.mo53d(i7);
                    }
                }
                if (q20Var.f36j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    a20 a20Var6 = (a20) arrayList.get(0);
                    a20 a20Var7 = (a20) arrayList2.get(0);
                    int i8 = a20Var6.f33g;
                    int i9 = a20Var.f32f + i8;
                    int i10 = a20Var7.f33g;
                    int i11 = a20Var2.f32f + i10;
                    float f4 = this.f9846b.f13093e0;
                    if (a20Var6 == a20Var7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    a20Var.mo53d((int) ((((i10 - i8) - q20Var.f33g) * f4) + i8 + 0.5f));
                    a20Var2.mo53d(a20Var.f33g + q20Var.f33g);
                }
            }
        }
    }

    @Override // p000.r92
    /* JADX INFO: renamed from: d */
    public final void mo3001d() {
        C1639ys c1639ys;
        C1639ys c1639ys2;
        C1639ys c1639ys3;
        C1639ys c1639ys4;
        a20 a20Var = this.f11131k;
        C1639ys c1639ys5 = this.f9846b;
        boolean z = c1639ys5.f13084a;
        q20 q20Var = this.f9849e;
        if (z) {
            q20Var.mo53d(c1639ys5.m7131k());
        }
        boolean z2 = q20Var.f36j;
        ArrayList arrayList = q20Var.f37k;
        ArrayList arrayList2 = q20Var.f38l;
        a20 a20Var2 = this.f9853i;
        a20 a20Var3 = this.f9852h;
        if (!z2) {
            C1639ys c1639ys6 = this.f9846b;
            this.f9848d = c1639ys6.f13115p0[1];
            if (c1639ys6.f13062E) {
                this.f11132l = new C1295ph(this);
            }
            int i = this.f9848d;
            if (i != 3) {
                if (i == 4 && (c1639ys4 = this.f9846b.f13077T) != null && c1639ys4.f13115p0[1] == 1) {
                    int iM7131k = (c1639ys4.m7131k() - this.f9846b.f13067J.m4277e()) - this.f9846b.f13069L.m4277e();
                    r92.m5747b(a20Var3, c1639ys4.f13092e.f9852h, this.f9846b.f13067J.m4277e());
                    r92.m5747b(a20Var2, c1639ys4.f13092e.f9853i, -this.f9846b.f13069L.m4277e());
                    q20Var.mo53d(iM7131k);
                    return;
                }
                if (i == 1) {
                    q20Var.mo53d(this.f9846b.m7131k());
                }
            }
        } else if (this.f9848d == 4 && (c1639ys2 = (c1639ys = this.f9846b).f13077T) != null && c1639ys2.f13115p0[1] == 1) {
            r92.m5747b(a20Var3, c1639ys2.f13092e.f9852h, c1639ys.f13067J.m4277e());
            r92.m5747b(a20Var2, c1639ys2.f13092e.f9853i, -this.f9846b.f13069L.m4277e());
            return;
        }
        boolean z3 = q20Var.f36j;
        if (z3) {
            C1639ys c1639ys7 = this.f9846b;
            if (c1639ys7.f13084a) {
                C1082ls[] c1082lsArr = c1639ys7.f13074Q;
                C1082ls c1082ls = c1082lsArr[2];
                C1082ls c1082ls2 = c1082ls.f6503f;
                if (c1082ls2 != null && c1082lsArr[3].f6503f != null) {
                    boolean zM7143y = c1639ys7.m7143y();
                    C1639ys c1639ys8 = this.f9846b;
                    if (zM7143y) {
                        a20Var3.f32f = c1639ys8.f13074Q[2].m4277e();
                        a20Var2.f32f = -this.f9846b.f13074Q[3].m4277e();
                    } else {
                        a20 a20VarM5748h = r92.m5748h(c1639ys8.f13074Q[2]);
                        if (a20VarM5748h != null) {
                            r92.m5747b(a20Var3, a20VarM5748h, this.f9846b.f13074Q[2].m4277e());
                        }
                        a20 a20VarM5748h2 = r92.m5748h(this.f9846b.f13074Q[3]);
                        if (a20VarM5748h2 != null) {
                            r92.m5747b(a20Var2, a20VarM5748h2, -this.f9846b.f13074Q[3].m4277e());
                        }
                        a20Var3.f28b = true;
                        a20Var2.f28b = true;
                    }
                    C1639ys c1639ys9 = this.f9846b;
                    if (c1639ys9.f13062E) {
                        r92.m5747b(a20Var, a20Var3, c1639ys9.f13085a0);
                        return;
                    }
                    return;
                }
                if (c1082ls2 != null) {
                    a20 a20VarM5748h3 = r92.m5748h(c1082ls);
                    if (a20VarM5748h3 != null) {
                        r92.m5747b(a20Var3, a20VarM5748h3, this.f9846b.f13074Q[2].m4277e());
                        r92.m5747b(a20Var2, a20Var3, q20Var.f33g);
                        C1639ys c1639ys10 = this.f9846b;
                        if (c1639ys10.f13062E) {
                            r92.m5747b(a20Var, a20Var3, c1639ys10.f13085a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C1082ls c1082ls3 = c1082lsArr[3];
                if (c1082ls3.f6503f != null) {
                    a20 a20VarM5748h4 = r92.m5748h(c1082ls3);
                    if (a20VarM5748h4 != null) {
                        r92.m5747b(a20Var2, a20VarM5748h4, -this.f9846b.f13074Q[3].m4277e());
                        r92.m5747b(a20Var3, a20Var2, -q20Var.f33g);
                    }
                    C1639ys c1639ys11 = this.f9846b;
                    if (c1639ys11.f13062E) {
                        r92.m5747b(a20Var, a20Var3, c1639ys11.f13085a0);
                        return;
                    }
                    return;
                }
                C1082ls c1082ls4 = c1082lsArr[4];
                if (c1082ls4.f6503f != null) {
                    a20 a20VarM5748h5 = r92.m5748h(c1082ls4);
                    if (a20VarM5748h5 != null) {
                        r92.m5747b(a20Var, a20VarM5748h5, 0);
                        r92.m5747b(a20Var3, a20Var, -this.f9846b.f13085a0);
                        r92.m5747b(a20Var2, a20Var3, q20Var.f33g);
                        return;
                    }
                    return;
                }
                if ((c1639ys7 instanceof hk0) || c1639ys7.f13077T == null || c1639ys7.mo6933i(7).f6503f != null) {
                    return;
                }
                C1639ys c1639ys12 = this.f9846b;
                r92.m5747b(a20Var3, c1639ys12.f13077T.f13092e.f9852h, c1639ys12.m7137s());
                r92.m5747b(a20Var2, a20Var3, q20Var.f33g);
                C1639ys c1639ys13 = this.f9846b;
                if (c1639ys13.f13062E) {
                    r92.m5747b(a20Var, a20Var3, c1639ys13.f13085a0);
                    return;
                }
                return;
            }
        }
        if (z3 || this.f9848d != 3) {
            q20Var.m51b(this);
        } else {
            C1639ys c1639ys14 = this.f9846b;
            int i2 = c1639ys14.f13118s;
            if (i2 == 2) {
                C1639ys c1639ys15 = c1639ys14.f13077T;
                if (c1639ys15 != null) {
                    q20 q20Var2 = c1639ys15.f13092e.f9849e;
                    arrayList2.add(q20Var2);
                    q20Var2.f37k.add(q20Var);
                    q20Var.f28b = true;
                    arrayList.add(a20Var3);
                    arrayList.add(a20Var2);
                }
            } else if (i2 == 3 && !c1639ys14.m7143y()) {
                C1639ys c1639ys16 = this.f9846b;
                if (c1639ys16.f13117r != 3) {
                    q20 q20Var3 = c1639ys16.f13090d.f9849e;
                    arrayList2.add(q20Var3);
                    q20Var3.f37k.add(q20Var);
                    q20Var.f28b = true;
                    arrayList.add(a20Var3);
                    arrayList.add(a20Var2);
                }
            }
        }
        C1639ys c1639ys17 = this.f9846b;
        C1082ls[] c1082lsArr2 = c1639ys17.f13074Q;
        C1082ls c1082ls5 = c1082lsArr2[2];
        C1082ls c1082ls6 = c1082ls5.f6503f;
        if (c1082ls6 != null && c1082lsArr2[3].f6503f != null) {
            boolean zM7143y2 = c1639ys17.m7143y();
            C1639ys c1639ys18 = this.f9846b;
            if (zM7143y2) {
                a20Var3.f32f = c1639ys18.f13074Q[2].m4277e();
                a20Var2.f32f = -this.f9846b.f13074Q[3].m4277e();
            } else {
                a20 a20VarM5748h6 = r92.m5748h(c1639ys18.f13074Q[2]);
                a20 a20VarM5748h7 = r92.m5748h(this.f9846b.f13074Q[3]);
                if (a20VarM5748h6 != null) {
                    a20VarM5748h6.m51b(this);
                }
                if (a20VarM5748h7 != null) {
                    a20VarM5748h7.m51b(this);
                }
                this.f9854j = 4;
            }
            if (this.f9846b.f13062E) {
                m5750c(a20Var, a20Var3, 1, this.f11132l);
            }
        } else if (c1082ls6 != null) {
            a20 a20VarM5748h8 = r92.m5748h(c1082ls5);
            if (a20VarM5748h8 != null) {
                r92.m5747b(a20Var3, a20VarM5748h8, this.f9846b.f13074Q[2].m4277e());
                m5750c(a20Var2, a20Var3, 1, q20Var);
                if (this.f9846b.f13062E) {
                    m5750c(a20Var, a20Var3, 1, this.f11132l);
                }
                if (this.f9848d == 3) {
                    C1639ys c1639ys19 = this.f9846b;
                    if (c1639ys19.f13080W > TouchPipeline.SIZE) {
                        ok0 ok0Var = c1639ys19.f13090d;
                        if (ok0Var.f9848d == 3) {
                            ok0Var.f9849e.f37k.add(q20Var);
                            arrayList2.add(this.f9846b.f13090d.f9849e);
                            q20Var.f27a = this;
                        }
                    }
                }
            }
        } else {
            C1082ls c1082ls7 = c1082lsArr2[3];
            if (c1082ls7.f6503f != null) {
                a20 a20VarM5748h9 = r92.m5748h(c1082ls7);
                if (a20VarM5748h9 != null) {
                    r92.m5747b(a20Var2, a20VarM5748h9, -this.f9846b.f13074Q[3].m4277e());
                    m5750c(a20Var3, a20Var2, -1, q20Var);
                    if (this.f9846b.f13062E) {
                        m5750c(a20Var, a20Var3, 1, this.f11132l);
                    }
                }
            } else {
                C1082ls c1082ls8 = c1082lsArr2[4];
                if (c1082ls8.f6503f != null) {
                    a20 a20VarM5748h10 = r92.m5748h(c1082ls8);
                    if (a20VarM5748h10 != null) {
                        r92.m5747b(a20Var, a20VarM5748h10, 0);
                        m5750c(a20Var3, a20Var, -1, this.f11132l);
                        m5750c(a20Var2, a20Var3, 1, q20Var);
                    }
                } else if (!(c1639ys17 instanceof hk0) && (c1639ys3 = c1639ys17.f13077T) != null) {
                    r92.m5747b(a20Var3, c1639ys3.f13092e.f9852h, c1639ys17.m7137s());
                    m5750c(a20Var2, a20Var3, 1, q20Var);
                    if (this.f9846b.f13062E) {
                        m5750c(a20Var, a20Var3, 1, this.f11132l);
                    }
                    if (this.f9848d == 3) {
                        C1639ys c1639ys20 = this.f9846b;
                        if (c1639ys20.f13080W > TouchPipeline.SIZE) {
                            ok0 ok0Var2 = c1639ys20.f13090d;
                            if (ok0Var2.f9848d == 3) {
                                ok0Var2.f9849e.f37k.add(q20Var);
                                arrayList2.add(this.f9846b.f13090d.f9849e);
                                q20Var.f27a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            q20Var.f29c = true;
        }
    }

    @Override // p000.r92
    /* JADX INFO: renamed from: e */
    public final void mo3002e() {
        a20 a20Var = this.f9852h;
        if (a20Var.f36j) {
            this.f9846b.f13083Z = a20Var.f33g;
        }
    }

    @Override // p000.r92
    /* JADX INFO: renamed from: f */
    public final void mo3003f() {
        this.f9847c = null;
        this.f9852h.m52c();
        this.f9853i.m52c();
        this.f11131k.m52c();
        this.f9849e.m52c();
        this.f9851g = false;
    }

    @Override // p000.r92
    /* JADX INFO: renamed from: k */
    public final boolean mo3004k() {
        return this.f9848d != 3 || this.f9846b.f13118s == 0;
    }

    /* JADX INFO: renamed from: m */
    public final void m6388m() {
        this.f9851g = false;
        a20 a20Var = this.f9852h;
        a20Var.m52c();
        a20Var.f36j = false;
        a20 a20Var2 = this.f9853i;
        a20Var2.m52c();
        a20Var2.f36j = false;
        a20 a20Var3 = this.f11131k;
        a20Var3.m52c();
        a20Var3.f36j = false;
        this.f9849e.f36j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f9846b.f13099h0;
    }
}

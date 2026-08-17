package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ok0 extends r92 {

    /* JADX INFO: renamed from: k */
    public static final int[] f7828k = new int[2];

    /* JADX INFO: renamed from: m */
    public static void m4808m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0268  */
    /* JADX WARN: Code duplicated, block: B:118:0x0278  */
    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // p000.y10
    /* JADX INFO: renamed from: a */
    public final void mo50a(y10 y10Var) {
        float f;
        int iM5751g;
        int i;
        int iM5751g2;
        float f2;
        float f3;
        float f4;
        int i2;
        if (AbstractC1308pu.m5359z(this.f9854j) == 3) {
            C1639ys c1639ys = this.f9846b;
            m5752l(c1639ys.f13066I, c1639ys.f13068K, 0);
            return;
        }
        q20 q20Var = this.f9849e;
        boolean z = q20Var.f36j;
        a20 a20Var = this.f9852h;
        a20 a20Var2 = this.f9853i;
        if (z || this.f9848d != 3) {
            f = 0.5f;
        } else {
            C1639ys c1639ys2 = this.f9846b;
            int i3 = c1639ys2.f13117r;
            if (i3 == 2) {
                f = 0.5f;
                C1639ys c1639ys3 = c1639ys2.f13077T;
                if (c1639ys3 != null) {
                    q20 q20Var2 = c1639ys3.f13090d.f9849e;
                    if (q20Var2.f36j) {
                        q20Var.mo53d((int) ((q20Var2.f33g * c1639ys2.f13122w) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = c1639ys2.f13118s;
                if (i4 == 0 || i4 == 3) {
                    u52 u52Var = c1639ys2.f13092e;
                    a20 a20Var3 = u52Var.f9852h;
                    a20 a20Var4 = u52Var.f9853i;
                    boolean z2 = c1639ys2.f13066I.f6503f != null;
                    boolean z3 = c1639ys2.f13067J.f6503f != null;
                    boolean z4 = c1639ys2.f13068K.f6503f != null;
                    boolean z5 = c1639ys2.f13069L.f6503f != null;
                    f = 0.5f;
                    int i5 = c1639ys2.f13081X;
                    if (z2 && z3 && z4 && z5) {
                        float f5 = c1639ys2.f13080W;
                        boolean z6 = a20Var3.f36j;
                        ArrayList arrayList = a20Var3.f38l;
                        int[] iArr = f7828k;
                        if (z6 && a20Var4.f36j) {
                            if (a20Var.f29c && a20Var2.f29c) {
                                m4808m(iArr, ((a20) a20Var.f38l.get(0)).f33g + a20Var.f32f, ((a20) a20Var2.f38l.get(0)).f33g - a20Var2.f32f, a20Var3.f33g + a20Var3.f32f, a20Var4.f33g - a20Var4.f32f, f5, i5);
                                q20Var.mo53d(iArr[0]);
                                this.f9846b.f13092e.f9849e.mo53d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (a20Var.f36j && a20Var2.f36j) {
                            if (!a20Var3.f29c || !a20Var4.f29c) {
                                return;
                            }
                            m4808m(iArr, a20Var.f33g + a20Var.f32f, a20Var2.f33g - a20Var2.f32f, ((a20) arrayList.get(0)).f33g + a20Var3.f32f, ((a20) a20Var4.f38l.get(0)).f33g - a20Var4.f32f, f5, i5);
                            q20Var.mo53d(iArr[0]);
                            this.f9846b.f13092e.f9849e.mo53d(iArr[1]);
                        }
                        if (!a20Var.f29c || !a20Var2.f29c || !a20Var3.f29c || !a20Var4.f29c) {
                            return;
                        }
                        m4808m(iArr, ((a20) a20Var.f38l.get(0)).f33g + a20Var.f32f, ((a20) a20Var2.f38l.get(0)).f33g - a20Var2.f32f, ((a20) arrayList.get(0)).f33g + a20Var3.f32f, ((a20) a20Var4.f38l.get(0)).f33g - a20Var4.f32f, f5, i5);
                        q20Var.mo53d(iArr[0]);
                        this.f9846b.f13092e.f9849e.mo53d(iArr[1]);
                    } else if (z2 && z4) {
                        if (!a20Var.f29c || !a20Var2.f29c) {
                            return;
                        }
                        float f6 = c1639ys2.f13080W;
                        int i6 = ((a20) a20Var.f38l.get(0)).f33g + a20Var.f32f;
                        int i7 = ((a20) a20Var2.f38l.get(0)).f33g - a20Var2.f32f;
                        if (i5 == -1 || i5 == 0) {
                            int iM5751g3 = m5751g(i7 - i6, 0);
                            int i8 = (int) ((iM5751g3 * f6) + 0.5f);
                            int iM5751g4 = m5751g(i8, 1);
                            if (i8 != iM5751g4) {
                                iM5751g3 = (int) ((iM5751g4 / f6) + 0.5f);
                            }
                            q20Var.mo53d(iM5751g3);
                            this.f9846b.f13092e.f9849e.mo53d(iM5751g4);
                        } else if (i5 == 1) {
                            int iM5751g5 = m5751g(i7 - i6, 0);
                            int i9 = (int) ((iM5751g5 / f6) + 0.5f);
                            int iM5751g6 = m5751g(i9, 1);
                            if (i9 != iM5751g6) {
                                iM5751g5 = (int) ((iM5751g6 * f6) + 0.5f);
                            }
                            q20Var.mo53d(iM5751g5);
                            this.f9846b.f13092e.f9849e.mo53d(iM5751g6);
                        }
                    } else if (z3 && z5) {
                        if (!a20Var3.f29c || !a20Var4.f29c) {
                            return;
                        }
                        float f7 = c1639ys2.f13080W;
                        int i10 = ((a20) a20Var3.f38l.get(0)).f33g + a20Var3.f32f;
                        int i11 = ((a20) a20Var4.f38l.get(0)).f33g - a20Var4.f32f;
                        if (i5 == -1) {
                            iM5751g = m5751g(i11 - i10, 1);
                            i = (int) ((iM5751g / f7) + 0.5f);
                            iM5751g2 = m5751g(i, 0);
                            if (i != iM5751g2) {
                                iM5751g = (int) ((iM5751g2 * f7) + 0.5f);
                            }
                            q20Var.mo53d(iM5751g2);
                            this.f9846b.f13092e.f9849e.mo53d(iM5751g);
                        } else if (i5 == 0) {
                            int iM5751g7 = m5751g(i11 - i10, 1);
                            int i12 = (int) ((iM5751g7 * f7) + 0.5f);
                            int iM5751g8 = m5751g(i12, 0);
                            if (i12 != iM5751g8) {
                                iM5751g7 = (int) ((iM5751g8 / f7) + 0.5f);
                            }
                            q20Var.mo53d(iM5751g8);
                            this.f9846b.f13092e.f9849e.mo53d(iM5751g7);
                        } else if (i5 == 1) {
                            iM5751g = m5751g(i11 - i10, 1);
                            i = (int) ((iM5751g / f7) + 0.5f);
                            iM5751g2 = m5751g(i, 0);
                            if (i != iM5751g2) {
                                iM5751g = (int) ((iM5751g2 * f7) + 0.5f);
                            }
                            q20Var.mo53d(iM5751g2);
                            this.f9846b.f13092e.f9849e.mo53d(iM5751g);
                        }
                    }
                } else {
                    int i13 = c1639ys2.f13081X;
                    if (i13 != -1) {
                        if (i13 == 0) {
                            f4 = c1639ys2.f13092e.f9849e.f33g / c1639ys2.f13080W;
                            i2 = (int) (f4 + 0.5f);
                        } else if (i13 != 1) {
                            i2 = 0;
                        } else {
                            f2 = c1639ys2.f13092e.f9849e.f33g;
                            f3 = c1639ys2.f13080W;
                        }
                        q20Var.mo53d(i2);
                        f = 0.5f;
                    } else {
                        f2 = c1639ys2.f13092e.f9849e.f33g;
                        f3 = c1639ys2.f13080W;
                    }
                    f4 = f2 * f3;
                    i2 = (int) (f4 + 0.5f);
                    q20Var.mo53d(i2);
                    f = 0.5f;
                }
            } else {
                f = 0.5f;
            }
        }
        boolean z7 = a20Var.f29c;
        ArrayList arrayList2 = a20Var.f38l;
        if (z7) {
            boolean z8 = a20Var2.f29c;
            ArrayList arrayList3 = a20Var2.f38l;
            if (z8) {
                if (a20Var.f36j && a20Var2.f36j && q20Var.f36j) {
                    return;
                }
                if (!q20Var.f36j && this.f9848d == 3) {
                    C1639ys c1639ys4 = this.f9846b;
                    if (c1639ys4.f13117r == 0 && !c1639ys4.m7142x()) {
                        a20 a20Var5 = (a20) arrayList2.get(0);
                        a20 a20Var6 = (a20) arrayList3.get(0);
                        int i14 = a20Var5.f33g + a20Var.f32f;
                        int i15 = a20Var6.f33g + a20Var2.f32f;
                        a20Var.mo53d(i14);
                        a20Var2.mo53d(i15);
                        q20Var.mo53d(i15 - i14);
                        return;
                    }
                }
                if (!q20Var.f36j && this.f9848d == 3 && this.f9845a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((a20) arrayList3.get(0)).f33g + a20Var2.f32f) - (((a20) arrayList2.get(0)).f33g + a20Var.f32f), q20Var.f9308m);
                    C1639ys c1639ys5 = this.f9846b;
                    int i16 = c1639ys5.f13121v;
                    int iMax = Math.max(c1639ys5.f13120u, iMin);
                    if (i16 > 0) {
                        iMax = Math.min(i16, iMax);
                    }
                    q20Var.mo53d(iMax);
                }
                if (q20Var.f36j) {
                    a20 a20Var7 = (a20) arrayList2.get(0);
                    a20 a20Var8 = (a20) arrayList3.get(0);
                    int i17 = a20Var7.f33g;
                    int i18 = a20Var.f32f + i17;
                    int i19 = a20Var8.f33g;
                    int i20 = a20Var2.f32f + i19;
                    float f8 = this.f9846b.f13091d0;
                    if (a20Var7 == a20Var8) {
                        f8 = f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    a20Var.mo53d((int) ((((i19 - i17) - q20Var.f33g) * f8) + i17 + f));
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
        int i;
        C1639ys c1639ys3;
        C1639ys c1639ys4;
        int i2;
        C1639ys c1639ys5 = this.f9846b;
        boolean z = c1639ys5.f13084a;
        q20 q20Var = this.f9849e;
        if (z) {
            q20Var.mo53d(c1639ys5.m7135q());
        }
        boolean z2 = q20Var.f36j;
        ArrayList arrayList = q20Var.f37k;
        ArrayList arrayList2 = q20Var.f38l;
        a20 a20Var = this.f9853i;
        a20 a20Var2 = this.f9852h;
        if (!z2) {
            C1639ys c1639ys6 = this.f9846b;
            int i3 = c1639ys6.f13115p0[0];
            this.f9848d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (c1639ys4 = c1639ys6.f13077T) != null && ((i2 = c1639ys4.f13115p0[0]) == 1 || i2 == 4)) {
                    int iM7135q = (c1639ys4.m7135q() - this.f9846b.f13066I.m4277e()) - this.f9846b.f13068K.m4277e();
                    r92.m5747b(a20Var2, c1639ys4.f13090d.f9852h, this.f9846b.f13066I.m4277e());
                    r92.m5747b(a20Var, c1639ys4.f13090d.f9853i, -this.f9846b.f13068K.m4277e());
                    q20Var.mo53d(iM7135q);
                    return;
                }
                if (i3 == 1) {
                    q20Var.mo53d(c1639ys6.m7135q());
                }
            }
        } else if (this.f9848d == 4 && (c1639ys2 = (c1639ys = this.f9846b).f13077T) != null && ((i = c1639ys2.f13115p0[0]) == 1 || i == 4)) {
            r92.m5747b(a20Var2, c1639ys2.f13090d.f9852h, c1639ys.f13066I.m4277e());
            r92.m5747b(a20Var, c1639ys2.f13090d.f9853i, -this.f9846b.f13068K.m4277e());
            return;
        }
        if (q20Var.f36j) {
            C1639ys c1639ys7 = this.f9846b;
            if (c1639ys7.f13084a) {
                C1082ls[] c1082lsArr = c1639ys7.f13074Q;
                C1082ls c1082ls = c1082lsArr[0];
                C1082ls c1082ls2 = c1082ls.f6503f;
                if (c1082ls2 != null && c1082lsArr[1].f6503f != null) {
                    boolean zM7142x = c1639ys7.m7142x();
                    C1639ys c1639ys8 = this.f9846b;
                    if (zM7142x) {
                        a20Var2.f32f = c1639ys8.f13074Q[0].m4277e();
                        a20Var.f32f = -this.f9846b.f13074Q[1].m4277e();
                        return;
                    }
                    a20 a20VarM5748h = r92.m5748h(c1639ys8.f13074Q[0]);
                    if (a20VarM5748h != null) {
                        r92.m5747b(a20Var2, a20VarM5748h, this.f9846b.f13074Q[0].m4277e());
                    }
                    a20 a20VarM5748h2 = r92.m5748h(this.f9846b.f13074Q[1]);
                    if (a20VarM5748h2 != null) {
                        r92.m5747b(a20Var, a20VarM5748h2, -this.f9846b.f13074Q[1].m4277e());
                    }
                    a20Var2.f28b = true;
                    a20Var.f28b = true;
                    return;
                }
                if (c1082ls2 != null) {
                    a20 a20VarM5748h3 = r92.m5748h(c1082ls);
                    if (a20VarM5748h3 != null) {
                        r92.m5747b(a20Var2, a20VarM5748h3, this.f9846b.f13074Q[0].m4277e());
                        r92.m5747b(a20Var, a20Var2, q20Var.f33g);
                        return;
                    }
                    return;
                }
                C1082ls c1082ls3 = c1082lsArr[1];
                if (c1082ls3.f6503f != null) {
                    a20 a20VarM5748h4 = r92.m5748h(c1082ls3);
                    if (a20VarM5748h4 != null) {
                        r92.m5747b(a20Var, a20VarM5748h4, -this.f9846b.f13074Q[1].m4277e());
                        r92.m5747b(a20Var2, a20Var, -q20Var.f33g);
                        return;
                    }
                    return;
                }
                if ((c1639ys7 instanceof hk0) || c1639ys7.f13077T == null || c1639ys7.mo6933i(7).f6503f != null) {
                    return;
                }
                C1639ys c1639ys9 = this.f9846b;
                r92.m5747b(a20Var2, c1639ys9.f13077T.f13090d.f9852h, c1639ys9.m7136r());
                r92.m5747b(a20Var, a20Var2, q20Var.f33g);
                return;
            }
        }
        if (this.f9848d == 3) {
            C1639ys c1639ys10 = this.f9846b;
            int i4 = c1639ys10.f13117r;
            if (i4 == 2) {
                C1639ys c1639ys11 = c1639ys10.f13077T;
                if (c1639ys11 != null) {
                    q20 q20Var2 = c1639ys11.f13092e.f9849e;
                    arrayList2.add(q20Var2);
                    q20Var2.f37k.add(q20Var);
                    q20Var.f28b = true;
                    arrayList.add(a20Var2);
                    arrayList.add(a20Var);
                }
            } else if (i4 == 3) {
                if (c1639ys10.f13118s == 3) {
                    a20Var2.f27a = this;
                    a20Var.f27a = this;
                    u52 u52Var = c1639ys10.f13092e;
                    u52Var.f9852h.f27a = this;
                    u52Var.f9853i.f27a = this;
                    q20Var.f27a = this;
                    if (c1639ys10.m7143y()) {
                        arrayList2.add(this.f9846b.f13092e.f9849e);
                        this.f9846b.f13092e.f9849e.f37k.add(q20Var);
                        u52 u52Var2 = this.f9846b.f13092e;
                        u52Var2.f9849e.f27a = this;
                        arrayList2.add(u52Var2.f9852h);
                        arrayList2.add(this.f9846b.f13092e.f9853i);
                        this.f9846b.f13092e.f9852h.f37k.add(q20Var);
                        this.f9846b.f13092e.f9853i.f37k.add(q20Var);
                    } else {
                        boolean zM7142x2 = this.f9846b.m7142x();
                        C1639ys c1639ys12 = this.f9846b;
                        if (zM7142x2) {
                            c1639ys12.f13092e.f9849e.f38l.add(q20Var);
                            arrayList.add(this.f9846b.f13092e.f9849e);
                        } else {
                            c1639ys12.f13092e.f9849e.f38l.add(q20Var);
                        }
                    }
                } else {
                    q20 q20Var3 = c1639ys10.f13092e.f9849e;
                    arrayList2.add(q20Var3);
                    q20Var3.f37k.add(q20Var);
                    this.f9846b.f13092e.f9852h.f37k.add(q20Var);
                    this.f9846b.f13092e.f9853i.f37k.add(q20Var);
                    q20Var.f28b = true;
                    arrayList.add(a20Var2);
                    arrayList.add(a20Var);
                    a20Var2.f38l.add(q20Var);
                    a20Var.f38l.add(q20Var);
                }
            }
        }
        C1639ys c1639ys13 = this.f9846b;
        C1082ls[] c1082lsArr2 = c1639ys13.f13074Q;
        C1082ls c1082ls4 = c1082lsArr2[0];
        C1082ls c1082ls5 = c1082ls4.f6503f;
        if (c1082ls5 != null && c1082lsArr2[1].f6503f != null) {
            boolean zM7142x3 = c1639ys13.m7142x();
            C1639ys c1639ys14 = this.f9846b;
            if (zM7142x3) {
                a20Var2.f32f = c1639ys14.f13074Q[0].m4277e();
                a20Var.f32f = -this.f9846b.f13074Q[1].m4277e();
                return;
            }
            a20 a20VarM5748h5 = r92.m5748h(c1639ys14.f13074Q[0]);
            a20 a20VarM5748h6 = r92.m5748h(this.f9846b.f13074Q[1]);
            if (a20VarM5748h5 != null) {
                a20VarM5748h5.m51b(this);
            }
            if (a20VarM5748h6 != null) {
                a20VarM5748h6.m51b(this);
            }
            this.f9854j = 4;
            return;
        }
        if (c1082ls5 != null) {
            a20 a20VarM5748h7 = r92.m5748h(c1082ls4);
            if (a20VarM5748h7 != null) {
                r92.m5747b(a20Var2, a20VarM5748h7, this.f9846b.f13074Q[0].m4277e());
                m5750c(a20Var, a20Var2, 1, q20Var);
                return;
            }
            return;
        }
        C1082ls c1082ls6 = c1082lsArr2[1];
        if (c1082ls6.f6503f != null) {
            a20 a20VarM5748h8 = r92.m5748h(c1082ls6);
            if (a20VarM5748h8 != null) {
                r92.m5747b(a20Var, a20VarM5748h8, -this.f9846b.f13074Q[1].m4277e());
                m5750c(a20Var2, a20Var, -1, q20Var);
                return;
            }
            return;
        }
        if ((c1639ys13 instanceof hk0) || (c1639ys3 = c1639ys13.f13077T) == null) {
            return;
        }
        r92.m5747b(a20Var2, c1639ys3.f13090d.f9852h, c1639ys13.m7136r());
        m5750c(a20Var, a20Var2, 1, q20Var);
    }

    @Override // p000.r92
    /* JADX INFO: renamed from: e */
    public final void mo3002e() {
        a20 a20Var = this.f9852h;
        if (a20Var.f36j) {
            this.f9846b.f13082Y = a20Var.f33g;
        }
    }

    @Override // p000.r92
    /* JADX INFO: renamed from: f */
    public final void mo3003f() {
        this.f9847c = null;
        this.f9852h.m52c();
        this.f9853i.m52c();
        this.f9849e.m52c();
        this.f9851g = false;
    }

    @Override // p000.r92
    /* JADX INFO: renamed from: k */
    public final boolean mo3004k() {
        return this.f9848d != 3 || this.f9846b.f13117r == 0;
    }

    /* JADX INFO: renamed from: n */
    public final void m4809n() {
        this.f9851g = false;
        a20 a20Var = this.f9852h;
        a20Var.m52c();
        a20Var.f36j = false;
        a20 a20Var2 = this.f9853i;
        a20Var2.m52c();
        a20Var2.f36j = false;
        this.f9849e.f36j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f9846b.f13099h0;
    }
}

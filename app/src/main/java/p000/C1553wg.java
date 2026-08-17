package p000;

/* JADX INFO: renamed from: wg */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1553wg extends hk0 {

    /* JADX INFO: renamed from: s0 */
    public int f12128s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f12129t0;

    /* JADX INFO: renamed from: u0 */
    public int f12130u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f12131v0;

    @Override // p000.C1639ys
    /* JADX INFO: renamed from: A */
    public final boolean mo6773A() {
        return this.f12131v0;
    }

    @Override // p000.C1639ys
    /* JADX INFO: renamed from: B */
    public final boolean mo6774B() {
        return this.f12131v0;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m6775T() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.f4612r0;
            if (i4 >= i) {
                break;
            }
            C1639ys c1639ys = this.f4611q0[i4];
            if ((this.f12129t0 || c1639ys.mo6777c()) && ((((i2 = this.f12128s0) == 0 || i2 == 1) && !c1639ys.mo6773A()) || (((i3 = this.f12128s0) == 2 || i3 == 3) && !c1639ys.mo6774B()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.f4612r0; i5++) {
            C1639ys c1639ys2 = this.f4611q0[i5];
            if (this.f12129t0 || c1639ys2.mo6777c()) {
                if (!z2) {
                    int i6 = this.f12128s0;
                    if (i6 == 0) {
                        iMax = c1639ys2.mo6933i(2).m4276d();
                    } else if (i6 == 1) {
                        iMax = c1639ys2.mo6933i(4).m4276d();
                    } else if (i6 == 2) {
                        iMax = c1639ys2.mo6933i(3).m4276d();
                    } else if (i6 == 3) {
                        iMax = c1639ys2.mo6933i(5).m4276d();
                    }
                    z2 = true;
                }
                int i7 = this.f12128s0;
                if (i7 == 0) {
                    iMax = Math.min(iMax, c1639ys2.mo6933i(2).m4276d());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, c1639ys2.mo6933i(4).m4276d());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, c1639ys2.mo6933i(3).m4276d());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, c1639ys2.mo6933i(5).m4276d());
                }
            }
        }
        int i8 = iMax + this.f12130u0;
        int i9 = this.f12128s0;
        if (i9 == 0 || i9 == 1) {
            m7117J(i8, i8);
        } else {
            m7118K(i8, i8);
        }
        this.f12131v0 = true;
        return true;
    }

    /* JADX INFO: renamed from: U */
    public final int m6776U() {
        int i = this.f12128s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // p000.C1639ys
    /* JADX INFO: renamed from: b */
    public final void mo3424b(xs0 xs0Var, boolean z) {
        boolean z2;
        int i;
        int i2;
        C1082ls[] c1082lsArr = this.f13074Q;
        C1082ls c1082ls = this.f13066I;
        c1082lsArr[0] = c1082ls;
        int i3 = 2;
        C1082ls c1082ls2 = this.f13067J;
        c1082lsArr[2] = c1082ls2;
        C1082ls c1082ls3 = this.f13068K;
        c1082lsArr[1] = c1082ls3;
        C1082ls c1082ls4 = this.f13069L;
        c1082lsArr[3] = c1082ls4;
        for (C1082ls c1082ls5 : c1082lsArr) {
            c1082ls5.f6506i = xs0Var.m6966k(c1082ls5);
        }
        int i4 = this.f12128s0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C1082ls c1082ls6 = c1082lsArr[i4];
        if (!this.f12131v0) {
            m6775T();
        }
        if (this.f12131v0) {
            this.f12131v0 = false;
            int i5 = this.f12128s0;
            if (i5 == 0 || i5 == 1) {
                xs0Var.m6959d(c1082ls.f6506i, this.f13082Y);
                xs0Var.m6959d(c1082ls3.f6506i, this.f13082Y);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    xs0Var.m6959d(c1082ls2.f6506i, this.f13083Z);
                    xs0Var.m6959d(c1082ls4.f6506i, this.f13083Z);
                    return;
                }
                return;
            }
        }
        int i6 = 0;
        while (true) {
            if (i6 >= this.f4612r0) {
                z2 = false;
                break;
            }
            C1639ys c1639ys = this.f4611q0[i6];
            if ((this.f12129t0 || c1639ys.mo6777c()) && ((((i2 = this.f12128s0) == 0 || i2 == 1) && c1639ys.f13115p0[0] == 3 && c1639ys.f13066I.f6503f != null && c1639ys.f13068K.f6503f != null) || ((i2 == 2 || i2 == 3) && c1639ys.f13115p0[1] == 3 && c1639ys.f13067J.f6503f != null && c1639ys.f13069L.f6503f != null))) {
                z2 = true;
                break;
            }
            i6++;
        }
        boolean z3 = c1082ls.m4279g() || c1082ls3.m4279g();
        boolean z4 = c1082ls2.m4279g() || c1082ls4.m4279g();
        int i7 = !(!z2 && (((i = this.f12128s0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f4612r0) {
            C1639ys c1639ys2 = this.f4611q0[i8];
            if (this.f12129t0 || c1639ys2.mo6777c()) {
                au1 au1VarM6966k = xs0Var.m6966k(c1639ys2.f13074Q[this.f12128s0]);
                C1082ls[] c1082lsArr2 = c1639ys2.f13074Q;
                int i9 = this.f12128s0;
                C1082ls c1082ls7 = c1082lsArr2[i9];
                c1082ls7.f6506i = au1VarM6966k;
                C1082ls c1082ls8 = c1082ls7.f6503f;
                int i10 = (c1082ls8 == null || c1082ls8.f6501d != this) ? 0 : c1082ls7.f6504g;
                if (i9 == 0 || i9 == i3) {
                    au1 au1Var = c1082ls6.f6506i;
                    int i11 = this.f12130u0 - i10;
                    C0670ga c0670gaM6967l = xs0Var.m6967l();
                    au1 au1VarM6968m = xs0Var.m6968m();
                    au1VarM6968m.f1058d = 0;
                    c0670gaM6967l.m2947c(au1Var, au1VarM6966k, au1VarM6968m, i11);
                    xs0Var.m6958c(c0670gaM6967l);
                } else {
                    au1 au1Var2 = c1082ls6.f6506i;
                    int i12 = this.f12130u0 + i10;
                    C0670ga c0670gaM6967l2 = xs0Var.m6967l();
                    au1 au1VarM6968m2 = xs0Var.m6968m();
                    au1VarM6968m2.f1058d = 0;
                    c0670gaM6967l2.m2946b(au1Var2, au1VarM6966k, au1VarM6968m2, i12);
                    xs0Var.m6958c(c0670gaM6967l2);
                }
                xs0Var.m6960e(c1082ls6.f6506i, au1VarM6966k, this.f12130u0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f12128s0;
        if (i13 == 0) {
            xs0Var.m6960e(c1082ls3.f6506i, c1082ls.f6506i, 0, 8);
            xs0Var.m6960e(c1082ls.f6506i, this.f13077T.f13068K.f6506i, 0, 4);
            xs0Var.m6960e(c1082ls.f6506i, this.f13077T.f13066I.f6506i, 0, 0);
            return;
        }
        if (i13 == 1) {
            xs0Var.m6960e(c1082ls.f6506i, c1082ls3.f6506i, 0, 8);
            xs0Var.m6960e(c1082ls.f6506i, this.f13077T.f13066I.f6506i, 0, 4);
            xs0Var.m6960e(c1082ls.f6506i, this.f13077T.f13068K.f6506i, 0, 0);
        } else if (i13 == 2) {
            xs0Var.m6960e(c1082ls4.f6506i, c1082ls2.f6506i, 0, 8);
            xs0Var.m6960e(c1082ls2.f6506i, this.f13077T.f13069L.f6506i, 0, 4);
            xs0Var.m6960e(c1082ls2.f6506i, this.f13077T.f13067J.f6506i, 0, 0);
        } else if (i13 == 3) {
            xs0Var.m6960e(c1082ls2.f6506i, c1082ls4.f6506i, 0, 8);
            xs0Var.m6960e(c1082ls2.f6506i, this.f13077T.f13067J.f6506i, 0, 4);
            xs0Var.m6960e(c1082ls2.f6506i, this.f13077T.f13069L.f6506i, 0, 0);
        }
    }

    @Override // p000.C1639ys
    /* JADX INFO: renamed from: c */
    public final boolean mo6777c() {
        return true;
    }

    @Override // p000.C1639ys
    public final String toString() {
        String strM5342i = AbstractC1308pu.m5342i(new StringBuilder("[Barrier] "), this.f13099h0, " {");
        for (int i = 0; i < this.f4612r0; i++) {
            C1639ys c1639ys = this.f4611q0[i];
            if (i > 0) {
                strM5342i = strM5342i.concat(", ");
            }
            StringBuilder sbM5344k = AbstractC1308pu.m5344k(strM5342i);
            sbM5344k.append(c1639ys.f13099h0);
            strM5342i = sbM5344k.toString();
        }
        return strM5342i.concat("}");
    }
}

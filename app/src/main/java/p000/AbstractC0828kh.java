package p000;

/* JADX INFO: renamed from: kh */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0828kh implements ze1 {

    /* JADX INFO: renamed from: b */
    public final int f5807b;

    /* JADX INFO: renamed from: d */
    public xk1 f5809d;

    /* JADX INFO: renamed from: e */
    public int f5810e;

    /* JADX INFO: renamed from: f */
    public ye1 f5811f;

    /* JADX INFO: renamed from: g */
    public xy1 f5812g;

    /* JADX INFO: renamed from: m */
    public int f5813m;

    /* JADX INFO: renamed from: n */
    public yo1 f5814n;

    /* JADX INFO: renamed from: o */
    public be0[] f5815o;

    /* JADX INFO: renamed from: p */
    public long f5816p;

    /* JADX INFO: renamed from: q */
    public long f5817q;

    /* JADX INFO: renamed from: s */
    public boolean f5819s;

    /* JADX INFO: renamed from: t */
    public boolean f5820t;

    /* JADX INFO: renamed from: v */
    public d10 f5822v;

    /* JADX INFO: renamed from: a */
    public final Object f5806a = new Object();

    /* JADX INFO: renamed from: c */
    public final C0558d8 f5808c = new C0558d8((char) 0, 24);

    /* JADX INFO: renamed from: r */
    public long f5818r = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u */
    public t02 f5821u = t02.f10690a;

    public AbstractC0828kh(int i) {
        this.f5807b = i;
    }

    /* JADX INFO: renamed from: f */
    public static int m3828f(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | 128 | i4;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m3829m(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    /* JADX INFO: renamed from: B */
    public abstract int mo2886B(be0 be0Var);

    /* JADX INFO: renamed from: C */
    public int mo2887C() {
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public final t70 m3830g(Exception exc, be0 be0Var, boolean z, int i) {
        int iMo2886B;
        if (be0Var == null || this.f5820t) {
            iMo2886B = 4;
        } else {
            this.f5820t = true;
            try {
                iMo2886B = mo2886B(be0Var) & 7;
                this.f5820t = false;
            } catch (t70 unused) {
                this.f5820t = false;
                iMo2886B = 4;
            } catch (Throwable th) {
                this.f5820t = false;
                throw th;
            }
        }
        return new t70(1, exc, i, mo34j(), this.f5810e, be0Var, be0Var == null ? 4 : iMo2886B, z);
    }

    /* JADX INFO: renamed from: i */
    public x01 mo32i() {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public abstract String mo34j();

    /* JADX INFO: renamed from: k */
    public final boolean m3832k() {
        return this.f5818r == Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: l */
    public abstract boolean mo35l();

    /* JADX INFO: renamed from: n */
    public abstract boolean mo37n();

    /* JADX INFO: renamed from: o */
    public abstract void mo38o();

    /* JADX INFO: renamed from: q */
    public abstract void mo40q(long j, boolean z);

    /* JADX INFO: renamed from: w */
    public final int m3833w(C0558d8 c0558d8, C1533vx c1533vx, int i) {
        yo1 yo1Var = this.f5814n;
        yo1Var.getClass();
        int iMo3800m = yo1Var.mo3800m(c0558d8, c1533vx, i);
        if (iMo3800m == -4) {
            if (c1533vx.m4599i(4)) {
                this.f5818r = Long.MIN_VALUE;
                return this.f5819s ? -4 : -3;
            }
            long j = c1533vx.f11797p + this.f5816p;
            c1533vx.f11797p = j;
            this.f5818r = Math.max(this.f5818r, j);
            return iMo3800m;
        }
        if (iMo3800m == -5) {
            be0 be0Var = (be0) c0558d8.f2822c;
            be0Var.getClass();
            long j2 = be0Var.f1346s;
            if (j2 != Long.MAX_VALUE) {
                ae0 ae0VarM969a = be0Var.m969a();
                ae0VarM969a.f202r = j2 + this.f5816p;
                c0558d8.f2822c = new be0(ae0VarM969a);
            }
        }
        return iMo3800m;
    }

    /* JADX INFO: renamed from: x */
    public abstract void mo2919x(long j, long j2);

    /* JADX INFO: renamed from: y */
    public final void m3834y(be0[] be0VarArr, yo1 yo1Var, long j, long j2, q21 q21Var) {
        ki0.m3864h(!this.f5819s);
        this.f5814n = yo1Var;
        if (this.f5818r == Long.MIN_VALUE) {
            this.f5818r = j;
        }
        this.f5815o = be0VarArr;
        this.f5816p = j2;
        mo2916v(be0VarArr, j, j2, q21Var);
    }

    /* JADX INFO: renamed from: z */
    public final void m3835z() {
        ki0.m3864h(this.f5813m == 0);
        this.f5808c.m2267h();
        mo42s();
    }

    /* JADX INFO: renamed from: h */
    public void mo3831h() {
    }

    /* JADX INFO: renamed from: r */
    public void mo41r() {
    }

    /* JADX INFO: renamed from: s */
    public void mo42s() {
    }

    /* JADX INFO: renamed from: t */
    public void mo44t() {
    }

    /* JADX INFO: renamed from: u */
    public void mo46u() {
    }

    /* JADX INFO: renamed from: A */
    public void mo2885A(float f, float f2) {
    }

    @Override // p000.ze1
    /* JADX INFO: renamed from: d */
    public void mo29d(int i, Object obj) {
    }

    /* JADX INFO: renamed from: p */
    public void mo39p(boolean z, boolean z2) {
    }

    /* JADX INFO: renamed from: v */
    public void mo2916v(be0[] be0VarArr, long j, long j2, q21 q21Var) {
    }
}

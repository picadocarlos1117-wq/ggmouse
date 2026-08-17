package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: xk */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1594xk extends ee0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0541cs f12623a;

    /* JADX INFO: renamed from: c */
    public volatile nv1 f12625c;

    /* JADX INFO: renamed from: d */
    public nv1 f12626d;

    /* JADX INFO: renamed from: e */
    public nv1 f12627e;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1631yk f12629g;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f12624b = new AtomicInteger(-2147483647);

    /* JADX INFO: renamed from: f */
    public final ay0 f12628f = new ay0(this, 14);

    public C1594xk(C1631yk c1631yk, InterfaceC0541cs interfaceC0541cs, String str) {
        this.f12629g = c1631yk;
        p32.m5188s(interfaceC0541cs, "delegate");
        this.f12623a = interfaceC0541cs;
    }

    /* JADX INFO: renamed from: e */
    public static void m6934e(C1594xk c1594xk) {
        synchronized (c1594xk) {
            try {
                if (c1594xk.f12624b.get() != 0) {
                    return;
                }
                nv1 nv1Var = c1594xk.f12626d;
                nv1 nv1Var2 = c1594xk.f12627e;
                c1594xk.f12626d = null;
                c1594xk.f12627e = null;
                if (nv1Var != null) {
                    super.mo2580h(nv1Var);
                }
                if (nv1Var2 != null) {
                    super.mo2577b(nv1Var2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.ee0
    /* JADX INFO: renamed from: a */
    public final InterfaceC0541cs mo2109a() {
        return this.f12623a;
    }

    @Override // p000.ee0, p000.yx0
    /* JADX INFO: renamed from: b */
    public final void mo2577b(nv1 nv1Var) {
        p32.m5188s(nv1Var, "status");
        synchronized (this) {
            try {
                if (this.f12624b.get() < 0) {
                    this.f12625c = nv1Var;
                    this.f12624b.addAndGet(Integer.MAX_VALUE);
                } else if (this.f12627e != null) {
                    return;
                }
                if (this.f12624b.get() != 0) {
                    this.f12627e = nv1Var;
                } else {
                    super.mo2577b(nv1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC1487uo
    /* JADX INFO: renamed from: d */
    public final InterfaceC1339qo mo2110d(u51 u51Var, j51 j51Var, C0022al c0022al, rc2[] rc2VarArr) {
        InterfaceC1339qo interfaceC1339qo;
        AbstractC1520vk abstractC1520vk = c0022al.f260c;
        if (abstractC1520vk == null) {
            abstractC1520vk = null;
        }
        if (abstractC1520vk == null) {
            return this.f12624b.get() >= 0 ? new f90(this.f12625c, rc2VarArr) : this.f12623a.mo2110d(u51Var, j51Var, c0022al, rc2VarArr);
        }
        l51 l51Var = new l51(this.f12623a, u51Var, j51Var, c0022al, this.f12628f, rc2VarArr);
        if (this.f12624b.incrementAndGet() > 0) {
            C1594xk c1594xk = (C1594xk) this.f12628f.f1096b;
            if (c1594xk.f12624b.decrementAndGet() == 0) {
                m6934e(c1594xk);
            }
            return new f90(this.f12625c, rc2VarArr);
        }
        try {
            abstractC1520vk.applyRequestMetadata(new C1557wk(), this.f12629g.f12999b, l51Var);
        } catch (Throwable th) {
            l51Var.mo4057b(nv1.f7555j.m4614g("Credentials should use fail() instead of throwing exceptions").m4613f(th));
        }
        synchronized (l51Var.f6185h) {
            try {
                InterfaceC1339qo interfaceC1339qo2 = l51Var.f6186i;
                interfaceC1339qo = interfaceC1339qo2;
                if (interfaceC1339qo2 == null) {
                    t10 t10Var = new t10();
                    l51Var.f6188k = t10Var;
                    l51Var.f6186i = t10Var;
                    interfaceC1339qo = t10Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC1339qo;
    }

    @Override // p000.ee0, p000.yx0
    /* JADX INFO: renamed from: h */
    public final void mo2580h(nv1 nv1Var) {
        p32.m5188s(nv1Var, "status");
        synchronized (this) {
            try {
                if (this.f12624b.get() < 0) {
                    this.f12625c = nv1Var;
                    this.f12624b.addAndGet(Integer.MAX_VALUE);
                    if (this.f12624b.get() != 0) {
                        this.f12626d = nv1Var;
                    } else {
                        super.mo2580h(nv1Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

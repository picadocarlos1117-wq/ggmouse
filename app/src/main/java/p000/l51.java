package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class l51 extends AbstractC1446tk {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1487uo f6178a;

    /* JADX INFO: renamed from: b */
    public final u51 f6179b;

    /* JADX INFO: renamed from: c */
    public final j51 f6180c;

    /* JADX INFO: renamed from: d */
    public final C0022al f6181d;

    /* JADX INFO: renamed from: f */
    public final ay0 f6183f;

    /* JADX INFO: renamed from: g */
    public final rc2[] f6184g;

    /* JADX INFO: renamed from: i */
    public InterfaceC1339qo f6186i;

    /* JADX INFO: renamed from: j */
    public boolean f6187j;

    /* JADX INFO: renamed from: k */
    public t10 f6188k;

    /* JADX INFO: renamed from: h */
    public final Object f6185h = new Object();

    /* JADX INFO: renamed from: e */
    public final C1307pt f6182e = C1307pt.m5325b();

    public l51(InterfaceC1487uo interfaceC1487uo, u51 u51Var, j51 j51Var, C0022al c0022al, ay0 ay0Var, rc2[] rc2VarArr) {
        this.f6178a = interfaceC1487uo;
        this.f6179b = u51Var;
        this.f6180c = j51Var;
        this.f6181d = c0022al;
        this.f6183f = ay0Var;
        this.f6184g = rc2VarArr;
    }

    @Override // p000.AbstractC1446tk
    /* JADX INFO: renamed from: a */
    public final void mo4056a(j51 j51Var) {
        p32.m5193x(!this.f6187j, "apply() or fail() already called");
        j51 j51Var2 = this.f6180c;
        j51Var2.m3564d(j51Var);
        C1307pt c1307pt = this.f6182e;
        C1307pt c1307ptM5326a = c1307pt.m5326a();
        try {
            InterfaceC1339qo interfaceC1339qoMo2110d = this.f6178a.mo2110d(this.f6179b, j51Var2, this.f6181d, this.f6184g);
            c1307pt.m5327c(c1307ptM5326a);
            m4058c(interfaceC1339qoMo2110d);
        } catch (Throwable th) {
            c1307pt.m5327c(c1307ptM5326a);
            throw th;
        }
    }

    @Override // p000.AbstractC1446tk
    /* JADX INFO: renamed from: b */
    public final void mo4057b(nv1 nv1Var) {
        p32.m5177l(!nv1Var.m4612e(), "Cannot fail with OK status");
        p32.m5193x(!this.f6187j, "apply() or fail() already called");
        m4058c(new f90(vi0.m6636h(nv1Var), EnumC1376ro.f10079a, this.f6184g));
    }

    /* JADX INFO: renamed from: c */
    public final void m4058c(InterfaceC1339qo interfaceC1339qo) {
        boolean z;
        p32.m5193x(!this.f6187j, "already finalized");
        this.f6187j = true;
        synchronized (this.f6185h) {
            try {
                if (this.f6186i == null) {
                    this.f6186i = interfaceC1339qo;
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            C1594xk c1594xk = (C1594xk) this.f6183f.f1096b;
            if (c1594xk.f12624b.decrementAndGet() == 0) {
                C1594xk.m6934e(c1594xk);
                return;
            }
            return;
        }
        p32.m5193x(this.f6188k != null, "delayedStream is null");
        r10 r10VarM6180s = this.f6188k.m6180s(interfaceC1339qo);
        if (r10VarM6180s != null) {
            r10VarM6180s.run();
        }
        C1594xk c1594xk2 = (C1594xk) this.f6183f.f1096b;
        if (c1594xk2.f12624b.decrementAndGet() == 0) {
            C1594xk.m6934e(c1594xk2);
        }
    }
}

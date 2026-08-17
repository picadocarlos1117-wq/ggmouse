package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ra2 {

    /* JADX INFO: renamed from: a */
    public final bb2 f9864a;

    /* JADX INFO: renamed from: b */
    public un0[] f9865b;

    public ra2() {
        this(new bb2());
    }

    /* JADX INFO: renamed from: a */
    public final void m5757a() {
        un0[] un0VarArr = this.f9865b;
        if (un0VarArr != null) {
            un0 un0VarMo6018f = un0VarArr[0];
            un0 un0VarMo6018f2 = un0VarArr[1];
            bb2 bb2Var = this.f9864a;
            if (un0VarMo6018f2 == null) {
                un0VarMo6018f2 = bb2Var.f1285a.mo6018f(2);
            }
            if (un0VarMo6018f == null) {
                un0VarMo6018f = bb2Var.f1285a.mo6018f(1);
            }
            mo4789g(un0.m6513a(un0VarMo6018f, un0VarMo6018f2));
            un0 un0Var = this.f9865b[ua0.m6426E(16)];
            if (un0Var != null) {
                mo5239f(un0Var);
            }
            un0 un0Var2 = this.f9865b[ua0.m6426E(32)];
            if (un0Var2 != null) {
                mo5238d(un0Var2);
            }
            un0 un0Var3 = this.f9865b[ua0.m6426E(64)];
            if (un0Var3 != null) {
                mo5240h(un0Var3);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract bb2 mo4787b();

    /* JADX INFO: renamed from: c */
    public void mo5462c(int i, un0 un0Var) {
        if (this.f9865b == null) {
            this.f9865b = new un0[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.f9865b[ua0.m6426E(i2)] = un0Var;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo4788e(un0 un0Var);

    /* JADX INFO: renamed from: g */
    public abstract void mo4789g(un0 un0Var);

    public ra2(bb2 bb2Var) {
        this.f9864a = bb2Var;
    }

    /* JADX INFO: renamed from: d */
    public void mo5238d(un0 un0Var) {
    }

    /* JADX INFO: renamed from: f */
    public void mo5239f(un0 un0Var) {
    }

    /* JADX INFO: renamed from: h */
    public void mo5240h(un0 un0Var) {
    }
}

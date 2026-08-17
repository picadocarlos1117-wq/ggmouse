package p000;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: mr */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1118mr implements v21, d40 {

    /* JADX INFO: renamed from: a */
    public final Object f7078a;

    /* JADX INFO: renamed from: b */
    public c40 f7079b;

    /* JADX INFO: renamed from: c */
    public c40 f7080c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC1234or f7081d;

    public C1118mr(AbstractC1234or abstractC1234or, Object obj) {
        this.f7081d = abstractC1234or;
        this.f7079b = new c40(abstractC1234or.f5384c.f1664c, 0, null);
        this.f7080c = new c40(abstractC1234or.f5385d.f1664c, 0, null);
        this.f7078a = obj;
    }

    @Override // p000.v21
    /* JADX INFO: renamed from: a */
    public final void mo63a(int i, q21 q21Var, b21 b21Var) {
        if (m4449f(i, q21Var)) {
            c40 c40Var = this.f7079b;
            b21 b21VarM4450g = m4450g(b21Var, q21Var);
            c40Var.getClass();
            c40Var.m1126a(new C0702h5(11, c40Var, b21VarM4450g));
        }
    }

    @Override // p000.v21
    /* JADX INFO: renamed from: b */
    public final void mo64b(int i, q21 q21Var, su0 su0Var, b21 b21Var) {
        if (m4449f(i, q21Var)) {
            c40 c40Var = this.f7079b;
            b21 b21VarM4450g = m4450g(b21Var, q21Var);
            c40Var.getClass();
            c40Var.m1126a(new s21(c40Var, su0Var, b21VarM4450g, 0));
        }
    }

    @Override // p000.v21
    /* JADX INFO: renamed from: c */
    public final void mo65c(int i, q21 q21Var, su0 su0Var, b21 b21Var) {
        if (m4449f(i, q21Var)) {
            c40 c40Var = this.f7079b;
            b21 b21VarM4450g = m4450g(b21Var, q21Var);
            c40Var.getClass();
            c40Var.m1126a(new s21(c40Var, su0Var, b21VarM4450g, 2));
        }
    }

    @Override // p000.v21
    /* JADX INFO: renamed from: d */
    public final void mo66d(int i, q21 q21Var, su0 su0Var, b21 b21Var) {
        if (m4449f(i, q21Var)) {
            c40 c40Var = this.f7079b;
            b21 b21VarM4450g = m4450g(b21Var, q21Var);
            c40Var.getClass();
            c40Var.m1126a(new s21(c40Var, su0Var, b21VarM4450g, 1));
        }
    }

    @Override // p000.v21
    /* JADX INFO: renamed from: e */
    public final void mo67e(int i, q21 q21Var, su0 su0Var, b21 b21Var, IOException iOException, boolean z) {
        if (m4449f(i, q21Var)) {
            c40 c40Var = this.f7079b;
            b21 b21VarM4450g = m4450g(b21Var, q21Var);
            c40Var.getClass();
            c40Var.m1126a(new t21(c40Var, su0Var, b21VarM4450g, iOException, z));
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    /* JADX INFO: renamed from: f */
    public final boolean m4449f(int i, q21 q21Var) {
        q21 q21VarMo4413s;
        Object obj = this.f7078a;
        AbstractC1234or abstractC1234or = this.f7081d;
        if (q21Var != null) {
            q21VarMo4413s = abstractC1234or.mo4413s(obj, q21Var);
            if (q21VarMo4413s == null) {
                return false;
            }
        } else {
            q21VarMo4413s = null;
        }
        int iMo4415u = abstractC1234or.mo4415u(i, obj);
        c40 c40Var = this.f7079b;
        if (c40Var.f1662a == iMo4415u) {
            q21 q21Var2 = c40Var.f1663b;
            int i2 = z42.f13274a;
            if (!Objects.equals(q21Var2, q21VarMo4413s)) {
                this.f7079b = new c40(abstractC1234or.f5384c.f1664c, iMo4415u, q21VarMo4413s);
            }
        } else {
            this.f7079b = new c40(abstractC1234or.f5384c.f1664c, iMo4415u, q21VarMo4413s);
        }
        c40 c40Var2 = this.f7080c;
        if (c40Var2.f1662a == iMo4415u) {
            q21 q21Var3 = c40Var2.f1663b;
            int i3 = z42.f13274a;
            if (Objects.equals(q21Var3, q21VarMo4413s)) {
                return true;
            }
        }
        this.f7080c = new c40(abstractC1234or.f5385d.f1664c, iMo4415u, q21VarMo4413s);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final b21 m4450g(b21 b21Var, q21 q21Var) {
        long j = b21Var.f1131c;
        AbstractC1234or abstractC1234or = this.f7081d;
        Object obj = this.f7078a;
        long jMo4414t = abstractC1234or.mo4414t(j, obj);
        long j2 = b21Var.f1132d;
        long jMo4414t2 = abstractC1234or.mo4414t(j2, obj);
        return (jMo4414t == j && jMo4414t2 == j2) ? b21Var : new b21(b21Var.f1129a, b21Var.f1130b, jMo4414t, jMo4414t2);
    }
}

package p000;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class a31 implements v21, d40 {

    /* JADX INFO: renamed from: a */
    public final c31 f41a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ d31 f42b;

    public a31(d31 d31Var, c31 c31Var) {
        this.f42b = d31Var;
        this.f41a = c31Var;
    }

    @Override // p000.v21
    /* JADX INFO: renamed from: a */
    public final void mo63a(int i, q21 q21Var, b21 b21Var) {
        Pair pairM68f = m68f(i, q21Var);
        if (pairM68f != null) {
            ((zy1) this.f42b.f2771j).m7387c(new RunnableC1436ta(this, pairM68f, b21Var, 9));
        }
    }

    @Override // p000.v21
    /* JADX INFO: renamed from: b */
    public final void mo64b(int i, q21 q21Var, su0 su0Var, b21 b21Var) {
        Pair pairM68f = m68f(i, q21Var);
        if (pairM68f != null) {
            ((zy1) this.f42b.f2771j).m7387c(new y21(this, pairM68f, su0Var, b21Var, 1));
        }
    }

    @Override // p000.v21
    /* JADX INFO: renamed from: c */
    public final void mo65c(int i, q21 q21Var, su0 su0Var, b21 b21Var) {
        Pair pairM68f = m68f(i, q21Var);
        if (pairM68f != null) {
            ((zy1) this.f42b.f2771j).m7387c(new y21(this, pairM68f, su0Var, b21Var, 0));
        }
    }

    @Override // p000.v21
    /* JADX INFO: renamed from: d */
    public final void mo66d(int i, q21 q21Var, su0 su0Var, b21 b21Var) {
        Pair pairM68f = m68f(i, q21Var);
        if (pairM68f != null) {
            ((zy1) this.f42b.f2771j).m7387c(new y21(this, pairM68f, su0Var, b21Var, 2));
        }
    }

    @Override // p000.v21
    /* JADX INFO: renamed from: e */
    public final void mo67e(int i, q21 q21Var, final su0 su0Var, final b21 b21Var, final IOException iOException, final boolean z) {
        final Pair pairM68f = m68f(i, q21Var);
        if (pairM68f != null) {
            ((zy1) this.f42b.f2771j).m7387c(new Runnable() { // from class: z21
                @Override // java.lang.Runnable
                public final void run() {
                    C0808jy c0808jy = (C0808jy) this.f13241a.f42b.f2770i;
                    Pair pair = pairM68f;
                    c0808jy.mo67e(((Integer) pair.first).intValue(), (q21) pair.second, su0Var, b21Var, iOException, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public final Pair m68f(int i, q21 q21Var) {
        q21 q21VarM5437a;
        c31 c31Var = this.f41a;
        q21 q21Var2 = null;
        if (q21Var != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= c31Var.f1657c.size()) {
                    q21VarM5437a = null;
                    break;
                }
                if (((q21) c31Var.f1657c.get(i2)).f9312d == q21Var.f9312d) {
                    Object obj = q21Var.f9309a;
                    Object obj2 = c31Var.f1656b;
                    int i3 = gf1.f4174k;
                    q21VarM5437a = q21Var.m5437a(Pair.create(obj2, obj));
                    break;
                }
                i2++;
            }
            if (q21VarM5437a == null) {
                return null;
            }
            q21Var2 = q21VarM5437a;
        }
        return Pair.create(Integer.valueOf(i + c31Var.f1658d), q21Var2);
    }
}

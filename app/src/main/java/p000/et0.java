package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class et0 extends ft0 {
    @Override // p000.ft0
    /* JADX INFO: renamed from: a */
    public final void mo2387a(long j, Object obj) {
        AbstractC1316q1 abstractC1316q1 = (AbstractC1316q1) ((mo0) k42.f5664c.m3556k(j, obj));
        if (abstractC1316q1.f9289a) {
            abstractC1316q1.f9289a = false;
        }
    }

    @Override // p000.ft0
    /* JADX INFO: renamed from: b */
    public final void mo2388b(Object obj, long j, Object obj2) {
        j42 j42Var = k42.f5664c;
        mo0 mo0VarMo2783d = (mo0) j42Var.m3556k(j, obj);
        mo0 mo0Var = (mo0) j42Var.m3556k(j, obj2);
        int size = mo0VarMo2783d.size();
        int size2 = mo0Var.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC1316q1) mo0VarMo2783d).f9289a) {
                mo0VarMo2783d = mo0VarMo2783d.mo2783d(size2 + size);
            }
            mo0VarMo2783d.addAll(mo0Var);
        }
        if (size > 0) {
            mo0Var = mo0VarMo2783d;
        }
        k42.m3791p(obj, j, mo0Var);
    }

    @Override // p000.ft0
    /* JADX INFO: renamed from: c */
    public final List mo2389c(long j, Object obj) {
        mo0 mo0Var = (mo0) k42.f5664c.m3556k(j, obj);
        if (((AbstractC1316q1) mo0Var).f9289a) {
            return mo0Var;
        }
        int size = mo0Var.size();
        mo0 mo0VarMo2783d = mo0Var.mo2783d(size == 0 ? 10 : size * 2);
        k42.m3791p(obj, j, mo0VarMo2783d);
        return mo0VarMo2783d;
    }
}

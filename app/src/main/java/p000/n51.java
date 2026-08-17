package p000;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class n51 implements b90 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7241a;

    /* JADX INFO: renamed from: b */
    public final qh1 f7242b;

    /* JADX INFO: renamed from: c */
    public final qh1 f7243c;

    public /* synthetic */ n51(qh1 qh1Var, qh1 qh1Var2, int i) {
        this.f7241a = i;
        this.f7242b = qh1Var;
        this.f7243c = qh1Var2;
    }

    @Override // p000.qh1
    public final Object get() {
        int i = this.f7241a;
        qh1 qh1Var = this.f7242b;
        switch (i) {
            case 0:
                return new m51((Context) ((C1641yu) qh1Var).f13148b, (C1174o9) ((C1641yu) this.f7243c).get());
            default:
                return new no1(new ax0(17), new ax0(14), C1624yd.f12954f, (sp1) qh1Var.get(), this.f7243c);
        }
    }
}

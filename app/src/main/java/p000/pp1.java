package p000;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class pp1 implements b90 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9039a;

    /* JADX INFO: renamed from: b */
    public final qh1 f9040b;

    /* JADX INFO: renamed from: c */
    public final qh1 f9041c;

    /* JADX INFO: renamed from: d */
    public final b90 f9042d;

    public /* synthetic */ pp1(qh1 qh1Var, qh1 qh1Var2, b90 b90Var, int i) {
        this.f9039a = i;
        this.f9040b = qh1Var;
        this.f9041c = qh1Var2;
        this.f9042d = b90Var;
    }

    @Override // p000.qh1
    public final Object get() {
        int i = this.f9039a;
        b90 b90Var = this.f9042d;
        qh1 qh1Var = this.f9041c;
        qh1 qh1Var2 = this.f9040b;
        switch (i) {
            case 0:
                return new C1174o9((Context) qh1Var2.get(), qh1Var.get(), ((h70) b90Var).get(), 14);
            default:
                return new d32(new ax0(17), new ax0(14), (h00) ((i00) qh1Var2).get(), (p42) ((q42) qh1Var).get(), (C0599ed) ((lb2) b90Var).get());
        }
    }
}

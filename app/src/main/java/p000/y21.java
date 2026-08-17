package p000;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y21 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12807a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ a31 f12808b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Pair f12809c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ su0 f12810d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ b21 f12811e;

    public /* synthetic */ y21(a31 a31Var, Pair pair, su0 su0Var, b21 b21Var, int i) {
        this.f12807a = i;
        this.f12808b = a31Var;
        this.f12809c = pair;
        this.f12810d = su0Var;
        this.f12811e = b21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f12807a;
        b21 b21Var = this.f12811e;
        su0 su0Var = this.f12810d;
        Pair pair = this.f12809c;
        a31 a31Var = this.f12808b;
        switch (i) {
            case 0:
                ((C0808jy) a31Var.f42b.f2770i).mo65c(((Integer) pair.first).intValue(), (q21) pair.second, su0Var, b21Var);
                break;
            case 1:
                ((C0808jy) a31Var.f42b.f2770i).mo64b(((Integer) pair.first).intValue(), (q21) pair.second, su0Var, b21Var);
                break;
            default:
                ((C0808jy) a31Var.f42b.f2770i).mo66d(((Integer) pair.first).intValue(), (q21) pair.second, su0Var, b21Var);
                break;
        }
    }
}

package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class kv1 {

    /* JADX INFO: renamed from: a */
    public final rc2[] f6043a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f6044b = new AtomicBoolean(false);

    static {
        new kv1(new rc2[0]);
    }

    public kv1(rc2[] rc2VarArr) {
        this.f6043a = rc2VarArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m4000a(long j) {
        for (rc2 rc2Var : this.f6043a) {
            rc2Var.mo4521S(j);
        }
    }
}

package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class y90 implements vq1 {

    /* JADX INFO: renamed from: a */
    public final vq1 f12868a;

    /* JADX INFO: renamed from: b */
    public final boolean f12869b;

    /* JADX INFO: renamed from: c */
    public final og0 f12870c;

    public y90(vq1 vq1Var, boolean z, og0 og0Var) {
        this.f12868a = vq1Var;
        this.f12869b = z;
        this.f12870c = og0Var;
    }

    @Override // p000.vq1
    public final Iterator iterator() {
        return new x90(this);
    }
}

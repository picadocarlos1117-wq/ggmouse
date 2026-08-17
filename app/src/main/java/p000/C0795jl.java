package p000;

import android.graphics.Typeface;

/* JADX INFO: renamed from: jl */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0795jl extends o21 {

    /* JADX INFO: renamed from: i */
    public final Typeface f5440i;

    /* JADX INFO: renamed from: j */
    public final ay0 f5441j;

    /* JADX INFO: renamed from: k */
    public boolean f5442k;

    public C0795jl(ay0 ay0Var, Typeface typeface) {
        this.f5440i = typeface;
        this.f5441j = ay0Var;
    }

    @Override // p000.o21
    /* JADX INFO: renamed from: b0 */
    public final void mo3456b0(int i) {
        if (this.f5442k) {
            return;
        }
        C1303pp c1303pp = (C1303pp) this.f5441j.f1096b;
        if (c1303pp.m5305j(this.f5440i)) {
            c1303pp.m5303h(false);
        }
    }

    @Override // p000.o21
    /* JADX INFO: renamed from: c0 */
    public final void mo3457c0(Typeface typeface, boolean z) {
        if (this.f5442k) {
            return;
        }
        C1303pp c1303pp = (C1303pp) this.f5441j.f1096b;
        if (c1303pp.m5305j(typeface)) {
            c1303pp.m5303h(false);
        }
    }
}

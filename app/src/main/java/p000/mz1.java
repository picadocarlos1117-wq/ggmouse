package p000;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class mz1 extends AbstractC1337qm {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ o21 f7151h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ oz1 f7152i;

    public mz1(oz1 oz1Var, o21 o21Var) {
        this.f7152i = oz1Var;
        this.f7151h = o21Var;
    }

    @Override // p000.AbstractC1337qm
    /* JADX INFO: renamed from: M */
    public final void mo4487M(int i) {
        this.f7152i.f8601m = true;
        this.f7151h.mo3456b0(i);
    }

    @Override // p000.AbstractC1337qm
    /* JADX INFO: renamed from: N */
    public final void mo4488N(Typeface typeface) {
        oz1 oz1Var = this.f7152i;
        Typeface typefaceCreate = Typeface.create(typeface, oz1Var.f8591c);
        oz1Var.f8602n = typefaceCreate;
        oz1Var.f8601m = true;
        this.f7151h.mo3457c0(typefaceCreate, false);
    }
}

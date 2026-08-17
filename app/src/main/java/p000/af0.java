package p000;

import androidx.fragment.app.AbstractC0056t;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class af0 extends ia1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0056t f215a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af0(AbstractC0056t abstractC0056t) {
        super(false);
        this.f215a = abstractC0056t;
    }

    @Override // p000.ia1
    public final void handleOnBackPressed() {
        AbstractC0056t abstractC0056t = this.f215a;
        abstractC0056t.m412x(true);
        if (abstractC0056t.f719h.isEnabled()) {
            abstractC0056t.m375M();
        } else {
            abstractC0056t.f718g.m5754b();
        }
    }
}

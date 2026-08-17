package p000;

/* JADX INFO: renamed from: d */
/* JADX INFO: loaded from: classes3.dex */
public final class C0549d extends AbstractC0550d0 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f2690c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0549d(Class cls, int i) {
        super(cls, 0);
        this.f2690c = i;
    }

    @Override // p000.AbstractC0550d0
    /* JADX INFO: renamed from: c */
    public AbstractC1536w mo2148c(AbstractC1647z abstractC1647z) {
        switch (this.f2690c) {
            case 0:
                return abstractC1647z.mo3142z();
            case 1:
            case 2:
            case 3:
            default:
                return super.mo2148c(abstractC1647z);
            case 4:
                return abstractC1647z.mo3140A();
            case 5:
                return abstractC1647z;
            case 6:
                return abstractC1647z.mo3141B();
        }
    }

    @Override // p000.AbstractC0550d0
    /* JADX INFO: renamed from: d */
    public AbstractC1536w mo2149d(C1123mw c1123mw) {
        switch (this.f2690c) {
            case 0:
                return AbstractC0585e.m2433u(c1123mw.f10174a);
            case 1:
                return new C0768iw(c1123mw.f10174a);
            case 2:
                return new C1127n(c1123mw.f10174a);
            case 3:
                return C1351r.m5633w(c1123mw.f10174a, false);
            case 4:
                return c1123mw;
            default:
                return super.mo2149d(c1123mw);
        }
    }
}

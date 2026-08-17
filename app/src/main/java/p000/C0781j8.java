package p000;

/* JADX INFO: renamed from: j8 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0781j8 extends ge0 {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ C1397s8 f5315o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C1508v8 f5316p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0781j8(C1508v8 c1508v8, C1508v8 c1508v9, C1397s8 c1397s8) {
        super(c1508v9);
        this.f5316p = c1508v8;
        this.f5315o = c1397s8;
    }

    @Override // p000.ge0
    /* JADX INFO: renamed from: b */
    public final us1 mo2962b() {
        return this.f5315o;
    }

    @Override // p000.ge0
    /* JADX INFO: renamed from: c */
    public final boolean mo2963c() {
        C1508v8 c1508v8 = this.f5316p;
        if (c1508v8.getInternalPopup().mo4719b()) {
            return true;
        }
        c1508v8.f11582f.mo4728o(AbstractC1099m8.m4407b(c1508v8), AbstractC1099m8.m4406a(c1508v8));
        return true;
    }
}

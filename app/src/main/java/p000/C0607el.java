package p000;

/* JADX INFO: renamed from: el */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0607el extends AbstractC0084b2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0644fl f3379a;

    public C0607el(C0644fl c0644fl) {
        this.f3379a = c0644fl;
    }

    @Override // p000.AbstractC0084b2
    public final String pendingToString() {
        C0571dl c0571dl = (C0571dl) this.f3379a.f3844a.get();
        if (c0571dl == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + c0571dl.f2959a + "]";
    }
}

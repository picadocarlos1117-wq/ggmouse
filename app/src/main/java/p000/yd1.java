package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class yd1 {

    /* JADX INFO: renamed from: a */
    public final xd1 f12965a;

    public yd1(xd1 xd1Var) {
        this.f12965a = xd1Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m7078a() throws a62 {
        try {
            ((yd1) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(xd1.class).newInstance(this.f12965a)).m7078a();
        } catch (Exception e) {
            if (!(e instanceof a62)) {
                throw new a62(e);
            }
            int i = a62.f73a;
        }
    }
}

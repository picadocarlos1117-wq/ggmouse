package p000;

/* JADX INFO: renamed from: yz */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1646yz implements ey1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13170a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f13171b;

    public /* synthetic */ C1646yz(Object obj, int i) {
        this.f13170a = i;
        this.f13171b = obj;
    }

    @Override // p000.ey1
    public final Object get() {
        int i = this.f13170a;
        Object obj = this.f13171b;
        switch (i) {
            case 0:
                try {
                    return (p21) ((Class) obj).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    lv1.m4302n(e);
                    return null;
                }
            default:
                return Boolean.valueOf(((l80) obj).f6218H);
        }
    }
}

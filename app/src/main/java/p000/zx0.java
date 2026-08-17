package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class zx0 implements w41 {

    /* JADX INFO: renamed from: a */
    public w41[] f13599a;

    @Override // p000.w41
    /* JADX INFO: renamed from: a */
    public final si1 mo6703a(Class cls) {
        for (w41 w41Var : this.f13599a) {
            if (w41Var.mo6704b(cls)) {
                return w41Var.mo6703a(cls);
            }
        }
        C0694gy.m3079e("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: b */
    public final boolean mo6704b(Class cls) {
        for (w41 w41Var : this.f13599a) {
            if (w41Var.mo6704b(cls)) {
                return true;
            }
        }
        return false;
    }
}

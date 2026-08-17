package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class sc1 {

    /* JADX INFO: renamed from: a */
    public final o21 f10353a;

    /* JADX INFO: renamed from: c */
    public final pc1 f10355c;

    /* JADX INFO: renamed from: d */
    public boolean f10356d = false;

    /* JADX INFO: renamed from: b */
    public EnumC0651fs f10354b = EnumC0651fs.f3888d;

    public sc1(o21 o21Var, pc1 pc1Var) {
        this.f10353a = o21Var;
        this.f10355c = pc1Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m6030a(sc1 sc1Var, EnumC0651fs enumC0651fs) {
        sc1Var.f10354b = enumC0651fs;
        if (enumC0651fs == EnumC0651fs.f3886b || enumC0651fs == EnumC0651fs.f3887c) {
            sc1Var.f10356d = true;
        } else if (enumC0651fs == EnumC0651fs.f3888d) {
            sc1Var.f10356d = false;
        }
    }
}

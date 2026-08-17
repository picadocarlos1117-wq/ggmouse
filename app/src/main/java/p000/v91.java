package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class v91 extends AbstractC1128n0 {

    /* JADX INFO: renamed from: p */
    public static final C1073lj f11589p = new C1073lj();

    /* JADX INFO: renamed from: h */
    public final u51 f11590h;

    /* JADX INFO: renamed from: i */
    public final String f11591i;

    /* JADX INFO: renamed from: j */
    public final kv1 f11592j;

    /* JADX INFO: renamed from: k */
    public final String f11593k;

    /* JADX INFO: renamed from: l */
    public final u91 f11594l;

    /* JADX INFO: renamed from: m */
    public final pn0 f11595m;

    /* JADX INFO: renamed from: n */
    public final C1437tb f11596n;

    /* JADX INFO: renamed from: o */
    public boolean f11597o;

    public v91(u51 u51Var, j51 j51Var, f70 f70Var, y91 y91Var, l81 l81Var, Object obj, int i, int i2, String str, String str2, kv1 kv1Var, C0558d8 c0558d8, C0022al c0022al) {
        super(new ax0(5), kv1Var, c0558d8, j51Var, c0022al, false);
        this.f11595m = new pn0(this);
        this.f11597o = false;
        this.f11592j = kv1Var;
        this.f11590h = u51Var;
        this.f11593k = str;
        this.f11591i = str2;
        this.f11596n = y91Var.f12909u;
        String str3 = u51Var.f11126b;
        this.f11594l = new u91(this, i, kv1Var, obj, f70Var, l81Var, y91Var, i2);
    }

    @Override // p000.InterfaceC1339qo
    public final C1437tb getAttributes() {
        return this.f11596n;
    }
}

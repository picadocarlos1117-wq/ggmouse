package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class u61 {

    /* JADX INFO: renamed from: a */
    public final v61 f11134a;

    /* JADX INFO: renamed from: b */
    public final oi0 f11135b;

    /* JADX INFO: renamed from: c */
    public final ou0 f11136c;

    /* JADX INFO: renamed from: d */
    public EnumC0651fs f11137d;

    /* JADX INFO: renamed from: e */
    public lu0 f11138e;

    /* JADX INFO: renamed from: f */
    public boolean f11139f = false;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ cn1 f11140g;

    public u61(cn1 cn1Var, v61 v61Var, xc1 xc1Var, qc1 qc1Var) {
        this.f11140g = cn1Var;
        this.f11134a = v61Var;
        this.f11136c = xc1Var;
        this.f11138e = qc1Var;
        oi0 oi0Var = new oi0(new ek0(this, 1));
        this.f11135b = oi0Var;
        this.f11137d = EnumC0651fs.f3885a;
        oi0Var.m4805t(xc1Var);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address = ");
        sb.append(this.f11134a);
        sb.append(", state = ");
        sb.append(this.f11137d);
        sb.append(", picker type: ");
        sb.append(this.f11138e.getClass());
        sb.append(", lb: ");
        sb.append(this.f11135b.m4803r().getClass());
        sb.append(this.f11139f ? ", deactivated" : "");
        return sb.toString();
    }
}

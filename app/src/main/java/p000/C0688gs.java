package p000;

/* JADX INFO: renamed from: gs */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0688gs {

    /* JADX INFO: renamed from: a */
    public final EnumC0651fs f4304a;

    /* JADX INFO: renamed from: b */
    public final nv1 f4305b;

    public C0688gs(EnumC0651fs enumC0651fs, nv1 nv1Var) {
        this.f4304a = enumC0651fs;
        p32.m5188s(nv1Var, "status is null");
        this.f4305b = nv1Var;
    }

    /* JADX INFO: renamed from: a */
    public static C0688gs m3052a(EnumC0651fs enumC0651fs) {
        p32.m5177l(enumC0651fs != EnumC0651fs.f3887c, "state is TRANSIENT_ERROR. Use forError() instead");
        return new C0688gs(enumC0651fs, nv1.f7550e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0688gs)) {
            return false;
        }
        C0688gs c0688gs = (C0688gs) obj;
        if (this.f4304a.equals(c0688gs.f4304a)) {
            nv1 nv1Var = c0688gs.f4305b;
            nv1 nv1Var2 = this.f4305b;
            nv1Var2.getClass();
            if (nv1Var2 == nv1Var) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4305b.hashCode() ^ this.f4304a.hashCode();
    }

    public final String toString() {
        nv1 nv1Var = this.f4305b;
        boolean zM4612e = nv1Var.m4612e();
        EnumC0651fs enumC0651fs = this.f4304a;
        if (zM4612e) {
            return enumC0651fs.toString();
        }
        return enumC0651fs + "(" + nv1Var + ")";
    }
}

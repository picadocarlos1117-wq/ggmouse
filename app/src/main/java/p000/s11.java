package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class s11 {

    /* JADX INFO: renamed from: a */
    public final long f10198a;

    static {
        new s11(new bb0());
        z42.m7252z(0);
        z42.m7252z(1);
        z42.m7252z(2);
        z42.m7252z(3);
        z42.m7252z(4);
        z42.m7252z(5);
        z42.m7252z(6);
    }

    public s11(bb0 bb0Var) {
        int i = z42.f13274a;
        this.f10198a = bb0Var.f1280a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s11) && this.f10198a == ((s11) obj).f10198a;
    }

    public final int hashCode() {
        long j = this.f10198a;
        return ((int) (j ^ (j >>> 32))) * 29791;
    }
}

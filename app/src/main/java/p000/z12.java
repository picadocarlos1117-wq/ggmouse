package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class z12 {

    /* JADX INFO: renamed from: d */
    public static final z12 f13236d = new z12(new y12[0]);

    /* JADX INFO: renamed from: a */
    public final int f13237a;

    /* JADX INFO: renamed from: b */
    public final kk1 f13238b;

    /* JADX INFO: renamed from: c */
    public int f13239c;

    static {
        z42.m7252z(0);
    }

    public z12(y12... y12VarArr) {
        kk1 kk1VarM5568p = qm0.m5568p(y12VarArr);
        this.f13238b = kk1VarM5568p;
        this.f13237a = y12VarArr.length;
        int i = 0;
        while (i < kk1VarM5568p.f5898d) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < kk1VarM5568p.f5898d; i3++) {
                if (((y12) kk1VarM5568p.get(i)).equals(kk1VarM5568p.get(i3))) {
                    AbstractC1337qm.m5551n("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final y12 m7184a(int i) {
        return (y12) this.f13238b.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z12.class != obj.getClass()) {
            return false;
        }
        z12 z12Var = (z12) obj;
        return this.f13237a == z12Var.f13237a && this.f13238b.equals(z12Var.f13238b);
    }

    public final int hashCode() {
        if (this.f13239c == 0) {
            this.f13239c = this.f13238b.hashCode();
        }
        return this.f13239c;
    }
}

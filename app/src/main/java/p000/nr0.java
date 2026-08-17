package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class nr0 {

    /* JADX INFO: renamed from: a */
    public final String f7510a;

    /* JADX INFO: renamed from: b */
    public final String f7511b;

    static {
        z42.m7252z(0);
        z42.m7252z(1);
    }

    public nr0(String str, String str2) {
        this.f7510a = z42.m7217E(str);
        this.f7511b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nr0.class == obj.getClass()) {
            nr0 nr0Var = (nr0) obj;
            if (Objects.equals(this.f7510a, nr0Var.f7510a) && Objects.equals(this.f7511b, nr0Var.f7511b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f7511b.hashCode() * 31;
        String str = this.f7510a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}

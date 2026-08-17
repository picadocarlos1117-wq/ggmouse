package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ks1 {

    /* JADX INFO: renamed from: a */
    public final Object f5997a;

    public ks1(Object obj) {
        this.f5997a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ks1.class == obj.getClass() && Objects.equals(this.f5997a, ((ks1) obj).f5997a);
    }

    public final int hashCode() {
        return Objects.hash(this.f5997a, null);
    }
}

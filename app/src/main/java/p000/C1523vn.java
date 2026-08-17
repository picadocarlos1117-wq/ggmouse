package p000;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: vn */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1523vn {

    /* JADX INFO: renamed from: a */
    public final int f11717a;

    /* JADX INFO: renamed from: b */
    public final Method f11718b;

    public C1523vn(int i, Method method) {
        this.f11717a = i;
        this.f11718b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1523vn)) {
            return false;
        }
        C1523vn c1523vn = (C1523vn) obj;
        return this.f11717a == c1523vn.f11717a && this.f11718b.getName().equals(c1523vn.f11718b.getName());
    }

    public final int hashCode() {
        return this.f11718b.getName().hashCode() + (this.f11717a * 31);
    }
}

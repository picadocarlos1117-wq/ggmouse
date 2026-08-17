package p000;

/* JADX INFO: renamed from: ud */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1476ud extends AbstractC1152no {

    /* JADX INFO: renamed from: a */
    public final C1365rd f11262a;

    public C1476ud(C1365rd c1365rd) {
        this.f11262a = c1365rd;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1152no)) {
            return false;
        }
        AbstractC1152no abstractC1152no = (AbstractC1152no) obj;
        Object obj2 = EnumC1115mo.f7055a;
        if (obj2.equals(obj2)) {
            return this.f11262a.equals(((C1476ud) abstractC1152no).f11262a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11262a.hashCode() ^ ((EnumC1115mo.f7055a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + EnumC1115mo.f7055a + ", androidClientInfo=" + this.f11262a + "}";
    }
}

package p000;

/* JADX INFO: renamed from: de */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0564de {

    /* JADX INFO: renamed from: a */
    public final long f2904a;

    /* JADX INFO: renamed from: b */
    public final C0674ge f2905b;

    /* JADX INFO: renamed from: c */
    public final C1587xd f2906c;

    public C0564de(long j, C0674ge c0674ge, C1587xd c1587xd) {
        this.f2904a = j;
        this.f2905b = c0674ge;
        this.f2906c = c1587xd;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0564de)) {
            return false;
        }
        C0564de c0564de = (C0564de) obj;
        return this.f2904a == c0564de.f2904a && this.f2905b.equals(c0564de.f2905b) && this.f2906c.equals(c0564de.f2906c);
    }

    public final int hashCode() {
        long j = this.f2904a;
        return this.f2906c.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f2905b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f2904a + ", transportContext=" + this.f2905b + ", event=" + this.f2906c + "}";
    }
}

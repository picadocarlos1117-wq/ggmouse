package p000;

/* JADX INFO: renamed from: yd */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1624yd {

    /* JADX INFO: renamed from: f */
    public static final C1624yd f12954f = new C1624yd(200, 10000, 10485760, 604800000, 81920);

    /* JADX INFO: renamed from: a */
    public final long f12955a;

    /* JADX INFO: renamed from: b */
    public final int f12956b;

    /* JADX INFO: renamed from: c */
    public final int f12957c;

    /* JADX INFO: renamed from: d */
    public final long f12958d;

    /* JADX INFO: renamed from: e */
    public final int f12959e;

    public C1624yd(int i, int i2, long j, long j2, int i3) {
        this.f12955a = j;
        this.f12956b = i;
        this.f12957c = i2;
        this.f12958d = j2;
        this.f12959e = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1624yd) {
            C1624yd c1624yd = (C1624yd) obj;
            if (this.f12955a == c1624yd.f12955a && this.f12956b == c1624yd.f12956b && this.f12957c == c1624yd.f12957c && this.f12958d == c1624yd.f12958d && this.f12959e == c1624yd.f12959e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f12955a;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f12956b) * 1000003) ^ this.f12957c) * 1000003;
        long j2 = this.f12958d;
        return this.f12959e ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f12955a);
        sb.append(", loadBatchSize=");
        sb.append(this.f12956b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f12957c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f12958d);
        sb.append(", maxBlobByteSizePerRow=");
        return AbstractC1308pu.m5341h(sb, this.f12959e, "}");
    }
}

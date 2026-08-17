package p000;

/* JADX INFO: renamed from: sd */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1402sd {

    /* JADX INFO: renamed from: a */
    public final int f10364a;

    /* JADX INFO: renamed from: b */
    public final long f10365b;

    public C1402sd(int i, long j) {
        if (i == 0) {
            l41.m4051t("Null status");
            throw null;
        }
        this.f10364a = i;
        this.f10365b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1402sd)) {
            return false;
        }
        C1402sd c1402sd = (C1402sd) obj;
        return AbstractC1308pu.m5334a(this.f10364a, c1402sd.f10364a) && this.f10365b == c1402sd.f10365b;
    }

    public final int hashCode() {
        int iM5359z = (AbstractC1308pu.m5359z(this.f10364a) ^ 1000003) * 1000003;
        long j = this.f10365b;
        return ((int) ((j >>> 32) ^ j)) ^ iM5359z;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.f10364a;
        if (i == 1) {
            str = "OK";
        } else if (i == 2) {
            str = "TRANSIENT_ERROR";
        } else if (i != 3) {
            str = i != 4 ? "null" : "INVALID_PAYLOAD";
        } else {
            str = "FATAL_ERROR";
        }
        sb.append(str);
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.f10365b);
        sb.append("}");
        return sb.toString();
    }
}

package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ae */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0015ae extends uv0 {

    /* JADX INFO: renamed from: a */
    public final long f168a;

    /* JADX INFO: renamed from: b */
    public final long f169b;

    /* JADX INFO: renamed from: c */
    public final C1476ud f170c;

    /* JADX INFO: renamed from: d */
    public final Integer f171d;

    /* JADX INFO: renamed from: e */
    public final String f172e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f173f;

    public C0015ae(long j, long j2, C1476ud c1476ud, Integer num, String str, ArrayList arrayList) {
        ai1 ai1Var = ai1.f240a;
        this.f168a = j;
        this.f169b = j2;
        this.f170c = c1476ud;
        this.f171d = num;
        this.f172e = str;
        this.f173f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uv0)) {
            return false;
        }
        C0015ae c0015ae = (C0015ae) ((uv0) obj);
        if (this.f168a != c0015ae.f168a || this.f169b != c0015ae.f169b || !this.f170c.equals(c0015ae.f170c)) {
            return false;
        }
        Integer num = c0015ae.f171d;
        Integer num2 = this.f171d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = c0015ae.f172e;
        String str2 = this.f172e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f173f.equals(c0015ae.f173f)) {
            return false;
        }
        Object obj2 = ai1.f240a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.f168a;
        long j2 = this.f169b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f170c.hashCode()) * 1000003;
        Integer num = this.f171d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f172e;
        return ((this.f173f.hashCode() ^ ((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003)) * 1000003) ^ ai1.f240a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f168a + ", requestUptimeMs=" + this.f169b + ", clientInfo=" + this.f170c + ", logSource=" + this.f171d + ", logSourceName=" + this.f172e + ", logEvents=" + this.f173f + ", qosTier=" + ai1.f240a + "}";
    }
}

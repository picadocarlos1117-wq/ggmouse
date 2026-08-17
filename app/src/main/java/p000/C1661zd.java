package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: zd */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1661zd extends qv0 {

    /* JADX INFO: renamed from: a */
    public final long f13349a;

    /* JADX INFO: renamed from: b */
    public final Integer f13350b;

    /* JADX INFO: renamed from: c */
    public final long f13351c;

    /* JADX INFO: renamed from: d */
    public final byte[] f13352d;

    /* JADX INFO: renamed from: e */
    public final String f13353e;

    /* JADX INFO: renamed from: f */
    public final long f13354f;

    /* JADX INFO: renamed from: g */
    public final j81 f13355g;

    public C1661zd(long j, Integer num, long j2, byte[] bArr, String str, long j3, j81 j81Var) {
        this.f13349a = j;
        this.f13350b = num;
        this.f13351c = j2;
        this.f13352d = bArr;
        this.f13353e = str;
        this.f13354f = j3;
        this.f13355g = j81Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qv0) {
            qv0 qv0Var = (qv0) obj;
            C1661zd c1661zd = (C1661zd) qv0Var;
            if (this.f13349a == c1661zd.f13349a) {
                Integer num = c1661zd.f13350b;
                Integer num2 = this.f13350b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.f13351c == c1661zd.f13351c) {
                        if (Arrays.equals(this.f13352d, qv0Var instanceof C1661zd ? ((C1661zd) qv0Var).f13352d : c1661zd.f13352d)) {
                            String str = c1661zd.f13353e;
                            String str2 = this.f13353e;
                            if (str2 != null ? str2.equals(str) : str == null) {
                                if (this.f13354f == c1661zd.f13354f) {
                                    j81 j81Var = c1661zd.f13355g;
                                    j81 j81Var2 = this.f13355g;
                                    if (j81Var2 != null ? j81Var2.equals(j81Var) : j81Var == null) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f13349a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f13350b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j2 = this.f13351c;
        int iHashCode2 = (((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f13352d)) * 1000003;
        String str = this.f13353e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.f13354f;
        int i2 = (iHashCode3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        j81 j81Var = this.f13355g;
        return i2 ^ (j81Var != null ? j81Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f13349a + ", eventCode=" + this.f13350b + ", eventUptimeMs=" + this.f13351c + ", sourceExtension=" + Arrays.toString(this.f13352d) + ", sourceExtensionJsonProto3=" + this.f13353e + ", timezoneOffsetSeconds=" + this.f13354f + ", networkConnectionInfo=" + this.f13355g + "}";
    }
}

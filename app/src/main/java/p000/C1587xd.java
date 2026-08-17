package p000;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: xd */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1587xd {

    /* JADX INFO: renamed from: a */
    public final String f12576a;

    /* JADX INFO: renamed from: b */
    public final Integer f12577b;

    /* JADX INFO: renamed from: c */
    public final s60 f12578c;

    /* JADX INFO: renamed from: d */
    public final long f12579d;

    /* JADX INFO: renamed from: e */
    public final long f12580e;

    /* JADX INFO: renamed from: f */
    public final Map f12581f;

    public C1587xd(String str, Integer num, s60 s60Var, long j, long j2, HashMap map) {
        this.f12576a = str;
        this.f12577b = num;
        this.f12578c = s60Var;
        this.f12579d = j;
        this.f12580e = j2;
        this.f12581f = map;
    }

    /* JADX INFO: renamed from: a */
    public final String m6917a(String str) {
        String str2 = (String) this.f12581f.get(str);
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: renamed from: b */
    public final int m6918b(String str) {
        String str2 = (String) this.f12581f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* JADX INFO: renamed from: c */
    public final C1470u7 m6919c() {
        C1470u7 c1470u7 = new C1470u7();
        String str = this.f12576a;
        if (str == null) {
            l41.m4051t("Null transportName");
            return null;
        }
        c1470u7.f11141a = str;
        c1470u7.f11142b = this.f12577b;
        s60 s60Var = this.f12578c;
        if (s60Var == null) {
            l41.m4051t("Null encodedPayload");
            return null;
        }
        c1470u7.f11143c = s60Var;
        c1470u7.f11144d = Long.valueOf(this.f12579d);
        c1470u7.f11145e = Long.valueOf(this.f12580e);
        c1470u7.f11146f = new HashMap(this.f12581f);
        return c1470u7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1587xd) {
            C1587xd c1587xd = (C1587xd) obj;
            if (this.f12576a.equals(c1587xd.f12576a)) {
                Integer num = c1587xd.f12577b;
                Integer num2 = this.f12577b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.f12578c.equals(c1587xd.f12578c) && this.f12579d == c1587xd.f12579d && this.f12580e == c1587xd.f12580e && this.f12581f.equals(c1587xd.f12581f)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f12576a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f12577b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f12578c.hashCode()) * 1000003;
        long j = this.f12579d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f12580e;
        return this.f12581f.hashCode() ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f12576a + ", code=" + this.f12577b + ", encodedPayload=" + this.f12578c + ", eventMillis=" + this.f12579d + ", uptimeMillis=" + this.f12580e + ", autoMetadata=" + this.f12581f + "}";
    }
}

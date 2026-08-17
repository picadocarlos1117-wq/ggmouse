package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class f10 {

    /* JADX INFO: renamed from: c */
    public static final Map f3575c;

    /* JADX INFO: renamed from: a */
    public final int f3576a;

    /* JADX INFO: renamed from: b */
    public final String f3577b;

    static {
        HashMap map = new HashMap();
        AbstractC1308pu.m5350q(1, "XMSSMT_SHA2_20/2_256", map, m2674a("SHA-256", 32, 16, 67, 20, 2));
        AbstractC1308pu.m5350q(2, "XMSSMT_SHA2_20/4_256", map, m2674a("SHA-256", 32, 16, 67, 20, 4));
        AbstractC1308pu.m5350q(3, "XMSSMT_SHA2_40/2_256", map, m2674a("SHA-256", 32, 16, 67, 40, 2));
        AbstractC1308pu.m5350q(4, "XMSSMT_SHA2_40/4_256", map, m2674a("SHA-256", 32, 16, 67, 40, 4));
        AbstractC1308pu.m5350q(5, "XMSSMT_SHA2_40/8_256", map, m2674a("SHA-256", 32, 16, 67, 40, 8));
        AbstractC1308pu.m5350q(6, "XMSSMT_SHA2_60/3_256", map, m2674a("SHA-256", 32, 16, 67, 60, 3));
        AbstractC1308pu.m5350q(7, "XMSSMT_SHA2_60/6_256", map, m2674a("SHA-256", 32, 16, 67, 60, 6));
        AbstractC1308pu.m5350q(8, "XMSSMT_SHA2_60/12_256", map, m2674a("SHA-256", 32, 16, 67, 60, 12));
        AbstractC1308pu.m5350q(9, "XMSSMT_SHA2_20/2_512", map, m2674a("SHA-512", 64, 16, 131, 20, 2));
        AbstractC1308pu.m5350q(10, "XMSSMT_SHA2_20/4_512", map, m2674a("SHA-512", 64, 16, 131, 20, 4));
        AbstractC1308pu.m5350q(11, "XMSSMT_SHA2_40/2_512", map, m2674a("SHA-512", 64, 16, 131, 40, 2));
        AbstractC1308pu.m5350q(12, "XMSSMT_SHA2_40/4_512", map, m2674a("SHA-512", 64, 16, 131, 40, 4));
        AbstractC1308pu.m5350q(13, "XMSSMT_SHA2_40/8_512", map, m2674a("SHA-512", 64, 16, 131, 40, 8));
        AbstractC1308pu.m5350q(14, "XMSSMT_SHA2_60/3_512", map, m2674a("SHA-512", 64, 16, 131, 60, 3));
        AbstractC1308pu.m5350q(15, "XMSSMT_SHA2_60/6_512", map, m2674a("SHA-512", 64, 16, 131, 60, 6));
        AbstractC1308pu.m5350q(16, "XMSSMT_SHA2_60/12_512", map, m2674a("SHA-512", 64, 16, 131, 60, 12));
        AbstractC1308pu.m5350q(17, "XMSSMT_SHAKE_20/2_256", map, m2674a("SHAKE128", 32, 16, 67, 20, 2));
        AbstractC1308pu.m5350q(18, "XMSSMT_SHAKE_20/4_256", map, m2674a("SHAKE128", 32, 16, 67, 20, 4));
        AbstractC1308pu.m5350q(19, "XMSSMT_SHAKE_40/2_256", map, m2674a("SHAKE128", 32, 16, 67, 40, 2));
        AbstractC1308pu.m5350q(20, "XMSSMT_SHAKE_40/4_256", map, m2674a("SHAKE128", 32, 16, 67, 40, 4));
        AbstractC1308pu.m5350q(21, "XMSSMT_SHAKE_40/8_256", map, m2674a("SHAKE128", 32, 16, 67, 40, 8));
        AbstractC1308pu.m5350q(22, "XMSSMT_SHAKE_60/3_256", map, m2674a("SHAKE128", 32, 16, 67, 60, 3));
        AbstractC1308pu.m5350q(23, "XMSSMT_SHAKE_60/6_256", map, m2674a("SHAKE128", 32, 16, 67, 60, 6));
        AbstractC1308pu.m5350q(24, "XMSSMT_SHAKE_60/12_256", map, m2674a("SHAKE128", 32, 16, 67, 60, 12));
        AbstractC1308pu.m5350q(25, "XMSSMT_SHAKE_20/2_512", map, m2674a("SHAKE256", 64, 16, 131, 20, 2));
        AbstractC1308pu.m5350q(26, "XMSSMT_SHAKE_20/4_512", map, m2674a("SHAKE256", 64, 16, 131, 20, 4));
        AbstractC1308pu.m5350q(27, "XMSSMT_SHAKE_40/2_512", map, m2674a("SHAKE256", 64, 16, 131, 40, 2));
        AbstractC1308pu.m5350q(28, "XMSSMT_SHAKE_40/4_512", map, m2674a("SHAKE256", 64, 16, 131, 40, 4));
        AbstractC1308pu.m5350q(29, "XMSSMT_SHAKE_40/8_512", map, m2674a("SHAKE256", 64, 16, 131, 40, 8));
        AbstractC1308pu.m5350q(30, "XMSSMT_SHAKE_60/3_512", map, m2674a("SHAKE256", 64, 16, 131, 60, 3));
        AbstractC1308pu.m5350q(31, "XMSSMT_SHAKE_60/6_512", map, m2674a("SHAKE256", 64, 16, 131, 60, 6));
        map.put(m2674a("SHAKE256", 64, 16, 131, 60, 12), new f10(32, "XMSSMT_SHAKE_60/12_512"));
        f3575c = Collections.unmodifiableMap(map);
    }

    public f10(int i, String str) {
        this.f3576a = i;
        this.f3577b = str;
    }

    /* JADX INFO: renamed from: a */
    public static String m2674a(String str, int i, int i2, int i3, int i4, int i5) {
        if (str == null) {
            l41.m4051t("algorithmName == null");
            return null;
        }
        return str + "-" + i + "-" + i2 + "-" + i3 + "-" + i4 + "-" + i5;
    }

    public final String toString() {
        return this.f3577b;
    }
}

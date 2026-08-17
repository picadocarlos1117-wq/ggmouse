package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class g10 {

    /* JADX INFO: renamed from: c */
    public static final Map f3945c;

    /* JADX INFO: renamed from: a */
    public final int f3946a;

    /* JADX INFO: renamed from: b */
    public final String f3947b;

    static {
        HashMap map = new HashMap();
        map.put(m2884a("SHA-256", 32, 16, 67, 10), new g10(1, "XMSS_SHA2_10_256"));
        map.put(m2884a("SHA-256", 32, 16, 67, 16), new g10(2, "XMSS_SHA2_16_256"));
        map.put(m2884a("SHA-256", 32, 16, 67, 20), new g10(3, "XMSS_SHA2_20_256"));
        map.put(m2884a("SHA-512", 64, 16, 131, 10), new g10(4, "XMSS_SHA2_10_512"));
        map.put(m2884a("SHA-512", 64, 16, 131, 16), new g10(5, "XMSS_SHA2_16_512"));
        map.put(m2884a("SHA-512", 64, 16, 131, 20), new g10(6, "XMSS_SHA2_20_512"));
        map.put(m2884a("SHAKE128", 32, 16, 67, 10), new g10(7, "XMSS_SHAKE_10_256"));
        map.put(m2884a("SHAKE128", 32, 16, 67, 16), new g10(8, "XMSS_SHAKE_16_256"));
        map.put(m2884a("SHAKE128", 32, 16, 67, 20), new g10(9, "XMSS_SHAKE_20_256"));
        map.put(m2884a("SHAKE256", 64, 16, 131, 10), new g10(10, "XMSS_SHAKE_10_512"));
        map.put(m2884a("SHAKE256", 64, 16, 131, 16), new g10(11, "XMSS_SHAKE_16_512"));
        map.put(m2884a("SHAKE256", 64, 16, 131, 20), new g10(12, "XMSS_SHAKE_20_512"));
        f3945c = Collections.unmodifiableMap(map);
    }

    public g10(int i, String str) {
        this.f3946a = i;
        this.f3947b = str;
    }

    /* JADX INFO: renamed from: a */
    public static String m2884a(String str, int i, int i2, int i3, int i4) {
        return str + "-" + i + "-" + i2 + "-" + i3 + "-" + i4;
    }

    public final String toString() {
        return this.f3947b;
    }
}

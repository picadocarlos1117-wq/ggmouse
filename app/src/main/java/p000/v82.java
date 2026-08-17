package p000;

import io.github.muntashirakon.adb.AdbProtocol;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class v82 {

    /* JADX INFO: renamed from: b */
    public static final Map f11585b;

    /* JADX INFO: renamed from: a */
    public final String f11586a;

    static {
        HashMap map = new HashMap();
        map.put(m6609a(32, 67, "SHA-256"), new v82(AdbProtocol.A_VERSION_SKIP_CHECKSUM, "WOTSP_SHA2-256_W16"));
        map.put(m6609a(64, 131, "SHA-512"), new v82(33554434, "WOTSP_SHA2-512_W16"));
        map.put(m6609a(32, 67, "SHAKE128"), new v82(50331651, "WOTSP_SHAKE128_W16"));
        map.put(m6609a(64, 131, "SHAKE256"), new v82(67108868, "WOTSP_SHAKE256_W16"));
        f11585b = Collections.unmodifiableMap(map);
    }

    public v82(int i, String str) {
        this.f11586a = str;
    }

    /* JADX INFO: renamed from: a */
    public static String m6609a(int i, int i2, String str) {
        return str + "-" + i + "-16-" + i2;
    }

    public final String toString() {
        return this.f11586a;
    }
}

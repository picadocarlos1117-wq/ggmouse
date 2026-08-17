package p000;

import android.sun.security.x509.InvalidityDateExtension;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class rk0 {

    /* JADX INFO: renamed from: a */
    public static final C0717hk f10066a;

    /* JADX INFO: renamed from: b */
    public static final yj0[] f10067b;

    /* JADX INFO: renamed from: c */
    public static final Map f10068c;

    static {
        C0717hk c0717hk = C0717hk.f4607d;
        f10066a = AbstractC1337qm.m5552o(":");
        yj0 yj0Var = new yj0(yj0.f12994h, "");
        C0717hk c0717hk2 = yj0.f12991e;
        yj0 yj0Var2 = new yj0(c0717hk2, "GET");
        yj0 yj0Var3 = new yj0(c0717hk2, "POST");
        C0717hk c0717hk3 = yj0.f12992f;
        yj0 yj0Var4 = new yj0(c0717hk3, "/");
        yj0 yj0Var5 = new yj0(c0717hk3, "/index.html");
        C0717hk c0717hk4 = yj0.f12993g;
        yj0 yj0Var6 = new yj0(c0717hk4, "http");
        yj0 yj0Var7 = new yj0(c0717hk4, "https");
        C0717hk c0717hk5 = yj0.f12990d;
        yj0[] yj0VarArr = {yj0Var, yj0Var2, yj0Var3, yj0Var4, yj0Var5, yj0Var6, yj0Var7, new yj0(c0717hk5, "200"), new yj0(c0717hk5, "204"), new yj0(c0717hk5, "206"), new yj0(c0717hk5, "304"), new yj0(c0717hk5, "400"), new yj0(c0717hk5, "404"), new yj0(c0717hk5, "500"), new yj0("accept-charset", ""), new yj0("accept-encoding", "gzip, deflate"), new yj0("accept-language", ""), new yj0("accept-ranges", ""), new yj0("accept", ""), new yj0("access-control-allow-origin", ""), new yj0("age", ""), new yj0("allow", ""), new yj0("authorization", ""), new yj0("cache-control", ""), new yj0("content-disposition", ""), new yj0("content-encoding", ""), new yj0("content-language", ""), new yj0("content-length", ""), new yj0("content-location", ""), new yj0("content-range", ""), new yj0("content-type", ""), new yj0("cookie", ""), new yj0(InvalidityDateExtension.DATE, ""), new yj0("etag", ""), new yj0("expect", ""), new yj0("expires", ""), new yj0("from", ""), new yj0("host", ""), new yj0("if-match", ""), new yj0("if-modified-since", ""), new yj0("if-none-match", ""), new yj0("if-range", ""), new yj0("if-unmodified-since", ""), new yj0("last-modified", ""), new yj0("link", ""), new yj0(FirebaseAnalytics.Param.LOCATION, ""), new yj0("max-forwards", ""), new yj0("proxy-authenticate", ""), new yj0("proxy-authorization", ""), new yj0("range", ""), new yj0("referer", ""), new yj0("refresh", ""), new yj0("retry-after", ""), new yj0("server", ""), new yj0("set-cookie", ""), new yj0("strict-transport-security", ""), new yj0("transfer-encoding", ""), new yj0("user-agent", ""), new yj0("vary", ""), new yj0("via", ""), new yj0("www-authenticate", "")};
        f10067b = yj0VarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(yj0VarArr[i].f12995a)) {
                linkedHashMap.put(yj0VarArr[i].f12995a, Integer.valueOf(i));
            }
        }
        f10068c = Collections.unmodifiableMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: a */
    public static void m5856a(C0717hk c0717hk) {
        int iMo3164d = c0717hk.mo3164d();
        for (int i = 0; i < iMo3164d; i++) {
            byte bMo3167g = c0717hk.mo3167g(i);
            if (bMo3167g >= 65 && bMo3167g <= 90) {
                ca0.m1178j("PROTOCOL_ERROR response malformed: mixed case name: ".concat(c0717hk.m3172m()));
                return;
            }
        }
    }
}

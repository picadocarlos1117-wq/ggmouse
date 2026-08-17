package p000;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class y71 {

    /* JADX INFO: renamed from: d */
    public static final Logger f12859d = Logger.getLogger(y71.class.getName());

    /* JADX INFO: renamed from: e */
    public static y71 f12860e;

    /* JADX INFO: renamed from: a */
    public String f12861a = "unknown";

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f12862b = new LinkedHashSet();

    /* JADX INFO: renamed from: c */
    public pk1 f12863c = pk1.f8924g;

    /* JADX INFO: renamed from: a */
    public final synchronized void m7029a() {
        try {
            HashMap map = new HashMap();
            String str = "unknown";
            byte b = -2147483648;
            for (x71 x71Var : this.f12862b) {
                x71Var.getClass();
                if (((x71) map.get("dns")) == null) {
                    map.put("dns", x71Var);
                }
                if (b < 5) {
                    str = "dns";
                    b = 5;
                }
            }
            this.f12863c = pk1.m5273a(map);
            this.f12861a = str;
        } catch (Throwable th) {
            throw th;
        }
    }
}

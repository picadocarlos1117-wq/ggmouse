package p000;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class fr1 {

    /* JADX INFO: renamed from: a */
    public final String f3883a;

    /* JADX INFO: renamed from: b */
    public final Map f3884b;

    public fr1(String str, Map map) {
        p32.m5188s(str, "policyName");
        this.f3883a = str;
        p32.m5188s(map, "rawConfigValue");
        this.f3884b = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fr1) {
            fr1 fr1Var = (fr1) obj;
            if (this.f3883a.equals(fr1Var.f3883a) && this.f3884b.equals(fr1Var.f3884b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3883a, this.f3884b});
    }

    public final String toString() {
        C1679zv c1679zvM5176k0 = p32.m5176k0(this);
        c1679zvM5176k0.m7359a(this.f3883a, "policyName");
        c1679zvM5176k0.m7359a(this.f3884b, "rawConfigValue");
        return c1679zvM5176k0.toString();
    }
}

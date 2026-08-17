package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ku0 {

    /* JADX INFO: renamed from: a */
    public final List f6022a;

    /* JADX INFO: renamed from: b */
    public final C1437tb f6023b;

    /* JADX INFO: renamed from: c */
    public final Object f6024c;

    public ku0(List list, C1437tb c1437tb, Object obj) {
        p32.m5188s(list, "addresses");
        this.f6022a = Collections.unmodifiableList(new ArrayList(list));
        p32.m5188s(c1437tb, "attributes");
        this.f6023b = c1437tb;
        this.f6024c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ku0)) {
            return false;
        }
        ku0 ku0Var = (ku0) obj;
        return hr1.m3275k(this.f6022a, ku0Var.f6022a) && hr1.m3275k(this.f6023b, ku0Var.f6023b) && hr1.m3275k(this.f6024c, ku0Var.f6024c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6022a, this.f6023b, this.f6024c});
    }

    public final String toString() {
        C1679zv c1679zvM5176k0 = p32.m5176k0(this);
        c1679zvM5176k0.m7359a(this.f6022a, "addresses");
        c1679zvM5176k0.m7359a(this.f6023b, "attributes");
        c1679zvM5176k0.m7359a(this.f6024c, "loadBalancingPolicyConfig");
        return c1679zvM5176k0.toString();
    }
}

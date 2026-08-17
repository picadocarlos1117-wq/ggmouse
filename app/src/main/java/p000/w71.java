package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class w71 {

    /* JADX INFO: renamed from: a */
    public final List f12017a;

    /* JADX INFO: renamed from: b */
    public final C1437tb f12018b;

    /* JADX INFO: renamed from: c */
    public final v71 f12019c;

    public w71(List list, C1437tb c1437tb, v71 v71Var) {
        this.f12017a = Collections.unmodifiableList(new ArrayList(list));
        p32.m5188s(c1437tb, "attributes");
        this.f12018b = c1437tb;
        this.f12019c = v71Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w71)) {
            return false;
        }
        w71 w71Var = (w71) obj;
        return hr1.m3275k(this.f12017a, w71Var.f12017a) && hr1.m3275k(this.f12018b, w71Var.f12018b) && hr1.m3275k(this.f12019c, w71Var.f12019c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12017a, this.f12018b, this.f12019c});
    }

    public final String toString() {
        C1679zv c1679zvM5176k0 = p32.m5176k0(this);
        c1679zvM5176k0.m7359a(this.f12017a, "addresses");
        c1679zvM5176k0.m7359a(this.f12018b, "attributes");
        c1679zvM5176k0.m7359a(this.f12019c, "serviceConfig");
        return c1679zvM5176k0.toString();
    }
}

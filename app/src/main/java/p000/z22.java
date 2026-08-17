package p000;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class z22 {

    /* JADX INFO: renamed from: b */
    public final View f13248b;

    /* JADX INFO: renamed from: a */
    public final HashMap f13247a = new HashMap();

    /* JADX INFO: renamed from: c */
    public final ArrayList f13249c = new ArrayList();

    public z22(View view) {
        this.f13248b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z22)) {
            return false;
        }
        z22 z22Var = (z22) obj;
        return this.f13248b == z22Var.f13248b && this.f13247a.equals(z22Var.f13247a);
    }

    public final int hashCode() {
        return this.f13247a.hashCode() + (this.f13248b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbM5346m = AbstractC1308pu.m5346m("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbM5346m.append(this.f13248b);
        sbM5346m.append("\n");
        String strConcat = sbM5346m.toString().concat("    values:");
        HashMap map = this.f13247a;
        for (String str : map.keySet()) {
            strConcat = strConcat + "    " + str + ": " + map.get(str) + "\n";
        }
        return strConcat;
    }
}

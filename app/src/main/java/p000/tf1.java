package p000;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public final class tf1 implements sf1, Serializable {

    /* JADX INFO: renamed from: a */
    public final List f10862a;

    public tf1(List list) {
        this.f10862a = list;
    }

    @Override // p000.sf1
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.f10862a;
            if (i >= list.size()) {
                return true;
            }
            if (!((sf1) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tf1) {
            return this.f10862a.equals(((tf1) obj).f10862a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10862a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.f10862a) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}

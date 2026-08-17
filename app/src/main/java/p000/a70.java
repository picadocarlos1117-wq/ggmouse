package p000;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class a70 {

    /* JADX INFO: renamed from: d */
    public static final C1400sb f80d = new C1400sb("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* JADX INFO: renamed from: a */
    public final List f81a;

    /* JADX INFO: renamed from: b */
    public final C1437tb f82b;

    /* JADX INFO: renamed from: c */
    public final int f83c;

    public a70(SocketAddress socketAddress) {
        C1437tb c1437tb = C1437tb.f10816b;
        List listSingletonList = Collections.singletonList(socketAddress);
        p32.m5177l(!listSingletonList.isEmpty(), "addrs is empty");
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(listSingletonList));
        this.f81a = listUnmodifiableList;
        p32.m5188s(c1437tb, "attrs");
        this.f82b = c1437tb;
        this.f83c = listUnmodifiableList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a70)) {
            return false;
        }
        a70 a70Var = (a70) obj;
        List list = a70Var.f81a;
        List list2 = this.f81a;
        if (list2.size() != list.size()) {
            return false;
        }
        for (int i = 0; i < list2.size(); i++) {
            if (!((SocketAddress) list2.get(i)).equals(list.get(i))) {
                return false;
            }
        }
        return this.f82b.equals(a70Var.f82b);
    }

    public final int hashCode() {
        return this.f83c;
    }

    public final String toString() {
        return "[" + this.f81a + "/" + this.f82b + "]";
    }
}

package p000;

import java.net.SocketAddress;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class v61 {

    /* JADX INFO: renamed from: a */
    public final String[] f11567a;

    /* JADX INFO: renamed from: b */
    public final int f11568b;

    public v61(a70 a70Var) {
        p32.m5188s(a70Var, "eag");
        List list = a70Var.f81a;
        this.f11567a = new String[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            this.f11567a[i] = ((SocketAddress) it.next()).toString();
            i++;
        }
        Arrays.sort(this.f11567a);
        this.f11568b = Arrays.hashCode(this.f11567a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof v61)) {
            return false;
        }
        v61 v61Var = (v61) obj;
        if (v61Var.f11568b == this.f11568b) {
            String[] strArr = v61Var.f11567a;
            int length = strArr.length;
            String[] strArr2 = this.f11567a;
            if (length == strArr2.length) {
                return Arrays.equals(strArr, strArr2);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11568b;
    }

    public final String toString() {
        return Arrays.toString(this.f11567a);
    }
}

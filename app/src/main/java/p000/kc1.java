package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class kc1 {

    /* JADX INFO: renamed from: a */
    public int[] f5748a;

    public final boolean equals(Object obj) {
        if (obj instanceof kc1) {
            return o21.m4688x(this.f5748a, ((kc1) obj).f5748a);
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f5748a;
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ iArr[length];
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int[] iArr = this.f5748a;
        sb.append(iArr[0]);
        String string = sb.toString();
        for (int i = 1; i < iArr.length; i++) {
            StringBuilder sbM5346m = AbstractC1308pu.m5346m(string, ", ");
            sbM5346m.append(iArr[i]);
            string = sbM5346m.toString();
        }
        return string.concat("]");
    }
}

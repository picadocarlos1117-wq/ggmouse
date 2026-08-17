package p000;

/* JADX INFO: renamed from: y4 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1615y4 {

    /* JADX INFO: renamed from: a */
    public int f12828a;

    /* JADX INFO: renamed from: b */
    public int f12829b;

    /* JADX INFO: renamed from: c */
    public Object f12830c;

    /* JADX INFO: renamed from: d */
    public int f12831d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1615y4)) {
                return false;
            }
            C1615y4 c1615y4 = (C1615y4) obj;
            int i = this.f12828a;
            if (i != c1615y4.f12828a) {
                return false;
            }
            if (i != 8 || Math.abs(this.f12831d - this.f12829b) != 1 || this.f12831d != c1615y4.f12829b || this.f12829b != c1615y4.f12831d) {
                if (this.f12831d != c1615y4.f12831d || this.f12829b != c1615y4.f12829b) {
                    return false;
                }
                Object obj2 = this.f12830c;
                Object obj3 = c1615y4.f12830c;
                if (obj2 != null) {
                    if (!obj2.equals(obj3)) {
                        return false;
                    }
                } else if (obj3 != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f12828a * 31) + this.f12829b) * 31) + this.f12831d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f12828a;
        if (i == 1) {
            str = "add";
        } else if (i == 2) {
            str = "rm";
        } else if (i != 4) {
            str = i != 8 ? "??" : "mv";
        } else {
            str = "up";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.f12829b);
        sb.append("c:");
        sb.append(this.f12831d);
        sb.append(",p:");
        sb.append(this.f12830c);
        sb.append("]");
        return sb.toString();
    }
}

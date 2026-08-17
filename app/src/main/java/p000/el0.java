package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class el0 {

    /* JADX INFO: renamed from: a */
    public final String f3380a;

    /* JADX INFO: renamed from: b */
    public final int f3381b;

    /* JADX INFO: renamed from: c */
    public final String f3382c;

    public el0(C0082b0 c0082b0) {
        String str = (String) c0082b0.f1104c;
        this.f3380a = (String) c0082b0.f1105d;
        int i = c0082b0.f1103b;
        this.f3381b = i == -1 ? str.equals("http") ? 80 : str.equals("https") ? 443 : -1 : i;
        this.f3382c = c0082b0.toString();
    }

    /* JADX INFO: renamed from: a */
    public static int m2598a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof el0) && ((el0) obj).f3382c.equals(this.f3382c);
    }

    public final int hashCode() {
        return this.f3382c.hashCode();
    }

    public final String toString() {
        return this.f3382c;
    }
}

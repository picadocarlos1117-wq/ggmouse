package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: dn */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0573dn implements Iterable {

    /* JADX INFO: renamed from: a */
    public final char f2977a;

    /* JADX INFO: renamed from: b */
    public final char f2978b;

    /* JADX INFO: renamed from: c */
    public final int f2979c = 1;

    static {
        new C0573dn((char) 1, (char) 0);
    }

    public C0573dn(char c, char c2) {
        this.f2977a = c;
        this.f2978b = (char) ua0.m6463z(c, c2, 1);
    }

    public final boolean equals(Object obj) {
        C0573dn c0573dn;
        char c;
        char c2;
        if (!(obj instanceof C0573dn)) {
            return false;
        }
        char c3 = this.f2977a;
        char c4 = this.f2978b;
        if (c3 >= c4 && c3 != c4 && (c = (c0573dn = (C0573dn) obj).f2977a) >= (c2 = c0573dn.f2978b) && c != c2) {
            return true;
        }
        C0573dn c0573dn2 = (C0573dn) obj;
        return c3 == c0573dn2.f2977a && c4 == c0573dn2.f2978b;
    }

    public final int hashCode() {
        char c = this.f2977a;
        char c2 = this.f2978b;
        if (c >= c2 && c != c2) {
            return -1;
        }
        return (c * 31) + c2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0142cn(this.f2977a, this.f2978b, this.f2979c);
    }

    public final String toString() {
        return this.f2977a + ".." + this.f2978b;
    }
}

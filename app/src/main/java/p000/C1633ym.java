package p000;

/* JADX INFO: renamed from: ym */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1633ym extends AbstractC1596xm {

    /* JADX INFO: renamed from: a */
    public final char f13017a;

    public C1633ym(char c) {
        this.f13017a = c;
    }

    @Override // p000.AbstractC1596xm
    /* JADX INFO: renamed from: a */
    public final boolean mo196a(char c) {
        return c == this.f13017a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.is('");
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c = this.f13017a;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }
}

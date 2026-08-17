package p000;

/* JADX INFO: renamed from: wh */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1554wh {

    /* JADX INFO: renamed from: e */
    public static final byte[] f12175e = new byte[1792];

    /* JADX INFO: renamed from: a */
    public final CharSequence f12176a;

    /* JADX INFO: renamed from: b */
    public final int f12177b;

    /* JADX INFO: renamed from: c */
    public int f12178c;

    /* JADX INFO: renamed from: d */
    public char f12179d;

    static {
        for (int i = 0; i < 1792; i++) {
            f12175e[i] = Character.getDirectionality(i);
        }
    }

    public C1554wh(CharSequence charSequence) {
        this.f12176a = charSequence;
        this.f12177b = charSequence.length();
    }

    /* JADX INFO: renamed from: a */
    public final byte m6791a() {
        int i = this.f12178c - 1;
        CharSequence charSequence = this.f12176a;
        char cCharAt = charSequence.charAt(i);
        this.f12179d = cCharAt;
        boolean zIsLowSurrogate = Character.isLowSurrogate(cCharAt);
        int i2 = this.f12178c;
        if (zIsLowSurrogate) {
            int iCodePointBefore = Character.codePointBefore(charSequence, i2);
            this.f12178c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f12178c = i2 - 1;
        char c = this.f12179d;
        return c < 1792 ? f12175e[c] : Character.getDirectionality(c);
    }
}

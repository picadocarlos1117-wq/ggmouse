package p000;

/* JADX INFO: renamed from: eh */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0603eh extends C0677gh {
    public C0603eh(String str, String str2) {
        this(new C0135ch(str, str2.toCharArray()), (Character) '=');
    }

    @Override // p000.C0677gh
    /* JADX INFO: renamed from: b */
    public final int mo2357b(byte[] bArr, CharSequence charSequence) throws C0640fh {
        CharSequence charSequenceM2986f = m2986f(charSequence);
        int length = charSequenceM2986f.length();
        C0135ch c0135ch = this.f4190a;
        if (!c0135ch.f1802h[length % c0135ch.f1799e]) {
            throw new C0640fh("Invalid input length " + charSequenceM2986f.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceM2986f.length()) {
            int i3 = i + 2;
            int iM1216a = (c0135ch.m1216a(charSequenceM2986f.charAt(i + 1)) << 12) | (c0135ch.m1216a(charSequenceM2986f.charAt(i)) << 18);
            int i4 = i2 + 1;
            bArr[i2] = (byte) (iM1216a >>> 16);
            if (i3 < charSequenceM2986f.length()) {
                int i5 = i + 3;
                int iM1216a2 = iM1216a | (c0135ch.m1216a(charSequenceM2986f.charAt(i3)) << 6);
                int i6 = i2 + 2;
                bArr[i4] = (byte) ((iM1216a2 >>> 8) & 255);
                if (i5 < charSequenceM2986f.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((iM1216a2 | c0135ch.m1216a(charSequenceM2986f.charAt(i5))) & 255);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i2 = i4;
                i = i3;
            }
        }
        return i2;
    }

    @Override // p000.C0677gh
    /* JADX INFO: renamed from: e */
    public final void mo2358e(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        p32.m5190u(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            C0135ch c0135ch = this.f4190a;
            char[] cArr = c0135ch.f1796b;
            char[] cArr2 = c0135ch.f1796b;
            sb.append(cArr[i6 >>> 18]);
            sb.append(cArr2[(i6 >>> 12) & 63]);
            sb.append(cArr2[(i6 >>> 6) & 63]);
            sb.append(cArr2[i6 & 63]);
        }
        if (i2 < i) {
            m2985d(sb, bArr, i2, i - i2);
        }
    }

    public C0603eh(C0135ch c0135ch, Character ch) {
        super(c0135ch, ch);
        p32.m5175k(c0135ch.f1796b.length == 64);
    }
}

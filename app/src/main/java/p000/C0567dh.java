package p000;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: renamed from: dh */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0567dh extends C0677gh {

    /* JADX INFO: renamed from: d */
    public final char[] f2930d;

    public C0567dh(C0135ch c0135ch) {
        super(c0135ch, (Character) null);
        this.f2930d = new char[UserVerificationMethods.USER_VERIFY_NONE];
        char[] cArr = c0135ch.f1796b;
        p32.m5175k(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.f2930d;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // p000.C0677gh
    /* JADX INFO: renamed from: b */
    public final int mo2357b(byte[] bArr, CharSequence charSequence) throws C0640fh {
        if (charSequence.length() % 2 == 1) {
            throw new C0640fh("Invalid input length " + charSequence.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            C0135ch c0135ch = this.f4190a;
            bArr[i2] = (byte) ((c0135ch.m1216a(cCharAt) << 4) | c0135ch.m1216a(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // p000.C0677gh
    /* JADX INFO: renamed from: e */
    public final void mo2358e(StringBuilder sb, byte[] bArr, int i) {
        p32.m5190u(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.f2930d;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }
}

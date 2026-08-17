package p000;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: renamed from: gh */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class C0677gh {

    /* JADX INFO: renamed from: c */
    public static final C0603eh f4189c = new C0603eh("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");

    /* JADX INFO: renamed from: a */
    public final C0135ch f4190a;

    /* JADX INFO: renamed from: b */
    public final Character f4191b;

    static {
        new C0603eh("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new C0677gh("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new C0677gh("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        new C0567dh(new C0135ch("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public C0677gh(C0135ch c0135ch, Character ch) {
        boolean z;
        c0135ch.getClass();
        this.f4190a = c0135ch;
        if (ch != null) {
            char cCharValue = ch.charValue();
            byte[] bArr = c0135ch.f1801g;
            if (cCharValue >= bArr.length || bArr[cCharValue] == -1) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        p32.m5179m(z, "Padding character %s was already in alphabet", ch);
        this.f4191b = ch;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m2983a(String str) {
        try {
            CharSequence charSequenceM2986f = m2986f(str);
            int length = (int) (((((long) this.f4190a.f1798d) * ((long) charSequenceM2986f.length())) + 7) / 8);
            byte[] bArr = new byte[length];
            int iMo2357b = mo2357b(bArr, charSequenceM2986f);
            if (iMo2357b == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[iMo2357b];
            System.arraycopy(bArr, 0, bArr2, 0, iMo2357b);
            return bArr2;
        } catch (C0640fh e) {
            l41.m4045n(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public int mo2357b(byte[] bArr, CharSequence charSequence) throws C0640fh {
        CharSequence charSequenceM2986f = m2986f(charSequence);
        int length = charSequenceM2986f.length();
        C0135ch c0135ch = this.f4190a;
        boolean[] zArr = c0135ch.f1802h;
        int i = c0135ch.f1798d;
        int i2 = c0135ch.f1799e;
        if (!zArr[length % i2]) {
            throw new C0640fh("Invalid input length " + charSequenceM2986f.length());
        }
        int i3 = 0;
        for (int i4 = 0; i4 < charSequenceM2986f.length(); i4 += i2) {
            long jM1216a = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                jM1216a <<= i;
                if (i4 + i6 < charSequenceM2986f.length()) {
                    jM1216a |= (long) c0135ch.m1216a(charSequenceM2986f.charAt(i5 + i4));
                    i5++;
                }
            }
            int i7 = c0135ch.f1800f;
            int i8 = (i7 * 8) - (i5 * i);
            int i9 = (i7 - 1) * 8;
            while (i9 >= i8) {
                bArr[i3] = (byte) ((jM1216a >>> i9) & 255);
                i9 -= 8;
                i3++;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: c */
    public final String m2984c(byte[] bArr) {
        int length = bArr.length;
        p32.m5190u(0, length, bArr.length);
        C0135ch c0135ch = this.f4190a;
        int i = c0135ch.f1799e;
        int i2 = c0135ch.f1800f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(hp0.m3220o(length, i2) * i);
        try {
            mo2358e(sb, bArr, length);
            return sb.toString();
        } catch (IOException e) {
            f40.m2711g(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2985d(StringBuilder sb, byte[] bArr, int i, int i2) {
        p32.m5190u(i, i + i2, bArr.length);
        C0135ch c0135ch = this.f4190a;
        int i3 = c0135ch.f1800f;
        int i4 = c0135ch.f1798d;
        int i5 = 0;
        p32.m5175k(i2 <= i3);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & 255))) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(c0135ch.f1796b[((int) (j >>> (i7 - i5))) & c0135ch.f1797c]);
            i5 += i4;
        }
        Character ch = this.f4191b;
        if (ch != null) {
            while (i5 < c0135ch.f1800f * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo2358e(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        p32.m5190u(0, i, bArr.length);
        while (i2 < i) {
            C0135ch c0135ch = this.f4190a;
            m2985d(sb, bArr, i2, Math.min(c0135ch.f1800f, i - i2));
            i2 += c0135ch.f1800f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0677gh) {
            C0677gh c0677gh = (C0677gh) obj;
            if (this.f4190a.equals(c0677gh.f4190a) && Objects.equals(this.f4191b, c0677gh.f4191b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final CharSequence m2986f(CharSequence charSequence) {
        Character ch = this.f4191b;
        if (ch == null) {
            return charSequence;
        }
        char cCharValue = ch.charValue();
        int length = charSequence.length() - 1;
        while (length >= 0 && charSequence.charAt(length) == cCharValue) {
            length--;
        }
        return charSequence.subSequence(0, length + 1);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f4191b) ^ this.f4190a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        C0135ch c0135ch = this.f4190a;
        sb.append(c0135ch);
        if (8 % c0135ch.f1798d != 0) {
            Character ch = this.f4191b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public C0677gh(String str, String str2) {
        this(new C0135ch(str, str2.toCharArray()), (Character) '=');
    }
}

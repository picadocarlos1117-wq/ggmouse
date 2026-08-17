package p000;

import java.math.BigInteger;
import java.util.Arrays;

/* JADX INFO: renamed from: n */
/* JADX INFO: loaded from: classes3.dex */
public final class C1127n extends AbstractC1536w {

    /* JADX INFO: renamed from: c */
    public static final C0549d f7153c = new C0549d(C1127n.class, 2);

    /* JADX INFO: renamed from: a */
    public final byte[] f7154a;

    /* JADX INFO: renamed from: b */
    public final int f7155b;

    public C1127n(byte[] bArr) {
        if (m4491y(bArr)) {
            f40.m2713i("malformed integer");
            throw null;
        }
        this.f7154a = bArr;
        int length = bArr.length - 1;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (bArr[i] != (bArr[i2] >> 7)) {
                break;
            } else {
                i = i2;
            }
        }
        this.f7155b = i;
    }

    /* JADX INFO: renamed from: u */
    public static C1127n m4489u(Object obj) {
        if (obj == null || (obj instanceof C1127n)) {
            return (C1127n) obj;
        }
        if (!(obj instanceof byte[])) {
            f40.m2713i("illegal object in getInstance: ".concat(obj.getClass().getName()));
            return null;
        }
        try {
            return (C1127n) f7153c.m2151b((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
        }
    }

    /* JADX INFO: renamed from: w */
    public static int m4490w(int i, byte[] bArr) {
        int length = bArr.length;
        int iMax = Math.max(i, length - 4);
        int i2 = bArr[iMax];
        while (true) {
            iMax++;
            if (iMax >= length) {
                return i2;
            }
            i2 = (i2 << 8) | (bArr[iMax] & 255);
        }
    }

    /* JADX INFO: renamed from: y */
    public static boolean m4491y(byte[] bArr) {
        int length = bArr.length;
        if (length != 0) {
            return (length == 1 || bArr[0] != (bArr[1] >> 7) || dh1.m2359a("org.bouncycastle.asn1.allow_unsafe_integer")) ? false : true;
        }
        return true;
    }

    @Override // p000.AbstractC1536w, p000.AbstractC1164o
    public final int hashCode() {
        return sc2.m6079w(this.f7154a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: j */
    public final boolean mo2j(AbstractC1536w abstractC1536w) {
        if (abstractC1536w instanceof C1127n) {
            return Arrays.equals(this.f7154a, ((C1127n) abstractC1536w).f7154a);
        }
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: k */
    public final void mo1094k(C1462u c1462u, boolean z) {
        c1462u.m6367m(2, z, this.f7154a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: m */
    public final boolean mo3m() {
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: n */
    public final int mo1095n(boolean z) {
        return C1462u.m6358f(this.f7154a.length, z);
    }

    public final String toString() {
        return new BigInteger(this.f7154a).toString();
    }

    /* JADX INFO: renamed from: v */
    public final boolean m4492v(int i) {
        byte[] bArr = this.f7154a;
        int length = bArr.length;
        int i2 = this.f7155b;
        return length - i2 <= 4 && m4490w(i2, bArr) == i;
    }

    /* JADX INFO: renamed from: x */
    public final int m4493x() {
        byte[] bArr = this.f7154a;
        int length = bArr.length;
        int i = this.f7155b;
        if (length - i <= 4) {
            return m4490w(i, bArr);
        }
        throw new ArithmeticException("ASN.1 Integer out of int range");
    }

    /* JADX INFO: renamed from: z */
    public final long m4494z() {
        byte[] bArr = this.f7154a;
        int length = bArr.length;
        int i = this.f7155b;
        if (length - i > 8) {
            throw new ArithmeticException("ASN.1 Integer out of long range");
        }
        int length2 = bArr.length;
        int iMax = Math.max(i, length2 - 8);
        long j = bArr[iMax];
        while (true) {
            iMax++;
            if (iMax >= length2) {
                return j;
            }
            j = (j << 8) | ((long) (bArr[iMax] & 255));
        }
    }

    public C1127n(BigInteger bigInteger) {
        this.f7154a = bigInteger.toByteArray();
        this.f7155b = 0;
    }

    public C1127n(long j) {
        this.f7154a = BigInteger.valueOf(j).toByteArray();
        this.f7155b = 0;
    }
}

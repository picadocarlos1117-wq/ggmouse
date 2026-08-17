package p000;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public final class tq1 extends C0717hk {

    /* JADX INFO: renamed from: e */
    public final transient byte[][] f10926e;

    /* JADX INFO: renamed from: f */
    public final transient int[] f10927f;

    public tq1(byte[][] bArr, int[] iArr) {
        super(C0717hk.f4607d.f4608a);
        this.f10926e = bArr;
        this.f10927f = iArr;
    }

    @Override // p000.C0717hk
    /* JADX INFO: renamed from: a */
    public final String mo3162a() {
        throw null;
    }

    @Override // p000.C0717hk
    /* JADX INFO: renamed from: c */
    public final C0717hk mo3163c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f10926e;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f10927f;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new C0717hk(bArrDigest);
    }

    @Override // p000.C0717hk
    /* JADX INFO: renamed from: d */
    public final int mo3164d() {
        return this.f10927f[this.f10926e.length - 1];
    }

    @Override // p000.C0717hk
    /* JADX INFO: renamed from: e */
    public final String mo3165e() {
        return new C0717hk(mo3171l()).mo3165e();
    }

    @Override // p000.C0717hk
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0717hk)) {
            return false;
        }
        C0717hk c0717hk = (C0717hk) obj;
        return c0717hk.mo3164d() == mo3164d() && mo3169j(c0717hk, mo3164d());
    }

    @Override // p000.C0717hk
    /* JADX INFO: renamed from: f */
    public final byte[] mo3166f() {
        return mo3171l();
    }

    @Override // p000.C0717hk
    /* JADX INFO: renamed from: g */
    public final byte mo3167g(int i) {
        byte[][] bArr = this.f10926e;
        int length = bArr.length - 1;
        int[] iArr = this.f10927f;
        ua0.m6451h(iArr[length], i, 1L);
        int iM5527a0 = AbstractC1337qm.m5527a0(this, i);
        return bArr[iM5527a0][(i - (iM5527a0 == 0 ? 0 : iArr[iM5527a0 - 1])) + iArr[bArr.length + iM5527a0]];
    }

    @Override // p000.C0717hk
    public final int hashCode() {
        int i = this.f4609b;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f10926e;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f10927f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f4609b = i3;
        return i3;
    }

    @Override // p000.C0717hk
    /* JADX INFO: renamed from: i */
    public final boolean mo3168i(int i, int i2, int i3, byte[] bArr) {
        bArr.getClass();
        if (i >= 0 && i <= mo3164d() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i4 = i3 + i;
            int iM5527a0 = AbstractC1337qm.m5527a0(this, i);
            while (i < i4) {
                int[] iArr = this.f10927f;
                int i5 = iM5527a0 == 0 ? 0 : iArr[iM5527a0 - 1];
                int i6 = iArr[iM5527a0] - i5;
                byte[][] bArr2 = this.f10926e;
                int i7 = iArr[bArr2.length + iM5527a0];
                int iMin = Math.min(i4, i6 + i5) - i;
                int i8 = (i - i5) + i7;
                byte[] bArr3 = bArr2[iM5527a0];
                bArr3.getClass();
                for (int i9 = 0; i9 < iMin; i9++) {
                    if (bArr3[i9 + i8] == bArr[i9 + i2]) {
                    }
                }
                i2 += iMin;
                i += iMin;
                iM5527a0++;
            }
            return true;
        }
        return false;
    }

    @Override // p000.C0717hk
    /* JADX INFO: renamed from: j */
    public final boolean mo3169j(C0717hk c0717hk, int i) {
        c0717hk.getClass();
        if (mo3164d() - i >= 0) {
            int iM5527a0 = AbstractC1337qm.m5527a0(this, 0);
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int[] iArr = this.f10927f;
                int i4 = iM5527a0 == 0 ? 0 : iArr[iM5527a0 - 1];
                int i5 = iArr[iM5527a0] - i4;
                byte[][] bArr = this.f10926e;
                int i6 = iArr[bArr.length + iM5527a0];
                int iMin = Math.min(i, i5 + i4) - i2;
                if (c0717hk.mo3168i(i3, (i2 - i4) + i6, iMin, bArr[iM5527a0])) {
                    i3 += iMin;
                    i2 += iMin;
                    iM5527a0++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.C0717hk
    /* JADX INFO: renamed from: k */
    public final C0717hk mo3170k() {
        return new C0717hk(mo3171l()).mo3170k();
    }

    @Override // p000.C0717hk
    /* JADX INFO: renamed from: l */
    public final byte[] mo3171l() {
        byte[] bArr = new byte[mo3164d()];
        byte[][] bArr2 = this.f10926e;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f10927f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            AbstractC1064la.m4153n0(bArr2[i], i3, i4, bArr, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // p000.C0717hk
    /* JADX INFO: renamed from: n */
    public final void mo3173n(C1073lj c1073lj, int i) {
        int iM5527a0 = AbstractC1337qm.m5527a0(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f10927f;
            int i3 = iM5527a0 == 0 ? 0 : iArr[iM5527a0 - 1];
            int i4 = iArr[iM5527a0] - i3;
            byte[][] bArr = this.f10926e;
            int i5 = iArr[bArr.length + iM5527a0];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            rq1 rq1Var = new rq1(bArr[iM5527a0], i6, i6 + iMin, true, false);
            rq1 rq1Var2 = c1073lj.f6360a;
            if (rq1Var2 == null) {
                rq1Var.f10102g = rq1Var;
                rq1Var.f10101f = rq1Var;
                c1073lj.f6360a = rq1Var;
            } else {
                rq1 rq1Var3 = rq1Var2.f10102g;
                rq1Var3.getClass();
                rq1Var3.m5889b(rq1Var);
            }
            i2 += iMin;
            iM5527a0++;
        }
        c1073lj.f6361b += (long) i;
    }

    @Override // p000.C0717hk
    public final String toString() {
        return new C0717hk(mo3171l()).toString();
    }
}

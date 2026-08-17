package p000;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: renamed from: dz */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0584dz implements y80 {

    /* JADX INFO: renamed from: b */
    public final InterfaceC0693gx f3078b;

    /* JADX INFO: renamed from: c */
    public final long f3079c;

    /* JADX INFO: renamed from: d */
    public long f3080d;

    /* JADX INFO: renamed from: f */
    public int f3082f;

    /* JADX INFO: renamed from: g */
    public int f3083g;

    /* JADX INFO: renamed from: e */
    public byte[] f3081e = new byte[65536];

    /* JADX INFO: renamed from: a */
    public final byte[] f3077a = new byte[4096];

    static {
        a21.m54a("media3.extractor");
    }

    public C0584dz(InterfaceC0693gx interfaceC0693gx, long j, long j2) {
        this.f3078b = interfaceC0693gx;
        this.f3080d = j;
        this.f3079c = j2;
    }

    @Override // p000.y80
    /* JADX INFO: renamed from: a */
    public final void mo2413a(int i, int i2, byte[] bArr) {
        mo2416e(bArr, i, i2, false);
    }

    @Override // p000.y80
    /* JADX INFO: renamed from: b */
    public final boolean mo2414b(byte[] bArr, int i, int i2, boolean z) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.f3083g;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.f3081e, 0, bArr, i, iMin);
            m2426r(iMin);
        }
        int iM2425q = iMin;
        while (iM2425q < i2 && iM2425q != -1) {
            iM2425q = m2425q(bArr, i, i2, iM2425q, z);
        }
        if (iM2425q != -1) {
            this.f3080d += (long) iM2425q;
        }
        return iM2425q != -1;
    }

    @Override // p000.y80
    /* JADX INFO: renamed from: d */
    public final int mo2415d(int i, int i2, byte[] bArr) throws EOFException, InterruptedIOException {
        C0584dz c0584dz;
        int iMin;
        m2424n(i2);
        int i3 = this.f3083g;
        int i4 = this.f3082f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            c0584dz = this;
            iMin = c0584dz.m2425q(this.f3081e, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            c0584dz.f3083g += iMin;
        } else {
            c0584dz = this;
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(c0584dz.f3081e, c0584dz.f3082f, bArr, i, iMin);
        c0584dz.f3082f += iMin;
        return iMin;
    }

    @Override // p000.y80
    /* JADX INFO: renamed from: e */
    public final boolean mo2416e(byte[] bArr, int i, int i2, boolean z) {
        if (!m2421k(i2, z)) {
            return false;
        }
        System.arraycopy(this.f3081e, this.f3082f - i2, bArr, i, i2);
        return true;
    }

    @Override // p000.y80
    /* JADX INFO: renamed from: f */
    public final long mo2417f() {
        return this.f3080d + ((long) this.f3082f);
    }

    @Override // p000.y80
    /* JADX INFO: renamed from: g */
    public final void mo2418g(int i) {
        m2421k(i, false);
    }

    @Override // p000.y80
    public final long getPosition() {
        return this.f3080d;
    }

    @Override // p000.y80
    /* JADX INFO: renamed from: h */
    public final int mo2419h(int i) throws EOFException, InterruptedIOException {
        C0584dz c0584dz;
        int iMin = Math.min(this.f3083g, i);
        m2426r(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f3077a;
            c0584dz = this;
            iMin = c0584dz.m2425q(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            c0584dz = this;
        }
        if (iMin != -1) {
            c0584dz.f3080d += (long) iMin;
        }
        return iMin;
    }

    @Override // p000.y80
    /* JADX INFO: renamed from: i */
    public final long mo2420i() {
        return this.f3079c;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2421k(int i, boolean z) {
        m2424n(i);
        int iM2425q = this.f3083g - this.f3082f;
        while (iM2425q < i) {
            C0584dz c0584dz = this;
            int i2 = i;
            boolean z2 = z;
            iM2425q = c0584dz.m2425q(this.f3081e, this.f3082f, i2, iM2425q, z2);
            if (iM2425q == -1) {
                return false;
            }
            c0584dz.f3083g = c0584dz.f3082f + iM2425q;
            this = c0584dz;
            i = i2;
            z = z2;
        }
        this.f3082f += i;
        return true;
    }

    @Override // p000.y80
    /* JADX INFO: renamed from: l */
    public final void mo2422l() {
        this.f3082f = 0;
    }

    @Override // p000.y80
    /* JADX INFO: renamed from: m */
    public final void mo2423m(int i) {
        int iMin = Math.min(this.f3083g, i);
        m2426r(iMin);
        int iM2425q = iMin;
        while (iM2425q < i && iM2425q != -1) {
            byte[] bArr = this.f3077a;
            iM2425q = m2425q(bArr, -iM2425q, Math.min(i, bArr.length + iM2425q), iM2425q, false);
        }
        if (iM2425q != -1) {
            this.f3080d += (long) iM2425q;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m2424n(int i) {
        int i2 = this.f3082f + i;
        byte[] bArr = this.f3081e;
        if (i2 > bArr.length) {
            this.f3081e = Arrays.copyOf(this.f3081e, z42.m7233g(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    /* JADX INFO: renamed from: q */
    public final int m2425q(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.f3078b.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        f40.m2708d();
        return 0;
    }

    /* JADX INFO: renamed from: r */
    public final void m2426r(int i) {
        int i2 = this.f3083g - i;
        this.f3083g = i2;
        this.f3082f = 0;
        byte[] bArr = this.f3081e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f3081e = bArr2;
    }

    @Override // p000.InterfaceC0693gx
    public final int read(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        C0584dz c0584dz;
        int i3 = this.f3083g;
        int iM2425q = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.f3081e, 0, bArr, i, iMin);
            m2426r(iMin);
            iM2425q = iMin;
        }
        if (iM2425q == 0) {
            c0584dz = this;
            iM2425q = c0584dz.m2425q(bArr, i, i2, 0, true);
        } else {
            c0584dz = this;
        }
        if (iM2425q != -1) {
            c0584dz.f3080d += (long) iM2425q;
        }
        return iM2425q;
    }

    @Override // p000.y80
    public final void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        mo2414b(bArr, i, i2, false);
    }
}

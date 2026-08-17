package p000;

import android.sun.security.util.DerValue;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ys1 extends AbstractC1664zg {

    /* JADX INFO: renamed from: n */
    public int f13136n;

    /* JADX INFO: renamed from: o */
    public boolean f13137o;

    /* JADX INFO: renamed from: p */
    public int f13138p;

    /* JADX INFO: renamed from: q */
    public long f13139q;

    /* JADX INFO: renamed from: s */
    public byte[] f13141s;

    /* JADX INFO: renamed from: v */
    public byte[] f13144v;

    /* JADX INFO: renamed from: r */
    public int f13140r = 0;

    /* JADX INFO: renamed from: t */
    public int f13142t = 0;

    /* JADX INFO: renamed from: u */
    public int f13143u = 0;

    /* JADX INFO: renamed from: l */
    public final long f13134l = 100000;

    /* JADX INFO: renamed from: i */
    public final float f13131i = 0.2f;

    /* JADX INFO: renamed from: m */
    public final long f13135m = 2000000;

    /* JADX INFO: renamed from: k */
    public final int f13133k = 10;

    /* JADX INFO: renamed from: j */
    public final short f13132j = 1024;

    public ys1() {
        byte[] bArr = z42.f13279f;
        this.f13141s = bArr;
        this.f13144v = bArr;
    }

    @Override // p000.InterfaceC1103mc
    /* JADX INFO: renamed from: b */
    public final void mo2126b(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f13402g.hasRemaining()) {
            int i = this.f13138p;
            short s = this.f13132j;
            if (i == 0) {
                int iLimit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit2, byteBuffer.position() + this.f13141s.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit3) << 8) | (byteBuffer.get(iLimit3 - 1) & 255)) > s) {
                        int i2 = this.f13136n;
                        iPosition = ((iLimit3 / i2) * i2) + i2;
                        break;
                    }
                    iLimit3 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f13138p = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    m7306j(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit2);
            } else {
                if (i != 1) {
                    l41.m4046o();
                    return;
                }
                ki0.m3864h(this.f13142t < this.f13141s.length);
                int iLimit4 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > s) {
                        int i3 = this.f13136n;
                        iLimit = (iPosition2 / i3) * i3;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int length = this.f13142t;
                int i4 = this.f13143u;
                int length2 = length + i4;
                byte[] bArr = this.f13141s;
                if (length2 < bArr.length) {
                    length = bArr.length;
                } else {
                    length2 = i4 - (bArr.length - length);
                }
                int i5 = length - length2;
                boolean z = iLimit < iLimit4;
                int iMin = Math.min(iPosition3, i5);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f13141s, length2, iMin);
                int i6 = this.f13143u + iMin;
                this.f13143u = i6;
                ki0.m3864h(i6 <= this.f13141s.length);
                boolean z2 = z && iPosition3 < i5;
                m7146l(z2);
                if (z2) {
                    this.f13138p = 0;
                    this.f13140r = 0;
                }
                byteBuffer.limit(iLimit4);
            }
        }
    }

    @Override // p000.AbstractC1664zg
    /* JADX INFO: renamed from: f */
    public final C0823kc mo2447f(C0823kc c0823kc) throws C1066lc {
        if (c0823kc.f5744c == 2) {
            return c0823kc.f5742a == -1 ? C0823kc.f5741e : c0823kc;
        }
        throw new C1066lc(c0823kc);
    }

    @Override // p000.AbstractC1664zg
    /* JADX INFO: renamed from: g */
    public final void mo2489g() {
        if (isActive()) {
            C0823kc c0823kc = this.f13397b;
            int i = c0823kc.f5743b * 2;
            this.f13136n = i;
            int i2 = ((((int) ((this.f13134l * ((long) c0823kc.f5742a)) / 1000000)) / 2) / i) * i * 2;
            if (this.f13141s.length != i2) {
                this.f13141s = new byte[i2];
                this.f13144v = new byte[i2];
            }
        }
        this.f13138p = 0;
        this.f13139q = 0L;
        this.f13140r = 0;
        this.f13142t = 0;
        this.f13143u = 0;
    }

    @Override // p000.AbstractC1664zg
    /* JADX INFO: renamed from: h */
    public final void mo2490h() {
        if (this.f13143u > 0) {
            m7146l(true);
            this.f13140r = 0;
        }
    }

    @Override // p000.AbstractC1664zg
    /* JADX INFO: renamed from: i */
    public final void mo2491i() {
        this.f13137o = false;
        byte[] bArr = z42.f13279f;
        this.f13141s = bArr;
        this.f13144v = bArr;
    }

    @Override // p000.AbstractC1664zg, p000.InterfaceC1103mc
    public final boolean isActive() {
        return super.isActive() && this.f13137o;
    }

    /* JADX INFO: renamed from: k */
    public final int m7145k(int i) {
        int length = ((((int) ((this.f13135m * ((long) this.f13397b.f5742a)) / 1000000)) - this.f13140r) * this.f13136n) - (this.f13141s.length / 2);
        ki0.m3864h(length >= 0);
        int iMin = (int) Math.min((i * this.f13131i) + 0.5f, length);
        int i2 = this.f13136n;
        return (iMin / i2) * i2;
    }

    /* JADX INFO: renamed from: l */
    public final void m7146l(boolean z) {
        int length;
        int iM7145k;
        int i = this.f13143u;
        byte[] bArr = this.f13141s;
        if (i == bArr.length || z) {
            if (this.f13140r == 0) {
                if (z) {
                    m7147m(i, 3);
                    length = i;
                } else {
                    ki0.m3864h(i >= bArr.length / 2);
                    length = this.f13141s.length / 2;
                    m7147m(length, 0);
                }
                iM7145k = length;
            } else if (z) {
                int length2 = i - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iM7145k2 = m7145k(length2) + (this.f13141s.length / 2);
                m7147m(iM7145k2, 2);
                iM7145k = iM7145k2;
                length = length3;
            } else {
                length = i - (bArr.length / 2);
                iM7145k = m7145k(length);
                m7147m(iM7145k, 1);
            }
            ki0.m3865i(length % this.f13136n == 0, "bytesConsumed is not aligned to frame size: %s" + length);
            ki0.m3864h(i >= iM7145k);
            this.f13143u -= length;
            int i2 = this.f13142t + length;
            this.f13142t = i2;
            this.f13142t = i2 % this.f13141s.length;
            int i3 = this.f13140r;
            int i4 = this.f13136n;
            this.f13140r = (iM7145k / i4) + i3;
            this.f13139q += (long) ((length - iM7145k) / i4);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m7147m(int i, int i2) {
        if (i == 0) {
            return;
        }
        ki0.m3857c(this.f13143u >= i);
        int i3 = this.f13142t;
        if (i2 == 2) {
            int i4 = this.f13143u;
            int i5 = i3 + i4;
            byte[] bArr = this.f13141s;
            if (i5 <= bArr.length) {
                System.arraycopy(bArr, i5 - i, this.f13144v, 0, i);
            } else {
                int length = i4 - (bArr.length - i3);
                byte[] bArr2 = this.f13144v;
                if (length >= i) {
                    System.arraycopy(bArr, length - i, bArr2, 0, i);
                } else {
                    int i6 = i - length;
                    System.arraycopy(bArr, bArr.length - i6, bArr2, 0, i6);
                    System.arraycopy(this.f13141s, 0, this.f13144v, i6, length);
                }
            }
        } else {
            int i7 = i3 + i;
            byte[] bArr3 = this.f13141s;
            int length2 = bArr3.length;
            byte[] bArr4 = this.f13144v;
            if (i7 <= length2) {
                System.arraycopy(bArr3, i3, bArr4, 0, i);
            } else {
                int length3 = bArr3.length - i3;
                System.arraycopy(bArr3, i3, bArr4, 0, length3);
                System.arraycopy(this.f13141s, 0, this.f13144v, length3, i - length3);
            }
        }
        ki0.m3859d(i % this.f13136n == 0, "sizeToOutput is not aligned to frame size: " + i);
        ki0.m3864h(this.f13142t < this.f13141s.length);
        byte[] bArr5 = this.f13144v;
        ki0.m3859d(i % this.f13136n == 0, "byteOutput size is not aligned to frame size " + i);
        if (i2 != 3) {
            for (int i8 = 0; i8 < i; i8 += 2) {
                int i9 = i8 + 1;
                int i10 = (bArr5[i9] << 8) | (bArr5[i8] & 255);
                int i11 = this.f13133k;
                if (i2 == 0) {
                    i11 = ((((i8 * 1000) / (i - 1)) * (i11 - 100)) / 1000) + 100;
                } else if (i2 == 2) {
                    i11 += (((i8 * 1000) * (100 - i11)) / (i - 1)) / 1000;
                }
                int i12 = (i10 * i11) / 100;
                if (i12 >= 32767) {
                    bArr5[i8] = -1;
                    bArr5[i9] = 127;
                } else if (i12 <= -32768) {
                    bArr5[i8] = 0;
                    bArr5[i9] = DerValue.TAG_CONTEXT;
                } else {
                    bArr5[i8] = (byte) (i12 & 255);
                    bArr5[i9] = (byte) (i12 >> 8);
                }
            }
        }
        m7306j(i).put(bArr5, 0, i).flip();
    }
}

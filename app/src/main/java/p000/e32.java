package p000;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class e32 extends AbstractC1664zg {

    /* JADX INFO: renamed from: i */
    public int f3182i;

    /* JADX INFO: renamed from: j */
    public int f3183j;

    /* JADX INFO: renamed from: k */
    public boolean f3184k;

    /* JADX INFO: renamed from: l */
    public int f3185l;

    /* JADX INFO: renamed from: m */
    public byte[] f3186m;

    /* JADX INFO: renamed from: n */
    public int f3187n;

    /* JADX INFO: renamed from: o */
    public long f3188o;

    @Override // p000.AbstractC1664zg, p000.InterfaceC1103mc
    /* JADX INFO: renamed from: a */
    public final ByteBuffer mo2125a() {
        int i;
        if (super.mo2129e() && (i = this.f3187n) > 0) {
            m7306j(i).put(this.f3186m, 0, this.f3187n).flip();
            this.f3187n = 0;
        }
        return super.mo2125a();
    }

    @Override // p000.InterfaceC1103mc
    /* JADX INFO: renamed from: b */
    public final void mo2126b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.f3185l);
        this.f3188o += (long) (iMin / this.f13397b.f5745d);
        this.f3185l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f3185l > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.f3187n + i2) - this.f3186m.length;
        ByteBuffer byteBufferM7306j = m7306j(length);
        int iM7233g = z42.m7233g(length, 0, this.f3187n);
        byteBufferM7306j.put(this.f3186m, 0, iM7233g);
        int iM7233g2 = z42.m7233g(length - iM7233g, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iM7233g2);
        byteBufferM7306j.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iM7233g2;
        int i4 = this.f3187n - iM7233g;
        this.f3187n = i4;
        byte[] bArr = this.f3186m;
        System.arraycopy(bArr, iM7233g, bArr, 0, i4);
        byteBuffer.get(this.f3186m, this.f3187n, i3);
        this.f3187n += i3;
        byteBufferM7306j.flip();
    }

    @Override // p000.AbstractC1664zg, p000.InterfaceC1103mc
    /* JADX INFO: renamed from: e */
    public final boolean mo2129e() {
        return super.mo2129e() && this.f3187n == 0;
    }

    @Override // p000.AbstractC1664zg
    /* JADX INFO: renamed from: f */
    public final C0823kc mo2447f(C0823kc c0823kc) throws C1066lc {
        if (c0823kc.f5744c != 2) {
            throw new C1066lc(c0823kc);
        }
        this.f3184k = true;
        return (this.f3182i == 0 && this.f3183j == 0) ? C0823kc.f5741e : c0823kc;
    }

    @Override // p000.AbstractC1664zg
    /* JADX INFO: renamed from: g */
    public final void mo2489g() {
        if (this.f3184k) {
            this.f3184k = false;
            int i = this.f3183j;
            int i2 = this.f13397b.f5745d;
            this.f3186m = new byte[i * i2];
            this.f3185l = this.f3182i * i2;
        }
        this.f3187n = 0;
    }

    @Override // p000.AbstractC1664zg
    /* JADX INFO: renamed from: h */
    public final void mo2490h() {
        if (this.f3184k) {
            int i = this.f3187n;
            if (i > 0) {
                this.f3188o += (long) (i / this.f13397b.f5745d);
            }
            this.f3187n = 0;
        }
    }

    @Override // p000.AbstractC1664zg
    /* JADX INFO: renamed from: i */
    public final void mo2491i() {
        this.f3186m = z42.f13279f;
    }
}

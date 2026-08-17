package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: sm */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1411sm extends AbstractC1664zg {

    /* JADX INFO: renamed from: i */
    public int[] f10435i;

    /* JADX INFO: renamed from: j */
    public int[] f10436j;

    @Override // p000.InterfaceC1103mc
    /* JADX INFO: renamed from: b */
    public final void mo2126b(ByteBuffer byteBuffer) {
        int[] iArr = this.f10436j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferM7306j = m7306j(((iLimit - iPosition) / this.f13397b.f5745d) * this.f13398c.f5745d);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferM7306j.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.f13397b.f5745d;
        }
        byteBuffer.position(iLimit);
        byteBufferM7306j.flip();
    }

    @Override // p000.AbstractC1664zg
    /* JADX INFO: renamed from: f */
    public final C0823kc mo2447f(C0823kc c0823kc) throws C1066lc {
        int[] iArr = this.f10435i;
        if (iArr == null) {
            return C0823kc.f5741e;
        }
        int i = c0823kc.f5744c;
        int i2 = c0823kc.f5743b;
        if (i != 2) {
            throw new C1066lc(c0823kc);
        }
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new C1066lc(c0823kc);
            }
            z |= i4 != i3;
            i3++;
        }
        return z ? new C0823kc(c0823kc.f5742a, iArr.length, 2) : C0823kc.f5741e;
    }

    @Override // p000.AbstractC1664zg
    /* JADX INFO: renamed from: g */
    public final void mo2489g() {
        this.f10436j = this.f10435i;
    }

    @Override // p000.AbstractC1664zg
    /* JADX INFO: renamed from: i */
    public final void mo2491i() {
        this.f10436j = null;
        this.f10435i = null;
    }
}

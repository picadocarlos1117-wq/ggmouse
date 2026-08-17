package p000;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class f12 extends AbstractC1664zg {
    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    @Override // p000.InterfaceC1103mc
    /* JADX INFO: renamed from: b */
    public final void mo2126b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f13397b.f5744c;
        if (i2 == 3) {
            i *= 2;
        } else if (i2 == 4) {
            i /= 2;
        } else {
            if (i2 != 21) {
                if (i2 == 22) {
                    i /= 2;
                } else if (i2 != 268435456) {
                    if (i2 != 1342177280) {
                        if (i2 != 1610612736) {
                            l41.m4046o();
                            return;
                        }
                        i /= 2;
                    }
                }
            }
            i /= 3;
            i *= 2;
        }
        ByteBuffer byteBufferM7306j = m7306j(i);
        int i3 = this.f13397b.f5744c;
        if (i3 == 3) {
            while (iPosition < iLimit) {
                byteBufferM7306j.put((byte) 0);
                byteBufferM7306j.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i3 == 4) {
            while (iPosition < iLimit) {
                short sM7232f = (short) (z42.m7232f(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferM7306j.put((byte) (sM7232f & 255));
                byteBufferM7306j.put((byte) ((sM7232f >> 8) & 255));
                iPosition += 4;
            }
        } else if (i3 == 21) {
            while (iPosition < iLimit) {
                byteBufferM7306j.put(byteBuffer.get(iPosition + 1));
                byteBufferM7306j.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i3 == 22) {
            while (iPosition < iLimit) {
                byteBufferM7306j.put(byteBuffer.get(iPosition + 2));
                byteBufferM7306j.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferM7306j.put(byteBuffer.get(iPosition + 1));
                byteBufferM7306j.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i3 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferM7306j.put(byteBuffer.get(iPosition + 1));
                byteBufferM7306j.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else {
            if (i3 != 1610612736) {
                l41.m4046o();
                return;
            }
            while (iPosition < iLimit) {
                byteBufferM7306j.put(byteBuffer.get(iPosition + 1));
                byteBufferM7306j.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM7306j.flip();
    }

    @Override // p000.AbstractC1664zg
    /* JADX INFO: renamed from: f */
    public final C0823kc mo2447f(C0823kc c0823kc) throws C1066lc {
        int i = c0823kc.f5744c;
        if (i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4) {
            return i != 2 ? new C0823kc(c0823kc.f5742a, c0823kc.f5743b, 2) : C0823kc.f5741e;
        }
        throw new C1066lc(c0823kc);
    }
}

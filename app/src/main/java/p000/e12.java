package p000;

import com.example.ssmousepro.injection.TouchPipeline;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class e12 extends AbstractC1664zg {

    /* JADX INFO: renamed from: i */
    public static final int f3157i = Float.floatToIntBits(Float.NaN);

    /* JADX INFO: renamed from: k */
    public static void m2446k(ByteBuffer byteBuffer, int i) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f3157i) {
            iFloatToIntBits = Float.floatToIntBits(TouchPipeline.SIZE);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // p000.InterfaceC1103mc
    /* JADX INFO: renamed from: b */
    public final void mo2126b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM7306j;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f13397b.f5744c;
        if (i2 == 21) {
            byteBufferM7306j = m7306j((i / 3) * 4);
            while (iPosition < iLimit) {
                m2446k(byteBufferM7306j, ((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24));
                iPosition += 3;
            }
        } else if (i2 == 22) {
            byteBufferM7306j = m7306j(i);
            while (iPosition < iLimit) {
                m2446k(byteBufferM7306j, (byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24));
                iPosition += 4;
            }
        } else if (i2 == 1342177280) {
            byteBufferM7306j = m7306j((i / 3) * 4);
            while (iPosition < iLimit) {
                m2446k(byteBufferM7306j, ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24));
                iPosition += 3;
            }
        } else {
            if (i2 != 1610612736) {
                l41.m4046o();
                return;
            }
            byteBufferM7306j = m7306j(i);
            while (iPosition < iLimit) {
                m2446k(byteBufferM7306j, (byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24));
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
        if (i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4) {
            return i != 4 ? new C0823kc(c0823kc.f5742a, c0823kc.f5743b, 4) : C0823kc.f5741e;
        }
        throw new C1066lc(c0823kc);
    }
}

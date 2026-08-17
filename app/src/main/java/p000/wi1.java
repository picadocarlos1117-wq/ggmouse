package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class wi1 extends AbstractC1353r1 {

    /* JADX INFO: renamed from: a */
    public int f12187a;

    /* JADX INFO: renamed from: b */
    public final int f12188b;

    /* JADX INFO: renamed from: c */
    public final byte[] f12189c;

    /* JADX INFO: renamed from: d */
    public int f12190d = -1;

    public wi1(byte[] bArr, int i, int i2) {
        p32.m5177l(i >= 0, "offset must be >= 0");
        p32.m5177l(i2 >= 0, "length must be >= 0");
        int i3 = i2 + i;
        p32.m5177l(i3 <= bArr.length, "offset + length exceeds array boundary");
        this.f12189c = bArr;
        this.f12187a = i;
        this.f12188b = i3;
    }

    @Override // p000.AbstractC1353r1
    /* JADX INFO: renamed from: d */
    public final void mo5653d() {
        this.f12190d = this.f12187a;
    }

    @Override // p000.AbstractC1353r1
    /* JADX INFO: renamed from: g */
    public final AbstractC1353r1 mo1191g(int i) {
        m5652c(i);
        int i2 = this.f12187a;
        this.f12187a = i2 + i;
        return new wi1(this.f12189c, i2, i);
    }

    @Override // p000.AbstractC1353r1
    /* JADX INFO: renamed from: j */
    public final void mo1192j(int i, int i2, byte[] bArr) {
        System.arraycopy(this.f12189c, this.f12187a, bArr, i, i2);
        this.f12187a += i2;
    }

    @Override // p000.AbstractC1353r1
    /* JADX INFO: renamed from: l */
    public final void mo1193l(OutputStream outputStream, int i) throws IOException {
        m5652c(i);
        outputStream.write(this.f12189c, this.f12187a, i);
        this.f12187a += i;
    }

    @Override // p000.AbstractC1353r1
    /* JADX INFO: renamed from: o */
    public final void mo1194o(ByteBuffer byteBuffer) {
        p32.m5188s(byteBuffer, "dest");
        int iRemaining = byteBuffer.remaining();
        m5652c(iRemaining);
        byteBuffer.put(this.f12189c, this.f12187a, iRemaining);
        this.f12187a += iRemaining;
    }

    @Override // p000.AbstractC1353r1
    /* JADX INFO: renamed from: p */
    public final int mo1195p() {
        m5652c(1);
        int i = this.f12187a;
        this.f12187a = i + 1;
        return this.f12189c[i] & 255;
    }

    @Override // p000.AbstractC1353r1
    /* JADX INFO: renamed from: r */
    public final int mo1196r() {
        return this.f12188b - this.f12187a;
    }

    @Override // p000.AbstractC1353r1
    /* JADX INFO: renamed from: s */
    public final void mo5655s() {
        int i = this.f12190d;
        if (i == -1) {
            throw new InvalidMarkException();
        }
        this.f12187a = i;
    }

    @Override // p000.AbstractC1353r1
    /* JADX INFO: renamed from: x */
    public final void mo1197x(int i) {
        m5652c(i);
        this.f12187a += i;
    }
}

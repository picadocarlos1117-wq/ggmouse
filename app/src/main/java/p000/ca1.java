package p000;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public final class ca1 extends AbstractC1353r1 {

    /* JADX INFO: renamed from: a */
    public final C1073lj f1727a;

    public ca1(C1073lj c1073lj) {
        this.f1727a = c1073lj;
    }

    @Override // p000.AbstractC1353r1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1727a.m4200c();
    }

    @Override // p000.AbstractC1353r1
    /* JADX INFO: renamed from: g */
    public final AbstractC1353r1 mo1191g(int i) {
        C1073lj c1073lj = new C1073lj();
        c1073lj.mo956q(i, this.f1727a);
        return new ca1(c1073lj);
    }

    @Override // p000.AbstractC1353r1
    /* JADX INFO: renamed from: j */
    public final void mo1192j(int i, int i2, byte[] bArr) {
        while (i2 > 0) {
            int i3 = this.f1727a.read(bArr, i, i2);
            if (i3 == -1) {
                f40.m2718n(jd0.m3610h(i2, "EOF trying to read ", " bytes"));
                return;
            } else {
                i2 -= i3;
                i += i3;
            }
        }
    }

    @Override // p000.AbstractC1353r1
    /* JADX INFO: renamed from: l */
    public final void mo1193l(OutputStream outputStream, int i) throws IOException {
        long j = i;
        outputStream.getClass();
        C1073lj c1073lj = this.f1727a;
        ua0.m6451h(c1073lj.f6361b, 0L, j);
        rq1 rq1Var = c1073lj.f6360a;
        while (j > 0) {
            rq1Var.getClass();
            int iMin = (int) Math.min(j, rq1Var.f10098c - rq1Var.f10097b);
            outputStream.write(rq1Var.f10096a, rq1Var.f10097b, iMin);
            int i2 = rq1Var.f10097b + iMin;
            rq1Var.f10097b = i2;
            long j2 = iMin;
            c1073lj.f6361b -= j2;
            j -= j2;
            if (i2 == rq1Var.f10098c) {
                rq1 rq1VarM5888a = rq1Var.m5888a();
                c1073lj.f6360a = rq1VarM5888a;
                sq1.m6132a(rq1Var);
                rq1Var = rq1VarM5888a;
            }
        }
    }

    @Override // p000.AbstractC1353r1
    /* JADX INFO: renamed from: o */
    public final void mo1194o(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.AbstractC1353r1
    /* JADX INFO: renamed from: p */
    public final int mo1195p() {
        try {
            return this.f1727a.readByte() & 255;
        } catch (EOFException e) {
            f40.m2718n(e.getMessage());
            return 0;
        }
    }

    @Override // p000.AbstractC1353r1
    /* JADX INFO: renamed from: r */
    public final int mo1196r() {
        return (int) this.f1727a.f6361b;
    }

    @Override // p000.AbstractC1353r1
    /* JADX INFO: renamed from: x */
    public final void mo1197x(int i) {
        try {
            this.f1727a.skip(i);
        } catch (EOFException e) {
            f40.m2718n(e.getMessage());
        }
    }
}

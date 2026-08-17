package p000;

import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class u41 extends OutputStream {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ v41 f11120a;

    public u41(v41 v41Var) {
        this.f11120a = v41Var;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.f11120a.m6567g(i, i2, bArr);
    }
}

package p000;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class t20 implements c22 {

    /* JADX INFO: renamed from: a */
    public final byte[] f10704a = new byte[4096];

    @Override // p000.c22
    /* JADX INFO: renamed from: b */
    public final void mo1115b(dc1 dc1Var, int i, int i2) {
        dc1Var.m2317G(i);
    }

    @Override // p000.c22
    /* JADX INFO: renamed from: c */
    public final int mo1116c(InterfaceC0693gx interfaceC0693gx, int i, boolean z) throws EOFException {
        byte[] bArr = this.f10704a;
        int i2 = interfaceC0693gx.read(bArr, 0, Math.min(bArr.length, i));
        if (i2 != -1) {
            return i2;
        }
        if (z) {
            return -1;
        }
        f40.m2708d();
        return 0;
    }

    @Override // p000.c22
    /* JADX INFO: renamed from: d */
    public final void mo1117d(be0 be0Var) {
    }

    @Override // p000.c22
    /* JADX INFO: renamed from: a */
    public final void mo1114a(long j, int i, int i2, int i3, b22 b22Var) {
    }
}

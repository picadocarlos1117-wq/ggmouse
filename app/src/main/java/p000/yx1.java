package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public interface yx1 {
    /* JADX INFO: renamed from: m */
    default qx1 mo4034m(int i, int i2, byte[] bArr) {
        nm0 nm0VarM5566m = qm0.m5566m();
        mo875r(bArr, 0, i2, xx1.f12763c, new uq1(nm0VarM5566m, 1));
        return new C1159nv(nm0VarM5566m.m4561g());
    }

    /* JADX INFO: renamed from: r */
    void mo875r(byte[] bArr, int i, int i2, xx1 xx1Var, InterfaceC0578dt interfaceC0578dt);

    default void reset() {
    }
}

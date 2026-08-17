package p000;

import io.github.muntashirakon.adb.AdbProtocol;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class yg1 implements p21 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0769ix f12976a;

    /* JADX INFO: renamed from: b */
    public final C1521vl f12977b;

    /* JADX INFO: renamed from: c */
    public final C0080az f12978c;

    /* JADX INFO: renamed from: d */
    public final bz1 f12979d;

    /* JADX INFO: renamed from: e */
    public final int f12980e;

    public yg1(InterfaceC0769ix interfaceC0769ix, a90 a90Var) {
        C1521vl c1521vl = new C1521vl(a90Var, 28);
        C0080az c0080az = new C0080az(0);
        bz1 bz1Var = new bz1(19);
        this.f12976a = interfaceC0769ix;
        this.f12977b = c1521vl;
        this.f12978c = c0080az;
        this.f12979d = bz1Var;
        this.f12980e = AdbProtocol.MAX_PAYLOAD_V3;
    }

    @Override // p000.p21
    /* JADX INFO: renamed from: b */
    public final AbstractC0791jh mo5117b(z11 z11Var) {
        z11Var.f13231b.getClass();
        this.f12978c.getClass();
        z11Var.f13231b.getClass();
        z11Var.f13231b.getClass();
        return new zg1(z11Var, this.f12976a, this.f12977b, g40.f4060a, this.f12979d, this.f12980e, false);
    }
}

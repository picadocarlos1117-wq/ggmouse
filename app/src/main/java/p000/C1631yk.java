package p000;

import java.net.SocketAddress;

/* JADX INFO: renamed from: yk */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1631yk implements InterfaceC1561wo {

    /* JADX INFO: renamed from: a */
    public final r91 f12998a;

    /* JADX INFO: renamed from: b */
    public final fx0 f12999b;

    public C1631yk(r91 r91Var, fx0 fx0Var) {
        this.f12998a = r91Var;
        this.f12999b = fx0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f12998a.close();
    }

    @Override // p000.InterfaceC1561wo
    /* JADX INFO: renamed from: u */
    public final InterfaceC0541cs mo5746u(SocketAddress socketAddress, C1524vo c1524vo, fp0 fp0Var) {
        return new C1594xk(this, this.f12998a.mo5746u(socketAddress, c1524vo, fp0Var), c1524vo.f11725a);
    }
}

package p000;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class r91 implements InterfaceC1561wo {

    /* JADX INFO: renamed from: a */
    public final pn0 f9831a;

    /* JADX INFO: renamed from: b */
    public final Executor f9832b;

    /* JADX INFO: renamed from: c */
    public final pn0 f9833c;

    /* JADX INFO: renamed from: d */
    public final ScheduledExecutorService f9834d;

    /* JADX INFO: renamed from: e */
    public final ax0 f9835e;

    /* JADX INFO: renamed from: f */
    public final SSLSocketFactory f9836f;

    /* JADX INFO: renamed from: g */
    public final C0614es f9837g;

    /* JADX INFO: renamed from: m */
    public final int f9838m;

    /* JADX INFO: renamed from: n */
    public final boolean f9839n;

    /* JADX INFO: renamed from: o */
    public final C1326qb f9840o;

    /* JADX INFO: renamed from: p */
    public final long f9841p;

    /* JADX INFO: renamed from: q */
    public final int f9842q;

    /* JADX INFO: renamed from: r */
    public final int f9843r;

    /* JADX INFO: renamed from: s */
    public boolean f9844s;

    public r91(pn0 pn0Var, pn0 pn0Var2, SSLSocketFactory sSLSocketFactory, C0614es c0614es, int i, boolean z, long j, long j2, int i2, int i3, ax0 ax0Var) {
        this.f9831a = pn0Var;
        this.f9832b = (Executor) ds1.m2384a((cs1) pn0Var.f8968a);
        this.f9833c = pn0Var2;
        this.f9834d = (ScheduledExecutorService) ds1.m2384a((cs1) pn0Var2.f8968a);
        this.f9836f = sSLSocketFactory;
        this.f9837g = c0614es;
        this.f9838m = i;
        this.f9839n = z;
        this.f9840o = new C1326qb(j);
        this.f9841p = j2;
        this.f9842q = i2;
        this.f9843r = i3;
        p32.m5188s(ax0Var, "transportTracerFactory");
        this.f9835e = ax0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f9844s) {
            return;
        }
        this.f9844s = true;
        ds1.m2385b((cs1) this.f9831a.f8968a, this.f9832b);
        ds1.m2385b((cs1) this.f9833c.f8968a, this.f9834d);
    }

    @Override // p000.InterfaceC1561wo
    /* JADX INFO: renamed from: u */
    public final InterfaceC0541cs mo5746u(SocketAddress socketAddress, C1524vo c1524vo, fp0 fp0Var) {
        if (this.f9844s) {
            f40.m2719o("The transport factory is closed.");
            return null;
        }
        C1326qb c1326qb = this.f9840o;
        long j = c1326qb.f9465b.get();
        y91 y91Var = new y91(this, (InetSocketAddress) socketAddress, c1524vo.f11725a, c1524vo.f11726b, c1524vo.f11727c, new RunnableC1621ya(new C1289pb(c1326qb, j), 19));
        if (this.f9839n) {
            y91Var.f12880H = true;
            y91Var.f12881I = j;
            y91Var.f12882J = this.f9841p;
        }
        return y91Var;
    }
}

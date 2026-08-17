package p000;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class zk0 extends SocketAddress {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f13447e = 0;

    /* JADX INFO: renamed from: a */
    public final SocketAddress f13448a;

    /* JADX INFO: renamed from: b */
    public final InetSocketAddress f13449b;

    /* JADX INFO: renamed from: c */
    public final String f13450c;

    /* JADX INFO: renamed from: d */
    public final String f13451d;

    public zk0(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) {
        p32.m5188s(inetSocketAddress, "proxyAddress");
        p32.m5188s(inetSocketAddress2, "targetAddress");
        p32.m5194y(!inetSocketAddress.isUnresolved(), "The proxy address %s is not resolved", inetSocketAddress);
        this.f13448a = inetSocketAddress;
        this.f13449b = inetSocketAddress2;
        this.f13450c = str;
        this.f13451d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zk0)) {
            return false;
        }
        zk0 zk0Var = (zk0) obj;
        return hr1.m3275k(this.f13448a, zk0Var.f13448a) && hr1.m3275k(this.f13449b, zk0Var.f13449b) && hr1.m3275k(this.f13450c, zk0Var.f13450c) && hr1.m3275k(this.f13451d, zk0Var.f13451d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13448a, this.f13449b, this.f13450c, this.f13451d});
    }

    public final String toString() {
        C1679zv c1679zvM5176k0 = p32.m5176k0(this);
        c1679zvM5176k0.m7359a(this.f13448a, "proxyAddr");
        c1679zvM5176k0.m7359a(this.f13449b, "targetAddr");
        c1679zvM5176k0.m7359a(this.f13450c, "username");
        c1679zvM5176k0.m7361c("hasPassword", this.f13451d != null);
        return c1679zvM5176k0.toString();
    }
}

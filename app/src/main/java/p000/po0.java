package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class po0 {

    /* JADX INFO: renamed from: a */
    public final String f8974a;

    /* JADX INFO: renamed from: b */
    public final oo0 f8975b;

    /* JADX INFO: renamed from: c */
    public final long f8976c;

    /* JADX INFO: renamed from: d */
    public final uo0 f8977d;

    public po0(String str, oo0 oo0Var, long j, gp0 gp0Var) {
        this.f8974a = str;
        this.f8975b = oo0Var;
        this.f8976c = j;
        this.f8977d = gp0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof po0)) {
            return false;
        }
        po0 po0Var = (po0) obj;
        return hr1.m3275k(this.f8974a, po0Var.f8974a) && hr1.m3275k(this.f8975b, po0Var.f8975b) && this.f8976c == po0Var.f8976c && hr1.m3275k(null, null) && hr1.m3275k(this.f8977d, po0Var.f8977d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8974a, this.f8975b, Long.valueOf(this.f8976c), null, this.f8977d});
    }

    public final String toString() {
        C1679zv c1679zvM5176k0 = p32.m5176k0(this);
        c1679zvM5176k0.m7359a(this.f8974a, "description");
        c1679zvM5176k0.m7359a(this.f8975b, "severity");
        c1679zvM5176k0.m7360b("timestampNanos", this.f8976c);
        c1679zvM5176k0.m7359a(null, "channelRef");
        c1679zvM5176k0.m7359a(this.f8977d, "subchannelRef");
        return c1679zvM5176k0.toString();
    }
}

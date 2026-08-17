package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public final class yj0 {

    /* JADX INFO: renamed from: d */
    public static final C0717hk f12990d;

    /* JADX INFO: renamed from: e */
    public static final C0717hk f12991e;

    /* JADX INFO: renamed from: f */
    public static final C0717hk f12992f;

    /* JADX INFO: renamed from: g */
    public static final C0717hk f12993g;

    /* JADX INFO: renamed from: h */
    public static final C0717hk f12994h;

    /* JADX INFO: renamed from: a */
    public final C0717hk f12995a;

    /* JADX INFO: renamed from: b */
    public final C0717hk f12996b;

    /* JADX INFO: renamed from: c */
    public final int f12997c;

    static {
        C0717hk c0717hk = C0717hk.f4607d;
        f12990d = AbstractC1337qm.m5552o(":status");
        f12991e = AbstractC1337qm.m5552o(":method");
        f12992f = AbstractC1337qm.m5552o(":path");
        f12993g = AbstractC1337qm.m5552o(":scheme");
        f12994h = AbstractC1337qm.m5552o(":authority");
        AbstractC1337qm.m5552o(":host");
        AbstractC1337qm.m5552o(":version");
    }

    public yj0(C0717hk c0717hk, C0717hk c0717hk2) {
        this.f12995a = c0717hk;
        this.f12996b = c0717hk2;
        this.f12997c = c0717hk2.mo3164d() + c0717hk.mo3164d() + 32;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yj0) {
            yj0 yj0Var = (yj0) obj;
            if (this.f12995a.equals(yj0Var.f12995a) && this.f12996b.equals(yj0Var.f12996b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f12996b.hashCode() + ((this.f12995a.hashCode() + 527) * 31);
    }

    public final String toString() {
        return AbstractC1308pu.m5340g(this.f12995a.m3172m(), ": ", this.f12996b.m3172m());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yj0(String str, String str2) {
        this(AbstractC1337qm.m5552o(str), AbstractC1337qm.m5552o(str2));
        C0717hk c0717hk = C0717hk.f4607d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yj0(C0717hk c0717hk, String str) {
        this(c0717hk, AbstractC1337qm.m5552o(str));
        C0717hk c0717hk2 = C0717hk.f4607d;
    }
}

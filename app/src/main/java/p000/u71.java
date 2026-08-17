package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class u71 {

    /* JADX INFO: renamed from: a */
    public final int f11168a;

    /* JADX INFO: renamed from: b */
    public final sh1 f11169b;

    /* JADX INFO: renamed from: c */
    public final ry1 f11170c;

    /* JADX INFO: renamed from: d */
    public final bj0 f11171d;

    /* JADX INFO: renamed from: e */
    public final mx0 f11172e;

    /* JADX INFO: renamed from: f */
    public final C1374rm f11173f;

    /* JADX INFO: renamed from: g */
    public final fx0 f11174g;

    public u71(Integer num, sh1 sh1Var, ry1 ry1Var, bj0 bj0Var, mx0 mx0Var, C1374rm c1374rm, fx0 fx0Var) {
        this.f11168a = num.intValue();
        p32.m5188s(sh1Var, "proxyDetector not set");
        this.f11169b = sh1Var;
        this.f11170c = ry1Var;
        this.f11171d = bj0Var;
        this.f11172e = mx0Var;
        this.f11173f = c1374rm;
        this.f11174g = fx0Var;
    }

    public final String toString() {
        C1679zv c1679zvM5176k0 = p32.m5176k0(this);
        c1679zvM5176k0.m7362d("defaultPort", String.valueOf(this.f11168a));
        c1679zvM5176k0.m7359a(this.f11169b, "proxyDetector");
        c1679zvM5176k0.m7359a(this.f11170c, "syncContext");
        c1679zvM5176k0.m7359a(this.f11171d, "serviceConfigParser");
        c1679zvM5176k0.m7359a(this.f11172e, "scheduledExecutorService");
        c1679zvM5176k0.m7359a(this.f11173f, "channelLogger");
        c1679zvM5176k0.m7359a(this.f11174g, "executor");
        c1679zvM5176k0.m7359a(null, "overrideAuthority");
        return c1679zvM5176k0.toString();
    }
}

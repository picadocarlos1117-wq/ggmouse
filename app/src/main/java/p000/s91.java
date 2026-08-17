package p000;

import java.util.EnumSet;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class s91 extends ce0 {

    /* JADX INFO: renamed from: m */
    public static final C0614es f10313m;

    /* JADX INFO: renamed from: n */
    public static final long f10314n;

    /* JADX INFO: renamed from: o */
    public static final pn0 f10315o;

    /* JADX INFO: renamed from: a */
    public final px0 f10316a;

    /* JADX INFO: renamed from: e */
    public SSLSocketFactory f10320e;

    /* JADX INFO: renamed from: b */
    public final ax0 f10317b = C0558d8.f2819e;

    /* JADX INFO: renamed from: c */
    public final pn0 f10318c = f10315o;

    /* JADX INFO: renamed from: d */
    public final pn0 f10319d = new pn0(vi0.f11690q);

    /* JADX INFO: renamed from: f */
    public final C0614es f10321f = f10313m;

    /* JADX INFO: renamed from: g */
    public int f10322g = 1;

    /* JADX INFO: renamed from: h */
    public long f10323h = Long.MAX_VALUE;

    /* JADX INFO: renamed from: i */
    public final long f10324i = vi0.f11685l;

    /* JADX INFO: renamed from: j */
    public final int f10325j = 65535;

    /* JADX INFO: renamed from: k */
    public final int f10326k = 4194304;

    /* JADX INFO: renamed from: l */
    public final int f10327l = Integer.MAX_VALUE;

    static {
        Logger.getLogger(s91.class.getName());
        C0577ds c0577ds = new C0577ds(C0614es.f3428e);
        c0577ds.m2381a(EnumC1301pn.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, EnumC1301pn.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, EnumC1301pn.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, EnumC1301pn.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, EnumC1301pn.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, EnumC1301pn.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        c0577ds.m2382b(d12.TLS_1_2);
        if (!c0577ds.f3003a) {
            f40.m2719o("no TLS extensions for cleartext connections");
            return;
        }
        c0577ds.f3004b = true;
        f10313m = new C0614es(c0577ds);
        f10314n = 86400000000000000L;
        f10315o = new pn0(new pu0(5));
        EnumSet.of(c12.f1623a, c12.f1624b);
    }

    public s91(String str) {
        this.f10316a = new px0(str, new q91(this), new q91(this));
    }

    @Override // p000.xw0
    /* JADX INFO: renamed from: b */
    public final void mo933b() {
        this.f10323h = 30000000000L;
        long jMax = Math.max(30000000000L, 10000000000L);
        this.f10323h = jMax;
        if (jMax >= f10314n) {
            this.f10323h = Long.MAX_VALUE;
        }
    }

    @Override // p000.ce0
    /* JADX INFO: renamed from: c */
    public final xw0 mo934c() {
        return this.f10316a;
    }
}

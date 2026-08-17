package p000;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: jo */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0798jo extends AbstractC0610eo {

    /* JADX INFO: renamed from: p */
    public static final Logger f5463p = Logger.getLogger(C0798jo.class.getName());

    /* JADX INFO: renamed from: q */
    public static final double f5464q;

    /* JADX INFO: renamed from: a */
    public final u51 f5465a;

    /* JADX INFO: renamed from: b */
    public final Executor f5466b;

    /* JADX INFO: renamed from: c */
    public final boolean f5467c;

    /* JADX INFO: renamed from: d */
    public final C0599ed f5468d;

    /* JADX INFO: renamed from: e */
    public final C1307pt f5469e;

    /* JADX INFO: renamed from: f */
    public volatile ScheduledFuture f5470f;

    /* JADX INFO: renamed from: g */
    public final boolean f5471g;

    /* JADX INFO: renamed from: h */
    public C0022al f5472h;

    /* JADX INFO: renamed from: i */
    public InterfaceC1339qo f5473i;

    /* JADX INFO: renamed from: j */
    public volatile boolean f5474j;

    /* JADX INFO: renamed from: k */
    public boolean f5475k;

    /* JADX INFO: renamed from: l */
    public boolean f5476l;

    /* JADX INFO: renamed from: m */
    public final C0765is f5477m;

    /* JADX INFO: renamed from: n */
    public final ScheduledExecutorService f5478n;

    /* JADX INFO: renamed from: o */
    public C1681zx f5479o = C1681zx.f13596d;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
        f5464q = 1.0E9d;
    }

    public C0798jo(u51 u51Var, Executor executor, C0022al c0022al, C0765is c0765is, ScheduledExecutorService scheduledExecutorService, C0599ed c0599ed) {
        C1601xr c1601xr = C1601xr.f12693b;
        this.f5465a = u51Var;
        String str = u51Var.f11126b;
        System.identityHashCode(this);
        jc1.f5363a.getClass();
        if (executor == r20.f9658a) {
            this.f5466b = new br1();
            this.f5467c = true;
        } else {
            this.f5466b = new er1(executor);
            this.f5467c = false;
        }
        this.f5468d = c0599ed;
        this.f5469e = C1307pt.m5325b();
        t51 t51Var = u51Var.f11125a;
        this.f5471g = t51Var == t51.f10762a || t51Var == t51.f10763b;
        this.f5472h = c0022al;
        this.f5477m = c0765is;
        this.f5478n = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: a */
    public final void m3675a(String str, Throwable th) {
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            f5463p.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.f5475k) {
            return;
        }
        this.f5475k = true;
        try {
            if (this.f5473i != null) {
                nv1 nv1Var = nv1.f7551f;
                nv1 nv1VarM4614g = str != null ? nv1Var.m4614g(str) : nv1Var.m4614g("Call cancelled without message");
                if (th != null) {
                    nv1VarM4614g = nv1VarM4614g.m4613f(th);
                }
                this.f5473i.mo1030f(nv1VarM4614g);
            }
        } finally {
            m3676b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3676b() {
        this.f5469e.getClass();
        ScheduledFuture scheduledFuture = this.f5470f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3677c(Object obj) {
        p32.m5193x(this.f5473i != null, "Not started");
        p32.m5193x(!this.f5475k, "call was cancelled");
        p32.m5193x(!this.f5476l, "call was half-closed");
        try {
            InterfaceC1339qo interfaceC1339qo = this.f5473i;
            if (interfaceC1339qo instanceof dx0) {
                ((dx0) interfaceC1339qo).m2401w(obj);
            } else {
                lh1 lh1Var = this.f5465a.f11128d;
                lh1Var.getClass();
                interfaceC1339qo.mo1033i(new kh1((y41) obj, lh1Var.f6351a));
            }
            if (this.f5471g) {
                return;
            }
            this.f5473i.flush();
        } catch (Error e) {
            this.f5473i.mo1030f(nv1.f7551f.m4614g("Client sendMessage() failed with Error"));
            throw e;
        } catch (RuntimeException e2) {
            this.f5473i.mo1030f(nv1.f7551f.m4613f(e2).m4614g("Failed to stream message"));
        }
    }

    @Override // p000.AbstractC0610eo
    public final void cancel(String str, Throwable th) {
        jc1.m3599c();
        try {
            jc1.m3597a();
            m3675a(str, th);
            jc1.f5363a.getClass();
        } catch (Throwable th2) {
            try {
                jc1.f5363a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3678d(AbstractC0143co abstractC0143co, j51 j51Var) {
        long j;
        C0022al c0022al;
        InterfaceC1339qo dx0Var;
        k50 k50Var = k50.f5671c;
        p32.m5193x(this.f5473i == null, "Already started");
        p32.m5193x(!this.f5475k, "call was cancelled");
        p32.m5188s(abstractC0143co, "observer");
        p32.m5188s(j51Var, "headers");
        this.f5469e.getClass();
        C0022al c0022al2 = this.f5472h;
        C0101bj c0101bj = ux0.f11442g;
        ux0 ux0Var = (ux0) c0022al2.m168a(c0101bj);
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (ux0Var == null) {
            j = 0;
        } else {
            Integer num = ux0Var.f11446d;
            Integer num2 = ux0Var.f11445c;
            Long l = ux0Var.f11443a;
            if (l != null) {
                long jLongValue = l.longValue();
                if (timeUnit == null) {
                    l41.m4051t("units");
                    return;
                }
                C1274ox c1274ox = new C1274ox(jLongValue);
                C0022al c0022al3 = this.f5472h;
                C1274ox c1274ox2 = c0022al3.f258a;
                if (c1274ox2 != null) {
                    bz1 bz1Var = c1274ox.f8505a;
                    j = 0;
                    if (bz1Var != c1274ox2.f8505a) {
                        StringBuilder sb = new StringBuilder("Tickers (");
                        sb.append(bz1Var);
                        bz1 bz1Var2 = c1274ox2.f8505a;
                        sb.append(" and ");
                        sb.append(bz1Var2);
                        sb.append(") don't match. Custom Ticker should only be used in tests!");
                        throw new AssertionError(sb.toString());
                    }
                    if (c1274ox.f8506b - c1274ox2.f8506b < 0) {
                    }
                } else {
                    j = 0;
                }
                c0022al3.getClass();
                C1668zk c1668zkM167b = C0022al.m167b(c0022al3);
                c1668zkM167b.f13439a = c1274ox;
                this.f5472h = new C0022al(c1668zkM167b);
            } else {
                j = 0;
            }
            Boolean bool = ux0Var.f11444b;
            if (bool != null) {
                boolean zBooleanValue = bool.booleanValue();
                C0022al c0022al4 = this.f5472h;
                c0022al4.getClass();
                if (zBooleanValue) {
                    C1668zk c1668zkM167b2 = C0022al.m167b(c0022al4);
                    c1668zkM167b2.f13444f = Boolean.TRUE;
                    c0022al = new C0022al(c1668zkM167b2);
                } else {
                    C1668zk c1668zkM167b3 = C0022al.m167b(c0022al4);
                    c1668zkM167b3.f13444f = Boolean.FALSE;
                    c0022al = new C0022al(c1668zkM167b3);
                }
                this.f5472h = c0022al;
            }
            if (num2 != null) {
                C0022al c0022al5 = this.f5472h;
                Integer num3 = c0022al5.f264g;
                if (num3 != null) {
                    int iMin = Math.min(num3.intValue(), num2.intValue());
                    p32.m5171i("invalid maxsize %s", iMin, iMin >= 0);
                    C1668zk c1668zkM167b4 = C0022al.m167b(c0022al5);
                    c1668zkM167b4.f13445g = Integer.valueOf(iMin);
                    this.f5472h = new C0022al(c1668zkM167b4);
                } else {
                    int iIntValue = num2.intValue();
                    p32.m5171i("invalid maxsize %s", iIntValue, iIntValue >= 0);
                    C1668zk c1668zkM167b5 = C0022al.m167b(c0022al5);
                    c1668zkM167b5.f13445g = num2;
                    this.f5472h = new C0022al(c1668zkM167b5);
                }
            }
            if (num != null) {
                C0022al c0022al6 = this.f5472h;
                Integer num4 = c0022al6.f265h;
                if (num4 != null) {
                    int iMin2 = Math.min(num4.intValue(), num.intValue());
                    p32.m5171i("invalid maxsize %s", iMin2, iMin2 >= 0);
                    C1668zk c1668zkM167b6 = C0022al.m167b(c0022al6);
                    c1668zkM167b6.f13446h = Integer.valueOf(iMin2);
                    this.f5472h = new C0022al(c1668zkM167b6);
                } else {
                    int iIntValue2 = num.intValue();
                    p32.m5171i("invalid maxsize %s", iIntValue2, iIntValue2 >= 0);
                    C1668zk c1668zkM167b7 = C0022al.m167b(c0022al6);
                    c1668zkM167b7.f13446h = num;
                    this.f5472h = new C0022al(c1668zkM167b7);
                }
            }
        }
        this.f5472h.getClass();
        C1681zx c1681zx = this.f5479o;
        j51Var.m3561a(vi0.f11681h);
        j51Var.m3561a(vi0.f11677d);
        g51 g51Var = vi0.f11678e;
        j51Var.m3561a(g51Var);
        byte[] bArr = c1681zx.f13598b;
        if (bArr.length != 0) {
            j51Var.m3566f(g51Var, bArr);
        }
        j51Var.m3561a(vi0.f11679f);
        j51Var.m3561a(vi0.f11680g);
        C1274ox c1274ox3 = this.f5472h.f258a;
        this.f5469e.getClass();
        C1274ox c1274ox4 = c1274ox3 == null ? null : c1274ox3;
        if (c1274ox4 == null || !c1274ox4.m5075a()) {
            this.f5469e.getClass();
            C1274ox c1274ox5 = this.f5472h.f258a;
            Logger logger = f5463p;
            if (logger.isLoggable(Level.FINE) && c1274ox4 != null && c1274ox4.equals(null)) {
                long jMax = Math.max(j, c1274ox4.m5076b());
                Locale locale = Locale.US;
                StringBuilder sb2 = new StringBuilder("Call timeout set to '" + jMax + "' ns, due to context deadline.");
                if (c1274ox5 == null) {
                    sb2.append(" Explicit call timeout was not set.");
                } else {
                    sb2.append(" Explicit call timeout was '" + c1274ox5.m5076b() + "' ns.");
                }
                logger.fine(sb2.toString());
            }
            C0765is c0765is = this.f5477m;
            u51 u51Var = this.f5465a;
            C0022al c0022al7 = this.f5472h;
            C1307pt c1307pt = this.f5469e;
            if (((ox0) c0765is.f5143b).f8547f0) {
                ux0 ux0Var2 = (ux0) c0022al7.m168a(c0101bj);
                dx0Var = new dx0(c0765is, u51Var, j51Var, c0022al7, ux0Var2 == null ? null : ux0Var2.f11447e, ux0Var2 == null ? null : ux0Var2.f11448f, c1307pt);
            } else {
                InterfaceC1487uo interfaceC1487uoM3481a = c0765is.m3481a(new yc1(u51Var, j51Var, c0022al7));
                C1307pt c1307ptM5326a = c1307pt.m5326a();
                try {
                    dx0Var = interfaceC1487uoM3481a.mo2110d(u51Var, j51Var, c0022al7, vi0.m6631c(c0022al7, j51Var, 0, false));
                    c1307pt.m5327c(c1307ptM5326a);
                } catch (Throwable th) {
                    c1307pt.m5327c(c1307ptM5326a);
                    throw th;
                }
            }
            this.f5473i = dx0Var;
        } else {
            rc2[] rc2VarArrM6631c = vi0.m6631c(this.f5472h, j51Var, 0, false);
            C1274ox c1274ox6 = this.f5472h.f258a;
            this.f5469e.getClass();
            String str = c1274ox6 == null ? "Context" : "CallOptions";
            Long l2 = (Long) this.f5472h.m168a(rc2.f9888a);
            double dM5076b = c1274ox4.m5076b();
            double d = f5464q;
            this.f5473i = new f90(nv1.f7553h.m4614g(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str, Double.valueOf(dM5076b / d), Double.valueOf(l2 == null ? 0.0d : l2.longValue() / d))), EnumC1376ro.f10079a, rc2VarArrM6631c);
        }
        if (this.f5467c) {
            this.f5473i.mo1038n();
        }
        this.f5472h.getClass();
        Integer num5 = this.f5472h.f264g;
        if (num5 != null) {
            this.f5473i.mo1036l(num5.intValue());
        }
        Integer num6 = this.f5472h.f265h;
        if (num6 != null) {
            this.f5473i.mo1028d(num6.intValue());
        }
        if (c1274ox4 != null) {
            this.f5473i.mo1032h(c1274ox4);
        }
        this.f5473i.mo1027c(k50Var);
        this.f5473i.mo1029e(this.f5479o);
        C0599ed c0599ed = this.f5468d;
        ((zv0) c0599ed.f3314b).mo3445a();
        ((bz1) c0599ed.f3313a).m1083f();
        this.f5473i.mo1037m(new C1174o9(this, abstractC0143co));
        this.f5469e.getClass();
        Logger logger2 = C1307pt.f9139a;
        if (c1274ox4 != null) {
            this.f5469e.getClass();
            if (!c1274ox4.equals(null) && this.f5478n != null) {
                long jM5076b = c1274ox4.m5076b();
                this.f5470f = this.f5478n.schedule(new tv0(new RunnableC0757io(this, jM5076b)), jM5076b, timeUnit);
            }
        }
        if (this.f5474j) {
            m3676b();
        }
    }

    @Override // p000.AbstractC0610eo
    public final C1437tb getAttributes() {
        InterfaceC1339qo interfaceC1339qo = this.f5473i;
        return interfaceC1339qo != null ? interfaceC1339qo.getAttributes() : C1437tb.f10816b;
    }

    @Override // p000.AbstractC0610eo
    public final void halfClose() {
        jc1.m3599c();
        try {
            jc1.m3597a();
            p32.m5193x(this.f5473i != null, "Not started");
            p32.m5193x(!this.f5475k, "call was cancelled");
            p32.m5193x(!this.f5476l, "call already half-closed");
            this.f5476l = true;
            this.f5473i.mo1034j();
            jc1.f5363a.getClass();
        } catch (Throwable th) {
            try {
                jc1.f5363a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p000.AbstractC0610eo
    public final boolean isReady() {
        if (this.f5476l) {
            return false;
        }
        return this.f5473i.mo1026b();
    }

    @Override // p000.AbstractC0610eo
    public final void request(int i) {
        jc1.m3599c();
        try {
            jc1.m3597a();
            p32.m5193x(this.f5473i != null, "Not started");
            p32.m5177l(i >= 0, "Number requested must be non-negative");
            this.f5473i.mo1035k(i);
            jc1.f5363a.getClass();
        } catch (Throwable th) {
            try {
                jc1.f5363a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p000.AbstractC0610eo
    public final void sendMessage(Object obj) {
        jc1.m3599c();
        try {
            jc1.m3597a();
            m3677c(obj);
            jc1.f5363a.getClass();
        } catch (Throwable th) {
            try {
                jc1.f5363a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p000.AbstractC0610eo
    public final void setMessageCompression(boolean z) {
        p32.m5193x(this.f5473i != null, "Not started");
        this.f5473i.mo1025a(z);
    }

    @Override // p000.AbstractC0610eo
    public final void start(AbstractC0143co abstractC0143co, j51 j51Var) {
        jc1.m3599c();
        try {
            jc1.m3597a();
            m3678d(abstractC0143co, j51Var);
            jc1.f5363a.getClass();
        } catch (Throwable th) {
            try {
                jc1.f5363a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final String toString() {
        C1679zv c1679zvM5176k0 = p32.m5176k0(this);
        c1679zvM5176k0.m7359a(this.f5465a, FirebaseAnalytics.Param.METHOD);
        return c1679zvM5176k0.toString();
    }
}

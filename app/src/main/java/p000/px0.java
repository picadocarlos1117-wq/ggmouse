package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class px0 extends xw0 {

    /* JADX INFO: renamed from: E */
    public static final Method f9194E;

    /* JADX INFO: renamed from: a */
    public final pn0 f9197a;

    /* JADX INFO: renamed from: b */
    public final pn0 f9198b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f9199c;

    /* JADX INFO: renamed from: d */
    public final y71 f9200d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f9201e;

    /* JADX INFO: renamed from: f */
    public final String f9202f;

    /* JADX INFO: renamed from: g */
    public final String f9203g;

    /* JADX INFO: renamed from: h */
    public final C1681zx f9204h;

    /* JADX INFO: renamed from: i */
    public final C1601xr f9205i;

    /* JADX INFO: renamed from: j */
    public final long f9206j;

    /* JADX INFO: renamed from: k */
    public final int f9207k;

    /* JADX INFO: renamed from: l */
    public final int f9208l;

    /* JADX INFO: renamed from: m */
    public final long f9209m;

    /* JADX INFO: renamed from: n */
    public final long f9210n;

    /* JADX INFO: renamed from: o */
    public final boolean f9211o;

    /* JADX INFO: renamed from: p */
    public final ro0 f9212p;

    /* JADX INFO: renamed from: q */
    public final boolean f9213q;

    /* JADX INFO: renamed from: r */
    public final boolean f9214r;

    /* JADX INFO: renamed from: s */
    public final boolean f9215s;

    /* JADX INFO: renamed from: t */
    public final boolean f9216t;

    /* JADX INFO: renamed from: u */
    public final boolean f9217u;

    /* JADX INFO: renamed from: v */
    public final boolean f9218v;

    /* JADX INFO: renamed from: w */
    public final q91 f9219w;

    /* JADX INFO: renamed from: x */
    public final q91 f9220x;

    /* JADX INFO: renamed from: y */
    public static final Logger f9195y = Logger.getLogger(px0.class.getName());

    /* JADX INFO: renamed from: z */
    public static final long f9196z = 1800000;

    /* JADX INFO: renamed from: A */
    public static final long f9190A = 1000;

    /* JADX INFO: renamed from: B */
    public static final pn0 f9191B = new pn0(vi0.f11689p);

    /* JADX INFO: renamed from: C */
    public static final C1681zx f9192C = C1681zx.f13596d;

    /* JADX INFO: renamed from: D */
    public static final C1601xr f9193D = C1601xr.f12693b;

    static {
        Method declaredMethod;
        try {
            Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
            Class cls2 = Boolean.TYPE;
            declaredMethod = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException e) {
            f9195y.log(Level.FINE, "Unable to apply census stats", (Throwable) e);
            declaredMethod = null;
        } catch (NoSuchMethodException e2) {
            f9195y.log(Level.FINE, "Unable to apply census stats", (Throwable) e2);
            declaredMethod = null;
        }
        f9194E = declaredMethod;
    }

    public px0(String str, q91 q91Var, q91 q91Var2) {
        y71 y71Var;
        pn0 pn0Var = f9191B;
        this.f9197a = pn0Var;
        this.f9198b = pn0Var;
        this.f9199c = new ArrayList();
        Logger logger = y71.f12859d;
        synchronized (y71.class) {
            try {
                if (y71.f12860e == null) {
                    ArrayList arrayList = new ArrayList();
                    try {
                        boolean z = x20.f12431a;
                        arrayList.add(x20.class);
                    } catch (ClassNotFoundException e) {
                        y71.f12859d.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e);
                    }
                    List<x71> listM5773W = rc2.m5773W(x71.class, Collections.unmodifiableList(arrayList), x71.class.getClassLoader(), new pu0(4));
                    if (listM5773W.isEmpty()) {
                        y71.f12859d.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                    }
                    y71.f12860e = new y71();
                    for (x71 x71Var : listM5773W) {
                        y71.f12859d.fine("Service loader found " + x71Var);
                        y71 y71Var2 = y71.f12860e;
                        synchronized (y71Var2) {
                            x71Var.getClass();
                            y71Var2.f12862b.add(x71Var);
                        }
                    }
                    y71.f12860e.m7029a();
                }
                y71Var = y71.f12860e;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f9200d = y71Var;
        this.f9201e = new ArrayList();
        this.f9203g = "pick_first";
        this.f9204h = f9192C;
        this.f9205i = f9193D;
        this.f9206j = f9196z;
        this.f9207k = 5;
        this.f9208l = 5;
        this.f9209m = 16777216L;
        this.f9210n = 1048576L;
        this.f9211o = true;
        this.f9212p = ro0.f10085e;
        this.f9213q = true;
        this.f9214r = true;
        this.f9215s = true;
        this.f9216t = true;
        this.f9217u = true;
        this.f9218v = true;
        p32.m5188s(str, "target");
        this.f9202f = str;
        this.f9219w = q91Var;
        this.f9220x = q91Var2;
    }

    @Override // p000.xw0
    /* JADX INFO: renamed from: a */
    public final ww0 mo932a() {
        SSLSocketFactory sSLSocketFactory;
        Method method;
        s91 s91Var = this.f9219w.f9447a;
        boolean z = s91Var.f10323h != Long.MAX_VALUE;
        pn0 pn0Var = s91Var.f10318c;
        pn0 pn0Var2 = s91Var.f10319d;
        int iM5359z = AbstractC1308pu.m5359z(s91Var.f10322g);
        if (iM5359z == 0) {
            try {
                if (s91Var.f10320e == null) {
                    s91Var.f10320e = SSLContext.getInstance("Default", od1.f7763d.f7764a).getSocketFactory();
                }
                sSLSocketFactory = s91Var.f10320e;
            } catch (GeneralSecurityException e) {
                l41.m4043l("TLS Provider failure", e);
                return null;
            }
        } else {
            if (iM5359z != 1) {
                l41.m4048q("Unknown negotiation type: ".concat(jd0.m3600A(s91Var.f10322g)));
                return null;
            }
            sSLSocketFactory = null;
        }
        r91 r91Var = new r91(pn0Var, pn0Var2, sSLSocketFactory, s91Var.f10321f, s91Var.f10326k, z, s91Var.f10323h, s91Var.f10324i, s91Var.f10325j, s91Var.f10327l, s91Var.f10317b);
        bz1 bz1Var = new bz1(23);
        pn0 pn0Var3 = new pn0(vi0.f11689p);
        ti0 ti0Var = vi0.f11691r;
        ArrayList arrayList = new ArrayList(this.f9199c);
        synchronized (ki0.class) {
        }
        if (this.f9214r && (method = f9194E) != null) {
            try {
                if (method.invoke(null, Boolean.valueOf(this.f9215s), Boolean.valueOf(this.f9216t), Boolean.FALSE, Boolean.valueOf(this.f9217u)) != null) {
                    throw new ClassCastException();
                }
            } catch (IllegalAccessException e2) {
                f9195y.log(Level.FINE, "Unable to apply census stats", (Throwable) e2);
            } catch (InvocationTargetException e3) {
                f9195y.log(Level.FINE, "Unable to apply census stats", (Throwable) e3);
            }
        }
        if (this.f9218v) {
            try {
                if (Class.forName("io.grpc.census.InternalCensusTracingAccessor").getDeclaredMethod("getClientInterceptor", null).invoke(null, null) != null) {
                    throw new ClassCastException();
                }
            } catch (ClassNotFoundException e4) {
                f9195y.log(Level.FINE, "Unable to apply census stats", (Throwable) e4);
            } catch (IllegalAccessException e5) {
                f9195y.log(Level.FINE, "Unable to apply census stats", (Throwable) e5);
            } catch (NoSuchMethodException e6) {
                f9195y.log(Level.FINE, "Unable to apply census stats", (Throwable) e6);
            } catch (InvocationTargetException e7) {
                f9195y.log(Level.FINE, "Unable to apply census stats", (Throwable) e7);
            }
        }
        return new rx0(new ox0(this, r91Var, bz1Var, pn0Var3, ti0Var, arrayList));
    }
}

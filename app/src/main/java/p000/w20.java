package p000;

import java.io.IOException;
import java.io.StringReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class w20 extends ua0 {

    /* JADX INFO: renamed from: I */
    public static final Logger f11911I;

    /* JADX INFO: renamed from: J */
    public static final Set f11912J;

    /* JADX INFO: renamed from: K */
    public static final boolean f11913K;

    /* JADX INFO: renamed from: L */
    public static final boolean f11914L;

    /* JADX INFO: renamed from: M */
    public static final boolean f11915M;

    /* JADX INFO: renamed from: N */
    public static String f11916N;

    /* JADX INFO: renamed from: A */
    public boolean f11917A;

    /* JADX INFO: renamed from: B */
    public boolean f11918B;

    /* JADX INFO: renamed from: C */
    public Executor f11919C;

    /* JADX INFO: renamed from: D */
    public final boolean f11920D;

    /* JADX INFO: renamed from: E */
    public final bj0 f11921E;

    /* JADX INFO: renamed from: F */
    public boolean f11922F;

    /* JADX INFO: renamed from: G */
    public AbstractC1337qm f11923G;

    /* JADX INFO: renamed from: q */
    public final sh1 f11925q;

    /* JADX INFO: renamed from: t */
    public final String f11928t;

    /* JADX INFO: renamed from: u */
    public final String f11929u;

    /* JADX INFO: renamed from: v */
    public final int f11930v;

    /* JADX INFO: renamed from: w */
    public final cs1 f11931w;

    /* JADX INFO: renamed from: x */
    public final long f11932x;

    /* JADX INFO: renamed from: y */
    public final ry1 f11933y;

    /* JADX INFO: renamed from: z */
    public final sv1 f11934z;

    /* JADX INFO: renamed from: r */
    public final Random f11926r = new Random();

    /* JADX INFO: renamed from: H */
    public volatile int f11924H = 1;

    /* JADX INFO: renamed from: s */
    public final AtomicReference f11927s = new AtomicReference();

    static {
        Logger logger = Logger.getLogger(w20.class.getName());
        f11911I = logger;
        f11912J = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        f11913K = Boolean.parseBoolean(property);
        f11914L = Boolean.parseBoolean(property2);
        f11915M = Boolean.parseBoolean(property3);
        try {
            try {
                try {
                    if (Class.forName("bq0", true, w20.class.getClassLoader()).asSubclass(bq0.class).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (Exception e) {
                    logger.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e);
                }
            } catch (Exception e2) {
                logger.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e2);
            }
        } catch (ClassCastException e3) {
            logger.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e3);
        } catch (ClassNotFoundException e4) {
            logger.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e4);
        }
    }

    public w20(String str, u71 u71Var, cs1 cs1Var, sv1 sv1Var, boolean z) {
        p32.m5188s(u71Var, "args");
        this.f11931w = cs1Var;
        URI uriCreate = URI.create("//".concat(str));
        p32.m5179m(uriCreate.getHost() != null, "Invalid DNS name: %s", str);
        String authority = uriCreate.getAuthority();
        if (authority == null) {
            l41.m4051t(p32.m5153T("nameUri (%s) doesn't have an authority", uriCreate));
            throw null;
        }
        this.f11928t = authority;
        this.f11929u = uriCreate.getHost();
        if (uriCreate.getPort() == -1) {
            this.f11930v = u71Var.f11168a;
        } else {
            this.f11930v = uriCreate.getPort();
        }
        sh1 sh1Var = u71Var.f11169b;
        p32.m5188s(sh1Var, "proxyDetector");
        this.f11925q = sh1Var;
        long nanos = 0;
        if (!z) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j = 30;
            if (property != null) {
                try {
                    j = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    f11911I.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            nanos = j > 0 ? TimeUnit.SECONDS.toNanos(j) : j;
        }
        this.f11932x = nanos;
        this.f11934z = sv1Var;
        ry1 ry1Var = u71Var.f11170c;
        p32.m5188s(ry1Var, "syncContext");
        this.f11933y = ry1Var;
        fx0 fx0Var = u71Var.f11174g;
        this.f11919C = fx0Var;
        this.f11920D = fx0Var == null;
        bj0 bj0Var = u71Var.f11171d;
        p32.m5188s(bj0Var, "serviceConfigParser");
        this.f11921E = bj0Var;
    }

    /* JADX INFO: renamed from: j0 */
    public static Map m6689j0(Map map, Random random, String str) {
        for (Map.Entry entry : map.entrySet()) {
            ua0.m6448f0(f11912J.contains(entry.getKey()), "Bad key: %s", entry);
        }
        List listM5560w = AbstractC1337qm.m5560w("clientLanguage", map);
        if (listM5560w != null && !listM5560w.isEmpty()) {
            Iterator it = listM5560w.iterator();
            while (it.hasNext()) {
                if ("java".equalsIgnoreCase((String) it.next())) {
                }
            }
            return null;
        }
        Double dM5561x = AbstractC1337qm.m5561x("percentage", map);
        if (dM5561x != null) {
            int iIntValue = dM5561x.intValue();
            ua0.m6448f0(iIntValue >= 0 && iIntValue <= 100, "Bad percentage: %s", dM5561x);
            if (random.nextInt(100) >= iIntValue) {
                return null;
            }
        }
        List listM5560w2 = AbstractC1337qm.m5560w("clientHostname", map);
        if (listM5560w2 != null && !listM5560w2.isEmpty()) {
            Iterator it2 = listM5560w2.iterator();
            while (it2.hasNext()) {
                if (((String) it2.next()).equals(str)) {
                }
            }
            return null;
        }
        Map mapM5563z = AbstractC1337qm.m5563z("serviceConfig", map);
        if (mapM5563z != null) {
            return mapM5563z;
        }
        throw new C0656fx(String.format("key '%s' missing in '%s'", map, "serviceConfig"));
    }

    /* JADX INFO: renamed from: k0 */
    public static ArrayList m6690k0() {
        List<String> list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.startsWith("grpc_config=")) {
                String strSubstring = str.substring(12);
                Logger logger = fq0.f3881a;
                gq0 gq0Var = new gq0(new StringReader(strSubstring));
                try {
                    Object objM2843a = fq0.m2843a(gq0Var);
                    try {
                        gq0Var.close();
                    } catch (IOException e) {
                        logger.log(Level.WARNING, "Failed to close", (Throwable) e);
                    }
                    if (!(objM2843a instanceof List)) {
                        throw new ClassCastException("wrong type " + objM2843a);
                    }
                    List list2 = (List) objM2843a;
                    AbstractC1337qm.m5539h(list2);
                    arrayList.addAll(list2);
                } catch (Throwable th) {
                    try {
                        gq0Var.close();
                    } catch (IOException e2) {
                        logger.log(Level.WARNING, "Failed to close", (Throwable) e2);
                    }
                    throw th;
                }
            } else {
                f11911I.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            }
        }
        return arrayList;
    }

    @Override // p000.ua0
    /* JADX INFO: renamed from: A */
    public final String mo6117A() {
        return this.f11928t;
    }

    @Override // p000.ua0
    /* JADX INFO: renamed from: L */
    public final void mo6118L() {
        p32.m5193x(this.f11923G != null, "not started");
        m6692l0();
    }

    @Override // p000.ua0
    /* JADX INFO: renamed from: Q */
    public final void mo6119Q() {
        if (this.f11918B) {
            return;
        }
        this.f11918B = true;
        Executor executor = this.f11919C;
        if (executor == null || !this.f11920D) {
            return;
        }
        ds1.m2385b(this.f11931w, executor);
        this.f11919C = null;
    }

    @Override // p000.ua0
    /* JADX INFO: renamed from: W */
    public final void mo6120W(AbstractC1337qm abstractC1337qm) {
        p32.m5193x(this.f11923G == null, "already started");
        if (this.f11920D) {
            this.f11919C = (Executor) ds1.m2384a(this.f11931w);
        }
        this.f11923G = abstractC1337qm;
        m6692l0();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: i0 */
    public final C1174o9 m6691i0() {
        boolean z;
        v71 v71Var;
        v71 v71Var2;
        List listM3264O;
        v71 v71Var3;
        String str = this.f11929u;
        C1174o9 c1174o9 = new C1174o9(13);
        try {
            c1174o9.f7700c = m6693m0();
            if (!f11915M) {
                return c1174o9;
            }
            List list = Collections.EMPTY_LIST;
            int i = 0;
            if (!f11913K) {
                z = false;
            } else if ("localhost".equalsIgnoreCase(str)) {
                z = f11914L;
            } else if (str.contains(":")) {
                z = false;
            } else {
                boolean z2 = true;
                for (int i2 = 0; i2 < str.length(); i2++) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt != '.') {
                        z2 &= cCharAt >= '0' && cCharAt <= '9';
                    }
                }
                z = true ^ z2;
            }
            Object v71Var4 = null;
            if (z && this.f11927s.get() != null) {
                l41.m4035b();
                return null;
            }
            if (list.isEmpty()) {
                f11911I.log(Level.FINE, "No TXT records found for {0}", new Object[]{str});
            } else {
                Random random = this.f11926r;
                if (f11916N == null) {
                    try {
                        f11916N = InetAddress.getLocalHost().getHostName();
                    } catch (UnknownHostException e) {
                        ca0.m1184p(e);
                        return null;
                    }
                }
                String str2 = f11916N;
                try {
                    ArrayList arrayListM6690k0 = m6690k0();
                    int size = arrayListM6690k0.size();
                    Map mapM6689j0 = null;
                    while (i < size) {
                        Object obj = arrayListM6690k0.get(i);
                        i++;
                        try {
                            mapM6689j0 = m6689j0((Map) obj, random, str2);
                            if (mapM6689j0 != null) {
                                break;
                            }
                        } catch (RuntimeException e2) {
                            v71Var = new v71(nv1.f7552g.m4614g("failed to pick service config choice").m4613f(e2));
                        }
                    }
                    v71Var = mapM6689j0 == null ? null : new v71(mapM6689j0);
                } catch (IOException | RuntimeException e3) {
                    v71Var = new v71(nv1.f7552g.m4614g("failed to parse TXT records").m4613f(e3));
                }
                if (v71Var != null) {
                    nv1 nv1Var = v71Var.f11573a;
                    if (nv1Var != null) {
                        v71Var4 = new v71(nv1Var);
                    } else {
                        Map map = (Map) v71Var.f11574b;
                        bj0 bj0Var = this.f11921E;
                        bj0Var.getClass();
                        try {
                            C0558d8 c0558d8 = (C0558d8) bj0Var.f1388d;
                            c0558d8.getClass();
                            if (map != null) {
                                try {
                                    listM3264O = hr1.m3264O(hr1.m3284t(map));
                                } catch (RuntimeException e4) {
                                    v71Var3 = new v71(nv1.f7552g.m4614g("can't parse load balancer configuration").m4613f(e4));
                                }
                            } else {
                                listM3264O = null;
                            }
                            v71Var3 = (listM3264O == null || listM3264O.isEmpty()) ? null : hr1.m3260K(listM3264O, (qu0) c0558d8.f2821b);
                            if (v71Var3 != null) {
                                nv1 nv1Var2 = v71Var3.f11573a;
                                if (nv1Var2 != null) {
                                    v71Var4 = new v71(nv1Var2);
                                } else {
                                    v71Var4 = v71Var3.f11574b;
                                }
                            }
                            v71Var2 = new v71(wx0.m6844a(map, bj0Var.f1385a, bj0Var.f1386b, bj0Var.f1387c, v71Var4));
                        } catch (RuntimeException e5) {
                            v71Var2 = new v71(nv1.f7552g.m4614g("failed to parse service config").m4613f(e5));
                        }
                        v71Var4 = v71Var2;
                    }
                }
            }
            c1174o9.f7701d = v71Var4;
            return c1174o9;
        } catch (Exception e6) {
            c1174o9.f7699b = nv1.f7559n.m4614g("Unable to resolve host " + str).m4613f(e6);
            return c1174o9;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m6692l0() {
        if (this.f11922F || this.f11918B) {
            return;
        }
        if (this.f11917A) {
            long j = this.f11932x;
            if (j != 0 && (j <= 0 || this.f11934z.m6141a() <= j)) {
                return;
            }
        }
        this.f11922F = true;
        this.f11919C.execute(new RunnableC1466u3(this, this.f11923G));
    }

    /* JADX INFO: renamed from: m0 */
    public final List m6693m0() {
        try {
            try {
                int i = this.f11924H;
                String str = this.f11929u;
                if (i == 0) {
                    throw null;
                }
                List listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
                ArrayList arrayList = new ArrayList(listUnmodifiableList.size());
                Iterator it = listUnmodifiableList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new a70(new InetSocketAddress((InetAddress) it.next(), this.f11930v)));
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception e) {
                Object obj = k02.f5629a;
                if (e instanceof RuntimeException) {
                    throw ((RuntimeException) e);
                }
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                f11911I.log(Level.FINE, "Address resolution failure", (Throwable) null);
            }
            throw th;
        }
    }
}

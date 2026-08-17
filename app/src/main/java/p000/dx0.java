package p000;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class dx0 implements InterfaceC1339qo {

    /* JADX INFO: renamed from: E */
    public static final d51 f3038E;

    /* JADX INFO: renamed from: F */
    public static final d51 f3039F;

    /* JADX INFO: renamed from: G */
    public static final nv1 f3040G;

    /* JADX INFO: renamed from: H */
    public static final Random f3041H;

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ u51 f3042A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ C0022al f3043B;

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ C1307pt f3044C;

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ C0765is f3045D;

    /* JADX INFO: renamed from: a */
    public final u51 f3046a;

    /* JADX INFO: renamed from: b */
    public final Executor f3047b;

    /* JADX INFO: renamed from: c */
    public final ry1 f3048c;

    /* JADX INFO: renamed from: d */
    public final ScheduledExecutorService f3049d;

    /* JADX INFO: renamed from: e */
    public final j51 f3050e;

    /* JADX INFO: renamed from: f */
    public final pm1 f3051f;

    /* JADX INFO: renamed from: g */
    public final fk0 f3052g;

    /* JADX INFO: renamed from: h */
    public final boolean f3053h;

    /* JADX INFO: renamed from: i */
    public final Object f3054i;

    /* JADX INFO: renamed from: j */
    public final C1363rb f3055j;

    /* JADX INFO: renamed from: k */
    public final long f3056k;

    /* JADX INFO: renamed from: l */
    public final long f3057l;

    /* JADX INFO: renamed from: m */
    public final om1 f3058m;

    /* JADX INFO: renamed from: n */
    public final zj0 f3059n;

    /* JADX INFO: renamed from: o */
    public volatile km1 f3060o;

    /* JADX INFO: renamed from: p */
    public final AtomicBoolean f3061p;

    /* JADX INFO: renamed from: q */
    public final AtomicInteger f3062q;

    /* JADX INFO: renamed from: r */
    public final AtomicInteger f3063r;

    /* JADX INFO: renamed from: s */
    public C1174o9 f3064s;

    /* JADX INFO: renamed from: t */
    public long f3065t;

    /* JADX INFO: renamed from: u */
    public InterfaceC1413so f3066u;

    /* JADX INFO: renamed from: v */
    public C1548wb f3067v;

    /* JADX INFO: renamed from: w */
    public C1548wb f3068w;

    /* JADX INFO: renamed from: x */
    public long f3069x;

    /* JADX INFO: renamed from: y */
    public nv1 f3070y;

    /* JADX INFO: renamed from: z */
    public boolean f3071z;

    static {
        pu0 pu0Var = j51.f5269d;
        BitSet bitSet = g51.f4065d;
        f3038E = new d51("grpc-previous-rpc-attempts", pu0Var);
        f3039F = new d51("grpc-retry-pushback-ms", pu0Var);
        f3040G = nv1.f7551f.m4614g("Stream thrown away because RetriableStream committed");
        f3041H = new Random();
    }

    public dx0(C0765is c0765is, u51 u51Var, j51 j51Var, C0022al c0022al, pm1 pm1Var, fk0 fk0Var, C1307pt c1307pt) {
        this.f3045D = c0765is;
        this.f3042A = u51Var;
        this.f3043B = c0022al;
        this.f3044C = c1307pt;
        ox0 ox0Var = (ox0) c0765is.f5143b;
        C1363rb c1363rb = ox0Var.f8544c0;
        long j = ox0Var.f8545d0;
        long j2 = ox0Var.f8546e0;
        Executor executor = c0022al.f259b;
        executor = executor == null ? ox0Var.f8560p : executor;
        ScheduledExecutorService scheduledExecutorService = ox0Var.f8558n.f12998a.f9834d;
        om1 om1Var = (om1) c0765is.f5142a;
        this.f3048c = new ry1(new yl1());
        this.f3054i = new Object();
        this.f3059n = new zj0(1);
        this.f3060o = new km1(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);
        this.f3061p = new AtomicBoolean();
        this.f3062q = new AtomicInteger();
        this.f3063r = new AtomicInteger();
        this.f3046a = u51Var;
        this.f3055j = c1363rb;
        this.f3056k = j;
        this.f3057l = j2;
        this.f3047b = executor;
        this.f3049d = scheduledExecutorService;
        this.f3050e = j51Var;
        this.f3051f = pm1Var;
        if (pm1Var != null) {
            this.f3069x = pm1Var.f8945b;
        }
        this.f3052g = fk0Var;
        p32.m5177l(pm1Var == null || fk0Var == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.f3053h = fk0Var != null;
        this.f3058m = om1Var;
    }

    /* JADX INFO: renamed from: o */
    public static void m2393o(dx0 dx0Var, Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            dx0Var.m2398t();
            return;
        }
        synchronized (dx0Var.f3054i) {
            try {
                C1548wb c1548wb = dx0Var.f3068w;
                if (c1548wb == null) {
                    return;
                }
                c1548wb.f12046b = true;
                Future future = (Future) c1548wb.f12048d;
                C1548wb c1548wb2 = new C1548wb(dx0Var.f3054i);
                dx0Var.f3068w = c1548wb2;
                if (future != null) {
                    future.cancel(false);
                }
                c1548wb2.m6741b(dx0Var.f3049d.schedule(new im1(0, dx0Var, c1548wb2), num.intValue(), TimeUnit.MILLISECONDS));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.uv1
    /* JADX INFO: renamed from: a */
    public final void mo1025a(boolean z) {
        m2396r(new dm1(z));
    }

    @Override // p000.uv1
    /* JADX INFO: renamed from: b */
    public final boolean mo1026b() {
        Iterator it = this.f3060o.f5905c.iterator();
        while (it.hasNext()) {
            if (((nm1) it.next()).f7450a.mo1026b()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.uv1
    /* JADX INFO: renamed from: c */
    public final void mo1027c(k50 k50Var) {
        m2396r(new am1(k50Var, 0));
    }

    @Override // p000.InterfaceC1339qo
    /* JADX INFO: renamed from: d */
    public final void mo1028d(int i) {
        m2396r(new cm1(i, 1));
    }

    @Override // p000.InterfaceC1339qo
    /* JADX INFO: renamed from: e */
    public final void mo1029e(C1681zx c1681zx) {
        m2396r(new am1(c1681zx, 2));
    }

    @Override // p000.InterfaceC1339qo
    /* JADX INFO: renamed from: f */
    public final void mo1030f(nv1 nv1Var) {
        nm1 nm1Var;
        nm1 nm1Var2 = new nm1(0);
        nm1Var2.f7450a = new o81();
        zl1 zl1VarM2394p = m2394p(nm1Var2);
        Object obj = this.f3054i;
        if (zl1VarM2394p != null) {
            synchronized (obj) {
                this.f3060o = this.f3060o.m3910e(nm1Var2);
            }
            zl1VarM2394p.run();
            m2400v(nv1Var, EnumC1376ro.f10079a, new j51());
            return;
        }
        synchronized (obj) {
            try {
                if (this.f3060o.f5905c.contains(this.f3060o.f5908f)) {
                    nm1Var = this.f3060o.f5908f;
                } else {
                    this.f3070y = nv1Var;
                    nm1Var = null;
                }
                km1 km1Var = this.f3060o;
                this.f3060o = new km1(km1Var.f5904b, km1Var.f5905c, km1Var.f5906d, km1Var.f5908f, true, km1Var.f5903a, km1Var.f5910h, km1Var.f5907e);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (nm1Var != null) {
            nm1Var.f7450a.mo1030f(nv1Var);
        }
    }

    @Override // p000.uv1
    public final void flush() {
        km1 km1Var = this.f3060o;
        if (km1Var.f5903a) {
            km1Var.f5908f.f7450a.flush();
        } else {
            m2396r(new bm1(0));
        }
    }

    @Override // p000.InterfaceC1339qo
    /* JADX INFO: renamed from: g */
    public final void mo1031g(zj0 zj0Var) {
        km1 km1Var;
        synchronized (this.f3054i) {
            zj0Var.m7315f(this.f3059n, "closed");
            km1Var = this.f3060o;
        }
        if (km1Var.f5908f != null) {
            zj0 zj0Var2 = new zj0(1);
            km1Var.f5908f.f7450a.mo1031g(zj0Var2);
            zj0Var.m7315f(zj0Var2, "committed");
            return;
        }
        zj0 zj0Var3 = new zj0(1);
        for (nm1 nm1Var : km1Var.f5905c) {
            zj0 zj0Var4 = new zj0(1);
            nm1Var.f7450a.mo1031g(zj0Var4);
            zj0Var3.f13431b.add(String.valueOf(zj0Var4));
        }
        zj0Var.m7315f(zj0Var3, "open");
    }

    @Override // p000.InterfaceC1339qo
    public final C1437tb getAttributes() {
        return this.f3060o.f5908f != null ? this.f3060o.f5908f.f7450a.getAttributes() : C1437tb.f10816b;
    }

    @Override // p000.InterfaceC1339qo
    /* JADX INFO: renamed from: h */
    public final void mo1032h(C1274ox c1274ox) {
        m2396r(new am1(c1274ox, 1));
    }

    @Override // p000.uv1
    /* JADX INFO: renamed from: i */
    public final void mo1033i(kh1 kh1Var) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // p000.InterfaceC1339qo
    /* JADX INFO: renamed from: j */
    public final void mo1034j() {
        m2396r(new bm1(1));
    }

    @Override // p000.uv1
    /* JADX INFO: renamed from: k */
    public final void mo1035k(int i) {
        km1 km1Var = this.f3060o;
        if (km1Var.f5903a) {
            km1Var.f5908f.f7450a.mo1035k(i);
        } else {
            m2396r(new cm1(i, 2));
        }
    }

    @Override // p000.InterfaceC1339qo
    /* JADX INFO: renamed from: l */
    public final void mo1036l(int i) {
        m2396r(new cm1(i, 0));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006a A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:27:0x0047, B:29:0x0057, B:31:0x005b, B:36:0x006a, B:39:0x0076), top: B:51:0x0047 }] */
    @Override // p000.InterfaceC1339qo
    /* JADX INFO: renamed from: m */
    public final void mo1037m(InterfaceC1413so interfaceC1413so) {
        nv1 nv1Var;
        C1548wb c1548wb;
        this.f3066u = interfaceC1413so;
        C0599ed c0599ed = ((ox0) this.f3045D.f5143b).f8529N;
        synchronized (c0599ed.f3313a) {
            try {
                nv1Var = (nv1) c0599ed.f3315c;
                c1548wb = null;
                if (nv1Var == null) {
                    ((HashSet) c0599ed.f3314b).add(this);
                    nv1Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (nv1Var != null) {
            mo1030f(nv1Var);
            return;
        }
        synchronized (this.f3054i) {
            this.f3060o.f5904b.add(new jm1(this));
        }
        nm1 nm1VarM2395q = m2395q(0, false);
        if (nm1VarM2395q == null) {
            return;
        }
        if (this.f3053h) {
            synchronized (this.f3054i) {
                try {
                    this.f3060o = this.f3060o.m3906a(nm1VarM2395q);
                    if (m2399u(this.f3060o)) {
                        om1 om1Var = this.f3058m;
                        if (om1Var == null) {
                            c1548wb = new C1548wb(this.f3054i);
                            this.f3068w = c1548wb;
                        } else {
                            if (om1Var.f8407d.get() > om1Var.f8405b) {
                                c1548wb = new C1548wb(this.f3054i);
                                this.f3068w = c1548wb;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (c1548wb != null) {
                c1548wb.m6741b(this.f3049d.schedule(new im1(0, this, c1548wb), this.f3052g.f3841b, TimeUnit.NANOSECONDS));
            }
        }
        m2397s(nm1VarM2395q);
    }

    @Override // p000.uv1
    /* JADX INFO: renamed from: n */
    public final void mo1038n() {
        m2396r(new bm1(2));
    }

    /* JADX INFO: renamed from: p */
    public final zl1 m2394p(nm1 nm1Var) {
        List list;
        boolean z;
        Collection collectionSingleton;
        Future future;
        Future future2;
        synchronized (this.f3054i) {
            try {
                if (this.f3060o.f5908f != null) {
                    return null;
                }
                Collection collection = this.f3060o.f5905c;
                km1 km1Var = this.f3060o;
                p32.m5193x(km1Var.f5908f == null, "Already committed");
                List list2 = km1Var.f5904b;
                if (km1Var.f5905c.contains(nm1Var)) {
                    list = null;
                    collectionSingleton = Collections.singleton(nm1Var);
                    z = true;
                } else {
                    list = list2;
                    z = false;
                    collectionSingleton = Collections.EMPTY_LIST;
                }
                this.f3060o = new km1(list, collectionSingleton, km1Var.f5906d, nm1Var, km1Var.f5909g, z, km1Var.f5910h, km1Var.f5907e);
                this.f3055j.f9866a.addAndGet(-this.f3065t);
                C1548wb c1548wb = this.f3067v;
                if (c1548wb != null) {
                    c1548wb.f12046b = true;
                    Future future3 = (Future) c1548wb.f12048d;
                    this.f3067v = null;
                    future = future3;
                } else {
                    future = null;
                }
                C1548wb c1548wb2 = this.f3068w;
                if (c1548wb2 != null) {
                    c1548wb2.f12046b = true;
                    Future future4 = (Future) c1548wb2.f12048d;
                    this.f3068w = null;
                    future2 = future4;
                } else {
                    future2 = null;
                }
                return new zl1(this, collection, nm1Var, future, future2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final nm1 m2395q(int i, boolean z) {
        AtomicInteger atomicInteger;
        int i2;
        do {
            atomicInteger = this.f3063r;
            i2 = atomicInteger.get();
            if (i2 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i2, i2 + 1));
        nm1 nm1Var = new nm1(i);
        fm1 fm1Var = new fm1(new hm1(this, nm1Var));
        j51 j51Var = new j51();
        j51Var.m3564d(this.f3050e);
        if (i > 0) {
            j51Var.m3566f(f3038E, String.valueOf(i));
        }
        C0022al c0022al = this.f3043B;
        c0022al.getClass();
        List list = c0022al.f262e;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(fm1Var);
        C1668zk c1668zkM167b = C0022al.m167b(c0022al);
        c1668zkM167b.f13443e = Collections.unmodifiableList(arrayList);
        C0022al c0022al2 = new C0022al(c1668zkM167b);
        rc2[] rc2VarArrM6631c = vi0.m6631c(c0022al2, j51Var, i, z);
        u51 u51Var = this.f3042A;
        InterfaceC1487uo interfaceC1487uoM3481a = this.f3045D.m3481a(new yc1(u51Var, j51Var, c0022al2));
        C1307pt c1307pt = this.f3044C;
        C1307pt c1307ptM5326a = c1307pt.m5326a();
        try {
            InterfaceC1339qo interfaceC1339qoMo2110d = interfaceC1487uoM3481a.mo2110d(u51Var, j51Var, c0022al2, rc2VarArrM6631c);
            c1307pt.m5327c(c1307ptM5326a);
            nm1Var.f7450a = interfaceC1339qoMo2110d;
            return nm1Var;
        } catch (Throwable th) {
            c1307pt.m5327c(c1307ptM5326a);
            throw th;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m2396r(gm1 gm1Var) {
        Collection collection;
        synchronized (this.f3054i) {
            try {
                if (!this.f3060o.f5903a) {
                    this.f3060o.f5904b.add(gm1Var);
                }
                collection = this.f3060o.f5905c;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            gm1Var.mo195a((nm1) it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x008d, code lost:
    
        r2 = r3.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0092, code lost:
    
        if (r5 >= r2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0094, code lost:
    
        r6 = r3.get(r5);
        r5 = r5 + 1;
        r6 = (p000.gm1) r6;
        r6.mo195a(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a1, code lost:
    
        if ((r6 instanceof p000.jm1) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a3, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a4, code lost:
    
        r6 = r9.f3060o;
        r8 = r6.f5908f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a8, code lost:
    
        if (r8 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00aa, code lost:
    
        if (r8 == r10) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00af, code lost:
    
        if (r6.f5909g == false) goto L66;
     */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2397s(p000.nm1 r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r4 = r2
            r3 = r1
        L5:
            java.lang.Object r5 = r9.f3054i
            monitor-enter(r5)
            km1 r6 = r9.f3060o     // Catch: java.lang.Throwable -> L12
            nm1 r7 = r6.f5908f     // Catch: java.lang.Throwable -> L12
            if (r7 == 0) goto L15
            if (r7 == r10) goto L15
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            goto L39
        L12:
            r9 = move-exception
            goto Lb4
        L15:
            boolean r7 = r6.f5909g     // Catch: java.lang.Throwable -> L12
            if (r7 == 0) goto L1b
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            goto L39
        L1b:
            java.util.List r7 = r6.f5904b     // Catch: java.lang.Throwable -> L12
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L12
            if (r2 != r7) goto L60
            km1 r0 = r6.m3910e(r10)     // Catch: java.lang.Throwable -> L12
            r9.f3060o = r0     // Catch: java.lang.Throwable -> L12
            boolean r0 = r9.mo1026b()     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L31
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            return
        L31:
            ya r1 = new ya     // Catch: java.lang.Throwable -> L12
            r0 = 23
            r1.<init>(r9, r0)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
        L39:
            if (r1 == 0) goto L41
            ry1 r9 = r9.f3048c
            r9.execute(r1)
            return
        L41:
            if (r4 != 0) goto L4f
            qo r0 = r10.f7450a
            qo0 r1 = new qo0
            r2 = 16
            r1.<init>(r2, r9, r10)
            r0.mo1037m(r1)
        L4f:
            qo r0 = r10.f7450a
            km1 r1 = r9.f3060o
            nm1 r1 = r1.f5908f
            if (r1 != r10) goto L5a
            nv1 r9 = r9.f3070y
            goto L5c
        L5a:
            nv1 r9 = p000.dx0.f3040G
        L5c:
            r0.mo1030f(r9)
            return
        L60:
            boolean r7 = r10.f7451b     // Catch: java.lang.Throwable -> L12
            if (r7 == 0) goto L66
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            return
        L66:
            int r7 = r2 + 128
            java.util.List r8 = r6.f5904b     // Catch: java.lang.Throwable -> L12
            int r8 = r8.size()     // Catch: java.lang.Throwable -> L12
            int r7 = java.lang.Math.min(r7, r8)     // Catch: java.lang.Throwable -> L12
            if (r3 != 0) goto L80
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L12
            java.util.List r6 = r6.f5904b     // Catch: java.lang.Throwable -> L12
            java.util.List r2 = r6.subList(r2, r7)     // Catch: java.lang.Throwable -> L12
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L12
            goto L8c
        L80:
            r3.clear()     // Catch: java.lang.Throwable -> L12
            java.util.List r6 = r6.f5904b     // Catch: java.lang.Throwable -> L12
            java.util.List r2 = r6.subList(r2, r7)     // Catch: java.lang.Throwable -> L12
            r3.addAll(r2)     // Catch: java.lang.Throwable -> L12
        L8c:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            int r2 = r3.size()
            r5 = r0
        L92:
            if (r5 >= r2) goto Lb1
            java.lang.Object r6 = r3.get(r5)
            int r5 = r5 + 1
            gm1 r6 = (p000.gm1) r6
            r6.mo195a(r10)
            boolean r6 = r6 instanceof p000.jm1
            if (r6 == 0) goto La4
            r4 = 1
        La4:
            km1 r6 = r9.f3060o
            nm1 r8 = r6.f5908f
            if (r8 == 0) goto Lad
            if (r8 == r10) goto Lad
            goto Lb1
        Lad:
            boolean r6 = r6.f5909g
            if (r6 == 0) goto L92
        Lb1:
            r2 = r7
            goto L5
        Lb4:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dx0.m2397s(nm1):void");
    }

    /* JADX INFO: renamed from: t */
    public final void m2398t() {
        Future future;
        synchronized (this.f3054i) {
            try {
                C1548wb c1548wb = this.f3068w;
                future = null;
                if (c1548wb != null) {
                    c1548wb.f12046b = true;
                    Future future2 = (Future) c1548wb.f12048d;
                    this.f3068w = null;
                    future = future2;
                }
                km1 km1Var = this.f3060o;
                if (!km1Var.f5910h) {
                    km1Var = new km1(km1Var.f5904b, km1Var.f5905c, km1Var.f5906d, km1Var.f5908f, km1Var.f5909g, km1Var.f5903a, true, km1Var.f5907e);
                }
                this.f3060o = km1Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m2399u(km1 km1Var) {
        return km1Var.f5908f == null && km1Var.f5907e < this.f3052g.f3840a && !km1Var.f5910h;
    }

    /* JADX INFO: renamed from: v */
    public final void m2400v(nv1 nv1Var, EnumC1376ro enumC1376ro, j51 j51Var) {
        this.f3064s = new C1174o9(nv1Var, enumC1376ro, j51Var, 22);
        if (this.f3063r.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.f3048c.execute(new RunnableC1091m0(this, nv1Var, enumC1376ro, j51Var, 3));
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m2401w(Object obj) {
        km1 km1Var = this.f3060o;
        if (!km1Var.f5903a) {
            m2396r(new em1(this, obj));
            return;
        }
        InterfaceC1339qo interfaceC1339qo = km1Var.f5908f.f7450a;
        lh1 lh1Var = this.f3046a.f11128d;
        lh1Var.getClass();
        interfaceC1339qo.mo1033i(new kh1((y41) obj, lh1Var.f6351a));
    }
}

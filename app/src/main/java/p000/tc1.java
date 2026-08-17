package p000;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class tc1 extends nu0 {

    /* JADX INFO: renamed from: u */
    public static final Logger f10830u = Logger.getLogger(tc1.class.getName());

    /* JADX INFO: renamed from: g */
    public final hp0 f10831g;

    /* JADX INFO: renamed from: m */
    public final HashMap f10832m;

    /* JADX INFO: renamed from: n */
    public dp0 f10833n;

    /* JADX INFO: renamed from: o */
    public int f10834o;

    /* JADX INFO: renamed from: p */
    public boolean f10835p;

    /* JADX INFO: renamed from: q */
    public qo0 f10836q;

    /* JADX INFO: renamed from: r */
    public EnumC0651fs f10837r;

    /* JADX INFO: renamed from: s */
    public EnumC0651fs f10838s;

    /* JADX INFO: renamed from: t */
    public final boolean f10839t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc1(hp0 hp0Var) {
        super(0);
        boolean z = false;
        this.f10832m = new HashMap();
        this.f10834o = 0;
        this.f10835p = true;
        EnumC0651fs enumC0651fs = EnumC0651fs.f3888d;
        this.f10837r = enumC0651fs;
        this.f10838s = enumC0651fs;
        Logger logger = vi0.f11674a;
        String property = System.getenv("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS");
        property = property == null ? System.getProperty("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS") : property;
        if (!p32.m5152S(property) && Boolean.parseBoolean(property)) {
            z = true;
        }
        this.f10839t = z;
        this.f10831g = hp0Var;
    }

    @Override // p000.nu0
    /* JADX INFO: renamed from: a */
    public final nv1 mo1258a(ku0 ku0Var) {
        List list;
        EnumC0651fs enumC0651fs;
        if (this.f10837r == EnumC0651fs.f3889e) {
            return nv1.f7557l.m4614g("Already shut down");
        }
        List list2 = ku0Var.f6022a;
        C1437tb c1437tb = ku0Var.f6023b;
        if (list2.isEmpty()) {
            nv1 nv1VarM4614g = nv1.f7559n.m4614g("NameResolver returned no usable address. addrs=" + list2 + ", attrs=" + c1437tb);
            mo1259n(nv1VarM4614g);
            return nv1VarM4614g;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((a70) it.next()) == null) {
                nv1 nv1VarM4614g2 = nv1.f7559n.m4614g("NameResolver returned address list with null endpoint. addrs=" + list2 + ", attrs=" + c1437tb);
                mo1259n(nv1VarM4614g2);
                return nv1VarM4614g2;
            }
        }
        this.f10835p = true;
        nm0 nm0VarM5566m = qm0.m5566m();
        nm0VarM5566m.m3904d(list2);
        kk1 kk1VarM4561g = nm0VarM5566m.m4561g();
        dp0 dp0Var = this.f10833n;
        EnumC0651fs enumC0651fs2 = EnumC0651fs.f3886b;
        if (dp0Var == null) {
            dp0 dp0Var2 = new dp0();
            dp0Var2.f2989a = kk1VarM4561g != null ? kk1VarM4561g : Collections.EMPTY_LIST;
            this.f10833n = dp0Var2;
        } else if (this.f10837r == enumC0651fs2) {
            SocketAddress socketAddressM2376a = dp0Var.m2376a();
            dp0 dp0Var3 = this.f10833n;
            if (kk1VarM4561g != null) {
                list = kk1VarM4561g;
            } else {
                dp0Var3.getClass();
                list = Collections.EMPTY_LIST;
            }
            dp0Var3.f2989a = list;
            dp0Var3.f2990b = 0;
            dp0Var3.f2991c = 0;
            if (this.f10833n.m2380e(socketAddressM2376a)) {
                return nv1.f7550e;
            }
            dp0 dp0Var4 = this.f10833n;
            dp0Var4.f2990b = 0;
            dp0Var4.f2991c = 0;
        } else {
            dp0Var.f2989a = kk1VarM4561g != null ? kk1VarM4561g : Collections.EMPTY_LIST;
            dp0Var.f2990b = 0;
            dp0Var.f2991c = 0;
        }
        HashMap map = this.f10832m;
        HashSet<SocketAddress> hashSet = new HashSet(map.keySet());
        HashSet hashSet2 = new HashSet();
        om0 om0VarListIterator = kk1VarM4561g.listIterator(0);
        while (om0VarListIterator.hasNext()) {
            hashSet2.addAll(((a70) om0VarListIterator.next()).f81a);
        }
        for (SocketAddress socketAddress : hashSet) {
            if (!hashSet2.contains(socketAddress)) {
                ((sc1) map.remove(socketAddress)).f10353a.mo4187r0();
            }
        }
        int size = hashSet.size();
        EnumC0651fs enumC0651fs3 = EnumC0651fs.f3885a;
        if (size == 0 || (enumC0651fs = this.f10837r) == enumC0651fs3 || enumC0651fs == enumC0651fs2) {
            this.f10837r = enumC0651fs3;
            m6266t(enumC0651fs3, new qc1(ju0.f5526e, 0));
            m6264r();
            mo4604p();
        } else {
            EnumC0651fs enumC0651fs4 = EnumC0651fs.f3888d;
            if (enumC0651fs == enumC0651fs4) {
                m6266t(enumC0651fs4, new rc1(this, this));
            } else if (enumC0651fs == EnumC0651fs.f3887c) {
                m6264r();
                mo4604p();
            }
        }
        return nv1.f7550e;
    }

    @Override // p000.nu0
    /* JADX INFO: renamed from: n */
    public final void mo1259n(nv1 nv1Var) {
        HashMap map = this.f10832m;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((sc1) it.next()).f10353a.mo4187r0();
        }
        map.clear();
        m6266t(EnumC0651fs.f3887c, new qc1(ju0.m3708a(nv1Var), 0));
    }

    @Override // p000.nu0
    /* JADX INFO: renamed from: p */
    public final void mo4604p() {
        o21 o21Var;
        dp0 dp0Var = this.f10833n;
        if (dp0Var == null || !dp0Var.m2378c() || this.f10837r == EnumC0651fs.f3889e) {
            return;
        }
        SocketAddress socketAddressM2376a = this.f10833n.m2376a();
        HashMap map = this.f10832m;
        boolean zContainsKey = map.containsKey(socketAddressM2376a);
        Logger logger = f10830u;
        if (zContainsKey) {
            o21Var = ((sc1) map.get(socketAddressM2376a)).f10353a;
        } else {
            pc1 pc1Var = new pc1(this);
            iu0 iu0VarM3490c = iu0.m3490c();
            a70[] a70VarArr = {new a70(socketAddressM2376a)};
            sc2.m6060d(1, "arraySize");
            ArrayList arrayList = new ArrayList(rc2.m5794l0(6L));
            Collections.addAll(arrayList, a70VarArr);
            iu0VarM3490c.m3493d(arrayList);
            iu0VarM3490c.m3491a(pc1Var);
            final o21 o21VarMo2597m = this.f10831g.mo2597m(new iu0(iu0VarM3490c.f5160b, iu0VarM3490c.f5161c, iu0VarM3490c.f5162d));
            if (o21VarMo2597m == null) {
                logger.warning("Was not able to create subchannel for " + socketAddressM2376a);
                f40.m2719o("Can't create subchannel");
                return;
            }
            sc1 sc1Var = new sc1(o21VarMo2597m, pc1Var);
            pc1Var.f8845b = sc1Var;
            map.put(socketAddressM2376a, sc1Var);
            if (o21VarMo2597m.getAttributes().f10817a.get(nu0.f7539e) == null) {
                pc1Var.f8844a = C0688gs.m3052a(EnumC0651fs.f3886b);
            }
            o21VarMo2597m.mo2366u0(new mu0() { // from class: oc1
                @Override // p000.mu0
                /* JADX INFO: renamed from: a */
                public final void mo1228a(C0688gs c0688gs) {
                    o21 o21Var2;
                    tc1 tc1Var = this.f7748a;
                    hp0 hp0Var = tc1Var.f10831g;
                    EnumC0651fs enumC0651fs = c0688gs.f4304a;
                    HashMap map2 = tc1Var.f10832m;
                    o21 o21Var3 = o21VarMo2597m;
                    sc1 sc1Var2 = (sc1) map2.get((SocketAddress) o21Var3.m4693D().f81a.get(0));
                    if (sc1Var2 == null || (o21Var2 = sc1Var2.f10353a) != o21Var3 || enumC0651fs == EnumC0651fs.f3889e) {
                        return;
                    }
                    EnumC0651fs enumC0651fs2 = EnumC0651fs.f3888d;
                    if (enumC0651fs == enumC0651fs2) {
                        hp0Var.mo3071K();
                    }
                    sc1.m6030a(sc1Var2, enumC0651fs);
                    EnumC0651fs enumC0651fs3 = tc1Var.f10837r;
                    EnumC0651fs enumC0651fs4 = EnumC0651fs.f3885a;
                    EnumC0651fs enumC0651fs5 = EnumC0651fs.f3887c;
                    if (enumC0651fs3 == enumC0651fs5 || tc1Var.f10838s == enumC0651fs5) {
                        if (enumC0651fs == enumC0651fs4) {
                            return;
                        }
                        if (enumC0651fs == enumC0651fs2) {
                            tc1Var.mo4604p();
                            return;
                        }
                    }
                    int iOrdinal = enumC0651fs.ordinal();
                    if (iOrdinal == 0) {
                        tc1Var.f10837r = enumC0651fs4;
                        tc1Var.m6266t(enumC0651fs4, new qc1(ju0.f5526e, 0));
                        return;
                    }
                    if (iOrdinal == 1) {
                        tc1Var.m6264r();
                        for (sc1 sc1Var3 : map2.values()) {
                            if (!sc1Var3.f10353a.equals(o21Var2)) {
                                sc1Var3.f10353a.mo4187r0();
                            }
                        }
                        map2.clear();
                        EnumC0651fs enumC0651fs6 = EnumC0651fs.f3886b;
                        sc1.m6030a(sc1Var2, enumC0651fs6);
                        map2.put((SocketAddress) o21Var2.m4693D().f81a.get(0), sc1Var2);
                        tc1Var.f10833n.m2380e((SocketAddress) o21Var3.m4693D().f81a.get(0));
                        tc1Var.f10837r = enumC0651fs6;
                        tc1Var.m6267u(sc1Var2);
                        return;
                    }
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            l41.m4038g(enumC0651fs, "Unsupported state:");
                            return;
                        }
                        dp0 dp0Var2 = tc1Var.f10833n;
                        dp0Var2.f2990b = 0;
                        dp0Var2.f2991c = 0;
                        tc1Var.f10837r = enumC0651fs2;
                        tc1Var.m6266t(enumC0651fs2, new rc1(tc1Var, tc1Var));
                        return;
                    }
                    if (tc1Var.f10833n.m2378c() && ((sc1) map2.get(tc1Var.f10833n.m2376a())).f10353a == o21Var3 && tc1Var.f10833n.m2377b()) {
                        tc1Var.m6264r();
                        tc1Var.mo4604p();
                    }
                    dp0 dp0Var3 = tc1Var.f10833n;
                    if (dp0Var3 == null || dp0Var3.m2378c()) {
                        return;
                    }
                    int size = map2.size();
                    List list = tc1Var.f10833n.f2989a;
                    if (size < (list != null ? list.size() : 0)) {
                        return;
                    }
                    Iterator it = map2.values().iterator();
                    while (it.hasNext()) {
                        if (!((sc1) it.next()).f10356d) {
                            return;
                        }
                    }
                    tc1Var.f10837r = enumC0651fs5;
                    tc1Var.m6266t(enumC0651fs5, new qc1(ju0.m3708a(c0688gs.f4305b), 0));
                    int i = tc1Var.f10834o + 1;
                    tc1Var.f10834o = i;
                    List list2 = tc1Var.f10833n.f2989a;
                    if (i >= (list2 != null ? list2.size() : 0) || tc1Var.f10835p) {
                        tc1Var.f10835p = false;
                        tc1Var.f10834o = 0;
                        hp0Var.mo3071K();
                    }
                }
            });
            o21Var = o21VarMo2597m;
        }
        int iOrdinal = ((sc1) map.get(socketAddressM2376a)).f10354b.ordinal();
        if (iOrdinal == 0) {
            if (this.f10839t) {
                m6265s();
                return;
            } else {
                o21Var.mo4186q0();
                return;
            }
        }
        if (iOrdinal == 1) {
            logger.warning("Requesting a connection even though we have a READY subchannel");
            return;
        }
        if (iOrdinal == 2) {
            this.f10833n.m2377b();
            mo4604p();
        } else {
            if (iOrdinal != 3) {
                return;
            }
            o21Var.mo4186q0();
            sc1.m6030a((sc1) map.get(socketAddressM2376a), EnumC0651fs.f3885a);
            m6265s();
        }
    }

    @Override // p000.nu0
    /* JADX INFO: renamed from: q */
    public final void mo1260q() {
        Level level = Level.FINE;
        HashMap map = this.f10832m;
        f10830u.log(level, "Shutting down, currently have {} subchannels created", Integer.valueOf(map.size()));
        EnumC0651fs enumC0651fs = EnumC0651fs.f3889e;
        this.f10837r = enumC0651fs;
        this.f10838s = enumC0651fs;
        m6264r();
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((sc1) it.next()).f10353a.mo4187r0();
        }
        map.clear();
    }

    /* JADX INFO: renamed from: r */
    public final void m6264r() {
        qo0 qo0Var = this.f10836q;
        if (qo0Var != null) {
            qo0Var.m5579B();
            this.f10836q = null;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m6265s() {
        if (this.f10839t) {
            qo0 qo0Var = this.f10836q;
            if (qo0Var != null) {
                qy1 qy1Var = (qy1) qo0Var.f9548b;
                if (!qy1Var.f9608c && !qy1Var.f9607b) {
                    return;
                }
            }
            hp0 hp0Var = this.f10831g;
            this.f10836q = hp0Var.mo3070A().m5929c(new RunnableC1621ya(this, 21), 250L, TimeUnit.MILLISECONDS, hp0Var.mo3073z());
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m6266t(EnumC0651fs enumC0651fs, lu0 lu0Var) {
        if (enumC0651fs == this.f10838s && (enumC0651fs == EnumC0651fs.f3888d || enumC0651fs == EnumC0651fs.f3885a)) {
            return;
        }
        this.f10838s = enumC0651fs;
        this.f10831g.mo2595T(enumC0651fs, lu0Var);
    }

    /* JADX INFO: renamed from: u */
    public final void m6267u(sc1 sc1Var) {
        EnumC0651fs enumC0651fs = sc1Var.f10354b;
        EnumC0651fs enumC0651fs2 = EnumC0651fs.f3886b;
        if (enumC0651fs != enumC0651fs2) {
            return;
        }
        C0688gs c0688gs = sc1Var.f10355c.f8844a;
        EnumC0651fs enumC0651fs3 = c0688gs.f4304a;
        if (enumC0651fs3 == enumC0651fs2) {
            m6266t(enumC0651fs2, new qc1(ju0.m3709b(sc1Var.f10353a, null), 1));
            return;
        }
        EnumC0651fs enumC0651fs4 = EnumC0651fs.f3887c;
        if (enumC0651fs3 == enumC0651fs4) {
            m6266t(enumC0651fs4, new qc1(ju0.m3708a(c0688gs.f4305b), 0));
        } else if (this.f10838s != enumC0651fs4) {
            m6266t(enumC0651fs3, new qc1(ju0.f5526e, 0));
        }
    }
}

package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class cn1 extends nu0 {

    /* JADX INFO: renamed from: s */
    public static final Logger f1869s = Logger.getLogger(cn1.class.getName());

    /* JADX INFO: renamed from: g */
    public final LinkedHashMap f1870g;

    /* JADX INFO: renamed from: m */
    public final hp0 f1871m;

    /* JADX INFO: renamed from: n */
    public boolean f1872n;

    /* JADX INFO: renamed from: o */
    public final xc1 f1873o;

    /* JADX INFO: renamed from: p */
    public EnumC0651fs f1874p;

    /* JADX INFO: renamed from: q */
    public final AtomicInteger f1875q;

    /* JADX INFO: renamed from: r */
    public lu0 f1876r;

    public cn1(hp0 hp0Var) {
        super(0);
        this.f1870g = new LinkedHashMap();
        this.f1873o = new xc1();
        this.f1871m = hp0Var;
        f1869s.log(Level.FINE, "Created");
        this.f1875q = new AtomicInteger(new Random().nextInt());
        this.f1876r = new an1();
    }

    @Override // p000.nu0
    /* JADX INFO: renamed from: a */
    public final nv1 mo1258a(ku0 ku0Var) {
        try {
            this.f1872n = true;
            qo0 qo0VarM1261r = m1261r(ku0Var);
            nv1 nv1Var = (nv1) qo0VarM1261r.f9548b;
            if (!nv1Var.m4612e()) {
                this.f1872n = false;
                return nv1Var;
            }
            m1264u();
            for (u61 u61Var : (List) qo0VarM1261r.f9549c) {
                u61Var.f11135b.mo1260q();
                u61Var.f11137d = EnumC0651fs.f3889e;
                f1869s.log(Level.FINE, "Child balancer {0} deleted", u61Var.f11134a);
            }
            this.f1872n = false;
            return nv1Var;
        } catch (Throwable th) {
            this.f1872n = false;
            throw th;
        }
    }

    @Override // p000.nu0
    /* JADX INFO: renamed from: n */
    public final void mo1259n(nv1 nv1Var) {
        if (this.f1874p != EnumC0651fs.f3886b) {
            this.f1871m.mo2595T(EnumC0651fs.f3887c, new qc1(ju0.m3708a(nv1Var), 1));
        }
    }

    @Override // p000.nu0
    /* JADX INFO: renamed from: q */
    public final void mo1260q() {
        Level level = Level.FINE;
        Logger logger = f1869s;
        logger.log(level, "Shutdown");
        LinkedHashMap linkedHashMap = this.f1870g;
        for (u61 u61Var : linkedHashMap.values()) {
            u61Var.f11135b.mo1260q();
            u61Var.f11137d = EnumC0651fs.f3889e;
            logger.log(Level.FINE, "Child balancer {0} deleted", u61Var.f11134a);
        }
        linkedHashMap.clear();
    }

    /* JADX INFO: renamed from: r */
    public final qo0 m1261r(ku0 ku0Var) {
        LinkedHashMap linkedHashMap;
        v61 v61Var;
        a70 a70Var;
        Level level = Level.FINE;
        Logger logger = f1869s;
        logger.log(level, "Received resolution result: {0}", ku0Var);
        HashMap map = new HashMap();
        List list = ku0Var.f6022a;
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedHashMap = this.f1870g;
            if (!zHasNext) {
                break;
            }
            v61 v61Var2 = new v61((a70) it.next());
            u61 u61Var = (u61) linkedHashMap.get(v61Var2);
            if (u61Var != null) {
                map.put(v61Var2, u61Var);
            } else {
                map.put(v61Var2, new u61(this, v61Var2, this.f1873o, new qc1(ju0.f5526e, 1)));
            }
        }
        int i = 8;
        boolean z = false;
        Object obj = null;
        if (map.isEmpty()) {
            nv1 nv1VarM4614g = nv1.f7559n.m4614g("NameResolver returned no usable address. " + ku0Var);
            mo1259n(nv1VarM4614g);
            return new qo0(nv1VarM4614g, obj, i, z);
        }
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            ou0 ou0Var = ((u61) entry.getValue()).f11136c;
            ((u61) entry.getValue()).getClass();
            if (linkedHashMap.containsKey(key)) {
                u61 u61Var2 = (u61) linkedHashMap.get(key);
                if (u61Var2.f11139f) {
                    u61Var2.f11139f = false;
                }
            } else {
                linkedHashMap.put(key, (u61) entry.getValue());
            }
            u61 u61Var3 = (u61) linkedHashMap.get(key);
            if (key instanceof a70) {
                v61Var = new v61((a70) key);
            } else {
                p32.m5177l(key instanceof v61, "key is wrong type");
                v61Var = (v61) key;
            }
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    a70Var = null;
                    break;
                }
                a70Var = (a70) it2.next();
            } while (!v61Var.equals(new v61(a70Var)));
            p32.m5188s(a70Var, key + " no longer present in load balancer children");
            C1437tb c1437tb = C1437tb.f10816b;
            List listSingletonList = Collections.singletonList(a70Var);
            C1437tb c1437tb2 = C1437tb.f10816b;
            Boolean bool = Boolean.TRUE;
            IdentityHashMap identityHashMap = new IdentityHashMap(1);
            identityHashMap.put(nu0.f7540f, bool);
            for (Map.Entry entry2 : c1437tb2.f10817a.entrySet()) {
                if (!identityHashMap.containsKey(entry2.getKey())) {
                    identityHashMap.put((C1400sb) entry2.getKey(), entry2.getValue());
                }
            }
            ku0 ku0Var2 = new ku0(listSingletonList, new C1437tb(identityHashMap), null);
            ((u61) linkedHashMap.get(key)).getClass();
            if (!u61Var3.f11139f) {
                u61Var3.f11135b.mo2958o(ku0Var2);
            }
        }
        ArrayList arrayList = new ArrayList();
        om0 om0VarListIterator = qm0.m5567n(linkedHashMap.keySet()).listIterator(0);
        while (om0VarListIterator.hasNext()) {
            Object next = om0VarListIterator.next();
            if (!map.containsKey(next)) {
                u61 u61Var4 = (u61) linkedHashMap.get(next);
                v61 v61Var3 = u61Var4.f11134a;
                if (!u61Var4.f11139f) {
                    u61Var4.f11140g.f1870g.remove(v61Var3);
                    u61Var4.f11139f = true;
                    logger.log(Level.FINE, "Child balancer {0} deactivated", v61Var3);
                }
                arrayList.add(u61Var4);
            }
        }
        return new qo0(nv1.f7550e, arrayList, i, z);
    }

    /* JADX INFO: renamed from: s */
    public final bn1 m1262s(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((u61) it.next()).f11138e);
        }
        return new bn1(arrayList, this.f1875q);
    }

    /* JADX INFO: renamed from: t */
    public final void m1263t(EnumC0651fs enumC0651fs, lu0 lu0Var) {
        if (enumC0651fs == this.f1874p && lu0Var.equals(this.f1876r)) {
            return;
        }
        this.f1871m.mo2595T(enumC0651fs, lu0Var);
        this.f1874p = enumC0651fs;
        this.f1876r = lu0Var;
    }

    /* JADX INFO: renamed from: u */
    public final void m1264u() {
        EnumC0651fs enumC0651fs;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = this.f1870g;
        Iterator it = linkedHashMap.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            enumC0651fs = EnumC0651fs.f3886b;
            if (!zHasNext) {
                break;
            }
            u61 u61Var = (u61) it.next();
            if (!u61Var.f11139f && u61Var.f11137d == enumC0651fs) {
                arrayList.add(u61Var);
            }
        }
        if (!arrayList.isEmpty()) {
            m1263t(enumC0651fs, m1262s(arrayList));
            return;
        }
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            EnumC0651fs enumC0651fs2 = ((u61) it2.next()).f11137d;
            EnumC0651fs enumC0651fs3 = EnumC0651fs.f3885a;
            if (enumC0651fs2 == enumC0651fs3 || enumC0651fs2 == EnumC0651fs.f3888d) {
                m1263t(enumC0651fs3, new an1());
                return;
            }
        }
        m1263t(EnumC0651fs.f3887c, m1262s(linkedHashMap.values()));
    }
}

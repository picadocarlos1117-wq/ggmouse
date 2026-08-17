package p000;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: iz */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0771iz implements Map {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5202a;

    /* JADX INFO: renamed from: b */
    public final Map f5203b;

    public C0771iz() {
        this.f5202a = 1;
        this.f5203b = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3500a(Object obj) {
        return m3502c().containsKey(obj);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3501b(Object obj) {
        return m3502c().containsValue(obj);
    }

    /* JADX INFO: renamed from: c */
    public final Map m3502c() {
        switch (this.f5202a) {
            case 0:
                return this.f5203b;
            default:
                return (HashMap) this.f5203b;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        m3502c().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        switch (this.f5202a) {
            case 0:
                return obj != null && m3500a(obj);
            default:
                return m3500a(obj);
        }
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        switch (this.f5202a) {
            case 0:
                py0 py0Var = new py0(((kr1) entrySet()).iterator());
                if (obj == null) {
                    while (py0Var.hasNext()) {
                        if (py0Var.next() == null) {
                            return true;
                        }
                    }
                    return false;
                }
                while (py0Var.hasNext()) {
                    if (obj.equals(py0Var.next())) {
                        return true;
                    }
                }
                return false;
            default:
                return m3501b(obj);
        }
    }

    /* JADX INFO: renamed from: d */
    public double m3503d() {
        HashMap map = (HashMap) this.f5203b;
        if (map.isEmpty()) {
            return 0.0d;
        }
        Iterator it = map.values().iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            i2++;
            if (((jb1) it.next()).m3590d()) {
                i++;
            }
        }
        return (((double) i) / ((double) i2)) * 100.0d;
    }

    /* JADX INFO: renamed from: e */
    public final Set m3504e() {
        return m3502c().entrySet();
    }

    @Override // java.util.Map
    public Set entrySet() {
        switch (this.f5202a) {
            case 0:
                return sc2.m6074r(m3504e(), new C0732hz(0));
            default:
                return m3504e();
        }
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        switch (this.f5202a) {
            case 0:
                return obj != null && AbstractC1337qm.m5554q(this, obj);
            default:
                return m3505f(obj);
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m3505f(Object obj) {
        return obj == this || m3502c().equals(obj);
    }

    /* JADX INFO: renamed from: g */
    public final Object m3506g(Object obj) {
        return m3502c().get(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        switch (this.f5202a) {
            case 0:
                if (obj == null) {
                    return null;
                }
                return (List) m3506g(obj);
            default:
                return m3506g(obj);
        }
    }

    /* JADX INFO: renamed from: h */
    public final int m3507h() {
        return m3502c().hashCode();
    }

    @Override // java.util.Map
    public int hashCode() {
        switch (this.f5202a) {
            case 0:
                return sc2.m6080x(entrySet());
            default:
                return m3507h();
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m3508i() {
        return m3502c().isEmpty();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        switch (this.f5202a) {
            case 0:
                if (m3508i()) {
                    return true;
                }
                return m3510k() == 1 && m3500a(null);
            default:
                return m3508i();
        }
    }

    /* JADX INFO: renamed from: j */
    public final Set m3509j() {
        return m3502c().keySet();
    }

    /* JADX INFO: renamed from: k */
    public final int m3510k() {
        return m3502c().size();
    }

    @Override // java.util.Map
    public Set keySet() {
        switch (this.f5202a) {
            case 0:
                return sc2.m6074r(m3509j(), new C0732hz(1));
            default:
                return m3509j();
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return m3502c().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m3502c().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return m3502c().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        switch (this.f5202a) {
            case 0:
                return m3510k() - (m3500a(null) ? 1 : 0);
            default:
                return m3510k();
        }
    }

    public final String toString() {
        Object obj;
        switch (this.f5202a) {
            case 0:
                obj = this.f5203b;
                break;
            default:
                obj = (HashMap) this.f5203b;
                break;
        }
        return obj.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return m3502c().values();
    }

    public C0771iz(Map map) {
        this.f5202a = 0;
        this.f5203b = map;
    }
}

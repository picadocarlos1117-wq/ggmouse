package p000;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: y0 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class C1611y0 extends AbstractMap {

    /* JADX INFO: renamed from: a */
    public transient C1537w0 f12791a;

    /* JADX INFO: renamed from: b */
    public transient C1055l1 f12792b;

    /* JADX INFO: renamed from: c */
    public final transient Map f12793c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ y61 f12794d;

    public C1611y0(y61 y61Var, Map map) {
        this.f12794d = y61Var;
        this.f12793c = map;
    }

    /* JADX INFO: renamed from: a */
    public final mm0 m6982a(Map.Entry entry) {
        Object key = entry.getKey();
        List list = (List) ((Collection) entry.getValue());
        boolean z = list instanceof RandomAccess;
        y61 y61Var = this.f12794d;
        return new mm0(key, z ? new C0119c1(y61Var, key, list, null) : new C0661g1(y61Var, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        y61 y61Var = this.f12794d;
        if (this.f12793c == y61Var.f12852d) {
            y61Var.m6999c();
            return;
        }
        C1574x0 c1574x0 = new C1574x0(this);
        while (c1574x0.hasNext()) {
            c1574x0.next();
            c1574x0.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f12793c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C1537w0 c1537w0 = this.f12791a;
        if (c1537w0 != null) {
            return c1537w0;
        }
        C1537w0 c1537w1 = new C1537w0(this);
        this.f12791a = c1537w1;
        return c1537w1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f12793c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f12793c;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        List list = (List) collection;
        boolean z = list instanceof RandomAccess;
        y61 y61Var = this.f12794d;
        return z ? new C0119c1(y61Var, obj, list, null) : new C0661g1(y61Var, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f12793c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set keySet() {
        Set c0587e1;
        y61 y61Var = this.f12794d;
        Set set = y61Var.f2364a;
        if (set != null) {
            return set;
        }
        Map map = y61Var.f12852d;
        if (map instanceof NavigableMap) {
            c0587e1 = new C0083b1(y61Var, (NavigableMap) map);
        } else {
            c0587e1 = map instanceof SortedMap ? new C0587e1(y61Var, (SortedMap) map) : new C1648z0(y61Var, map);
        }
        y61Var.f2364a = c0587e1;
        return c0587e1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f12793c.remove(obj);
        if (collection == null) {
            return null;
        }
        y61 y61Var = this.f12794d;
        List list = (List) y61Var.f12854f.get();
        list.addAll(collection);
        y61Var.f12853e -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f12793c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f12793c.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C1055l1 c1055l1 = this.f12792b;
        if (c1055l1 != null) {
            return c1055l1;
        }
        C1055l1 c1055l2 = new C1055l1(this);
        this.f12792b = c1055l2;
        return c1055l2;
    }
}

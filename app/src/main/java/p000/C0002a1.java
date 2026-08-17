package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: a1 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0002a1 extends C0551d1 implements NavigableMap {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ y61 f9g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0002a1(y61 y61Var, NavigableMap navigableMap) {
        super(y61Var, navigableMap);
        this.f9g = y61Var;
    }

    @Override // p000.C0551d1
    /* JADX INFO: renamed from: b */
    public final SortedSet mo9b() {
        return new C0083b1(this.f9g, mo11d());
    }

    @Override // p000.C0551d1
    /* JADX INFO: renamed from: c */
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = mo11d().ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return m6982a(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return mo11d().ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new C0002a1(this.f9g, mo11d().descendingMap());
    }

    /* JADX INFO: renamed from: e */
    public final mm0 m12e(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        List list = (List) this.f9g.f12854f.get();
        list.addAll((Collection) entry.getValue());
        it.remove();
        return new mm0(entry.getKey(), Collections.unmodifiableList(list));
    }

    @Override // p000.C0551d1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final NavigableMap mo11d() {
        return (NavigableMap) ((SortedMap) this.f12793c);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = mo11d().firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return m6982a(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = mo11d().floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return m6982a(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return mo11d().floorKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new C0002a1(this.f9g, mo11d().headMap(obj, z));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = mo11d().higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return m6982a(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return mo11d().higherKey(obj);
    }

    @Override // p000.C0551d1, p000.C1611y0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = mo11d().lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return m6982a(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = mo11d().lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return m6982a(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return mo11d().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return m12e(((C1537w0) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return m12e(((C1537w0) ((C1611y0) descendingMap()).entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new C0002a1(this.f9g, mo11d().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new C0002a1(this.f9g, mo11d().tailMap(obj, z));
    }

    @Override // p000.C0551d1, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // p000.C0551d1, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // p000.C0551d1, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}

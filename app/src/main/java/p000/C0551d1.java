package p000;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: d1 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class C0551d1 extends C1611y0 implements SortedMap {

    /* JADX INFO: renamed from: e */
    public SortedSet f2700e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ y61 f2701f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0551d1(y61 y61Var, SortedMap sortedMap) {
        super(y61Var, sortedMap);
        this.f2701f = y61Var;
    }

    /* JADX INFO: renamed from: b */
    public SortedSet mo9b() {
        return new C0587e1(this.f2701f, mo11d());
    }

    @Override // p000.C1611y0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f2700e;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetMo9b = mo9b();
        this.f2700e = sortedSetMo9b;
        return sortedSetMo9b;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return mo11d().comparator();
    }

    /* JADX INFO: renamed from: d */
    public SortedMap mo11d() {
        return (SortedMap) this.f12793c;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return mo11d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C0551d1(this.f2701f, mo11d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return mo11d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C0551d1(this.f2701f, mo11d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C0551d1(this.f2701f, mo11d().tailMap(obj));
    }
}

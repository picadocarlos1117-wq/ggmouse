package p000;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: e1 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class C0587e1 extends C1648z0 implements SortedSet {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ y61 f3151d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0587e1(y61 y61Var, SortedMap sortedMap) {
        super(y61Var, sortedMap);
        this.f3151d = y61Var;
    }

    /* JADX INFO: renamed from: a */
    public SortedMap mo822a() {
        return (SortedMap) this.f13210b;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return mo822a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return mo822a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C0587e1(this.f3151d, mo822a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return mo822a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C0587e1(this.f3151d, mo822a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C0587e1(this.f3151d, mo822a().tailMap(obj));
    }
}

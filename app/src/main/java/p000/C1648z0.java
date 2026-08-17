package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: z0 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class C1648z0 extends mr1 {

    /* JADX INFO: renamed from: b */
    public final Map f13210b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ y61 f13211c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1648z0(y61 y61Var, Map map) {
        super(0);
        this.f13211c = y61Var;
        map.getClass();
        this.f13210b = map;
    }

    @Override // p000.mr1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            C1574x0 c1574x0 = (C1574x0) it;
            if (!c1574x0.hasNext()) {
                return;
            }
            c1574x0.next();
            c1574x0.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f13210b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f13210b.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f13210b.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f13210b.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f13210b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1574x0(this, this.f13210b.entrySet().iterator());
    }

    @Override // p000.mr1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int size;
        Collection collection = (Collection) this.f13210b.remove(obj);
        if (collection != null) {
            size = collection.size();
            collection.clear();
            this.f13211c.f12853e -= size;
        } else {
            size = 0;
        }
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f13210b.size();
    }
}

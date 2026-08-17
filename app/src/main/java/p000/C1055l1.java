package p000;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l1 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1055l1 extends AbstractCollection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6137a;

    /* JADX INFO: renamed from: b */
    public final Object f6138b;

    public C1055l1(C1611y0 c1611y0) {
        this.f6137a = 2;
        this.f6138b = c1611y0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i = this.f6137a;
        Object obj = this.f6138b;
        switch (i) {
            case 0:
                ((y61) obj).m6999c();
                break;
            case 1:
                ((C1117mq) obj).clear();
                break;
            default:
                ((C1611y0) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        int i = this.f6137a;
        Object obj2 = this.f6138b;
        switch (i) {
            case 0:
                return ((y61) obj2).mo1796b(obj);
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((C1611y0) obj2).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f6137a) {
            case 2:
                return ((C1611y0) this.f6138b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f6137a;
        Object obj = this.f6138b;
        switch (i) {
            case 0:
                return new C1500v0((y61) obj);
            case 1:
                C1117mq c1117mq = (C1117mq) obj;
                Map mapM4439b = c1117mq.m4439b();
                return mapM4439b != null ? mapM4439b.values().iterator() : new C0800jq(c1117mq, 2);
            default:
                return new py0(((C1611y0) obj).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f6137a) {
            case 2:
                C1611y0 c1611y0 = (C1611y0) this.f6138b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : c1611y0.entrySet()) {
                        if (hr1.m3275k(obj, entry.getValue())) {
                            c1611y0.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f6137a) {
            case 2:
                C1611y0 c1611y0 = (C1611y0) this.f6138b;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : c1611y0.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c1611y0.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f6137a) {
            case 2:
                C1611y0 c1611y0 = (C1611y0) this.f6138b;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : c1611y0.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c1611y0.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.f6137a;
        Object obj = this.f6138b;
        switch (i) {
            case 0:
                return ((y61) obj).f12853e;
            case 1:
                return ((C1117mq) obj).size();
            default:
                return ((C1611y0) obj).f12793c.size();
        }
    }

    public /* synthetic */ C1055l1(int i, Serializable serializable) {
        this.f6137a = i;
        this.f6138b = serializable;
    }
}

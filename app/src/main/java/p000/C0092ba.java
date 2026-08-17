package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ba */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class C0092ba extends AbstractSet {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1260a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Map f1261b;

    public /* synthetic */ C0092ba(int i, Map map) {
        this.f1260a = i;
        this.f1261b = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f1260a) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((mt1) this.f1261b).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f1260a) {
            case 1:
                ((mt1) this.f1261b).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f1260a) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((mt1) this.f1261b).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        int i = this.f1260a;
        Map map = this.f1261b;
        switch (i) {
            case 0:
                return new C0596ea((C0633fa) map);
            default:
                return new qt1((mt1) map);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f1260a) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((mt1) this.f1261b).remove(entry.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.f1260a;
        Map map = this.f1261b;
        switch (i) {
            case 0:
                return ((C0633fa) map).f13557c;
            default:
                return ((mt1) map).size();
        }
    }
}

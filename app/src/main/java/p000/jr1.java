package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class jr1 extends mr1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f5501b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Set f5502c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Set f5503d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jr1(Set set, Set set2, int i) {
        super(1);
        this.f5501b = i;
        this.f5502c = set;
        this.f5503d = set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.f5501b;
        Set set = this.f5503d;
        Set set2 = this.f5502c;
        switch (i) {
            case 0:
                return set2.contains(obj) || set.contains(obj);
            default:
                return set2.contains(obj) && set.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f5501b) {
            case 1:
                return this.f5502c.containsAll(collection) && this.f5503d.containsAll(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        int i = this.f5501b;
        Set set = this.f5502c;
        Set set2 = this.f5503d;
        switch (i) {
            case 0:
                return set.isEmpty() && set2.isEmpty();
            default:
                return Collections.disjoint(set2, set);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f5501b) {
            case 0:
                return new ir1(this);
            default:
                return new vp0(this);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.f5501b;
        Set set = this.f5503d;
        Set set2 = this.f5502c;
        switch (i) {
            case 0:
                int size = set2.size();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (!set2.contains(it.next())) {
                        size++;
                    }
                }
                return size;
            default:
                Iterator it2 = set2.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    if (set.contains(it2.next())) {
                        i2++;
                    }
                }
                return i2;
        }
    }
}

package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: w9 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1546w9 implements Collection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12026a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f12027b;

    public C1546w9(Object[] objArr) {
        objArr.getClass();
        this.f12027b = objArr;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f12026a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f12026a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.f12026a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((C0633fa) this.f12027b).clear();
                return;
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        int i;
        int i2 = this.f12026a;
        Object obj2 = this.f12027b;
        switch (i2) {
            case 0:
                Object[] objArr = (Object[]) obj2;
                objArr.getClass();
                if (obj == null) {
                    int length = objArr.length;
                    i = 0;
                    while (i < length) {
                        if (objArr[i] != null) {
                            i++;
                        }
                    }
                    i = -1;
                } else {
                    int length2 = objArr.length;
                    for (int i3 = 0; i3 < length2; i3++) {
                        if (obj.equals(objArr[i3])) {
                            i = i3;
                        }
                    }
                    i = -1;
                }
                return i >= 0;
            default:
                return ((C0633fa) obj2).m7349g(obj) >= 0;
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f12026a) {
            case 0:
                collection.getClass();
                Collection collection2 = collection;
                if (collection2.isEmpty()) {
                    return true;
                }
                Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        int i = this.f12026a;
        Object obj = this.f12027b;
        switch (i) {
            case 0:
                return ((Object[]) obj).length == 0;
            default:
                return ((C0633fa) obj).isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f12026a;
        Object obj = this.f12027b;
        switch (i) {
            case 0:
                Object[] objArr = (Object[]) obj;
                objArr.getClass();
                return new C1657z9(objArr, 0);
            default:
                return new C0128ca((C0633fa) obj, 1);
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f12026a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                C0633fa c0633fa = (C0633fa) this.f12027b;
                int iM7349g = c0633fa.m7349g(obj);
                if (iM7349g < 0) {
                    return false;
                }
                c0633fa.m7351i(iM7349g);
                return true;
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f12026a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                C0633fa c0633fa = (C0633fa) this.f12027b;
                int i = c0633fa.f13557c;
                int i2 = 0;
                boolean z = false;
                while (i2 < i) {
                    if (collection.contains(c0633fa.m7352j(i2))) {
                        c0633fa.m7351i(i2);
                        i2--;
                        i--;
                        z = true;
                    }
                    i2++;
                }
                return z;
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f12026a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                C0633fa c0633fa = (C0633fa) this.f12027b;
                int i = c0633fa.f13557c;
                int i2 = 0;
                boolean z = false;
                while (i2 < i) {
                    if (!collection.contains(c0633fa.m7352j(i2))) {
                        c0633fa.m7351i(i2);
                        i2--;
                        i--;
                        z = true;
                    }
                    i2++;
                }
                return z;
        }
    }

    @Override // java.util.Collection
    public final int size() {
        int i = this.f12026a;
        Object obj = this.f12027b;
        switch (i) {
            case 0:
                return ((Object[]) obj).length;
            default:
                return ((C0633fa) obj).f13557c;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        int i = this.f12026a;
        Object obj = this.f12027b;
        switch (i) {
            case 0:
                Object[] objArr = (Object[]) obj;
                objArr.getClass();
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
                objArrCopyOf.getClass();
                return objArrCopyOf;
            default:
                C0633fa c0633fa = (C0633fa) obj;
                int i2 = c0633fa.f13557c;
                Object[] objArr2 = new Object[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    objArr2[i3] = c0633fa.m7352j(i3);
                }
                return objArr2;
        }
    }

    public C1546w9(C0633fa c0633fa) {
        this.f12027b = c0633fa;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f12026a) {
            case 0:
                objArr.getClass();
                return sc2.m6053X(this, objArr);
            default:
                return ((C0633fa) this.f12027b).m2780l(1, objArr);
        }
    }
}

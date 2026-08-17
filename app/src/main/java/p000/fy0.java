package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class fy0 extends AbstractC1166o1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3921a;

    /* JADX INFO: renamed from: b */
    public final ey0 f3922b;

    public /* synthetic */ fy0(ey0 ey0Var, int i) {
        this.f3921a = i;
        this.f3922b = ey0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f3921a) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int i = this.f3921a;
        collection.getClass();
        switch (i) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f3921a) {
            case 0:
                this.f3922b.clear();
                break;
            default:
                this.f3922b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.f3921a;
        ey0 ey0Var = this.f3922b;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                ey0Var.getClass();
                int iM2656f = ey0Var.m2656f(entry.getKey());
                if (iM2656f < 0) {
                    return false;
                }
                Object[] objArr = ey0Var.f3482b;
                objArr.getClass();
                return hp0.m3214e(objArr[iM2656f], entry.getValue());
            default:
                return ey0Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f3921a) {
            case 0:
                collection.getClass();
                return this.f3922b.m2654d(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // p000.AbstractC1166o1
    public final int getSize() {
        switch (this.f3921a) {
            case 0:
                break;
        }
        return this.f3922b.f3489n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f3921a) {
            case 0:
                break;
        }
        return this.f3922b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.f3921a;
        ey0 ey0Var = this.f3922b;
        switch (i) {
            case 0:
                ey0Var.getClass();
                return new by0(ey0Var, 0);
            default:
                ey0Var.getClass();
                return new by0(ey0Var, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.f3921a;
        ey0 ey0Var = this.f3922b;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    ey0Var.getClass();
                    ey0Var.m2652b();
                    int iM2656f = ey0Var.m2656f(entry.getKey());
                    if (iM2656f >= 0) {
                        Object[] objArr = ey0Var.f3482b;
                        objArr.getClass();
                        if (hp0.m3214e(objArr[iM2656f], entry.getValue())) {
                            ey0Var.m2660j(iM2656f);
                            return true;
                        }
                    }
                }
                return false;
            default:
                ey0Var.m2652b();
                int iM2656f2 = ey0Var.m2656f(obj);
                if (iM2656f2 < 0) {
                    return false;
                }
                ey0Var.m2660j(iM2656f2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.f3921a;
        ey0 ey0Var = this.f3922b;
        collection.getClass();
        switch (i) {
            case 0:
                ey0Var.m2652b();
                break;
            default:
                ey0Var.m2652b();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.f3921a;
        ey0 ey0Var = this.f3922b;
        collection.getClass();
        switch (i) {
            case 0:
                ey0Var.m2652b();
                break;
            default:
                ey0Var.m2652b();
                break;
        }
        return super.retainAll(collection);
    }
}

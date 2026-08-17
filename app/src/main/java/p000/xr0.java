package p000;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class xr0 extends AbstractC1316q1 implements yr0, RandomAccess {

    /* JADX INFO: renamed from: b */
    public final List f12695b;

    static {
        new xr0();
    }

    public xr0() {
        super(false);
        this.f12695b = Collections.EMPTY_LIST;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m5387a();
        this.f12695b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC1316q1, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m5387a();
        if (collection instanceof yr0) {
            collection = ((yr0) collection).mo2499g();
        }
        boolean zAddAll = this.f12695b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // p000.AbstractC1316q1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m5387a();
        this.f12695b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p000.mo0
    /* JADX INFO: renamed from: d */
    public final mo0 mo2783d(int i) {
        List list = this.f12695b;
        if (i < list.size()) {
            l41.m4049r();
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new xr0(arrayList);
    }

    @Override // p000.yr0
    /* JADX INFO: renamed from: g */
    public final List mo2499g() {
        return Collections.unmodifiableList(this.f12695b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List list = this.f12695b;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC0753ik) {
            AbstractC0753ik abstractC0753ik = (AbstractC0753ik) obj;
            String strM3443x = abstractC0753ik.m3443x();
            if (abstractC0753ik.mo2993p()) {
                list.set(i, strM3443x);
            }
            return strM3443x;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, no0.f7481a);
        if (w42.f11969a.m5813V(0, bArr.length, bArr)) {
            list.set(i, str);
        }
        return str;
    }

    @Override // p000.yr0
    /* JADX INFO: renamed from: l */
    public final void mo2500l(AbstractC0753ik abstractC0753ik) {
        m5387a();
        this.f12695b.add(abstractC0753ik);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.yr0
    /* JADX INFO: renamed from: o */
    public final yr0 mo2501o() {
        return this.f9289a ? new e42(this) : this;
    }

    @Override // p000.yr0
    /* JADX INFO: renamed from: r */
    public final Object mo2502r(int i) {
        return this.f12695b.get(i);
    }

    @Override // p000.AbstractC1316q1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m5387a();
        Object objRemove = this.f12695b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        return objRemove instanceof AbstractC0753ik ? ((AbstractC0753ik) objRemove).m3443x() : new String((byte[]) objRemove, no0.f7481a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m5387a();
        Object obj2 = this.f12695b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        return obj2 instanceof AbstractC0753ik ? ((AbstractC0753ik) obj2).m3443x() : new String((byte[]) obj2, no0.f7481a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12695b.size();
    }

    public xr0(ArrayList arrayList) {
        super(true);
        this.f12695b = arrayList;
    }

    public xr0(int i) {
        this(new ArrayList(i));
    }

    @Override // p000.AbstractC1316q1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f12695b.size(), collection);
    }
}

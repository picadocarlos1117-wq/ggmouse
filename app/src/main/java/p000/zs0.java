package p000;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class zs0 implements ListIterator {

    /* JADX INFO: renamed from: b */
    public int f13547b;

    /* JADX INFO: renamed from: d */
    public int f13549d;

    /* JADX INFO: renamed from: e */
    public final AbstractC1092m1 f13550e;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13546a = 0;

    /* JADX INFO: renamed from: c */
    public int f13548c = -1;

    public zs0(bt0 bt0Var, int i) {
        this.f13550e = bt0Var;
        this.f13547b = i;
        this.f13549d = ((AbstractList) bt0Var).modCount;
    }

    /* JADX INFO: renamed from: a */
    public final void m7342a() {
        int i = this.f13546a;
        AbstractC1092m1 abstractC1092m1 = this.f13550e;
        switch (i) {
            case 0:
                if (((AbstractList) ((at0) abstractC1092m1).f1044e).modCount != this.f13549d) {
                    throw new ConcurrentModificationException();
                }
                return;
            default:
                if (((AbstractList) ((bt0) abstractC1092m1)).modCount != this.f13549d) {
                    throw new ConcurrentModificationException();
                }
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.f13546a;
        AbstractC1092m1 abstractC1092m1 = this.f13550e;
        switch (i) {
            case 0:
                m7342a();
                at0 at0Var = (at0) abstractC1092m1;
                int i2 = this.f13547b;
                this.f13547b = i2 + 1;
                at0Var.add(i2, obj);
                this.f13548c = -1;
                this.f13549d = ((AbstractList) at0Var).modCount;
                break;
            default:
                m7342a();
                bt0 bt0Var = (bt0) abstractC1092m1;
                int i3 = this.f13547b;
                this.f13547b = i3 + 1;
                bt0Var.add(i3, obj);
                this.f13548c = -1;
                this.f13549d = ((AbstractList) bt0Var).modCount;
                break;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f13546a;
        AbstractC1092m1 abstractC1092m1 = this.f13550e;
        switch (i) {
            case 0:
                return this.f13547b < ((at0) abstractC1092m1).f1042c;
            default:
                return this.f13547b < ((bt0) abstractC1092m1).f1523b;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f13546a) {
            case 0:
                return this.f13547b > 0;
            default:
                return this.f13547b > 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f13546a;
        AbstractC1092m1 abstractC1092m1 = this.f13550e;
        switch (i) {
            case 0:
                m7342a();
                int i2 = this.f13547b;
                at0 at0Var = (at0) abstractC1092m1;
                if (i2 >= at0Var.f1042c) {
                    ca0.m1185q();
                    return null;
                }
                this.f13547b = i2 + 1;
                this.f13548c = i2;
                return at0Var.f1040a[at0Var.f1041b + i2];
            default:
                m7342a();
                int i3 = this.f13547b;
                bt0 bt0Var = (bt0) abstractC1092m1;
                if (i3 >= bt0Var.f1523b) {
                    ca0.m1185q();
                    return null;
                }
                this.f13547b = i3 + 1;
                this.f13548c = i3;
                return bt0Var.f1522a[i3];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f13546a) {
            case 0:
                break;
        }
        return this.f13547b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f13546a;
        AbstractC1092m1 abstractC1092m1 = this.f13550e;
        switch (i) {
            case 0:
                m7342a();
                int i2 = this.f13547b;
                if (i2 <= 0) {
                    ca0.m1185q();
                    return null;
                }
                int i3 = i2 - 1;
                this.f13547b = i3;
                this.f13548c = i3;
                at0 at0Var = (at0) abstractC1092m1;
                return at0Var.f1040a[at0Var.f1041b + i3];
            default:
                m7342a();
                int i4 = this.f13547b;
                if (i4 <= 0) {
                    ca0.m1185q();
                    return null;
                }
                int i5 = i4 - 1;
                this.f13547b = i5;
                this.f13548c = i5;
                return ((bt0) abstractC1092m1).f1522a[i5];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.f13546a) {
            case 0:
                i = this.f13547b;
                break;
            default:
                i = this.f13547b;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f13546a;
        AbstractC1092m1 abstractC1092m1 = this.f13550e;
        switch (i) {
            case 0:
                at0 at0Var = (at0) abstractC1092m1;
                m7342a();
                int i2 = this.f13548c;
                if (i2 == -1) {
                    f40.m2719o("Call next() or previous() before removing element from the iterator.");
                } else {
                    at0Var.mo702b(i2);
                    this.f13547b = this.f13548c;
                    this.f13548c = -1;
                    this.f13549d = ((AbstractList) at0Var).modCount;
                }
                break;
            default:
                bt0 bt0Var = (bt0) abstractC1092m1;
                m7342a();
                int i3 = this.f13548c;
                if (i3 == -1) {
                    f40.m2719o("Call next() or previous() before removing element from the iterator.");
                } else {
                    bt0Var.mo702b(i3);
                    this.f13547b = this.f13548c;
                    this.f13548c = -1;
                    this.f13549d = ((AbstractList) bt0Var).modCount;
                }
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.f13546a;
        AbstractC1092m1 abstractC1092m1 = this.f13550e;
        switch (i) {
            case 0:
                m7342a();
                int i2 = this.f13548c;
                if (i2 == -1) {
                    f40.m2719o("Call next() or previous() before replacing element from the iterator.");
                } else {
                    ((at0) abstractC1092m1).set(i2, obj);
                }
                break;
            default:
                m7342a();
                int i3 = this.f13548c;
                if (i3 == -1) {
                    f40.m2719o("Call next() or previous() before replacing element from the iterator.");
                } else {
                    ((bt0) abstractC1092m1).set(i3, obj);
                }
                break;
        }
    }

    public zs0(at0 at0Var, int i) {
        this.f13550e = at0Var;
        this.f13547b = i;
        this.f13549d = ((AbstractList) at0Var).modCount;
    }
}

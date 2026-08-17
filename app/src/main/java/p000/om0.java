package p000;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class om0 extends AbstractC0570dk implements ListIterator {

    /* JADX INFO: renamed from: b */
    public final int f8401b;

    /* JADX INFO: renamed from: c */
    public int f8402c;

    /* JADX INFO: renamed from: d */
    public final qm0 f8403d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om0(qm0 qm0Var, int i) {
        super(1);
        int size = qm0Var.size();
        p32.m5189t(i, size);
        this.f8401b = size;
        this.f8402c = i;
        this.f8403d = qm0Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: b */
    public final Object m5041b(int i) {
        return this.f8403d.get(i);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f8402c < this.f8401b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f8402c > 0;
    }

    @Override // p000.AbstractC0570dk, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            ca0.m1185q();
            return null;
        }
        int i = this.f8402c;
        this.f8402c = i + 1;
        return m5041b(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f8402c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            ca0.m1185q();
            return null;
        }
        int i = this.f8402c - 1;
        this.f8402c = i;
        return m5041b(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f8402c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}

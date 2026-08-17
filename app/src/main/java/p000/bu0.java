package p000;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class bu0 extends p22 implements ListIterator {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1531b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractList f1532c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bu0(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator);
        this.f1531b = i;
        this.f1532c = abstractList;
    }

    @Override // p000.p22
    /* JADX INFO: renamed from: a */
    public final Object mo1061a(Object obj) {
        int i = this.f1531b;
        AbstractList abstractList = this.f1532c;
        switch (i) {
            case 0:
                return ((cu0) abstractList).f2626b.apply(obj);
            default:
                return ((du0) abstractList).f3013b.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f8670a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f8670a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return mo1061a(((ListIterator) this.f8670a).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f8670a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}

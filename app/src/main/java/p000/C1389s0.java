package p000;

import java.util.ListIterator;

/* JADX INFO: renamed from: s0 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1389s0 extends C1657z9 implements ListIterator {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC1463u0 f10175d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1389s0(AbstractC1463u0 abstractC1463u0, int i) {
        super(abstractC1463u0);
        this.f10175d = abstractC1463u0;
        int iMo6170a = abstractC1463u0.mo6170a();
        if (i < 0 || i > iMo6170a) {
            f40.m2718n(AbstractC1308pu.m5338e("index: ", i, iMo6170a, ", size: "));
            throw null;
        }
        this.f13317c = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f13317c > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f13317c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            ca0.m1185q();
            return null;
        }
        int i = this.f13317c - 1;
        this.f13317c = i;
        return this.f10175d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f13317c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

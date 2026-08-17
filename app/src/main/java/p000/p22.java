package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p22 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final Iterator f8670a;

    public p22(Iterator it) {
        it.getClass();
        this.f8670a = it;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo1061a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8670a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo1061a(this.f8670a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f8670a.remove();
    }
}

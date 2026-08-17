package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class d42 implements Iterator {

    /* JADX INFO: renamed from: a */
    public Iterator f2783a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2783a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f2783a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

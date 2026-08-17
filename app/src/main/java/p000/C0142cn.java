package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: cn */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0142cn implements Iterator {

    /* JADX INFO: renamed from: a */
    public final int f1865a;

    /* JADX INFO: renamed from: b */
    public final int f1866b;

    /* JADX INFO: renamed from: c */
    public boolean f1867c;

    /* JADX INFO: renamed from: d */
    public int f1868d;

    public C0142cn(char c, char c2, int i) {
        this.f1865a = i;
        this.f1866b = c2;
        boolean z = false;
        if (i <= 0 ? c >= c2 : c < c2 || c == c2) {
            z = true;
        }
        this.f1867c = z;
        this.f1868d = z ? c : c2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1867c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f1868d;
        if (i != this.f1866b) {
            this.f1868d = this.f1865a + i;
        } else {
            if (!this.f1867c) {
                ca0.m1185q();
                return null;
            }
            this.f1867c = false;
        }
        return Character.valueOf((char) i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

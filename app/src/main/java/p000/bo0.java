package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class bo0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final int f1454a;

    /* JADX INFO: renamed from: b */
    public final int f1455b;

    /* JADX INFO: renamed from: c */
    public boolean f1456c;

    /* JADX INFO: renamed from: d */
    public int f1457d;

    public bo0(int i, int i2, int i3) {
        this.f1454a = i3;
        this.f1455b = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f1456c = z;
        this.f1457d = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1456c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int i = this.f1457d;
        if (i != this.f1455b) {
            this.f1457d = this.f1454a + i;
            return i;
        }
        if (this.f1456c) {
            this.f1456c = false;
            return i;
        }
        ca0.m1185q();
        return 0;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

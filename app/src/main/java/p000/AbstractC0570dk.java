package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: dk */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0570dk implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2955a;

    /* JADX INFO: renamed from: a */
    public abstract byte mo1227a();

    @Override // java.util.Iterator
    public Object next() {
        return Byte.valueOf(mo1227a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2955a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}

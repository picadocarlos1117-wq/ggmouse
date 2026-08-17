package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ca */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0128ca implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f1721a;

    /* JADX INFO: renamed from: b */
    public int f1722b;

    /* JADX INFO: renamed from: c */
    public boolean f1723c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1724d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f1725e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0128ca(C0633fa c0633fa, int i) {
        this(c0633fa.f13557c);
        this.f1724d = i;
        switch (i) {
            case 1:
                this.f1725e = c0633fa;
                this(c0633fa.f13557c);
                break;
            default:
                this.f1725e = c0633fa;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1722b < this.f1721a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objM7350h;
        if (!hasNext()) {
            ca0.m1185q();
            return null;
        }
        int i = this.f1722b;
        int i2 = this.f1724d;
        Object obj = this.f1725e;
        switch (i2) {
            case 0:
                objM7350h = ((C0633fa) obj).m7350h(i);
                break;
            case 1:
                objM7350h = ((C0633fa) obj).m7352j(i);
                break;
            default:
                objM7350h = ((C0707ha) obj).f4490b[i];
                break;
        }
        this.f1722b++;
        this.f1723c = true;
        return objM7350h;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f1723c) {
            l41.m4046o();
            return;
        }
        int i = this.f1722b - 1;
        this.f1722b = i;
        int i2 = this.f1724d;
        Object obj = this.f1725e;
        switch (i2) {
            case 0:
                ((C0633fa) obj).m7351i(i);
                break;
            case 1:
                ((C0633fa) obj).m7351i(i);
                break;
            default:
                ((C0707ha) obj).m3121h(i);
                break;
        }
        this.f1721a--;
        this.f1723c = false;
    }

    public C0128ca(int i) {
        this.f1721a = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0128ca(C0707ha c0707ha) {
        this(c0707ha.f4491c);
        this.f1724d = 2;
        this.f1725e = c0707ha;
    }
}

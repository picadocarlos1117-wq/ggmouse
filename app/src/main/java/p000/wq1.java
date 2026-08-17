package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class wq1 extends xq1 implements Iterator, InterfaceC0579du {

    /* JADX INFO: renamed from: a */
    public int f12250a;

    /* JADX INFO: renamed from: b */
    public Object f12251b;

    /* JADX INFO: renamed from: c */
    public Iterator f12252c;

    /* JADX INFO: renamed from: d */
    public InterfaceC0579du f12253d;

    @Override // p000.xq1
    /* JADX INFO: renamed from: a */
    public final void mo6820a(Object obj, AbstractC0018ah abstractC0018ah) {
        this.f12251b = obj;
        this.f12250a = 3;
        this.f12253d = abstractC0018ah;
    }

    /* JADX INFO: renamed from: b */
    public final RuntimeException m6821b() {
        int i = this.f12250a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f12250a);
    }

    @Override // p000.InterfaceC0579du
    public final InterfaceC1456tu getContext() {
        return k60.f5681a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f12250a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw m6821b();
                }
                Iterator it = this.f12252c;
                it.getClass();
                if (it.hasNext()) {
                    this.f12250a = 2;
                    return true;
                }
                this.f12252c = null;
            }
            this.f12250a = 5;
            InterfaceC0579du interfaceC0579du = this.f12253d;
            interfaceC0579du.getClass();
            this.f12253d = null;
            interfaceC0579du.resumeWith(z32.f13265a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f12250a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            ca0.m1185q();
            return null;
        }
        if (i == 2) {
            this.f12250a = 1;
            Iterator it = this.f12252c;
            it.getClass();
            return it.next();
        }
        if (i != 3) {
            throw m6821b();
        }
        this.f12250a = 0;
        Object obj = this.f12251b;
        this.f12251b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p000.InterfaceC0579du
    public final void resumeWith(Object obj) {
        ua0.m6440Z(obj);
        this.f12250a = 4;
    }
}

package p000;

import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class wm1 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12230a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f12231b;

    /* JADX INFO: renamed from: c */
    public Object f12232c;

    public wm1(AbstractC0753ik abstractC0753ik) {
        if (!(abstractC0753ik instanceof xm1)) {
            this.f12231b = null;
            this.f12232c = (C0680gk) abstractC0753ik;
            return;
        }
        xm1 xm1Var = (xm1) abstractC0753ik;
        ArrayDeque arrayDeque = new ArrayDeque(xm1Var.f12650m);
        this.f12231b = arrayDeque;
        arrayDeque.push(xm1Var);
        AbstractC0753ik abstractC0753ik2 = xm1Var.f12647e;
        while (abstractC0753ik2 instanceof xm1) {
            xm1 xm1Var2 = (xm1) abstractC0753ik2;
            ((ArrayDeque) this.f12231b).push(xm1Var2);
            abstractC0753ik2 = xm1Var2.f12647e;
        }
        this.f12232c = (C0680gk) abstractC0753ik2;
    }

    /* JADX INFO: renamed from: a */
    public C0680gk m6808a() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f12231b;
        C0680gk c0680gk = (C0680gk) this.f12232c;
        C0680gk c0680gk2 = null;
        if (c0680gk == null) {
            ca0.m1185q();
            return null;
        }
        while (arrayDeque != null && !arrayDeque.isEmpty()) {
            AbstractC0753ik abstractC0753ik = ((xm1) arrayDeque.pop()).f12648f;
            while (abstractC0753ik instanceof xm1) {
                xm1 xm1Var = (xm1) abstractC0753ik;
                arrayDeque.push(xm1Var);
                abstractC0753ik = xm1Var.f12647e;
            }
            C0680gk c0680gk3 = (C0680gk) abstractC0753ik;
            if (!c0680gk3.isEmpty()) {
                c0680gk2 = c0680gk3;
                break;
            }
        }
        this.f12232c = c0680gk2;
        return c0680gk;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f12230a) {
            case 0:
                return ((C0680gk) this.f12232c) != null;
            default:
                return ((Iterator) this.f12231b).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f12230a) {
            case 0:
                return m6808a();
            default:
                return ((og0) ((x10) this.f12232c).f12411c).invoke(((Iterator) this.f12231b).next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f12230a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public wm1(x10 x10Var) {
        this.f12232c = x10Var;
        this.f12231b = ((vq1) x10Var.f12410b).iterator();
    }
}

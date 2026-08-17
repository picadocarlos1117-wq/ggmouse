package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class x90 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final Iterator f12497a;

    /* JADX INFO: renamed from: b */
    public int f12498b = -1;

    /* JADX INFO: renamed from: c */
    public Object f12499c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ y90 f12500d;

    public x90(y90 y90Var) {
        this.f12500d = y90Var;
        this.f12497a = y90Var.f12868a.iterator();
    }

    /* JADX INFO: renamed from: a */
    public final void m6876a() {
        Object next;
        y90 y90Var;
        do {
            Iterator it = this.f12497a;
            if (!it.hasNext()) {
                this.f12498b = 0;
                return;
            } else {
                next = it.next();
                y90Var = this.f12500d;
            }
        } while (((Boolean) y90Var.f12870c.invoke(next)).booleanValue() != y90Var.f12869b);
        this.f12499c = next;
        this.f12498b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f12498b == -1) {
            m6876a();
        }
        return this.f12498b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f12498b == -1) {
            m6876a();
        }
        if (this.f12498b == 0) {
            ca0.m1185q();
            return null;
        }
        Object obj = this.f12499c;
        this.f12499c = null;
        this.f12498b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

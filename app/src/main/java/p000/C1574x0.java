package p000;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: renamed from: x0 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class C1574x0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12390a = 2;

    /* JADX INFO: renamed from: b */
    public final Iterator f12391b;

    /* JADX INFO: renamed from: c */
    public Object f12392c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f12393d;

    public C1574x0(C0661g1 c0661g1) {
        this.f12393d = c0661g1;
        Collection collection = c0661g1.f3940b;
        this.f12392c = collection;
        this.f12391b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: renamed from: a */
    public void m6854a() {
        C0661g1 c0661g1 = (C0661g1) this.f12393d;
        c0661g1.m2882b();
        if (c0661g1.f3940b != ((Collection) this.f12392c)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f12390a) {
            case 0:
                break;
            case 1:
                break;
            default:
                m6854a();
                break;
        }
        return this.f12391b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f12390a;
        Iterator it = this.f12391b;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                this.f12392c = (Collection) entry.getValue();
                return ((C1611y0) this.f12393d).m6982a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                this.f12392c = entry2;
                return entry2.getKey();
            default:
                m6854a();
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f12390a;
        Object obj = this.f12393d;
        Iterator it = this.f12391b;
        switch (i) {
            case 0:
                p32.m5193x(((Collection) this.f12392c) != null, "no calls to next() since the last call to remove()");
                it.remove();
                ((C1611y0) obj).f12794d.f12853e -= ((Collection) this.f12392c).size();
                ((Collection) this.f12392c).clear();
                this.f12392c = null;
                break;
            case 1:
                p32.m5193x(((Map.Entry) this.f12392c) != null, "no calls to next() since the last call to remove()");
                Collection collection = (Collection) ((Map.Entry) this.f12392c).getValue();
                it.remove();
                ((C1648z0) obj).f13211c.f12853e -= collection.size();
                collection.clear();
                this.f12392c = null;
                break;
            default:
                it.remove();
                C0661g1 c0661g1 = (C0661g1) obj;
                c0661g1.f3943e.f12853e--;
                c0661g1.m2883e();
                break;
        }
    }

    public C1574x0(C0661g1 c0661g1, ListIterator listIterator) {
        this.f12393d = c0661g1;
        this.f12392c = c0661g1.f3940b;
        this.f12391b = listIterator;
    }

    public C1574x0(C1648z0 c1648z0, Iterator it) {
        this.f12391b = it;
        this.f12393d = c1648z0;
    }

    public C1574x0(C1611y0 c1611y0) {
        this.f12393d = c1611y0;
        this.f12391b = c1611y0.f12793c.entrySet().iterator();
    }
}

package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: v0 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1500v0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final Iterator f11465a;

    /* JADX INFO: renamed from: b */
    public Object f11466b = null;

    /* JADX INFO: renamed from: c */
    public Collection f11467c = null;

    /* JADX INFO: renamed from: d */
    public Iterator f11468d = wp0.f12245a;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ y61 f11469e;

    public C1500v0(y61 y61Var) {
        this.f11469e = y61Var;
        this.f11465a = y61Var.f12852d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11465a.hasNext() || this.f11468d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f11468d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f11465a.next();
            this.f11466b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f11467c = collection;
            this.f11468d = collection.iterator();
        }
        return this.f11468d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f11468d.remove();
        Collection collection = this.f11467c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f11465a.remove();
        }
        this.f11469e.f12853e--;
    }
}

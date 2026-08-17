package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ea */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0596ea implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: a */
    public int f3298a;

    /* JADX INFO: renamed from: b */
    public int f3299b = -1;

    /* JADX INFO: renamed from: c */
    public boolean f3300c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0633fa f3301d;

    public C0596ea(C0633fa c0633fa) {
        this.f3301d = c0633fa;
        this.f3298a = c0633fa.f13557c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f3300c) {
            f40.m2719o("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f3299b;
        C0633fa c0633fa = this.f3301d;
        Object objM7350h = c0633fa.m7350h(i);
        if (key != objM7350h && (key == null || !key.equals(objM7350h))) {
            return false;
        }
        Object value = entry.getValue();
        Object objM7352j = c0633fa.m7352j(this.f3299b);
        if (value != objM7352j) {
            return value != null && value.equals(objM7352j);
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f3300c) {
            return this.f3301d.m7350h(this.f3299b);
        }
        f40.m2719o("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f3300c) {
            return this.f3301d.m7352j(this.f3299b);
        }
        f40.m2719o("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3299b < this.f3298a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f3300c) {
            f40.m2719o("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.f3299b;
        C0633fa c0633fa = this.f3301d;
        Object objM7350h = c0633fa.m7350h(i);
        Object objM7352j = c0633fa.m7352j(this.f3299b);
        return (objM7350h == null ? 0 : objM7350h.hashCode()) ^ (objM7352j != null ? objM7352j.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            ca0.m1185q();
            return null;
        }
        this.f3299b++;
        this.f3300c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f3300c) {
            l41.m4046o();
            return;
        }
        this.f3301d.m7351i(this.f3299b);
        this.f3299b--;
        this.f3298a--;
        this.f3300c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f3300c) {
            f40.m2719o("This container does not support retaining Map.Entry objects");
            return null;
        }
        int i = (this.f3299b << 1) + 1;
        Object[] objArr = this.f3301d.f13556b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}

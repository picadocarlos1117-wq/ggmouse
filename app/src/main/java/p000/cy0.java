package p000;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class cy0 implements Map.Entry {

    /* JADX INFO: renamed from: a */
    public final ey0 f2661a;

    /* JADX INFO: renamed from: b */
    public final int f2662b;

    /* JADX INFO: renamed from: c */
    public final int f2663c;

    public cy0(ey0 ey0Var, int i) {
        ey0Var.getClass();
        this.f2661a = ey0Var;
        this.f2662b = i;
        this.f2663c = ey0Var.f3488m;
    }

    /* JADX INFO: renamed from: a */
    public final void m2138a() {
        if (this.f2661a.f3488m != this.f2663c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return hp0.m3214e(entry.getKey(), getKey()) && hp0.m3214e(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        m2138a();
        return this.f2661a.f3481a[this.f2662b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        m2138a();
        Object[] objArr = this.f2661a.f3482b;
        objArr.getClass();
        return objArr[this.f2662b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        m2138a();
        ey0 ey0Var = this.f2661a;
        ey0Var.m2652b();
        Object[] objArr = ey0Var.f3482b;
        if (objArr == null) {
            int length = ey0Var.f3481a.length;
            if (length < 0) {
                f40.m2713i("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            ey0Var.f3482b = objArr;
        }
        int i = this.f2662b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}

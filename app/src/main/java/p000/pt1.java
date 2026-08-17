package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class pt1 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a */
    public final Comparable f9159a;

    /* JADX INFO: renamed from: b */
    public Object f9160b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mt1 f9161c;

    public pt1(mt1 mt1Var, Comparable comparable, Object obj) {
        this.f9161c = mt1Var;
        this.f9159a = comparable;
        this.f9160b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f9159a.compareTo(((pt1) obj).f9159a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f9159a;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f9160b;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        zEquals2 = value == null;
                    } else {
                        zEquals2 = obj2.equals(value);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f9159a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f9160b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f9159a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f9160b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f9161c.m4454b();
        Object obj2 = this.f9160b;
        this.f9160b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f9159a + "=" + this.f9160b;
    }
}

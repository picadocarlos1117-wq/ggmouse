package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class qo1 implements Map.Entry {

    /* JADX INFO: renamed from: a */
    public final Object f9550a;

    /* JADX INFO: renamed from: b */
    public final Object f9551b;

    /* JADX INFO: renamed from: c */
    public qo1 f9552c;

    /* JADX INFO: renamed from: d */
    public qo1 f9553d;

    public qo1(Object obj, Object obj2) {
        this.f9550a = obj;
        this.f9551b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qo1)) {
            return false;
        }
        qo1 qo1Var = (qo1) obj;
        return this.f9550a.equals(qo1Var.f9550a) && this.f9551b.equals(qo1Var.f9551b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f9550a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f9551b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f9551b.hashCode() ^ this.f9550a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f9550a + "=" + this.f9551b;
    }
}

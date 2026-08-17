package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class mk1 extends tm0 {

    /* JADX INFO: renamed from: d */
    public final transient pk1 f7030d;

    /* JADX INFO: renamed from: e */
    public final transient Object[] f7031e;

    /* JADX INFO: renamed from: f */
    public final transient int f7032f;

    public mk1(pk1 pk1Var, Object[] objArr, int i) {
        this.f7030d = pk1Var;
        this.f7031e = objArr;
        this.f7032f = i;
    }

    @Override // p000.lm0
    /* JADX INFO: renamed from: b */
    public final int mo2641b(int i, Object[] objArr) {
        return mo2640a().mo2641b(i, objArr);
    }

    @Override // p000.lm0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f7030d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.lm0
    /* JADX INFO: renamed from: i */
    public final boolean mo2642i() {
        return true;
    }

    @Override // p000.lm0
    /* JADX INFO: renamed from: j */
    public final AbstractC0570dk iterator() {
        return mo2640a().listIterator(0);
    }

    @Override // p000.tm0
    /* JADX INFO: renamed from: p */
    public final qm0 mo4428p() {
        return new lk1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7032f;
    }
}

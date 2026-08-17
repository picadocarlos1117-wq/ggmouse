package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class qk1 extends tm0 {

    /* JADX INFO: renamed from: n */
    public static final Object[] f9524n;

    /* JADX INFO: renamed from: o */
    public static final qk1 f9525o;

    /* JADX INFO: renamed from: d */
    public final transient Object[] f9526d;

    /* JADX INFO: renamed from: e */
    public final transient int f9527e;

    /* JADX INFO: renamed from: f */
    public final transient Object[] f9528f;

    /* JADX INFO: renamed from: g */
    public final transient int f9529g;

    /* JADX INFO: renamed from: m */
    public final transient int f9530m;

    static {
        Object[] objArr = new Object[0];
        f9524n = objArr;
        f9525o = new qk1(objArr, 0, objArr, 0, 0);
    }

    public qk1(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f9526d = objArr;
        this.f9527e = i;
        this.f9528f = objArr2;
        this.f9529g = i2;
        this.f9530m = i3;
    }

    @Override // p000.lm0
    /* JADX INFO: renamed from: b */
    public final int mo2641b(int i, Object[] objArr) {
        Object[] objArr2 = this.f9526d;
        int i2 = this.f9530m;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // p000.lm0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f9528f;
            if (objArr.length != 0) {
                int iM5535e0 = AbstractC1337qm.m5535e0(obj);
                while (true) {
                    int i = iM5535e0 & this.f9529g;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iM5535e0 = i + 1;
                }
            }
        }
        return false;
    }

    @Override // p000.lm0
    /* JADX INFO: renamed from: e */
    public final Object[] mo3895e() {
        return this.f9526d;
    }

    @Override // p000.lm0
    /* JADX INFO: renamed from: f */
    public final int mo3896f() {
        return this.f9530m;
    }

    @Override // p000.lm0
    /* JADX INFO: renamed from: h */
    public final int mo3897h() {
        return 0;
    }

    @Override // p000.tm0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f9527e;
    }

    @Override // p000.lm0
    /* JADX INFO: renamed from: i */
    public final boolean mo2642i() {
        return false;
    }

    @Override // p000.lm0
    /* JADX INFO: renamed from: j */
    public final AbstractC0570dk iterator() {
        return mo2640a().listIterator(0);
    }

    @Override // p000.tm0
    /* JADX INFO: renamed from: p */
    public final qm0 mo4428p() {
        return qm0.m5565k(this.f9530m, this.f9526d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f9530m;
    }
}

package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class oh1 extends AbstractC1316q1 implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final oh1 f7791d = new oh1(new Object[0], 0, false);

    /* JADX INFO: renamed from: b */
    public Object[] f7792b;

    /* JADX INFO: renamed from: c */
    public int f7793c;

    public oh1(Object[] objArr, int i, boolean z) {
        super(z);
        this.f7792b = objArr;
        this.f7793c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m5387a();
        if (i < 0 || i > (i2 = this.f7793c)) {
            ca0.m1175g(this.f7793c, AbstractC1308pu.m5343j(i, "Index:", ", Size:"));
            return;
        }
        Object[] objArr = this.f7792b;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[jd0.m3607e(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f7792b, i, objArr2, i + 1, this.f7793c - i);
            this.f7792b = objArr2;
        }
        this.f7792b[i] = obj;
        this.f7793c++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: b */
    public final void m4802b(int i) {
        if (i < 0 || i >= this.f7793c) {
            ca0.m1175g(this.f7793c, AbstractC1308pu.m5343j(i, "Index:", ", Size:"));
        }
    }

    @Override // p000.mo0
    /* JADX INFO: renamed from: d */
    public final mo0 mo2783d(int i) {
        if (i >= this.f7793c) {
            return new oh1(Arrays.copyOf(this.f7792b, i), this.f7793c, true);
        }
        l41.m4049r();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m4802b(i);
        return this.f7792b[i];
    }

    @Override // p000.AbstractC1316q1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m5387a();
        m4802b(i);
        Object[] objArr = this.f7792b;
        Object obj = objArr[i];
        int i2 = this.f7793c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f7793c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m5387a();
        m4802b(i);
        Object[] objArr = this.f7792b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7793c;
    }

    @Override // p000.AbstractC1316q1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m5387a();
        int i = this.f7793c;
        Object[] objArr = this.f7792b;
        if (i == objArr.length) {
            this.f7792b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f7792b;
        int i2 = this.f7793c;
        this.f7793c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}

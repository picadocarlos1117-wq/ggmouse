package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class yn0 extends AbstractC1316q1 implements ko0, RandomAccess, bg1 {

    /* JADX INFO: renamed from: d */
    public static final yn0 f13031d = new yn0(new int[0], 0, false);

    /* JADX INFO: renamed from: b */
    public int[] f13032b;

    /* JADX INFO: renamed from: c */
    public int f13033c;

    public yn0(int[] iArr, int i, boolean z) {
        super(z);
        this.f13032b = iArr;
        this.f13033c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m5387a();
        if (i < 0 || i > (i2 = this.f13033c)) {
            ca0.m1175g(this.f13033c, AbstractC1308pu.m5343j(i, "Index:", ", Size:"));
            return;
        }
        int[] iArr = this.f13032b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[jd0.m3607e(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f13032b, i, iArr2, i + 1, this.f13033c - i);
            this.f13032b = iArr2;
        }
        this.f13032b[i] = iIntValue;
        this.f13033c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC1316q1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m5387a();
        Charset charset = no0.f7481a;
        collection.getClass();
        if (!(collection instanceof yn0)) {
            return super.addAll(collection);
        }
        yn0 yn0Var = (yn0) collection;
        int i = yn0Var.f13033c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f13033c;
        if (Integer.MAX_VALUE - i2 < i) {
            ca0.m1173e();
            return false;
        }
        int i3 = i2 + i;
        int[] iArr = this.f13032b;
        if (i3 > iArr.length) {
            this.f13032b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(yn0Var.f13032b, 0, this.f13032b, this.f13033c, yn0Var.f13033c);
        this.f13033c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m7099b(int i) {
        m5387a();
        int i2 = this.f13033c;
        int[] iArr = this.f13032b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[jd0.m3607e(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f13032b = iArr2;
        }
        int[] iArr3 = this.f13032b;
        int i3 = this.f13033c;
        this.f13033c = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.mo0
    /* JADX INFO: renamed from: d */
    public final mo0 mo2783d(int i) {
        if (i >= this.f13033c) {
            return new yn0(Arrays.copyOf(this.f13032b, i), this.f13033c, true);
        }
        l41.m4049r();
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m7100e(int i) {
        if (i < 0 || i >= this.f13033c) {
            ca0.m1175g(this.f13033c, AbstractC1308pu.m5343j(i, "Index:", ", Size:"));
        }
    }

    @Override // p000.AbstractC1316q1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn0)) {
            return super.equals(obj);
        }
        yn0 yn0Var = (yn0) obj;
        if (this.f13033c != yn0Var.f13033c) {
            return false;
        }
        int[] iArr = yn0Var.f13032b;
        for (int i = 0; i < this.f13033c; i++) {
            if (this.f13032b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m7100e(i);
        return Integer.valueOf(this.f13032b[i]);
    }

    @Override // p000.AbstractC1316q1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f13033c; i2++) {
            i = (i * 31) + this.f13032b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f13033c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f13032b[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC1316q1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m5387a();
        m7100e(i);
        int[] iArr = this.f13032b;
        int i2 = iArr[i];
        int i3 = this.f13033c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f13033c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m5387a();
        if (i2 < i) {
            f40.m2718n("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.f13032b;
        System.arraycopy(iArr, i2, iArr, i, this.f13033c - i2);
        this.f13033c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m5387a();
        m7100e(i);
        int[] iArr = this.f13032b;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13033c;
    }

    @Override // p000.AbstractC1316q1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m7099b(((Integer) obj).intValue());
        return true;
    }
}

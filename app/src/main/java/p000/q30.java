package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class q30 extends AbstractC1316q1 implements go0, RandomAccess, bg1 {

    /* JADX INFO: renamed from: d */
    public static final q30 f9319d = new q30(new double[0], 0, false);

    /* JADX INFO: renamed from: b */
    public double[] f9320b;

    /* JADX INFO: renamed from: c */
    public int f9321c;

    public q30(double[] dArr, int i, boolean z) {
        super(z);
        this.f9320b = dArr;
        this.f9321c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        m5387a();
        if (i < 0 || i > (i2 = this.f9321c)) {
            ca0.m1175g(this.f9321c, AbstractC1308pu.m5343j(i, "Index:", ", Size:"));
            return;
        }
        double[] dArr = this.f9320b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[jd0.m3607e(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f9320b, i, dArr2, i + 1, this.f9321c - i);
            this.f9320b = dArr2;
        }
        this.f9320b[i] = dDoubleValue;
        this.f9321c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC1316q1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m5387a();
        Charset charset = no0.f7481a;
        collection.getClass();
        if (!(collection instanceof q30)) {
            return super.addAll(collection);
        }
        q30 q30Var = (q30) collection;
        int i = q30Var.f9321c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9321c;
        if (Integer.MAX_VALUE - i2 < i) {
            ca0.m1173e();
            return false;
        }
        int i3 = i2 + i;
        double[] dArr = this.f9320b;
        if (i3 > dArr.length) {
            this.f9320b = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(q30Var.f9320b, 0, this.f9320b, this.f9321c, q30Var.f9321c);
        this.f9321c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m5439b(double d) {
        m5387a();
        int i = this.f9321c;
        double[] dArr = this.f9320b;
        if (i == dArr.length) {
            double[] dArr2 = new double[jd0.m3607e(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f9320b = dArr2;
        }
        double[] dArr3 = this.f9320b;
        int i2 = this.f9321c;
        this.f9321c = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.mo0
    /* JADX INFO: renamed from: d */
    public final mo0 mo2783d(int i) {
        if (i >= this.f9321c) {
            return new q30(Arrays.copyOf(this.f9320b, i), this.f9321c, true);
        }
        l41.m4049r();
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m5440e(int i) {
        if (i < 0 || i >= this.f9321c) {
            ca0.m1175g(this.f9321c, AbstractC1308pu.m5343j(i, "Index:", ", Size:"));
        }
    }

    @Override // p000.AbstractC1316q1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q30)) {
            return super.equals(obj);
        }
        q30 q30Var = (q30) obj;
        if (this.f9321c != q30Var.f9321c) {
            return false;
        }
        double[] dArr = q30Var.f9320b;
        for (int i = 0; i < this.f9321c; i++) {
            if (Double.doubleToLongBits(this.f9320b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m5440e(i);
        return Double.valueOf(this.f9320b[i]);
    }

    @Override // p000.AbstractC1316q1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM4573b = 1;
        for (int i = 0; i < this.f9321c; i++) {
            iM4573b = (iM4573b * 31) + no0.m4573b(Double.doubleToLongBits(this.f9320b[i]));
        }
        return iM4573b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.f9321c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f9320b[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC1316q1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m5387a();
        m5440e(i);
        double[] dArr = this.f9320b;
        double d = dArr[i];
        int i2 = this.f9321c;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f9321c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m5387a();
        if (i2 < i) {
            f40.m2718n("toIndex < fromIndex");
            return;
        }
        double[] dArr = this.f9320b;
        System.arraycopy(dArr, i2, dArr, i, this.f9321c - i2);
        this.f9321c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        m5387a();
        m5440e(i);
        double[] dArr = this.f9320b;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9321c;
    }

    @Override // p000.AbstractC1316q1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m5439b(((Double) obj).doubleValue());
        return true;
    }
}

package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class yv0 extends AbstractC1316q1 implements lo0, RandomAccess, bg1 {

    /* JADX INFO: renamed from: d */
    public static final yv0 f13153d = new yv0(new long[0], 0, false);

    /* JADX INFO: renamed from: b */
    public long[] f13154b;

    /* JADX INFO: renamed from: c */
    public int f13155c;

    public yv0(long[] jArr, int i, boolean z) {
        super(z);
        this.f13154b = jArr;
        this.f13155c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        m5387a();
        if (i < 0 || i > (i2 = this.f13155c)) {
            ca0.m1175g(this.f13155c, AbstractC1308pu.m5343j(i, "Index:", ", Size:"));
            return;
        }
        long[] jArr = this.f13154b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[jd0.m3607e(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f13154b, i, jArr2, i + 1, this.f13155c - i);
            this.f13154b = jArr2;
        }
        this.f13154b[i] = jLongValue;
        this.f13155c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC1316q1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m5387a();
        Charset charset = no0.f7481a;
        collection.getClass();
        if (!(collection instanceof yv0)) {
            return super.addAll(collection);
        }
        yv0 yv0Var = (yv0) collection;
        int i = yv0Var.f13155c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f13155c;
        if (Integer.MAX_VALUE - i2 < i) {
            ca0.m1173e();
            return false;
        }
        int i3 = i2 + i;
        long[] jArr = this.f13154b;
        if (i3 > jArr.length) {
            this.f13154b = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(yv0Var.f13154b, 0, this.f13154b, this.f13155c, yv0Var.f13155c);
        this.f13155c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m7151b(long j) {
        m5387a();
        int i = this.f13155c;
        long[] jArr = this.f13154b;
        if (i == jArr.length) {
            long[] jArr2 = new long[jd0.m3607e(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f13154b = jArr2;
        }
        long[] jArr3 = this.f13154b;
        int i2 = this.f13155c;
        this.f13155c = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.mo0
    /* JADX INFO: renamed from: d */
    public final mo0 mo2783d(int i) {
        if (i >= this.f13155c) {
            return new yv0(Arrays.copyOf(this.f13154b, i), this.f13155c, true);
        }
        l41.m4049r();
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m7152e(int i) {
        if (i < 0 || i >= this.f13155c) {
            ca0.m1175g(this.f13155c, AbstractC1308pu.m5343j(i, "Index:", ", Size:"));
        }
    }

    @Override // p000.AbstractC1316q1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv0)) {
            return super.equals(obj);
        }
        yv0 yv0Var = (yv0) obj;
        if (this.f13155c != yv0Var.f13155c) {
            return false;
        }
        long[] jArr = yv0Var.f13154b;
        for (int i = 0; i < this.f13155c; i++) {
            if (this.f13154b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m7152e(i);
        return Long.valueOf(this.f13154b[i]);
    }

    @Override // p000.AbstractC1316q1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM4573b = 1;
        for (int i = 0; i < this.f13155c; i++) {
            iM4573b = (iM4573b * 31) + no0.m4573b(this.f13154b[i]);
        }
        return iM4573b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f13155c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f13154b[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC1316q1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m5387a();
        m7152e(i);
        long[] jArr = this.f13154b;
        long j = jArr[i];
        int i2 = this.f13155c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f13155c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m5387a();
        if (i2 < i) {
            f40.m2718n("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.f13154b;
        System.arraycopy(jArr, i2, jArr, i, this.f13155c - i2);
        this.f13155c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m5387a();
        m7152e(i);
        long[] jArr = this.f13154b;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13155c;
    }

    @Override // p000.AbstractC1316q1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m7151b(((Long) obj).longValue());
        return true;
    }
}

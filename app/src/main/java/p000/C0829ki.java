package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: ki */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0829ki extends AbstractC1316q1 implements fo0, RandomAccess, bg1 {

    /* JADX INFO: renamed from: d */
    public static final C0829ki f5826d = new C0829ki(new boolean[0], 0, false);

    /* JADX INFO: renamed from: b */
    public boolean[] f5827b;

    /* JADX INFO: renamed from: c */
    public int f5828c;

    public C0829ki(boolean[] zArr, int i, boolean z) {
        super(z);
        this.f5827b = zArr;
        this.f5828c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m5387a();
        if (i < 0 || i > (i2 = this.f5828c)) {
            ca0.m1175g(this.f5828c, AbstractC1308pu.m5343j(i, "Index:", ", Size:"));
            return;
        }
        boolean[] zArr = this.f5827b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[jd0.m3607e(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f5827b, i, zArr2, i + 1, this.f5828c - i);
            this.f5827b = zArr2;
        }
        this.f5827b[i] = zBooleanValue;
        this.f5828c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC1316q1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m5387a();
        Charset charset = no0.f7481a;
        collection.getClass();
        if (!(collection instanceof C0829ki)) {
            return super.addAll(collection);
        }
        C0829ki c0829ki = (C0829ki) collection;
        int i = c0829ki.f5828c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f5828c;
        if (Integer.MAX_VALUE - i2 < i) {
            ca0.m1173e();
            return false;
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f5827b;
        if (i3 > zArr.length) {
            this.f5827b = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(c0829ki.f5827b, 0, this.f5827b, this.f5828c, c0829ki.f5828c);
        this.f5828c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m3836b(boolean z) {
        m5387a();
        int i = this.f5828c;
        boolean[] zArr = this.f5827b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[jd0.m3607e(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f5827b = zArr2;
        }
        boolean[] zArr3 = this.f5827b;
        int i2 = this.f5828c;
        this.f5828c = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.mo0
    /* JADX INFO: renamed from: d */
    public final mo0 mo2783d(int i) {
        if (i >= this.f5828c) {
            return new C0829ki(Arrays.copyOf(this.f5827b, i), this.f5828c, true);
        }
        l41.m4049r();
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m3837e(int i) {
        if (i < 0 || i >= this.f5828c) {
            ca0.m1175g(this.f5828c, AbstractC1308pu.m5343j(i, "Index:", ", Size:"));
        }
    }

    @Override // p000.AbstractC1316q1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0829ki)) {
            return super.equals(obj);
        }
        C0829ki c0829ki = (C0829ki) obj;
        if (this.f5828c != c0829ki.f5828c) {
            return false;
        }
        boolean[] zArr = c0829ki.f5827b;
        for (int i = 0; i < this.f5828c; i++) {
            if (this.f5827b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m3837e(i);
        return Boolean.valueOf(this.f5827b[i]);
    }

    @Override // p000.AbstractC1316q1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f5828c; i2++) {
            int i3 = i * 31;
            boolean z = this.f5827b[i2];
            Charset charset = no0.f7481a;
            i = i3 + (z ? 1231 : 1237);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.f5828c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f5827b[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC1316q1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m5387a();
        m3837e(i);
        boolean[] zArr = this.f5827b;
        boolean z = zArr[i];
        int i2 = this.f5828c;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f5828c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m5387a();
        if (i2 < i) {
            f40.m2718n("toIndex < fromIndex");
            return;
        }
        boolean[] zArr = this.f5827b;
        System.arraycopy(zArr, i2, zArr, i, this.f5828c - i2);
        this.f5828c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m5387a();
        m3837e(i);
        boolean[] zArr = this.f5827b;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5828c;
    }

    @Override // p000.AbstractC1316q1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m3836b(((Boolean) obj).booleanValue());
        return true;
    }
}

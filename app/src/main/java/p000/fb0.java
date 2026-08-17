package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class fb0 extends AbstractC1316q1 implements jo0, RandomAccess, bg1 {

    /* JADX INFO: renamed from: d */
    public static final fb0 f3742d = new fb0(new float[0], 0, false);

    /* JADX INFO: renamed from: b */
    public float[] f3743b;

    /* JADX INFO: renamed from: c */
    public int f3744c;

    public fb0(float[] fArr, int i, boolean z) {
        super(z);
        this.f3743b = fArr;
        this.f3744c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        m5387a();
        if (i < 0 || i > (i2 = this.f3744c)) {
            ca0.m1175g(this.f3744c, AbstractC1308pu.m5343j(i, "Index:", ", Size:"));
            return;
        }
        float[] fArr = this.f3743b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[jd0.m3607e(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f3743b, i, fArr2, i + 1, this.f3744c - i);
            this.f3743b = fArr2;
        }
        this.f3743b[i] = fFloatValue;
        this.f3744c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC1316q1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m5387a();
        Charset charset = no0.f7481a;
        collection.getClass();
        if (!(collection instanceof fb0)) {
            return super.addAll(collection);
        }
        fb0 fb0Var = (fb0) collection;
        int i = fb0Var.f3744c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f3744c;
        if (Integer.MAX_VALUE - i2 < i) {
            ca0.m1173e();
            return false;
        }
        int i3 = i2 + i;
        float[] fArr = this.f3743b;
        if (i3 > fArr.length) {
            this.f3743b = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(fb0Var.f3743b, 0, this.f3743b, this.f3744c, fb0Var.f3744c);
        this.f3744c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m2782b(float f) {
        m5387a();
        int i = this.f3744c;
        float[] fArr = this.f3743b;
        if (i == fArr.length) {
            float[] fArr2 = new float[jd0.m3607e(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f3743b = fArr2;
        }
        float[] fArr3 = this.f3743b;
        int i2 = this.f3744c;
        this.f3744c = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.mo0
    /* JADX INFO: renamed from: d */
    public final mo0 mo2783d(int i) {
        if (i >= this.f3744c) {
            return new fb0(Arrays.copyOf(this.f3743b, i), this.f3744c, true);
        }
        l41.m4049r();
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m2784e(int i) {
        if (i < 0 || i >= this.f3744c) {
            ca0.m1175g(this.f3744c, AbstractC1308pu.m5343j(i, "Index:", ", Size:"));
        }
    }

    @Override // p000.AbstractC1316q1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb0)) {
            return super.equals(obj);
        }
        fb0 fb0Var = (fb0) obj;
        if (this.f3744c != fb0Var.f3744c) {
            return false;
        }
        float[] fArr = fb0Var.f3743b;
        for (int i = 0; i < this.f3744c; i++) {
            if (Float.floatToIntBits(this.f3743b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m2784e(i);
        return Float.valueOf(this.f3743b[i]);
    }

    @Override // p000.AbstractC1316q1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f3744c; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f3743b[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.f3744c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f3743b[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC1316q1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m5387a();
        m2784e(i);
        float[] fArr = this.f3743b;
        float f = fArr[i];
        int i2 = this.f3744c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f3744c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m5387a();
        if (i2 < i) {
            f40.m2718n("toIndex < fromIndex");
            return;
        }
        float[] fArr = this.f3743b;
        System.arraycopy(fArr, i2, fArr, i, this.f3744c - i2);
        this.f3744c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m5387a();
        m2784e(i);
        float[] fArr = this.f3743b;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3744c;
    }

    @Override // p000.AbstractC1316q1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m2782b(((Float) obj).floatValue());
        return true;
    }
}

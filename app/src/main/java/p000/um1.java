package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class um1 extends AbstractC1463u0 implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public final Object[] f11361a;

    /* JADX INFO: renamed from: b */
    public final int f11362b;

    /* JADX INFO: renamed from: c */
    public int f11363c;

    /* JADX INFO: renamed from: d */
    public int f11364d;

    public um1(Object[] objArr, int i) {
        this.f11361a = objArr;
        if (i < 0) {
            f40.m2716l(jd0.m3609g(i, "ring buffer filled size should not be negative but it is "));
            throw null;
        }
        if (i <= objArr.length) {
            this.f11362b = objArr.length;
            this.f11364d = i;
        } else {
            StringBuilder sbM5343j = AbstractC1308pu.m5343j(i, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbM5343j.append(objArr.length);
            throw new IllegalArgumentException(sbM5343j.toString().toString());
        }
    }

    @Override // p000.AbstractC1463u0
    /* JADX INFO: renamed from: a */
    public final int mo6170a() {
        return this.f11364d;
    }

    /* JADX INFO: renamed from: b */
    public final void m6511b() {
        if (20 > this.f11364d) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 20, size = " + this.f11364d).toString());
        }
        int i = this.f11363c;
        int i2 = this.f11362b;
        int i3 = (i + 20) % i2;
        Object[] objArr = this.f11361a;
        if (i > i3) {
            Arrays.fill(objArr, i, i2, (Object) null);
            Arrays.fill(objArr, 0, i3, (Object) null);
        } else {
            Arrays.fill(objArr, i, i3, (Object) null);
        }
        this.f11363c = i3;
        this.f11364d -= 20;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f11364d;
        if (i < 0 || i >= i2) {
            f40.m2718n(AbstractC1308pu.m5338e("index: ", i, i2, ", size: "));
            return null;
        }
        return this.f11361a[(this.f11363c + i) % this.f11362b];
    }

    @Override // p000.AbstractC1463u0, java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new w10(this);
    }

    @Override // p000.AbstractC1463u0, java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int length = objArr.length;
        int i = this.f11364d;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = this.f11364d;
        int i3 = this.f11363c;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.f11361a;
            if (i5 >= i2 || i3 >= this.f11362b) {
                break;
            }
            objArr[i5] = objArr2[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            objArr[i5] = objArr2[i4];
            i5++;
            i4++;
        }
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // p000.AbstractC1463u0, java.util.List, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[mo6170a()]);
    }
}

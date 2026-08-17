package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class op0 extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a */
    public final int[] f8415a;

    /* JADX INFO: renamed from: b */
    public final int f8416b;

    /* JADX INFO: renamed from: c */
    public final int f8417c;

    public op0(int i, int i2, int[] iArr) {
        this.f8415a = iArr;
        this.f8416b = i;
        this.f8417c = i2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f8416b;
        while (i < this.f8417c) {
            if (this.f8415a[i] == iIntValue) {
                if (i != -1) {
                    return true;
                }
                return false;
            }
            i++;
        }
        i = -1;
        if (i != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof op0)) {
            return super.equals(obj);
        }
        op0 op0Var = (op0) obj;
        int size = size();
        if (op0Var.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.f8415a[this.f8416b + i] != op0Var.f8415a[op0Var.f8416b + i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        p32.m5183o(i, size());
        return Integer.valueOf(this.f8415a[this.f8416b + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.f8416b; i2 < this.f8417c; i2++) {
            i = (i * 31) + this.f8415a[i2];
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001f  */
    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i = this.f8416b;
            int i2 = i;
            while (i2 < this.f8417c) {
                if (this.f8415a[i2] != iIntValue) {
                    i2++;
                } else if (i2 >= 0) {
                    return i2 - i;
                }
            }
            i2 = -1;
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i2 = this.f8417c;
            do {
                i2--;
                i = this.f8416b;
                if (i2 < i) {
                    i2 = -1;
                    break;
                }
            } while (this.f8415a[i2] != iIntValue);
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        p32.m5183o(i, size());
        int i2 = this.f8416b + i;
        int[] iArr = this.f8415a;
        int i3 = iArr[i2];
        num.getClass();
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8417c - this.f8416b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        p32.m5190u(i, i2, size());
        if (i == i2) {
            return Collections.EMPTY_LIST;
        }
        int i3 = this.f8416b;
        return new op0(i + i3, i3 + i2, this.f8415a);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.f8415a;
        int i = this.f8416b;
        sb.append(iArr[i]);
        while (true) {
            i++;
            if (i >= this.f8417c) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i]);
        }
    }
}

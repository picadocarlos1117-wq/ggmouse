package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class ao0 implements Iterable {

    /* JADX INFO: renamed from: a */
    public final int f1008a;

    /* JADX INFO: renamed from: b */
    public final int f1009b;

    /* JADX INFO: renamed from: c */
    public final int f1010c;

    public ao0(int i, int i2, int i3) {
        if (i3 == 0) {
            f40.m2713i("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            f40.m2713i("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.f1008a = i;
        this.f1009b = ua0.m6463z(i, i2, i3);
        this.f1010c = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ao0)) {
            return false;
        }
        if (isEmpty() && ((ao0) obj).isEmpty()) {
            return true;
        }
        ao0 ao0Var = (ao0) obj;
        return this.f1008a == ao0Var.f1008a && this.f1009b == ao0Var.f1009b && this.f1010c == ao0Var.f1010c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f1008a * 31) + this.f1009b) * 31) + this.f1010c;
    }

    public boolean isEmpty() {
        int i = this.f1009b;
        int i2 = this.f1010c;
        int i3 = this.f1008a;
        if (i2 > 0) {
            return i3 > i;
        }
        return i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new bo0(this.f1008a, this.f1009b, this.f1010c);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f1009b;
        int i2 = this.f1010c;
        int i3 = this.f1008a;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}

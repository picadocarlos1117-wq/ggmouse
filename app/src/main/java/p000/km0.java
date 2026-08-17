package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class km0 {

    /* JADX INFO: renamed from: a */
    public Object[] f5900a;

    /* JADX INFO: renamed from: b */
    public int f5901b;

    /* JADX INFO: renamed from: c */
    public boolean f5902c;

    public km0(int i) {
        sc2.m6060d(i, "initialCapacity");
        this.f5900a = new Object[i];
        this.f5901b = 0;
    }

    /* JADX INFO: renamed from: f */
    public static int m3900f(int i, int i2) {
        if (i2 < 0) {
            f40.m2713i("cannot store more than MAX_VALUE elements");
            return 0;
        }
        if (i2 <= i) {
            return i;
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i2) {
            iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: renamed from: a */
    public final void m3901a(Object obj) {
        obj.getClass();
        m3905e(1);
        Object[] objArr = this.f5900a;
        int i = this.f5901b;
        this.f5901b = i + 1;
        objArr[i] = obj;
    }

    /* JADX INFO: renamed from: b */
    public final void m3902b(Object... objArr) {
        int length = objArr.length;
        o21.m4665k(length, objArr);
        m3905e(length);
        System.arraycopy(objArr, 0, this.f5900a, this.f5901b, length);
        this.f5901b += length;
    }

    /* JADX INFO: renamed from: c */
    public abstract km0 mo3903c(Object obj);

    /* JADX INFO: renamed from: d */
    public final void m3904d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            m3905e(collection.size());
            if (collection instanceof lm0) {
                this.f5901b = ((lm0) collection).mo2641b(this.f5901b, this.f5900a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            mo3903c(it.next());
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m3905e(int i) {
        Object[] objArr = this.f5900a;
        int iM3900f = m3900f(objArr.length, this.f5901b + i);
        if (iM3900f > objArr.length || this.f5902c) {
            this.f5900a = Arrays.copyOf(this.f5900a, iM3900f);
            this.f5902c = false;
        }
    }
}

package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tm0 extends lm0 implements Set {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f10905c = 0;

    /* JADX INFO: renamed from: b */
    public transient qm0 f10906b;

    /* JADX INFO: renamed from: k */
    public static int m6290k(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            p32.m5177l(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: renamed from: m */
    public static tm0 m6291m(int i, Object... objArr) {
        if (i == 0) {
            return qk1.f9525o;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new et1(obj);
        }
        int iM6290k = m6290k(i);
        Object[] objArr2 = new Object[iM6290k];
        int i2 = iM6290k - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                l41.m4051t(jd0.m3609g(i5, "at index "));
                return null;
            }
            int iHashCode = obj2.hashCode();
            int iM5533d0 = AbstractC1337qm.m5533d0(iHashCode);
            while (true) {
                int i6 = iM5533d0 & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iM5533d0++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new et1(obj4);
        }
        if (m6290k(i4) < iM6290k / 2) {
            return m6291m(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new qk1(objArr, i3, objArr2, i2, i4);
    }

    /* JADX INFO: renamed from: n */
    public static tm0 m6292n(Collection collection) {
        if ((collection instanceof tm0) && !(collection instanceof SortedSet)) {
            tm0 tm0Var = (tm0) collection;
            if (!tm0Var.mo2642i()) {
                return tm0Var;
            }
        }
        Object[] array = collection.toArray();
        return m6291m(array.length, array);
    }

    @Override // p000.lm0
    /* JADX INFO: renamed from: a */
    public qm0 mo2640a() {
        qm0 qm0Var = this.f10906b;
        if (qm0Var != null) {
            return qm0Var;
        }
        qm0 qm0VarMo4428p = mo4428p();
        this.f10906b = qm0VarMo4428p;
        return qm0VarMo4428p;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof tm0) && (this instanceof qk1) && (((tm0) obj) instanceof qk1) && hashCode() != obj.hashCode()) {
            return false;
        }
        return sc2.m6072p(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return sc2.m6080x(this);
    }

    /* JADX INFO: renamed from: p */
    public qm0 mo4428p() {
        Object[] array = toArray(lm0.f6386a);
        om0 om0Var = qm0.f9540b;
        return qm0.m5565k(array.length, array);
    }
}

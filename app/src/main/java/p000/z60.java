package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class z60 extends AbstractC1463u0 implements y60, Serializable {

    /* JADX INFO: renamed from: a */
    public final Enum[] f13296a;

    public z60(Enum[] enumArr) {
        enumArr.getClass();
        this.f13296a = enumArr;
    }

    @Override // p000.AbstractC1463u0
    /* JADX INFO: renamed from: a */
    public final int mo6170a() {
        return this.f13296a.length;
    }

    @Override // p000.AbstractC1463u0, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        Enum[] enumArr = this.f13296a;
        enumArr.getClass();
        return ((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r3;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f13296a;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        f40.m2718n(AbstractC1308pu.m5338e("index: ", i, length, ", size: "));
        return null;
    }

    @Override // p000.AbstractC1463u0, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int iOrdinal = r4.ordinal();
        Enum[] enumArr = this.f13296a;
        enumArr.getClass();
        if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r4) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // p000.AbstractC1463u0, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int iOrdinal = r4.ordinal();
        Enum[] enumArr = this.f13296a;
        enumArr.getClass();
        if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r4) {
            return iOrdinal;
        }
        return -1;
    }
}

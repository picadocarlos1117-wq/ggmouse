package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: renamed from: mu */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1121mu extends AbstractC0734i0 {
    public static final Parcelable.Creator<C1121mu> CREATOR = new C0697h0(3);

    /* JADX INFO: renamed from: c */
    public SparseArray f7102c;

    public C1121mu(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        int[] iArr = new int[i];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f7102c = new SparseArray(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f7102c.append(iArr[i2], parcelableArray[i2]);
        }
    }

    @Override // p000.AbstractC0734i0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f7102c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.f7102c.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.f7102c.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}

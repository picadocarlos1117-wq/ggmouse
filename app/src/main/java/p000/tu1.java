package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class tu1 extends mu1 {
    public static final Parcelable.Creator<tu1> CREATOR = new n21(23);

    /* JADX INFO: renamed from: a */
    public final List f11019a;

    public tu1(Parcel parcel) {
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new su1(parcel));
        }
        this.f11019a = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.f11019a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            su1 su1Var = (su1) list.get(i2);
            parcel.writeLong(su1Var.f10545a);
            parcel.writeByte(su1Var.f10546b ? (byte) 1 : (byte) 0);
            parcel.writeByte(su1Var.f10547c ? (byte) 1 : (byte) 0);
            parcel.writeByte(su1Var.f10548d ? (byte) 1 : (byte) 0);
            List list2 = su1Var.f10550f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                ru1 ru1Var = (ru1) list2.get(i3);
                parcel.writeInt(ru1Var.f10135a);
                parcel.writeLong(ru1Var.f10136b);
            }
            parcel.writeLong(su1Var.f10549e);
            parcel.writeByte(su1Var.f10551g ? (byte) 1 : (byte) 0);
            parcel.writeLong(su1Var.f10552h);
            parcel.writeInt(su1Var.f10553i);
            parcel.writeInt(su1Var.f10554j);
            parcel.writeInt(su1Var.f10555k);
        }
    }

    public tu1(ArrayList arrayList) {
        this.f11019a = Collections.unmodifiableList(arrayList);
    }
}

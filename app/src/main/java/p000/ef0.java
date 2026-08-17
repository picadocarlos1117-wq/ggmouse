package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ef0 implements Parcelable {
    public static final Parcelable.Creator<ef0> CREATOR = new C0701h4(16);

    /* JADX INFO: renamed from: a */
    public String f3328a;

    /* JADX INFO: renamed from: b */
    public int f3329b;

    public ef0(String str, int i) {
        this.f3328a = str;
        this.f3329b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3328a);
        parcel.writeInt(this.f3329b);
    }
}

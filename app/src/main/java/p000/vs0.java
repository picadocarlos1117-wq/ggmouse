package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class vs0 implements Parcelable {
    public static final Parcelable.Creator<vs0> CREATOR = new C0701h4(24);

    /* JADX INFO: renamed from: a */
    public int f11761a;

    /* JADX INFO: renamed from: b */
    public int f11762b;

    /* JADX INFO: renamed from: c */
    public boolean f11763c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11761a);
        parcel.writeInt(this.f11762b);
        parcel.writeInt(this.f11763c ? 1 : 0);
    }
}

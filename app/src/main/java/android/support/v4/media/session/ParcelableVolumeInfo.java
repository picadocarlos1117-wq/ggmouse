package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import p000.n21;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new n21(10);

    /* JADX INFO: renamed from: a */
    public int f318a;

    /* JADX INFO: renamed from: b */
    public int f319b;

    /* JADX INFO: renamed from: c */
    public int f320c;

    /* JADX INFO: renamed from: d */
    public int f321d;

    /* JADX INFO: renamed from: e */
    public int f322e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f318a);
        parcel.writeInt(this.f320c);
        parcel.writeInt(this.f321d);
        parcel.writeInt(this.f322e);
        parcel.writeInt(this.f319b);
    }
}

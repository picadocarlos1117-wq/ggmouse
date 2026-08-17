package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import p000.n21;
import p000.s52;
import p000.t52;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new n21(9);

    /* JADX INFO: renamed from: a */
    public final t52 f1005a;

    public ParcelImpl(Parcel parcel) {
        this.f1005a = new s52(parcel).m5711h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new s52(parcel).m5715l(this.f1005a);
    }
}

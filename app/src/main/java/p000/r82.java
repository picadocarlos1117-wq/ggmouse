package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaMetadataCompat;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class r82 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9825a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f9825a) {
            case 0:
                return new t82(parcel);
            default:
                return new MediaMetadataCompat(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f9825a) {
            case 0:
                return new t82[i];
            default:
                return new MediaMetadataCompat[i];
        }
    }
}

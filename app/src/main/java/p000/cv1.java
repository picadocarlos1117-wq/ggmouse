package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class cv1 implements Parcelable {
    public static final Parcelable.Creator<cv1> CREATOR = new n21(24);

    /* JADX INFO: renamed from: a */
    public int f2645a;

    /* JADX INFO: renamed from: b */
    public int f2646b;

    /* JADX INFO: renamed from: c */
    public int[] f2647c;

    /* JADX INFO: renamed from: d */
    public boolean f2648d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f2645a + ", mGapDir=" + this.f2646b + ", mHasUnwantedGapAfter=" + this.f2648d + ", mGapPerSpan=" + Arrays.toString(this.f2647c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2645a);
        parcel.writeInt(this.f2646b);
        parcel.writeInt(this.f2648d ? 1 : 0);
        int[] iArr = this.f2647c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f2647c);
        }
    }
}

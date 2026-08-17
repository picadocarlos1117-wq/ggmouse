package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.example.ssmousepro.injection.TouchPipeline;
import p000.n21;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new n21(15);

    /* JADX INFO: renamed from: a */
    public final int f311a;

    /* JADX INFO: renamed from: b */
    public final float f312b;

    public RatingCompat(int i, float f) {
        this.f311a = i;
        this.f312b = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f311a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f311a);
        sb.append(" rating=");
        float f = this.f312b;
        sb.append(f < TouchPipeline.SIZE ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f311a);
        parcel.writeFloat(this.f312b);
    }
}

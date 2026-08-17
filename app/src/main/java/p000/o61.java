package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class o61 implements f51 {
    public static final Parcelable.Creator<o61> CREATOR = new n21(6);

    /* JADX INFO: renamed from: a */
    public final float f7670a;

    /* JADX INFO: renamed from: b */
    public final float f7671b;

    public o61(float f, float f2) {
        ki0.m3859d(f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f, "Invalid latitude or longitude");
        this.f7670a = f;
        this.f7671b = f2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o61.class == obj.getClass()) {
            o61 o61Var = (o61) obj;
            if (this.f7670a == o61Var.f7670a && this.f7671b == o61Var.f7671b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f7671b).hashCode() + ((Float.valueOf(this.f7670a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f7670a + ", longitude=" + this.f7671b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f7670a);
        parcel.writeFloat(this.f7671b);
    }

    public o61(Parcel parcel) {
        this.f7670a = parcel.readFloat();
        this.f7671b = parcel.readFloat();
    }
}

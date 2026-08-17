package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class rt1 implements f51 {
    public static final Parcelable.Creator<rt1> CREATOR = new n21(20);

    /* JADX INFO: renamed from: a */
    public final float f10130a;

    /* JADX INFO: renamed from: b */
    public final int f10131b;

    public rt1(Parcel parcel) {
        this.f10130a = parcel.readFloat();
        this.f10131b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rt1.class == obj.getClass()) {
            rt1 rt1Var = (rt1) obj;
            if (this.f10130a == rt1Var.f10130a && this.f10131b == rt1Var.f10131b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f10130a).hashCode() + 527) * 31) + this.f10131b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f10130a + ", svcTemporalLayerCount=" + this.f10131b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f10130a);
        parcel.writeInt(this.f10131b);
    }

    public rt1(int i, float f) {
        this.f10130a = f;
        this.f10131b = i;
    }
}

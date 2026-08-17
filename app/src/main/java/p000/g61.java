package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class g61 implements f51 {
    public static final Parcelable.Creator<g61> CREATOR = new n21(5);

    /* JADX INFO: renamed from: a */
    public final long f4075a;

    /* JADX INFO: renamed from: b */
    public final long f4076b;

    /* JADX INFO: renamed from: c */
    public final long f4077c;

    /* JADX INFO: renamed from: d */
    public final long f4078d;

    /* JADX INFO: renamed from: e */
    public final long f4079e;

    public g61(Parcel parcel) {
        this.f4075a = parcel.readLong();
        this.f4076b = parcel.readLong();
        this.f4077c = parcel.readLong();
        this.f4078d = parcel.readLong();
        this.f4079e = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g61.class == obj.getClass()) {
            g61 g61Var = (g61) obj;
            if (this.f4075a == g61Var.f4075a && this.f4076b == g61Var.f4076b && this.f4077c == g61Var.f4077c && this.f4078d == g61Var.f4078d && this.f4079e == g61Var.f4079e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return sc2.m6078v(this.f4079e) + ((sc2.m6078v(this.f4078d) + ((sc2.m6078v(this.f4077c) + ((sc2.m6078v(this.f4076b) + ((sc2.m6078v(this.f4075a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f4075a + ", photoSize=" + this.f4076b + ", photoPresentationTimestampUs=" + this.f4077c + ", videoStartPosition=" + this.f4078d + ", videoSize=" + this.f4079e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f4075a);
        parcel.writeLong(this.f4076b);
        parcel.writeLong(this.f4077c);
        parcel.writeLong(this.f4078d);
        parcel.writeLong(this.f4079e);
    }

    public g61(long j, long j2, long j3, long j4, long j5) {
        this.f4075a = j;
        this.f4076b = j2;
        this.f4077c = j3;
        this.f4078d = j4;
        this.f4079e = j5;
    }
}

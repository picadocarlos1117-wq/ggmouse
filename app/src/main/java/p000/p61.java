package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class p61 implements f51 {
    public static final Parcelable.Creator<p61> CREATOR = new n21(7);

    /* JADX INFO: renamed from: a */
    public final long f8739a;

    /* JADX INFO: renamed from: b */
    public final long f8740b;

    /* JADX INFO: renamed from: c */
    public final long f8741c;

    public p61(Parcel parcel) {
        this.f8739a = parcel.readLong();
        this.f8740b = parcel.readLong();
        this.f8741c = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p61)) {
            return false;
        }
        p61 p61Var = (p61) obj;
        return this.f8739a == p61Var.f8739a && this.f8740b == p61Var.f8740b && this.f8741c == p61Var.f8741c;
    }

    public final int hashCode() {
        return sc2.m6078v(this.f8741c) + ((sc2.m6078v(this.f8740b) + ((sc2.m6078v(this.f8739a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f8739a + ", modification time=" + this.f8740b + ", timescale=" + this.f8741c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f8739a);
        parcel.writeLong(this.f8740b);
        parcel.writeLong(this.f8741c);
    }

    public p61(long j, long j2, long j3) {
        this.f8739a = j;
        this.f8740b = j2;
        this.f8741c = j3;
    }
}

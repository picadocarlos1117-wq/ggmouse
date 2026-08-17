package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class kt1 implements Parcelable {
    public static final Parcelable.Creator<kt1> CREATOR = new n21(19);

    /* JADX INFO: renamed from: a */
    public final long f6004a;

    /* JADX INFO: renamed from: b */
    public final long f6005b;

    /* JADX INFO: renamed from: c */
    public final int f6006c;

    public kt1(long j, long j2, int i) {
        ki0.m3857c(j < j2);
        this.f6004a = j;
        this.f6005b = j2;
        this.f6006c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kt1.class == obj.getClass()) {
            kt1 kt1Var = (kt1) obj;
            if (this.f6004a == kt1Var.f6004a && this.f6005b == kt1Var.f6005b && this.f6006c == kt1Var.f6006c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f6004a), Long.valueOf(this.f6005b), Integer.valueOf(this.f6006c)});
    }

    public final String toString() {
        int i = z42.f13274a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.f6004a + ", endTimeMs=" + this.f6005b + ", speedDivisor=" + this.f6006c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f6004a);
        parcel.writeLong(this.f6005b);
        parcel.writeInt(this.f6006c);
    }
}

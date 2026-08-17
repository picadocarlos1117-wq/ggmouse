package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class n02 extends mu1 {
    public static final Parcelable.Creator<n02> CREATOR = new n21(27);

    /* JADX INFO: renamed from: a */
    public final long f7168a;

    /* JADX INFO: renamed from: b */
    public final long f7169b;

    public n02(long j, long j2) {
        this.f7168a = j;
        this.f7169b = j2;
    }

    /* JADX INFO: renamed from: a */
    public static long m4496a(long j, dc1 dc1Var) {
        long jM2337t = dc1Var.m2337t();
        if ((128 & jM2337t) != 0) {
            return 8589934591L & ((((jM2337t & 1) << 32) | dc1Var.m2339v()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // p000.mu1
    public final String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f7168a + ", playbackPositionUs= " + this.f7169b + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f7168a);
        parcel.writeLong(this.f7169b);
    }
}

package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class gg1 extends mu1 {
    public static final Parcelable.Creator<gg1> CREATOR = new n21(14);

    /* JADX INFO: renamed from: a */
    public final long f4186a;

    /* JADX INFO: renamed from: b */
    public final long f4187b;

    /* JADX INFO: renamed from: c */
    public final byte[] f4188c;

    public gg1(Parcel parcel) {
        this.f4186a = parcel.readLong();
        this.f4187b = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i = z42.f13274a;
        this.f4188c = bArrCreateByteArray;
    }

    @Override // p000.mu1
    public final String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.f4186a + ", identifier= " + this.f4187b + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f4186a);
        parcel.writeLong(this.f4187b);
        parcel.writeByteArray(this.f4188c);
    }

    public gg1(long j, byte[] bArr, long j2) {
        this.f4186a = j2;
        this.f4187b = j;
        this.f4188c = bArr;
    }
}

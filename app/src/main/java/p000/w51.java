package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class w51 extends bm0 {
    public static final Parcelable.Creator<w51> CREATOR = new n21(3);

    /* JADX INFO: renamed from: b */
    public final int f11980b;

    /* JADX INFO: renamed from: c */
    public final int f11981c;

    /* JADX INFO: renamed from: d */
    public final int f11982d;

    /* JADX INFO: renamed from: e */
    public final int[] f11983e;

    /* JADX INFO: renamed from: f */
    public final int[] f11984f;

    public w51(Parcel parcel) {
        super("MLLT");
        this.f11980b = parcel.readInt();
        this.f11981c = parcel.readInt();
        this.f11982d = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i = z42.f13274a;
        this.f11983e = iArrCreateIntArray;
        this.f11984f = parcel.createIntArray();
    }

    @Override // p000.bm0, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w51.class == obj.getClass()) {
            w51 w51Var = (w51) obj;
            if (this.f11980b == w51Var.f11980b && this.f11981c == w51Var.f11981c && this.f11982d == w51Var.f11982d && Arrays.equals(this.f11983e, w51Var.f11983e) && Arrays.equals(this.f11984f, w51Var.f11984f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11984f) + ((Arrays.hashCode(this.f11983e) + ((((((527 + this.f11980b) * 31) + this.f11981c) * 31) + this.f11982d) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11980b);
        parcel.writeInt(this.f11981c);
        parcel.writeInt(this.f11982d);
        parcel.writeIntArray(this.f11983e);
        parcel.writeIntArray(this.f11984f);
    }

    public w51(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f11980b = i;
        this.f11981c = i2;
        this.f11982d = i3;
        this.f11983e = iArr;
        this.f11984f = iArr2;
    }
}

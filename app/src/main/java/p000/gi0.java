package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class gi0 extends bm0 {
    public static final Parcelable.Creator<gi0> CREATOR = new C0701h4(19);

    /* JADX INFO: renamed from: b */
    public final String f4194b;

    /* JADX INFO: renamed from: c */
    public final String f4195c;

    /* JADX INFO: renamed from: d */
    public final String f4196d;

    /* JADX INFO: renamed from: e */
    public final byte[] f4197e;

    public gi0(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i = z42.f13274a;
        this.f4194b = string;
        this.f4195c = parcel.readString();
        this.f4196d = parcel.readString();
        this.f4197e = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gi0.class == obj.getClass()) {
            gi0 gi0Var = (gi0) obj;
            String str = gi0Var.f4194b;
            int i = z42.f13274a;
            if (Objects.equals(this.f4194b, str) && Objects.equals(this.f4195c, gi0Var.f4195c) && Objects.equals(this.f4196d, gi0Var.f4196d) && Arrays.equals(this.f4197e, gi0Var.f4197e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4194b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4195c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f4196d;
        return Arrays.hashCode(this.f4197e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // p000.bm0
    public final String toString() {
        return this.f1432a + ": mimeType=" + this.f4194b + ", filename=" + this.f4195c + ", description=" + this.f4196d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f4194b);
        parcel.writeString(this.f4195c);
        parcel.writeString(this.f4196d);
        parcel.writeByteArray(this.f4197e);
    }

    public gi0(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.f4194b = str;
        this.f4195c = str2;
        this.f4196d = str3;
        this.f4197e = bArr;
    }
}

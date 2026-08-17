package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class dd1 implements f51 {
    public static final Parcelable.Creator<dd1> CREATOR = new n21(11);

    /* JADX INFO: renamed from: a */
    public final int f2896a;

    /* JADX INFO: renamed from: b */
    public final String f2897b;

    /* JADX INFO: renamed from: c */
    public final String f2898c;

    /* JADX INFO: renamed from: d */
    public final int f2899d;

    /* JADX INFO: renamed from: e */
    public final int f2900e;

    /* JADX INFO: renamed from: f */
    public final int f2901f;

    /* JADX INFO: renamed from: g */
    public final int f2902g;

    /* JADX INFO: renamed from: m */
    public final byte[] f2903m;

    public dd1(Parcel parcel) {
        this.f2896a = parcel.readInt();
        String string = parcel.readString();
        int i = z42.f13274a;
        this.f2897b = string;
        this.f2898c = parcel.readString();
        this.f2899d = parcel.readInt();
        this.f2900e = parcel.readInt();
        this.f2901f = parcel.readInt();
        this.f2902g = parcel.readInt();
        this.f2903m = parcel.createByteArray();
    }

    /* JADX INFO: renamed from: a */
    public static dd1 m2345a(dc1 dc1Var) {
        int iM2324g = dc1Var.m2324g();
        String strM6582l = v51.m6582l(dc1Var.m2335r(dc1Var.m2324g(), StandardCharsets.US_ASCII));
        String strM2335r = dc1Var.m2335r(dc1Var.m2324g(), StandardCharsets.UTF_8);
        int iM2324g2 = dc1Var.m2324g();
        int iM2324g3 = dc1Var.m2324g();
        int iM2324g4 = dc1Var.m2324g();
        int iM2324g5 = dc1Var.m2324g();
        int iM2324g6 = dc1Var.m2324g();
        byte[] bArr = new byte[iM2324g6];
        dc1Var.m2322e(0, iM2324g6, bArr);
        return new dd1(iM2324g, strM6582l, strM2335r, iM2324g2, iM2324g3, iM2324g4, iM2324g5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dd1.class == obj.getClass()) {
            dd1 dd1Var = (dd1) obj;
            if (this.f2896a == dd1Var.f2896a && this.f2897b.equals(dd1Var.f2897b) && this.f2898c.equals(dd1Var.f2898c) && this.f2899d == dd1Var.f2899d && this.f2900e == dd1Var.f2900e && this.f2901f == dd1Var.f2901f && this.f2902g == dd1Var.f2902g && Arrays.equals(this.f2903m, dd1Var.f2903m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2903m) + ((((((((AbstractC1308pu.m5336c(AbstractC1308pu.m5336c((527 + this.f2896a) * 31, 31, this.f2897b), 31, this.f2898c) + this.f2899d) * 31) + this.f2900e) * 31) + this.f2901f) * 31) + this.f2902g) * 31);
    }

    @Override // p000.f51
    /* JADX INFO: renamed from: p */
    public final void mo2346p(c21 c21Var) {
        c21Var.m1113a(this.f2896a, this.f2903m);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f2897b + ", description=" + this.f2898c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2896a);
        parcel.writeString(this.f2897b);
        parcel.writeString(this.f2898c);
        parcel.writeInt(this.f2899d);
        parcel.writeInt(this.f2900e);
        parcel.writeInt(this.f2901f);
        parcel.writeInt(this.f2902g);
        parcel.writeByteArray(this.f2903m);
    }

    public dd1(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f2896a = i;
        this.f2897b = str;
        this.f2898c = str2;
        this.f2899d = i2;
        this.f2900e = i3;
        this.f2901f = i4;
        this.f2902g = i5;
        this.f2903m = bArr;
    }
}

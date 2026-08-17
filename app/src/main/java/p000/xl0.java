package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class xl0 implements f51 {
    public static final Parcelable.Creator<xl0> CREATOR = new C0701h4(21);

    /* JADX INFO: renamed from: a */
    public final byte[] f12638a;

    /* JADX INFO: renamed from: b */
    public final String f12639b;

    /* JADX INFO: renamed from: c */
    public final String f12640c;

    public xl0(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        bArrCreateByteArray.getClass();
        this.f12638a = bArrCreateByteArray;
        this.f12639b = parcel.readString();
        this.f12640c = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xl0.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f12638a, ((xl0) obj).f12638a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12638a);
    }

    @Override // p000.f51
    /* JADX INFO: renamed from: p */
    public final void mo2346p(c21 c21Var) {
        String str = this.f12639b;
        if (str != null) {
            c21Var.f1629a = str;
        }
    }

    public final String toString() {
        return AbstractC1308pu.m5341h(jd0.m3618p("ICY: title=\"", this.f12639b, "\", url=\"", this.f12640c, "\", rawMetadata.length=\""), this.f12638a.length, "\"");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f12638a);
        parcel.writeString(this.f12639b);
        parcel.writeString(this.f12640c);
    }

    public xl0(byte[] bArr, String str, String str2) {
        this.f12638a = bArr;
        this.f12639b = str;
        this.f12640c = str2;
    }
}

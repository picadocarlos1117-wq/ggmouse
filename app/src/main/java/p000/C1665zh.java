package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: zh */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1665zh extends bm0 {
    public static final Parcelable.Creator<C1665zh> CREATOR = new C0701h4(6);

    /* JADX INFO: renamed from: b */
    public final byte[] f13416b;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1665zh(Parcel parcel) {
        String string = parcel.readString();
        int i = z42.f13274a;
        super(string);
        this.f13416b = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1665zh.class == obj.getClass()) {
            C1665zh c1665zh = (C1665zh) obj;
            if (this.f1432a.equals(c1665zh.f1432a) && Arrays.equals(this.f13416b, c1665zh.f13416b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f13416b) + AbstractC1308pu.m5336c(527, 31, this.f1432a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1432a);
        parcel.writeByteArray(this.f13416b);
    }

    public C1665zh(String str, byte[] bArr) {
        super(str);
        this.f13416b = bArr;
    }
}

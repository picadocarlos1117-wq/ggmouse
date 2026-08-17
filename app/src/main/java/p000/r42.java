package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class r42 extends bm0 {
    public static final Parcelable.Creator<r42> CREATOR = new n21(28);

    /* JADX INFO: renamed from: b */
    public final String f9724b;

    /* JADX INFO: renamed from: c */
    public final String f9725c;

    /* JADX WARN: Illegal instructions before constructor call */
    public r42(Parcel parcel) {
        String string = parcel.readString();
        int i = z42.f13274a;
        super(string);
        this.f9724b = parcel.readString();
        this.f9725c = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r42.class == obj.getClass()) {
            r42 r42Var = (r42) obj;
            if (this.f1432a.equals(r42Var.f1432a)) {
                String str = r42Var.f9724b;
                int i = z42.f13274a;
                if (Objects.equals(this.f9724b, str) && Objects.equals(this.f9725c, r42Var.f9725c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM5336c = AbstractC1308pu.m5336c(527, 31, this.f1432a);
        String str = this.f9724b;
        int iHashCode = (iM5336c + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9725c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // p000.bm0
    public final String toString() {
        return this.f1432a + ": url=" + this.f9725c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1432a);
        parcel.writeString(this.f9724b);
        parcel.writeString(this.f9725c);
    }

    public r42(String str, String str2, String str3) {
        super(str);
        this.f9724b = str2;
        this.f9725c = str3;
    }
}

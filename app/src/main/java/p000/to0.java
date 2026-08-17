package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class to0 extends bm0 {
    public static final Parcelable.Creator<to0> CREATOR = new C0701h4(23);

    /* JADX INFO: renamed from: b */
    public final String f10910b;

    /* JADX INFO: renamed from: c */
    public final String f10911c;

    /* JADX INFO: renamed from: d */
    public final String f10912d;

    public to0(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i = z42.f13274a;
        this.f10910b = string;
        this.f10911c = parcel.readString();
        this.f10912d = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && to0.class == obj.getClass()) {
            to0 to0Var = (to0) obj;
            String str = to0Var.f10911c;
            int i = z42.f13274a;
            if (Objects.equals(this.f10911c, str) && Objects.equals(this.f10910b, to0Var.f10910b) && Objects.equals(this.f10912d, to0Var.f10912d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f10910b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10911c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f10912d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p000.bm0
    public final String toString() {
        return this.f1432a + ": domain=" + this.f10910b + ", description=" + this.f10911c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1432a);
        parcel.writeString(this.f10910b);
        parcel.writeString(this.f10912d);
    }

    public to0(String str, String str2, String str3) {
        super("----");
        this.f10910b = str;
        this.f10911c = str2;
        this.f10912d = str3;
    }
}

package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: renamed from: fq */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0649fq extends bm0 {
    public static final Parcelable.Creator<C0649fq> CREATOR = new C0701h4(11);

    /* JADX INFO: renamed from: b */
    public final String f3878b;

    /* JADX INFO: renamed from: c */
    public final String f3879c;

    /* JADX INFO: renamed from: d */
    public final String f3880d;

    public C0649fq(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i = z42.f13274a;
        this.f3878b = string;
        this.f3879c = parcel.readString();
        this.f3880d = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0649fq.class == obj.getClass()) {
            C0649fq c0649fq = (C0649fq) obj;
            String str = c0649fq.f3879c;
            int i = z42.f13274a;
            if (Objects.equals(this.f3879c, str) && Objects.equals(this.f3878b, c0649fq.f3878b) && Objects.equals(this.f3880d, c0649fq.f3880d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f3878b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f3879c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f3880d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p000.bm0
    public final String toString() {
        return this.f1432a + ": language=" + this.f3878b + ", description=" + this.f3879c + ", text=" + this.f3880d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1432a);
        parcel.writeString(this.f3878b);
        parcel.writeString(this.f3880d);
    }

    public C0649fq(String str, String str2, String str3) {
        super("COMM");
        this.f3878b = str;
        this.f3879c = str2;
        this.f3880d = str3;
    }
}

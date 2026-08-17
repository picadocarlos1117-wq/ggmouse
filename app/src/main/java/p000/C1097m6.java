package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: m6 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1097m6 extends bm0 {
    public static final Parcelable.Creator<C1097m6> CREATOR = new C0701h4(1);

    /* JADX INFO: renamed from: b */
    public final String f6661b;

    /* JADX INFO: renamed from: c */
    public final String f6662c;

    /* JADX INFO: renamed from: d */
    public final int f6663d;

    /* JADX INFO: renamed from: e */
    public final byte[] f6664e;

    public C1097m6(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i = z42.f13274a;
        this.f6661b = string;
        this.f6662c = parcel.readString();
        this.f6663d = parcel.readInt();
        this.f6664e = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1097m6.class == obj.getClass()) {
            C1097m6 c1097m6 = (C1097m6) obj;
            if (this.f6663d == c1097m6.f6663d) {
                String str = c1097m6.f6661b;
                int i = z42.f13274a;
                if (Objects.equals(this.f6661b, str) && Objects.equals(this.f6662c, c1097m6.f6662c) && Arrays.equals(this.f6664e, c1097m6.f6664e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (527 + this.f6663d) * 31;
        String str = this.f6661b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6662c;
        return Arrays.hashCode(this.f6664e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // p000.f51
    /* JADX INFO: renamed from: p */
    public final void mo2346p(c21 c21Var) {
        c21Var.m1113a(this.f6663d, this.f6664e);
    }

    @Override // p000.bm0
    public final String toString() {
        return this.f1432a + ": mimeType=" + this.f6661b + ", description=" + this.f6662c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6661b);
        parcel.writeString(this.f6662c);
        parcel.writeInt(this.f6663d);
        parcel.writeByteArray(this.f6664e);
    }

    public C1097m6(int i, String str, byte[] bArr, String str2) {
        super("APIC");
        this.f6661b = str;
        this.f6662c = str2;
        this.f6663d = i;
        this.f6664e = bArr;
    }
}

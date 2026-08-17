package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class y30 implements Parcelable {
    public static final Parcelable.Creator<y30> CREATOR = new C0701h4(14);

    /* JADX INFO: renamed from: a */
    public int f12823a;

    /* JADX INFO: renamed from: b */
    public final UUID f12824b;

    /* JADX INFO: renamed from: c */
    public final String f12825c;

    /* JADX INFO: renamed from: d */
    public final String f12826d;

    /* JADX INFO: renamed from: e */
    public final byte[] f12827e;

    public y30(Parcel parcel) {
        this.f12824b = new UUID(parcel.readLong(), parcel.readLong());
        this.f12825c = parcel.readString();
        String string = parcel.readString();
        int i = z42.f13274a;
        this.f12826d = string;
        this.f12827e = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y30)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        y30 y30Var = (y30) obj;
        String str = y30Var.f12825c;
        int i = z42.f13274a;
        return Objects.equals(this.f12825c, str) && Objects.equals(this.f12826d, y30Var.f12826d) && Objects.equals(this.f12824b, y30Var.f12824b) && Arrays.equals(this.f12827e, y30Var.f12827e);
    }

    public final int hashCode() {
        if (this.f12823a == 0) {
            int iHashCode = this.f12824b.hashCode() * 31;
            String str = this.f12825c;
            this.f12823a = Arrays.hashCode(this.f12827e) + AbstractC1308pu.m5336c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f12826d);
        }
        return this.f12823a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.f12824b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f12825c);
        parcel.writeString(this.f12826d);
        parcel.writeByteArray(this.f12827e);
    }

    public y30(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f12824b = uuid;
        this.f12825c = str;
        str2.getClass();
        this.f12826d = v51.m6582l(str2);
        this.f12827e = bArr;
    }
}

package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class fg1 extends bm0 {
    public static final Parcelable.Creator<fg1> CREATOR = new n21(13);

    /* JADX INFO: renamed from: b */
    public final String f3817b;

    /* JADX INFO: renamed from: c */
    public final byte[] f3818c;

    public fg1(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i = z42.f13274a;
        this.f3817b = string;
        this.f3818c = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fg1.class == obj.getClass()) {
            fg1 fg1Var = (fg1) obj;
            String str = fg1Var.f3817b;
            int i = z42.f13274a;
            if (Objects.equals(this.f3817b, str) && Arrays.equals(this.f3818c, fg1Var.f3818c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f3817b;
        return Arrays.hashCode(this.f3818c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // p000.bm0
    public final String toString() {
        return this.f1432a + ": owner=" + this.f3817b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3817b);
        parcel.writeByteArray(this.f3818c);
    }

    public fg1(String str, byte[] bArr) {
        super("PRIV");
        this.f3817b = str;
        this.f3818c = bArr;
    }
}

package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class z30 implements Comparator, Parcelable {
    public static final Parcelable.Creator<z30> CREATOR = new C0701h4(13);

    /* JADX INFO: renamed from: a */
    public final y30[] f13250a;

    /* JADX INFO: renamed from: b */
    public int f13251b;

    /* JADX INFO: renamed from: c */
    public final String f13252c;

    /* JADX INFO: renamed from: d */
    public final int f13253d;

    public z30(Parcel parcel) {
        this.f13252c = parcel.readString();
        y30[] y30VarArr = (y30[]) parcel.createTypedArray(y30.CREATOR);
        int i = z42.f13274a;
        this.f13250a = y30VarArr;
        this.f13253d = y30VarArr.length;
    }

    /* JADX INFO: renamed from: a */
    public final z30 m7186a(String str) {
        int i = z42.f13274a;
        return Objects.equals(this.f13252c, str) ? this : new z30(str, false, this.f13250a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        y30 y30Var = (y30) obj;
        y30 y30Var2 = (y30) obj2;
        UUID uuid = AbstractC0794jk.f5433a;
        if (uuid.equals(y30Var.f12824b)) {
            return uuid.equals(y30Var2.f12824b) ? 0 : 1;
        }
        return y30Var.f12824b.compareTo(y30Var2.f12824b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z30.class == obj.getClass()) {
            z30 z30Var = (z30) obj;
            String str = z30Var.f13252c;
            int i = z42.f13274a;
            if (Objects.equals(this.f13252c, str) && Arrays.equals(this.f13250a, z30Var.f13250a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f13251b == 0) {
            String str = this.f13252c;
            this.f13251b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f13250a);
        }
        return this.f13251b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13252c);
        parcel.writeTypedArray(this.f13250a, 0);
    }

    public z30(String str, boolean z, y30... y30VarArr) {
        this.f13252c = str;
        y30VarArr = z ? (y30[]) y30VarArr.clone() : y30VarArr;
        this.f13250a = y30VarArr;
        this.f13253d = y30VarArr.length;
        Arrays.sort(y30VarArr, this);
    }
}

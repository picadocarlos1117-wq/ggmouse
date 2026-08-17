package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: m9 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1100m9 implements f51 {
    public static final Parcelable.Creator<C1100m9> CREATOR = new C0701h4(3);

    /* JADX INFO: renamed from: a */
    public final int f6714a;

    /* JADX INFO: renamed from: b */
    public final String f6715b;

    public C1100m9(int i, String str) {
        this.f6714a = i;
        this.f6715b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.f6714a);
        sb.append(",url=");
        return AbstractC1308pu.m5342i(sb, this.f6715b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6715b);
        parcel.writeInt(this.f6714a);
    }
}

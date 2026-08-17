package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class m12 extends AbstractC0734i0 {
    public static final Parcelable.Creator<m12> CREATOR = new C0697h0(10);

    /* JADX INFO: renamed from: c */
    public int f6591c;

    /* JADX INFO: renamed from: d */
    public boolean f6592d;

    public m12(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f6591c = parcel.readInt();
        this.f6592d = parcel.readInt() != 0;
    }

    @Override // p000.AbstractC0734i0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f6591c);
        parcel.writeInt(this.f6592d ? 1 : 0);
    }
}

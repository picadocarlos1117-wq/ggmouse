package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: gn */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0683gn extends AbstractC0734i0 {
    public static final Parcelable.Creator<C0683gn> CREATOR = new C0697h0(2);

    /* JADX INFO: renamed from: c */
    public boolean f4242c;

    public C0683gn(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4242c = parcel.readInt() == 1;
    }

    @Override // p000.AbstractC0734i0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f4242c ? 1 : 0);
    }
}

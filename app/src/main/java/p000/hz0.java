package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class hz0 extends AbstractC0734i0 {
    public static final Parcelable.Creator<hz0> CREATOR = new C0697h0(5);

    /* JADX INFO: renamed from: c */
    public boolean f4749c;

    public hz0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            hz0.class.getClassLoader();
        }
        this.f4749c = parcel.readInt() == 1;
    }

    @Override // p000.AbstractC0734i0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f4749c ? 1 : 0);
    }
}

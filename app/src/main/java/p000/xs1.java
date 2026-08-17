package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class xs1 extends AbstractC0734i0 {
    public static final Parcelable.Creator<xs1> CREATOR = new C0697h0(8);

    /* JADX INFO: renamed from: c */
    public final int f12721c;

    public xs1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f12721c = parcel.readInt();
    }

    @Override // p000.AbstractC0734i0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f12721c);
    }

    public xs1(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f12721c = sideSheetBehavior.f2095h;
    }
}

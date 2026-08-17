package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: t8 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1434t8 extends View.BaseSavedState {
    public static final Parcelable.Creator<C1434t8> CREATOR = new C0701h4(2);

    /* JADX INFO: renamed from: a */
    public boolean f10800a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f10800a ? (byte) 1 : (byte) 0);
    }
}

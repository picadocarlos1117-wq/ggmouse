package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class sz0 extends View.BaseSavedState {
    public static final Parcelable.Creator<sz0> CREATOR = new C0701h4(25);

    /* JADX INFO: renamed from: a */
    public int f10656a;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.f10656a;
        if (i != 1) {
            str = i != 2 ? "unchecked" : "indeterminate";
        } else {
            str = "checked";
        }
        return AbstractC1308pu.m5342i(sb, str, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.f10656a));
    }
}

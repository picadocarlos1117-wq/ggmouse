package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class dq1 extends AbstractC0734i0 {
    public static final Parcelable.Creator<dq1> CREATOR = new C0697h0(7);

    /* JADX INFO: renamed from: c */
    public boolean f2995c;

    public dq1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2995c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f2995c + "}";
    }

    @Override // p000.AbstractC0734i0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.f2995c));
    }
}

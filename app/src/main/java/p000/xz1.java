package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class xz1 extends AbstractC0734i0 {
    public static final Parcelable.Creator<xz1> CREATOR = new C0697h0(9);

    /* JADX INFO: renamed from: c */
    public CharSequence f12787c;

    /* JADX INFO: renamed from: d */
    public boolean f12788d;

    public xz1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f12787c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f12788d = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f12787c) + "}";
    }

    @Override // p000.AbstractC0734i0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f12787c, parcel, i);
        parcel.writeInt(this.f12788d ? 1 : 0);
    }
}

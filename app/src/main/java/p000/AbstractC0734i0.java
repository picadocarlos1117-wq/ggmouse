package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: i0 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0734i0 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final Parcelable f4756a;

    /* JADX INFO: renamed from: b */
    public static final C0660g0 f4755b = new C0660g0();
    public static final Parcelable.Creator<AbstractC0734i0> CREATOR = new C0697h0(0);

    public AbstractC0734i0(Parcelable parcelable) {
        if (parcelable != null) {
            this.f4756a = parcelable == f4755b ? null : parcelable;
        } else {
            f40.m2713i("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f4756a, i);
    }

    public AbstractC0734i0() {
        this.f4756a = null;
    }

    public AbstractC0734i0(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f4756a = parcelable == null ? f4755b : parcelable;
    }
}

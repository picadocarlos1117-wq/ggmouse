package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: ri */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1370ri extends AbstractC0734i0 {
    public static final Parcelable.Creator<C1370ri> CREATOR = new C0697h0(1);

    /* JADX INFO: renamed from: c */
    public final int f10048c;

    /* JADX INFO: renamed from: d */
    public final int f10049d;

    /* JADX INFO: renamed from: e */
    public final boolean f10050e;

    /* JADX INFO: renamed from: f */
    public final boolean f10051f;

    /* JADX INFO: renamed from: g */
    public final boolean f10052g;

    public C1370ri(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f10048c = parcel.readInt();
        this.f10049d = parcel.readInt();
        this.f10050e = parcel.readInt() == 1;
        this.f10051f = parcel.readInt() == 1;
        this.f10052g = parcel.readInt() == 1;
    }

    @Override // p000.AbstractC0734i0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f10048c);
        parcel.writeInt(this.f10049d);
        parcel.writeInt(this.f10050e ? 1 : 0);
        parcel.writeInt(this.f10051f ? 1 : 0);
        parcel.writeInt(this.f10052g ? 1 : 0);
    }

    public C1370ri(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f10048c = bottomSheetBehavior.f1966L;
        this.f10049d = bottomSheetBehavior.f1989e;
        this.f10050e = bottomSheetBehavior.f1983b;
        this.f10051f = bottomSheetBehavior.f1963I;
        this.f10052g = bottomSheetBehavior.f1964J;
    }
}

package p000;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class eo0 implements Parcelable {
    public static final Parcelable.Creator<eo0> CREATOR = new C0701h4(22);

    /* JADX INFO: renamed from: a */
    public final IntentSender f3396a;

    /* JADX INFO: renamed from: b */
    public final Intent f3397b;

    /* JADX INFO: renamed from: c */
    public final int f3398c;

    /* JADX INFO: renamed from: d */
    public final int f3399d;

    public eo0(IntentSender intentSender, Intent intent, int i, int i2) {
        intentSender.getClass();
        this.f3396a = intentSender;
        this.f3397b = intent;
        this.f3398c = i;
        this.f3399d = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.f3396a, i);
        parcel.writeParcelable(this.f3397b, i);
        parcel.writeInt(this.f3398c);
        parcel.writeInt(this.f3399d);
    }
}

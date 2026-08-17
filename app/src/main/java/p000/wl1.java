package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class wl1 implements Parcelable {
    public static final Parcelable.Creator<wl1> CREATOR = new n21(16);

    /* JADX INFO: renamed from: a */
    public ml0 f12224a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.f12224a == null) {
                    this.f12224a = new vl1(this);
                }
                parcel.writeStrongBinder(this.f12224a.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo202a(int i, Bundle bundle) {
    }
}

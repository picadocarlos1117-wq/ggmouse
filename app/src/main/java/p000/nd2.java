package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nd2 extends dd2 {
    @Override // p000.dd2
    /* JADX INFO: renamed from: a */
    public final boolean mo2347a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) ed2.m2574a(parcel);
        ed2.m2575b(parcel);
        mo1745b(bundle);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo1745b(Bundle bundle);
}

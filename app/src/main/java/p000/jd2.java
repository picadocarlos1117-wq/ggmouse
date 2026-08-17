package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jd2 extends dd2 {
    @Override // p000.dd2
    /* JADX INFO: renamed from: a */
    public final boolean mo2347a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) ed2.m2574a(parcel);
            ed2.m2575b(parcel);
            mo1768e(bundle);
            return true;
        }
        if (i == 3) {
            Parcelable.Creator creator2 = Bundle.CREATOR;
            Bundle bundle2 = (Bundle) ed2.m2574a(parcel);
            ed2.m2575b(parcel);
            mo1766c(bundle2);
            return true;
        }
        if (i == 4) {
            Parcelable.Creator creator3 = Bundle.CREATOR;
            Bundle bundle3 = (Bundle) ed2.m2574a(parcel);
            ed2.m2575b(parcel);
            mo1767d(bundle3);
            return true;
        }
        if (i != 5) {
            return false;
        }
        Parcelable.Creator creator4 = Bundle.CREATOR;
        Bundle bundle4 = (Bundle) ed2.m2574a(parcel);
        ed2.m2575b(parcel);
        mo1765b(bundle4);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo1765b(Bundle bundle);

    /* JADX INFO: renamed from: c */
    public abstract void mo1766c(Bundle bundle);

    /* JADX INFO: renamed from: d */
    public abstract void mo1767d(Bundle bundle);

    /* JADX INFO: renamed from: e */
    public abstract void mo1768e(Bundle bundle);
}

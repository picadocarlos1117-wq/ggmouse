package p000;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ed2 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f3323a = 0;

    static {
        ed2.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static Parcelable m2574a(Parcel parcel) {
        Parcelable.Creator creator = Bundle.CREATOR;
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static void m2575b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(jd0.m3609g(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}

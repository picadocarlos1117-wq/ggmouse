package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: h0 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0697h0 implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4367a;

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f4367a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC0734i0.f4755b;
                }
                f40.m2719o("superState must be null");
                return null;
            case 1:
                return new C1370ri(parcel, classLoader);
            case 2:
                return new C0683gn(parcel, classLoader);
            case 3:
                return new C1121mu(parcel, classLoader);
            case 4:
                return new te0(parcel, classLoader);
            case 5:
                return new hz0(parcel, classLoader);
            case 6:
                return new tj1(parcel, classLoader);
            case 7:
                return new dq1(parcel, classLoader);
            case 8:
                return new xs1(parcel, classLoader);
            case 9:
                return new xz1(parcel, classLoader);
            default:
                return new m12(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f4367a) {
            case 0:
                return new AbstractC0734i0[i];
            case 1:
                return new C1370ri[i];
            case 2:
                return new C0683gn[i];
            case 3:
                return new C1121mu[i];
            case 4:
                return new te0[i];
            case 5:
                return new hz0[i];
            case 6:
                return new tj1[i];
            case 7:
                return new dq1[i];
            case 8:
                return new xs1[i];
            case 9:
                return new xz1[i];
            default:
                return new m12[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f4367a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC0734i0.f4755b;
                }
                f40.m2719o("superState must be null");
                return null;
            case 1:
                return new C1370ri(parcel, null);
            case 2:
                return new C0683gn(parcel, null);
            case 3:
                return new C1121mu(parcel, null);
            case 4:
                return new te0(parcel, null);
            case 5:
                return new hz0(parcel, null);
            case 6:
                return new tj1(parcel, null);
            case 7:
                return new dq1(parcel, null);
            case 8:
                return new xs1(parcel, null);
            case 9:
                return new xz1(parcel, null);
            default:
                return new m12(parcel, null);
        }
    }
}

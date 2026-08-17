package p000;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0038b;
import java.util.ArrayList;

/* JADX INFO: renamed from: sg */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1405sg implements Parcelable {
    public static final Parcelable.Creator<C1405sg> CREATOR = new C0701h4(5);

    /* JADX INFO: renamed from: a */
    public final ArrayList f10400a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f10401b;

    public C1405sg(Parcel parcel) {
        this.f10400a = parcel.createStringArrayList();
        this.f10401b = parcel.createTypedArrayList(C0038b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f10400a);
        parcel.writeTypedList(this.f10401b);
    }
}

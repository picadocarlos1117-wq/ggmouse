package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class lt1 implements f51 {
    public static final Parcelable.Creator<lt1> CREATOR = new n21(18);

    /* JADX INFO: renamed from: a */
    public final ArrayList f6509a;

    public lt1(ArrayList arrayList) {
        this.f6509a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((kt1) arrayList.get(0)).f6005b;
            for (int i = 1; i < arrayList.size(); i++) {
                if (((kt1) arrayList.get(i)).f6004a < j) {
                    z = true;
                    break;
                }
                j = ((kt1) arrayList.get(i)).f6005b;
            }
        }
        ki0.m3857c(!z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lt1.class != obj.getClass()) {
            return false;
        }
        return this.f6509a.equals(((lt1) obj).f6509a);
    }

    public final int hashCode() {
        return this.f6509a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f6509a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f6509a);
    }
}

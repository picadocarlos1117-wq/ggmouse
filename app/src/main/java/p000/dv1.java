package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class dv1 implements Parcelable {
    public static final Parcelable.Creator<dv1> CREATOR = new n21(25);

    /* JADX INFO: renamed from: a */
    public int f3026a;

    /* JADX INFO: renamed from: b */
    public int f3027b;

    /* JADX INFO: renamed from: c */
    public int f3028c;

    /* JADX INFO: renamed from: d */
    public int[] f3029d;

    /* JADX INFO: renamed from: e */
    public int f3030e;

    /* JADX INFO: renamed from: f */
    public int[] f3031f;

    /* JADX INFO: renamed from: g */
    public ArrayList f3032g;

    /* JADX INFO: renamed from: m */
    public boolean f3033m;

    /* JADX INFO: renamed from: n */
    public boolean f3034n;

    /* JADX INFO: renamed from: o */
    public boolean f3035o;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3026a);
        parcel.writeInt(this.f3027b);
        parcel.writeInt(this.f3028c);
        if (this.f3028c > 0) {
            parcel.writeIntArray(this.f3029d);
        }
        parcel.writeInt(this.f3030e);
        if (this.f3030e > 0) {
            parcel.writeIntArray(this.f3031f);
        }
        parcel.writeInt(this.f3033m ? 1 : 0);
        parcel.writeInt(this.f3034n ? 1 : 0);
        parcel.writeInt(this.f3035o ? 1 : 0);
        parcel.writeList(this.f3032g);
    }
}

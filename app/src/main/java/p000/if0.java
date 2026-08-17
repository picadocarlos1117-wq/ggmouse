package p000;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0038b;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class if0 implements Parcelable {
    public static final Parcelable.Creator<if0> CREATOR = new C0701h4(17);

    /* JADX INFO: renamed from: a */
    public ArrayList f5001a;

    /* JADX INFO: renamed from: b */
    public ArrayList f5002b;

    /* JADX INFO: renamed from: c */
    public C0038b[] f5003c;

    /* JADX INFO: renamed from: d */
    public int f5004d;

    /* JADX INFO: renamed from: e */
    public String f5005e;

    /* JADX INFO: renamed from: f */
    public ArrayList f5006f;

    /* JADX INFO: renamed from: g */
    public ArrayList f5007g;

    /* JADX INFO: renamed from: m */
    public ArrayList f5008m;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f5001a);
        parcel.writeStringList(this.f5002b);
        parcel.writeTypedArray(this.f5003c, i);
        parcel.writeInt(this.f5004d);
        parcel.writeString(this.f5005e);
        parcel.writeStringList(this.f5006f);
        parcel.writeTypedList(this.f5007g);
        parcel.writeTypedList(this.f5008m);
    }
}

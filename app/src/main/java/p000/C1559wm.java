package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: wm */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1559wm extends bm0 {
    public static final Parcelable.Creator<C1559wm> CREATOR = new C0701h4(10);

    /* JADX INFO: renamed from: b */
    public final String f12225b;

    /* JADX INFO: renamed from: c */
    public final boolean f12226c;

    /* JADX INFO: renamed from: d */
    public final boolean f12227d;

    /* JADX INFO: renamed from: e */
    public final String[] f12228e;

    /* JADX INFO: renamed from: f */
    public final bm0[] f12229f;

    public C1559wm(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i = z42.f13274a;
        this.f12225b = string;
        this.f12226c = parcel.readByte() != 0;
        this.f12227d = parcel.readByte() != 0;
        this.f12228e = parcel.createStringArray();
        int i2 = parcel.readInt();
        this.f12229f = new bm0[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f12229f[i3] = (bm0) parcel.readParcelable(bm0.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1559wm.class == obj.getClass()) {
            C1559wm c1559wm = (C1559wm) obj;
            if (this.f12226c == c1559wm.f12226c && this.f12227d == c1559wm.f12227d) {
                String str = c1559wm.f12225b;
                int i = z42.f13274a;
                if (Objects.equals(this.f12225b, str) && Arrays.equals(this.f12228e, c1559wm.f12228e) && Arrays.equals(this.f12229f, c1559wm.f12229f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((527 + (this.f12226c ? 1 : 0)) * 31) + (this.f12227d ? 1 : 0)) * 31;
        String str = this.f12225b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12225b);
        parcel.writeByte(this.f12226c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12227d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f12228e);
        bm0[] bm0VarArr = this.f12229f;
        parcel.writeInt(bm0VarArr.length);
        for (bm0 bm0Var : bm0VarArr) {
            parcel.writeParcelable(bm0Var, 0);
        }
    }

    public C1559wm(String str, boolean z, boolean z2, String[] strArr, bm0[] bm0VarArr) {
        super("CTOC");
        this.f12225b = str;
        this.f12226c = z;
        this.f12227d = z2;
        this.f12228e = strArr;
        this.f12229f = bm0VarArr;
    }
}

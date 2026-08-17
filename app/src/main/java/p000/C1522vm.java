package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: vm */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1522vm extends bm0 {
    public static final Parcelable.Creator<C1522vm> CREATOR = new C0701h4(9);

    /* JADX INFO: renamed from: b */
    public final String f11707b;

    /* JADX INFO: renamed from: c */
    public final int f11708c;

    /* JADX INFO: renamed from: d */
    public final int f11709d;

    /* JADX INFO: renamed from: e */
    public final long f11710e;

    /* JADX INFO: renamed from: f */
    public final long f11711f;

    /* JADX INFO: renamed from: g */
    public final bm0[] f11712g;

    public C1522vm(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i = z42.f13274a;
        this.f11707b = string;
        this.f11708c = parcel.readInt();
        this.f11709d = parcel.readInt();
        this.f11710e = parcel.readLong();
        this.f11711f = parcel.readLong();
        int i2 = parcel.readInt();
        this.f11712g = new bm0[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f11712g[i3] = (bm0) parcel.readParcelable(bm0.class.getClassLoader());
        }
    }

    @Override // p000.bm0, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1522vm.class == obj.getClass()) {
            C1522vm c1522vm = (C1522vm) obj;
            if (this.f11708c == c1522vm.f11708c && this.f11709d == c1522vm.f11709d && this.f11710e == c1522vm.f11710e && this.f11711f == c1522vm.f11711f) {
                String str = c1522vm.f11707b;
                int i = z42.f13274a;
                if (Objects.equals(this.f11707b, str) && Arrays.equals(this.f11712g, c1522vm.f11712g)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((527 + this.f11708c) * 31) + this.f11709d) * 31) + ((int) this.f11710e)) * 31) + ((int) this.f11711f)) * 31;
        String str = this.f11707b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11707b);
        parcel.writeInt(this.f11708c);
        parcel.writeInt(this.f11709d);
        parcel.writeLong(this.f11710e);
        parcel.writeLong(this.f11711f);
        bm0[] bm0VarArr = this.f11712g;
        parcel.writeInt(bm0VarArr.length);
        for (bm0 bm0Var : bm0VarArr) {
            parcel.writeParcelable(bm0Var, 0);
        }
    }

    public C1522vm(String str, int i, int i2, long j, long j2, bm0[] bm0VarArr) {
        super("CHAP");
        this.f11707b = str;
        this.f11708c = i;
        this.f11709d = i2;
        this.f11710e = j;
        this.f11711f = j2;
        this.f11712g = bm0VarArr;
    }
}

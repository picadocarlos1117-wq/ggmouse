package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class k51 implements Parcelable {
    public static final Parcelable.Creator<k51> CREATOR = new n21(2);

    /* JADX INFO: renamed from: a */
    public final f51[] f5679a;

    /* JADX INFO: renamed from: b */
    public final long f5680b;

    public k51(Parcel parcel) {
        this.f5679a = new f51[parcel.readInt()];
        int i = 0;
        while (true) {
            f51[] f51VarArr = this.f5679a;
            if (i >= f51VarArr.length) {
                this.f5680b = parcel.readLong();
                return;
            } else {
                f51VarArr[i] = (f51) parcel.readParcelable(f51.class.getClassLoader());
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final k51 m3802a(f51... f51VarArr) {
        if (f51VarArr.length == 0) {
            return this;
        }
        int i = z42.f13274a;
        f51[] f51VarArr2 = this.f5679a;
        Object[] objArrCopyOf = Arrays.copyOf(f51VarArr2, f51VarArr2.length + f51VarArr.length);
        System.arraycopy(f51VarArr, 0, objArrCopyOf, f51VarArr2.length, f51VarArr.length);
        return new k51(this.f5680b, (f51[]) objArrCopyOf);
    }

    /* JADX INFO: renamed from: b */
    public final k51 m3803b(k51 k51Var) {
        return k51Var == null ? this : m3802a(k51Var.f5679a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k51.class == obj.getClass()) {
            k51 k51Var = (k51) obj;
            if (Arrays.equals(this.f5679a, k51Var.f5679a) && this.f5680b == k51Var.f5680b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return sc2.m6078v(this.f5680b) + (Arrays.hashCode(this.f5679a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.f5679a));
        long j = this.f5680b;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        f51[] f51VarArr = this.f5679a;
        parcel.writeInt(f51VarArr.length);
        for (f51 f51Var : f51VarArr) {
            parcel.writeParcelable(f51Var, 0);
        }
        parcel.writeLong(this.f5680b);
    }

    public k51(long j, f51... f51VarArr) {
        this.f5680b = j;
        this.f5679a = f51VarArr;
    }

    public k51(List list) {
        this((f51[]) list.toArray(new f51[0]));
    }

    public k51(f51... f51VarArr) {
        this(-9223372036854775807L, f51VarArr);
    }
}

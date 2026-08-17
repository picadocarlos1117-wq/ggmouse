package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: sk */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1409sk implements Parcelable {
    public static final Parcelable.Creator<C1409sk> CREATOR = new C0701h4(8);

    /* JADX INFO: renamed from: a */
    public final b61 f10420a;

    /* JADX INFO: renamed from: b */
    public final b61 f10421b;

    /* JADX INFO: renamed from: c */
    public final C1124mx f10422c;

    /* JADX INFO: renamed from: d */
    public final b61 f10423d;

    /* JADX INFO: renamed from: e */
    public final int f10424e;

    /* JADX INFO: renamed from: f */
    public final int f10425f;

    /* JADX INFO: renamed from: g */
    public final int f10426g;

    public C1409sk(b61 b61Var, b61 b61Var2, C1124mx c1124mx, b61 b61Var3, int i) {
        Objects.requireNonNull(b61Var, "start cannot be null");
        Objects.requireNonNull(b61Var2, "end cannot be null");
        Objects.requireNonNull(c1124mx, "validator cannot be null");
        this.f10420a = b61Var;
        this.f10421b = b61Var2;
        this.f10423d = b61Var3;
        this.f10424e = i;
        this.f10422c = c1124mx;
        if (b61Var3 != null && b61Var.f1222a.compareTo(b61Var3.f1222a) > 0) {
            f40.m2713i("start Month cannot be after current Month");
            throw null;
        }
        if (b61Var3 != null && b61Var3.f1222a.compareTo(b61Var2.f1222a) > 0) {
            f40.m2713i("current Month cannot be after end Month");
            throw null;
        }
        if (i < 0 || i > t42.m6229c(null).getMaximum(7)) {
            f40.m2713i("firstDayOfWeek is not valid");
            throw null;
        }
        this.f10426g = b61Var.m938d(b61Var2) + 1;
        this.f10425f = (b61Var2.f1224c - b61Var.f1224c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1409sk)) {
            return false;
        }
        C1409sk c1409sk = (C1409sk) obj;
        return this.f10420a.equals(c1409sk.f10420a) && this.f10421b.equals(c1409sk.f10421b) && i91.m3395a(this.f10423d, c1409sk.f10423d) && this.f10424e == c1409sk.f10424e && this.f10422c.equals(c1409sk.f10422c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10420a, this.f10421b, this.f10423d, Integer.valueOf(this.f10424e), this.f10422c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f10420a, 0);
        parcel.writeParcelable(this.f10421b, 0);
        parcel.writeParcelable(this.f10423d, 0);
        parcel.writeParcelable(this.f10422c, 0);
        parcel.writeInt(this.f10424e);
    }
}

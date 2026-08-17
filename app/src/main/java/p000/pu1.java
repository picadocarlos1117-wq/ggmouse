package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class pu1 extends mu1 {
    public static final Parcelable.Creator<pu1> CREATOR = new n21(21);

    /* JADX INFO: renamed from: a */
    public final long f9165a;

    /* JADX INFO: renamed from: b */
    public final boolean f9166b;

    /* JADX INFO: renamed from: c */
    public final boolean f9167c;

    /* JADX INFO: renamed from: d */
    public final boolean f9168d;

    /* JADX INFO: renamed from: e */
    public final boolean f9169e;

    /* JADX INFO: renamed from: f */
    public final long f9170f;

    /* JADX INFO: renamed from: g */
    public final long f9171g;

    /* JADX INFO: renamed from: m */
    public final List f9172m;

    /* JADX INFO: renamed from: n */
    public final boolean f9173n;

    /* JADX INFO: renamed from: o */
    public final long f9174o;

    /* JADX INFO: renamed from: p */
    public final int f9175p;

    /* JADX INFO: renamed from: q */
    public final int f9176q;

    /* JADX INFO: renamed from: r */
    public final int f9177r;

    public pu1(Parcel parcel) {
        this.f9165a = parcel.readLong();
        this.f9166b = parcel.readByte() == 1;
        this.f9167c = parcel.readByte() == 1;
        this.f9168d = parcel.readByte() == 1;
        this.f9169e = parcel.readByte() == 1;
        this.f9170f = parcel.readLong();
        this.f9171g = parcel.readLong();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new ou1(parcel.readLong(), parcel.readLong(), parcel.readInt()));
        }
        this.f9172m = Collections.unmodifiableList(arrayList);
        this.f9173n = parcel.readByte() == 1;
        this.f9174o = parcel.readLong();
        this.f9175p = parcel.readInt();
        this.f9176q = parcel.readInt();
        this.f9177r = parcel.readInt();
    }

    @Override // p000.mu1
    public final String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f9170f + ", programSplicePlaybackPositionUs= " + this.f9171g + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f9165a);
        parcel.writeByte(this.f9166b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9167c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9168d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9169e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f9170f);
        parcel.writeLong(this.f9171g);
        List list = this.f9172m;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ou1 ou1Var = (ou1) list.get(i2);
            parcel.writeInt(ou1Var.f8492a);
            parcel.writeLong(ou1Var.f8493b);
            parcel.writeLong(ou1Var.f8494c);
        }
        parcel.writeByte(this.f9173n ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f9174o);
        parcel.writeInt(this.f9175p);
        parcel.writeInt(this.f9176q);
        parcel.writeInt(this.f9177r);
    }

    public pu1(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List list, boolean z5, long j4, int i, int i2, int i3) {
        this.f9165a = j;
        this.f9166b = z;
        this.f9167c = z2;
        this.f9168d = z3;
        this.f9169e = z4;
        this.f9170f = j2;
        this.f9171g = j3;
        this.f9172m = Collections.unmodifiableList(list);
        this.f9173n = z5;
        this.f9174o = j4;
        this.f9175p = i;
        this.f9176q = i2;
        this.f9177r = i3;
    }
}

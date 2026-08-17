package p000;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class su1 {

    /* JADX INFO: renamed from: a */
    public final long f10545a;

    /* JADX INFO: renamed from: b */
    public final boolean f10546b;

    /* JADX INFO: renamed from: c */
    public final boolean f10547c;

    /* JADX INFO: renamed from: d */
    public final boolean f10548d;

    /* JADX INFO: renamed from: e */
    public final long f10549e;

    /* JADX INFO: renamed from: f */
    public final List f10550f;

    /* JADX INFO: renamed from: g */
    public final boolean f10551g;

    /* JADX INFO: renamed from: h */
    public final long f10552h;

    /* JADX INFO: renamed from: i */
    public final int f10553i;

    /* JADX INFO: renamed from: j */
    public final int f10554j;

    /* JADX INFO: renamed from: k */
    public final int f10555k;

    public su1(Parcel parcel) {
        this.f10545a = parcel.readLong();
        this.f10546b = parcel.readByte() == 1;
        this.f10547c = parcel.readByte() == 1;
        this.f10548d = parcel.readByte() == 1;
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new ru1(parcel.readInt(), parcel.readLong()));
        }
        this.f10550f = Collections.unmodifiableList(arrayList);
        this.f10549e = parcel.readLong();
        this.f10551g = parcel.readByte() == 1;
        this.f10552h = parcel.readLong();
        this.f10553i = parcel.readInt();
        this.f10554j = parcel.readInt();
        this.f10555k = parcel.readInt();
    }

    public su1(long j, boolean z, boolean z2, boolean z3, ArrayList arrayList, long j2, boolean z4, long j3, int i, int i2, int i3) {
        this.f10545a = j;
        this.f10546b = z;
        this.f10547c = z2;
        this.f10548d = z3;
        this.f10550f = Collections.unmodifiableList(arrayList);
        this.f10549e = j2;
        this.f10551g = z4;
        this.f10552h = j3;
        this.f10553i = i;
        this.f10554j = i2;
        this.f10555k = i3;
    }
}

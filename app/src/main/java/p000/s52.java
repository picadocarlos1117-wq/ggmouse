package p000;

import android.os.Parcel;
import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class s52 extends r52 {

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f10238d;

    /* JADX INFO: renamed from: e */
    public final Parcel f10239e;

    /* JADX INFO: renamed from: f */
    public final int f10240f;

    /* JADX INFO: renamed from: g */
    public final int f10241g;

    /* JADX INFO: renamed from: h */
    public final String f10242h;

    /* JADX INFO: renamed from: i */
    public int f10243i;

    /* JADX INFO: renamed from: j */
    public int f10244j;

    /* JADX INFO: renamed from: k */
    public int f10245k;

    public s52(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0633fa(), new C0633fa(), new C0633fa());
    }

    @Override // p000.r52
    /* JADX INFO: renamed from: a */
    public final s52 mo5704a() {
        Parcel parcel = this.f10239e;
        int iDataPosition = parcel.dataPosition();
        int i = this.f10244j;
        if (i == this.f10240f) {
            i = this.f10241g;
        }
        return new s52(parcel, iDataPosition, i, AbstractC1308pu.m5342i(new StringBuilder(), this.f10242h, "  "), this.f9738a, this.f9739b, this.f9740c);
    }

    @Override // p000.r52
    /* JADX INFO: renamed from: e */
    public final boolean mo5708e(int i) {
        while (true) {
            int i2 = this.f10244j;
            int i3 = this.f10245k;
            if (i2 >= this.f10241g) {
                return i3 == i;
            }
            if (i3 == i) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i4 = this.f10244j;
            Parcel parcel = this.f10239e;
            parcel.setDataPosition(i4);
            int i5 = parcel.readInt();
            this.f10245k = parcel.readInt();
            this.f10244j += i5;
        }
    }

    @Override // p000.r52
    /* JADX INFO: renamed from: i */
    public final void mo5712i(int i) {
        int i2 = this.f10243i;
        SparseIntArray sparseIntArray = this.f10238d;
        Parcel parcel = this.f10239e;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
        this.f10243i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public s52(Parcel parcel, int i, int i2, String str, C0633fa c0633fa, C0633fa c0633fa2, C0633fa c0633fa3) {
        super(c0633fa, c0633fa2, c0633fa3);
        this.f10238d = new SparseIntArray();
        this.f10243i = -1;
        this.f10245k = -1;
        this.f10239e = parcel;
        this.f10240f = i;
        this.f10241g = i2;
        this.f10244j = i;
        this.f10242h = str;
    }
}

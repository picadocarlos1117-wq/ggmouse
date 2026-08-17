package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class t82 implements f51 {
    public static final Parcelable.Creator<t82> CREATOR = new r82(0);

    /* JADX INFO: renamed from: a */
    public final String f10802a;

    /* JADX INFO: renamed from: b */
    public final String f10803b;

    public t82(Parcel parcel) {
        String string = parcel.readString();
        int i = z42.f13274a;
        this.f10802a = string;
        this.f10803b = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            t82 t82Var = (t82) obj;
            if (this.f10802a.equals(t82Var.f10802a) && this.f10803b.equals(t82Var.f10803b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f10803b.hashCode() + AbstractC1308pu.m5336c(527, 31, this.f10802a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p000.f51
    /* JADX INFO: renamed from: p */
    public final void mo2346p(c21 c21Var) {
        String str = this.f10802a;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    b = 0;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    b = 1;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    b = 2;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    b = 3;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    b = 4;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    b = 5;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    b = 6;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    b = 7;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    b = 8;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    b = 9;
                }
                break;
        }
        String str2 = this.f10803b;
        switch (b) {
            case 0:
                Integer numM5805t0 = rc2.m5805t0(str2);
                if (numM5805t0 != null) {
                    c21Var.f1637i = numM5805t0;
                }
                break;
            case 1:
                Integer numM5805t1 = rc2.m5805t0(str2);
                if (numM5805t1 != null) {
                    c21Var.f1650v = numM5805t1;
                }
                break;
            case 2:
                Integer numM5805t2 = rc2.m5805t0(str2);
                if (numM5805t2 != null) {
                    c21Var.f1636h = numM5805t2;
                }
                break;
            case 3:
                c21Var.f1631c = str2;
                break;
            case 4:
                c21Var.f1651w = str2;
                break;
            case 5:
                c21Var.f1629a = str2;
                break;
            case 6:
                c21Var.f1633e = str2;
                break;
            case 7:
                Integer numM5805t3 = rc2.m5805t0(str2);
                if (numM5805t3 != null) {
                    c21Var.f1649u = numM5805t3;
                }
                break;
            case 8:
                c21Var.f1632d = str2;
                break;
            case 9:
                c21Var.f1630b = str2;
                break;
        }
    }

    public final String toString() {
        return "VC: " + this.f10802a + "=" + this.f10803b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10802a);
        parcel.writeString(this.f10803b);
    }

    public t82(String str, String str2) {
        this.f10802a = ua0.m6446c0(str);
        this.f10803b = str2;
    }
}

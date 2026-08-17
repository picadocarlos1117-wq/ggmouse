package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.sun.security.util.DerValue;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class tz1 extends bm0 {
    public static final Parcelable.Creator<tz1> CREATOR = new n21(26);

    /* JADX INFO: renamed from: b */
    public final String f11076b;

    /* JADX INFO: renamed from: c */
    public final qm0 f11077c;

    public tz1(String str, String str2, kk1 kk1Var) {
        super(str);
        ki0.m3857c(!kk1Var.isEmpty());
        this.f11076b = str2;
        qm0 qm0VarM5567n = qm0.m5567n(kk1Var);
        this.f11077c = qm0VarM5567n;
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList m6356a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tz1.class == obj.getClass()) {
            tz1 tz1Var = (tz1) obj;
            String str = tz1Var.f1432a;
            int i = z42.f13274a;
            if (Objects.equals(this.f1432a, str) && Objects.equals(this.f11076b, tz1Var.f11076b) && this.f11077c.equals(tz1Var.f11077c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM5336c = AbstractC1308pu.m5336c(527, 31, this.f1432a);
        String str = this.f11076b;
        return this.f11077c.hashCode() + ((iM5336c + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // p000.f51
    /* JADX INFO: renamed from: p */
    public final void mo2346p(c21 c21Var) {
        byte b;
        String str = this.f1432a;
        str.getClass();
        switch (str) {
            case "TAL":
                b = 0;
                break;
            case "TCM":
                b = 1;
                break;
            case "TDA":
                b = 2;
                break;
            case "TP1":
                b = 3;
                break;
            case "TP2":
                b = 4;
                break;
            case "TP3":
                b = 5;
                break;
            case "TRK":
                b = 6;
                break;
            case "TT2":
                b = 7;
                break;
            case "TXT":
                b = 8;
                break;
            case "TYE":
                b = 9;
                break;
            case "TALB":
                b = 10;
                break;
            case "TCOM":
                b = 11;
                break;
            case "TCON":
                b = DerValue.tag_UTF8String;
                break;
            case "TDAT":
                b = 13;
                break;
            case "TDRC":
                b = 14;
                break;
            case "TDRL":
                b = 15;
                break;
            case "TEXT":
                b = 16;
                break;
            case "TIT2":
                b = 17;
                break;
            case "TPE1":
                b = 18;
                break;
            case "TPE2":
                b = DerValue.tag_PrintableString;
                break;
            case "TPE3":
                b = DerValue.tag_T61String;
                break;
            case "TRCK":
                b = 21;
                break;
            case "TYER":
                b = DerValue.tag_IA5String;
                break;
            default:
                b = -1;
                break;
        }
        qm0 qm0Var = this.f11077c;
        try {
            switch (b) {
                case 0:
                case 10:
                    c21Var.f1631c = (CharSequence) qm0Var.get(0);
                    break;
                case 1:
                case 11:
                    c21Var.f1647s = (CharSequence) qm0Var.get(0);
                    break;
                case 2:
                case 13:
                    String str2 = (String) qm0Var.get(0);
                    int i = Integer.parseInt(str2.substring(2, 4));
                    int i2 = Integer.parseInt(str2.substring(0, 2));
                    c21Var.f1641m = Integer.valueOf(i);
                    c21Var.f1642n = Integer.valueOf(i2);
                    break;
                case 3:
                case 18:
                    c21Var.f1630b = (CharSequence) qm0Var.get(0);
                    break;
                case 4:
                case 19:
                    c21Var.f1632d = (CharSequence) qm0Var.get(0);
                    break;
                case 5:
                case 20:
                    c21Var.f1648t = (CharSequence) qm0Var.get(0);
                    break;
                case 6:
                case 21:
                    String str3 = (String) qm0Var.get(0);
                    int i3 = z42.f13274a;
                    String[] strArrSplit = str3.split("/", -1);
                    int i4 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    c21Var.f1636h = Integer.valueOf(i4);
                    c21Var.f1637i = numValueOf;
                    break;
                case 7:
                case 17:
                    c21Var.f1629a = (CharSequence) qm0Var.get(0);
                    break;
                case 8:
                case 16:
                    c21Var.f1646r = (CharSequence) qm0Var.get(0);
                    break;
                case 9:
                case 22:
                    c21Var.f1640l = Integer.valueOf(Integer.parseInt((String) qm0Var.get(0)));
                    break;
                case 12:
                    Integer numM5805t0 = rc2.m5805t0((String) qm0Var.get(0));
                    if (numM5805t0 != null) {
                        String strM2373a = dm0.m2373a(numM5805t0.intValue());
                        if (strM2373a != null) {
                            c21Var.f1651w = strM2373a;
                        }
                    } else {
                        c21Var.f1651w = (CharSequence) qm0Var.get(0);
                    }
                    break;
                case 14:
                    ArrayList arrayListM6356a = m6356a((String) qm0Var.get(0));
                    int size = arrayListM6356a.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                c21Var.f1642n = (Integer) arrayListM6356a.get(2);
                            }
                        }
                        c21Var.f1641m = (Integer) arrayListM6356a.get(1);
                    }
                    c21Var.f1640l = (Integer) arrayListM6356a.get(0);
                    break;
                case 15:
                    ArrayList arrayListM6356a2 = m6356a((String) qm0Var.get(0));
                    int size2 = arrayListM6356a2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                c21Var.f1645q = (Integer) arrayListM6356a2.get(2);
                            }
                        }
                        c21Var.f1644p = (Integer) arrayListM6356a2.get(1);
                    }
                    c21Var.f1643o = (Integer) arrayListM6356a2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // p000.bm0
    public final String toString() {
        return this.f1432a + ": description=" + this.f11076b + ": values=" + this.f11077c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1432a);
        parcel.writeString(this.f11076b);
        parcel.writeStringArray((String[]) this.f11077c.toArray(new String[0]));
    }
}

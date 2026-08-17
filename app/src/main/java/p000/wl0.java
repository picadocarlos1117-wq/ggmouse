package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class wl0 implements f51 {
    public static final Parcelable.Creator<wl0> CREATOR = new C0701h4(20);

    /* JADX INFO: renamed from: a */
    public final int f12218a;

    /* JADX INFO: renamed from: b */
    public final String f12219b;

    /* JADX INFO: renamed from: c */
    public final String f12220c;

    /* JADX INFO: renamed from: d */
    public final String f12221d;

    /* JADX INFO: renamed from: e */
    public final boolean f12222e;

    /* JADX INFO: renamed from: f */
    public final int f12223f;

    public wl0(Parcel parcel) {
        this.f12218a = parcel.readInt();
        this.f12219b = parcel.readString();
        this.f12220c = parcel.readString();
        this.f12221d = parcel.readString();
        int i = z42.f13274a;
        this.f12222e = parcel.readInt() != 0;
        this.f12223f = parcel.readInt();
    }

    /* JADX INFO: renamed from: a */
    public static wl0 m6807a(Map map) {
        boolean z;
        int i;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i2;
        List list = (List) map.get("icy-br");
        boolean z2 = true;
        int i3 = -1;
        if (list != null) {
            String str4 = (String) list.get(0);
            try {
                i2 = Integer.parseInt(str4) * 1000;
                if (i2 > 0) {
                    z = true;
                } else {
                    try {
                        AbstractC1337qm.m5542i0("IcyHeaders", "Invalid bitrate: " + str4);
                        z = false;
                        i2 = -1;
                    } catch (NumberFormatException unused) {
                        AbstractC1308pu.m5355v("Invalid bitrate header: ", str4, "IcyHeaders");
                        z = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i2 = -1;
            }
            i = i2;
        } else {
            z = false;
            i = -1;
        }
        List list2 = (List) map.get("icy-genre");
        if (list2 != null) {
            str = (String) list2.get(0);
            z = true;
        } else {
            str = null;
        }
        List list3 = (List) map.get("icy-name");
        if (list3 != null) {
            str2 = (String) list3.get(0);
            z = true;
        } else {
            str2 = null;
        }
        List list4 = (List) map.get("icy-url");
        if (list4 != null) {
            str3 = (String) list4.get(0);
            z = true;
        } else {
            str3 = null;
        }
        List list5 = (List) map.get("icy-pub");
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals("1");
            z = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get("icy-metaint");
        if (list6 != null) {
            String str5 = (String) list6.get(0);
            try {
                int i4 = Integer.parseInt(str5);
                if (i4 > 0) {
                    i3 = i4;
                } else {
                    try {
                        AbstractC1337qm.m5542i0("IcyHeaders", "Invalid metadata interval: " + str5);
                        z2 = z;
                    } catch (NumberFormatException unused3) {
                        i3 = i4;
                        AbstractC1308pu.m5355v("Invalid metadata interval: ", str5, "IcyHeaders");
                    }
                }
                z = z2;
            } catch (NumberFormatException unused4) {
            }
        }
        int i5 = i3;
        if (z) {
            return new wl0(i, str, str2, str3, zEquals, i5);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wl0.class == obj.getClass()) {
            wl0 wl0Var = (wl0) obj;
            if (this.f12218a == wl0Var.f12218a) {
                String str = wl0Var.f12219b;
                int i = z42.f13274a;
                if (Objects.equals(this.f12219b, str) && Objects.equals(this.f12220c, wl0Var.f12220c) && Objects.equals(this.f12221d, wl0Var.f12221d) && this.f12222e == wl0Var.f12222e && this.f12223f == wl0Var.f12223f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (527 + this.f12218a) * 31;
        String str = this.f12219b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12220c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12221d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f12222e ? 1 : 0)) * 31) + this.f12223f;
    }

    @Override // p000.f51
    /* JADX INFO: renamed from: p */
    public final void mo2346p(c21 c21Var) {
        String str = this.f12220c;
        if (str != null) {
            c21Var.f1652x = str;
        }
        String str2 = this.f12219b;
        if (str2 != null) {
            c21Var.f1651w = str2;
        }
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f12220c + "\", genre=\"" + this.f12219b + "\", bitrate=" + this.f12218a + ", metadataInterval=" + this.f12223f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12218a);
        parcel.writeString(this.f12219b);
        parcel.writeString(this.f12220c);
        parcel.writeString(this.f12221d);
        int i2 = z42.f13274a;
        parcel.writeInt(this.f12222e ? 1 : 0);
        parcel.writeInt(this.f12223f);
    }

    public wl0(int i, String str, String str2, String str3, boolean z, int i2) {
        ki0.m3857c(i2 == -1 || i2 > 0);
        this.f12218a = i;
        this.f12219b = str;
        this.f12220c = str2;
        this.f12221d = str3;
        this.f12222e = z;
        this.f12223f = i2;
    }
}

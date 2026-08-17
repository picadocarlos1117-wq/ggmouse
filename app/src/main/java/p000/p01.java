package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class p01 implements f51 {
    public static final Parcelable.Creator<p01> CREATOR = new C0701h4(26);

    /* JADX INFO: renamed from: a */
    public final String f8606a;

    /* JADX INFO: renamed from: b */
    public final byte[] f8607b;

    /* JADX INFO: renamed from: c */
    public final int f8608c;

    /* JADX INFO: renamed from: d */
    public final int f8609d;

    public p01(Parcel parcel) {
        String string = parcel.readString();
        int i = z42.f13274a;
        this.f8606a = string;
        byte[] bArrCreateByteArray = parcel.createByteArray();
        this.f8607b = bArrCreateByteArray;
        this.f8608c = parcel.readInt();
        int i2 = parcel.readInt();
        this.f8609d = i2;
        m5095b(string, bArrCreateByteArray, i2);
    }

    /* JADX INFO: renamed from: b */
    public static void m5095b(String str, byte[] bArr, int i) {
        byte b;
        str.getClass();
        boolean z = false;
        switch (str) {
            case "com.android.capture.fps":
                if (i == 23 && bArr.length == 4) {
                    z = true;
                }
                ki0.m3857c(z);
                break;
            case "editable.tracks.samples.location":
                if (i == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                ki0.m3857c(z);
                break;
            case "editable.tracks.length":
            case "editable.tracks.offset":
                if (i == 78 && bArr.length == 8) {
                    z = true;
                }
                ki0.m3857c(z);
                break;
            case "editable.tracks.map":
                ki0.m3857c(i == 0);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m5096a() {
        ki0.m3865i(this.f8606a.equals("editable.tracks.map"), "Metadata is not an editable tracks map");
        byte[] bArr = this.f8607b;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2]));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p01.class == obj.getClass()) {
            p01 p01Var = (p01) obj;
            if (this.f8606a.equals(p01Var.f8606a) && Arrays.equals(this.f8607b, p01Var.f8607b) && this.f8608c == p01Var.f8608c && this.f8609d == p01Var.f8609d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f8607b) + AbstractC1308pu.m5336c(527, 31, this.f8606a)) * 31) + this.f8608c) * 31) + this.f8609d;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0089 A[LOOP:0: B:24:0x0086->B:26:0x0089, LOOP_END] */
    public final String toString() {
        String string;
        StringBuilder sb;
        String str = this.f8606a;
        byte[] bArr = this.f8607b;
        int i = this.f8609d;
        if (i != 0) {
            if (i == 1) {
                string = z42.m7237k(bArr);
            } else if (i == 23) {
                string = String.valueOf(Float.intBitsToFloat(rc2.m5765G(bArr)));
            } else if (i == 67) {
                string = String.valueOf(rc2.m5765G(bArr));
            } else if (i == 75) {
                string = String.valueOf(Byte.toUnsignedInt(bArr[0]));
            } else if (i != 78) {
                int i2 = z42.f13274a;
                sb = new StringBuilder(bArr.length * 2);
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    sb.append(Character.forDigit((bArr[i3] >> 4) & 15, 16));
                    sb.append(Character.forDigit(bArr[i3] & 15, 16));
                }
                string = sb.toString();
            } else {
                string = String.valueOf(new dc1(bArr).m2342y());
            }
        } else if (str.equals("editable.tracks.map")) {
            ArrayList arrayListM5096a = m5096a();
            StringBuilder sbM5344k = AbstractC1308pu.m5344k("track types = ");
            new C0101bj(String.valueOf(',')).m996a(sbM5344k, arrayListM5096a.iterator());
            string = sbM5344k.toString();
        } else {
            int i4 = z42.f13274a;
            sb = new StringBuilder(bArr.length * 2);
            while (i3 < bArr.length) {
                sb.append(Character.forDigit((bArr[i3] >> 4) & 15, 16));
                sb.append(Character.forDigit(bArr[i3] & 15, 16));
            }
            string = sb.toString();
        }
        return jd0.m3616n("mdta: key=", str, ", value=", string);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8606a);
        parcel.writeByteArray(this.f8607b);
        parcel.writeInt(this.f8608c);
        parcel.writeInt(this.f8609d);
    }

    public p01(String str, byte[] bArr, int i, int i2) {
        m5095b(str, bArr, i2);
        this.f8606a = str;
        this.f8607b = bArr;
        this.f8608c = i;
        this.f8609d = i2;
    }
}

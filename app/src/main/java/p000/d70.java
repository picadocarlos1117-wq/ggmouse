package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class d70 implements f51 {
    public static final Parcelable.Creator<d70> CREATOR;

    /* JADX INFO: renamed from: g */
    public static final be0 f2809g;

    /* JADX INFO: renamed from: m */
    public static final be0 f2810m;

    /* JADX INFO: renamed from: a */
    public final String f2811a;

    /* JADX INFO: renamed from: b */
    public final String f2812b;

    /* JADX INFO: renamed from: c */
    public final long f2813c;

    /* JADX INFO: renamed from: d */
    public final long f2814d;

    /* JADX INFO: renamed from: e */
    public final byte[] f2815e;

    /* JADX INFO: renamed from: f */
    public int f2816f;

    static {
        ae0 ae0Var = new ae0();
        ae0Var.f197m = v51.m6582l("application/id3");
        f2809g = new be0(ae0Var);
        ae0 ae0Var2 = new ae0();
        ae0Var2.f197m = v51.m6582l("application/x-scte35");
        f2810m = new be0(ae0Var2);
        CREATOR = new C0701h4(15);
    }

    public d70(Parcel parcel) {
        String string = parcel.readString();
        int i = z42.f13274a;
        this.f2811a = string;
        this.f2812b = parcel.readString();
        this.f2813c = parcel.readLong();
        this.f2814d = parcel.readLong();
        this.f2815e = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p000.f51
    /* JADX INFO: renamed from: e */
    public final be0 mo2245e() {
        String str = this.f2811a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f2810m;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f2809g;
            default:
                return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d70.class == obj.getClass()) {
            d70 d70Var = (d70) obj;
            if (this.f2813c == d70Var.f2813c && this.f2814d == d70Var.f2814d) {
                String str = d70Var.f2811a;
                int i = z42.f13274a;
                if (Objects.equals(this.f2811a, str) && Objects.equals(this.f2812b, d70Var.f2812b) && Arrays.equals(this.f2815e, d70Var.f2815e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f2816f == 0) {
            String str = this.f2811a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f2812b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.f2813c;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f2814d;
            this.f2816f = Arrays.hashCode(this.f2815e) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.f2816f;
    }

    @Override // p000.f51
    /* JADX INFO: renamed from: s */
    public final byte[] mo2246s() {
        if (mo2245e() != null) {
            return this.f2815e;
        }
        return null;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f2811a + ", id=" + this.f2814d + ", durationMs=" + this.f2813c + ", value=" + this.f2812b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2811a);
        parcel.writeString(this.f2812b);
        parcel.writeLong(this.f2813c);
        parcel.writeLong(this.f2814d);
        parcel.writeByteArray(this.f2815e);
    }

    public d70(String str, String str2, long j, long j2, byte[] bArr) {
        this.f2811a = str;
        this.f2812b = str2;
        this.f2813c = j;
        this.f2814d = j2;
        this.f2815e = bArr;
    }
}

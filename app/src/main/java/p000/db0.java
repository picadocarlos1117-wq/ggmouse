package p000;

import android.sun.security.util.DerValue;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class db0 {

    /* JADX INFO: renamed from: a */
    public final int f2859a;

    /* JADX INFO: renamed from: b */
    public final int f2860b;

    /* JADX INFO: renamed from: c */
    public final int f2861c;

    /* JADX INFO: renamed from: d */
    public final int f2862d;

    /* JADX INFO: renamed from: e */
    public final int f2863e;

    /* JADX INFO: renamed from: f */
    public final int f2864f;

    /* JADX INFO: renamed from: g */
    public final int f2865g;

    /* JADX INFO: renamed from: h */
    public final int f2866h;

    /* JADX INFO: renamed from: i */
    public final int f2867i;

    /* JADX INFO: renamed from: j */
    public final long f2868j;

    /* JADX INFO: renamed from: k */
    public final C0558d8 f2869k;

    /* JADX INFO: renamed from: l */
    public final k51 f2870l;

    public db0(byte[] bArr, int i) {
        C0141cm c0141cm = new C0141cm(bArr, bArr.length);
        c0141cm.m1246q(i * 8);
        this.f2859a = c0141cm.m1238i(16);
        this.f2860b = c0141cm.m1238i(16);
        this.f2861c = c0141cm.m1238i(24);
        this.f2862d = c0141cm.m1238i(24);
        int iM1238i = c0141cm.m1238i(20);
        this.f2863e = iM1238i;
        this.f2864f = m2307d(iM1238i);
        this.f2865g = c0141cm.m1238i(3) + 1;
        int iM1238i2 = c0141cm.m1238i(5) + 1;
        this.f2866h = iM1238i2;
        this.f2867i = m2306a(iM1238i2);
        this.f2868j = c0141cm.m1240k(36);
        this.f2869k = null;
        this.f2870l = null;
    }

    /* JADX INFO: renamed from: a */
    public static int m2306a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    /* JADX INFO: renamed from: d */
    public static int m2307d(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m2308b() {
        long j = this.f2868j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.f2863e);
    }

    /* JADX INFO: renamed from: c */
    public final be0 m2309c(byte[] bArr, k51 k51Var) {
        bArr[4] = DerValue.TAG_CONTEXT;
        int i = this.f2862d;
        if (i <= 0) {
            i = -1;
        }
        k51 k51Var2 = this.f2870l;
        if (k51Var2 != null) {
            k51Var = k51Var2.m3803b(k51Var);
        }
        ae0 ae0Var = new ae0();
        ae0Var.f197m = v51.m6582l("audio/flac");
        ae0Var.f198n = i;
        ae0Var.f175B = this.f2865g;
        ae0Var.f176C = this.f2863e;
        ae0Var.f177D = z42.m7244r(this.f2866h);
        ae0Var.f200p = Collections.singletonList(bArr);
        ae0Var.f195k = k51Var;
        return new be0(ae0Var);
    }

    public db0(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, C0558d8 c0558d8, k51 k51Var) {
        this.f2859a = i;
        this.f2860b = i2;
        this.f2861c = i3;
        this.f2862d = i4;
        this.f2863e = i5;
        this.f2864f = m2307d(i5);
        this.f2865g = i6;
        this.f2866h = i7;
        this.f2867i = m2306a(i7);
        this.f2868j = j;
        this.f2869k = c0558d8;
        this.f2870l = k51Var;
    }
}

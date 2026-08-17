package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class th1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10883a;

    /* JADX INFO: renamed from: b */
    public final y02 f10884b;

    /* JADX INFO: renamed from: c */
    public final dc1 f10885c;

    /* JADX INFO: renamed from: d */
    public boolean f10886d;

    /* JADX INFO: renamed from: e */
    public boolean f10887e;

    /* JADX INFO: renamed from: f */
    public boolean f10888f;

    /* JADX INFO: renamed from: g */
    public long f10889g;

    /* JADX INFO: renamed from: h */
    public long f10890h;

    /* JADX INFO: renamed from: i */
    public long f10891i;

    public th1(int i) {
        this.f10883a = i;
        switch (i) {
            case 1:
                this.f10884b = new y02(0L);
                this.f10889g = -9223372036854775807L;
                this.f10890h = -9223372036854775807L;
                this.f10891i = -9223372036854775807L;
                this.f10885c = new dc1();
                break;
            default:
                this.f10884b = new y02(0L);
                this.f10889g = -9223372036854775807L;
                this.f10890h = -9223372036854775807L;
                this.f10891i = -9223372036854775807L;
                this.f10885c = new dc1();
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m6280b(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: c */
    public static long m6281c(dc1 dc1Var) {
        int i = dc1Var.f2883b;
        if (dc1Var.m2318a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        dc1Var.m2322e(0, 9, bArr);
        dc1Var.m2316F(i);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: a */
    public final void m6282a(y80 y80Var) {
        int i = this.f10883a;
        dc1 dc1Var = this.f10885c;
        switch (i) {
            case 0:
                byte[] bArr = z42.f13279f;
                dc1Var.getClass();
                dc1Var.m2314D(bArr.length, bArr);
                this.f10886d = true;
                y80Var.mo2422l();
                break;
            default:
                byte[] bArr2 = z42.f13279f;
                dc1Var.getClass();
                dc1Var.m2314D(bArr2.length, bArr2);
                this.f10886d = true;
                y80Var.mo2422l();
                break;
        }
    }
}

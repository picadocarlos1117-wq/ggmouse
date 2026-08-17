package p000;

import android.sun.security.util.DerValue;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aw0 implements r80, e31 {

    /* JADX INFO: renamed from: p */
    public static final long[] f1075p = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};

    /* JADX INFO: renamed from: a */
    public final EnumC0617ev f1076a;

    /* JADX INFO: renamed from: b */
    public final byte[] f1077b;

    /* JADX INFO: renamed from: c */
    public int f1078c;

    /* JADX INFO: renamed from: d */
    public long f1079d;

    /* JADX INFO: renamed from: e */
    public long f1080e;

    /* JADX INFO: renamed from: f */
    public long f1081f;

    /* JADX INFO: renamed from: g */
    public long f1082g;

    /* JADX INFO: renamed from: h */
    public long f1083h;

    /* JADX INFO: renamed from: i */
    public long f1084i;

    /* JADX INFO: renamed from: j */
    public long f1085j;

    /* JADX INFO: renamed from: k */
    public long f1086k;

    /* JADX INFO: renamed from: l */
    public long f1087l;

    /* JADX INFO: renamed from: m */
    public long f1088m;

    /* JADX INFO: renamed from: n */
    public final long[] f1089n;

    /* JADX INFO: renamed from: o */
    public int f1090o;

    public aw0() {
        this.f1077b = new byte[8];
        this.f1089n = new long[80];
        this.f1076a = EnumC0617ev.f3442a;
        this.f1078c = 0;
        mo733o();
    }

    /* JADX INFO: renamed from: h */
    public static long m724h(long j, long j2, long j3) {
        return ((~j) & j3) ^ (j2 & j);
    }

    /* JADX INFO: renamed from: i */
    public static long m725i(long j, long j2, long j3) {
        return ((j & j3) ^ (j & j2)) ^ (j2 & j3);
    }

    /* JADX INFO: renamed from: j */
    public static long m726j(long j) {
        return ((j >>> 39) | (j << 25)) ^ (((j << 36) | (j >>> 28)) ^ ((j << 30) | (j >>> 34)));
    }

    /* JADX INFO: renamed from: k */
    public static long m727k(long j) {
        return ((j >>> 41) | (j << 23)) ^ (((j << 50) | (j >>> 14)) ^ ((j << 46) | (j >>> 18)));
    }

    @Override // p000.j20
    /* JADX INFO: renamed from: c */
    public final void mo728c(byte b) {
        int i = this.f1078c;
        int i2 = i + 1;
        this.f1078c = i2;
        byte[] bArr = this.f1077b;
        bArr[i] = b;
        if (i2 == bArr.length) {
            this.f1089n[this.f1090o] = (((long) sc2.m6058b(4, bArr)) & 4294967295L) | ((((long) sc2.m6058b(0, bArr)) & 4294967295L) << 32);
            int i3 = this.f1090o + 1;
            this.f1090o = i3;
            if (i3 == 16) {
                m732n();
            }
            this.f1078c = 0;
        }
        this.f1079d++;
    }

    @Override // p000.j20
    /* JADX INFO: renamed from: e */
    public final void mo729e(int i, int i2, byte[] bArr) {
        while (this.f1078c != 0 && i2 > 0) {
            mo728c(bArr[i]);
            i++;
            i2--;
        }
        while (true) {
            byte[] bArr2 = this.f1077b;
            if (i2 < bArr2.length) {
                break;
            }
            this.f1089n[this.f1090o] = (((long) sc2.m6058b(i + 4, bArr)) & 4294967295L) | ((((long) sc2.m6058b(i, bArr)) & 4294967295L) << 32);
            int i3 = this.f1090o + 1;
            this.f1090o = i3;
            if (i3 == 16) {
                m732n();
            }
            i += bArr2.length;
            i2 -= bArr2.length;
            this.f1079d += (long) bArr2.length;
        }
        while (i2 > 0) {
            mo728c(bArr[i]);
            i++;
            i2--;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m730l(aw0 aw0Var) {
        byte[] bArr = aw0Var.f1077b;
        System.arraycopy(bArr, 0, this.f1077b, 0, bArr.length);
        this.f1078c = aw0Var.f1078c;
        this.f1079d = aw0Var.f1079d;
        this.f1080e = aw0Var.f1080e;
        this.f1081f = aw0Var.f1081f;
        this.f1082g = aw0Var.f1082g;
        this.f1083h = aw0Var.f1083h;
        this.f1084i = aw0Var.f1084i;
        this.f1085j = aw0Var.f1085j;
        this.f1086k = aw0Var.f1086k;
        this.f1087l = aw0Var.f1087l;
        this.f1088m = aw0Var.f1088m;
        long[] jArr = aw0Var.f1089n;
        System.arraycopy(jArr, 0, this.f1089n, 0, jArr.length);
        this.f1090o = aw0Var.f1090o;
    }

    /* JADX INFO: renamed from: m */
    public final void m731m() {
        long j = this.f1079d;
        if (j > 2305843009213693951L) {
            this.f1080e += j >>> 61;
            this.f1079d = j & 2305843009213693951L;
        }
        long j2 = this.f1079d << 3;
        long j3 = this.f1080e;
        byte b = DerValue.TAG_CONTEXT;
        while (true) {
            mo728c(b);
            if (this.f1078c == 0) {
                break;
            } else {
                b = 0;
            }
        }
        if (this.f1090o > 14) {
            m732n();
        }
        long[] jArr = this.f1089n;
        jArr[14] = j3;
        jArr[15] = j2;
        m732n();
    }

    /* JADX INFO: renamed from: n */
    public final void m732n() {
        long[] jArr;
        long j = this.f1079d;
        if (j > 2305843009213693951L) {
            this.f1080e += j >>> 61;
            this.f1079d = j & 2305843009213693951L;
        }
        int i = 16;
        while (true) {
            jArr = this.f1089n;
            if (i > 79) {
                break;
            }
            long j2 = jArr[i - 2];
            long j3 = ((j2 >>> 6) ^ (((j2 << 45) | (j2 >>> 19)) ^ ((j2 << 3) | (j2 >>> 61)))) + jArr[i - 7];
            long j4 = jArr[i - 15];
            jArr[i] = j3 + ((((j4 >>> 8) | (j4 << 56)) ^ ((j4 << 63) | (j4 >>> 1))) ^ (j4 >>> 7)) + jArr[i - 16];
            i++;
        }
        long j5 = this.f1081f;
        long j6 = this.f1082g;
        long j7 = this.f1083h;
        long j8 = this.f1084i;
        long j9 = this.f1085j;
        long j10 = this.f1086k;
        long j11 = this.f1087l;
        long j12 = j5;
        long j13 = j8;
        long j14 = j6;
        long j15 = j9;
        long j16 = j7;
        long j17 = j10;
        long j18 = this.f1088m;
        int i2 = 0;
        int i3 = 0;
        while (i2 < 10) {
            long jM727k = m727k(j15);
            long jM724h = m724h(j15, j17, j11);
            long j19 = j15;
            long j20 = j11;
            long j21 = j17;
            long[] jArr2 = f1075p;
            int i4 = i3 + 1;
            long j22 = jM727k + jM724h + jArr2[i3] + jArr[i3] + j18;
            long j23 = j13 + j22;
            long j24 = j14;
            long j25 = j16;
            long jM726j = m726j(j12) + m725i(j12, j24, j25) + j22;
            long jM727k2 = m727k(j23) + m724h(j23, j19, j21) + jArr2[i4];
            int i5 = i3 + 2;
            long j26 = jM727k2 + jArr[i4] + j20;
            long j27 = j25 + j26;
            long j28 = j12;
            long jM726j2 = m726j(jM726j) + m725i(jM726j, j28, j24) + j26;
            int i6 = i3 + 3;
            long jM727k3 = m727k(j27) + m724h(j27, j23, j19) + jArr2[i5] + jArr[i5] + j21;
            long j29 = j24 + jM727k3;
            long jM726j3 = m726j(jM726j2) + m725i(jM726j2, jM726j, j28) + jM727k3;
            int i7 = i3 + 4;
            long jM727k4 = m727k(j29) + m724h(j29, j27, j23) + jArr2[i6] + jArr[i6] + j19;
            long j30 = j28 + jM727k4;
            long jM726j4 = m726j(jM726j3) + m725i(jM726j3, jM726j2, jM726j) + jM727k4;
            int i8 = i3 + 5;
            long jM727k5 = m727k(j30) + m724h(j30, j29, j27) + jArr2[i7] + jArr[i7] + j23;
            long j31 = jM726j + jM727k5;
            long jM726j5 = m726j(jM726j4) + m725i(jM726j4, jM726j3, jM726j2) + jM727k5;
            int i9 = i3 + 6;
            long jM727k6 = m727k(j31) + m724h(j31, j30, j29) + jArr2[i8] + jArr[i8] + j27;
            long j32 = jM726j2 + jM727k6;
            long jM726j6 = m726j(jM726j5) + m725i(jM726j5, jM726j4, jM726j3) + jM727k6;
            int i10 = i3 + 7;
            long jM727k7 = m727k(j32) + m724h(j32, j31, j30) + jArr2[i9] + jArr[i9] + j29;
            long j33 = jM726j3 + jM727k7;
            long jM726j7 = m726j(jM726j6) + m725i(jM726j6, jM726j5, jM726j4) + jM727k7;
            i3 += 8;
            long jM727k8 = m727k(j33) + m724h(j33, j32, j31) + jArr2[i10] + jArr[i10] + j30;
            long j34 = jM726j4 + jM727k8;
            long jM726j8 = jM727k8 + m726j(jM726j7) + m725i(jM726j7, jM726j6, jM726j5);
            i2++;
            j17 = j33;
            j16 = jM726j6;
            j15 = j34;
            j18 = j31;
            j14 = jM726j7;
            j13 = jM726j5;
            j11 = j32;
            j12 = jM726j8;
        }
        this.f1081f += j12;
        this.f1082g += j14;
        this.f1083h += j16;
        this.f1084i += j13;
        this.f1085j += j15;
        this.f1086k += j17;
        this.f1087l += j11;
        this.f1088m += j18;
        this.f1090o = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            jArr[i11] = 0;
        }
    }

    /* JADX INFO: renamed from: o */
    public void mo733o() {
        this.f1079d = 0L;
        this.f1080e = 0L;
        int i = 0;
        this.f1078c = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f1077b;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = 0;
            i2++;
        }
        this.f1090o = 0;
        while (true) {
            long[] jArr = this.f1089n;
            if (i == jArr.length) {
                return;
            }
            jArr[i] = 0;
            i++;
        }
    }

    public aw0(aw0 aw0Var) {
        this.f1077b = new byte[8];
        this.f1089n = new long[80];
        this.f1076a = aw0Var.f1076a;
        m730l(aw0Var);
    }
}

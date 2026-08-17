package p000;

import android.sun.security.util.DerValue;
import android.util.Pair;
import android.util.SparseArray;
import com.example.ssmousepro.injection.InjectionMetrics;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.firebase.FirebaseError;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class f01 implements x80 {

    /* JADX INFO: renamed from: e0 */
    public static final byte[] f3512e0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: f0 */
    public static final byte[] f3513f0;

    /* JADX INFO: renamed from: g0 */
    public static final byte[] f3514g0;

    /* JADX INFO: renamed from: h0 */
    public static final byte[] f3515h0;

    /* JADX INFO: renamed from: i0 */
    public static final UUID f3516i0;

    /* JADX INFO: renamed from: j0 */
    public static final Map f3517j0;

    /* JADX INFO: renamed from: A */
    public boolean f3518A;

    /* JADX INFO: renamed from: B */
    public long f3519B;

    /* JADX INFO: renamed from: C */
    public long f3520C;

    /* JADX INFO: renamed from: D */
    public long f3521D;

    /* JADX INFO: renamed from: E */
    public C1296pi f3522E;

    /* JADX INFO: renamed from: F */
    public C1296pi f3523F;

    /* JADX INFO: renamed from: G */
    public boolean f3524G;

    /* JADX INFO: renamed from: H */
    public boolean f3525H;

    /* JADX INFO: renamed from: I */
    public int f3526I;

    /* JADX INFO: renamed from: J */
    public long f3527J;

    /* JADX INFO: renamed from: K */
    public long f3528K;

    /* JADX INFO: renamed from: L */
    public int f3529L;

    /* JADX INFO: renamed from: M */
    public int f3530M;

    /* JADX INFO: renamed from: N */
    public int[] f3531N;

    /* JADX INFO: renamed from: O */
    public int f3532O;

    /* JADX INFO: renamed from: P */
    public int f3533P;

    /* JADX INFO: renamed from: Q */
    public int f3534Q;

    /* JADX INFO: renamed from: R */
    public int f3535R;

    /* JADX INFO: renamed from: S */
    public boolean f3536S;

    /* JADX INFO: renamed from: T */
    public long f3537T;

    /* JADX INFO: renamed from: U */
    public int f3538U;

    /* JADX INFO: renamed from: V */
    public int f3539V;

    /* JADX INFO: renamed from: W */
    public int f3540W;

    /* JADX INFO: renamed from: X */
    public boolean f3541X;

    /* JADX INFO: renamed from: Y */
    public boolean f3542Y;

    /* JADX INFO: renamed from: Z */
    public boolean f3543Z;

    /* JADX INFO: renamed from: a */
    public final C0548cz f3544a;

    /* JADX INFO: renamed from: a0 */
    public int f3545a0;

    /* JADX INFO: renamed from: b */
    public final l91 f3546b;

    /* JADX INFO: renamed from: b0 */
    public byte f3547b0;

    /* JADX INFO: renamed from: c */
    public final SparseArray f3548c;

    /* JADX INFO: renamed from: c0 */
    public boolean f3549c0;

    /* JADX INFO: renamed from: d */
    public final boolean f3550d;

    /* JADX INFO: renamed from: d0 */
    public z80 f3551d0;

    /* JADX INFO: renamed from: e */
    public final boolean f3552e;

    /* JADX INFO: renamed from: f */
    public final wx1 f3553f;

    /* JADX INFO: renamed from: g */
    public final dc1 f3554g;

    /* JADX INFO: renamed from: h */
    public final dc1 f3555h;

    /* JADX INFO: renamed from: i */
    public final dc1 f3556i;

    /* JADX INFO: renamed from: j */
    public final dc1 f3557j;

    /* JADX INFO: renamed from: k */
    public final dc1 f3558k;

    /* JADX INFO: renamed from: l */
    public final dc1 f3559l;

    /* JADX INFO: renamed from: m */
    public final dc1 f3560m;

    /* JADX INFO: renamed from: n */
    public final dc1 f3561n;

    /* JADX INFO: renamed from: o */
    public final dc1 f3562o;

    /* JADX INFO: renamed from: p */
    public final dc1 f3563p;

    /* JADX INFO: renamed from: q */
    public ByteBuffer f3564q;

    /* JADX INFO: renamed from: r */
    public long f3565r;

    /* JADX INFO: renamed from: s */
    public long f3566s;

    /* JADX INFO: renamed from: t */
    public long f3567t;

    /* JADX INFO: renamed from: u */
    public long f3568u;

    /* JADX INFO: renamed from: v */
    public long f3569v;

    /* JADX INFO: renamed from: w */
    public e01 f3570w;

    /* JADX INFO: renamed from: x */
    public boolean f3571x;

    /* JADX INFO: renamed from: y */
    public int f3572y;

    /* JADX INFO: renamed from: z */
    public long f3573z;

    static {
        int i = z42.f13274a;
        f3513f0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f3514g0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f3515h0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f3516i0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        AbstractC1308pu.m5351r(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        AbstractC1308pu.m5351r(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f3517j0 = Collections.unmodifiableMap(map);
    }

    public f01(wx1 wx1Var, int i) {
        C0548cz c0548cz = new C0548cz();
        this.f3566s = -1L;
        this.f3567t = -9223372036854775807L;
        this.f3568u = -9223372036854775807L;
        this.f3569v = -9223372036854775807L;
        this.f3519B = -1L;
        this.f3520C = -1L;
        this.f3521D = -9223372036854775807L;
        this.f3544a = c0548cz;
        c0548cz.f2684d = new pn0(this);
        this.f3553f = wx1Var;
        this.f3550d = (i & 1) == 0;
        this.f3552e = (i & 2) == 0;
        this.f3546b = new l91(1);
        this.f3548c = new SparseArray();
        this.f3556i = new dc1(4);
        this.f3557j = new dc1(ByteBuffer.allocate(4).putInt(-1).array());
        this.f3558k = new dc1(4);
        this.f3554g = new dc1(o21.f7628c);
        this.f3555h = new dc1(4);
        this.f3559l = new dc1();
        this.f3560m = new dc1();
        this.f3561n = new dc1(8);
        this.f3562o = new dc1();
        this.f3563p = new dc1();
        this.f3531N = new int[1];
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m2663h(String str, long j, long j2) {
        ki0.m3857c(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2)));
        int i4 = z42.f13274a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: a */
    public final void m2664a(int i) {
        if (this.f3522E == null || this.f3523F == null) {
            throw fc1.m2799a(null, "Element " + i + " must be in a Cues");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:235:0x0393  */
    /* JADX WARN: Code duplicated, block: B:525:0x08fb  */
    /* JADX WARN: Code duplicated, block: B:530:0x0912  */
    /* JADX WARN: Code duplicated, block: B:531:0x0914  */
    /* JADX WARN: Code duplicated, block: B:534:0x0925  */
    /* JADX WARN: Code duplicated, block: B:535:0x0932  */
    /* JADX WARN: Code duplicated, block: B:537:0x0938  */
    /* JADX WARN: Code duplicated, block: B:539:0x093c  */
    /* JADX WARN: Code duplicated, block: B:541:0x0941  */
    /* JADX WARN: Code duplicated, block: B:544:0x0949  */
    /* JADX WARN: Code duplicated, block: B:546:0x094e  */
    /* JADX WARN: Code duplicated, block: B:549:0x0953  */
    /* JADX WARN: Code duplicated, block: B:552:0x0961  */
    /* JADX WARN: Code duplicated, block: B:555:0x0967  */
    /* JADX WARN: Code duplicated, block: B:557:0x096d  */
    /* JADX WARN: Code duplicated, block: B:577:0x0a23  */
    /* JADX WARN: Code duplicated, block: B:579:0x0a3f  */
    /* JADX WARN: Code duplicated, block: B:582:0x0a44  */
    /* JADX WARN: Code duplicated, block: B:585:0x0a59  */
    /* JADX WARN: Code duplicated, block: B:588:0x0a5f  */
    /* JADX WARN: Code duplicated, block: B:607:0x0aac  */
    /* JADX WARN: Code duplicated, block: B:609:0x0ac6  */
    /* JADX WARN: Code duplicated, block: B:611:0x0acc  */
    /* JADX WARN: Code duplicated, block: B:627:0x0af8  */
    /* JADX WARN: Code duplicated, block: B:835:0x0f4f  */
    /* JADX WARN: Code duplicated, block: B:839:0x0f66  */
    /* JADX WARN: Code duplicated, block: B:841:0x0f6e  */
    /* JADX WARN: Code duplicated, block: B:845:0x0f7b  */
    /* JADX WARN: Code duplicated, block: B:895:0x0f59 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:896:0x0f76 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:898:0x0f81 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:899:0x0f81 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x01dc  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v41, types: [e01, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46, types: [java.lang.RuntimeException] */
    @Override // p000.x80
    /* JADX INFO: renamed from: b */
    public final int mo124b(y80 y80Var, bb0 bb0Var) throws fc1 {
        y80 y80Var2;
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        String str;
        long j;
        int i2;
        char c;
        int iM4148d;
        f01 f01Var;
        long position;
        long j2;
        byte b;
        byte b2;
        f01 f01Var2;
        List listSingletonList;
        int i3;
        int i4;
        String str2;
        List list;
        RuntimeException runtimeException;
        Pair pair;
        List list2;
        String str3;
        f01 f01Var3;
        List list3;
        List list4;
        List list5;
        int i5;
        ae0 ae0Var;
        boolean zM6578h;
        int i6;
        int i7;
        int i8;
        float f;
        C1673zp c1673zp;
        String str4;
        int iIntValue;
        int i9;
        byte[] bArr;
        int i10;
        int i11;
        int i12;
        String str5;
        f01 f01Var4;
        C0101bj c0101bjM995b;
        List list6;
        kq1 c0825ke;
        int i13;
        long[] jArrCopyOf;
        f01 f01Var5 = this;
        f01Var5.f3525H = false;
        boolean z4 = true;
        while (true) {
            int i14 = -1;
            if (z4 && !f01Var5.f3525H) {
                C0548cz c0548cz = f01Var5.f3544a;
                l91 l91Var = c0548cz.f2683c;
                ArrayDeque arrayDeque = c0548cz.f2682b;
                ki0.m3866j(c0548cz.f2684d);
                while (true) {
                    C0116bz c0116bz = (C0116bz) arrayDeque.peek();
                    char c2 = 44651;
                    if (c0116bz == null || y80Var.getPosition() < c0116bz.f1575b) {
                        int i15 = 0;
                        if (c0548cz.f2685e == 0) {
                            y80Var2 = y80Var;
                            int i16 = 4;
                            long jM4151g = l91Var.m4151g(y80Var2, true, false, 4);
                            if (jM4151g == -2) {
                                byte[] bArr2 = c0548cz.f2681a;
                                y80Var2.mo2422l();
                                while (true) {
                                    y80Var2.mo2413a(i15, i16, bArr2);
                                    byte b3 = bArr2[i15];
                                    int i17 = 0;
                                    while (true) {
                                        long[] jArr = l91.f6276g;
                                        if (i17 >= 8) {
                                            i2 = -1;
                                        } else if ((jArr[i17] & ((long) b3)) != 0) {
                                            i2 = i17 + 1;
                                        } else {
                                            i17++;
                                        }
                                    }
                                    if (i2 == -1 || i2 > 4) {
                                        c = c2;
                                    } else {
                                        iM4148d = (int) l91.m4148d(i2, false, bArr2);
                                        Object obj = c0548cz.f2684d.f8968a;
                                        if (iM4148d != 357149030 && iM4148d != 524531317 && iM4148d != 475249515) {
                                            c = 44651;
                                            if (iM4148d == 374648427) {
                                            }
                                        }
                                    }
                                    y80Var2.mo2423m(1);
                                    c2 = c;
                                    i15 = 0;
                                    i16 = 4;
                                }
                                y80Var2.mo2423m(i2);
                                j = iM4148d;
                            } else {
                                j = jM4151g;
                            }
                            z = true;
                            if (j == -1) {
                                z4 = false;
                                z2 = false;
                            } else {
                                c0548cz.f2686f = (int) j;
                                c0548cz.f2685e = 1;
                            }
                            if (z4) {
                                position = y80Var2.getPosition();
                                f01Var = this;
                                if (f01Var.f3518A) {
                                    f01Var.f3520C = position;
                                    bb0Var.f1280a = f01Var.f3519B;
                                    f01Var.f3518A = z2;
                                    return 1;
                                }
                                if (f01Var.f3571x) {
                                    j2 = f01Var.f3520C;
                                    if (j2 != -1) {
                                        bb0Var.f1280a = j2;
                                        f01Var.f3520C = -1L;
                                        return 1;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                f01Var = this;
                            }
                            f01Var5 = f01Var;
                        } else {
                            y80Var2 = y80Var;
                            z = true;
                        }
                        if (c0548cz.f2685e == z) {
                            c0548cz.f2687g = l91Var.m4151g(y80Var2, false, z, 8);
                            c0548cz.f2685e = 2;
                        }
                        pn0 pn0Var = c0548cz.f2684d;
                        int i18 = c0548cz.f2686f;
                        Object obj2 = pn0Var.f8968a;
                        switch (i18) {
                            case 131:
                            case 136:
                            case 155:
                            case 159:
                            case 176:
                            case 179:
                            case 186:
                            case 215:
                            case 231:
                            case 238:
                            case 241:
                            case 251:
                            case 16871:
                            case 16980:
                            case 17029:
                            case 17143:
                            case 18401:
                            case 18408:
                            case 20529:
                            case 20530:
                            case 21420:
                            case 21432:
                            case 21680:
                            case 21682:
                            case 21690:
                            case 21930:
                            case 21938:
                            case 21945:
                            case 21946:
                            case 21947:
                            case 21948:
                            case 21949:
                            case 21998:
                            case 22186:
                            case 22203:
                            case 25188:
                            case 30114:
                            case 30321:
                            case 2352003:
                            case 2807729:
                                i = 2;
                                break;
                            case 134:
                            case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
                            case 21358:
                            case 2274716:
                                i = 3;
                                break;
                            case 160:
                            case 166:
                            case 174:
                            case 183:
                            case 187:
                            case 224:
                            case 225:
                            case 16868:
                            case 18407:
                            case 19899:
                            case 20532:
                            case 20533:
                            case 21936:
                            case 21968:
                            case 25152:
                            case 28032:
                            case 30113:
                            case 30320:
                            case 290298740:
                            case 357149030:
                            case 374648427:
                            case 408125543:
                            case 440786851:
                            case 475249515:
                            case 524531317:
                                i = 1;
                                break;
                            case 161:
                            case 163:
                            case 165:
                            case 16877:
                            case 16981:
                            case 18402:
                            case 21419:
                            case 25506:
                            case 30322:
                                i = 4;
                                break;
                            case 181:
                            case 17545:
                            case 21969:
                            case 21970:
                            case 21971:
                            case 21972:
                            case 21973:
                            case 21974:
                            case 21975:
                            case 21976:
                            case 21977:
                            case 21978:
                            case 30323:
                            case 30324:
                            case 30325:
                                i = 5;
                                break;
                            default:
                                i = 0;
                                break;
                        }
                        if (i != 0) {
                            if (i == 1) {
                                long position2 = y80Var2.getPosition();
                                arrayDeque.push(new C0116bz(c0548cz.f2686f, c0548cz.f2687g + position2));
                                pn0 pn0Var2 = c0548cz.f2684d;
                                int i19 = c0548cz.f2686f;
                                long j3 = c0548cz.f2687g;
                                f01 f01Var6 = (f01) pn0Var2.f8968a;
                                ki0.m3866j(f01Var6.f3551d0);
                                if (i19 != 160) {
                                    if (i19 == 174) {
                                        e01 e01Var = new e01();
                                        e01Var.f3137m = -1;
                                        e01Var.f3138n = -1;
                                        e01Var.f3139o = -1;
                                        e01Var.f3140p = -1;
                                        e01Var.f3141q = -1;
                                        e01Var.f3142r = 0;
                                        e01Var.f3143s = -1;
                                        e01Var.f3144t = TouchPipeline.SIZE;
                                        e01Var.f3145u = TouchPipeline.SIZE;
                                        e01Var.f3146v = TouchPipeline.SIZE;
                                        e01Var.f3147w = null;
                                        e01Var.f3148x = -1;
                                        e01Var.f3149y = false;
                                        e01Var.f3150z = -1;
                                        e01Var.f3099A = -1;
                                        e01Var.f3100B = -1;
                                        e01Var.f3101C = 1000;
                                        e01Var.f3102D = 200;
                                        e01Var.f3103E = -1.0f;
                                        e01Var.f3104F = -1.0f;
                                        e01Var.f3105G = -1.0f;
                                        e01Var.f3106H = -1.0f;
                                        e01Var.f3107I = -1.0f;
                                        e01Var.f3108J = -1.0f;
                                        e01Var.f3109K = -1.0f;
                                        e01Var.f3110L = -1.0f;
                                        e01Var.f3111M = -1.0f;
                                        e01Var.f3112N = -1.0f;
                                        e01Var.f3114P = 1;
                                        e01Var.f3115Q = -1;
                                        e01Var.f3116R = 8000;
                                        e01Var.f3117S = 0L;
                                        e01Var.f3118T = 0L;
                                        e01Var.f3121W = true;
                                        e01Var.f3122X = "eng";
                                        f01Var6.f3570w = e01Var;
                                    } else if (i19 == 187) {
                                        z2 = false;
                                        f01Var6.f3524G = false;
                                    } else if (i19 == 19899) {
                                        f01Var6.f3572y = -1;
                                        f01Var6.f3573z = -1L;
                                    } else if (i19 == 20533) {
                                        f01Var6.m2665c(i19);
                                        f01Var6.f3570w.f3132h = true;
                                    } else if (i19 == 21968) {
                                        f01Var6.m2665c(i19);
                                        f01Var6.f3570w.f3149y = true;
                                    } else if (i19 == 408125543) {
                                        long j4 = f01Var6.f3566s;
                                        if (j4 != -1 && j4 != position2) {
                                            throw fc1.m2799a(null, "Multiple Segment elements not supported");
                                        }
                                        f01Var6.f3566s = position2;
                                        f01Var6.f3565r = j3;
                                    } else if (i19 == 475249515) {
                                        f01Var6.f3522E = new C1296pi(2, false);
                                        f01Var6.f3523F = new C1296pi(2, false);
                                    } else if (i19 == 524531317 && !f01Var6.f3571x) {
                                        if (!f01Var6.f3550d || f01Var6.f3519B == -1) {
                                            f01Var6.f3551d0.mo752q(new C0825ke(f01Var6.f3569v));
                                            f01Var6.f3571x = true;
                                        } else {
                                            f01Var6.f3518A = true;
                                        }
                                    }
                                    z2 = false;
                                } else {
                                    z2 = false;
                                    f01Var6.f3536S = false;
                                    f01Var6.f3537T = 0L;
                                }
                                c0548cz.f2685e = z2 ? 1 : 0;
                            } else if (i == 2) {
                                long j5 = c0548cz.f2687g;
                                if (j5 > 8) {
                                    throw fc1.m2799a(null, "Invalid integer size: " + c0548cz.f2687g);
                                }
                                pn0Var.m5288j(i18, c0548cz.m2147a(y80Var2, (int) j5));
                                z3 = false;
                                c0548cz.f2685e = 0;
                            } else if (i == 3) {
                                long j6 = c0548cz.f2687g;
                                if (j6 > 2147483647L) {
                                    throw fc1.m2799a(null, "String element size: " + c0548cz.f2687g);
                                }
                                int i20 = (int) j6;
                                if (i20 == 0) {
                                    str = "";
                                } else {
                                    byte[] bArr3 = new byte[i20];
                                    y80Var2.readFully(bArr3, 0, i20);
                                    while (i20 > 0 && bArr3[i20 - 1] == 0) {
                                        i20--;
                                    }
                                    str = new String(bArr3, 0, i20);
                                }
                                f01 f01Var7 = (f01) pn0Var.f8968a;
                                if (i18 == 134) {
                                    f01Var7.m2665c(i18);
                                    f01Var7.f3570w.f3126b = str;
                                } else if (i18 != 17026) {
                                    if (i18 == 21358) {
                                        f01Var7.m2665c(i18);
                                        f01Var7.f3570w.f3125a = str;
                                    } else if (i18 == 2274716) {
                                        f01Var7.m2665c(i18);
                                        f01Var7.f3570w.f3122X = str;
                                    }
                                } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                                    throw fc1.m2799a(null, "DocType " + str + " not supported");
                                }
                                z3 = false;
                                c0548cz.f2685e = 0;
                            } else if (i == 4) {
                                pn0Var.m5284c(i18, (int) c0548cz.f2687g, y80Var2);
                                z2 = false;
                                c0548cz.f2685e = 0;
                            } else {
                                if (i != 5) {
                                    throw fc1.m2799a(null, "Invalid element type " + i);
                                }
                                long j7 = c0548cz.f2687g;
                                if (j7 != 4 && j7 != 8) {
                                    throw fc1.m2799a(null, "Invalid float size: " + c0548cz.f2687g);
                                }
                                int i21 = (int) j7;
                                long jM2147a = c0548cz.m2147a(y80Var2, i21);
                                double dIntBitsToFloat = i21 == 4 ? Float.intBitsToFloat((int) jM2147a) : Double.longBitsToDouble(jM2147a);
                                f01 f01Var8 = (f01) pn0Var.f8968a;
                                if (i18 == 181) {
                                    f01Var8.m2665c(i18);
                                    f01Var8.f3570w.f3116R = (int) dIntBitsToFloat;
                                } else if (i18 != 17545) {
                                    switch (i18) {
                                        case 21969:
                                            f01Var8.m2665c(i18);
                                            f01Var8.f3570w.f3103E = (float) dIntBitsToFloat;
                                            break;
                                        case 21970:
                                            f01Var8.m2665c(i18);
                                            f01Var8.f3570w.f3104F = (float) dIntBitsToFloat;
                                            break;
                                        case 21971:
                                            f01Var8.m2665c(i18);
                                            f01Var8.f3570w.f3105G = (float) dIntBitsToFloat;
                                            break;
                                        case 21972:
                                            f01Var8.m2665c(i18);
                                            f01Var8.f3570w.f3106H = (float) dIntBitsToFloat;
                                            break;
                                        case 21973:
                                            f01Var8.m2665c(i18);
                                            f01Var8.f3570w.f3107I = (float) dIntBitsToFloat;
                                            break;
                                        case 21974:
                                            f01Var8.m2665c(i18);
                                            f01Var8.f3570w.f3108J = (float) dIntBitsToFloat;
                                            break;
                                        case 21975:
                                            f01Var8.m2665c(i18);
                                            f01Var8.f3570w.f3109K = (float) dIntBitsToFloat;
                                            break;
                                        case 21976:
                                            f01Var8.m2665c(i18);
                                            f01Var8.f3570w.f3110L = (float) dIntBitsToFloat;
                                            break;
                                        case 21977:
                                            f01Var8.m2665c(i18);
                                            f01Var8.f3570w.f3111M = (float) dIntBitsToFloat;
                                            break;
                                        case 21978:
                                            f01Var8.m2665c(i18);
                                            f01Var8.f3570w.f3112N = (float) dIntBitsToFloat;
                                            break;
                                        default:
                                            switch (i18) {
                                                case 30323:
                                                    f01Var8.m2665c(i18);
                                                    f01Var8.f3570w.f3144t = (float) dIntBitsToFloat;
                                                    break;
                                                case 30324:
                                                    f01Var8.m2665c(i18);
                                                    f01Var8.f3570w.f3145u = (float) dIntBitsToFloat;
                                                    break;
                                                case 30325:
                                                    f01Var8.m2665c(i18);
                                                    f01Var8.f3570w.f3146v = (float) dIntBitsToFloat;
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    f01Var8.f3568u = (long) dIntBitsToFloat;
                                }
                                z3 = false;
                                c0548cz.f2685e = 0;
                            }
                            z4 = true;
                            if (z4) {
                                position = y80Var2.getPosition();
                                f01Var = this;
                                if (f01Var.f3518A) {
                                    f01Var.f3520C = position;
                                    bb0Var.f1280a = f01Var.f3519B;
                                    f01Var.f3518A = z2;
                                    return 1;
                                }
                                if (f01Var.f3571x) {
                                    j2 = f01Var.f3520C;
                                    if (j2 != -1) {
                                        bb0Var.f1280a = j2;
                                        f01Var.f3520C = -1L;
                                        return 1;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                f01Var = this;
                            }
                            f01Var5 = f01Var;
                        } else {
                            y80Var2.mo2423m((int) c0548cz.f2687g);
                            c0548cz.f2685e = 0;
                            i14 = -1;
                        }
                    } else {
                        pn0 pn0Var3 = c0548cz.f2684d;
                        int i22 = ((C0116bz) arrayDeque.pop()).f1574a;
                        f01 f01Var9 = (f01) pn0Var3.f8968a;
                        SparseArray sparseArray = f01Var9.f3548c;
                        ki0.m3866j(f01Var9.f3551d0);
                        if (i22 == 160) {
                            if (f01Var9.f3526I == 2) {
                                e01 e01Var2 = (e01) sparseArray.get(f01Var9.f3532O);
                                e01Var2.f3123Y.getClass();
                                if (f01Var9.f3537T > 0 && "A_OPUS".equals(e01Var2.f3126b)) {
                                    dc1 dc1Var = f01Var9.f3563p;
                                    byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(f01Var9.f3537T).array();
                                    dc1Var.getClass();
                                    dc1Var.m2314D(bArrArray.length, bArrArray);
                                }
                                int i23 = 0;
                                for (int i24 = 0; i24 < f01Var9.f3530M; i24++) {
                                    i23 += f01Var9.f3531N[i24];
                                }
                                int i25 = 0;
                                while (i25 < f01Var9.f3530M) {
                                    long j8 = f01Var9.f3527J + ((long) ((e01Var2.f3129e * i25) / 1000));
                                    int i26 = f01Var9.f3534Q;
                                    if (i25 == 0 && !f01Var9.f3536S) {
                                        i26 |= 1;
                                    }
                                    int i27 = f01Var9.f3531N[i25];
                                    int i28 = i23 - i27;
                                    f01Var9.m2666d(e01Var2, j8, i26, i27, i28);
                                    i25++;
                                    i23 = i28;
                                }
                                z3 = false;
                                f01Var9.f3526I = 0;
                            }
                            y80Var2 = y80Var;
                        } else if (i22 == 174) {
                            Object r3 = f01Var9.f3570w;
                            ki0.m3866j(r3);
                            String str6 = r3.f3126b;
                            if (str6 == null) {
                                throw fc1.m2799a(null, "CodecId is missing in TrackEntry element");
                            }
                            switch (str6.hashCode()) {
                                case -2095576542:
                                    if (str6.equals("V_MPEG4/ISO/AP")) {
                                        b = 0;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -2095575984:
                                    if (str6.equals("V_MPEG4/ISO/SP")) {
                                        b = 1;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -1985379776:
                                    if (str6.equals("A_MS/ACM")) {
                                        b = 2;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -1784763192:
                                    if (str6.equals("A_TRUEHD")) {
                                        b = 3;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -1730367663:
                                    if (str6.equals("A_VORBIS")) {
                                        b = 4;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -1482641358:
                                    if (str6.equals("A_MPEG/L2")) {
                                        b = 5;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -1482641357:
                                    if (str6.equals("A_MPEG/L3")) {
                                        b = 6;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -1373388978:
                                    if (str6.equals("V_MS/VFW/FOURCC")) {
                                        b = 7;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -933872740:
                                    if (str6.equals("S_DVBSUB")) {
                                        b = 8;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -538363189:
                                    if (str6.equals("V_MPEG4/ISO/ASP")) {
                                        b = 9;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -538363109:
                                    if (str6.equals("V_MPEG4/ISO/AVC")) {
                                        b = 10;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -425012669:
                                    if (str6.equals("S_VOBSUB")) {
                                        b = 11;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -356037306:
                                    if (str6.equals("A_DTS/LOSSLESS")) {
                                        b = DerValue.tag_UTF8String;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 62923557:
                                    if (str6.equals("A_AAC")) {
                                        b = 13;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 62923603:
                                    if (str6.equals("A_AC3")) {
                                        b = 14;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 62927045:
                                    if (str6.equals("A_DTS")) {
                                        b = 15;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 82318131:
                                    if (str6.equals("V_AV1")) {
                                        b = 16;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 82338133:
                                    if (str6.equals("V_VP8")) {
                                        b = 17;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 82338134:
                                    if (str6.equals("V_VP9")) {
                                        b = 18;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 99146302:
                                    if (str6.equals("S_HDMV/PGS")) {
                                        b = DerValue.tag_PrintableString;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 444813526:
                                    if (str6.equals("V_THEORA")) {
                                        b = 20;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 542569478:
                                    if (str6.equals("A_DTS/EXPRESS")) {
                                        b = 21;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 635596514:
                                    if (str6.equals("A_PCM/FLOAT/IEEE")) {
                                        b = DerValue.tag_IA5String;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 725948237:
                                    if (str6.equals("A_PCM/INT/BIG")) {
                                        b = DerValue.tag_UtcTime;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 725957860:
                                    if (str6.equals("A_PCM/INT/LIT")) {
                                        b = DerValue.tag_GeneralizedTime;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 738597099:
                                    if (str6.equals("S_TEXT/ASS")) {
                                        b = 25;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 855502857:
                                    if (str6.equals("V_MPEGH/ISO/HEVC")) {
                                        b = 26;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 1045209816:
                                    if (str6.equals("S_TEXT/WEBVTT")) {
                                        b = DerValue.tag_GeneralString;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 1422270023:
                                    if (str6.equals("S_TEXT/UTF8")) {
                                        b = DerValue.tag_UniversalString;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 1809237540:
                                    if (str6.equals("V_MPEG2")) {
                                        b = 29;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 1950749482:
                                    if (str6.equals("A_EAC3")) {
                                        b = DerValue.tag_BMPString;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 1950789798:
                                    if (str6.equals("A_FLAC")) {
                                        b = 31;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 1951062397:
                                    if (str6.equals("A_OPUS")) {
                                        b = 32;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                default:
                                    b = -1;
                                    break;
                            }
                            switch (b) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                case InjectionMetrics.I_MAX_ACTIVE_REJ /* 26 */:
                                case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                                case InjectionMetrics.I_AIM_LOOP_TICKS /* 28 */:
                                case 29:
                                case 30:
                                case InjectionMetrics.I_APPLY_DELTA /* 31 */:
                                case 32:
                                    z80 z80Var = f01Var9.f3551d0;
                                    int i29 = r3.f3127c;
                                    switch (str6) {
                                        case "V_MPEG4/ISO/AP":
                                            b2 = 0;
                                            break;
                                        case "V_MPEG4/ISO/SP":
                                            b2 = 1;
                                            break;
                                        case "A_MS/ACM":
                                            b2 = 2;
                                            break;
                                        case "A_TRUEHD":
                                            b2 = 3;
                                            break;
                                        case "A_VORBIS":
                                            b2 = 4;
                                            break;
                                        case "A_MPEG/L2":
                                            b2 = 5;
                                            break;
                                        case "A_MPEG/L3":
                                            b2 = 6;
                                            break;
                                        case "V_MS/VFW/FOURCC":
                                            b2 = 7;
                                            break;
                                        case "S_DVBSUB":
                                            b2 = 8;
                                            break;
                                        case "V_MPEG4/ISO/ASP":
                                            b2 = 9;
                                            break;
                                        case "V_MPEG4/ISO/AVC":
                                            b2 = 10;
                                            break;
                                        case "S_VOBSUB":
                                            b2 = 11;
                                            break;
                                        case "A_DTS/LOSSLESS":
                                            b2 = DerValue.tag_UTF8String;
                                            break;
                                        case "A_AAC":
                                            b2 = 13;
                                            break;
                                        case "A_AC3":
                                            b2 = 14;
                                            break;
                                        case "A_DTS":
                                            b2 = 15;
                                            break;
                                        case "V_AV1":
                                            b2 = 16;
                                            break;
                                        case "V_VP8":
                                            b2 = 17;
                                            break;
                                        case "V_VP9":
                                            b2 = 18;
                                            break;
                                        case "S_HDMV/PGS":
                                            b2 = DerValue.tag_PrintableString;
                                            break;
                                        case "V_THEORA":
                                            b2 = 20;
                                            break;
                                        case "A_DTS/EXPRESS":
                                            b2 = 21;
                                            break;
                                        case "A_PCM/FLOAT/IEEE":
                                            b2 = DerValue.tag_IA5String;
                                            break;
                                        case "A_PCM/INT/BIG":
                                            b2 = DerValue.tag_UtcTime;
                                            break;
                                        case "A_PCM/INT/LIT":
                                            b2 = DerValue.tag_GeneralizedTime;
                                            break;
                                        case "S_TEXT/ASS":
                                            b2 = 25;
                                            break;
                                        case "V_MPEGH/ISO/HEVC":
                                            b2 = 26;
                                            break;
                                        case "S_TEXT/WEBVTT":
                                            b2 = DerValue.tag_GeneralString;
                                            break;
                                        case "S_TEXT/UTF8":
                                            b2 = DerValue.tag_UniversalString;
                                            break;
                                        case "V_MPEG2":
                                            b2 = 29;
                                            break;
                                        case "A_EAC3":
                                            b2 = DerValue.tag_BMPString;
                                            break;
                                        case "A_FLAC":
                                            b2 = 31;
                                            break;
                                        case "A_OPUS":
                                            b2 = 32;
                                            break;
                                        default:
                                            b2 = -1;
                                            break;
                                    }
                                    String str7 = "video/x-unknown";
                                    switch (b2) {
                                        case 0:
                                        case 1:
                                        case 9:
                                            f01Var2 = f01Var9;
                                            byte[] bArr4 = r3.f3135k;
                                            str7 = "video/mp4v-es";
                                            listSingletonList = bArr4 == null ? null : Collections.singletonList(bArr4);
                                            i3 = -1;
                                            list4 = listSingletonList;
                                            i4 = -1;
                                            list = list4;
                                            str2 = null;
                                            list5 = list;
                                            if (r3.f3113O != null && (c0101bjM995b = C0101bj.m995b(new dc1(r3.f3113O))) != null) {
                                                str2 = c0101bjM995b.f1383b;
                                                str7 = "video/dolby-vision";
                                            }
                                            boolean z5 = r3.f3121W;
                                            if (r3.f3120V) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i30 = (z5 ? 1 : 0) | i5;
                                            ae0Var = new ae0();
                                            zM6578h = v51.m6578h(str7);
                                            z80 z80Var2 = z80Var;
                                            Map map = f3517j0;
                                            if (zM6578h) {
                                                ae0Var.f175B = r3.f3114P;
                                                ae0Var.f176C = r3.f3116R;
                                                ae0Var.f177D = i3;
                                                i6 = 1;
                                            } else if (v51.m6581k(str7)) {
                                                if (r3.f3142r == 0) {
                                                    i11 = r3.f3140p;
                                                    i7 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r3.f3137m;
                                                    }
                                                    r3.f3140p = i11;
                                                    i12 = r3.f3141q;
                                                    if (i12 == -1) {
                                                        i12 = r3.f3138n;
                                                    }
                                                    r3.f3141q = i12;
                                                } else {
                                                    i7 = -1;
                                                }
                                                i8 = r3.f3140p;
                                                if (i8 != i7 || (i10 = r3.f3141q) == i7) {
                                                    f = -1.0f;
                                                } else {
                                                    f = (r3.f3138n * i8) / (r3.f3137m * i10);
                                                }
                                                if (r3.f3149y) {
                                                    if (r3.f3103E != -1.0f || r3.f3104F == -1.0f || r3.f3105G == -1.0f || r3.f3106H == -1.0f || r3.f3107I == -1.0f || r3.f3108J == -1.0f || r3.f3109K == -1.0f || r3.f3110L == -1.0f || r3.f3111M == -1.0f || r3.f3112N == -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        byte[] bArr5 = new byte[25];
                                                        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr5).order(ByteOrder.LITTLE_ENDIAN);
                                                        byteBufferOrder.put((byte) 0);
                                                        byteBufferOrder.putShort((short) ((r3.f3103E * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r3.f3104F * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r3.f3105G * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r3.f3106H * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r3.f3107I * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r3.f3108J * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r3.f3109K * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r3.f3110L * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) (r3.f3111M + 0.5f));
                                                        byteBufferOrder.putShort((short) (r3.f3112N + 0.5f));
                                                        byteBufferOrder.putShort((short) r3.f3101C);
                                                        byteBufferOrder.putShort((short) r3.f3102D);
                                                        bArr = bArr5;
                                                    }
                                                    int i31 = r3.f3150z;
                                                    int i32 = r3.f3100B;
                                                    int i33 = r3.f3099A;
                                                    int i34 = r3.f3139o;
                                                    c1673zp = new C1673zp(i31, i32, i33, bArr, i34, i34);
                                                } else {
                                                    c1673zp = null;
                                                }
                                                str4 = r3.f3125a;
                                                if (str4 == null && map.containsKey(str4)) {
                                                    iIntValue = ((Integer) map.get(r3.f3125a)).intValue();
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r3.f3143s == 0 || Float.compare(r3.f3144t, TouchPipeline.SIZE) != 0 || Float.compare(r3.f3145u, TouchPipeline.SIZE) != 0) {
                                                    i9 = iIntValue;
                                                } else if (Float.compare(r3.f3146v, TouchPipeline.SIZE) == 0) {
                                                    i9 = 0;
                                                } else if (Float.compare(r3.f3146v, 90.0f) == 0) {
                                                    i9 = 90;
                                                } else if (Float.compare(r3.f3146v, -180.0f) == 0 || Float.compare(r3.f3146v, 180.0f) == 0) {
                                                    i9 = 180;
                                                } else if (Float.compare(r3.f3146v, -90.0f) == 0) {
                                                    i9 = 270;
                                                } else {
                                                    i9 = iIntValue;
                                                }
                                                ae0Var.f204t = r3.f3137m;
                                                ae0Var.f205u = r3.f3138n;
                                                ae0Var.f208x = f;
                                                ae0Var.f207w = i9;
                                                ae0Var.f209y = r3.f3147w;
                                                ae0Var.f210z = r3.f3148x;
                                                ae0Var.f174A = c1673zp;
                                                i6 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str7) && !"text/x-ssa".equals(str7) && !"text/vtt".equals(str7) && !"application/vobsub".equals(str7) && !"application/pgs".equals(str7) && !"application/dvbsubs".equals(str7)) {
                                                    throw fc1.m2799a(null, "Unexpected MIME type.");
                                                }
                                                i6 = 3;
                                            }
                                            str5 = r3.f3125a;
                                            if (str5 != null && !map.containsKey(str5)) {
                                                ae0Var.f186b = r3.f3125a;
                                            }
                                            ae0Var.f185a = Integer.toString(i29);
                                            ae0Var.f197m = v51.m6582l(str7);
                                            ae0Var.f198n = i4;
                                            ae0Var.f188d = r3.f3122X;
                                            ae0Var.f189e = i30;
                                            ae0Var.f200p = list5;
                                            ae0Var.f194j = str2;
                                            ae0Var.f201q = r3.f3136l;
                                            be0 be0Var = new be0(ae0Var);
                                            c22 c22VarMo750n = z80Var2.mo750n(r3.f3127c, i6);
                                            r3.f3123Y = c22VarMo750n;
                                            c22VarMo750n.mo1117d(be0Var);
                                            sparseArray.put(r3.f3127c, r3);
                                            f01Var4 = f01Var2;
                                            break;
                                        case 2:
                                            z80Var = z80Var;
                                            f01Var2 = f01Var9;
                                            dc1 dc1Var2 = new dc1(r3.m2442a(r3.f3126b));
                                            try {
                                                int iM2330m = dc1Var2.m2330m();
                                                if (iM2330m != 1) {
                                                    if (iM2330m == 65534) {
                                                        dc1Var2.m2316F(24);
                                                        long jM2331n = dc1Var2.m2331n();
                                                        UUID uuid = f3516i0;
                                                        if (jM2331n != uuid.getMostSignificantBits() || dc1Var2.m2331n() != uuid.getLeastSignificantBits()) {
                                                        }
                                                        str7 = "audio/x-unknown";
                                                        i3 = -1;
                                                        list4 = null;
                                                        i4 = -1;
                                                        list = list4;
                                                        str2 = null;
                                                        list5 = list;
                                                        if (r3.f3113O != null) {
                                                            str2 = c0101bjM995b.f1383b;
                                                            str7 = "video/dolby-vision";
                                                        }
                                                        boolean z6 = r3.f3121W;
                                                        if (r3.f3120V) {
                                                            i5 = 2;
                                                        } else {
                                                            i5 = 0;
                                                        }
                                                        int i35 = (z6 ? 1 : 0) | i5;
                                                        ae0Var = new ae0();
                                                        zM6578h = v51.m6578h(str7);
                                                        z80 z80Var3 = z80Var;
                                                        Map map2 = f3517j0;
                                                        if (zM6578h) {
                                                            ae0Var.f175B = r3.f3114P;
                                                            ae0Var.f176C = r3.f3116R;
                                                            ae0Var.f177D = i3;
                                                            i6 = 1;
                                                        } else if (v51.m6581k(str7)) {
                                                            if (r3.f3142r == 0) {
                                                                i11 = r3.f3140p;
                                                                i7 = -1;
                                                                if (i11 == -1) {
                                                                    i11 = r3.f3137m;
                                                                }
                                                                r3.f3140p = i11;
                                                                i12 = r3.f3141q;
                                                                if (i12 == -1) {
                                                                    i12 = r3.f3138n;
                                                                }
                                                                r3.f3141q = i12;
                                                            } else {
                                                                i7 = -1;
                                                            }
                                                            i8 = r3.f3140p;
                                                            if (i8 != i7) {
                                                                f = -1.0f;
                                                            } else {
                                                                f = -1.0f;
                                                            }
                                                            if (r3.f3149y) {
                                                                if (r3.f3103E != -1.0f) {
                                                                    bArr = null;
                                                                } else {
                                                                    bArr = null;
                                                                }
                                                                int i36 = r3.f3150z;
                                                                int i37 = r3.f3100B;
                                                                int i38 = r3.f3099A;
                                                                int i39 = r3.f3139o;
                                                                c1673zp = new C1673zp(i36, i37, i38, bArr, i39, i39);
                                                            } else {
                                                                c1673zp = null;
                                                            }
                                                            str4 = r3.f3125a;
                                                            if (str4 == null) {
                                                                iIntValue = -1;
                                                            } else {
                                                                iIntValue = -1;
                                                            }
                                                            if (r3.f3143s == 0) {
                                                                i9 = iIntValue;
                                                            } else {
                                                                i9 = iIntValue;
                                                            }
                                                            ae0Var.f204t = r3.f3137m;
                                                            ae0Var.f205u = r3.f3138n;
                                                            ae0Var.f208x = f;
                                                            ae0Var.f207w = i9;
                                                            ae0Var.f209y = r3.f3147w;
                                                            ae0Var.f210z = r3.f3148x;
                                                            ae0Var.f174A = c1673zp;
                                                            i6 = 2;
                                                        } else {
                                                            if ("application/x-subrip".equals(str7)) {
                                                            }
                                                            i6 = 3;
                                                        }
                                                        str5 = r3.f3125a;
                                                        if (str5 != null) {
                                                            ae0Var.f186b = r3.f3125a;
                                                        }
                                                        ae0Var.f185a = Integer.toString(i29);
                                                        ae0Var.f197m = v51.m6582l(str7);
                                                        ae0Var.f198n = i4;
                                                        ae0Var.f188d = r3.f3122X;
                                                        ae0Var.f189e = i35;
                                                        ae0Var.f200p = list5;
                                                        ae0Var.f194j = str2;
                                                        ae0Var.f201q = r3.f3136l;
                                                        be0 be0Var2 = new be0(ae0Var);
                                                        c22 c22VarMo750n2 = z80Var3.mo750n(r3.f3127c, i6);
                                                        r3.f3123Y = c22VarMo750n2;
                                                        c22VarMo750n2.mo1117d(be0Var2);
                                                        sparseArray.put(r3.f3127c, r3);
                                                        f01Var4 = f01Var2;
                                                    }
                                                    AbstractC1337qm.m5542i0("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                    str7 = "audio/x-unknown";
                                                    i3 = -1;
                                                    list4 = null;
                                                    i4 = -1;
                                                    list = list4;
                                                    str2 = null;
                                                    list5 = list;
                                                    if (r3.f3113O != null) {
                                                        str2 = c0101bjM995b.f1383b;
                                                        str7 = "video/dolby-vision";
                                                    }
                                                    boolean z7 = r3.f3121W;
                                                    if (r3.f3120V) {
                                                        i5 = 2;
                                                    } else {
                                                        i5 = 0;
                                                    }
                                                    int i310 = (z7 ? 1 : 0) | i5;
                                                    ae0Var = new ae0();
                                                    zM6578h = v51.m6578h(str7);
                                                    z80 z80Var4 = z80Var;
                                                    Map map3 = f3517j0;
                                                    if (zM6578h) {
                                                        ae0Var.f175B = r3.f3114P;
                                                        ae0Var.f176C = r3.f3116R;
                                                        ae0Var.f177D = i3;
                                                        i6 = 1;
                                                    } else if (v51.m6581k(str7)) {
                                                        if (r3.f3142r == 0) {
                                                            i11 = r3.f3140p;
                                                            i7 = -1;
                                                            if (i11 == -1) {
                                                                i11 = r3.f3137m;
                                                            }
                                                            r3.f3140p = i11;
                                                            i12 = r3.f3141q;
                                                            if (i12 == -1) {
                                                                i12 = r3.f3138n;
                                                            }
                                                            r3.f3141q = i12;
                                                        } else {
                                                            i7 = -1;
                                                        }
                                                        i8 = r3.f3140p;
                                                        if (i8 != i7) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (r3.f3149y) {
                                                            if (r3.f3103E != -1.0f) {
                                                                bArr = null;
                                                            } else {
                                                                bArr = null;
                                                            }
                                                            int i311 = r3.f3150z;
                                                            int i312 = r3.f3100B;
                                                            int i313 = r3.f3099A;
                                                            int i314 = r3.f3139o;
                                                            c1673zp = new C1673zp(i311, i312, i313, bArr, i314, i314);
                                                        } else {
                                                            c1673zp = null;
                                                        }
                                                        str4 = r3.f3125a;
                                                        if (str4 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (r3.f3143s == 0) {
                                                            i9 = iIntValue;
                                                        } else {
                                                            i9 = iIntValue;
                                                        }
                                                        ae0Var.f204t = r3.f3137m;
                                                        ae0Var.f205u = r3.f3138n;
                                                        ae0Var.f208x = f;
                                                        ae0Var.f207w = i9;
                                                        ae0Var.f209y = r3.f3147w;
                                                        ae0Var.f210z = r3.f3148x;
                                                        ae0Var.f174A = c1673zp;
                                                        i6 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str7)) {
                                                        }
                                                        i6 = 3;
                                                    }
                                                    str5 = r3.f3125a;
                                                    if (str5 != null) {
                                                        ae0Var.f186b = r3.f3125a;
                                                    }
                                                    ae0Var.f185a = Integer.toString(i29);
                                                    ae0Var.f197m = v51.m6582l(str7);
                                                    ae0Var.f198n = i4;
                                                    ae0Var.f188d = r3.f3122X;
                                                    ae0Var.f189e = i310;
                                                    ae0Var.f200p = list5;
                                                    ae0Var.f194j = str2;
                                                    ae0Var.f201q = r3.f3136l;
                                                    be0 be0Var3 = new be0(ae0Var);
                                                    c22 c22VarMo750n3 = z80Var4.mo750n(r3.f3127c, i6);
                                                    r3.f3123Y = c22VarMo750n3;
                                                    c22VarMo750n3.mo1117d(be0Var3);
                                                    sparseArray.put(r3.f3127c, r3);
                                                    f01Var4 = f01Var2;
                                                    break;
                                                }
                                                int iM7244r = z42.m7244r(r3.f3115Q);
                                                if (iM7244r == 0) {
                                                    AbstractC1337qm.m5542i0("MatroskaExtractor", "Unsupported PCM bit depth: " + r3.f3115Q + ". Setting mimeType to audio/x-unknown");
                                                    str7 = "audio/x-unknown";
                                                    i3 = -1;
                                                    list4 = null;
                                                    i4 = -1;
                                                    list = list4;
                                                    str2 = null;
                                                    list5 = list;
                                                    if (r3.f3113O != null) {
                                                        str2 = c0101bjM995b.f1383b;
                                                        str7 = "video/dolby-vision";
                                                    }
                                                    boolean z8 = r3.f3121W;
                                                    if (r3.f3120V) {
                                                        i5 = 2;
                                                    } else {
                                                        i5 = 0;
                                                    }
                                                    int i315 = (z8 ? 1 : 0) | i5;
                                                    ae0Var = new ae0();
                                                    zM6578h = v51.m6578h(str7);
                                                    z80 z80Var5 = z80Var;
                                                    Map map4 = f3517j0;
                                                    if (zM6578h) {
                                                        ae0Var.f175B = r3.f3114P;
                                                        ae0Var.f176C = r3.f3116R;
                                                        ae0Var.f177D = i3;
                                                        i6 = 1;
                                                    } else if (v51.m6581k(str7)) {
                                                        if (r3.f3142r == 0) {
                                                            i11 = r3.f3140p;
                                                            i7 = -1;
                                                            if (i11 == -1) {
                                                                i11 = r3.f3137m;
                                                            }
                                                            r3.f3140p = i11;
                                                            i12 = r3.f3141q;
                                                            if (i12 == -1) {
                                                                i12 = r3.f3138n;
                                                            }
                                                            r3.f3141q = i12;
                                                        } else {
                                                            i7 = -1;
                                                        }
                                                        i8 = r3.f3140p;
                                                        if (i8 != i7) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (r3.f3149y) {
                                                            if (r3.f3103E != -1.0f) {
                                                                bArr = null;
                                                            } else {
                                                                bArr = null;
                                                            }
                                                            int i316 = r3.f3150z;
                                                            int i317 = r3.f3100B;
                                                            int i318 = r3.f3099A;
                                                            int i319 = r3.f3139o;
                                                            c1673zp = new C1673zp(i316, i317, i318, bArr, i319, i319);
                                                        } else {
                                                            c1673zp = null;
                                                        }
                                                        str4 = r3.f3125a;
                                                        if (str4 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (r3.f3143s == 0) {
                                                            i9 = iIntValue;
                                                        } else {
                                                            i9 = iIntValue;
                                                        }
                                                        ae0Var.f204t = r3.f3137m;
                                                        ae0Var.f205u = r3.f3138n;
                                                        ae0Var.f208x = f;
                                                        ae0Var.f207w = i9;
                                                        ae0Var.f209y = r3.f3147w;
                                                        ae0Var.f210z = r3.f3148x;
                                                        ae0Var.f174A = c1673zp;
                                                        i6 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str7)) {
                                                        }
                                                        i6 = 3;
                                                    }
                                                    str5 = r3.f3125a;
                                                    if (str5 != null) {
                                                        ae0Var.f186b = r3.f3125a;
                                                    }
                                                    ae0Var.f185a = Integer.toString(i29);
                                                    ae0Var.f197m = v51.m6582l(str7);
                                                    ae0Var.f198n = i4;
                                                    ae0Var.f188d = r3.f3122X;
                                                    ae0Var.f189e = i315;
                                                    ae0Var.f200p = list5;
                                                    ae0Var.f194j = str2;
                                                    ae0Var.f201q = r3.f3136l;
                                                    be0 be0Var4 = new be0(ae0Var);
                                                    c22 c22VarMo750n4 = z80Var5.mo750n(r3.f3127c, i6);
                                                    r3.f3123Y = c22VarMo750n4;
                                                    c22VarMo750n4.mo1117d(be0Var4);
                                                    sparseArray.put(r3.f3127c, r3);
                                                    f01Var4 = f01Var2;
                                                } else {
                                                    i3 = iM7244r;
                                                    str7 = "audio/raw";
                                                    list4 = null;
                                                    i4 = -1;
                                                    list = list4;
                                                    str2 = null;
                                                    list5 = list;
                                                    if (r3.f3113O != null) {
                                                        str2 = c0101bjM995b.f1383b;
                                                        str7 = "video/dolby-vision";
                                                    }
                                                    boolean z9 = r3.f3121W;
                                                    if (r3.f3120V) {
                                                        i5 = 2;
                                                    } else {
                                                        i5 = 0;
                                                    }
                                                    int i3110 = (z9 ? 1 : 0) | i5;
                                                    ae0Var = new ae0();
                                                    zM6578h = v51.m6578h(str7);
                                                    z80 z80Var6 = z80Var;
                                                    Map map5 = f3517j0;
                                                    if (zM6578h) {
                                                        ae0Var.f175B = r3.f3114P;
                                                        ae0Var.f176C = r3.f3116R;
                                                        ae0Var.f177D = i3;
                                                        i6 = 1;
                                                    } else if (v51.m6581k(str7)) {
                                                        if (r3.f3142r == 0) {
                                                            i11 = r3.f3140p;
                                                            i7 = -1;
                                                            if (i11 == -1) {
                                                                i11 = r3.f3137m;
                                                            }
                                                            r3.f3140p = i11;
                                                            i12 = r3.f3141q;
                                                            if (i12 == -1) {
                                                                i12 = r3.f3138n;
                                                            }
                                                            r3.f3141q = i12;
                                                        } else {
                                                            i7 = -1;
                                                        }
                                                        i8 = r3.f3140p;
                                                        if (i8 != i7) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (r3.f3149y) {
                                                            if (r3.f3103E != -1.0f) {
                                                                bArr = null;
                                                            } else {
                                                                bArr = null;
                                                            }
                                                            int i3111 = r3.f3150z;
                                                            int i3112 = r3.f3100B;
                                                            int i3113 = r3.f3099A;
                                                            int i3114 = r3.f3139o;
                                                            c1673zp = new C1673zp(i3111, i3112, i3113, bArr, i3114, i3114);
                                                        } else {
                                                            c1673zp = null;
                                                        }
                                                        str4 = r3.f3125a;
                                                        if (str4 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (r3.f3143s == 0) {
                                                            i9 = iIntValue;
                                                        } else {
                                                            i9 = iIntValue;
                                                        }
                                                        ae0Var.f204t = r3.f3137m;
                                                        ae0Var.f205u = r3.f3138n;
                                                        ae0Var.f208x = f;
                                                        ae0Var.f207w = i9;
                                                        ae0Var.f209y = r3.f3147w;
                                                        ae0Var.f210z = r3.f3148x;
                                                        ae0Var.f174A = c1673zp;
                                                        i6 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str7)) {
                                                        }
                                                        i6 = 3;
                                                    }
                                                    str5 = r3.f3125a;
                                                    if (str5 != null) {
                                                        ae0Var.f186b = r3.f3125a;
                                                    }
                                                    ae0Var.f185a = Integer.toString(i29);
                                                    ae0Var.f197m = v51.m6582l(str7);
                                                    ae0Var.f198n = i4;
                                                    ae0Var.f188d = r3.f3122X;
                                                    ae0Var.f189e = i3110;
                                                    ae0Var.f200p = list5;
                                                    ae0Var.f194j = str2;
                                                    ae0Var.f201q = r3.f3136l;
                                                    be0 be0Var5 = new be0(ae0Var);
                                                    c22 c22VarMo750n5 = z80Var6.mo750n(r3.f3127c, i6);
                                                    r3.f3123Y = c22VarMo750n5;
                                                    c22VarMo750n5.mo1117d(be0Var5);
                                                    sparseArray.put(r3.f3127c, r3);
                                                    f01Var4 = f01Var2;
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                throw fc1.m2799a(null, "Error parsing MS/ACM codec private");
                                            }
                                            break;
                                        case 3:
                                            z80Var = z80Var;
                                            f01Var2 = f01Var9;
                                            r3.f3119U = new f32();
                                            str7 = "audio/true-hd";
                                            i3 = -1;
                                            list4 = null;
                                            i4 = -1;
                                            list = list4;
                                            str2 = null;
                                            list5 = list;
                                            if (r3.f3113O != null) {
                                                str2 = c0101bjM995b.f1383b;
                                                str7 = "video/dolby-vision";
                                            }
                                            boolean z10 = r3.f3121W;
                                            if (r3.f3120V) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i3115 = (z10 ? 1 : 0) | i5;
                                            ae0Var = new ae0();
                                            zM6578h = v51.m6578h(str7);
                                            z80 z80Var7 = z80Var;
                                            Map map6 = f3517j0;
                                            if (zM6578h) {
                                                ae0Var.f175B = r3.f3114P;
                                                ae0Var.f176C = r3.f3116R;
                                                ae0Var.f177D = i3;
                                                i6 = 1;
                                            } else if (v51.m6581k(str7)) {
                                                if (r3.f3142r == 0) {
                                                    i11 = r3.f3140p;
                                                    i7 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r3.f3137m;
                                                    }
                                                    r3.f3140p = i11;
                                                    i12 = r3.f3141q;
                                                    if (i12 == -1) {
                                                        i12 = r3.f3138n;
                                                    }
                                                    r3.f3141q = i12;
                                                } else {
                                                    i7 = -1;
                                                }
                                                i8 = r3.f3140p;
                                                if (i8 != i7) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r3.f3149y) {
                                                    if (r3.f3103E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3116 = r3.f3150z;
                                                    int i3117 = r3.f3100B;
                                                    int i3118 = r3.f3099A;
                                                    int i3119 = r3.f3139o;
                                                    c1673zp = new C1673zp(i3116, i3117, i3118, bArr, i3119, i3119);
                                                } else {
                                                    c1673zp = null;
                                                }
                                                str4 = r3.f3125a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r3.f3143s == 0) {
                                                    i9 = iIntValue;
                                                } else {
                                                    i9 = iIntValue;
                                                }
                                                ae0Var.f204t = r3.f3137m;
                                                ae0Var.f205u = r3.f3138n;
                                                ae0Var.f208x = f;
                                                ae0Var.f207w = i9;
                                                ae0Var.f209y = r3.f3147w;
                                                ae0Var.f210z = r3.f3148x;
                                                ae0Var.f174A = c1673zp;
                                                i6 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str7)) {
                                                }
                                                i6 = 3;
                                            }
                                            str5 = r3.f3125a;
                                            if (str5 != null) {
                                                ae0Var.f186b = r3.f3125a;
                                            }
                                            ae0Var.f185a = Integer.toString(i29);
                                            ae0Var.f197m = v51.m6582l(str7);
                                            ae0Var.f198n = i4;
                                            ae0Var.f188d = r3.f3122X;
                                            ae0Var.f189e = i3115;
                                            ae0Var.f200p = list5;
                                            ae0Var.f194j = str2;
                                            ae0Var.f201q = r3.f3136l;
                                            be0 be0Var6 = new be0(ae0Var);
                                            c22 c22VarMo750n6 = z80Var7.mo750n(r3.f3127c, i6);
                                            r3.f3123Y = c22VarMo750n6;
                                            c22VarMo750n6.mo1117d(be0Var6);
                                            sparseArray.put(r3.f3127c, r3);
                                            f01Var4 = f01Var2;
                                            break;
                                        case 4:
                                            byte[] bArrM2442a = r3.m2442a(str6);
                                            try {
                                                try {
                                                    if (bArrM2442a[0] != 2) {
                                                        throw fc1.m2799a(null, "Error parsing vorbis codec private");
                                                    }
                                                    int i40 = 0;
                                                    int i41 = 1;
                                                    while (true) {
                                                        int i42 = bArrM2442a[i41] & 255;
                                                        if (i42 != 255) {
                                                            int i43 = i41 + 1;
                                                            int i44 = i40 + i42;
                                                            f01Var2 = f01Var9;
                                                            int i45 = 0;
                                                            while (true) {
                                                                int i46 = bArrM2442a[i43] & 255;
                                                                if (i46 != 255) {
                                                                    int i47 = i43 + 1;
                                                                    int i48 = i45 + i46;
                                                                    if (bArrM2442a[i47] != 1) {
                                                                        throw fc1.m2799a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr6 = new byte[i44];
                                                                    System.arraycopy(bArrM2442a, i47, bArr6, 0, i44);
                                                                    int i49 = i47 + i44;
                                                                    if (bArrM2442a[i49] != 3) {
                                                                        throw fc1.m2799a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    int i50 = i49 + i48;
                                                                    if (bArrM2442a[i50] != 5) {
                                                                        throw fc1.m2799a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr7 = new byte[bArrM2442a.length - i50];
                                                                    System.arraycopy(bArrM2442a, i50, bArr7, 0, bArrM2442a.length - i50);
                                                                    ArrayList arrayList = new ArrayList(2);
                                                                    arrayList.add(bArr6);
                                                                    arrayList.add(bArr7);
                                                                    str7 = "audio/vorbis";
                                                                    i4 = 8192;
                                                                    str2 = null;
                                                                    list6 = arrayList;
                                                                    list5 = list6;
                                                                    i3 = -1;
                                                                    if (r3.f3113O != null) {
                                                                        str2 = c0101bjM995b.f1383b;
                                                                        str7 = "video/dolby-vision";
                                                                    }
                                                                    boolean z11 = r3.f3121W;
                                                                    if (r3.f3120V) {
                                                                        i5 = 2;
                                                                    } else {
                                                                        i5 = 0;
                                                                    }
                                                                    int i31110 = (z11 ? 1 : 0) | i5;
                                                                    ae0Var = new ae0();
                                                                    zM6578h = v51.m6578h(str7);
                                                                    z80 z80Var8 = z80Var;
                                                                    Map map7 = f3517j0;
                                                                    if (zM6578h) {
                                                                        ae0Var.f175B = r3.f3114P;
                                                                        ae0Var.f176C = r3.f3116R;
                                                                        ae0Var.f177D = i3;
                                                                        i6 = 1;
                                                                    } else if (v51.m6581k(str7)) {
                                                                        if (r3.f3142r == 0) {
                                                                            i11 = r3.f3140p;
                                                                            i7 = -1;
                                                                            if (i11 == -1) {
                                                                                i11 = r3.f3137m;
                                                                            }
                                                                            r3.f3140p = i11;
                                                                            i12 = r3.f3141q;
                                                                            if (i12 == -1) {
                                                                                i12 = r3.f3138n;
                                                                            }
                                                                            r3.f3141q = i12;
                                                                        } else {
                                                                            i7 = -1;
                                                                        }
                                                                        i8 = r3.f3140p;
                                                                        if (i8 != i7) {
                                                                            f = -1.0f;
                                                                        } else {
                                                                            f = -1.0f;
                                                                        }
                                                                        if (r3.f3149y) {
                                                                            if (r3.f3103E != -1.0f) {
                                                                                bArr = null;
                                                                            } else {
                                                                                bArr = null;
                                                                            }
                                                                            int i31111 = r3.f3150z;
                                                                            int i31112 = r3.f3100B;
                                                                            int i31113 = r3.f3099A;
                                                                            int i31114 = r3.f3139o;
                                                                            c1673zp = new C1673zp(i31111, i31112, i31113, bArr, i31114, i31114);
                                                                        } else {
                                                                            c1673zp = null;
                                                                        }
                                                                        str4 = r3.f3125a;
                                                                        if (str4 == null) {
                                                                            iIntValue = -1;
                                                                        } else {
                                                                            iIntValue = -1;
                                                                        }
                                                                        if (r3.f3143s == 0) {
                                                                            i9 = iIntValue;
                                                                        } else {
                                                                            i9 = iIntValue;
                                                                        }
                                                                        ae0Var.f204t = r3.f3137m;
                                                                        ae0Var.f205u = r3.f3138n;
                                                                        ae0Var.f208x = f;
                                                                        ae0Var.f207w = i9;
                                                                        ae0Var.f209y = r3.f3147w;
                                                                        ae0Var.f210z = r3.f3148x;
                                                                        ae0Var.f174A = c1673zp;
                                                                        i6 = 2;
                                                                    } else {
                                                                        if ("application/x-subrip".equals(str7)) {
                                                                        }
                                                                        i6 = 3;
                                                                    }
                                                                    str5 = r3.f3125a;
                                                                    if (str5 != null) {
                                                                        ae0Var.f186b = r3.f3125a;
                                                                    }
                                                                    ae0Var.f185a = Integer.toString(i29);
                                                                    ae0Var.f197m = v51.m6582l(str7);
                                                                    ae0Var.f198n = i4;
                                                                    ae0Var.f188d = r3.f3122X;
                                                                    ae0Var.f189e = i31110;
                                                                    ae0Var.f200p = list5;
                                                                    ae0Var.f194j = str2;
                                                                    ae0Var.f201q = r3.f3136l;
                                                                    be0 be0Var7 = new be0(ae0Var);
                                                                    c22 c22VarMo750n7 = z80Var8.mo750n(r3.f3127c, i6);
                                                                    r3.f3123Y = c22VarMo750n7;
                                                                    c22VarMo750n7.mo1117d(be0Var7);
                                                                    sparseArray.put(r3.f3127c, r3);
                                                                    f01Var4 = f01Var2;
                                                                } else {
                                                                    i45 += 255;
                                                                    i43++;
                                                                }
                                                            }
                                                        } else {
                                                            i40 += 255;
                                                            i41++;
                                                        }
                                                    }
                                                } catch (ArrayIndexOutOfBoundsException unused2) {
                                                    throw fc1.m2799a(r3, "Error parsing vorbis codec private");
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                                r3 = 0;
                                            }
                                            break;
                                        case 5:
                                            str7 = "audio/mpeg-L2";
                                            f01Var2 = f01Var9;
                                            i3 = -1;
                                            list = null;
                                            i4 = 4096;
                                            str2 = null;
                                            list5 = list;
                                            if (r3.f3113O != null) {
                                                str2 = c0101bjM995b.f1383b;
                                                str7 = "video/dolby-vision";
                                            }
                                            boolean z12 = r3.f3121W;
                                            if (r3.f3120V) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i31115 = (z12 ? 1 : 0) | i5;
                                            ae0Var = new ae0();
                                            zM6578h = v51.m6578h(str7);
                                            z80 z80Var9 = z80Var;
                                            Map map8 = f3517j0;
                                            if (zM6578h) {
                                                ae0Var.f175B = r3.f3114P;
                                                ae0Var.f176C = r3.f3116R;
                                                ae0Var.f177D = i3;
                                                i6 = 1;
                                            } else if (v51.m6581k(str7)) {
                                                if (r3.f3142r == 0) {
                                                    i11 = r3.f3140p;
                                                    i7 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r3.f3137m;
                                                    }
                                                    r3.f3140p = i11;
                                                    i12 = r3.f3141q;
                                                    if (i12 == -1) {
                                                        i12 = r3.f3138n;
                                                    }
                                                    r3.f3141q = i12;
                                                } else {
                                                    i7 = -1;
                                                }
                                                i8 = r3.f3140p;
                                                if (i8 != i7) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r3.f3149y) {
                                                    if (r3.f3103E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31116 = r3.f3150z;
                                                    int i31117 = r3.f3100B;
                                                    int i31118 = r3.f3099A;
                                                    int i31119 = r3.f3139o;
                                                    c1673zp = new C1673zp(i31116, i31117, i31118, bArr, i31119, i31119);
                                                } else {
                                                    c1673zp = null;
                                                }
                                                str4 = r3.f3125a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r3.f3143s == 0) {
                                                    i9 = iIntValue;
                                                } else {
                                                    i9 = iIntValue;
                                                }
                                                ae0Var.f204t = r3.f3137m;
                                                ae0Var.f205u = r3.f3138n;
                                                ae0Var.f208x = f;
                                                ae0Var.f207w = i9;
                                                ae0Var.f209y = r3.f3147w;
                                                ae0Var.f210z = r3.f3148x;
                                                ae0Var.f174A = c1673zp;
                                                i6 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str7)) {
                                                }
                                                i6 = 3;
                                            }
                                            str5 = r3.f3125a;
                                            if (str5 != null) {
                                                ae0Var.f186b = r3.f3125a;
                                            }
                                            ae0Var.f185a = Integer.toString(i29);
                                            ae0Var.f197m = v51.m6582l(str7);
                                            ae0Var.f198n = i4;
                                            ae0Var.f188d = r3.f3122X;
                                            ae0Var.f189e = i31115;
                                            ae0Var.f200p = list5;
                                            ae0Var.f194j = str2;
                                            ae0Var.f201q = r3.f3136l;
                                            be0 be0Var8 = new be0(ae0Var);
                                            c22 c22VarMo750n8 = z80Var9.mo750n(r3.f3127c, i6);
                                            r3.f3123Y = c22VarMo750n8;
                                            c22VarMo750n8.mo1117d(be0Var8);
                                            sparseArray.put(r3.f3127c, r3);
                                            f01Var4 = f01Var2;
                                            break;
                                        case 6:
                                            str7 = "audio/mpeg";
                                            f01Var2 = f01Var9;
                                            i3 = -1;
                                            list = null;
                                            i4 = 4096;
                                            str2 = null;
                                            list5 = list;
                                            if (r3.f3113O != null) {
                                                str2 = c0101bjM995b.f1383b;
                                                str7 = "video/dolby-vision";
                                            }
                                            boolean z13 = r3.f3121W;
                                            if (r3.f3120V) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i311110 = (z13 ? 1 : 0) | i5;
                                            ae0Var = new ae0();
                                            zM6578h = v51.m6578h(str7);
                                            z80 z80Var10 = z80Var;
                                            Map map9 = f3517j0;
                                            if (zM6578h) {
                                                ae0Var.f175B = r3.f3114P;
                                                ae0Var.f176C = r3.f3116R;
                                                ae0Var.f177D = i3;
                                                i6 = 1;
                                            } else if (v51.m6581k(str7)) {
                                                if (r3.f3142r == 0) {
                                                    i11 = r3.f3140p;
                                                    i7 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r3.f3137m;
                                                    }
                                                    r3.f3140p = i11;
                                                    i12 = r3.f3141q;
                                                    if (i12 == -1) {
                                                        i12 = r3.f3138n;
                                                    }
                                                    r3.f3141q = i12;
                                                } else {
                                                    i7 = -1;
                                                }
                                                i8 = r3.f3140p;
                                                if (i8 != i7) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r3.f3149y) {
                                                    if (r3.f3103E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i311111 = r3.f3150z;
                                                    int i311112 = r3.f3100B;
                                                    int i311113 = r3.f3099A;
                                                    int i311114 = r3.f3139o;
                                                    c1673zp = new C1673zp(i311111, i311112, i311113, bArr, i311114, i311114);
                                                } else {
                                                    c1673zp = null;
                                                }
                                                str4 = r3.f3125a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r3.f3143s == 0) {
                                                    i9 = iIntValue;
                                                } else {
                                                    i9 = iIntValue;
                                                }
                                                ae0Var.f204t = r3.f3137m;
                                                ae0Var.f205u = r3.f3138n;
                                                ae0Var.f208x = f;
                                                ae0Var.f207w = i9;
                                                ae0Var.f209y = r3.f3147w;
                                                ae0Var.f210z = r3.f3148x;
                                                ae0Var.f174A = c1673zp;
                                                i6 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str7)) {
                                                }
                                                i6 = 3;
                                            }
                                            str5 = r3.f3125a;
                                            if (str5 != null) {
                                                ae0Var.f186b = r3.f3125a;
                                            }
                                            ae0Var.f185a = Integer.toString(i29);
                                            ae0Var.f197m = v51.m6582l(str7);
                                            ae0Var.f198n = i4;
                                            ae0Var.f188d = r3.f3122X;
                                            ae0Var.f189e = i311110;
                                            ae0Var.f200p = list5;
                                            ae0Var.f194j = str2;
                                            ae0Var.f201q = r3.f3136l;
                                            be0 be0Var9 = new be0(ae0Var);
                                            c22 c22VarMo750n9 = z80Var10.mo750n(r3.f3127c, i6);
                                            r3.f3123Y = c22VarMo750n9;
                                            c22VarMo750n9.mo1117d(be0Var9);
                                            sparseArray.put(r3.f3127c, r3);
                                            f01Var4 = f01Var2;
                                            break;
                                        case 7:
                                            z80Var = z80Var;
                                            dc1 dc1Var3 = new dc1(r3.m2442a(r3.f3126b));
                                            try {
                                                dc1Var3.m2317G(16);
                                                long jM2328k = dc1Var3.m2328k();
                                                if (jM2328k == 1482049860) {
                                                    runtimeException = null;
                                                    try {
                                                        pair = new Pair("video/divx", null);
                                                        str2 = null;
                                                    } catch (ArrayIndexOutOfBoundsException unused4) {
                                                    }
                                                } else {
                                                    if (jM2328k == 859189832) {
                                                        pair = new Pair("video/3gpp", null);
                                                    } else {
                                                        if (jM2328k == 826496599) {
                                                            int i51 = dc1Var3.f2883b + 20;
                                                            byte[] bArr8 = dc1Var3.f2882a;
                                                            while (true) {
                                                                if (i51 < bArr8.length - 4) {
                                                                    if (bArr8[i51] == 0 && bArr8[i51 + 1] == 0 && bArr8[i51 + 2] == 1) {
                                                                        if (bArr8[i51 + 3] == 15) {
                                                                            pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr8, i51, bArr8.length)));
                                                                        }
                                                                    }
                                                                    i51++;
                                                                } else {
                                                                    try {
                                                                        throw fc1.m2799a(null, "Failed to find FourCC VC1 initialization data");
                                                                    } catch (ArrayIndexOutOfBoundsException unused5) {
                                                                        runtimeException = null;
                                                                    }
                                                                }
                                                                throw fc1.m2799a(runtimeException, "Error parsing FourCC private data");
                                                            }
                                                        }
                                                        AbstractC1337qm.m5542i0("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                        str2 = null;
                                                        pair = new Pair("video/x-unknown", null);
                                                    }
                                                    str2 = null;
                                                }
                                                str7 = (String) pair.first;
                                                f01Var2 = f01Var9;
                                                list2 = (List) pair.second;
                                                i3 = -1;
                                                i4 = -1;
                                                list5 = list2;
                                                if (r3.f3113O != null) {
                                                    str2 = c0101bjM995b.f1383b;
                                                    str7 = "video/dolby-vision";
                                                }
                                                boolean z14 = r3.f3121W;
                                                if (r3.f3120V) {
                                                    i5 = 2;
                                                } else {
                                                    i5 = 0;
                                                }
                                                int i311115 = (z14 ? 1 : 0) | i5;
                                                ae0Var = new ae0();
                                                zM6578h = v51.m6578h(str7);
                                                z80 z80Var11 = z80Var;
                                                Map map10 = f3517j0;
                                                if (zM6578h) {
                                                    ae0Var.f175B = r3.f3114P;
                                                    ae0Var.f176C = r3.f3116R;
                                                    ae0Var.f177D = i3;
                                                    i6 = 1;
                                                } else if (v51.m6581k(str7)) {
                                                    if (r3.f3142r == 0) {
                                                        i11 = r3.f3140p;
                                                        i7 = -1;
                                                        if (i11 == -1) {
                                                            i11 = r3.f3137m;
                                                        }
                                                        r3.f3140p = i11;
                                                        i12 = r3.f3141q;
                                                        if (i12 == -1) {
                                                            i12 = r3.f3138n;
                                                        }
                                                        r3.f3141q = i12;
                                                    } else {
                                                        i7 = -1;
                                                    }
                                                    i8 = r3.f3140p;
                                                    if (i8 != i7) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (r3.f3149y) {
                                                        if (r3.f3103E != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i311116 = r3.f3150z;
                                                        int i311117 = r3.f3100B;
                                                        int i311118 = r3.f3099A;
                                                        int i311119 = r3.f3139o;
                                                        c1673zp = new C1673zp(i311116, i311117, i311118, bArr, i311119, i311119);
                                                    } else {
                                                        c1673zp = null;
                                                    }
                                                    str4 = r3.f3125a;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r3.f3143s == 0) {
                                                        i9 = iIntValue;
                                                    } else {
                                                        i9 = iIntValue;
                                                    }
                                                    ae0Var.f204t = r3.f3137m;
                                                    ae0Var.f205u = r3.f3138n;
                                                    ae0Var.f208x = f;
                                                    ae0Var.f207w = i9;
                                                    ae0Var.f209y = r3.f3147w;
                                                    ae0Var.f210z = r3.f3148x;
                                                    ae0Var.f174A = c1673zp;
                                                    i6 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str7)) {
                                                    }
                                                    i6 = 3;
                                                }
                                                str5 = r3.f3125a;
                                                if (str5 != null) {
                                                    ae0Var.f186b = r3.f3125a;
                                                }
                                                ae0Var.f185a = Integer.toString(i29);
                                                ae0Var.f197m = v51.m6582l(str7);
                                                ae0Var.f198n = i4;
                                                ae0Var.f188d = r3.f3122X;
                                                ae0Var.f189e = i311115;
                                                ae0Var.f200p = list5;
                                                ae0Var.f194j = str2;
                                                ae0Var.f201q = r3.f3136l;
                                                be0 be0Var10 = new be0(ae0Var);
                                                c22 c22VarMo750n10 = z80Var11.mo750n(r3.f3127c, i6);
                                                r3.f3123Y = c22VarMo750n10;
                                                c22VarMo750n10.mo1117d(be0Var10);
                                                sparseArray.put(r3.f3127c, r3);
                                                f01Var4 = f01Var2;
                                            } catch (ArrayIndexOutOfBoundsException unused6) {
                                                runtimeException = null;
                                            }
                                            break;
                                        case 8:
                                            byte[] bArr9 = new byte[4];
                                            System.arraycopy(r3.m2442a(str6), 0, bArr9, 0, 4);
                                            listSingletonList = qm0.m5570t(bArr9);
                                            f01Var2 = f01Var9;
                                            str7 = "application/dvbsubs";
                                            i3 = -1;
                                            list4 = listSingletonList;
                                            i4 = -1;
                                            list = list4;
                                            str2 = null;
                                            list5 = list;
                                            if (r3.f3113O != null) {
                                                str2 = c0101bjM995b.f1383b;
                                                str7 = "video/dolby-vision";
                                            }
                                            boolean z15 = r3.f3121W;
                                            if (r3.f3120V) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i3111110 = (z15 ? 1 : 0) | i5;
                                            ae0Var = new ae0();
                                            zM6578h = v51.m6578h(str7);
                                            z80 z80Var12 = z80Var;
                                            Map map11 = f3517j0;
                                            if (zM6578h) {
                                                ae0Var.f175B = r3.f3114P;
                                                ae0Var.f176C = r3.f3116R;
                                                ae0Var.f177D = i3;
                                                i6 = 1;
                                            } else if (v51.m6581k(str7)) {
                                                if (r3.f3142r == 0) {
                                                    i11 = r3.f3140p;
                                                    i7 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r3.f3137m;
                                                    }
                                                    r3.f3140p = i11;
                                                    i12 = r3.f3141q;
                                                    if (i12 == -1) {
                                                        i12 = r3.f3138n;
                                                    }
                                                    r3.f3141q = i12;
                                                } else {
                                                    i7 = -1;
                                                }
                                                i8 = r3.f3140p;
                                                if (i8 != i7) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r3.f3149y) {
                                                    if (r3.f3103E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3111111 = r3.f3150z;
                                                    int i3111112 = r3.f3100B;
                                                    int i3111113 = r3.f3099A;
                                                    int i3111114 = r3.f3139o;
                                                    c1673zp = new C1673zp(i3111111, i3111112, i3111113, bArr, i3111114, i3111114);
                                                } else {
                                                    c1673zp = null;
                                                }
                                                str4 = r3.f3125a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r3.f3143s == 0) {
                                                    i9 = iIntValue;
                                                } else {
                                                    i9 = iIntValue;
                                                }
                                                ae0Var.f204t = r3.f3137m;
                                                ae0Var.f205u = r3.f3138n;
                                                ae0Var.f208x = f;
                                                ae0Var.f207w = i9;
                                                ae0Var.f209y = r3.f3147w;
                                                ae0Var.f210z = r3.f3148x;
                                                ae0Var.f174A = c1673zp;
                                                i6 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str7)) {
                                                }
                                                i6 = 3;
                                            }
                                            str5 = r3.f3125a;
                                            if (str5 != null) {
                                                ae0Var.f186b = r3.f3125a;
                                            }
                                            ae0Var.f185a = Integer.toString(i29);
                                            ae0Var.f197m = v51.m6582l(str7);
                                            ae0Var.f198n = i4;
                                            ae0Var.f188d = r3.f3122X;
                                            ae0Var.f189e = i3111110;
                                            ae0Var.f200p = list5;
                                            ae0Var.f194j = str2;
                                            ae0Var.f201q = r3.f3136l;
                                            be0 be0Var11 = new be0(ae0Var);
                                            c22 c22VarMo750n11 = z80Var12.mo750n(r3.f3127c, i6);
                                            r3.f3123Y = c22VarMo750n11;
                                            c22VarMo750n11.mo1117d(be0Var11);
                                            sparseArray.put(r3.f3127c, r3);
                                            f01Var4 = f01Var2;
                                            break;
                                        case 10:
                                            C0748ie c0748ieM3425a = C0748ie.m3425a(new dc1(r3.m2442a(r3.f3126b)));
                                            ArrayList arrayList2 = c0748ieM3425a.f4988a;
                                            r3.f3124Z = c0748ieM3425a.f4989b;
                                            str3 = c0748ieM3425a.f4999l;
                                            str7 = "video/avc";
                                            list3 = arrayList2;
                                            str2 = str3;
                                            f01Var2 = f01Var9;
                                            list2 = list3;
                                            i3 = -1;
                                            i4 = -1;
                                            list5 = list2;
                                            if (r3.f3113O != null) {
                                                str2 = c0101bjM995b.f1383b;
                                                str7 = "video/dolby-vision";
                                            }
                                            boolean z16 = r3.f3121W;
                                            if (r3.f3120V) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i3111115 = (z16 ? 1 : 0) | i5;
                                            ae0Var = new ae0();
                                            zM6578h = v51.m6578h(str7);
                                            z80 z80Var13 = z80Var;
                                            Map map12 = f3517j0;
                                            if (zM6578h) {
                                                ae0Var.f175B = r3.f3114P;
                                                ae0Var.f176C = r3.f3116R;
                                                ae0Var.f177D = i3;
                                                i6 = 1;
                                            } else if (v51.m6581k(str7)) {
                                                if (r3.f3142r == 0) {
                                                    i11 = r3.f3140p;
                                                    i7 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r3.f3137m;
                                                    }
                                                    r3.f3140p = i11;
                                                    i12 = r3.f3141q;
                                                    if (i12 == -1) {
                                                        i12 = r3.f3138n;
                                                    }
                                                    r3.f3141q = i12;
                                                } else {
                                                    i7 = -1;
                                                }
                                                i8 = r3.f3140p;
                                                if (i8 != i7) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r3.f3149y) {
                                                    if (r3.f3103E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3111116 = r3.f3150z;
                                                    int i3111117 = r3.f3100B;
                                                    int i3111118 = r3.f3099A;
                                                    int i3111119 = r3.f3139o;
                                                    c1673zp = new C1673zp(i3111116, i3111117, i3111118, bArr, i3111119, i3111119);
                                                } else {
                                                    c1673zp = null;
                                                }
                                                str4 = r3.f3125a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r3.f3143s == 0) {
                                                    i9 = iIntValue;
                                                } else {
                                                    i9 = iIntValue;
                                                }
                                                ae0Var.f204t = r3.f3137m;
                                                ae0Var.f205u = r3.f3138n;
                                                ae0Var.f208x = f;
                                                ae0Var.f207w = i9;
                                                ae0Var.f209y = r3.f3147w;
                                                ae0Var.f210z = r3.f3148x;
                                                ae0Var.f174A = c1673zp;
                                                i6 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str7)) {
                                                }
                                                i6 = 3;
                                            }
                                            str5 = r3.f3125a;
                                            if (str5 != null) {
                                                ae0Var.f186b = r3.f3125a;
                                            }
                                            ae0Var.f185a = Integer.toString(i29);
                                            ae0Var.f197m = v51.m6582l(str7);
                                            ae0Var.f198n = i4;
                                            ae0Var.f188d = r3.f3122X;
                                            ae0Var.f189e = i3111115;
                                            ae0Var.f200p = list5;
                                            ae0Var.f194j = str2;
                                            ae0Var.f201q = r3.f3136l;
                                            be0 be0Var12 = new be0(ae0Var);
                                            c22 c22VarMo750n12 = z80Var13.mo750n(r3.f3127c, i6);
                                            r3.f3123Y = c22VarMo750n12;
                                            c22VarMo750n12.mo1117d(be0Var12);
                                            sparseArray.put(r3.f3127c, r3);
                                            f01Var4 = f01Var2;
                                            break;
                                        case 11:
                                            listSingletonList = qm0.m5570t(r3.m2442a(str6));
                                            f01Var2 = f01Var9;
                                            str7 = "application/vobsub";
                                            i3 = -1;
                                            list4 = listSingletonList;
                                            i4 = -1;
                                            list = list4;
                                            str2 = null;
                                            list5 = list;
                                            if (r3.f3113O != null) {
                                                str2 = c0101bjM995b.f1383b;
                                                str7 = "video/dolby-vision";
                                            }
                                            boolean z17 = r3.f3121W;
                                            if (r3.f3120V) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i31111110 = (z17 ? 1 : 0) | i5;
                                            ae0Var = new ae0();
                                            zM6578h = v51.m6578h(str7);
                                            z80 z80Var14 = z80Var;
                                            Map map13 = f3517j0;
                                            if (zM6578h) {
                                                ae0Var.f175B = r3.f3114P;
                                                ae0Var.f176C = r3.f3116R;
                                                ae0Var.f177D = i3;
                                                i6 = 1;
                                            } else if (v51.m6581k(str7)) {
                                                if (r3.f3142r == 0) {
                                                    i11 = r3.f3140p;
                                                    i7 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r3.f3137m;
                                                    }
                                                    r3.f3140p = i11;
                                                    i12 = r3.f3141q;
                                                    if (i12 == -1) {
                                                        i12 = r3.f3138n;
                                                    }
                                                    r3.f3141q = i12;
                                                } else {
                                                    i7 = -1;
                                                }
                                                i8 = r3.f3140p;
                                                if (i8 != i7) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r3.f3149y) {
                                                    if (r3.f3103E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31111111 = r3.f3150z;
                                                    int i31111112 = r3.f3100B;
                                                    int i31111113 = r3.f3099A;
                                                    int i31111114 = r3.f3139o;
                                                    c1673zp = new C1673zp(i31111111, i31111112, i31111113, bArr, i31111114, i31111114);
                                                } else {
                                                    c1673zp = null;
                                                }
                                                str4 = r3.f3125a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r3.f3143s == 0) {
                                                    i9 = iIntValue;
                                                } else {
                                                    i9 = iIntValue;
                                                }
                                                ae0Var.f204t = r3.f3137m;
                                                ae0Var.f205u = r3.f3138n;
                                                ae0Var.f208x = f;
                                                ae0Var.f207w = i9;
                                                ae0Var.f209y = r3.f3147w;
                                                ae0Var.f210z = r3.f3148x;
                                                ae0Var.f174A = c1673zp;
                                                i6 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str7)) {
                                                }
                                                i6 = 3;
                                            }
                                            str5 = r3.f3125a;
                                            if (str5 != null) {
                                                ae0Var.f186b = r3.f3125a;
                                            }
                                            ae0Var.f185a = Integer.toString(i29);
                                            ae0Var.f197m = v51.m6582l(str7);
                                            ae0Var.f198n = i4;
                                            ae0Var.f188d = r3.f3122X;
                                            ae0Var.f189e = i31111110;
                                            ae0Var.f200p = list5;
                                            ae0Var.f194j = str2;
                                            ae0Var.f201q = r3.f3136l;
                                            be0 be0Var13 = new be0(ae0Var);
                                            c22 c22VarMo750n13 = z80Var14.mo750n(r3.f3127c, i6);
                                            r3.f3123Y = c22VarMo750n13;
                                            c22VarMo750n13.mo1117d(be0Var13);
                                            sparseArray.put(r3.f3127c, r3);
                                            f01Var4 = f01Var2;
                                            break;
                                        case 12:
                                            str7 = "audio/vnd.dts.hd";
                                            f01Var2 = f01Var9;
                                            i3 = -1;
                                            list4 = null;
                                            i4 = -1;
                                            list = list4;
                                            str2 = null;
                                            list5 = list;
                                            if (r3.f3113O != null) {
                                                str2 = c0101bjM995b.f1383b;
                                                str7 = "video/dolby-vision";
                                            }
                                            boolean z18 = r3.f3121W;
                                            if (r3.f3120V) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i31111115 = (z18 ? 1 : 0) | i5;
                                            ae0Var = new ae0();
                                            zM6578h = v51.m6578h(str7);
                                            z80 z80Var15 = z80Var;
                                            Map map14 = f3517j0;
                                            if (zM6578h) {
                                                ae0Var.f175B = r3.f3114P;
                                                ae0Var.f176C = r3.f3116R;
                                                ae0Var.f177D = i3;
                                                i6 = 1;
                                            } else if (v51.m6581k(str7)) {
                                                if (r3.f3142r == 0) {
                                                    i11 = r3.f3140p;
                                                    i7 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r3.f3137m;
                                                    }
                                                    r3.f3140p = i11;
                                                    i12 = r3.f3141q;
                                                    if (i12 == -1) {
                                                        i12 = r3.f3138n;
                                                    }
                                                    r3.f3141q = i12;
                                                } else {
                                                    i7 = -1;
                                                }
                                                i8 = r3.f3140p;
                                                if (i8 != i7) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r3.f3149y) {
                                                    if (r3.f3103E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31111116 = r3.f3150z;
                                                    int i31111117 = r3.f3100B;
                                                    int i31111118 = r3.f3099A;
                                                    int i31111119 = r3.f3139o;
                                                    c1673zp = new C1673zp(i31111116, i31111117, i31111118, bArr, i31111119, i31111119);
                                                } else {
                                                    c1673zp = null;
                                                }
                                                str4 = r3.f3125a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r3.f3143s == 0) {
                                                    i9 = iIntValue;
                                                } else {
                                                    i9 = iIntValue;
                                                }
                                                ae0Var.f204t = r3.f3137m;
                                                ae0Var.f205u = r3.f3138n;
                                                ae0Var.f208x = f;
                                                ae0Var.f207w = i9;
                                                ae0Var.f209y = r3.f3147w;
                                                ae0Var.f210z = r3.f3148x;
                                                ae0Var.f174A = c1673zp;
                                                i6 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str7)) {
                                                }
                                                i6 = 3;
                                            }
                                            str5 = r3.f3125a;
                                            if (str5 != null) {
                                                ae0Var.f186b = r3.f3125a;
                                            }
                                            ae0Var.f185a = Integer.toString(i29);
                                            ae0Var.f197m = v51.m6582l(str7);
                                            ae0Var.f198n = i4;
                                            ae0Var.f188d = r3.f3122X;
                                            ae0Var.f189e = i31111115;
                                            ae0Var.f200p = list5;
                                            ae0Var.f194j = str2;
                                            ae0Var.f201q = r3.f3136l;
                                            be0 be0Var14 = new be0(ae0Var);
                                            c22 c22VarMo750n14 = z80Var15.mo750n(r3.f3127c, i6);
                                            r3.f3123Y = c22VarMo750n14;
                                            c22VarMo750n14.mo1117d(be0Var14);
                                            sparseArray.put(r3.f3127c, r3);
                                            f01Var4 = f01Var2;
                                            break;
                                        case 13:
                                            List listSingletonList2 = Collections.singletonList(r3.m2442a(str6));
                                            byte[] bArr10 = r3.f3135k;
                                            C0586e0 c0586e0M3845P = ki0.m3845P(new C0141cm(bArr10, bArr10.length), false);
                                            r3.f3116R = c0586e0M3845P.f3088b;
                                            r3.f3114P = c0586e0M3845P.f3089c;
                                            str7 = "audio/mp4a-latm";
                                            str2 = c0586e0M3845P.f3087a;
                                            f01Var2 = f01Var9;
                                            i4 = -1;
                                            list6 = listSingletonList2;
                                            list5 = list6;
                                            i3 = -1;
                                            if (r3.f3113O != null) {
                                                str2 = c0101bjM995b.f1383b;
                                                str7 = "video/dolby-vision";
                                            }
                                            boolean z19 = r3.f3121W;
                                            if (r3.f3120V) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i311111110 = (z19 ? 1 : 0) | i5;
                                            ae0Var = new ae0();
                                            zM6578h = v51.m6578h(str7);
                                            z80 z80Var16 = z80Var;
                                            Map map15 = f3517j0;
                                            if (zM6578h) {
                                                ae0Var.f175B = r3.f3114P;
                                                ae0Var.f176C = r3.f3116R;
                                                ae0Var.f177D = i3;
                                                i6 = 1;
                                            } else if (v51.m6581k(str7)) {
                                                if (r3.f3142r == 0) {
                                                    i11 = r3.f3140p;
                                                    i7 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r3.f3137m;
                                                    }
                                                    r3.f3140p = i11;
                                                    i12 = r3.f3141q;
                                                    if (i12 == -1) {
                                                        i12 = r3.f3138n;
                                                    }
                                                    r3.f3141q = i12;
                                                } else {
                                                    i7 = -1;
                                                }
                                                i8 = r3.f3140p;
                                                if (i8 != i7) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r3.f3149y) {
                                                    if (r3.f3103E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i311111111 = r3.f3150z;
                                                    int i311111112 = r3.f3100B;
                                                    int i311111113 = r3.f3099A;
                                                    int i311111114 = r3.f3139o;
                                                    c1673zp = new C1673zp(i311111111, i311111112, i311111113, bArr, i311111114, i311111114);
                                                } else {
                                                    c1673zp = null;
                                                }
                                                str4 = r3.f3125a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r3.f3143s == 0) {
                                                    i9 = iIntValue;
                                                } else {
                                                    i9 = iIntValue;
                                                }
                                                ae0Var.f204t = r3.f3137m;
                                                ae0Var.f205u = r3.f3138n;
                                                ae0Var.f208x = f;
                                                ae0Var.f207w = i9;
                                                ae0Var.f209y = r3.f3147w;
                                                ae0Var.f210z = r3.f3148x;
                                                ae0Var.f174A = c1673zp;
                                                i6 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str7)) {
                                                }
                                                i6 = 3;
                                            }
                                            str5 = r3.f3125a;
                                            if (str5 != null) {
                                                ae0Var.f186b = r3.f3125a;
                                            }
                                            ae0Var.f185a = Integer.toString(i29);
                                            ae0Var.f197m = v51.m6582l(str7);
                                            ae0Var.f198n = i4;
                                            ae0Var.f188d = r3.f3122X;
                                            ae0Var.f189e = i311111110;
                                            ae0Var.f200p = list5;
                                            ae0Var.f194j = str2;
                                            ae0Var.f201q = r3.f3136l;
                                            be0 be0Var15 = new be0(ae0Var);
                                            c22 c22VarMo750n15 = z80Var16.mo750n(r3.f3127c, i6);
                                            r3.f3123Y = c22VarMo750n15;
                                            c22VarMo750n15.mo1117d(be0Var15);
                                            sparseArray.put(r3.f3127c, r3);
                                            f01Var4 = f01Var2;
                                            break;
                                        case 14:
                                            str7 = "audio/ac3";
                                            f01Var2 = f01Var9;
                                            i3 = -1;
                                            list4 = null;
                                            i4 = -1;
                                            list = list4;
                                            str2 = null;
                                            list5 = list;
                                            if (r3.f3113O != null) {
                                                str2 = c0101bjM995b.f1383b;
                                                str7 = "video/dolby-vision";
                                            }
                                            boolean z110 = r3.f3121W;
                                            if (r3.f3120V) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i311111115 = (z110 ? 1 : 0) | i5;
                                            ae0Var = new ae0();
                                            zM6578h = v51.m6578h(str7);
                                            z80 z80Var17 = z80Var;
                                            Map map16 = f3517j0;
                                            if (zM6578h) {
                                                ae0Var.f175B = r3.f3114P;
                                                ae0Var.f176C = r3.f3116R;
                                                ae0Var.f177D = i3;
                                                i6 = 1;
                                            } else if (v51.m6581k(str7)) {
                                                if (r3.f3142r == 0) {
                                                    i11 = r3.f3140p;
                                                    i7 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r3.f3137m;
                                                    }
                                                    r3.f3140p = i11;
                                                    i12 = r3.f3141q;
                                                    if (i12 == -1) {
                                                        i12 = r3.f3138n;
                                                    }
                                                    r3.f3141q = i12;
                                                } else {
                                                    i7 = -1;
                                                }
                                                i8 = r3.f3140p;
                                                if (i8 != i7) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r3.f3149y) {
                                                    if (r3.f3103E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i311111116 = r3.f3150z;
                                                    int i311111117 = r3.f3100B;
                                                    int i311111118 = r3.f3099A;
                                                    int i311111119 = r3.f3139o;
                                                    c1673zp = new C1673zp(i311111116, i311111117, i311111118, bArr, i311111119, i311111119);
                                                } else {
                                                    c1673zp = null;
                                                }
                                                str4 = r3.f3125a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r3.f3143s == 0) {
                                                    i9 = iIntValue;
                                                } else {
                                                    i9 = iIntValue;
                                                }
                                                ae0Var.f204t = r3.f3137m;
                                                ae0Var.f205u = r3.f3138n;
                                                ae0Var.f208x = f;
                                                ae0Var.f207w = i9;
                                                ae0Var.f209y = r3.f3147w;
                                                ae0Var.f210z = r3.f3148x;
                                                ae0Var.f174A = c1673zp;
                                                i6 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str7)) {
                                                }
                                                i6 = 3;
                                            }
                                            str5 = r3.f3125a;
                                            if (str5 != null) {
                                                ae0Var.f186b = r3.f3125a;
                                            }
                                            ae0Var.f185a = Integer.toString(i29);
                                            ae0Var.f197m = v51.m6582l(str7);
                                            ae0Var.f198n = i4;
                                            ae0Var.f188d = r3.f3122X;
                                            ae0Var.f189e = i311111115;
                                            ae0Var.f200p = list5;
                                            ae0Var.f194j = str2;
                                            ae0Var.f201q = r3.f3136l;
                                            be0 be0Var16 = new be0(ae0Var);
                                            c22 c22VarMo750n16 = z80Var17.mo750n(r3.f3127c, i6);
                                            r3.f3123Y = c22VarMo750n16;
                                            c22VarMo750n16.mo1117d(be0Var16);
                                            sparseArray.put(r3.f3127c, r3);
                                            f01Var4 = f01Var2;
                                            break;
                                        case 15:
                                        case 21:
                                            str7 = "audio/vnd.dts";
                                            f01Var2 = f01Var9;
                                            i3 = -1;
                                            list4 = null;
                                            i4 = -1;
                                            list = list4;
                                            str2 = null;
                                            list5 = list;
                                            if (r3.f3113O != null) {
                                                str2 = c0101bjM995b.f1383b;
                                                str7 = "video/dolby-vision";
                                            }
                                            boolean z111 = r3.f3121W;
                                            if (r3.f3120V) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i3111111110 = (z111 ? 1 : 0) | i5;
                                            ae0Var = new ae0();
                                            zM6578h = v51.m6578h(str7);
                                            z80 z80Var18 = z80Var;
                                            Map map17 = f3517j0;
                                            if (zM6578h) {
                                                ae0Var.f175B = r3.f3114P;
                                                ae0Var.f176C = r3.f3116R;
                                                ae0Var.f177D = i3;
                                                i6 = 1;
                                            } else if (v51.m6581k(str7)) {
                                                if (r3.f3142r == 0) {
                                                    i11 = r3.f3140p;
                                                    i7 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r3.f3137m;
                                                    }
                                                    r3.f3140p = i11;
                                                    i12 = r3.f3141q;
                                                    if (i12 == -1) {
                                                        i12 = r3.f3138n;
                                                    }
                                                    r3.f3141q = i12;
                                                } else {
                                                    i7 = -1;
                                                }
                                                i8 = r3.f3140p;
                                                if (i8 != i7) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r3.f3149y) {
                                                    if (r3.f3103E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3111111111 = r3.f3150z;
                                                    int i3111111112 = r3.f3100B;
                                                    int i3111111113 = r3.f3099A;
                                                    int i3111111114 = r3.f3139o;
                                                    c1673zp = new C1673zp(i3111111111, i3111111112, i3111111113, bArr, i3111111114, i3111111114);
                                                } else {
                                                    c1673zp = null;
                                                }
                                                str4 = r3.f3125a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r3.f3143s == 0) {
                                                    i9 = iIntValue;
                                                } else {
                                                    i9 = iIntValue;
                                                }
                                                ae0Var.f204t = r3.f3137m;
                                                ae0Var.f205u = r3.f3138n;
                                                ae0Var.f208x = f;
                                                ae0Var.f207w = i9;
                                                ae0Var.f209y = r3.f3147w;
                                                ae0Var.f210z = r3.f3148x;
                                                ae0Var.f174A = c1673zp;
                                                i6 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str7)) {
                                                }
                                                i6 = 3;
                                            }
                                            str5 = r3.f3125a;
                                            if (str5 != null) {
                                                ae0Var.f186b = r3.f3125a;
                                            }
                                            ae0Var.f185a = Integer.toString(i29);
                                            ae0Var.f197m = v51.m6582l(str7);
                                            ae0Var.f198n = i4;
                                            ae0Var.f188d = r3.f3122X;
                                            ae0Var.f189e = i3111111110;
                                            ae0Var.f200p = list5;
                                            ae0Var.f194j = str2;
                                            ae0Var.f201q = r3.f3136l;
                                            be0 be0Var17 = new be0(ae0Var);
                                            c22 c22VarMo750n17 = z80Var18.mo750n(r3.f3127c, i6);
                                            r3.f3123Y = c22VarMo750n17;
                                            c22VarMo750n17.mo1117d(be0Var17);
                                            sparseArray.put(r3.f3127c, r3);
                                            f01Var4 = f01Var2;
                                            break;
                                        case 16:
                                            str7 = "video/av01";
                                            f01Var2 = f01Var9;
                                            i3 = -1;
                                            list4 = null;
                                            i4 = -1;
                                            list = list4;
                                            str2 = null;
                                            list5 = list;
                                            if (r3.f3113O != null) {
                                                str2 = c0101bjM995b.f1383b;
                                                str7 = "video/dolby-vision";
                                            }
                                            boolean z112 = r3.f3121W;
                                            if (r3.f3120V) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i3111111115 = (z112 ? 1 : 0) | i5;
                                            ae0Var = new ae0();
                                            zM6578h = v51.m6578h(str7);
                                            z80 z80Var19 = z80Var;
                                            Map map18 = f3517j0;
                                            if (zM6578h) {
                                                ae0Var.f175B = r3.f3114P;
                                                ae0Var.f176C = r3.f3116R;
                                                ae0Var.f177D = i3;
                                                i6 = 1;
                                            } else if (v51.m6581k(str7)) {
                                                if (r3.f3142r == 0) {
                                                    i11 = r3.f3140p;
                                                    i7 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r3.f3137m;
                                                    }
                                                    r3.f3140p = i11;
                                                    i12 = r3.f3141q;
                                                    if (i12 == -1) {
                                                        i12 = r3.f3138n;
                                                    }
                                                    r3.f3141q = i12;
                                                } else {
                                                    i7 = -1;
                                                }
                                                i8 = r3.f3140p;
                                                if (i8 != i7) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r3.f3149y) {
                                                    if (r3.f3103E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3111111116 = r3.f3150z;
                                                    int i3111111117 = r3.f3100B;
                                                    int i3111111118 = r3.f3099A;
                                                    int i3111111119 = r3.f3139o;
                                                    c1673zp = new C1673zp(i3111111116, i3111111117, i3111111118, bArr, i3111111119, i3111111119);
                                                } else {
                                                    c1673zp = null;
                                                }
                                                str4 = r3.f3125a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r3.f3143s == 0) {
                                                    i9 = iIntValue;
                                                } else {
                                                    i9 = iIntValue;
                                                }
                                                ae0Var.f204t = r3.f3137m;
                                                ae0Var.f205u = r3.f3138n;
                                                ae0Var.f208x = f;
                                                ae0Var.f207w = i9;
                                                ae0Var.f209y = r3.f3147w;
                                                ae0Var.f210z = r3.f3148x;
                                                ae0Var.f174A = c1673zp;
                                                i6 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str7)) {
                                                }
                                                i6 = 3;
                                            }
                                            str5 = r3.f3125a;
                                            if (str5 != null) {
                                                ae0Var.f186b = r3.f3125a;
                                            }
                                            ae0Var.f185a = Integer.toString(i29);
                                            ae0Var.f197m = v51.m6582l(str7);
                                            ae0Var.f198n = i4;
                                            ae0Var.f188d = r3.f3122X;
                                            ae0Var.f189e = i3111111115;
                                            ae0Var.f200p = list5;
                                            ae0Var.f194j = str2;
                                            ae0Var.f201q = r3.f3136l;
                                            be0 be0Var18 = new be0(ae0Var);
                                            c22 c22VarMo750n18 = z80Var19.mo750n(r3.f3127c, i6);
                                            r3.f3123Y = c22VarMo750n18;
                                            c22VarMo750n18.mo1117d(be0Var18);
                                            sparseArray.put(r3.f3127c, r3);
                                            f01Var4 = f01Var2;
                                            break;
                                        case 17:
                                            str7 = "video/x-vnd.on2.vp8";
                                            f01Var2 = f01Var9;
                                            i3 = -1;
                                            list4 = null;
                                            i4 = -1;
                                            list = list4;
                                            str2 = null;
                                            list5 = list;
                                            if (r3.f3113O != null) {
                                                str2 = c0101bjM995b.f1383b;
                                                str7 = "video/dolby-vision";
                                            }
                                            boolean z113 = r3.f3121W;
                                            if (r3.f3120V) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i31111111110 = (z113 ? 1 : 0) | i5;
                                            ae0Var = new ae0();
                                            zM6578h = v51.m6578h(str7);
                                            z80 z80Var110 = z80Var;
                                            Map map19 = f3517j0;
                                            if (zM6578h) {
                                                ae0Var.f175B = r3.f3114P;
                                                ae0Var.f176C = r3.f3116R;
                                                ae0Var.f177D = i3;
                                                i6 = 1;
                                            } else if (v51.m6581k(str7)) {
                                                if (r3.f3142r == 0) {
                                                    i11 = r3.f3140p;
                                                    i7 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r3.f3137m;
                                                    }
                                                    r3.f3140p = i11;
                                                    i12 = r3.f3141q;
                                                    if (i12 == -1) {
                                                        i12 = r3.f3138n;
                                                    }
                                                    r3.f3141q = i12;
                                                } else {
                                                    i7 = -1;
                                                }
                                                i8 = r3.f3140p;
                                                if (i8 != i7) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r3.f3149y) {
                                                    if (r3.f3103E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31111111111 = r3.f3150z;
                                                    int i31111111112 = r3.f3100B;
                                                    int i31111111113 = r3.f3099A;
                                                    int i31111111114 = r3.f3139o;
                                                    c1673zp = new C1673zp(i31111111111, i31111111112, i31111111113, bArr, i31111111114, i31111111114);
                                                } else {
                                                    c1673zp = null;
                                                }
                                                str4 = r3.f3125a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r3.f3143s == 0) {
                                                    i9 = iIntValue;
                                                } else {
                                                    i9 = iIntValue;
                                                }
                                                ae0Var.f204t = r3.f3137m;
                                                ae0Var.f205u = r3.f3138n;
                                                ae0Var.f208x = f;
                                                ae0Var.f207w = i9;
                                                ae0Var.f209y = r3.f3147w;
                                                ae0Var.f210z = r3.f3148x;
                                                ae0Var.f174A = c1673zp;
                                                i6 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str7)) {
                                                }
                                                i6 = 3;
                                            }
                                            str5 = r3.f3125a;
                                            if (str5 != null) {
                                                ae0Var.f186b = r3.f3125a;
                                            }
                                            ae0Var.f185a = Integer.toString(i29);
                                            ae0Var.f197m = v51.m6582l(str7);
                                            ae0Var.f198n = i4;
                                            ae0Var.f188d = r3.f3122X;
                                            ae0Var.f189e = i31111111110;
                                            ae0Var.f200p = list5;
                                            ae0Var.f194j = str2;
                                            ae0Var.f201q = r3.f3136l;
                                            be0 be0Var19 = new be0(ae0Var);
                                            c22 c22VarMo750n19 = z80Var110.mo750n(r3.f3127c, i6);
                                            r3.f3123Y = c22VarMo750n19;
                                            c22VarMo750n19.mo1117d(be0Var19);
                                            sparseArray.put(r3.f3127c, r3);
                                            f01Var4 = f01Var2;
                                            break;
                                        case 18:
                                            str7 = "video/x-vnd.on2.vp9";
                                            f01Var2 = f01Var9;
                                            i3 = -1;
                                            list4 = null;
                                            i4 = -1;
                                            list = list4;
                                            str2 = null;
                                            list5 = list;
                                            if (r3.f3113O != null) {
                                                str2 = c0101bjM995b.f1383b;
                                                str7 = "video/dolby-vision";
                                            }
                                            boolean z114 = r3.f3121W;
                                            if (r3.f3120V) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i31111111115 = (z114 ? 1 : 0) | i5;
                                            ae0Var = new ae0();
                                            zM6578h = v51.m6578h(str7);
                                            z80 z80Var111 = z80Var;
                                            Map map110 = f3517j0;
                                            if (zM6578h) {
                                                ae0Var.f175B = r3.f3114P;
                                                ae0Var.f176C = r3.f3116R;
                                                ae0Var.f177D = i3;
                                                i6 = 1;
                                            } else if (v51.m6581k(str7)) {
                                                if (r3.f3142r == 0) {
                                                    i11 = r3.f3140p;
                                                    i7 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r3.f3137m;
                                                    }
                                                    r3.f3140p = i11;
                                                    i12 = r3.f3141q;
                                                    if (i12 == -1) {
                                                        i12 = r3.f3138n;
                                                    }
                                                    r3.f3141q = i12;
                                                } else {
                                                    i7 = -1;
                                                }
                                                i8 = r3.f3140p;
                                                if (i8 != i7) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r3.f3149y) {
                                                    if (r3.f3103E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31111111116 = r3.f3150z;
                                                    int i31111111117 = r3.f3100B;
                                                    int i31111111118 = r3.f3099A;
                                                    int i31111111119 = r3.f3139o;
                                                    c1673zp = new C1673zp(i31111111116, i31111111117, i31111111118, bArr, i31111111119, i31111111119);
                                                } else {
                                                    c1673zp = null;
                                                }
                                                str4 = r3.f3125a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r3.f3143s == 0) {
                                                    i9 = iIntValue;
                                                } else {
                                                    i9 = iIntValue;
                                                }
                                                ae0Var.f204t = r3.f3137m;
                                                ae0Var.f205u = r3.f3138n;
                                                ae0Var.f208x = f;
                                                ae0Var.f207w = i9;
                                                ae0Var.f209y = r3.f3147w;
                                                ae0Var.f210z = r3.f3148x;
                                                ae0Var.f174A = c1673zp;
                                                i6 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str7)) {
                                                }
                                                i6 = 3;
                                            }
                                            str5 = r3.f3125a;
                                            if (str5 != null) {
                                                ae0Var.f186b = r3.f3125a;
                                            }
                                            ae0Var.f185a = Integer.toString(i29);
                                            ae0Var.f197m = v51.m6582l(str7);
                                            ae0Var.f198n = i4;
                                            ae0Var.f188d = r3.f3122X;
                                            ae0Var.f189e = i31111111115;
                                            ae0Var.f200p = list5;
                                            ae0Var.f194j = str2;
                                            ae0Var.f201q = r3.f3136l;
                                            be0 be0Var110 = new be0(ae0Var);
                                            c22 c22VarMo750n110 = z80Var111.mo750n(r3.f3127c, i6);
                                            r3.f3123Y = c22VarMo750n110;
                                            c22VarMo750n110.mo1117d(be0Var110);
                                            sparseArray.put(r3.f3127c, r3);
                                            f01Var4 = f01Var2;
                                            break;
                                        case 19:
                                            z80Var = z80Var;
                                            f01Var2 = f01Var9;
                                            str7 = "application/pgs";
                                            i3 = -1;
                                            list4 = null;
                                            i4 = -1;
                                            list = list4;
                                            str2 = null;
                                            list5 = list;
                                            if (r3.f3113O != null) {
                                                str2 = c0101bjM995b.f1383b;
                                                str7 = "video/dolby-vision";
                                            }
                                            boolean z115 = r3.f3121W;
                                            if (r3.f3120V) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i311111111110 = (z115 ? 1 : 0) | i5;
                                            ae0Var = new ae0();
                                            zM6578h = v51.m6578h(str7);
                                            z80 z80Var112 = z80Var;
                                            Map map111 = f3517j0;
                                            if (zM6578h) {
                                                ae0Var.f175B = r3.f3114P;
                                                ae0Var.f176C = r3.f3116R;
                                                ae0Var.f177D = i3;
                                                i6 = 1;
                                            } else if (v51.m6581k(str7)) {
                                                if (r3.f3142r == 0) {
                                                    i11 = r3.f3140p;
                                                    i7 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r3.f3137m;
                                                    }
                                                    r3.f3140p = i11;
                                                    i12 = r3.f3141q;
                                                    if (i12 == -1) {
                                                        i12 = r3.f3138n;
                                                    }
                                                    r3.f3141q = i12;
                                                } else {
                                                    i7 = -1;
                                                }
                                                i8 = r3.f3140p;
                                                if (i8 != i7) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r3.f3149y) {
                                                    if (r3.f3103E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i311111111111 = r3.f3150z;
                                                    int i311111111112 = r3.f3100B;
                                                    int i311111111113 = r3.f3099A;
                                                    int i311111111114 = r3.f3139o;
                                                    c1673zp = new C1673zp(i311111111111, i311111111112, i311111111113, bArr, i311111111114, i311111111114);
                                                } else {
                                                    c1673zp = null;
                                                }
                                                str4 = r3.f3125a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r3.f3143s == 0) {
                                                    i9 = iIntValue;
                                                } else {
                                                    i9 = iIntValue;
                                                }
                                                ae0Var.f204t = r3.f3137m;
                                                ae0Var.f205u = r3.f3138n;
                                                ae0Var.f208x = f;
                                                ae0Var.f207w = i9;
                                                ae0Var.f209y = r3.f3147w;
                                                ae0Var.f210z = r3.f3148x;
                                                ae0Var.f174A = c1673zp;
                                                i6 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str7)) {
                                                }
                                                i6 = 3;
                                            }
                                            str5 = r3.f3125a;
                                            if (str5 != null) {
                                                ae0Var.f186b = r3.f3125a;
                                            }
                                            ae0Var.f185a = Integer.toString(i29);
                                            ae0Var.f197m = v51.m6582l(str7);
                                            ae0Var.f198n = i4;
                                            ae0Var.f188d = r3.f3122X;
                                            ae0Var.f189e = i311111111110;
                                            ae0Var.f200p = list5;
                                            ae0Var.f194j = str2;
                                            ae0Var.f201q = r3.f3136l;
                                            be0 be0Var111 = new be0(ae0Var);
                                            c22 c22VarMo750n111 = z80Var112.mo750n(r3.f3127c, i6);
                                            r3.f3123Y = c22VarMo750n111;
                                            c22VarMo750n111.mo1117d(be0Var111);
                                            sparseArray.put(r3.f3127c, r3);
                                            f01Var4 = f01Var2;
                                            break;
                                        case 20:
                                            z80Var = z80Var;
                                            f01Var2 = f01Var9;
                                            i3 = -1;
                                            list4 = null;
                                            i4 = -1;
                                            list = list4;
                                            str2 = null;
                                            list5 = list;
                                            if (r3.f3113O != null) {
                                                str2 = c0101bjM995b.f1383b;
                                                str7 = "video/dolby-vision";
                                            }
                                            boolean z116 = r3.f3121W;
                                            if (r3.f3120V) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i311111111115 = (z116 ? 1 : 0) | i5;
                                            ae0Var = new ae0();
                                            zM6578h = v51.m6578h(str7);
                                            z80 z80Var113 = z80Var;
                                            Map map112 = f3517j0;
                                            if (zM6578h) {
                                                ae0Var.f175B = r3.f3114P;
                                                ae0Var.f176C = r3.f3116R;
                                                ae0Var.f177D = i3;
                                                i6 = 1;
                                            } else if (v51.m6581k(str7)) {
                                                if (r3.f3142r == 0) {
                                                    i11 = r3.f3140p;
                                                    i7 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r3.f3137m;
                                                    }
                                                    r3.f3140p = i11;
                                                    i12 = r3.f3141q;
                                                    if (i12 == -1) {
                                                        i12 = r3.f3138n;
                                                    }
                                                    r3.f3141q = i12;
                                                } else {
                                                    i7 = -1;
                                                }
                                                i8 = r3.f3140p;
                                                if (i8 != i7) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r3.f3149y) {
                                                    if (r3.f3103E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i311111111116 = r3.f3150z;
                                                    int i311111111117 = r3.f3100B;
                                                    int i311111111118 = r3.f3099A;
                                                    int i311111111119 = r3.f3139o;
                                                    c1673zp = new C1673zp(i311111111116, i311111111117, i311111111118, bArr, i311111111119, i311111111119);
                                                } else {
                                                    c1673zp = null;
                                                }
                                                str4 = r3.f3125a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r3.f3143s == 0) {
                                                    i9 = iIntValue;
                                                } else {
                                                    i9 = iIntValue;
                                                }
                                                ae0Var.f204t = r3.f3137m;
                                                ae0Var.f205u = r3.f3138n;
                                                ae0Var.f208x = f;
                                                ae0Var.f207w = i9;
                                                ae0Var.f209y = r3.f3147w;
                                                ae0Var.f210z = r3.f3148x;
                                                ae0Var.f174A = c1673zp;
                                                i6 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str7)) {
                                                }
                                                i6 = 3;
                                            }
                                            str5 = r3.f3125a;
                                            if (str5 != null) {
                                                ae0Var.f186b = r3.f3125a;
                                            }
                                            ae0Var.f185a = Integer.toString(i29);
                                            ae0Var.f197m = v51.m6582l(str7);
                                            ae0Var.f198n = i4;
                                            ae0Var.f188d = r3.f3122X;
                                            ae0Var.f189e = i311111111115;
                                            ae0Var.f200p = list5;
                                            ae0Var.f194j = str2;
                                            ae0Var.f201q = r3.f3136l;
                                            be0 be0Var112 = new be0(ae0Var);
                                            c22 c22VarMo750n112 = z80Var113.mo750n(r3.f3127c, i6);
                                            r3.f3123Y = c22VarMo750n112;
                                            c22VarMo750n112.mo1117d(be0Var112);
                                            sparseArray.put(r3.f3127c, r3);
                                            f01Var4 = f01Var2;
                                            break;
                                        case 22:
                                            z80Var = z80Var;
                                            f01Var3 = f01Var9;
                                            if (r3.f3115Q == 32) {
                                                f01Var2 = f01Var3;
                                                str7 = "audio/raw";
                                                i3 = 4;
                                            } else {
                                                AbstractC1337qm.m5542i0("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + r3.f3115Q + ". Setting mimeType to audio/x-unknown");
                                                f01Var2 = f01Var3;
                                                str7 = "audio/x-unknown";
                                                i3 = -1;
                                            }
                                            list4 = null;
                                            i4 = -1;
                                            list = list4;
                                            str2 = null;
                                            list5 = list;
                                            if (r3.f3113O != null) {
                                                str2 = c0101bjM995b.f1383b;
                                                str7 = "video/dolby-vision";
                                            }
                                            boolean z117 = r3.f3121W;
                                            if (r3.f3120V) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i3111111111110 = (z117 ? 1 : 0) | i5;
                                            ae0Var = new ae0();
                                            zM6578h = v51.m6578h(str7);
                                            z80 z80Var114 = z80Var;
                                            Map map113 = f3517j0;
                                            if (zM6578h) {
                                                ae0Var.f175B = r3.f3114P;
                                                ae0Var.f176C = r3.f3116R;
                                                ae0Var.f177D = i3;
                                                i6 = 1;
                                            } else if (v51.m6581k(str7)) {
                                                if (r3.f3142r == 0) {
                                                    i11 = r3.f3140p;
                                                    i7 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r3.f3137m;
                                                    }
                                                    r3.f3140p = i11;
                                                    i12 = r3.f3141q;
                                                    if (i12 == -1) {
                                                        i12 = r3.f3138n;
                                                    }
                                                    r3.f3141q = i12;
                                                } else {
                                                    i7 = -1;
                                                }
                                                i8 = r3.f3140p;
                                                if (i8 != i7) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r3.f3149y) {
                                                    if (r3.f3103E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3111111111111 = r3.f3150z;
                                                    int i3111111111112 = r3.f3100B;
                                                    int i3111111111113 = r3.f3099A;
                                                    int i3111111111114 = r3.f3139o;
                                                    c1673zp = new C1673zp(i3111111111111, i3111111111112, i3111111111113, bArr, i3111111111114, i3111111111114);
                                                } else {
                                                    c1673zp = null;
                                                }
                                                str4 = r3.f3125a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r3.f3143s == 0) {
                                                    i9 = iIntValue;
                                                } else {
                                                    i9 = iIntValue;
                                                }
                                                ae0Var.f204t = r3.f3137m;
                                                ae0Var.f205u = r3.f3138n;
                                                ae0Var.f208x = f;
                                                ae0Var.f207w = i9;
                                                ae0Var.f209y = r3.f3147w;
                                                ae0Var.f210z = r3.f3148x;
                                                ae0Var.f174A = c1673zp;
                                                i6 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str7)) {
                                                }
                                                i6 = 3;
                                            }
                                            str5 = r3.f3125a;
                                            if (str5 != null) {
                                                ae0Var.f186b = r3.f3125a;
                                            }
                                            ae0Var.f185a = Integer.toString(i29);
                                            ae0Var.f197m = v51.m6582l(str7);
                                            ae0Var.f198n = i4;
                                            ae0Var.f188d = r3.f3122X;
                                            ae0Var.f189e = i3111111111110;
                                            ae0Var.f200p = list5;
                                            ae0Var.f194j = str2;
                                            ae0Var.f201q = r3.f3136l;
                                            be0 be0Var113 = new be0(ae0Var);
                                            c22 c22VarMo750n113 = z80Var114.mo750n(r3.f3127c, i6);
                                            r3.f3123Y = c22VarMo750n113;
                                            c22VarMo750n113.mo1117d(be0Var113);
                                            sparseArray.put(r3.f3127c, r3);
                                            f01Var4 = f01Var2;
                                            break;
                                        case 23:
                                            z80Var = z80Var;
                                            f01Var3 = f01Var9;
                                            int i52 = r3.f3115Q;
                                            if (i52 == 8) {
                                                f01Var2 = f01Var3;
                                                str7 = "audio/raw";
                                                i3 = 3;
                                            } else {
                                                if (i52 == 16) {
                                                    i3 = 268435456;
                                                } else if (i52 == 24) {
                                                    i3 = 1342177280;
                                                } else if (i52 == 32) {
                                                    i3 = 1610612736;
                                                } else {
                                                    AbstractC1337qm.m5542i0("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + r3.f3115Q + ". Setting mimeType to audio/x-unknown");
                                                    f01Var2 = f01Var3;
                                                    str7 = "audio/x-unknown";
                                                    i3 = -1;
                                                }
                                                f01Var2 = f01Var3;
                                                str7 = "audio/raw";
                                            }
                                            list4 = null;
                                            i4 = -1;
                                            list = list4;
                                            str2 = null;
                                            list5 = list;
                                            if (r3.f3113O != null) {
                                                str2 = c0101bjM995b.f1383b;
                                                str7 = "video/dolby-vision";
                                            }
                                            boolean z118 = r3.f3121W;
                                            if (r3.f3120V) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i3111111111115 = (z118 ? 1 : 0) | i5;
                                            ae0Var = new ae0();
                                            zM6578h = v51.m6578h(str7);
                                            z80 z80Var115 = z80Var;
                                            Map map114 = f3517j0;
                                            if (zM6578h) {
                                                ae0Var.f175B = r3.f3114P;
                                                ae0Var.f176C = r3.f3116R;
                                                ae0Var.f177D = i3;
                                                i6 = 1;
                                            } else if (v51.m6581k(str7)) {
                                                if (r3.f3142r == 0) {
                                                    i11 = r3.f3140p;
                                                    i7 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r3.f3137m;
                                                    }
                                                    r3.f3140p = i11;
                                                    i12 = r3.f3141q;
                                                    if (i12 == -1) {
                                                        i12 = r3.f3138n;
                                                    }
                                                    r3.f3141q = i12;
                                                } else {
                                                    i7 = -1;
                                                }
                                                i8 = r3.f3140p;
                                                if (i8 != i7) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r3.f3149y) {
                                                    if (r3.f3103E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3111111111116 = r3.f3150z;
                                                    int i3111111111117 = r3.f3100B;
                                                    int i3111111111118 = r3.f3099A;
                                                    int i3111111111119 = r3.f3139o;
                                                    c1673zp = new C1673zp(i3111111111116, i3111111111117, i3111111111118, bArr, i3111111111119, i3111111111119);
                                                } else {
                                                    c1673zp = null;
                                                }
                                                str4 = r3.f3125a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r3.f3143s == 0) {
                                                    i9 = iIntValue;
                                                } else {
                                                    i9 = iIntValue;
                                                }
                                                ae0Var.f204t = r3.f3137m;
                                                ae0Var.f205u = r3.f3138n;
                                                ae0Var.f208x = f;
                                                ae0Var.f207w = i9;
                                                ae0Var.f209y = r3.f3147w;
                                                ae0Var.f210z = r3.f3148x;
                                                ae0Var.f174A = c1673zp;
                                                i6 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str7)) {
                                                }
                                                i6 = 3;
                                            }
                                            str5 = r3.f3125a;
                                            if (str5 != null) {
                                                ae0Var.f186b = r3.f3125a;
                                            }
                                            ae0Var.f185a = Integer.toString(i29);
                                            ae0Var.f197m = v51.m6582l(str7);
                                            ae0Var.f198n = i4;
                                            ae0Var.f188d = r3.f3122X;
                                            ae0Var.f189e = i3111111111115;
                                            ae0Var.f200p = list5;
                                            ae0Var.f194j = str2;
                                            ae0Var.f201q = r3.f3136l;
                                            be0 be0Var114 = new be0(ae0Var);
                                            c22 c22VarMo750n114 = z80Var115.mo750n(r3.f3127c, i6);
                                            r3.f3123Y = c22VarMo750n114;
                                            c22VarMo750n114.mo1117d(be0Var114);
                                            sparseArray.put(r3.f3127c, r3);
                                            f01Var4 = f01Var2;
                                            break;
                                        case 24:
                                            z80Var = z80Var;
                                            f01Var3 = f01Var9;
                                            int iM7244r2 = z42.m7244r(r3.f3115Q);
                                            if (iM7244r2 == 0) {
                                                AbstractC1337qm.m5542i0("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + r3.f3115Q + ". Setting mimeType to audio/x-unknown");
                                                f01Var2 = f01Var3;
                                                str7 = "audio/x-unknown";
                                                i3 = -1;
                                                list4 = null;
                                                i4 = -1;
                                                list = list4;
                                                str2 = null;
                                                list5 = list;
                                                if (r3.f3113O != null) {
                                                    str2 = c0101bjM995b.f1383b;
                                                    str7 = "video/dolby-vision";
                                                }
                                                boolean z119 = r3.f3121W;
                                                if (r3.f3120V) {
                                                    i5 = 2;
                                                } else {
                                                    i5 = 0;
                                                }
                                                int i31111111111110 = (z119 ? 1 : 0) | i5;
                                                ae0Var = new ae0();
                                                zM6578h = v51.m6578h(str7);
                                                z80 z80Var116 = z80Var;
                                                Map map115 = f3517j0;
                                                if (zM6578h) {
                                                    ae0Var.f175B = r3.f3114P;
                                                    ae0Var.f176C = r3.f3116R;
                                                    ae0Var.f177D = i3;
                                                    i6 = 1;
                                                } else if (v51.m6581k(str7)) {
                                                    if (r3.f3142r == 0) {
                                                        i11 = r3.f3140p;
                                                        i7 = -1;
                                                        if (i11 == -1) {
                                                            i11 = r3.f3137m;
                                                        }
                                                        r3.f3140p = i11;
                                                        i12 = r3.f3141q;
                                                        if (i12 == -1) {
                                                            i12 = r3.f3138n;
                                                        }
                                                        r3.f3141q = i12;
                                                    } else {
                                                        i7 = -1;
                                                    }
                                                    i8 = r3.f3140p;
                                                    if (i8 != i7) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (r3.f3149y) {
                                                        if (r3.f3103E != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i31111111111111 = r3.f3150z;
                                                        int i31111111111112 = r3.f3100B;
                                                        int i31111111111113 = r3.f3099A;
                                                        int i31111111111114 = r3.f3139o;
                                                        c1673zp = new C1673zp(i31111111111111, i31111111111112, i31111111111113, bArr, i31111111111114, i31111111111114);
                                                    } else {
                                                        c1673zp = null;
                                                    }
                                                    str4 = r3.f3125a;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r3.f3143s == 0) {
                                                        i9 = iIntValue;
                                                    } else {
                                                        i9 = iIntValue;
                                                    }
                                                    ae0Var.f204t = r3.f3137m;
                                                    ae0Var.f205u = r3.f3138n;
                                                    ae0Var.f208x = f;
                                                    ae0Var.f207w = i9;
                                                    ae0Var.f209y = r3.f3147w;
                                                    ae0Var.f210z = r3.f3148x;
                                                    ae0Var.f174A = c1673zp;
                                                    i6 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str7)) {
                                                    }
                                                    i6 = 3;
                                                }
                                                str5 = r3.f3125a;
                                                if (str5 != null) {
                                                    ae0Var.f186b = r3.f3125a;
                                                }
                                                ae0Var.f185a = Integer.toString(i29);
                                                ae0Var.f197m = v51.m6582l(str7);
                                                ae0Var.f198n = i4;
                                                ae0Var.f188d = r3.f3122X;
                                                ae0Var.f189e = i31111111111110;
                                                ae0Var.f200p = list5;
                                                ae0Var.f194j = str2;
                                                ae0Var.f201q = r3.f3136l;
                                                be0 be0Var115 = new be0(ae0Var);
                                                c22 c22VarMo750n115 = z80Var116.mo750n(r3.f3127c, i6);
                                                r3.f3123Y = c22VarMo750n115;
                                                c22VarMo750n115.mo1117d(be0Var115);
                                                sparseArray.put(r3.f3127c, r3);
                                                f01Var4 = f01Var2;
                                            } else {
                                                i3 = iM7244r2;
                                                f01Var2 = f01Var3;
                                                str7 = "audio/raw";
                                                list4 = null;
                                                i4 = -1;
                                                list = list4;
                                                str2 = null;
                                                list5 = list;
                                                if (r3.f3113O != null) {
                                                    str2 = c0101bjM995b.f1383b;
                                                    str7 = "video/dolby-vision";
                                                }
                                                boolean z1110 = r3.f3121W;
                                                if (r3.f3120V) {
                                                    i5 = 2;
                                                } else {
                                                    i5 = 0;
                                                }
                                                int i31111111111115 = (z1110 ? 1 : 0) | i5;
                                                ae0Var = new ae0();
                                                zM6578h = v51.m6578h(str7);
                                                z80 z80Var117 = z80Var;
                                                Map map116 = f3517j0;
                                                if (zM6578h) {
                                                    ae0Var.f175B = r3.f3114P;
                                                    ae0Var.f176C = r3.f3116R;
                                                    ae0Var.f177D = i3;
                                                    i6 = 1;
                                                } else if (v51.m6581k(str7)) {
                                                    if (r3.f3142r == 0) {
                                                        i11 = r3.f3140p;
                                                        i7 = -1;
                                                        if (i11 == -1) {
                                                            i11 = r3.f3137m;
                                                        }
                                                        r3.f3140p = i11;
                                                        i12 = r3.f3141q;
                                                        if (i12 == -1) {
                                                            i12 = r3.f3138n;
                                                        }
                                                        r3.f3141q = i12;
                                                    } else {
                                                        i7 = -1;
                                                    }
                                                    i8 = r3.f3140p;
                                                    if (i8 != i7) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (r3.f3149y) {
                                                        if (r3.f3103E != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i31111111111116 = r3.f3150z;
                                                        int i31111111111117 = r3.f3100B;
                                                        int i31111111111118 = r3.f3099A;
                                                        int i31111111111119 = r3.f3139o;
                                                        c1673zp = new C1673zp(i31111111111116, i31111111111117, i31111111111118, bArr, i31111111111119, i31111111111119);
                                                    } else {
                                                        c1673zp = null;
                                                    }
                                                    str4 = r3.f3125a;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r3.f3143s == 0) {
                                                        i9 = iIntValue;
                                                    } else {
                                                        i9 = iIntValue;
                                                    }
                                                    ae0Var.f204t = r3.f3137m;
                                                    ae0Var.f205u = r3.f3138n;
                                                    ae0Var.f208x = f;
                                                    ae0Var.f207w = i9;
                                                    ae0Var.f209y = r3.f3147w;
                                                    ae0Var.f210z = r3.f3148x;
                                                    ae0Var.f174A = c1673zp;
                                                    i6 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str7)) {
                                                    }
                                                    i6 = 3;
                                                }
                                                str5 = r3.f3125a;
                                                if (str5 != null) {
                                                    ae0Var.f186b = r3.f3125a;
                                                }
                                                ae0Var.f185a = Integer.toString(i29);
                                                ae0Var.f197m = v51.m6582l(str7);
                                                ae0Var.f198n = i4;
                                                ae0Var.f188d = r3.f3122X;
                                                ae0Var.f189e = i31111111111115;
                                                ae0Var.f200p = list5;
                                                ae0Var.f194j = str2;
                                                ae0Var.f201q = r3.f3136l;
                                                be0 be0Var116 = new be0(ae0Var);
                                                c22 c22VarMo750n116 = z80Var117.mo750n(r3.f3127c, i6);
                                                r3.f3123Y = c22VarMo750n116;
                                                c22VarMo750n116.mo1117d(be0Var116);
                                                sparseArray.put(r3.f3127c, r3);
                                                f01Var4 = f01Var2;
                                            }
                                            break;
                                        case 25:
                                            listSingletonList = qm0.m5571u(f3513f0, r3.m2442a(str6));
                                            f01Var2 = f01Var9;
                                            str7 = "text/x-ssa";
                                            i3 = -1;
                                            list4 = listSingletonList;
                                            i4 = -1;
                                            list = list4;
                                            str2 = null;
                                            list5 = list;
                                            if (r3.f3113O != null) {
                                                str2 = c0101bjM995b.f1383b;
                                                str7 = "video/dolby-vision";
                                            }
                                            boolean z1111 = r3.f3121W;
                                            if (r3.f3120V) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i311111111111110 = (z1111 ? 1 : 0) | i5;
                                            ae0Var = new ae0();
                                            zM6578h = v51.m6578h(str7);
                                            z80 z80Var118 = z80Var;
                                            Map map117 = f3517j0;
                                            if (zM6578h) {
                                                ae0Var.f175B = r3.f3114P;
                                                ae0Var.f176C = r3.f3116R;
                                                ae0Var.f177D = i3;
                                                i6 = 1;
                                            } else if (v51.m6581k(str7)) {
                                                if (r3.f3142r == 0) {
                                                    i11 = r3.f3140p;
                                                    i7 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r3.f3137m;
                                                    }
                                                    r3.f3140p = i11;
                                                    i12 = r3.f3141q;
                                                    if (i12 == -1) {
                                                        i12 = r3.f3138n;
                                                    }
                                                    r3.f3141q = i12;
                                                } else {
                                                    i7 = -1;
                                                }
                                                i8 = r3.f3140p;
                                                if (i8 != i7) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r3.f3149y) {
                                                    if (r3.f3103E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i311111111111111 = r3.f3150z;
                                                    int i311111111111112 = r3.f3100B;
                                                    int i311111111111113 = r3.f3099A;
                                                    int i311111111111114 = r3.f3139o;
                                                    c1673zp = new C1673zp(i311111111111111, i311111111111112, i311111111111113, bArr, i311111111111114, i311111111111114);
                                                } else {
                                                    c1673zp = null;
                                                }
                                                str4 = r3.f3125a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r3.f3143s == 0) {
                                                    i9 = iIntValue;
                                                } else {
                                                    i9 = iIntValue;
                                                }
                                                ae0Var.f204t = r3.f3137m;
                                                ae0Var.f205u = r3.f3138n;
                                                ae0Var.f208x = f;
                                                ae0Var.f207w = i9;
                                                ae0Var.f209y = r3.f3147w;
                                                ae0Var.f210z = r3.f3148x;
                                                ae0Var.f174A = c1673zp;
                                                i6 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str7)) {
                                                }
                                                i6 = 3;
                                            }
                                            str5 = r3.f3125a;
                                            if (str5 != null) {
                                                ae0Var.f186b = r3.f3125a;
                                            }
                                            ae0Var.f185a = Integer.toString(i29);
                                            ae0Var.f197m = v51.m6582l(str7);
                                            ae0Var.f198n = i4;
                                            ae0Var.f188d = r3.f3122X;
                                            ae0Var.f189e = i311111111111110;
                                            ae0Var.f200p = list5;
                                            ae0Var.f194j = str2;
                                            ae0Var.f201q = r3.f3136l;
                                            be0 be0Var117 = new be0(ae0Var);
                                            c22 c22VarMo750n117 = z80Var118.mo750n(r3.f3127c, i6);
                                            r3.f3123Y = c22VarMo750n117;
                                            c22VarMo750n117.mo1117d(be0Var117);
                                            sparseArray.put(r3.f3127c, r3);
                                            f01Var4 = f01Var2;
                                            break;
                                        case InjectionMetrics.I_MAX_ACTIVE_REJ /* 26 */:
                                            ik0 ik0VarM3444a = ik0.m3444a(new dc1(r3.m2442a(r3.f3126b)), false, null);
                                            List list7 = ik0VarM3444a.f5045a;
                                            r3.f3124Z = ik0VarM3444a.f5046b;
                                            str3 = ik0VarM3444a.f5055k;
                                            str7 = "video/hevc";
                                            list3 = list7;
                                            str2 = str3;
                                            f01Var2 = f01Var9;
                                            list2 = list3;
                                            i3 = -1;
                                            i4 = -1;
                                            list5 = list2;
                                            if (r3.f3113O != null) {
                                                str2 = c0101bjM995b.f1383b;
                                                str7 = "video/dolby-vision";
                                            }
                                            boolean z1112 = r3.f3121W;
                                            if (r3.f3120V) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i311111111111115 = (z1112 ? 1 : 0) | i5;
                                            ae0Var = new ae0();
                                            zM6578h = v51.m6578h(str7);
                                            z80 z80Var119 = z80Var;
                                            Map map118 = f3517j0;
                                            if (zM6578h) {
                                                ae0Var.f175B = r3.f3114P;
                                                ae0Var.f176C = r3.f3116R;
                                                ae0Var.f177D = i3;
                                                i6 = 1;
                                            } else if (v51.m6581k(str7)) {
                                                if (r3.f3142r == 0) {
                                                    i11 = r3.f3140p;
                                                    i7 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r3.f3137m;
                                                    }
                                                    r3.f3140p = i11;
                                                    i12 = r3.f3141q;
                                                    if (i12 == -1) {
                                                        i12 = r3.f3138n;
                                                    }
                                                    r3.f3141q = i12;
                                                } else {
                                                    i7 = -1;
                                                }
                                                i8 = r3.f3140p;
                                                if (i8 != i7) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r3.f3149y) {
                                                    if (r3.f3103E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i311111111111116 = r3.f3150z;
                                                    int i311111111111117 = r3.f3100B;
                                                    int i311111111111118 = r3.f3099A;
                                                    int i311111111111119 = r3.f3139o;
                                                    c1673zp = new C1673zp(i311111111111116, i311111111111117, i311111111111118, bArr, i311111111111119, i311111111111119);
                                                } else {
                                                    c1673zp = null;
                                                }
                                                str4 = r3.f3125a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r3.f3143s == 0) {
                                                    i9 = iIntValue;
                                                } else {
                                                    i9 = iIntValue;
                                                }
                                                ae0Var.f204t = r3.f3137m;
                                                ae0Var.f205u = r3.f3138n;
                                                ae0Var.f208x = f;
                                                ae0Var.f207w = i9;
                                                ae0Var.f209y = r3.f3147w;
                                                ae0Var.f210z = r3.f3148x;
                                                ae0Var.f174A = c1673zp;
                                                i6 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str7)) {
                                                }
                                                i6 = 3;
                                            }
                                            str5 = r3.f3125a;
                                            if (str5 != null) {
                                                ae0Var.f186b = r3.f3125a;
                                            }
                                            ae0Var.f185a = Integer.toString(i29);
                                            ae0Var.f197m = v51.m6582l(str7);
                                            ae0Var.f198n = i4;
                                            ae0Var.f188d = r3.f3122X;
                                            ae0Var.f189e = i311111111111115;
                                            ae0Var.f200p = list5;
                                            ae0Var.f194j = str2;
                                            ae0Var.f201q = r3.f3136l;
                                            be0 be0Var118 = new be0(ae0Var);
                                            c22 c22VarMo750n118 = z80Var119.mo750n(r3.f3127c, i6);
                                            r3.f3123Y = c22VarMo750n118;
                                            c22VarMo750n118.mo1117d(be0Var118);
                                            sparseArray.put(r3.f3127c, r3);
                                            f01Var4 = f01Var2;
                                            break;
                                        case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                                            z80Var = z80Var;
                                            f01Var2 = f01Var9;
                                            str7 = "text/vtt";
                                            i3 = -1;
                                            list4 = null;
                                            i4 = -1;
                                            list = list4;
                                            str2 = null;
                                            list5 = list;
                                            if (r3.f3113O != null) {
                                                str2 = c0101bjM995b.f1383b;
                                                str7 = "video/dolby-vision";
                                            }
                                            boolean z1113 = r3.f3121W;
                                            if (r3.f3120V) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i3111111111111110 = (z1113 ? 1 : 0) | i5;
                                            ae0Var = new ae0();
                                            zM6578h = v51.m6578h(str7);
                                            z80 z80Var1110 = z80Var;
                                            Map map119 = f3517j0;
                                            if (zM6578h) {
                                                ae0Var.f175B = r3.f3114P;
                                                ae0Var.f176C = r3.f3116R;
                                                ae0Var.f177D = i3;
                                                i6 = 1;
                                            } else if (v51.m6581k(str7)) {
                                                if (r3.f3142r == 0) {
                                                    i11 = r3.f3140p;
                                                    i7 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r3.f3137m;
                                                    }
                                                    r3.f3140p = i11;
                                                    i12 = r3.f3141q;
                                                    if (i12 == -1) {
                                                        i12 = r3.f3138n;
                                                    }
                                                    r3.f3141q = i12;
                                                } else {
                                                    i7 = -1;
                                                }
                                                i8 = r3.f3140p;
                                                if (i8 != i7) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r3.f3149y) {
                                                    if (r3.f3103E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3111111111111111 = r3.f3150z;
                                                    int i3111111111111112 = r3.f3100B;
                                                    int i3111111111111113 = r3.f3099A;
                                                    int i3111111111111114 = r3.f3139o;
                                                    c1673zp = new C1673zp(i3111111111111111, i3111111111111112, i3111111111111113, bArr, i3111111111111114, i3111111111111114);
                                                } else {
                                                    c1673zp = null;
                                                }
                                                str4 = r3.f3125a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r3.f3143s == 0) {
                                                    i9 = iIntValue;
                                                } else {
                                                    i9 = iIntValue;
                                                }
                                                ae0Var.f204t = r3.f3137m;
                                                ae0Var.f205u = r3.f3138n;
                                                ae0Var.f208x = f;
                                                ae0Var.f207w = i9;
                                                ae0Var.f209y = r3.f3147w;
                                                ae0Var.f210z = r3.f3148x;
                                                ae0Var.f174A = c1673zp;
                                                i6 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str7)) {
                                                }
                                                i6 = 3;
                                            }
                                            str5 = r3.f3125a;
                                            if (str5 != null) {
                                                ae0Var.f186b = r3.f3125a;
                                            }
                                            ae0Var.f185a = Integer.toString(i29);
                                            ae0Var.f197m = v51.m6582l(str7);
                                            ae0Var.f198n = i4;
                                            ae0Var.f188d = r3.f3122X;
                                            ae0Var.f189e = i3111111111111110;
                                            ae0Var.f200p = list5;
                                            ae0Var.f194j = str2;
                                            ae0Var.f201q = r3.f3136l;
                                            be0 be0Var119 = new be0(ae0Var);
                                            c22 c22VarMo750n119 = z80Var1110.mo750n(r3.f3127c, i6);
                                            r3.f3123Y = c22VarMo750n119;
                                            c22VarMo750n119.mo1117d(be0Var119);
                                            sparseArray.put(r3.f3127c, r3);
                                            f01Var4 = f01Var2;
                                            break;
                                        case InjectionMetrics.I_AIM_LOOP_TICKS /* 28 */:
                                            z80Var = z80Var;
                                            f01Var2 = f01Var9;
                                            str7 = "application/x-subrip";
                                            i3 = -1;
                                            list4 = null;
                                            i4 = -1;
                                            list = list4;
                                            str2 = null;
                                            list5 = list;
                                            if (r3.f3113O != null) {
                                                str2 = c0101bjM995b.f1383b;
                                                str7 = "video/dolby-vision";
                                            }
                                            boolean z1114 = r3.f3121W;
                                            if (r3.f3120V) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i3111111111111115 = (z1114 ? 1 : 0) | i5;
                                            ae0Var = new ae0();
                                            zM6578h = v51.m6578h(str7);
                                            z80 z80Var1111 = z80Var;
                                            Map map1110 = f3517j0;
                                            if (zM6578h) {
                                                ae0Var.f175B = r3.f3114P;
                                                ae0Var.f176C = r3.f3116R;
                                                ae0Var.f177D = i3;
                                                i6 = 1;
                                            } else if (v51.m6581k(str7)) {
                                                if (r3.f3142r == 0) {
                                                    i11 = r3.f3140p;
                                                    i7 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r3.f3137m;
                                                    }
                                                    r3.f3140p = i11;
                                                    i12 = r3.f3141q;
                                                    if (i12 == -1) {
                                                        i12 = r3.f3138n;
                                                    }
                                                    r3.f3141q = i12;
                                                } else {
                                                    i7 = -1;
                                                }
                                                i8 = r3.f3140p;
                                                if (i8 != i7) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r3.f3149y) {
                                                    if (r3.f3103E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3111111111111116 = r3.f3150z;
                                                    int i3111111111111117 = r3.f3100B;
                                                    int i3111111111111118 = r3.f3099A;
                                                    int i3111111111111119 = r3.f3139o;
                                                    c1673zp = new C1673zp(i3111111111111116, i3111111111111117, i3111111111111118, bArr, i3111111111111119, i3111111111111119);
                                                } else {
                                                    c1673zp = null;
                                                }
                                                str4 = r3.f3125a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r3.f3143s == 0) {
                                                    i9 = iIntValue;
                                                } else {
                                                    i9 = iIntValue;
                                                }
                                                ae0Var.f204t = r3.f3137m;
                                                ae0Var.f205u = r3.f3138n;
                                                ae0Var.f208x = f;
                                                ae0Var.f207w = i9;
                                                ae0Var.f209y = r3.f3147w;
                                                ae0Var.f210z = r3.f3148x;
                                                ae0Var.f174A = c1673zp;
                                                i6 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str7)) {
                                                }
                                                i6 = 3;
                                            }
                                            str5 = r3.f3125a;
                                            if (str5 != null) {
                                                ae0Var.f186b = r3.f3125a;
                                            }
                                            ae0Var.f185a = Integer.toString(i29);
                                            ae0Var.f197m = v51.m6582l(str7);
                                            ae0Var.f198n = i4;
                                            ae0Var.f188d = r3.f3122X;
                                            ae0Var.f189e = i3111111111111115;
                                            ae0Var.f200p = list5;
                                            ae0Var.f194j = str2;
                                            ae0Var.f201q = r3.f3136l;
                                            be0 be0Var1110 = new be0(ae0Var);
                                            c22 c22VarMo750n1110 = z80Var1111.mo750n(r3.f3127c, i6);
                                            r3.f3123Y = c22VarMo750n1110;
                                            c22VarMo750n1110.mo1117d(be0Var1110);
                                            sparseArray.put(r3.f3127c, r3);
                                            f01Var4 = f01Var2;
                                            break;
                                        case 29:
                                            str7 = "video/mpeg2";
                                            f01Var2 = f01Var9;
                                            i3 = -1;
                                            list4 = null;
                                            i4 = -1;
                                            list = list4;
                                            str2 = null;
                                            list5 = list;
                                            if (r3.f3113O != null) {
                                                str2 = c0101bjM995b.f1383b;
                                                str7 = "video/dolby-vision";
                                            }
                                            boolean z1115 = r3.f3121W;
                                            if (r3.f3120V) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i31111111111111110 = (z1115 ? 1 : 0) | i5;
                                            ae0Var = new ae0();
                                            zM6578h = v51.m6578h(str7);
                                            z80 z80Var1112 = z80Var;
                                            Map map1111 = f3517j0;
                                            if (zM6578h) {
                                                ae0Var.f175B = r3.f3114P;
                                                ae0Var.f176C = r3.f3116R;
                                                ae0Var.f177D = i3;
                                                i6 = 1;
                                            } else if (v51.m6581k(str7)) {
                                                if (r3.f3142r == 0) {
                                                    i11 = r3.f3140p;
                                                    i7 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r3.f3137m;
                                                    }
                                                    r3.f3140p = i11;
                                                    i12 = r3.f3141q;
                                                    if (i12 == -1) {
                                                        i12 = r3.f3138n;
                                                    }
                                                    r3.f3141q = i12;
                                                } else {
                                                    i7 = -1;
                                                }
                                                i8 = r3.f3140p;
                                                if (i8 != i7) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r3.f3149y) {
                                                    if (r3.f3103E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31111111111111111 = r3.f3150z;
                                                    int i31111111111111112 = r3.f3100B;
                                                    int i31111111111111113 = r3.f3099A;
                                                    int i31111111111111114 = r3.f3139o;
                                                    c1673zp = new C1673zp(i31111111111111111, i31111111111111112, i31111111111111113, bArr, i31111111111111114, i31111111111111114);
                                                } else {
                                                    c1673zp = null;
                                                }
                                                str4 = r3.f3125a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r3.f3143s == 0) {
                                                    i9 = iIntValue;
                                                } else {
                                                    i9 = iIntValue;
                                                }
                                                ae0Var.f204t = r3.f3137m;
                                                ae0Var.f205u = r3.f3138n;
                                                ae0Var.f208x = f;
                                                ae0Var.f207w = i9;
                                                ae0Var.f209y = r3.f3147w;
                                                ae0Var.f210z = r3.f3148x;
                                                ae0Var.f174A = c1673zp;
                                                i6 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str7)) {
                                                }
                                                i6 = 3;
                                            }
                                            str5 = r3.f3125a;
                                            if (str5 != null) {
                                                ae0Var.f186b = r3.f3125a;
                                            }
                                            ae0Var.f185a = Integer.toString(i29);
                                            ae0Var.f197m = v51.m6582l(str7);
                                            ae0Var.f198n = i4;
                                            ae0Var.f188d = r3.f3122X;
                                            ae0Var.f189e = i31111111111111110;
                                            ae0Var.f200p = list5;
                                            ae0Var.f194j = str2;
                                            ae0Var.f201q = r3.f3136l;
                                            be0 be0Var1111 = new be0(ae0Var);
                                            c22 c22VarMo750n1111 = z80Var1112.mo750n(r3.f3127c, i6);
                                            r3.f3123Y = c22VarMo750n1111;
                                            c22VarMo750n1111.mo1117d(be0Var1111);
                                            sparseArray.put(r3.f3127c, r3);
                                            f01Var4 = f01Var2;
                                            break;
                                        case 30:
                                            str7 = "audio/eac3";
                                            f01Var2 = f01Var9;
                                            i3 = -1;
                                            list4 = null;
                                            i4 = -1;
                                            list = list4;
                                            str2 = null;
                                            list5 = list;
                                            if (r3.f3113O != null) {
                                                str2 = c0101bjM995b.f1383b;
                                                str7 = "video/dolby-vision";
                                            }
                                            boolean z1116 = r3.f3121W;
                                            if (r3.f3120V) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i31111111111111115 = (z1116 ? 1 : 0) | i5;
                                            ae0Var = new ae0();
                                            zM6578h = v51.m6578h(str7);
                                            z80 z80Var1113 = z80Var;
                                            Map map1112 = f3517j0;
                                            if (zM6578h) {
                                                ae0Var.f175B = r3.f3114P;
                                                ae0Var.f176C = r3.f3116R;
                                                ae0Var.f177D = i3;
                                                i6 = 1;
                                            } else if (v51.m6581k(str7)) {
                                                if (r3.f3142r == 0) {
                                                    i11 = r3.f3140p;
                                                    i7 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r3.f3137m;
                                                    }
                                                    r3.f3140p = i11;
                                                    i12 = r3.f3141q;
                                                    if (i12 == -1) {
                                                        i12 = r3.f3138n;
                                                    }
                                                    r3.f3141q = i12;
                                                } else {
                                                    i7 = -1;
                                                }
                                                i8 = r3.f3140p;
                                                if (i8 != i7) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r3.f3149y) {
                                                    if (r3.f3103E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31111111111111116 = r3.f3150z;
                                                    int i31111111111111117 = r3.f3100B;
                                                    int i31111111111111118 = r3.f3099A;
                                                    int i31111111111111119 = r3.f3139o;
                                                    c1673zp = new C1673zp(i31111111111111116, i31111111111111117, i31111111111111118, bArr, i31111111111111119, i31111111111111119);
                                                } else {
                                                    c1673zp = null;
                                                }
                                                str4 = r3.f3125a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r3.f3143s == 0) {
                                                    i9 = iIntValue;
                                                } else {
                                                    i9 = iIntValue;
                                                }
                                                ae0Var.f204t = r3.f3137m;
                                                ae0Var.f205u = r3.f3138n;
                                                ae0Var.f208x = f;
                                                ae0Var.f207w = i9;
                                                ae0Var.f209y = r3.f3147w;
                                                ae0Var.f210z = r3.f3148x;
                                                ae0Var.f174A = c1673zp;
                                                i6 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str7)) {
                                                }
                                                i6 = 3;
                                            }
                                            str5 = r3.f3125a;
                                            if (str5 != null) {
                                                ae0Var.f186b = r3.f3125a;
                                            }
                                            ae0Var.f185a = Integer.toString(i29);
                                            ae0Var.f197m = v51.m6582l(str7);
                                            ae0Var.f198n = i4;
                                            ae0Var.f188d = r3.f3122X;
                                            ae0Var.f189e = i31111111111111115;
                                            ae0Var.f200p = list5;
                                            ae0Var.f194j = str2;
                                            ae0Var.f201q = r3.f3136l;
                                            be0 be0Var1112 = new be0(ae0Var);
                                            c22 c22VarMo750n1112 = z80Var1113.mo750n(r3.f3127c, i6);
                                            r3.f3123Y = c22VarMo750n1112;
                                            c22VarMo750n1112.mo1117d(be0Var1112);
                                            sparseArray.put(r3.f3127c, r3);
                                            f01Var4 = f01Var2;
                                            break;
                                        case InjectionMetrics.I_APPLY_DELTA /* 31 */:
                                            str7 = "audio/flac";
                                            listSingletonList = Collections.singletonList(r3.m2442a(str6));
                                            f01Var2 = f01Var9;
                                            i3 = -1;
                                            list4 = listSingletonList;
                                            i4 = -1;
                                            list = list4;
                                            str2 = null;
                                            list5 = list;
                                            if (r3.f3113O != null) {
                                                str2 = c0101bjM995b.f1383b;
                                                str7 = "video/dolby-vision";
                                            }
                                            boolean z1117 = r3.f3121W;
                                            if (r3.f3120V) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i311111111111111110 = (z1117 ? 1 : 0) | i5;
                                            ae0Var = new ae0();
                                            zM6578h = v51.m6578h(str7);
                                            z80 z80Var1114 = z80Var;
                                            Map map1113 = f3517j0;
                                            if (zM6578h) {
                                                ae0Var.f175B = r3.f3114P;
                                                ae0Var.f176C = r3.f3116R;
                                                ae0Var.f177D = i3;
                                                i6 = 1;
                                            } else if (v51.m6581k(str7)) {
                                                if (r3.f3142r == 0) {
                                                    i11 = r3.f3140p;
                                                    i7 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r3.f3137m;
                                                    }
                                                    r3.f3140p = i11;
                                                    i12 = r3.f3141q;
                                                    if (i12 == -1) {
                                                        i12 = r3.f3138n;
                                                    }
                                                    r3.f3141q = i12;
                                                } else {
                                                    i7 = -1;
                                                }
                                                i8 = r3.f3140p;
                                                if (i8 != i7) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r3.f3149y) {
                                                    if (r3.f3103E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i311111111111111111 = r3.f3150z;
                                                    int i311111111111111112 = r3.f3100B;
                                                    int i311111111111111113 = r3.f3099A;
                                                    int i311111111111111114 = r3.f3139o;
                                                    c1673zp = new C1673zp(i311111111111111111, i311111111111111112, i311111111111111113, bArr, i311111111111111114, i311111111111111114);
                                                } else {
                                                    c1673zp = null;
                                                }
                                                str4 = r3.f3125a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r3.f3143s == 0) {
                                                    i9 = iIntValue;
                                                } else {
                                                    i9 = iIntValue;
                                                }
                                                ae0Var.f204t = r3.f3137m;
                                                ae0Var.f205u = r3.f3138n;
                                                ae0Var.f208x = f;
                                                ae0Var.f207w = i9;
                                                ae0Var.f209y = r3.f3147w;
                                                ae0Var.f210z = r3.f3148x;
                                                ae0Var.f174A = c1673zp;
                                                i6 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str7)) {
                                                }
                                                i6 = 3;
                                            }
                                            str5 = r3.f3125a;
                                            if (str5 != null) {
                                                ae0Var.f186b = r3.f3125a;
                                            }
                                            ae0Var.f185a = Integer.toString(i29);
                                            ae0Var.f197m = v51.m6582l(str7);
                                            ae0Var.f198n = i4;
                                            ae0Var.f188d = r3.f3122X;
                                            ae0Var.f189e = i311111111111111110;
                                            ae0Var.f200p = list5;
                                            ae0Var.f194j = str2;
                                            ae0Var.f201q = r3.f3136l;
                                            be0 be0Var1113 = new be0(ae0Var);
                                            c22 c22VarMo750n1113 = z80Var1114.mo750n(r3.f3127c, i6);
                                            r3.f3123Y = c22VarMo750n1113;
                                            c22VarMo750n1113.mo1117d(be0Var1113);
                                            sparseArray.put(r3.f3127c, r3);
                                            f01Var4 = f01Var2;
                                            break;
                                        case 32:
                                            ArrayList arrayList3 = new ArrayList(3);
                                            arrayList3.add(r3.m2442a(r3.f3126b));
                                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                            arrayList3.add(byteBufferAllocate.order(byteOrder).putLong(r3.f3117S).array());
                                            arrayList3.add(ByteBuffer.allocate(8).order(byteOrder).putLong(r3.f3118T).array());
                                            str7 = "audio/opus";
                                            f01Var2 = f01Var9;
                                            str2 = null;
                                            i4 = 5760;
                                            list6 = arrayList3;
                                            list5 = list6;
                                            i3 = -1;
                                            if (r3.f3113O != null) {
                                                str2 = c0101bjM995b.f1383b;
                                                str7 = "video/dolby-vision";
                                            }
                                            boolean z1118 = r3.f3121W;
                                            if (r3.f3120V) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i311111111111111115 = (z1118 ? 1 : 0) | i5;
                                            ae0Var = new ae0();
                                            zM6578h = v51.m6578h(str7);
                                            z80 z80Var1115 = z80Var;
                                            Map map1114 = f3517j0;
                                            if (zM6578h) {
                                                ae0Var.f175B = r3.f3114P;
                                                ae0Var.f176C = r3.f3116R;
                                                ae0Var.f177D = i3;
                                                i6 = 1;
                                            } else if (v51.m6581k(str7)) {
                                                if (r3.f3142r == 0) {
                                                    i11 = r3.f3140p;
                                                    i7 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r3.f3137m;
                                                    }
                                                    r3.f3140p = i11;
                                                    i12 = r3.f3141q;
                                                    if (i12 == -1) {
                                                        i12 = r3.f3138n;
                                                    }
                                                    r3.f3141q = i12;
                                                } else {
                                                    i7 = -1;
                                                }
                                                i8 = r3.f3140p;
                                                if (i8 != i7) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r3.f3149y) {
                                                    if (r3.f3103E != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i311111111111111116 = r3.f3150z;
                                                    int i311111111111111117 = r3.f3100B;
                                                    int i311111111111111118 = r3.f3099A;
                                                    int i311111111111111119 = r3.f3139o;
                                                    c1673zp = new C1673zp(i311111111111111116, i311111111111111117, i311111111111111118, bArr, i311111111111111119, i311111111111111119);
                                                } else {
                                                    c1673zp = null;
                                                }
                                                str4 = r3.f3125a;
                                                if (str4 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r3.f3143s == 0) {
                                                    i9 = iIntValue;
                                                } else {
                                                    i9 = iIntValue;
                                                }
                                                ae0Var.f204t = r3.f3137m;
                                                ae0Var.f205u = r3.f3138n;
                                                ae0Var.f208x = f;
                                                ae0Var.f207w = i9;
                                                ae0Var.f209y = r3.f3147w;
                                                ae0Var.f210z = r3.f3148x;
                                                ae0Var.f174A = c1673zp;
                                                i6 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str7)) {
                                                }
                                                i6 = 3;
                                            }
                                            str5 = r3.f3125a;
                                            if (str5 != null) {
                                                ae0Var.f186b = r3.f3125a;
                                            }
                                            ae0Var.f185a = Integer.toString(i29);
                                            ae0Var.f197m = v51.m6582l(str7);
                                            ae0Var.f198n = i4;
                                            ae0Var.f188d = r3.f3122X;
                                            ae0Var.f189e = i311111111111111115;
                                            ae0Var.f200p = list5;
                                            ae0Var.f194j = str2;
                                            ae0Var.f201q = r3.f3136l;
                                            be0 be0Var1114 = new be0(ae0Var);
                                            c22 c22VarMo750n1114 = z80Var1115.mo750n(r3.f3127c, i6);
                                            r3.f3123Y = c22VarMo750n1114;
                                            c22VarMo750n1114.mo1117d(be0Var1114);
                                            sparseArray.put(r3.f3127c, r3);
                                            f01Var4 = f01Var2;
                                            break;
                                        default:
                                            throw fc1.m2799a(null, "Unrecognized codec identifier.");
                                    }
                                    break;
                                default:
                                    f01Var4 = f01Var9;
                                    break;
                            }
                            f01Var4.f3570w = null;
                        } else {
                            if (i22 == 19899) {
                                int i53 = f01Var9.f3572y;
                                if (i53 != i14) {
                                    long j9 = f01Var9.f3573z;
                                    if (j9 != -1) {
                                        if (i53 == 475249515) {
                                            f01Var9.f3519B = j9;
                                        }
                                    }
                                }
                                throw fc1.m2799a(null, "Mandatory element SeekID or SeekPosition not found");
                            }
                            if (i22 == 25152) {
                                f01Var9.m2665c(i22);
                                e01 e01Var3 = f01Var9.f3570w;
                                if (e01Var3.f3132h) {
                                    b22 b22Var = e01Var3.f3134j;
                                    if (b22Var == null) {
                                        throw fc1.m2799a(null, "Encrypted Track found but ContentEncKeyID was not found");
                                    }
                                    e01Var3.f3136l = new z30(null, true, new y30(AbstractC0794jk.f5433a, null, "video/webm", b22Var.f1134b));
                                }
                            } else if (i22 == 28032) {
                                f01Var9.m2665c(i22);
                                e01 e01Var4 = f01Var9.f3570w;
                                if (e01Var4.f3132h && e01Var4.f3133i != null) {
                                    throw fc1.m2799a(null, "Combining encryption and compression is not supported");
                                }
                            } else if (i22 == 357149030) {
                                if (f01Var9.f3567t == -9223372036854775807L) {
                                    f01Var9.f3567t = 1000000L;
                                }
                                long j10 = f01Var9.f3568u;
                                if (j10 != -9223372036854775807L) {
                                    f01Var9.f3569v = f01Var9.m2669l(j10);
                                }
                            } else if (i22 == 374648427) {
                                if (sparseArray.size() == 0) {
                                    throw fc1.m2799a(null, "No valid tracks were found");
                                }
                                f01Var9.f3551d0.mo748k();
                            } else if (i22 == 475249515) {
                                if (!f01Var9.f3571x) {
                                    z80 z80Var20 = f01Var9.f3551d0;
                                    C1296pi c1296pi = f01Var9.f3522E;
                                    C1296pi c1296pi2 = f01Var9.f3523F;
                                    if (f01Var9.f3566s == -1 || f01Var9.f3569v == -9223372036854775807L || c1296pi == null || (i13 = c1296pi.f8901a) == 0 || c1296pi2 == null || c1296pi2.f8901a != i13) {
                                        c0825ke = new C0825ke(f01Var9.f3569v);
                                    } else {
                                        int[] iArrCopyOf = new int[i13];
                                        long[] jArrCopyOf2 = new long[i13];
                                        long[] jArr2 = new long[i13];
                                        long[] jArrCopyOf3 = new long[i13];
                                        int i54 = 0;
                                        while (i54 < i13) {
                                            jArrCopyOf3[i54] = c1296pi.m5260f(i54);
                                            jArrCopyOf2[i54] = c1296pi2.m5260f(i54) + f01Var9.f3566s;
                                            i54++;
                                            jArr2 = jArr2;
                                        }
                                        long[] jArr3 = jArr2;
                                        int i55 = 0;
                                        while (true) {
                                            int i56 = i13 - 1;
                                            if (i55 < i56) {
                                                int i57 = i55 + 1;
                                                iArrCopyOf[i55] = (int) (jArrCopyOf2[i57] - jArrCopyOf2[i55]);
                                                jArr3[i55] = jArrCopyOf3[i57] - jArrCopyOf3[i55];
                                                i55 = i57;
                                            } else {
                                                int i58 = i56;
                                                while (i58 > 0 && jArrCopyOf3[i58] > f01Var9.f3569v) {
                                                    i58--;
                                                }
                                                iArrCopyOf[i58] = (int) ((f01Var9.f3566s + f01Var9.f3565r) - jArrCopyOf2[i58]);
                                                jArr3[i58] = f01Var9.f3569v - jArrCopyOf3[i58];
                                                if (i58 < i56) {
                                                    AbstractC1337qm.m5542i0("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration");
                                                    int i59 = i58 + 1;
                                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i59);
                                                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i59);
                                                    jArrCopyOf = Arrays.copyOf(jArr3, i59);
                                                    jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i59);
                                                } else {
                                                    jArrCopyOf = jArr3;
                                                }
                                                c0825ke = new C1114mn(iArrCopyOf, jArrCopyOf2, jArrCopyOf, jArrCopyOf3);
                                            }
                                        }
                                    }
                                    z80Var20.mo752q(c0825ke);
                                    f01Var9.f3571x = true;
                                }
                                f01Var9.f3522E = null;
                                f01Var9.f3523F = null;
                            }
                        }
                        z3 = false;
                        y80Var2 = y80Var;
                    }
                    z2 = z3;
                    z4 = true;
                    if (z4) {
                        position = y80Var2.getPosition();
                        f01Var = this;
                        if (f01Var.f3518A) {
                            f01Var.f3520C = position;
                            bb0Var.f1280a = f01Var.f3519B;
                            f01Var.f3518A = z2;
                            return 1;
                        }
                        if (f01Var.f3571x) {
                            j2 = f01Var.f3520C;
                            if (j2 != -1) {
                                bb0Var.f1280a = j2;
                                f01Var.f3520C = -1L;
                                return 1;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        f01Var = this;
                    }
                    f01Var5 = f01Var;
                }
            }
        }
        f01 f01Var10 = f01Var5;
        if (z4) {
            return 0;
        }
        int i60 = 0;
        while (true) {
            SparseArray sparseArray2 = f01Var10.f3548c;
            if (i60 >= sparseArray2.size()) {
                return -1;
            }
            e01 e01Var5 = (e01) sparseArray2.valueAt(i60);
            e01Var5.f3123Y.getClass();
            f32 f32Var = e01Var5.f3119U;
            if (f32Var != null) {
                f32Var.m2702a(e01Var5.f3123Y, e01Var5.f3134j);
            }
            i60++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2665c(int i) {
        if (this.f3570w != null) {
            return;
        }
        throw fc1.m2799a(null, "Element " + i + " must be in a TrackEntry");
    }

    /* JADX INFO: renamed from: d */
    public final void m2666d(e01 e01Var, long j, int i, int i2, int i3) {
        byte[] bArrM2663h;
        int i4;
        int i5;
        f32 f32Var = e01Var.f3119U;
        if (f32Var != null) {
            f32Var.m2703b(e01Var.f3123Y, j, i, i2, i3, e01Var.f3134j);
        } else {
            if ("S_TEXT/UTF8".equals(e01Var.f3126b) || "S_TEXT/ASS".equals(e01Var.f3126b) || "S_TEXT/WEBVTT".equals(e01Var.f3126b)) {
                if (this.f3530M > 1) {
                    AbstractC1337qm.m5542i0("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.f3528K;
                    if (j2 == -9223372036854775807L) {
                        AbstractC1337qm.m5542i0("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = e01Var.f3126b;
                        dc1 dc1Var = this.f3560m;
                        byte[] bArr = dc1Var.f2882a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                                bArrM2663h = m2663h("%01d:%02d:%02d:%02d", j2, 10000L);
                                i4 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                bArrM2663h = m2663h("%02d:%02d:%02d.%03d", j2, 1000L);
                                i4 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                bArrM2663h = m2663h("%02d:%02d:%02d,%03d", j2, 1000L);
                                i4 = 19;
                                break;
                            default:
                                l41.m4049r();
                                return;
                        }
                        System.arraycopy(bArrM2663h, 0, bArr, i4, bArrM2663h.length);
                        for (int i6 = dc1Var.f2883b; i6 < dc1Var.f2884c; i6++) {
                            if (dc1Var.f2882a[i6] == 0) {
                                dc1Var.m2315E(i6);
                                e01Var.f3123Y.mo1115b(dc1Var, dc1Var.f2884c, 0);
                                i5 = i2 + dc1Var.f2884c;
                            }
                        }
                        e01Var.f3123Y.mo1115b(dc1Var, dc1Var.f2884c, 0);
                        i5 = i2 + dc1Var.f2884c;
                    }
                }
                i5 = i2;
            } else {
                i5 = i2;
            }
            if ((i & 268435456) != 0) {
                int i7 = this.f3530M;
                dc1 dc1Var2 = this.f3563p;
                if (i7 > 1) {
                    dc1Var2.m2313C(0);
                } else {
                    int i8 = dc1Var2.f2884c;
                    e01Var.f3123Y.mo1115b(dc1Var2, i8, 2);
                    i5 += i8;
                }
            }
            e01Var.f3123Y.mo1114a(j, i, i5, i3, e01Var.f3134j);
        }
        this.f3525H = true;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: e */
    public final boolean mo125e(y80 y80Var) {
        C1296pi c1296pi = new C1296pi(5, false);
        dc1 dc1Var = (dc1) c1296pi.f8902b;
        C0584dz c0584dz = (C0584dz) y80Var;
        long j = c0584dz.f3079c;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        c0584dz.mo2416e(dc1Var.f2882a, 0, 4, false);
        c1296pi.f8901a = 4;
        for (long jM2339v = dc1Var.m2339v(); jM2339v != 440786851; jM2339v = ((long) (dc1Var.f2882a[0] & 255)) | ((jM2339v << 8) & (-256))) {
            int i2 = c1296pi.f8901a + 1;
            c1296pi.f8901a = i2;
            if (i2 == i) {
                return false;
            }
            c0584dz.mo2416e(dc1Var.f2882a, 0, 1, false);
        }
        long jM5262j = c1296pi.m5262j(c0584dz);
        long j3 = c1296pi.f8901a;
        if (jM5262j != Long.MIN_VALUE && (j == -1 || j3 + jM5262j < j)) {
            while (true) {
                long j4 = c1296pi.f8901a;
                long j5 = j3 + jM5262j;
                if (j4 < j5) {
                    if (c1296pi.m5262j(c0584dz) == Long.MIN_VALUE) {
                        break;
                    }
                    long jM5262j2 = c1296pi.m5262j(c0584dz);
                    if (jM5262j2 < 0 || jM5262j2 > 2147483647L) {
                        break;
                    }
                    if (jM5262j2 != 0) {
                        int i3 = (int) jM5262j2;
                        c0584dz.m2421k(i3, false);
                        c1296pi.f8901a += i3;
                    }
                } else if (j4 == j5) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: f */
    public final void mo126f(long j, long j2) {
        this.f3521D = -9223372036854775807L;
        this.f3526I = 0;
        C0548cz c0548cz = this.f3544a;
        c0548cz.f2685e = 0;
        c0548cz.f2682b.clear();
        l91 l91Var = c0548cz.f2683c;
        l91Var.f6278b = 0;
        l91Var.f6279c = 0;
        l91 l91Var2 = this.f3546b;
        l91Var2.f6278b = 0;
        l91Var2.f6279c = 0;
        m2668j();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f3548c;
            if (i >= sparseArray.size()) {
                return;
            }
            f32 f32Var = ((e01) sparseArray.valueAt(i)).f3119U;
            if (f32Var != null) {
                f32Var.f3605b = false;
                f32Var.f3606c = 0;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m2667i(y80 y80Var, int i) {
        dc1 dc1Var = this.f3556i;
        if (dc1Var.f2884c >= i) {
            return;
        }
        byte[] bArr = dc1Var.f2882a;
        if (bArr.length < i) {
            dc1Var.m2319b(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = dc1Var.f2882a;
        int i2 = dc1Var.f2884c;
        y80Var.readFully(bArr2, i2, i - i2);
        dc1Var.m2315E(i);
    }

    /* JADX INFO: renamed from: j */
    public final void m2668j() {
        this.f3538U = 0;
        this.f3539V = 0;
        this.f3540W = 0;
        this.f3541X = false;
        this.f3542Y = false;
        this.f3543Z = false;
        this.f3545a0 = 0;
        this.f3547b0 = (byte) 0;
        this.f3549c0 = false;
        this.f3559l.m2313C(0);
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: k */
    public final void mo127k(z80 z80Var) {
        if (this.f3552e) {
            z80Var = new C1174o9(z80Var, this.f3553f);
        }
        this.f3551d0 = z80Var;
    }

    /* JADX INFO: renamed from: l */
    public final long m2669l(long j) throws fc1 {
        long j2 = this.f3567t;
        if (j2 == -9223372036854775807L) {
            throw fc1.m2799a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        int i = z42.f13274a;
        return z42.m7222J(j, j2, 1000L, RoundingMode.DOWN);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x016c  */
    /* JADX INFO: renamed from: m */
    public final int m2670m(y80 y80Var, e01 e01Var, int i, boolean z) {
        int iMo1116c;
        int iMo1116c2;
        int i2;
        boolean z2;
        int i3;
        if ("S_TEXT/UTF8".equals(e01Var.f3126b)) {
            m2671n(y80Var, f3512e0, i);
            int i4 = this.f3539V;
            m2668j();
            return i4;
        }
        if ("S_TEXT/ASS".equals(e01Var.f3126b)) {
            m2671n(y80Var, f3514g0, i);
            int i5 = this.f3539V;
            m2668j();
            return i5;
        }
        if ("S_TEXT/WEBVTT".equals(e01Var.f3126b)) {
            m2671n(y80Var, f3515h0, i);
            int i6 = this.f3539V;
            m2668j();
            return i6;
        }
        c22 c22Var = e01Var.f3123Y;
        boolean z3 = this.f3541X;
        dc1 dc1Var = this.f3559l;
        int i7 = 2;
        if (!z3) {
            boolean z4 = e01Var.f3132h;
            dc1 dc1Var2 = this.f3556i;
            if (z4) {
                this.f3534Q &= -1073741825;
                if (!this.f3542Y) {
                    y80Var.readFully(dc1Var2.f2882a, 0, 1);
                    this.f3538U++;
                    byte b = dc1Var2.f2882a[0];
                    if ((b & DerValue.TAG_CONTEXT) == 128) {
                        throw fc1.m2799a(null, "Extension bit is set in signal byte");
                    }
                    this.f3547b0 = b;
                    this.f3542Y = true;
                }
                byte b2 = this.f3547b0;
                if ((b2 & 1) != 1) {
                    i2 = 2;
                } else {
                    boolean z5 = (b2 & 2) == 2;
                    this.f3534Q |= 1073741824;
                    if (!this.f3549c0) {
                        dc1 dc1Var3 = this.f3561n;
                        y80Var.readFully(dc1Var3.f2882a, 0, 8);
                        this.f3538U += 8;
                        this.f3549c0 = true;
                        dc1Var2.f2882a[0] = (byte) ((z5 ? 128 : 0) | 8);
                        dc1Var2.m2316F(0);
                        c22Var.mo1115b(dc1Var2, 1, 1);
                        this.f3539V++;
                        dc1Var3.m2316F(0);
                        c22Var.mo1115b(dc1Var3, 8, 1);
                        this.f3539V += 8;
                    }
                    if (z5) {
                        if (!this.f3543Z) {
                            y80Var.readFully(dc1Var2.f2882a, 0, 1);
                            this.f3538U++;
                            dc1Var2.m2316F(0);
                            this.f3545a0 = dc1Var2.m2337t();
                            this.f3543Z = true;
                        }
                        int i8 = this.f3545a0 * 4;
                        dc1Var2.m2313C(i8);
                        y80Var.readFully(dc1Var2.f2882a, 0, i8);
                        this.f3538U += i8;
                        short s = (short) ((this.f3545a0 / 2) + 1);
                        int i9 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.f3564q;
                        if (byteBuffer == null || byteBuffer.capacity() < i9) {
                            this.f3564q = ByteBuffer.allocate(i9);
                        }
                        this.f3564q.position(0);
                        this.f3564q.putShort(s);
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            i3 = this.f3545a0;
                            if (i10 >= i3) {
                                break;
                            }
                            int iM2341x = dc1Var2.m2341x();
                            int i12 = i10 % 2;
                            int i13 = i7;
                            ByteBuffer byteBuffer2 = this.f3564q;
                            if (i12 == 0) {
                                byteBuffer2.putShort((short) (iM2341x - i11));
                            } else {
                                byteBuffer2.putInt(iM2341x - i11);
                            }
                            i10++;
                            i11 = iM2341x;
                            i7 = i13;
                        }
                        i2 = i7;
                        int i14 = (i - this.f3538U) - i11;
                        int i15 = i3 % 2;
                        ByteBuffer byteBuffer3 = this.f3564q;
                        if (i15 == 1) {
                            byteBuffer3.putInt(i14);
                        } else {
                            byteBuffer3.putShort((short) i14);
                            this.f3564q.putInt(0);
                        }
                        byte[] bArrArray = this.f3564q.array();
                        dc1 dc1Var4 = this.f3562o;
                        dc1Var4.m2314D(i9, bArrArray);
                        c22Var.mo1115b(dc1Var4, i9, 1);
                        this.f3539V += i9;
                    } else {
                        i2 = 2;
                    }
                }
            } else {
                i2 = 2;
                byte[] bArr = e01Var.f3133i;
                if (bArr != null) {
                    dc1Var.m2314D(bArr.length, bArr);
                }
            }
            if ("A_OPUS".equals(e01Var.f3126b)) {
                z2 = z;
            } else {
                z2 = e01Var.f3130f > 0;
            }
            if (z2) {
                this.f3534Q |= 268435456;
                this.f3563p.m2313C(0);
                int i16 = (dc1Var.f2884c + i) - this.f3538U;
                dc1Var2.m2313C(4);
                byte[] bArr2 = dc1Var2.f2882a;
                bArr2[0] = (byte) ((i16 >> 24) & 255);
                bArr2[1] = (byte) ((i16 >> 16) & 255);
                bArr2[i2] = (byte) ((i16 >> 8) & 255);
                bArr2[3] = (byte) (i16 & 255);
                c22Var.mo1115b(dc1Var2, 4, i2);
                this.f3539V += 4;
            }
            this.f3541X = true;
        }
        int i17 = i + dc1Var.f2884c;
        if (!"V_MPEG4/ISO/AVC".equals(e01Var.f3126b) && !"V_MPEGH/ISO/HEVC".equals(e01Var.f3126b)) {
            if (e01Var.f3119U != null) {
                ki0.m3864h(dc1Var.f2884c == 0);
                e01Var.f3119U.m2704c(y80Var);
            }
            while (true) {
                int i18 = this.f3538U;
                if (i18 >= i17) {
                    break;
                }
                int i19 = i17 - i18;
                int iM2318a = dc1Var.m2318a();
                if (iM2318a > 0) {
                    iMo1116c2 = Math.min(i19, iM2318a);
                    c22Var.mo1115b(dc1Var, iMo1116c2, 0);
                } else {
                    iMo1116c2 = c22Var.mo1116c(y80Var, i19, false);
                }
                this.f3538U += iMo1116c2;
                this.f3539V += iMo1116c2;
            }
        } else {
            dc1 dc1Var5 = this.f3555h;
            byte[] bArr3 = dc1Var5.f2882a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i20 = e01Var.f3124Z;
            int i21 = 4 - i20;
            while (this.f3538U < i17) {
                int i22 = this.f3540W;
                if (i22 == 0) {
                    int iMin = Math.min(i20, dc1Var.m2318a());
                    y80Var.readFully(bArr3, i21 + iMin, i20 - iMin);
                    if (iMin > 0) {
                        dc1Var.m2322e(i21, iMin, bArr3);
                    }
                    this.f3538U += i20;
                    dc1Var5.m2316F(0);
                    this.f3540W = dc1Var5.m2341x();
                    dc1 dc1Var6 = this.f3554g;
                    dc1Var6.m2316F(0);
                    c22Var.mo1115b(dc1Var6, 4, 0);
                    this.f3539V += 4;
                } else {
                    int iM2318a2 = dc1Var.m2318a();
                    if (iM2318a2 > 0) {
                        iMo1116c = Math.min(i22, iM2318a2);
                        c22Var.mo1115b(dc1Var, iMo1116c, 0);
                    } else {
                        iMo1116c = c22Var.mo1116c(y80Var, i22, false);
                    }
                    this.f3538U += iMo1116c;
                    this.f3539V += iMo1116c;
                    this.f3540W -= iMo1116c;
                }
            }
        }
        if ("A_VORBIS".equals(e01Var.f3126b)) {
            dc1 dc1Var7 = this.f3557j;
            dc1Var7.m2316F(0);
            c22Var.mo1115b(dc1Var7, 4, 0);
            this.f3539V += 4;
        }
        int i23 = this.f3539V;
        m2668j();
        return i23;
    }

    /* JADX INFO: renamed from: n */
    public final void m2671n(y80 y80Var, byte[] bArr, int i) {
        int length = bArr.length + i;
        dc1 dc1Var = this.f3560m;
        byte[] bArr2 = dc1Var.f2882a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            dc1Var.getClass();
            dc1Var.m2314D(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        y80Var.readFully(dc1Var.f2882a, bArr.length, i);
        dc1Var.m2316F(0);
        dc1Var.m2315E(length);
    }

    @Override // p000.x80
    public final void release() {
    }
}

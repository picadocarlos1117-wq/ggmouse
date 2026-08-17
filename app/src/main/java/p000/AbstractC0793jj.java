package p000;

import android.util.Pair;
import io.github.muntashirakon.adb.PairingConnectionCtx;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: jj */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0793jj {

    /* JADX INFO: renamed from: a */
    public static final byte[] f5419a;

    static {
        int i = z42.f13274a;
        f5419a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: a */
    public static C0642fj m3645a(int i, dc1 dc1Var) {
        dc1Var.m2316F(i + 12);
        dc1Var.m2317G(1);
        m3646b(dc1Var);
        dc1Var.m2317G(2);
        int iM2337t = dc1Var.m2337t();
        if ((iM2337t & 128) != 0) {
            dc1Var.m2317G(2);
        }
        if ((iM2337t & 64) != 0) {
            dc1Var.m2317G(dc1Var.m2337t());
        }
        if ((iM2337t & 32) != 0) {
            dc1Var.m2317G(2);
        }
        dc1Var.m2317G(1);
        m3646b(dc1Var);
        String strM6574d = v51.m6574d(dc1Var.m2337t());
        if ("audio/mpeg".equals(strM6574d) || "audio/vnd.dts".equals(strM6574d) || "audio/vnd.dts.hd".equals(strM6574d)) {
            return new C0642fj(strM6574d, null, -1L, -1L);
        }
        dc1Var.m2317G(4);
        long jM2339v = dc1Var.m2339v();
        long jM2339v2 = dc1Var.m2339v();
        dc1Var.m2317G(1);
        int iM3646b = m3646b(dc1Var);
        long j = jM2339v2;
        byte[] bArr = new byte[iM3646b];
        dc1Var.m2322e(0, iM3646b, bArr);
        if (j <= 0) {
            j = -1;
        }
        return new C0642fj(strM6574d, bArr, j, jM2339v > 0 ? jM2339v : -1L);
    }

    /* JADX INFO: renamed from: b */
    public static int m3646b(dc1 dc1Var) {
        int iM2337t = dc1Var.m2337t();
        int i = iM2337t & 127;
        while ((iM2337t & 128) == 128) {
            iM2337t = dc1Var.m2337t();
            i = (i << 7) | (iM2337t & 127);
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public static int m3647c(int i) {
        return (i >> 24) & 255;
    }

    /* JADX INFO: renamed from: d */
    public static p61 m3648d(dc1 dc1Var) {
        long jM2331n;
        long jM2331n2;
        dc1Var.m2316F(8);
        if (m3647c(dc1Var.m2324g()) == 0) {
            jM2331n = dc1Var.m2339v();
            jM2331n2 = dc1Var.m2339v();
        } else {
            jM2331n = dc1Var.m2331n();
            jM2331n2 = dc1Var.m2331n();
        }
        return new p61(jM2331n, jM2331n2, dc1Var.m2339v());
    }

    /* JADX INFO: renamed from: e */
    public static Pair m3649e(dc1 dc1Var, int i, int i2) throws fc1 {
        w12 w12Var;
        Pair pairCreate;
        int i3;
        int i4;
        int i5 = dc1Var.f2883b;
        while (i5 - i < i2) {
            dc1Var.m2316F(i5);
            int iM2324g = dc1Var.m2324g();
            o21.m4663j("childAtomSize must be positive", iM2324g > 0);
            if (dc1Var.m2324g() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer numValueOf = null;
                String strM2335r = null;
                while (i6 - i5 < iM2324g) {
                    dc1Var.m2316F(i6);
                    int iM2324g2 = dc1Var.m2324g();
                    int iM2324g3 = dc1Var.m2324g();
                    if (iM2324g3 == 1718775137) {
                        numValueOf = Integer.valueOf(dc1Var.m2324g());
                    } else if (iM2324g3 == 1935894637) {
                        dc1Var.m2317G(4);
                        strM2335r = dc1Var.m2335r(4, StandardCharsets.UTF_8);
                    } else if (iM2324g3 == 1935894633) {
                        i8 = i6;
                        i7 = iM2324g2;
                    }
                    i6 += iM2324g2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strM2335r) || "cbc1".equals(strM2335r) || "cens".equals(strM2335r) || "cbcs".equals(strM2335r)) {
                    o21.m4663j("frma atom is mandatory", numValueOf != null);
                    o21.m4663j("schi atom is mandatory", i8 != -1);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            w12Var = null;
                            break;
                        }
                        dc1Var.m2316F(i9);
                        int iM2324g4 = dc1Var.m2324g();
                        if (dc1Var.m2324g() == 1952804451) {
                            int iM3647c = m3647c(dc1Var.m2324g());
                            dc1Var.m2317G(1);
                            if (iM3647c == 0) {
                                dc1Var.m2317G(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int iM2337t = dc1Var.m2337t();
                                i3 = iM2337t & 15;
                                i4 = (iM2337t & 240) >> 4;
                            }
                            boolean z = dc1Var.m2337t() == 1;
                            int iM2337t2 = dc1Var.m2337t();
                            byte[] bArr2 = new byte[16];
                            dc1Var.m2322e(0, 16, bArr2);
                            if (z && iM2337t2 == 0) {
                                int iM2337t3 = dc1Var.m2337t();
                                byte[] bArr3 = new byte[iM2337t3];
                                dc1Var.m2322e(0, iM2337t3, bArr3);
                                bArr = bArr3;
                            }
                            w12Var = new w12(z, strM2335r, iM2337t2, bArr2, i4, i3, bArr);
                            break;
                        }
                        i9 += iM2324g4;
                    }
                    o21.m4663j("tenc atom is mandatory", w12Var != null);
                    int i10 = z42.f13274a;
                    pairCreate = Pair.create(numValueOf, w12Var);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i5 += iM2324g;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:169:0x0285  */
    /* JADX WARN: Code duplicated, block: B:222:0x0372  */
    /* JADX WARN: Code duplicated, block: B:326:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:395:0x0767  */
    /* JADX WARN: Code duplicated, block: B:407:0x078e  */
    /* JADX WARN: Code duplicated, block: B:414:0x079c  */
    /* JADX WARN: Code duplicated, block: B:488:0x089f  */
    /* JADX WARN: Code duplicated, block: B:547:0x0971  */
    /* JADX WARN: Code duplicated, block: B:664:0x099b A[SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static C0716hj m3650f(dc1 dc1Var, int i, int i2, String str, z30 z30Var, boolean z) throws fc1 {
        int i3;
        int i4;
        int iM2343z;
        int iM2324g;
        int iRound;
        int i5;
        z30 z30Var2;
        String str2;
        String str3;
        int i6;
        int i7;
        boolean z2;
        C0642fj c0642fj;
        String str4;
        List listM5570t;
        List listM5570t2;
        String str5;
        C0642fj c0642fj2;
        kk1 kk1VarM5570t;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iM1238i;
        int i13;
        boolean z3;
        boolean z4;
        int iM1238i2;
        int i14;
        boolean zM1237h;
        int i15;
        int iM1238i3;
        String str6;
        int i16;
        long j;
        kk1 kk1VarM5570t2;
        dc1 dc1Var2 = dc1Var;
        int[] iArr = hp0.f4640d;
        int[] iArr2 = hp0.f4638b;
        dc1Var2.m2316F(12);
        int iM2324g2 = dc1Var2.m2324g();
        C0716hj c0716hj = new C0716hj();
        c0716hj.f4586c = new w12[iM2324g2];
        boolean z5 = false;
        c0716hj.f4585b = 0;
        int i17 = 0;
        while (i17 < iM2324g2) {
            int i18 = dc1Var2.f2883b;
            int iM2324g3 = dc1Var2.m2324g();
            String str7 = "childAtomSize must be positive";
            o21.m4663j("childAtomSize must be positive", iM2324g3 > 0 ? true : z5);
            int iM2324g4 = dc1Var2.m2324g();
            if (iM2324g4 == 1635148593 || iM2324g4 == 1635148595 || iM2324g4 == 1701733238 || iM2324g4 == 1831958048 || iM2324g4 == 1836070006 || iM2324g4 == 1752589105 || iM2324g4 == 1751479857 || iM2324g4 == 1932670515 || iM2324g4 == 1211250227 || iM2324g4 == 1748121139 || iM2324g4 == 1987063864 || iM2324g4 == 1987063865 || iM2324g4 == 1635135537 || iM2324g4 == 1685479798 || iM2324g4 == 1685479729 || iM2324g4 == 1685481573) {
                dc1Var2 = dc1Var;
                z30Var = z30Var;
            } else {
                if (iM2324g4 != 1685481521) {
                    RuntimeException runtimeException = null;
                    if (iM2324g4 == 1836069985 || iM2324g4 == 1701733217 || iM2324g4 == 1633889587 || iM2324g4 == 1700998451 || iM2324g4 == 1633889588 || iM2324g4 == 1835823201 || iM2324g4 == 1685353315 || iM2324g4 == 1685353317 || iM2324g4 == 1685353320 || iM2324g4 == 1685353324 || iM2324g4 == 1685353336 || iM2324g4 == 1935764850 || iM2324g4 == 1935767394 || iM2324g4 == 1819304813 || iM2324g4 == 1936684916 || iM2324g4 == 1953984371 || iM2324g4 == 778924082 || iM2324g4 == 778924083 || iM2324g4 == 1835557169 || iM2324g4 == 1835560241 || iM2324g4 == 1634492771 || iM2324g4 == 1634492791 || iM2324g4 == 1970037111 || iM2324g4 == 1332770163 || iM2324g4 == 1716281667 || iM2324g4 == 1767992678) {
                        dc1Var2.m2316F(i18 + 16);
                        if (z) {
                            int iM2343z2 = dc1Var2.m2343z();
                            dc1Var2.m2317G(6);
                            i4 = iM2343z2;
                        } else {
                            dc1Var2.m2317G(8);
                            i4 = 0;
                        }
                        if (i4 == 0 || i4 == 1) {
                            iM2343z = dc1Var2.m2343z();
                            dc1Var2.m2317G(6);
                            int iM2338u = dc1Var2.m2338u();
                            dc1Var2.m2316F(dc1Var2.f2883b - 4);
                            iM2324g = dc1Var2.m2324g();
                            if (i4 == 1) {
                                dc1Var2.m2317G(16);
                            }
                            iRound = iM2338u;
                            i5 = -1;
                        } else {
                            if (i4 == 2) {
                                dc1Var2.m2317G(16);
                                iRound = (int) Math.round(Double.longBitsToDouble(dc1Var2.m2331n()));
                                iM2343z = dc1Var2.m2341x();
                                dc1Var2.m2317G(4);
                                int iM2341x = dc1Var2.m2341x();
                                int iM2341x2 = dc1Var2.m2341x();
                                boolean z6 = (iM2341x2 & 1) != 0;
                                boolean z7 = (iM2341x2 & 2) != 0;
                                if (z6) {
                                    if (iM2341x == 32) {
                                        i5 = 4;
                                    } else {
                                        i5 = -1;
                                    }
                                    i16 = 8;
                                } else {
                                    i16 = 8;
                                    if (iM2341x == 8) {
                                        i5 = 3;
                                    } else {
                                        if (iM2341x == 16) {
                                            i5 = z7 ? 268435456 : 2;
                                        } else if (iM2341x == 24) {
                                            i5 = z7 ? 1342177280 : 21;
                                        } else if (iM2341x == 32) {
                                            i5 = z7 ? 1610612736 : 22;
                                        } else {
                                            i5 = -1;
                                        }
                                        i16 = 8;
                                    }
                                }
                                dc1Var2.m2317G(i16);
                                iM2324g = 0;
                            } else {
                                i18 = i18;
                                i3 = iM2324g3;
                                i17 = i17;
                                iArr = iArr;
                                iArr2 = iArr2;
                                iM2324g2 = iM2324g2;
                                z5 = false;
                            }
                            dc1Var2 = dc1Var;
                        }
                        if (iM2324g4 == 1767992678) {
                            iRound = -1;
                            iM2343z = -1;
                        }
                        int i19 = dc1Var2.f2883b;
                        int i20 = iRound;
                        if (iM2324g4 == 1701733217) {
                            Pair pairM3649e = m3649e(dc1Var2, i18, iM2324g3);
                            if (pairM3649e != null) {
                                iM2324g4 = ((Integer) pairM3649e.first).intValue();
                                z30 z30VarM7186a = z30Var == 0 ? null : z30Var.m7186a(((w12) pairM3649e.second).f11905b);
                                ((w12[]) c0716hj.f4586c)[i17] = (w12) pairM3649e.second;
                                z30Var2 = z30VarM7186a;
                            } else {
                                i18 = i18;
                                z30Var2 = z30Var;
                            }
                            dc1Var2.m2316F(i19);
                        } else {
                            i18 = i18;
                            z30Var2 = z30Var;
                        }
                        String str8 = "audio/mhm1";
                        if (iM2324g4 == 1633889587) {
                            str2 = "audio/ac3";
                        } else if (iM2324g4 == 1700998451) {
                            str2 = "audio/eac3";
                        } else if (iM2324g4 == 1633889588) {
                            str2 = "audio/ac4";
                        } else if (iM2324g4 == 1685353315) {
                            str2 = "audio/vnd.dts";
                        } else if (iM2324g4 == 1685353320 || iM2324g4 == 1685353324) {
                            str2 = "audio/vnd.dts.hd";
                        } else if (iM2324g4 == 1685353317) {
                            str2 = "audio/vnd.dts.hd;profile=lbr";
                        } else if (iM2324g4 == 1685353336) {
                            str2 = "audio/vnd.dts.uhd;profile=p2";
                        } else if (iM2324g4 == 1935764850) {
                            str2 = "audio/3gpp";
                        } else if (iM2324g4 == 1935767394) {
                            str2 = "audio/amr-wb";
                        } else if (iM2324g4 == 1936684916) {
                            str2 = "audio/raw";
                            i5 = 2;
                        } else if (iM2324g4 == 1953984371) {
                            str2 = "audio/raw";
                            i5 = 268435456;
                        } else if (iM2324g4 == 1819304813) {
                            if (i5 == -1) {
                                str2 = "audio/raw";
                                i5 = 2;
                            } else {
                                str2 = "audio/raw";
                            }
                        } else if (iM2324g4 == 778924082 || iM2324g4 == 778924083) {
                            str2 = "audio/mpeg";
                        } else if (iM2324g4 == 1835557169) {
                            str2 = "audio/mha1";
                        } else if (iM2324g4 == 1835560241) {
                            str2 = "audio/mhm1";
                        } else if (iM2324g4 == 1634492771) {
                            str2 = "audio/alac";
                        } else if (iM2324g4 == 1634492791) {
                            str2 = "audio/g711-alaw";
                        } else if (iM2324g4 == 1970037111) {
                            str2 = "audio/g711-mlaw";
                        } else if (iM2324g4 == 1332770163) {
                            str2 = "audio/opus";
                        } else if (iM2324g4 == 1716281667) {
                            str2 = "audio/flac";
                        } else if (iM2324g4 == 1835823201) {
                            str2 = "audio/true-hd";
                        } else {
                            str2 = iM2324g4 == 1767992678 ? "audio/iamf" : null;
                        }
                        String str9 = str2;
                        iArr = iArr;
                        iArr2 = iArr2;
                        iM2324g2 = iM2324g2;
                        String str10 = null;
                        List listM5570t3 = null;
                        C0642fj c0642fj3 = null;
                        int iIntValue = i20;
                        while (i19 - i18 < iM2324g3) {
                            dc1Var2.m2316F(i19);
                            int iM2324g5 = dc1Var2.m2324g();
                            int i21 = iM2324g3;
                            o21.m4663j(str7, iM2324g5 > 0);
                            int iM2324g6 = dc1Var2.m2324g();
                            int i22 = i5;
                            if (iM2324g6 == 1835557187) {
                                dc1Var2.m2316F(i19 + 8);
                                dc1Var2.m2317G(1);
                                int iM2337t = dc1Var2.m2337t();
                                dc1Var2.m2317G(1);
                                str10 = Objects.equals(str9, str8) ? String.format("mhm1.%02X", Integer.valueOf(iM2337t)) : String.format("mha1.%02X", Integer.valueOf(iM2337t));
                                int iM2343z3 = dc1Var2.m2343z();
                                byte[] bArr = new byte[iM2343z3];
                                str3 = str8;
                                dc1Var2.m2322e(0, iM2343z3, bArr);
                                listM5570t3 = listM5570t3 == null ? qm0.m5570t(bArr) : qm0.m5571u(bArr, (byte[]) listM5570t3.get(0));
                            } else {
                                str3 = str8;
                                if (iM2324g6 == 1835557200) {
                                    dc1Var2.m2316F(i19 + 8);
                                    int iM2337t2 = dc1Var2.m2337t();
                                    if (iM2337t2 > 0) {
                                        byte[] bArr2 = new byte[iM2337t2];
                                        dc1Var2.m2322e(0, iM2337t2, bArr2);
                                        listM5570t3 = listM5570t3 == null ? qm0.m5570t(bArr2) : qm0.m5571u((byte[]) listM5570t3.get(0), bArr2);
                                    }
                                } else {
                                    if (iM2324g6 == 1702061171) {
                                        i6 = 1702061171;
                                    } else if (z && iM2324g6 == 2002876005) {
                                        i6 = 1702061171;
                                    } else {
                                        if (iM2324g6 == 1684103987) {
                                            dc1Var2.m2316F(i19 + 8);
                                            String string = Integer.toString(i);
                                            C0141cm c0141cm = new C0141cm();
                                            c0141cm.m1245p(dc1Var2);
                                            int i23 = iArr2[c0141cm.m1238i(2)];
                                            str5 = str9;
                                            c0141cm.m1249t(8);
                                            int i24 = iArr[c0141cm.m1238i(3)];
                                            int i25 = c0141cm.m1238i(1) != 0 ? i24 + 1 : i24;
                                            listM5570t2 = listM5570t3;
                                            int i26 = hp0.f4641e[c0141cm.m1238i(5)] * 1000;
                                            c0141cm.m1232c();
                                            dc1Var2.m2316F(c0141cm.m1235f());
                                            ae0 ae0Var = new ae0();
                                            ae0Var.f185a = string;
                                            ae0Var.f197m = v51.m6582l("audio/ac3");
                                            ae0Var.f175B = i25;
                                            ae0Var.f176C = i23;
                                            ae0Var.f201q = z30Var2;
                                            ae0Var.f188d = str;
                                            ae0Var.f192h = i26;
                                            ae0Var.f193i = i26;
                                            c0716hj.f4587d = new be0(ae0Var);
                                        } else {
                                            str5 = str9;
                                            listM5570t2 = listM5570t3;
                                            if (iM2324g6 == 1684366131) {
                                                dc1Var2.m2316F(i19 + 8);
                                                String string2 = Integer.toString(i);
                                                C0141cm c0141cm2 = new C0141cm();
                                                c0141cm2.m1245p(dc1Var2);
                                                int iM1238i4 = c0141cm2.m1238i(13) * 1000;
                                                c0141cm2.m1249t(3);
                                                int i27 = iArr2[c0141cm2.m1238i(2)];
                                                c0141cm2.m1249t(10);
                                                int i28 = iArr[c0141cm2.m1238i(3)];
                                                if (c0141cm2.m1238i(1) != 0) {
                                                    i28++;
                                                }
                                                c0141cm2.m1249t(3);
                                                int iM1238i5 = c0141cm2.m1238i(4);
                                                c0141cm2.m1249t(1);
                                                if (iM1238i5 > 0) {
                                                    c0141cm2.m1249t(6);
                                                    if (c0141cm2.m1238i(1) != 0) {
                                                        i28 += 2;
                                                    }
                                                    c0141cm2.m1249t(1);
                                                }
                                                int i29 = i28;
                                                if (c0141cm2.m1231b() > 7) {
                                                    c0141cm2.m1249t(7);
                                                    if (c0141cm2.m1238i(1) != 0) {
                                                        str6 = "audio/eac3-joc";
                                                    } else {
                                                        str6 = "audio/eac3";
                                                    }
                                                } else {
                                                    str6 = "audio/eac3";
                                                }
                                                c0141cm2.m1232c();
                                                dc1Var2.m2316F(c0141cm2.m1235f());
                                                ae0 ae0Var2 = new ae0();
                                                ae0Var2.f185a = string2;
                                                ae0Var2.f197m = v51.m6582l(str6);
                                                ae0Var2.f175B = i29;
                                                ae0Var2.f176C = i27;
                                                ae0Var2.f201q = z30Var2;
                                                ae0Var2.f188d = str;
                                                ae0Var2.f193i = iM1238i4;
                                                c0716hj.f4587d = new be0(ae0Var2);
                                            } else {
                                                str7 = str7;
                                                str10 = str10;
                                                if (iM2324g6 == 1684103988) {
                                                    dc1Var2.m2316F(i19 + 8);
                                                    String string3 = Integer.toString(i);
                                                    C0141cm c0141cm3 = new C0141cm();
                                                    c0141cm3.m1245p(dc1Var2);
                                                    int iM1231b = c0141cm3.m1231b();
                                                    int iM1238i6 = c0141cm3.m1238i(3);
                                                    if (iM1238i6 > 1) {
                                                        throw fc1.m2800b("Unsupported AC-4 DSI version: " + iM1238i6);
                                                    }
                                                    int iM1238i7 = c0141cm3.m1238i(7);
                                                    int i30 = c0141cm3.m1237h() ? 48000 : 44100;
                                                    c0141cm3.m1249t(4);
                                                    int iM1238i8 = c0141cm3.m1238i(9);
                                                    if (iM1238i7 > 1) {
                                                        if (iM1238i6 == 0) {
                                                            throw fc1.m2800b("Invalid AC-4 DSI version: " + iM1238i6);
                                                        }
                                                        if (c0141cm3.m1237h()) {
                                                            c0141cm3.m1249t(16);
                                                            if (c0141cm3.m1237h()) {
                                                                c0141cm3.m1249t(128);
                                                            }
                                                        }
                                                    }
                                                    if (iM1238i6 == 1) {
                                                        if (c0141cm3.m1231b() < 66) {
                                                            throw fc1.m2800b("Invalid AC-4 DSI bitrate.");
                                                        }
                                                        c0141cm3.m1249t(66);
                                                        c0141cm3.m1232c();
                                                    }
                                                    C0662g2 c0662g2 = new C0662g2();
                                                    c0662g2.f4016d = true;
                                                    c0662g2.f4013a = -1;
                                                    c0662g2.f4014b = -1;
                                                    c0662g2.f4017e = true;
                                                    c0662g2.f4015c = 2;
                                                    c0662g2.f4018f = 0;
                                                    int i31 = 0;
                                                    while (true) {
                                                        if (i31 < iM1238i8) {
                                                            if (iM1238i6 == 0) {
                                                                boolean zM1237h2 = c0141cm3.m1237h();
                                                                int iM1238i9 = c0141cm3.m1238i(5);
                                                                i19 = i19;
                                                                iM1238i = c0141cm3.m1238i(5);
                                                                i13 = 0;
                                                                z3 = false;
                                                                z4 = zM1237h2;
                                                                iM1238i2 = iM1238i9;
                                                                i14 = 0;
                                                            } else {
                                                                int i32 = iM1238i8;
                                                                int iM1238i10 = c0141cm3.m1238i(8);
                                                                i19 = i19;
                                                                int iM1238i11 = c0141cm3.m1238i(8);
                                                                int iM1238i12 = iM1238i11 == 255 ? c0141cm3.m1238i(16) + iM1238i11 : iM1238i11;
                                                                if (iM1238i10 > 2) {
                                                                    c0141cm3.m1249t(iM1238i12 * 8);
                                                                    i31++;
                                                                    iM1238i8 = i32;
                                                                    i19 = i19;
                                                                } else {
                                                                    int iM1231b2 = (iM1231b - c0141cm3.m1231b()) / 8;
                                                                    iM1238i2 = c0141cm3.m1238i(5);
                                                                    i14 = iM1231b2;
                                                                    i13 = iM1238i12;
                                                                    z3 = iM1238i2 == 31;
                                                                    iM1238i = iM1238i10;
                                                                    z4 = false;
                                                                }
                                                            }
                                                            i8 = iIntValue;
                                                            if (z4 || z3 || iM1238i2 != 6) {
                                                                c0662g2.f4018f = c0141cm3.m1238i(3);
                                                                if (c0141cm3.m1237h()) {
                                                                    c0141cm3.m1249t(5);
                                                                }
                                                                c0141cm3.m1249t(2);
                                                                if (iM1238i6 == 1 && (iM1238i == 1 || iM1238i == 2)) {
                                                                    c0141cm3.m1249t(2);
                                                                }
                                                                c0141cm3.m1249t(5);
                                                                c0141cm3.m1249t(10);
                                                                if (iM1238i6 == 1) {
                                                                    if (iM1238i > 0) {
                                                                        c0662g2.f4016d = c0141cm3.m1237h();
                                                                    }
                                                                    if (c0662g2.f4016d) {
                                                                        if (iM1238i != 1) {
                                                                            i15 = 2;
                                                                            if (iM1238i == 2) {
                                                                                iM1238i3 = c0141cm3.m1238i(5);
                                                                                if (iM1238i3 >= 0 && iM1238i3 <= 15) {
                                                                                    c0662g2.f4013a = iM1238i3;
                                                                                }
                                                                                if (iM1238i3 >= 11 || iM1238i3 > 14) {
                                                                                    i15 = 2;
                                                                                } else {
                                                                                    c0662g2.f4017e = c0141cm3.m1237h();
                                                                                    i15 = 2;
                                                                                    c0662g2.f4015c = c0141cm3.m1238i(2);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            iM1238i3 = c0141cm3.m1238i(5);
                                                                            if (iM1238i3 >= 0) {
                                                                                c0662g2.f4013a = iM1238i3;
                                                                            }
                                                                            if (iM1238i3 >= 11) {
                                                                                i15 = 2;
                                                                            } else {
                                                                                i15 = 2;
                                                                            }
                                                                        }
                                                                        c0141cm3.m1249t(24);
                                                                    } else {
                                                                        i15 = 2;
                                                                    }
                                                                    if (iM1238i == 1 || iM1238i == i15) {
                                                                        if (c0141cm3.m1237h() && c0141cm3.m1237h()) {
                                                                            c0141cm3.m1249t(i15);
                                                                        }
                                                                        if (c0141cm3.m1237h()) {
                                                                            c0141cm3.m1248s();
                                                                            int i33 = 8;
                                                                            int iM1238i13 = c0141cm3.m1238i(8);
                                                                            int i34 = 0;
                                                                            while (i34 < iM1238i13) {
                                                                                c0141cm3.m1249t(i33);
                                                                                i34++;
                                                                                i33 = 8;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (!z4 && !z3) {
                                                                    c0141cm3.m1248s();
                                                                    if (iM1238i2 == 0 || iM1238i2 == 1 || iM1238i2 == 2) {
                                                                        if (iM1238i == 0) {
                                                                            for (int i35 = 0; i35 < 2; i35++) {
                                                                                o21.m4658f0(c0141cm3, c0662g2);
                                                                            }
                                                                        } else {
                                                                            for (int i36 = 0; i36 < 2; i36++) {
                                                                                o21.m4659g0(c0141cm3, c0662g2);
                                                                            }
                                                                        }
                                                                    } else if (iM1238i2 == 3 || iM1238i2 == 4) {
                                                                        if (iM1238i == 0) {
                                                                            for (int i37 = 0; i37 < 3; i37++) {
                                                                                o21.m4658f0(c0141cm3, c0662g2);
                                                                            }
                                                                        } else {
                                                                            for (int i38 = 0; i38 < 3; i38++) {
                                                                                o21.m4659g0(c0141cm3, c0662g2);
                                                                            }
                                                                        }
                                                                    } else if (iM1238i2 != 5) {
                                                                        int iM1238i14 = c0141cm3.m1238i(7);
                                                                        for (int i39 = 0; i39 < iM1238i14; i39++) {
                                                                            c0141cm3.m1249t(8);
                                                                        }
                                                                    } else if (iM1238i == 0) {
                                                                        o21.m4658f0(c0141cm3, c0662g2);
                                                                    } else {
                                                                        int iM1238i15 = c0141cm3.m1238i(3);
                                                                        for (int i40 = 0; i40 < iM1238i15 + 2; i40++) {
                                                                            o21.m4659g0(c0141cm3, c0662g2);
                                                                        }
                                                                    }
                                                                } else if (iM1238i == 0) {
                                                                    o21.m4658f0(c0141cm3, c0662g2);
                                                                } else {
                                                                    o21.m4659g0(c0141cm3, c0662g2);
                                                                }
                                                                c0141cm3.m1248s();
                                                                zM1237h = c0141cm3.m1237h();
                                                            } else {
                                                                iM1238i = iM1238i;
                                                                zM1237h = true;
                                                            }
                                                            if (zM1237h) {
                                                                int iM1238i16 = c0141cm3.m1238i(7);
                                                                for (int i41 = 0; i41 < iM1238i16; i41++) {
                                                                    c0141cm3.m1249t(15);
                                                                }
                                                            }
                                                            if (iM1238i <= 0) {
                                                                i9 = 8;
                                                            } else {
                                                                if (c0141cm3.m1237h()) {
                                                                    if (c0141cm3.m1231b() < 66) {
                                                                        throw fc1.m2800b("Can't parse bitrate DSI.");
                                                                    }
                                                                    c0141cm3.m1249t(66);
                                                                }
                                                                if (c0141cm3.m1237h()) {
                                                                    c0141cm3.m1232c();
                                                                    c0141cm3.m1250u(c0141cm3.m1238i(16));
                                                                    int iM1238i17 = c0141cm3.m1238i(5);
                                                                    for (int i42 = 0; i42 < iM1238i17; i42++) {
                                                                        c0141cm3.m1249t(3);
                                                                        c0141cm3.m1249t(8);
                                                                    }
                                                                    i9 = 8;
                                                                } else {
                                                                    i9 = 8;
                                                                }
                                                            }
                                                            c0141cm3.m1232c();
                                                            if (iM1238i6 == 1) {
                                                                int iM1231b3 = ((iM1231b - c0141cm3.m1231b()) / i9) - i14;
                                                                if (i13 < iM1231b3) {
                                                                    throw fc1.m2800b("pres_bytes is smaller than presentation bytes read.");
                                                                }
                                                                c0141cm3.m1250u(i13 - iM1231b3);
                                                            }
                                                            if (c0662g2.f4016d && c0662g2.f4013a == -1) {
                                                                throw fc1.m2800b("Can't determine channel mode of presentation " + i31);
                                                            }
                                                        } else {
                                                            i8 = iIntValue;
                                                            i19 = i19;
                                                            iM2343z = iM2343z;
                                                            i9 = 8;
                                                        }
                                                        if (c0662g2.f4016d) {
                                                            int i43 = c0662g2.f4013a;
                                                            boolean z8 = c0662g2.f4017e;
                                                            int i44 = c0662g2.f4015c;
                                                            switch (i43) {
                                                                case 0:
                                                                    i12 = 11;
                                                                    i11 = 1;
                                                                    break;
                                                                case 1:
                                                                    i12 = 11;
                                                                    i11 = 2;
                                                                    break;
                                                                case 2:
                                                                    i12 = 11;
                                                                    i11 = 3;
                                                                    break;
                                                                case 3:
                                                                    i12 = 11;
                                                                    i11 = 5;
                                                                    break;
                                                                case 4:
                                                                    i12 = 11;
                                                                    i11 = 6;
                                                                    break;
                                                                case 5:
                                                                case 7:
                                                                case 9:
                                                                    i12 = 11;
                                                                    i11 = 7;
                                                                    break;
                                                                case 6:
                                                                case 8:
                                                                case 10:
                                                                    i11 = i9;
                                                                    i12 = 11;
                                                                    break;
                                                                case 11:
                                                                    i12 = 11;
                                                                    i11 = 11;
                                                                    break;
                                                                case 12:
                                                                    i12 = 11;
                                                                    i11 = 12;
                                                                    break;
                                                                case 13:
                                                                    i12 = 11;
                                                                    i11 = 13;
                                                                    break;
                                                                case 14:
                                                                    i12 = 11;
                                                                    i11 = 14;
                                                                    break;
                                                                case 15:
                                                                    i12 = 11;
                                                                    i11 = 24;
                                                                    break;
                                                                default:
                                                                    i12 = 11;
                                                                    i11 = -1;
                                                                    break;
                                                            }
                                                            if (i43 == i12 || i43 == 12 || i43 == 13 || i43 == 14) {
                                                                if (!z8) {
                                                                    i11 -= 2;
                                                                }
                                                                if (i44 == 0) {
                                                                    i11 -= 4;
                                                                } else if (i44 == 1) {
                                                                    i11 -= 2;
                                                                }
                                                            }
                                                        } else {
                                                            i10 = c0662g2.f4014b + 1;
                                                            if (c0662g2.f4018f == 4) {
                                                                i11 = i10 == 17 ? 21 : i10;
                                                            }
                                                            if (i10 > 0) {
                                                                throw fc1.m2800b("Can't determine channel count of presentation.");
                                                            }
                                                            ae0 ae0Var3 = new ae0();
                                                            ae0Var3.f185a = string3;
                                                            ae0Var3.f197m = v51.m6582l("audio/ac4");
                                                            ae0Var3.f175B = i10;
                                                            ae0Var3.f176C = i30;
                                                            ae0Var3.f201q = z30Var2;
                                                            ae0Var3.f188d = str;
                                                            c0716hj.f4587d = new be0(ae0Var3);
                                                            iIntValue = i8;
                                                            iM2343z = iM2343z;
                                                            str10 = str10;
                                                            str7 = str7;
                                                            i19 = i19;
                                                        }
                                                        i10 = i11;
                                                        if (i10 > 0) {
                                                            throw fc1.m2800b("Can't determine channel count of presentation.");
                                                        }
                                                        ae0 ae0Var4 = new ae0();
                                                        ae0Var4.f185a = string3;
                                                        ae0Var4.f197m = v51.m6582l("audio/ac4");
                                                        ae0Var4.f175B = i10;
                                                        ae0Var4.f176C = i30;
                                                        ae0Var4.f201q = z30Var2;
                                                        ae0Var4.f188d = str;
                                                        c0716hj.f4587d = new be0(ae0Var4);
                                                        iIntValue = i8;
                                                        iM2343z = iM2343z;
                                                        str10 = str10;
                                                        str7 = str7;
                                                        i19 = i19;
                                                    }
                                                } else {
                                                    int i45 = iIntValue;
                                                    i19 = i19;
                                                    int i46 = iM2343z;
                                                    iM2324g5 = iM2324g5;
                                                    if (iM2324g6 != 1684892784) {
                                                        if (iM2324g6 == 1684305011 || iM2324g6 == 1969517683) {
                                                            ae0 ae0Var5 = new ae0();
                                                            ae0Var5.f185a = Integer.toString(i);
                                                            ae0Var5.f197m = v51.m6582l(str5);
                                                            iM2343z = i46;
                                                            ae0Var5.f175B = iM2343z;
                                                            iIntValue = i45;
                                                            ae0Var5.f176C = iIntValue;
                                                            ae0Var5.f201q = z30Var2;
                                                            ae0Var5.f188d = str;
                                                            c0716hj.f4587d = new be0(ae0Var5);
                                                        } else if (iM2324g6 == 1682927731) {
                                                            int i47 = iM2324g5 - 8;
                                                            byte[] bArr3 = f5419a;
                                                            byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i47);
                                                            dc1Var2.m2316F(i19 + 8);
                                                            dc1Var2.m2322e(bArr3.length, i47, bArrCopyOf);
                                                            listM5570t2 = rc2.m5781e(bArrCopyOf);
                                                            iIntValue = i45;
                                                            iM2343z = i46;
                                                        } else {
                                                            if (iM2324g6 == 1684425825) {
                                                                byte[] bArr4 = new byte[iM2324g5 - 8];
                                                                bArr4[0] = 102;
                                                                bArr4[1] = 76;
                                                                bArr4[2] = 97;
                                                                bArr4[3] = 67;
                                                                dc1Var2.m2316F(i19 + 12);
                                                                dc1Var2.m2322e(4, iM2324g5 - 12, bArr4);
                                                                kk1VarM5570t = qm0.m5570t(bArr4);
                                                            } else if (iM2324g6 == 1634492771) {
                                                                int i48 = iM2324g5 - 12;
                                                                byte[] bArr5 = new byte[i48];
                                                                dc1Var2.m2316F(i19 + 12);
                                                                dc1Var2.m2322e(0, i48, bArr5);
                                                                byte[] bArr6 = AbstractC0574dp.f2986a;
                                                                dc1 dc1Var3 = new dc1(bArr5);
                                                                dc1Var3.m2316F(9);
                                                                int iM2337t3 = dc1Var3.m2337t();
                                                                dc1Var3.m2316F(20);
                                                                Pair pairCreate = Pair.create(Integer.valueOf(dc1Var3.m2341x()), Integer.valueOf(iM2337t3));
                                                                iIntValue = ((Integer) pairCreate.first).intValue();
                                                                iM2343z = ((Integer) pairCreate.second).intValue();
                                                                listM5570t2 = qm0.m5570t(bArr5);
                                                            } else if (iM2324g6 == 1767990114) {
                                                                dc1Var2.m2316F(i19 + 9);
                                                                long j2 = 0;
                                                                for (int i49 = 0; i49 < 9; i49++) {
                                                                    if (dc1Var2.f2883b == dc1Var2.f2884c) {
                                                                        f40.m2719o("Attempting to read a byte over the limit.");
                                                                        return null;
                                                                    }
                                                                    long jM2337t = dc1Var2.m2337t();
                                                                    j2 |= (jM2337t & 127) << (i49 * 7);
                                                                    if ((jM2337t & 128) == 0) {
                                                                        int iM5793l = rc2.m5793l(j2);
                                                                        byte[] bArr7 = new byte[iM5793l];
                                                                        dc1Var2.m2322e(0, iM5793l, bArr7);
                                                                        kk1VarM5570t = qm0.m5570t(bArr7);
                                                                    }
                                                                }
                                                                int iM5793l2 = rc2.m5793l(j2);
                                                                byte[] bArr8 = new byte[iM5793l2];
                                                                dc1Var2.m2322e(0, iM5793l2, bArr8);
                                                                kk1VarM5570t = qm0.m5570t(bArr8);
                                                            } else {
                                                                iIntValue = i45;
                                                                iM2343z = i46;
                                                            }
                                                            listM5570t2 = kk1VarM5570t;
                                                            str10 = str10;
                                                            str7 = str7;
                                                            i19 = i19;
                                                            iIntValue = i45;
                                                            iM2343z = i46;
                                                        }
                                                        str10 = str10;
                                                        str7 = str7;
                                                        i19 = i19;
                                                    } else {
                                                        if (iM2324g <= 0) {
                                                            throw fc1.m2799a(runtimeException, "Invalid sample rate for Dolby TrueHD MLP stream: " + iM2324g);
                                                        }
                                                        iIntValue = iM2324g;
                                                        iM2343z = 2;
                                                    }
                                                }
                                            }
                                        }
                                        str10 = str10;
                                        str7 = str7;
                                        i19 = i19;
                                    }
                                    if (iM2324g6 == i6) {
                                        str7 = str7;
                                        iM2324g5 = iM2324g5;
                                        i7 = i19;
                                        i19 = i7;
                                    } else {
                                        i7 = dc1Var2.f2883b;
                                        if (i7 >= i19) {
                                            i19 = i19;
                                            z2 = true;
                                        } else {
                                            i19 = i19;
                                            z2 = false;
                                        }
                                        o21.m4663j(null, z2);
                                        while (true) {
                                            iM2324g5 = iM2324g5;
                                            if (i7 - i19 < iM2324g5) {
                                                dc1Var2.m2316F(i7);
                                                int iM2324g7 = dc1Var2.m2324g();
                                                str7 = str7;
                                                o21.m4663j(str7, iM2324g7 > 0);
                                                if (dc1Var2.m2324g() != 1702061171) {
                                                    i7 += iM2324g7;
                                                    str7 = str7;
                                                    iM2324g5 = iM2324g5;
                                                }
                                            } else {
                                                str7 = str7;
                                                i7 = -1;
                                            }
                                        }
                                    }
                                    if (i7 != -1) {
                                        C0642fj c0642fjM3645a = m3645a(i7, dc1Var2);
                                        str4 = (String) c0642fjM3645a.f3826c;
                                        byte[] bArr9 = (byte[]) c0642fjM3645a.f3827d;
                                        if (bArr9 == null) {
                                            c0642fj = c0642fjM3645a;
                                        } else if ("audio/vorbis".equals(str4)) {
                                            dc1 dc1Var4 = new dc1(bArr9);
                                            dc1Var4.m2317G(1);
                                            int i50 = 0;
                                            while (dc1Var4.m2318a() > 0 && (dc1Var4.f2882a[dc1Var4.f2883b] & 255) == 255) {
                                                i50 += 255;
                                                dc1Var4.m2317G(1);
                                            }
                                            int iM2337t4 = dc1Var4.m2337t() + i50;
                                            int i51 = 0;
                                            while (true) {
                                                if (dc1Var4.m2318a() > 0) {
                                                    c0642fj2 = c0642fjM3645a;
                                                    if ((dc1Var4.f2882a[dc1Var4.f2883b] & 255) == 255) {
                                                        i51 += 255;
                                                        dc1Var4.m2317G(1);
                                                        c0642fjM3645a = c0642fj2;
                                                    }
                                                } else {
                                                    c0642fj2 = c0642fjM3645a;
                                                }
                                            }
                                            int iM2337t5 = dc1Var4.m2337t() + i51;
                                            byte[] bArr10 = new byte[iM2337t4];
                                            int i52 = dc1Var4.f2883b;
                                            iM2324g5 = iM2324g5;
                                            System.arraycopy(bArr9, i52, bArr10, 0, iM2337t4);
                                            int i53 = i52 + iM2337t4 + iM2337t5;
                                            int length = bArr9.length - i53;
                                            byte[] bArr11 = new byte[length];
                                            System.arraycopy(bArr9, i53, bArr11, 0, length);
                                            listM5570t = qm0.m5571u(bArr10, bArr11);
                                            c0642fj = c0642fj2;
                                            str10 = str10;
                                        } else {
                                            iM2324g5 = iM2324g5;
                                            if ("audio/mp4a-latm".equals(str4)) {
                                                C0586e0 c0586e0M3845P = ki0.m3845P(new C0141cm(bArr9, bArr9.length), false);
                                                iIntValue = c0586e0M3845P.f3088b;
                                                iM2343z = c0586e0M3845P.f3089c;
                                                str10 = c0586e0M3845P.f3087a;
                                            } else {
                                                str10 = str10;
                                            }
                                            listM5570t = qm0.m5570t(bArr9);
                                            c0642fj = c0642fjM3645a;
                                        }
                                        listM5570t2 = listM5570t;
                                        str5 = str4;
                                        c0642fj3 = c0642fj;
                                    } else {
                                        c0642fj = c0642fj3;
                                        str4 = str9;
                                    }
                                    listM5570t = listM5570t3;
                                    str10 = str10;
                                    listM5570t2 = listM5570t;
                                    str5 = str4;
                                    c0642fj3 = c0642fj;
                                }
                                i19 += iM2324g5;
                                dc1Var2 = dc1Var;
                                str7 = str7;
                                iM2324g3 = i21;
                                i5 = i22;
                                str8 = str3;
                                str9 = str5;
                                listM5570t3 = listM5570t2;
                                runtimeException = null;
                            }
                            str5 = str9;
                            listM5570t2 = listM5570t3;
                            iM2324g5 = iM2324g5;
                            str7 = str7;
                            i19 += iM2324g5;
                            dc1Var2 = dc1Var;
                            str7 = str7;
                            iM2324g3 = i21;
                            i5 = i22;
                            str8 = str3;
                            str9 = str5;
                            listM5570t3 = listM5570t2;
                            runtimeException = null;
                        }
                        i3 = iM2324g3;
                        String str11 = str9;
                        String str12 = str10;
                        List list = listM5570t3;
                        int i54 = i5;
                        z5 = false;
                        if (((be0) c0716hj.f4587d) == null && str11 != null) {
                            ae0 ae0Var6 = new ae0();
                            ae0Var6.f185a = Integer.toString(i);
                            ae0Var6.f197m = v51.m6582l(str11);
                            ae0Var6.f194j = str12;
                            ae0Var6.f175B = iM2343z;
                            ae0Var6.f176C = iIntValue;
                            ae0Var6.f177D = i54;
                            ae0Var6.f200p = list;
                            ae0Var6.f201q = z30Var2;
                            ae0Var6.f188d = str;
                            if (c0642fj3 != null) {
                                C0642fj c0642fj4 = c0642fj3;
                                ae0Var6.f192h = rc2.m5794l0(c0642fj4.f3824a);
                                ae0Var6.f193i = rc2.m5794l0(c0642fj4.f3825b);
                            }
                            c0716hj.f4587d = new be0(ae0Var6);
                        }
                        dc1Var2 = dc1Var;
                    } else {
                        if (iM2324g4 == 1414810956 || iM2324g4 == 1954034535 || iM2324g4 == 2004251764 || iM2324g4 == 1937010800 || iM2324g4 == 1664495672) {
                            dc1Var2.m2316F(i18 + 16);
                            String str13 = "application/ttml+xml";
                            if (iM2324g4 == 1414810956) {
                                kk1VarM5570t2 = null;
                                j = Long.MAX_VALUE;
                            } else if (iM2324g4 == 1954034535) {
                                int i55 = iM2324g3 - 16;
                                byte[] bArr12 = new byte[i55];
                                dc1Var2.m2322e(0, i55, bArr12);
                                kk1VarM5570t2 = qm0.m5570t(bArr12);
                                str13 = "application/x-quicktime-tx3g";
                                j = Long.MAX_VALUE;
                            } else {
                                if (iM2324g4 == 2004251764) {
                                    str13 = "application/x-mp4-vtt";
                                } else if (iM2324g4 == 1937010800) {
                                    j = 0;
                                    kk1VarM5570t2 = null;
                                } else {
                                    if (iM2324g4 != 1664495672) {
                                        l41.m4046o();
                                        return null;
                                    }
                                    c0716hj.f4585b = 1;
                                    str13 = "application/x-mp4-cea-608";
                                }
                                kk1VarM5570t2 = null;
                                j = Long.MAX_VALUE;
                            }
                            ae0 ae0Var7 = new ae0();
                            ae0Var7.f185a = Integer.toString(i);
                            ae0Var7.f197m = v51.m6582l(str13);
                            ae0Var7.f188d = str;
                            ae0Var7.f202r = j;
                            ae0Var7.f200p = kk1VarM5570t2;
                            c0716hj.f4587d = new be0(ae0Var7);
                        } else if (iM2324g4 == 1835365492) {
                            dc1Var2.m2316F(i18 + 16);
                            if (iM2324g4 == 1835365492) {
                                dc1Var2.m2332o();
                                String strM2332o = dc1Var2.m2332o();
                                if (strM2332o != null) {
                                    ae0 ae0Var8 = new ae0();
                                    ae0Var8.f185a = Integer.toString(i);
                                    ae0Var8.f197m = v51.m6582l(strM2332o);
                                    c0716hj.f4587d = new be0(ae0Var8);
                                }
                            }
                        } else if (iM2324g4 == 1667329389) {
                            ae0 ae0Var9 = new ae0();
                            ae0Var9.f185a = Integer.toString(i);
                            ae0Var9.f197m = v51.m6582l("application/x-camera-motion");
                            c0716hj.f4587d = new be0(ae0Var9);
                        }
                        i18 = i18;
                        i3 = iM2324g3;
                        i17 = i17;
                        iArr = iArr;
                        iArr2 = iArr2;
                        iM2324g2 = iM2324g2;
                        z5 = false;
                    }
                }
                dc1Var2.m2316F(i18 + i3);
                i17++;
                z5 = z5;
                iArr = iArr;
                iArr2 = iArr2;
                iM2324g2 = iM2324g2;
            }
            m3652h(dc1Var2, iM2324g4, i18, iM2324g3, i, i2, z30Var, c0716hj, i17);
            i18 = i18;
            i3 = iM2324g3;
            i17 = i17;
            dc1Var2.m2316F(i18 + i3);
            i17++;
            z5 = z5;
            iArr = iArr;
            iArr2 = iArr2;
            iM2324g2 = iM2324g2;
        }
        return c0716hj;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01cb A[LOOP:16: B:90:0x019b->B:100:0x01cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:104:0x020a  */
    /* JADX WARN: Code duplicated, block: B:129:0x029a  */
    /* JADX WARN: Code duplicated, block: B:133:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:153:0x038f  */
    /* JADX WARN: Code duplicated, block: B:187:0x0461  */
    /* JADX WARN: Code duplicated, block: B:208:0x0546  */
    /* JADX WARN: Code duplicated, block: B:210:0x054a  */
    /* JADX WARN: Code duplicated, block: B:212:0x0550 A[LOOP:12: B:209:0x0548->B:212:0x0550, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:217:0x0589 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:218:0x058b  */
    /* JADX WARN: Code duplicated, block: B:220:0x058f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:225:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:228:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:229:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:232:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:234:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:237:0x05d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:239:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:244:0x05fe A[DONT_INVERT, LOOP:14: B:244:0x05fe->B:248:0x0608, LOOP_START, PHI: r20
  0x05fe: PHI (r20v8 int) = (r20v6 int), (r20v9 int) binds: [B:243:0x05fc, B:248:0x0608] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:245:0x0600  */
    /* JADX WARN: Code duplicated, block: B:248:0x0608 A[LOOP:14: B:244:0x05fe->B:248:0x0608, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:249:0x060e A[EDGE_INSN: B:249:0x060e->B:250:0x060f BREAK  A[LOOP:14: B:244:0x05fe->B:248:0x0608]] */
    /* JADX WARN: Code duplicated, block: B:251:0x0611 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:258:0x0623  */
    /* JADX WARN: Code duplicated, block: B:260:0x0651  */
    /* JADX WARN: Code duplicated, block: B:261:0x0654  */
    /* JADX WARN: Code duplicated, block: B:266:0x0677  */
    /* JADX WARN: Code duplicated, block: B:268:0x068d  */
    /* JADX WARN: Code duplicated, block: B:294:0x073a  */
    /* JADX WARN: Code duplicated, block: B:296:0x0740  */
    /* JADX WARN: Code duplicated, block: B:299:0x074a A[LOOP:5: B:297:0x0747->B:299:0x074a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:301:0x077c  */
    /* JADX WARN: Code duplicated, block: B:302:0x077d A[PHI: r6
  0x077d: PHI (r6v13 int) = (r6v12 int), (r6v20 int) binds: [B:293:0x0738, B:301:0x077c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:304:0x0785  */
    /* JADX WARN: Code duplicated, block: B:305:0x0787  */
    /* JADX WARN: Code duplicated, block: B:309:0x079a  */
    /* JADX WARN: Code duplicated, block: B:311:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:314:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:319:0x07dc A[LOOP:8: B:319:0x07dc->B:323:0x07ed, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:321:0x07e5  */
    /* JADX WARN: Code duplicated, block: B:323:0x07ed A[LOOP:8: B:319:0x07dc->B:323:0x07ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:326:0x07f9  */
    /* JADX WARN: Code duplicated, block: B:327:0x07fb  */
    /* JADX WARN: Code duplicated, block: B:329:0x0803  */
    /* JADX WARN: Code duplicated, block: B:333:0x0819  */
    /* JADX WARN: Code duplicated, block: B:334:0x081b  */
    /* JADX WARN: Code duplicated, block: B:337:0x0821  */
    /* JADX WARN: Code duplicated, block: B:338:0x0824  */
    /* JADX WARN: Code duplicated, block: B:340:0x0827  */
    /* JADX WARN: Code duplicated, block: B:341:0x082a  */
    /* JADX WARN: Code duplicated, block: B:343:0x082d  */
    /* JADX WARN: Code duplicated, block: B:345:0x0831  */
    /* JADX WARN: Code duplicated, block: B:346:0x0834  */
    /* JADX WARN: Code duplicated, block: B:350:0x0842  */
    /* JADX WARN: Code duplicated, block: B:352:0x084c  */
    /* JADX WARN: Code duplicated, block: B:355:0x085b  */
    /* JADX WARN: Code duplicated, block: B:357:0x0883  */
    /* JADX WARN: Code duplicated, block: B:360:0x088a  */
    /* JADX WARN: Code duplicated, block: B:367:0x08bb  */
    /* JADX WARN: Code duplicated, block: B:368:0x08fd  */
    /* JADX WARN: Code duplicated, block: B:379:0x0925 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x07d2 A[ADDED_TO_REGION, EDGE_INSN: B:392:0x07d2->B:317:0x07d2 BREAK  A[LOOP:7: B:312:0x07c2->B:316:0x07cc], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:394:0x07f0 A[EDGE_INSN: B:394:0x07f0->B:324:0x07f0 BREAK  A[LOOP:8: B:319:0x07dc->B:323:0x07ed], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:395:0x07f0 A[EDGE_INSN: B:395:0x07f0->B:324:0x07f0 BREAK  A[LOOP:8: B:319:0x07dc->B:323:0x07ed], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x0890 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x05f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:0x056d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:406:0x0565 A[EDGE_INSN: B:406:0x0565->B:213:0x0565 BREAK  A[LOOP:12: B:209:0x0548->B:212:0x0550], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:409:0x060e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x0606 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x01d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0134  */
    /* JADX WARN: Code duplicated, block: B:75:0x0137  */
    /* JADX WARN: Code duplicated, block: B:78:0x0145  */
    /* JADX WARN: Code duplicated, block: B:80:0x014c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0186  */
    /* JADX WARN: Code duplicated, block: B:84:0x0189  */
    /* JADX WARN: Code duplicated, block: B:87:0x0196  */
    /* JADX WARN: Code duplicated, block: B:88:0x0198  */
    /* JADX WARN: Code duplicated, block: B:91:0x019d  */
    /* JADX WARN: Code duplicated, block: B:94:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:95:0x01af  */
    /* JADX WARN: Code duplicated, block: B:99:0x01bd A[EDGE_INSN: B:99:0x01bd->B:102:0x01d8 BREAK  A[LOOP:16: B:90:0x019b->B:100:0x01cb]] */
    /* JADX INFO: renamed from: g */
    public static ArrayList m3651g(k61 k61Var, xh0 xh0Var, long j, z30 z30Var, boolean z, boolean z2, yg0 yg0Var) {
        int i;
        long jM2339v;
        int i2;
        int i3;
        long j2;
        long j3;
        long j4;
        long jM7222J;
        dc1 dc1Var;
        int iM3647c;
        int i4;
        long jM2339v2;
        int i5;
        int i6;
        int i7;
        ArrayList arrayList;
        long jM7222J2;
        String str;
        l61 l61VarM3805s;
        C0716hj c0716hjM3650f;
        long[] jArr;
        long[] jArr2;
        be0 be0Var;
        v12 v12Var;
        k61 k61VarM3804r;
        Pair pairCreate;
        long jM2342y;
        InterfaceC0679gj c0752ij;
        boolean z3;
        int iM2341x;
        int i8;
        int iM2341x2;
        int iMo2987a;
        dc1 dc1Var2;
        dc1 dc1Var3;
        int i9;
        ArrayList arrayList2;
        long[] jArrCopyOf;
        int[] iArrCopyOf;
        long[] jArrCopyOf2;
        int[] iArr;
        int i10;
        int iM2341x3;
        long j5;
        long j6;
        int i11;
        int iM2324g;
        int i12;
        int i13;
        int i14;
        int iM2324g2;
        int iM2341x4;
        int i15;
        v12 v12Var2;
        int i16;
        int[] iArrCopyOf2;
        long[] jArr3;
        int i17;
        boolean z4;
        String str2;
        int i18;
        long j7;
        long[] jArr4;
        boolean zM2588a;
        int i19;
        int iMo2989c;
        int i20;
        int iM2341x5;
        RoundingMode roundingMode;
        long jM7222J3;
        long[] jArr5;
        int[] iArr2;
        int i21;
        long[] jArr6;
        int[] iArr3;
        boolean z5;
        int[] iArr4;
        int[] iArr5;
        int i22;
        boolean z6;
        int i23;
        int i24;
        int[] iArr6;
        int[] iArr7;
        boolean z7;
        boolean z8;
        long[] jArr7;
        int[] iArr8;
        int[] iArr9;
        long[] jArr8;
        int i25;
        int i26;
        boolean z9;
        int i27;
        long j8;
        v12 v12Var3;
        d22 d22Var;
        long j9;
        int i28;
        int i29;
        long jM7222J4;
        int[] iArr10;
        int[] iArr11;
        long j10;
        int[] iArr12;
        int i30;
        int i31;
        long j11;
        int i32;
        boolean z10;
        int i33;
        int i34;
        long j12;
        int i35;
        long j13;
        long jM7222J5;
        long j14;
        long jM7222J6;
        long jM7222J7;
        d22 d22Var2;
        k61 k61Var2 = k61Var;
        ArrayList arrayList3 = k61Var2.f5684n;
        ArrayList arrayList4 = new ArrayList();
        int i36 = 0;
        while (i36 < arrayList3.size()) {
            k61 k61Var3 = (k61) arrayList3.get(i36);
            if (k61Var3.f7542b != 1953653099) {
                arrayList = arrayList3;
                i36 = i36;
            } else {
                l61 l61VarM3805s2 = k61Var2.m3805s(1836476516);
                l61VarM3805s2.getClass();
                k61 k61VarM3804r2 = k61Var3.m3804r(1835297121);
                k61VarM3804r2.getClass();
                l61 l61VarM3805s3 = k61VarM3804r2.m3805s(1751411826);
                l61VarM3805s3.getClass();
                dc1 dc1Var4 = l61VarM3805s3.f6194g;
                dc1Var4.m2316F(16);
                int iM2324g3 = dc1Var4.m2324g();
                if (iM2324g3 == 1936684398) {
                    i = 1;
                } else if (iM2324g3 == 1986618469) {
                    i = 2;
                } else if (iM2324g3 == 1952807028 || iM2324g3 == 1935832172 || iM2324g3 == 1937072756 || iM2324g3 == 1668047728) {
                    i = 3;
                } else {
                    i = iM2324g3 == 1835365473 ? 5 : -1;
                }
                if (i == -1) {
                    arrayList = arrayList3;
                    i36 = i36;
                    v12Var = null;
                } else {
                    l61 l61VarM3805s4 = k61Var3.m3805s(1953196132);
                    l61VarM3805s4.getClass();
                    dc1 dc1Var5 = l61VarM3805s4.f6194g;
                    dc1Var5.m2316F(8);
                    int iM3647c2 = m3647c(dc1Var5.m2324g());
                    dc1Var5.m2317G(iM3647c2 != 0 ? 16 : 8);
                    int iM2324g4 = dc1Var5.m2324g();
                    dc1Var5.m2317G(4);
                    int i37 = dc1Var5.f2883b;
                    int i38 = iM3647c2 == 0 ? 4 : 8;
                    int i39 = 0;
                    while (true) {
                        if (i39 >= i38) {
                            dc1Var5.m2317G(i38);
                        } else {
                            if (dc1Var5.f2882a[i37 + i39] != -1) {
                                jM2339v = iM3647c2 == 0 ? dc1Var5.m2339v() : dc1Var5.m2342y();
                                if (jM2339v != 0) {
                                    break;
                                }
                                break;
                            }
                            i39++;
                        }
                        jM2339v = -9223372036854775807L;
                        break;
                    }
                    dc1Var5.m2317G(16);
                    int iM2324g5 = dc1Var5.m2324g();
                    int iM2324g6 = dc1Var5.m2324g();
                    dc1Var5.m2317G(4);
                    int iM2324g7 = dc1Var5.m2324g();
                    int iM2324g8 = dc1Var5.m2324g();
                    if (iM2324g5 == 0 && iM2324g6 == 65536 && iM2324g7 == -65536 && iM2324g8 == 0) {
                        i3 = 90;
                    } else if (iM2324g5 == 0 && iM2324g6 == -65536 && iM2324g7 == 65536 && iM2324g8 == 0) {
                        i3 = 270;
                    } else {
                        if (iM2324g5 == -65536 && iM2324g6 == 0 && iM2324g7 == 0 && iM2324g8 == -65536) {
                            i3 = 180;
                        } else {
                            i2 = 0;
                        }
                        if (j == r20) {
                            j2 = jM2339v;
                        } else {
                            j2 = j;
                        }
                        j3 = m3648d(l61VarM3805s2.f6194g).f8741c;
                        if (j2 == r20) {
                            j4 = j3;
                            jM7222J = -9223372036854775807L;
                        } else {
                            int i40 = z42.f13274a;
                            j4 = j3;
                            jM7222J = z42.m7222J(j2, 1000000L, j4, RoundingMode.DOWN);
                        }
                        k61 k61VarM3804r3 = k61VarM3804r2.m3804r(1835626086);
                        k61VarM3804r3.getClass();
                        k61 k61VarM3804r4 = k61VarM3804r3.m3804r(1937007212);
                        k61VarM3804r4.getClass();
                        l61 l61VarM3805s5 = k61VarM3804r2.m3805s(1835296868);
                        l61VarM3805s5.getClass();
                        dc1Var = l61VarM3805s5.f6194g;
                        dc1Var.m2316F(8);
                        iM3647c = m3647c(dc1Var.m2324g());
                        if (iM3647c == 0) {
                            i4 = 8;
                        } else {
                            i4 = 16;
                        }
                        dc1Var.m2317G(i4);
                        jM2339v2 = dc1Var.m2339v();
                        i5 = dc1Var.f2883b;
                        if (iM3647c == 0) {
                            i6 = 4;
                        } else {
                            i6 = 8;
                        }
                        i7 = 0;
                        while (true) {
                            if (i7 < i6) {
                                arrayList = arrayList3;
                                if (dc1Var.f2882a[i5 + i7] != -1) {
                                    if (iM3647c == 0) {
                                        jM2342y = dc1Var.m2339v();
                                    } else {
                                        jM2342y = dc1Var.m2342y();
                                    }
                                    if (jM2342y == 0) {
                                        int i41 = z42.f13274a;
                                        jM7222J2 = z42.m7222J(jM2342y, 1000000L, jM2339v2, RoundingMode.DOWN);
                                        break;
                                    }
                                    break;
                                }
                                i7++;
                                arrayList3 = arrayList;
                            } else {
                                arrayList = arrayList3;
                                dc1Var.m2317G(i6);
                            }
                            jM7222J2 = -9223372036854775807L;
                            break;
                        }
                        int iM2343z = dc1Var.m2343z();
                        str = "" + ((char) (((iM2343z >> 10) & 31) + 96)) + ((char) (((iM2343z >> 5) & 31) + 96)) + ((char) ((iM2343z & 31) + 96));
                        l61VarM3805s = k61VarM3804r4.m3805s(1937011556);
                        if (l61VarM3805s != null) {
                            throw fc1.m2799a(null, "Malformed sample table (stbl) missing sample description (stsd)");
                        }
                        c0716hjM3650f = m3650f(l61VarM3805s.f6194g, iM2324g4, i2, str, z30Var, z2);
                        if (!z || (k61VarM3804r = k61Var3.m3804r(1701082227)) == null) {
                            i36 = i36;
                        } else {
                            l61 l61VarM3805s6 = k61VarM3804r.m3805s(1701606260);
                            if (l61VarM3805s6 == null) {
                                pairCreate = null;
                            } else {
                                dc1 dc1Var6 = l61VarM3805s6.f6194g;
                                dc1Var6.m2316F(8);
                                int iM3647c3 = m3647c(dc1Var6.m2324g());
                                int iM2341x6 = dc1Var6.m2341x();
                                long[] jArr9 = new long[iM2341x6];
                                long[] jArr10 = new long[iM2341x6];
                                int i42 = 0;
                                while (i42 < iM2341x6) {
                                    int i43 = i42;
                                    jArr9[i43] = iM3647c3 == 1 ? dc1Var6.m2342y() : dc1Var6.m2339v();
                                    jArr10[i43] = iM3647c3 == 1 ? dc1Var6.m2331n() : dc1Var6.m2324g();
                                    if (dc1Var6.m2334q() != 1) {
                                        f40.m2713i("Unsupported media rate.");
                                        return null;
                                    }
                                    dc1Var6.m2317G(2);
                                    i42 = i43 + 1;
                                    iM3647c3 = iM3647c3;
                                }
                                pairCreate = Pair.create(jArr9, jArr10);
                            }
                            if (pairCreate != null) {
                                long[] jArr11 = (long[]) pairCreate.first;
                                jArr2 = (long[]) pairCreate.second;
                                jArr = jArr11;
                            }
                            be0Var = (be0) c0716hjM3650f.f4587d;
                            if (be0Var == null) {
                                v12Var = null;
                            } else {
                                v12Var = new v12(iM2324g4, i, jM2339v2, j4, jM7222J, jM7222J2, be0Var, c0716hjM3650f.f4585b, (w12[]) c0716hjM3650f.f4586c, c0716hjM3650f.f4584a, jArr, jArr2);
                            }
                        }
                        jArr = null;
                        jArr2 = null;
                        be0Var = (be0) c0716hjM3650f.f4587d;
                        if (be0Var == null) {
                            v12Var = null;
                        } else {
                            v12Var = new v12(iM2324g4, i, jM2339v2, j4, jM7222J, jM7222J2, be0Var, c0716hjM3650f.f4585b, (w12[]) c0716hjM3650f.f4586c, c0716hjM3650f.f4584a, jArr, jArr2);
                        }
                    }
                    i2 = i3;
                    if (j == r20) {
                        j2 = jM2339v;
                    } else {
                        j2 = j;
                    }
                    j3 = m3648d(l61VarM3805s2.f6194g).f8741c;
                    if (j2 == r20) {
                        j4 = j3;
                        jM7222J = -9223372036854775807L;
                    } else {
                        int i44 = z42.f13274a;
                        j4 = j3;
                        jM7222J = z42.m7222J(j2, 1000000L, j4, RoundingMode.DOWN);
                    }
                    k61 k61VarM3804r5 = k61VarM3804r2.m3804r(1835626086);
                    k61VarM3804r5.getClass();
                    k61 k61VarM3804r6 = k61VarM3804r5.m3804r(1937007212);
                    k61VarM3804r6.getClass();
                    l61 l61VarM3805s7 = k61VarM3804r2.m3805s(1835296868);
                    l61VarM3805s7.getClass();
                    dc1Var = l61VarM3805s7.f6194g;
                    dc1Var.m2316F(8);
                    iM3647c = m3647c(dc1Var.m2324g());
                    if (iM3647c == 0) {
                        i4 = 8;
                    } else {
                        i4 = 16;
                    }
                    dc1Var.m2317G(i4);
                    jM2339v2 = dc1Var.m2339v();
                    i5 = dc1Var.f2883b;
                    if (iM3647c == 0) {
                        i6 = 4;
                    } else {
                        i6 = 8;
                    }
                    i7 = 0;
                    while (true) {
                        if (i7 < i6) {
                            arrayList = arrayList3;
                            if (dc1Var.f2882a[i5 + i7] != -1) {
                                if (iM3647c == 0) {
                                    jM2342y = dc1Var.m2339v();
                                } else {
                                    jM2342y = dc1Var.m2342y();
                                }
                                if (jM2342y == 0) {
                                    int i45 = z42.f13274a;
                                    jM7222J2 = z42.m7222J(jM2342y, 1000000L, jM2339v2, RoundingMode.DOWN);
                                    break;
                                }
                                break;
                            }
                            i7++;
                            arrayList3 = arrayList;
                        } else {
                            arrayList = arrayList3;
                            dc1Var.m2317G(i6);
                        }
                        jM7222J2 = -9223372036854775807L;
                        break;
                    }
                    int iM2343z2 = dc1Var.m2343z();
                    str = "" + ((char) (((iM2343z2 >> 10) & 31) + 96)) + ((char) (((iM2343z2 >> 5) & 31) + 96)) + ((char) ((iM2343z2 & 31) + 96));
                    l61VarM3805s = k61VarM3804r6.m3805s(1937011556);
                    if (l61VarM3805s != null) {
                        throw fc1.m2799a(null, "Malformed sample table (stbl) missing sample description (stsd)");
                    }
                    c0716hjM3650f = m3650f(l61VarM3805s.f6194g, iM2324g4, i2, str, z30Var, z2);
                    if (z) {
                        i36 = i36;
                        jArr = null;
                        jArr2 = null;
                    } else {
                        i36 = i36;
                        jArr = null;
                        jArr2 = null;
                    }
                    be0Var = (be0) c0716hjM3650f.f4587d;
                    if (be0Var == null) {
                        v12Var = null;
                    } else {
                        v12Var = new v12(iM2324g4, i, jM2339v2, j4, jM7222J, jM7222J2, be0Var, c0716hjM3650f.f4585b, (w12[]) c0716hjM3650f.f4586c, c0716hjM3650f.f4584a, jArr, jArr2);
                    }
                }
                v12 v12Var4 = (v12) yg0Var.apply(v12Var);
                if (v12Var4 != null) {
                    be0 be0Var2 = v12Var4.f11490g;
                    k61 k61VarM3804r7 = k61Var3.m3804r(1835297121);
                    k61VarM3804r7.getClass();
                    k61 k61VarM3804r8 = k61VarM3804r7.m3804r(1835626086);
                    k61VarM3804r8.getClass();
                    k61 k61VarM3804r9 = k61VarM3804r8.m3804r(1937007212);
                    k61VarM3804r9.getClass();
                    l61 l61VarM3805s8 = k61VarM3804r9.m3805s(1937011578);
                    if (l61VarM3805s8 != null) {
                        c0752ij = new l91(l61VarM3805s8, be0Var2);
                    } else {
                        l61 l61VarM3805s9 = k61VarM3804r9.m3805s(1937013298);
                        if (l61VarM3805s9 == null) {
                            throw fc1.m2799a(null, "Track has no sample table size information");
                        }
                        c0752ij = new C0752ij(l61VarM3805s9);
                    }
                    int iMo2988b = c0752ij.mo2988b();
                    if (iMo2988b == 0) {
                        d22Var = new d22(v12Var4, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                        arrayList4 = arrayList4;
                    } else {
                        if (v12Var4.f11485b == 2) {
                            long j15 = v12Var4.f11489f;
                            if (j15 > 0) {
                                ae0 ae0VarM969a = be0Var2.m969a();
                                ae0VarM969a.f206v = iMo2988b / (j15 / 1000000.0f);
                                v12Var4 = new v12(v12Var4.f11484a, v12Var4.f11485b, v12Var4.f11486c, v12Var4.f11487d, v12Var4.f11488e, v12Var4.f11489f, new be0(ae0VarM969a), v12Var4.f11491h, v12Var4.f11495l, v12Var4.f11494k, v12Var4.f11492i, v12Var4.f11493j);
                            }
                        }
                        long j16 = v12Var4.f11486c;
                        int i46 = v12Var4.f11485b;
                        long[] jArr12 = v12Var4.f11493j;
                        be0 be0Var3 = v12Var4.f11490g;
                        long[] jArr13 = v12Var4.f11492i;
                        l61 l61VarM3805s10 = k61VarM3804r9.m3805s(1937007471);
                        if (l61VarM3805s10 == null) {
                            l61VarM3805s10 = k61VarM3804r9.m3805s(1668232756);
                            l61VarM3805s10.getClass();
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        dc1 dc1Var7 = l61VarM3805s10.f6194g;
                        l61 l61VarM3805s11 = k61VarM3804r9.m3805s(1937011555);
                        l61VarM3805s11.getClass();
                        dc1 dc1Var8 = l61VarM3805s11.f6194g;
                        l61 l61VarM3805s12 = k61VarM3804r9.m3805s(1937011827);
                        l61VarM3805s12.getClass();
                        dc1 dc1Var9 = l61VarM3805s12.f6194g;
                        InterfaceC0679gj interfaceC0679gj = c0752ij;
                        l61 l61VarM3805s13 = k61VarM3804r9.m3805s(1937011571);
                        dc1 dc1Var10 = l61VarM3805s13 != null ? l61VarM3805s13.f6194g : null;
                        l61 l61VarM3805s14 = k61VarM3804r9.m3805s(1668576371);
                        dc1 dc1Var11 = l61VarM3805s14 != null ? l61VarM3805s14.f6194g : null;
                        C0605ej c0605ej = new C0605ej(dc1Var8, dc1Var7, z3);
                        dc1Var9.m2316F(12);
                        int iM2341x7 = dc1Var9.m2341x() - 1;
                        int iM2341x8 = dc1Var9.m2341x();
                        int iM2341x9 = dc1Var9.m2341x();
                        if (dc1Var11 != null) {
                            dc1Var11.m2316F(12);
                            iM2341x = dc1Var11.m2341x();
                        } else {
                            iM2341x = 0;
                        }
                        if (dc1Var10 != null) {
                            dc1Var10.m2316F(12);
                            int iM2341x10 = dc1Var10.m2341x();
                            if (iM2341x10 > 0) {
                                iM2341x2 = dc1Var10.m2341x() - 1;
                                i8 = iM2341x10;
                            } else {
                                i8 = iM2341x10;
                                dc1Var10 = null;
                            }
                            iMo2987a = interfaceC0679gj.mo2987a();
                            dc1Var2 = dc1Var11;
                            String str3 = be0Var3.f1341n;
                            dc1Var3 = dc1Var10;
                            i9 = be0Var3.f1318D;
                            if (iMo2987a == -1 && (("audio/raw".equals(str3) || "audio/g711-mlaw".equals(str3) || "audio/g711-alaw".equals(str3)) && iM2341x7 == 0 && iM2341x == 0 && i8 == 0)) {
                                int i47 = c0605ej.f3355a;
                                long[] jArr14 = new long[i47];
                                int[] iArr13 = new int[i47];
                                while (c0605ej.m2588a()) {
                                    int i48 = c0605ej.f3356b;
                                    jArr14[i48] = c0605ej.f3358d;
                                    iArr13[i48] = c0605ej.f3357c;
                                    arrayList4 = arrayList4;
                                    iMo2987a = iMo2987a;
                                }
                                int i49 = iMo2987a;
                                arrayList2 = arrayList4;
                                long j17 = iM2341x9;
                                int i50 = PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE / i49;
                                int i51 = 0;
                                int iM7231e = 0;
                                while (i51 < i47) {
                                    iM7231e += z42.m7231e(iArr13[i51], i50);
                                    i51++;
                                    j17 = j17;
                                }
                                long j18 = j17;
                                long[] jArr15 = new long[iM7231e];
                                int[] iArr14 = new int[iM7231e];
                                jArr3 = new long[iM7231e];
                                iArrCopyOf2 = new int[iM7231e];
                                int i52 = 0;
                                int i53 = 0;
                                int i54 = 0;
                                int i55 = 0;
                                while (i52 < i47) {
                                    int i56 = iArr13[i52];
                                    long j19 = jArr14[i52];
                                    int i57 = i55;
                                    int i58 = i52;
                                    int iMax = i54;
                                    int i59 = i57;
                                    int i60 = i47;
                                    int i61 = i56;
                                    while (i61 > 0) {
                                        int iMin = Math.min(i50, i61);
                                        jArr15[i59] = j19;
                                        int i62 = i61;
                                        int i63 = i49 * iMin;
                                        iArr14[i59] = i63;
                                        iMax = Math.max(iMax, i63);
                                        jArr3[i59] = ((long) i53) * j18;
                                        iArrCopyOf2[i59] = 1;
                                        j19 += (long) iArr14[i59];
                                        i53 += iMin;
                                        i59++;
                                        jArr14 = jArr14;
                                        i61 = i62 - iMin;
                                        i50 = i50;
                                    }
                                    int i64 = i50;
                                    int i65 = i58 + 1;
                                    i55 = i59;
                                    i47 = i60;
                                    i54 = iMax;
                                    i52 = i65;
                                    i50 = i64;
                                }
                                j7 = ((long) i53) * j18;
                                jArr4 = jArr15;
                                iArrCopyOf = iArr14;
                                i18 = i54;
                            } else {
                                arrayList2 = arrayList4;
                                jArrCopyOf = new long[iMo2988b];
                                iArrCopyOf = new int[iMo2988b];
                                jArrCopyOf2 = new long[iMo2988b];
                                iArr = new int[iMo2988b];
                                i10 = i8;
                                iM2341x3 = iM2341x8;
                                j5 = 0;
                                j6 = 0;
                                i11 = 0;
                                iM2324g = 0;
                                i12 = 0;
                                i13 = 0;
                                i14 = iM2341x7;
                                iM2324g2 = iM2341x9;
                                iM2341x4 = iM2341x2;
                                i15 = 0;
                                while (true) {
                                    if (i15 >= iMo2988b) {
                                        v12Var2 = v12Var4;
                                        i16 = i14;
                                        iArrCopyOf2 = iArr;
                                        break;
                                    }
                                    zM2588a = true;
                                    while (i12 == 0) {
                                        zM2588a = c0605ej.m2588a();
                                        if (!zM2588a) {
                                            break;
                                        }
                                        v12 v12Var5 = v12Var4;
                                        long j20 = c0605ej.f3358d;
                                        i12 = c0605ej.f3357c;
                                        j6 = j20;
                                        v12Var4 = v12Var5;
                                        i14 = i14;
                                        iMo2988b = iMo2988b;
                                    }
                                    i19 = iMo2988b;
                                    v12Var2 = v12Var4;
                                    i16 = i14;
                                    if (!zM2588a) {
                                        AbstractC1337qm.m5542i0("BoxParsers", "Unexpected end of chunk data");
                                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15);
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i15);
                                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i15);
                                        iArrCopyOf2 = Arrays.copyOf(iArr, i15);
                                        iMo2988b = i15;
                                        break;
                                    }
                                    if (dc1Var2 != null) {
                                        iM2341x5 = i13;
                                        while (iM2341x5 == 0 && iM2341x > 0) {
                                            iM2341x5 = dc1Var2.m2341x();
                                            iM2324g = dc1Var2.m2324g();
                                            iM2341x--;
                                        }
                                        i13 = iM2341x5 - 1;
                                    }
                                    jArrCopyOf[i15] = j6;
                                    iMo2989c = interfaceC0679gj.mo2989c();
                                    iArrCopyOf[i15] = iMo2989c;
                                    if (iMo2989c > i11) {
                                        i11 = iMo2989c;
                                    }
                                    jArrCopyOf2[i15] = j5 + ((long) iM2324g);
                                    if (dc1Var3 == null) {
                                        i20 = 1;
                                    } else {
                                        i20 = 0;
                                    }
                                    iArr[i15] = i20;
                                    if (i15 == iM2341x4) {
                                        iArr[i15] = 1;
                                        i10--;
                                        if (i10 > 0) {
                                            dc1Var3.getClass();
                                            iM2341x4 = dc1Var3.m2341x() - 1;
                                        }
                                    }
                                    j5 += (long) iM2324g2;
                                    iM2341x3--;
                                    if (iM2341x3 == 0 || i16 <= 0) {
                                        i14 = i16;
                                    } else {
                                        iM2341x3 = dc1Var9.m2341x();
                                        i14 = i16 - 1;
                                        iM2324g2 = dc1Var9.m2324g();
                                    }
                                    j6 += (long) iArrCopyOf[i15];
                                    i12--;
                                    i15++;
                                    v12Var4 = v12Var2;
                                    iMo2988b = i19;
                                }
                                jArr3 = jArrCopyOf2;
                                i17 = i12;
                                long j21 = j5 + ((long) iM2324g);
                                if (dc1Var2 == null) {
                                    z4 = true;
                                    break;
                                }
                                while (true) {
                                    if (iM2341x <= 0) {
                                        z4 = true;
                                        break;
                                    }
                                    if (dc1Var2.m2341x() != 0) {
                                        z4 = false;
                                        break;
                                    }
                                    dc1Var2.m2324g();
                                    iM2341x--;
                                }
                                if (i10 != 0 && iM2341x3 == 0 && i17 == 0 && i16 == 0 && i13 == 0 && z4) {
                                    v12Var4 = v12Var2;
                                } else {
                                    StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                                    v12Var4 = v12Var2;
                                    AbstractC1308pu.m5356w(sb, v12Var4.f11484a, ": remainingSynchronizationSamples ", i10, ", remainingSamplesAtTimestampDelta ");
                                    AbstractC1308pu.m5356w(sb, iM2341x3, ", remainingSamplesInChunk ", i17, ", remainingTimestampDeltaChanges ");
                                    sb.append(i16);
                                    sb.append(", remainingSamplesAtTimestampOffset ");
                                    sb.append(i13);
                                    if (z4) {
                                        str2 = "";
                                    } else {
                                        str2 = ", ctts invalid";
                                    }
                                    sb.append(str2);
                                    AbstractC1337qm.m5542i0("BoxParsers", sb.toString());
                                }
                                i18 = i11;
                                j7 = j21;
                                jArr4 = jArrCopyOf;
                            }
                            long j22 = v12Var4.f11486c;
                            roundingMode = RoundingMode.DOWN;
                            jM7222J3 = z42.m7222J(j7, 1000000L, j22, roundingMode);
                            if (jArr13 == 0) {
                                z42.m7221I(jArr3, j16);
                                d22Var2 = new d22(v12Var4, jArr4, iArrCopyOf, i18, jArr3, iArrCopyOf2, jM7222J3);
                            } else {
                                jArr5 = jArr13;
                                iArr2 = iArrCopyOf2;
                                if (jArr5.length == 1 && i46 == 1 && jArr3.length >= 2) {
                                    jArr12.getClass();
                                    j13 = jArr12[0];
                                    jM7222J5 = j13 + z42.m7222J(jArr5[0], v12Var4.f11486c, v12Var4.f11487d, roundingMode);
                                    int length = jArr3.length - 1;
                                    int iM7233g = z42.m7233g(4, 0, length);
                                    int iM7233g2 = z42.m7233g(jArr3.length - 4, 0, length);
                                    j14 = jArr3[0];
                                    if (j14 <= j13 && j13 < jArr3[iM7233g] && jArr3[iM7233g2] < jM7222J5 && jM7222J5 <= j7) {
                                        long j23 = i9;
                                        jM7222J6 = z42.m7222J(j13 - j14, j23, v12Var4.f11486c, roundingMode);
                                        jM7222J7 = z42.m7222J(j7 - jM7222J5, j23, v12Var4.f11486c, roundingMode);
                                        if ((jM7222J6 == 0 || jM7222J7 != 0) && jM7222J6 <= 2147483647L && jM7222J7 <= 2147483647L) {
                                            xh0Var.f12605a = (int) jM7222J6;
                                            xh0Var.f12606b = (int) jM7222J7;
                                            z42.m7221I(jArr3, j16);
                                            d22Var2 = new d22(v12Var4, jArr4, iArrCopyOf, i18, jArr3, iArr2, z42.m7222J(jArr5[0], 1000000L, v12Var4.f11487d, roundingMode));
                                        }
                                        arrayList4.add(d22Var);
                                    }
                                }
                                i21 = 1;
                                if (jArr5.length != 1) {
                                    jArr6 = jArr4;
                                    iArr3 = iArrCopyOf;
                                    if (i46 == i21) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    iArr4 = new int[jArr5.length];
                                    iArr5 = new int[jArr5.length];
                                    jArr12.getClass();
                                    i22 = 0;
                                    z6 = false;
                                    i23 = 0;
                                    i24 = 0;
                                    while (i22 < jArr5.length) {
                                        iArr10 = iArr4;
                                        iArr11 = iArr5;
                                        j10 = jArr12[i22];
                                        if (j10 != -1) {
                                            i30 = i22;
                                            boolean z11 = z6;
                                            long jM7222J8 = z42.m7222J(jArr5[i22], v12Var4.f11486c, v12Var4.f11487d, RoundingMode.DOWN);
                                            iArr12 = iArr10;
                                            iArr12[i30] = z42.m7230d(jArr3, j10, true);
                                            while (true) {
                                                i31 = iArr12[i30];
                                                if (i31 < 0 || (iArr2[i31] & 1) != 0) {
                                                    break;
                                                }
                                                iArr12[i30] = i31 - 1;
                                            }
                                            j11 = j10 + jM7222J8;
                                            iArr11[i30] = z42.m7227a(jArr3, j11, z5);
                                            if (i46 == 2) {
                                                while (true) {
                                                    i33 = iArr11[i30];
                                                    if (i33 < jArr3.length - 1) {
                                                        break;
                                                    }
                                                    i34 = i33 + 1;
                                                    if (jArr3[i34] <= j11) {
                                                        break;
                                                    }
                                                    iArr11[i30] = i34;
                                                }
                                            }
                                            int i66 = iArr11[i30];
                                            i32 = iArr12[i30];
                                            int i67 = (i66 - i32) + i23;
                                            if (i24 != i32) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            i24 = i66;
                                            z6 = z11 | z10;
                                            i23 = i67;
                                        } else {
                                            iArr12 = iArr10;
                                            i30 = i22;
                                        }
                                        i22 = i30 + 1;
                                        iArr5 = iArr11;
                                        iArr4 = iArr12;
                                    }
                                    iArr6 = iArr4;
                                    iArr7 = iArr5;
                                    boolean z12 = z6;
                                    if (i23 != iMo2988b) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    z8 = z12 | z7;
                                    if (z8) {
                                        jArr7 = new long[i23];
                                    } else {
                                        jArr7 = jArr6;
                                    }
                                    if (z8) {
                                        iArr8 = new int[i23];
                                    } else {
                                        iArr8 = iArr3;
                                    }
                                    if (z8) {
                                        i18 = 0;
                                    }
                                    if (z8) {
                                        iArr9 = new int[i23];
                                    } else {
                                        iArr9 = iArr2;
                                    }
                                    jArr8 = new long[i23];
                                    i25 = i18;
                                    i26 = 0;
                                    z9 = false;
                                    i27 = 0;
                                    j8 = 0;
                                    while (i26 < jArr5.length) {
                                        j9 = jArr12[i26];
                                        i28 = iArr6[i26];
                                        i29 = iArr7[i26];
                                        long[] jArr16 = jArr5;
                                        if (z8) {
                                            int i68 = i29 - i28;
                                            System.arraycopy(jArr6, i28, jArr7, i27, i68);
                                            System.arraycopy(iArr3, i28, iArr8, i27, i68);
                                            System.arraycopy(iArr2, i28, iArr9, i27, i68);
                                        }
                                        int i69 = i25;
                                        while (i28 < i29) {
                                            long[] jArr17 = jArr6;
                                            int[] iArr15 = iArr3;
                                            long j24 = v12Var4.f11487d;
                                            RoundingMode roundingMode2 = RoundingMode.DOWN;
                                            long jM7222J9 = z42.m7222J(j8, 1000000L, j24, roundingMode2);
                                            jM7222J4 = z42.m7222J(jArr3[i28] - j9, 1000000L, v12Var4.f11486c, roundingMode2);
                                            if (jM7222J4 < 0) {
                                                z9 = true;
                                            }
                                            jArr8[i27] = jM7222J9 + jM7222J4;
                                            if (!z8 && iArr8[i27] > i69) {
                                                i69 = iArr15[i28];
                                            }
                                            i27++;
                                            i28++;
                                            jArr6 = jArr17;
                                            iArr3 = iArr15;
                                        }
                                        j8 += jArr16[i26];
                                        i26++;
                                        i25 = i69;
                                        jArr6 = jArr6;
                                        iArr3 = iArr3;
                                        jArr5 = jArr16;
                                    }
                                    long jM7222J10 = z42.m7222J(j8, 1000000L, v12Var4.f11487d, RoundingMode.DOWN);
                                    if (z9) {
                                        ae0 ae0VarM969a2 = be0Var3.m969a();
                                        ae0VarM969a2.f203s = true;
                                        v12Var3 = new v12(v12Var4.f11484a, v12Var4.f11485b, v12Var4.f11486c, v12Var4.f11487d, v12Var4.f11488e, v12Var4.f11489f, new be0(ae0VarM969a2), v12Var4.f11491h, v12Var4.f11495l, v12Var4.f11494k, v12Var4.f11492i, v12Var4.f11493j);
                                    } else {
                                        v12Var3 = v12Var4;
                                    }
                                    arrayList4 = arrayList2;
                                    d22Var = new d22(v12Var3, jArr7, iArr8, i25, jArr8, iArr9, jM7222J10);
                                } else if (jArr5[0] == 0) {
                                    jArr12.getClass();
                                    j12 = jArr12[0];
                                    for (i35 = 0; i35 < jArr3.length; i35++) {
                                        jArr3[i35] = z42.m7222J(jArr3[i35] - j12, 1000000L, v12Var4.f11486c, RoundingMode.DOWN);
                                    }
                                    d22Var = new d22(v12Var4, jArr4, iArrCopyOf, i18, jArr3, iArr2, z42.m7222J(j7 - j12, 1000000L, v12Var4.f11486c, RoundingMode.DOWN));
                                    arrayList4 = arrayList2;
                                } else {
                                    i21 = 1;
                                    jArr6 = jArr4;
                                    iArr3 = iArrCopyOf;
                                    if (i46 == i21) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    iArr4 = new int[jArr5.length];
                                    iArr5 = new int[jArr5.length];
                                    jArr12.getClass();
                                    i22 = 0;
                                    z6 = false;
                                    i23 = 0;
                                    i24 = 0;
                                    while (i22 < jArr5.length) {
                                        iArr10 = iArr4;
                                        iArr11 = iArr5;
                                        j10 = jArr12[i22];
                                        if (j10 != -1) {
                                            i30 = i22;
                                            boolean z13 = z6;
                                            long jM7222J11 = z42.m7222J(jArr5[i22], v12Var4.f11486c, v12Var4.f11487d, RoundingMode.DOWN);
                                            iArr12 = iArr10;
                                            iArr12[i30] = z42.m7230d(jArr3, j10, true);
                                            while (true) {
                                                i31 = iArr12[i30];
                                                if (i31 < 0) {
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr12[i30] = i31 - 1;
                                            }
                                            j11 = j10 + jM7222J11;
                                            iArr11[i30] = z42.m7227a(jArr3, j11, z5);
                                            if (i46 == 2) {
                                                while (true) {
                                                    i33 = iArr11[i30];
                                                    if (i33 < jArr3.length - 1) {
                                                        break;
                                                        break;
                                                    }
                                                    i34 = i33 + 1;
                                                    if (jArr3[i34] <= j11) {
                                                        break;
                                                        break;
                                                    }
                                                    iArr11[i30] = i34;
                                                }
                                            }
                                            int i610 = iArr11[i30];
                                            i32 = iArr12[i30];
                                            int i611 = (i610 - i32) + i23;
                                            if (i24 != i32) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            i24 = i610;
                                            z6 = z13 | z10;
                                            i23 = i611;
                                        } else {
                                            iArr12 = iArr10;
                                            i30 = i22;
                                        }
                                        i22 = i30 + 1;
                                        iArr5 = iArr11;
                                        iArr4 = iArr12;
                                    }
                                    iArr6 = iArr4;
                                    iArr7 = iArr5;
                                    boolean z14 = z6;
                                    if (i23 != iMo2988b) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    z8 = z14 | z7;
                                    if (z8) {
                                        jArr7 = new long[i23];
                                    } else {
                                        jArr7 = jArr6;
                                    }
                                    if (z8) {
                                        iArr8 = new int[i23];
                                    } else {
                                        iArr8 = iArr3;
                                    }
                                    if (z8) {
                                        i18 = 0;
                                    }
                                    if (z8) {
                                        iArr9 = new int[i23];
                                    } else {
                                        iArr9 = iArr2;
                                    }
                                    jArr8 = new long[i23];
                                    i25 = i18;
                                    i26 = 0;
                                    z9 = false;
                                    i27 = 0;
                                    j8 = 0;
                                    while (i26 < jArr5.length) {
                                        j9 = jArr12[i26];
                                        i28 = iArr6[i26];
                                        i29 = iArr7[i26];
                                        long[] jArr18 = jArr5;
                                        if (z8) {
                                            int i612 = i29 - i28;
                                            System.arraycopy(jArr6, i28, jArr7, i27, i612);
                                            System.arraycopy(iArr3, i28, iArr8, i27, i612);
                                            System.arraycopy(iArr2, i28, iArr9, i27, i612);
                                        }
                                        int i613 = i25;
                                        while (i28 < i29) {
                                            long[] jArr19 = jArr6;
                                            int[] iArr16 = iArr3;
                                            long j25 = v12Var4.f11487d;
                                            RoundingMode roundingMode3 = RoundingMode.DOWN;
                                            long jM7222J12 = z42.m7222J(j8, 1000000L, j25, roundingMode3);
                                            jM7222J4 = z42.m7222J(jArr3[i28] - j9, 1000000L, v12Var4.f11486c, roundingMode3);
                                            if (jM7222J4 < 0) {
                                                z9 = true;
                                            }
                                            jArr8[i27] = jM7222J12 + jM7222J4;
                                            if (!z8) {
                                            }
                                            i27++;
                                            i28++;
                                            jArr6 = jArr19;
                                            iArr3 = iArr16;
                                        }
                                        j8 += jArr18[i26];
                                        i26++;
                                        i25 = i613;
                                        jArr6 = jArr6;
                                        iArr3 = iArr3;
                                        jArr5 = jArr18;
                                    }
                                    long jM7222J13 = z42.m7222J(j8, 1000000L, v12Var4.f11487d, RoundingMode.DOWN);
                                    if (z9) {
                                        ae0 ae0VarM969a3 = be0Var3.m969a();
                                        ae0VarM969a3.f203s = true;
                                        v12Var3 = new v12(v12Var4.f11484a, v12Var4.f11485b, v12Var4.f11486c, v12Var4.f11487d, v12Var4.f11488e, v12Var4.f11489f, new be0(ae0VarM969a3), v12Var4.f11491h, v12Var4.f11495l, v12Var4.f11494k, v12Var4.f11492i, v12Var4.f11493j);
                                    } else {
                                        v12Var3 = v12Var4;
                                    }
                                    arrayList4 = arrayList2;
                                    d22Var = new d22(v12Var3, jArr7, iArr8, i25, jArr8, iArr9, jM7222J13);
                                }
                                arrayList4.add(d22Var);
                            }
                            d22Var = d22Var2;
                            arrayList4 = arrayList2;
                        } else {
                            i8 = 0;
                        }
                        iM2341x2 = -1;
                        iMo2987a = interfaceC0679gj.mo2987a();
                        dc1Var2 = dc1Var11;
                        String str4 = be0Var3.f1341n;
                        dc1Var3 = dc1Var10;
                        i9 = be0Var3.f1318D;
                        if (iMo2987a == -1) {
                            arrayList2 = arrayList4;
                            jArrCopyOf = new long[iMo2988b];
                            iArrCopyOf = new int[iMo2988b];
                            jArrCopyOf2 = new long[iMo2988b];
                            iArr = new int[iMo2988b];
                            i10 = i8;
                            iM2341x3 = iM2341x8;
                            j5 = 0;
                            j6 = 0;
                            i11 = 0;
                            iM2324g = 0;
                            i12 = 0;
                            i13 = 0;
                            i14 = iM2341x7;
                            iM2324g2 = iM2341x9;
                            iM2341x4 = iM2341x2;
                            i15 = 0;
                            while (true) {
                                if (i15 >= iMo2988b) {
                                    v12Var2 = v12Var4;
                                    i16 = i14;
                                    iArrCopyOf2 = iArr;
                                    break;
                                }
                                zM2588a = true;
                                while (i12 == 0) {
                                    zM2588a = c0605ej.m2588a();
                                    if (!zM2588a) {
                                        break;
                                        break;
                                    }
                                    v12 v12Var6 = v12Var4;
                                    long j26 = c0605ej.f3358d;
                                    i12 = c0605ej.f3357c;
                                    j6 = j26;
                                    v12Var4 = v12Var6;
                                    i14 = i14;
                                    iMo2988b = iMo2988b;
                                }
                                i19 = iMo2988b;
                                v12Var2 = v12Var4;
                                i16 = i14;
                                if (!zM2588a) {
                                    AbstractC1337qm.m5542i0("BoxParsers", "Unexpected end of chunk data");
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15);
                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i15);
                                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i15);
                                    iArrCopyOf2 = Arrays.copyOf(iArr, i15);
                                    iMo2988b = i15;
                                    break;
                                }
                                if (dc1Var2 != null) {
                                    iM2341x5 = i13;
                                    while (iM2341x5 == 0) {
                                        iM2341x5 = dc1Var2.m2341x();
                                        iM2324g = dc1Var2.m2324g();
                                        iM2341x--;
                                    }
                                    i13 = iM2341x5 - 1;
                                }
                                jArrCopyOf[i15] = j6;
                                iMo2989c = interfaceC0679gj.mo2989c();
                                iArrCopyOf[i15] = iMo2989c;
                                if (iMo2989c > i11) {
                                    i11 = iMo2989c;
                                }
                                jArrCopyOf2[i15] = j5 + ((long) iM2324g);
                                if (dc1Var3 == null) {
                                    i20 = 1;
                                } else {
                                    i20 = 0;
                                }
                                iArr[i15] = i20;
                                if (i15 == iM2341x4) {
                                    iArr[i15] = 1;
                                    i10--;
                                    if (i10 > 0) {
                                        dc1Var3.getClass();
                                        iM2341x4 = dc1Var3.m2341x() - 1;
                                    }
                                }
                                j5 += (long) iM2324g2;
                                iM2341x3--;
                                if (iM2341x3 == 0) {
                                    i14 = i16;
                                } else {
                                    i14 = i16;
                                }
                                j6 += (long) iArrCopyOf[i15];
                                i12--;
                                i15++;
                                v12Var4 = v12Var2;
                                iMo2988b = i19;
                            }
                            jArr3 = jArrCopyOf2;
                            i17 = i12;
                            long j27 = j5 + ((long) iM2324g);
                            if (dc1Var2 == null) {
                                z4 = true;
                                break;
                            }
                            while (true) {
                                if (iM2341x <= 0) {
                                    z4 = true;
                                    break;
                                }
                                if (dc1Var2.m2341x() != 0) {
                                    z4 = false;
                                    break;
                                }
                                dc1Var2.m2324g();
                                iM2341x--;
                            }
                            if (i10 != 0) {
                                StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                                v12Var4 = v12Var2;
                                AbstractC1308pu.m5356w(sb2, v12Var4.f11484a, ": remainingSynchronizationSamples ", i10, ", remainingSamplesAtTimestampDelta ");
                                AbstractC1308pu.m5356w(sb2, iM2341x3, ", remainingSamplesInChunk ", i17, ", remainingTimestampDeltaChanges ");
                                sb2.append(i16);
                                sb2.append(", remainingSamplesAtTimestampOffset ");
                                sb2.append(i13);
                                if (z4) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = "";
                                }
                                sb2.append(str2);
                                AbstractC1337qm.m5542i0("BoxParsers", sb2.toString());
                            } else {
                                StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                                v12Var4 = v12Var2;
                                AbstractC1308pu.m5356w(sb3, v12Var4.f11484a, ": remainingSynchronizationSamples ", i10, ", remainingSamplesAtTimestampDelta ");
                                AbstractC1308pu.m5356w(sb3, iM2341x3, ", remainingSamplesInChunk ", i17, ", remainingTimestampDeltaChanges ");
                                sb3.append(i16);
                                sb3.append(", remainingSamplesAtTimestampOffset ");
                                sb3.append(i13);
                                if (z4) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = "";
                                }
                                sb3.append(str2);
                                AbstractC1337qm.m5542i0("BoxParsers", sb3.toString());
                            }
                            i18 = i11;
                            j7 = j27;
                            jArr4 = jArrCopyOf;
                        } else {
                            arrayList2 = arrayList4;
                            jArrCopyOf = new long[iMo2988b];
                            iArrCopyOf = new int[iMo2988b];
                            jArrCopyOf2 = new long[iMo2988b];
                            iArr = new int[iMo2988b];
                            i10 = i8;
                            iM2341x3 = iM2341x8;
                            j5 = 0;
                            j6 = 0;
                            i11 = 0;
                            iM2324g = 0;
                            i12 = 0;
                            i13 = 0;
                            i14 = iM2341x7;
                            iM2324g2 = iM2341x9;
                            iM2341x4 = iM2341x2;
                            i15 = 0;
                            while (true) {
                                if (i15 >= iMo2988b) {
                                    v12Var2 = v12Var4;
                                    i16 = i14;
                                    iArrCopyOf2 = iArr;
                                    break;
                                }
                                zM2588a = true;
                                while (i12 == 0) {
                                    zM2588a = c0605ej.m2588a();
                                    if (!zM2588a) {
                                        break;
                                        break;
                                    }
                                    v12 v12Var7 = v12Var4;
                                    long j28 = c0605ej.f3358d;
                                    i12 = c0605ej.f3357c;
                                    j6 = j28;
                                    v12Var4 = v12Var7;
                                    i14 = i14;
                                    iMo2988b = iMo2988b;
                                }
                                i19 = iMo2988b;
                                v12Var2 = v12Var4;
                                i16 = i14;
                                if (!zM2588a) {
                                    AbstractC1337qm.m5542i0("BoxParsers", "Unexpected end of chunk data");
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15);
                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i15);
                                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i15);
                                    iArrCopyOf2 = Arrays.copyOf(iArr, i15);
                                    iMo2988b = i15;
                                    break;
                                }
                                if (dc1Var2 != null) {
                                    iM2341x5 = i13;
                                    while (iM2341x5 == 0) {
                                        iM2341x5 = dc1Var2.m2341x();
                                        iM2324g = dc1Var2.m2324g();
                                        iM2341x--;
                                    }
                                    i13 = iM2341x5 - 1;
                                }
                                jArrCopyOf[i15] = j6;
                                iMo2989c = interfaceC0679gj.mo2989c();
                                iArrCopyOf[i15] = iMo2989c;
                                if (iMo2989c > i11) {
                                    i11 = iMo2989c;
                                }
                                jArrCopyOf2[i15] = j5 + ((long) iM2324g);
                                if (dc1Var3 == null) {
                                    i20 = 1;
                                } else {
                                    i20 = 0;
                                }
                                iArr[i15] = i20;
                                if (i15 == iM2341x4) {
                                    iArr[i15] = 1;
                                    i10--;
                                    if (i10 > 0) {
                                        dc1Var3.getClass();
                                        iM2341x4 = dc1Var3.m2341x() - 1;
                                    }
                                }
                                j5 += (long) iM2324g2;
                                iM2341x3--;
                                if (iM2341x3 == 0) {
                                    i14 = i16;
                                } else {
                                    i14 = i16;
                                }
                                j6 += (long) iArrCopyOf[i15];
                                i12--;
                                i15++;
                                v12Var4 = v12Var2;
                                iMo2988b = i19;
                            }
                            jArr3 = jArrCopyOf2;
                            i17 = i12;
                            long j29 = j5 + ((long) iM2324g);
                            if (dc1Var2 == null) {
                                z4 = true;
                                break;
                            }
                            while (true) {
                                if (iM2341x <= 0) {
                                    z4 = true;
                                    break;
                                }
                                if (dc1Var2.m2341x() != 0) {
                                    z4 = false;
                                    break;
                                }
                                dc1Var2.m2324g();
                                iM2341x--;
                            }
                            if (i10 != 0) {
                                StringBuilder sb4 = new StringBuilder("Inconsistent stbl box for track ");
                                v12Var4 = v12Var2;
                                AbstractC1308pu.m5356w(sb4, v12Var4.f11484a, ": remainingSynchronizationSamples ", i10, ", remainingSamplesAtTimestampDelta ");
                                AbstractC1308pu.m5356w(sb4, iM2341x3, ", remainingSamplesInChunk ", i17, ", remainingTimestampDeltaChanges ");
                                sb4.append(i16);
                                sb4.append(", remainingSamplesAtTimestampOffset ");
                                sb4.append(i13);
                                if (z4) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = "";
                                }
                                sb4.append(str2);
                                AbstractC1337qm.m5542i0("BoxParsers", sb4.toString());
                            } else {
                                StringBuilder sb5 = new StringBuilder("Inconsistent stbl box for track ");
                                v12Var4 = v12Var2;
                                AbstractC1308pu.m5356w(sb5, v12Var4.f11484a, ": remainingSynchronizationSamples ", i10, ", remainingSamplesAtTimestampDelta ");
                                AbstractC1308pu.m5356w(sb5, iM2341x3, ", remainingSamplesInChunk ", i17, ", remainingTimestampDeltaChanges ");
                                sb5.append(i16);
                                sb5.append(", remainingSamplesAtTimestampOffset ");
                                sb5.append(i13);
                                if (z4) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = "";
                                }
                                sb5.append(str2);
                                AbstractC1337qm.m5542i0("BoxParsers", sb5.toString());
                            }
                            i18 = i11;
                            j7 = j29;
                            jArr4 = jArrCopyOf;
                        }
                        long j210 = v12Var4.f11486c;
                        roundingMode = RoundingMode.DOWN;
                        jM7222J3 = z42.m7222J(j7, 1000000L, j210, roundingMode);
                        if (jArr13 == 0) {
                            z42.m7221I(jArr3, j16);
                            d22Var2 = new d22(v12Var4, jArr4, iArrCopyOf, i18, jArr3, iArrCopyOf2, jM7222J3);
                        } else {
                            jArr5 = jArr13;
                            iArr2 = iArrCopyOf2;
                            if (jArr5.length == 1) {
                                jArr12.getClass();
                                j13 = jArr12[0];
                                jM7222J5 = j13 + z42.m7222J(jArr5[0], v12Var4.f11486c, v12Var4.f11487d, roundingMode);
                                int length2 = jArr3.length - 1;
                                int iM7233g3 = z42.m7233g(4, 0, length2);
                                int iM7233g4 = z42.m7233g(jArr3.length - 4, 0, length2);
                                j14 = jArr3[0];
                                if (j14 <= j13) {
                                    long j211 = i9;
                                    jM7222J6 = z42.m7222J(j13 - j14, j211, v12Var4.f11486c, roundingMode);
                                    jM7222J7 = z42.m7222J(j7 - jM7222J5, j211, v12Var4.f11486c, roundingMode);
                                    if (jM7222J6 == 0) {
                                        xh0Var.f12605a = (int) jM7222J6;
                                        xh0Var.f12606b = (int) jM7222J7;
                                        z42.m7221I(jArr3, j16);
                                        d22Var2 = new d22(v12Var4, jArr4, iArrCopyOf, i18, jArr3, iArr2, z42.m7222J(jArr5[0], 1000000L, v12Var4.f11487d, roundingMode));
                                    } else {
                                        xh0Var.f12605a = (int) jM7222J6;
                                        xh0Var.f12606b = (int) jM7222J7;
                                        z42.m7221I(jArr3, j16);
                                        d22Var2 = new d22(v12Var4, jArr4, iArrCopyOf, i18, jArr3, iArr2, z42.m7222J(jArr5[0], 1000000L, v12Var4.f11487d, roundingMode));
                                    }
                                }
                            }
                            i21 = 1;
                            if (jArr5.length != 1) {
                                jArr6 = jArr4;
                                iArr3 = iArrCopyOf;
                                if (i46 == i21) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                iArr4 = new int[jArr5.length];
                                iArr5 = new int[jArr5.length];
                                jArr12.getClass();
                                i22 = 0;
                                z6 = false;
                                i23 = 0;
                                i24 = 0;
                                while (i22 < jArr5.length) {
                                    iArr10 = iArr4;
                                    iArr11 = iArr5;
                                    j10 = jArr12[i22];
                                    if (j10 != -1) {
                                        i30 = i22;
                                        boolean z15 = z6;
                                        long jM7222J14 = z42.m7222J(jArr5[i22], v12Var4.f11486c, v12Var4.f11487d, RoundingMode.DOWN);
                                        iArr12 = iArr10;
                                        iArr12[i30] = z42.m7230d(jArr3, j10, true);
                                        while (true) {
                                            i31 = iArr12[i30];
                                            if (i31 < 0) {
                                                break;
                                                break;
                                            }
                                            break;
                                            break;
                                            iArr12[i30] = i31 - 1;
                                        }
                                        j11 = j10 + jM7222J14;
                                        iArr11[i30] = z42.m7227a(jArr3, j11, z5);
                                        if (i46 == 2) {
                                            while (true) {
                                                i33 = iArr11[i30];
                                                if (i33 < jArr3.length - 1) {
                                                    break;
                                                    break;
                                                }
                                                i34 = i33 + 1;
                                                if (jArr3[i34] <= j11) {
                                                    break;
                                                    break;
                                                }
                                                iArr11[i30] = i34;
                                            }
                                        }
                                        int i614 = iArr11[i30];
                                        i32 = iArr12[i30];
                                        int i615 = (i614 - i32) + i23;
                                        if (i24 != i32) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        i24 = i614;
                                        z6 = z15 | z10;
                                        i23 = i615;
                                    } else {
                                        iArr12 = iArr10;
                                        i30 = i22;
                                    }
                                    i22 = i30 + 1;
                                    iArr5 = iArr11;
                                    iArr4 = iArr12;
                                }
                                iArr6 = iArr4;
                                iArr7 = iArr5;
                                boolean z16 = z6;
                                if (i23 != iMo2988b) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                z8 = z16 | z7;
                                if (z8) {
                                    jArr7 = new long[i23];
                                } else {
                                    jArr7 = jArr6;
                                }
                                if (z8) {
                                    iArr8 = new int[i23];
                                } else {
                                    iArr8 = iArr3;
                                }
                                if (z8) {
                                    i18 = 0;
                                }
                                if (z8) {
                                    iArr9 = new int[i23];
                                } else {
                                    iArr9 = iArr2;
                                }
                                jArr8 = new long[i23];
                                i25 = i18;
                                i26 = 0;
                                z9 = false;
                                i27 = 0;
                                j8 = 0;
                                while (i26 < jArr5.length) {
                                    j9 = jArr12[i26];
                                    i28 = iArr6[i26];
                                    i29 = iArr7[i26];
                                    long[] jArr110 = jArr5;
                                    if (z8) {
                                        int i616 = i29 - i28;
                                        System.arraycopy(jArr6, i28, jArr7, i27, i616);
                                        System.arraycopy(iArr3, i28, iArr8, i27, i616);
                                        System.arraycopy(iArr2, i28, iArr9, i27, i616);
                                    }
                                    int i617 = i25;
                                    while (i28 < i29) {
                                        long[] jArr111 = jArr6;
                                        int[] iArr17 = iArr3;
                                        long j212 = v12Var4.f11487d;
                                        RoundingMode roundingMode4 = RoundingMode.DOWN;
                                        long jM7222J15 = z42.m7222J(j8, 1000000L, j212, roundingMode4);
                                        jM7222J4 = z42.m7222J(jArr3[i28] - j9, 1000000L, v12Var4.f11486c, roundingMode4);
                                        if (jM7222J4 < 0) {
                                            z9 = true;
                                        }
                                        jArr8[i27] = jM7222J15 + jM7222J4;
                                        if (!z8) {
                                        }
                                        i27++;
                                        i28++;
                                        jArr6 = jArr111;
                                        iArr3 = iArr17;
                                    }
                                    j8 += jArr110[i26];
                                    i26++;
                                    i25 = i617;
                                    jArr6 = jArr6;
                                    iArr3 = iArr3;
                                    jArr5 = jArr110;
                                }
                                long jM7222J16 = z42.m7222J(j8, 1000000L, v12Var4.f11487d, RoundingMode.DOWN);
                                if (z9) {
                                    ae0 ae0VarM969a4 = be0Var3.m969a();
                                    ae0VarM969a4.f203s = true;
                                    v12Var3 = new v12(v12Var4.f11484a, v12Var4.f11485b, v12Var4.f11486c, v12Var4.f11487d, v12Var4.f11488e, v12Var4.f11489f, new be0(ae0VarM969a4), v12Var4.f11491h, v12Var4.f11495l, v12Var4.f11494k, v12Var4.f11492i, v12Var4.f11493j);
                                } else {
                                    v12Var3 = v12Var4;
                                }
                                arrayList4 = arrayList2;
                                d22Var = new d22(v12Var3, jArr7, iArr8, i25, jArr8, iArr9, jM7222J16);
                            } else if (jArr5[0] == 0) {
                                jArr12.getClass();
                                j12 = jArr12[0];
                                while (i35 < jArr3.length) {
                                    jArr3[i35] = z42.m7222J(jArr3[i35] - j12, 1000000L, v12Var4.f11486c, RoundingMode.DOWN);
                                }
                                d22Var = new d22(v12Var4, jArr4, iArrCopyOf, i18, jArr3, iArr2, z42.m7222J(j7 - j12, 1000000L, v12Var4.f11486c, RoundingMode.DOWN));
                                arrayList4 = arrayList2;
                            } else {
                                i21 = 1;
                                jArr6 = jArr4;
                                iArr3 = iArrCopyOf;
                                if (i46 == i21) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                iArr4 = new int[jArr5.length];
                                iArr5 = new int[jArr5.length];
                                jArr12.getClass();
                                i22 = 0;
                                z6 = false;
                                i23 = 0;
                                i24 = 0;
                                while (i22 < jArr5.length) {
                                    iArr10 = iArr4;
                                    iArr11 = iArr5;
                                    j10 = jArr12[i22];
                                    if (j10 != -1) {
                                        i30 = i22;
                                        boolean z17 = z6;
                                        long jM7222J17 = z42.m7222J(jArr5[i22], v12Var4.f11486c, v12Var4.f11487d, RoundingMode.DOWN);
                                        iArr12 = iArr10;
                                        iArr12[i30] = z42.m7230d(jArr3, j10, true);
                                        while (true) {
                                            i31 = iArr12[i30];
                                            if (i31 < 0) {
                                                break;
                                                break;
                                            }
                                            break;
                                            break;
                                            iArr12[i30] = i31 - 1;
                                        }
                                        j11 = j10 + jM7222J17;
                                        iArr11[i30] = z42.m7227a(jArr3, j11, z5);
                                        if (i46 == 2) {
                                            while (true) {
                                                i33 = iArr11[i30];
                                                if (i33 < jArr3.length - 1) {
                                                    break;
                                                    break;
                                                }
                                                i34 = i33 + 1;
                                                if (jArr3[i34] <= j11) {
                                                    break;
                                                    break;
                                                }
                                                iArr11[i30] = i34;
                                            }
                                        }
                                        int i618 = iArr11[i30];
                                        i32 = iArr12[i30];
                                        int i619 = (i618 - i32) + i23;
                                        if (i24 != i32) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        i24 = i618;
                                        z6 = z17 | z10;
                                        i23 = i619;
                                    } else {
                                        iArr12 = iArr10;
                                        i30 = i22;
                                    }
                                    i22 = i30 + 1;
                                    iArr5 = iArr11;
                                    iArr4 = iArr12;
                                }
                                iArr6 = iArr4;
                                iArr7 = iArr5;
                                boolean z18 = z6;
                                if (i23 != iMo2988b) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                z8 = z18 | z7;
                                if (z8) {
                                    jArr7 = new long[i23];
                                } else {
                                    jArr7 = jArr6;
                                }
                                if (z8) {
                                    iArr8 = new int[i23];
                                } else {
                                    iArr8 = iArr3;
                                }
                                if (z8) {
                                    i18 = 0;
                                }
                                if (z8) {
                                    iArr9 = new int[i23];
                                } else {
                                    iArr9 = iArr2;
                                }
                                jArr8 = new long[i23];
                                i25 = i18;
                                i26 = 0;
                                z9 = false;
                                i27 = 0;
                                j8 = 0;
                                while (i26 < jArr5.length) {
                                    j9 = jArr12[i26];
                                    i28 = iArr6[i26];
                                    i29 = iArr7[i26];
                                    long[] jArr112 = jArr5;
                                    if (z8) {
                                        int i6110 = i29 - i28;
                                        System.arraycopy(jArr6, i28, jArr7, i27, i6110);
                                        System.arraycopy(iArr3, i28, iArr8, i27, i6110);
                                        System.arraycopy(iArr2, i28, iArr9, i27, i6110);
                                    }
                                    int i6111 = i25;
                                    while (i28 < i29) {
                                        long[] jArr113 = jArr6;
                                        int[] iArr18 = iArr3;
                                        long j213 = v12Var4.f11487d;
                                        RoundingMode roundingMode5 = RoundingMode.DOWN;
                                        long jM7222J18 = z42.m7222J(j8, 1000000L, j213, roundingMode5);
                                        jM7222J4 = z42.m7222J(jArr3[i28] - j9, 1000000L, v12Var4.f11486c, roundingMode5);
                                        if (jM7222J4 < 0) {
                                            z9 = true;
                                        }
                                        jArr8[i27] = jM7222J18 + jM7222J4;
                                        if (!z8) {
                                        }
                                        i27++;
                                        i28++;
                                        jArr6 = jArr113;
                                        iArr3 = iArr18;
                                    }
                                    j8 += jArr112[i26];
                                    i26++;
                                    i25 = i6111;
                                    jArr6 = jArr6;
                                    iArr3 = iArr3;
                                    jArr5 = jArr112;
                                }
                                long jM7222J19 = z42.m7222J(j8, 1000000L, v12Var4.f11487d, RoundingMode.DOWN);
                                if (z9) {
                                    ae0 ae0VarM969a5 = be0Var3.m969a();
                                    ae0VarM969a5.f203s = true;
                                    v12Var3 = new v12(v12Var4.f11484a, v12Var4.f11485b, v12Var4.f11486c, v12Var4.f11487d, v12Var4.f11488e, v12Var4.f11489f, new be0(ae0VarM969a5), v12Var4.f11491h, v12Var4.f11495l, v12Var4.f11494k, v12Var4.f11492i, v12Var4.f11493j);
                                } else {
                                    v12Var3 = v12Var4;
                                }
                                arrayList4 = arrayList2;
                                d22Var = new d22(v12Var3, jArr7, iArr8, i25, jArr8, iArr9, jM7222J19);
                            }
                            arrayList4.add(d22Var);
                        }
                        d22Var = d22Var2;
                        arrayList4 = arrayList2;
                    }
                    arrayList4.add(d22Var);
                }
                i36++;
                arrayList4 = arrayList4;
                arrayList3 = arrayList;
                k61Var2 = k61Var;
            }
            i36++;
            arrayList4 = arrayList4;
            arrayList3 = arrayList;
            k61Var2 = k61Var;
        }
        return arrayList4;
    }

    /* JADX WARN: Code duplicated, block: B:212:0x048b  */
    /* JADX WARN: Code duplicated, block: B:214:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:216:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:217:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:222:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:224:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:225:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:227:0x0504  */
    /* JADX WARN: Code duplicated, block: B:228:0x0513  */
    /* JADX WARN: Code duplicated, block: B:230:0x0519  */
    /* JADX WARN: Code duplicated, block: B:231:0x0529  */
    /* JADX WARN: Code duplicated, block: B:233:0x0532  */
    /* JADX WARN: Code duplicated, block: B:235:0x053f  */
    /* JADX WARN: Code duplicated, block: B:239:0x0565  */
    /* JADX WARN: Code duplicated, block: B:242:0x0571  */
    /* JADX WARN: Code duplicated, block: B:245:0x057b  */
    /* JADX WARN: Code duplicated, block: B:246:0x057e  */
    /* JADX WARN: Code duplicated, block: B:248:0x0585  */
    /* JADX WARN: Code duplicated, block: B:252:0x0590  */
    /* JADX WARN: Code duplicated, block: B:255:0x059d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:259:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:262:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:265:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:267:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:269:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:273:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:277:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:278:0x05df  */
    /* JADX WARN: Code duplicated, block: B:280:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:403:0x0542 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:212:0x048b, please report this as an issue */
    /* JADX INFO: renamed from: h */
    public static void m3652h(dc1 dc1Var, int i, int i2, int i3, int i4, int i5, z30 z30Var, C0716hj c0716hj, int i6) throws fc1 {
        String str;
        int i7;
        int i8;
        int i9;
        String str2;
        z30 z30Var2;
        C0599ed c0599ed;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iM1238i;
        boolean zM1237h;
        int iM1238i2;
        int i15;
        int iM1238i3;
        int i16;
        boolean zM1237h2;
        int i17;
        int iM1238i4;
        boolean z;
        int i18;
        int iM7330g;
        C1673zp c1673zp;
        int iM1238i5;
        int i19;
        int iM1238i6;
        int i20;
        C1673zp c1673zp2;
        int i21;
        String str3;
        ay0 ay0Var;
        int i22 = i2;
        int i23 = i3;
        z30 z30VarM7186a = z30Var;
        C0716hj c0716hj2 = c0716hj;
        dc1Var.m2316F(i22 + 16);
        dc1Var.m2317G(16);
        int iM2343z = dc1Var.m2343z();
        int iM2343z2 = dc1Var.m2343z();
        dc1Var.m2317G(50);
        int i24 = dc1Var.f2883b;
        int iIntValue = i;
        if (iIntValue == 1701733238) {
            Pair pairM3649e = m3649e(dc1Var, i22, i23);
            if (pairM3649e != null) {
                iIntValue = ((Integer) pairM3649e.first).intValue();
                z30VarM7186a = z30VarM7186a == null ? null : z30VarM7186a.m7186a(((w12) pairM3649e.second).f11905b);
                ((w12[]) c0716hj2.f4586c)[i6] = (w12) pairM3649e.second;
            }
            dc1Var.m2316F(i24);
        }
        String str4 = "video/3gpp";
        if (iIntValue == 1831958048) {
            str = "video/mpeg";
        } else {
            str = iIntValue == 1211250227 ? "video/3gpp" : null;
        }
        float fM2341x = 1.0f;
        List listM5570t = null;
        String str5 = null;
        byte[] bArrCopyOfRange = null;
        int i25 = -1;
        int i26 = -1;
        ByteBuffer byteBuffer = null;
        boolean z2 = false;
        int iM7329f = -1;
        int i27 = -1;
        int iM7330g2 = -1;
        int i28 = 8;
        int i29 = 8;
        C0642fj c0642fj = null;
        C0599ed c0599ed2 = null;
        while (i24 - i22 < i23) {
            dc1Var.m2316F(i24);
            int i30 = dc1Var.f2883b;
            int iM2324g = dc1Var.m2324g();
            if (iM2324g == 0 && dc1Var.f2883b - i22 == i23) {
                break;
            }
            String str6 = "childAtomSize must be positive";
            o21.m4663j("childAtomSize must be positive", iM2324g > 0);
            int iM2324g2 = dc1Var.m2324g();
            if (iM2324g2 == 1635148611) {
                o21.m4663j(null, str == null);
                dc1Var.m2316F(i30 + 8);
                C0748ie c0748ieM3425a = C0748ie.m3425a(dc1Var);
                listM5570t = c0748ieM3425a.f4988a;
                c0716hj2.f4584a = c0748ieM3425a.f4989b;
                if (!z2) {
                    fM2341x = c0748ieM3425a.f4998k;
                }
                String str7 = c0748ieM3425a.f4999l;
                int i31 = c0748ieM3425a.f4997j;
                int i32 = c0748ieM3425a.f4994g;
                int i33 = c0748ieM3425a.f4995h;
                str5 = str7;
                int i34 = c0748ieM3425a.f4996i;
                int i35 = c0748ieM3425a.f4992e;
                i9 = c0748ieM3425a.f4993f;
                i28 = i35;
                z30Var2 = z30VarM7186a;
                i7 = i24;
                iM7329f = i32;
                iIntValue = iIntValue;
                str2 = str4;
                i8 = i33;
                iM7330g2 = i34;
                i26 = i31;
                str = "video/avc";
            } else {
                i7 = i24;
                if (iM2324g2 == 1752589123) {
                    o21.m4663j(null, str == null);
                    dc1Var.m2316F(i30 + 8);
                    ik0 ik0VarM3444a = ik0.m3444a(dc1Var, false, null);
                    listM5570t = ik0VarM3444a.f5045a;
                    c0716hj2.f4584a = ik0VarM3444a.f5046b;
                    if (!z2) {
                        fM2341x = ik0VarM3444a.f5053i;
                    }
                    int i36 = ik0VarM3444a.f5054j;
                    String str8 = ik0VarM3444a.f5055k;
                    int i37 = ik0VarM3444a.f5052h;
                    if (i37 != -1) {
                        i25 = i37;
                    }
                    int i38 = ik0VarM3444a.f5049e;
                    int i39 = ik0VarM3444a.f5050f;
                    int i40 = ik0VarM3444a.f5051g;
                    int i41 = ik0VarM3444a.f5047c;
                    i9 = ik0VarM3444a.f5048d;
                    z30Var2 = z30VarM7186a;
                    c0599ed2 = ik0VarM3444a.f5056l;
                    iM7329f = i38;
                    iIntValue = iIntValue;
                    str2 = str4;
                    i8 = i39;
                    iM7330g2 = i40;
                    i28 = i41;
                    str = "video/hevc";
                    i26 = i36;
                    str5 = str8;
                } else {
                    String str9 = str4;
                    if (iM2324g2 == 1818785347) {
                        o21.m4663j("lhvC must follow hvcC atom", "video/hevc".equals(str));
                        C0599ed c0599ed3 = c0599ed2;
                        o21.m4663j("must have at least two layers", c0599ed3 != null && ((qm0) c0599ed3.f3313a).size() >= 2);
                        dc1Var.m2316F(i30 + 8);
                        c0599ed3.getClass();
                        ik0 ik0VarM3444a2 = ik0.m3444a(dc1Var, true, c0599ed3);
                        o21.m4663j("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", c0716hj2.f4584a == ik0VarM3444a2.f5046b);
                        int i42 = ik0VarM3444a2.f5049e;
                        int i43 = iM7329f;
                        if (i42 != -1) {
                            o21.m4663j("colorSpace must be the same for both views", i43 == i42);
                        }
                        int i44 = ik0VarM3444a2.f5050f;
                        int i45 = i27;
                        if (i44 != -1) {
                            o21.m4663j("colorRange must be the same for both views", i45 == i44);
                        }
                        int i46 = ik0VarM3444a2.f5051g;
                        int i47 = iM7330g2;
                        if (i46 != -1) {
                            o21.m4663j("colorTransfer must be the same for both views", i47 == i46);
                        }
                        int i48 = i28;
                        o21.m4663j("bitdepthLuma must be the same for both views", i48 == ik0VarM3444a2.f5047c);
                        int i49 = i29;
                        o21.m4663j("bitdepthChroma must be the same for both views", i49 == ik0VarM3444a2.f5048d);
                        if (listM5570t != null) {
                            nm0 nm0VarM5566m = qm0.m5566m();
                            nm0VarM5566m.m3904d(listM5570t);
                            nm0VarM5566m.m3904d(ik0VarM3444a2.f5045a);
                            listM5570t = nm0VarM5566m.m4561g();
                        } else {
                            o21.m4663j("initializationData must be already set from hvcC atom", false);
                        }
                        c0599ed2 = c0599ed3;
                        z30Var2 = z30VarM7186a;
                        str = "video/mv-hevc";
                        iIntValue = iIntValue;
                        iM7330g2 = i47;
                        i28 = i48;
                        iM7329f = i43;
                        str2 = str9;
                        str5 = ik0VarM3444a2.f5055k;
                        i9 = i49;
                        i8 = i45;
                    } else {
                        int i50 = iM7329f;
                        i8 = i27;
                        iM7330g2 = iM7330g2;
                        i9 = i29;
                        c0599ed2 = c0599ed2;
                        str2 = str9;
                        i28 = i28;
                        if (iM2324g2 == 1986361461) {
                            dc1Var.m2316F(i30 + 8);
                            int i51 = dc1Var.f2883b;
                            str = str;
                            ay0 ay0Var2 = null;
                            while (i51 - i30 < iM2324g) {
                                dc1Var.m2316F(i51);
                                int iM2324g3 = dc1Var.m2324g();
                                int i52 = i51;
                                o21.m4663j(str6, iM2324g3 > 0);
                                if (dc1Var.m2324g() == 1702454643) {
                                    dc1Var.m2316F(i52 + 8);
                                    int i53 = dc1Var.f2883b;
                                    while (true) {
                                        if (i53 - i52 >= iM2324g3) {
                                            str3 = str6;
                                            ay0Var = null;
                                            break;
                                        }
                                        dc1Var.m2316F(i53);
                                        int iM2324g4 = dc1Var.m2324g();
                                        o21.m4663j(str6, iM2324g4 > 0);
                                        str3 = str6;
                                        if (dc1Var.m2324g() == 1937011305) {
                                            dc1Var.m2317G(4);
                                            int iM2337t = dc1Var.m2337t();
                                            boolean z3 = (iM2337t & 1) == 1;
                                            boolean z4 = (iM2337t & 2) == 2;
                                            boolean z5 = (iM2337t & 8) == 8;
                                            C0709hc c0709hc = new C0709hc();
                                            c0709hc.f4519a = z3;
                                            c0709hc.f4520b = z4;
                                            c0709hc.f4521c = z5;
                                            ay0Var = new ay0(c0709hc, 12);
                                            break;
                                        }
                                        i53 += iM2324g4;
                                        str6 = str3;
                                    }
                                    ay0Var2 = ay0Var;
                                } else {
                                    str3 = str6;
                                    z30VarM7186a = z30VarM7186a;
                                    iM2324g3 = iM2324g3;
                                }
                                i51 = i52 + iM2324g3;
                                str6 = str3;
                                z30VarM7186a = z30VarM7186a;
                            }
                            z30Var2 = z30VarM7186a;
                            ay0 ay0Var3 = ay0Var2 == null ? null : new ay0(ay0Var2, 13);
                            if (ay0Var3 != null) {
                                C0709hc c0709hc2 = (C0709hc) ((ay0) ay0Var3.f1096b).f1096b;
                                if (c0599ed2 == null || ((qm0) c0599ed2.f3313a).size() < 2) {
                                    i21 = i25;
                                    if (i21 == -1) {
                                        i25 = c0709hc2.f4521c ? 5 : 4;
                                    } else {
                                        i25 = i21;
                                    }
                                } else {
                                    o21.m4663j("both eye views must be marked as available", c0709hc2.f4519a && c0709hc2.f4520b);
                                    o21.m4663j("for MV-HEVC, eye_views_reversed must be set to false", !c0709hc2.f4521c);
                                    i21 = i25;
                                    i25 = i21;
                                }
                            } else {
                                i21 = i25;
                                i25 = i21;
                            }
                        } else {
                            z30Var2 = z30VarM7186a;
                            str = str;
                            i25 = i25;
                            if (iM2324g2 == 1685480259 || iM2324g2 == 1685485123) {
                                c0599ed = c0599ed2;
                                i10 = i25;
                                iIntValue = iIntValue;
                                List list = listM5570t;
                                C0101bj c0101bjM995b = C0101bj.m995b(dc1Var);
                                if (c0101bjM995b != null) {
                                    str = "video/dolby-vision";
                                    str5 = c0101bjM995b.f1383b;
                                } else {
                                    str = str;
                                }
                                iM7330g2 = iM7330g2;
                                listM5570t = list;
                            } else {
                                int i54 = 10;
                                if (iM2324g2 == 1987076931) {
                                    o21.m4663j(null, str == null);
                                    String str10 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                    dc1Var.m2316F(i30 + 12);
                                    byte bM2337t = (byte) dc1Var.m2337t();
                                    byte bM2337t2 = (byte) dc1Var.m2337t();
                                    int iM2337t2 = dc1Var.m2337t();
                                    int i55 = iM2337t2 >> 4;
                                    byte b = (byte) ((iM2337t2 >> 1) & 7);
                                    if (str10.equals("video/x-vnd.on2.vp9")) {
                                        byte[] bArr = AbstractC0574dp.f2986a;
                                        listM5570t = qm0.m5570t(new byte[]{1, 1, bM2337t, 2, 1, bM2337t2, 3, 1, (byte) i55, 4, 1, b});
                                    }
                                    boolean z6 = (iM2337t2 & 1) != 0;
                                    int iM2337t3 = dc1Var.m2337t();
                                    int iM2337t4 = dc1Var.m2337t();
                                    iM7329f = C1673zp.m7329f(iM2337t3);
                                    int i56 = z6 ? 1 : 2;
                                    iM7330g2 = C1673zp.m7330g(iM2337t4);
                                    str = str10;
                                    i9 = i55;
                                    i28 = i9;
                                    i8 = i56;
                                } else {
                                    int i57 = 7;
                                    if (iM2324g2 == 1635135811) {
                                        int i58 = iM2324g - 8;
                                        byte[] bArr2 = new byte[i58];
                                        dc1Var.m2322e(0, i58, bArr2);
                                        listM5570t = qm0.m5570t(bArr2);
                                        dc1Var.m2316F(i30 + 8);
                                        byte[] bArr3 = dc1Var.f2882a;
                                        C0141cm c0141cm = new C0141cm(bArr3, bArr3.length);
                                        c0141cm.m1246q(dc1Var.f2883b * 8);
                                        c0141cm.m1250u(1);
                                        int iM1238i7 = c0141cm.m1238i(3);
                                        c0141cm.m1249t(6);
                                        boolean zM1237h3 = c0141cm.m1237h();
                                        boolean zM1237h4 = c0141cm.m1237h();
                                        int i59 = -1;
                                        if (iM1238i7 == 2 && zM1237h3) {
                                            i14 = zM1237h4 ? 12 : 10;
                                            if (zM1237h4) {
                                                i54 = 12;
                                            }
                                        } else {
                                            if (iM1238i7 <= 2) {
                                                i14 = zM1237h3 ? 10 : 8;
                                                if (!zM1237h3) {
                                                    i54 = 8;
                                                }
                                            } else {
                                                i12 = -1;
                                                i13 = -1;
                                            }
                                            c0141cm.m1249t(13);
                                            c0141cm.m1248s();
                                            iM1238i = c0141cm.m1238i(4);
                                            if (iM1238i != 1) {
                                                AbstractC1337qm.m5508C("Unsupported obu_type: " + iM1238i);
                                                c1673zp2 = new C1673zp(-1, -1, -1, null, i12, i13);
                                            } else if (c0141cm.m1237h()) {
                                                AbstractC1337qm.m5508C("Unsupported obu_extension_flag");
                                                c1673zp2 = new C1673zp(-1, -1, -1, null, i12, i13);
                                            } else {
                                                zM1237h = c0141cm.m1237h();
                                                c0141cm.m1248s();
                                                if (zM1237h || c0141cm.m1238i(8) <= 127) {
                                                    iM1238i2 = c0141cm.m1238i(3);
                                                    c0141cm.m1248s();
                                                    if (c0141cm.m1237h()) {
                                                        AbstractC1337qm.m5508C("Unsupported reduced_still_picture_header");
                                                        c1673zp2 = new C1673zp(-1, -1, -1, null, i12, i13);
                                                    } else if (c0141cm.m1237h()) {
                                                        AbstractC1337qm.m5508C("Unsupported timing_info_present_flag");
                                                        c1673zp2 = new C1673zp(-1, -1, -1, null, i12, i13);
                                                    } else {
                                                        if (c0141cm.m1237h()) {
                                                            AbstractC1337qm.m5508C("Unsupported initial_display_delay_present_flag");
                                                            c1673zp2 = new C1673zp(-1, -1, -1, null, i12, i13);
                                                        } else {
                                                            i15 = 5;
                                                            iM1238i3 = c0141cm.m1238i(5);
                                                            i16 = 0;
                                                            while (i16 <= iM1238i3) {
                                                                c0141cm.m1249t(12);
                                                                if (c0141cm.m1238i(i15) > i57) {
                                                                    c0141cm.m1248s();
                                                                }
                                                                i16++;
                                                                i15 = 5;
                                                                i57 = 7;
                                                            }
                                                            int iM1238i8 = c0141cm.m1238i(4);
                                                            int iM1238i9 = c0141cm.m1238i(4);
                                                            c0141cm.m1249t(iM1238i8 + 1);
                                                            c0141cm.m1249t(iM1238i9 + 1);
                                                            if (c0141cm.m1237h()) {
                                                                c0141cm.m1249t(7);
                                                            }
                                                            c0141cm.m1249t(7);
                                                            zM1237h2 = c0141cm.m1237h();
                                                            if (zM1237h2) {
                                                                c0141cm.m1249t(2);
                                                            }
                                                            if (c0141cm.m1237h()) {
                                                                i17 = 1;
                                                                iM1238i4 = 2;
                                                            } else {
                                                                i17 = 1;
                                                                iM1238i4 = c0141cm.m1238i(1);
                                                            }
                                                            if (iM1238i4 > 0 && !c0141cm.m1237h()) {
                                                                c0141cm.m1249t(i17);
                                                            }
                                                            if (zM1237h2) {
                                                                c0141cm.m1249t(3);
                                                            }
                                                            c0141cm.m1249t(3);
                                                            boolean zM1237h5 = c0141cm.m1237h();
                                                            if (iM1238i2 == 2 && zM1237h5) {
                                                                c0141cm.m1248s();
                                                            }
                                                            if (iM1238i2 == 1 && c0141cm.m1237h()) {
                                                                z = true;
                                                            } else {
                                                                z = false;
                                                            }
                                                            if (c0141cm.m1237h()) {
                                                                iM1238i5 = c0141cm.m1238i(8);
                                                                int iM1238i10 = c0141cm.m1238i(8);
                                                                int iM1238i11 = c0141cm.m1238i(8);
                                                                if (z) {
                                                                    i19 = 1;
                                                                } else {
                                                                    i19 = 1;
                                                                    if (iM1238i5 != 1 && iM1238i10 == 13 && iM1238i11 == 0) {
                                                                        iM1238i6 = 1;
                                                                    }
                                                                    int iM7329f2 = C1673zp.m7329f(iM1238i5);
                                                                    if (iM1238i6 == i19) {
                                                                        i20 = 1;
                                                                    } else {
                                                                        i20 = 2;
                                                                    }
                                                                    i18 = iM7329f2;
                                                                    iM7330g = C1673zp.m7330g(iM1238i10);
                                                                    i59 = i20;
                                                                }
                                                                iM1238i6 = c0141cm.m1238i(i19);
                                                                int iM7329f3 = C1673zp.m7329f(iM1238i5);
                                                                if (iM1238i6 == i19) {
                                                                    i20 = 1;
                                                                } else {
                                                                    i20 = 2;
                                                                }
                                                                i18 = iM7329f3;
                                                                iM7330g = C1673zp.m7330g(iM1238i10);
                                                                i59 = i20;
                                                            } else {
                                                                i18 = -1;
                                                                iM7330g = -1;
                                                            }
                                                            c1673zp = new C1673zp(i18, i59, iM7330g, null, i12, i13);
                                                        }
                                                        int i60 = c1673zp.f13517e;
                                                        int i61 = c1673zp.f13518f;
                                                        int i62 = c1673zp.f13513a;
                                                        int i63 = c1673zp.f13514b;
                                                        iM7330g2 = c1673zp.f13515c;
                                                        str = "video/av01";
                                                        i28 = i60;
                                                        i9 = i61;
                                                        iM7329f = i62;
                                                        i8 = i63;
                                                    }
                                                } else {
                                                    AbstractC1337qm.m5508C("Excessive obu_size");
                                                    c1673zp2 = new C1673zp(-1, -1, -1, null, i12, i13);
                                                }
                                            }
                                            c1673zp = c1673zp2;
                                            int i64 = c1673zp.f13517e;
                                            int i65 = c1673zp.f13518f;
                                            int i66 = c1673zp.f13513a;
                                            int i67 = c1673zp.f13514b;
                                            iM7330g2 = c1673zp.f13515c;
                                            str = "video/av01";
                                            i28 = i64;
                                            i9 = i65;
                                            iM7329f = i66;
                                            i8 = i67;
                                        }
                                        i12 = i14;
                                        i13 = i54;
                                        c0141cm.m1249t(13);
                                        c0141cm.m1248s();
                                        iM1238i = c0141cm.m1238i(4);
                                        if (iM1238i != 1) {
                                            AbstractC1337qm.m5508C("Unsupported obu_type: " + iM1238i);
                                            c1673zp2 = new C1673zp(-1, -1, -1, null, i12, i13);
                                        } else if (c0141cm.m1237h()) {
                                            AbstractC1337qm.m5508C("Unsupported obu_extension_flag");
                                            c1673zp2 = new C1673zp(-1, -1, -1, null, i12, i13);
                                        } else {
                                            zM1237h = c0141cm.m1237h();
                                            c0141cm.m1248s();
                                            if (zM1237h) {
                                                iM1238i2 = c0141cm.m1238i(3);
                                                c0141cm.m1248s();
                                                if (c0141cm.m1237h()) {
                                                    AbstractC1337qm.m5508C("Unsupported reduced_still_picture_header");
                                                    c1673zp2 = new C1673zp(-1, -1, -1, null, i12, i13);
                                                } else if (c0141cm.m1237h()) {
                                                    AbstractC1337qm.m5508C("Unsupported timing_info_present_flag");
                                                    c1673zp2 = new C1673zp(-1, -1, -1, null, i12, i13);
                                                } else if (c0141cm.m1237h()) {
                                                    AbstractC1337qm.m5508C("Unsupported initial_display_delay_present_flag");
                                                    c1673zp2 = new C1673zp(-1, -1, -1, null, i12, i13);
                                                } else {
                                                    i15 = 5;
                                                    iM1238i3 = c0141cm.m1238i(5);
                                                    i16 = 0;
                                                    while (i16 <= iM1238i3) {
                                                        c0141cm.m1249t(12);
                                                        if (c0141cm.m1238i(i15) > i57) {
                                                            c0141cm.m1248s();
                                                        }
                                                        i16++;
                                                        i15 = 5;
                                                        i57 = 7;
                                                    }
                                                    int iM1238i12 = c0141cm.m1238i(4);
                                                    int iM1238i13 = c0141cm.m1238i(4);
                                                    c0141cm.m1249t(iM1238i12 + 1);
                                                    c0141cm.m1249t(iM1238i13 + 1);
                                                    if (c0141cm.m1237h()) {
                                                        c0141cm.m1249t(7);
                                                    }
                                                    c0141cm.m1249t(7);
                                                    zM1237h2 = c0141cm.m1237h();
                                                    if (zM1237h2) {
                                                        c0141cm.m1249t(2);
                                                    }
                                                    if (c0141cm.m1237h()) {
                                                        i17 = 1;
                                                        iM1238i4 = 2;
                                                    } else {
                                                        i17 = 1;
                                                        iM1238i4 = c0141cm.m1238i(1);
                                                    }
                                                    if (iM1238i4 > 0) {
                                                        c0141cm.m1249t(i17);
                                                    }
                                                    if (zM1237h2) {
                                                        c0141cm.m1249t(3);
                                                    }
                                                    c0141cm.m1249t(3);
                                                    boolean zM1237h6 = c0141cm.m1237h();
                                                    if (iM1238i2 == 2) {
                                                        c0141cm.m1248s();
                                                    }
                                                    if (iM1238i2 == 1) {
                                                        z = false;
                                                    } else {
                                                        z = false;
                                                    }
                                                    if (c0141cm.m1237h()) {
                                                        iM1238i5 = c0141cm.m1238i(8);
                                                        int iM1238i14 = c0141cm.m1238i(8);
                                                        int iM1238i15 = c0141cm.m1238i(8);
                                                        if (z) {
                                                            i19 = 1;
                                                            if (iM1238i5 != 1) {
                                                            }
                                                            int iM7329f4 = C1673zp.m7329f(iM1238i5);
                                                            if (iM1238i6 == i19) {
                                                                i20 = 1;
                                                            } else {
                                                                i20 = 2;
                                                            }
                                                            i18 = iM7329f4;
                                                            iM7330g = C1673zp.m7330g(iM1238i14);
                                                            i59 = i20;
                                                        } else {
                                                            i19 = 1;
                                                        }
                                                        iM1238i6 = c0141cm.m1238i(i19);
                                                        int iM7329f5 = C1673zp.m7329f(iM1238i5);
                                                        if (iM1238i6 == i19) {
                                                            i20 = 1;
                                                        } else {
                                                            i20 = 2;
                                                        }
                                                        i18 = iM7329f5;
                                                        iM7330g = C1673zp.m7330g(iM1238i14);
                                                        i59 = i20;
                                                    } else {
                                                        i18 = -1;
                                                        iM7330g = -1;
                                                    }
                                                    c1673zp = new C1673zp(i18, i59, iM7330g, null, i12, i13);
                                                }
                                            } else {
                                                iM1238i2 = c0141cm.m1238i(3);
                                                c0141cm.m1248s();
                                                if (c0141cm.m1237h()) {
                                                    AbstractC1337qm.m5508C("Unsupported reduced_still_picture_header");
                                                    c1673zp2 = new C1673zp(-1, -1, -1, null, i12, i13);
                                                } else if (c0141cm.m1237h()) {
                                                    AbstractC1337qm.m5508C("Unsupported timing_info_present_flag");
                                                    c1673zp2 = new C1673zp(-1, -1, -1, null, i12, i13);
                                                } else if (c0141cm.m1237h()) {
                                                    AbstractC1337qm.m5508C("Unsupported initial_display_delay_present_flag");
                                                    c1673zp2 = new C1673zp(-1, -1, -1, null, i12, i13);
                                                } else {
                                                    i15 = 5;
                                                    iM1238i3 = c0141cm.m1238i(5);
                                                    i16 = 0;
                                                    while (i16 <= iM1238i3) {
                                                        c0141cm.m1249t(12);
                                                        if (c0141cm.m1238i(i15) > i57) {
                                                            c0141cm.m1248s();
                                                        }
                                                        i16++;
                                                        i15 = 5;
                                                        i57 = 7;
                                                    }
                                                    int iM1238i16 = c0141cm.m1238i(4);
                                                    int iM1238i17 = c0141cm.m1238i(4);
                                                    c0141cm.m1249t(iM1238i16 + 1);
                                                    c0141cm.m1249t(iM1238i17 + 1);
                                                    if (c0141cm.m1237h()) {
                                                        c0141cm.m1249t(7);
                                                    }
                                                    c0141cm.m1249t(7);
                                                    zM1237h2 = c0141cm.m1237h();
                                                    if (zM1237h2) {
                                                        c0141cm.m1249t(2);
                                                    }
                                                    if (c0141cm.m1237h()) {
                                                        i17 = 1;
                                                        iM1238i4 = 2;
                                                    } else {
                                                        i17 = 1;
                                                        iM1238i4 = c0141cm.m1238i(1);
                                                    }
                                                    if (iM1238i4 > 0) {
                                                        c0141cm.m1249t(i17);
                                                    }
                                                    if (zM1237h2) {
                                                        c0141cm.m1249t(3);
                                                    }
                                                    c0141cm.m1249t(3);
                                                    boolean zM1237h7 = c0141cm.m1237h();
                                                    if (iM1238i2 == 2) {
                                                        c0141cm.m1248s();
                                                    }
                                                    if (iM1238i2 == 1) {
                                                        z = false;
                                                    } else {
                                                        z = false;
                                                    }
                                                    if (c0141cm.m1237h()) {
                                                        iM1238i5 = c0141cm.m1238i(8);
                                                        int iM1238i18 = c0141cm.m1238i(8);
                                                        int iM1238i19 = c0141cm.m1238i(8);
                                                        if (z) {
                                                            i19 = 1;
                                                            if (iM1238i5 != 1) {
                                                            }
                                                            int iM7329f6 = C1673zp.m7329f(iM1238i5);
                                                            if (iM1238i6 == i19) {
                                                                i20 = 1;
                                                            } else {
                                                                i20 = 2;
                                                            }
                                                            i18 = iM7329f6;
                                                            iM7330g = C1673zp.m7330g(iM1238i18);
                                                            i59 = i20;
                                                        } else {
                                                            i19 = 1;
                                                        }
                                                        iM1238i6 = c0141cm.m1238i(i19);
                                                        int iM7329f7 = C1673zp.m7329f(iM1238i5);
                                                        if (iM1238i6 == i19) {
                                                            i20 = 1;
                                                        } else {
                                                            i20 = 2;
                                                        }
                                                        i18 = iM7329f7;
                                                        iM7330g = C1673zp.m7330g(iM1238i18);
                                                        i59 = i20;
                                                    } else {
                                                        i18 = -1;
                                                        iM7330g = -1;
                                                    }
                                                    c1673zp = new C1673zp(i18, i59, iM7330g, null, i12, i13);
                                                }
                                            }
                                            int i68 = c1673zp.f13517e;
                                            int i69 = c1673zp.f13518f;
                                            int i610 = c1673zp.f13513a;
                                            int i611 = c1673zp.f13514b;
                                            iM7330g2 = c1673zp.f13515c;
                                            str = "video/av01";
                                            i28 = i68;
                                            i9 = i69;
                                            iM7329f = i610;
                                            i8 = i611;
                                        }
                                        c1673zp = c1673zp2;
                                        int i612 = c1673zp.f13517e;
                                        int i613 = c1673zp.f13518f;
                                        int i614 = c1673zp.f13513a;
                                        int i615 = c1673zp.f13514b;
                                        iM7330g2 = c1673zp.f13515c;
                                        str = "video/av01";
                                        i28 = i612;
                                        i9 = i613;
                                        iM7329f = i614;
                                        i8 = i615;
                                    } else if (iM2324g2 == 1668050025) {
                                        ByteBuffer byteBufferOrder = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                        byteBufferOrder.position(21);
                                        byteBufferOrder.putShort(dc1Var.m2334q());
                                        byteBufferOrder.putShort(dc1Var.m2334q());
                                        byteBuffer = byteBufferOrder;
                                        i25 = i25;
                                    } else {
                                        if (iM2324g2 == 1835295606) {
                                            ByteBuffer byteBufferOrder2 = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                            short sM2334q = dc1Var.m2334q();
                                            short sM2334q2 = dc1Var.m2334q();
                                            short sM2334q3 = dc1Var.m2334q();
                                            short sM2334q4 = dc1Var.m2334q();
                                            short sM2334q5 = dc1Var.m2334q();
                                            c0599ed = c0599ed2;
                                            short sM2334q6 = dc1Var.m2334q();
                                            iIntValue = iIntValue;
                                            short sM2334q7 = dc1Var.m2334q();
                                            List list2 = listM5570t;
                                            short sM2334q8 = dc1Var.m2334q();
                                            long jM2339v = dc1Var.m2339v();
                                            long jM2339v2 = dc1Var.m2339v();
                                            i10 = i25;
                                            byteBufferOrder2.position(1);
                                            byteBufferOrder2.putShort(sM2334q5);
                                            byteBufferOrder2.putShort(sM2334q6);
                                            byteBufferOrder2.putShort(sM2334q);
                                            byteBufferOrder2.putShort(sM2334q2);
                                            byteBufferOrder2.putShort(sM2334q3);
                                            byteBufferOrder2.putShort(sM2334q4);
                                            byteBufferOrder2.putShort(sM2334q7);
                                            byteBufferOrder2.putShort(sM2334q8);
                                            byteBufferOrder2.putShort((short) (jM2339v / 10000));
                                            byteBufferOrder2.putShort((short) (jM2339v2 / 10000));
                                            byteBuffer = byteBufferOrder2;
                                            listM5570t = list2;
                                        } else {
                                            c0599ed = c0599ed2;
                                            i10 = i25;
                                            iIntValue = iIntValue;
                                            List list3 = listM5570t;
                                            if (iM2324g2 == 1681012275) {
                                                o21.m4663j(null, str == null);
                                                str = str2;
                                                listM5570t = list3;
                                                iM7330g2 = iM7330g2;
                                            } else if (iM2324g2 == 1702061171) {
                                                o21.m4663j(null, str == null);
                                                C0642fj c0642fjM3645a = m3645a(i30, dc1Var);
                                                String str11 = (String) c0642fjM3645a.f3826c;
                                                byte[] bArr4 = (byte[]) c0642fjM3645a.f3827d;
                                                listM5570t = bArr4 != null ? qm0.m5570t(bArr4) : list3;
                                                c0642fj = c0642fjM3645a;
                                                str = str11;
                                                c0599ed2 = c0599ed;
                                                i28 = i28;
                                                i9 = i9;
                                                iM7330g2 = iM7330g2;
                                                i25 = i10;
                                                iM7329f = i50;
                                            } else {
                                                if (iM2324g2 == 1885434736) {
                                                    dc1Var.m2316F(i30 + 8);
                                                    fM2341x = dc1Var.m2341x() / dc1Var.m2341x();
                                                    i9 = i9;
                                                    str = str;
                                                    listM5570t = list3;
                                                    iM7330g2 = iM7330g2;
                                                    z2 = true;
                                                } else {
                                                    if (iM2324g2 == 1937126244) {
                                                        int i70 = i30 + 8;
                                                        while (true) {
                                                            if (i70 - i30 >= iM2324g) {
                                                                bArrCopyOfRange = null;
                                                                break;
                                                            }
                                                            dc1Var.m2316F(i70);
                                                            int iM2324g5 = dc1Var.m2324g();
                                                            if (dc1Var.m2324g() == 1886547818) {
                                                                bArrCopyOfRange = Arrays.copyOfRange(dc1Var.f2882a, i70, iM2324g5 + i70);
                                                                break;
                                                            }
                                                            i70 += iM2324g5;
                                                        }
                                                    } else {
                                                        if (iM2324g2 == 1936995172) {
                                                            int iM2337t5 = dc1Var.m2337t();
                                                            dc1Var.m2317G(3);
                                                            if (iM2337t5 == 0) {
                                                                int iM2337t6 = dc1Var.m2337t();
                                                                if (iM2337t6 == 0) {
                                                                    i10 = 0;
                                                                } else if (iM2337t6 == 1) {
                                                                    i10 = 1;
                                                                } else if (iM2337t6 == 2) {
                                                                    i10 = 2;
                                                                } else if (iM2337t6 == 3) {
                                                                    i10 = 3;
                                                                }
                                                            }
                                                        } else {
                                                            if (iM2324g2 == 1668246642) {
                                                                i11 = iM7330g2;
                                                                if (i50 == -1 && i11 == -1) {
                                                                    int iM2324g6 = dc1Var.m2324g();
                                                                    if (iM2324g6 == 1852009592 || iM2324g6 == 1852009571) {
                                                                        int iM2343z3 = dc1Var.m2343z();
                                                                        int iM2343z4 = dc1Var.m2343z();
                                                                        dc1Var.m2317G(2);
                                                                        boolean z7 = iM2324g == 19 && (dc1Var.m2337t() & 128) != 0;
                                                                        int iM7329f8 = C1673zp.m7329f(iM2343z3);
                                                                        int i71 = z7 ? 1 : 2;
                                                                        iM7330g2 = C1673zp.m7330g(iM2343z4);
                                                                        iM7329f = iM7329f8;
                                                                        i9 = i9;
                                                                        i8 = i71;
                                                                        str = str;
                                                                        listM5570t = list3;
                                                                    } else {
                                                                        AbstractC1337qm.m5542i0("BoxParsers", "Unsupported color type: ".concat(nu0.m4596h(iM2324g6)));
                                                                    }
                                                                }
                                                            } else {
                                                                i11 = iM7330g2;
                                                            }
                                                            iM7330g2 = i11;
                                                            i9 = i9;
                                                            str = str;
                                                            listM5570t = list3;
                                                        }
                                                        c0599ed2 = c0599ed;
                                                        i28 = i28;
                                                        i25 = i10;
                                                    }
                                                    listM5570t = list3;
                                                }
                                                iM7329f = i50;
                                                c0599ed2 = c0599ed;
                                                i28 = i28;
                                                i25 = i10;
                                            }
                                        }
                                        iM7329f = i50;
                                        c0599ed2 = c0599ed;
                                        i28 = i28;
                                        i25 = i10;
                                    }
                                }
                            }
                            iM7329f = i50;
                            c0599ed2 = c0599ed;
                            i25 = i10;
                        }
                        iIntValue = iIntValue;
                        i9 = i9;
                        str = str;
                        iM7330g2 = iM7330g2;
                        iM7329f = i50;
                        i28 = i28;
                    }
                }
            }
            i24 = i7 + iM2324g;
            i23 = i3;
            c0716hj2 = c0716hj;
            str4 = str2;
            iIntValue = iIntValue;
            z30VarM7186a = z30Var2;
            i29 = i9;
            i27 = i8;
            i22 = i2;
        }
        z30 z30Var3 = z30VarM7186a;
        List list4 = listM5570t;
        int i72 = i25;
        int i73 = iM7329f;
        int i74 = i27;
        int i75 = iM7330g2;
        int i76 = i28;
        int i77 = i29;
        String str12 = str;
        if (str12 == null) {
            return;
        }
        ae0 ae0Var = new ae0();
        ae0Var.f185a = Integer.toString(i4);
        ae0Var.f197m = v51.m6582l(str12);
        ae0Var.f194j = str5;
        ae0Var.f204t = iM2343z;
        ae0Var.f205u = iM2343z2;
        ae0Var.f208x = fM2341x;
        ae0Var.f207w = i5;
        ae0Var.f209y = bArrCopyOfRange;
        ae0Var.f210z = i72;
        ae0Var.f200p = list4;
        ae0Var.f199o = i26;
        ae0Var.f201q = z30Var3;
        ae0Var.f174A = new C1673zp(i73, i74, i75, byteBuffer != null ? byteBuffer.array() : null, i76, i77);
        C0642fj c0642fj2 = c0642fj;
        if (c0642fj2 != null) {
            ae0Var.f192h = rc2.m5794l0(c0642fj2.f3824a);
            ae0Var.f193i = rc2.m5794l0(c0642fj2.f3825b);
        }
        c0716hj.f4587d = new be0(ae0Var);
    }
}

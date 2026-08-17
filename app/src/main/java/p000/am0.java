package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class am0 extends ki0 {

    /* JADX INFO: renamed from: r */
    public static final ca0 f269r = new ca0(18);

    /* JADX INFO: renamed from: q */
    public final yl0 f270q;

    public am0(yl0 yl0Var) {
        this.f270q = yl0Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007a A[PHI: r3
  0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: A0 */
    public static boolean m172A0(dc1 dc1Var, int i, int i2, boolean z) {
        int iM2340w;
        long jM2340w;
        int iM2343z;
        int i3;
        int i4 = dc1Var.f2883b;
        while (true) {
            try {
                boolean z2 = true;
                if (dc1Var.m2318a() < i2) {
                    dc1Var.m2316F(i4);
                    return true;
                }
                if (i >= 3) {
                    iM2340w = dc1Var.m2324g();
                    jM2340w = dc1Var.m2339v();
                    iM2343z = dc1Var.m2343z();
                } else {
                    iM2340w = dc1Var.m2340w();
                    jM2340w = dc1Var.m2340w();
                    iM2343z = 0;
                }
                if (iM2340w == 0 && jM2340w == 0 && iM2343z == 0) {
                    dc1Var.m2316F(i4);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jM2340w) != 0) {
                        dc1Var.m2316F(i4);
                        return false;
                    }
                    jM2340w = (((jM2340w >> 24) & 255) << 21) | (jM2340w & 255) | (((jM2340w >> 8) & 255) << 7) | (((jM2340w >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (iM2343z & 64) != 0 ? 1 : 0;
                    if ((iM2343z & 1) == 0) {
                        z2 = false;
                    }
                } else if (i == 3) {
                    i3 = (iM2343z & 32) != 0 ? 1 : 0;
                    if ((iM2343z & 128) == 0) {
                        z2 = false;
                    }
                } else {
                    i3 = 0;
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (jM2340w < i3) {
                    dc1Var.m2316F(i4);
                    return false;
                }
                if (dc1Var.m2318a() < jM2340w) {
                    dc1Var.m2316F(i4);
                    return false;
                }
                dc1Var.m2317G((int) jM2340w);
            } catch (Throwable th) {
                dc1Var.m2316F(i4);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static C1097m6 m173g0(dc1 dc1Var, int i, int i2) {
        int iM191y0;
        String strConcat;
        int iM2337t = dc1Var.m2337t();
        Charset charsetM188v0 = m188v0(iM2337t);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        dc1Var.m2322e(0, i3, bArr);
        if (i2 == 2) {
            strConcat = "image/" + ua0.m6444b0(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iM191y0 = 2;
        } else {
            iM191y0 = m191y0(0, bArr);
            String strM6444b0 = ua0.m6444b0(new String(bArr, 0, iM191y0, StandardCharsets.ISO_8859_1));
            strConcat = strM6444b0.indexOf(47) == -1 ? "image/".concat(strM6444b0) : strM6444b0;
        }
        int i4 = bArr[iM191y0 + 1] & 255;
        int i5 = iM191y0 + 2;
        int iM190x0 = m190x0(i5, iM2337t, bArr);
        String str = new String(bArr, i5, iM190x0 - i5, charsetM188v0);
        int iM187u0 = m187u0(iM2337t) + iM190x0;
        return new C1097m6(i4, strConcat, i3 <= iM187u0 ? z42.f13279f : Arrays.copyOfRange(bArr, iM187u0, i3), str);
    }

    /* JADX INFO: renamed from: h0 */
    public static C1522vm m174h0(dc1 dc1Var, int i, int i2, boolean z, int i3, yl0 yl0Var) throws Throwable {
        int i4 = dc1Var.f2883b;
        int iM191y0 = m191y0(i4, dc1Var.f2882a);
        String str = new String(dc1Var.f2882a, i4, iM191y0 - i4, StandardCharsets.ISO_8859_1);
        dc1Var.m2316F(iM191y0 + 1);
        int iM2324g = dc1Var.m2324g();
        int iM2324g2 = dc1Var.m2324g();
        long jM2339v = dc1Var.m2339v();
        if (jM2339v == 4294967295L) {
            jM2339v = -1;
        }
        long jM2339v2 = dc1Var.m2339v();
        long j = jM2339v2 == 4294967295L ? -1L : jM2339v2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (dc1Var.f2883b < i5) {
            bm0 bm0VarM177k0 = m177k0(i2, dc1Var, z, i3, yl0Var);
            if (bm0VarM177k0 != null) {
                arrayList.add(bm0VarM177k0);
            }
        }
        return new C1522vm(str, iM2324g, iM2324g2, jM2339v, j, (bm0[]) arrayList.toArray(new bm0[0]));
    }

    /* JADX INFO: renamed from: i0 */
    public static C1559wm m175i0(dc1 dc1Var, int i, int i2, boolean z, int i3, yl0 yl0Var) throws Throwable {
        int i4 = dc1Var.f2883b;
        int iM191y0 = m191y0(i4, dc1Var.f2882a);
        String str = new String(dc1Var.f2882a, i4, iM191y0 - i4, StandardCharsets.ISO_8859_1);
        dc1Var.m2316F(iM191y0 + 1);
        int iM2337t = dc1Var.m2337t();
        boolean z2 = (iM2337t & 2) != 0;
        boolean z3 = (iM2337t & 1) != 0;
        int iM2337t2 = dc1Var.m2337t();
        String[] strArr = new String[iM2337t2];
        for (int i5 = 0; i5 < iM2337t2; i5++) {
            int i6 = dc1Var.f2883b;
            int iM191y1 = m191y0(i6, dc1Var.f2882a);
            strArr[i5] = new String(dc1Var.f2882a, i6, iM191y1 - i6, StandardCharsets.ISO_8859_1);
            dc1Var.m2316F(iM191y1 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (dc1Var.f2883b < i7) {
            bm0 bm0VarM177k0 = m177k0(i2, dc1Var, z, i3, yl0Var);
            if (bm0VarM177k0 != null) {
                arrayList.add(bm0VarM177k0);
            }
        }
        return new C1559wm(str, z2, z3, strArr, (bm0[]) arrayList.toArray(new bm0[0]));
    }

    /* JADX INFO: renamed from: j0 */
    public static C0649fq m176j0(int i, dc1 dc1Var) {
        if (i < 4) {
            return null;
        }
        int iM2337t = dc1Var.m2337t();
        Charset charsetM188v0 = m188v0(iM2337t);
        byte[] bArr = new byte[3];
        dc1Var.m2322e(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        dc1Var.m2322e(0, i2, bArr2);
        int iM190x0 = m190x0(0, iM2337t, bArr2);
        String str2 = new String(bArr2, 0, iM190x0, charsetM188v0);
        int iM187u0 = m187u0(iM2337t) + iM190x0;
        return new C0649fq(str, str2, m181o0(bArr2, iM187u0, m190x0(iM187u0, iM2337t, bArr2), charsetM188v0));
    }

    /* JADX WARN: Code duplicated, block: B:143:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:167:0x0201 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x021c  */
    /* JADX WARN: Code duplicated, block: B:180:0x0222  */
    /* JADX WARN: Code duplicated, block: B:185:0x022f A[Catch: all -> 0x0216, Exception -> 0x0218, OutOfMemoryError -> 0x021a, TRY_LEAVE, TryCatch #8 {Exception -> 0x0218, OutOfMemoryError -> 0x021a, all -> 0x0216, blocks: (B:171:0x0211, B:184:0x022a, B:185:0x022f), top: B:199:0x01ff }] */
    /* JADX WARN: Code duplicated, block: B:192:0x0251  */
    /* JADX WARN: Instruction removed from duplicated block: B:192:0x0251, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [bm0] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [dc1] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [dc1] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [dc1] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: k0 */
    public static bm0 m177k0(int i, dc1 dc1Var, boolean z, int i2, yl0 yl0Var) throws Throwable {
        int iM2341x;
        int i3;
        Object r1;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Object r9;
        int i4;
        int i5;
        Object r2;
        Throwable th;
        Object r3;
        Object r12;
        Object r10;
        Object r11;
        dc1 dc1Var2;
        Object c1665zh;
        int i6 = i;
        int iM2337t = dc1Var.m2337t();
        int iM2337t2 = dc1Var.m2337t();
        int iM2337t3 = dc1Var.m2337t();
        int iM2337t4 = i6 >= 3 ? dc1Var.m2337t() : 0;
        if (i6 == 4) {
            iM2341x = dc1Var.m2341x();
            if (!z) {
                iM2341x = (((iM2341x >> 24) & 255) << 21) | (iM2341x & 255) | (((iM2341x >> 8) & 255) << 7) | (((iM2341x >> 16) & 255) << 14);
            }
        } else {
            iM2341x = i6 == 3 ? dc1Var.m2341x() : dc1Var.m2340w();
        }
        int iM192z0 = iM2341x;
        int iM2343z = i6 >= 3 ? dc1Var.m2343z() : 0;
        if (iM2337t == 0 && iM2337t2 == 0 && iM2337t3 == 0 && iM2337t4 == 0 && iM192z0 == 0 && iM2343z == 0) {
            dc1Var.m2316F(dc1Var.f2884c);
            return null;
        }
        int i7 = dc1Var.f2883b + iM192z0;
        if (i7 > dc1Var.f2884c) {
            AbstractC1337qm.m5542i0("Id3Decoder", "Frame size exceeds remaining tag data");
            dc1Var.m2316F(dc1Var.f2884c);
            return null;
        }
        if (yl0Var != null) {
            boolean zMo1190d = yl0Var.mo1190d(i6, iM2337t, iM2337t2, iM2337t3, iM2337t4);
            r1 = iM2337t;
            i3 = iM2337t2;
            if (!zMo1190d) {
                i6 = i6;
                dc1Var.m2316F(i7);
                return null;
            }
        } else {
            i3 = iM2337t2;
            r1 = iM2337t;
        }
        i6 = i6;
        if (i6 == 3) {
            z2 = (iM2343z & 128) != 0;
            z5 = (iM2343z & 64) != 0;
            z6 = false;
            z4 = (iM2343z & 32) != 0;
            z3 = z2;
        } else if (i6 == 4) {
            boolean z7 = (iM2343z & 64) != 0;
            boolean z8 = (iM2343z & 8) != 0;
            z5 = (iM2343z & 4) != 0;
            z6 = (iM2343z & 2) != 0;
            z3 = (iM2343z & 1) != 0;
            boolean z9 = z8;
            z4 = z7;
            z2 = z9;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        if (z2 || z5) {
            AbstractC1337qm.m5542i0("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            dc1Var.m2316F(i7);
            return null;
        }
        if (z4) {
            iM192z0--;
            dc1Var.m2317G(1);
        }
        if (z3) {
            iM192z0 -= 4;
            dc1Var.m2317G(4);
        }
        if (z6) {
            iM192z0 = m192z0(iM192z0, dc1Var);
        }
        try {
            try {
                if (r1 == 84 && i3 == 88 && iM2337t3 == 88 && (i6 == 2 || iM2337t4 == 88)) {
                    c1665zh = m184r0(iM192z0, dc1Var);
                } else if (r1 == 84) {
                    c1665zh = m182p0(iM192z0, dc1Var, m189w0(i6, r1, i3, iM2337t3, iM2337t4));
                } else if (r1 == 87 && i3 == 88 && iM2337t3 == 88 && (i6 == 2 || iM2337t4 == 88)) {
                    c1665zh = m186t0(iM192z0, dc1Var);
                } else {
                    if (r1 != 87) {
                        if (r1 == 80 && i3 == 82 && iM2337t3 == 73 && iM2337t4 == 86) {
                            c1665zh = m180n0(iM192z0, dc1Var);
                        } else {
                            th = null;
                            try {
                                if (r1 != 71 || i3 != 69 || iM2337t3 != 79 || (iM2337t4 != 66 && i6 != 2)) {
                                    if (i6 == 2) {
                                        if (r1 == 80 && i3 == 73 && iM2337t3 == 67) {
                                            c1665zh = m173g0(dc1Var, iM192z0, i6);
                                        } else if (r1 != 67 && i3 == 79 && iM2337t3 == 77 && (iM2337t4 == 77 || i6 == 2)) {
                                            c1665zh = m176j0(iM192z0, dc1Var);
                                        } else if (r1 != 67 && i3 == 72 && iM2337t3 == 65 && iM2337t4 == 80) {
                                            int i8 = iM192z0;
                                            iM192z0 = i3;
                                            i3 = i8;
                                            r11 = r1;
                                            i4 = iM2337t3;
                                            i5 = iM2337t4;
                                            try {
                                                c1665zh = m174h0(dc1Var, i3, i6, z, i2, yl0Var);
                                                i6 = i;
                                                r1 = dc1Var;
                                            } catch (Exception e) {
                                                e = e;
                                                i6 = i;
                                                r2 = dc1Var;
                                                r9 = r11;
                                                r2.m2316F(i7);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (OutOfMemoryError e2) {
                                                e = e2;
                                                i6 = i;
                                                r2 = dc1Var;
                                                r9 = r11;
                                                r2.m2316F(i7);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                r3 = dc1Var;
                                                r3.m2316F(i7);
                                                throw th;
                                            }
                                        } else {
                                            int i9 = iM192z0;
                                            iM192z0 = i3;
                                            i3 = i9;
                                            r11 = r1;
                                            i4 = iM2337t3;
                                            i5 = iM2337t4;
                                            try {
                                                if (r11 != 67 && iM192z0 == 84 && i4 == 79 && i5 == 67) {
                                                    i6 = i;
                                                    dc1 dc1Var3 = dc1Var;
                                                    c1665zh = m175i0(dc1Var3, i3, i6, z, i2, yl0Var);
                                                    r1 = dc1Var3;
                                                } else {
                                                    i6 = i;
                                                    dc1Var2 = dc1Var;
                                                    if (r11 != 77 && iM192z0 == 76 && i4 == 76 && i5 == 84) {
                                                        c1665zh = m179m0(i3, dc1Var2);
                                                        r1 = dc1Var2;
                                                    } else {
                                                        String strM189w0 = m189w0(i6, r11 == true ? 1 : 0, iM192z0, i4, i5);
                                                        byte[] bArr = new byte[i3];
                                                        dc1Var2.m2322e(0, i3, bArr);
                                                        c1665zh = new C1665zh(strM189w0, bArr);
                                                        r1 = dc1Var2;
                                                    }
                                                }
                                            } catch (Exception e3) {
                                                e = e3;
                                                r2 = r1;
                                                r9 = r11;
                                                r2.m2316F(i7);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (OutOfMemoryError e4) {
                                                e = e4;
                                                r2 = r1;
                                                r9 = r11;
                                                r2.m2316F(i7);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                r3 = r1;
                                                r3.m2316F(i7);
                                                throw th;
                                            }
                                        }
                                    } else if (r1 == 65 && i3 == 80 && iM2337t3 == 73 && iM2337t4 == 67) {
                                        c1665zh = m173g0(dc1Var, iM192z0, i6);
                                    } else {
                                        if (r1 != 67) {
                                        }
                                        if (r1 != 67) {
                                            int i10 = iM192z0;
                                            iM192z0 = i3;
                                            i3 = i10;
                                            r11 = r1;
                                            i4 = iM2337t3;
                                            i5 = iM2337t4;
                                            if (r11 != 67) {
                                                i6 = i;
                                                dc1Var2 = dc1Var;
                                                if (r11 != 77) {
                                                    String strM189w1 = m189w0(i6, r11 == true ? 1 : 0, iM192z0, i4, i5);
                                                    byte[] bArr2 = new byte[i3];
                                                    dc1Var2.m2322e(0, i3, bArr2);
                                                    c1665zh = new C1665zh(strM189w1, bArr2);
                                                    r1 = dc1Var2;
                                                } else {
                                                    String strM189w2 = m189w0(i6, r11 == true ? 1 : 0, iM192z0, i4, i5);
                                                    byte[] bArr3 = new byte[i3];
                                                    dc1Var2.m2322e(0, i3, bArr3);
                                                    c1665zh = new C1665zh(strM189w2, bArr3);
                                                    r1 = dc1Var2;
                                                }
                                            } else {
                                                i6 = i;
                                                dc1Var2 = dc1Var;
                                                if (r11 != 77) {
                                                    String strM189w3 = m189w0(i6, r11 == true ? 1 : 0, iM192z0, i4, i5);
                                                    byte[] bArr4 = new byte[i3];
                                                    dc1Var2.m2322e(0, i3, bArr4);
                                                    c1665zh = new C1665zh(strM189w3, bArr4);
                                                    r1 = dc1Var2;
                                                } else {
                                                    String strM189w4 = m189w0(i6, r11 == true ? 1 : 0, iM192z0, i4, i5);
                                                    byte[] bArr5 = new byte[i3];
                                                    dc1Var2.m2322e(0, i3, bArr5);
                                                    c1665zh = new C1665zh(strM189w4, bArr5);
                                                    r1 = dc1Var2;
                                                }
                                            }
                                        } else {
                                            int i11 = iM192z0;
                                            iM192z0 = i3;
                                            i3 = i11;
                                            r11 = r1;
                                            i4 = iM2337t3;
                                            i5 = iM2337t4;
                                            if (r11 != 67) {
                                                i6 = i;
                                                dc1Var2 = dc1Var;
                                                if (r11 != 77) {
                                                    String strM189w5 = m189w0(i6, r11 == true ? 1 : 0, iM192z0, i4, i5);
                                                    byte[] bArr6 = new byte[i3];
                                                    dc1Var2.m2322e(0, i3, bArr6);
                                                    c1665zh = new C1665zh(strM189w5, bArr6);
                                                    r1 = dc1Var2;
                                                } else {
                                                    String strM189w6 = m189w0(i6, r11 == true ? 1 : 0, iM192z0, i4, i5);
                                                    byte[] bArr7 = new byte[i3];
                                                    dc1Var2.m2322e(0, i3, bArr7);
                                                    c1665zh = new C1665zh(strM189w6, bArr7);
                                                    r1 = dc1Var2;
                                                }
                                            } else {
                                                i6 = i;
                                                dc1Var2 = dc1Var;
                                                if (r11 != 77) {
                                                    String strM189w7 = m189w0(i6, r11 == true ? 1 : 0, iM192z0, i4, i5);
                                                    byte[] bArr8 = new byte[i3];
                                                    dc1Var2.m2322e(0, i3, bArr8);
                                                    c1665zh = new C1665zh(strM189w7, bArr8);
                                                    r1 = dc1Var2;
                                                } else {
                                                    String strM189w8 = m189w0(i6, r11 == true ? 1 : 0, iM192z0, i4, i5);
                                                    byte[] bArr9 = new byte[i3];
                                                    dc1Var2.m2322e(0, i3, bArr9);
                                                    c1665zh = new C1665zh(strM189w8, bArr9);
                                                    r1 = dc1Var2;
                                                }
                                            }
                                        }
                                    }
                                    if (r12 == 0) {
                                        AbstractC1337qm.m5544j0("Id3Decoder", "Failed to decode frame: id=" + m189w0(i6, r10, iM192z0, i4, i5) + ", frameSize=" + i3, e);
                                    }
                                    return r12;
                                }
                                c1665zh = m178l0(iM192z0, dc1Var);
                                int i12 = iM192z0;
                                iM192z0 = i3;
                                i3 = i12;
                                r11 = r1;
                                i4 = iM2337t3;
                                i5 = iM2337t4;
                                r1 = dc1Var;
                            } catch (Exception e5) {
                                e = e5;
                                int i13 = iM192z0;
                                iM192z0 = i3;
                                i3 = i13;
                                r9 = r1;
                                i4 = iM2337t3;
                                i5 = iM2337t4;
                                r2 = dc1Var;
                                r2.m2316F(i7);
                                r12 = th;
                                r10 = r9;
                                if (r12 == 0) {
                                    AbstractC1337qm.m5544j0("Id3Decoder", "Failed to decode frame: id=" + m189w0(i6, r10, iM192z0, i4, i5) + ", frameSize=" + i3, e);
                                }
                                return r12;
                            } catch (OutOfMemoryError e6) {
                                e = e6;
                                int i14 = iM192z0;
                                iM192z0 = i3;
                                i3 = i14;
                                r9 = r1;
                                i4 = iM2337t3;
                                i5 = iM2337t4;
                                r2 = dc1Var;
                                r2.m2316F(i7);
                                r12 = th;
                                r10 = r9;
                                if (r12 == 0) {
                                    AbstractC1337qm.m5544j0("Id3Decoder", "Failed to decode frame: id=" + m189w0(i6, r10, iM192z0, i4, i5) + ", frameSize=" + i3, e);
                                }
                                return r12;
                            }
                        }
                        r1.m2316F(i7);
                        r12 = c1665zh;
                        e = th;
                        r10 = r11;
                        if (r12 == 0) {
                            AbstractC1337qm.m5544j0("Id3Decoder", "Failed to decode frame: id=" + m189w0(i6, r10, iM192z0, i4, i5) + ", frameSize=" + i3, e);
                        }
                        return r12;
                    }
                    c1665zh = m185s0(iM192z0, dc1Var, m189w0(i6, r1, i3, iM2337t3, iM2337t4));
                }
                int i15 = iM192z0;
                iM192z0 = i3;
                i3 = i15;
                r11 = r1;
                i4 = iM2337t3;
                i5 = iM2337t4;
                r1 = dc1Var;
                th = null;
                r1.m2316F(i7);
                r12 = c1665zh;
                e = th;
                r10 = r11;
            } catch (Exception e7) {
                e = e7;
                int i16 = iM192z0;
                iM192z0 = i3;
                i3 = i16;
                r9 = r1;
                i4 = iM2337t3;
                i5 = iM2337t4;
                r2 = dc1Var;
                th = null;
                r2.m2316F(i7);
                r12 = th;
                r10 = r9;
                if (r12 == 0) {
                    AbstractC1337qm.m5544j0("Id3Decoder", "Failed to decode frame: id=" + m189w0(i6, r10, iM192z0, i4, i5) + ", frameSize=" + i3, e);
                }
                return r12;
            } catch (OutOfMemoryError e8) {
                e = e8;
                int i17 = iM192z0;
                iM192z0 = i3;
                i3 = i17;
                r9 = r1;
                i4 = iM2337t3;
                i5 = iM2337t4;
                r2 = dc1Var;
                th = null;
                r2.m2316F(i7);
                r12 = th;
                r10 = r9;
                if (r12 == 0) {
                    AbstractC1337qm.m5544j0("Id3Decoder", "Failed to decode frame: id=" + m189w0(i6, r10, iM192z0, i4, i5) + ", frameSize=" + i3, e);
                }
                return r12;
            }
            if (r12 == 0) {
                AbstractC1337qm.m5544j0("Id3Decoder", "Failed to decode frame: id=" + m189w0(i6, r10, iM192z0, i4, i5) + ", frameSize=" + i3, e);
            }
            return r12;
        } catch (Throwable th4) {
            th = th4;
            r3 = dc1Var;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static gi0 m178l0(int i, dc1 dc1Var) {
        int iM2337t = dc1Var.m2337t();
        Charset charsetM188v0 = m188v0(iM2337t);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        dc1Var.m2322e(0, i2, bArr);
        int iM191y0 = m191y0(0, bArr);
        String strM6582l = v51.m6582l(new String(bArr, 0, iM191y0, StandardCharsets.ISO_8859_1));
        int i3 = iM191y0 + 1;
        int iM190x0 = m190x0(i3, iM2337t, bArr);
        String strM181o0 = m181o0(bArr, i3, iM190x0, charsetM188v0);
        int iM187u0 = m187u0(iM2337t) + iM190x0;
        int iM190x1 = m190x0(iM187u0, iM2337t, bArr);
        String strM181o1 = m181o0(bArr, iM187u0, iM190x1, charsetM188v0);
        int iM187u1 = m187u0(iM2337t) + iM190x1;
        return new gi0(strM6582l, i2 <= iM187u1 ? z42.f13279f : Arrays.copyOfRange(bArr, iM187u1, i2), strM181o0, strM181o1);
    }

    /* JADX INFO: renamed from: m0 */
    public static w51 m179m0(int i, dc1 dc1Var) {
        int iM2343z = dc1Var.m2343z();
        int iM2340w = dc1Var.m2340w();
        int iM2340w2 = dc1Var.m2340w();
        int iM2337t = dc1Var.m2337t();
        int iM2337t2 = dc1Var.m2337t();
        C0141cm c0141cm = new C0141cm();
        c0141cm.m1245p(dc1Var);
        int i2 = ((i - 10) * 8) / (iM2337t + iM2337t2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iM1238i = c0141cm.m1238i(iM2337t);
            int iM1238i2 = c0141cm.m1238i(iM2337t2);
            iArr[i3] = iM1238i;
            iArr2[i3] = iM1238i2;
        }
        return new w51(iM2343z, iM2340w, iM2340w2, iArr, iArr2);
    }

    /* JADX INFO: renamed from: n0 */
    public static fg1 m180n0(int i, dc1 dc1Var) {
        byte[] bArr = new byte[i];
        dc1Var.m2322e(0, i, bArr);
        int iM191y0 = m191y0(0, bArr);
        String str = new String(bArr, 0, iM191y0, StandardCharsets.ISO_8859_1);
        int i2 = iM191y0 + 1;
        return new fg1(str, i <= i2 ? z42.f13279f : Arrays.copyOfRange(bArr, i2, i));
    }

    /* JADX INFO: renamed from: o0 */
    public static String m181o0(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    /* JADX INFO: renamed from: p0 */
    public static tz1 m182p0(int i, dc1 dc1Var, String str) {
        if (i < 1) {
            return null;
        }
        int iM2337t = dc1Var.m2337t();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        dc1Var.m2322e(0, i2, bArr);
        return new tz1(str, null, m183q0(iM2337t, 0, bArr));
    }

    /* JADX INFO: renamed from: q0 */
    public static kk1 m183q0(int i, int i2, byte[] bArr) {
        if (i2 >= bArr.length) {
            return qm0.m5570t("");
        }
        nm0 nm0VarM5566m = qm0.m5566m();
        int iM190x0 = m190x0(i2, i, bArr);
        while (i2 < iM190x0) {
            nm0VarM5566m.m3901a(new String(bArr, i2, iM190x0 - i2, m188v0(i)));
            i2 = m187u0(i) + iM190x0;
            iM190x0 = m190x0(i2, i, bArr);
        }
        kk1 kk1VarM4561g = nm0VarM5566m.m4561g();
        return kk1VarM4561g.isEmpty() ? qm0.m5570t("") : kk1VarM4561g;
    }

    /* JADX INFO: renamed from: r0 */
    public static tz1 m184r0(int i, dc1 dc1Var) {
        if (i < 1) {
            return null;
        }
        int iM2337t = dc1Var.m2337t();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        dc1Var.m2322e(0, i2, bArr);
        int iM190x0 = m190x0(0, iM2337t, bArr);
        return new tz1("TXXX", new String(bArr, 0, iM190x0, m188v0(iM2337t)), m183q0(iM2337t, m187u0(iM2337t) + iM190x0, bArr));
    }

    /* JADX INFO: renamed from: s0 */
    public static r42 m185s0(int i, dc1 dc1Var, String str) {
        byte[] bArr = new byte[i];
        dc1Var.m2322e(0, i, bArr);
        return new r42(str, null, new String(bArr, 0, m191y0(0, bArr), StandardCharsets.ISO_8859_1));
    }

    /* JADX INFO: renamed from: t0 */
    public static r42 m186t0(int i, dc1 dc1Var) {
        if (i < 1) {
            return null;
        }
        int iM2337t = dc1Var.m2337t();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        dc1Var.m2322e(0, i2, bArr);
        int iM190x0 = m190x0(0, iM2337t, bArr);
        String str = new String(bArr, 0, iM190x0, m188v0(iM2337t));
        int iM187u0 = m187u0(iM2337t) + iM190x0;
        return new r42("WXXX", str, m181o0(bArr, iM187u0, m191y0(iM187u0, bArr), StandardCharsets.ISO_8859_1));
    }

    /* JADX INFO: renamed from: u0 */
    public static int m187u0(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* JADX INFO: renamed from: v0 */
    public static Charset m188v0(int i) {
        if (i == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i != 2) {
            return i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    /* JADX INFO: renamed from: w0 */
    public static String m189w0(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* JADX INFO: renamed from: x0 */
    public static int m190x0(int i, int i2, byte[] bArr) {
        int iM191y0 = m191y0(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return iM191y0;
        }
        while (iM191y0 < bArr.length - 1) {
            if ((iM191y0 - i) % 2 == 0 && bArr[iM191y0 + 1] == 0) {
                return iM191y0;
            }
            iM191y0 = m191y0(iM191y0 + 1, bArr);
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: y0 */
    public static int m191y0(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: z0 */
    public static int m192z0(int i, dc1 dc1Var) {
        byte[] bArr = dc1Var.f2882a;
        int i2 = dc1Var.f2883b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c7 A[SYNTHETIC] */
    /* JADX INFO: renamed from: f0 */
    public final k51 m193f0(int i, byte[] bArr) {
        boolean z;
        zl0 zl0Var;
        int i2;
        int i3;
        int iM192z0;
        bm0 bm0VarM177k0;
        ArrayList arrayList = new ArrayList();
        dc1 dc1Var = new dc1(bArr, i);
        boolean z2 = false;
        if (dc1Var.m2318a() < 10) {
            AbstractC1337qm.m5542i0("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iM2340w = dc1Var.m2340w();
            if (iM2340w == 4801587) {
                int iM2337t = dc1Var.m2337t();
                dc1Var.m2317G(1);
                int iM2337t2 = dc1Var.m2337t();
                int iM2336s = dc1Var.m2336s();
                if (iM2337t != 2) {
                    if (iM2337t == 3) {
                        if ((iM2337t2 & 64) != 0) {
                            int iM2324g = dc1Var.m2324g();
                            dc1Var.m2317G(iM2324g);
                            iM2336s -= iM2324g + 4;
                        }
                    } else if (iM2337t == 4) {
                        if ((iM2337t2 & 64) != 0) {
                            int iM2336s2 = dc1Var.m2336s();
                            dc1Var.m2317G(iM2336s2 - 4);
                            iM2336s -= iM2336s2;
                        }
                        if ((iM2337t2 & 16) != 0) {
                            iM2336s -= 10;
                        }
                    } else {
                        jd0.m3621s(iM2337t, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                    }
                    if (iM2337t < 4) {
                        z = false;
                    } else {
                        z = false;
                    }
                    zl0Var = new zl0(iM2337t, iM2336s, z);
                } else if ((iM2337t2 & 64) != 0) {
                    AbstractC1337qm.m5542i0("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iM2337t < 4 || (iM2337t2 & 128) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    zl0Var = new zl0(iM2337t, iM2336s, z);
                }
                if (zl0Var == null) {
                    return null;
                }
                i2 = zl0Var.f13478a;
                int i4 = dc1Var.f2883b;
                i3 = i2 == 2 ? 6 : 10;
                iM192z0 = zl0Var.f13480c;
                if (zl0Var.f13479b) {
                    iM192z0 = m192z0(iM192z0, dc1Var);
                }
                dc1Var.m2315E(i4 + iM192z0);
                if (!m172A0(dc1Var, i2, i3, false)) {
                    if (i2 == 4 || !m172A0(dc1Var, 4, i3, true)) {
                        jd0.m3621s(i2, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                        return null;
                    }
                    z2 = true;
                }
                while (dc1Var.m2318a() >= i3) {
                    bm0VarM177k0 = m177k0(i2, dc1Var, z2, i3, this.f270q);
                    if (bm0VarM177k0 != null) {
                        arrayList.add(bm0VarM177k0);
                    }
                }
                return new k51(arrayList);
            }
            AbstractC1337qm.m5542i0("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iM2340w))));
        }
        zl0Var = null;
        if (zl0Var == null) {
            return null;
        }
        i2 = zl0Var.f13478a;
        int i5 = dc1Var.f2883b;
        if (i2 == 2) {
        }
        iM192z0 = zl0Var.f13480c;
        if (zl0Var.f13479b) {
            iM192z0 = m192z0(iM192z0, dc1Var);
        }
        dc1Var.m2315E(i5 + iM192z0);
        if (!m172A0(dc1Var, i2, i3, false)) {
            if (i2 == 4) {
            }
            jd0.m3621s(i2, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
            return null;
        }
        while (dc1Var.m2318a() >= i3) {
            bm0VarM177k0 = m177k0(i2, dc1Var, z2, i3, this.f270q);
            if (bm0VarM177k0 != null) {
                arrayList.add(bm0VarM177k0);
            }
        }
        return new k51(arrayList);
    }

    @Override // p000.ki0
    /* JADX INFO: renamed from: t */
    public final k51 mo194t(o51 o51Var, ByteBuffer byteBuffer) {
        return m193f0(byteBuffer.limit(), byteBuffer.array());
    }
}

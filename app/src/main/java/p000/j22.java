package p000;

import android.opengl.GLES20;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import io.github.muntashirakon.adb.PairingConnectionCtx;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class j22 implements gq1 {

    /* JADX INFO: renamed from: a */
    public final int f5241a;

    /* JADX INFO: renamed from: b */
    public final Object f5242b;

    /* JADX INFO: renamed from: c */
    public final Object f5243c;

    /* JADX INFO: renamed from: d */
    public final Object f5244d;

    /* JADX INFO: renamed from: e */
    public final Object f5245e;

    public j22(String str, String str2) throws ji0 {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f5241a = iGlCreateProgram;
        p32.m5185p();
        m3537c(iGlCreateProgram, 35633, str);
        m3537c(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        byte b = 0;
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        p32.m5186q("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.f5244d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f5242b = new bz1[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            int i2 = this.f5241a;
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(i2, 35722, iArr3, 0);
            int i3 = iArr3[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i2, i, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            for (int i4 = 0; i4 < i3; i4++) {
                if (bArr[i4] == 0) {
                    i3 = i4;
                    break;
                }
            }
            String str3 = new String(bArr, 0, i3);
            GLES20.glGetAttribLocation(i2, str3);
            bz1 bz1Var = new bz1(25);
            ((bz1[]) this.f5242b)[i] = bz1Var;
            ((HashMap) this.f5244d).put(str3, bz1Var);
        }
        this.f5245e = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.f5241a, 35718, iArr4, 0);
        this.f5243c = new k50[iArr4[0]];
        for (int i5 = 0; i5 < iArr4[0]; i5++) {
            int i6 = this.f5241a;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i6, 35719, iArr5, 0);
            int i7 = iArr5[0];
            byte[] bArr2 = new byte[i7];
            GLES20.glGetActiveUniform(i6, i5, i7, new int[1], 0, new int[1], 0, new int[1], 0, bArr2, 0);
            for (int i8 = 0; i8 < i7; i8++) {
                if (bArr2[i8] == 0) {
                    i7 = i8;
                    break;
                }
            }
            String str4 = new String(bArr2, 0, i7);
            GLES20.glGetUniformLocation(i6, str4);
            k50 k50Var = new k50(b, 26);
            ((k50[]) this.f5243c)[i5] = k50Var;
            ((HashMap) this.f5245e).put(str4, k50Var);
        }
        p32.m5185p();
    }

    /* JADX INFO: renamed from: c */
    public static void m3537c(int i, int i2, String str) throws ji0 {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        p32.m5186q(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        p32.m5185p();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0219  */
    /* JADX WARN: Code duplicated, block: B:107:0x0270  */
    /* JADX WARN: Code duplicated, block: B:116:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:99:0x0207  */
    @Override // p000.gq1
    /* JADX INFO: renamed from: a */
    public void mo3050a(dc1 dc1Var) {
        SparseArray sparseArray;
        C0141cm c0141cm;
        int i;
        i32 mc1Var;
        i32 mc1Var2;
        int i2;
        SparseArray sparseArray2;
        SparseArray sparseArray3 = (SparseArray) this.f5243c;
        SparseIntArray sparseIntArray = (SparseIntArray) this.f5244d;
        C0141cm c0141cm2 = (C0141cm) this.f5242b;
        g32 g32Var = (g32) this.f5245e;
        SparseArray sparseArray4 = g32Var.f4049g;
        SparseBooleanArray sparseBooleanArray = g32Var.f4050h;
        if (dc1Var.m2337t() != 2) {
            return;
        }
        int i3 = 0;
        y02 y02Var = (y02) g32Var.f4044b.get(0);
        if ((dc1Var.m2337t() & 128) == 0) {
            return;
        }
        dc1Var.m2317G(1);
        int iM2343z = dc1Var.m2343z();
        int i4 = 3;
        dc1Var.m2317G(3);
        dc1Var.m2322e(0, 2, c0141cm2.f1858b);
        c0141cm2.m1246q(0);
        c0141cm2.m1249t(3);
        int i5 = 13;
        g32Var.f4059q = c0141cm2.m1238i(13);
        dc1Var.m2322e(0, 2, c0141cm2.f1858b);
        c0141cm2.m1246q(0);
        c0141cm2.m1249t(4);
        dc1Var.m2317G(c0141cm2.m1238i(12));
        sparseArray3.clear();
        sparseIntArray.clear();
        int iM2318a = dc1Var.m2318a();
        while (iM2318a > 0) {
            dc1Var.m2322e(i3, 5, c0141cm2.f1858b);
            c0141cm2.m1246q(i3);
            int iM1238i = c0141cm2.m1238i(8);
            c0141cm2.m1249t(i4);
            int iM1238i2 = c0141cm2.m1238i(i5);
            c0141cm2.m1249t(4);
            int iM1238i3 = c0141cm2.m1238i(12);
            int i6 = dc1Var.f2883b;
            int i7 = i6 + iM1238i3;
            String strTrim = null;
            ArrayList arrayList = null;
            int i8 = -1;
            int iM2337t = 0;
            while (true) {
                c0141cm = c0141cm2;
                if (dc1Var.f2883b < i7) {
                    int iM2337t2 = dc1Var.m2337t();
                    int iM2337t3 = dc1Var.f2883b + dc1Var.m2337t();
                    if (iM2337t3 <= i7) {
                        int i9 = iM2318a;
                        if (iM2337t2 == 5) {
                            long jM2339v = dc1Var.m2339v();
                            if (jM2339v == 1094921523) {
                                i8 = 129;
                            } else if (jM2339v == 1161904947) {
                                i8 = 135;
                            } else if (jM2339v == 1094921524) {
                                i8 = 172;
                            } else if (jM2339v == 1212503619) {
                                i8 = 36;
                            }
                            i2 = iM2337t3;
                            sparseArray2 = sparseArray4;
                        } else if (iM2337t2 == 106) {
                            i2 = iM2337t3;
                            sparseArray2 = sparseArray4;
                            i8 = 129;
                        } else if (iM2337t2 == 122) {
                            sparseArray2 = sparseArray4;
                            i8 = 135;
                            i2 = iM2337t3;
                        } else if (iM2337t2 == 127) {
                            int iM2337t4 = dc1Var.m2337t();
                            if (iM2337t4 == 21) {
                                i8 = 172;
                            } else if (iM2337t4 == 14) {
                                i8 = 136;
                            } else if (iM2337t4 == 33) {
                                i8 = 139;
                            }
                            i2 = iM2337t3;
                            sparseArray2 = sparseArray4;
                        } else if (iM2337t2 == 123) {
                            i2 = iM2337t3;
                            sparseArray2 = sparseArray4;
                            i8 = 138;
                        } else if (iM2337t2 == 10) {
                            strTrim = dc1Var.m2335r(3, StandardCharsets.UTF_8).trim();
                            i2 = iM2337t3;
                            sparseArray2 = sparseArray4;
                            iM2337t = dc1Var.m2337t();
                        } else {
                            int i10 = 3;
                            if (iM2337t2 == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (dc1Var.f2883b < iM2337t3) {
                                    String strTrim2 = dc1Var.m2335r(i10, StandardCharsets.UTF_8).trim();
                                    dc1Var.m2337t();
                                    int i11 = iM2337t3;
                                    byte[] bArr = new byte[4];
                                    dc1Var.m2322e(0, 4, bArr);
                                    arrayList2.add(new h32(strTrim2, bArr));
                                    iM2337t3 = i11;
                                    sparseArray4 = sparseArray4;
                                    i10 = 3;
                                }
                                i2 = iM2337t3;
                                sparseArray2 = sparseArray4;
                                arrayList = arrayList2;
                                i8 = 89;
                            } else {
                                i2 = iM2337t3;
                                sparseArray2 = sparseArray4;
                                if (iM2337t2 == 111) {
                                    i8 = 257;
                                }
                            }
                        }
                        dc1Var.m2317G(i2 - dc1Var.f2883b);
                        c0141cm2 = c0141cm;
                        iM2318a = i9;
                        sparseArray4 = sparseArray2;
                    }
                }
            }
            SparseArray sparseArray5 = sparseArray4;
            int i12 = iM2318a;
            dc1Var.m2316F(i7);
            C0082b0 c0082b0 = new C0082b0(i8, strTrim, iM2337t, arrayList, Arrays.copyOfRange(dc1Var.f2882a, i6, i7));
            String str = strTrim;
            if (iM1238i == 6 || iM1238i == 5) {
                iM1238i = i8;
            }
            iM2318a = i12 - (iM1238i3 + 5);
            if (sparseBooleanArray.get(iM1238i2)) {
                i = 3;
            } else {
                C0719hm c0719hm = g32Var.f4047e;
                i = 3;
                if (iM1238i == 2) {
                    mc1Var = new mc1(new cj0(new qo0(c0719hm.m3180a(c0082b0))));
                } else {
                    if (iM1238i == 3 || iM1238i == 4) {
                        mc1Var2 = new mc1(new q61(str, c0082b0.m806h()));
                    } else if (iM1238i == 21) {
                        mc1Var = new mc1(new c50());
                    } else if (iM1238i == 27) {
                        mc1Var = new mc1(new ij0(new C1174o9(c0719hm.m3180a(c0082b0)), false, false));
                    } else if (iM1238i == 36) {
                        mc1Var = new mc1(new kj0(new C1174o9(c0719hm.m3180a(c0082b0))));
                    } else if (iM1238i == 45) {
                        mc1Var = new mc1(new s61());
                    } else if (iM1238i == 89) {
                        mc1Var = new mc1(new c50((List) c0082b0.f1104c));
                    } else if (iM1238i == 172) {
                        mc1Var2 = new mc1(new C0588e2(str, c0082b0.m806h(), 1));
                    } else if (iM1238i == 257) {
                        mc1Var = new hq1(new C1174o9("application/vnd.dvb.ait", 20));
                    } else if (iM1238i == 138) {
                        mc1Var2 = new mc1(new q40(str, c0082b0.m806h(), 4096));
                    } else if (iM1238i != 139) {
                        switch (iM1238i) {
                            case 15:
                                mc1Var2 = new mc1(new C0591e5(str, c0082b0.m806h(), false));
                                break;
                            case 16:
                                mc1Var = new mc1(new fj0(new qo0(c0719hm.m3180a(c0082b0))));
                                break;
                            case 17:
                                mc1Var2 = new mc1(new sr0(str, c0082b0.m806h()));
                                break;
                            default:
                                switch (iM1238i) {
                                    case 128:
                                        mc1Var = new mc1(new cj0(new qo0(c0719hm.m3180a(c0082b0))));
                                        break;
                                    case 129:
                                        mc1Var2 = new mc1(new C0588e2(str, c0082b0.m806h(), 0));
                                        break;
                                    case 130:
                                        mc1Var = null;
                                        break;
                                    default:
                                        switch (iM1238i) {
                                            case 134:
                                                mc1Var = new hq1(new C1174o9("application/x-scte35", 20));
                                                break;
                                            case 135:
                                                mc1Var2 = new mc1(new C0588e2(str, c0082b0.m806h(), 0));
                                                break;
                                            case 136:
                                                mc1Var2 = new mc1(new q40(str, c0082b0.m806h(), 4096));
                                                break;
                                            default:
                                                mc1Var = null;
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        mc1Var2 = new mc1(new q40(str, c0082b0.m806h(), 5408));
                    }
                    mc1Var = mc1Var2;
                }
                sparseIntArray.put(iM1238i2, iM1238i2);
                sparseArray3.put(iM1238i2, mc1Var);
            }
            i4 = i;
            c0141cm2 = c0141cm;
            sparseArray4 = sparseArray5;
            i3 = 0;
            i5 = 13;
        }
        SparseArray sparseArray6 = sparseArray4;
        int size = sparseIntArray.size();
        int i13 = 0;
        while (i13 < size) {
            int iKeyAt = sparseIntArray.keyAt(i13);
            int iValueAt = sparseIntArray.valueAt(i13);
            sparseBooleanArray.put(iKeyAt, true);
            g32Var.f4051i.put(iValueAt, true);
            i32 i32Var = (i32) sparseArray3.valueAt(i13);
            if (i32Var != null) {
                i32Var.mo3242b(y02Var, g32Var.f4054l, new qk0(iM2343z, iKeyAt, PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE));
                sparseArray = sparseArray6;
                sparseArray.put(iValueAt, i32Var);
            } else {
                sparseArray = sparseArray6;
            }
            i13++;
            sparseArray6 = sparseArray;
        }
        sparseArray6.remove(this.f5241a);
        g32Var.f4055m = 0;
        g32Var.f4054l.mo748k();
        g32Var.f4056n = true;
    }

    /* JADX INFO: renamed from: d */
    public int m3538d(String str) throws ji0 {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f5241a, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        p32.m5185p();
        return iGlGetAttribLocation;
    }

    /* JADX INFO: renamed from: e */
    public boolean m3539e(j22 j22Var, int i) {
        if (j22Var == null) {
            return false;
        }
        xk1 xk1Var = ((xk1[]) this.f5242b)[i];
        xk1 xk1Var2 = ((xk1[]) j22Var.f5242b)[i];
        int i2 = z42.f13274a;
        return Objects.equals(xk1Var, xk1Var2) && Objects.equals(((n80[]) this.f5243c)[i], ((n80[]) j22Var.f5243c)[i]);
    }

    /* JADX INFO: renamed from: f */
    public boolean m3540f(int i) {
        return ((xk1[]) this.f5242b)[i] != null;
    }

    @Override // p000.gq1
    /* JADX INFO: renamed from: b */
    public void mo3051b(y02 y02Var, z80 z80Var, qk0 qk0Var) {
    }

    public j22(xk1[] xk1VarArr, n80[] n80VarArr, l22 l22Var, Object obj) {
        ki0.m3857c(xk1VarArr.length == n80VarArr.length);
        this.f5242b = xk1VarArr;
        this.f5243c = (n80[]) n80VarArr.clone();
        this.f5244d = l22Var;
        this.f5245e = obj;
        this.f5241a = xk1VarArr.length;
    }

    public j22(r61 r61Var, ak0 ak0Var, byte[] bArr, C0073as[] c0073asArr, int i) {
        this.f5242b = r61Var;
        this.f5243c = ak0Var;
        this.f5244d = bArr;
        this.f5245e = c0073asArr;
        this.f5241a = i;
    }

    public j22(g32 g32Var, int i) {
        this.f5245e = g32Var;
        this.f5242b = new C0141cm(new byte[5], 5);
        this.f5243c = new SparseArray();
        this.f5244d = new SparseIntArray();
        this.f5241a = i;
    }
}

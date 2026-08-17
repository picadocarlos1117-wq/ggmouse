package p000;

import android.graphics.Path;
import android.util.Log;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ic1 {

    /* JADX INFO: renamed from: a */
    public char f4935a;

    /* JADX INFO: renamed from: b */
    public float[] f4936b;

    /* JADX INFO: renamed from: a */
    public static void m3419a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        double radians = Math.toRadians(f7);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d3 = f;
        double d4 = f2;
        double d5 = f5;
        double d6 = ((d4 * dSin) + (d3 * dCos)) / d5;
        double d7 = f6;
        double d8 = ((d4 * dCos) + (((double) (-f)) * dSin)) / d7;
        double d9 = f4;
        double d10 = ((d9 * dSin) + (((double) f3) * dCos)) / d5;
        double d11 = ((d9 * dCos) + (((double) (-f3)) * dSin)) / d7;
        double d12 = d6 - d10;
        double d13 = d8 - d11;
        double d14 = (d6 + d10) / 2.0d;
        double d15 = (d8 + d11) / 2.0d;
        double d16 = (d13 * d13) + (d12 * d12);
        if (d16 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d17 = (1.0d / d16) - 0.25d;
        if (d17 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d16);
            float fSqrt = (float) (Math.sqrt(d16) / 1.99999d);
            m3419a(path, f, f2, f3, f4, f5 * fSqrt, fSqrt * f6, f7, z, z2);
            return;
        }
        double dSqrt = Math.sqrt(d17);
        double d18 = dSqrt * d12;
        double d19 = dSqrt * d13;
        if (z == z2) {
            d = d14 - d19;
            d2 = d15 + d18;
        } else {
            d = d14 + d19;
            d2 = d15 - d18;
        }
        double dAtan2 = Math.atan2(d8 - d2, d6 - d);
        double dAtan3 = Math.atan2(d11 - d2, d10 - d) - dAtan2;
        if (z2 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d20 = d * d5;
        double d21 = d2 * d7;
        double d22 = (d20 * dCos) - (d21 * dSin);
        double d23 = (d21 * dCos) + (d20 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d24 = -d5;
        double d25 = d24 * dCos2;
        double d26 = d7 * dSin2;
        double d27 = (d25 * dSin3) - (d26 * dCos3);
        double d28 = d24 * dSin2;
        double d29 = d7 * dCos2;
        double d30 = dAtan3 / ((double) iCeil);
        double d31 = (dCos3 * d29) + (dSin3 * d28);
        double d32 = d3;
        double d33 = d4;
        int i = 0;
        double d34 = dAtan2;
        while (i < iCeil) {
            double d35 = d34 + d30;
            double dSin4 = Math.sin(d35);
            double dCos4 = Math.cos(d35);
            int i2 = iCeil;
            double d36 = (((d5 * dCos2) * dCos4) + d22) - (d26 * dSin4);
            double d37 = (d29 * dSin4) + (d5 * dSin2 * dCos4) + d23;
            double d38 = (d25 * dSin4) - (d26 * dCos4);
            double d39 = (dCos4 * d29) + (dSin4 * d28);
            double d40 = d35 - d34;
            double dTan = Math.tan(d40 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d40)) / 3.0d;
            path.rLineTo(TouchPipeline.SIZE, TouchPipeline.SIZE);
            path.cubicTo((float) ((d27 * dSqrt2) + d32), (float) ((d31 * dSqrt2) + d33), (float) (d36 - (dSqrt2 * d38)), (float) (d37 - (dSqrt2 * d39)), (float) d36, (float) d37);
            i++;
            d33 = d37;
            dCos2 = dCos2;
            d28 = d28;
            d34 = d35;
            d31 = d39;
            d32 = d36;
            iCeil = i2;
            d27 = d38;
            d30 = d30;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static void m3420b(ic1[] ic1VarArr, Path path) {
        int i;
        int i2;
        int i3;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        int i4 = 6;
        float[] fArr = new float[6];
        int i5 = 0;
        char c = 'm';
        int i6 = 0;
        while (i6 < ic1VarArr.length) {
            ic1 ic1Var = ic1VarArr[i6];
            char c2 = ic1Var.f4935a;
            float[] fArr2 = ic1Var.f4936b;
            float f12 = fArr[i5];
            float f13 = fArr[1];
            float f14 = fArr[2];
            float f15 = fArr[3];
            float f16 = fArr[4];
            float f17 = fArr[5];
            switch (c2) {
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = i4;
                    break;
                case 'H':
                case 'V':
                case LocationRequest.PRIORITY_LOW_POWER /* 104 */:
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f16, f17);
                    f12 = f16;
                    f14 = f12;
                    f13 = f17;
                    f15 = f13;
                default:
                    i = 2;
                    break;
            }
            float f18 = f13;
            float f19 = f16;
            float f20 = f17;
            float f21 = f12;
            int i7 = i5;
            while (i7 < fArr2.length) {
                if (c2 == 'A') {
                    i2 = i7;
                    fArr2 = fArr2;
                    i3 = i5;
                    float f22 = f18;
                    c2 = c2;
                    int i8 = i2 + 5;
                    int i9 = i2 + 6;
                    m3419a(path, f21, f22, fArr2[i8], fArr2[i9], fArr2[i2], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3] != TouchPipeline.SIZE ? 1 : i3, fArr2[i2 + 4] != TouchPipeline.SIZE ? 1 : i3);
                    f14 = fArr2[i8];
                    f21 = f14;
                    f = fArr2[i9];
                    f15 = f;
                } else if (c2 == 'C') {
                    i2 = i7;
                    c2 = c2;
                    fArr2 = fArr2;
                    i3 = i5;
                    int i10 = i2 + 2;
                    int i11 = i2 + 3;
                    int i12 = i2 + 4;
                    int i13 = i2 + 5;
                    path.cubicTo(fArr2[i2], fArr2[i2 + 1], fArr2[i10], fArr2[i11], fArr2[i12], fArr2[i13]);
                    float f23 = fArr2[i12];
                    float f24 = fArr2[i13];
                    f21 = f23;
                    f14 = fArr2[i10];
                    f15 = fArr2[i11];
                    f = f24;
                } else if (c2 != 'H') {
                    if (c2 != 'Q') {
                        i3 = i5;
                        if (c2 == 'V') {
                            i2 = i7;
                            c2 = c2;
                            fArr2 = fArr2;
                            path.lineTo(f21, fArr2[i2]);
                            f = fArr2[i2];
                        } else if (c2 != 'a') {
                            if (c2 == 'c') {
                                i2 = i7;
                                int i14 = i2 + 2;
                                int i15 = i2 + 3;
                                int i16 = i2 + 4;
                                int i17 = i2 + 5;
                                path.rCubicTo(fArr2[i2], fArr2[i2 + 1], fArr2[i14], fArr2[i15], fArr2[i16], fArr2[i17]);
                                float f25 = fArr2[i14] + f21;
                                float f26 = f18 + fArr2[i15];
                                f21 += fArr2[i16];
                                f18 += fArr2[i17];
                                f14 = f25;
                                f15 = f26;
                            } else if (c2 != 'h') {
                                if (c2 != 'q') {
                                    if (c2 != 'v') {
                                        if (c2 == 'L') {
                                            i2 = i7;
                                            int i18 = i2 + 1;
                                            path.lineTo(fArr2[i2], fArr2[i18]);
                                            f7 = fArr2[i2];
                                            f = fArr2[i18];
                                        } else if (c2 == 'M') {
                                            i2 = i7;
                                            f7 = fArr2[i2];
                                            f = fArr2[i2 + 1];
                                            if (i2 > 0) {
                                                path.lineTo(f7, f);
                                            } else {
                                                path.moveTo(f7, f);
                                                f21 = f7;
                                                f19 = f21;
                                                f20 = f;
                                            }
                                            c2 = c2;
                                            fArr2 = fArr2;
                                        } else if (c2 == 'S') {
                                            i2 = i7;
                                            if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                                f21 = (f21 * 2.0f) - f14;
                                                f18 = (f18 * 2.0f) - f15;
                                            }
                                            float f27 = f21;
                                            int i19 = i2 + 1;
                                            int i20 = i2 + 2;
                                            int i21 = i2 + 3;
                                            path.cubicTo(f27, f18, fArr2[i2], fArr2[i19], fArr2[i20], fArr2[i21]);
                                            f2 = fArr2[i2];
                                            f15 = fArr2[i19];
                                            f21 = fArr2[i20];
                                            f = fArr2[i21];
                                            fArr2 = fArr2;
                                        } else if (c2 != 'T') {
                                            if (c2 == 'l') {
                                                i2 = i7;
                                                int i22 = i2 + 1;
                                                path.rLineTo(fArr2[i2], fArr2[i22]);
                                                f21 += fArr2[i2];
                                                f6 = fArr2[i22];
                                            } else if (c2 == 'm') {
                                                i2 = i7;
                                                float f28 = fArr2[i2];
                                                f21 += f28;
                                                float f29 = fArr2[i2 + 1];
                                                f18 += f29;
                                                if (i2 > 0) {
                                                    path.rLineTo(f28, f29);
                                                } else {
                                                    path.rMoveTo(f28, f29);
                                                    f19 = f21;
                                                    f = f18;
                                                    f20 = f;
                                                }
                                            } else if (c2 == 's') {
                                                if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                                    f8 = f18 - f15;
                                                    f9 = f21 - f14;
                                                } else {
                                                    f9 = TouchPipeline.SIZE;
                                                    f8 = TouchPipeline.SIZE;
                                                }
                                                int i23 = i7 + 1;
                                                int i24 = i7 + 2;
                                                int i25 = i7 + 3;
                                                i2 = i7;
                                                path.rCubicTo(f9, f8, fArr2[i7], fArr2[i23], fArr2[i24], fArr2[i25]);
                                                f3 = fArr2[i2] + f21;
                                                f4 = f18 + fArr2[i23];
                                                f21 += fArr2[i24];
                                                f5 = fArr2[i25];
                                            } else if (c2 != 't') {
                                                i2 = i7;
                                            } else {
                                                if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                                    f10 = f21 - f14;
                                                    f11 = f18 - f15;
                                                } else {
                                                    f11 = TouchPipeline.SIZE;
                                                    f10 = TouchPipeline.SIZE;
                                                }
                                                int i26 = i7 + 1;
                                                path.rQuadTo(f10, f11, fArr2[i7], fArr2[i26]);
                                                float f30 = f10 + f21;
                                                float f31 = f18 + f11;
                                                f21 += fArr2[i7];
                                                f18 += fArr2[i26];
                                                f15 = f31;
                                                i2 = i7;
                                                f14 = f30;
                                            }
                                            c2 = c2;
                                        } else {
                                            i2 = i7;
                                            if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                                f21 = (f21 * 2.0f) - f14;
                                                f18 = (f18 * 2.0f) - f15;
                                            }
                                            float f32 = f18;
                                            int i27 = i2 + 1;
                                            path.quadTo(f21, f32, fArr2[i2], fArr2[i27]);
                                            f15 = f32;
                                            c2 = c2;
                                            fArr2 = fArr2;
                                            f14 = f21;
                                            f21 = fArr2[i2];
                                            f = fArr2[i27];
                                        }
                                        f21 = f7;
                                        c2 = c2;
                                        fArr2 = fArr2;
                                    } else {
                                        i2 = i7;
                                        path.rLineTo(TouchPipeline.SIZE, fArr2[i2]);
                                        f6 = fArr2[i2];
                                    }
                                    f18 += f6;
                                } else {
                                    i2 = i7;
                                    int i28 = i2 + 1;
                                    int i29 = i2 + 2;
                                    int i30 = i2 + 3;
                                    path.rQuadTo(fArr2[i2], fArr2[i28], fArr2[i29], fArr2[i30]);
                                    f3 = fArr2[i2] + f21;
                                    f4 = f18 + fArr2[i28];
                                    f21 += fArr2[i29];
                                    f5 = fArr2[i30];
                                }
                                f18 += f5;
                                f14 = f3;
                                f15 = f4;
                            } else {
                                i2 = i7;
                                path.rLineTo(fArr2[i2], TouchPipeline.SIZE);
                                f21 += fArr2[i2];
                            }
                            f = f18;
                            c2 = c2;
                        } else {
                            i2 = i7;
                            int i31 = i2 + 5;
                            float f33 = fArr2[i31] + f21;
                            int i32 = i2 + 6;
                            float f34 = fArr2[i32] + f18;
                            fArr2 = fArr2;
                            float f35 = f21;
                            float f36 = f18;
                            c2 = c2;
                            m3419a(path, f35, f36, f33, f34, fArr2[i2], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3] != TouchPipeline.SIZE ? 1 : i3, fArr2[i2 + 4] != TouchPipeline.SIZE ? 1 : i3);
                            f21 = f35 + fArr2[i31];
                            f = fArr2[i32] + f36;
                            f15 = f;
                            f14 = f21;
                        }
                    } else {
                        i2 = i7;
                        fArr2 = fArr2;
                        i3 = i5;
                        int i33 = i2 + 1;
                        int i34 = i2 + 2;
                        int i35 = i2 + 3;
                        path.quadTo(fArr2[i2], fArr2[i33], fArr2[i34], fArr2[i35]);
                        f2 = fArr2[i2];
                        f15 = fArr2[i33];
                        f21 = fArr2[i34];
                        f = fArr2[i35];
                    }
                    f14 = f2;
                } else {
                    i2 = i7;
                    fArr2 = fArr2;
                    i3 = i5;
                    f = f18;
                    c2 = c2;
                    path.lineTo(fArr2[i2], f);
                    f21 = fArr2[i2];
                }
                c = c2;
                c2 = c;
                i5 = i3;
                fArr2 = fArr2;
                f18 = f;
                i7 = i2 + i;
                path = path;
            }
            fArr[i5] = f21;
            fArr[1] = f18;
            fArr[2] = f14;
            fArr[3] = f15;
            fArr[4] = f19;
            fArr[5] = f20;
            c = ic1VarArr[i6].f4935a;
            i6++;
            i4 = 6;
        }
    }
}

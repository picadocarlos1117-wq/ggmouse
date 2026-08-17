package p000;

import android.graphics.Color;
import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: renamed from: gl */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0681gl {

    /* JADX INFO: renamed from: a */
    public final float f4218a;

    /* JADX INFO: renamed from: b */
    public final float f4219b;

    /* JADX INFO: renamed from: c */
    public final float f4220c;

    /* JADX INFO: renamed from: d */
    public final float f4221d;

    /* JADX INFO: renamed from: e */
    public final float f4222e;

    /* JADX INFO: renamed from: f */
    public final float f4223f;

    public C0681gl(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f4218a = f;
        this.f4219b = f2;
        this.f4220c = f3;
        this.f4221d = f4;
        this.f4222e = f5;
        this.f4223f = f6;
    }

    /* JADX INFO: renamed from: a */
    public static C0681gl m3007a(int i) {
        k82 k82Var = k82.f5699k;
        float fM5154U = p32.m5154U(Color.red(i));
        float fM5154U2 = p32.m5154U(Color.green(i));
        float fM5154U3 = p32.m5154U(Color.blue(i));
        float[][] fArr = p32.f8690d;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * fM5154U3) + (fArr2[1] * fM5154U2) + (fArr2[0] * fM5154U);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[2] * fM5154U3) + (fArr3[1] * fM5154U2) + (fArr3[0] * fM5154U);
        float[] fArr4 = fArr[2];
        float[] fArr5 = {f, f2, (fM5154U3 * fArr4[2]) + (fM5154U2 * fArr4[1]) + (fM5154U * fArr4[0])};
        float[][] fArr6 = p32.f8687a;
        float f3 = fArr5[0];
        float[] fArr7 = fArr6[0];
        float f4 = fArr7[0] * f3;
        float f5 = fArr5[1];
        float f6 = (fArr7[1] * f5) + f4;
        float f7 = fArr5[2];
        float f8 = (fArr7[2] * f7) + f6;
        float[] fArr8 = fArr6[1];
        float f9 = (fArr8[2] * f7) + (fArr8[1] * f5) + (fArr8[0] * f3);
        float[] fArr9 = fArr6[2];
        float f10 = (f7 * fArr9[2]) + (f5 * fArr9[1]) + (f3 * fArr9[0]);
        float[] fArr10 = k82Var.f5706g;
        float f11 = k82Var.f5708i;
        float f12 = k82Var.f5703d;
        float f13 = k82Var.f5700a;
        float f14 = fArr10[0] * f8;
        float f15 = fArr10[1] * f9;
        float f16 = fArr10[2] * f10;
        float f17 = k82Var.f5707h;
        float fPow = (float) Math.pow(((double) (Math.abs(f14) * f17)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f15) * f17)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f16) * f17)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f14) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f15) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f16) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f18 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d)) / 11.0f;
        float f19 = ((float) (((double) (fSignum + fSignum2)) - (d * 2.0d))) / 9.0f;
        float f20 = fSignum2 * 20.0f;
        float f21 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f20)) / 20.0f;
        float f22 = (((fSignum * 40.0f) + f20) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f19, f18)) * 180.0f) / 3.1415927f;
        if (fAtan2 < TouchPipeline.SIZE) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f23 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f22 * k82Var.f5701b) / f13, k82Var.f5709j * f12)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f24 = f13 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, k82Var.f5705f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * k82Var.f5704e) * k82Var.f5702c) * ((float) Math.sqrt((f19 * f19) + (f18 * f18)))) / (f21 + 0.305f), 0.9d));
        float fSqrt = fPow5 * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        Math.sqrt((fPow5 * f12) / f24);
        float f25 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f11 * fSqrt * 0.0228f) + 1.0f)) * 43.85965f;
        double d2 = f23;
        return new C0681gl(fAtan2, fSqrt, fPow4, f25, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    /* JADX INFO: renamed from: b */
    public static C0681gl m3008b(float f, float f2, float f3) {
        k82 k82Var = k82.f5699k;
        float f4 = k82Var.f5703d;
        double d = ((double) f) / 100.0d;
        Math.sqrt(d);
        float f5 = k82Var.f5700a + 4.0f;
        float f6 = k82Var.f5708i * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(d))) * k82Var.f5703d) / f5);
        float f7 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) f6) * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new C0681gl(f3, f2, f, f7, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX INFO: renamed from: c */
    public final int m3009c(k82 k82Var) {
        float fSqrt;
        float f = this.f4219b;
        double d = f;
        float f2 = this.f4220c;
        if (d != 0.0d) {
            double d2 = f2;
            if (d2 == 0.0d) {
                fSqrt = TouchPipeline.SIZE;
            } else {
                fSqrt = f / ((float) Math.sqrt(d2 / 100.0d));
            }
        } else {
            fSqrt = TouchPipeline.SIZE;
        }
        float f3 = k82Var.f5705f;
        float f4 = k82Var.f5707h;
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, f3), 0.73d), 1.1111111111111112d);
        double d3 = (this.f4218a * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d3) + 3.8d)) * 0.25f;
        float fPow2 = k82Var.f5700a * ((float) Math.pow(((double) f2) / 100.0d, (1.0d / ((double) k82Var.f5703d)) / ((double) k82Var.f5709j)));
        float f5 = fCos * 3846.1538f * k82Var.f5704e * k82Var.f5702c;
        float f6 = fPow2 / k82Var.f5701b;
        float fSin = (float) Math.sin(d3);
        float fCos2 = (float) Math.cos(d3);
        float f7 = (((0.305f + f6) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f5 * 23.0f)));
        float f8 = fCos2 * f7;
        float f9 = f7 * fSin;
        float f10 = f6 * 460.0f;
        float f11 = ((288.0f * f9) + ((451.0f * f8) + f10)) / 1403.0f;
        float f12 = ((f10 - (891.0f * f8)) - (261.0f * f9)) / 1403.0f;
        float f13 = ((f10 - (f8 * 220.0f)) - (f9 * 6300.0f)) / 1403.0f;
        float f14 = 100.0f / f4;
        float fSignum = Math.signum(f11) * f14 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f11)) * 27.13d) / (400.0d - ((double) Math.abs(f11)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f12) * f14 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f12)) * 27.13d) / (400.0d - ((double) Math.abs(f12)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f13) * f14 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f13)) * 27.13d) / (400.0d - ((double) Math.abs(f13)))), 2.380952380952381d));
        float[] fArr = k82Var.f5706g;
        float f15 = fSignum / fArr[0];
        float f16 = fSignum2 / fArr[1];
        float f17 = fSignum3 / fArr[2];
        float[][] fArr2 = p32.f8688b;
        float[] fArr3 = fArr2[0];
        float f18 = (fArr3[2] * f17) + (fArr3[1] * f16) + (fArr3[0] * f15);
        float[] fArr4 = fArr2[1];
        float f19 = (fArr4[2] * f17) + (fArr4[1] * f16) + (fArr4[0] * f15);
        float[] fArr5 = fArr2[2];
        return AbstractC0539cq.m2112a(f18, f19, (f17 * fArr5[2]) + (f16 * fArr5[1]) + (f15 * fArr5[0]));
    }
}

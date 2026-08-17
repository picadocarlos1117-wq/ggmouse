package p000;

import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class k82 {

    /* JADX INFO: renamed from: k */
    public static final k82 f5699k;

    /* JADX INFO: renamed from: a */
    public final float f5700a;

    /* JADX INFO: renamed from: b */
    public final float f5701b;

    /* JADX INFO: renamed from: c */
    public final float f5702c;

    /* JADX INFO: renamed from: d */
    public final float f5703d;

    /* JADX INFO: renamed from: e */
    public final float f5704e;

    /* JADX INFO: renamed from: f */
    public final float f5705f;

    /* JADX INFO: renamed from: g */
    public final float[] f5706g;

    /* JADX INFO: renamed from: h */
    public final float f5707h;

    /* JADX INFO: renamed from: i */
    public final float f5708i;

    /* JADX INFO: renamed from: j */
    public final float f5709j;

    static {
        float[] fArr = p32.f8689c;
        float fM5184o0 = (float) ((((double) p32.m5184o0()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = p32.f8687a;
        float f = fArr[0];
        float[] fArr3 = fArr2[0];
        float f2 = fArr3[0] * f;
        float f3 = fArr[1];
        float f4 = (fArr3[1] * f3) + f2;
        float f5 = fArr[2];
        float f6 = (fArr3[2] * f5) + f4;
        float[] fArr4 = fArr2[1];
        float f7 = (fArr4[2] * f5) + (fArr4[1] * f3) + (fArr4[0] * f);
        float[] fArr5 = fArr2[2];
        float f8 = (f5 * fArr5[2]) + (f3 * fArr5[1]) + (f * fArr5[0]);
        float fExp = (1.0f - (((float) Math.exp(((-fM5184o0) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = fExp;
        if (d > 1.0d) {
            fExp = 1.0f;
        } else if (d < 0.0d) {
            fExp = TouchPipeline.SIZE;
        }
        float[] fArr6 = {(((100.0f / f6) * fExp) + 1.0f) - fExp, (((100.0f / f7) * fExp) + 1.0f) - fExp, (((100.0f / f8) * fExp) + 1.0f) - fExp};
        float f9 = 1.0f / ((5.0f * fM5184o0) + 1.0f);
        float f10 = f9 * f9 * f9 * f9;
        float f11 = 1.0f - f10;
        float fCbrt = (0.1f * f11 * f11 * ((float) Math.cbrt(((double) fM5184o0) * 5.0d))) + (f10 * fM5184o0);
        float fM5184o1 = p32.m5184o0() / fArr[1];
        double d2 = fM5184o1;
        float fSqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f6)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f7)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f8)) / 100.0d, 0.42d)};
        float f12 = fArr7[0];
        float f13 = (f12 * 400.0f) / (f12 + 27.13f);
        float f14 = fArr7[1];
        float f15 = (f14 * 400.0f) / (f14 + 27.13f);
        float f16 = fArr7[2];
        float[] fArr8 = {f13, f15, (400.0f * f16) / (f16 + 27.13f)};
        f5699k = new k82(fM5184o1, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow, fPow, fPow, 0.69f, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public k82(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f5705f = f;
        this.f5700a = f2;
        this.f5701b = f3;
        this.f5702c = f4;
        this.f5703d = f5;
        this.f5704e = f6;
        this.f5706g = fArr;
        this.f5707h = f7;
        this.f5708i = f8;
        this.f5709j = f9;
    }
}

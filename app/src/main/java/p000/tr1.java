package p000;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class tr1 extends xr1 {

    /* JADX INFO: renamed from: c */
    public final vr1 f10939c;

    /* JADX INFO: renamed from: d */
    public final float f10940d;

    /* JADX INFO: renamed from: e */
    public final float f10941e;

    public tr1(vr1 vr1Var, float f, float f2) {
        this.f10939c = vr1Var;
        this.f10940d = f;
        this.f10941e = f2;
    }

    @Override // p000.xr1
    /* JADX INFO: renamed from: a */
    public final void mo5902a(Matrix matrix, nr1 nr1Var, int i, Canvas canvas) {
        vr1 vr1Var = this.f10939c;
        float f = vr1Var.f11756c;
        float f2 = this.f10941e;
        float f3 = vr1Var.f11755b;
        float f4 = this.f10940d;
        RectF rectF = new RectF(TouchPipeline.SIZE, TouchPipeline.SIZE, (float) Math.hypot(f - f2, f3 - f4), TouchPipeline.SIZE);
        Matrix matrix2 = this.f12697a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(m6333b());
        nr1Var.getClass();
        rectF.bottom += i;
        rectF.offset(TouchPipeline.SIZE, -i);
        int i2 = nr1Var.f7521f;
        int[] iArr = nr1.f7512i;
        iArr[0] = i2;
        iArr[1] = nr1Var.f7520e;
        iArr[2] = nr1Var.f7519d;
        Paint paint = nr1Var.f7518c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, nr1.f7513j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    /* JADX INFO: renamed from: b */
    public final float m6333b() {
        vr1 vr1Var = this.f10939c;
        return (float) Math.toDegrees(Math.atan((vr1Var.f11756c - this.f10941e) / (vr1Var.f11755b - this.f10940d)));
    }
}

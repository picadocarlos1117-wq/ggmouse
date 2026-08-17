package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class sr1 extends xr1 {

    /* JADX INFO: renamed from: c */
    public final ur1 f10516c;

    public sr1(ur1 ur1Var) {
        this.f10516c = ur1Var;
    }

    @Override // p000.xr1
    /* JADX INFO: renamed from: a */
    public final void mo5902a(Matrix matrix, nr1 nr1Var, int i, Canvas canvas) {
        ur1 ur1Var = this.f10516c;
        float f = ur1Var.f11396f;
        float f2 = ur1Var.f11397g;
        RectF rectF = new RectF(ur1Var.f11392b, ur1Var.f11393c, ur1Var.f11394d, ur1Var.f11395e);
        Paint paint = nr1Var.f7517b;
        boolean z = f2 < TouchPipeline.SIZE;
        Path path = nr1Var.f7522g;
        int[] iArr = nr1.f7514k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = nr1Var.f7521f;
            iArr[2] = nr1Var.f7520e;
            iArr[3] = nr1Var.f7519d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = nr1Var.f7519d;
            iArr[2] = nr1Var.f7520e;
            iArr[3] = nr1Var.f7521f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= TouchPipeline.SIZE) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = nr1.f7515l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, nr1Var.f7523h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}

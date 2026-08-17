package p000;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import com.example.ssmousepro.injection.TouchPipeline;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class m52 {

    /* JADX INFO: renamed from: p */
    public static final Matrix f6645p = new Matrix();

    /* JADX INFO: renamed from: a */
    public final Path f6646a;

    /* JADX INFO: renamed from: b */
    public final Path f6647b;

    /* JADX INFO: renamed from: c */
    public final Matrix f6648c;

    /* JADX INFO: renamed from: d */
    public Paint f6649d;

    /* JADX INFO: renamed from: e */
    public Paint f6650e;

    /* JADX INFO: renamed from: f */
    public PathMeasure f6651f;

    /* JADX INFO: renamed from: g */
    public final j52 f6652g;

    /* JADX INFO: renamed from: h */
    public float f6653h;

    /* JADX INFO: renamed from: i */
    public float f6654i;

    /* JADX INFO: renamed from: j */
    public float f6655j;

    /* JADX INFO: renamed from: k */
    public float f6656k;

    /* JADX INFO: renamed from: l */
    public int f6657l;

    /* JADX INFO: renamed from: m */
    public String f6658m;

    /* JADX INFO: renamed from: n */
    public Boolean f6659n;

    /* JADX INFO: renamed from: o */
    public final C0633fa f6660o;

    public m52(m52 m52Var) {
        this.f6648c = new Matrix();
        this.f6653h = TouchPipeline.SIZE;
        this.f6654i = TouchPipeline.SIZE;
        this.f6655j = TouchPipeline.SIZE;
        this.f6656k = TouchPipeline.SIZE;
        this.f6657l = 255;
        this.f6658m = null;
        this.f6659n = null;
        C0633fa c0633fa = new C0633fa();
        this.f6660o = c0633fa;
        this.f6652g = new j52(m52Var.f6652g, c0633fa);
        this.f6646a = new Path(m52Var.f6646a);
        this.f6647b = new Path(m52Var.f6647b);
        this.f6653h = m52Var.f6653h;
        this.f6654i = m52Var.f6654i;
        this.f6655j = m52Var.f6655j;
        this.f6656k = m52Var.f6656k;
        this.f6657l = m52Var.f6657l;
        this.f6658m = m52Var.f6658m;
        String str = m52Var.f6658m;
        if (str != null) {
            c0633fa.put(str, this);
        }
        this.f6659n = m52Var.f6659n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m4385a(j52 j52Var, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        int i4;
        Matrix matrix2 = j52Var.f5273a;
        ArrayList arrayList = j52Var.f5274b;
        matrix2.set(matrix);
        Matrix matrix3 = j52Var.f5273a;
        matrix3.preConcat(j52Var.f5282j);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            k52 k52Var = (k52) arrayList.get(i5);
            if (k52Var instanceof j52) {
                m4385a((j52) k52Var, matrix3, canvas, i, i2);
            } else {
                if (k52Var instanceof l52) {
                    l52 l52Var = (l52) k52Var;
                    float f2 = i / this.f6655j;
                    float f3 = i2 / this.f6656k;
                    float fMin = Math.min(f2, f3);
                    Matrix matrix4 = this.f6648c;
                    matrix4.set(matrix3);
                    matrix4.postScale(f2, f3);
                    float[] fArr = {TouchPipeline.SIZE, 1.0f, 1.0f, TouchPipeline.SIZE};
                    matrix3.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c], fArr[1]);
                    boolean z = c;
                    i3 = i5;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f4 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > TouchPipeline.SIZE ? Math.abs(f4) / fMax : 0.0f;
                    if (fAbs != TouchPipeline.SIZE) {
                        Path path = this.f6646a;
                        path.reset();
                        ic1[] ic1VarArr = l52Var.f6189a;
                        if (ic1VarArr != null) {
                            ic1.m3420b(ic1VarArr, path);
                        }
                        Path path2 = this.f6647b;
                        path2.reset();
                        if (l52Var instanceof h52) {
                            path2.setFillType(l52Var.f6191c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            i52 i52Var = (i52) l52Var;
                            float f5 = i52Var.f4823i;
                            if (f5 != TouchPipeline.SIZE || i52Var.f4824j != 1.0f) {
                                float f6 = i52Var.f4825k;
                                float f7 = (f5 + f6) % 1.0f;
                                float f8 = (i52Var.f4824j + f6) % 1.0f;
                                if (this.f6651f == null) {
                                    this.f6651f = new PathMeasure();
                                }
                                this.f6651f.setPath(path, z);
                                float length = this.f6651f.getLength();
                                float f9 = f7 * length;
                                float f10 = f8 * length;
                                path.reset();
                                PathMeasure pathMeasure = this.f6651f;
                                if (f9 > f10) {
                                    pathMeasure.getSegment(f9, length, path, true);
                                    PathMeasure pathMeasure2 = this.f6651f;
                                    f = TouchPipeline.SIZE;
                                    pathMeasure2.getSegment(TouchPipeline.SIZE, f10, path, true);
                                } else {
                                    f = 0.0f;
                                    pathMeasure.getSegment(f9, f10, path, true);
                                }
                                path.rLineTo(f, f);
                            }
                            path2.addPath(path, matrix4);
                            C0082b0 c0082b0 = i52Var.f4820f;
                            float f11 = 255.0f;
                            if (((Shader) c0082b0.f1104c) == null && c0082b0.f1103b == 0) {
                                f11 = 255.0f;
                                i4 = 16777215;
                            } else {
                                if (this.f6650e == null) {
                                    i4 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.f6650e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i4 = 16777215;
                                }
                                Paint paint2 = this.f6650e;
                                Shader shader = (Shader) c0082b0.f1104c;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(i52Var.f4822h * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i6 = c0082b0.f1103b;
                                    float f12 = i52Var.f4822h;
                                    PorterDuff.Mode mode = p52.f8728o;
                                    paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(i52Var.f6191c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            }
                            C0082b0 c0082b1 = i52Var.f4818d;
                            if (((Shader) c0082b1.f1104c) != null || c0082b1.f1103b != 0) {
                                if (this.f6649d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.f6649d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.f6649d;
                                Paint.Join join = i52Var.f4827m;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = i52Var.f4826l;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(i52Var.f4828n);
                                Shader shader2 = (Shader) c0082b1.f1104c;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix4);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(i52Var.f4821g * f11));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i7 = c0082b1.f1103b;
                                    float f13 = i52Var.f4821g;
                                    PorterDuff.Mode mode2 = p52.f8728o;
                                    paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(i52Var.f4819e * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                }
                i5 = i3 + 1;
                c = 0;
            }
            i3 = i5;
            i5 = i3 + 1;
            c = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f6657l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f6657l = i;
    }

    public m52() {
        this.f6648c = new Matrix();
        this.f6653h = TouchPipeline.SIZE;
        this.f6654i = TouchPipeline.SIZE;
        this.f6655j = TouchPipeline.SIZE;
        this.f6656k = TouchPipeline.SIZE;
        this.f6657l = 255;
        this.f6658m = null;
        this.f6659n = null;
        this.f6660o = new C0633fa();
        this.f6652g = new j52();
        this.f6646a = new Path();
        this.f6647b = new Path();
    }
}

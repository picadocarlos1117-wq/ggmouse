package p000;

import android.graphics.Matrix;
import android.graphics.Paint;
import com.example.ssmousepro.injection.TouchPipeline;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class j52 extends k52 {

    /* JADX INFO: renamed from: a */
    public final Matrix f5273a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f5274b;

    /* JADX INFO: renamed from: c */
    public float f5275c;

    /* JADX INFO: renamed from: d */
    public float f5276d;

    /* JADX INFO: renamed from: e */
    public float f5277e;

    /* JADX INFO: renamed from: f */
    public float f5278f;

    /* JADX INFO: renamed from: g */
    public float f5279g;

    /* JADX INFO: renamed from: h */
    public float f5280h;

    /* JADX INFO: renamed from: i */
    public float f5281i;

    /* JADX INFO: renamed from: j */
    public final Matrix f5282j;

    /* JADX INFO: renamed from: k */
    public String f5283k;

    public j52(j52 j52Var, C0633fa c0633fa) {
        l52 h52Var;
        this.f5273a = new Matrix();
        this.f5274b = new ArrayList();
        this.f5275c = TouchPipeline.SIZE;
        this.f5276d = TouchPipeline.SIZE;
        this.f5277e = TouchPipeline.SIZE;
        this.f5278f = 1.0f;
        this.f5279g = 1.0f;
        this.f5280h = TouchPipeline.SIZE;
        this.f5281i = TouchPipeline.SIZE;
        Matrix matrix = new Matrix();
        this.f5282j = matrix;
        this.f5283k = null;
        this.f5275c = j52Var.f5275c;
        this.f5276d = j52Var.f5276d;
        this.f5277e = j52Var.f5277e;
        this.f5278f = j52Var.f5278f;
        this.f5279g = j52Var.f5279g;
        this.f5280h = j52Var.f5280h;
        this.f5281i = j52Var.f5281i;
        String str = j52Var.f5283k;
        this.f5283k = str;
        if (str != null) {
            c0633fa.put(str, this);
        }
        matrix.set(j52Var.f5282j);
        ArrayList arrayList = j52Var.f5274b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof j52) {
                this.f5274b.add(new j52((j52) obj, c0633fa));
            } else {
                if (obj instanceof i52) {
                    i52 i52Var = (i52) obj;
                    i52 i52Var2 = new i52(i52Var);
                    i52Var2.f4819e = TouchPipeline.SIZE;
                    i52Var2.f4821g = 1.0f;
                    i52Var2.f4822h = 1.0f;
                    i52Var2.f4823i = TouchPipeline.SIZE;
                    i52Var2.f4824j = 1.0f;
                    i52Var2.f4825k = TouchPipeline.SIZE;
                    i52Var2.f4826l = Paint.Cap.BUTT;
                    i52Var2.f4827m = Paint.Join.MITER;
                    i52Var2.f4828n = 4.0f;
                    i52Var2.f4818d = i52Var.f4818d;
                    i52Var2.f4819e = i52Var.f4819e;
                    i52Var2.f4821g = i52Var.f4821g;
                    i52Var2.f4820f = i52Var.f4820f;
                    i52Var2.f6191c = i52Var.f6191c;
                    i52Var2.f4822h = i52Var.f4822h;
                    i52Var2.f4823i = i52Var.f4823i;
                    i52Var2.f4824j = i52Var.f4824j;
                    i52Var2.f4825k = i52Var.f4825k;
                    i52Var2.f4826l = i52Var.f4826l;
                    i52Var2.f4827m = i52Var.f4827m;
                    i52Var2.f4828n = i52Var.f4828n;
                    h52Var = i52Var2;
                } else {
                    if (!(obj instanceof h52)) {
                        f40.m2719o("Unknown object in the tree!");
                        throw null;
                    }
                    h52Var = new h52((h52) obj);
                }
                this.f5274b.add(h52Var);
                Object obj2 = h52Var.f6190b;
                if (obj2 != null) {
                    c0633fa.put(obj2, h52Var);
                }
            }
        }
    }

    @Override // p000.k52
    /* JADX INFO: renamed from: a */
    public final boolean mo3362a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5274b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((k52) arrayList.get(i)).mo3362a()) {
                return true;
            }
            i++;
        }
    }

    @Override // p000.k52
    /* JADX INFO: renamed from: b */
    public final boolean mo3363b(int[] iArr) {
        int i = 0;
        boolean zMo3363b = false;
        while (true) {
            ArrayList arrayList = this.f5274b;
            if (i >= arrayList.size()) {
                return zMo3363b;
            }
            zMo3363b |= ((k52) arrayList.get(i)).mo3363b(iArr);
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3567c() {
        Matrix matrix = this.f5282j;
        matrix.reset();
        matrix.postTranslate(-this.f5276d, -this.f5277e);
        matrix.postScale(this.f5278f, this.f5279g);
        matrix.postRotate(this.f5275c, TouchPipeline.SIZE, TouchPipeline.SIZE);
        matrix.postTranslate(this.f5280h + this.f5276d, this.f5281i + this.f5277e);
    }

    public String getGroupName() {
        return this.f5283k;
    }

    public Matrix getLocalMatrix() {
        return this.f5282j;
    }

    public float getPivotX() {
        return this.f5276d;
    }

    public float getPivotY() {
        return this.f5277e;
    }

    public float getRotation() {
        return this.f5275c;
    }

    public float getScaleX() {
        return this.f5278f;
    }

    public float getScaleY() {
        return this.f5279g;
    }

    public float getTranslateX() {
        return this.f5280h;
    }

    public float getTranslateY() {
        return this.f5281i;
    }

    public void setPivotX(float f) {
        if (f != this.f5276d) {
            this.f5276d = f;
            m3567c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f5277e) {
            this.f5277e = f;
            m3567c();
        }
    }

    public void setRotation(float f) {
        if (f != this.f5275c) {
            this.f5275c = f;
            m3567c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f5278f) {
            this.f5278f = f;
            m3567c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f5279g) {
            this.f5279g = f;
            m3567c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f5280h) {
            this.f5280h = f;
            m3567c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.f5281i) {
            this.f5281i = f;
            m3567c();
        }
    }

    public j52() {
        this.f5273a = new Matrix();
        this.f5274b = new ArrayList();
        this.f5275c = TouchPipeline.SIZE;
        this.f5276d = TouchPipeline.SIZE;
        this.f5277e = TouchPipeline.SIZE;
        this.f5278f = 1.0f;
        this.f5279g = 1.0f;
        this.f5280h = TouchPipeline.SIZE;
        this.f5281i = TouchPipeline.SIZE;
        this.f5282j = new Matrix();
        this.f5283k = null;
    }
}

package p000;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class i52 extends l52 {

    /* JADX INFO: renamed from: d */
    public C0082b0 f4818d;

    /* JADX INFO: renamed from: e */
    public float f4819e;

    /* JADX INFO: renamed from: f */
    public C0082b0 f4820f;

    /* JADX INFO: renamed from: g */
    public float f4821g;

    /* JADX INFO: renamed from: h */
    public float f4822h;

    /* JADX INFO: renamed from: i */
    public float f4823i;

    /* JADX INFO: renamed from: j */
    public float f4824j;

    /* JADX INFO: renamed from: k */
    public float f4825k;

    /* JADX INFO: renamed from: l */
    public Paint.Cap f4826l;

    /* JADX INFO: renamed from: m */
    public Paint.Join f4827m;

    /* JADX INFO: renamed from: n */
    public float f4828n;

    @Override // p000.k52
    /* JADX INFO: renamed from: a */
    public final boolean mo3362a() {
        return this.f4820f.m808j() || this.f4818d.m808j();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // p000.k52
    /* JADX INFO: renamed from: b */
    public final boolean mo3363b(int[] iArr) {
        boolean z;
        C0082b0 c0082b0 = this.f4820f;
        boolean z2 = true;
        if (c0082b0.m808j()) {
            ColorStateList colorStateList = (ColorStateList) c0082b0.f1105d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != c0082b0.f1103b) {
                c0082b0.f1103b = colorForState;
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        C0082b0 c0082b1 = this.f4818d;
        if (c0082b1.m808j()) {
            ColorStateList colorStateList2 = (ColorStateList) c0082b1.f1105d;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != c0082b1.f1103b) {
                c0082b1.f1103b = colorForState2;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        return z | z2;
    }

    public float getFillAlpha() {
        return this.f4822h;
    }

    public int getFillColor() {
        return this.f4820f.f1103b;
    }

    public float getStrokeAlpha() {
        return this.f4821g;
    }

    public int getStrokeColor() {
        return this.f4818d.f1103b;
    }

    public float getStrokeWidth() {
        return this.f4819e;
    }

    public float getTrimPathEnd() {
        return this.f4824j;
    }

    public float getTrimPathOffset() {
        return this.f4825k;
    }

    public float getTrimPathStart() {
        return this.f4823i;
    }

    public void setFillAlpha(float f) {
        this.f4822h = f;
    }

    public void setFillColor(int i) {
        this.f4820f.f1103b = i;
    }

    public void setStrokeAlpha(float f) {
        this.f4821g = f;
    }

    public void setStrokeColor(int i) {
        this.f4818d.f1103b = i;
    }

    public void setStrokeWidth(float f) {
        this.f4819e = f;
    }

    public void setTrimPathEnd(float f) {
        this.f4824j = f;
    }

    public void setTrimPathOffset(float f) {
        this.f4825k = f;
    }

    public void setTrimPathStart(float f) {
        this.f4823i = f;
    }
}

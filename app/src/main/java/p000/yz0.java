package p000;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class yz0 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public pr1 f13172a;

    /* JADX INFO: renamed from: b */
    public n50 f13173b;

    /* JADX INFO: renamed from: c */
    public ColorStateList f13174c;

    /* JADX INFO: renamed from: d */
    public ColorStateList f13175d;

    /* JADX INFO: renamed from: e */
    public ColorStateList f13176e;

    /* JADX INFO: renamed from: f */
    public PorterDuff.Mode f13177f;

    /* JADX INFO: renamed from: g */
    public Rect f13178g;

    /* JADX INFO: renamed from: h */
    public final float f13179h;

    /* JADX INFO: renamed from: i */
    public float f13180i;

    /* JADX INFO: renamed from: j */
    public float f13181j;

    /* JADX INFO: renamed from: k */
    public int f13182k;

    /* JADX INFO: renamed from: l */
    public float f13183l;

    /* JADX INFO: renamed from: m */
    public float f13184m;

    /* JADX INFO: renamed from: n */
    public int f13185n;

    /* JADX INFO: renamed from: o */
    public int f13186o;

    /* JADX INFO: renamed from: p */
    public final Paint.Style f13187p;

    public yz0(yz0 yz0Var) {
        this.f13174c = null;
        this.f13175d = null;
        this.f13176e = null;
        this.f13177f = PorterDuff.Mode.SRC_IN;
        this.f13178g = null;
        this.f13179h = 1.0f;
        this.f13180i = 1.0f;
        this.f13182k = 255;
        this.f13183l = TouchPipeline.SIZE;
        this.f13184m = TouchPipeline.SIZE;
        this.f13185n = 0;
        this.f13186o = 0;
        this.f13187p = Paint.Style.FILL_AND_STROKE;
        this.f13172a = yz0Var.f13172a;
        this.f13173b = yz0Var.f13173b;
        this.f13181j = yz0Var.f13181j;
        this.f13174c = yz0Var.f13174c;
        this.f13175d = yz0Var.f13175d;
        this.f13177f = yz0Var.f13177f;
        this.f13176e = yz0Var.f13176e;
        this.f13182k = yz0Var.f13182k;
        this.f13179h = yz0Var.f13179h;
        this.f13186o = yz0Var.f13186o;
        this.f13180i = yz0Var.f13180i;
        this.f13183l = yz0Var.f13183l;
        this.f13184m = yz0Var.f13184m;
        this.f13185n = yz0Var.f13185n;
        this.f13187p = yz0Var.f13187p;
        if (yz0Var.f13178g != null) {
            this.f13178g = new Rect(yz0Var.f13178g);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        zz0 zz0Var = new zz0(this);
        zz0Var.f13630e = true;
        return zz0Var;
    }

    public yz0(pr1 pr1Var) {
        this.f13174c = null;
        this.f13175d = null;
        this.f13176e = null;
        this.f13177f = PorterDuff.Mode.SRC_IN;
        this.f13178g = null;
        this.f13179h = 1.0f;
        this.f13180i = 1.0f;
        this.f13182k = 255;
        this.f13183l = TouchPipeline.SIZE;
        this.f13184m = TouchPipeline.SIZE;
        this.f13185n = 0;
        this.f13186o = 0;
        this.f13187p = Paint.Style.FILL_AND_STROKE;
        this.f13172a = pr1Var;
        this.f13173b = null;
    }
}

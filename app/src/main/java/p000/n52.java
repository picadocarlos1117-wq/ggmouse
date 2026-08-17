package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class n52 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public int f7244a;

    /* JADX INFO: renamed from: b */
    public m52 f7245b;

    /* JADX INFO: renamed from: c */
    public ColorStateList f7246c;

    /* JADX INFO: renamed from: d */
    public PorterDuff.Mode f7247d;

    /* JADX INFO: renamed from: e */
    public boolean f7248e;

    /* JADX INFO: renamed from: f */
    public Bitmap f7249f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f7250g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f7251h;

    /* JADX INFO: renamed from: i */
    public int f7252i;

    /* JADX INFO: renamed from: j */
    public boolean f7253j;

    /* JADX INFO: renamed from: k */
    public boolean f7254k;

    /* JADX INFO: renamed from: l */
    public Paint f7255l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f7244a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new p52(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new p52(this);
    }
}

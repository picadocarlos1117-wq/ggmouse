package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.sousasantoslogic.sspro.R;

/* JADX INFO: renamed from: h8 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0705h8 extends SeekBar {

    /* JADX INFO: renamed from: a */
    public final C0742i8 f4467a;

    public C0705h8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        h02.m3085a(this, getContext());
        C0742i8 c0742i8 = new C0742i8(this);
        this.f4467a = c0742i8;
        c0742i8.mo2257F(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0742i8 c0742i8 = this.f4467a;
        C0705h8 c0705h8 = c0742i8.f4855f;
        Drawable drawable = c0742i8.f4856g;
        if (drawable != null && drawable.isStateful() && drawable.setState(c0705h8.getDrawableState())) {
            c0705h8.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4467a.f4856g;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f4467a.m3381O(canvas);
    }
}

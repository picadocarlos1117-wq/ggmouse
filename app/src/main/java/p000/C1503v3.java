package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.sousasantoslogic.sspro.R;

/* JADX INFO: renamed from: v3 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1503v3 extends C0009a8 implements InterfaceC1577x3 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1540w3 f11499d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1503v3(C1540w3 c1540w3, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f11499d = c1540w3;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        r12.m5658a(this, getContentDescription());
        setOnTouchListener(new C1318q3(this, this));
    }

    @Override // p000.InterfaceC1577x3
    /* JADX INFO: renamed from: a */
    public final boolean mo203a() {
        return false;
    }

    @Override // p000.InterfaceC1577x3
    /* JADX INFO: renamed from: b */
    public final boolean mo204b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f11499d.m6697l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            v30.m6558f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}

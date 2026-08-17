package p000;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* JADX INFO: renamed from: p7 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1285p7 extends ContentFrameLayout {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ LayoutInflaterFactory2C1359r7 f8743n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1285p7(LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7, C0543cu c0543cu) {
        super(c0543cu, null);
        this.f8743n = layoutInflaterFactory2C1359r7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f8743n.m5734u(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7 = this.f8743n;
                layoutInflaterFactory2C1359r7.m5733s(layoutInflaterFactory2C1359r7.m5739z(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(hr1.m3282r(getContext(), i));
    }
}

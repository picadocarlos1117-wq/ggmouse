package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC0066e;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class fb1 extends q50 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3745d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fb1(AbstractC0066e abstractC0066e, int i) {
        super(abstractC0066e);
        this.f3745d = i;
    }

    @Override // p000.q50
    /* JADX INFO: renamed from: b */
    public final int mo2785b(View view) {
        int right;
        int i;
        int i2 = this.f3745d;
        Object obj = this.f9391b;
        switch (i2) {
            case 0:
                mj1 mj1Var = (mj1) view.getLayoutParams();
                ((AbstractC0066e) obj).getClass();
                right = view.getRight() + ((mj1) view.getLayoutParams()).f7011b.right;
                i = ((ViewGroup.MarginLayoutParams) mj1Var).rightMargin;
                break;
            default:
                mj1 mj1Var2 = (mj1) view.getLayoutParams();
                ((AbstractC0066e) obj).getClass();
                right = view.getBottom() + ((mj1) view.getLayoutParams()).f7011b.bottom;
                i = ((ViewGroup.MarginLayoutParams) mj1Var2).bottomMargin;
                break;
        }
        return right + i;
    }

    @Override // p000.q50
    /* JADX INFO: renamed from: c */
    public final int mo2786c(View view) {
        int measuredWidth;
        int i;
        int i2 = this.f3745d;
        Object obj = this.f9391b;
        switch (i2) {
            case 0:
                mj1 mj1Var = (mj1) view.getLayoutParams();
                ((AbstractC0066e) obj).getClass();
                Rect rect = ((mj1) view.getLayoutParams()).f7011b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) mj1Var).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) mj1Var).rightMargin;
                break;
            default:
                mj1 mj1Var2 = (mj1) view.getLayoutParams();
                ((AbstractC0066e) obj).getClass();
                Rect rect2 = ((mj1) view.getLayoutParams()).f7011b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) mj1Var2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) mj1Var2).bottomMargin;
                break;
        }
        return measuredWidth + i;
    }

    @Override // p000.q50
    /* JADX INFO: renamed from: d */
    public final int mo2787d(View view) {
        int measuredHeight;
        int i;
        int i2 = this.f3745d;
        Object obj = this.f9391b;
        switch (i2) {
            case 0:
                mj1 mj1Var = (mj1) view.getLayoutParams();
                ((AbstractC0066e) obj).getClass();
                Rect rect = ((mj1) view.getLayoutParams()).f7011b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) mj1Var).topMargin;
                i = ((ViewGroup.MarginLayoutParams) mj1Var).bottomMargin;
                break;
            default:
                mj1 mj1Var2 = (mj1) view.getLayoutParams();
                ((AbstractC0066e) obj).getClass();
                Rect rect2 = ((mj1) view.getLayoutParams()).f7011b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) mj1Var2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) mj1Var2).rightMargin;
                break;
        }
        return measuredHeight + i;
    }

    @Override // p000.q50
    /* JADX INFO: renamed from: e */
    public final int mo2788e(View view) {
        int left;
        int i;
        int i2 = this.f3745d;
        Object obj = this.f9391b;
        switch (i2) {
            case 0:
                mj1 mj1Var = (mj1) view.getLayoutParams();
                ((AbstractC0066e) obj).getClass();
                left = view.getLeft() - ((mj1) view.getLayoutParams()).f7011b.left;
                i = ((ViewGroup.MarginLayoutParams) mj1Var).leftMargin;
                break;
            default:
                mj1 mj1Var2 = (mj1) view.getLayoutParams();
                ((AbstractC0066e) obj).getClass();
                left = view.getTop() - ((mj1) view.getLayoutParams()).f7011b.top;
                i = ((ViewGroup.MarginLayoutParams) mj1Var2).topMargin;
                break;
        }
        return left - i;
    }

    @Override // p000.q50
    /* JADX INFO: renamed from: f */
    public final int mo2789f() {
        switch (this.f3745d) {
            case 0:
                return ((AbstractC0066e) this.f9391b).f995n;
            default:
                return ((AbstractC0066e) this.f9391b).f996o;
        }
    }

    @Override // p000.q50
    /* JADX INFO: renamed from: g */
    public final int mo2790g() {
        int i;
        int iM660D;
        int i2 = this.f3745d;
        Object obj = this.f9391b;
        switch (i2) {
            case 0:
                AbstractC0066e abstractC0066e = (AbstractC0066e) obj;
                i = abstractC0066e.f995n;
                iM660D = abstractC0066e.m660D();
                break;
            default:
                AbstractC0066e abstractC0066e2 = (AbstractC0066e) obj;
                i = abstractC0066e2.f996o;
                iM660D = abstractC0066e2.m658B();
                break;
        }
        return i - iM660D;
    }

    @Override // p000.q50
    /* JADX INFO: renamed from: h */
    public final int mo2791h() {
        switch (this.f3745d) {
            case 0:
                return ((AbstractC0066e) this.f9391b).m660D();
            default:
                return ((AbstractC0066e) this.f9391b).m658B();
        }
    }

    @Override // p000.q50
    /* JADX INFO: renamed from: i */
    public final int mo2792i() {
        switch (this.f3745d) {
            case 0:
                return ((AbstractC0066e) this.f9391b).f993l;
            default:
                return ((AbstractC0066e) this.f9391b).f994m;
        }
    }

    @Override // p000.q50
    /* JADX INFO: renamed from: j */
    public final int mo2793j() {
        switch (this.f3745d) {
            case 0:
                return ((AbstractC0066e) this.f9391b).f994m;
            default:
                return ((AbstractC0066e) this.f9391b).f993l;
        }
    }

    @Override // p000.q50
    /* JADX INFO: renamed from: k */
    public final int mo2794k() {
        switch (this.f3745d) {
            case 0:
                return ((AbstractC0066e) this.f9391b).m659C();
            default:
                return ((AbstractC0066e) this.f9391b).m661E();
        }
    }

    @Override // p000.q50
    /* JADX INFO: renamed from: l */
    public final int mo2795l() {
        int iM659C;
        int iM660D;
        int i = this.f3745d;
        Object obj = this.f9391b;
        switch (i) {
            case 0:
                AbstractC0066e abstractC0066e = (AbstractC0066e) obj;
                iM659C = abstractC0066e.f995n - abstractC0066e.m659C();
                iM660D = abstractC0066e.m660D();
                break;
            default:
                AbstractC0066e abstractC0066e2 = (AbstractC0066e) obj;
                iM659C = abstractC0066e2.f996o - abstractC0066e2.m661E();
                iM660D = abstractC0066e2.m658B();
                break;
        }
        return iM659C - iM660D;
    }

    @Override // p000.q50
    /* JADX INFO: renamed from: m */
    public final int mo2796m(View view) {
        int i = this.f3745d;
        Object obj = this.f9392c;
        Object obj2 = this.f9391b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((AbstractC0066e) obj2).m662I(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) obj;
                ((AbstractC0066e) obj2).m662I(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // p000.q50
    /* JADX INFO: renamed from: n */
    public final int mo2797n(View view) {
        int i = this.f3745d;
        Object obj = this.f9392c;
        Object obj2 = this.f9391b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((AbstractC0066e) obj2).m662I(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) obj;
                ((AbstractC0066e) obj2).m662I(view, rect2);
                return rect2.top;
        }
    }

    @Override // p000.q50
    /* JADX INFO: renamed from: o */
    public final void mo2798o(int i) {
        switch (this.f3745d) {
            case 0:
                ((AbstractC0066e) this.f9391b).mo619M(i);
                break;
            default:
                ((AbstractC0066e) this.f9391b).mo621N(i);
                break;
        }
    }
}

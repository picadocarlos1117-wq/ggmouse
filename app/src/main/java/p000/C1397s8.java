package p000;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.sousasantoslogic.sspro.R;

/* JADX INFO: renamed from: s8 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1397s8 extends ot0 implements InterfaceC1471u8 {

    /* JADX INFO: renamed from: H */
    public CharSequence f10278H;

    /* JADX INFO: renamed from: I */
    public C1286p8 f10279I;

    /* JADX INFO: renamed from: J */
    public final Rect f10280J;

    /* JADX INFO: renamed from: K */
    public int f10281K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ C1508v8 f10282L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1397s8(C1508v8 c1508v8, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.f10282L = c1508v8;
        this.f10280J = new Rect();
        this.f8485t = c1508v8;
        this.f8469D = true;
        this.f8470E.setFocusable(true);
        this.f8486u = new C1323q8(this, 0);
    }

    @Override // p000.InterfaceC1471u8
    /* JADX INFO: renamed from: f */
    public final CharSequence mo4722f() {
        return this.f10278H;
    }

    @Override // p000.InterfaceC1471u8
    /* JADX INFO: renamed from: i */
    public final void mo4724i(CharSequence charSequence) {
        this.f10278H = charSequence;
    }

    @Override // p000.InterfaceC1471u8
    /* JADX INFO: renamed from: n */
    public final void mo4727n(int i) {
        this.f10281K = i;
    }

    @Override // p000.InterfaceC1471u8
    /* JADX INFO: renamed from: o */
    public final void mo4728o(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C0126c8 c0126c8 = this.f8470E;
        boolean zIsShowing = c0126c8.isShowing();
        m6003s();
        c0126c8.setInputMethodMode(2);
        mo3059g();
        m40 m40Var = this.f8473c;
        m40Var.setChoiceMode(1);
        AbstractC1099m8.m4409d(m40Var, i);
        AbstractC1099m8.m4408c(m40Var, i2);
        C1508v8 c1508v8 = this.f10282L;
        int selectedItemPosition = c1508v8.getSelectedItemPosition();
        m40 m40Var2 = this.f8473c;
        if (c0126c8.isShowing() && m40Var2 != null) {
            m40Var2.setListSelectionHidden(false);
            m40Var2.setSelection(selectedItemPosition);
            if (m40Var2.getChoiceMode() != 0) {
                m40Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = c1508v8.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0819k8 viewTreeObserverOnGlobalLayoutListenerC0819k8 = new ViewTreeObserverOnGlobalLayoutListenerC0819k8(this, 1);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0819k8);
        c0126c8.setOnDismissListener(new C1360r8(this, viewTreeObserverOnGlobalLayoutListenerC0819k8));
    }

    @Override // p000.ot0, p000.InterfaceC1471u8
    /* JADX INFO: renamed from: q */
    public final void mo4730q(ListAdapter listAdapter) {
        super.mo4730q(listAdapter);
        this.f10279I = (C1286p8) listAdapter;
    }

    /* JADX INFO: renamed from: s */
    public final void m6003s() {
        int i;
        C0126c8 c0126c8 = this.f8470E;
        Drawable background = c0126c8.getBackground();
        C1508v8 c1508v8 = this.f10282L;
        Rect rect = c1508v8.f11584m;
        if (background != null) {
            background.getPadding(rect);
            i = h82.m3112a(c1508v8) ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = c1508v8.getPaddingLeft();
        int paddingRight = c1508v8.getPaddingRight();
        int width = c1508v8.getWidth();
        int i2 = c1508v8.f11583g;
        if (i2 == -2) {
            int iM6598a = c1508v8.m6598a(this.f10279I, c0126c8.getBackground());
            int i3 = (c1508v8.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iM6598a > i3) {
                iM6598a = i3;
            }
            m5063r(Math.max(iM6598a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            m5063r((width - paddingLeft) - paddingRight);
        } else {
            m5063r(i2);
        }
        this.f8476f = h82.m3112a(c1508v8) ? (((width - paddingRight) - this.f8475e) - this.f10281K) + i : paddingLeft + this.f10281K + i;
    }
}

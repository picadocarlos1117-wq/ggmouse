package p000;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class j12 implements g41 {

    /* JADX INFO: renamed from: a */
    public i31 f5237a;

    /* JADX INFO: renamed from: b */
    public r31 f5238b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Toolbar f5239c;

    public j12(Toolbar toolbar) {
        this.f5239c = toolbar;
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: c */
    public final boolean mo2929c(nx1 nx1Var) {
        return false;
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: d */
    public final boolean mo2930d() {
        return false;
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: e */
    public final boolean mo2931e(r31 r31Var) {
        Toolbar toolbar = this.f5239c;
        KeyEvent.Callback callback = toolbar.f529n;
        if (callback instanceof InterfaceC1232op) {
            ((InterfaceC1232op) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f529n);
        toolbar.removeView(toolbar.f528m);
        toolbar.f529n = null;
        ArrayList arrayList = toolbar.f505J;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f5238b = null;
        toolbar.requestLayout();
        r31Var.f9670C = false;
        r31Var.f9684n.m3353p(false);
        toolbar.m275w();
        return true;
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: h */
    public final boolean mo2933h(r31 r31Var) {
        Toolbar toolbar = this.f5239c;
        toolbar.m259c();
        ViewParent parent = toolbar.f528m.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f528m);
            }
            toolbar.addView(toolbar.f528m);
        }
        View actionView = r31Var.getActionView();
        toolbar.f529n = actionView;
        this.f5238b = r31Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f529n);
            }
            k12 k12VarM253h = Toolbar.m253h();
            k12VarM253h.f5631a = (toolbar.f534s & 112) | 8388611;
            k12VarM253h.f5632b = 2;
            toolbar.f529n.setLayoutParams(k12VarM253h);
            toolbar.addView(toolbar.f529n);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((k12) childAt.getLayoutParams()).f5632b != 2 && childAt != toolbar.f519a) {
                toolbar.removeViewAt(childCount);
                toolbar.f505J.add(childAt);
            }
        }
        toolbar.requestLayout();
        r31Var.f9670C = true;
        r31Var.f9684n.m3353p(false);
        KeyEvent.Callback callback = toolbar.f529n;
        if (callback instanceof InterfaceC1232op) {
            ((InterfaceC1232op) callback).onActionViewExpanded();
        }
        toolbar.m275w();
        return true;
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: i */
    public final void mo2934i() {
        if (this.f5238b != null) {
            i31 i31Var = this.f5237a;
            if (i31Var != null) {
                int size = i31Var.f4792f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f5237a.getItem(i) == this.f5238b) {
                        return;
                    }
                }
            }
            mo2931e(this.f5238b);
        }
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: k */
    public final void mo2935k(Context context, i31 i31Var) {
        r31 r31Var;
        i31 i31Var2 = this.f5237a;
        if (i31Var2 != null && (r31Var = this.f5238b) != null) {
            i31Var2.mo3341d(r31Var);
        }
        this.f5237a = i31Var;
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: a */
    public final void mo2928a(i31 i31Var, boolean z) {
    }
}

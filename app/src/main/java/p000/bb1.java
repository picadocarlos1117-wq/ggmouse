package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class bb1 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final View f1281a;

    /* JADX INFO: renamed from: b */
    public ViewTreeObserver f1282b;

    /* JADX INFO: renamed from: c */
    public final Runnable f1283c;

    public bb1(View view, Runnable runnable) {
        this.f1281a = view;
        this.f1282b = view.getViewTreeObserver();
        this.f1283c = runnable;
    }

    /* JADX INFO: renamed from: a */
    public static void m958a(View view, Runnable runnable) {
        if (view == null) {
            l41.m4051t("view == null");
            return;
        }
        bb1 bb1Var = new bb1(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(bb1Var);
        view.addOnAttachStateChangeListener(bb1Var);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f1282b.isAlive();
        View view = this.f1281a;
        if (zIsAlive) {
            this.f1282b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f1283c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f1282b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f1282b.isAlive();
        View view2 = this.f1281a;
        if (zIsAlive) {
            this.f1282b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}

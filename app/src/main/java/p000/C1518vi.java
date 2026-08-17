package p000;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: vi */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1518vi extends AbstractC1333qi {

    /* JADX INFO: renamed from: a */
    public final Boolean f11670a;

    /* JADX INFO: renamed from: b */
    public final bb2 f11671b;

    /* JADX INFO: renamed from: c */
    public Window f11672c;

    /* JADX INFO: renamed from: d */
    public boolean f11673d;

    public C1518vi(FrameLayout frameLayout, bb2 bb2Var) {
        ColorStateList colorStateListM7006g;
        this.f11671b = bb2Var;
        zz0 zz0Var = BottomSheetBehavior.m1648A(frameLayout).f1994i;
        if (zz0Var != null) {
            colorStateListM7006g = zz0Var.f13626a.f13174c;
        } else {
            WeakHashMap weakHashMap = i72.f4849a;
            colorStateListM7006g = y62.m7006g(frameLayout);
        }
        if (colorStateListM7006g != null) {
            this.f11670a = Boolean.valueOf(hp0.m3193B(colorStateListM7006g.getDefaultColor()));
        } else if (frameLayout.getBackground() instanceof ColorDrawable) {
            this.f11670a = Boolean.valueOf(hp0.m3193B(((ColorDrawable) frameLayout.getBackground()).getColor()));
        } else {
            this.f11670a = null;
        }
    }

    @Override // p000.AbstractC1333qi
    /* JADX INFO: renamed from: a */
    public final void mo5493a(View view) {
        m6627d(view);
    }

    @Override // p000.AbstractC1333qi
    /* JADX INFO: renamed from: b */
    public final void mo5494b(View view) {
        m6627d(view);
    }

    @Override // p000.AbstractC1333qi
    /* JADX INFO: renamed from: c */
    public final void mo5495c(View view, int i) {
        m6627d(view);
    }

    /* JADX INFO: renamed from: d */
    public final void m6627d(View view) {
        cb2 cb2Var;
        cb2 cb2Var2;
        int top = view.getTop();
        bb2 bb2Var = this.f11671b;
        if (top < bb2Var.m964d()) {
            Window window = this.f11672c;
            if (window != null) {
                Boolean bool = this.f11670a;
                boolean zBooleanValue = bool == null ? this.f11673d : bool.booleanValue();
                View decorView = window.getDecorView();
                if (Build.VERSION.SDK_INT >= 30) {
                    cb2Var2 = new cb2(window.getInsetsController());
                    cb2Var2.f1743r = window;
                } else {
                    cb2Var2 = new cb2(window, decorView);
                }
                cb2Var2.mo1205X(zBooleanValue);
            }
            view.setPadding(view.getPaddingLeft(), bb2Var.m964d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.f11672c;
            if (window2 != null) {
                boolean z = this.f11673d;
                View decorView2 = window2.getDecorView();
                if (Build.VERSION.SDK_INT >= 30) {
                    cb2Var = new cb2(window2.getInsetsController());
                    cb2Var.f1743r = window2;
                } else {
                    cb2Var = new cb2(window2, decorView2);
                }
                cb2Var.mo1205X(z);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m6628e(Window window) {
        cb2 cb2Var;
        if (this.f11672c == window) {
            return;
        }
        this.f11672c = window;
        if (window != null) {
            View decorView = window.getDecorView();
            if (Build.VERSION.SDK_INT >= 30) {
                cb2Var = new cb2(window.getInsetsController());
                cb2Var.f1743r = window;
            } else {
                cb2Var = new cb2(window, decorView);
            }
            this.f11673d = cb2Var.mo1203G();
        }
    }
}

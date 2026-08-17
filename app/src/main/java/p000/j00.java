package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0056t;
import androidx.fragment.app.C0040d;
import androidx.fragment.app.C0061y;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class j00 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup f5227a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f5228b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f5229c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0061y f5230d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0040d f5231e;

    public j00(ViewGroup viewGroup, View view, boolean z, C0061y c0061y, C0040d c0040d) {
        this.f5227a = viewGroup;
        this.f5228b = view;
        this.f5229c = z;
        this.f5230d = c0061y;
        this.f5231e = c0040d;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f5227a;
        View view = this.f5228b;
        viewGroup.endViewTransition(view);
        boolean z = this.f5229c;
        C0061y c0061y = this.f5230d;
        if (z) {
            jd0.m3603a(view, c0061y.f767a);
        }
        this.f5231e.m336a();
        if (AbstractC0056t.m363G(2)) {
            Objects.toString(c0061y);
        }
    }
}

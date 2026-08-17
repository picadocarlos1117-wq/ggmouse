package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.AbstractC0056t;
import androidx.fragment.app.C0040d;
import androidx.fragment.app.C0061y;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class k00 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0061y f5624a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f5625b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f5626c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0040d f5627d;

    public k00(C0061y c0061y, ViewGroup viewGroup, View view, C0040d c0040d) {
        this.f5624a = c0061y;
        this.f5625b = viewGroup;
        this.f5626c = view;
        this.f5627d = c0040d;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f5625b.post(new RunnableC1621ya(this, 4));
        if (AbstractC0056t.m363G(2)) {
            Objects.toString(this.f5624a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (AbstractC0056t.m363G(2)) {
            Objects.toString(this.f5624a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}

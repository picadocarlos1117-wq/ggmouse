package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ue0 extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f11273a;

    /* JADX INFO: renamed from: b */
    public final View f11274b;

    /* JADX INFO: renamed from: c */
    public boolean f11275c;

    /* JADX INFO: renamed from: d */
    public boolean f11276d;

    /* JADX INFO: renamed from: e */
    public boolean f11277e;

    public ue0(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f11277e = true;
        this.f11273a = viewGroup;
        this.f11274b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f11277e = true;
        if (this.f11275c) {
            return !this.f11276d;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f11275c = true;
            bb1.m958a(this.f11273a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f11275c;
        ViewGroup viewGroup = this.f11273a;
        if (z || !this.f11277e) {
            viewGroup.endViewTransition(this.f11274b);
            this.f11276d = true;
        } else {
            this.f11277e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.f11277e = true;
        if (this.f11275c) {
            return !this.f11276d;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.f11275c = true;
            bb1.m958a(this.f11273a, this);
        }
        return true;
    }
}

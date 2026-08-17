package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class o82 extends AnimatorListenerAdapter implements s22 {

    /* JADX INFO: renamed from: a */
    public final View f7687a;

    /* JADX INFO: renamed from: b */
    public final int f7688b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f7689c;

    /* JADX INFO: renamed from: e */
    public boolean f7691e;

    /* JADX INFO: renamed from: f */
    public boolean f7692f = false;

    /* JADX INFO: renamed from: d */
    public final boolean f7690d = true;

    public o82(View view, int i) {
        this.f7687a = view;
        this.f7688b = i;
        this.f7689c = (ViewGroup) view.getParent();
        m4731f(true);
    }

    @Override // p000.s22
    /* JADX INFO: renamed from: a */
    public final void mo4507a() {
        m4731f(false);
    }

    @Override // p000.s22
    /* JADX INFO: renamed from: b */
    public final void mo149b(t22 t22Var) {
        if (!this.f7692f) {
            g82.f4100a.mo3390q0(this.f7687a, this.f7688b);
            ViewGroup viewGroup = this.f7689c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m4731f(false);
        t22Var.m6218w(this);
    }

    @Override // p000.s22
    /* JADX INFO: renamed from: e */
    public final void mo4508e() {
        m4731f(true);
    }

    /* JADX INFO: renamed from: f */
    public final void m4731f(boolean z) {
        ViewGroup viewGroup;
        if (!this.f7690d || this.f7691e == z || (viewGroup = this.f7689c) == null) {
            return;
        }
        this.f7691e = z;
        hp0.m3205O(viewGroup, z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f7692f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f7692f) {
            g82.f4100a.mo3390q0(this.f7687a, this.f7688b);
            ViewGroup viewGroup = this.f7689c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m4731f(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (this.f7692f) {
            return;
        }
        g82.f4100a.mo3390q0(this.f7687a, this.f7688b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (this.f7692f) {
            return;
        }
        g82.f4100a.mo3390q0(this.f7687a, 0);
    }

    @Override // p000.s22
    /* JADX INFO: renamed from: c */
    public final void mo4560c() {
    }

    @Override // p000.s22
    /* JADX INFO: renamed from: d */
    public final void mo150d() {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}

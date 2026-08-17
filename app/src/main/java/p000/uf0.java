package p000;

import android.transition.Transition;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class uf0 implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RunnableC1466u3 f11282a;

    public uf0(RunnableC1466u3 runnableC1466u3) {
        this.f11282a = runnableC1466u3;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) throws Throwable {
        this.f11282a.run();
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }
}

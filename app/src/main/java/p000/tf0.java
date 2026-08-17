package p000;

import android.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class tf0 implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f10857a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f10858b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f10859c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ArrayList f10860d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ vf0 f10861e;

    public tf0(vf0 vf0Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f10861e = vf0Var;
        this.f10857a = obj;
        this.f10858b = arrayList;
        this.f10859c = obj2;
        this.f10860d = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        vf0 vf0Var = this.f10861e;
        Object obj = this.f10857a;
        if (obj != null) {
            vf0Var.m6624t(obj, this.f10858b, null);
        }
        Object obj2 = this.f10859c;
        if (obj2 != null) {
            vf0Var.m6624t(obj2, this.f10860d, null);
        }
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
}

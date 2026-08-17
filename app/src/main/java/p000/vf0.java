package p000;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class vf0 extends xf0 {
    /* JADX INFO: renamed from: s */
    public static boolean m6622s(Transition transition) {
        return (xf0.m6922h(transition.getTargetIds()) && xf0.m6922h(transition.getTargetNames()) && xf0.m6922h(transition.getTargetTypes())) ? false : true;
    }

    @Override // p000.xf0
    /* JADX INFO: renamed from: a */
    public final void mo974a(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    @Override // p000.xf0
    /* JADX INFO: renamed from: b */
    public final void mo975b(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo975b(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (m6622s(transition) || !xf0.m6922h(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget((View) arrayList.get(i));
            i++;
        }
    }

    @Override // p000.xf0
    /* JADX INFO: renamed from: c */
    public final void mo976c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // p000.xf0
    /* JADX INFO: renamed from: e */
    public final boolean mo977e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // p000.xf0
    /* JADX INFO: renamed from: f */
    public final Object mo978f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // p000.xf0
    /* JADX INFO: renamed from: i */
    public final Object mo979i(Object obj, Object obj2, Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // p000.xf0
    /* JADX INFO: renamed from: j */
    public final Object mo980j(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // p000.xf0
    /* JADX INFO: renamed from: k */
    public final void mo981k(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new sf0(arrayList, view));
    }

    @Override // p000.xf0
    /* JADX INFO: renamed from: l */
    public final void mo982l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new tf0(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // p000.xf0
    /* JADX INFO: renamed from: m */
    public final void mo983m(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            xf0.m6921g(view, rect);
            ((Transition) obj).setEpicenterCallback(new rf0(0, rect));
        }
    }

    @Override // p000.xf0
    /* JADX INFO: renamed from: n */
    public final void mo984n(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new rf0(1, rect));
    }

    @Override // p000.xf0
    /* JADX INFO: renamed from: o */
    public final void mo6623o(Object obj, RunnableC1466u3 runnableC1466u3) {
        ((Transition) obj).addListener(new uf0(runnableC1466u3));
    }

    @Override // p000.xf0
    /* JADX INFO: renamed from: p */
    public final void mo985p(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            xf0.m6920d((View) arrayList.get(i), targets);
        }
        targets.add(view);
        arrayList.add(view);
        mo975b(transitionSet, arrayList);
    }

    @Override // p000.xf0
    /* JADX INFO: renamed from: q */
    public final void mo986q(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            m6624t(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // p000.xf0
    /* JADX INFO: renamed from: r */
    public final Object mo987r(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* JADX INFO: renamed from: t */
    public final void m6624t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                m6624t(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m6622s(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget((View) arrayList2.get(i));
            i++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget((View) arrayList.get(size2));
        }
    }
}

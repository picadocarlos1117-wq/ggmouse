package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.example.ssmousepro.injection.TouchPipeline;
import com.sousasantoslogic.sspro.R;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import p000.AbstractC1308pu;
import p000.C0558d8;
import p000.ViewOnAttachStateChangeListenerC1410sl;
import p000.cf0;
import p000.es0;
import p000.f40;
import p000.i72;
import p000.jd0;
import p000.lf0;
import p000.mf0;
import p000.nf0;
import p000.v62;
import p000.w62;
import p000.w72;
import p000.xe0;

/* JADX INFO: renamed from: androidx.fragment.app.w */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0059w {

    /* JADX INFO: renamed from: a */
    public final C0558d8 f758a;

    /* JADX INFO: renamed from: b */
    public final C0060x f759b;

    /* JADX INFO: renamed from: c */
    public final AbstractComponentCallbacksC0048l f760c;

    /* JADX INFO: renamed from: d */
    public boolean f761d = false;

    /* JADX INFO: renamed from: e */
    public int f762e = -1;

    public C0059w(C0558d8 c0558d8, C0060x c0060x, ClassLoader classLoader, cf0 cf0Var, C0058v c0058v) {
        this.f758a = c0558d8;
        this.f759b = c0060x;
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048lInstantiate = AbstractComponentCallbacksC0048l.instantiate(cf0Var.f1781a.f731t.f12589b, c0058v.f745a, null);
        Bundle bundle = c0058v.f754o;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        abstractComponentCallbacksC0048lInstantiate.setArguments(bundle);
        abstractComponentCallbacksC0048lInstantiate.mWho = c0058v.f746b;
        abstractComponentCallbacksC0048lInstantiate.mFromLayout = c0058v.f747c;
        abstractComponentCallbacksC0048lInstantiate.mRestored = true;
        abstractComponentCallbacksC0048lInstantiate.mFragmentId = c0058v.f748d;
        abstractComponentCallbacksC0048lInstantiate.mContainerId = c0058v.f749e;
        abstractComponentCallbacksC0048lInstantiate.mTag = c0058v.f750f;
        abstractComponentCallbacksC0048lInstantiate.mRetainInstance = c0058v.f751g;
        abstractComponentCallbacksC0048lInstantiate.mRemoving = c0058v.f752m;
        abstractComponentCallbacksC0048lInstantiate.mDetached = c0058v.f753n;
        abstractComponentCallbacksC0048lInstantiate.mHidden = c0058v.f755p;
        abstractComponentCallbacksC0048lInstantiate.mMaxState = es0.values()[c0058v.f756q];
        Bundle bundle2 = c0058v.f757r;
        if (bundle2 != null) {
            abstractComponentCallbacksC0048lInstantiate.mSavedFragmentState = bundle2;
        } else {
            abstractComponentCallbacksC0048lInstantiate.mSavedFragmentState = new Bundle();
        }
        this.f760c = abstractComponentCallbacksC0048lInstantiate;
        if (AbstractC0056t.m363G(2)) {
            Objects.toString(abstractComponentCallbacksC0048lInstantiate);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m419a() {
        View view;
        View view2;
        ArrayList arrayList = this.f759b.f763a;
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = this.f760c;
        ViewGroup viewGroup = abstractComponentCallbacksC0048l.mContainer;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(abstractComponentCallbacksC0048l);
            for (int i = iIndexOf - 1; i >= 0; i--) {
                AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l2 = (AbstractComponentCallbacksC0048l) arrayList.get(i);
                if (abstractComponentCallbacksC0048l2.mContainer == viewGroup && (view2 = abstractComponentCallbacksC0048l2.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l3 = (AbstractComponentCallbacksC0048l) arrayList.get(iIndexOf);
                if (abstractComponentCallbacksC0048l3.mContainer == viewGroup && (view = abstractComponentCallbacksC0048l3.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        abstractComponentCallbacksC0048l.mContainer.addView(abstractComponentCallbacksC0048l.mView, iIndexOfChild);
    }

    /* JADX INFO: renamed from: b */
    public final void m420b() {
        boolean zM363G = AbstractC0056t.m363G(3);
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = this.f760c;
        if (zM363G) {
            Objects.toString(abstractComponentCallbacksC0048l);
        }
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l2 = abstractComponentCallbacksC0048l.mTarget;
        C0059w c0059w = null;
        C0060x c0060x = this.f759b;
        if (abstractComponentCallbacksC0048l2 != null) {
            C0059w c0059w2 = (C0059w) c0060x.f764b.get(abstractComponentCallbacksC0048l2.mWho);
            if (c0059w2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(abstractComponentCallbacksC0048l);
                AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l3 = abstractComponentCallbacksC0048l.mTarget;
                sb.append(" declared target fragment ");
                sb.append(abstractComponentCallbacksC0048l3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            abstractComponentCallbacksC0048l.mTargetWho = abstractComponentCallbacksC0048l.mTarget.mWho;
            abstractComponentCallbacksC0048l.mTarget = null;
            c0059w = c0059w2;
        } else {
            String str = abstractComponentCallbacksC0048l.mTargetWho;
            if (str != null && (c0059w = (C0059w) c0060x.f764b.get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(abstractComponentCallbacksC0048l);
                sb2.append(" declared target fragment ");
                f40.m2719o(AbstractC1308pu.m5342i(sb2, abstractComponentCallbacksC0048l.mTargetWho, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (c0059w != null) {
            c0059w.m427i();
        }
        AbstractC0056t abstractC0056t = abstractComponentCallbacksC0048l.mFragmentManager;
        abstractComponentCallbacksC0048l.mHost = abstractC0056t.f731t;
        abstractComponentCallbacksC0048l.mParentFragment = abstractC0056t.f733v;
        C0558d8 c0558d8 = this.f758a;
        c0558d8.m2276r(false);
        abstractComponentCallbacksC0048l.performAttach();
        c0558d8.m2271m(false);
    }

    /* JADX INFO: renamed from: c */
    public final int m421c() {
        C0061y c0061y;
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = this.f760c;
        if (abstractComponentCallbacksC0048l.mFragmentManager == null) {
            return abstractComponentCallbacksC0048l.mState;
        }
        int iMin = this.f762e;
        int iOrdinal = abstractComponentCallbacksC0048l.mMaxState.ordinal();
        int i = 0;
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0048l.mFromLayout) {
            boolean z = abstractComponentCallbacksC0048l.mInLayout;
            int i2 = this.f762e;
            if (z) {
                iMin = Math.max(i2, 2);
                View view = abstractComponentCallbacksC0048l.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = i2 < 4 ? Math.min(iMin, abstractComponentCallbacksC0048l.mState) : Math.min(iMin, 1);
            }
        }
        if (!abstractComponentCallbacksC0048l.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0048l.mContainer;
        if (viewGroup != null) {
            C0042f c0042fM341i = C0042f.m341i(viewGroup, abstractComponentCallbacksC0048l.getParentFragmentManager());
            C0061y c0061yM346f = c0042fM341i.m346f(abstractComponentCallbacksC0048l);
            int i3 = c0061yM346f != null ? c0061yM346f.f768b : 0;
            ArrayList arrayList = c0042fM341i.f684c;
            int size = arrayList.size();
            while (true) {
                if (i >= size) {
                    c0061y = null;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                c0061y = (C0061y) obj;
                if (c0061y.f769c.equals(abstractComponentCallbacksC0048l) && !c0061y.f772f) {
                    break;
                }
            }
            i = (c0061y == null || !(i3 == 0 || i3 == 1)) ? i3 : c0061y.f768b;
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (abstractComponentCallbacksC0048l.mRemoving) {
            iMin = abstractComponentCallbacksC0048l.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0048l.mDeferStart && abstractComponentCallbacksC0048l.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (AbstractC0056t.m363G(2)) {
            Objects.toString(abstractComponentCallbacksC0048l);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: d */
    public final void m422d() {
        String resourceName;
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = this.f760c;
        if (abstractComponentCallbacksC0048l.mFromLayout) {
            return;
        }
        if (AbstractC0056t.m363G(3)) {
            Objects.toString(abstractComponentCallbacksC0048l);
        }
        LayoutInflater layoutInflaterPerformGetLayoutInflater = abstractComponentCallbacksC0048l.performGetLayoutInflater(abstractComponentCallbacksC0048l.mSavedFragmentState);
        ViewGroup viewGroup = abstractComponentCallbacksC0048l.mContainer;
        if (viewGroup == null) {
            int i = abstractComponentCallbacksC0048l.mContainerId;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    f40.m2713i(jd0.m3613k("Cannot create fragment ", abstractComponentCallbacksC0048l, " for a container view with no id"));
                    return;
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0048l.mFragmentManager.f732u.mo352b(i);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0048l.mRestored) {
                        try {
                            resourceName = abstractComponentCallbacksC0048l.getResources().getResourceName(abstractComponentCallbacksC0048l.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0048l.mContainerId) + " (" + resourceName + ") for fragment " + abstractComponentCallbacksC0048l);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    mf0 mf0Var = nf0.f7396a;
                    nf0.m4540b(new lf0(abstractComponentCallbacksC0048l, "Attempting to add fragment " + abstractComponentCallbacksC0048l + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    nf0.m4539a(abstractComponentCallbacksC0048l).getClass();
                }
            }
        }
        abstractComponentCallbacksC0048l.mContainer = viewGroup;
        abstractComponentCallbacksC0048l.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, abstractComponentCallbacksC0048l.mSavedFragmentState);
        View view = abstractComponentCallbacksC0048l.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0048l.mView.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0048l);
            if (viewGroup != null) {
                m419a();
            }
            if (abstractComponentCallbacksC0048l.mHidden) {
                abstractComponentCallbacksC0048l.mView.setVisibility(8);
            }
            View view2 = abstractComponentCallbacksC0048l.mView;
            WeakHashMap weakHashMap = i72.f4849a;
            boolean zM6586b = v62.m6586b(view2);
            View view3 = abstractComponentCallbacksC0048l.mView;
            if (zM6586b) {
                w62.m6726c(view3);
            } else {
                view3.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1410sl(view3, 2));
            }
            abstractComponentCallbacksC0048l.performViewCreated();
            this.f758a.m2282x(false);
            int visibility = abstractComponentCallbacksC0048l.mView.getVisibility();
            abstractComponentCallbacksC0048l.setPostOnViewCreatedAlpha(abstractComponentCallbacksC0048l.mView.getAlpha());
            if (abstractComponentCallbacksC0048l.mContainer != null && visibility == 0) {
                View viewFindFocus = abstractComponentCallbacksC0048l.mView.findFocus();
                if (viewFindFocus != null) {
                    abstractComponentCallbacksC0048l.setFocusedView(viewFindFocus);
                    if (AbstractC0056t.m363G(2)) {
                        viewFindFocus.toString();
                        Objects.toString(abstractComponentCallbacksC0048l);
                    }
                }
                abstractComponentCallbacksC0048l.mView.setAlpha(TouchPipeline.SIZE);
            }
        }
        abstractComponentCallbacksC0048l.mState = 2;
    }

    /* JADX INFO: renamed from: e */
    public final void m423e() {
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048lM433b;
        boolean zM363G = AbstractC0056t.m363G(3);
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = this.f760c;
        if (zM363G) {
            Objects.toString(abstractComponentCallbacksC0048l);
        }
        int i = 0;
        boolean zIsChangingConfigurations = true;
        boolean z = abstractComponentCallbacksC0048l.mRemoving && !abstractComponentCallbacksC0048l.isInBackStack();
        C0060x c0060x = this.f759b;
        if (z && !abstractComponentCallbacksC0048l.mBeingSaved) {
        }
        if (!z) {
            C0057u c0057u = c0060x.f766d;
            if (!((c0057u.f739b.containsKey(abstractComponentCallbacksC0048l.mWho) && c0057u.f742e) ? c0057u.f743f : true)) {
                String str = abstractComponentCallbacksC0048l.mTargetWho;
                if (str != null && (abstractComponentCallbacksC0048lM433b = c0060x.m433b(str)) != null && abstractComponentCallbacksC0048lM433b.mRetainInstance) {
                    abstractComponentCallbacksC0048l.mTarget = abstractComponentCallbacksC0048lM433b;
                }
                abstractComponentCallbacksC0048l.mState = 0;
                return;
            }
        }
        xe0 xe0Var = abstractComponentCallbacksC0048l.mHost;
        if (xe0Var instanceof w72) {
            zIsChangingConfigurations = c0060x.f766d.f743f;
        } else {
            AbstractActivityC0053q abstractActivityC0053q = xe0Var.f12589b;
            if (abstractActivityC0053q != null) {
                zIsChangingConfigurations = true ^ abstractActivityC0053q.isChangingConfigurations();
            }
        }
        if ((z && !abstractComponentCallbacksC0048l.mBeingSaved) || zIsChangingConfigurations) {
            C0057u c0057u2 = c0060x.f766d;
            c0057u2.getClass();
            if (AbstractC0056t.m363G(3)) {
                Objects.toString(abstractComponentCallbacksC0048l);
            }
            c0057u2.m417d(abstractComponentCallbacksC0048l.mWho);
        }
        abstractComponentCallbacksC0048l.performDestroy();
        this.f758a.m2273o(false);
        ArrayList arrayListM435d = c0060x.m435d();
        int size = arrayListM435d.size();
        while (i < size) {
            Object obj = arrayListM435d.get(i);
            i++;
            C0059w c0059w = (C0059w) obj;
            if (c0059w != null) {
                AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l2 = c0059w.f760c;
                if (abstractComponentCallbacksC0048l.mWho.equals(abstractComponentCallbacksC0048l2.mTargetWho)) {
                    abstractComponentCallbacksC0048l2.mTarget = abstractComponentCallbacksC0048l;
                    abstractComponentCallbacksC0048l2.mTargetWho = null;
                }
            }
        }
        String str2 = abstractComponentCallbacksC0048l.mTargetWho;
        if (str2 != null) {
            abstractComponentCallbacksC0048l.mTarget = c0060x.m433b(str2);
        }
        c0060x.m439h(this);
    }

    /* JADX INFO: renamed from: f */
    public final void m424f() {
        View view;
        boolean zM363G = AbstractC0056t.m363G(3);
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = this.f760c;
        if (zM363G) {
            Objects.toString(abstractComponentCallbacksC0048l);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0048l.mContainer;
        if (viewGroup != null && (view = abstractComponentCallbacksC0048l.mView) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0048l.performDestroyView();
        this.f758a.m2283y(false);
        abstractComponentCallbacksC0048l.mContainer = null;
        abstractComponentCallbacksC0048l.mView = null;
        abstractComponentCallbacksC0048l.mViewLifecycleOwner = null;
        abstractComponentCallbacksC0048l.mViewLifecycleOwnerLiveData.mo939h(null);
        abstractComponentCallbacksC0048l.mInLayout = false;
    }

    /* JADX INFO: renamed from: g */
    public final void m425g() {
        boolean zM363G = AbstractC0056t.m363G(3);
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = this.f760c;
        if (zM363G) {
            Objects.toString(abstractComponentCallbacksC0048l);
        }
        abstractComponentCallbacksC0048l.performDetach();
        this.f758a.m2274p(false);
        abstractComponentCallbacksC0048l.mState = -1;
        abstractComponentCallbacksC0048l.mHost = null;
        abstractComponentCallbacksC0048l.mParentFragment = null;
        abstractComponentCallbacksC0048l.mFragmentManager = null;
        if (!abstractComponentCallbacksC0048l.mRemoving || abstractComponentCallbacksC0048l.isInBackStack()) {
            C0057u c0057u = this.f759b.f766d;
            if (!((c0057u.f739b.containsKey(abstractComponentCallbacksC0048l.mWho) && c0057u.f742e) ? c0057u.f743f : true)) {
                return;
            }
        }
        if (AbstractC0056t.m363G(3)) {
            Objects.toString(abstractComponentCallbacksC0048l);
        }
        abstractComponentCallbacksC0048l.initState();
    }

    /* JADX INFO: renamed from: h */
    public final void m426h() {
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = this.f760c;
        if (abstractComponentCallbacksC0048l.mFromLayout && abstractComponentCallbacksC0048l.mInLayout && !abstractComponentCallbacksC0048l.mPerformedCreateView) {
            if (AbstractC0056t.m363G(3)) {
                Objects.toString(abstractComponentCallbacksC0048l);
            }
            abstractComponentCallbacksC0048l.performCreateView(abstractComponentCallbacksC0048l.performGetLayoutInflater(abstractComponentCallbacksC0048l.mSavedFragmentState), null, abstractComponentCallbacksC0048l.mSavedFragmentState);
            View view = abstractComponentCallbacksC0048l.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0048l.mView.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0048l);
                if (abstractComponentCallbacksC0048l.mHidden) {
                    abstractComponentCallbacksC0048l.mView.setVisibility(8);
                }
                abstractComponentCallbacksC0048l.performViewCreated();
                this.f758a.m2282x(false);
                abstractComponentCallbacksC0048l.mState = 2;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m427i() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z = this.f761d;
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = this.f760c;
        if (z) {
            if (AbstractC0056t.m363G(2)) {
                Objects.toString(abstractComponentCallbacksC0048l);
                return;
            }
            return;
        }
        try {
            this.f761d = true;
            boolean z2 = false;
            while (true) {
                int iM421c = m421c();
                int i = abstractComponentCallbacksC0048l.mState;
                C0060x c0060x = this.f759b;
                if (iM421c == i) {
                    if (!z2 && i == -1 && abstractComponentCallbacksC0048l.mRemoving && !abstractComponentCallbacksC0048l.isInBackStack() && !abstractComponentCallbacksC0048l.mBeingSaved) {
                        if (AbstractC0056t.m363G(3)) {
                            Objects.toString(abstractComponentCallbacksC0048l);
                        }
                        C0057u c0057u = c0060x.f766d;
                        c0057u.getClass();
                        if (AbstractC0056t.m363G(3)) {
                            Objects.toString(abstractComponentCallbacksC0048l);
                        }
                        c0057u.m417d(abstractComponentCallbacksC0048l.mWho);
                        c0060x.m439h(this);
                        if (AbstractC0056t.m363G(3)) {
                            Objects.toString(abstractComponentCallbacksC0048l);
                        }
                        abstractComponentCallbacksC0048l.initState();
                    }
                    if (abstractComponentCallbacksC0048l.mHiddenChanged) {
                        if (abstractComponentCallbacksC0048l.mView != null && (viewGroup = abstractComponentCallbacksC0048l.mContainer) != null) {
                            C0042f c0042fM341i = C0042f.m341i(viewGroup, abstractComponentCallbacksC0048l.getParentFragmentManager());
                            if (abstractComponentCallbacksC0048l.mHidden) {
                                if (AbstractC0056t.m363G(2)) {
                                    Objects.toString(abstractComponentCallbacksC0048l);
                                }
                                c0042fM341i.m343b(3, 1, this);
                            } else {
                                if (AbstractC0056t.m363G(2)) {
                                    Objects.toString(abstractComponentCallbacksC0048l);
                                }
                                c0042fM341i.m343b(2, 1, this);
                            }
                        }
                        AbstractC0056t abstractC0056t = abstractComponentCallbacksC0048l.mFragmentManager;
                        if (abstractC0056t != null && abstractComponentCallbacksC0048l.mAdded && AbstractC0056t.m364H(abstractComponentCallbacksC0048l)) {
                            abstractC0056t.f702D = true;
                        }
                        abstractComponentCallbacksC0048l.mHiddenChanged = false;
                        abstractComponentCallbacksC0048l.onHiddenChanged(abstractComponentCallbacksC0048l.mHidden);
                        abstractComponentCallbacksC0048l.mChildFragmentManager.m402n();
                    }
                    return;
                }
                C0558d8 c0558d8 = this.f758a;
                if (iM421c > i) {
                    switch (i + 1) {
                        case 0:
                            m420b();
                            break;
                        case 1:
                            if (AbstractC0056t.m363G(3)) {
                                Objects.toString(abstractComponentCallbacksC0048l);
                            }
                            boolean z3 = abstractComponentCallbacksC0048l.mIsCreated;
                            Bundle bundle = abstractComponentCallbacksC0048l.mSavedFragmentState;
                            if (!z3) {
                                c0558d8.m2277s(false);
                                abstractComponentCallbacksC0048l.performCreate(abstractComponentCallbacksC0048l.mSavedFragmentState);
                                c0558d8.m2272n(false);
                            } else {
                                abstractComponentCallbacksC0048l.restoreChildFragmentState(bundle);
                                abstractComponentCallbacksC0048l.mState = 1;
                            }
                            break;
                        case 2:
                            m426h();
                            m422d();
                            break;
                        case 3:
                            if (AbstractC0056t.m363G(3)) {
                                Objects.toString(abstractComponentCallbacksC0048l);
                            }
                            abstractComponentCallbacksC0048l.performActivityCreated(abstractComponentCallbacksC0048l.mSavedFragmentState);
                            c0558d8.m2270l(false);
                            break;
                        case 4:
                            if (abstractComponentCallbacksC0048l.mView != null && (viewGroup3 = abstractComponentCallbacksC0048l.mContainer) != null) {
                                C0042f c0042fM341i2 = C0042f.m341i(viewGroup3, abstractComponentCallbacksC0048l.getParentFragmentManager());
                                int iM3604b = jd0.m3604b(abstractComponentCallbacksC0048l.mView.getVisibility());
                                if (AbstractC0056t.m363G(2)) {
                                    Objects.toString(abstractComponentCallbacksC0048l);
                                }
                                c0042fM341i2.m343b(iM3604b, 2, this);
                            }
                            abstractComponentCallbacksC0048l.mState = 4;
                            break;
                        case 5:
                            if (AbstractC0056t.m363G(3)) {
                                Objects.toString(abstractComponentCallbacksC0048l);
                            }
                            abstractComponentCallbacksC0048l.performStart();
                            c0558d8.m2280v(false);
                            break;
                        case 6:
                            abstractComponentCallbacksC0048l.mState = 6;
                            break;
                        case 7:
                            m429k();
                            break;
                    }
                } else {
                    switch (i - 1) {
                        case -1:
                            m425g();
                            break;
                        case 0:
                            if (abstractComponentCallbacksC0048l.mBeingSaved) {
                                if (((C0058v) c0060x.f765c.get(abstractComponentCallbacksC0048l.mWho)) == null) {
                                    m430l();
                                }
                            }
                            m423e();
                            break;
                        case 1:
                            m424f();
                            abstractComponentCallbacksC0048l.mState = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0048l.mInLayout = false;
                            abstractComponentCallbacksC0048l.mState = 2;
                            break;
                        case 3:
                            if (AbstractC0056t.m363G(3)) {
                                Objects.toString(abstractComponentCallbacksC0048l);
                            }
                            if (abstractComponentCallbacksC0048l.mBeingSaved) {
                                m430l();
                            } else if (abstractComponentCallbacksC0048l.mView != null && abstractComponentCallbacksC0048l.mSavedViewState == null) {
                                m431m();
                            }
                            if (abstractComponentCallbacksC0048l.mView != null && (viewGroup2 = abstractComponentCallbacksC0048l.mContainer) != null) {
                                C0042f c0042fM341i3 = C0042f.m341i(viewGroup2, abstractComponentCallbacksC0048l.getParentFragmentManager());
                                if (AbstractC0056t.m363G(2)) {
                                    Objects.toString(abstractComponentCallbacksC0048l);
                                }
                                c0042fM341i3.m343b(1, 3, this);
                            }
                            abstractComponentCallbacksC0048l.mState = 3;
                            break;
                        case 4:
                            if (AbstractC0056t.m363G(3)) {
                                Objects.toString(abstractComponentCallbacksC0048l);
                            }
                            abstractComponentCallbacksC0048l.performStop();
                            c0558d8.m2281w(false);
                            break;
                        case 5:
                            abstractComponentCallbacksC0048l.mState = 5;
                            break;
                        case 6:
                            if (AbstractC0056t.m363G(3)) {
                                Objects.toString(abstractComponentCallbacksC0048l);
                            }
                            abstractComponentCallbacksC0048l.performPause();
                            c0558d8.m2275q(false);
                            break;
                    }
                }
                z2 = true;
            }
        } finally {
            this.f761d = false;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m428j(ClassLoader classLoader) {
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = this.f760c;
        Bundle bundle = abstractComponentCallbacksC0048l.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        abstractComponentCallbacksC0048l.mSavedViewState = abstractComponentCallbacksC0048l.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        abstractComponentCallbacksC0048l.mSavedViewRegistryState = abstractComponentCallbacksC0048l.mSavedFragmentState.getBundle("android:view_registry_state");
        abstractComponentCallbacksC0048l.mTargetWho = abstractComponentCallbacksC0048l.mSavedFragmentState.getString("android:target_state");
        if (abstractComponentCallbacksC0048l.mTargetWho != null) {
            abstractComponentCallbacksC0048l.mTargetRequestCode = abstractComponentCallbacksC0048l.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Boolean bool = abstractComponentCallbacksC0048l.mSavedUserVisibleHint;
        if (bool != null) {
            abstractComponentCallbacksC0048l.mUserVisibleHint = bool.booleanValue();
            abstractComponentCallbacksC0048l.mSavedUserVisibleHint = null;
        } else {
            abstractComponentCallbacksC0048l.mUserVisibleHint = abstractComponentCallbacksC0048l.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        if (abstractComponentCallbacksC0048l.mUserVisibleHint) {
            return;
        }
        abstractComponentCallbacksC0048l.mDeferStart = true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    /* JADX INFO: renamed from: k */
    public final void m429k() {
        boolean zM363G = AbstractC0056t.m363G(3);
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = this.f760c;
        if (zM363G) {
            Objects.toString(abstractComponentCallbacksC0048l);
        }
        View focusedView = abstractComponentCallbacksC0048l.getFocusedView();
        if (focusedView != null) {
            if (focusedView == abstractComponentCallbacksC0048l.mView) {
                focusedView.requestFocus();
                if (AbstractC0056t.m363G(2)) {
                    focusedView.toString();
                    Objects.toString(abstractComponentCallbacksC0048l);
                    Objects.toString(abstractComponentCallbacksC0048l.mView.findFocus());
                }
            } else {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == abstractComponentCallbacksC0048l.mView) {
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                focusedView.requestFocus();
                if (AbstractC0056t.m363G(2)) {
                    focusedView.toString();
                    Objects.toString(abstractComponentCallbacksC0048l);
                    Objects.toString(abstractComponentCallbacksC0048l.mView.findFocus());
                }
            }
        }
        abstractComponentCallbacksC0048l.setFocusedView(null);
        abstractComponentCallbacksC0048l.performResume();
        this.f758a.m2278t(false);
        abstractComponentCallbacksC0048l.mSavedFragmentState = null;
        abstractComponentCallbacksC0048l.mSavedViewState = null;
        abstractComponentCallbacksC0048l.mSavedViewRegistryState = null;
    }

    /* JADX INFO: renamed from: l */
    public final void m430l() {
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = this.f760c;
        C0058v c0058v = new C0058v(abstractComponentCallbacksC0048l);
        if (abstractComponentCallbacksC0048l.mState <= -1 || c0058v.f757r != null) {
            c0058v.f757r = abstractComponentCallbacksC0048l.mSavedFragmentState;
        } else {
            Bundle bundle = new Bundle();
            abstractComponentCallbacksC0048l.performSaveInstanceState(bundle);
            this.f758a.m2279u(false);
            if (bundle.isEmpty()) {
                bundle = null;
            }
            if (abstractComponentCallbacksC0048l.mView != null) {
                m431m();
            }
            if (abstractComponentCallbacksC0048l.mSavedViewState != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC0048l.mSavedViewState);
            }
            if (abstractComponentCallbacksC0048l.mSavedViewRegistryState != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("android:view_registry_state", abstractComponentCallbacksC0048l.mSavedViewRegistryState);
            }
            if (!abstractComponentCallbacksC0048l.mUserVisibleHint) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android:user_visible_hint", abstractComponentCallbacksC0048l.mUserVisibleHint);
            }
            c0058v.f757r = bundle;
            if (abstractComponentCallbacksC0048l.mTargetWho != null) {
                if (bundle == null) {
                    c0058v.f757r = new Bundle();
                }
                c0058v.f757r.putString("android:target_state", abstractComponentCallbacksC0048l.mTargetWho);
                int i = abstractComponentCallbacksC0048l.mTargetRequestCode;
                if (i != 0) {
                    c0058v.f757r.putInt("android:target_req_state", i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m431m() {
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = this.f760c;
        if (abstractComponentCallbacksC0048l.mView == null) {
            return;
        }
        if (AbstractC0056t.m363G(2)) {
            Objects.toString(abstractComponentCallbacksC0048l);
            Objects.toString(abstractComponentCallbacksC0048l.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0048l.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0048l.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0048l.mViewLifecycleOwner.f1790d.m3473c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0048l.mSavedViewRegistryState = bundle;
    }

    public C0059w(C0558d8 c0558d8, C0060x c0060x, AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l) {
        this.f758a = c0558d8;
        this.f759b = c0060x;
        this.f760c = abstractComponentCallbacksC0048l;
    }

    public C0059w(C0558d8 c0558d8, C0060x c0060x, AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l, C0058v c0058v) {
        this.f758a = c0558d8;
        this.f759b = c0060x;
        this.f760c = abstractComponentCallbacksC0048l;
        abstractComponentCallbacksC0048l.mSavedViewState = null;
        abstractComponentCallbacksC0048l.mSavedViewRegistryState = null;
        abstractComponentCallbacksC0048l.mBackStackNesting = 0;
        abstractComponentCallbacksC0048l.mInLayout = false;
        abstractComponentCallbacksC0048l.mAdded = false;
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l2 = abstractComponentCallbacksC0048l.mTarget;
        abstractComponentCallbacksC0048l.mTargetWho = abstractComponentCallbacksC0048l2 != null ? abstractComponentCallbacksC0048l2.mWho : null;
        abstractComponentCallbacksC0048l.mTarget = null;
        Bundle bundle = c0058v.f757r;
        if (bundle != null) {
            abstractComponentCallbacksC0048l.mSavedFragmentState = bundle;
        } else {
            abstractComponentCallbacksC0048l.mSavedFragmentState = new Bundle();
        }
    }
}

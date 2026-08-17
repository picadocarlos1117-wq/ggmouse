package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.sousasantoslogic.sspro.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p000.AbstractC0075au;
import p000.AbstractC0076av;
import p000.AbstractC0122c4;
import p000.AbstractC0590e4;
import p000.AbstractC0627f4;
import p000.AbstractC0664g4;
import p000.AbstractC0815k4;
import p000.AbstractC1095m4;
import p000.AbstractC1356r4;
import p000.AbstractC1408sj;
import p000.C0656fx;
import p000.InterfaceC0777j4;
import p000.RunnableC1621ya;
import p000.a71;
import p000.as1;
import p000.av0;
import p000.ay0;
import p000.b71;
import p000.bv0;
import p000.ca0;
import p000.cf0;
import p000.cg0;
import p000.ds0;
import p000.dy1;
import p000.ef0;
import p000.eo0;
import p000.es0;
import p000.f40;
import p000.fs0;
import p000.hf0;
import p000.hi0;
import p000.hp0;
import p000.hp1;
import p000.hu0;
import p000.ii0;
import p000.ip1;
import p000.jd0;
import p000.jp1;
import p000.ju1;
import p000.kf0;
import p000.kp1;
import p000.lf0;
import p000.lh0;
import p000.mf0;
import p000.ms0;
import p000.nf0;
import p000.oe0;
import p000.os0;
import p000.pe0;
import p000.qe0;
import p000.re0;
import p000.se0;
import p000.t72;
import p000.te0;
import p000.u72;
import p000.v72;
import p000.ve0;
import p000.vj0;
import p000.w72;
import p000.xe0;

/* JADX INFO: renamed from: androidx.fragment.app.l */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0048l implements ComponentCallbacks, View.OnCreateContextMenuListener, ms0, w72, vj0, jp1 {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    re0 mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    u72 mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    AbstractC0056t mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    xe0 mHost;
    boolean mInLayout;
    boolean mIsCreated;
    LayoutInflater mLayoutInflater;
    os0 mLifecycleRegistry;
    AbstractComponentCallbacksC0048l mParentFragment;
    boolean mPerformedCreateView;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    ip1 mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    String mTag;
    AbstractComponentCallbacksC0048l mTarget;
    int mTargetRequestCode;
    View mView;
    cg0 mViewLifecycleOwner;
    int mState = -1;
    String mWho = UUID.randomUUID().toString();
    String mTargetWho = null;
    private Boolean mIsPrimaryNavigationFragment = null;
    AbstractC0056t mChildFragmentManager = new hf0();
    boolean mMenuVisible = true;
    boolean mUserVisibleHint = true;
    Runnable mPostponedDurationRunnable = new pe0(this, 0);
    es0 mMaxState = es0.f3437e;
    b71 mViewLifecycleOwnerLiveData = new b71();
    private final AtomicInteger mNextLocalRequestCode = new AtomicInteger();
    private final ArrayList<se0> mOnPreAttachedListeners = new ArrayList<>();
    private final se0 mSavedStateAttachListener = new C0044h(this);

    public AbstractComponentCallbacksC0048l() {
        m357d();
    }

    @Deprecated
    public static AbstractComponentCallbacksC0048l instantiate(Context context, String str, Bundle bundle) {
        try {
            AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = (AbstractComponentCallbacksC0048l) cf0.m1212b(str, context.getClassLoader()).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return abstractComponentCallbacksC0048l;
            }
            bundle.setClassLoader(abstractComponentCallbacksC0048l.getClass().getClassLoader());
            abstractComponentCallbacksC0048l.setArguments(bundle);
            return abstractComponentCallbacksC0048l;
        } catch (IllegalAccessException e) {
            throw new C0656fx(jd0.m3615m("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new C0656fx(jd0.m3615m("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new C0656fx(jd0.m3615m("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new C0656fx(jd0.m3615m("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }

    /* JADX INFO: renamed from: a */
    public final re0 m354a() {
        if (this.mAnimationInfo == null) {
            re0 re0Var = new re0();
            re0Var.f9923i = null;
            Object obj = USE_DEFAULT_TRANSITION;
            re0Var.f9924j = obj;
            re0Var.f9925k = null;
            re0Var.f9926l = obj;
            re0Var.f9927m = null;
            re0Var.f9928n = obj;
            re0Var.f9931q = 1.0f;
            re0Var.f9932r = null;
            this.mAnimationInfo = re0Var;
        }
        return this.mAnimationInfo;
    }

    /* JADX INFO: renamed from: b */
    public final int m355b() {
        es0 es0Var = this.mMaxState;
        return (es0Var == es0.f3434b || this.mParentFragment == null) ? es0Var.ordinal() : Math.min(es0Var.ordinal(), this.mParentFragment.m355b());
    }

    /* JADX INFO: renamed from: c */
    public final AbstractComponentCallbacksC0048l m356c(boolean z) {
        String str;
        if (z) {
            mf0 mf0Var = nf0.f7396a;
            nf0.m4540b(new ii0(this, "Attempting to get target fragment from fragment " + this));
            nf0.m4539a(this).getClass();
        }
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = this.mTarget;
        if (abstractComponentCallbacksC0048l != null) {
            return abstractComponentCallbacksC0048l;
        }
        AbstractC0056t abstractC0056t = this.mFragmentManager;
        if (abstractC0056t == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return abstractC0056t.f714c.m433b(str);
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        AbstractC0056t abstractC0056t;
        re0 re0Var = this.mAnimationInfo;
        if (re0Var != null) {
            re0Var.f9933s = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (abstractC0056t = this.mFragmentManager) == null) {
            return;
        }
        C0042f c0042fM340h = C0042f.m340h(viewGroup, abstractC0056t.m371F());
        c0042fM340h.m348j();
        if (z) {
            this.mHost.f12590c.post(new RunnableC1621ya(c0042fM340h, 11));
        } else {
            c0042fM340h.m345d();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    public ve0 createFragmentContainer() {
        return new C0045i(this);
    }

    /* JADX INFO: renamed from: d */
    public final void m357d() {
        this.mLifecycleRegistry = new os0(this);
        this.mSavedStateRegistryController = new ip1(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        se0 se0Var = this.mSavedStateAttachListener;
        if (this.mState >= 0) {
            se0Var.mo351a();
        } else {
            this.mOnPreAttachedListeners.add(se0Var);
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048lM356c = m356c(false);
        if (abstractComponentCallbacksC0048lM356c != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(abstractComponentCallbacksC0048lM356c);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            av0.m721a(this).m2390b(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.m409u(jd0.m3614l(str, "  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: renamed from: e */
    public final oe0 m358e(AbstractC0815k4 abstractC0815k4, lh0 lh0Var, InterfaceC0777j4 interfaceC0777j4) {
        if (this.mState > 1) {
            f40.m2719o(jd0.m3613k("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
            return null;
        }
        AtomicReference atomicReference = new AtomicReference();
        qe0 qe0Var = new qe0(this, lh0Var, atomicReference, abstractC0815k4, interfaceC0777j4);
        if (this.mState >= 0) {
            qe0Var.mo351a();
        } else {
            this.mOnPreAttachedListeners.add(qe0Var);
        }
        return new oe0(atomicReference);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public AbstractComponentCallbacksC0048l findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.f714c.m434c(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final AbstractActivityC0053q getActivity() {
        xe0 xe0Var = this.mHost;
        if (xe0Var == null) {
            return null;
        }
        return xe0Var.f12588a;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        re0 re0Var = this.mAnimationInfo;
        if (re0Var == null || (bool = re0Var.f9930p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        re0 re0Var = this.mAnimationInfo;
        if (re0Var == null || (bool = re0Var.f9929o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        re0 re0Var = this.mAnimationInfo;
        if (re0Var == null) {
            return null;
        }
        re0Var.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final AbstractC0056t getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        f40.m2719o(jd0.m3613k("Fragment ", this, " has not been attached yet."));
        return null;
    }

    public Context getContext() {
        xe0 xe0Var = this.mHost;
        if (xe0Var == null) {
            return null;
        }
        return xe0Var.f12589b;
    }

    @Override // p000.vj0
    public AbstractC0076av getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && AbstractC0056t.m363G(3)) {
            Objects.toString(requireContext().getApplicationContext());
        }
        a71 a71Var = new a71();
        LinkedHashMap linkedHashMap = a71Var.f1067a;
        if (application != null) {
            linkedHashMap.put(t72.f10798e, application);
        }
        linkedHashMap.put(hp0.f4651o, this);
        linkedHashMap.put(hp0.f4652p, this);
        if (getArguments() != null) {
            linkedHashMap.put(hp0.f4653q, getArguments());
        }
        return a71Var;
    }

    public u72 getDefaultViewModelProviderFactory() {
        Application application = null;
        if (this.mFragmentManager == null) {
            f40.m2719o("Can't access ViewModels from detached fragment");
            return null;
        }
        if (this.mDefaultFactory == null) {
            for (Context applicationContext = requireContext().getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
            }
            if (application == null && AbstractC0056t.m363G(3)) {
                Objects.toString(requireContext().getApplicationContext());
            }
            this.mDefaultFactory = new kp1(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        re0 re0Var = this.mAnimationInfo;
        if (re0Var == null) {
            return 0;
        }
        return re0Var.f9916b;
    }

    public Object getEnterTransition() {
        re0 re0Var = this.mAnimationInfo;
        if (re0Var == null) {
            return null;
        }
        return re0Var.f9923i;
    }

    public as1 getEnterTransitionCallback() {
        re0 re0Var = this.mAnimationInfo;
        if (re0Var == null) {
            return null;
        }
        re0Var.getClass();
        return null;
    }

    public int getExitAnim() {
        re0 re0Var = this.mAnimationInfo;
        if (re0Var == null) {
            return 0;
        }
        return re0Var.f9917c;
    }

    public Object getExitTransition() {
        re0 re0Var = this.mAnimationInfo;
        if (re0Var == null) {
            return null;
        }
        return re0Var.f9925k;
    }

    public as1 getExitTransitionCallback() {
        re0 re0Var = this.mAnimationInfo;
        if (re0Var == null) {
            return null;
        }
        re0Var.getClass();
        return null;
    }

    public View getFocusedView() {
        re0 re0Var = this.mAnimationInfo;
        if (re0Var == null) {
            return null;
        }
        return re0Var.f9932r;
    }

    @Deprecated
    public final AbstractC0056t getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        xe0 xe0Var = this.mHost;
        if (xe0Var == null) {
            return null;
        }
        return ((C0052p) xe0Var).f695e;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        xe0 xe0Var = this.mHost;
        if (xe0Var == null) {
            f40.m2719o("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        AbstractActivityC0053q abstractActivityC0053q = ((C0052p) xe0Var).f695e;
        LayoutInflater layoutInflaterCloneInContext = abstractActivityC0053q.getLayoutInflater().cloneInContext(abstractActivityC0053q);
        layoutInflaterCloneInContext.setFactory2(this.mChildFragmentManager.f717f);
        return layoutInflaterCloneInContext;
    }

    @Override // p000.ms0
    public fs0 getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public av0 getLoaderManager() {
        return av0.m721a(this);
    }

    public int getNextTransition() {
        re0 re0Var = this.mAnimationInfo;
        if (re0Var == null) {
            return 0;
        }
        return re0Var.f9920f;
    }

    public final AbstractComponentCallbacksC0048l getParentFragment() {
        return this.mParentFragment;
    }

    public final AbstractC0056t getParentFragmentManager() {
        AbstractC0056t abstractC0056t = this.mFragmentManager;
        if (abstractC0056t != null) {
            return abstractC0056t;
        }
        f40.m2719o(jd0.m3613k("Fragment ", this, " not associated with a fragment manager."));
        return null;
    }

    public boolean getPopDirection() {
        re0 re0Var = this.mAnimationInfo;
        if (re0Var == null) {
            return false;
        }
        return re0Var.f9915a;
    }

    public int getPopEnterAnim() {
        re0 re0Var = this.mAnimationInfo;
        if (re0Var == null) {
            return 0;
        }
        return re0Var.f9918d;
    }

    public int getPopExitAnim() {
        re0 re0Var = this.mAnimationInfo;
        if (re0Var == null) {
            return 0;
        }
        return re0Var.f9919e;
    }

    public float getPostOnViewCreatedAlpha() {
        re0 re0Var = this.mAnimationInfo;
        if (re0Var == null) {
            return 1.0f;
        }
        return re0Var.f9931q;
    }

    public Object getReenterTransition() {
        re0 re0Var = this.mAnimationInfo;
        if (re0Var == null) {
            return null;
        }
        Object obj = re0Var.f9926l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        mf0 mf0Var = nf0.f7396a;
        nf0.m4540b(new hi0(this, "Attempting to get retain instance for fragment " + this));
        nf0.m4539a(this).getClass();
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        re0 re0Var = this.mAnimationInfo;
        if (re0Var == null) {
            return null;
        }
        Object obj = re0Var.f9924j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // p000.jp1
    public final hp1 getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f5128b;
    }

    public Object getSharedElementEnterTransition() {
        re0 re0Var = this.mAnimationInfo;
        if (re0Var == null) {
            return null;
        }
        return re0Var.f9927m;
    }

    public Object getSharedElementReturnTransition() {
        re0 re0Var = this.mAnimationInfo;
        if (re0Var == null) {
            return null;
        }
        Object obj = re0Var.f9928n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        re0 re0Var = this.mAnimationInfo;
        return (re0Var == null || (arrayList = re0Var.f9921g) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        re0 re0Var = this.mAnimationInfo;
        return (re0Var == null || (arrayList = re0Var.f9922h) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final AbstractComponentCallbacksC0048l getTargetFragment() {
        return m356c(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        mf0 mf0Var = nf0.f7396a;
        nf0.m4540b(new ii0(this, "Attempting to get target request code from fragment " + this));
        nf0.m4539a(this).getClass();
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public ms0 getViewLifecycleOwner() {
        cg0 cg0Var = this.mViewLifecycleOwner;
        if (cg0Var != null) {
            return cg0Var;
        }
        f40.m2719o("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
        return null;
    }

    public hu0 getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // p000.w72
    public v72 getViewModelStore() {
        if (this.mFragmentManager == null) {
            f40.m2719o("Can't access ViewModels from detached fragment");
            return null;
        }
        if (m355b() == 1) {
            f40.m2719o("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap map = this.mFragmentManager.f710L.f741d;
        v72 v72Var = (v72) map.get(this.mWho);
        if (v72Var != null) {
            return v72Var;
        }
        v72 v72Var2 = new v72();
        map.put(this.mWho, v72Var2);
        return v72Var2;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        m357d();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new hf0();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (this.mHidden) {
            return true;
        }
        AbstractC0056t abstractC0056t = this.mFragmentManager;
        if (abstractC0056t != null) {
            AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = this.mParentFragment;
            abstractC0056t.getClass();
            if (abstractComponentCallbacksC0048l == null ? false : abstractComponentCallbacksC0048l.isHidden()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        if (this.mFragmentManager != null) {
            AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = this.mParentFragment;
            if (!(abstractComponentCallbacksC0048l == null ? true : abstractComponentCallbacksC0048l.isMenuVisible())) {
                return false;
            }
        }
        return true;
    }

    public boolean isPostponed() {
        re0 re0Var = this.mAnimationInfo;
        if (re0Var == null) {
            return false;
        }
        return re0Var.f9933s;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        AbstractC0056t abstractC0056t = this.mFragmentManager;
        if (abstractC0056t == null) {
            return false;
        }
        return abstractC0056t.f703E || abstractC0056t.f704F;
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.m374L();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (AbstractC0056t.m363G(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        xe0 xe0Var = this.mHost;
        AbstractActivityC0053q abstractActivityC0053q = xe0Var == null ? null : xe0Var.f12588a;
        if (abstractActivityC0053q != null) {
            this.mCalled = false;
            onAttach((Activity) abstractActivityC0053q);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        AbstractC0056t abstractC0056t = this.mChildFragmentManager;
        if (abstractC0056t.f730s >= 1) {
            return;
        }
        abstractC0056t.f703E = false;
        abstractC0056t.f704F = false;
        abstractC0056t.f710L.f744g = false;
        abstractC0056t.m408t(1);
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        xe0 xe0Var = this.mHost;
        AbstractActivityC0053q abstractActivityC0053q = xe0Var == null ? null : xe0Var.f12588a;
        if (abstractActivityC0053q != null) {
            this.mCalled = false;
            onInflate((Activity) abstractActivityC0053q, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.m374L();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new dy1(jd0.m3613k("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        if (AbstractC0056t.m363G(3)) {
            toString();
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
        AbstractC0056t abstractC0056t = this.mChildFragmentManager;
        abstractC0056t.f703E = false;
        abstractC0056t.f704F = false;
        abstractC0056t.f710L.f744g = false;
        abstractC0056t.m408t(4);
    }

    public void performAttach() {
        ArrayList<se0> arrayList = this.mOnPreAttachedListeners;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            se0 se0Var = arrayList.get(i);
            i++;
            se0Var.mo351a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.m390b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach((Context) this.mHost.f12589b);
        if (!this.mCalled) {
            throw new dy1(jd0.m3613k("Fragment ", this, " did not call through to super.onAttach()"));
        }
        Iterator it = this.mFragmentManager.f724m.iterator();
        while (it.hasNext()) {
            ((kf0) it.next()).mo361a(this);
        }
        AbstractC0056t abstractC0056t = this.mChildFragmentManager;
        abstractC0056t.f703E = false;
        abstractC0056t.f704F = false;
        abstractC0056t.f710L.f744g = false;
        abstractC0056t.m408t(0);
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m397i(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.m374L();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.mo2848a(new C0046j(this));
        this.mSavedStateRegistryController.m3472b(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new dy1(jd0.m3613k("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.m5053e(ds0.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return this.mChildFragmentManager.m398j(menu, menuInflater) | z;
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.m374L();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new cg0(this, getViewModelStore());
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        cg0 cg0Var = this.mViewLifecycleOwner;
        if (viewOnCreateView == null) {
            if (cg0Var.f1789c == null) {
                this.mViewLifecycleOwner = null;
                return;
            } else {
                f40.m2719o("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            }
        }
        cg0Var.m1215b();
        View view = this.mView;
        cg0 cg0Var2 = this.mViewLifecycleOwner;
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, cg0Var2);
        View view2 = this.mView;
        cg0 cg0Var3 = this.mViewLifecycleOwner;
        view2.getClass();
        view2.setTag(R.id.view_tree_view_model_store_owner, cg0Var3);
        View view3 = this.mView;
        cg0 cg0Var4 = this.mViewLifecycleOwner;
        view3.getClass();
        view3.setTag(R.id.view_tree_saved_state_registry_owner, cg0Var4);
        this.mViewLifecycleOwnerLiveData.mo939h(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.m399k();
        this.mLifecycleRegistry.m5053e(ds0.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new dy1(jd0.m3613k("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.m408t(1);
        if (this.mView != null) {
            cg0 cg0Var = this.mViewLifecycleOwner;
            cg0Var.m1215b();
            if (cg0Var.f1789c.f8452d.compareTo(es0.f3435c) >= 0) {
                this.mViewLifecycleOwner.m1214a(ds0.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new dy1(jd0.m3613k("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        ju1 ju1Var = av0.m721a(this).f3025b.f2643b;
        int i = ju1Var.f5534c;
        for (int i2 = 0; i2 < i; i2++) {
            ((bv0) ju1Var.f5533b[i2]).m1071i();
        }
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new dy1(jd0.m3613k("Fragment ", this, " did not call through to super.onDetach()"));
        }
        AbstractC0056t abstractC0056t = this.mChildFragmentManager;
        if (abstractC0056t.f705G) {
            return;
        }
        abstractC0056t.m399k();
        this.mChildFragmentManager = new hf0();
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m403o(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.m404p(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.m408t(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m1214a(ds0.ON_PAUSE);
        }
        this.mLifecycleRegistry.m5053e(ds0.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new dy1(jd0.m3613k("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return this.mChildFragmentManager.m407s(menu) | z;
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean zM365J = AbstractC0056t.m365J(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zM365J) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zM365J);
            onPrimaryNavigationFragmentChanged(zM365J);
            AbstractC0056t abstractC0056t = this.mChildFragmentManager;
            abstractC0056t.m388Z();
            abstractC0056t.m405q(abstractC0056t.f734w);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.m374L();
        this.mChildFragmentManager.m412x(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new dy1(jd0.m3613k("Fragment ", this, " did not call through to super.onResume()"));
        }
        os0 os0Var = this.mLifecycleRegistry;
        ds0 ds0Var = ds0.ON_RESUME;
        os0Var.m5053e(ds0Var);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f1789c.m5053e(ds0Var);
        }
        AbstractC0056t abstractC0056t = this.mChildFragmentManager;
        abstractC0056t.f703E = false;
        abstractC0056t.f704F = false;
        abstractC0056t.f710L.f744g = false;
        abstractC0056t.m408t(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m3473c(bundle);
        bundle.putParcelable("android:support:fragments", this.mChildFragmentManager.m381S());
    }

    public void performStart() {
        this.mChildFragmentManager.m374L();
        this.mChildFragmentManager.m412x(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new dy1(jd0.m3613k("Fragment ", this, " did not call through to super.onStart()"));
        }
        os0 os0Var = this.mLifecycleRegistry;
        ds0 ds0Var = ds0.ON_START;
        os0Var.m5053e(ds0Var);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f1789c.m5053e(ds0Var);
        }
        AbstractC0056t abstractC0056t = this.mChildFragmentManager;
        abstractC0056t.f703E = false;
        abstractC0056t.f704F = false;
        abstractC0056t.f710L.f744g = false;
        abstractC0056t.m408t(5);
    }

    public void performStop() {
        AbstractC0056t abstractC0056t = this.mChildFragmentManager;
        abstractC0056t.f704F = true;
        abstractC0056t.f710L.f744g = true;
        abstractC0056t.m408t(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m1214a(ds0.ON_STOP);
        }
        this.mLifecycleRegistry.m5053e(ds0.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new dy1(jd0.m3613k("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.m408t(2);
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        m354a().f9933s = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        AbstractC0056t abstractC0056t = this.mFragmentManager;
        if (abstractC0056t != null) {
            this.mPostponedHandler = abstractC0056t.f731t.f12590c;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public final <I, O> AbstractC1095m4 registerForActivityResult(AbstractC0815k4 abstractC0815k4, AbstractC1356r4 abstractC1356r4, InterfaceC0777j4 interfaceC0777j4) {
        return m358e(abstractC0815k4, new ay0(abstractC1356r4, 28), interfaceC0777j4);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i) {
        if (this.mHost == null) {
            f40.m2719o(jd0.m3613k("Fragment ", this, " not attached to Activity"));
            return;
        }
        AbstractC0056t parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f700B == null) {
            parentFragmentManager.f731t.getClass();
            return;
        }
        parentFragmentManager.f701C.addLast(new ef0(this.mWho, i));
        parentFragmentManager.f700B.mo4381a(strArr);
    }

    public final AbstractActivityC0053q requireActivity() {
        AbstractActivityC0053q activity = getActivity();
        if (activity != null) {
            return activity;
        }
        f40.m2719o(jd0.m3613k("Fragment ", this, " not attached to an activity."));
        return null;
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        f40.m2719o(jd0.m3613k("Fragment ", this, " does not have any arguments."));
        return null;
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        f40.m2719o(jd0.m3613k("Fragment ", this, " not attached to a context."));
        return null;
    }

    @Deprecated
    public final AbstractC0056t requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        f40.m2719o(jd0.m3613k("Fragment ", this, " not attached to a host."));
        return null;
    }

    public final AbstractComponentCallbacksC0048l requireParentFragment() {
        AbstractComponentCallbacksC0048l parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            f40.m2719o(jd0.m3613k("Fragment ", this, " is not attached to any Fragment or host"));
            return null;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        Context context = getContext();
        sb.append(" is not a child Fragment, it is directly attached to ");
        sb.append(context);
        throw new IllegalStateException(sb.toString());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        f40.m2719o(jd0.m3613k("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
        return null;
    }

    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.mChildFragmentManager.m380R(parcelable);
        AbstractC0056t abstractC0056t = this.mChildFragmentManager;
        abstractC0056t.f703E = false;
        abstractC0056t.f704F = false;
        abstractC0056t.f710L.f744g = false;
        abstractC0056t.m408t(1);
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            cg0 cg0Var = this.mViewLifecycleOwner;
            cg0Var.f1790d.m3472b(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new dy1(jd0.m3613k("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.m1214a(ds0.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        m354a().f9930p = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        m354a().f9929o = Boolean.valueOf(z);
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        m354a().f9916b = i;
        m354a().f9917c = i2;
        m354a().f9918d = i3;
        m354a().f9919e = i4;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
        } else {
            f40.m2719o("Fragment already added and state has been saved");
        }
    }

    public void setEnterSharedElementCallback(as1 as1Var) {
        m354a().getClass();
    }

    public void setEnterTransition(Object obj) {
        m354a().f9923i = obj;
    }

    public void setExitSharedElementCallback(as1 as1Var) {
        m354a().getClass();
    }

    public void setExitTransition(Object obj) {
        m354a().f9925k = obj;
    }

    public void setFocusedView(View view) {
        m354a().f9932r = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            ((C0052p) this.mHost).f695e.invalidateMenu();
        }
    }

    public void setInitialSavedState(te0 te0Var) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            f40.m2719o("Fragment already added");
            return;
        }
        if (te0Var == null || (bundle = te0Var.f10851a) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                ((C0052p) this.mHost).f695e.invalidateMenu();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        m354a();
        this.mAnimationInfo.f9920f = i;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        m354a().f9915a = z;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        m354a().f9931q = f;
    }

    public void setReenterTransition(Object obj) {
        m354a().f9926l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        mf0 mf0Var = nf0.f7396a;
        nf0.m4540b(new hi0(this, "Attempting to set retain instance for fragment " + this));
        nf0.m4539a(this).getClass();
        this.mRetainInstance = z;
        AbstractC0056t abstractC0056t = this.mFragmentManager;
        if (abstractC0056t == null) {
            this.mRetainInstanceChangedWhileDetached = true;
            return;
        }
        C0057u c0057u = abstractC0056t.f710L;
        if (z) {
            c0057u.m416c(this);
        } else {
            c0057u.m418e(this);
        }
    }

    public void setReturnTransition(Object obj) {
        m354a().f9924j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        m354a().f9927m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        m354a();
        re0 re0Var = this.mAnimationInfo;
        re0Var.f9921g = arrayList;
        re0Var.f9922h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        m354a().f9928n = obj;
    }

    @Deprecated
    public void setTargetFragment(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l, int i) {
        if (abstractComponentCallbacksC0048l != null) {
            mf0 mf0Var = nf0.f7396a;
            nf0.m4540b(new ii0(this, "Attempting to set target fragment " + abstractComponentCallbacksC0048l + " with request code " + i + " for fragment " + this));
            nf0.m4539a(this).getClass();
        }
        AbstractC0056t abstractC0056t = this.mFragmentManager;
        AbstractC0056t abstractC0056t2 = abstractComponentCallbacksC0048l != null ? abstractComponentCallbacksC0048l.mFragmentManager : null;
        if (abstractC0056t != null && abstractC0056t2 != null && abstractC0056t != abstractC0056t2) {
            f40.m2713i(jd0.m3613k("Fragment ", abstractComponentCallbacksC0048l, " must share the same FragmentManager to be set as a target fragment"));
            return;
        }
        for (AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048lM356c = abstractComponentCallbacksC0048l; abstractComponentCallbacksC0048lM356c != null; abstractComponentCallbacksC0048lM356c = abstractComponentCallbacksC0048lM356c.m356c(false)) {
            if (abstractComponentCallbacksC0048lM356c.equals(this)) {
                ca0.m1182n("Setting ", abstractComponentCallbacksC0048l, " as the target of ", this, " would create a target cycle");
                return;
            }
        }
        if (abstractComponentCallbacksC0048l == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || abstractComponentCallbacksC0048l.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = abstractComponentCallbacksC0048l;
        } else {
            this.mTargetWho = abstractComponentCallbacksC0048l.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        mf0 mf0Var = nf0.f7396a;
        nf0.m4540b(new lf0(this, "Attempting to set user visible hint to " + z + " for fragment " + this));
        nf0.m4539a(this).getClass();
        boolean z2 = false;
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            AbstractC0056t abstractC0056t = this.mFragmentManager;
            C0059w c0059wM394f = abstractC0056t.m394f(this);
            AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = c0059wM394f.f760c;
            if (abstractComponentCallbacksC0048l.mDeferStart) {
                if (abstractC0056t.f713b) {
                    abstractC0056t.f706H = true;
                } else {
                    abstractComponentCallbacksC0048l.mDeferStart = false;
                    c0059wM394f.m427i();
                }
            }
        }
        this.mUserVisibleHint = z;
        if (this.mState < 5 && !z) {
            z2 = true;
        }
        this.mDeferStart = z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        xe0 xe0Var = this.mHost;
        if (xe0Var == null) {
            return false;
        }
        AbstractActivityC0053q abstractActivityC0053q = ((C0052p) xe0Var).f695e;
        if (!AbstractC1408sj.m6104a() && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 32) {
            return AbstractC0664g4.m2926a(abstractActivityC0053q, str);
        }
        return i == 31 ? AbstractC0627f4.m2706b(abstractActivityC0053q, str) : AbstractC0590e4.m2494c(abstractActivityC0053q, str);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        xe0 xe0Var = this.mHost;
        if (xe0Var != null) {
            AbstractC0075au.startActivity(xe0Var.f12589b, intent, bundle);
        } else {
            f40.m2719o(jd0.m3613k("Fragment ", this, " not attached to Activity"));
        }
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (this.mHost == null) {
            f40.m2719o(jd0.m3613k("Fragment ", this, " not attached to Activity"));
            return;
        }
        AbstractC0056t parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f737z != null) {
            parentFragmentManager.f701C.addLast(new ef0(this.mWho, i));
            if (intent != null && bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.f737z.mo4381a(intent);
            return;
        }
        xe0 xe0Var = parentFragmentManager.f731t;
        if (i == -1) {
            AbstractC0075au.startActivity(xe0Var.f12589b, intent, bundle);
        } else {
            xe0Var.getClass();
            f40.m2719o("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.mHost == null) {
            f40.m2719o(jd0.m3613k("Fragment ", this, " not attached to Activity"));
            return;
        }
        if (AbstractC0056t.m363G(2)) {
            toString();
            Objects.toString(intentSender);
            Objects.toString(intent);
            Objects.toString(bundle);
        }
        AbstractC0056t parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f699A == null) {
            xe0 xe0Var = parentFragmentManager.f731t;
            if (i == -1) {
                AbstractC0122c4.m1125c(xe0Var.f12588a, intentSender, i, intent, i2, i3, i4, bundle);
                return;
            } else {
                xe0Var.getClass();
                f40.m2719o("Starting intent sender with a requestCode requires a FragmentActivity host");
                return;
            }
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (AbstractC0056t.m363G(2)) {
                bundle.toString();
                intent2.toString();
                Objects.toString(this);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        intentSender.getClass();
        eo0 eo0Var = new eo0(intentSender, intent2, i2, i3);
        parentFragmentManager.f701C.addLast(new ef0(this.mWho, i));
        if (AbstractC0056t.m363G(2)) {
            toString();
        }
        parentFragmentManager.f699A.mo4381a(eo0Var);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !m354a().f9933s) {
            return;
        }
        if (this.mHost == null) {
            m354a().f9933s = false;
        } else if (Looper.myLooper() != this.mHost.f12590c.getLooper()) {
            this.mHost.f12590c.postAtFrontOfQueue(new pe0(this, 1));
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final <I, O> AbstractC1095m4 registerForActivityResult(AbstractC0815k4 abstractC0815k4, InterfaceC0777j4 interfaceC0777j4) {
        return m358e(abstractC0815k4, new C0047k(this), interfaceC0777j4);
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void onAttachFragment(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l) {
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void postponeEnterTransition() {
        m354a().f9933s = true;
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    @Deprecated
    public static AbstractComponentCallbacksC0048l instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }
}

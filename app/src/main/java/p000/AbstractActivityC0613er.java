package p000;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.sousasantoslogic.sspro.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: er */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0613er extends AbstractActivityC0576dr implements w72, vj0, jp1, sa1, InterfaceC1393s4, ta1, ab1, wa1, xa1, k31 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final AbstractC1356r4 mActivityResultRegistry;
    private int mContentLayoutId;
    private u72 mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    final lg0 mFullyDrawnReporter;
    private final AtomicInteger mNextLocalRequestCode;
    private ra1 mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<InterfaceC0615et> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC0615et> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC0615et> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<InterfaceC0615et> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC0615et> mOnTrimMemoryListeners;
    final InterfaceExecutorC0109br mReportFullyDrawnExecutor;
    final ip1 mSavedStateRegistryController;
    private v72 mViewModelStore;
    final C1344qt mContextAwareHelper = new C1344qt();
    private final o31 mMenuHostHelper = new o31(new RunnableC1430t4(this, 7));
    private final os0 mLifecycleRegistry = new os0(this);

    public AbstractActivityC0613er() {
        ip1 ip1Var = new ip1(this);
        this.mSavedStateRegistryController = ip1Var;
        this.mOnBackPressedDispatcher = null;
        ViewTreeObserverOnDrawListenerC0540cr viewTreeObserverOnDrawListenerC0540cr = new ViewTreeObserverOnDrawListenerC0540cr(this);
        this.mReportFullyDrawnExecutor = viewTreeObserverOnDrawListenerC0540cr;
        this.mFullyDrawnReporter = new lg0(viewTreeObserverOnDrawListenerC0540cr, new C1452tq(this, 0));
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new C1563wq(this);
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() == null) {
            f40.m2719o("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        getLifecycle().mo2848a(new C1600xq(this, 1));
        getLifecycle().mo2848a(new C1600xq(this, 0));
        getLifecycle().mo2848a(new C1600xq(this, 2));
        ip1Var.m3471a();
        hp0.m3222q(this);
        getSavedStateRegistry().m3235c(ACTIVITY_RESULT_TAG, new C1489uq(this, 0));
        addOnContextAvailableListener(new ua1() { // from class: vq
            @Override // p000.ua1
            /* JADX INFO: renamed from: a */
            public final void mo360a(AbstractActivityC0613er abstractActivityC0613er) {
                AbstractActivityC0613er.m2636a(this.f11742a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m2636a(AbstractActivityC0613er abstractActivityC0613er) {
        Bundle bundleM3233a = abstractActivityC0613er.getSavedStateRegistry().m3233a(ACTIVITY_RESULT_TAG);
        if (bundleM3233a != null) {
            AbstractC1356r4 abstractC1356r4 = abstractActivityC0613er.mActivityResultRegistry;
            HashMap map = abstractC1356r4.f9710b;
            HashMap map2 = abstractC1356r4.f9709a;
            Bundle bundle = abstractC1356r4.f9715g;
            ArrayList<Integer> integerArrayList = bundleM3233a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleM3233a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            abstractC1356r4.f9712d = bundleM3233a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            bundle.putAll(bundleM3233a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            for (int i = 0; i < stringArrayList.size(); i++) {
                String str = stringArrayList.get(i);
                if (map.containsKey(str)) {
                    Integer num = (Integer) map.remove(str);
                    if (!bundle.containsKey(str)) {
                        map2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                num2.intValue();
                String str2 = stringArrayList.get(i);
                map2.put(num2, str2);
                abstractC1356r4.f9710b.put(str2, num2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static Bundle m2637b(AbstractActivityC0613er abstractActivityC0613er) {
        Bundle bundle = new Bundle();
        AbstractC1356r4 abstractC1356r4 = abstractActivityC0613er.mActivityResultRegistry;
        abstractC1356r4.getClass();
        HashMap map = abstractC1356r4.f9710b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(abstractC1356r4.f9712d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) abstractC1356r4.f9715g.clone());
        return bundle;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        ((ViewTreeObserverOnDrawListenerC0540cr) this.mReportFullyDrawnExecutor).m2117a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(final h41 h41Var, ms0 ms0Var) {
        final o31 o31Var = this.mMenuHostHelper;
        o31Var.f7635b.add(h41Var);
        o31Var.f7634a.run();
        fs0 lifecycle = ms0Var.getLifecycle();
        HashMap map = o31Var.f7636c;
        n31 n31Var = (n31) map.remove(h41Var);
        if (n31Var != null) {
            n31Var.f7184a.mo2849b(n31Var.f7185b);
            n31Var.f7185b = null;
        }
        map.put(h41Var, new n31(lifecycle, new ks0() { // from class: m31
            @Override // p000.ks0
            /* JADX INFO: renamed from: c */
            public final void mo157c(ms0 ms0Var2, ds0 ds0Var) {
                ds0 ds0Var2 = ds0.ON_DESTROY;
                o31 o31Var2 = o31Var;
                if (ds0Var == ds0Var2) {
                    o31Var2.m4707b(h41Var);
                } else {
                    o31Var2.getClass();
                }
            }
        }));
    }

    @Override // p000.ta1
    public final void addOnConfigurationChangedListener(InterfaceC0615et interfaceC0615et) {
        this.mOnConfigurationChangedListeners.add(interfaceC0615et);
    }

    public final void addOnContextAvailableListener(ua1 ua1Var) {
        C1344qt c1344qt = this.mContextAwareHelper;
        c1344qt.getClass();
        ua1Var.getClass();
        AbstractActivityC0613er abstractActivityC0613er = c1344qt.f9575b;
        if (abstractActivityC0613er != null) {
            ua1Var.mo360a(abstractActivityC0613er);
        }
        c1344qt.f9574a.add(ua1Var);
    }

    @Override // p000.wa1
    public final void addOnMultiWindowModeChangedListener(InterfaceC0615et interfaceC0615et) {
        this.mOnMultiWindowModeChangedListeners.add(interfaceC0615et);
    }

    public final void addOnNewIntentListener(InterfaceC0615et interfaceC0615et) {
        this.mOnNewIntentListeners.add(interfaceC0615et);
    }

    @Override // p000.xa1
    public final void addOnPictureInPictureModeChangedListener(InterfaceC0615et interfaceC0615et) {
        this.mOnPictureInPictureModeChangedListeners.add(interfaceC0615et);
    }

    @Override // p000.ab1
    public final void addOnTrimMemoryListener(InterfaceC0615et interfaceC0615et) {
        this.mOnTrimMemoryListeners.add(interfaceC0615et);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            C0072ar c0072ar = (C0072ar) getLastNonConfigurationInstance();
            if (c0072ar != null) {
                this.mViewModelStore = c0072ar.f1036b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new v72();
            }
        }
    }

    @Override // p000.InterfaceC1393s4
    public final AbstractC1356r4 getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // p000.vj0
    public AbstractC0076av getDefaultViewModelCreationExtras() {
        a71 a71Var = new a71();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = a71Var.f1067a;
        if (application != null) {
            linkedHashMap.put(t72.f10798e, getApplication());
        }
        linkedHashMap.put(hp0.f4651o, this);
        linkedHashMap.put(hp0.f4652p, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(hp0.f4653q, getIntent().getExtras());
        }
        return a71Var;
    }

    public u72 getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new kp1(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    public lg0 getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        C0072ar c0072ar = (C0072ar) getLastNonConfigurationInstance();
        if (c0072ar != null) {
            return c0072ar.f1035a;
        }
        return null;
    }

    @Override // p000.ms0
    public fs0 getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // p000.sa1
    public final ra1 getOnBackPressedDispatcher() {
        if (this.mOnBackPressedDispatcher == null) {
            int i = 3;
            this.mOnBackPressedDispatcher = new ra1(new RunnableC1621ya(this, i));
            getLifecycle().mo2848a(new C1600xq(this, i));
        }
        return this.mOnBackPressedDispatcher;
    }

    @Override // p000.jp1
    public final hp1 getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f5128b;
    }

    @Override // p000.w72
    public v72 getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        f40.m2719o("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        return null;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.mActivityResultRegistry.m5688a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onBackPressed() {
        getOnBackPressedDispatcher().m5754b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<InterfaceC0615et> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // p000.AbstractActivityC0576dr, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.m3472b(bundle);
        C1344qt c1344qt = this.mContextAwareHelper;
        c1344qt.getClass();
        c1344qt.f9575b = this;
        Iterator it = c1344qt.f9574a.iterator();
        while (it.hasNext()) {
            ((ua1) it.next()).mo360a(this);
        }
        super.onCreate(bundle);
        int i = cl1.f1855b;
        al1.m171b(this);
        int i2 = this.mContentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        o31 o31Var = this.mMenuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = o31Var.f7635b.iterator();
        while (it.hasNext()) {
            ((bf0) ((h41) it.next())).f1357a.m398j(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mMenuHostHelper.m4706a(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<InterfaceC0615et> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new w61(z, 0));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator<InterfaceC0615et> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator it = this.mMenuHostHelper.f7635b.iterator();
        while (it.hasNext()) {
            ((bf0) ((h41) it.next())).f1357a.m404p(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<InterfaceC0615et> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new ed1(z, 0));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = this.mMenuHostHelper.f7635b.iterator();
        while (it.hasNext()) {
            ((bf0) ((h41) it.next())).f1357a.m407s(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.m5688a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0072ar c0072ar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        v72 v72Var = this.mViewModelStore;
        if (v72Var == null && (c0072ar = (C0072ar) getLastNonConfigurationInstance()) != null) {
            v72Var = c0072ar.f1036b;
        }
        if (v72Var == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0072ar c0072ar2 = new C0072ar();
        c0072ar2.f1035a = objOnRetainCustomNonConfigurationInstance;
        c0072ar2.f1036b = v72Var;
        return c0072ar2;
    }

    @Override // p000.AbstractActivityC0576dr, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        fs0 lifecycle = getLifecycle();
        if (lifecycle instanceof os0) {
            os0 os0Var = (os0) lifecycle;
            os0Var.m5052d("setCurrentState");
            os0Var.m5054f(es0.f3435c);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m3473c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<InterfaceC0615et> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.f9575b;
    }

    public final <I, O> AbstractC1095m4 registerForActivityResult(AbstractC0815k4 abstractC0815k4, AbstractC1356r4 abstractC1356r4, InterfaceC0777j4 interfaceC0777j4) {
        return abstractC1356r4.m5691d("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, abstractC0815k4, interfaceC0777j4);
    }

    @Override // p000.k31
    public void removeMenuProvider(h41 h41Var) {
        this.mMenuHostHelper.m4707b(h41Var);
    }

    @Override // p000.ta1
    public final void removeOnConfigurationChangedListener(InterfaceC0615et interfaceC0615et) {
        this.mOnConfigurationChangedListeners.remove(interfaceC0615et);
    }

    public final void removeOnContextAvailableListener(ua1 ua1Var) {
        C1344qt c1344qt = this.mContextAwareHelper;
        c1344qt.getClass();
        ua1Var.getClass();
        c1344qt.f9574a.remove(ua1Var);
    }

    @Override // p000.wa1
    public final void removeOnMultiWindowModeChangedListener(InterfaceC0615et interfaceC0615et) {
        this.mOnMultiWindowModeChangedListeners.remove(interfaceC0615et);
    }

    public final void removeOnNewIntentListener(InterfaceC0615et interfaceC0615et) {
        this.mOnNewIntentListeners.remove(interfaceC0615et);
    }

    @Override // p000.xa1
    public final void removeOnPictureInPictureModeChangedListener(InterfaceC0615et interfaceC0615et) {
        this.mOnPictureInPictureModeChangedListeners.remove(interfaceC0615et);
    }

    @Override // p000.ab1
    public final void removeOnTrimMemoryListener(InterfaceC0615et interfaceC0615et) {
        this.mOnTrimMemoryListeners.remove(interfaceC0615et);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (rc2.m5771T()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            lg0 lg0Var = this.mFullyDrawnReporter;
            synchronized (lg0Var.f6347a) {
                try {
                    lg0Var.f6348b = true;
                    ArrayList arrayList = lg0Var.f6349c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((mg0) obj).invoke();
                    }
                    lg0Var.f6349c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        ((ViewTreeObserverOnDrawListenerC0540cr) this.mReportFullyDrawnExecutor).m2117a(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        ((ViewTreeObserverOnDrawListenerC0540cr) this.mReportFullyDrawnExecutor).m2117a(getWindow().getDecorView());
        super.setContentView(view);
    }

    public final <I, O> AbstractC1095m4 registerForActivityResult(AbstractC0815k4 abstractC0815k4, InterfaceC0777j4 interfaceC0777j4) {
        return registerForActivityResult(abstractC0815k4, this.mActivityResultRegistry, interfaceC0777j4);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        ((ViewTreeObserverOnDrawListenerC0540cr) this.mReportFullyDrawnExecutor).m2117a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<InterfaceC0615et> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new w61(z));
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<InterfaceC0615et> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new ed1(z));
        }
    }

    @Override // p000.k31
    public void addMenuProvider(h41 h41Var) {
        o31 o31Var = this.mMenuHostHelper;
        o31Var.f7635b.add(h41Var);
        o31Var.f7634a.run();
    }

    public void addMenuProvider(final h41 h41Var, ms0 ms0Var, final es0 es0Var) {
        final o31 o31Var = this.mMenuHostHelper;
        o31Var.getClass();
        fs0 lifecycle = ms0Var.getLifecycle();
        HashMap map = o31Var.f7636c;
        n31 n31Var = (n31) map.remove(h41Var);
        if (n31Var != null) {
            n31Var.f7184a.mo2849b(n31Var.f7185b);
            n31Var.f7185b = null;
        }
        map.put(h41Var, new n31(lifecycle, new ks0() { // from class: l31
            @Override // p000.ks0
            /* JADX INFO: renamed from: c */
            public final void mo157c(ms0 ms0Var2, ds0 ds0Var) {
                ds0 ds0Var2;
                o31 o31Var2 = o31Var;
                o31Var2.getClass();
                Runnable runnable = o31Var2.f7634a;
                CopyOnWriteArrayList copyOnWriteArrayList = o31Var2.f7635b;
                ds0.Companion.getClass();
                es0 es0Var2 = es0Var;
                es0Var2.getClass();
                int iOrdinal = es0Var2.ordinal();
                ds0 ds0Var3 = null;
                if (iOrdinal == 2) {
                    ds0Var2 = ds0.ON_CREATE;
                } else if (iOrdinal != 3) {
                    ds0Var2 = iOrdinal != 4 ? null : ds0.ON_RESUME;
                } else {
                    ds0Var2 = ds0.ON_START;
                }
                h41 h41Var2 = h41Var;
                if (ds0Var == ds0Var2) {
                    copyOnWriteArrayList.add(h41Var2);
                    runnable.run();
                    return;
                }
                ds0 ds0Var4 = ds0.ON_DESTROY;
                if (ds0Var == ds0Var4) {
                    o31Var2.m4707b(h41Var2);
                    return;
                }
                int iOrdinal2 = es0Var2.ordinal();
                if (iOrdinal2 == 2) {
                    ds0Var3 = ds0Var4;
                } else if (iOrdinal2 == 3) {
                    ds0Var3 = ds0.ON_STOP;
                } else if (iOrdinal2 == 4) {
                    ds0Var3 = ds0.ON_PAUSE;
                }
                if (ds0Var == ds0Var3) {
                    copyOnWriteArrayList.remove(h41Var2);
                    runnable.run();
                }
            }
        }));
    }
}

package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p000.AbstractActivityC0613er;
import p000.AbstractC0122c4;
import p000.AbstractC0554d4;
import p000.InterfaceC0615et;
import p000.as1;
import p000.av0;
import p000.cg0;
import p000.ds0;
import p000.es0;
import p000.gp1;
import p000.hf0;
import p000.os0;
import p000.ua1;
import p000.we0;

/* JADX INFO: renamed from: androidx.fragment.app.q */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0053q extends AbstractActivityC0613er {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    boolean mResumed;
    final we0 mFragments = new we0(new C0052p(this));
    final os0 mFragmentLifecycleRegistry = new os0(this);
    boolean mStopped = true;

    public AbstractActivityC0053q() {
        getSavedStateRegistry().m3235c(LIFECYCLE_TAG, new gp1() { // from class: androidx.fragment.app.m
            @Override // p000.gp1
            /* JADX INFO: renamed from: a */
            public final Bundle mo359a() {
                AbstractActivityC0053q abstractActivityC0053q = this.f691a;
                abstractActivityC0053q.markFragmentsCreated();
                abstractActivityC0053q.mFragmentLifecycleRegistry.m5053e(ds0.ON_STOP);
                return new Bundle();
            }
        });
        final int i = 0;
        addOnConfigurationChangedListener(new InterfaceC0615et(this) { // from class: androidx.fragment.app.n

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractActivityC0053q f693b;

            {
                this.f693b = this;
            }

            @Override // p000.InterfaceC0615et
            public final void accept(Object obj) {
                int i2 = i;
                AbstractActivityC0053q abstractActivityC0053q = this.f693b;
                switch (i2) {
                    case 0:
                        abstractActivityC0053q.mFragments.m6761a();
                        break;
                    default:
                        abstractActivityC0053q.mFragments.m6761a();
                        break;
                }
            }
        });
        final int i2 = 1;
        addOnNewIntentListener(new InterfaceC0615et(this) { // from class: androidx.fragment.app.n

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractActivityC0053q f693b;

            {
                this.f693b = this;
            }

            @Override // p000.InterfaceC0615et
            public final void accept(Object obj) {
                int i3 = i2;
                AbstractActivityC0053q abstractActivityC0053q = this.f693b;
                switch (i3) {
                    case 0:
                        abstractActivityC0053q.mFragments.m6761a();
                        break;
                    default:
                        abstractActivityC0053q.mFragments.m6761a();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new ua1() { // from class: androidx.fragment.app.o
            @Override // p000.ua1
            /* JADX INFO: renamed from: a */
            public final void mo360a(AbstractActivityC0613er abstractActivityC0613er) {
                C0052p c0052p = this.f694a.mFragments.f12090a;
                c0052p.f12591d.m390b(c0052p, c0052p, null);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static boolean m362c(AbstractC0056t abstractC0056t) {
        boolean zM362c = false;
        for (AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l : abstractC0056t.f714c.m437f()) {
            if (abstractComponentCallbacksC0048l != null) {
                if (abstractComponentCallbacksC0048l.getHost() != null) {
                    zM362c |= m362c(abstractComponentCallbacksC0048l.getChildFragmentManager());
                }
                cg0 cg0Var = abstractComponentCallbacksC0048l.mViewLifecycleOwner;
                es0 es0Var = es0.f3435c;
                es0 es0Var2 = es0.f3436d;
                if (cg0Var != null) {
                    cg0Var.m1215b();
                    if (cg0Var.f1789c.f8452d.compareTo(es0Var2) >= 0) {
                        os0 os0Var = abstractComponentCallbacksC0048l.mViewLifecycleOwner.f1789c;
                        os0Var.m5052d("setCurrentState");
                        os0Var.m5054f(es0Var);
                        zM362c = true;
                    }
                }
                if (abstractComponentCallbacksC0048l.mLifecycleRegistry.f8452d.compareTo(es0Var2) >= 0) {
                    os0 os0Var2 = abstractComponentCallbacksC0048l.mLifecycleRegistry;
                    os0Var2.m5052d("setCurrentState");
                    os0Var2.m5054f(es0Var);
                    zM362c = true;
                }
            }
        }
        return zM362c;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f12090a.f12591d.f717f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                av0.m721a(this).m2390b(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.f12090a.f12591d.m409u(str, fileDescriptor, printWriter, strArr);
        }
    }

    public AbstractC0056t getSupportFragmentManager() {
        return this.mFragments.f12090a.f12591d;
    }

    @Deprecated
    public av0 getSupportLoaderManager() {
        return av0.m721a(this);
    }

    public void markFragmentsCreated() {
        while (m362c(getSupportFragmentManager())) {
        }
    }

    @Override // p000.AbstractActivityC0613er, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.m6761a();
        super.onActivityResult(i, i2, intent);
    }

    @Override // p000.AbstractActivityC0613er, p000.AbstractActivityC0576dr, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.m5053e(ds0.ON_CREATE);
        hf0 hf0Var = this.mFragments.f12090a.f12591d;
        hf0Var.f703E = false;
        hf0Var.f704F = false;
        hf0Var.f710L.f744g = false;
        hf0Var.m408t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f12090a.f12591d.m399k();
        this.mFragmentLifecycleRegistry.m5053e(ds0.ON_DESTROY);
    }

    @Override // p000.AbstractActivityC0613er, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.f12090a.f12591d.m397i(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f12090a.f12591d.m408t(5);
        this.mFragmentLifecycleRegistry.m5053e(ds0.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // p000.AbstractActivityC0613er, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.m6761a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.m6761a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f12090a.f12591d.m412x(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.m5053e(ds0.ON_RESUME);
        hf0 hf0Var = this.mFragments.f12090a.f12591d;
        hf0Var.f703E = false;
        hf0Var.f704F = false;
        hf0Var.f710L.f744g = false;
        hf0Var.m408t(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.m6761a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            hf0 hf0Var = this.mFragments.f12090a.f12591d;
            hf0Var.f703E = false;
            hf0Var.f704F = false;
            hf0Var.f710L.f744g = false;
            hf0Var.m408t(4);
        }
        this.mFragments.f12090a.f12591d.m412x(true);
        this.mFragmentLifecycleRegistry.m5053e(ds0.ON_START);
        hf0 hf0Var2 = this.mFragments.f12090a.f12591d;
        hf0Var2.f703E = false;
        hf0Var2.f704F = false;
        hf0Var2.f710L.f744g = false;
        hf0Var2.m408t(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m6761a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        hf0 hf0Var = this.mFragments.f12090a.f12591d;
        hf0Var.f704F = true;
        hf0Var.f710L.f744g = true;
        hf0Var.m408t(4);
        this.mFragmentLifecycleRegistry.m5053e(ds0.ON_STOP);
    }

    public void setEnterSharedElementCallback(as1 as1Var) {
        AbstractC0554d4.m2221c(this, null);
    }

    public void setExitSharedElementCallback(as1 as1Var) {
        AbstractC0554d4.m2222d(this, null);
    }

    public void startActivityFromFragment(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            AbstractC0122c4.m1124b(this, intent, -1, bundle);
        } else {
            abstractComponentCallbacksC0048l.startActivityForResult(intent, i, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            AbstractC0122c4.m1125c(this, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            abstractComponentCallbacksC0048l.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        AbstractC0554d4.m2219a(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        AbstractC0554d4.m2220b(this);
    }

    public void supportStartPostponedEnterTransition() {
        AbstractC0554d4.m2223e(this);
    }

    public void startActivityFromFragment(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l, Intent intent, int i) {
        startActivityFromFragment(abstractComponentCallbacksC0048l, intent, i, (Bundle) null);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Deprecated
    public void onAttachFragment(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l) {
    }

    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }
}

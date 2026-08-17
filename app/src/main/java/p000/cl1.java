package p000;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class cl1 extends Fragment {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f1855b = 0;

    /* JADX INFO: renamed from: a */
    public pn0 f1856a;

    /* JADX INFO: renamed from: cl1$a */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class C0140a implements Application.ActivityLifecycleCallbacks {
        public static final bl1 Companion = new bl1();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            activity.getClass();
            activity.registerActivityLifecycleCallbacks(new C0140a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            activity.getClass();
            int i = cl1.f1855b;
            al1.m170a(activity, ds0.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            int i = cl1.f1855b;
            al1.m170a(activity, ds0.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            int i = cl1.f1855b;
            al1.m170a(activity, ds0.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            activity.getClass();
            int i = cl1.f1855b;
            al1.m170a(activity, ds0.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            activity.getClass();
            int i = cl1.f1855b;
            al1.m170a(activity, ds0.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            activity.getClass();
            int i = cl1.f1855b;
            al1.m170a(activity, ds0.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            activity.getClass();
            bundle.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            activity.getClass();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1229a(ds0 ds0Var) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            activity.getClass();
            al1.m170a(activity, ds0Var);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m1229a(ds0.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m1229a(ds0.ON_DESTROY);
        this.f1856a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m1229a(ds0.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        pn0 pn0Var = this.f1856a;
        if (pn0Var != null) {
            ((kg1) pn0Var.f8968a).m3827a();
        }
        m1229a(ds0.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        pn0 pn0Var = this.f1856a;
        if (pn0Var != null) {
            kg1 kg1Var = (kg1) pn0Var.f8968a;
            int i = kg1Var.f5798a + 1;
            kg1Var.f5798a = i;
            if (i == 1 && kg1Var.f5801d) {
                kg1Var.f5803f.m5053e(ds0.ON_START);
                kg1Var.f5801d = false;
            }
        }
        m1229a(ds0.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m1229a(ds0.ON_STOP);
    }
}

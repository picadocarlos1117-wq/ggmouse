package p000;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class jg1 extends j60 {
    final /* synthetic */ kg1 this$0;

    /* JADX INFO: renamed from: jg1$a */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class C0790a extends j60 {
        final /* synthetic */ kg1 this$0;

        public C0790a(kg1 kg1Var) {
            this.this$0 = kg1Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.m3827a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            kg1 kg1Var = this.this$0;
            int i = kg1Var.f5798a + 1;
            kg1Var.f5798a = i;
            if (i == 1 && kg1Var.f5801d) {
                kg1Var.f5803f.m5053e(ds0.ON_START);
                kg1Var.f5801d = false;
            }
        }
    }

    public jg1(kg1 kg1Var) {
        this.this$0 = kg1Var;
    }

    @Override // p000.j60, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = cl1.f1855b;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentFindFragmentByTag.getClass();
            ((cl1) fragmentFindFragmentByTag).f1856a = this.this$0.f5805m;
        }
    }

    @Override // p000.j60, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        kg1 kg1Var = this.this$0;
        int i = kg1Var.f5799b - 1;
        kg1Var.f5799b = i;
        if (i == 0) {
            Handler handler = kg1Var.f5802e;
            handler.getClass();
            handler.postDelayed(kg1Var.f5804g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        ig1.m3432a(activity, new C0790a(this.this$0));
    }

    @Override // p000.j60, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        kg1 kg1Var = this.this$0;
        int i = kg1Var.f5798a - 1;
        kg1Var.f5798a = i;
        if (i == 0 && kg1Var.f5800c) {
            kg1Var.f5803f.m5053e(ds0.ON_STOP);
            kg1Var.f5801d = true;
        }
    }
}

package p000;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class al1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m170a(Activity activity, ds0 ds0Var) {
        ds0Var.getClass();
        if (activity instanceof ms0) {
            fs0 lifecycle = ((ms0) activity).getLifecycle();
            if (lifecycle instanceof os0) {
                ((os0) lifecycle).m5053e(ds0Var);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m171b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            cl1.C0140a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new cl1.C0140a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new cl1(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}

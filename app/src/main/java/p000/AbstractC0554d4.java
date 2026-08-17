package p000;

import android.app.Activity;
import android.app.SharedElementCallback;

/* JADX INFO: renamed from: d4 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0554d4 {
    /* JADX INFO: renamed from: a */
    public static void m2219a(Activity activity) {
        activity.finishAfterTransition();
    }

    /* JADX INFO: renamed from: b */
    public static void m2220b(Activity activity) {
        activity.postponeEnterTransition();
    }

    /* JADX INFO: renamed from: c */
    public static void m2221c(Activity activity, SharedElementCallback sharedElementCallback) {
        activity.setEnterSharedElementCallback(sharedElementCallback);
    }

    /* JADX INFO: renamed from: d */
    public static void m2222d(Activity activity, SharedElementCallback sharedElementCallback) {
        activity.setExitSharedElementCallback(sharedElementCallback);
    }

    /* JADX INFO: renamed from: e */
    public static void m2223e(Activity activity) {
        activity.startPostponedEnterTransition();
    }
}

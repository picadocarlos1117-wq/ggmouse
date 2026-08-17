package p000;

import android.app.Activity;
import android.app.SharedElementCallback;

/* JADX INFO: renamed from: e4 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0590e4 {
    /* JADX INFO: renamed from: a */
    public static void m2492a(Object obj) {
        ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
    }

    /* JADX INFO: renamed from: b */
    public static void m2493b(Activity activity, String[] strArr, int i) {
        activity.requestPermissions(strArr, i);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2494c(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }
}

package p000;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a81 {
    /* JADX INFO: renamed from: a */
    public static Intent m112a(Activity activity) {
        return activity.getParentActivityIntent();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m113b(Activity activity, Intent intent) {
        return activity.navigateUpTo(intent);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m114c(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }
}

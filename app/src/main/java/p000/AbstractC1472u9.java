package p000;

import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: renamed from: u9 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1472u9 {
    /* JADX INFO: renamed from: a */
    public static int m6407a(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    /* JADX INFO: renamed from: b */
    public static String m6408b(Context context) {
        return context.getOpPackageName();
    }

    /* JADX INFO: renamed from: c */
    public static AppOpsManager m6409c(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }
}

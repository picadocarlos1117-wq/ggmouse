package p000;

import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: renamed from: t9 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1435t9 {
    /* JADX INFO: renamed from: a */
    public static <T> T m6250a(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    /* JADX INFO: renamed from: b */
    public static int m6251b(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOp(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public static int m6252c(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    /* JADX INFO: renamed from: d */
    public static String m6253d(String str) {
        return AppOpsManager.permissionToOp(str);
    }
}

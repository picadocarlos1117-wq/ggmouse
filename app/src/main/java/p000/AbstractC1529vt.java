package p000;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: vt */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1529vt {
    /* JADX INFO: renamed from: a */
    public static Context m6657a(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    /* JADX INFO: renamed from: b */
    public static File m6658b(Context context) {
        return context.getDataDir();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m6659c(Context context) {
        return context.isDeviceProtectedStorage();
    }
}

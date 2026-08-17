package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: renamed from: tt */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1455tt {
    /* JADX INFO: renamed from: a */
    public static File m6336a(Context context) {
        return context.getCodeCacheDir();
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m6337b(Context context, int i) {
        return context.getDrawable(i);
    }

    /* JADX INFO: renamed from: c */
    public static File m6338c(Context context) {
        return context.getNoBackupFilesDir();
    }
}

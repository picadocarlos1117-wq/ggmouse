package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w62 {
    /* JADX INFO: renamed from: a */
    public static WindowInsets m6724a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: b */
    public static WindowInsets m6725b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: c */
    public static void m6726c(View view) {
        view.requestApplyInsets();
    }
}

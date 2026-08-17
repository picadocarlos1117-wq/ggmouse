package p000;

import android.app.LocaleManager;
import android.os.LocaleList;

/* JADX INFO: renamed from: d7 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0557d7 {
    /* JADX INFO: renamed from: a */
    public static LocaleList m2243a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    /* JADX INFO: renamed from: b */
    public static void m2244b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}

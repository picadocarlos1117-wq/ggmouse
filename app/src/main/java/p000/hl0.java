package p000;

import android.icu.util.ULocale;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hl0 {
    /* JADX INFO: renamed from: a */
    public static ULocale m3177a(Object obj) {
        return ULocale.addLikelySubtags((ULocale) obj);
    }

    /* JADX INFO: renamed from: b */
    public static ULocale m3178b(Locale locale) {
        return ULocale.forLocale(locale);
    }

    /* JADX INFO: renamed from: c */
    public static String m3179c(Object obj) {
        return ((ULocale) obj).getScript();
    }
}

package p000;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: renamed from: i7 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0741i7 {
    /* JADX INFO: renamed from: a */
    public static void m3365a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    /* JADX INFO: renamed from: b */
    public static ov0 m3366b(Configuration configuration) {
        return ov0.m5066a(configuration.getLocales().toLanguageTags());
    }

    /* JADX INFO: renamed from: c */
    public static void m3367c(ov0 ov0Var) {
        LocaleList.setDefault(LocaleList.forLanguageTags(ov0Var.f8496a.f9178a.toLanguageTags()));
    }

    /* JADX INFO: renamed from: d */
    public static void m3368d(Configuration configuration, ov0 ov0Var) {
        configuration.setLocales(LocaleList.forLanguageTags(ov0Var.f8496a.f9178a.toLanguageTags()));
    }
}

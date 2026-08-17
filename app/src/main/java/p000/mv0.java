package p000;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mv0 {

    /* JADX INFO: renamed from: a */
    public static final Locale[] f7107a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    /* JADX INFO: renamed from: a */
    public static Locale m4460a(String str) {
        return Locale.forLanguageTag(str);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4461b(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (locale.getLanguage().equals(locale2.getLanguage())) {
            Locale[] localeArr = f7107a;
            for (Locale locale3 : localeArr) {
                if (!locale3.equals(locale)) {
                }
            }
            for (Locale locale4 : localeArr) {
                if (!locale4.equals(locale2)) {
                }
            }
            String strM3179c = hl0.m3179c(hl0.m3177a(hl0.m3178b(locale)));
            if (!strM3179c.isEmpty()) {
                return strM3179c.equals(hl0.m3179c(hl0.m3177a(hl0.m3178b(locale2))));
            }
            String country = locale.getCountry();
            if (country.isEmpty() || country.equals(locale2.getCountry())) {
                return true;
            }
        }
        return false;
    }
}

package p000;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nv0 {
    /* JADX INFO: renamed from: a */
    public static LocaleList m4605a(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    /* JADX INFO: renamed from: b */
    public static LocaleList m4606b() {
        return LocaleList.getAdjustedDefault();
    }

    /* JADX INFO: renamed from: c */
    public static LocaleList m4607c() {
        return LocaleList.getDefault();
    }
}

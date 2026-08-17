package p000;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: renamed from: sj */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1408sj {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f10416a = 0;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            int i2 = AbstractC1371rj.f10058a;
        }
        if (i >= 30) {
            int i3 = AbstractC1371rj.f10058a;
        }
        if (i >= 30) {
            int i4 = AbstractC1371rj.f10058a;
        }
        if (i >= 30) {
            int i5 = AbstractC1371rj.f10058a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m6104a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return true;
        }
        if (i < 32) {
            return false;
        }
        String str = Build.VERSION.CODENAME;
        if ("REL".equals(str)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str.toUpperCase(locale).compareTo("Tiramisu".toUpperCase(locale)) >= 0;
    }
}

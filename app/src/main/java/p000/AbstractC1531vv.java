package p000;

import android.os.Bundle;
import android.text.Spanned;

/* JADX INFO: renamed from: vv */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1531vv {

    /* JADX INFO: renamed from: a */
    public static final String f11775a;

    /* JADX INFO: renamed from: b */
    public static final String f11776b;

    /* JADX INFO: renamed from: c */
    public static final String f11777c;

    /* JADX INFO: renamed from: d */
    public static final String f11778d;

    /* JADX INFO: renamed from: e */
    public static final String f11779e;

    static {
        int i = z42.f13274a;
        f11775a = Integer.toString(0, 36);
        f11776b = Integer.toString(1, 36);
        f11777c = Integer.toString(2, 36);
        f11778d = Integer.toString(3, 36);
        f11779e = Integer.toString(4, 36);
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m6662a(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f11775a, spanned.getSpanStart(obj));
        bundle2.putInt(f11776b, spanned.getSpanEnd(obj));
        bundle2.putInt(f11777c, spanned.getSpanFlags(obj));
        bundle2.putInt(f11778d, i);
        if (bundle != null) {
            bundle2.putBundle(f11779e, bundle);
        }
        return bundle2;
    }
}

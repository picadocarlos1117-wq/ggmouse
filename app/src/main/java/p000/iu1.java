package p000;

import android.text.Html;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class iu1 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f5163a = Pattern.compile("(&#13;)?&#10;");

    /* JADX INFO: renamed from: a */
    public static String m3494a(CharSequence charSequence) {
        return f5163a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}

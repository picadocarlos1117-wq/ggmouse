package p000;

import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class yu1 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f13149a = Pattern.compile("\\{([^}]*)\\}");

    /* JADX INFO: renamed from: b */
    public static final Pattern f13150b;

    /* JADX INFO: renamed from: c */
    public static final Pattern f13151c;

    /* JADX INFO: renamed from: d */
    public static final Pattern f13152d;

    static {
        int i = z42.f13274a;
        Locale locale = Locale.US;
        f13150b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f13151c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f13152d = Pattern.compile("\\\\an(\\d+)");
    }

    /* JADX INFO: renamed from: a */
    public static PointF m7149a(String str) {
        String strGroup;
        String strGroup2;
        Matcher matcher = f13150b.matcher(str);
        Matcher matcher2 = f13151c.matcher(str);
        boolean zFind = matcher.find();
        boolean zFind2 = matcher2.find();
        if (zFind) {
            if (zFind2) {
                AbstractC1337qm.m5508C("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
            }
            strGroup = matcher.group(1);
            strGroup2 = matcher.group(2);
        } else {
            if (!zFind2) {
                return null;
            }
            strGroup = matcher2.group(1);
            strGroup2 = matcher2.group(2);
        }
        strGroup.getClass();
        float f = Float.parseFloat(strGroup.trim());
        strGroup2.getClass();
        return new PointF(f, Float.parseFloat(strGroup2.trim()));
    }
}

package p000;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: aq */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0071aq {

    /* JADX INFO: renamed from: a */
    public static final Pattern f1019a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: b */
    public static final Pattern f1020b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: c */
    public static final Pattern f1021c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* JADX INFO: renamed from: d */
    public static final HashMap f1022d;

    static {
        HashMap map = new HashMap();
        f1022d = map;
        AbstractC1308pu.m5351r(-984833, map, "aliceblue", -332841, "antiquewhite");
        map.put("aqua", -16711681);
        map.put("aquamarine", -8388652);
        AbstractC1308pu.m5351r(-983041, map, "azure", -657956, "beige");
        AbstractC1308pu.m5351r(-6972, map, "bisque", -16777216, "black");
        AbstractC1308pu.m5351r(-5171, map, "blanchedalmond", -16776961, "blue");
        AbstractC1308pu.m5351r(-7722014, map, "blueviolet", -5952982, "brown");
        AbstractC1308pu.m5351r(-2180985, map, "burlywood", -10510688, "cadetblue");
        AbstractC1308pu.m5351r(-8388864, map, "chartreuse", -2987746, "chocolate");
        AbstractC1308pu.m5351r(-32944, map, "coral", -10185235, "cornflowerblue");
        AbstractC1308pu.m5351r(-1828, map, "cornsilk", -2354116, "crimson");
        map.put("cyan", -16711681);
        map.put("darkblue", -16777077);
        AbstractC1308pu.m5351r(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        map.put("darkgray", -5658199);
        map.put("darkgreen", -16751616);
        map.put("darkgrey", -5658199);
        map.put("darkkhaki", -4343957);
        AbstractC1308pu.m5351r(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        AbstractC1308pu.m5351r(-29696, map, "darkorange", -6737204, "darkorchid");
        AbstractC1308pu.m5351r(-7667712, map, "darkred", -1468806, "darksalmon");
        AbstractC1308pu.m5351r(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        map.put("darkturquoise", -16724271);
        map.put("darkviolet", -7077677);
        AbstractC1308pu.m5351r(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        map.put("dodgerblue", -14774017);
        map.put("firebrick", -5103070);
        AbstractC1308pu.m5351r(-1296, map, "floralwhite", -14513374, "forestgreen");
        map.put("fuchsia", -65281);
        map.put("gainsboro", -2302756);
        AbstractC1308pu.m5351r(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        AbstractC1308pu.m5351r(-16744448, map, "green", -5374161, "greenyellow");
        map.put("grey", -8355712);
        map.put("honeydew", -983056);
        AbstractC1308pu.m5351r(-38476, map, "hotpink", -3318692, "indianred");
        AbstractC1308pu.m5351r(-11861886, map, "indigo", -16, "ivory");
        AbstractC1308pu.m5351r(-989556, map, "khaki", -1644806, "lavender");
        AbstractC1308pu.m5351r(-3851, map, "lavenderblush", -8586240, "lawngreen");
        AbstractC1308pu.m5351r(-1331, map, "lemonchiffon", -5383962, "lightblue");
        AbstractC1308pu.m5351r(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        AbstractC1308pu.m5351r(-18751, map, "lightpink", -24454, "lightsalmon");
        AbstractC1308pu.m5351r(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        map.put("lightsteelblue", -5192482);
        map.put("lightyellow", -32);
        AbstractC1308pu.m5351r(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        AbstractC1308pu.m5351r(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        AbstractC1308pu.m5351r(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        AbstractC1308pu.m5351r(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        AbstractC1308pu.m5351r(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        AbstractC1308pu.m5351r(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        AbstractC1308pu.m5351r(-15132304, map, "midnightblue", -655366, "mintcream");
        AbstractC1308pu.m5351r(-6943, map, "mistyrose", -6987, "moccasin");
        AbstractC1308pu.m5351r(-8531, map, "navajowhite", -16777088, "navy");
        AbstractC1308pu.m5351r(-133658, map, "oldlace", -8355840, "olive");
        AbstractC1308pu.m5351r(-9728477, map, "olivedrab", -23296, "orange");
        AbstractC1308pu.m5351r(-47872, map, "orangered", -2461482, "orchid");
        AbstractC1308pu.m5351r(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        AbstractC1308pu.m5351r(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        AbstractC1308pu.m5351r(-4139, map, "papayawhip", -9543, "peachpuff");
        AbstractC1308pu.m5351r(-3308225, map, "peru", -16181, "pink");
        AbstractC1308pu.m5351r(-2252579, map, "plum", -5185306, "powderblue");
        AbstractC1308pu.m5351r(-8388480, map, "purple", -10079335, "rebeccapurple");
        AbstractC1308pu.m5351r(-65536, map, "red", -4419697, "rosybrown");
        AbstractC1308pu.m5351r(-12490271, map, "royalblue", -7650029, "saddlebrown");
        AbstractC1308pu.m5351r(-360334, map, "salmon", -744352, "sandybrown");
        AbstractC1308pu.m5351r(-13726889, map, "seagreen", -2578, "seashell");
        AbstractC1308pu.m5351r(-6270419, map, "sienna", -4144960, "silver");
        AbstractC1308pu.m5351r(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        map.put("snow", -1286);
        map.put("springgreen", -16711809);
        AbstractC1308pu.m5351r(-12156236, map, "steelblue", -2968436, "tan");
        AbstractC1308pu.m5351r(-16744320, map, "teal", -2572328, "thistle");
        AbstractC1308pu.m5351r(-40121, map, "tomato", 0, "transparent");
        AbstractC1308pu.m5351r(-12525360, map, "turquoise", -1146130, "violet");
        AbstractC1308pu.m5351r(-663885, map, "wheat", -1, "white");
        AbstractC1308pu.m5351r(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    /* JADX INFO: renamed from: a */
    public static int m698a(String str, boolean z) {
        int i;
        ki0.m3857c(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i2 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i2;
            }
            if (strReplace.length() == 9) {
                return ((i2 & 255) << 24) | (i2 >>> 8);
            }
            l41.m4049r();
            return 0;
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z ? f1021c : f1020b).matcher(strReplace);
            if (matcher.matches()) {
                if (z) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i3 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i4 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i, i3, i4, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = f1019a.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i5 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i6 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i5, i6, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) f1022d.get(ua0.m6444b0(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        l41.m4049r();
        return 0;
    }
}

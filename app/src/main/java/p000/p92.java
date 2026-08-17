package p000;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p92 {
    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    /* JADX INFO: renamed from: a */
    public static float m5235a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* JADX INFO: renamed from: b */
    public static long m5236b(String str) {
        int i = z42.f13274a;
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrSplit.length == 2) {
            j2 += Long.parseLong(strArrSplit[1]);
        }
        return j2 * 1000;
    }

    /* JADX INFO: renamed from: c */
    public static void m5237c(dc1 dc1Var) {
        int i = dc1Var.f2883b;
        Charset charset = StandardCharsets.UTF_8;
        String strM2325h = dc1Var.m2325h(charset);
        if (strM2325h == null || !strM2325h.startsWith("WEBVTT")) {
            dc1Var.m2316F(i);
            throw fc1.m2799a(null, "Expected WEBVTT. Got " + dc1Var.m2325h(charset));
        }
    }
}

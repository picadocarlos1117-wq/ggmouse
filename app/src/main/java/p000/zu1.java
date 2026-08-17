package p000;

import android.graphics.Color;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class zu1 {

    /* JADX INFO: renamed from: a */
    public final String f13564a;

    /* JADX INFO: renamed from: b */
    public final int f13565b;

    /* JADX INFO: renamed from: c */
    public final Integer f13566c;

    /* JADX INFO: renamed from: d */
    public final Integer f13567d;

    /* JADX INFO: renamed from: e */
    public final float f13568e;

    /* JADX INFO: renamed from: f */
    public final boolean f13569f;

    /* JADX INFO: renamed from: g */
    public final boolean f13570g;

    /* JADX INFO: renamed from: h */
    public final boolean f13571h;

    /* JADX INFO: renamed from: i */
    public final boolean f13572i;

    /* JADX INFO: renamed from: j */
    public final int f13573j;

    public zu1(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.f13564a = str;
        this.f13565b = i;
        this.f13566c = num;
        this.f13567d = num2;
        this.f13568e = f;
        this.f13569f = z;
        this.f13570g = z2;
        this.f13571h = z3;
        this.f13572i = z4;
        this.f13573j = i2;
    }

    /* JADX INFO: renamed from: a */
    public static int m7355a(String str) {
        boolean z;
        try {
            int i = Integer.parseInt(str.trim());
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                return i;
            }
        } catch (NumberFormatException unused) {
        }
        AbstractC1308pu.m5355v("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m7356b(String str) {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            AbstractC1337qm.m5544j0("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Integer m7357c(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            ki0.m3857c(j <= 4294967295L);
            return Integer.valueOf(Color.argb(rc2.m5793l(((j >> 24) & 255) ^ 255), rc2.m5793l(j & 255), rc2.m5793l((j >> 8) & 255), rc2.m5793l((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            AbstractC1337qm.m5544j0("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }
}

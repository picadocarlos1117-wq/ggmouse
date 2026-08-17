package p000;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* JADX INFO: renamed from: bm */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0104bm {

    /* JADX INFO: renamed from: A */
    public static final boolean[] f1401A;

    /* JADX INFO: renamed from: B */
    public static final int[] f1402B;

    /* JADX INFO: renamed from: C */
    public static final int[] f1403C;

    /* JADX INFO: renamed from: D */
    public static final int[] f1404D;

    /* JADX INFO: renamed from: E */
    public static final int[] f1405E;

    /* JADX INFO: renamed from: v */
    public static final int f1406v = m1001c(2, 2, 2, 0);

    /* JADX INFO: renamed from: w */
    public static final int f1407w;

    /* JADX INFO: renamed from: x */
    public static final int[] f1408x;

    /* JADX INFO: renamed from: y */
    public static final int[] f1409y;

    /* JADX INFO: renamed from: z */
    public static final int[] f1410z;

    /* JADX INFO: renamed from: a */
    public final ArrayList f1411a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final SpannableStringBuilder f1412b = new SpannableStringBuilder();

    /* JADX INFO: renamed from: c */
    public boolean f1413c;

    /* JADX INFO: renamed from: d */
    public boolean f1414d;

    /* JADX INFO: renamed from: e */
    public int f1415e;

    /* JADX INFO: renamed from: f */
    public boolean f1416f;

    /* JADX INFO: renamed from: g */
    public int f1417g;

    /* JADX INFO: renamed from: h */
    public int f1418h;

    /* JADX INFO: renamed from: i */
    public int f1419i;

    /* JADX INFO: renamed from: j */
    public int f1420j;

    /* JADX INFO: renamed from: k */
    public int f1421k;

    /* JADX INFO: renamed from: l */
    public int f1422l;

    /* JADX INFO: renamed from: m */
    public int f1423m;

    /* JADX INFO: renamed from: n */
    public int f1424n;

    /* JADX INFO: renamed from: o */
    public int f1425o;

    /* JADX INFO: renamed from: p */
    public int f1426p;

    /* JADX INFO: renamed from: q */
    public int f1427q;

    /* JADX INFO: renamed from: r */
    public int f1428r;

    /* JADX INFO: renamed from: s */
    public int f1429s;

    /* JADX INFO: renamed from: t */
    public int f1430t;

    /* JADX INFO: renamed from: u */
    public int f1431u;

    static {
        int iM1001c = m1001c(0, 0, 0, 0);
        f1407w = iM1001c;
        int iM1001c2 = m1001c(0, 0, 0, 3);
        f1408x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f1409y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f1410z = new int[]{3, 3, 3, 3, 3, 3, 1};
        f1401A = new boolean[]{false, false, false, true, true, true, false};
        f1402B = new int[]{iM1001c, iM1001c2, iM1001c, iM1001c, iM1001c2, iM1001c, iM1001c};
        f1403C = new int[]{0, 1, 2, 3, 4, 3, 4};
        f1404D = new int[]{0, 0, 0, 0, 0, 3, 3};
        f1405E = new int[]{iM1001c, iM1001c, iM1001c, iM1001c, iM1001c, iM1001c2, iM1001c2};
    }

    public C0104bm() {
        m1004d();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    /* JADX INFO: renamed from: c */
    public static int m1001c(int i, int i2, int i3, int i4) {
        int i5;
        ki0.m3860e(i, 4);
        ki0.m3860e(i2, 4);
        ki0.m3860e(i3, 4);
        ki0.m3860e(i4, 4);
        if (i4 == 0 || i4 == 1) {
            i5 = 255;
        } else if (i4 == 2) {
            i5 = 127;
        } else if (i4 != 3) {
            i5 = 255;
        } else {
            i5 = 0;
        }
        return Color.argb(i5, i > 1 ? 255 : 0, i2 > 1 ? 255 : 0, i3 <= 1 ? 0 : 255);
    }

    /* JADX INFO: renamed from: a */
    public final void m1002a(char c) {
        SpannableStringBuilder spannableStringBuilder = this.f1412b;
        if (c != '\n') {
            spannableStringBuilder.append(c);
            return;
        }
        SpannableString spannableStringM1003b = m1003b();
        ArrayList arrayList = this.f1411a;
        arrayList.add(spannableStringM1003b);
        spannableStringBuilder.clear();
        if (this.f1425o != -1) {
            this.f1425o = 0;
        }
        if (this.f1426p != -1) {
            this.f1426p = 0;
        }
        if (this.f1427q != -1) {
            this.f1427q = 0;
        }
        if (this.f1429s != -1) {
            this.f1429s = 0;
        }
        while (true) {
            if (arrayList.size() < this.f1420j && arrayList.size() < 15) {
                this.f1431u = arrayList.size();
                return;
            }
            arrayList.remove(0);
        }
    }

    /* JADX INFO: renamed from: b */
    public final SpannableString m1003b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f1412b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f1425o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f1425o, length, 33);
            }
            if (this.f1426p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f1426p, length, 33);
            }
            if (this.f1427q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f1428r), this.f1427q, length, 33);
            }
            if (this.f1429s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f1430t), this.f1429s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: d */
    public final void m1004d() {
        this.f1411a.clear();
        this.f1412b.clear();
        this.f1425o = -1;
        this.f1426p = -1;
        this.f1427q = -1;
        this.f1429s = -1;
        this.f1431u = 0;
        this.f1413c = false;
        this.f1414d = false;
        this.f1415e = 4;
        this.f1416f = false;
        this.f1417g = 0;
        this.f1418h = 0;
        this.f1419i = 0;
        this.f1420j = 15;
        this.f1421k = 0;
        this.f1422l = 0;
        this.f1423m = 0;
        int i = f1407w;
        this.f1424n = i;
        this.f1428r = f1406v;
        this.f1430t = i;
    }

    /* JADX INFO: renamed from: e */
    public final void m1005e(boolean z, boolean z2) {
        int i = this.f1425o;
        SpannableStringBuilder spannableStringBuilder = this.f1412b;
        if (i != -1) {
            if (!z) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f1425o, spannableStringBuilder.length(), 33);
                this.f1425o = -1;
            }
        } else if (z) {
            this.f1425o = spannableStringBuilder.length();
        }
        if (this.f1426p == -1) {
            if (z2) {
                this.f1426p = spannableStringBuilder.length();
            }
        } else {
            if (z2) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f1426p, spannableStringBuilder.length(), 33);
            this.f1426p = -1;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1006f(int i, int i2) {
        int i3 = this.f1427q;
        SpannableStringBuilder spannableStringBuilder = this.f1412b;
        if (i3 != -1 && this.f1428r != i) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f1428r), this.f1427q, spannableStringBuilder.length(), 33);
        }
        if (i != f1406v) {
            this.f1427q = spannableStringBuilder.length();
            this.f1428r = i;
        }
        if (this.f1429s != -1 && this.f1430t != i2) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f1430t), this.f1429s, spannableStringBuilder.length(), 33);
        }
        if (i2 != f1407w) {
            this.f1429s = spannableStringBuilder.length();
            this.f1430t = i2;
        }
    }
}

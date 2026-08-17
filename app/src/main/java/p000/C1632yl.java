package p000;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.example.ssmousepro.injection.TouchPipeline;
import java.util.ArrayList;

/* JADX INFO: renamed from: yl */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1632yl {

    /* JADX INFO: renamed from: a */
    public final ArrayList f13009a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f13010b;

    /* JADX INFO: renamed from: c */
    public final StringBuilder f13011c;

    /* JADX INFO: renamed from: d */
    public int f13012d;

    /* JADX INFO: renamed from: e */
    public int f13013e;

    /* JADX INFO: renamed from: f */
    public int f13014f;

    /* JADX INFO: renamed from: g */
    public int f13015g;

    /* JADX INFO: renamed from: h */
    public int f13016h;

    public C1632yl(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.f13009a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f13010b = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.f13011c = sb;
        this.f13015g = i;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.f13012d = 15;
        this.f13013e = 0;
        this.f13014f = 0;
        this.f13016h = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m7090a(char c) {
        StringBuilder sb = this.f13011c;
        if (sb.length() < 32) {
            sb.append(c);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7091b() {
        StringBuilder sb = this.f13011c;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.f13009a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C1595xl c1595xl = (C1595xl) arrayList.get(size);
                int i = c1595xl.f12637c;
                if (i != length) {
                    return;
                }
                c1595xl.f12637c = i - 1;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final C0805jv m7092c(int i) {
        float f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f13010b;
            if (i2 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i2));
            spannableStringBuilder.append('\n');
            i2++;
        }
        spannableStringBuilder.append((CharSequence) m7093d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i3 = this.f13013e + this.f13014f;
        int length = (32 - i3) - spannableStringBuilder.length();
        int i4 = i3 - length;
        int i5 = i;
        if (i5 == Integer.MIN_VALUE) {
            if (this.f13015g != 2 || (Math.abs(i4) >= 3 && length >= 0)) {
                i5 = (this.f13015g != 2 || i4 <= 0) ? 0 : 2;
            } else {
                i5 = 1;
            }
        }
        if (i5 != 1) {
            if (i5 == 2) {
                i3 = 32 - length;
            }
            f = ((i3 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f = 0.5f;
        }
        int i6 = this.f13012d;
        if (i6 > 7) {
            i6 -= 17;
        } else if (this.f13015g == 1) {
            i6 -= this.f13016h - 1;
        }
        return new C0805jv(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i6, 1, Integer.MIN_VALUE, f, i5, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, TouchPipeline.SIZE);
    }

    /* JADX INFO: renamed from: d */
    public final SpannableString m7093d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f13011c);
        int length = spannableStringBuilder.length();
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.f13009a;
            if (i5 >= arrayList.size()) {
                break;
            }
            C1595xl c1595xl = (C1595xl) arrayList.get(i5);
            boolean z2 = c1595xl.f12636b;
            int i7 = c1595xl.f12635a;
            if (i7 != 8) {
                boolean z3 = i7 == 7;
                if (i7 != 7) {
                    i4 = C1669zl.f13453B[i7];
                }
                z = z3;
            }
            int i8 = c1595xl.f12637c;
            i5++;
            if (i8 != (i5 < arrayList.size() ? ((C1595xl) arrayList.get(i5)).f12637c : length)) {
                if (i != -1 && !z2) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, i8, 33);
                    i = -1;
                } else if (i == -1 && z2) {
                    i = i8;
                }
                if (i2 != -1 && !z) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i2, i8, 33);
                    i2 = -1;
                } else if (i2 == -1 && z) {
                    i2 = i8;
                }
                if (i4 != i3) {
                    if (i3 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, i8, 33);
                    }
                    i3 = i4;
                    i6 = i8;
                }
            }
        }
        if (i != -1 && i != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
        }
        if (i2 != -1 && i2 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
        }
        if (i6 != length && i3 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m7094e() {
        return this.f13009a.isEmpty() && this.f13010b.isEmpty() && this.f13011c.length() == 0;
    }
}

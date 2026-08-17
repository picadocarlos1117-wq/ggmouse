package p000;

import android.sun.security.util.DerValue;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.example.ssmousepro.injection.TouchPipeline;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class o32 implements yx1 {

    /* JADX INFO: renamed from: a */
    public final dc1 f7637a = new dc1();

    /* JADX INFO: renamed from: b */
    public final boolean f7638b;

    /* JADX INFO: renamed from: c */
    public final int f7639c;

    /* JADX INFO: renamed from: d */
    public final int f7640d;

    /* JADX INFO: renamed from: e */
    public final String f7641e;

    /* JADX INFO: renamed from: f */
    public final float f7642f;

    /* JADX INFO: renamed from: g */
    public final int f7643g;

    public o32(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f7639c = 0;
            this.f7640d = -1;
            this.f7641e = "sans-serif";
            this.f7638b = false;
            this.f7642f = 0.85f;
            this.f7643g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f7639c = bArr[24];
        this.f7640d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f7641e = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i = bArr[25] * DerValue.tag_T61String;
        this.f7643g = i;
        boolean z = (bArr[0] & 32) != 0;
        this.f7638b = z;
        if (z) {
            this.f7642f = z42.m7232f(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, TouchPipeline.SIZE, 0.95f);
        } else {
            this.f7642f = 0.85f;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4708a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m4709b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.yx1
    /* JADX INFO: renamed from: r */
    public final void mo875r(byte[] bArr, int i, int i2, xx1 xx1Var, InterfaceC0578dt interfaceC0578dt) {
        String strM2335r;
        int i3;
        dc1 dc1Var = this.f7637a;
        dc1Var.m2314D(i + i2, bArr);
        dc1Var.m2316F(i);
        int i4 = 1;
        int i5 = 0;
        int i6 = 2;
        ki0.m3857c(dc1Var.m2318a() >= 2);
        int iM2343z = dc1Var.m2343z();
        if (iM2343z == 0) {
            strM2335r = "";
        } else {
            int i7 = dc1Var.f2883b;
            Charset charsetM2312B = dc1Var.m2312B();
            int i8 = iM2343z - (dc1Var.f2883b - i7);
            if (charsetM2312B == null) {
                charsetM2312B = StandardCharsets.UTF_8;
            }
            strM2335r = dc1Var.m2335r(i8, charsetM2312B);
        }
        if (strM2335r.isEmpty()) {
            om0 om0Var = qm0.f9540b;
            interfaceC0578dt.accept(new C1122mv(kk1.f5896e, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strM2335r);
        m4709b(spannableStringBuilder, this.f7639c, 0, 0, spannableStringBuilder.length(), 16711680);
        m4708a(spannableStringBuilder, this.f7640d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f7641e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fM7232f = this.f7642f;
        while (dc1Var.m2318a() >= 8) {
            int i9 = dc1Var.f2883b;
            int iM2324g = dc1Var.m2324g();
            int iM2324g2 = dc1Var.m2324g();
            if (iM2324g2 == 1937013100) {
                ki0.m3857c(dc1Var.m2318a() >= i6 ? i4 : i5);
                int iM2343z2 = dc1Var.m2343z();
                int i10 = i5;
                while (i10 < iM2343z2) {
                    ki0.m3857c(dc1Var.m2318a() >= 12 ? i4 : i5);
                    int iM2343z3 = dc1Var.m2343z();
                    int iM2343z4 = dc1Var.m2343z();
                    dc1Var.m2317G(i6);
                    int i11 = i10;
                    int iM2337t = dc1Var.m2337t();
                    dc1Var.m2317G(i4);
                    int iM2324g3 = dc1Var.m2324g();
                    if (iM2343z4 > spannableStringBuilder.length()) {
                        StringBuilder sbM5343j = AbstractC1308pu.m5343j(iM2343z4, "Truncating styl end (", ") to cueText.length() (");
                        sbM5343j.append(spannableStringBuilder.length());
                        sbM5343j.append(").");
                        AbstractC1337qm.m5542i0("Tx3gParser", sbM5343j.toString());
                        iM2343z4 = spannableStringBuilder.length();
                    }
                    if (iM2343z3 >= iM2343z4) {
                        AbstractC1337qm.m5542i0("Tx3gParser", "Ignoring styl with start (" + iM2343z3 + ") >= end (" + iM2343z4 + ").");
                    } else {
                        int i12 = iM2343z4;
                        m4709b(spannableStringBuilder, iM2337t, this.f7639c, iM2343z3, i12, 0);
                        m4708a(spannableStringBuilder, iM2324g3, this.f7640d, iM2343z3, i12, 0);
                    }
                    i10 = i11 + 1;
                    i4 = 1;
                    i5 = 0;
                    i6 = 2;
                }
                i3 = i6;
            } else if (iM2324g2 == 1952608120 && this.f7638b) {
                i3 = 2;
                ki0.m3857c(dc1Var.m2318a() >= 2);
                fM7232f = z42.m7232f(dc1Var.m2343z() / this.f7643g, TouchPipeline.SIZE, 0.95f);
            } else {
                i3 = 2;
            }
            dc1Var.m2316F(i9 + iM2324g);
            i6 = i3;
            i4 = 1;
            i5 = 0;
        }
        interfaceC0578dt.accept(new C1122mv(qm0.m5570t(new C0805jv(spannableStringBuilder, null, null, null, fM7232f, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, TouchPipeline.SIZE)), -9223372036854775807L, -9223372036854775807L));
    }
}

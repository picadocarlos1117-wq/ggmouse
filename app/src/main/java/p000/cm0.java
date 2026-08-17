package p000;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class cm0 implements yx1 {

    /* JADX INFO: renamed from: a */
    public final dc1 f1862a;

    public cm0(int i) {
        switch (i) {
            case 1:
                this.f1862a = new dc1();
                break;
            default:
                this.f1862a = new dc1(10);
                break;
        }
    }

    @Override // p000.yx1
    /* JADX INFO: renamed from: r */
    public void mo875r(byte[] bArr, int i, int i2, xx1 xx1Var, InterfaceC0578dt interfaceC0578dt) {
        C0805jv c0805jvM3495a;
        dc1 dc1Var = this.f1862a;
        dc1Var.m2314D(i2 + i, bArr);
        dc1Var.m2316F(i);
        ArrayList arrayList = new ArrayList();
        while (dc1Var.m2318a() > 0) {
            ki0.m3859d(dc1Var.m2318a() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int iM2324g = dc1Var.m2324g();
            if (dc1Var.m2324g() == 1987343459) {
                int i3 = iM2324g - 8;
                CharSequence charSequenceM4784f = null;
                C0767iv c0767ivM4511a = null;
                while (i3 > 0) {
                    ki0.m3859d(i3 >= 8, "Incomplete vtt cue box header found.");
                    int iM2324g2 = dc1Var.m2324g();
                    int iM2324g3 = dc1Var.m2324g();
                    int i4 = iM2324g2 - 8;
                    byte[] bArr2 = dc1Var.f2882a;
                    int i5 = dc1Var.f2883b;
                    int i6 = z42.f13274a;
                    String str = new String(bArr2, i5, i4, StandardCharsets.UTF_8);
                    dc1Var.m2317G(i4);
                    i3 = (i3 - 8) - i4;
                    if (iM2324g3 == 1937011815) {
                        n92 n92Var = new n92();
                        o92.m4783e(str, n92Var);
                        c0767ivM4511a = n92Var.m4511a();
                    } else if (iM2324g3 == 1885436268) {
                        charSequenceM4784f = o92.m4784f(null, str.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceM4784f == null) {
                    charSequenceM4784f = "";
                }
                if (c0767ivM4511a != null) {
                    c0767ivM4511a.f5164a = charSequenceM4784f;
                    c0805jvM3495a = c0767ivM4511a.m3495a();
                } else {
                    Pattern pattern = o92.f7703a;
                    n92 n92Var2 = new n92();
                    n92Var2.f7320c = charSequenceM4784f;
                    c0805jvM3495a = n92Var2.m4511a().m3495a();
                }
                arrayList.add(c0805jvM3495a);
            } else {
                dc1Var.m2317G(iM2324g - 8);
            }
        }
        interfaceC0578dt.accept(new C1122mv(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}

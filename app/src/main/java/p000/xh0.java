package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class xh0 {

    /* JADX INFO: renamed from: c */
    public static final Pattern f12604c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a */
    public int f12605a = -1;

    /* JADX INFO: renamed from: b */
    public int f12606b = -1;

    /* JADX INFO: renamed from: a */
    public final boolean m6927a(String str) {
        Matcher matcher = f12604c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i = z42.f13274a;
            int i2 = Integer.parseInt(strGroup, 16);
            int i3 = Integer.parseInt(matcher.group(2), 16);
            if (i2 <= 0 && i3 <= 0) {
                return false;
            }
            this.f12605a = i2;
            this.f12606b = i3;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6928b(k51 k51Var) {
        int i = 0;
        while (true) {
            f51[] f51VarArr = k51Var.f5679a;
            if (i >= f51VarArr.length) {
                return;
            }
            f51 f51Var = f51VarArr[i];
            if (f51Var instanceof C0649fq) {
                C0649fq c0649fq = (C0649fq) f51Var;
                if ("iTunSMPB".equals(c0649fq.f3879c) && m6927a(c0649fq.f3880d)) {
                    return;
                }
            } else if (f51Var instanceof to0) {
                to0 to0Var = (to0) f51Var;
                if ("com.apple.iTunes".equals(to0Var.f10910b) && "iTunSMPB".equals(to0Var.f10911c) && m6927a(to0Var.f10912d)) {
                    return;
                }
            } else {
                continue;
            }
            i++;
        }
    }
}

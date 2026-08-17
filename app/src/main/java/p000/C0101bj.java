package p000;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: bj */
/* JADX INFO: loaded from: classes.dex */
public final class C0101bj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1382a;

    /* JADX INFO: renamed from: b */
    public final String f1383b;

    public C0101bj(String str) {
        this.f1382a = 3;
        str.getClass();
        this.f1383b = str;
    }

    /* JADX INFO: renamed from: b */
    public static C0101bj m995b(dc1 dc1Var) {
        String str;
        int i = 2;
        dc1Var.m2317G(2);
        int iM2337t = dc1Var.m2337t();
        int i2 = iM2337t >> 1;
        int iM2337t2 = ((dc1Var.m2337t() >> 3) & 31) | ((iM2337t & 1) << 5);
        if (i2 == 4 || i2 == 5 || i2 == 7) {
            str = "dvhe";
        } else if (i2 == 8) {
            str = "hev1";
        } else {
            if (i2 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i2);
        sb.append(iM2337t2 >= 10 ? "." : ".0");
        sb.append(iM2337t2);
        return new C0101bj(sb.toString(), i);
    }

    /* JADX INFO: renamed from: a */
    public void m996a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f1383b);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e) {
            f40.m2711g(e);
        }
    }

    public String toString() {
        switch (this.f1382a) {
            case 1:
                return this.f1383b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0101bj(String str, int i) {
        this.f1382a = i;
        this.f1383b = str;
    }
}

package p000;

import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: yb */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1622yb {

    /* JADX INFO: renamed from: d */
    public static final C1622yb f12922d;

    /* JADX INFO: renamed from: a */
    public final int f12923a;

    /* JADX INFO: renamed from: b */
    public final int f12924b;

    /* JADX INFO: renamed from: c */
    public final tm0 f12925c;

    static {
        C1622yb c1622yb;
        if (z42.f13274a >= 33) {
            sm0 sm0Var = new sm0(4);
            for (int i = 1; i <= 10; i++) {
                sm0Var.m3901a(Integer.valueOf(z42.m7240n(i)));
            }
            c1622yb = new C1622yb(2, sm0Var.m6116g());
        } else {
            c1622yb = new C1622yb(2, 10);
        }
        f12922d = c1622yb;
    }

    public C1622yb(int i, Set set) {
        this.f12923a = i;
        tm0 tm0VarM6292n = tm0.m6292n(set);
        this.f12925c = tm0VarM6292n;
        AbstractC0570dk it = tm0VarM6292n.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f12924b = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1622yb)) {
            return false;
        }
        C1622yb c1622yb = (C1622yb) obj;
        if (this.f12923a == c1622yb.f12923a && this.f12924b == c1622yb.f12924b) {
            tm0 tm0Var = c1622yb.f12925c;
            int i = z42.f13274a;
            if (Objects.equals(this.f12925c, tm0Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.f12923a * 31) + this.f12924b) * 31;
        tm0 tm0Var = this.f12925c;
        return i + (tm0Var == null ? 0 : tm0Var.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f12923a + ", maxChannelCount=" + this.f12924b + ", channelMasks=" + this.f12925c + "]";
    }

    public C1622yb(int i, int i2) {
        this.f12923a = i;
        this.f12924b = i2;
        this.f12925c = null;
    }
}

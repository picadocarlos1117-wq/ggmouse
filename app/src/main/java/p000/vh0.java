package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class vh0 {

    /* JADX INFO: renamed from: a */
    public int f11657a;

    /* JADX INFO: renamed from: b */
    public int f11658b;

    /* JADX INFO: renamed from: a */
    public final int m6625a(int i) {
        int i2 = (1 << this.f11657a) - 2;
        int i3 = this.f11658b;
        if (i2 != 0) {
            if (i == 0) {
                return 0;
            }
            if (i != 1) {
                if (i2 < 0) {
                    i = m6625a(i);
                    i2 = -i2;
                }
                int iM3197F = 1;
                while (i2 != 0) {
                    if ((i2 & 1) == 1) {
                        iM3197F = hp0.m3197F(iM3197F, i, i3);
                    }
                    i = hp0.m3197F(i, i, i3);
                    i2 >>>= 1;
                }
                return iM3197F;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6626b(int i) {
        int i2 = this.f11657a;
        if (i2 == 31) {
            return i >= 0;
        }
        return i >= 0 && i < (1 << i2);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof vh0)) {
            vh0 vh0Var = (vh0) obj;
            if (this.f11657a == vh0Var.f11657a && this.f11658b == vh0Var.f11658b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11658b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Finite Field GF(2^");
        sb.append(this.f11657a);
        sb.append(") = GF(2)[X]/<");
        int i = this.f11658b;
        if (i == 0) {
            str = "0";
        } else {
            String str2 = ((byte) (i & 1)) == 1 ? "1" : "";
            int i2 = i >>> 1;
            int i3 = 1;
            while (i2 != 0) {
                if (((byte) (i2 & 1)) == 1) {
                    str2 = str2 + "+x^" + i3;
                }
                i2 >>>= 1;
                i3++;
            }
            str = str2;
        }
        return AbstractC1308pu.m5342i(sb, str, "> ");
    }
}

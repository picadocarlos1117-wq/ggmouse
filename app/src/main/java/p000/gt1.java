package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class gt1 {

    /* JADX INFO: renamed from: c */
    public static final gt1 f4318c = new gt1(-1, -1);

    /* JADX INFO: renamed from: a */
    public final int f4319a;

    /* JADX INFO: renamed from: b */
    public final int f4320b;

    static {
        new gt1(0, 0);
    }

    public gt1(int i, int i2) {
        ki0.m3857c((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.f4319a = i;
        this.f4320b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof gt1) {
            gt1 gt1Var = (gt1) obj;
            if (this.f4319a == gt1Var.f4319a && this.f4320b == gt1Var.f4320b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f4319a;
        int i2 = i << 16;
        return this.f4320b ^ ((i >>> 16) | i2);
    }

    public final String toString() {
        return this.f4319a + "x" + this.f4320b;
    }
}

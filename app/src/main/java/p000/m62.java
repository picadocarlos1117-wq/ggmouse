package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class m62 {

    /* JADX INFO: renamed from: d */
    public static final m62 f6671d = new m62(1.0f, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f6672a;

    /* JADX INFO: renamed from: b */
    public final int f6673b;

    /* JADX INFO: renamed from: c */
    public final float f6674c;

    static {
        z42.m7252z(0);
        z42.m7252z(1);
        z42.m7252z(3);
    }

    public m62(float f, int i, int i2) {
        this.f6672a = i;
        this.f6673b = i2;
        this.f6674c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m62) {
            m62 m62Var = (m62) obj;
            if (this.f6672a == m62Var.f6672a && this.f6673b == m62Var.f6673b && this.f6674c == m62Var.f6674c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f6674c) + ((((217 + this.f6672a) * 31) + this.f6673b) * 31);
    }
}

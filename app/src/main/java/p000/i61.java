package p000;

import android.animation.TimeInterpolator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class i61 {

    /* JADX INFO: renamed from: a */
    public long f4835a;

    /* JADX INFO: renamed from: b */
    public long f4836b;

    /* JADX INFO: renamed from: c */
    public TimeInterpolator f4837c;

    /* JADX INFO: renamed from: d */
    public int f4838d;

    /* JADX INFO: renamed from: e */
    public int f4839e;

    /* JADX INFO: renamed from: a */
    public final TimeInterpolator m3364a() {
        TimeInterpolator timeInterpolator = this.f4837c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0779j6.f5285b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i61)) {
            return false;
        }
        i61 i61Var = (i61) obj;
        if (this.f4835a == i61Var.f4835a && this.f4836b == i61Var.f4836b && this.f4838d == i61Var.f4838d && this.f4839e == i61Var.f4839e) {
            return m3364a().getClass().equals(i61Var.m3364a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f4835a;
        long j2 = this.f4836b;
        return ((((m3364a().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.f4838d) * 31) + this.f4839e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(i61.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f4835a);
        sb.append(" duration: ");
        sb.append(this.f4836b);
        sb.append(" interpolator: ");
        sb.append(m3364a().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f4838d);
        sb.append(" repeatMode: ");
        return AbstractC1308pu.m5341h(sb, this.f4839e, "}\n");
    }
}

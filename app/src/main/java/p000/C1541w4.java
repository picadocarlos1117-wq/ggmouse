package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: w4 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1541w4 {

    /* JADX INFO: renamed from: c */
    public static final C1541w4 f11961c = new C1541w4(new C1504v4[0]);

    /* JADX INFO: renamed from: d */
    public static final C1504v4 f11962d;

    /* JADX INFO: renamed from: a */
    public final int f11963a;

    /* JADX INFO: renamed from: b */
    public final C1504v4[] f11964b;

    static {
        C1504v4 c1504v4 = new C1504v4(-1, -1, new int[0], new z11[0], new long[0]);
        int[] iArr = c1504v4.f11508e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = c1504v4.f11509f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        f11962d = new C1504v4(0, c1504v4.f11505b, iArrCopyOf, (z11[]) Arrays.copyOf(c1504v4.f11507d, 0), jArrCopyOf);
        z42.m7252z(1);
        z42.m7252z(2);
        z42.m7252z(3);
        z42.m7252z(4);
    }

    public C1541w4(C1504v4[] c1504v4Arr) {
        this.f11963a = c1504v4Arr.length;
        this.f11964b = c1504v4Arr;
    }

    /* JADX INFO: renamed from: a */
    public final C1504v4 m6701a(int i) {
        return i < 0 ? f11962d : this.f11964b[i];
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6702b(int i) {
        if (i != this.f11963a - 1) {
            return false;
        }
        m6701a(i).getClass();
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1541w4.class != obj.getClass()) {
            return false;
        }
        C1541w4 c1541w4 = (C1541w4) obj;
        int i = z42.f13274a;
        return this.f11963a == c1541w4.f11963a && Arrays.equals(this.f11964b, c1541w4.f11964b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11964b) + (((this.f11963a * 29791) + 1) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i = 0;
        while (true) {
            C1504v4[] c1504v4Arr = this.f11964b;
            if (i >= c1504v4Arr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=0, ads=[");
            c1504v4Arr[i].getClass();
            for (int i2 = 0; i2 < c1504v4Arr[i].f11508e.length; i2++) {
                sb.append("ad(state=");
                int i3 = c1504v4Arr[i].f11508e[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(c1504v4Arr[i].f11509f[i2]);
                sb.append(')');
                if (i2 < c1504v4Arr[i].f11508e.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < c1504v4Arr.length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}

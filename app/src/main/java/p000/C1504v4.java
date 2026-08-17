package p000;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: renamed from: v4 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1504v4 {

    /* JADX INFO: renamed from: a */
    public final int f11504a;

    /* JADX INFO: renamed from: b */
    public final int f11505b;

    /* JADX INFO: renamed from: c */
    public final Uri[] f11506c;

    /* JADX INFO: renamed from: d */
    public final z11[] f11507d;

    /* JADX INFO: renamed from: e */
    public final int[] f11508e;

    /* JADX INFO: renamed from: f */
    public final long[] f11509f;

    static {
        AbstractC1308pu.m5349p(0, 1, 2, 3, 4);
        z42.m7252z(5);
        z42.m7252z(6);
        z42.m7252z(7);
        z42.m7252z(8);
    }

    public C1504v4(int i, int i2, int[] iArr, z11[] z11VarArr, long[] jArr) {
        Uri uri;
        int i3 = 0;
        ki0.m3857c(iArr.length == z11VarArr.length);
        this.f11504a = i;
        this.f11505b = i2;
        this.f11508e = iArr;
        this.f11507d = z11VarArr;
        this.f11509f = jArr;
        this.f11506c = new Uri[z11VarArr.length];
        while (true) {
            Uri[] uriArr = this.f11506c;
            if (i3 >= uriArr.length) {
                return;
            }
            z11 z11Var = z11VarArr[i3];
            if (z11Var == null) {
                uri = null;
            } else {
                w11 w11Var = z11Var.f13231b;
                w11Var.getClass();
                uri = w11Var.f11899a;
            }
            uriArr[i3] = uri;
            i3++;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m6563a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.f11508e;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1504v4.class != obj.getClass()) {
            return false;
        }
        C1504v4 c1504v4 = (C1504v4) obj;
        return this.f11504a == c1504v4.f11504a && this.f11505b == c1504v4.f11505b && Arrays.equals(this.f11507d, c1504v4.f11507d) && Arrays.equals(this.f11508e, c1504v4.f11508e) && Arrays.equals(this.f11509f, c1504v4.f11509f);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f11509f) + ((Arrays.hashCode(this.f11508e) + ((Arrays.hashCode(this.f11507d) + (((this.f11504a * 31) + this.f11505b) * 961)) * 31)) * 31)) * 961;
    }
}

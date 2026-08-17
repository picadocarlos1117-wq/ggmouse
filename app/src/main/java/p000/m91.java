package p000;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class m91 {

    /* JADX INFO: renamed from: a */
    public final n91 f6717a = new n91();

    /* JADX INFO: renamed from: b */
    public final dc1 f6718b = new dc1(new byte[65025], 0);

    /* JADX INFO: renamed from: c */
    public int f6719c = -1;

    /* JADX INFO: renamed from: d */
    public int f6720d;

    /* JADX INFO: renamed from: e */
    public boolean f6721e;

    /* JADX INFO: renamed from: a */
    public final int m4411a(int i) {
        int i2;
        int i3 = 0;
        this.f6720d = 0;
        do {
            int i4 = this.f6720d;
            int i5 = i + i4;
            n91 n91Var = this.f6717a;
            if (i5 >= n91Var.f7313c) {
                break;
            }
            int[] iArr = n91Var.f7316f;
            this.f6720d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4412b(y80 y80Var) {
        int i;
        ki0.m3864h(y80Var != null);
        boolean z = this.f6721e;
        dc1 dc1Var = this.f6718b;
        if (z) {
            this.f6721e = false;
            dc1Var.m2313C(0);
        }
        while (!this.f6721e) {
            int i2 = this.f6719c;
            n91 n91Var = this.f6717a;
            if (i2 < 0) {
                if (n91Var.m4510b(y80Var, -1L) && n91Var.m4509a(y80Var, true)) {
                    int iM4411a = n91Var.f7314d;
                    if ((n91Var.f7311a & 1) == 1 && dc1Var.f2884c == 0) {
                        iM4411a += m4411a(0);
                        i = this.f6720d;
                    } else {
                        i = 0;
                    }
                    try {
                        y80Var.mo2423m(iM4411a);
                        this.f6719c = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iM4411a2 = m4411a(this.f6719c);
            int i3 = this.f6719c + this.f6720d;
            if (iM4411a2 > 0) {
                dc1Var.m2319b(dc1Var.f2884c + iM4411a2);
                try {
                    y80Var.readFully(dc1Var.f2882a, dc1Var.f2884c, iM4411a2);
                    dc1Var.m2315E(dc1Var.f2884c + iM4411a2);
                    this.f6721e = n91Var.f7316f[i3 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i3 == n91Var.f7313c) {
                i3 = -1;
            }
            this.f6719c = i3;
        }
        return true;
    }
}

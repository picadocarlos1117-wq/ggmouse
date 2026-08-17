package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class eg0 {

    /* JADX INFO: renamed from: a */
    public final c22 f3331a;

    /* JADX INFO: renamed from: d */
    public d22 f3334d;

    /* JADX INFO: renamed from: e */
    public f00 f3335e;

    /* JADX INFO: renamed from: f */
    public int f3336f;

    /* JADX INFO: renamed from: g */
    public int f3337g;

    /* JADX INFO: renamed from: h */
    public int f3338h;

    /* JADX INFO: renamed from: i */
    public int f3339i;

    /* JADX INFO: renamed from: l */
    public boolean f3342l;

    /* JADX INFO: renamed from: b */
    public final x12 f3332b = new x12();

    /* JADX INFO: renamed from: c */
    public final dc1 f3333c = new dc1();

    /* JADX INFO: renamed from: j */
    public final dc1 f3340j = new dc1(1);

    /* JADX INFO: renamed from: k */
    public final dc1 f3341k = new dc1();

    public eg0(c22 c22Var, d22 d22Var, f00 f00Var) {
        this.f3331a = c22Var;
        this.f3334d = d22Var;
        this.f3335e = f00Var;
        this.f3334d = d22Var;
        this.f3335e = f00Var;
        c22Var.mo1117d(d22Var.f2754a.f11490g);
        m2585e();
    }

    /* JADX INFO: renamed from: a */
    public final int m2581a() {
        int i;
        if (this.f3342l) {
            i = this.f3332b.f12422j[this.f3336f] ? 1 : 0;
        } else {
            i = this.f3334d.f2760g[this.f3336f];
        }
        return m2582b() != null ? 1073741824 | i : i;
    }

    /* JADX INFO: renamed from: b */
    public final w12 m2582b() {
        if (!this.f3342l) {
            return null;
        }
        x12 x12Var = this.f3332b;
        f00 f00Var = x12Var.f12413a;
        int i = z42.f13274a;
        int i2 = f00Var.f3508a;
        w12 w12Var = x12Var.f12425m;
        if (w12Var == null) {
            w12Var = this.f3334d.f2754a.f11495l[i2];
        }
        if (w12Var == null || !w12Var.f11904a) {
            return null;
        }
        return w12Var;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2583c() {
        this.f3336f++;
        if (!this.f3342l) {
            return false;
        }
        int i = this.f3337g + 1;
        this.f3337g = i;
        int[] iArr = this.f3332b.f12419g;
        int i2 = this.f3338h;
        if (i != iArr[i2]) {
            return true;
        }
        this.f3338h = i2 + 1;
        this.f3337g = 0;
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final int m2584d(int i, int i2) {
        dc1 dc1Var;
        w12 w12VarM2582b = m2582b();
        if (w12VarM2582b == null) {
            return 0;
        }
        int length = w12VarM2582b.f11907d;
        x12 x12Var = this.f3332b;
        if (length != 0) {
            dc1Var = x12Var.f12426n;
        } else {
            byte[] bArr = w12VarM2582b.f11908e;
            int i3 = z42.f13274a;
            int length2 = bArr.length;
            dc1 dc1Var2 = this.f3341k;
            dc1Var2.m2314D(length2, bArr);
            length = bArr.length;
            dc1Var = dc1Var2;
        }
        boolean z = x12Var.f12423k && x12Var.f12424l[this.f3336f];
        boolean z2 = z || i2 != 0;
        dc1 dc1Var3 = this.f3340j;
        dc1Var3.f2882a[0] = (byte) ((z2 ? 128 : 0) | length);
        dc1Var3.m2316F(0);
        c22 c22Var = this.f3331a;
        c22Var.mo1115b(dc1Var3, 1, 1);
        c22Var.mo1115b(dc1Var, length, 1);
        if (!z2) {
            return length + 1;
        }
        dc1 dc1Var4 = this.f3333c;
        if (!z) {
            dc1Var4.m2313C(8);
            byte[] bArr2 = dc1Var4.f2882a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) (i2 & 255);
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            c22Var.mo1115b(dc1Var4, 8, 1);
            return length + 9;
        }
        dc1 dc1Var5 = x12Var.f12426n;
        int iM2343z = dc1Var5.m2343z();
        dc1Var5.m2317G(-2);
        int i4 = (iM2343z * 6) + 2;
        if (i2 != 0) {
            dc1Var4.m2313C(i4);
            byte[] bArr3 = dc1Var4.f2882a;
            dc1Var5.m2322e(0, i4, bArr3);
            int i5 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i5 >> 8) & 255);
            bArr3[3] = (byte) (i5 & 255);
        } else {
            dc1Var4 = dc1Var5;
        }
        c22Var.mo1115b(dc1Var4, i4, 1);
        return length + 1 + i4;
    }

    /* JADX INFO: renamed from: e */
    public final void m2585e() {
        x12 x12Var = this.f3332b;
        x12Var.f12416d = 0;
        x12Var.f12428p = 0L;
        x12Var.f12429q = false;
        x12Var.f12423k = false;
        x12Var.f12427o = false;
        x12Var.f12425m = null;
        this.f3336f = 0;
        this.f3338h = 0;
        this.f3337g = 0;
        this.f3339i = 0;
        this.f3342l = false;
    }
}

package p000;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class zx1 implements c22 {

    /* JADX INFO: renamed from: a */
    public final c22 f13600a;

    /* JADX INFO: renamed from: b */
    public final wx1 f13601b;

    /* JADX INFO: renamed from: g */
    public yx1 f13606g;

    /* JADX INFO: renamed from: h */
    public be0 f13607h;

    /* JADX INFO: renamed from: d */
    public int f13603d = 0;

    /* JADX INFO: renamed from: e */
    public int f13604e = 0;

    /* JADX INFO: renamed from: f */
    public byte[] f13605f = z42.f13279f;

    /* JADX INFO: renamed from: c */
    public final dc1 f13602c = new dc1();

    public zx1(c22 c22Var, wx1 wx1Var) {
        this.f13600a = c22Var;
        this.f13601b = wx1Var;
    }

    @Override // p000.c22
    /* JADX INFO: renamed from: a */
    public final void mo1114a(long j, int i, int i2, int i3, b22 b22Var) {
        if (this.f13606g == null) {
            this.f13600a.mo1114a(j, i, i2, i3, b22Var);
            return;
        }
        ki0.m3859d(b22Var == null, "DRM on subtitles is not supported");
        int i4 = (this.f13604e - i3) - i2;
        this.f13606g.mo875r(this.f13605f, i4, i2, xx1.f12763c, new C0770iy(this, j, i));
        int i5 = i4 + i2;
        this.f13603d = i5;
        if (i5 == this.f13604e) {
            this.f13603d = 0;
            this.f13604e = 0;
        }
    }

    @Override // p000.c22
    /* JADX INFO: renamed from: b */
    public final void mo1115b(dc1 dc1Var, int i, int i2) {
        if (this.f13606g == null) {
            this.f13600a.mo1115b(dc1Var, i, i2);
            return;
        }
        m7384e(i);
        dc1Var.m2322e(this.f13604e, i, this.f13605f);
        this.f13604e += i;
    }

    @Override // p000.c22
    /* JADX INFO: renamed from: c */
    public final int mo1116c(InterfaceC0693gx interfaceC0693gx, int i, boolean z) throws EOFException {
        if (this.f13606g == null) {
            return this.f13600a.mo1116c(interfaceC0693gx, i, z);
        }
        m7384e(i);
        int i2 = interfaceC0693gx.read(this.f13605f, this.f13604e, i);
        if (i2 != -1) {
            this.f13604e += i2;
            return i2;
        }
        if (z) {
            return -1;
        }
        f40.m2708d();
        return 0;
    }

    @Override // p000.c22
    /* JADX INFO: renamed from: d */
    public final void mo1117d(be0 be0Var) {
        be0Var.f1341n.getClass();
        String str = be0Var.f1341n;
        ki0.m3857c(v51.m6577g(str) == 3);
        boolean zEquals = be0Var.equals(this.f13607h);
        wx1 wx1Var = this.f13601b;
        if (!zEquals) {
            this.f13607h = be0Var;
            this.f13606g = wx1Var.mo744g(be0Var) ? wx1Var.mo749l(be0Var) : null;
        }
        yx1 yx1Var = this.f13606g;
        c22 c22Var = this.f13600a;
        if (yx1Var == null) {
            c22Var.mo1117d(be0Var);
            return;
        }
        ae0 ae0VarM969a = be0Var.m969a();
        ae0VarM969a.f197m = v51.m6582l("application/x-media3-cues");
        ae0VarM969a.f194j = str;
        ae0VarM969a.f202r = Long.MAX_VALUE;
        ae0VarM969a.f181H = wx1Var.mo751p(be0Var);
        c22Var.mo1117d(new be0(ae0VarM969a));
    }

    /* JADX INFO: renamed from: e */
    public final void m7384e(int i) {
        int length = this.f13605f.length;
        int i2 = this.f13604e;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.f13603d;
        int iMax = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.f13605f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f13603d, bArr2, 0, i3);
        this.f13603d = 0;
        this.f13604e = i3;
        this.f13605f = bArr2;
    }
}

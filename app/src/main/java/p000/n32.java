package p000;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class n32 {

    /* JADX INFO: renamed from: a */
    public String f7186a;

    /* JADX INFO: renamed from: b */
    public int f7187b;

    /* JADX INFO: renamed from: c */
    public boolean f7188c;

    /* JADX INFO: renamed from: d */
    public int f7189d;

    /* JADX INFO: renamed from: e */
    public boolean f7190e;

    /* JADX INFO: renamed from: k */
    public float f7196k;

    /* JADX INFO: renamed from: l */
    public String f7197l;

    /* JADX INFO: renamed from: o */
    public Layout.Alignment f7200o;

    /* JADX INFO: renamed from: p */
    public Layout.Alignment f7201p;

    /* JADX INFO: renamed from: r */
    public rz1 f7203r;

    /* JADX INFO: renamed from: f */
    public int f7191f = -1;

    /* JADX INFO: renamed from: g */
    public int f7192g = -1;

    /* JADX INFO: renamed from: h */
    public int f7193h = -1;

    /* JADX INFO: renamed from: i */
    public int f7194i = -1;

    /* JADX INFO: renamed from: j */
    public int f7195j = -1;

    /* JADX INFO: renamed from: m */
    public int f7198m = -1;

    /* JADX INFO: renamed from: n */
    public int f7199n = -1;

    /* JADX INFO: renamed from: q */
    public int f7202q = -1;

    /* JADX INFO: renamed from: s */
    public float f7204s = Float.MAX_VALUE;

    /* JADX INFO: renamed from: a */
    public final void m4499a(n32 n32Var) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (n32Var != null) {
            if (!this.f7188c && n32Var.f7188c) {
                this.f7187b = n32Var.f7187b;
                this.f7188c = true;
            }
            if (this.f7193h == -1) {
                this.f7193h = n32Var.f7193h;
            }
            if (this.f7194i == -1) {
                this.f7194i = n32Var.f7194i;
            }
            if (this.f7186a == null && (str = n32Var.f7186a) != null) {
                this.f7186a = str;
            }
            if (this.f7191f == -1) {
                this.f7191f = n32Var.f7191f;
            }
            if (this.f7192g == -1) {
                this.f7192g = n32Var.f7192g;
            }
            if (this.f7199n == -1) {
                this.f7199n = n32Var.f7199n;
            }
            if (this.f7200o == null && (alignment2 = n32Var.f7200o) != null) {
                this.f7200o = alignment2;
            }
            if (this.f7201p == null && (alignment = n32Var.f7201p) != null) {
                this.f7201p = alignment;
            }
            if (this.f7202q == -1) {
                this.f7202q = n32Var.f7202q;
            }
            if (this.f7195j == -1) {
                this.f7195j = n32Var.f7195j;
                this.f7196k = n32Var.f7196k;
            }
            if (this.f7203r == null) {
                this.f7203r = n32Var.f7203r;
            }
            if (this.f7204s == Float.MAX_VALUE) {
                this.f7204s = n32Var.f7204s;
            }
            if (!this.f7190e && n32Var.f7190e) {
                this.f7189d = n32Var.f7189d;
                this.f7190e = true;
            }
            if (this.f7198m != -1 || (i = n32Var.f7198m) == -1) {
                return;
            }
            this.f7198m = i;
        }
    }
}

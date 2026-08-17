package p000;

import android.view.ViewGroup;

/* JADX INFO: renamed from: ps */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1306ps extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: A */
    public int f9058A;

    /* JADX INFO: renamed from: B */
    public int f9059B;

    /* JADX INFO: renamed from: C */
    public int f9060C;

    /* JADX INFO: renamed from: D */
    public int f9061D;

    /* JADX INFO: renamed from: E */
    public float f9062E;

    /* JADX INFO: renamed from: F */
    public float f9063F;

    /* JADX INFO: renamed from: G */
    public String f9064G;

    /* JADX INFO: renamed from: H */
    public float f9065H;

    /* JADX INFO: renamed from: I */
    public float f9066I;

    /* JADX INFO: renamed from: J */
    public int f9067J;

    /* JADX INFO: renamed from: K */
    public int f9068K;

    /* JADX INFO: renamed from: L */
    public int f9069L;

    /* JADX INFO: renamed from: M */
    public int f9070M;

    /* JADX INFO: renamed from: N */
    public int f9071N;

    /* JADX INFO: renamed from: O */
    public int f9072O;

    /* JADX INFO: renamed from: P */
    public int f9073P;

    /* JADX INFO: renamed from: Q */
    public int f9074Q;

    /* JADX INFO: renamed from: R */
    public float f9075R;

    /* JADX INFO: renamed from: S */
    public float f9076S;

    /* JADX INFO: renamed from: T */
    public int f9077T;

    /* JADX INFO: renamed from: U */
    public int f9078U;

    /* JADX INFO: renamed from: V */
    public int f9079V;

    /* JADX INFO: renamed from: W */
    public boolean f9080W;

    /* JADX INFO: renamed from: X */
    public boolean f9081X;

    /* JADX INFO: renamed from: Y */
    public String f9082Y;

    /* JADX INFO: renamed from: Z */
    public int f9083Z;

    /* JADX INFO: renamed from: a */
    public int f9084a;

    /* JADX INFO: renamed from: a0 */
    public boolean f9085a0;

    /* JADX INFO: renamed from: b */
    public int f9086b;

    /* JADX INFO: renamed from: b0 */
    public boolean f9087b0;

    /* JADX INFO: renamed from: c */
    public float f9088c;

    /* JADX INFO: renamed from: c0 */
    public boolean f9089c0;

    /* JADX INFO: renamed from: d */
    public boolean f9090d;

    /* JADX INFO: renamed from: d0 */
    public boolean f9091d0;

    /* JADX INFO: renamed from: e */
    public int f9092e;

    /* JADX INFO: renamed from: e0 */
    public boolean f9093e0;

    /* JADX INFO: renamed from: f */
    public int f9094f;

    /* JADX INFO: renamed from: f0 */
    public int f9095f0;

    /* JADX INFO: renamed from: g */
    public int f9096g;

    /* JADX INFO: renamed from: g0 */
    public int f9097g0;

    /* JADX INFO: renamed from: h */
    public int f9098h;

    /* JADX INFO: renamed from: h0 */
    public int f9099h0;

    /* JADX INFO: renamed from: i */
    public int f9100i;

    /* JADX INFO: renamed from: i0 */
    public int f9101i0;

    /* JADX INFO: renamed from: j */
    public int f9102j;

    /* JADX INFO: renamed from: j0 */
    public int f9103j0;

    /* JADX INFO: renamed from: k */
    public int f9104k;

    /* JADX INFO: renamed from: k0 */
    public int f9105k0;

    /* JADX INFO: renamed from: l */
    public int f9106l;

    /* JADX INFO: renamed from: l0 */
    public float f9107l0;

    /* JADX INFO: renamed from: m */
    public int f9108m;

    /* JADX INFO: renamed from: m0 */
    public int f9109m0;

    /* JADX INFO: renamed from: n */
    public int f9110n;

    /* JADX INFO: renamed from: n0 */
    public int f9111n0;

    /* JADX INFO: renamed from: o */
    public int f9112o;

    /* JADX INFO: renamed from: o0 */
    public float f9113o0;

    /* JADX INFO: renamed from: p */
    public int f9114p;

    /* JADX INFO: renamed from: p0 */
    public C1639ys f9115p0;

    /* JADX INFO: renamed from: q */
    public int f9116q;

    /* JADX INFO: renamed from: r */
    public float f9117r;

    /* JADX INFO: renamed from: s */
    public int f9118s;

    /* JADX INFO: renamed from: t */
    public int f9119t;

    /* JADX INFO: renamed from: u */
    public int f9120u;

    /* JADX INFO: renamed from: v */
    public int f9121v;

    /* JADX INFO: renamed from: w */
    public int f9122w;

    /* JADX INFO: renamed from: x */
    public int f9123x;

    /* JADX INFO: renamed from: y */
    public int f9124y;

    /* JADX INFO: renamed from: z */
    public int f9125z;

    /* JADX INFO: renamed from: a */
    public final void m5314a() {
        this.f9091d0 = false;
        this.f9085a0 = true;
        this.f9087b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f9080W) {
            this.f9085a0 = false;
            if (this.f9069L == 0) {
                this.f9069L = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f9081X) {
            this.f9087b0 = false;
            if (this.f9070M == 0) {
                this.f9070M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f9085a0 = false;
            if (i == 0 && this.f9069L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f9080W = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f9087b0 = false;
            if (i2 == 0 && this.f9070M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f9081X = true;
            }
        }
        if (this.f9088c == -1.0f && this.f9084a == -1 && this.f9086b == -1) {
            return;
        }
        this.f9091d0 = true;
        this.f9085a0 = true;
        this.f9087b0 = true;
        if (!(this.f9115p0 instanceof xi0)) {
            this.f9115p0 = new xi0();
        }
        ((xi0) this.f9115p0).m6932S(this.f9079V);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX WARN: Code duplicated, block: B:40:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x008d  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    public final void resolveLayoutDirection(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i);
        boolean z = false;
        boolean z2 = 1 == getLayoutDirection();
        this.f9099h0 = -1;
        this.f9101i0 = -1;
        this.f9095f0 = -1;
        this.f9097g0 = -1;
        this.f9103j0 = this.f9122w;
        this.f9105k0 = this.f9124y;
        float f = this.f9062E;
        this.f9107l0 = f;
        int i8 = this.f9084a;
        this.f9109m0 = i8;
        int i9 = this.f9086b;
        this.f9111n0 = i9;
        float f2 = this.f9088c;
        this.f9113o0 = f2;
        int i10 = this.f9118s;
        if (z2) {
            if (i10 != -1) {
                this.f9099h0 = i10;
            } else {
                int i11 = this.f9119t;
                if (i11 != -1) {
                    this.f9101i0 = i11;
                } else {
                    i2 = this.f9120u;
                    if (i2 != -1) {
                        this.f9097g0 = i2;
                        z = true;
                    }
                    i3 = this.f9121v;
                    if (i3 != -1) {
                        this.f9095f0 = i3;
                        z = true;
                    }
                    i4 = this.f9058A;
                    if (i4 != Integer.MIN_VALUE) {
                        this.f9105k0 = i4;
                    }
                    i5 = this.f9059B;
                    if (i5 != Integer.MIN_VALUE) {
                        this.f9103j0 = i5;
                    }
                    if (z) {
                        this.f9107l0 = 1.0f - f;
                    }
                    if (this.f9091d0 && this.f9079V == 1 && this.f9090d) {
                        if (f2 != -1.0f) {
                            this.f9113o0 = 1.0f - f2;
                            this.f9109m0 = -1;
                            this.f9111n0 = -1;
                        } else if (i8 != -1) {
                            this.f9111n0 = i8;
                            this.f9109m0 = -1;
                            this.f9113o0 = -1.0f;
                        } else if (i9 != -1) {
                            this.f9109m0 = i9;
                            this.f9111n0 = -1;
                            this.f9113o0 = -1.0f;
                        }
                    }
                }
            }
            z = true;
            i2 = this.f9120u;
            if (i2 != -1) {
                this.f9097g0 = i2;
                z = true;
            }
            i3 = this.f9121v;
            if (i3 != -1) {
                this.f9095f0 = i3;
                z = true;
            }
            i4 = this.f9058A;
            if (i4 != Integer.MIN_VALUE) {
                this.f9105k0 = i4;
            }
            i5 = this.f9059B;
            if (i5 != Integer.MIN_VALUE) {
                this.f9103j0 = i5;
            }
            if (z) {
                this.f9107l0 = 1.0f - f;
            }
            if (this.f9091d0) {
                if (f2 != -1.0f) {
                    this.f9113o0 = 1.0f - f2;
                    this.f9109m0 = -1;
                    this.f9111n0 = -1;
                } else if (i8 != -1) {
                    this.f9111n0 = i8;
                    this.f9109m0 = -1;
                    this.f9113o0 = -1.0f;
                } else if (i9 != -1) {
                    this.f9109m0 = i9;
                    this.f9111n0 = -1;
                    this.f9113o0 = -1.0f;
                }
            }
        } else {
            if (i10 != -1) {
                this.f9097g0 = i10;
            }
            int i12 = this.f9119t;
            if (i12 != -1) {
                this.f9095f0 = i12;
            }
            int i13 = this.f9120u;
            if (i13 != -1) {
                this.f9099h0 = i13;
            }
            int i14 = this.f9121v;
            if (i14 != -1) {
                this.f9101i0 = i14;
            }
            int i15 = this.f9058A;
            if (i15 != Integer.MIN_VALUE) {
                this.f9103j0 = i15;
            }
            int i16 = this.f9059B;
            if (i16 != Integer.MIN_VALUE) {
                this.f9105k0 = i16;
            }
        }
        if (this.f9120u == -1 && this.f9121v == -1 && this.f9119t == -1 && i10 == -1) {
            int i17 = this.f9096g;
            if (i17 != -1) {
                this.f9099h0 = i17;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i18 = this.f9098h;
                if (i18 != -1) {
                    this.f9101i0 = i18;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i19 = this.f9092e;
            if (i19 != -1) {
                this.f9095f0 = i19;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i20 = this.f9094f;
            if (i20 != -1) {
                this.f9097g0 = i20;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }
}

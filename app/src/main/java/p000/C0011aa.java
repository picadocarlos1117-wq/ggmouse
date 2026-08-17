package p000;

import com.example.ssmousepro.injection.TouchPipeline;
import java.util.Arrays;

/* JADX INFO: renamed from: aa */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0011aa {

    /* JADX INFO: renamed from: b */
    public final C0670ga f97b;

    /* JADX INFO: renamed from: c */
    public final C1174o9 f98c;

    /* JADX INFO: renamed from: a */
    public int f96a = 0;

    /* JADX INFO: renamed from: d */
    public int f99d = 8;

    /* JADX INFO: renamed from: e */
    public int[] f100e = new int[8];

    /* JADX INFO: renamed from: f */
    public int[] f101f = new int[8];

    /* JADX INFO: renamed from: g */
    public float[] f102g = new float[8];

    /* JADX INFO: renamed from: h */
    public int f103h = -1;

    /* JADX INFO: renamed from: i */
    public int f104i = -1;

    /* JADX INFO: renamed from: j */
    public boolean f105j = false;

    public C0011aa(C0670ga c0670ga, C1174o9 c1174o9) {
        this.f97b = c0670ga;
        this.f98c = c1174o9;
    }

    /* JADX INFO: renamed from: a */
    public final void m128a(au1 au1Var, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f103h;
            C0670ga c0670ga = this.f97b;
            if (i == -1) {
                this.f103h = 0;
                this.f102g[0] = f;
                this.f100e[0] = au1Var.f1056b;
                this.f101f[0] = -1;
                au1Var.f1065p++;
                au1Var.m716a(c0670ga);
                this.f96a++;
                if (this.f105j) {
                    return;
                }
                int i2 = this.f104i + 1;
                this.f104i = i2;
                int[] iArr = this.f100e;
                if (i2 >= iArr.length) {
                    this.f105j = true;
                    this.f104i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f96a; i4++) {
                int i5 = this.f100e[i];
                int i6 = au1Var.f1056b;
                if (i5 == i6) {
                    float[] fArr = this.f102g;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == TouchPipeline.SIZE) {
                        int i7 = this.f103h;
                        int[] iArr2 = this.f101f;
                        if (i == i7) {
                            this.f103h = iArr2[i];
                        } else {
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            au1Var.m717b(c0670ga);
                        }
                        if (this.f105j) {
                            this.f104i = i;
                        }
                        au1Var.f1065p--;
                        this.f96a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f101f[i];
            }
            int length = this.f104i;
            int i8 = length + 1;
            if (this.f105j) {
                int[] iArr3 = this.f100e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i8;
            }
            int[] iArr4 = this.f100e;
            if (length >= iArr4.length && this.f96a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f100e;
                    if (i9 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i9] == -1) {
                        length = i9;
                        break;
                    }
                    i9++;
                }
            }
            int[] iArr6 = this.f100e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i10 = this.f99d * 2;
                this.f99d = i10;
                this.f105j = false;
                this.f104i = length - 1;
                this.f102g = Arrays.copyOf(this.f102g, i10);
                this.f100e = Arrays.copyOf(this.f100e, this.f99d);
                this.f101f = Arrays.copyOf(this.f101f, this.f99d);
            }
            this.f100e[length] = au1Var.f1056b;
            this.f102g[length] = f;
            int[] iArr7 = this.f101f;
            if (i3 != -1) {
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                iArr7[length] = this.f103h;
                this.f103h = length;
            }
            au1Var.f1065p++;
            au1Var.m716a(c0670ga);
            this.f96a++;
            if (!this.f105j) {
                this.f104i++;
            }
            int i11 = this.f104i;
            int[] iArr8 = this.f100e;
            if (i11 >= iArr8.length) {
                this.f105j = true;
                this.f104i = iArr8.length - 1;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m129b() {
        int i = this.f103h;
        for (int i2 = 0; i != -1 && i2 < this.f96a; i2++) {
            au1 au1Var = ((au1[]) this.f98c.f7701d)[this.f100e[i]];
            if (au1Var != null) {
                au1Var.m717b(this.f97b);
            }
            i = this.f101f[i];
        }
        this.f103h = -1;
        this.f104i = -1;
        this.f105j = false;
        this.f96a = 0;
    }

    /* JADX INFO: renamed from: c */
    public final float m130c(au1 au1Var) {
        int i = this.f103h;
        for (int i2 = 0; i != -1 && i2 < this.f96a; i2++) {
            if (this.f100e[i] == au1Var.f1056b) {
                return this.f102g[i];
            }
            i = this.f101f[i];
        }
        return TouchPipeline.SIZE;
    }

    /* JADX INFO: renamed from: d */
    public final int m131d() {
        return this.f96a;
    }

    /* JADX INFO: renamed from: e */
    public final au1 m132e(int i) {
        int i2 = this.f103h;
        for (int i3 = 0; i2 != -1 && i3 < this.f96a; i3++) {
            if (i3 == i) {
                return ((au1[]) this.f98c.f7701d)[this.f100e[i2]];
            }
            i2 = this.f101f[i2];
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final float m133f(int i) {
        int i2 = this.f103h;
        for (int i3 = 0; i2 != -1 && i3 < this.f96a; i3++) {
            if (i3 == i) {
                return this.f102g[i2];
            }
            i2 = this.f101f[i2];
        }
        return TouchPipeline.SIZE;
    }

    /* JADX INFO: renamed from: g */
    public final void m134g(au1 au1Var, float f) {
        if (f == TouchPipeline.SIZE) {
            m135h(au1Var, true);
            return;
        }
        int i = this.f103h;
        C0670ga c0670ga = this.f97b;
        if (i == -1) {
            this.f103h = 0;
            this.f102g[0] = f;
            this.f100e[0] = au1Var.f1056b;
            this.f101f[0] = -1;
            au1Var.f1065p++;
            au1Var.m716a(c0670ga);
            this.f96a++;
            if (this.f105j) {
                return;
            }
            int i2 = this.f104i + 1;
            this.f104i = i2;
            int[] iArr = this.f100e;
            if (i2 >= iArr.length) {
                this.f105j = true;
                this.f104i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f96a; i4++) {
            int i5 = this.f100e[i];
            int i6 = au1Var.f1056b;
            if (i5 == i6) {
                this.f102g[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f101f[i];
        }
        int length = this.f104i;
        int i7 = length + 1;
        if (this.f105j) {
            int[] iArr2 = this.f100e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.f100e;
        if (length >= iArr3.length && this.f96a < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f100e;
                if (i8 >= iArr4.length) {
                    break;
                }
                if (iArr4[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr5 = this.f100e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.f99d * 2;
            this.f99d = i9;
            this.f105j = false;
            this.f104i = length - 1;
            this.f102g = Arrays.copyOf(this.f102g, i9);
            this.f100e = Arrays.copyOf(this.f100e, this.f99d);
            this.f101f = Arrays.copyOf(this.f101f, this.f99d);
        }
        this.f100e[length] = au1Var.f1056b;
        this.f102g[length] = f;
        int[] iArr6 = this.f101f;
        if (i3 != -1) {
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            iArr6[length] = this.f103h;
            this.f103h = length;
        }
        au1Var.f1065p++;
        au1Var.m716a(c0670ga);
        int i10 = this.f96a + 1;
        this.f96a = i10;
        if (!this.f105j) {
            this.f104i++;
        }
        int[] iArr7 = this.f100e;
        if (i10 >= iArr7.length) {
            this.f105j = true;
        }
        if (this.f104i >= iArr7.length) {
            this.f105j = true;
            this.f104i = iArr7.length - 1;
        }
    }

    /* JADX INFO: renamed from: h */
    public final float m135h(au1 au1Var, boolean z) {
        int i = this.f103h;
        if (i == -1) {
            return TouchPipeline.SIZE;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f96a) {
            if (this.f100e[i] == au1Var.f1056b) {
                int i4 = this.f103h;
                int[] iArr = this.f101f;
                if (i == i4) {
                    this.f103h = iArr[i];
                } else {
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    au1Var.m717b(this.f97b);
                }
                au1Var.f1065p--;
                this.f96a--;
                this.f100e[i] = -1;
                if (this.f105j) {
                    this.f104i = i;
                }
                return this.f102g[i];
            }
            i2++;
            i3 = i;
            i = this.f101f[i];
        }
        return TouchPipeline.SIZE;
    }

    public final String toString() {
        int i = this.f103h;
        String string = "";
        for (int i2 = 0; i != -1 && i2 < this.f96a; i2++) {
            StringBuilder sbM5344k = AbstractC1308pu.m5344k(string.concat(" -> "));
            sbM5344k.append(this.f102g[i]);
            sbM5344k.append(" : ");
            StringBuilder sbM5344k2 = AbstractC1308pu.m5344k(sbM5344k.toString());
            sbM5344k2.append(((au1[]) this.f98c.f7701d)[this.f100e[i]]);
            string = sbM5344k2.toString();
            i = this.f101f[i];
        }
        return string;
    }
}

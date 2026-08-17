package p000;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.exoplayer.image.ImageOutput;
import com.example.ssmousepro.LoginActivity;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class im0 extends AbstractC0828kh {

    /* JADX INFO: renamed from: A */
    public boolean f5085A;

    /* JADX INFO: renamed from: B */
    public hm0 f5086B;

    /* JADX INFO: renamed from: C */
    public long f5087C;

    /* JADX INFO: renamed from: D */
    public long f5088D;

    /* JADX INFO: renamed from: E */
    public int f5089E;

    /* JADX INFO: renamed from: F */
    public int f5090F;

    /* JADX INFO: renamed from: G */
    public be0 f5091G;

    /* JADX INFO: renamed from: H */
    public C0715hi f5092H;

    /* JADX INFO: renamed from: I */
    public C1533vx f5093I;

    /* JADX INFO: renamed from: J */
    public ImageOutput f5094J;

    /* JADX INFO: renamed from: K */
    public Bitmap f5095K;

    /* JADX INFO: renamed from: L */
    public boolean f5096L;

    /* JADX INFO: renamed from: M */
    public C1583x9 f5097M;

    /* JADX INFO: renamed from: N */
    public C1583x9 f5098N;

    /* JADX INFO: renamed from: O */
    public int f5099O;

    /* JADX INFO: renamed from: w */
    public final em0 f5100w;

    /* JADX INFO: renamed from: x */
    public final C1533vx f5101x;

    /* JADX INFO: renamed from: y */
    public final ArrayDeque f5102y;

    /* JADX INFO: renamed from: z */
    public boolean f5103z;

    public im0(em0 em0Var) {
        super(4);
        this.f5100w = em0Var;
        this.f5094J = ImageOutput.f783a;
        this.f5101x = new C1533vx(0);
        this.f5086B = hm0.f4614c;
        this.f5102y = new ArrayDeque();
        this.f5088D = -9223372036854775807L;
        this.f5087C = -9223372036854775807L;
        this.f5089E = 0;
        this.f5090F = 1;
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: B */
    public final int mo2886B(be0 be0Var) {
        return ((ay0) this.f5100w).m764C(be0Var);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00db  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:72:0x0126  */
    /* JADX WARN: Code duplicated, block: B:74:0x013f  */
    /* JADX INFO: renamed from: D */
    public final boolean m3451D(long j) throws t70 {
        boolean z;
        C1583x9 c1583x9;
        boolean z2;
        int i;
        int i2;
        int i3;
        be0 be0Var;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmap = this.f5095K;
        if ((bitmap == null || this.f5097M != null) && (this.f5090F != 0 || this.f5813m == 2)) {
            ArrayDeque arrayDeque = this.f5102y;
            if (bitmap == null) {
                ki0.m3866j(this.f5092H);
                C0678gi c0678gi = (C0678gi) this.f5092H.mo3012c();
                if (c0678gi != null) {
                    if (!c0678gi.m4599i(4)) {
                        ki0.m3867k(c0678gi.f4192n, "Non-EOS buffer came back from the decoder without bitmap.");
                        this.f5095K = c0678gi.f4192n;
                        c0678gi.mo2827s();
                        if (this.f5096L && this.f5095K != null && this.f5097M != null) {
                            ki0.m3866j(this.f5091G);
                            be0 be0Var2 = this.f5091G;
                            int i4 = be0Var2.f1324J;
                            int i5 = be0Var2.f1325K;
                            z = ((i4 != 1 && i5 == 1) || i4 == -1 || i5 == -1) ? false : true;
                            c1583x9 = this.f5097M;
                            if (((Bitmap) c1583x9.f12496c) == null) {
                                if (z) {
                                    int i6 = c1583x9.f12494a;
                                    ki0.m3866j(this.f5095K);
                                    int width = this.f5095K.getWidth();
                                    be0 be0Var3 = this.f5091G;
                                    ki0.m3866j(be0Var3);
                                    int i7 = width / be0Var3.f1324J;
                                    int height = this.f5095K.getHeight();
                                    be0 be0Var4 = this.f5091G;
                                    ki0.m3866j(be0Var4);
                                    int i8 = height / be0Var4.f1325K;
                                    int i9 = this.f5091G.f1324J;
                                    bitmapCreateBitmap = Bitmap.createBitmap(this.f5095K, (i6 % i9) * i7, (i6 / i9) * i8, i7, i8);
                                } else {
                                    bitmapCreateBitmap = this.f5095K;
                                    ki0.m3866j(bitmapCreateBitmap);
                                }
                                c1583x9.f12496c = bitmapCreateBitmap;
                            }
                            Bitmap bitmap2 = (Bitmap) this.f5097M.f12496c;
                            ki0.m3866j(bitmap2);
                            long j2 = this.f5097M.f12495b;
                            long j3 = j2 - j;
                            if (this.f5813m == 2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            i = this.f5090F;
                            if (i != 0) {
                                if (i != 1) {
                                    z2 = true;
                                } else {
                                    if (i == 3) {
                                        l41.m4046o();
                                        return false;
                                    }
                                    z2 = false;
                                }
                            }
                            if (!z2 || j3 < LoginActivity.AUTH_TIMEOUT_MS) {
                                this.f5094J.onImageAvailable(j2 - this.f5086B.f4616b, bitmap2);
                                C1583x9 c1583x10 = this.f5097M;
                                ki0.m3866j(c1583x10);
                                long j4 = c1583x10.f12495b;
                                this.f5087C = j4;
                                while (!arrayDeque.isEmpty() && j4 >= ((hm0) arrayDeque.peek()).f4615a) {
                                    this.f5086B = (hm0) arrayDeque.removeFirst();
                                }
                                this.f5090F = 3;
                                if (z) {
                                    C1583x9 c1583x11 = this.f5097M;
                                    ki0.m3866j(c1583x11);
                                    i2 = c1583x11.f12494a;
                                    be0 be0Var5 = this.f5091G;
                                    ki0.m3866j(be0Var5);
                                    i3 = be0Var5.f1325K;
                                    be0Var = this.f5091G;
                                    ki0.m3866j(be0Var);
                                    if (i2 == (i3 * be0Var.f1324J) - 1) {
                                        this.f5095K = null;
                                    }
                                } else {
                                    this.f5095K = null;
                                }
                                this.f5097M = this.f5098N;
                                this.f5098N = null;
                                return true;
                            }
                        }
                    } else {
                        if (this.f5089E == 3) {
                            m3454G();
                            ki0.m3866j(this.f5091G);
                            m3453F();
                            return false;
                        }
                        c0678gi.mo2827s();
                        if (arrayDeque.isEmpty()) {
                            this.f5085A = true;
                            return false;
                        }
                    }
                }
            } else if (this.f5096L) {
                ki0.m3866j(this.f5091G);
                be0 be0Var6 = this.f5091G;
                int i10 = be0Var6.f1324J;
                int i11 = be0Var6.f1325K;
                if (i10 != 1) {
                }
                c1583x9 = this.f5097M;
                if (((Bitmap) c1583x9.f12496c) == null) {
                    if (z) {
                        int i12 = c1583x9.f12494a;
                        ki0.m3866j(this.f5095K);
                        int width2 = this.f5095K.getWidth();
                        be0 be0Var7 = this.f5091G;
                        ki0.m3866j(be0Var7);
                        int i13 = width2 / be0Var7.f1324J;
                        int height2 = this.f5095K.getHeight();
                        be0 be0Var8 = this.f5091G;
                        ki0.m3866j(be0Var8);
                        int i14 = height2 / be0Var8.f1325K;
                        int i15 = this.f5091G.f1324J;
                        bitmapCreateBitmap = Bitmap.createBitmap(this.f5095K, (i12 % i15) * i13, (i12 / i15) * i14, i13, i14);
                    } else {
                        bitmapCreateBitmap = this.f5095K;
                        ki0.m3866j(bitmapCreateBitmap);
                    }
                    c1583x9.f12496c = bitmapCreateBitmap;
                }
                Bitmap bitmap3 = (Bitmap) this.f5097M.f12496c;
                ki0.m3866j(bitmap3);
                long j5 = this.f5097M.f12495b;
                long j6 = j5 - j;
                if (this.f5813m == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i = this.f5090F;
                if (i != 0) {
                    if (i != 1) {
                        z2 = true;
                    } else {
                        if (i == 3) {
                            l41.m4046o();
                            return false;
                        }
                        z2 = false;
                    }
                }
                if (!z2) {
                }
                this.f5094J.onImageAvailable(j5 - this.f5086B.f4616b, bitmap3);
                C1583x9 c1583x12 = this.f5097M;
                ki0.m3866j(c1583x12);
                long j7 = c1583x12.f12495b;
                this.f5087C = j7;
                while (!arrayDeque.isEmpty()) {
                    this.f5086B = (hm0) arrayDeque.removeFirst();
                }
                this.f5090F = 3;
                if (z) {
                    C1583x9 c1583x13 = this.f5097M;
                    ki0.m3866j(c1583x13);
                    i2 = c1583x13.f12494a;
                    be0 be0Var9 = this.f5091G;
                    ki0.m3866j(be0Var9);
                    i3 = be0Var9.f1325K;
                    be0Var = this.f5091G;
                    ki0.m3866j(be0Var);
                    if (i2 == (i3 * be0Var.f1324J) - 1) {
                        this.f5095K = null;
                    }
                } else {
                    this.f5095K = null;
                }
                this.f5097M = this.f5098N;
                this.f5098N = null;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0038  */
    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:38:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x009d  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:80:0x0104  */
    /* JADX WARN: Code duplicated, block: B:83:0x0115  */
    /* JADX WARN: Code duplicated, block: B:85:0x011a  */
    /* JADX WARN: Code duplicated, block: B:87:0x012b  */
    /* JADX WARN: Code duplicated, block: B:88:0x012e  */
    /* JADX WARN: Code duplicated, block: B:91:0x013a  */
    /* JADX INFO: renamed from: E */
    public final boolean m3452E(long j) {
        int i;
        C1533vx c1533vx;
        int iM3833w;
        ByteBuffer byteBuffer;
        C1533vx c1533vx2;
        boolean z;
        C1533vx c1533vx3;
        long j2;
        boolean z2;
        C1583x9 c1583x9;
        boolean z3;
        be0 be0Var;
        boolean z4;
        boolean z5;
        be0 be0Var2;
        int i2;
        C1533vx c1533vx4;
        if (!this.f5096L || this.f5097M == null) {
            C0558d8 c0558d8 = this.f5808c;
            c0558d8.m2267h();
            C0715hi c0715hi = this.f5092H;
            if (c0715hi != null && this.f5089E != 3 && !this.f5103z) {
                if (this.f5093I == null) {
                    C1533vx c1533vx5 = (C1533vx) c0715hi.mo3013d();
                    this.f5093I = c1533vx5;
                    if (c1533vx5 != null) {
                        i = this.f5089E;
                        c1533vx = this.f5093I;
                        if (i == 2) {
                            ki0.m3866j(c1533vx);
                            this.f5093I.f7542b = 4;
                            C0715hi c0715hi2 = this.f5092H;
                            ki0.m3866j(c0715hi2);
                            c0715hi2.mo3014e(this.f5093I);
                            this.f5093I = null;
                            this.f5089E = 3;
                            return false;
                        }
                        iM3833w = m3833w(c0558d8, c1533vx, 0);
                        if (iM3833w != -5) {
                            be0 be0Var3 = (be0) c0558d8.f2822c;
                            ki0.m3866j(be0Var3);
                            this.f5091G = be0Var3;
                            this.f5089E = 2;
                            return true;
                        }
                        if (iM3833w != -4) {
                            this.f5093I.m6665u();
                            byteBuffer = this.f5093I.f11795n;
                            if (byteBuffer != null || byteBuffer.remaining() <= 0) {
                                c1533vx2 = this.f5093I;
                                ki0.m3866j(c1533vx2);
                                if (c1533vx2.m4599i(4)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = true;
                            }
                            if (z) {
                                C0715hi c0715hi3 = this.f5092H;
                                ki0.m3866j(c0715hi3);
                                C1533vx c1533vx6 = this.f5093I;
                                ki0.m3866j(c1533vx6);
                                c0715hi3.mo3014e(c1533vx6);
                                this.f5099O = 0;
                            }
                            c1533vx3 = this.f5093I;
                            ki0.m3866j(c1533vx3);
                            if (c1533vx3.m4599i(4)) {
                                this.f5096L = true;
                            } else {
                                int i3 = this.f5099O;
                                j2 = c1533vx3.f11797p;
                                C1583x9 c1583x10 = new C1583x9();
                                c1583x10.f12494a = i3;
                                c1583x10.f12495b = j2;
                                this.f5098N = c1583x10;
                                this.f5099O = i3 + 1;
                                if (this.f5096L) {
                                    this.f5097M = this.f5098N;
                                    this.f5098N = null;
                                } else {
                                    if (j2 - LoginActivity.AUTH_TIMEOUT_MS <= j || j > LoginActivity.AUTH_TIMEOUT_MS + j2) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    c1583x9 = this.f5097M;
                                    if (c1583x9 != null || c1583x9.f12495b > j || j >= j2) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    be0Var = this.f5091G;
                                    ki0.m3866j(be0Var);
                                    if (be0Var.f1324J != -1 || (i2 = (be0Var2 = this.f5091G).f1325K) == -1 || i3 == (i2 * be0Var2.f1324J) - 1) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (!z2 || z3 || z4) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    this.f5096L = z5;
                                    if (z3 || z2) {
                                        this.f5097M = this.f5098N;
                                        this.f5098N = null;
                                    }
                                }
                            }
                            c1533vx4 = this.f5093I;
                            ki0.m3866j(c1533vx4);
                            if (c1533vx4.m4599i(4)) {
                                this.f5103z = true;
                                this.f5093I = null;
                                return false;
                            }
                            long j3 = this.f5088D;
                            C1533vx c1533vx7 = this.f5093I;
                            ki0.m3866j(c1533vx7);
                            this.f5088D = Math.max(j3, c1533vx7.f11797p);
                            if (z) {
                                this.f5093I = null;
                            } else {
                                C1533vx c1533vx8 = this.f5093I;
                                ki0.m3866j(c1533vx8);
                                c1533vx8.mo5844r();
                            }
                            return !this.f5096L;
                        }
                        if (iM3833w != -3) {
                            l41.m4046o();
                            return false;
                        }
                    }
                } else {
                    i = this.f5089E;
                    c1533vx = this.f5093I;
                    if (i == 2) {
                        ki0.m3866j(c1533vx);
                        this.f5093I.f7542b = 4;
                        C0715hi c0715hi4 = this.f5092H;
                        ki0.m3866j(c0715hi4);
                        c0715hi4.mo3014e(this.f5093I);
                        this.f5093I = null;
                        this.f5089E = 3;
                        return false;
                    }
                    iM3833w = m3833w(c0558d8, c1533vx, 0);
                    if (iM3833w != -5) {
                        be0 be0Var4 = (be0) c0558d8.f2822c;
                        ki0.m3866j(be0Var4);
                        this.f5091G = be0Var4;
                        this.f5089E = 2;
                        return true;
                    }
                    if (iM3833w != -4) {
                        this.f5093I.m6665u();
                        byteBuffer = this.f5093I.f11795n;
                        if (byteBuffer != null) {
                            c1533vx2 = this.f5093I;
                            ki0.m3866j(c1533vx2);
                            if (c1533vx2.m4599i(4)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            c1533vx2 = this.f5093I;
                            ki0.m3866j(c1533vx2);
                            if (c1533vx2.m4599i(4)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            C0715hi c0715hi5 = this.f5092H;
                            ki0.m3866j(c0715hi5);
                            C1533vx c1533vx9 = this.f5093I;
                            ki0.m3866j(c1533vx9);
                            c0715hi5.mo3014e(c1533vx9);
                            this.f5099O = 0;
                        }
                        c1533vx3 = this.f5093I;
                        ki0.m3866j(c1533vx3);
                        if (c1533vx3.m4599i(4)) {
                            this.f5096L = true;
                        } else {
                            int i4 = this.f5099O;
                            j2 = c1533vx3.f11797p;
                            C1583x9 c1583x11 = new C1583x9();
                            c1583x11.f12494a = i4;
                            c1583x11.f12495b = j2;
                            this.f5098N = c1583x11;
                            this.f5099O = i4 + 1;
                            if (this.f5096L) {
                                this.f5097M = this.f5098N;
                                this.f5098N = null;
                            } else {
                                if (j2 - LoginActivity.AUTH_TIMEOUT_MS <= j) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                c1583x9 = this.f5097M;
                                if (c1583x9 != null) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                be0Var = this.f5091G;
                                ki0.m3866j(be0Var);
                                if (be0Var.f1324J != -1) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                if (z2) {
                                    z5 = true;
                                } else {
                                    z5 = true;
                                }
                                this.f5096L = z5;
                                if (z3) {
                                    this.f5097M = this.f5098N;
                                    this.f5098N = null;
                                } else {
                                    this.f5097M = this.f5098N;
                                    this.f5098N = null;
                                }
                            }
                        }
                        c1533vx4 = this.f5093I;
                        ki0.m3866j(c1533vx4);
                        if (c1533vx4.m4599i(4)) {
                            this.f5103z = true;
                            this.f5093I = null;
                            return false;
                        }
                        long j4 = this.f5088D;
                        C1533vx c1533vx10 = this.f5093I;
                        ki0.m3866j(c1533vx10);
                        this.f5088D = Math.max(j4, c1533vx10.f11797p);
                        if (z) {
                            this.f5093I = null;
                        } else {
                            C1533vx c1533vx11 = this.f5093I;
                            ki0.m3866j(c1533vx11);
                            c1533vx11.mo5844r();
                        }
                        return !this.f5096L;
                    }
                    if (iM3833w != -3) {
                        l41.m4046o();
                        return false;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: F */
    public final void m3453F() throws t70 {
        be0 be0Var = this.f5091G;
        ay0 ay0Var = (ay0) this.f5100w;
        int iM764C = ay0Var.m764C(be0Var);
        if (iM764C != AbstractC0828kh.m3828f(4, 0, 0, 0) && iM764C != AbstractC0828kh.m3828f(3, 0, 0, 0)) {
            throw m3830g(new fm0("Provided decoder factory can't create decoder for format."), this.f5091G, false, 4005);
        }
        C0715hi c0715hi = this.f5092H;
        if (c0715hi != null) {
            c0715hi.release();
        }
        this.f5092H = new C0715hi((f40) ay0Var.f1096b);
    }

    /* JADX INFO: renamed from: G */
    public final void m3454G() {
        this.f5093I = null;
        this.f5089E = 0;
        this.f5088D = -9223372036854775807L;
        C0715hi c0715hi = this.f5092H;
        if (c0715hi != null) {
            c0715hi.release();
            this.f5092H = null;
        }
    }

    @Override // p000.AbstractC0828kh, p000.ze1
    /* JADX INFO: renamed from: d */
    public final void mo29d(int i, Object obj) {
        if (i != 15) {
            return;
        }
        ImageOutput imageOutput = obj instanceof ImageOutput ? (ImageOutput) obj : null;
        if (imageOutput == null) {
            imageOutput = ImageOutput.f783a;
        }
        this.f5094J = imageOutput;
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: j */
    public final String mo34j() {
        return "ImageRenderer";
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: l */
    public final boolean mo35l() {
        return this.f5085A;
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: n */
    public final boolean mo37n() {
        int i = this.f5090F;
        if (i != 3) {
            return i == 0 && this.f5096L;
        }
        return true;
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: o */
    public final void mo38o() {
        this.f5091G = null;
        this.f5086B = hm0.f4614c;
        this.f5102y.clear();
        m3454G();
        this.f5094J.mo444a();
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: p */
    public final void mo39p(boolean z, boolean z2) {
        this.f5090F = z2 ? 1 : 0;
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: q */
    public final void mo40q(long j, boolean z) {
        this.f5090F = Math.min(this.f5090F, 1);
        this.f5085A = false;
        this.f5103z = false;
        this.f5095K = null;
        this.f5097M = null;
        this.f5098N = null;
        this.f5096L = false;
        this.f5093I = null;
        C0715hi c0715hi = this.f5092H;
        if (c0715hi != null) {
            c0715hi.flush();
        }
        this.f5102y.clear();
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: r */
    public final void mo41r() {
        m3454G();
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: s */
    public final void mo42s() {
        m3454G();
        this.f5090F = Math.min(this.f5090F, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo2916v(p000.be0[] r5, long r6, long r8, p000.q21 r10) {
        /*
            r4 = this;
            hm0 r5 = r4.f5086B
            long r5 = r5.f4616b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            java.util.ArrayDeque r5 = r4.f5102y
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.f5088D
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.f5087C
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L26
            goto L31
        L26:
            hm0 r6 = new hm0
            long r0 = r4.f5088D
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L31:
            hm0 r5 = new hm0
            r5.<init>(r0, r8)
            r4.f5086B = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.im0.mo2916v(be0[], long, long, q21):void");
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: x */
    public final void mo2919x(long j, long j2) throws t70 {
        if (this.f5085A) {
            return;
        }
        if (this.f5091G == null) {
            C0558d8 c0558d8 = this.f5808c;
            c0558d8.m2267h();
            C1533vx c1533vx = this.f5101x;
            c1533vx.mo5844r();
            int iM3833w = m3833w(c0558d8, c1533vx, 2);
            if (iM3833w != -5) {
                if (iM3833w == -4) {
                    ki0.m3864h(c1533vx.m4599i(4));
                    this.f5103z = true;
                    this.f5085A = true;
                    return;
                }
                return;
            }
            be0 be0Var = (be0) c0558d8.f2822c;
            ki0.m3866j(be0Var);
            this.f5091G = be0Var;
            m3453F();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (m3451D(j)) {
            }
            while (m3452E(j)) {
            }
            Trace.endSection();
        } catch (fm0 e) {
            throw m3830g(e, null, false, 4003);
        }
    }
}

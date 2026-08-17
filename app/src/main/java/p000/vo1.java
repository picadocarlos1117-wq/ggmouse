package p000;

import android.media.MediaCodec;
import android.sun.security.util.DerValue;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class vo1 {

    /* JADX INFO: renamed from: a */
    public final C0547cy f11732a;

    /* JADX INFO: renamed from: b */
    public final int f11733b;

    /* JADX INFO: renamed from: c */
    public final dc1 f11734c;

    /* JADX INFO: renamed from: d */
    public C0642fj f11735d;

    /* JADX INFO: renamed from: e */
    public C0642fj f11736e;

    /* JADX INFO: renamed from: f */
    public C0642fj f11737f;

    /* JADX INFO: renamed from: g */
    public long f11738g;

    public vo1(C0547cy c0547cy) {
        this.f11732a = c0547cy;
        int i = c0547cy.f2656b;
        this.f11733b = i;
        this.f11734c = new dc1(32);
        C0642fj c0642fj = new C0642fj(0L, i);
        this.f11735d = c0642fj;
        this.f11736e = c0642fj;
        this.f11737f = c0642fj;
    }

    /* JADX INFO: renamed from: c */
    public static C0642fj m6646c(C0642fj c0642fj, long j, ByteBuffer byteBuffer, int i) {
        while (j >= c0642fj.f3825b) {
            c0642fj = (C0642fj) c0642fj.f3827d;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (c0642fj.f3825b - j));
            C1468u5 c1468u5 = (C1468u5) c0642fj.f3826c;
            byteBuffer.put(c1468u5.f11122a, ((int) (j - c0642fj.f3824a)) + c1468u5.f11123b, iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == c0642fj.f3825b) {
                c0642fj = (C0642fj) c0642fj.f3827d;
            }
        }
        return c0642fj;
    }

    /* JADX INFO: renamed from: d */
    public static C0642fj m6647d(C0642fj c0642fj, long j, byte[] bArr, int i) {
        while (j >= c0642fj.f3825b) {
            c0642fj = (C0642fj) c0642fj.f3827d;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (c0642fj.f3825b - j));
            C1468u5 c1468u5 = (C1468u5) c0642fj.f3826c;
            System.arraycopy(c1468u5.f11122a, ((int) (j - c0642fj.f3824a)) + c1468u5.f11123b, bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == c0642fj.f3825b) {
                c0642fj = (C0642fj) c0642fj.f3827d;
            }
        }
        return c0642fj;
    }

    /* JADX INFO: renamed from: e */
    public static C0642fj m6648e(C0642fj c0642fj, C1533vx c1533vx, C1583x9 c1583x9, dc1 dc1Var) {
        if (c1533vx.m4599i(1073741824)) {
            long j = c1583x9.f12495b;
            int iM2343z = 1;
            dc1Var.m2313C(1);
            C0642fj c0642fjM6647d = m6647d(c0642fj, j, dc1Var.f2882a, 1);
            long j2 = j + 1;
            byte b = dc1Var.f2882a[0];
            boolean z = (b & DerValue.TAG_CONTEXT) != 0;
            int i = b & 127;
            C0580dv c0580dv = c1533vx.f11794m;
            byte[] bArr = c0580dv.f3014a;
            if (bArr == null) {
                c0580dv.f3014a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            c0642fj = m6647d(c0642fjM6647d, j2, c0580dv.f3014a, i);
            long j3 = j2 + ((long) i);
            if (z) {
                dc1Var.m2313C(2);
                c0642fj = m6647d(c0642fj, j3, dc1Var.f2882a, 2);
                j3 += 2;
                iM2343z = dc1Var.m2343z();
            }
            int[] iArr = c0580dv.f3017d;
            if (iArr == null || iArr.length < iM2343z) {
                iArr = new int[iM2343z];
            }
            int[] iArr2 = c0580dv.f3018e;
            if (iArr2 == null || iArr2.length < iM2343z) {
                iArr2 = new int[iM2343z];
            }
            if (z) {
                int i2 = iM2343z * 6;
                dc1Var.m2313C(i2);
                c0642fj = m6647d(c0642fj, j3, dc1Var.f2882a, i2);
                j3 += (long) i2;
                dc1Var.m2316F(0);
                for (int i3 = 0; i3 < iM2343z; i3++) {
                    iArr[i3] = dc1Var.m2343z();
                    iArr2[i3] = dc1Var.m2341x();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = c1583x9.f12494a - ((int) (j3 - c1583x9.f12495b));
            }
            b22 b22Var = (b22) c1583x9.f12496c;
            int i4 = z42.f13274a;
            byte[] bArr2 = b22Var.f1134b;
            byte[] bArr3 = c0580dv.f3014a;
            int i5 = b22Var.f1133a;
            int i6 = b22Var.f1135c;
            int i7 = b22Var.f1136d;
            c0580dv.f3019f = iM2343z;
            c0580dv.f3017d = iArr;
            c0580dv.f3018e = iArr2;
            c0580dv.f3015b = bArr2;
            c0580dv.f3014a = bArr3;
            c0580dv.f3016c = i5;
            c0580dv.f3020g = i6;
            c0580dv.f3021h = i7;
            MediaCodec.CryptoInfo cryptoInfo = c0580dv.f3022i;
            cryptoInfo.numSubSamples = iM2343z;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            if (z42.f13274a >= 24) {
                C0558d8 c0558d8 = c0580dv.f3023j;
                c0558d8.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) c0558d8.f2822c;
                pattern.set(i6, i7);
                ((MediaCodec.CryptoInfo) c0558d8.f2821b).setPattern(pattern);
            }
            long j4 = c1583x9.f12495b;
            int i8 = (int) (j3 - j4);
            c1583x9.f12495b = j4 + ((long) i8);
            c1583x9.f12494a -= i8;
        }
        if (!c1533vx.m4599i(268435456)) {
            c1533vx.m6664t(c1583x9.f12494a);
            return m6646c(c0642fj, c1583x9.f12495b, c1533vx.f11795n, c1583x9.f12494a);
        }
        dc1Var.m2313C(4);
        C0642fj c0642fjM6647d2 = m6647d(c0642fj, c1583x9.f12495b, dc1Var.f2882a, 4);
        int iM2341x = dc1Var.m2341x();
        c1583x9.f12495b += 4;
        c1583x9.f12494a -= 4;
        c1533vx.m6664t(iM2341x);
        C0642fj c0642fjM6646c = m6646c(c0642fjM6647d2, c1583x9.f12495b, c1533vx.f11795n, iM2341x);
        c1583x9.f12495b += (long) iM2341x;
        int i9 = c1583x9.f12494a - iM2341x;
        c1583x9.f12494a = i9;
        ByteBuffer byteBuffer = c1533vx.f11798q;
        if (byteBuffer == null || byteBuffer.capacity() < i9) {
            c1533vx.f11798q = ByteBuffer.allocate(i9);
        } else {
            c1533vx.f11798q.clear();
        }
        return m6646c(c0642fjM6646c, c1583x9.f12495b, c1533vx.f11798q, c1583x9.f12494a);
    }

    /* JADX INFO: renamed from: a */
    public final void m6649a(long j) {
        C0642fj c0642fj;
        if (j == -1) {
            return;
        }
        while (true) {
            c0642fj = this.f11735d;
            if (j < c0642fj.f3825b) {
                break;
            }
            C0547cy c0547cy = this.f11732a;
            C1468u5 c1468u5 = (C1468u5) c0642fj.f3826c;
            synchronized (c0547cy) {
                C1468u5[] c1468u5Arr = c0547cy.f2660f;
                int i = c0547cy.f2659e;
                c0547cy.f2659e = i + 1;
                c1468u5Arr[i] = c1468u5;
                c0547cy.f2658d--;
                c0547cy.notifyAll();
            }
            C0642fj c0642fj2 = this.f11735d;
            c0642fj2.f3826c = null;
            C0642fj c0642fj3 = (C0642fj) c0642fj2.f3827d;
            c0642fj2.f3827d = null;
            this.f11735d = c0642fj3;
        }
        if (this.f11736e.f3824a < c0642fj.f3824a) {
            this.f11736e = c0642fj;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m6650b(int i) {
        C1468u5 c1468u5;
        C0642fj c0642fj = this.f11737f;
        if (((C1468u5) c0642fj.f3826c) == null) {
            C0547cy c0547cy = this.f11732a;
            synchronized (c0547cy) {
                try {
                    int i2 = c0547cy.f2658d + 1;
                    c0547cy.f2658d = i2;
                    int i3 = c0547cy.f2659e;
                    if (i3 > 0) {
                        C1468u5[] c1468u5Arr = c0547cy.f2660f;
                        int i4 = i3 - 1;
                        c0547cy.f2659e = i4;
                        c1468u5 = c1468u5Arr[i4];
                        c1468u5.getClass();
                        c0547cy.f2660f[c0547cy.f2659e] = null;
                    } else {
                        C1468u5 c1468u6 = new C1468u5(new byte[c0547cy.f2656b], 0);
                        C1468u5[] c1468u5Arr2 = c0547cy.f2660f;
                        if (i2 > c1468u5Arr2.length) {
                            c0547cy.f2660f = (C1468u5[]) Arrays.copyOf(c1468u5Arr2, c1468u5Arr2.length * 2);
                        }
                        c1468u5 = c1468u6;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            C0642fj c0642fj2 = new C0642fj(this.f11737f.f3825b, this.f11733b);
            c0642fj.f3826c = c1468u5;
            c0642fj.f3827d = c0642fj2;
        }
        return Math.min(i, (int) (this.f11737f.f3825b - this.f11738g));
    }
}

package p000;

import android.sun.security.util.DerValue;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class pk0 {

    /* JADX INFO: renamed from: b */
    public final zi1 f8917b;

    /* JADX INFO: renamed from: a */
    public final ArrayList f8916a = new ArrayList();

    /* JADX INFO: renamed from: e */
    public yj0[] f8920e = new yj0[8];

    /* JADX INFO: renamed from: f */
    public int f8921f = 7;

    /* JADX INFO: renamed from: g */
    public int f8922g = 0;

    /* JADX INFO: renamed from: h */
    public int f8923h = 0;

    /* JADX INFO: renamed from: c */
    public int f8918c = 4096;

    /* JADX INFO: renamed from: d */
    public int f8919d = 4096;

    public pk0(sk0 sk0Var) {
        this.f8917b = new zi1(sk0Var);
    }

    /* JADX INFO: renamed from: a */
    public final int m5268a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.f8920e.length;
            while (true) {
                length--;
                i2 = this.f8921f;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.f8920e[length].f12997c;
                i -= i4;
                this.f8923h -= i4;
                this.f8922g--;
                i3++;
            }
            yj0[] yj0VarArr = this.f8920e;
            System.arraycopy(yj0VarArr, i2 + 1, yj0VarArr, i2 + 1 + i3, this.f8922g);
            this.f8921f += i3;
        }
        return i3;
    }

    /* JADX INFO: renamed from: b */
    public final C0717hk m5269b(int i) throws IOException {
        if (i >= 0) {
            yj0[] yj0VarArr = rk0.f10067b;
            if (i <= yj0VarArr.length - 1) {
                return yj0VarArr[i].f12995a;
            }
        }
        int length = this.f8921f + 1 + (i - rk0.f10067b.length);
        if (length >= 0) {
            yj0[] yj0VarArr2 = this.f8920e;
            if (length < yj0VarArr2.length) {
                return yj0VarArr2[length].f12995a;
            }
        }
        f40.m2710f(i + 1, "Header index too large ");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m5270c(yj0 yj0Var) {
        this.f8916a.add(yj0Var);
        int i = yj0Var.f12997c;
        int i2 = this.f8919d;
        if (i > i2) {
            Arrays.fill(this.f8920e, (Object) null);
            this.f8921f = this.f8920e.length - 1;
            this.f8922g = 0;
            this.f8923h = 0;
            return;
        }
        m5268a((this.f8923h + i) - i2);
        int i3 = this.f8922g + 1;
        yj0[] yj0VarArr = this.f8920e;
        if (i3 > yj0VarArr.length) {
            yj0[] yj0VarArr2 = new yj0[yj0VarArr.length * 2];
            System.arraycopy(yj0VarArr, 0, yj0VarArr2, yj0VarArr.length, yj0VarArr.length);
            this.f8921f = this.f8920e.length - 1;
            this.f8920e = yj0VarArr2;
        }
        int i4 = this.f8921f;
        this.f8921f = i4 - 1;
        this.f8920e[i4] = yj0Var;
        this.f8922g++;
        this.f8923h += i;
    }

    /* JADX INFO: renamed from: d */
    public final C0717hk m5271d() {
        zi1 zi1Var = this.f8917b;
        byte b = zi1Var.readByte();
        int i = b & 255;
        boolean z = (b & DerValue.TAG_CONTEXT) == 128;
        int iM5272e = m5272e(i, 127);
        if (!z) {
            return zi1Var.mo4199b(iM5272e);
        }
        gl0 gl0Var = gl0.f4226d;
        long j = iM5272e;
        zi1Var.mo4214t(j);
        byte[] bArrM4211p = zi1Var.f13426b.m4211p(j);
        gl0Var.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        l91 l91Var = gl0Var.f4227a;
        l91 l91Var2 = l91Var;
        int i2 = 0;
        int i3 = 0;
        for (byte b2 : bArrM4211p) {
            i2 = (i2 << 8) | (b2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                l91Var2 = ((l91[]) l91Var2.f6280d)[(i2 >>> (i3 - 8)) & 255];
                if (((l91[]) l91Var2.f6280d) == null) {
                    byteArrayOutputStream.write(l91Var2.f6278b);
                    i3 -= l91Var2.f6279c;
                    l91Var2 = l91Var;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            l91 l91Var3 = ((l91[]) l91Var2.f6280d)[(i2 << (8 - i3)) & 255];
            l91[] l91VarArr = (l91[]) l91Var3.f6280d;
            int i4 = l91Var3.f6279c;
            if (l91VarArr != null || i4 > i3) {
                break;
            }
            byteArrayOutputStream.write(l91Var3.f6278b);
            i3 -= i4;
            l91Var2 = l91Var;
        }
        return C0717hk.m3161h(byteArrayOutputStream.toByteArray());
    }

    /* JADX INFO: renamed from: e */
    public final int m5272e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte b = this.f8917b.readByte();
            int i5 = b & 255;
            if ((b & DerValue.TAG_CONTEXT) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (b & 127) << i4;
            i4 += 7;
        }
    }
}

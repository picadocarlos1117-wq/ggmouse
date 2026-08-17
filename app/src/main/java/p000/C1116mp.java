package p000;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: mp */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1116mp extends AbstractC1153np {

    /* JADX INFO: renamed from: d */
    public final byte[] f7060d;

    /* JADX INFO: renamed from: e */
    public final int f7061e;

    /* JADX INFO: renamed from: f */
    public int f7062f;

    /* JADX INFO: renamed from: g */
    public final OutputStream f7063g;

    public C1116mp(OutputStream outputStream, int i) {
        if (i < 0) {
            f40.m2713i("bufferSize must be >= 0");
            throw null;
        }
        int iMax = Math.max(i, 20);
        this.f7060d = new byte[iMax];
        this.f7061e = iMax;
        if (outputStream != null) {
            this.f7063g = outputStream;
        } else {
            l41.m4051t("out");
            throw null;
        }
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: A */
    public final void mo3973A(long j) {
        m4436H(10);
        m4434F(j);
    }

    /* JADX INFO: renamed from: B */
    public final void m4430B(int i) {
        int i2 = this.f7062f;
        int i3 = i2 + 1;
        this.f7062f = i3;
        byte[] bArr = this.f7060d;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.f7062f = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.f7062f = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.f7062f = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    /* JADX INFO: renamed from: C */
    public final void m4431C(long j) {
        int i = this.f7062f;
        int i2 = i + 1;
        this.f7062f = i2;
        byte[] bArr = this.f7060d;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.f7062f = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.f7062f = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.f7062f = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.f7062f = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.f7062f = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.f7062f = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.f7062f = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    /* JADX INFO: renamed from: D */
    public final void m4432D(int i, int i2) {
        m4433E((i << 3) | i2);
    }

    /* JADX INFO: renamed from: E */
    public final void m4433E(int i) {
        boolean z = AbstractC1153np.f7491c;
        byte[] bArr = this.f7060d;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.f7062f;
                if (i2 == 0) {
                    this.f7062f = i3 + 1;
                    k42.m3786k(bArr, i3, (byte) i);
                    return;
                } else {
                    this.f7062f = i3 + 1;
                    k42.m3786k(bArr, i3, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.f7062f;
                if (i4 == 0) {
                    this.f7062f = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.f7062f = i5 + 1;
                    bArr[i5] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m4434F(long j) {
        boolean z = AbstractC1153np.f7491c;
        byte[] bArr = this.f7060d;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = this.f7062f;
                if (j2 == 0) {
                    this.f7062f = i + 1;
                    k42.m3786k(bArr, i, (byte) j);
                    return;
                } else {
                    this.f7062f = i + 1;
                    k42.m3786k(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i2 = this.f7062f;
                if (j3 == 0) {
                    this.f7062f = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    this.f7062f = i2 + 1;
                    bArr[i2] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m4435G() {
        this.f7063g.write(this.f7060d, 0, this.f7062f);
        this.f7062f = 0;
    }

    /* JADX INFO: renamed from: H */
    public final void m4436H(int i) {
        if (this.f7061e - this.f7062f < i) {
            m4435G();
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m4437I(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f7062f;
        int i4 = this.f7061e;
        int i5 = i4 - i3;
        byte[] bArr2 = this.f7060d;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f7062f += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f7062f = i4;
        m4435G();
        if (i7 > i4) {
            this.f7063g.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.f7062f = i7;
        }
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: g */
    public final void mo3976g(byte b) {
        if (this.f7062f == this.f7061e) {
            m4435G();
        }
        int i = this.f7062f;
        this.f7062f = i + 1;
        this.f7060d[i] = b;
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: h */
    public final void mo3977h(int i, boolean z) {
        m4436H(11);
        m4432D(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.f7062f;
        this.f7062f = i2 + 1;
        this.f7060d[i2] = b;
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: i */
    public final void mo3978i(int i, byte[] bArr) throws IOException {
        mo3994y(i);
        m4437I(bArr, 0, i);
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: j */
    public final void mo3979j(int i, AbstractC0753ik abstractC0753ik) {
        mo3992w(i, 2);
        mo3980k(abstractC0753ik);
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: k */
    public final void mo3980k(AbstractC0753ik abstractC0753ik) {
        mo3994y(abstractC0753ik.size());
        abstractC0753ik.mo2999y(this);
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: l */
    public final void mo3981l(int i, int i2) {
        m4436H(14);
        m4432D(i, 5);
        m4430B(i2);
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: m */
    public final void mo3982m(int i) {
        m4436H(4);
        m4430B(i);
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: n */
    public final void mo3983n(int i, long j) {
        m4436H(18);
        m4432D(i, 1);
        m4431C(j);
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: o */
    public final void mo3984o(long j) {
        m4436H(8);
        m4431C(j);
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: p */
    public final void mo3985p(int i, int i2) {
        m4436H(20);
        m4432D(i, 0);
        if (i2 >= 0) {
            m4433E(i2);
        } else {
            m4434F(i2);
        }
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: q */
    public final void mo3986q(int i) {
        if (i >= 0) {
            mo3994y(i);
        } else {
            mo3973A(i);
        }
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: r */
    public final void mo3987r(int i, int i2, byte[] bArr) throws IOException {
        m4437I(bArr, i, i2);
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: s */
    public final void mo3988s(int i, y41 y41Var, qp1 qp1Var) {
        mo3992w(i, 2);
        mo3994y(((AbstractC0812k1) y41Var).getSerializedSize(qp1Var));
        qp1Var.mo903d(y41Var, this.f7492a);
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: t */
    public final void mo3989t(y41 y41Var) {
        mo3994y(y41Var.getSerializedSize());
        y41Var.writeTo(this);
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: u */
    public final void mo3990u(int i, String str) throws IOException {
        mo3992w(i, 2);
        mo3991v(str);
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: v */
    public final void mo3991v(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iM4585d = AbstractC1153np.m4585d(length);
            int i = iM4585d + length;
            int i2 = this.f7061e;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iMo5812E = w42.f11969a.mo5812E(str, bArr, 0, length);
                mo3994y(iMo5812E);
                m4437I(bArr, 0, iMo5812E);
                return;
            }
            if (i > i2 - this.f7062f) {
                m4435G();
            }
            int iM4585d2 = AbstractC1153np.m4585d(str.length());
            int i3 = this.f7062f;
            byte[] bArr2 = this.f7060d;
            try {
                try {
                    if (iM4585d2 == iM4585d) {
                        int i4 = i3 + iM4585d2;
                        this.f7062f = i4;
                        int iMo5812E2 = w42.f11969a.mo5812E(str, bArr2, i4, i2 - i4);
                        this.f7062f = i3;
                        m4433E((iMo5812E2 - i3) - iM4585d2);
                        this.f7062f = iMo5812E2;
                    } else {
                        int iM6707c = w42.m6707c(str);
                        m4433E(iM6707c);
                        this.f7062f = w42.f11969a.mo5812E(str, bArr2, this.f7062f, iM6707c);
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new C1079lp(e);
                }
            } catch (v42 e2) {
                this.f7062f = i3;
                throw e2;
            }
        } catch (v42 e3) {
            m4587f(str, e3);
        }
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: w */
    public final void mo3992w(int i, int i2) {
        mo3994y((i << 3) | i2);
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: x */
    public final void mo3993x(int i, int i2) {
        m4436H(20);
        m4432D(i, 0);
        m4433E(i2);
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: y */
    public final void mo3994y(int i) {
        m4436H(5);
        m4433E(i);
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: z */
    public final void mo3995z(int i, long j) {
        m4436H(20);
        m4432D(i, 0);
        m4434F(j);
    }
}

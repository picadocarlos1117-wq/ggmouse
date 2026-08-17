package p000;

/* JADX INFO: renamed from: kp */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1042kp extends AbstractC1153np {

    /* JADX INFO: renamed from: d */
    public final byte[] f5973d;

    /* JADX INFO: renamed from: e */
    public final int f5974e;

    /* JADX INFO: renamed from: f */
    public int f5975f;

    public C1042kp(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            l41.m4051t("buffer");
            throw null;
        }
        int i3 = i + i2;
        if ((i | i2 | (bArr.length - i3)) < 0) {
            ca0.m1183o("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
            throw null;
        }
        this.f5973d = bArr;
        this.f5975f = i;
        this.f5974e = i3;
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: A */
    public final void mo3973A(long j) throws C1079lp {
        boolean z = AbstractC1153np.f7491c;
        byte[] bArr = this.f5973d;
        if (!z || m3974B() < 10) {
            while (true) {
                long j2 = j & (-128);
                int i = this.f5975f;
                if (j2 == 0) {
                    this.f5975f = i + 1;
                    bArr[i] = (byte) j;
                    return;
                } else {
                    try {
                        this.f5975f = i + 1;
                        bArr[i] = (byte) ((((int) j) & 127) | 128);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new C1079lp(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5975f), Integer.valueOf(this.f5974e), 1), e);
                    }
                }
                throw new C1079lp(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5975f), Integer.valueOf(this.f5974e), 1), e);
            }
        }
        while (true) {
            long j3 = j & (-128);
            int i2 = this.f5975f;
            if (j3 == 0) {
                this.f5975f = i2 + 1;
                k42.m3786k(bArr, i2, (byte) j);
                return;
            } else {
                this.f5975f = i2 + 1;
                k42.m3786k(bArr, i2, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final int m3974B() {
        return this.f5974e - this.f5975f;
    }

    /* JADX INFO: renamed from: C */
    public final void m3975C(byte[] bArr, int i, int i2) throws C1079lp {
        try {
            System.arraycopy(bArr, i, this.f5973d, this.f5975f, i2);
            this.f5975f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C1079lp(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5975f), Integer.valueOf(this.f5974e), Integer.valueOf(i2)), e);
        }
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: g */
    public final void mo3976g(byte b) throws C1079lp {
        try {
            byte[] bArr = this.f5973d;
            int i = this.f5975f;
            this.f5975f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new C1079lp(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5975f), Integer.valueOf(this.f5974e), 1), e);
        }
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: h */
    public final void mo3977h(int i, boolean z) throws C1079lp {
        mo3992w(i, 0);
        mo3976g(z ? (byte) 1 : (byte) 0);
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: i */
    public final void mo3978i(int i, byte[] bArr) throws C1079lp {
        mo3994y(i);
        m3975C(bArr, 0, i);
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: j */
    public final void mo3979j(int i, AbstractC0753ik abstractC0753ik) throws C1079lp {
        mo3992w(i, 2);
        mo3980k(abstractC0753ik);
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: k */
    public final void mo3980k(AbstractC0753ik abstractC0753ik) throws C1079lp {
        mo3994y(abstractC0753ik.size());
        abstractC0753ik.mo2999y(this);
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: l */
    public final void mo3981l(int i, int i2) throws C1079lp {
        mo3992w(i, 5);
        mo3982m(i2);
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: m */
    public final void mo3982m(int i) throws C1079lp {
        try {
            byte[] bArr = this.f5973d;
            int i2 = this.f5975f;
            int i3 = i2 + 1;
            this.f5975f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f5975f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f5975f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f5975f = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C1079lp(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5975f), Integer.valueOf(this.f5974e), 1), e);
        }
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: n */
    public final void mo3983n(int i, long j) throws C1079lp {
        mo3992w(i, 1);
        mo3984o(j);
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: o */
    public final void mo3984o(long j) throws C1079lp {
        try {
            byte[] bArr = this.f5973d;
            int i = this.f5975f;
            int i2 = i + 1;
            this.f5975f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.f5975f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.f5975f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.f5975f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.f5975f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f5975f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f5975f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f5975f = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C1079lp(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5975f), Integer.valueOf(this.f5974e), 1), e);
        }
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: p */
    public final void mo3985p(int i, int i2) throws C1079lp {
        mo3992w(i, 0);
        mo3986q(i2);
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: q */
    public final void mo3986q(int i) throws C1079lp {
        if (i >= 0) {
            mo3994y(i);
        } else {
            mo3973A(i);
        }
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: r */
    public final void mo3987r(int i, int i2, byte[] bArr) throws C1079lp {
        m3975C(bArr, i, i2);
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: s */
    public final void mo3988s(int i, y41 y41Var, qp1 qp1Var) throws C1079lp {
        mo3992w(i, 2);
        mo3994y(((AbstractC0812k1) y41Var).getSerializedSize(qp1Var));
        qp1Var.mo903d(y41Var, this.f7492a);
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: t */
    public final void mo3989t(y41 y41Var) throws C1079lp {
        mo3994y(y41Var.getSerializedSize());
        y41Var.writeTo(this);
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: u */
    public final void mo3990u(int i, String str) throws C1079lp {
        mo3992w(i, 2);
        mo3991v(str);
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: v */
    public final void mo3991v(String str) throws C1079lp {
        int i = this.f5975f;
        try {
            int iM4585d = AbstractC1153np.m4585d(str.length() * 3);
            int iM4585d2 = AbstractC1153np.m4585d(str.length());
            byte[] bArr = this.f5973d;
            if (iM4585d2 != iM4585d) {
                mo3994y(w42.m6707c(str));
                this.f5975f = w42.f11969a.mo5812E(str, bArr, this.f5975f, m3974B());
                return;
            }
            int i2 = i + iM4585d2;
            this.f5975f = i2;
            int iMo5812E = w42.f11969a.mo5812E(str, bArr, i2, m3974B());
            this.f5975f = i;
            mo3994y((iMo5812E - i) - iM4585d2);
            this.f5975f = iMo5812E;
        } catch (IndexOutOfBoundsException e) {
            throw new C1079lp(e);
        } catch (v42 e2) {
            this.f5975f = i;
            m4587f(str, e2);
        }
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: w */
    public final void mo3992w(int i, int i2) throws C1079lp {
        mo3994y((i << 3) | i2);
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: x */
    public final void mo3993x(int i, int i2) throws C1079lp {
        mo3992w(i, 0);
        mo3994y(i2);
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: y */
    public final void mo3994y(int i) throws C1079lp {
        while (true) {
            int i2 = i & (-128);
            int i3 = this.f5975f;
            byte[] bArr = this.f5973d;
            if (i2 == 0) {
                this.f5975f = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    this.f5975f = i3 + 1;
                    bArr[i3] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new C1079lp(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5975f), Integer.valueOf(this.f5974e), 1), e);
                }
            }
            throw new C1079lp(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5975f), Integer.valueOf(this.f5974e), 1), e);
        }
    }

    @Override // p000.AbstractC1153np
    /* JADX INFO: renamed from: z */
    public final void mo3995z(int i, long j) throws C1079lp {
        mo3992w(i, 0);
        mo3973A(j);
    }
}

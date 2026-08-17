package p000;

import io.github.muntashirakon.adb.PairingConnectionCtx;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public final class rq1 {

    /* JADX INFO: renamed from: a */
    public final byte[] f10096a;

    /* JADX INFO: renamed from: b */
    public int f10097b;

    /* JADX INFO: renamed from: c */
    public int f10098c;

    /* JADX INFO: renamed from: d */
    public boolean f10099d;

    /* JADX INFO: renamed from: e */
    public final boolean f10100e;

    /* JADX INFO: renamed from: f */
    public rq1 f10101f;

    /* JADX INFO: renamed from: g */
    public rq1 f10102g;

    public rq1(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        bArr.getClass();
        this.f10096a = bArr;
        this.f10097b = i;
        this.f10098c = i2;
        this.f10099d = z;
        this.f10100e = z2;
    }

    /* JADX INFO: renamed from: a */
    public final rq1 m5888a() {
        rq1 rq1Var = this.f10101f;
        if (rq1Var == this) {
            rq1Var = null;
        }
        rq1 rq1Var2 = this.f10102g;
        rq1Var2.getClass();
        rq1Var2.f10101f = this.f10101f;
        rq1 rq1Var3 = this.f10101f;
        rq1Var3.getClass();
        rq1Var3.f10102g = this.f10102g;
        this.f10101f = null;
        this.f10102g = null;
        return rq1Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m5889b(rq1 rq1Var) {
        rq1Var.getClass();
        rq1Var.f10102g = this;
        rq1Var.f10101f = this.f10101f;
        rq1 rq1Var2 = this.f10101f;
        rq1Var2.getClass();
        rq1Var2.f10102g = rq1Var;
        this.f10101f = rq1Var;
    }

    /* JADX INFO: renamed from: c */
    public final rq1 m5890c() {
        this.f10099d = true;
        return new rq1(this.f10096a, this.f10097b, this.f10098c, true, false);
    }

    /* JADX INFO: renamed from: d */
    public final void m5891d(rq1 rq1Var, int i) {
        rq1Var.getClass();
        byte[] bArr = rq1Var.f10096a;
        if (!rq1Var.f10100e) {
            f40.m2719o("only owner can write");
            return;
        }
        int i2 = rq1Var.f10098c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (rq1Var.f10099d) {
                l41.m4049r();
                return;
            }
            int i4 = rq1Var.f10097b;
            if (i3 - i4 > 8192) {
                l41.m4049r();
                return;
            } else {
                AbstractC1064la.m4153n0(bArr, 0, i4, bArr, i2);
                rq1Var.f10098c -= rq1Var.f10097b;
                rq1Var.f10097b = 0;
            }
        }
        int i5 = rq1Var.f10098c;
        int i6 = this.f10097b;
        AbstractC1064la.m4153n0(this.f10096a, i5, i6, bArr, i6 + i);
        rq1Var.f10098c += i;
        this.f10097b += i;
    }

    public rq1() {
        this.f10096a = new byte[PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE];
        this.f10100e = true;
        this.f10099d = false;
    }
}

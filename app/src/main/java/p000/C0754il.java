package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: il */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0754il extends AbstractC0828kh {

    /* JADX INFO: renamed from: w */
    public final C1533vx f5063w;

    /* JADX INFO: renamed from: x */
    public final dc1 f5064x;

    /* JADX INFO: renamed from: y */
    public InterfaceC0718hl f5065y;

    /* JADX INFO: renamed from: z */
    public long f5066z;

    public C0754il() {
        super(6);
        this.f5063w = new C1533vx(1);
        this.f5064x = new dc1();
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: B */
    public final int mo2886B(be0 be0Var) {
        return "application/x-camera-motion".equals(be0Var.f1341n) ? AbstractC0828kh.m3828f(4, 0, 0, 0) : AbstractC0828kh.m3828f(0, 0, 0, 0);
    }

    @Override // p000.AbstractC0828kh, p000.ze1
    /* JADX INFO: renamed from: d */
    public final void mo29d(int i, Object obj) {
        if (i == 8) {
            this.f5065y = (InterfaceC0718hl) obj;
        }
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: j */
    public final String mo34j() {
        return "CameraMotionRenderer";
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: l */
    public final boolean mo35l() {
        return m3832k();
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: n */
    public final boolean mo37n() {
        return true;
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: o */
    public final void mo38o() {
        InterfaceC0718hl interfaceC0718hl = this.f5065y;
        if (interfaceC0718hl != null) {
            interfaceC0718hl.mo2286b();
        }
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: q */
    public final void mo40q(long j, boolean z) {
        this.f5066z = Long.MIN_VALUE;
        InterfaceC0718hl interfaceC0718hl = this.f5065y;
        if (interfaceC0718hl != null) {
            interfaceC0718hl.mo2286b();
        }
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: x */
    public final void mo2919x(long j, long j2) {
        float[] fArr;
        while (!m3832k() && this.f5066z < 100000 + j) {
            C1533vx c1533vx = this.f5063w;
            c1533vx.mo5844r();
            C0558d8 c0558d8 = this.f5808c;
            c0558d8.m2267h();
            if (m3833w(c0558d8, c1533vx, 0) != -4 || c1533vx.m4599i(4)) {
                return;
            }
            long j3 = c1533vx.f11797p;
            this.f5066z = j3;
            boolean z = j3 < this.f5817q;
            if (this.f5065y != null && !z) {
                c1533vx.m6665u();
                ByteBuffer byteBuffer = c1533vx.f11795n;
                int i = z42.f13274a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    dc1 dc1Var = this.f5064x;
                    dc1Var.m2314D(iLimit, bArrArray);
                    dc1Var.m2316F(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i2 = 0; i2 < 3; i2++) {
                        fArr2[i2] = Float.intBitsToFloat(dc1Var.m2326i());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f5065y.mo2285a(this.f5066z - this.f5816p, fArr);
                }
            }
        }
    }
}

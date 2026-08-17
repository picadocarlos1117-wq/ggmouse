package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class cu1 implements InterfaceC1103mc {

    /* JADX INFO: renamed from: b */
    public int f2627b;

    /* JADX INFO: renamed from: c */
    public float f2628c;

    /* JADX INFO: renamed from: d */
    public float f2629d;

    /* JADX INFO: renamed from: e */
    public C0823kc f2630e;

    /* JADX INFO: renamed from: f */
    public C0823kc f2631f;

    /* JADX INFO: renamed from: g */
    public C0823kc f2632g;

    /* JADX INFO: renamed from: h */
    public C0823kc f2633h;

    /* JADX INFO: renamed from: i */
    public boolean f2634i;

    /* JADX INFO: renamed from: j */
    public bu1 f2635j;

    /* JADX INFO: renamed from: k */
    public ByteBuffer f2636k;

    /* JADX INFO: renamed from: l */
    public ShortBuffer f2637l;

    /* JADX INFO: renamed from: m */
    public ByteBuffer f2638m;

    /* JADX INFO: renamed from: n */
    public long f2639n;

    /* JADX INFO: renamed from: o */
    public long f2640o;

    /* JADX INFO: renamed from: p */
    public boolean f2641p;

    @Override // p000.InterfaceC1103mc
    /* JADX INFO: renamed from: a */
    public final ByteBuffer mo2125a() {
        bu1 bu1Var = this.f2635j;
        if (bu1Var != null) {
            int i = bu1Var.f1534b;
            int i2 = bu1Var.f1545m * i * 2;
            if (i2 > 0) {
                if (this.f2636k.capacity() < i2) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
                    this.f2636k = byteBufferOrder;
                    this.f2637l = byteBufferOrder.asShortBuffer();
                } else {
                    this.f2636k.clear();
                    this.f2637l.clear();
                }
                ShortBuffer shortBuffer = this.f2637l;
                int iMin = Math.min(shortBuffer.remaining() / i, bu1Var.f1545m);
                int i3 = iMin * i;
                shortBuffer.put(bu1Var.f1544l, 0, i3);
                int i4 = bu1Var.f1545m - iMin;
                bu1Var.f1545m = i4;
                short[] sArr = bu1Var.f1544l;
                System.arraycopy(sArr, i3, sArr, 0, i4 * i);
                this.f2640o += (long) i2;
                this.f2636k.limit(i2);
                this.f2638m = this.f2636k;
            }
        }
        ByteBuffer byteBuffer = this.f2638m;
        this.f2638m = InterfaceC1103mc.f6750a;
        return byteBuffer;
    }

    @Override // p000.InterfaceC1103mc
    /* JADX INFO: renamed from: b */
    public final void mo2126b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            bu1 bu1Var = this.f2635j;
            bu1Var.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f2639n += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = bu1Var.f1534b;
            int i2 = iRemaining2 / i;
            short[] sArrM1065c = bu1Var.m1065c(bu1Var.f1542j, bu1Var.f1543k, i2);
            bu1Var.f1542j = sArrM1065c;
            shortBufferAsShortBuffer.get(sArrM1065c, bu1Var.f1543k * i, ((i2 * i) * 2) / 2);
            bu1Var.f1543k += i2;
            bu1Var.m1067f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // p000.InterfaceC1103mc
    /* JADX INFO: renamed from: c */
    public final C0823kc mo2127c(C0823kc c0823kc) throws C1066lc {
        if (c0823kc.f5744c != 2) {
            throw new C1066lc(c0823kc);
        }
        int i = this.f2627b;
        if (i == -1) {
            i = c0823kc.f5742a;
        }
        this.f2630e = c0823kc;
        C0823kc c0823kc2 = new C0823kc(i, c0823kc.f5743b, 2);
        this.f2631f = c0823kc2;
        this.f2634i = true;
        return c0823kc2;
    }

    @Override // p000.InterfaceC1103mc
    /* JADX INFO: renamed from: d */
    public final void mo2128d() {
        bu1 bu1Var = this.f2635j;
        if (bu1Var != null) {
            int i = bu1Var.f1543k;
            float f = bu1Var.f1535c;
            float f2 = bu1Var.f1536d;
            double d = f / f2;
            double d2 = bu1Var.f1537e * f2;
            int i2 = bu1Var.f1550r;
            int i3 = bu1Var.f1545m + ((int) ((((((((double) (i - i2)) / d) + ((double) i2)) + bu1Var.f1555w) + ((double) bu1Var.f1547o)) / d2) + 0.5d));
            bu1Var.f1555w = 0.0d;
            short[] sArr = bu1Var.f1542j;
            int i4 = bu1Var.f1540h * 2;
            bu1Var.f1542j = bu1Var.m1065c(sArr, i, i4 + i);
            int i5 = 0;
            while (true) {
                int i6 = bu1Var.f1534b;
                if (i5 >= i4 * i6) {
                    break;
                }
                bu1Var.f1542j[(i6 * i) + i5] = 0;
                i5++;
            }
            bu1Var.f1543k = i4 + bu1Var.f1543k;
            bu1Var.m1067f();
            if (bu1Var.f1545m > i3) {
                bu1Var.f1545m = i3;
            }
            bu1Var.f1543k = 0;
            bu1Var.f1550r = 0;
            bu1Var.f1547o = 0;
        }
        this.f2641p = true;
    }

    @Override // p000.InterfaceC1103mc
    /* JADX INFO: renamed from: e */
    public final boolean mo2129e() {
        if (!this.f2641p) {
            return false;
        }
        bu1 bu1Var = this.f2635j;
        return bu1Var == null || (bu1Var.f1545m * bu1Var.f1534b) * 2 == 0;
    }

    @Override // p000.InterfaceC1103mc
    public final void flush() {
        if (isActive()) {
            C0823kc c0823kc = this.f2630e;
            this.f2632g = c0823kc;
            C0823kc c0823kc2 = this.f2631f;
            this.f2633h = c0823kc2;
            if (this.f2634i) {
                this.f2635j = new bu1(c0823kc.f5742a, c0823kc.f5743b, this.f2628c, this.f2629d, c0823kc2.f5742a);
            } else {
                bu1 bu1Var = this.f2635j;
                if (bu1Var != null) {
                    bu1Var.f1543k = 0;
                    bu1Var.f1545m = 0;
                    bu1Var.f1547o = 0;
                    bu1Var.f1548p = 0;
                    bu1Var.f1549q = 0;
                    bu1Var.f1550r = 0;
                    bu1Var.f1551s = 0;
                    bu1Var.f1552t = 0;
                    bu1Var.f1553u = 0;
                    bu1Var.f1554v = 0;
                    bu1Var.f1555w = 0.0d;
                }
            }
        }
        this.f2638m = InterfaceC1103mc.f6750a;
        this.f2639n = 0L;
        this.f2640o = 0L;
        this.f2641p = false;
    }

    @Override // p000.InterfaceC1103mc
    public final boolean isActive() {
        if (this.f2631f.f5742a != -1) {
            return Math.abs(this.f2628c - 1.0f) >= 1.0E-4f || Math.abs(this.f2629d - 1.0f) >= 1.0E-4f || this.f2631f.f5742a != this.f2630e.f5742a;
        }
        return false;
    }

    @Override // p000.InterfaceC1103mc
    public final void reset() {
        this.f2628c = 1.0f;
        this.f2629d = 1.0f;
        C0823kc c0823kc = C0823kc.f5741e;
        this.f2630e = c0823kc;
        this.f2631f = c0823kc;
        this.f2632g = c0823kc;
        this.f2633h = c0823kc;
        ByteBuffer byteBuffer = InterfaceC1103mc.f6750a;
        this.f2636k = byteBuffer;
        this.f2637l = byteBuffer.asShortBuffer();
        this.f2638m = byteBuffer;
        this.f2627b = -1;
        this.f2634i = false;
        this.f2635j = null;
        this.f2639n = 0L;
        this.f2640o = 0L;
        this.f2641p = false;
    }
}

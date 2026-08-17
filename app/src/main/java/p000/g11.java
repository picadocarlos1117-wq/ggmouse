package p000;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.sun.security.util.DerValue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g11 extends AbstractC0828kh {

    /* JADX INFO: renamed from: G0 */
    public static final byte[] f3948G0 = {0, 0, 1, 103, 66, DerValue.TAG_PRIVATE, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, DerValue.tag_PrintableString, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, DerValue.tag_GeneralizedTime, -96, 0, 47, -65, DerValue.tag_UniversalString, 49, -61, 39, 93, 120};

    /* JADX INFO: renamed from: A */
    public final C1533vx f3949A;

    /* JADX INFO: renamed from: A0 */
    public boolean f3950A0;

    /* JADX INFO: renamed from: B */
    public final C1533vx f3951B;

    /* JADX INFO: renamed from: B0 */
    public t70 f3952B0;

    /* JADX INFO: renamed from: C */
    public final C1369rh f3953C;

    /* JADX INFO: renamed from: C0 */
    public C1422sx f3954C0;

    /* JADX INFO: renamed from: D */
    public final MediaCodec.BufferInfo f3955D;

    /* JADX INFO: renamed from: D0 */
    public f11 f3956D0;

    /* JADX INFO: renamed from: E */
    public final ArrayDeque f3957E;

    /* JADX INFO: renamed from: E0 */
    public long f3958E0;

    /* JADX INFO: renamed from: F */
    public final l91 f3959F;

    /* JADX INFO: renamed from: F0 */
    public boolean f3960F0;

    /* JADX INFO: renamed from: G */
    public be0 f3961G;

    /* JADX INFO: renamed from: H */
    public be0 f3962H;

    /* JADX INFO: renamed from: I */
    public ay0 f3963I;

    /* JADX INFO: renamed from: J */
    public ay0 f3964J;

    /* JADX INFO: renamed from: K */
    public g80 f3965K;

    /* JADX INFO: renamed from: L */
    public MediaCrypto f3966L;

    /* JADX INFO: renamed from: M */
    public final long f3967M;

    /* JADX INFO: renamed from: N */
    public float f3968N;

    /* JADX INFO: renamed from: O */
    public float f3969O;

    /* JADX INFO: renamed from: P */
    public z01 f3970P;

    /* JADX INFO: renamed from: Q */
    public be0 f3971Q;

    /* JADX INFO: renamed from: R */
    public MediaFormat f3972R;

    /* JADX INFO: renamed from: S */
    public boolean f3973S;

    /* JADX INFO: renamed from: T */
    public float f3974T;

    /* JADX INFO: renamed from: U */
    public ArrayDeque f3975U;

    /* JADX INFO: renamed from: V */
    public e11 f3976V;

    /* JADX INFO: renamed from: W */
    public c11 f3977W;

    /* JADX INFO: renamed from: X */
    public int f3978X;

    /* JADX INFO: renamed from: Y */
    public boolean f3979Y;

    /* JADX INFO: renamed from: Z */
    public boolean f3980Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f3981a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f3982b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f3983c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f3984d0;

    /* JADX INFO: renamed from: e0 */
    public long f3985e0;

    /* JADX INFO: renamed from: f0 */
    public long f3986f0;

    /* JADX INFO: renamed from: g0 */
    public int f3987g0;

    /* JADX INFO: renamed from: h0 */
    public int f3988h0;

    /* JADX INFO: renamed from: i0 */
    public ByteBuffer f3989i0;

    /* JADX INFO: renamed from: j0 */
    public boolean f3990j0;

    /* JADX INFO: renamed from: k0 */
    public boolean f3991k0;

    /* JADX INFO: renamed from: l0 */
    public boolean f3992l0;

    /* JADX INFO: renamed from: m0 */
    public boolean f3993m0;

    /* JADX INFO: renamed from: n0 */
    public boolean f3994n0;

    /* JADX INFO: renamed from: o0 */
    public boolean f3995o0;

    /* JADX INFO: renamed from: p0 */
    public int f3996p0;

    /* JADX INFO: renamed from: q0 */
    public int f3997q0;

    /* JADX INFO: renamed from: r0 */
    public int f3998r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f3999s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f4000t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f4001u0;

    /* JADX INFO: renamed from: v0 */
    public long f4002v0;

    /* JADX INFO: renamed from: w */
    public final y01 f4003w;

    /* JADX INFO: renamed from: w0 */
    public long f4004w0;

    /* JADX INFO: renamed from: x */
    public final f40 f4005x;

    /* JADX INFO: renamed from: x0 */
    public boolean f4006x0;

    /* JADX INFO: renamed from: y */
    public final float f4007y;

    /* JADX INFO: renamed from: y0 */
    public boolean f4008y0;

    /* JADX INFO: renamed from: z */
    public final C1533vx f4009z;

    /* JADX INFO: renamed from: z0 */
    public boolean f4010z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g11(int i, y01 y01Var, float f) {
        super(i);
        f40 f40Var = f40.f3613d;
        this.f4003w = y01Var;
        this.f4005x = f40Var;
        this.f4007y = f;
        this.f4009z = new C1533vx(0);
        this.f3949A = new C1533vx(0);
        this.f3951B = new C1533vx(2);
        C1369rh c1369rh = new C1369rh(2);
        c1369rh.f10021u = 32;
        this.f3953C = c1369rh;
        this.f3955D = new MediaCodec.BufferInfo();
        this.f3968N = 1.0f;
        this.f3969O = 1.0f;
        this.f3967M = -9223372036854775807L;
        this.f3957E = new ArrayDeque();
        this.f3956D0 = f11.f3578e;
        c1369rh.m6664t(0);
        c1369rh.f11795n.order(ByteOrder.nativeOrder());
        l91 l91Var = new l91(0);
        l91Var.f6280d = InterfaceC1103mc.f6750a;
        l91Var.f6279c = 0;
        l91Var.f6278b = 2;
        this.f3959F = l91Var;
        this.f3974T = -1.0f;
        this.f3978X = 0;
        this.f3996p0 = 0;
        this.f3987g0 = -1;
        this.f3988h0 = -1;
        this.f3986f0 = -9223372036854775807L;
        this.f4002v0 = -9223372036854775807L;
        this.f4004w0 = -9223372036854775807L;
        this.f3958E0 = -9223372036854775807L;
        this.f3985e0 = -9223372036854775807L;
        this.f3997q0 = 0;
        this.f3998r0 = 0;
        this.f3954C0 = new C1422sx();
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: A */
    public void mo2885A(float f, float f2) {
        this.f3968N = f;
        this.f3969O = f2;
        m2915u0(this.f3971Q);
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: B */
    public final int mo2886B(be0 be0Var) throws t70 {
        try {
            return mo45t0(this.f4005x, be0Var);
        } catch (j11 e) {
            throw m3830g(e, be0Var, false, 4002);
        }
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: C */
    public final int mo2887C() {
        return 8;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x031e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0326 A[LOOP:0: B:25:0x008e->B:120:0x0326, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:139:0x0324 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.nio.Buffer, java.nio.ByteBuffer] */
    /* JADX INFO: renamed from: D */
    public final boolean m2888D(long j, long j2) throws t70 {
        C1369rh c1369rh;
        int length;
        ByteBuffer byteBuffer;
        Object r2;
        ki0.m3864h(!this.f4008y0);
        C1369rh c1369rh2 = this.f3953C;
        if (c1369rh2.m5846w()) {
            ByteBuffer byteBuffer2 = c1369rh2.f11795n;
            int i = this.f3988h0;
            int i2 = c1369rh2.f10020t;
            long j3 = c1369rh2.f11797p;
            boolean zM2900U = m2900U(this.f5817q, c1369rh2.f10019s);
            boolean zM4599i = c1369rh2.m4599i(4);
            be0 be0Var = this.f3962H;
            be0Var.getClass();
            c1369rh = c1369rh2;
            if (mo33i0(j, j2, null, byteBuffer2, i, 0, i2, j3, zM2900U, zM4599i, be0Var)) {
                mo2903d0(c1369rh.f10019s);
                c1369rh.mo5844r();
            }
        }
        c1369rh = c1369rh2;
        if (this.f4006x0) {
            this.f4008y0 = true;
            return false;
        }
        boolean z = false;
        boolean z2 = this.f3993m0;
        C1533vx c1533vx = this.f3951B;
        if (z2) {
            ki0.m3864h(c1369rh.m5845v(c1533vx));
            this.f3993m0 = false;
        }
        if (this.f3994n0) {
            if (c1369rh.m5846w()) {
                return true;
            }
            m2890G();
            this.f3994n0 = false;
            m2901V();
            if (!this.f3992l0) {
                return false;
            }
        }
        ki0.m3864h(!this.f4006x0);
        C0558d8 c0558d8 = this.f5808c;
        c0558d8.m2267h();
        c1533vx.mo5844r();
        while (true) {
            c1533vx.mo5844r();
            int iM3833w = m3833w(c0558d8, c1533vx, z ? 1 : 0);
            if (iM3833w == -5) {
                mo24a0(c0558d8);
            } else if (iM3833w != -4) {
                if (iM3833w != -3) {
                    l41.m4046o();
                    return z;
                }
                if (m3832k()) {
                    this.f4004w0 = this.f4002v0;
                }
            } else if (c1533vx.m4599i(4)) {
                this.f4006x0 = true;
                this.f4004w0 = this.f4002v0;
            } else {
                this.f4002v0 = Math.max(this.f4002v0, c1533vx.f11797p);
                if (m3832k() || this.f3949A.m4599i(536870912)) {
                    this.f4004w0 = this.f4002v0;
                }
                byte[] bArr = null;
                if (this.f4010z0) {
                    be0 be0Var2 = this.f3961G;
                    be0Var2.getClass();
                    this.f3962H = be0Var2;
                    if (Objects.equals(be0Var2.f1341n, "audio/opus") && !this.f3962H.f1344q.isEmpty()) {
                        byte[] bArr2 = (byte[]) this.f3962H.f1344q.get(z ? 1 : 0);
                        int i3 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                        be0 be0Var3 = this.f3962H;
                        be0Var3.getClass();
                        ae0 ae0VarM969a = be0Var3.m969a();
                        ae0VarM969a.f178E = i3;
                        this.f3962H = new be0(ae0VarM969a);
                    }
                    mo26b0(this.f3962H, null);
                    this.f4010z0 = z;
                }
                c1533vx.m6665u();
                be0 be0Var4 = this.f3962H;
                if (be0Var4 != null && Objects.equals(be0Var4.f1341n, "audio/opus")) {
                    if (c1533vx.m4599i(268435456)) {
                        c1533vx.f11793g = this.f3962H;
                        mo19S(c1533vx);
                    }
                    if (this.f5817q - c1533vx.f11797p <= 80000) {
                        be0 be0Var5 = this.f3962H;
                        be0Var5.getClass();
                        List list = be0Var5.f1344q;
                        l91 l91Var = this.f3959F;
                        l91Var.getClass();
                        c1533vx.f11795n.getClass();
                        if (c1533vx.f11795n.limit() - c1533vx.f11795n.position() != 0) {
                            if (l91Var.f6278b == 2 && (list.size() == 1 || list.size() == 3)) {
                                bArr = (byte[]) list.get(z ? 1 : 0);
                            }
                            Object r5 = c1533vx.f11795n;
                            int iPosition = r5.position();
                            int iLimit = r5.limit();
                            int i4 = iLimit - iPosition;
                            int i5 = (i4 + 255) / 255;
                            int i6 = i5 + 27 + i4;
                            if (l91Var.f6278b == 2) {
                                length = bArr != null ? bArr.length + 28 : 47;
                                i6 = (length == true ? 1 : 0) + 44 + i6;
                            } else {
                                length = z ? 1 : 0;
                            }
                            int i7 = i6;
                            if (((ByteBuffer) l91Var.f6280d).capacity() < i7) {
                                l91Var.f6280d = ByteBuffer.allocate(i7).order(ByteOrder.LITTLE_ENDIAN);
                            } else {
                                ((ByteBuffer) l91Var.f6280d).clear();
                            }
                            ByteBuffer byteBuffer3 = (ByteBuffer) l91Var.f6280d;
                            if (l91Var.f6278b == 2) {
                                if (bArr != null) {
                                    l91.m4149i(byteBuffer3, 0L, 0, 1, true);
                                    byteBuffer = byteBuffer3;
                                    long length2 = bArr.length;
                                    p32.m5173j("out of range: %s", length2, (length2 >> 8) == 0);
                                    byteBuffer.put((byte) length2);
                                    byteBuffer.put(bArr);
                                    byteBuffer.putInt(22, z42.m7235i(byteBuffer.arrayOffset(), bArr.length + 28, 0, byteBuffer.array()));
                                    byteBuffer.position(bArr.length + 28);
                                } else {
                                    byteBuffer = byteBuffer3;
                                    byteBuffer.put(l91.f6274e);
                                }
                                byteBuffer.put(l91.f6275f);
                                r2 = 0;
                            } else {
                                c1533vx = c1533vx;
                                byteBuffer = byteBuffer3;
                                r2 = z;
                            }
                            int iM5769L = l91Var.f6279c + ((int) ((rc2.m5769L(r5.get(r2), r5.limit() > 1 ? r5.get(1) : (byte) 0) * 48000) / 1000000));
                            l91Var.f6279c = iM5769L;
                            l91.m4149i(byteBuffer, iM5769L, l91Var.f6278b, i5, false);
                            for (int i8 = 0; i8 < i5; i8++) {
                                if (i4 >= 255) {
                                    byteBuffer.put((byte) -1);
                                    i4 -= 255;
                                } else {
                                    byteBuffer.put((byte) i4);
                                    i4 = 0;
                                }
                            }
                            while (iPosition < iLimit) {
                                byteBuffer.put(r5.get(iPosition));
                                iPosition++;
                            }
                            r5.position(r5.limit());
                            byteBuffer.flip();
                            if (l91Var.f6278b == 2) {
                                byteBuffer.putInt(length + 66, z42.m7235i(byteBuffer.arrayOffset() + length + 44, byteBuffer.limit() - byteBuffer.position(), 0, byteBuffer.array()));
                            } else {
                                byteBuffer.putInt(22, z42.m7235i(byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position(), 0, byteBuffer.array()));
                            }
                            l91Var.f6278b++;
                            l91Var.f6280d = byteBuffer;
                            c1533vx.mo5844r();
                            c1533vx = c1533vx;
                            c1533vx.m6664t(((ByteBuffer) l91Var.f6280d).remaining());
                            c1533vx.f11795n.put((ByteBuffer) l91Var.f6280d);
                            c1533vx.m6665u();
                        }
                    }
                }
                if (c1369rh.m5846w()) {
                    long j4 = this.f5817q;
                    if (m2900U(j4, c1369rh.f10019s) == m2900U(j4, c1533vx.f11797p)) {
                        if (!c1369rh.m5845v(c1533vx)) {
                            z = false;
                        }
                    }
                } else if (!c1369rh.m5845v(c1533vx)) {
                    z = false;
                }
                this.f3993m0 = true;
            }
            if (c1369rh.m5846w()) {
                c1369rh.m6665u();
            }
            return c1369rh.m5846w() || this.f4006x0 || this.f3994n0;
        }
    }

    /* JADX INFO: renamed from: E */
    public abstract C1607xx mo15E(c11 c11Var, be0 be0Var, be0 be0Var2);

    /* JADX INFO: renamed from: F */
    public b11 mo2889F(IllegalStateException illegalStateException, c11 c11Var) {
        return new b11(illegalStateException, c11Var);
    }

    /* JADX INFO: renamed from: G */
    public final void m2890G() {
        this.f3994n0 = false;
        this.f3953C.mo5844r();
        this.f3951B.mo5844r();
        this.f3993m0 = false;
        this.f3992l0 = false;
        l91 l91Var = this.f3959F;
        l91Var.getClass();
        l91Var.f6280d = InterfaceC1103mc.f6750a;
        l91Var.f6279c = 0;
        l91Var.f6278b = 2;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m2891H() {
        if (!this.f3999s0) {
            m2917v0();
            return true;
        }
        this.f3997q0 = 1;
        if (this.f3980Z) {
            this.f3998r0 = 3;
            return false;
        }
        this.f3998r0 = 2;
        return true;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m2892I(long j, long j2) {
        boolean z;
        MediaCodec.BufferInfo bufferInfo;
        boolean zMo33i0;
        int iMo4177o;
        z01 z01Var = this.f3970P;
        z01Var.getClass();
        int i = this.f3988h0;
        MediaCodec.BufferInfo bufferInfo2 = this.f3955D;
        if (i < 0) {
            if (this.f3981a0 && this.f4000t0) {
                try {
                    iMo4177o = z01Var.mo4177o(bufferInfo2);
                } catch (IllegalStateException unused) {
                    m2906h0();
                    if (this.f4008y0) {
                        m2908k0();
                    }
                }
            } else {
                iMo4177o = z01Var.mo4177o(bufferInfo2);
            }
            if (iMo4177o < 0) {
                if (iMo4177o == -2) {
                    this.f4001u0 = true;
                    z01 z01Var2 = this.f3970P;
                    z01Var2.getClass();
                    MediaFormat mediaFormatMo4170g = z01Var2.mo4170g();
                    if (this.f3978X != 0 && mediaFormatMo4170g.getInteger("width") == 32 && mediaFormatMo4170g.getInteger("height") == 32) {
                        this.f3983c0 = true;
                        return true;
                    }
                    this.f3972R = mediaFormatMo4170g;
                    this.f3973S = true;
                    return true;
                }
                if (this.f3984d0 && (this.f4006x0 || this.f3997q0 == 2)) {
                    m2906h0();
                }
                long j3 = this.f3985e0;
                if (j3 != -9223372036854775807L) {
                    long j4 = j3 + 100;
                    this.f5812g.getClass();
                    if (j4 < System.currentTimeMillis()) {
                        m2906h0();
                        return false;
                    }
                }
                return false;
            }
            if (this.f3983c0) {
                this.f3983c0 = false;
                z01Var.mo4168d(iMo4177o);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                m2906h0();
                return false;
            }
            this.f3988h0 = iMo4177o;
            ByteBuffer byteBufferMo4181w = z01Var.mo4181w(iMo4177o);
            this.f3989i0 = byteBufferMo4181w;
            if (byteBufferMo4181w != null) {
                byteBufferMo4181w.position(bufferInfo2.offset);
                this.f3989i0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            long j5 = bufferInfo2.presentationTimeUs;
            this.f3990j0 = j5 < this.f5817q;
            long j6 = this.f4004w0;
            this.f3991k0 = j6 != -9223372036854775807L && j6 <= j5;
            m2918w0(j5);
        }
        if (this.f3981a0 && this.f4000t0) {
            try {
                ByteBuffer byteBuffer = this.f3989i0;
                int i2 = this.f3988h0;
                int i3 = bufferInfo2.flags;
                long j7 = bufferInfo2.presentationTimeUs;
                boolean z2 = this.f3990j0;
                boolean z3 = this.f3991k0;
                be0 be0Var = this.f3962H;
                be0Var.getClass();
                z = false;
                bufferInfo = bufferInfo2;
                try {
                    zMo33i0 = mo33i0(j, j2, z01Var, byteBuffer, i2, i3, 1, j7, z2, z3, be0Var);
                } catch (IllegalStateException unused2) {
                    m2906h0();
                    if (!this.f4008y0) {
                        return z;
                    }
                    m2908k0();
                    return z;
                }
            } catch (IllegalStateException unused3) {
                z = false;
            }
        } else {
            z = false;
            bufferInfo = bufferInfo2;
            ByteBuffer byteBuffer2 = this.f3989i0;
            int i4 = this.f3988h0;
            int i5 = bufferInfo.flags;
            long j8 = bufferInfo.presentationTimeUs;
            boolean z4 = this.f3990j0;
            boolean z5 = this.f3991k0;
            be0 be0Var2 = this.f3962H;
            be0Var2.getClass();
            zMo33i0 = mo33i0(j, j2, z01Var, byteBuffer2, i4, i5, 1, j8, z4, z5, be0Var2);
        }
        if (!zMo33i0) {
            return z;
        }
        mo2903d0(bufferInfo.presentationTimeUs);
        boolean z6 = (bufferInfo.flags & 4) != 0 ? true : z;
        if (!z6 && this.f4000t0 && this.f3991k0) {
            this.f5812g.getClass();
            this.f3985e0 = System.currentTimeMillis();
        }
        this.f3988h0 = -1;
        this.f3989i0 = null;
        if (!z6) {
            return r15;
        }
        m2906h0();
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019d  */
    /* JADX WARN: Code duplicated, block: B:102:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:111:0x008f A[EDGE_INSN: B:111:0x008f->B:33:0x008f BREAK  A[LOOP:0: B:30:0x006d->B:32:0x007a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x0035  */
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:29:0x006c  */
    /* JADX WARN: Code duplicated, block: B:32:0x007a A[LOOP:0: B:30:0x006d->B:32:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00df  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:73:0x010f  */
    /* JADX WARN: Code duplicated, block: B:75:0x011a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0122  */
    /* JADX WARN: Code duplicated, block: B:79:0x0126  */
    /* JADX WARN: Code duplicated, block: B:80:0x012a  */
    /* JADX WARN: Code duplicated, block: B:82:0x012e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0143  */
    /* JADX WARN: Code duplicated, block: B:88:0x014b  */
    /* JADX WARN: Code duplicated, block: B:89:0x015c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0180  */
    /* JADX WARN: Code duplicated, block: B:98:0x018f  */
    /* JADX INFO: renamed from: J */
    public final boolean m2893J() throws t70 {
        int iPosition;
        C0558d8 c0558d8;
        int iM3833w;
        boolean zM4599i;
        long j;
        int iMo2897N;
        int i;
        ArrayDeque arrayDeque;
        C0580dv c0580dv;
        int i2;
        be0 be0Var;
        z01 z01Var = this.f3970P;
        if (z01Var != null && this.f3997q0 != 2 && !this.f4006x0) {
            int i3 = this.f3987g0;
            C1533vx c1533vx = this.f3949A;
            if (i3 < 0) {
                int iMo4174k = z01Var.mo4174k();
                this.f3987g0 = iMo4174k;
                if (iMo4174k >= 0) {
                    c1533vx.f11795n = z01Var.mo4179t(iMo4174k);
                    c1533vx.mo5844r();
                    if (this.f3997q0 == 1) {
                        if (!this.f3984d0) {
                            this.f4000t0 = true;
                            z01Var.mo4182z(this.f3987g0, 0, 0L, 4);
                            this.f3987g0 = -1;
                            c1533vx.f11795n = null;
                        }
                        this.f3997q0 = 2;
                        return false;
                    }
                    if (this.f3982b0) {
                        this.f3982b0 = false;
                        ByteBuffer byteBuffer = c1533vx.f11795n;
                        byteBuffer.getClass();
                        byteBuffer.put(f3948G0);
                        z01Var.mo4182z(this.f3987g0, 38, 0L, 0);
                        this.f3987g0 = -1;
                        c1533vx.f11795n = null;
                        this.f3999s0 = true;
                        return true;
                    }
                    if (this.f3996p0 == 1) {
                        i2 = 0;
                        while (true) {
                            be0Var = this.f3971Q;
                            be0Var.getClass();
                            if (i2 < be0Var.f1344q.size()) {
                                break;
                            }
                            byte[] bArr = (byte[]) this.f3971Q.f1344q.get(i2);
                            ByteBuffer byteBuffer2 = c1533vx.f11795n;
                            byteBuffer2.getClass();
                            byteBuffer2.put(bArr);
                            i2++;
                        }
                        this.f3996p0 = 2;
                    }
                    ByteBuffer byteBuffer3 = c1533vx.f11795n;
                    byteBuffer3.getClass();
                    iPosition = byteBuffer3.position();
                    c0558d8 = this.f5808c;
                    c0558d8.m2267h();
                    try {
                        iM3833w = m3833w(c0558d8, c1533vx, 0);
                        if (iM3833w == -3) {
                            if (m3832k()) {
                                this.f4004w0 = this.f4002v0;
                                return false;
                            }
                        } else {
                            if (iM3833w == -5) {
                                if (this.f3996p0 == 2) {
                                    c1533vx.mo5844r();
                                    this.f3996p0 = 1;
                                }
                                mo24a0(c0558d8);
                                return true;
                            }
                            if (c1533vx.m4599i(4)) {
                                if (this.f3999s0 && !c1533vx.m4599i(1)) {
                                    c1533vx.mo5844r();
                                    if (this.f3996p0 == 2) {
                                        this.f3996p0 = 1;
                                    }
                                    return true;
                                }
                                if (mo2914r0(c1533vx)) {
                                    c1533vx.mo5844r();
                                    this.f3954C0.f10573d++;
                                    return true;
                                }
                                zM4599i = c1533vx.m4599i(1073741824);
                                if (zM4599i) {
                                    c0580dv = c1533vx.f11794m;
                                    if (iPosition == 0) {
                                        c0580dv.getClass();
                                    } else {
                                        if (c0580dv.f3017d == null) {
                                            int[] iArr = new int[1];
                                            c0580dv.f3017d = iArr;
                                            c0580dv.f3022i.numBytesOfClearData = iArr;
                                        }
                                        int[] iArr2 = c0580dv.f3017d;
                                        iArr2[0] = iArr2[0] + iPosition;
                                    }
                                }
                                j = c1533vx.f11797p;
                                if (this.f4010z0) {
                                    arrayDeque = this.f3957E;
                                    if (arrayDeque.isEmpty()) {
                                        C0716hj c0716hj = this.f3956D0.f3582d;
                                        be0 be0Var2 = this.f3961G;
                                        be0Var2.getClass();
                                        c0716hj.m3151a(j, be0Var2);
                                    } else {
                                        C0716hj c0716hj2 = ((f11) arrayDeque.peekLast()).f3582d;
                                        be0 be0Var3 = this.f3961G;
                                        be0Var3.getClass();
                                        c0716hj2.m3151a(j, be0Var3);
                                    }
                                    this.f4010z0 = false;
                                }
                                this.f4002v0 = Math.max(this.f4002v0, j);
                                if (m3832k() || c1533vx.m4599i(536870912)) {
                                    this.f4004w0 = this.f4002v0;
                                }
                                c1533vx.m6665u();
                                if (c1533vx.m4599i(268435456)) {
                                    mo19S(c1533vx);
                                }
                                mo2904f0(c1533vx);
                                iMo2897N = mo2897N(c1533vx);
                                i = this.f3987g0;
                                if (zM4599i) {
                                    z01Var.mo4176n(i, c1533vx.f11794m, j, iMo2897N);
                                } else {
                                    ByteBuffer byteBuffer4 = c1533vx.f11795n;
                                    byteBuffer4.getClass();
                                    z01Var.mo4182z(i, byteBuffer4.limit(), j, iMo2897N);
                                }
                                this.f3987g0 = -1;
                                c1533vx.f11795n = null;
                                this.f3999s0 = true;
                                this.f3996p0 = 0;
                                this.f3954C0.f10572c++;
                                return true;
                            }
                            this.f4004w0 = this.f4002v0;
                            if (this.f3996p0 == 2) {
                                c1533vx.mo5844r();
                                this.f3996p0 = 1;
                            }
                            this.f4006x0 = true;
                            if (!this.f3999s0) {
                                m2906h0();
                                return false;
                            }
                            if (!this.f3984d0) {
                                this.f4000t0 = true;
                                z01Var.mo4182z(this.f3987g0, 0, 0L, 4);
                                this.f3987g0 = -1;
                                c1533vx.f11795n = null;
                                return false;
                            }
                        }
                    } catch (C1496ux e) {
                        mo20X(e);
                        m2907j0(0);
                        m2894K();
                        return true;
                    }
                }
            } else {
                if (this.f3997q0 == 1) {
                    if (!this.f3984d0) {
                        this.f4000t0 = true;
                        z01Var.mo4182z(this.f3987g0, 0, 0L, 4);
                        this.f3987g0 = -1;
                        c1533vx.f11795n = null;
                    }
                    this.f3997q0 = 2;
                    return false;
                }
                if (this.f3982b0) {
                    this.f3982b0 = false;
                    ByteBuffer byteBuffer5 = c1533vx.f11795n;
                    byteBuffer5.getClass();
                    byteBuffer5.put(f3948G0);
                    z01Var.mo4182z(this.f3987g0, 38, 0L, 0);
                    this.f3987g0 = -1;
                    c1533vx.f11795n = null;
                    this.f3999s0 = true;
                    return true;
                }
                if (this.f3996p0 == 1) {
                    i2 = 0;
                    while (true) {
                        be0Var = this.f3971Q;
                        be0Var.getClass();
                        if (i2 < be0Var.f1344q.size()) {
                            break;
                            break;
                        }
                        byte[] bArr2 = (byte[]) this.f3971Q.f1344q.get(i2);
                        ByteBuffer byteBuffer6 = c1533vx.f11795n;
                        byteBuffer6.getClass();
                        byteBuffer6.put(bArr2);
                        i2++;
                    }
                    this.f3996p0 = 2;
                }
                ByteBuffer byteBuffer7 = c1533vx.f11795n;
                byteBuffer7.getClass();
                iPosition = byteBuffer7.position();
                c0558d8 = this.f5808c;
                c0558d8.m2267h();
                iM3833w = m3833w(c0558d8, c1533vx, 0);
                if (iM3833w == -3) {
                    if (m3832k()) {
                        this.f4004w0 = this.f4002v0;
                        return false;
                    }
                } else {
                    if (iM3833w == -5) {
                        if (this.f3996p0 == 2) {
                            c1533vx.mo5844r();
                            this.f3996p0 = 1;
                        }
                        mo24a0(c0558d8);
                        return true;
                    }
                    if (c1533vx.m4599i(4)) {
                        if (this.f3999s0) {
                        }
                        if (mo2914r0(c1533vx)) {
                            c1533vx.mo5844r();
                            this.f3954C0.f10573d++;
                            return true;
                        }
                        zM4599i = c1533vx.m4599i(1073741824);
                        if (zM4599i) {
                            c0580dv = c1533vx.f11794m;
                            if (iPosition == 0) {
                                c0580dv.getClass();
                            } else {
                                if (c0580dv.f3017d == null) {
                                    int[] iArr3 = new int[1];
                                    c0580dv.f3017d = iArr3;
                                    c0580dv.f3022i.numBytesOfClearData = iArr3;
                                }
                                int[] iArr4 = c0580dv.f3017d;
                                iArr4[0] = iArr4[0] + iPosition;
                            }
                        }
                        j = c1533vx.f11797p;
                        if (this.f4010z0) {
                            arrayDeque = this.f3957E;
                            if (arrayDeque.isEmpty()) {
                                C0716hj c0716hj3 = ((f11) arrayDeque.peekLast()).f3582d;
                                be0 be0Var4 = this.f3961G;
                                be0Var4.getClass();
                                c0716hj3.m3151a(j, be0Var4);
                            } else {
                                C0716hj c0716hj4 = this.f3956D0.f3582d;
                                be0 be0Var5 = this.f3961G;
                                be0Var5.getClass();
                                c0716hj4.m3151a(j, be0Var5);
                            }
                            this.f4010z0 = false;
                        }
                        this.f4002v0 = Math.max(this.f4002v0, j);
                        if (m3832k()) {
                            this.f4004w0 = this.f4002v0;
                        } else {
                            this.f4004w0 = this.f4002v0;
                        }
                        c1533vx.m6665u();
                        if (c1533vx.m4599i(268435456)) {
                            mo19S(c1533vx);
                        }
                        mo2904f0(c1533vx);
                        iMo2897N = mo2897N(c1533vx);
                        i = this.f3987g0;
                        if (zM4599i) {
                            z01Var.mo4176n(i, c1533vx.f11794m, j, iMo2897N);
                        } else {
                            ByteBuffer byteBuffer8 = c1533vx.f11795n;
                            byteBuffer8.getClass();
                            z01Var.mo4182z(i, byteBuffer8.limit(), j, iMo2897N);
                        }
                        this.f3987g0 = -1;
                        c1533vx.f11795n = null;
                        this.f3999s0 = true;
                        this.f3996p0 = 0;
                        this.f3954C0.f10572c++;
                        return true;
                    }
                    this.f4004w0 = this.f4002v0;
                    if (this.f3996p0 == 2) {
                        c1533vx.mo5844r();
                        this.f3996p0 = 1;
                    }
                    this.f4006x0 = true;
                    if (!this.f3999s0) {
                        m2906h0();
                        return false;
                    }
                    if (!this.f3984d0) {
                        this.f4000t0 = true;
                        z01Var.mo4182z(this.f3987g0, 0, 0L, 4);
                        this.f3987g0 = -1;
                        c1533vx.f11795n = null;
                        return false;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public final void m2894K() {
        try {
            z01 z01Var = this.f3970P;
            ki0.m3866j(z01Var);
            z01Var.flush();
        } finally {
            mo2909m0();
        }
    }

    /* JADX INFO: renamed from: L */
    public final boolean m2895L() {
        if (this.f3970P == null) {
            return false;
        }
        int i = this.f3998r0;
        if (i == 3 || ((this.f3979Y && !this.f4001u0) || (this.f3980Z && this.f4000t0))) {
            m2908k0();
            return true;
        }
        if (i == 2) {
            int i2 = z42.f13274a;
            ki0.m3864h(i2 >= 23);
            if (i2 >= 23) {
                try {
                    m2917v0();
                } catch (t70 e) {
                    AbstractC1337qm.m5544j0("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    m2908k0();
                    return true;
                }
            }
        }
        m2894K();
        return false;
    }

    /* JADX INFO: renamed from: M */
    public final List m2896M(boolean z) {
        be0 be0Var = this.f3961G;
        be0Var.getClass();
        f40 f40Var = this.f4005x;
        ArrayList arrayListMo17Q = mo17Q(f40Var, be0Var, z);
        if (!arrayListMo17Q.isEmpty() || !z) {
            return arrayListMo17Q;
        }
        ArrayList arrayListMo17Q2 = mo17Q(f40Var, be0Var, false);
        if (!arrayListMo17Q2.isEmpty()) {
            AbstractC1337qm.m5542i0("MediaCodecRenderer", "Drm session requires secure decoder for " + be0Var.f1341n + ", but no secure decoder available. Trying to proceed with " + arrayListMo17Q2 + ".");
        }
        return arrayListMo17Q2;
    }

    /* JADX INFO: renamed from: N */
    public int mo2897N(C1533vx c1533vx) {
        return 0;
    }

    /* JADX INFO: renamed from: O */
    public boolean mo2898O() {
        return false;
    }

    /* JADX INFO: renamed from: P */
    public abstract float mo16P(float f, be0[] be0VarArr);

    /* JADX INFO: renamed from: Q */
    public abstract ArrayList mo17Q(f40 f40Var, be0 be0Var, boolean z);

    /* JADX INFO: renamed from: R */
    public abstract C1470u7 mo18R(c11 c11Var, be0 be0Var, MediaCrypto mediaCrypto, float f);

    /* JADX INFO: renamed from: S */
    public abstract void mo19S(C1533vx c1533vx);

    /* JADX WARN: Code duplicated, block: B:32:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:47:0x0115  */
    /* JADX INFO: renamed from: T */
    public final void m2899T(c11 c11Var, MediaCrypto mediaCrypto) {
        float fMo16P;
        int i;
        be0 be0Var = this.f3961G;
        be0Var.getClass();
        String str = c11Var.f1614a;
        int i2 = z42.f13274a;
        if (i2 < 23) {
            fMo16P = -1.0f;
        } else {
            float f = this.f3969O;
            be0[] be0VarArr = this.f5815o;
            be0VarArr.getClass();
            fMo16P = mo16P(f, be0VarArr);
        }
        float f2 = fMo16P > this.f4007y ? fMo16P : -1.0f;
        mo2905g0(be0Var);
        this.f5812g.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1470u7 c1470u7Mo18R = mo18R(c11Var, be0Var, mediaCrypto, f2);
        if (i2 >= 31) {
            ye1 ye1Var = this.f5811f;
            ye1Var.getClass();
            xe1 xe1Var = ye1Var.f12970b;
            xe1Var.getClass();
            LogSessionId logSessionId = xe1Var.f12593a;
            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
            if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                ((MediaFormat) c1470u7Mo18R.f11142b).setString("log-session-id", logSessionId.getStringId());
            }
        }
        try {
            Trace.beginSection("createCodec:" + str);
            z01 z01VarMo739b = this.f4003w.mo739b(c1470u7Mo18R);
            this.f3970P = z01VarMo739b;
            z01VarMo739b.mo4169e(new pn0(this));
            Trace.endSection();
            this.f5812g.getClass();
            float f3 = f2;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!c11Var.m1109d(be0Var)) {
                String strM968c = be0.m968c(be0Var);
                Locale locale = Locale.US;
                AbstractC1337qm.m5542i0("MediaCodecRenderer", jd0.m3617o("Format exceeds selected codec's capabilities [", strM968c, ", ", str, "]"));
            }
            this.f3977W = c11Var;
            this.f3974T = f3;
            this.f3971Q = be0Var;
            if (i2 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                String str2 = z42.f13277d;
                if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                    i = 2;
                } else if (i2 < 24) {
                    i = 0;
                } else {
                    i = 0;
                }
            } else if (i2 < 24 || !("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                i = 0;
            } else {
                String str3 = z42.f13275b;
                if ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) {
                    i = 1;
                } else {
                    i = 0;
                }
            }
            this.f3978X = i;
            this.f3979Y = i2 == 29 && "c2.android.aac.decoder".equals(str);
            this.f3980Z = i2 <= 23 && "OMX.google.vorbis.decoder".equals(str);
            this.f3981a0 = i2 == 21 && "OMX.google.aac.decoder".equals(str);
            String str4 = c11Var.f1614a;
            this.f3984d0 = (i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str4)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str4) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str4) || "OMX.bcm.vdec.avc.tunnel".equals(str4) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str4) || "OMX.bcm.vdec.hevc.tunnel".equals(str4) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str4))) || (("Amazon".equals(z42.f13276c) && "AFTS".equals(z42.f13277d) && c11Var.f1619f) || mo2898O());
            this.f3970P.getClass();
            if (this.f5813m == 2) {
                this.f5812g.getClass();
                this.f3986f0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.f3954C0.f10570a++;
            mo21Y(str, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: renamed from: U */
    public final boolean m2900U(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        be0 be0Var = this.f3962H;
        return be0Var == null || !Objects.equals(be0Var.f1341n, "audio/opus") || j - j2 > 80000;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: V */
    public final void m2901V() {
        be0 be0Var;
        ay0 ay0Var;
        if (this.f3970P != null || this.f3992l0 || (be0Var = this.f3961G) == null) {
            return;
        }
        String str = be0Var.f1341n;
        if (this.f3964J == null && mo43s0(be0Var)) {
            m2890G();
            boolean zEquals = "audio/mp4a-latm".equals(str);
            C1369rh c1369rh = this.f3953C;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                c1369rh.getClass();
                c1369rh.f10021u = 32;
            } else {
                c1369rh.getClass();
                c1369rh.f10021u = 1;
            }
            this.f3992l0 = true;
            return;
        }
        m2911o0(this.f3964J);
        if (this.f3963I == null) {
            try {
                ay0Var = this.f3963I;
                if (ay0Var != null && (ay0Var.m788x() == 3 || this.f3963I.m788x() == 4)) {
                    ay0 ay0Var2 = this.f3963I;
                    ki0.m3866j(str);
                    ay0Var2.getClass();
                }
                m2902W(this.f3966L, false);
            } catch (e11 e) {
                throw m3830g(e, be0Var, false, 4001);
            }
        } else {
            ki0.m3864h(this.f3966L == null);
            ay0 ay0Var3 = this.f3963I;
            ay0Var3.getClass();
            boolean z = hg0.f4559a;
            if (ay0Var3.m785u() != null) {
                ay0Var = this.f3963I;
                if (ay0Var != null) {
                    ay0 ay0Var4 = this.f3963I;
                    ki0.m3866j(str);
                    ay0Var4.getClass();
                }
                m2902W(this.f3966L, false);
            }
        }
        MediaCrypto mediaCrypto = this.f3966L;
        if (mediaCrypto == null || this.f3970P != null) {
            return;
        }
        mediaCrypto.release();
        this.f3966L = null;
    }

    /* JADX INFO: renamed from: W */
    public final void m2902W(MediaCrypto mediaCrypto, boolean z) throws e11 {
        be0 be0Var = this.f3961G;
        be0Var.getClass();
        if (this.f3975U == null) {
            try {
                List listM2896M = m2896M(z);
                this.f3975U = new ArrayDeque();
                ArrayList arrayList = (ArrayList) listM2896M;
                if (!arrayList.isEmpty()) {
                    this.f3975U.add((c11) arrayList.get(0));
                }
                this.f3976V = null;
            } catch (j11 e) {
                throw new e11(be0Var, e, z, -49998);
            }
        }
        if (this.f3975U.isEmpty()) {
            throw new e11(be0Var, null, z, -49999);
        }
        ArrayDeque arrayDeque = this.f3975U;
        arrayDeque.getClass();
        while (this.f3970P == null) {
            c11 c11Var = (c11) arrayDeque.peekFirst();
            c11Var.getClass();
            if (!mo2913q0(c11Var)) {
                return;
            }
            try {
                m2899T(c11Var, mediaCrypto);
            } catch (Exception e2) {
                AbstractC1337qm.m5544j0("MediaCodecRenderer", "Failed to initialize decoder: " + c11Var, e2);
                arrayDeque.removeFirst();
                e11 e11Var = new e11("Decoder init failed: " + c11Var.f1614a + ", " + be0Var, e2, be0Var.f1341n, z, c11Var, e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).getDiagnosticInfo() : null);
                mo20X(e11Var);
                e11 e11Var2 = this.f3976V;
                if (e11Var2 == null) {
                    this.f3976V = e11Var;
                } else {
                    this.f3976V = new e11(e11Var2.getMessage(), e11Var2.getCause(), e11Var2.f3153a, e11Var2.f3154b, e11Var2.f3155c, e11Var2.f3156d);
                }
                if (arrayDeque.isEmpty()) {
                    throw this.f3976V;
                }
            }
        }
        this.f3975U = null;
    }

    /* JADX INFO: renamed from: X */
    public abstract void mo20X(Exception exc);

    /* JADX INFO: renamed from: Y */
    public abstract void mo21Y(String str, long j, long j2);

    /* JADX INFO: renamed from: Z */
    public abstract void mo22Z(String str);

    /* JADX WARN: Code duplicated, block: B:43:0x0095  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a0 */
    public C1607xx mo24a0(C0558d8 c0558d8) throws t70 {
        be0 be0Var;
        int i;
        boolean z = true;
        this.f4010z0 = true;
        be0 be0Var2 = (be0) c0558d8.f2822c;
        be0Var2.getClass();
        String str = be0Var2.f1341n;
        if (str == null) {
            throw m3830g(new IllegalArgumentException("Sample MIME type is null."), be0Var2, false, 4005);
        }
        if (!str.equals("video/av01") || be0Var2.f1344q.isEmpty()) {
            be0Var = be0Var2;
        } else {
            ae0 ae0VarM969a = be0Var2.m969a();
            ae0VarM969a.f200p = null;
            be0Var = new be0(ae0VarM969a);
        }
        ay0 ay0Var = (ay0) c0558d8.f2821b;
        ay0 ay0Var2 = this.f3964J;
        this.f3964J = ay0Var;
        this.f3961G = be0Var;
        if (this.f3992l0) {
            this.f3994n0 = true;
            return null;
        }
        z01 z01Var = this.f3970P;
        if (z01Var == null) {
            this.f3975U = null;
            m2901V();
            return null;
        }
        c11 c11Var = this.f3977W;
        c11Var.getClass();
        be0 be0Var3 = this.f3971Q;
        be0Var3.getClass();
        if (this.f3963I != this.f3964J) {
            if (this.f3999s0) {
                this.f3997q0 = 1;
                this.f3998r0 = 3;
            } else {
                m2908k0();
                m2901V();
            }
            return new C1607xx(c11Var.f1614a, be0Var3, be0Var, 0, 128);
        }
        boolean z2 = this.f3964J != this.f3963I;
        ki0.m3864h(!z2 || z42.f13274a >= 23);
        C1607xx c1607xxMo15E = mo15E(c11Var, be0Var3, be0Var);
        int i2 = c1607xxMo15E.f12761d;
        if (i2 != 0) {
            i = 16;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        l41.m4046o();
                        return null;
                    }
                    if (m2915u0(be0Var)) {
                        this.f3971Q = be0Var;
                        if (z2 && !m2891H()) {
                            i = 2;
                        }
                    }
                } else if (m2915u0(be0Var)) {
                    this.f3995o0 = true;
                    this.f3996p0 = 1;
                    int i3 = this.f3978X;
                    if (i3 != 2 && (i3 != 1 || be0Var.f1348u != be0Var3.f1348u || be0Var.f1349v != be0Var3.f1349v)) {
                        z = false;
                    }
                    this.f3982b0 = z;
                    this.f3971Q = be0Var;
                    if (z2 && !m2891H()) {
                        i = 2;
                    }
                }
            } else if (m2915u0(be0Var)) {
                this.f3971Q = be0Var;
                if (z2) {
                    if (!m2891H()) {
                        i = 2;
                    }
                } else if (this.f3999s0) {
                    this.f3997q0 = 1;
                    if (this.f3980Z) {
                        this.f3998r0 = 3;
                        i = 2;
                    } else {
                        this.f3998r0 = 1;
                    }
                }
            }
            if (i2 != 0) {
                return (this.f3970P == z01Var || this.f3998r0 == 3) ? new C1607xx(c11Var.f1614a, be0Var3, be0Var, 0, i) : c1607xxMo15E;
            }
            return c1607xxMo15E;
        }
        if (this.f3999s0) {
            this.f3997q0 = 1;
            this.f3998r0 = 3;
        } else {
            m2908k0();
            m2901V();
        }
        i = 0;
        if (i2 != 0) {
            if (this.f3970P == z01Var) {
            }
        }
        return c1607xxMo15E;
    }

    /* JADX INFO: renamed from: b0 */
    public abstract void mo26b0(be0 be0Var, MediaFormat mediaFormat);

    /* JADX INFO: renamed from: d0 */
    public void mo2903d0(long j) {
        this.f3958E0 = j;
        while (true) {
            ArrayDeque arrayDeque = this.f3957E;
            if (arrayDeque.isEmpty() || j < ((f11) arrayDeque.peek()).f3579a) {
                return;
            }
            f11 f11Var = (f11) arrayDeque.poll();
            f11Var.getClass();
            m2912p0(f11Var);
            mo31e0();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public abstract void mo31e0();

    /* JADX INFO: renamed from: h0 */
    public final void m2906h0() {
        int i = this.f3998r0;
        if (i == 1) {
            m2894K();
            return;
        }
        if (i == 2) {
            m2894K();
            m2917v0();
        } else if (i != 3) {
            this.f4008y0 = true;
            mo36l0();
        } else {
            m2908k0();
            m2901V();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public abstract boolean mo33i0(long j, long j2, z01 z01Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, be0 be0Var);

    /* JADX INFO: renamed from: j0 */
    public final boolean m2907j0(int i) throws t70 {
        C0558d8 c0558d8 = this.f5808c;
        c0558d8.m2267h();
        C1533vx c1533vx = this.f4009z;
        c1533vx.mo5844r();
        int iM3833w = m3833w(c0558d8, c1533vx, i | 4);
        if (iM3833w == -5) {
            mo24a0(c0558d8);
            return true;
        }
        if (iM3833w != -4 || !c1533vx.m4599i(4)) {
            return false;
        }
        this.f4006x0 = true;
        m2906h0();
        return false;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m2908k0() {
        try {
            z01 z01Var = this.f3970P;
            if (z01Var != null) {
                z01Var.release();
                this.f3954C0.f10571b++;
                c11 c11Var = this.f3977W;
                c11Var.getClass();
                mo22Z(c11Var.f1614a);
            }
            this.f3970P = null;
            try {
                MediaCrypto mediaCrypto = this.f3966L;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f3966L = null;
                m2911o0(null);
                m2910n0();
            }
        } catch (Throwable th) {
            this.f3970P = null;
            try {
                MediaCrypto mediaCrypto2 = this.f3966L;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.f3966L = null;
                m2911o0(null);
                m2910n0();
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void mo2909m0() {
        this.f3987g0 = -1;
        this.f3949A.f11795n = null;
        this.f3988h0 = -1;
        this.f3989i0 = null;
        this.f3986f0 = -9223372036854775807L;
        this.f4000t0 = false;
        this.f3985e0 = -9223372036854775807L;
        this.f3999s0 = false;
        this.f3982b0 = false;
        this.f3983c0 = false;
        this.f3990j0 = false;
        this.f3991k0 = false;
        this.f4002v0 = -9223372036854775807L;
        this.f4004w0 = -9223372036854775807L;
        this.f3958E0 = -9223372036854775807L;
        this.f3997q0 = 0;
        this.f3998r0 = 0;
        this.f3996p0 = this.f3995o0 ? 1 : 0;
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: n */
    public boolean mo37n() {
        boolean zMo3797b;
        if (this.f3961G == null) {
            return false;
        }
        if (m3832k()) {
            zMo3797b = this.f5819s;
        } else {
            yo1 yo1Var = this.f5814n;
            yo1Var.getClass();
            zMo3797b = yo1Var.mo3797b();
        }
        if (zMo3797b || this.f3988h0 >= 0) {
            return true;
        }
        if (this.f3986f0 == -9223372036854775807L) {
            return false;
        }
        this.f5812g.getClass();
        return SystemClock.elapsedRealtime() < this.f3986f0;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m2910n0() {
        mo2909m0();
        this.f3952B0 = null;
        this.f3975U = null;
        this.f3977W = null;
        this.f3971Q = null;
        this.f3972R = null;
        this.f3973S = false;
        this.f4001u0 = false;
        this.f3974T = -1.0f;
        this.f3978X = 0;
        this.f3979Y = false;
        this.f3980Z = false;
        this.f3981a0 = false;
        this.f3984d0 = false;
        this.f3995o0 = false;
        this.f3996p0 = 0;
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: o */
    public void mo38o() {
        this.f3961G = null;
        m2912p0(f11.f3578e);
        this.f3957E.clear();
        m2895L();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m2911o0(ay0 ay0Var) {
        ay0 ay0Var2 = this.f3963I;
        this.f3963I = ay0Var;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m2912p0(f11 f11Var) {
        this.f3956D0 = f11Var;
        if (f11Var.f3581c != -9223372036854775807L) {
            this.f3960F0 = true;
            mo28c0();
        }
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: q */
    public void mo40q(long j, boolean z) {
        this.f4006x0 = false;
        this.f4008y0 = false;
        this.f3950A0 = false;
        if (this.f3992l0) {
            this.f3953C.mo5844r();
            this.f3951B.mo5844r();
            this.f3993m0 = false;
            l91 l91Var = this.f3959F;
            l91Var.getClass();
            l91Var.f6280d = InterfaceC1103mc.f6750a;
            l91Var.f6279c = 0;
            l91Var.f6278b = 2;
        } else if (m2895L()) {
            m2901V();
        }
        if (this.f3956D0.f3582d.m3158h() > 0) {
            this.f4010z0 = true;
        }
        this.f3956D0.f3582d.m3152b();
        this.f3957E.clear();
    }

    /* JADX INFO: renamed from: q0 */
    public boolean mo2913q0(c11 c11Var) {
        return true;
    }

    /* JADX INFO: renamed from: r0 */
    public boolean mo2914r0(C1533vx c1533vx) {
        return false;
    }

    /* JADX INFO: renamed from: s0 */
    public boolean mo43s0(be0 be0Var) {
        return false;
    }

    /* JADX INFO: renamed from: t0 */
    public abstract int mo45t0(f40 f40Var, be0 be0Var);

    /* JADX INFO: renamed from: u0 */
    public final boolean m2915u0(be0 be0Var) {
        if (z42.f13274a >= 23 && this.f3970P != null && this.f3998r0 != 3 && this.f5813m != 0) {
            float f = this.f3969O;
            be0Var.getClass();
            be0[] be0VarArr = this.f5815o;
            be0VarArr.getClass();
            float fMo16P = mo16P(f, be0VarArr);
            float f2 = this.f3974T;
            if (f2 != fMo16P) {
                if (fMo16P == -1.0f) {
                    if (this.f3999s0) {
                        this.f3997q0 = 1;
                        this.f3998r0 = 3;
                        return false;
                    }
                    m2908k0();
                    m2901V();
                    return false;
                }
                if (f2 != -1.0f || fMo16P > this.f4007y) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fMo16P);
                    z01 z01Var = this.f3970P;
                    z01Var.getClass();
                    z01Var.mo4172i(bundle);
                    this.f3974T = fMo16P;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 >= r0) goto L14;
     */
    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo2916v(p000.be0[] r13, long r14, long r16, p000.q21 r18) {
        /*
            r12 = this;
            f11 r13 = r12.f3956D0
            long r0 = r13.f3581c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L1e
            f11 r4 = new f11
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r14
            r9 = r16
            r4.<init>(r5, r7, r9)
            r12.m2912p0(r4)
            return
        L1e:
            java.util.ArrayDeque r13 = r12.f3957E
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L52
            long r0 = r12.f4002v0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L36
            long r4 = r12.f3958E0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L52
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L52
        L36:
            f11 r5 = new f11
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.m2912p0(r5)
            f11 r13 = r12.f3956D0
            long r13 = r13.f3581c
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L51
            r12.mo31e0()
        L51:
            return
        L52:
            f11 r5 = new f11
            long r6 = r12.f4002v0
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r13.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.g11.mo2916v(be0[], long, long, q21):void");
    }

    /* JADX INFO: renamed from: v0 */
    public final void m2917v0() {
        ay0 ay0Var = this.f3964J;
        ay0Var.getClass();
        ay0Var.m784t();
        m2911o0(this.f3964J);
        this.f3997q0 = 0;
        this.f3998r0 = 0;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m2918w0(long j) {
        be0 be0Var = (be0) this.f3956D0.f3582d.m3156f(j);
        if (be0Var == null && this.f3960F0 && this.f3972R != null) {
            be0Var = (be0) this.f3956D0.f3582d.m3155e();
        }
        if (be0Var != null) {
            this.f3962H = be0Var;
        } else if (!this.f3973S || this.f3962H == null) {
            return;
        }
        be0 be0Var2 = this.f3962H;
        be0Var2.getClass();
        mo26b0(be0Var2, this.f3972R);
        this.f3973S = false;
        this.f3960F0 = false;
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: x */
    public void mo2919x(long j, long j2) throws t70 {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.f3950A0) {
            this.f3950A0 = false;
            m2906h0();
        }
        t70 t70Var = this.f3952B0;
        if (t70Var != null) {
            this.f3952B0 = null;
            throw t70Var;
        }
        try {
            if (this.f4008y0) {
                mo36l0();
                return;
            }
            if (this.f3961G != null || m2907j0(2)) {
                m2901V();
                if (this.f3992l0) {
                    Trace.beginSection("bypassRender");
                    while (m2888D(j, j2)) {
                    }
                    Trace.endSection();
                } else if (this.f3970P != null) {
                    this.f5812g.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    while (m2892I(j, j2)) {
                        long j3 = this.f3967M;
                        if (j3 != -9223372036854775807L) {
                            this.f5812g.getClass();
                            z2 = SystemClock.elapsedRealtime() - jElapsedRealtime < j3;
                        }
                        if (!z2) {
                            break;
                        }
                    }
                    while (m2893J()) {
                        long j4 = this.f3967M;
                        if (j4 != -9223372036854775807L) {
                            this.f5812g.getClass();
                            z = SystemClock.elapsedRealtime() - jElapsedRealtime < j4;
                        }
                        if (!z) {
                            break;
                        }
                    }
                    Trace.endSection();
                } else {
                    C1422sx c1422sx = this.f3954C0;
                    int i = c1422sx.f10573d;
                    yo1 yo1Var = this.f5814n;
                    yo1Var.getClass();
                    c1422sx.f10573d = i + yo1Var.mo3799i(j - this.f5816p);
                    m2907j0(1);
                }
                synchronized (this.f3954C0) {
                }
            }
        } catch (MediaCodec.CryptoException e) {
            throw m3830g(e, this.f3961G, false, z42.m7241o(e.getErrorCode()));
        } catch (IllegalStateException e2) {
            boolean z4 = e2 instanceof MediaCodec.CodecException;
            if (!z4) {
                StackTraceElement[] stackTrace = e2.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e2;
                }
            }
            mo20X(e2);
            if (z4 && ((MediaCodec.CodecException) e2).isRecoverable()) {
                z3 = true;
            }
            if (z3) {
                m2908k0();
            }
            b11 b11VarMo2889F = mo2889F(e2, this.f3977W);
            throw m3830g(b11VarMo2889F, this.f3961G, z3, b11VarMo2889F.f1126a == 1101 ? 4006 : 4003);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void mo28c0() {
    }

    /* JADX INFO: renamed from: l0 */
    public void mo36l0() {
    }

    /* JADX INFO: renamed from: f0 */
    public void mo2904f0(C1533vx c1533vx) {
    }

    /* JADX INFO: renamed from: g0 */
    public void mo2905g0(be0 be0Var) {
    }
}

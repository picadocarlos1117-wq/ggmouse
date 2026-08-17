package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.example.ssmousepro.ads.RewardedVideoActivity;
import com.example.ssmousepro.injection.TouchPipeline;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: sy */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1423sy {

    /* JADX INFO: renamed from: j0 */
    public static final Object f10582j0 = new Object();

    /* JADX INFO: renamed from: k0 */
    public static ScheduledExecutorService f10583k0;

    /* JADX INFO: renamed from: l0 */
    public static int f10584l0;

    /* JADX INFO: renamed from: A */
    public C1162ny f10585A;

    /* JADX INFO: renamed from: B */
    public C1162ny f10586B;

    /* JADX INFO: renamed from: C */
    public td1 f10587C;

    /* JADX INFO: renamed from: D */
    public boolean f10588D;

    /* JADX INFO: renamed from: E */
    public ByteBuffer f10589E;

    /* JADX INFO: renamed from: F */
    public int f10590F;

    /* JADX INFO: renamed from: G */
    public long f10591G;

    /* JADX INFO: renamed from: H */
    public long f10592H;

    /* JADX INFO: renamed from: I */
    public long f10593I;

    /* JADX INFO: renamed from: J */
    public long f10594J;

    /* JADX INFO: renamed from: K */
    public int f10595K;

    /* JADX INFO: renamed from: L */
    public boolean f10596L;

    /* JADX INFO: renamed from: M */
    public boolean f10597M;

    /* JADX INFO: renamed from: N */
    public long f10598N;

    /* JADX INFO: renamed from: O */
    public float f10599O;

    /* JADX INFO: renamed from: P */
    public ByteBuffer f10600P;

    /* JADX INFO: renamed from: Q */
    public int f10601Q;

    /* JADX INFO: renamed from: R */
    public ByteBuffer f10602R;

    /* JADX INFO: renamed from: S */
    public boolean f10603S;

    /* JADX INFO: renamed from: T */
    public boolean f10604T;

    /* JADX INFO: renamed from: U */
    public boolean f10605U;

    /* JADX INFO: renamed from: V */
    public boolean f10606V;

    /* JADX INFO: renamed from: W */
    public boolean f10607W;

    /* JADX INFO: renamed from: X */
    public int f10608X;

    /* JADX INFO: renamed from: Y */
    public C0711he f10609Y;

    /* JADX INFO: renamed from: Z */
    public ay0 f10610Z;

    /* JADX INFO: renamed from: a */
    public final RewardedVideoActivity f10611a;

    /* JADX INFO: renamed from: a0 */
    public boolean f10612a0;

    /* JADX INFO: renamed from: b */
    public final C1174o9 f10613b;

    /* JADX INFO: renamed from: b0 */
    public long f10614b0;

    /* JADX INFO: renamed from: c */
    public final C1411sm f10615c;

    /* JADX INFO: renamed from: c0 */
    public long f10616c0;

    /* JADX INFO: renamed from: d */
    public final e32 f10617d;

    /* JADX INFO: renamed from: d0 */
    public boolean f10618d0;

    /* JADX INFO: renamed from: e */
    public final kk1 f10619e;

    /* JADX INFO: renamed from: e0 */
    public boolean f10620e0;

    /* JADX INFO: renamed from: f */
    public final kk1 f10621f;

    /* JADX INFO: renamed from: f0 */
    public Looper f10622f0;

    /* JADX INFO: renamed from: g */
    public final C1586xc f10623g;

    /* JADX INFO: renamed from: g0 */
    public long f10624g0;

    /* JADX INFO: renamed from: h */
    public final ArrayDeque f10625h;

    /* JADX INFO: renamed from: h0 */
    public long f10626h0;

    /* JADX INFO: renamed from: i */
    public final boolean f10627i;

    /* JADX INFO: renamed from: i0 */
    public Handler f10628i0;

    /* JADX INFO: renamed from: j */
    public int f10629j;

    /* JADX INFO: renamed from: k */
    public C1174o9 f10630k;

    /* JADX INFO: renamed from: l */
    public final C1312py f10631l;

    /* JADX INFO: renamed from: m */
    public final C1312py f10632m;

    /* JADX INFO: renamed from: n */
    public final k50 f10633n;

    /* JADX INFO: renamed from: o */
    public final C0558d8 f10634o;

    /* JADX INFO: renamed from: p */
    public final bz1 f10635p;

    /* JADX INFO: renamed from: q */
    public ye1 f10636q;

    /* JADX INFO: renamed from: r */
    public pn0 f10637r;

    /* JADX INFO: renamed from: s */
    public C1125my f10638s;

    /* JADX INFO: renamed from: t */
    public C1125my f10639t;

    /* JADX INFO: renamed from: u */
    public C0785jc f10640u;

    /* JADX INFO: renamed from: v */
    public AudioTrack f10641v;

    /* JADX INFO: renamed from: w */
    public C1659zb f10642w;

    /* JADX INFO: renamed from: x */
    public C0130cc f10643x;

    /* JADX INFO: renamed from: y */
    public C1174o9 f10644y;

    /* JADX INFO: renamed from: z */
    public C1474ub f10645z;

    public C1423sy(C1088ly c1088ly) {
        RewardedVideoActivity rewardedVideoActivity = (RewardedVideoActivity) c1088ly.f6547b;
        this.f10611a = rewardedVideoActivity;
        C1474ub c1474ub = C1474ub.f11245b;
        this.f10645z = c1474ub;
        C1659zb c1659zb = C1659zb.f13327c;
        int i = z42.f13274a;
        this.f10642w = C1659zb.m7296b(rewardedVideoActivity, c1474ub, null);
        this.f10613b = (C1174o9) c1088ly.f6548c;
        int i2 = z42.f13274a;
        this.f10627i = false;
        this.f10629j = 0;
        this.f10633n = (k50) c1088ly.f6549d;
        C0558d8 c0558d8 = (C0558d8) c1088ly.f6551f;
        c0558d8.getClass();
        this.f10634o = c0558d8;
        this.f10623g = new C1586xc(new ay0(this, 21));
        C1411sm c1411sm = new C1411sm();
        this.f10615c = c1411sm;
        e32 e32Var = new e32();
        e32Var.f3186m = z42.f13279f;
        this.f10617d = e32Var;
        f12 f12Var = new f12();
        om0 om0Var = qm0.f9540b;
        Object[] objArr = {f12Var, c1411sm, e32Var};
        o21.m4665k(3, objArr);
        this.f10619e = qm0.m5565k(3, objArr);
        this.f10621f = qm0.m5570t(new e12());
        this.f10599O = 1.0f;
        this.f10608X = 0;
        this.f10609Y = new C0711he();
        td1 td1Var = td1.f10843d;
        this.f10586B = new C1162ny(td1Var, 0L, 0L);
        this.f10587C = td1Var;
        this.f10588D = false;
        this.f10625h = new ArrayDeque();
        this.f10631l = new C1312py();
        this.f10632m = new C1312py();
        this.f10635p = (bz1) c1088ly.f6550e;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m6145p(AudioTrack audioTrack) {
        return z42.f13274a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:23:0x0057  */
    /* JADX INFO: renamed from: a */
    public final void m6146a(long j) {
        td1 td1Var;
        boolean z;
        boolean zM6168x = m6168x();
        C1174o9 c1174o9 = this.f10613b;
        if (zM6168x) {
            td1Var = td1.f10843d;
        } else {
            if (this.f10612a0) {
                td1Var = td1.f10843d;
            } else {
                C1125my c1125my = this.f10639t;
                if (c1125my.f7133c == 0) {
                    int i = c1125my.f7131a.f1319E;
                    td1Var = this.f10587C;
                    cu1 cu1Var = (cu1) c1174o9.f7701d;
                    float f = td1Var.f10844a;
                    if (cu1Var.f2628c != f) {
                        cu1Var.f2628c = f;
                        cu1Var.f2634i = true;
                    }
                    float f2 = td1Var.f10845b;
                    if (cu1Var.f2629d != f2) {
                        cu1Var.f2629d = f2;
                        cu1Var.f2634i = true;
                    }
                } else {
                    td1Var = td1.f10843d;
                }
            }
            this.f10587C = td1Var;
        }
        td1 td1Var2 = td1Var;
        int i2 = 0;
        if (this.f10612a0) {
            z = false;
        } else {
            C1125my c1125my2 = this.f10639t;
            if (c1125my2.f7133c == 0) {
                int i3 = c1125my2.f7131a.f1319E;
                z = this.f10588D;
                ((ys1) c1174o9.f7700c).f13137o = z;
            } else {
                z = false;
            }
        }
        this.f10588D = z;
        this.f10625h.add(new C1162ny(td1Var2, Math.max(0L, j), z42.m7220H(this.f10639t.f7135e, m6156k())));
        C0785jc c0785jc = this.f10639t.f7139i;
        this.f10640u = c0785jc;
        c0785jc.m3592a();
        pn0 pn0Var = this.f10637r;
        if (pn0Var != null) {
            boolean z2 = this.f10588D;
            C1290pc c1290pc = ((a11) pn0Var.f8968a).f11I0;
            Handler handler = c1290pc.f8839a;
            if (handler != null) {
                handler.post(new RunnableC1177oc(z2, i2, c1290pc));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final AudioTrack m6147b(C0662g2 c0662g2, C1474ub c1474ub, int i, be0 be0Var) throws C1364rc {
        try {
            AudioTrack audioTrackM1084i = this.f10635p.m1084i(c0662g2, c1474ub, i);
            int state = audioTrackM1084i.getState();
            if (state == 1) {
                return audioTrackM1084i;
            }
            try {
                audioTrackM1084i.release();
            } catch (Exception unused) {
            }
            throw new C1364rc(state, c0662g2.f4014b, c0662g2.f4015c, c0662g2.f4013a, be0Var, c0662g2.f4017e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new C1364rc(0, c0662g2.f4014b, c0662g2.f4015c, c0662g2.f4013a, be0Var, c0662g2.f4017e, e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final AudioTrack m6148c(C1125my c1125my) throws C1364rc {
        try {
            return m6147b(c1125my.m4484a(), this.f10645z, this.f10608X, c1125my.f7131a);
        } catch (C1364rc e) {
            pn0 pn0Var = this.f10637r;
            if (pn0Var != null) {
                pn0Var.m5290l(e);
            }
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0112 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0114  */
    /* JADX WARN: Code duplicated, block: B:46:0x012a  */
    /* JADX WARN: Code duplicated, block: B:47:0x012c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0132  */
    /* JADX WARN: Code duplicated, block: B:51:0x0134  */
    /* JADX WARN: Code duplicated, block: B:53:0x0137  */
    /* JADX WARN: Code duplicated, block: B:54:0x013a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0146 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0148  */
    /* JADX WARN: Code duplicated, block: B:60:0x014b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0152  */
    /* JADX WARN: Code duplicated, block: B:64:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0159  */
    /* JADX WARN: Code duplicated, block: B:66:0x015d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0163  */
    /* JADX WARN: Code duplicated, block: B:69:0x016c  */
    /* JADX WARN: Code duplicated, block: B:72:0x017e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0182  */
    /* JADX WARN: Code duplicated, block: B:75:0x0196  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:82:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x0206  */
    /* JADX WARN: Instruction removed from duplicated block: B:82:0x01eb, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:84:0x0206, please report this as an issue */
    /* JADX INFO: renamed from: d */
    public final void m6149d(be0 be0Var, int[] iArr) {
        int iIntValue;
        int i;
        boolean z;
        int i2;
        C0785jc c0785jc;
        int i3;
        int i4;
        int iM7245s;
        int i5;
        boolean z2;
        int i6;
        int minBufferSize;
        boolean z3;
        int i7;
        double d;
        int iM7233g;
        C1125my c1125my;
        int i8;
        int iM3795u;
        m6161q();
        String str = be0Var.f1341n;
        int i9 = be0Var.f1318D;
        int i10 = be0Var.f1317C;
        int i11 = be0Var.f1319E;
        boolean zEquals = "audio/raw".equals(str);
        boolean z4 = this.f10627i;
        if (!zEquals) {
            C0785jc c0785jc2 = new C0785jc(kk1.f5896e);
            C0746ic c0746icM6153h = this.f10629j != 0 ? m6153h(be0Var) : C0746ic.f4929d;
            if (this.f10629j == 0 || !c0746icM6153h.f4930a) {
                Pair pairM7298d = this.f10642w.m7298d(this.f10645z, be0Var);
                if (pairM7298d == null) {
                    throw new C1327qc("Unable to configure passthrough for: " + be0Var, be0Var);
                }
                int iIntValue2 = ((Integer) pairM7298d.first).intValue();
                iIntValue = ((Integer) pairM7298d.second).intValue();
                i = i9;
                z = z4;
                i2 = -1;
                c0785jc = c0785jc2;
                i3 = 2;
                i4 = iIntValue2;
                iM7245s = -1;
            } else {
                str.getClass();
                int iM6572b = v51.m6572b(str, be0Var.f1338k);
                int iM7240n = z42.m7240n(i10);
                boolean z5 = c0746icM6153h.f4931b;
                i4 = iM6572b;
                i3 = 1;
                iM7245s = -1;
                c0785jc = c0785jc2;
                i = i9;
                i2 = -1;
                i5 = iM7240n;
                z2 = z5;
                z = true;
            }
            if (i4 != 0) {
                throw new C1327qc("Invalid output encoding (mode=" + i3 + ") for: " + be0Var, be0Var);
            }
            if (i5 != 0) {
                throw new C1327qc("Invalid output channel config (mode=" + i3 + ") for: " + be0Var, be0Var);
            }
            i6 = be0Var.f1337j;
            if ("audio/vnd.dts.hd;profile=lbr".equals(str) && i6 == -1) {
                i6 = 768000;
            }
            minBufferSize = AudioTrack.getMinBufferSize(i, i5, i4);
            if (minBufferSize != -2) {
                z3 = true;
            } else {
                z3 = false;
            }
            ki0.m3864h(z3);
            if (iM7245s != -1) {
                i7 = iM7245s;
            } else {
                i7 = 1;
            }
            if (z) {
                d = 8.0d;
            } else {
                d = 1.0d;
            }
            this.f10633n.getClass();
            if (i3 != 0) {
                i2 = i2;
                long j = i;
                long j2 = i7;
                iM7233g = z42.m7233g(minBufferSize * 4, rc2.m5793l(((250000 * j) * j2) / 1000000), rc2.m5793l(((750000 * j) * j2) / 1000000));
            } else if (i3 != 1) {
                iM7233g = rc2.m5793l((50000000 * ((long) k50.m3795u(i4))) / 1000000);
            } else {
                if (i3 == 2) {
                    l41.m4049r();
                    return;
                }
                if (i4 == 5) {
                    i8 = 500000;
                } else if (i4 == 8) {
                    i8 = 1000000;
                } else {
                    i8 = 250000;
                }
                if (i6 != -1) {
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    iM3795u = hp0.m3220o(i6, 8);
                } else {
                    iM3795u = k50.m3795u(i4);
                }
                iM7233g = rc2.m5793l((((long) i8) * ((long) iM3795u)) / 1000000);
            }
            int iMax = (((Math.max(minBufferSize, (int) (((double) iM7233g) * d)) + i7) - 1) / i7) * i7;
            this.f10618d0 = false;
            c1125my = new C1125my(be0Var, i2, i3, iM7245s, i, i5, i4, iMax, c0785jc, z, z2, this.f10612a0);
            if (m6160o()) {
                this.f10638s = c1125my;
            } else {
                this.f10639t = c1125my;
            }
        }
        ki0.m3857c(z42.m7213A(i11));
        int iM7245s2 = z42.m7245s(i11, i10);
        nm0 nm0Var = new nm0(4);
        nm0Var.m3904d(this.f10619e);
        nm0Var.m3902b((InterfaceC1103mc[]) this.f10613b.f7699b);
        C0785jc c0785jc3 = new C0785jc(nm0Var.m4561g());
        if (c0785jc3.equals(this.f10640u)) {
            c0785jc3 = this.f10640u;
        }
        int i12 = be0Var.f1320F;
        int i13 = be0Var.f1321G;
        e32 e32Var = this.f10617d;
        e32Var.f3182i = i12;
        e32Var.f3183j = i13;
        this.f10615c.f10435i = iArr;
        C0823kc c0823kc = new C0823kc(i9, i10, i11);
        try {
            qm0 qm0Var = c0785jc3.f5356a;
            if (c0823kc.equals(C0823kc.f5741e)) {
                throw new C1066lc(c0823kc);
            }
            for (int i14 = 0; i14 < qm0Var.size(); i14++) {
                InterfaceC1103mc interfaceC1103mc = (InterfaceC1103mc) qm0Var.get(i14);
                C0823kc c0823kcMo2127c = interfaceC1103mc.mo2127c(c0823kc);
                if (interfaceC1103mc.isActive()) {
                    ki0.m3864h(!c0823kcMo2127c.equals(C0823kc.f5741e));
                    c0823kc = c0823kcMo2127c;
                }
            }
            int i15 = c0823kc.f5743b;
            int i16 = c0823kc.f5744c;
            int i17 = c0823kc.f5742a;
            iIntValue = z42.m7240n(i15);
            iM7245s = z42.m7245s(i16, i15);
            i2 = iM7245s2;
            i = i17;
            i4 = i16;
            z = z4;
            c0785jc = c0785jc3;
            i3 = 0;
        } catch (C1066lc e) {
            throw new C1327qc(e, be0Var);
        }
        i5 = iIntValue;
        z2 = false;
        if (i4 != 0) {
            throw new C1327qc("Invalid output encoding (mode=" + i3 + ") for: " + be0Var, be0Var);
        }
        if (i5 != 0) {
            throw new C1327qc("Invalid output channel config (mode=" + i3 + ") for: " + be0Var, be0Var);
        }
        i6 = be0Var.f1337j;
        if ("audio/vnd.dts.hd;profile=lbr".equals(str)) {
            i6 = 768000;
        }
        minBufferSize = AudioTrack.getMinBufferSize(i, i5, i4);
        if (minBufferSize != -2) {
            z3 = true;
        } else {
            z3 = false;
        }
        ki0.m3864h(z3);
        if (iM7245s != -1) {
            i7 = iM7245s;
        } else {
            i7 = 1;
        }
        if (z) {
            d = 8.0d;
        } else {
            d = 1.0d;
        }
        this.f10633n.getClass();
        if (i3 != 0) {
            i2 = i2;
            long j3 = i;
            long j4 = i7;
            iM7233g = z42.m7233g(minBufferSize * 4, rc2.m5793l(((250000 * j3) * j4) / 1000000), rc2.m5793l(((750000 * j3) * j4) / 1000000));
        } else if (i3 != 1) {
            iM7233g = rc2.m5793l((50000000 * ((long) k50.m3795u(i4))) / 1000000);
        } else {
            if (i3 == 2) {
                l41.m4049r();
                return;
            }
            if (i4 == 5) {
                i8 = 500000;
            } else if (i4 == 8) {
                i8 = 1000000;
            } else {
                i8 = 250000;
            }
            if (i6 != -1) {
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                iM3795u = hp0.m3220o(i6, 8);
            } else {
                iM3795u = k50.m3795u(i4);
            }
            iM7233g = rc2.m5793l((((long) i8) * ((long) iM3795u)) / 1000000);
        }
        int iMax2 = (((Math.max(minBufferSize, (int) (((double) iM7233g) * d)) + i7) - 1) / i7) * i7;
        this.f10618d0 = false;
        c1125my = new C1125my(be0Var, i2, i3, iM7245s, i, i5, i4, iMax2, c0785jc, z, z2, this.f10612a0);
        if (m6160o()) {
            this.f10638s = c1125my;
        } else {
            this.f10639t = c1125my;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b4  */
    /* JADX INFO: renamed from: e */
    public final void m6150e(long j) throws Exception {
        int iWrite;
        pn0 pn0Var;
        g80 g80Var;
        boolean z;
        C1312py c1312py = this.f10632m;
        if (this.f10602R == null) {
            return;
        }
        boolean z2 = false;
        if (c1312py.f9226a != null) {
            synchronized (f10582j0) {
                z = f10584l0 > 0;
            }
            if (z || SystemClock.elapsedRealtime() < c1312py.f9228c) {
                return;
            }
        }
        int iRemaining = this.f10602R.remaining();
        if (this.f10612a0) {
            ki0.m3864h(j != -9223372036854775807L);
            if (j == Long.MIN_VALUE) {
                j = this.f10614b0;
            } else {
                this.f10614b0 = j;
            }
            AudioTrack audioTrack = this.f10641v;
            ByteBuffer byteBuffer = this.f10602R;
            if (z42.f13274a >= 26) {
                iWrite = audioTrack.write(byteBuffer, iRemaining, 1, 1000 * j);
            } else {
                if (this.f10589E == null) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                    this.f10589E = byteBufferAllocate;
                    byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                    this.f10589E.putInt(1431633921);
                }
                if (this.f10590F == 0) {
                    this.f10589E.putInt(4, iRemaining);
                    this.f10589E.putLong(8, j * 1000);
                    this.f10589E.position(0);
                    this.f10590F = iRemaining;
                }
                int iRemaining2 = this.f10589E.remaining();
                if (iRemaining2 <= 0) {
                    iWrite = audioTrack.write(byteBuffer, iRemaining, 1);
                    if (iWrite < 0) {
                        this.f10590F = 0;
                    } else {
                        this.f10590F -= iWrite;
                    }
                } else {
                    int iWrite2 = audioTrack.write(this.f10589E, iRemaining2, 1);
                    if (iWrite2 < 0) {
                        this.f10590F = 0;
                        iWrite = iWrite2;
                    } else if (iWrite2 < iRemaining2) {
                        iWrite = 0;
                    } else {
                        iWrite = audioTrack.write(byteBuffer, iRemaining, 1);
                        if (iWrite < 0) {
                            this.f10590F = 0;
                        } else {
                            this.f10590F -= iWrite;
                        }
                    }
                }
            }
        } else {
            iWrite = this.f10641v.write(this.f10602R, iRemaining, 1);
        }
        this.f10616c0 = SystemClock.elapsedRealtime();
        if (iWrite < 0) {
            if ((z42.f13274a >= 24 && iWrite == -6) || iWrite == -32) {
                if (m6156k() > 0) {
                    z2 = true;
                } else if (m6145p(this.f10641v)) {
                    if (this.f10639t.f7133c == 1) {
                        this.f10618d0 = true;
                    }
                    z2 = true;
                }
            }
            C1438tc c1438tc = new C1438tc(iWrite, this.f10639t.f7131a, z2);
            pn0 pn0Var2 = this.f10637r;
            if (pn0Var2 != null) {
                pn0Var2.m5290l(c1438tc);
            }
            if (c1438tc.f10824b) {
                this.f10642w = C1659zb.f13327c;
                throw c1438tc;
            }
            c1312py.m5379a(c1438tc);
            return;
        }
        c1312py.f9226a = null;
        c1312py.f9227b = -9223372036854775807L;
        c1312py.f9228c = -9223372036854775807L;
        if (m6145p(this.f10641v)) {
            if (this.f10594J > 0) {
                this.f10620e0 = false;
            }
            if (this.f10606V && (pn0Var = this.f10637r) != null && iWrite < iRemaining && !this.f10620e0 && (g80Var = ((a11) pn0Var.f8968a).f3965K) != null) {
                g80Var.f4099a.f6227Q = true;
            }
        }
        int i = this.f10639t.f7133c;
        if (i == 0) {
            this.f10593I += (long) iWrite;
        }
        if (iWrite == iRemaining) {
            if (i != 0) {
                ki0.m3864h(this.f10602R == this.f10600P);
                this.f10594J = (((long) this.f10595K) * ((long) this.f10601Q)) + this.f10594J;
            }
            this.f10602R = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0044 A[RETURN] */
    /* JADX INFO: renamed from: f */
    public final boolean m6151f() throws Exception {
        ByteBuffer byteBuffer;
        if (!this.f10640u.m3595d()) {
            m6150e(Long.MIN_VALUE);
            if (this.f10602R == null) {
                return true;
            }
            return false;
        }
        C0785jc c0785jc = this.f10640u;
        if (c0785jc.m3595d() && !c0785jc.f5359d) {
            c0785jc.f5359d = true;
            ((InterfaceC1103mc) c0785jc.f5357b.get(0)).mo2128d();
        }
        m6164t(Long.MIN_VALUE);
        if (!this.f10640u.m3594c() || ((byteBuffer = this.f10602R) != null && byteBuffer.hasRemaining())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m6152g() {
        C1174o9 c1174o9;
        if (m6160o()) {
            this.f10591G = 0L;
            this.f10592H = 0L;
            this.f10593I = 0L;
            this.f10594J = 0L;
            this.f10620e0 = false;
            this.f10595K = 0;
            this.f10586B = new C1162ny(this.f10587C, 0L, 0L);
            this.f10598N = 0L;
            this.f10585A = null;
            this.f10625h.clear();
            this.f10600P = null;
            this.f10601Q = 0;
            this.f10602R = null;
            this.f10604T = false;
            this.f10603S = false;
            this.f10605U = false;
            this.f10589E = null;
            this.f10590F = 0;
            this.f10617d.f3188o = 0L;
            C0785jc c0785jc = this.f10639t.f7139i;
            this.f10640u = c0785jc;
            c0785jc.m3592a();
            AudioTrack audioTrack = this.f10623g.f12531c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f10641v.pause();
            }
            if (m6145p(this.f10641v)) {
                C1174o9 c1174o10 = this.f10630k;
                c1174o10.getClass();
                this.f10641v.unregisterStreamEventCallback((C1386ry) c1174o10.f7700c);
                ((Handler) c1174o10.f7699b).removeCallbacksAndMessages(null);
            }
            C0662g2 c0662g2M4484a = this.f10639t.m4484a();
            C1125my c1125my = this.f10638s;
            if (c1125my != null) {
                this.f10639t = c1125my;
                this.f10638s = null;
            }
            C1586xc c1586xc = this.f10623g;
            c1586xc.m6911d();
            c1586xc.f12531c = null;
            c1586xc.f12533e = null;
            if (z42.f13274a >= 24 && (c1174o9 = this.f10644y) != null) {
                AudioTrack audioTrack2 = (AudioTrack) c1174o9.f7699b;
                C1275oy c1275oy = (C1275oy) c1174o9.f7701d;
                c1275oy.getClass();
                audioTrack2.removeOnRoutingChangedListener(c1275oy);
                c1174o9.f7701d = null;
                this.f10644y = null;
            }
            AudioTrack audioTrack3 = this.f10641v;
            pn0 pn0Var = this.f10637r;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f10582j0) {
                try {
                    if (f10583k0 == null) {
                        f10583k0 = Executors.newSingleThreadScheduledExecutor(new ac0(2));
                    }
                    f10584l0++;
                    f10583k0.schedule(new RunnableC1051ky(audioTrack3, pn0Var, handler, c0662g2M4484a, 0), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f10641v = null;
        }
        C1312py c1312py = this.f10632m;
        c1312py.f9226a = null;
        c1312py.f9227b = -9223372036854775807L;
        c1312py.f9228c = -9223372036854775807L;
        C1312py c1312py2 = this.f10631l;
        c1312py2.f9226a = null;
        c1312py2.f9227b = -9223372036854775807L;
        c1312py2.f9228c = -9223372036854775807L;
        this.f10624g0 = 0L;
        this.f10626h0 = 0L;
        Handler handler2 = this.f10628i0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: h */
    public final C0746ic m6153h(be0 be0Var) {
        boolean zBooleanValue;
        if (this.f10618d0) {
            return C0746ic.f4929d;
        }
        C1474ub c1474ub = this.f10645z;
        C0558d8 c0558d8 = this.f10634o;
        c0558d8.getClass();
        be0Var.getClass();
        int i = be0Var.f1318D;
        c1474ub.getClass();
        int i2 = z42.f13274a;
        if (i2 < 29 || i == -1) {
            return C0746ic.f4929d;
        }
        RewardedVideoActivity rewardedVideoActivity = (RewardedVideoActivity) c0558d8.f2821b;
        Boolean bool = (Boolean) c0558d8.f2822c;
        boolean z = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            AudioManager audioManager = (AudioManager) rewardedVideoActivity.getSystemService("audio");
            if (audioManager != null) {
                String parameters = audioManager.getParameters("offloadVariableRateSupported");
                c0558d8.f2822c = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                c0558d8.f2822c = Boolean.FALSE;
            }
            zBooleanValue = ((Boolean) c0558d8.f2822c).booleanValue();
        }
        String str = be0Var.f1341n;
        str.getClass();
        int iM6572b = v51.m6572b(str, be0Var.f1338k);
        if (iM6572b == 0 || i2 < z42.m7238l(iM6572b)) {
            return C0746ic.f4929d;
        }
        int iM7240n = z42.m7240n(be0Var.f1317C);
        if (iM7240n == 0) {
            return C0746ic.f4929d;
        }
        try {
            AudioFormat audioFormatM7239m = z42.m7239m(i, iM7240n, iM6572b);
            if (i2 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatM7239m, (AudioAttributes) c1474ub.m6482a().f1096b)) {
                    return C0746ic.f4929d;
                }
                C0709hc c0709hc = new C0709hc();
                c0709hc.f4519a = true;
                c0709hc.f4521c = zBooleanValue;
                return c0709hc.m3125a();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatM7239m, (AudioAttributes) c1474ub.m6482a().f1096b);
            if (playbackOffloadSupport == 0) {
                return C0746ic.f4929d;
            }
            C0709hc c0709hc2 = new C0709hc();
            if (i2 > 32 && playbackOffloadSupport == 2) {
                z = true;
            }
            c0709hc2.f4519a = true;
            c0709hc2.f4520b = z;
            c0709hc2.f4521c = zBooleanValue;
            return c0709hc2.m3125a();
        } catch (IllegalArgumentException unused) {
            return C0746ic.f4929d;
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m6154i(be0 be0Var) {
        m6161q();
        String str = be0Var.f1341n;
        int i = be0Var.f1319E;
        if ("audio/raw".equals(str)) {
            if (!z42.m7213A(i)) {
                jd0.m3621s(i, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            }
            if (i != 2) {
                return 1;
            }
        } else if (this.f10642w.m7298d(this.f10645z, be0Var) == null) {
            return 0;
        }
        return 2;
    }

    /* JADX INFO: renamed from: j */
    public final long m6155j() {
        C1125my c1125my = this.f10639t;
        return c1125my.f7133c == 0 ? this.f10591G / ((long) c1125my.f7132b) : this.f10592H;
    }

    /* JADX INFO: renamed from: k */
    public final long m6156k() {
        C1125my c1125my = this.f10639t;
        if (c1125my.f7133c != 0) {
            return this.f10594J;
        }
        long j = this.f10593I;
        long j2 = c1125my.f7134d;
        int i = z42.f13274a;
        return ((j + j2) - 1) / j2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x018b  */
    /* JADX WARN: Code duplicated, block: B:102:0x0190  */
    /* JADX WARN: Code duplicated, block: B:104:0x0195  */
    /* JADX WARN: Code duplicated, block: B:106:0x019f  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:108:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:110:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:115:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ed A[LOOP:0: B:111:0x01ce->B:119:0x01ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:122:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:123:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:125:0x020b  */
    /* JADX WARN: Code duplicated, block: B:126:0x020d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0215  */
    /* JADX WARN: Code duplicated, block: B:130:0x0218  */
    /* JADX WARN: Code duplicated, block: B:132:0x022b  */
    /* JADX WARN: Code duplicated, block: B:133:0x022f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0240  */
    /* JADX WARN: Code duplicated, block: B:139:0x024a  */
    /* JADX WARN: Code duplicated, block: B:141:0x024f  */
    /* JADX WARN: Code duplicated, block: B:162:0x027f  */
    /* JADX WARN: Code duplicated, block: B:163:0x0282  */
    /* JADX WARN: Code duplicated, block: B:165:0x0286  */
    /* JADX WARN: Code duplicated, block: B:168:0x0296  */
    /* JADX WARN: Code duplicated, block: B:171:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:173:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:176:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:195:0x033d  */
    /* JADX WARN: Code duplicated, block: B:197:0x0344  */
    /* JADX WARN: Code duplicated, block: B:198:0x0346  */
    /* JADX WARN: Code duplicated, block: B:200:0x0352 A[LOOP:1: B:199:0x0350->B:200:0x0352, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:203:0x0365 A[LOOP:2: B:202:0x0363->B:203:0x0365, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:207:0x0386  */
    /* JADX WARN: Code duplicated, block: B:208:0x038c  */
    /* JADX WARN: Code duplicated, block: B:215:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:218:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:219:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:221:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:225:0x03de  */
    /* JADX WARN: Code duplicated, block: B:229:0x0402  */
    /* JADX WARN: Code duplicated, block: B:232:0x0409  */
    /* JADX WARN: Code duplicated, block: B:234:0x041a  */
    /* JADX WARN: Code duplicated, block: B:239:0x042a  */
    /* JADX WARN: Code duplicated, block: B:240:0x0435  */
    /* JADX WARN: Code duplicated, block: B:242:0x0443  */
    /* JADX WARN: Code duplicated, block: B:244:0x044e  */
    /* JADX WARN: Code duplicated, block: B:246:0x0455  */
    /* JADX WARN: Code duplicated, block: B:248:0x045f  */
    /* JADX WARN: Code duplicated, block: B:252:0x0475  */
    /* JADX WARN: Code duplicated, block: B:255:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:67:0x0107 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0109  */
    /* JADX WARN: Code duplicated, block: B:70:0x010c  */
    /* JADX WARN: Code duplicated, block: B:71:0x010e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0122 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x0138  */
    /* JADX WARN: Code duplicated, block: B:82:0x014e  */
    /* JADX WARN: Code duplicated, block: B:85:0x015e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0166  */
    /* JADX WARN: Code duplicated, block: B:88:0x0168  */
    /* JADX WARN: Code duplicated, block: B:92:0x0174  */
    /* JADX WARN: Code duplicated, block: B:94:0x017a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0185  */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x039c, code lost:
    
        if (r13 == 0) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0114, code lost:
    
        if (r9.m6909b() == 0) goto L12;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:225:0x03de, please report this as an issue */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m6157l(java.nio.ByteBuffer r28, long r29, int r31) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1423sy.m6157l(java.nio.ByteBuffer, long, int):boolean");
    }

    /* JADX INFO: renamed from: m */
    public final boolean m6158m() {
        if (m6160o()) {
            return !(z42.f13274a >= 29 && this.f10641v.isOffloadedPlayback() && this.f10605U) && this.f10623g.m6910c(m6156k());
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0198  */
    /* JADX WARN: Code duplicated, block: B:91:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: n */
    public final boolean m6159n() throws C1364rc {
        AudioTrack audioTrackM6148c;
        C0130cc c0130cc;
        ye1 ye1Var;
        boolean z;
        C1312py c1312py = this.f10631l;
        int i = 1;
        if (c1312py.f9226a != null) {
            synchronized (f10582j0) {
                z = f10584l0 > 0;
            }
            if (z || SystemClock.elapsedRealtime() < c1312py.f9228c) {
                return false;
            }
        }
        try {
            C1125my c1125my = this.f10639t;
            c1125my.getClass();
            audioTrackM6148c = m6148c(c1125my);
        } catch (C1364rc e) {
            C1125my c1125my2 = this.f10639t;
            if (c1125my2.f7138h > 1000000) {
                C1125my c1125my3 = new C1125my(c1125my2.f7131a, c1125my2.f7132b, c1125my2.f7133c, c1125my2.f7134d, c1125my2.f7135e, c1125my2.f7136f, c1125my2.f7137g, 1000000, c1125my2.f7139i, c1125my2.f7140j, c1125my2.f7141k, c1125my2.f7142l);
                try {
                    audioTrackM6148c = m6148c(c1125my3);
                    this.f10639t = c1125my3;
                } catch (C1364rc e2) {
                    e.addSuppressed(e2);
                    if (this.f10639t.f7133c == 1) {
                        throw e;
                    }
                    this.f10618d0 = true;
                    throw e;
                }
            }
            if (this.f10639t.f7133c == 1) {
                throw e;
            }
            this.f10618d0 = true;
            throw e;
        }
        this.f10641v = audioTrackM6148c;
        if (m6145p(audioTrackM6148c)) {
            AudioTrack audioTrack = this.f10641v;
            if (this.f10630k == null) {
                this.f10630k = new C1174o9(this);
            }
            C1174o9 c1174o9 = this.f10630k;
            Handler handler = (Handler) c1174o9.f7699b;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new ExecutorC1349qy(handler, 0), (C1386ry) c1174o9.f7700c);
            C1125my c1125my4 = this.f10639t;
            if (c1125my4.f7141k) {
                AudioTrack audioTrack2 = this.f10641v;
                be0 be0Var = c1125my4.f7131a;
                audioTrack2.setOffloadDelayPadding(be0Var.f1320F, be0Var.f1321G);
            }
        }
        int i2 = z42.f13274a;
        if (i2 >= 31 && (ye1Var = this.f10636q) != null) {
            AudioTrack audioTrack3 = this.f10641v;
            xe1 xe1Var = ye1Var.f12970b;
            xe1Var.getClass();
            LogSessionId logSessionId = xe1Var.f12593a;
            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
            if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                audioTrack3.setLogSessionId(logSessionId);
            }
        }
        this.f10608X = this.f10641v.getAudioSessionId();
        C1586xc c1586xc = this.f10623g;
        AudioTrack audioTrack4 = this.f10641v;
        C1125my c1125my5 = this.f10639t;
        boolean z2 = c1125my5.f7133c == 2;
        int i3 = c1125my5.f7137g;
        int i4 = c1125my5.f7134d;
        int i5 = c1125my5.f7138h;
        c1586xc.f12531c = audioTrack4;
        c1586xc.f12532d = i5;
        c1586xc.f12533e = new C1549wc(audioTrack4);
        c1586xc.f12534f = audioTrack4.getSampleRate();
        c1586xc.f12535g = z2 && i2 < 23 && (i3 == 5 || i3 == 6);
        boolean zM7213A = z42.m7213A(i3);
        c1586xc.f12544p = zM7213A;
        c1586xc.f12536h = zM7213A ? z42.m7220H(c1586xc.f12534f, i5 / i4) : -9223372036854775807L;
        c1586xc.f12547s = 0L;
        c1586xc.f12548t = 0L;
        c1586xc.f12526G = false;
        c1586xc.f12527H = 0L;
        c1586xc.f12549u = 0L;
        c1586xc.f12543o = false;
        c1586xc.f12552x = -9223372036854775807L;
        c1586xc.f12553y = -9223372036854775807L;
        c1586xc.f12545q = 0L;
        c1586xc.f12542n = 0L;
        c1586xc.f12537i = 1.0f;
        if (m6160o()) {
            this.f10641v.setVolume(this.f10599O);
        }
        this.f10609Y.getClass();
        ay0 ay0Var = this.f10610Z;
        if (ay0Var != null && i2 >= 23) {
            this.f10641v.setPreferredDevice((AudioDeviceInfo) ay0Var.f1096b);
            C0130cc c0130cc2 = this.f10643x;
            if (c0130cc2 != null) {
                c0130cc2.m1210b((AudioDeviceInfo) this.f10610Z.f1096b);
            }
        }
        if (i2 >= 24 && (c0130cc = this.f10643x) != null) {
            this.f10644y = new C1174o9(this.f10641v, c0130cc);
        }
        this.f10597M = true;
        pn0 pn0Var = this.f10637r;
        if (pn0Var != null) {
            C0662g2 c0662g2M4484a = this.f10639t.m4484a();
            C1290pc c1290pc = ((a11) pn0Var.f8968a).f11I0;
            Handler handler2 = c1290pc.f8839a;
            if (handler2 != null) {
                handler2.post(new RunnableC1140nc(c1290pc, c0662g2M4484a, i));
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m6160o() {
        return this.f10641v != null;
    }

    /* JADX INFO: renamed from: q */
    public final void m6161q() {
        C1659zb c1659zb;
        C0013ac c0013ac;
        if (this.f10643x == null) {
            this.f10622f0 = Looper.myLooper();
            C0130cc c0130cc = new C0130cc(this.f10611a, new C1521vl(this, 6), this.f10645z, this.f10610Z);
            this.f10643x = c0130cc;
            if (c0130cc.f1754j) {
                c1659zb = c0130cc.f1751g;
                c1659zb.getClass();
            } else {
                c0130cc.f1754j = true;
                C0094bc c0094bc = c0130cc.f1750f;
                if (c0094bc != null) {
                    c0094bc.f1286a.registerContentObserver(c0094bc.f1287b, false, c0094bc);
                }
                int i = z42.f13274a;
                Handler handler = c0130cc.f1747c;
                Context context = c0130cc.f1745a;
                if (i >= 23 && (c0013ac = c0130cc.f1748d) != null) {
                    AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                    audioManager.getClass();
                    audioManager.registerAudioDeviceCallback(c0013ac, handler);
                }
                C1659zb c1659zbM7297c = C1659zb.m7297c(context, context.registerReceiver(c0130cc.f1749e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), c0130cc.f1753i, c0130cc.f1752h);
                c0130cc.f1751g = c1659zbM7297c;
                c1659zb = c1659zbM7297c;
            }
            this.f10642w = c1659zb;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m6162r() {
        this.f10606V = true;
        if (m6160o()) {
            C1586xc c1586xc = this.f10623g;
            if (c1586xc.f12552x != -9223372036854775807L) {
                c1586xc.f12528I.getClass();
                c1586xc.f12552x = z42.m7216D(SystemClock.elapsedRealtime());
            }
            C1549wc c1549wc = c1586xc.f12533e;
            c1549wc.getClass();
            c1549wc.m6748a();
            this.f10641v.play();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m6163s() {
        if (this.f10604T) {
            return;
        }
        this.f10604T = true;
        long jM6156k = m6156k();
        C1586xc c1586xc = this.f10623g;
        c1586xc.f12554z = c1586xc.m6909b();
        c1586xc.f12528I.getClass();
        c1586xc.f12552x = z42.m7216D(SystemClock.elapsedRealtime());
        c1586xc.f12520A = jM6156k;
        if (m6145p(this.f10641v)) {
            this.f10605U = false;
        }
        this.f10641v.stop();
        this.f10590F = 0;
    }

    /* JADX INFO: renamed from: t */
    public final void m6164t(long j) throws Exception {
        ByteBuffer byteBuffer;
        m6150e(j);
        if (this.f10602R != null) {
            return;
        }
        if (!this.f10640u.m3595d()) {
            ByteBuffer byteBuffer2 = this.f10600P;
            if (byteBuffer2 != null) {
                m6167w(byteBuffer2);
                m6150e(j);
                return;
            }
            return;
        }
        while (!this.f10640u.m3594c()) {
            do {
                C0785jc c0785jc = this.f10640u;
                if (c0785jc.m3595d()) {
                    ByteBuffer byteBuffer3 = c0785jc.f5358c[c0785jc.m3593b()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        c0785jc.m3596e(InterfaceC1103mc.f6750a);
                        byteBuffer = c0785jc.f5358c[c0785jc.m3593b()];
                    }
                } else {
                    byteBuffer = InterfaceC1103mc.f6750a;
                }
                if (byteBuffer.hasRemaining()) {
                    m6167w(byteBuffer);
                    m6150e(j);
                } else {
                    ByteBuffer byteBuffer4 = this.f10600P;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    C0785jc c0785jc2 = this.f10640u;
                    ByteBuffer byteBuffer5 = this.f10600P;
                    if (c0785jc2.m3595d() && !c0785jc2.f5359d) {
                        c0785jc2.m3596e(byteBuffer5);
                    }
                }
            } while (this.f10602R == null);
            return;
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m6165u() {
        m6152g();
        om0 om0VarListIterator = this.f10619e.listIterator(0);
        while (om0VarListIterator.hasNext()) {
            ((InterfaceC1103mc) om0VarListIterator.next()).reset();
        }
        om0 om0VarListIterator2 = this.f10621f.listIterator(0);
        while (om0VarListIterator2.hasNext()) {
            ((InterfaceC1103mc) om0VarListIterator2.next()).reset();
        }
        C0785jc c0785jc = this.f10640u;
        if (c0785jc != null) {
            qm0 qm0Var = c0785jc.f5356a;
            for (int i = 0; i < qm0Var.size(); i++) {
                InterfaceC1103mc interfaceC1103mc = (InterfaceC1103mc) qm0Var.get(i);
                interfaceC1103mc.flush();
                interfaceC1103mc.reset();
            }
            c0785jc.f5358c = new ByteBuffer[0];
            C0823kc c0823kc = C0823kc.f5741e;
            c0785jc.f5359d = false;
        }
        this.f10606V = false;
        this.f10618d0 = false;
    }

    /* JADX INFO: renamed from: v */
    public final void m6166v() {
        if (m6160o()) {
            try {
                this.f10641v.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f10587C.f10844a).setPitch(this.f10587C.f10845b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                AbstractC1337qm.m5544j0("DefaultAudioSink", "Failed to set playback params", e);
            }
            td1 td1Var = new td1(this.f10641v.getPlaybackParams().getSpeed(), this.f10641v.getPlaybackParams().getPitch());
            this.f10587C = td1Var;
            float f = td1Var.f10844a;
            C1586xc c1586xc = this.f10623g;
            c1586xc.f12537i = f;
            C1549wc c1549wc = c1586xc.f12533e;
            if (c1549wc != null) {
                c1549wc.m6748a();
            }
            c1586xc.m6911d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    /* JADX WARN: Code duplicated, block: B:47:0x013f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0142  */
    /* JADX WARN: Code duplicated, block: B:51:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0147  */
    /* JADX WARN: Code duplicated, block: B:54:0x014b  */
    /* JADX WARN: Code duplicated, block: B:56:0x014f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0153  */
    /* JADX WARN: Code duplicated, block: B:60:0x0157  */
    /* JADX WARN: Code duplicated, block: B:63:0x0173  */
    /* JADX WARN: Code duplicated, block: B:64:0x0186  */
    /* JADX WARN: Code duplicated, block: B:65:0x0193  */
    /* JADX WARN: Code duplicated, block: B:66:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x01bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x016f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x01e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0057 A[SYNTHETIC] */
    /* JADX INFO: renamed from: w */
    public final void m6167w(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferOrder;
        int i;
        byte b;
        int i2;
        int i3;
        int i4;
        ki0.m3864h(this.f10602R == null);
        if (byteBuffer.hasRemaining()) {
            if (this.f10639t.f7133c != 0) {
                byteBufferOrder = byteBuffer;
            } else {
                int iM7222J = (int) z42.m7222J(z42.m7216D(20L), this.f10639t.f7135e, 1000000L, RoundingMode.UP);
                long jM6156k = m6156k();
                long j = iM7222J;
                if (jM6156k >= j) {
                    byteBufferOrder = byteBuffer;
                } else {
                    C1125my c1125my = this.f10639t;
                    int i5 = c1125my.f7137g;
                    int i6 = c1125my.f7134d;
                    int i7 = (int) jM6156k;
                    byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i7 < iM7222J) {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                i3 = (byteBuffer.get() & 255) << 24;
                            } else if (i5 == 4) {
                                float fM7232f = z42.m7232f(byteBuffer.getFloat(), -1.0f, 1.0f);
                                i3 = (int) (fM7232f < TouchPipeline.SIZE ? (-fM7232f) * (-2.14748365E9f) : fM7232f * 2.14748365E9f);
                            } else if (i5 != 21) {
                                if (i5 == 22) {
                                    i = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                    b = byteBuffer.get();
                                } else if (i5 == 268435456) {
                                    i = (byteBuffer.get() & 255) << 24;
                                    i2 = (byteBuffer.get() & 255) << 16;
                                } else if (i5 == 1342177280) {
                                    i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                                    i2 = (byteBuffer.get() & 255) << 8;
                                } else if (i5 != 1610612736) {
                                    l41.m4046o();
                                    return;
                                } else {
                                    i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                                    i2 = byteBuffer.get() & 255;
                                }
                                i3 = i | i2;
                            } else {
                                i = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b = byteBuffer.get();
                            }
                            i4 = (int) ((((long) i3) * ((long) i7)) / j);
                            if (i5 != 2) {
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 3) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 4) {
                                if (i5 != 21) {
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                } else if (i5 != 22) {
                                    byteBufferOrder.put((byte) i4);
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                } else if (i5 != 268435456) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                } else if (i5 != 1342177280) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                } else {
                                    if (i5 == 1610612736) {
                                        l41.m4046o();
                                        return;
                                    }
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) i4);
                                }
                            } else if (i4 < 0) {
                                byteBufferOrder.putFloat((-i4) / (-2.14748365E9f));
                            } else {
                                byteBufferOrder.putFloat(i4 / 2.14748365E9f);
                            }
                            if (byteBuffer.position() == iPosition + i6) {
                                i7++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            b = byteBuffer.get();
                        }
                        i2 = (b & 255) << 24;
                        i3 = i | i2;
                        i4 = (int) ((((long) i3) * ((long) i7)) / j);
                        if (i5 != 2) {
                            byteBufferOrder.put((byte) (i4 >> 16));
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i5 != 3) {
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i5 != 4) {
                            if (i5 != 21) {
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 22) {
                                byteBufferOrder.put((byte) i4);
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 268435456) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                            } else if (i5 != 1342177280) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                            } else {
                                if (i5 == 1610612736) {
                                    l41.m4046o();
                                    return;
                                }
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) i4);
                            }
                        } else if (i4 < 0) {
                            byteBufferOrder.putFloat((-i4) / (-2.14748365E9f));
                        } else {
                            byteBufferOrder.putFloat(i4 / 2.14748365E9f);
                        }
                        if (byteBuffer.position() == iPosition + i6) {
                            i7++;
                            iPosition = byteBuffer.position();
                        }
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                }
            }
            this.f10602R = byteBufferOrder;
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m6168x() {
        C1125my c1125my = this.f10639t;
        return c1125my != null && c1125my.f7140j && z42.f13274a >= 23;
    }
}

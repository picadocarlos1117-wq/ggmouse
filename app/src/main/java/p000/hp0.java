package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.location.LocationRequest;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hp0 {

    /* JADX INFO: renamed from: o */
    public static final pu0 f4651o;

    /* JADX INFO: renamed from: p */
    public static final ax0 f4652p;

    /* JADX INFO: renamed from: r */
    public static boolean f4654r = true;

    /* JADX INFO: renamed from: a */
    public static final int[] f4637a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b */
    public static final int[] f4638b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c */
    public static final int[] f4639c = {24000, 22050, 16000};

    /* JADX INFO: renamed from: d */
    public static final int[] f4640d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e */
    public static final int[] f4641e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, UserVerificationMethods.USER_VERIFY_NONE, 576, 640};

    /* JADX INFO: renamed from: f */
    public static final int[] f4642f = {69, 87, LocationRequest.PRIORITY_LOW_POWER, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: g */
    public static final String[] f4643g = {"standard", "accelerate", "decelerate", "linear"};

    /* JADX INFO: renamed from: h */
    public static final String[] f4644h = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: i */
    public static final int[] f4645i = {44100, 48000, 32000};

    /* JADX INFO: renamed from: j */
    public static final int[] f4646j = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: k */
    public static final int[] f4647k = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: l */
    public static final int[] f4648l = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: m */
    public static final int[] f4649m = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: n */
    public static final int[] f4650n = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: renamed from: q */
    public static final ax0 f4653q = new ax0(8);

    static {
        int i = 9;
        f4651o = new pu0(i);
        f4652p = new ax0(i);
    }

    public hp0() {
        new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: B */
    public static boolean m3193B(int i) {
        if (i == 0) {
            return false;
        }
        ThreadLocal threadLocal = AbstractC0539cq.f2590a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        if (dArr.length != 3) {
            f40.m2713i("outXyz must have a length of 3.");
            return false;
        }
        double d = ((double) iRed) / 255.0d;
        double dPow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = ((double) iGreen) / 255.0d;
        double dPow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = ((double) iBlue) / 255.0d;
        double dPow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d4 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d4;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d4 / 100.0d > 0.5d;
    }

    /* JADX INFO: renamed from: C */
    public static gc2 m3194C(C0599ed c0599ed, pn0 pn0Var, mr0 mr0Var) {
        int i;
        long j;
        double d;
        int i2;
        int i3;
        int i4;
        int iCeil = ((C0799jp) c0599ed.f3313a).f5484c;
        byte[][] bArrM4671n = o21.m4671n((byte[][]) pn0Var.f8968a);
        gc2[] gc2VarArr = new gc2[bArrM4671n.length];
        for (int i5 = 0; i5 < bArrM4671n.length; i5++) {
            gc2VarArr[i5] = new gc2(0, bArrM4671n[i5]);
        }
        lr0 lr0Var = new lr0(0);
        lr0Var.f12518c = mr0Var.f12516a;
        lr0Var.f12517b = mr0Var.f12517b;
        lr0Var.f6495e = mr0Var.f7082e;
        lr0Var.f6496f = 0;
        lr0Var.f6497g = mr0Var.f7084g;
        lr0Var.f12519d = mr0Var.f12519d;
        mr0 mr0Var2 = new mr0(lr0Var);
        while (iCeil > 1) {
            int i6 = 0;
            while (true) {
                i = mr0Var2.f12519d;
                j = mr0Var2.f12517b;
                d = iCeil / 2;
                int iFloor = (int) Math.floor(d);
                i2 = mr0Var2.f7083f;
                i3 = mr0Var2.f7082e;
                i4 = mr0Var2.f12516a;
                if (i6 >= iFloor) {
                    break;
                }
                lr0 lr0Var2 = new lr0(0);
                lr0Var2.f12518c = i4;
                lr0Var2.f12517b = j;
                lr0Var2.f6495e = i3;
                lr0Var2.f6496f = i2;
                lr0Var2.f6497g = i6;
                lr0Var2.f12519d = i;
                mr0 mr0Var3 = new mr0(lr0Var2);
                int i7 = i6 * 2;
                gc2VarArr[i6] = m3201J(c0599ed, gc2VarArr[i7], gc2VarArr[i7 + 1], mr0Var3);
                i6++;
                mr0Var2 = mr0Var3;
            }
            if (iCeil % 2 == 1) {
                gc2VarArr[(int) Math.floor(d)] = gc2VarArr[iCeil - 1];
            }
            iCeil = (int) Math.ceil(((double) iCeil) / 2.0d);
            lr0 lr0Var3 = new lr0(0);
            lr0Var3.f12518c = i4;
            lr0Var3.f12517b = j;
            lr0Var3.f6495e = i3;
            lr0Var3.f6496f = i2 + 1;
            lr0Var3.f6497g = mr0Var2.f7084g;
            lr0Var3.f12519d = i;
            mr0Var2 = new mr0(lr0Var3);
        }
        return gc2VarArr[0];
    }

    /* JADX INFO: renamed from: D */
    public static int m3195D(float f, int i, int i2) {
        return AbstractC0539cq.m2113b(AbstractC0539cq.m2115d(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    /* JADX INFO: renamed from: E */
    public static int m3196E(int i) {
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i <= 0) {
            f40.m2713i(jd0.m3610h(i, "x (", ") must be > 0"));
            return 0;
        }
        switch (zn0.f13495a[roundingMode.ordinal()]) {
            case 1:
                p32.m5191v((i > 0) & (((i + (-1)) & i) == 0));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - iNumberOfLeadingZeros) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros) - i))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    /* JADX INFO: renamed from: F */
    public static int m3197F(int i, int i2, int i3) {
        int iM3203M = m3203M(i, i3);
        int iM3203M2 = m3203M(i2, i3);
        int i4 = 0;
        if (iM3203M2 != 0) {
            int iM3219n = 1 << m3219n(i3);
            while (iM3203M != 0) {
                if (((byte) (iM3203M & 1)) == 1) {
                    i4 ^= iM3203M2;
                }
                iM3203M >>>= 1;
                iM3203M2 <<= 1;
                if (iM3203M2 >= iM3219n) {
                    iM3203M2 ^= i3;
                }
            }
        }
        return i4;
    }

    /* JADX INFO: renamed from: G */
    public static short[][] m3198G(short[][] sArr, short[][] sArr2) {
        if (sArr[0].length != sArr2.length) {
            l41.m4048q("Multiplication is not possible!");
            return null;
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2[0].length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr2.length; i2++) {
                for (int i3 = 0; i3 < sArr2[0].length; i3++) {
                    short s = (short) (th0.f10881a[sArr[i][i2]][sArr2[i2][i3]] & 255);
                    short[] sArr4 = sArr3[i];
                    sArr4[i3] = (short) (s ^ sArr4[i3]);
                }
            }
        }
        return sArr3;
    }

    /* JADX INFO: renamed from: H */
    public static short[][][] m3199H(short[][] sArr, short[][][] sArr2, short[][][] sArr3) {
        short[][] sArr4 = sArr2[0];
        int length = sArr4.length;
        short[][] sArr5 = sArr3[0];
        if (length == sArr5.length) {
            int length2 = sArr4[0].length;
            short[] sArr6 = sArr5[0];
            if (length2 == sArr6.length && sArr2.length == sArr[0].length && sArr3.length == sArr.length) {
                short[][][] sArr7 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, sArr3.length, sArr5.length, sArr6.length);
                for (int i = 0; i < sArr2[0].length; i++) {
                    for (int i2 = 0; i2 < sArr2[0][0].length; i2++) {
                        for (int i3 = 0; i3 < sArr.length; i3++) {
                            for (int i4 = 0; i4 < sArr[0].length; i4++) {
                                short s = (short) (th0.f10881a[sArr[i3][i4]][sArr2[i4][i][i2]] & 255);
                                short[] sArr8 = sArr7[i3][i];
                                sArr8[i2] = (short) (s ^ sArr8[i2]);
                            }
                            short[] sArr9 = sArr7[i3][i];
                            short s2 = sArr3[i3][i][i2];
                            short s3 = sArr9[i2];
                            byte[][] bArr = th0.f10881a;
                            sArr9[i2] = (short) (s2 ^ s3);
                        }
                    }
                }
                return sArr7;
            }
        }
        l41.m4048q("Multiplication not possible!");
        return null;
    }

    /* JADX INFO: renamed from: I */
    public static pn0 m3200I(byte[] bArr) {
        dc1 dc1Var = new dc1(bArr);
        if (dc1Var.f2884c < 32) {
            return null;
        }
        dc1Var.m2316F(0);
        int iM2318a = dc1Var.m2318a();
        int iM2324g = dc1Var.m2324g();
        if (iM2324g != iM2318a) {
            AbstractC1337qm.m5542i0("PsshAtomUtil", "Advertised atom size (" + iM2324g + ") does not match buffer size: " + iM2318a);
            return null;
        }
        int iM2324g2 = dc1Var.m2324g();
        if (iM2324g2 != 1886614376) {
            jd0.m3621s(iM2324g2, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int iM3647c = AbstractC0793jj.m3647c(dc1Var.m2324g());
        if (iM3647c > 1) {
            jd0.m3621s(iM3647c, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(dc1Var.m2331n(), dc1Var.m2331n());
        if (iM3647c == 1) {
            int iM2341x = dc1Var.m2341x();
            UUID[] uuidArr = new UUID[iM2341x];
            for (int i = 0; i < iM2341x; i++) {
                uuidArr[i] = new UUID(dc1Var.m2331n(), dc1Var.m2331n());
            }
        }
        int iM2341x2 = dc1Var.m2341x();
        int iM2318a2 = dc1Var.m2318a();
        if (iM2341x2 == iM2318a2) {
            dc1Var.m2322e(0, iM2341x2, new byte[iM2341x2]);
            pn0 pn0Var = new pn0();
            pn0Var.f8968a = uuid;
            return pn0Var;
        }
        AbstractC1337qm.m5542i0("PsshAtomUtil", "Atom data size (" + iM2341x2 + ") does not match the bytes left: " + iM2318a2);
        return null;
    }

    /* JADX INFO: renamed from: J */
    public static gc2 m3201J(C0599ed c0599ed, gc2 gc2Var, gc2 gc2Var2, xb2 xb2Var) {
        xb2 xj0Var = xb2Var;
        if (gc2Var == null) {
            l41.m4051t("left == null");
            return null;
        }
        int i = gc2Var.f4144a;
        if (gc2Var2 == null) {
            l41.m4051t("right == null");
            return null;
        }
        if (i != gc2Var2.f4144a) {
            f40.m2719o("height of both nodes must be equal");
            return null;
        }
        byte[] bArr = (byte[]) c0599ed.f3316d;
        k20 k20Var = (k20) c0599ed.f3314b;
        byte[] bArrM6061e = sc2.m6061e(bArr);
        if (xj0Var instanceof mr0) {
            mr0 mr0Var = (mr0) xj0Var;
            lr0 lr0Var = new lr0(0);
            lr0Var.f12518c = mr0Var.f12516a;
            lr0Var.f12517b = mr0Var.f12517b;
            lr0Var.f6495e = mr0Var.f7082e;
            lr0Var.f6496f = mr0Var.f7083f;
            lr0Var.f6497g = mr0Var.f7084g;
            lr0Var.f12519d = 0;
            xj0Var = new mr0(lr0Var);
        } else if (xj0Var instanceof xj0) {
            xj0 xj0Var2 = (xj0) xj0Var;
            wj0 wj0Var = new wj0();
            wj0Var.f12518c = xj0Var2.f12516a;
            wj0Var.f12517b = xj0Var2.f12517b;
            wj0Var.f12191e = xj0Var2.f12621e;
            wj0Var.f12192f = xj0Var2.f12622f;
            wj0Var.f12519d = 0;
            xj0Var = new xj0(wj0Var);
        }
        byte[] bArrM3752a = k20Var.m3752a(bArrM6061e, xj0Var.mo3113a());
        if (xj0Var instanceof mr0) {
            mr0 mr0Var2 = (mr0) xj0Var;
            lr0 lr0Var2 = new lr0(0);
            lr0Var2.f12518c = mr0Var2.f12516a;
            lr0Var2.f12517b = mr0Var2.f12517b;
            lr0Var2.f6495e = mr0Var2.f7082e;
            lr0Var2.f6496f = mr0Var2.f7083f;
            lr0Var2.f6497g = mr0Var2.f7084g;
            lr0Var2.f12519d = 1;
            xj0Var = new mr0(lr0Var2);
        } else if (xj0Var instanceof xj0) {
            xj0 xj0Var3 = (xj0) xj0Var;
            wj0 wj0Var2 = new wj0();
            wj0Var2.f12518c = xj0Var3.f12516a;
            wj0Var2.f12517b = xj0Var3.f12517b;
            wj0Var2.f12191e = xj0Var3.f12621e;
            wj0Var2.f12192f = xj0Var3.f12622f;
            wj0Var2.f12519d = 1;
            xj0Var = new xj0(wj0Var2);
        }
        byte[] bArrM3752a2 = k20Var.m3752a(bArrM6061e, xj0Var.mo3113a());
        if (xj0Var instanceof mr0) {
            mr0 mr0Var3 = (mr0) xj0Var;
            lr0 lr0Var3 = new lr0(0);
            lr0Var3.f12518c = mr0Var3.f12516a;
            lr0Var3.f12517b = mr0Var3.f12517b;
            lr0Var3.f6495e = mr0Var3.f7082e;
            lr0Var3.f6496f = mr0Var3.f7083f;
            lr0Var3.f6497g = mr0Var3.f7084g;
            lr0Var3.f12519d = 2;
            xj0Var = new mr0(lr0Var3);
        } else if (xj0Var instanceof xj0) {
            xj0 xj0Var4 = (xj0) xj0Var;
            wj0 wj0Var3 = new wj0();
            wj0Var3.f12518c = xj0Var4.f12516a;
            wj0Var3.f12517b = xj0Var4.f12517b;
            wj0Var3.f12191e = xj0Var4.f12621e;
            wj0Var3.f12192f = xj0Var4.f12622f;
            wj0Var3.f12519d = 2;
            xj0Var = new xj0(wj0Var3);
        }
        byte[] bArrM3752a3 = k20Var.m3752a(bArrM6061e, xj0Var.mo3113a());
        int i2 = ((C0799jp) c0599ed.f3313a).f5482a;
        int i3 = i2 * 2;
        byte[] bArr2 = new byte[i3];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i4] = (byte) (o21.m4669m(gc2Var.f4145b)[i4] ^ bArrM3752a2[i4]);
        }
        for (int i5 = 0; i5 < i2; i5++) {
            bArr2[i5 + i2] = (byte) (o21.m4669m(gc2Var2.f4145b)[i5] ^ bArrM3752a3[i5]);
        }
        int length = bArrM3752a.length;
        int i6 = k20Var.f5634b;
        if (length != i6) {
            f40.m2713i("wrong key length");
            return null;
        }
        if (i3 == i6 * 2) {
            return new gc2(i, k20Var.m3753d(1, bArrM3752a, bArr2));
        }
        f40.m2713i("wrong in length");
        return null;
    }

    /* JADX INFO: renamed from: L */
    public static ye1 m3202L(Context context, f80 f80Var, boolean z, String str) {
        MediaMetricsManager mediaMetricsManagerM6889h = AbstractC1585xb.m6889h(context.getSystemService("media_metrics"));
        h21 h21Var = mediaMetricsManagerM6889h == null ? null : new h21(context, mediaMetricsManagerM6889h.createPlaybackSession());
        if (h21Var == null) {
            AbstractC1337qm.m5542i0("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new ye1(LogSessionId.LOG_SESSION_ID_NONE, str);
        }
        if (z) {
            C0808jy c0808jy = f80Var.f3710r;
            c0808jy.getClass();
            c0808jy.f5593f.m710a(h21Var);
        }
        return new ye1(h21Var.f4399c.getSessionId(), str);
    }

    /* JADX INFO: renamed from: M */
    public static int m3203M(int i, int i2) {
        if (i2 == 0) {
            System.err.println("Error: to be divided by 0");
            return 0;
        }
        while (m3219n(i) >= m3219n(i2)) {
            i ^= i2 << (m3219n(i) - m3219n(i2));
        }
        return i;
    }

    /* JADX INFO: renamed from: N */
    public static void m3204N(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    /* JADX INFO: renamed from: O */
    public static void m3205O(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else if (f4654r) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f4654r = false;
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public static void m3206P() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* JADX INFO: renamed from: Q */
    public static void m3207Q(String str) {
        C0656fx c0656fx = new C0656fx(jd0.m3615m("lateinit property ", str, " has not been initialized"));
        m3204N(c0656fx, hp0.class.getName());
        throw c0656fx;
    }

    /* JADX INFO: renamed from: R */
    public static final long m3208R(long j, t40 t40Var) {
        TimeUnit timeUnit = t40Var.f10745a;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-jConvert) > j || j > jConvert) {
            return m3221p(p32.m5141G(TimeUnit.MILLISECONDS.convert(j, timeUnit)));
        }
        long jConvert2 = timeUnit2.convert(j, timeUnit) << 1;
        int i = r40.f9718c;
        int i2 = s40.f10216a;
        return jConvert2;
    }

    /* JADX INFO: renamed from: S */
    public static short[][] m3209S(short[][] sArr) {
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr[0].length, sArr.length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                sArr2[i2][i] = sArr[i][i2];
            }
        }
        return sArr2;
    }

    /* JADX INFO: renamed from: a */
    public static short[][] m3210a(short[][] sArr, short[][] sArr2) {
        if (sArr.length == sArr2.length) {
            short[] sArr3 = sArr[0];
            if (sArr3.length == sArr2[0].length) {
                short[][] sArr4 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr3.length);
                for (int i = 0; i < sArr.length; i++) {
                    for (int i2 = 0; i2 < sArr[0].length; i2++) {
                        short[] sArr5 = sArr4[i];
                        short s = sArr[i][i2];
                        short s2 = sArr2[i][i2];
                        byte[][] bArr = th0.f10881a;
                        sArr5[i2] = (short) (s ^ s2);
                    }
                }
                return sArr4;
            }
        }
        l41.m4048q("Addition is not possible!");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static short[][] m3211b(short[][] sArr) {
        if (sArr.length == sArr[0].length) {
            return m3210a(sArr, m3209S(sArr));
        }
        l41.m4048q("Addition is not possible!");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static void m3212c(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    /* JADX WARN: Code duplicated, block: B:189:0x028c  */
    /* JADX WARN: Code duplicated, block: B:206:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:208:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:210:0x02de  */
    /* JADX WARN: Code duplicated, block: B:233:0x0370  */
    /* JADX WARN: Code duplicated, block: B:235:0x038c  */
    /* JADX WARN: Code duplicated, block: B:237:0x0391  */
    /* JADX WARN: Code duplicated, block: B:241:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:251:0x0422  */
    /* JADX WARN: Code duplicated, block: B:409:0x0698  */
    /* JADX WARN: Code duplicated, block: B:412:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:413:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:416:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:417:0x06af  */
    /* JADX WARN: Code duplicated, block: B:419:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:421:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:424:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:426:0x06c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:436:0x06e3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:75:0x0114  */
    /* JADX INFO: renamed from: d */
    public static void m3213d(C1676zs c1676zs, xs0 xs0Var, ArrayList arrayList, int i) {
        int i2;
        C0755im[] c0755imArr;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        int i5;
        C1639ys c1639ys;
        xs0 xs0Var2;
        C1639ys c1639ys2;
        au1 au1Var;
        C1082ls c1082ls;
        au1 au1Var2;
        C1639ys c1639ys3;
        int i6;
        C1082ls[] c1082lsArr;
        C1082ls c1082ls2;
        au1 au1Var3;
        int i7;
        C1082ls[] c1082lsArr2;
        int i8;
        C1082ls c1082ls3;
        C1082ls c1082ls4;
        au1 au1Var4;
        C1082ls c1082ls5;
        au1 au1Var5;
        int size;
        ArrayList arrayList2;
        int i9;
        int i10;
        float f;
        int i11;
        au1 au1Var6;
        au1 au1Var7;
        au1 au1Var8;
        au1 au1Var9;
        C0670ga c0670gaM6967l;
        float f2;
        C1082ls c1082ls6;
        C1639ys c1639ys4;
        int i12;
        int i13;
        C1639ys c1639ys5;
        C1676zs c1676zs2 = c1676zs;
        if (i == 0) {
            i2 = c1676zs2.f13545z0;
            c0755imArr = c1676zs2.f13526C0;
            i3 = 0;
        } else {
            i2 = c1676zs2.f13524A0;
            c0755imArr = c1676zs2.f13525B0;
            i3 = 2;
        }
        int i14 = i2;
        C0755im[] c0755imArr2 = c0755imArr;
        int i15 = 0;
        while (i15 < i14) {
            C0755im c0755im = c0755imArr2[i15];
            boolean z4 = c0755im.f5084q;
            C1639ys c1639ys6 = c0755im.f5068a;
            C1082ls[] c1082lsArr3 = c1639ys6.f13074Q;
            int i16 = 3;
            int i17 = 8;
            float f3 = TouchPipeline.SIZE;
            if (z4) {
                i4 = i15;
            } else {
                int i18 = c0755im.f5079l;
                int i19 = i18 * 2;
                C1639ys c1639ys7 = c1639ys6;
                C1639ys c1639ys8 = c1639ys7;
                boolean z5 = false;
                while (!z5) {
                    c0755im.f5076i++;
                    C1639ys[] c1639ysArr = c1639ys7.f13109m0;
                    C1082ls[] c1082lsArr4 = c1639ys7.f13074Q;
                    c1639ysArr[i18] = null;
                    c1639ys7.f13107l0[i18] = null;
                    if (c1639ys7.f13097g0 != i17) {
                        c1639ys7.m7130j(i18);
                        c1082lsArr4[i19].m4277e();
                        int i20 = i19 + 1;
                        c1082lsArr4[i20].m4277e();
                        c1082lsArr4[i19].m4277e();
                        c1082lsArr4[i20].m4277e();
                        if (c0755im.f5069b == null) {
                            c0755im.f5069b = c1639ys7;
                        }
                        c0755im.f5071d = c1639ys7;
                        int i21 = c1639ys7.f13115p0[i18];
                        if (i21 == i16) {
                            int i22 = c1639ys7.f13119t[i18];
                            if (i22 == 0 || i22 == i16 || i22 == 2) {
                                c0755im.f5077j++;
                                float f4 = c1639ys7.f13105k0[i18];
                                if (f4 > TouchPipeline.SIZE) {
                                    c0755im.f5078k += f4;
                                }
                                i13 = i18;
                                if (c1639ys7.f13097g0 != 8 && i21 == 3 && (i22 == 0 || i22 == 3)) {
                                    if (f4 < TouchPipeline.SIZE) {
                                        c0755im.f5081n = true;
                                    } else {
                                        c0755im.f5082o = true;
                                    }
                                    if (c0755im.f5075h == null) {
                                        c0755im.f5075h = new ArrayList();
                                    }
                                    c0755im.f5075h.add(c1639ys7);
                                }
                                if (c0755im.f5073f == null) {
                                    c0755im.f5073f = c1639ys7;
                                }
                                C1639ys c1639ys9 = c0755im.f5074g;
                                if (c1639ys9 != null) {
                                    c1639ys9.f13107l0[i13] = c1639ys7;
                                }
                                c0755im.f5074g = c1639ys7;
                            } else {
                                i15 = i15;
                                i13 = i18;
                            }
                            if (i13 == 0) {
                                if (c1639ys7.f13117r == 0 && c1639ys7.f13120u == 0) {
                                    int i23 = c1639ys7.f13121v;
                                }
                            } else if (c1639ys7.f13118s == 0 && c1639ys7.f13123x == 0) {
                                int i24 = c1639ys7.f13124y;
                            }
                        } else {
                            i15 = i15;
                            i13 = i18;
                        }
                    } else {
                        i15 = i15;
                        i13 = i18;
                    }
                    C1639ys c1639ys10 = c1639ys8;
                    if (c1639ys10 != c1639ys7) {
                        c1639ys10.f13109m0[i13] = c1639ys7;
                    }
                    C1082ls c1082ls7 = c1082lsArr4[i19 + 1].f6503f;
                    if (c1082ls7 != null) {
                        c1639ys5 = c1082ls7.f6501d;
                        C1082ls c1082ls8 = c1639ys5.f13074Q[i19].f6503f;
                        if (c1082ls8 == null || c1082ls8.f6501d != c1639ys7) {
                            c1639ys5 = null;
                        }
                    } else {
                        c1639ys5 = null;
                    }
                    if (c1639ys5 == null) {
                        c1639ys5 = c1639ys7;
                        z5 = true;
                    }
                    c1639ys8 = c1639ys7;
                    i18 = i13;
                    i16 = 3;
                    i17 = 8;
                    c1639ys7 = c1639ys5;
                    i15 = i15;
                }
                i4 = i15;
                int i25 = i18;
                C1639ys c1639ys11 = c0755im.f5069b;
                if (c1639ys11 != null) {
                    c1639ys11.f13074Q[i19].m4277e();
                }
                C1639ys c1639ys12 = c0755im.f5071d;
                if (c1639ys12 != null) {
                    c1639ys12.f13074Q[i19 + 1].m4277e();
                }
                c0755im.f5070c = c1639ys7;
                if (i25 == 0 && c0755im.f5080m) {
                    c0755im.f5072e = c1639ys7;
                } else {
                    c0755im.f5072e = c1639ys6;
                }
                c0755im.f5083p = c0755im.f5082o && c0755im.f5081n;
            }
            c0755im.f5084q = true;
            if (arrayList == 0 || arrayList.contains(c1639ys6)) {
                C1639ys c1639ys13 = c0755im.f5070c;
                C1639ys c1639ys14 = c0755im.f5069b;
                C1639ys c1639ys15 = c0755im.f5071d;
                C1639ys c1639ys16 = c0755im.f5072e;
                float f5 = c0755im.f5078k;
                int[] iArr = c1676zs2.f13115p0;
                C1082ls[] c1082lsArr5 = c1676zs2.f13074Q;
                boolean z6 = iArr[i] == 2;
                if (i == 0) {
                    int i26 = c1639ys16.f13101i0;
                    boolean z7 = i26 == 0;
                    boolean z8 = i26 == 1;
                    z = i26 == 2;
                    z3 = z8;
                    z2 = z7;
                } else {
                    int i27 = c1639ys16.f13103j0;
                    boolean z9 = i27 == 0;
                    boolean z10 = i27 == 1;
                    z = i27 == 2;
                    z2 = z9;
                    z3 = z10;
                }
                boolean z11 = false;
                while (!z11) {
                    C1082ls[] c1082lsArr6 = c1639ys6.f13074Q;
                    int[] iArr2 = c1639ys6.f13115p0;
                    C1082ls c1082ls9 = c1082lsArr6[i3];
                    int i28 = z ? 1 : 4;
                    int iM4277e = c1082ls9.m4277e();
                    boolean z12 = z6;
                    boolean z13 = z;
                    boolean z14 = iArr2[i] == 3 && c1639ys6.f13119t[i] == 0;
                    C1082ls c1082ls10 = c1082ls9.f6503f;
                    if (c1082ls10 != null && c1639ys6 != c1639ys6) {
                        iM4277e = c1082ls10.m4277e() + iM4277e;
                    }
                    int i29 = iM4277e;
                    if (z13 && c1639ys6 != c1639ys6 && c1639ys6 != c1639ys14) {
                        i28 = 8;
                    }
                    C1639ys c1639ys17 = c1639ys6;
                    C1082ls c1082ls11 = c1082ls9.f6503f;
                    if (c1082ls11 != null) {
                        boolean z15 = z14;
                        au1 au1Var10 = c1082ls9.f6506i;
                        au1 au1Var11 = c1082ls11.f6506i;
                        if (c1639ys6 == c1639ys14) {
                            xs0Var.m6961f(au1Var10, au1Var11, i29, 6);
                        } else {
                            xs0Var.m6961f(au1Var10, au1Var11, i29, 8);
                        }
                        if (z15 && !z13) {
                            i28 = 5;
                        }
                        xs0Var.m6960e(c1082ls9.f6506i, c1082ls9.f6503f.f6506i, i29, (c1639ys6 == c1639ys14 && z13 && c1639ys6.f13076S[i]) ? 5 : i28);
                    }
                    if (z12) {
                        if (c1639ys6.f13097g0 == 8 || iArr2[i] != 3) {
                            i12 = 0;
                        } else {
                            i12 = 0;
                            xs0Var.m6961f(c1082lsArr6[i3 + 1].f6506i, c1082lsArr6[i3].f6506i, 0, 5);
                        }
                        xs0Var.m6961f(c1082lsArr6[i3].f6506i, c1082lsArr5[i3].f6506i, i12, 8);
                    }
                    C1082ls c1082ls12 = c1082lsArr6[i3 + 1].f6503f;
                    if (c1082ls12 != null) {
                        c1639ys4 = c1082ls12.f6501d;
                        C1082ls c1082ls13 = c1639ys4.f13074Q[i3].f6503f;
                        if (c1082ls13 == null || c1082ls13.f6501d != c1639ys6) {
                            c1639ys4 = null;
                        }
                    } else {
                        c1639ys4 = null;
                    }
                    if (c1639ys4 != null) {
                        c1639ys6 = c1639ys4;
                    } else {
                        z11 = true;
                    }
                    c1639ys6 = c1639ys17;
                    z6 = z12;
                    z = z13;
                }
                boolean z16 = z6;
                boolean z17 = z;
                if (c1639ys15 != null) {
                    int i30 = i3 + 1;
                    if (c1639ys13.f13074Q[i30].f6503f != null) {
                        C1082ls c1082ls14 = c1639ys15.f13074Q[i30];
                        if (c1639ys15.f13115p0[i] == 3 && c1639ys15.f13119t[i] == 0 && !z17) {
                            C1082ls c1082ls15 = c1082ls14.f6503f;
                            if (c1082ls15.f6501d == c1676zs2) {
                                xs0Var.m6960e(c1082ls14.f6506i, c1082ls15.f6506i, -c1082ls14.m4277e(), 5);
                            } else if (z17) {
                                c1082ls6 = c1082ls14.f6503f;
                                if (c1082ls6.f6501d == c1676zs2) {
                                    xs0Var.m6960e(c1082ls14.f6506i, c1082ls6.f6506i, -c1082ls14.m4277e(), 4);
                                }
                            }
                        } else if (z17) {
                            c1082ls6 = c1082ls14.f6503f;
                            if (c1082ls6.f6501d == c1676zs2) {
                                xs0Var.m6960e(c1082ls14.f6506i, c1082ls6.f6506i, -c1082ls14.m4277e(), 4);
                            }
                        }
                        xs0Var.m6962g(c1082ls14.f6506i, c1639ys13.f13074Q[i30].f6503f.f6506i, -c1082ls14.m4277e(), 6);
                    }
                }
                if (z16) {
                    int i31 = i3 + 1;
                    au1 au1Var12 = c1082lsArr5[i31].f6506i;
                    C1082ls c1082ls16 = c1639ys13.f13074Q[i31];
                    xs0Var.m6961f(au1Var12, c1082ls16.f6506i, c1082ls16.m4277e(), 8);
                }
                ArrayList arrayList3 = c0755im.f5075h;
                if (arrayList3 != null && (size = arrayList3.size()) > 1) {
                    if (c0755im.f5081n && !c0755im.f5083p) {
                        f5 = c0755im.f5077j;
                    }
                    C1639ys c1639ys18 = null;
                    float f6 = 0.0f;
                    int i32 = 0;
                    while (i32 < size) {
                        C1639ys c1639ys19 = (C1639ys) arrayList3.get(i32);
                        float[] fArr = c1639ys19.f13105k0;
                        C1082ls[] c1082lsArr7 = c1639ys19.f13074Q;
                        float f7 = fArr[i];
                        if (f7 >= f3) {
                            arrayList2 = arrayList3;
                            i9 = size;
                            if (f7 == f3) {
                                xs0Var.m6960e(c1082lsArr7[i3 + 1].f6506i, c1082lsArr7[i3].f6506i, 0, 8);
                                i10 = i14;
                                f = f3;
                                f6 = f6;
                                i11 = i32;
                            } else {
                                float f8 = f6;
                                if (c1639ys18 != null) {
                                    C1082ls[] c1082lsArr8 = c1639ys18.f13074Q;
                                    au1Var6 = c1082lsArr8[i3].f6506i;
                                    int i33 = i3 + 1;
                                    au1Var7 = c1082lsArr8[i33].f6506i;
                                    au1Var8 = c1082lsArr7[i3].f6506i;
                                    au1Var9 = c1082lsArr7[i33].f6506i;
                                    c0670gaM6967l = xs0Var.m6967l();
                                    f2 = f3;
                                    c0670gaM6967l.f4113b = f2;
                                    f = f2;
                                    if (f5 != f2 || f8 == f7) {
                                        i11 = i32;
                                        i10 = i14;
                                        c0670gaM6967l.f4115d.m134g(au1Var6, 1.0f);
                                        c0670gaM6967l.f4115d.m134g(au1Var7, -1.0f);
                                        c0670gaM6967l.f4115d.m134g(au1Var9, 1.0f);
                                        c0670gaM6967l.f4115d.m134g(au1Var8, -1.0f);
                                    } else {
                                        C0011aa c0011aa = c0670gaM6967l.f4115d;
                                        if (f8 == f) {
                                            i11 = i32;
                                            c0011aa.m134g(au1Var6, 1.0f);
                                            c0670gaM6967l.f4115d.m134g(au1Var7, -1.0f);
                                            i10 = i14;
                                        } else {
                                            i11 = i32;
                                            i10 = i14;
                                            if (f7 == f3) {
                                                c0011aa.m134g(au1Var8, 1.0f);
                                                c0670gaM6967l.f4115d.m134g(au1Var9, -1.0f);
                                            } else {
                                                float f9 = (f8 / f5) / (f7 / f5);
                                                c0011aa.m134g(au1Var6, 1.0f);
                                                c0670gaM6967l.f4115d.m134g(au1Var7, -1.0f);
                                                c0670gaM6967l.f4115d.m134g(au1Var9, f9);
                                                c0670gaM6967l.f4115d.m134g(au1Var8, -f9);
                                            }
                                        }
                                    }
                                    xs0Var.m6958c(c0670gaM6967l);
                                } else {
                                    i10 = i14;
                                    f = f3;
                                    i11 = i32;
                                }
                                f6 = f7;
                                c1639ys18 = c1639ys19;
                            }
                        } else {
                            if (c0755im.f5083p) {
                                arrayList2 = arrayList3;
                                i9 = size;
                                xs0Var.m6960e(c1082lsArr7[i3 + 1].f6506i, c1082lsArr7[i3].f6506i, 0, 4);
                            } else {
                                f7 = 1.0f;
                                arrayList2 = arrayList3;
                                i9 = size;
                                if (f7 == f3) {
                                    xs0Var.m6960e(c1082lsArr7[i3 + 1].f6506i, c1082lsArr7[i3].f6506i, 0, 8);
                                } else {
                                    float f10 = f6;
                                    if (c1639ys18 != null) {
                                        C1082ls[] c1082lsArr9 = c1639ys18.f13074Q;
                                        au1Var6 = c1082lsArr9[i3].f6506i;
                                        int i34 = i3 + 1;
                                        au1Var7 = c1082lsArr9[i34].f6506i;
                                        au1Var8 = c1082lsArr7[i3].f6506i;
                                        au1Var9 = c1082lsArr7[i34].f6506i;
                                        c0670gaM6967l = xs0Var.m6967l();
                                        f2 = f3;
                                        c0670gaM6967l.f4113b = f2;
                                        f = f2;
                                        if (f5 != f2) {
                                            i11 = i32;
                                            i10 = i14;
                                            c0670gaM6967l.f4115d.m134g(au1Var6, 1.0f);
                                            c0670gaM6967l.f4115d.m134g(au1Var7, -1.0f);
                                            c0670gaM6967l.f4115d.m134g(au1Var9, 1.0f);
                                            c0670gaM6967l.f4115d.m134g(au1Var8, -1.0f);
                                        } else {
                                            i11 = i32;
                                            i10 = i14;
                                            c0670gaM6967l.f4115d.m134g(au1Var6, 1.0f);
                                            c0670gaM6967l.f4115d.m134g(au1Var7, -1.0f);
                                            c0670gaM6967l.f4115d.m134g(au1Var9, 1.0f);
                                            c0670gaM6967l.f4115d.m134g(au1Var8, -1.0f);
                                        }
                                        xs0Var.m6958c(c0670gaM6967l);
                                    } else {
                                        i10 = i14;
                                        f = f3;
                                        i11 = i32;
                                    }
                                    f6 = f7;
                                    c1639ys18 = c1639ys19;
                                }
                            }
                            i10 = i14;
                            f = f3;
                            f6 = f6;
                            i11 = i32;
                        }
                        i32 = i11 + 1;
                        i14 = i10;
                        arrayList3 = arrayList2;
                        size = i9;
                        f3 = f;
                    }
                }
                i5 = i14;
                if (c1639ys14 == null || !(c1639ys14 == c1639ys15 || z17)) {
                    c1639ys = c1639ys15;
                    if (z2 && c1639ys14 != null) {
                        int i35 = c0755im.f5077j;
                        boolean z18 = i35 > 0 && c0755im.f5076i == i35;
                        C1639ys c1639ys20 = c1639ys14;
                        C1639ys c1639ys21 = c1639ys20;
                        while (true) {
                            C1082ls[] c1082lsArr10 = c1639ys21.f13074Q;
                            if (c1639ys20 == null) {
                                break;
                            }
                            C1082ls[] c1082lsArr11 = c1639ys20.f13074Q;
                            C1639ys c1639ys22 = c1639ys20.f13109m0[i];
                            while (true) {
                                if (c1639ys22 == null) {
                                    i6 = 8;
                                    break;
                                }
                                i6 = 8;
                                if (c1639ys22.f13097g0 != 8) {
                                    break;
                                } else {
                                    c1639ys22 = c1639ys22.f13109m0[i];
                                }
                            }
                            if (c1639ys22 != null || c1639ys20 == c1639ys) {
                                C1082ls c1082ls17 = c1082lsArr11[i3];
                                au1 au1Var13 = c1082ls17.f6506i;
                                C1082ls c1082ls18 = c1082ls17.f6503f;
                                au1 au1Var14 = c1082ls18 != null ? c1082ls18.f6506i : null;
                                if (c1639ys21 != c1639ys20) {
                                    au1Var14 = c1082lsArr10[i3 + 1].f6506i;
                                } else if (c1639ys20 == c1639ys14) {
                                    C1082ls c1082ls19 = c1082lsArr3[i3].f6503f;
                                    au1Var14 = c1082ls19 != null ? c1082ls19.f6506i : null;
                                }
                                int iM4277e2 = c1082ls17.m4277e();
                                int i36 = i3 + 1;
                                int iM4277e3 = c1082lsArr11[i36].m4277e();
                                if (c1639ys22 != null) {
                                    c1082ls2 = c1639ys22.f13074Q[i3];
                                    c1082lsArr = c1082lsArr10;
                                    au1Var3 = c1082ls2.f6506i;
                                } else {
                                    c1082lsArr = c1082lsArr10;
                                    c1082ls2 = c1639ys13.f13074Q[i36].f6503f;
                                    au1Var3 = c1082ls2 != null ? c1082ls2.f6506i : null;
                                }
                                au1 au1Var15 = c1082lsArr11[i36].f6506i;
                                if (c1082ls2 != null) {
                                    iM4277e3 += c1082ls2.m4277e();
                                }
                                int iM4277e4 = c1082lsArr[i36].m4277e() + iM4277e2;
                                if (au1Var13 == null || au1Var14 == null || au1Var3 == null || au1Var15 == null) {
                                    i7 = 8;
                                } else {
                                    if (c1639ys20 == c1639ys14) {
                                        iM4277e4 = c1639ys14.f13074Q[i3].m4277e();
                                    }
                                    int i37 = iM4277e4;
                                    if (c1639ys20 == c1639ys) {
                                        iM4277e3 = c1639ys.f13074Q[i36].m4277e();
                                    }
                                    i7 = 8;
                                    xs0Var.m6957b(au1Var13, au1Var14, i37, 0.5f, au1Var3, au1Var15, iM4277e3, z18 ? 8 : 5);
                                }
                            } else {
                                i7 = i6;
                            }
                            if (c1639ys20.f13097g0 != i7) {
                                c1639ys21 = c1639ys20;
                            }
                            c1639ys20 = c1639ys22;
                            c1639ys21 = c1639ys21;
                        }
                    } else {
                        int i38 = 8;
                        if (z3 && c1639ys14 != null) {
                            int i39 = c0755im.f5077j;
                            boolean z19 = i39 > 0 && c0755im.f5076i == i39;
                            C1639ys c1639ys23 = c1639ys14;
                            C1639ys c1639ys24 = c1639ys23;
                            while (true) {
                                C1082ls[] c1082lsArr12 = c1639ys23.f13074Q;
                                if (c1639ys24 == null) {
                                    break;
                                }
                                C1082ls[] c1082lsArr13 = c1639ys24.f13074Q;
                                C1639ys c1639ys25 = c1639ys24.f13109m0[i];
                                while (c1639ys25 != null && c1639ys25.f13097g0 == i38) {
                                    c1639ys25 = c1639ys25.f13109m0[i];
                                }
                                if (c1639ys24 == c1639ys14 || c1639ys24 == c1639ys || c1639ys25 == null) {
                                    c1639ys2 = c1639ys23;
                                } else {
                                    if (c1639ys25 == c1639ys) {
                                        c1639ys25 = null;
                                    }
                                    C1082ls c1082ls20 = c1082lsArr13[i3];
                                    au1 au1Var16 = c1082ls20.f6506i;
                                    int i40 = i3 + 1;
                                    au1 au1Var17 = c1082lsArr12[i40].f6506i;
                                    int iM4277e5 = c1082ls20.m4277e();
                                    int iM4277e6 = c1082lsArr13[i40].m4277e();
                                    if (c1639ys25 != null) {
                                        c1082ls = c1639ys25.f13074Q[i3];
                                        au1Var = c1082ls.f6506i;
                                        c1639ys2 = c1639ys23;
                                        C1082ls c1082ls21 = c1082ls.f6503f;
                                        au1Var2 = c1082ls21 != null ? c1082ls21.f6506i : null;
                                    } else {
                                        c1639ys2 = c1639ys23;
                                        C1082ls c1082ls22 = c1639ys.f13074Q[i3];
                                        au1Var = c1082ls22 != null ? c1082ls22.f6506i : null;
                                        au1 au1Var18 = c1082lsArr13[i40].f6506i;
                                        c1082ls = c1082ls22;
                                        au1Var2 = au1Var18;
                                    }
                                    if (c1082ls != null) {
                                        iM4277e6 += c1082ls.m4277e();
                                    }
                                    int iM4277e7 = c1082lsArr12[i40].m4277e() + iM4277e5;
                                    C1639ys c1639ys26 = c1639ys25;
                                    int i41 = iM4277e6;
                                    int i42 = z19 ? 8 : 4;
                                    if (au1Var16 == null || au1Var17 == null || au1Var == null || au1Var2 == null) {
                                        c1639ys3 = c1639ys26;
                                    } else {
                                        au1 au1Var19 = au1Var;
                                        c1639ys3 = c1639ys26;
                                        xs0Var.m6957b(au1Var16, au1Var17, iM4277e7, 0.5f, au1Var19, au1Var2, i41, i42);
                                    }
                                    c1639ys25 = c1639ys3;
                                }
                                if (c1639ys24.f13097g0 != 8) {
                                    c1639ys2 = c1639ys24;
                                }
                                c1639ys24 = c1639ys25;
                                i38 = 8;
                                c1639ys23 = c1639ys2;
                            }
                            xs0Var2 = xs0Var;
                            C1082ls c1082ls23 = c1639ys14.f13074Q[i3];
                            C1082ls c1082ls24 = c1082lsArr3[i3].f6503f;
                            int i43 = i3 + 1;
                            C1082ls c1082ls25 = c1639ys.f13074Q[i43];
                            C1082ls c1082ls26 = c1639ys13.f13074Q[i43].f6503f;
                            if (c1082ls24 != null) {
                                if (c1639ys14 != c1639ys) {
                                    xs0Var2.m6960e(c1082ls23.f6506i, c1082ls24.f6506i, c1082ls23.m4277e(), 5);
                                } else if (c1082ls26 != null) {
                                    xs0Var2.m6957b(c1082ls23.f6506i, c1082ls24.f6506i, c1082ls23.m4277e(), 0.5f, c1082ls25.f6506i, c1082ls26.f6506i, c1082ls25.m4277e(), 5);
                                }
                            }
                            if (c1082ls26 != null && c1639ys14 != c1639ys) {
                                xs0Var2.m6960e(c1082ls25.f6506i, c1082ls26.f6506i, -c1082ls25.m4277e(), 5);
                            }
                        }
                        if ((z2 || z3) && c1639ys14 != null && c1639ys14 != c1639ys) {
                            c1082lsArr2 = c1639ys14.f13074Q;
                            C1082ls c1082ls27 = c1082lsArr2[i3];
                            if (c1639ys == null) {
                                c1639ys = c1639ys14;
                            }
                            C1082ls[] c1082lsArr14 = c1639ys.f13074Q;
                            i8 = i3 + 1;
                            c1082ls3 = c1082lsArr14[i8];
                            c1082ls4 = c1082ls27.f6503f;
                            if (c1082ls4 != null) {
                                au1Var4 = c1082ls4.f6506i;
                            } else {
                                au1Var4 = null;
                            }
                            c1082ls5 = c1082ls3.f6503f;
                            if (c1082ls5 != null) {
                                au1Var5 = c1082ls5.f6506i;
                            } else {
                                au1Var5 = null;
                            }
                            if (c1639ys13 != c1639ys) {
                                C1082ls c1082ls28 = c1639ys13.f13074Q[i8].f6503f;
                                au1Var5 = c1082ls28 != null ? c1082ls28.f6506i : null;
                            }
                            if (c1639ys14 == c1639ys) {
                                c1082ls3 = c1082lsArr2[i8];
                            }
                            if (au1Var4 == null && au1Var5 != null) {
                                xs0Var2.m6957b(c1082ls27.f6506i, au1Var4, c1082ls27.m4277e(), 0.5f, au1Var5, c1082ls3.f6506i, c1082lsArr14[i8].m4277e(), 5);
                            }
                        }
                    }
                } else {
                    C1082ls c1082ls29 = c1082lsArr3[i3];
                    int i44 = i3 + 1;
                    C1082ls c1082ls30 = c1639ys13.f13074Q[i44];
                    C1082ls c1082ls31 = c1082ls29.f6503f;
                    au1 au1Var20 = c1082ls31 != null ? c1082ls31.f6506i : null;
                    C1082ls c1082ls32 = c1082ls30.f6503f;
                    au1 au1Var21 = c1082ls32 != null ? c1082ls32.f6506i : null;
                    C1082ls c1082ls33 = c1639ys14.f13074Q[i3];
                    if (c1639ys15 != null) {
                        c1082ls30 = c1639ys15.f13074Q[i44];
                    }
                    if (au1Var20 == null || au1Var21 == null) {
                        c1639ys = c1639ys15;
                    } else {
                        float f11 = i == 0 ? c1639ys16.f13091d0 : c1639ys16.f13093e0;
                        int iM4277e8 = c1082ls33.m4277e();
                        int iM4277e9 = c1082ls30.m4277e();
                        au1 au1Var22 = c1082ls33.f6506i;
                        au1 au1Var23 = c1082ls30.f6506i;
                        au1 au1Var24 = au1Var20;
                        c1639ys = c1639ys15;
                        xs0Var.m6957b(au1Var22, au1Var24, iM4277e8, f11, au1Var21, au1Var23, iM4277e9, 7);
                    }
                }
                xs0Var2 = xs0Var;
                if (z2) {
                    c1082lsArr2 = c1639ys14.f13074Q;
                    C1082ls c1082ls210 = c1082lsArr2[i3];
                    if (c1639ys == null) {
                        c1639ys = c1639ys14;
                    }
                    C1082ls[] c1082lsArr15 = c1639ys.f13074Q;
                    i8 = i3 + 1;
                    c1082ls3 = c1082lsArr15[i8];
                    c1082ls4 = c1082ls210.f6503f;
                    if (c1082ls4 != null) {
                        au1Var4 = c1082ls4.f6506i;
                    } else {
                        au1Var4 = null;
                    }
                    c1082ls5 = c1082ls3.f6503f;
                    if (c1082ls5 != null) {
                        au1Var5 = c1082ls5.f6506i;
                    } else {
                        au1Var5 = null;
                    }
                    if (c1639ys13 != c1639ys) {
                        C1082ls c1082ls211 = c1639ys13.f13074Q[i8].f6503f;
                        au1Var5 = c1082ls211 != null ? c1082ls211.f6506i : null;
                    }
                    if (c1639ys14 == c1639ys) {
                        c1082ls3 = c1082lsArr2[i8];
                    }
                    if (au1Var4 == null) {
                    }
                } else {
                    c1082lsArr2 = c1639ys14.f13074Q;
                    C1082ls c1082ls212 = c1082lsArr2[i3];
                    if (c1639ys == null) {
                        c1639ys = c1639ys14;
                    }
                    C1082ls[] c1082lsArr16 = c1639ys.f13074Q;
                    i8 = i3 + 1;
                    c1082ls3 = c1082lsArr16[i8];
                    c1082ls4 = c1082ls212.f6503f;
                    if (c1082ls4 != null) {
                        au1Var4 = c1082ls4.f6506i;
                    } else {
                        au1Var4 = null;
                    }
                    c1082ls5 = c1082ls3.f6503f;
                    if (c1082ls5 != null) {
                        au1Var5 = c1082ls5.f6506i;
                    } else {
                        au1Var5 = null;
                    }
                    if (c1639ys13 != c1639ys) {
                        C1082ls c1082ls213 = c1639ys13.f13074Q[i8].f6503f;
                        au1Var5 = c1082ls213 != null ? c1082ls213.f6506i : null;
                    }
                    if (c1639ys14 == c1639ys) {
                        c1082ls3 = c1082lsArr2[i8];
                    }
                    if (au1Var4 == null) {
                    }
                }
            } else {
                i5 = i14;
            }
            i15 = i4 + 1;
            c1676zs2 = c1676zs;
            i14 = i5;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m3214e(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: f */
    public static C0708hb m3215f() throws InterruptedException {
        C0708hb c0708hb = C0708hb.f4500l;
        c0708hb.getClass();
        C0708hb c0708hb2 = c0708hb.f4502f;
        if (c0708hb2 == null) {
            long jNanoTime = System.nanoTime();
            C0708hb.f4497i.await(C0708hb.f4498j, TimeUnit.MILLISECONDS);
            C0708hb c0708hb3 = C0708hb.f4500l;
            c0708hb3.getClass();
            if (c0708hb3.f4502f != null || System.nanoTime() - jNanoTime < C0708hb.f4499k) {
                return null;
            }
            return C0708hb.f4500l;
        }
        long jNanoTime2 = c0708hb2.f4503g - System.nanoTime();
        if (jNanoTime2 > 0) {
            C0708hb.f4497i.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        C0708hb c0708hb4 = C0708hb.f4500l;
        c0708hb4.getClass();
        c0708hb4.f4502f = c0708hb2.f4502f;
        c0708hb2.f4502f = null;
        return c0708hb2;
    }

    /* JADX INFO: renamed from: g */
    public static int m3216g(int i, int i2) {
        long j = ((long) i) + ((long) i2);
        int i3 = (int) j;
        if (j == ((long) i3)) {
            return i3;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + i + ", " + i2 + ")");
    }

    /* JADX INFO: renamed from: k */
    public static zo1 m3217k(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new zo1();
            }
            HashMap map = new HashMap();
            for (String str : bundle2.keySet()) {
                str.getClass();
                map.put(str, bundle2.get(str));
            }
            return new zo1(map);
        }
        ClassLoader classLoader = zo1.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            f40.m2719o("Invalid bundle passed as restored state");
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = parcelableArrayList.get(i);
            obj.getClass();
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
        }
        return new zo1(linkedHashMap);
    }

    /* JADX INFO: renamed from: l */
    public static final zo1 m3218l(a71 a71Var) {
        LinkedHashMap linkedHashMap = a71Var.f1067a;
        jp1 jp1Var = (jp1) linkedHashMap.get(f4651o);
        if (jp1Var == null) {
            f40.m2713i("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        w72 w72Var = (w72) linkedHashMap.get(f4652p);
        if (w72Var == null) {
            f40.m2713i("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f4653q);
        String str = (String) linkedHashMap.get(bz1.f1583m);
        if (str == null) {
            f40.m2713i("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        gp1 gp1VarM3234b = jp1Var.getSavedStateRegistry().m3234b();
        cp1 cp1Var = gp1VarM3234b instanceof cp1 ? (cp1) gp1VarM3234b : null;
        if (cp1Var == null) {
            f40.m2719o("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap2 = m3229y(w72Var).f2992b;
        zo1 zo1Var = (zo1) linkedHashMap2.get(str);
        if (zo1Var != null) {
            return zo1Var;
        }
        Class[] clsArr = zo1.f13506f;
        cp1Var.m2111b();
        Bundle bundle2 = cp1Var.f2588c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = cp1Var.f2588c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = cp1Var.f2588c;
        if (bundle5 != null && bundle5.isEmpty()) {
            cp1Var.f2588c = null;
        }
        zo1 zo1VarM3217k = m3217k(bundle3, bundle);
        linkedHashMap2.put(str, zo1VarM3217k);
        return zo1VarM3217k;
    }

    /* JADX INFO: renamed from: n */
    public static int m3219n(int i) {
        int i2 = -1;
        while (i != 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* JADX INFO: renamed from: o */
    public static int m3220o(int i, int i2) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (zn0.f13495a[roundingMode.ordinal()]) {
            case 1:
                p32.m5191v(i4 == 0);
                return i3;
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i3;
                }
                if (iAbs2 <= 0) {
                    return i3;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i3 + i5;
    }

    /* JADX INFO: renamed from: p */
    public static final long m3221p(long j) {
        long j2 = (j << 1) + 1;
        int i = r40.f9718c;
        int i2 = s40.f10216a;
        return j2;
    }

    /* JADX INFO: renamed from: q */
    public static final void m3222q(jp1 jp1Var) {
        es0 es0Var = ((os0) jp1Var.getLifecycle()).f8452d;
        if (es0Var != es0.f3434b && es0Var != es0.f3435c) {
            f40.m2713i("Failed requirement.");
        } else if (jp1Var.getSavedStateRegistry().m3234b() == null) {
            cp1 cp1Var = new cp1(jp1Var.getSavedStateRegistry(), (w72) jp1Var);
            jp1Var.getSavedStateRegistry().m3235c("androidx.lifecycle.internal.SavedStateHandlesProvider", cp1Var);
            jp1Var.getLifecycle().mo2848a(new aj1(cp1Var, 2));
        }
    }

    /* JADX INFO: renamed from: r */
    public static int m3223r(double d, double d2) {
        if (d < d2) {
            return -1;
        }
        if (d > d2) {
            return 1;
        }
        if (d == d2) {
            return 0;
        }
        if (Double.isNaN(d2)) {
            return !Double.isNaN(d) ? 1 : 0;
        }
        return -1;
    }

    /* JADX INFO: renamed from: s */
    public static hr0 m3224s(kr0 kr0Var, dr0 dr0Var, int i, byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr2.length >= kr0Var.f5991b) {
            return new hr0(kr0Var, dr0Var, i, bArr, 1 << kr0Var.f5992c, bArr2);
        }
        ca0.m1174f(kr0Var.f5991b, "root seed is less than ");
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static int m3225t(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = f4638b[i];
        if (i4 == 44100) {
            return ((i2 % 2) + f4642f[i3]) * 2;
        }
        int i5 = f4641e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    /* JADX INFO: renamed from: v */
    public static int m3226v(View view, int i) {
        Context context = view.getContext();
        TypedValue typedValueM3851V = ki0.m3851V(view.getContext(), i, view.getClass().getCanonicalName());
        int i2 = typedValueM3851V.resourceId;
        return i2 != 0 ? AbstractC0075au.getColor(context, i2) : typedValueM3851V.data;
    }

    /* JADX INFO: renamed from: w */
    public static Object m3227w(vt0 vt0Var) {
        Object obj;
        p32.m5194y(vt0Var.isDone(), "Future was expected to be done: %s", vt0Var);
        boolean z = false;
        while (true) {
            try {
                obj = vt0Var.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX INFO: renamed from: x */
    public static int m3228x(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = f4645i[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f4646j[i4 - 1] : f4647k[i4 - 1]) * 12) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? f4648l[i4 - 1] : f4649m[i4 - 1];
        } else {
            i6 = f4650n[i4 - 1];
        }
        if (i2 == 3) {
            return jd0.m3607e(i6, 144, i7, i8);
        }
        return jd0.m3607e(i3 == 1 ? 72 : 144, i6, i7, i8);
    }

    /* JADX INFO: renamed from: y */
    public static final dp1 m3229y(w72 w72Var) {
        bp1 bp1Var = new bp1();
        v72 viewModelStore = w72Var.getViewModelStore();
        AbstractC0076av defaultViewModelCreationExtras = w72Var instanceof vj0 ? ((vj0) w72Var).getDefaultViewModelCreationExtras() : C1678zu.f13563b;
        viewModelStore.getClass();
        defaultViewModelCreationExtras.getClass();
        return (dp1) new C1174o9(viewModelStore, bp1Var, defaultViewModelCreationExtras).m4743I(gk1.m3006a(dp1.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    /* JADX INFO: renamed from: A */
    public abstract ry1 mo3070A();

    /* JADX INFO: renamed from: K */
    public abstract void mo3071K();

    /* JADX INFO: renamed from: T */
    public abstract void mo2595T(EnumC0651fs enumC0651fs, lu0 lu0Var);

    /* JADX INFO: renamed from: h */
    public abstract Typeface mo3230h(Context context, vd0 vd0Var, Resources resources, int i);

    /* JADX INFO: renamed from: i */
    public abstract Typeface mo3231i(Context context, yd0[] yd0VarArr, int i);

    /* JADX INFO: renamed from: j */
    public abstract Typeface mo3232j(Context context, Resources resources, int i, String str);

    /* JADX INFO: renamed from: m */
    public abstract o21 mo2597m(iu0 iu0Var);

    /* JADX INFO: renamed from: u */
    public abstract AbstractC1337qm mo3072u();

    /* JADX INFO: renamed from: z */
    public abstract ScheduledExecutorService mo3073z();
}

package p000;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.example.ssmousepro.ads.RewardedVideoActivity;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class a11 extends g11 implements x01 {

    /* JADX INFO: renamed from: H0 */
    public final Context f10H0;

    /* JADX INFO: renamed from: I0 */
    public final C1290pc f11I0;

    /* JADX INFO: renamed from: J0 */
    public final C1423sy f12J0;

    /* JADX INFO: renamed from: K0 */
    public final C1174o9 f13K0;

    /* JADX INFO: renamed from: L0 */
    public int f14L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f15M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f16N0;

    /* JADX INFO: renamed from: O0 */
    public be0 f17O0;

    /* JADX INFO: renamed from: P0 */
    public be0 f18P0;

    /* JADX INFO: renamed from: Q0 */
    public long f19Q0;

    /* JADX INFO: renamed from: R0 */
    public boolean f20R0;

    /* JADX INFO: renamed from: S0 */
    public boolean f21S0;

    /* JADX INFO: renamed from: T0 */
    public boolean f22T0;

    /* JADX INFO: renamed from: U0 */
    public int f23U0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a11(RewardedVideoActivity rewardedVideoActivity, y01 y01Var, Handler handler, c80 c80Var, C1423sy c1423sy) {
        super(1, y01Var, 44100.0f);
        C1174o9 c1174o9 = z42.f13274a >= 35 ? new C1174o9() : null;
        this.f10H0 = rewardedVideoActivity.getApplicationContext();
        this.f12J0 = c1423sy;
        this.f13K0 = c1174o9;
        this.f23U0 = -1000;
        this.f11I0 = new C1290pc(handler, c80Var);
        c1423sy.f10637r = new pn0(this);
    }

    @Override // p000.g11
    /* JADX INFO: renamed from: E */
    public final C1607xx mo15E(c11 c11Var, be0 be0Var, be0 be0Var2) {
        C1607xx c1607xxM1107b = c11Var.m1107b(be0Var, be0Var2);
        int i = c1607xxM1107b.f12762e;
        if (this.f3964J == null && mo43s0(be0Var2)) {
            i |= 32768;
        }
        if (m48y0(c11Var, be0Var2) > this.f14L0) {
            i |= 64;
        }
        int i2 = i;
        return new C1607xx(c11Var.f1614a, be0Var, be0Var2, i2 != 0 ? 0 : c1607xxM1107b.f12761d, i2);
    }

    @Override // p000.g11
    /* JADX INFO: renamed from: P */
    public final float mo16P(float f, be0[] be0VarArr) {
        int iMax = -1;
        for (be0 be0Var : be0VarArr) {
            int i = be0Var.f1318D;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    @Override // p000.g11
    /* JADX INFO: renamed from: Q */
    public final ArrayList mo17Q(f40 f40Var, be0 be0Var, boolean z) {
        kk1 kk1VarM4354g;
        if (be0Var.f1341n == null) {
            kk1VarM4354g = kk1.f5896e;
        } else if (this.f12J0.m6154i(be0Var) != 0) {
            List listM4352e = m11.m4352e("audio/raw", false, false);
            c11 c11Var = listM4352e.isEmpty() ? null : (c11) listM4352e.get(0);
            if (c11Var != null) {
                kk1VarM4354g = qm0.m5570t(c11Var);
            } else {
                kk1VarM4354g = m11.m4354g(f40Var, be0Var, z, false);
            }
        } else {
            kk1VarM4354g = m11.m4354g(f40Var, be0Var, z, false);
        }
        HashMap map = m11.f6590a;
        ArrayList arrayList = new ArrayList(kk1VarM4354g);
        Collections.sort(arrayList, new h11(new C1521vl(be0Var, 27), 0));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d7  */
    @Override // p000.g11
    /* JADX INFO: renamed from: R */
    public final C1470u7 mo18R(c11 c11Var, be0 be0Var, MediaCrypto mediaCrypto, float f) {
        boolean z;
        be0[] be0VarArr = this.f5815o;
        be0VarArr.getClass();
        int iM48y0 = m48y0(c11Var, be0Var);
        String str = c11Var.f1614a;
        if (be0VarArr.length != 1) {
            for (be0 be0Var2 : be0VarArr) {
                if (c11Var.m1107b(be0Var, be0Var2).f12761d != 0) {
                    iM48y0 = Math.max(iM48y0, m48y0(c11Var, be0Var2));
                }
            }
        }
        this.f14L0 = iM48y0;
        int i = z42.f13274a;
        if (i < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(z42.f13276c)) {
            String str2 = z42.f13275b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.f15M0 = z;
        this.f16N0 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str3 = c11Var.f1616c;
        int i2 = this.f14L0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        int i3 = be0Var.f1317C;
        String str4 = be0Var.f1341n;
        mediaFormat.setInteger("channel-count", i3);
        int i4 = be0Var.f1318D;
        mediaFormat.setInteger("sample-rate", i4);
        ki0.m3852Y(mediaFormat, be0Var.f1344q);
        ki0.m3842I(mediaFormat, "max-input-size", i2);
        if (i >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                if (i == 23) {
                    String str5 = z42.f13277d;
                    if (!"ZTE B2017G".equals(str5) && !"AXON 7 mini".equals(str5)) {
                        mediaFormat.setFloat("operating-rate", f);
                    }
                } else {
                    mediaFormat.setFloat("operating-rate", f);
                }
            }
        }
        if (i <= 28 && "audio/ac4".equals(str4)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i >= 24) {
            int i5 = be0Var.f1317C;
            ae0 ae0Var = new ae0();
            ae0Var.f197m = v51.m6582l("audio/raw");
            ae0Var.f175B = i5;
            ae0Var.f176C = i4;
            ae0Var.f177D = 4;
            if (this.f12J0.m6154i(new be0(ae0Var)) == 2) {
                mediaFormat.setInteger("pcm-encoding", 4);
            }
        }
        if (i >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f23U0));
        }
        this.f18P0 = (!"audio/raw".equals(c11Var.f1615b) || "audio/raw".equals(str4)) ? null : be0Var;
        return new C1470u7(c11Var, mediaFormat, be0Var, null, mediaCrypto, this.f13K0);
    }

    @Override // p000.g11
    /* JADX INFO: renamed from: S */
    public final void mo19S(C1533vx c1533vx) {
        be0 be0Var;
        C1125my c1125my;
        if (z42.f13274a < 29 || (be0Var = c1533vx.f11793g) == null || !Objects.equals(be0Var.f1341n, "audio/opus") || !this.f3992l0) {
            return;
        }
        ByteBuffer byteBuffer = c1533vx.f11798q;
        byteBuffer.getClass();
        be0 be0Var2 = c1533vx.f11793g;
        be0Var2.getClass();
        int i = be0Var2.f1320F;
        if (byteBuffer.remaining() == 8) {
            int i2 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            C1423sy c1423sy = this.f12J0;
            AudioTrack audioTrack = c1423sy.f10641v;
            if (audioTrack == null || !C1423sy.m6145p(audioTrack) || (c1125my = c1423sy.f10639t) == null || !c1125my.f7141k) {
                return;
            }
            c1423sy.f10641v.setOffloadDelayPadding(i, i2);
        }
    }

    @Override // p000.g11
    /* JADX INFO: renamed from: X */
    public final void mo20X(Exception exc) {
        AbstractC1337qm.m5551n("MediaCodecAudioRenderer", "Audio codec error", exc);
        C1290pc c1290pc = this.f11I0;
        Handler handler = c1290pc.f8839a;
        if (handler != null) {
            handler.post(new RunnableC1140nc(c1290pc, exc, 3));
        }
    }

    @Override // p000.g11
    /* JADX INFO: renamed from: Y */
    public final void mo21Y(String str, long j, long j2) {
        C1290pc c1290pc = this.f11I0;
        Handler handler = c1290pc.f8839a;
        if (handler != null) {
            handler.post(new RunnableC1140nc(c1290pc, str, j, j2));
        }
    }

    @Override // p000.g11
    /* JADX INFO: renamed from: Z */
    public final void mo22Z(String str) {
        C1290pc c1290pc = this.f11I0;
        Handler handler = c1290pc.f8839a;
        if (handler != null) {
            handler.post(new RunnableC1140nc(c1290pc, str, 7));
        }
    }

    @Override // p000.x01
    /* JADX INFO: renamed from: a */
    public final void mo23a(td1 td1Var) {
        C1423sy c1423sy = this.f12J0;
        c1423sy.getClass();
        c1423sy.f10587C = new td1(z42.m7232f(td1Var.f10844a, 0.1f, 8.0f), z42.m7232f(td1Var.f10845b, 0.1f, 8.0f));
        if (c1423sy.m6168x()) {
            c1423sy.m6166v();
            return;
        }
        C1162ny c1162ny = new C1162ny(td1Var, -9223372036854775807L, -9223372036854775807L);
        if (c1423sy.m6160o()) {
            c1423sy.f10585A = c1162ny;
        } else {
            c1423sy.f10586B = c1162ny;
        }
    }

    @Override // p000.g11
    /* JADX INFO: renamed from: a0 */
    public final C1607xx mo24a0(C0558d8 c0558d8) throws t70 {
        be0 be0Var = (be0) c0558d8.f2822c;
        be0Var.getClass();
        this.f17O0 = be0Var;
        C1607xx c1607xxMo24a0 = super.mo24a0(c0558d8);
        C1290pc c1290pc = this.f11I0;
        Handler handler = c1290pc.f8839a;
        if (handler != null) {
            handler.post(new RunnableC1140nc(c1290pc, be0Var, c1607xxMo24a0));
        }
        return c1607xxMo24a0;
    }

    @Override // p000.x01
    /* JADX INFO: renamed from: b */
    public final long mo25b() {
        if (this.f5813m == 2) {
            m49z0();
        }
        return this.f19Q0;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0102 A[Catch: qc -> 0x0100, TryCatch #0 {qc -> 0x0100, blocks: (B:44:0x00d7, B:47:0x00df, B:49:0x00e3, B:51:0x00ec, B:55:0x00fa, B:58:0x0102, B:62:0x0109, B:63:0x010e), top: B:67:0x00d7 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0107  */
    /* JADX WARN: Code duplicated, block: B:61:0x0108  */
    @Override // p000.g11
    /* JADX INFO: renamed from: b0 */
    public final void mo26b0(be0 be0Var, MediaFormat mediaFormat) throws t70 {
        int iM7244r;
        be0 be0Var2 = this.f18P0;
        boolean z = true;
        int[] iArr = null;
        if (be0Var2 != null) {
            be0Var = be0Var2;
        } else if (this.f3970P != null) {
            mediaFormat.getClass();
            String str = be0Var.f1341n;
            int i = be0Var.f1317C;
            if ("audio/raw".equals(str)) {
                iM7244r = be0Var.f1319E;
            } else if (z42.f13274a < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iM7244r = mediaFormat.containsKey("v-bits-per-sample") ? z42.m7244r(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iM7244r = mediaFormat.getInteger("pcm-encoding");
            }
            ae0 ae0Var = new ae0();
            ae0Var.f197m = v51.m6582l("audio/raw");
            ae0Var.f177D = iM7244r;
            ae0Var.f178E = be0Var.f1320F;
            ae0Var.f179F = be0Var.f1321G;
            ae0Var.f195k = be0Var.f1339l;
            ae0Var.f185a = be0Var.f1328a;
            ae0Var.f186b = be0Var.f1329b;
            ae0Var.f187c = qm0.m5567n(be0Var.f1330c);
            ae0Var.f188d = be0Var.f1331d;
            ae0Var.f189e = be0Var.f1332e;
            ae0Var.f190f = be0Var.f1333f;
            ae0Var.f175B = mediaFormat.getInteger("channel-count");
            ae0Var.f176C = mediaFormat.getInteger("sample-rate");
            be0Var = new be0(ae0Var);
            boolean z2 = this.f15M0;
            int i2 = be0Var.f1317C;
            if (z2 && i2 == 6 && i < 6) {
                iArr = new int[i];
                for (int i3 = 0; i3 < i; i3++) {
                    iArr[i3] = i3;
                }
            } else if (this.f16N0) {
                if (i2 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i2 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i2 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i2 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i2 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
        }
        try {
            int i4 = z42.f13274a;
            C1423sy c1423sy = this.f12J0;
            if (i4 >= 29) {
                if (this.f3992l0) {
                    xk1 xk1Var = this.f5809d;
                    xk1Var.getClass();
                    if (xk1Var.f12633a != 0) {
                        xk1 xk1Var2 = this.f5809d;
                        xk1Var2.getClass();
                        int i5 = xk1Var2.f12633a;
                        c1423sy.getClass();
                        if (i4 < 29) {
                            z = false;
                        }
                        ki0.m3864h(z);
                        c1423sy.f10629j = i5;
                    } else {
                        c1423sy.getClass();
                        if (i4 >= 29) {
                            z = false;
                        }
                        ki0.m3864h(z);
                        c1423sy.f10629j = 0;
                    }
                } else {
                    c1423sy.getClass();
                    if (i4 >= 29) {
                        z = false;
                    }
                    ki0.m3864h(z);
                    c1423sy.f10629j = 0;
                }
            }
            c1423sy.m6149d(be0Var, iArr);
        } catch (C1327qc e) {
            throw m3830g(e, e.f9477a, false, 5001);
        }
    }

    @Override // p000.x01
    /* JADX INFO: renamed from: c */
    public final boolean mo27c() {
        boolean z = this.f22T0;
        this.f22T0 = false;
        return z;
    }

    @Override // p000.g11
    /* JADX INFO: renamed from: c0 */
    public final void mo28c0() {
        this.f12J0.getClass();
    }

    @Override // p000.AbstractC0828kh, p000.ze1
    /* JADX INFO: renamed from: d */
    public final void mo29d(int i, Object obj) {
        ay0 ay0Var;
        C1174o9 c1174o9;
        C1423sy c1423sy = this.f12J0;
        if (i == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            if (c1423sy.f10599O != fFloatValue) {
                c1423sy.f10599O = fFloatValue;
                if (c1423sy.m6160o()) {
                    c1423sy.f10641v.setVolume(c1423sy.f10599O);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            C1474ub c1474ub = (C1474ub) obj;
            c1474ub.getClass();
            if (c1423sy.f10645z.equals(c1474ub)) {
                return;
            }
            c1423sy.f10645z = c1474ub;
            if (c1423sy.f10612a0) {
                return;
            }
            C0130cc c0130cc = c1423sy.f10643x;
            if (c0130cc != null) {
                c0130cc.f1753i = c1474ub;
                c0130cc.m1209a(C1659zb.m7296b(c0130cc.f1745a, c1474ub, c0130cc.f1752h));
            }
            c1423sy.m6152g();
            return;
        }
        if (i == 6) {
            C0711he c0711he = (C0711he) obj;
            c0711he.getClass();
            if (c1423sy.f10609Y.equals(c0711he)) {
                return;
            }
            if (c1423sy.f10641v != null) {
                c1423sy.f10609Y.getClass();
            }
            c1423sy.f10609Y = c0711he;
            return;
        }
        if (i == 12) {
            if (z42.f13274a >= 23) {
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                if (audioDeviceInfo == null) {
                    ay0Var = null;
                } else {
                    c1423sy.getClass();
                    ay0Var = new ay0(audioDeviceInfo, 7);
                }
                c1423sy.f10610Z = ay0Var;
                C0130cc c0130cc2 = c1423sy.f10643x;
                if (c0130cc2 != null) {
                    c0130cc2.m1210b(audioDeviceInfo);
                }
                AudioTrack audioTrack = c1423sy.f10641v;
                if (audioTrack != null) {
                    ay0 ay0Var2 = c1423sy.f10610Z;
                    audioTrack.setPreferredDevice(ay0Var2 != null ? (AudioDeviceInfo) ay0Var2.f1096b : null);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.f23U0 = ((Integer) obj).intValue();
            z01 z01Var = this.f3970P;
            if (z01Var != null && z42.f13274a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f23U0));
                z01Var.mo4172i(bundle);
                return;
            }
            return;
        }
        if (i == 9) {
            obj.getClass();
            c1423sy.f10588D = ((Boolean) obj).booleanValue();
            C1162ny c1162ny = new C1162ny(c1423sy.m6168x() ? td1.f10843d : c1423sy.f10587C, -9223372036854775807L, -9223372036854775807L);
            if (c1423sy.m6160o()) {
                c1423sy.f10585A = c1162ny;
                return;
            } else {
                c1423sy.f10586B = c1162ny;
                return;
            }
        }
        if (i != 10) {
            if (i == 11) {
                this.f3965K = (g80) obj;
                return;
            }
            return;
        }
        obj.getClass();
        int iIntValue = ((Integer) obj).intValue();
        if (c1423sy.f10608X != iIntValue) {
            c1423sy.f10608X = iIntValue;
            c1423sy.f10607W = iIntValue != 0;
            c1423sy.m6152g();
        }
        if (z42.f13274a < 35 || (c1174o9 = this.f13K0) == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) c1174o9.f7701d;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            c1174o9.f7701d = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(iIntValue, r20.f9658a, new gw0(c1174o9));
        c1174o9.f7701d = loudnessCodecControllerCreate;
        Iterator it = ((HashSet) c1174o9.f7700c).iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    @Override // p000.x01
    /* JADX INFO: renamed from: e */
    public final td1 mo30e() {
        return this.f12J0.f10587C;
    }

    @Override // p000.g11
    /* JADX INFO: renamed from: e0 */
    public final void mo31e0() {
        this.f12J0.f10596L = true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    @Override // p000.g11
    /* JADX INFO: renamed from: i0 */
    public final boolean mo33i0(long j, long j2, z01 z01Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, be0 be0Var) throws t70 {
        int i4;
        int i5;
        byteBuffer.getClass();
        if (this.f18P0 != null && (i2 & 2) != 0) {
            z01Var.getClass();
            z01Var.mo4168d(i);
            return true;
        }
        C1423sy c1423sy = this.f12J0;
        if (z) {
            if (z01Var != null) {
                z01Var.mo4168d(i);
            }
            this.f3954C0.f10575f += i3;
            c1423sy.f10596L = true;
            return true;
        }
        try {
            if (!c1423sy.m6157l(byteBuffer, j3, i3)) {
                return false;
            }
            if (z01Var != null) {
                z01Var.mo4168d(i);
            }
            this.f3954C0.f10574e += i3;
            return true;
        } catch (C1364rc e) {
            be0 be0Var2 = this.f17O0;
            if (this.f3992l0) {
                xk1 xk1Var = this.f5809d;
                xk1Var.getClass();
                if (xk1Var.f12633a != 0) {
                    i5 = 5004;
                } else {
                    i5 = 5001;
                }
            } else {
                i5 = 5001;
            }
            throw m3830g(e, be0Var2, e.f9881b, i5);
        } catch (C1438tc e2) {
            if (this.f3992l0) {
                xk1 xk1Var2 = this.f5809d;
                xk1Var2.getClass();
                if (xk1Var2.f12633a != 0) {
                    i4 = 5003;
                } else {
                    i4 = 5002;
                }
            } else {
                i4 = 5002;
            }
            throw m3830g(e2, be0Var, e2.f10824b, i4);
        }
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: j */
    public final String mo34j() {
        return "MediaCodecAudioRenderer";
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: l */
    public final boolean mo35l() {
        if (!this.f4008y0) {
            return false;
        }
        C1423sy c1423sy = this.f12J0;
        if (c1423sy.m6160o()) {
            return c1423sy.f10603S && !c1423sy.m6158m();
        }
        return true;
    }

    @Override // p000.g11
    /* JADX INFO: renamed from: l0 */
    public final void mo36l0() throws t70 {
        try {
            C1423sy c1423sy = this.f12J0;
            if (!c1423sy.f10603S && c1423sy.m6160o() && c1423sy.m6151f()) {
                c1423sy.m6163s();
                c1423sy.f10603S = true;
            }
        } catch (C1438tc e) {
            throw m3830g(e, e.f10825c, e.f10824b, this.f3992l0 ? 5003 : 5002);
        }
    }

    @Override // p000.g11, p000.AbstractC0828kh
    /* JADX INFO: renamed from: n */
    public final boolean mo37n() {
        return this.f12J0.m6158m() || super.mo37n();
    }

    @Override // p000.g11, p000.AbstractC0828kh
    /* JADX INFO: renamed from: o */
    public final void mo38o() {
        C1290pc c1290pc = this.f11I0;
        this.f21S0 = true;
        this.f17O0 = null;
        try {
            this.f12J0.m6152g();
            try {
                super.mo38o();
            } finally {
                c1290pc.m5249a(this.f3954C0);
            }
        } catch (Throwable th) {
            try {
                super.mo38o();
                throw th;
            } finally {
                c1290pc.m5249a(this.f3954C0);
            }
        }
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: p */
    public final void mo39p(boolean z, boolean z2) {
        C1422sx c1422sx = new C1422sx();
        this.f3954C0 = c1422sx;
        C1290pc c1290pc = this.f11I0;
        Handler handler = c1290pc.f8839a;
        int i = 0;
        if (handler != null) {
            handler.post(new RunnableC1140nc(c1290pc, c1422sx, i));
        }
        xk1 xk1Var = this.f5809d;
        xk1Var.getClass();
        boolean z3 = xk1Var.f12634b;
        C1423sy c1423sy = this.f12J0;
        if (z3) {
            ki0.m3864h(c1423sy.f10607W);
            if (!c1423sy.f10612a0) {
                c1423sy.f10612a0 = true;
                c1423sy.m6152g();
            }
        } else if (c1423sy.f10612a0) {
            c1423sy.f10612a0 = false;
            c1423sy.m6152g();
        }
        ye1 ye1Var = this.f5811f;
        ye1Var.getClass();
        c1423sy.f10636q = ye1Var;
        xy1 xy1Var = this.f5812g;
        xy1Var.getClass();
        c1423sy.f10623g.f12528I = xy1Var;
    }

    @Override // p000.g11, p000.AbstractC0828kh
    /* JADX INFO: renamed from: q */
    public final void mo40q(long j, boolean z) {
        super.mo40q(j, z);
        this.f12J0.m6152g();
        this.f19Q0 = j;
        this.f22T0 = false;
        this.f20R0 = true;
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: r */
    public final void mo41r() {
        C1174o9 c1174o9;
        C0013ac c0013ac;
        C0130cc c0130cc = this.f12J0.f10643x;
        if (c0130cc != null) {
            Context context = c0130cc.f1745a;
            if (c0130cc.f1754j) {
                c0130cc.f1751g = null;
                if (z42.f13274a >= 23 && (c0013ac = c0130cc.f1748d) != null) {
                    AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                    audioManager.getClass();
                    audioManager.unregisterAudioDeviceCallback(c0013ac);
                }
                context.unregisterReceiver(c0130cc.f1749e);
                C0094bc c0094bc = c0130cc.f1750f;
                if (c0094bc != null) {
                    c0094bc.f1286a.unregisterContentObserver(c0094bc);
                }
                c0130cc.f1754j = false;
            }
        }
        if (z42.f13274a < 35 || (c1174o9 = this.f13K0) == null) {
            return;
        }
        ((HashSet) c1174o9.f7700c).clear();
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) c1174o9.f7701d;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: s */
    public final void mo42s() {
        C1423sy c1423sy = this.f12J0;
        this.f22T0 = false;
        try {
            try {
                m2890G();
                m2908k0();
                ay0 ay0Var = this.f3964J;
                if (ay0Var != null) {
                    ay0Var.m763B(null);
                }
                this.f3964J = null;
                if (this.f21S0) {
                    this.f21S0 = false;
                    c1423sy.m6165u();
                }
            } catch (Throwable th) {
                ay0 ay0Var2 = this.f3964J;
                if (ay0Var2 != null) {
                    ay0Var2.m763B(null);
                }
                this.f3964J = null;
                throw th;
            }
        } catch (Throwable th2) {
            if (this.f21S0) {
                this.f21S0 = false;
                c1423sy.m6165u();
            }
            throw th2;
        }
    }

    @Override // p000.g11
    /* JADX INFO: renamed from: s0 */
    public final boolean mo43s0(be0 be0Var) {
        xk1 xk1Var = this.f5809d;
        xk1Var.getClass();
        if (xk1Var.f12633a != 0) {
            int iM47x0 = m47x0(be0Var);
            if ((iM47x0 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                xk1 xk1Var2 = this.f5809d;
                xk1Var2.getClass();
                if (xk1Var2.f12633a == 2 || (iM47x0 & 1024) != 0 || (be0Var.f1320F == 0 && be0Var.f1321G == 0)) {
                    return true;
                }
            }
        }
        return this.f12J0.m6154i(be0Var) != 0;
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: t */
    public final void mo44t() {
        this.f12J0.m6162r();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    @Override // p000.g11
    /* JADX INFO: renamed from: t0 */
    public final int mo45t0(f40 f40Var, be0 be0Var) {
        int iM47x0;
        kk1 kk1VarM4354g;
        boolean z;
        boolean z2;
        int iM3828f = AbstractC0828kh.m3828f(1, 0, 0, 0);
        String str = be0Var.f1341n;
        String str2 = be0Var.f1341n;
        if (!v51.m6578h(str)) {
            return AbstractC0828kh.m3828f(0, 0, 0, 0);
        }
        int i = be0Var.f1326L;
        boolean z3 = i != 0;
        boolean z4 = i == 0 || i == 2;
        int i2 = 8;
        C1423sy c1423sy = this.f12J0;
        if (z4) {
            if (z3) {
                List listM4352e = m11.m4352e("audio/raw", false, false);
                if ((listM4352e.isEmpty() ? null : (c11) listM4352e.get(0)) == null) {
                    iM47x0 = 0;
                }
            }
            iM47x0 = m47x0(be0Var);
            if (c1423sy.m6154i(be0Var) != 0) {
                return AbstractC0828kh.m3828f(4, 8, 32, iM47x0);
            }
        } else {
            iM47x0 = 0;
        }
        if ("audio/raw".equals(str2) && c1423sy.m6154i(be0Var) == 0) {
            return iM3828f;
        }
        int i3 = be0Var.f1317C;
        int i4 = be0Var.f1318D;
        ae0 ae0Var = new ae0();
        ae0Var.f197m = v51.m6582l("audio/raw");
        ae0Var.f175B = i3;
        ae0Var.f176C = i4;
        ae0Var.f177D = 2;
        if (c1423sy.m6154i(new be0(ae0Var)) == 0) {
            return iM3828f;
        }
        if (str2 == null) {
            kk1VarM4354g = kk1.f5896e;
        } else if (c1423sy.m6154i(be0Var) != 0) {
            List listM4352e2 = m11.m4352e("audio/raw", false, false);
            c11 c11Var = listM4352e2.isEmpty() ? null : (c11) listM4352e2.get(0);
            if (c11Var != null) {
                kk1VarM4354g = qm0.m5570t(c11Var);
            } else {
                kk1VarM4354g = m11.m4354g(f40Var, be0Var, false, false);
            }
        } else {
            kk1VarM4354g = m11.m4354g(f40Var, be0Var, false, false);
        }
        if (kk1VarM4354g.isEmpty()) {
            return iM3828f;
        }
        if (!z4) {
            return AbstractC0828kh.m3828f(2, 0, 0, 0);
        }
        c11 c11Var2 = (c11) kk1VarM4354g.get(0);
        boolean zM1109d = c11Var2.m1109d(be0Var);
        if (!zM1109d) {
            int i5 = 1;
            while (true) {
                if (i5 >= kk1VarM4354g.f5898d) {
                    z = zM1109d;
                    z2 = true;
                    break;
                }
                c11 c11Var3 = (c11) kk1VarM4354g.get(i5);
                if (c11Var3.m1109d(be0Var)) {
                    z2 = false;
                    c11Var2 = c11Var3;
                    z = true;
                    break;
                }
                i5++;
            }
        } else {
            z = zM1109d;
            z2 = true;
            break;
        }
        int i6 = z ? 4 : 3;
        if (z && c11Var2.m1110e(be0Var)) {
            i2 = 16;
        }
        return iM47x0 | (c11Var2.f1620g ? 64 : 0) | i6 | i2 | 32 | (z2 ? 128 : 0);
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: u */
    public final void mo46u() {
        m49z0();
        C1423sy c1423sy = this.f12J0;
        c1423sy.f10606V = false;
        if (c1423sy.m6160o()) {
            C1586xc c1586xc = c1423sy.f10623g;
            c1586xc.m6911d();
            if (c1586xc.f12552x == -9223372036854775807L) {
                C1549wc c1549wc = c1586xc.f12533e;
                c1549wc.getClass();
                c1549wc.m6748a();
            } else {
                c1586xc.f12554z = c1586xc.m6909b();
                if (!C1423sy.m6145p(c1423sy.f10641v)) {
                    return;
                }
            }
            c1423sy.f10641v.pause();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final int m47x0(be0 be0Var) {
        C0746ic c0746icM6153h = this.f12J0.m6153h(be0Var);
        if (!c0746icM6153h.f4930a) {
            return 0;
        }
        int i = c0746icM6153h.f4931b ? 1536 : UserVerificationMethods.USER_VERIFY_NONE;
        return c0746icM6153h.f4932c ? i | 2048 : i;
    }

    /* JADX INFO: renamed from: y0 */
    public final int m48y0(c11 c11Var, be0 be0Var) {
        int i;
        if (!"OMX.google.raw.decoder".equals(c11Var.f1614a) || (i = z42.f13274a) >= 24 || (i == 23 && z42.m7215C(this.f10H0))) {
            return be0Var.f1342o;
        }
        return -1;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m49z0() {
        long j;
        long jMax;
        long j2;
        boolean zMo35l = mo35l();
        C1423sy c1423sy = this.f12J0;
        C1174o9 c1174o9 = c1423sy.f10613b;
        if (!c1423sy.m6160o() || c1423sy.f10597M) {
            j = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(c1423sy.f10623g.m6908a(zMo35l), z42.m7220H(c1423sy.f10639t.f7135e, c1423sy.m6156k()));
            ArrayDeque arrayDeque = c1423sy.f10625h;
            while (!arrayDeque.isEmpty() && jMin >= ((C1162ny) arrayDeque.getFirst()).f7584c) {
                c1423sy.f10586B = (C1162ny) arrayDeque.remove();
            }
            C1162ny c1162ny = c1423sy.f10586B;
            long jM7222J = jMin - c1162ny.f7584c;
            long jM7243q = z42.m7243q(jM7222J, c1162ny.f7582a.f10844a);
            if (arrayDeque.isEmpty()) {
                cu1 cu1Var = (cu1) c1174o9.f7701d;
                if (!cu1Var.isActive()) {
                    j = Long.MIN_VALUE;
                } else if (cu1Var.f2640o >= 1024) {
                    long j3 = cu1Var.f2639n;
                    bu1 bu1Var = cu1Var.f2635j;
                    bu1Var.getClass();
                    long j4 = j3 - ((long) ((bu1Var.f1543k * bu1Var.f1534b) * 2));
                    int i = cu1Var.f2633h.f5742a;
                    int i2 = cu1Var.f2632g.f5742a;
                    j = Long.MIN_VALUE;
                    long j5 = cu1Var.f2640o;
                    jM7222J = i == i2 ? z42.m7222J(jM7222J, j4, j5, RoundingMode.DOWN) : z42.m7222J(jM7222J, j4 * ((long) i), j5 * ((long) i2), RoundingMode.DOWN);
                } else {
                    j = Long.MIN_VALUE;
                    jM7222J = (long) (((double) cu1Var.f2628c) * jM7222J);
                }
                C1162ny c1162ny2 = c1423sy.f10586B;
                j2 = c1162ny2.f7583b + jM7222J;
                c1162ny2.f7585d = jM7222J - jM7243q;
            } else {
                j = Long.MIN_VALUE;
                C1162ny c1162ny3 = c1423sy.f10586B;
                j2 = c1162ny3.f7583b + jM7243q + c1162ny3.f7585d;
            }
            long j6 = ((ys1) c1174o9.f7700c).f13139q;
            jMax = z42.m7220H(c1423sy.f10639t.f7135e, j6) + j2;
            long j7 = c1423sy.f10624g0;
            if (j6 > j7) {
                long jM7220H = z42.m7220H(c1423sy.f10639t.f7135e, j6 - j7);
                c1423sy.f10624g0 = j6;
                c1423sy.f10626h0 += jM7220H;
                if (c1423sy.f10628i0 == null) {
                    c1423sy.f10628i0 = new Handler(Looper.myLooper());
                }
                c1423sy.f10628i0.removeCallbacksAndMessages(null);
                c1423sy.f10628i0.postDelayed(new RunnableC1430t4(c1423sy, 11), 100L);
            }
        }
        if (jMax != j) {
            if (!this.f20R0) {
                jMax = Math.max(this.f19Q0, jMax);
            }
            this.f19Q0 = jMax;
            this.f20R0 = false;
        }
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: i */
    public final x01 mo32i() {
        return this;
    }
}

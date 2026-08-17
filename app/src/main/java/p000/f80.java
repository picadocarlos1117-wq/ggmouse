package p000;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import com.example.ssmousepro.ads.RewardedVideoActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class f80 implements ExoPlayer, ee1 {

    /* JADX INFO: renamed from: A */
    public final C1548wb f3658A;

    /* JADX INFO: renamed from: B */
    public final C0672gc f3659B;

    /* JADX INFO: renamed from: C */
    public final pu0 f3660C;

    /* JADX INFO: renamed from: D */
    public final ax0 f3661D;

    /* JADX INFO: renamed from: E */
    public final long f3662E;

    /* JADX INFO: renamed from: F */
    public int f3663F;

    /* JADX INFO: renamed from: G */
    public boolean f3664G;

    /* JADX INFO: renamed from: H */
    public int f3665H;

    /* JADX INFO: renamed from: I */
    public int f3666I;

    /* JADX INFO: renamed from: J */
    public boolean f3667J;

    /* JADX INFO: renamed from: K */
    public final lq1 f3668K;

    /* JADX INFO: renamed from: L */
    public vs1 f3669L;

    /* JADX INFO: renamed from: M */
    public final v70 f3670M;

    /* JADX INFO: renamed from: N */
    public ae1 f3671N;

    /* JADX INFO: renamed from: O */
    public d21 f3672O;

    /* JADX INFO: renamed from: P */
    public Object f3673P;

    /* JADX INFO: renamed from: Q */
    public Surface f3674Q;

    /* JADX INFO: renamed from: R */
    public SurfaceHolder f3675R;

    /* JADX INFO: renamed from: S */
    public lu1 f3676S;

    /* JADX INFO: renamed from: T */
    public boolean f3677T;

    /* JADX INFO: renamed from: U */
    public TextureView f3678U;

    /* JADX INFO: renamed from: V */
    public final int f3679V;

    /* JADX INFO: renamed from: W */
    public gt1 f3680W;

    /* JADX INFO: renamed from: X */
    public final C1474ub f3681X;

    /* JADX INFO: renamed from: Y */
    public final float f3682Y;

    /* JADX INFO: renamed from: Z */
    public boolean f3683Z;

    /* JADX INFO: renamed from: a0 */
    public C1048kv f3685a0;

    /* JADX INFO: renamed from: b */
    public final j22 f3686b;

    /* JADX INFO: renamed from: b0 */
    public final boolean f3687b0;

    /* JADX INFO: renamed from: c */
    public final ae1 f3688c;

    /* JADX INFO: renamed from: c0 */
    public boolean f3689c0;

    /* JADX INFO: renamed from: d0 */
    public final int f3691d0;

    /* JADX INFO: renamed from: e */
    public final Context f3692e;

    /* JADX INFO: renamed from: e0 */
    public m62 f3693e0;

    /* JADX INFO: renamed from: f */
    public final f80 f3694f;

    /* JADX INFO: renamed from: f0 */
    public d21 f3695f0;

    /* JADX INFO: renamed from: g */
    public final AbstractC0828kh[] f3696g;

    /* JADX INFO: renamed from: g0 */
    public sd1 f3697g0;

    /* JADX INFO: renamed from: h */
    public final d10 f3698h;

    /* JADX INFO: renamed from: h0 */
    public int f3699h0;

    /* JADX INFO: renamed from: i */
    public final zy1 f3700i;

    /* JADX INFO: renamed from: i0 */
    public long f3701i0;

    /* JADX INFO: renamed from: j */
    public final z70 f3702j;

    /* JADX INFO: renamed from: k */
    public final l80 f3703k;

    /* JADX INFO: renamed from: l */
    public final au0 f3704l;

    /* JADX INFO: renamed from: m */
    public final CopyOnWriteArraySet f3705m;

    /* JADX INFO: renamed from: n */
    public final r02 f3706n;

    /* JADX INFO: renamed from: o */
    public final ArrayList f3707o;

    /* JADX INFO: renamed from: p */
    public final boolean f3708p;

    /* JADX INFO: renamed from: q */
    public final p21 f3709q;

    /* JADX INFO: renamed from: r */
    public final C0808jy f3710r;

    /* JADX INFO: renamed from: s */
    public final Looper f3711s;

    /* JADX INFO: renamed from: t */
    public final C1534vy f3712t;

    /* JADX INFO: renamed from: u */
    public final long f3713u;

    /* JADX INFO: renamed from: v */
    public final long f3714v;

    /* JADX INFO: renamed from: w */
    public final long f3715w;

    /* JADX INFO: renamed from: x */
    public final xy1 f3716x;

    /* JADX INFO: renamed from: y */
    public final c80 f3717y;

    /* JADX INFO: renamed from: z */
    public final d80 f3718z;

    /* JADX INFO: renamed from: a */
    public final s02 f3684a = new s02();

    /* JADX INFO: renamed from: d */
    public final C0073as f3690d = new C0073as();

    static {
        a21.m54a("media3.exoplayer");
    }

    public f80(u70 u70Var) {
        boolean zEquals;
        try {
            AbstractC1337qm.m5508C("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.5.1] [" + z42.f13278e + "]");
            this.f3692e = u70Var.f11147a.getApplicationContext();
            this.f3710r = new C0808jy(u70Var.f11148b);
            this.f3691d0 = u70Var.f11154h;
            this.f3681X = u70Var.f11155i;
            this.f3679V = u70Var.f11156j;
            this.f3683Z = false;
            this.f3662E = u70Var.f11164r;
            c80 c80Var = new c80(this);
            this.f3717y = c80Var;
            this.f3718z = new d80();
            Handler handler = new Handler(u70Var.f11153g);
            AbstractC0828kh[] abstractC0828khArrM2269j = ((C0558d8) u70Var.f11149c.get()).m2269j(handler, c80Var, c80Var, c80Var, c80Var);
            this.f3696g = abstractC0828khArrM2269j;
            ki0.m3864h(abstractC0828khArrM2269j.length > 0);
            this.f3698h = (d10) u70Var.f11151e.get();
            this.f3709q = (p21) u70Var.f11150d.get();
            this.f3712t = (C1534vy) u70Var.f11152f.get();
            this.f3708p = u70Var.f11157k;
            this.f3668K = u70Var.f11158l;
            this.f3713u = u70Var.f11159m;
            this.f3714v = u70Var.f11160n;
            this.f3715w = u70Var.f11161o;
            Looper looper = u70Var.f11153g;
            this.f3711s = looper;
            xy1 xy1Var = u70Var.f11148b;
            this.f3716x = xy1Var;
            this.f3694f = this;
            this.f3704l = new au0(looper, xy1Var, new z70(this));
            this.f3705m = new CopyOnWriteArraySet();
            this.f3707o = new ArrayList();
            this.f3669L = new vs1();
            this.f3670M = v70.f11572a;
            this.f3686b = new j22(new xk1[abstractC0828khArrM2269j.length], new n80[abstractC0828khArrM2269j.length], l22.f6156b, null);
            this.f3706n = new r02();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i = 0; i < 20; i++) {
                int i2 = iArr[i];
                ki0.m3864h(!false);
                sparseBooleanArray.append(i2, true);
            }
            this.f3698h.getClass();
            ki0.m3864h(!false);
            sparseBooleanArray.append(29, true);
            ki0.m3864h(!false);
            eb0 eb0Var = new eb0(sparseBooleanArray);
            this.f3688c = new ae1(eb0Var);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i3 = 0; i3 < eb0Var.f3306a.size(); i3++) {
                int iM2564a = eb0Var.m2564a(i3);
                ki0.m3864h(!false);
                sparseBooleanArray2.append(iM2564a, true);
            }
            ki0.m3864h(!false);
            sparseBooleanArray2.append(4, true);
            ki0.m3864h(!false);
            sparseBooleanArray2.append(10, true);
            ki0.m3864h(!false);
            this.f3671N = new ae1(new eb0(sparseBooleanArray2));
            this.f3700i = this.f3716x.m6981a(this.f3711s, null);
            z70 z70Var = new z70(this);
            this.f3702j = z70Var;
            this.f3697g0 = sd1.m6085i(this.f3686b);
            this.f3710r.m3725l(this.f3694f, this.f3711s);
            this.f3703k = new l80(this.f3696g, this.f3698h, this.f3686b, new C1535vz(), this.f3712t, this.f3663F, this.f3664G, this.f3710r, this.f3668K, u70Var.f11162p, u70Var.f11163q, this.f3711s, this.f3716x, z70Var, z42.f13274a < 31 ? new ye1(u70Var.f11167u) : hp0.m3202L(this.f3692e, this, u70Var.f11165s, u70Var.f11167u), this.f3670M);
            this.f3682Y = 1.0f;
            this.f3663F = 0;
            d21 d21Var = d21.f2726B;
            this.f3672O = d21Var;
            this.f3695f0 = d21Var;
            this.f3699h0 = -1;
            AudioManager audioManager = (AudioManager) this.f3692e.getSystemService("audio");
            int iGenerateAudioSessionId = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            this.f3685a0 = C1048kv.f6036b;
            this.f3687b0 = true;
            C0808jy c0808jy = this.f3710r;
            au0 au0Var = this.f3704l;
            c0808jy.getClass();
            au0Var.m710a(c0808jy);
            C1534vy c1534vy = this.f3712t;
            Handler handler2 = new Handler(this.f3711s);
            C0808jy c0808jy2 = this.f3710r;
            c1534vy.getClass();
            c0808jy2.getClass();
            ay0 ay0Var = c1534vy.f11845b;
            ay0Var.getClass();
            CopyOnWriteArrayList<C1516vg> copyOnWriteArrayList = (CopyOnWriteArrayList) ay0Var.f1096b;
            for (C1516vg c1516vg : copyOnWriteArrayList) {
                if (c1516vg.f11653b == c0808jy2) {
                    c1516vg.f11654c = true;
                    copyOnWriteArrayList.remove(c1516vg);
                }
            }
            ((CopyOnWriteArrayList) ay0Var.f1096b).add(new C1516vg(handler2, c0808jy2));
            this.f3705m.add(this.f3717y);
            C1548wb c1548wb = new C1548wb(u70Var.f11147a, handler, this.f3717y);
            this.f3658A = c1548wb;
            c1548wb.m6740a();
            this.f3659B = new C0672gc(u70Var.f11147a, handler, this.f3717y);
            RewardedVideoActivity rewardedVideoActivity = u70Var.f11147a;
            pu0 pu0Var = new pu0(17);
            rewardedVideoActivity.getApplicationContext();
            this.f3660C = pu0Var;
            this.f3661D = new ax0(u70Var.f11147a);
            this.f3693e0 = m62.f6671d;
            this.f3680W = gt1.f4318c;
            d10 d10Var = this.f3698h;
            C1474ub c1474ub = this.f3681X;
            synchronized (d10Var.f2705c) {
                zEquals = d10Var.f2711i.equals(c1474ub);
                d10Var.f2711i = c1474ub;
            }
            if (!zEquals) {
                d10Var.m2172d();
            }
            m2743D(1, 10, Integer.valueOf(iGenerateAudioSessionId));
            m2743D(2, 10, Integer.valueOf(iGenerateAudioSessionId));
            m2743D(1, 3, this.f3681X);
            m2743D(2, 4, Integer.valueOf(this.f3679V));
            m2743D(2, 5, 0);
            m2743D(1, 9, Boolean.valueOf(this.f3683Z));
            m2743D(2, 7, this.f3718z);
            m2743D(6, 8, this.f3718z);
            m2743D(-1, 16, Integer.valueOf(this.f3691d0));
            this.f3690d.m699a();
        } catch (Throwable th) {
            this.f3690d.m699a();
            throw th;
        }
    }

    /* JADX INFO: renamed from: p */
    public static long m2739p(sd1 sd1Var) {
        s02 s02Var = new s02();
        r02 r02Var = new r02();
        sd1Var.f10371a.mo2973g(sd1Var.f10372b.f9309a, r02Var);
        long j = sd1Var.f10373c;
        return j == -9223372036854775807L ? sd1Var.f10371a.mo1058m(r02Var.f9651c, s02Var, 0L).f10190j : r02Var.f9653e + j;
    }

    /* JADX INFO: renamed from: A */
    public final void m2740A(int i, boolean z, long j) {
        m2753N();
        if (i == -1) {
            return;
        }
        ki0.m3857c(i >= 0);
        t02 t02Var = this.f3697g0.f10371a;
        if (t02Var.m6176p() || i < t02Var.mo1059o()) {
            C0808jy c0808jy = this.f3710r;
            if (!c0808jy.f5596n) {
                C1542w5 c1542w5M3719f = c0808jy.m3719f();
                c0808jy.f5596n = true;
                c0808jy.m3724k(c1542w5M3719f, -1, new C0583dy(19));
            }
            this.f3665H++;
            if (m2772t()) {
                AbstractC1337qm.m5542i0("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                i80 i80Var = new i80(this.f3697g0);
                i80Var.m3386e(1);
                f80 f80Var = this.f3702j.f13300a;
                f80Var.f3700i.m7387c(new RunnableC1467u4(7, f80Var, i80Var));
                return;
            }
            sd1 sd1VarM6092g = this.f3697g0;
            int i2 = sd1VarM6092g.f10375e;
            if (i2 == 3 || (i2 == 4 && !t02Var.m6176p())) {
                sd1VarM6092g = this.f3697g0.m6092g(2);
            }
            int iM2760g = m2760g();
            sd1 sd1VarM2773u = m2773u(sd1VarM6092g, t02Var, m2774v(t02Var, i, j));
            this.f3703k.f6246n.m7386a(3, new k80(t02Var, i, z42.m7216D(j))).m7164b();
            m2751L(sd1VarM2773u, 0, true, 1, m2762i(sd1VarM2773u), iM2760g, z);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m2741B() {
        int iMo2972e;
        int iMo2972e2;
        if (m2763j().m6176p() || m2772t()) {
            m2753N();
            return;
        }
        t02 t02VarM2763j = m2763j();
        if (t02VarM2763j.m6176p()) {
            iMo2972e = -1;
        } else {
            int iM2760g = m2760g();
            m2753N();
            int i = this.f3663F;
            if (i == 1) {
                i = 0;
            }
            m2753N();
            iMo2972e = t02VarM2763j.mo2972e(iM2760g, i, this.f3664G);
        }
        if (iMo2972e == -1) {
            if (m2771s()) {
                t02 t02VarM2763j2 = m2763j();
                if (!t02VarM2763j2.m6176p() && t02VarM2763j2.mo1058m(m2760g(), this.f3684a, 0L).f10187g) {
                    m2740A(m2760g(), false, -9223372036854775807L);
                    return;
                }
            }
            m2753N();
            return;
        }
        t02 t02VarM2763j3 = m2763j();
        if (t02VarM2763j3.m6176p()) {
            iMo2972e2 = -1;
        } else {
            int iM2760g2 = m2760g();
            m2753N();
            int i2 = this.f3663F;
            if (i2 == 1) {
                i2 = 0;
            }
            m2753N();
            iMo2972e2 = t02VarM2763j3.mo2972e(iM2760g2, i2, this.f3664G);
        }
        if (iMo2972e2 == -1) {
            m2753N();
        } else if (iMo2972e2 == m2760g()) {
            m2740A(m2760g(), true, -9223372036854775807L);
        } else {
            m2740A(iMo2972e2, false, -9223372036854775807L);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m2742C() {
        int iMo2974k;
        int iMo2974k2;
        int iMo2974k3;
        if (m2763j().m6176p() || m2772t()) {
            m2753N();
            return;
        }
        t02 t02VarM2763j = m2763j();
        if (t02VarM2763j.m6176p()) {
            iMo2974k = -1;
        } else {
            int iM2760g = m2760g();
            m2753N();
            int i = this.f3663F;
            if (i == 1) {
                i = 0;
            }
            m2753N();
            iMo2974k = t02VarM2763j.mo2974k(iM2760g, i, this.f3664G);
        }
        boolean z = iMo2974k != -1;
        if (m2771s()) {
            t02 t02VarM2763j2 = m2763j();
            if (t02VarM2763j2.m6176p() || !t02VarM2763j2.mo1058m(m2760g(), this.f3684a, 0L).f10186f) {
                if (!z) {
                    m2753N();
                    return;
                }
                t02 t02VarM2763j3 = m2763j();
                if (t02VarM2763j3.m6176p()) {
                    iMo2974k3 = -1;
                } else {
                    int iM2760g2 = m2760g();
                    m2753N();
                    int i2 = this.f3663F;
                    if (i2 == 1) {
                        i2 = 0;
                    }
                    m2753N();
                    iMo2974k3 = t02VarM2763j3.mo2974k(iM2760g2, i2, this.f3664G);
                }
                if (iMo2974k3 == -1) {
                    m2753N();
                    return;
                } else if (iMo2974k3 == m2760g()) {
                    m2740A(m2760g(), true, -9223372036854775807L);
                    return;
                } else {
                    m2740A(iMo2974k3, false, -9223372036854775807L);
                    return;
                }
            }
        }
        if (z) {
            long jM2761h = m2761h();
            m2753N();
            if (jM2761h <= this.f3715w) {
                t02 t02VarM2763j4 = m2763j();
                if (t02VarM2763j4.m6176p()) {
                    iMo2974k2 = -1;
                } else {
                    int iM2760g3 = m2760g();
                    m2753N();
                    int i3 = this.f3663F;
                    if (i3 == 1) {
                        i3 = 0;
                    }
                    m2753N();
                    iMo2974k2 = t02VarM2763j4.mo2974k(iM2760g3, i3, this.f3664G);
                }
                if (iMo2974k2 == -1) {
                    m2753N();
                    return;
                } else if (iMo2974k2 == m2760g()) {
                    m2740A(m2760g(), true, -9223372036854775807L);
                    return;
                } else {
                    m2740A(iMo2974k2, false, -9223372036854775807L);
                    return;
                }
            }
        }
        m2740A(m2760g(), false, 0L);
    }

    /* JADX INFO: renamed from: D */
    public final void m2743D(int i, int i2, Object obj) {
        for (AbstractC0828kh abstractC0828kh : this.f3696g) {
            if (i == -1 || abstractC0828kh.f5807b == i) {
                af1 af1VarM2756c = m2756c(abstractC0828kh);
                ki0.m3864h(!af1VarM2756c.f222g);
                af1VarM2756c.f219d = i2;
                ki0.m3864h(!af1VarM2756c.f222g);
                af1VarM2756c.f220e = obj;
                af1VarM2756c.m147c();
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m2744E(SurfaceHolder surfaceHolder) {
        this.f3677T = false;
        this.f3675R = surfaceHolder;
        surfaceHolder.addCallback(this.f3717y);
        Surface surface = this.f3675R.getSurface();
        if (surface == null || !surface.isValid()) {
            m2775w(0, 0);
        } else {
            Rect surfaceFrame = this.f3675R.getSurfaceFrame();
            m2775w(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m2745F(boolean z) {
        m2753N();
        int iM2954c = this.f3659B.m2954c(m2768o(), z);
        m2750K(iM2954c, iM2954c == -1 ? 2 : 1, z);
    }

    /* JADX INFO: renamed from: G */
    public final void m2746G(int i) {
        m2753N();
        if (this.f3663F != i) {
            this.f3663F = i;
            zy1 zy1Var = this.f3703k.f6246n;
            zy1Var.getClass();
            yy1 yy1VarM7385b = zy1.m7385b();
            yy1VarM7385b.f13169a = zy1Var.f13615a.obtainMessage(11, i, 0);
            yy1VarM7385b.m7164b();
            C0657fy c0657fy = new C0657fy(i);
            au0 au0Var = this.f3704l;
            au0Var.m712c(8, c0657fy);
            m2749J();
            au0Var.m711b();
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m2747H(h22 h22Var) {
        m2753N();
        d10 d10Var = this.f3698h;
        d10Var.getClass();
        if (h22Var.equals(d10Var.m2171c())) {
            return;
        }
        if (h22Var instanceof x00) {
            d10Var.m2173g((x00) h22Var);
        }
        w00 w00Var = new w00(d10Var.m2171c());
        w00Var.m2923b(h22Var);
        d10Var.m2173g(new x00(w00Var));
        this.f3704l.m714e(19, new C1521vl(h22Var, 10));
    }

    /* JADX INFO: renamed from: I */
    public final void m2748I(Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (AbstractC0828kh abstractC0828kh : this.f3696g) {
            if (abstractC0828kh.f5807b == 2) {
                af1 af1VarM2756c = m2756c(abstractC0828kh);
                ki0.m3864h(!af1VarM2756c.f222g);
                af1VarM2756c.f219d = 1;
                ki0.m3864h(true ^ af1VarM2756c.f222g);
                af1VarM2756c.f220e = obj;
                af1VarM2756c.m147c();
                arrayList.add(af1VarM2756c);
            }
        }
        Object obj2 = this.f3673P;
        if (obj2 != null && obj2 != obj) {
            try {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    ((af1) obj3).m145a(this.f3662E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj4 = this.f3673P;
            Surface surface = this.f3674Q;
            if (obj4 == surface) {
                surface.release();
                this.f3674Q = null;
            }
        }
        this.f3673P = obj;
        if (z) {
            t70 t70Var = new t70(2, new C0656fx("Detaching surface timed out."), 1003);
            sd1 sd1Var = this.f3697g0;
            sd1 sd1VarM6087b = sd1Var.m6087b(sd1Var.f10372b);
            sd1VarM6087b.f10387q = sd1VarM6087b.f10389s;
            sd1VarM6087b.f10388r = 0L;
            sd1 sd1VarM6090e = sd1VarM6087b.m6092g(1).m6090e(t70Var);
            this.f3665H++;
            zy1 zy1Var = this.f3703k.f6246n;
            zy1Var.getClass();
            yy1 yy1VarM7385b = zy1.m7385b();
            yy1VarM7385b.f13169a = zy1Var.f13615a.obtainMessage(6);
            yy1VarM7385b.m7164b();
            m2751L(sd1VarM6090e, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m2749J() {
        int iMo2974k;
        int iMo2972e;
        ae1 ae1Var = this.f3671N;
        int i = z42.f13274a;
        f80 f80Var = this.f3694f;
        boolean zM2772t = f80Var.m2772t();
        s02 s02Var = f80Var.f3684a;
        t02 t02VarM2763j = f80Var.m2763j();
        boolean z = !t02VarM2763j.m6176p() && t02VarM2763j.mo1058m(f80Var.m2760g(), s02Var, 0L).f10186f;
        t02 t02VarM2763j2 = f80Var.m2763j();
        if (t02VarM2763j2.m6176p()) {
            iMo2974k = -1;
        } else {
            int iM2760g = f80Var.m2760g();
            f80Var.m2753N();
            int i2 = f80Var.f3663F;
            if (i2 == 1) {
                i2 = 0;
            }
            f80Var.m2753N();
            iMo2974k = t02VarM2763j2.mo2974k(iM2760g, i2, f80Var.f3664G);
        }
        boolean z2 = iMo2974k != -1;
        t02 t02VarM2763j3 = f80Var.m2763j();
        if (t02VarM2763j3.m6176p()) {
            iMo2972e = -1;
        } else {
            int iM2760g2 = f80Var.m2760g();
            f80Var.m2753N();
            int i3 = f80Var.f3663F;
            if (i3 == 1) {
                i3 = 0;
            }
            f80Var.m2753N();
            iMo2972e = t02VarM2763j3.mo2972e(iM2760g2, i3, f80Var.f3664G);
        }
        boolean z3 = iMo2972e != -1;
        boolean zM2771s = f80Var.m2771s();
        t02 t02VarM2763j4 = f80Var.m2763j();
        boolean z4 = !t02VarM2763j4.m6176p() && t02VarM2763j4.mo1058m(f80Var.m2760g(), s02Var, 0L).f10187g;
        boolean zM6176p = f80Var.m2763j().m6176p();
        pn0 pn0Var = new pn0(15);
        C1146ni c1146ni = (C1146ni) pn0Var.f8968a;
        eb0 eb0Var = this.f3688c.f211a;
        c1146ni.getClass();
        for (int i4 = 0; i4 < eb0Var.f3306a.size(); i4++) {
            c1146ni.m4550b(eb0Var.m2564a(i4));
        }
        boolean z5 = !zM2772t;
        pn0Var.m5283b(4, z5);
        pn0Var.m5283b(5, z && !zM2772t);
        pn0Var.m5283b(6, z2 && !zM2772t);
        pn0Var.m5283b(7, !zM6176p && (z2 || !zM2771s || z) && !zM2772t);
        pn0Var.m5283b(8, z3 && !zM2772t);
        pn0Var.m5283b(9, !zM6176p && (z3 || (zM2771s && z4)) && !zM2772t);
        pn0Var.m5283b(10, z5);
        pn0Var.m5283b(11, z && !zM2772t);
        pn0Var.m5283b(12, z && !zM2772t);
        ae1 ae1Var2 = new ae1(c1146ni.m4551c());
        this.f3671N = ae1Var2;
        if (ae1Var2.equals(ae1Var)) {
            return;
        }
        this.f3704l.m712c(13, new z70(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX INFO: renamed from: K */
    public final void m2750K(int i, int i2, boolean z) {
        Object r14 = (!z || i == -1) ? 0 : 1;
        int i3 = i == 0 ? 1 : 0;
        sd1 sd1Var = this.f3697g0;
        if (sd1Var.f10382l == r14 && sd1Var.f10384n == i3 && sd1Var.f10383m == i2) {
            return;
        }
        this.f3665H++;
        sd1 sd1Var2 = this.f3697g0;
        boolean z2 = sd1Var2.f10386p;
        sd1 sd1VarM6086a = sd1Var2;
        if (z2) {
            sd1VarM6086a = sd1Var2.m6086a();
        }
        sd1 sd1VarM6089d = sd1VarM6086a.m6089d(i2, i3, r14);
        int i4 = (i3 << 4) | i2;
        zy1 zy1Var = this.f3703k.f6246n;
        zy1Var.getClass();
        yy1 yy1VarM7385b = zy1.m7385b();
        yy1VarM7385b.f13169a = zy1Var.f13615a.obtainMessage(1, r14, i4);
        yy1VarM7385b.m7164b();
        m2751L(sd1VarM6089d, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: renamed from: L */
    public final void m2751L(final sd1 sd1Var, int i, boolean z, int i2, long j, int i3, boolean z2) {
        Pair pair;
        int i4;
        z11 z11Var;
        int i5;
        Object obj;
        z11 z11Var2;
        Object obj2;
        int i6;
        long j2;
        long j3;
        long jM2739p;
        long jM2739p2;
        Object obj3;
        z11 z11Var3;
        Object obj4;
        int i7;
        sd1 sd1Var2 = this.f3697g0;
        this.f3697g0 = sd1Var;
        boolean zEquals = sd1Var2.f10371a.equals(sd1Var.f10371a);
        s02 s02Var = this.f3684a;
        r02 r02Var = this.f3706n;
        t02 t02Var = sd1Var2.f10371a;
        q21 q21Var = sd1Var2.f10372b;
        t02 t02Var2 = sd1Var.f10371a;
        q21 q21Var2 = sd1Var.f10372b;
        int i8 = 0;
        if (t02Var2.m6176p() && t02Var.m6176p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (t02Var2.m6176p() != t02Var.m6176p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!t02Var.mo1058m(t02Var.mo2973g(q21Var.f9309a, r02Var).f9651c, s02Var, 0L).f10181a.equals(t02Var2.mo1058m(t02Var2.mo2973g(q21Var2.f9309a, r02Var).f9651c, s02Var, 0L).f10181a)) {
            if (z && i2 == 0) {
                i4 = 1;
            } else if (z && i2 == 1) {
                i4 = 2;
            } else {
                if (zEquals) {
                    l41.m4046o();
                    return;
                }
                i4 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
        } else if (z && i2 == 0 && q21Var.f9312d < q21Var2.f9312d) {
            pair = new Pair(Boolean.TRUE, 0);
        } else {
            pair = (z && i2 == 1 && z2) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            z11Var = sd1Var.f10371a.m6176p() ? null : sd1Var.f10371a.mo1058m(sd1Var.f10371a.mo2973g(sd1Var.f10372b.f9309a, this.f3706n).f9651c, this.f3684a, 0L).f10182b;
            this.f3695f0 = d21.f2726B;
        } else {
            z11Var = null;
        }
        if (zBooleanValue || !sd1Var2.f10380j.equals(sd1Var.f10380j)) {
            c21 c21VarM2204a = this.f3695f0.m2204a();
            List list = sd1Var.f10380j;
            for (int i9 = 0; i9 < list.size(); i9++) {
                k51 k51Var = (k51) list.get(i9);
                int i10 = 0;
                while (true) {
                    f51[] f51VarArr = k51Var.f5679a;
                    if (i10 < f51VarArr.length) {
                        f51VarArr[i10].mo2346p(c21VarM2204a);
                        i10++;
                    }
                }
            }
            this.f3695f0 = new d21(c21VarM2204a);
        }
        d21 d21VarM2754a = m2754a();
        boolean zEquals2 = d21VarM2754a.equals(this.f3672O);
        this.f3672O = d21VarM2754a;
        boolean z3 = sd1Var2.f10382l != sd1Var.f10382l;
        boolean z4 = sd1Var2.f10375e != sd1Var.f10375e;
        if (z4 || z3) {
            m2752M();
        }
        boolean z5 = sd1Var2.f10377g != sd1Var.f10377g;
        if (!zEquals) {
            this.f3704l.m712c(0, new w70(i, i8, sd1Var));
        }
        if (z) {
            r02 r02Var2 = new r02();
            if (sd1Var2.f10371a.m6176p()) {
                i5 = i3;
                obj = null;
                z11Var2 = null;
                obj2 = null;
                i6 = -1;
            } else {
                Object obj5 = sd1Var2.f10372b.f9309a;
                sd1Var2.f10371a.mo2973g(obj5, r02Var2);
                int i11 = r02Var2.f9651c;
                int iMo1054b = sd1Var2.f10371a.mo1054b(obj5);
                obj = sd1Var2.f10371a.mo1058m(i11, this.f3684a, 0L).f10181a;
                z11Var2 = this.f3684a.f10182b;
                obj2 = obj5;
                i5 = i11;
                i6 = iMo1054b;
            }
            q21 q21Var3 = sd1Var2.f10372b;
            if (i2 == 0) {
                boolean zM5438b = q21Var3.m5438b();
                q21 q21Var4 = sd1Var2.f10372b;
                if (zM5438b) {
                    jM2739p = r02Var2.m5644a(q21Var4.f9310b, q21Var4.f9311c);
                    jM2739p2 = m2739p(sd1Var2);
                } else {
                    if (q21Var4.f9313e != -1) {
                        jM2739p = m2739p(this.f3697g0);
                    } else {
                        j2 = r02Var2.f9653e;
                        j3 = r02Var2.f9652d;
                        jM2739p = j2 + j3;
                    }
                    jM2739p2 = jM2739p;
                }
            } else if (q21Var3.m5438b()) {
                jM2739p = sd1Var2.f10389s;
                jM2739p2 = m2739p(sd1Var2);
            } else {
                j2 = r02Var2.f9653e;
                j3 = sd1Var2.f10389s;
                jM2739p = j2 + j3;
                jM2739p2 = jM2739p;
            }
            long jM7226N = z42.m7226N(jM2739p);
            long jM7226N2 = z42.m7226N(jM2739p2);
            q21 q21Var5 = sd1Var2.f10372b;
            de1 de1Var = new de1(obj, i5, z11Var2, obj2, i6, jM7226N, jM7226N2, q21Var5.f9310b, q21Var5.f9311c);
            s02 s02Var2 = this.f3684a;
            int iM2760g = m2760g();
            if (this.f3697g0.f10371a.m6176p()) {
                obj3 = null;
                z11Var3 = null;
                obj4 = null;
                i7 = -1;
            } else {
                sd1 sd1Var3 = this.f3697g0;
                Object obj6 = sd1Var3.f10372b.f9309a;
                sd1Var3.f10371a.mo2973g(obj6, this.f3706n);
                int iMo1054b2 = this.f3697g0.f10371a.mo1054b(obj6);
                Object obj7 = this.f3697g0.f10371a.mo1058m(iM2760g, s02Var2, 0L).f10181a;
                z11Var3 = s02Var2.f10182b;
                i7 = iMo1054b2;
                obj4 = obj6;
                obj3 = obj7;
            }
            long jM7226N3 = z42.m7226N(j);
            long jM7226N4 = this.f3697g0.f10372b.m5438b() ? z42.m7226N(m2739p(this.f3697g0)) : jM7226N3;
            q21 q21Var6 = this.f3697g0.f10372b;
            this.f3704l.m712c(11, new b80(de1Var, new de1(obj3, iM2760g, z11Var3, obj4, i7, jM7226N3, jM7226N4, q21Var6.f9310b, q21Var6.f9311c), i2));
        } else {
            zBooleanValue = zBooleanValue;
            zEquals2 = zEquals2;
            z4 = z4;
        }
        if (zBooleanValue) {
            this.f3704l.m712c(1, new w70(iIntValue, 1, z11Var));
        }
        final int i12 = 7;
        if (sd1Var2.f10376f != sd1Var.f10376f) {
            this.f3704l.m712c(10, new xt0() { // from class: x70
                @Override // p000.xt0
                public final void invoke(Object obj8) {
                    int i13 = i12;
                    sd1 sd1Var4 = sd1Var;
                    ce1 ce1Var = (ce1) obj8;
                    switch (i13) {
                        case 0:
                            ce1Var.onLoadingChanged(sd1Var4.f10377g);
                            ce1Var.onIsLoadingChanged(sd1Var4.f10377g);
                            break;
                        case 1:
                            ce1Var.onPlayerStateChanged(sd1Var4.f10382l, sd1Var4.f10375e);
                            break;
                        case 2:
                            ce1Var.onPlaybackStateChanged(sd1Var4.f10375e);
                            break;
                        case 3:
                            ce1Var.onPlayWhenReadyChanged(sd1Var4.f10382l, sd1Var4.f10383m);
                            break;
                        case 4:
                            ce1Var.onPlaybackSuppressionReasonChanged(sd1Var4.f10384n);
                            break;
                        case 5:
                            ce1Var.onIsPlayingChanged(sd1Var4.m6095k());
                            break;
                        case 6:
                            ce1Var.onPlaybackParametersChanged(sd1Var4.f10385o);
                            break;
                        case 7:
                            ce1Var.onPlayerErrorChanged(sd1Var4.f10376f);
                            break;
                        case 8:
                            ce1Var.onPlayerError(sd1Var4.f10376f);
                            break;
                        default:
                            ce1Var.onTracksChanged((l22) sd1Var4.f10379i.f5244d);
                            break;
                    }
                }
            });
            if (sd1Var.f10376f != null) {
                final int i13 = 8;
                this.f3704l.m712c(10, new xt0() { // from class: x70
                    @Override // p000.xt0
                    public final void invoke(Object obj8) {
                        int i14 = i13;
                        sd1 sd1Var4 = sd1Var;
                        ce1 ce1Var = (ce1) obj8;
                        switch (i14) {
                            case 0:
                                ce1Var.onLoadingChanged(sd1Var4.f10377g);
                                ce1Var.onIsLoadingChanged(sd1Var4.f10377g);
                                break;
                            case 1:
                                ce1Var.onPlayerStateChanged(sd1Var4.f10382l, sd1Var4.f10375e);
                                break;
                            case 2:
                                ce1Var.onPlaybackStateChanged(sd1Var4.f10375e);
                                break;
                            case 3:
                                ce1Var.onPlayWhenReadyChanged(sd1Var4.f10382l, sd1Var4.f10383m);
                                break;
                            case 4:
                                ce1Var.onPlaybackSuppressionReasonChanged(sd1Var4.f10384n);
                                break;
                            case 5:
                                ce1Var.onIsPlayingChanged(sd1Var4.m6095k());
                                break;
                            case 6:
                                ce1Var.onPlaybackParametersChanged(sd1Var4.f10385o);
                                break;
                            case 7:
                                ce1Var.onPlayerErrorChanged(sd1Var4.f10376f);
                                break;
                            case 8:
                                ce1Var.onPlayerError(sd1Var4.f10376f);
                                break;
                            default:
                                ce1Var.onTracksChanged((l22) sd1Var4.f10379i.f5244d);
                                break;
                        }
                    }
                });
            }
        }
        j22 j22Var = sd1Var2.f10379i;
        j22 j22Var2 = sd1Var.f10379i;
        final int i14 = 9;
        if (j22Var != j22Var2) {
            d10 d10Var = this.f3698h;
            Object obj8 = j22Var2.f5245e;
            d10Var.getClass();
            this.f3704l.m712c(2, new xt0() { // from class: x70
                @Override // p000.xt0
                public final void invoke(Object obj9) {
                    int i15 = i14;
                    sd1 sd1Var4 = sd1Var;
                    ce1 ce1Var = (ce1) obj9;
                    switch (i15) {
                        case 0:
                            ce1Var.onLoadingChanged(sd1Var4.f10377g);
                            ce1Var.onIsLoadingChanged(sd1Var4.f10377g);
                            break;
                        case 1:
                            ce1Var.onPlayerStateChanged(sd1Var4.f10382l, sd1Var4.f10375e);
                            break;
                        case 2:
                            ce1Var.onPlaybackStateChanged(sd1Var4.f10375e);
                            break;
                        case 3:
                            ce1Var.onPlayWhenReadyChanged(sd1Var4.f10382l, sd1Var4.f10383m);
                            break;
                        case 4:
                            ce1Var.onPlaybackSuppressionReasonChanged(sd1Var4.f10384n);
                            break;
                        case 5:
                            ce1Var.onIsPlayingChanged(sd1Var4.m6095k());
                            break;
                        case 6:
                            ce1Var.onPlaybackParametersChanged(sd1Var4.f10385o);
                            break;
                        case 7:
                            ce1Var.onPlayerErrorChanged(sd1Var4.f10376f);
                            break;
                        case 8:
                            ce1Var.onPlayerError(sd1Var4.f10376f);
                            break;
                        default:
                            ce1Var.onTracksChanged((l22) sd1Var4.f10379i.f5244d);
                            break;
                    }
                }
            });
        }
        if (!zEquals2) {
            this.f3704l.m712c(14, new C1521vl(this.f3672O, i14));
        }
        if (z5) {
            final int i15 = 0;
            this.f3704l.m712c(3, new xt0() { // from class: x70
                @Override // p000.xt0
                public final void invoke(Object obj9) {
                    int i16 = i15;
                    sd1 sd1Var4 = sd1Var;
                    ce1 ce1Var = (ce1) obj9;
                    switch (i16) {
                        case 0:
                            ce1Var.onLoadingChanged(sd1Var4.f10377g);
                            ce1Var.onIsLoadingChanged(sd1Var4.f10377g);
                            break;
                        case 1:
                            ce1Var.onPlayerStateChanged(sd1Var4.f10382l, sd1Var4.f10375e);
                            break;
                        case 2:
                            ce1Var.onPlaybackStateChanged(sd1Var4.f10375e);
                            break;
                        case 3:
                            ce1Var.onPlayWhenReadyChanged(sd1Var4.f10382l, sd1Var4.f10383m);
                            break;
                        case 4:
                            ce1Var.onPlaybackSuppressionReasonChanged(sd1Var4.f10384n);
                            break;
                        case 5:
                            ce1Var.onIsPlayingChanged(sd1Var4.m6095k());
                            break;
                        case 6:
                            ce1Var.onPlaybackParametersChanged(sd1Var4.f10385o);
                            break;
                        case 7:
                            ce1Var.onPlayerErrorChanged(sd1Var4.f10376f);
                            break;
                        case 8:
                            ce1Var.onPlayerError(sd1Var4.f10376f);
                            break;
                        default:
                            ce1Var.onTracksChanged((l22) sd1Var4.f10379i.f5244d);
                            break;
                    }
                }
            });
        }
        if (z4 || z3) {
            final int i16 = 1;
            this.f3704l.m712c(-1, new xt0() { // from class: x70
                @Override // p000.xt0
                public final void invoke(Object obj9) {
                    int i17 = i16;
                    sd1 sd1Var4 = sd1Var;
                    ce1 ce1Var = (ce1) obj9;
                    switch (i17) {
                        case 0:
                            ce1Var.onLoadingChanged(sd1Var4.f10377g);
                            ce1Var.onIsLoadingChanged(sd1Var4.f10377g);
                            break;
                        case 1:
                            ce1Var.onPlayerStateChanged(sd1Var4.f10382l, sd1Var4.f10375e);
                            break;
                        case 2:
                            ce1Var.onPlaybackStateChanged(sd1Var4.f10375e);
                            break;
                        case 3:
                            ce1Var.onPlayWhenReadyChanged(sd1Var4.f10382l, sd1Var4.f10383m);
                            break;
                        case 4:
                            ce1Var.onPlaybackSuppressionReasonChanged(sd1Var4.f10384n);
                            break;
                        case 5:
                            ce1Var.onIsPlayingChanged(sd1Var4.m6095k());
                            break;
                        case 6:
                            ce1Var.onPlaybackParametersChanged(sd1Var4.f10385o);
                            break;
                        case 7:
                            ce1Var.onPlayerErrorChanged(sd1Var4.f10376f);
                            break;
                        case 8:
                            ce1Var.onPlayerError(sd1Var4.f10376f);
                            break;
                        default:
                            ce1Var.onTracksChanged((l22) sd1Var4.f10379i.f5244d);
                            break;
                    }
                }
            });
        }
        final int i17 = 4;
        if (z4) {
            final int i18 = 2;
            this.f3704l.m712c(4, new xt0() { // from class: x70
                @Override // p000.xt0
                public final void invoke(Object obj9) {
                    int i19 = i18;
                    sd1 sd1Var4 = sd1Var;
                    ce1 ce1Var = (ce1) obj9;
                    switch (i19) {
                        case 0:
                            ce1Var.onLoadingChanged(sd1Var4.f10377g);
                            ce1Var.onIsLoadingChanged(sd1Var4.f10377g);
                            break;
                        case 1:
                            ce1Var.onPlayerStateChanged(sd1Var4.f10382l, sd1Var4.f10375e);
                            break;
                        case 2:
                            ce1Var.onPlaybackStateChanged(sd1Var4.f10375e);
                            break;
                        case 3:
                            ce1Var.onPlayWhenReadyChanged(sd1Var4.f10382l, sd1Var4.f10383m);
                            break;
                        case 4:
                            ce1Var.onPlaybackSuppressionReasonChanged(sd1Var4.f10384n);
                            break;
                        case 5:
                            ce1Var.onIsPlayingChanged(sd1Var4.m6095k());
                            break;
                        case 6:
                            ce1Var.onPlaybackParametersChanged(sd1Var4.f10385o);
                            break;
                        case 7:
                            ce1Var.onPlayerErrorChanged(sd1Var4.f10376f);
                            break;
                        case 8:
                            ce1Var.onPlayerError(sd1Var4.f10376f);
                            break;
                        default:
                            ce1Var.onTracksChanged((l22) sd1Var4.f10379i.f5244d);
                            break;
                    }
                }
            });
        }
        final int i19 = 5;
        if (z3 || sd1Var2.f10383m != sd1Var.f10383m) {
            final int i20 = 3;
            this.f3704l.m712c(5, new xt0() { // from class: x70
                @Override // p000.xt0
                public final void invoke(Object obj9) {
                    int i110 = i20;
                    sd1 sd1Var4 = sd1Var;
                    ce1 ce1Var = (ce1) obj9;
                    switch (i110) {
                        case 0:
                            ce1Var.onLoadingChanged(sd1Var4.f10377g);
                            ce1Var.onIsLoadingChanged(sd1Var4.f10377g);
                            break;
                        case 1:
                            ce1Var.onPlayerStateChanged(sd1Var4.f10382l, sd1Var4.f10375e);
                            break;
                        case 2:
                            ce1Var.onPlaybackStateChanged(sd1Var4.f10375e);
                            break;
                        case 3:
                            ce1Var.onPlayWhenReadyChanged(sd1Var4.f10382l, sd1Var4.f10383m);
                            break;
                        case 4:
                            ce1Var.onPlaybackSuppressionReasonChanged(sd1Var4.f10384n);
                            break;
                        case 5:
                            ce1Var.onIsPlayingChanged(sd1Var4.m6095k());
                            break;
                        case 6:
                            ce1Var.onPlaybackParametersChanged(sd1Var4.f10385o);
                            break;
                        case 7:
                            ce1Var.onPlayerErrorChanged(sd1Var4.f10376f);
                            break;
                        case 8:
                            ce1Var.onPlayerError(sd1Var4.f10376f);
                            break;
                        default:
                            ce1Var.onTracksChanged((l22) sd1Var4.f10379i.f5244d);
                            break;
                    }
                }
            });
        }
        final int i21 = 6;
        if (sd1Var2.f10384n != sd1Var.f10384n) {
            this.f3704l.m712c(6, new xt0() { // from class: x70
                @Override // p000.xt0
                public final void invoke(Object obj9) {
                    int i110 = i17;
                    sd1 sd1Var4 = sd1Var;
                    ce1 ce1Var = (ce1) obj9;
                    switch (i110) {
                        case 0:
                            ce1Var.onLoadingChanged(sd1Var4.f10377g);
                            ce1Var.onIsLoadingChanged(sd1Var4.f10377g);
                            break;
                        case 1:
                            ce1Var.onPlayerStateChanged(sd1Var4.f10382l, sd1Var4.f10375e);
                            break;
                        case 2:
                            ce1Var.onPlaybackStateChanged(sd1Var4.f10375e);
                            break;
                        case 3:
                            ce1Var.onPlayWhenReadyChanged(sd1Var4.f10382l, sd1Var4.f10383m);
                            break;
                        case 4:
                            ce1Var.onPlaybackSuppressionReasonChanged(sd1Var4.f10384n);
                            break;
                        case 5:
                            ce1Var.onIsPlayingChanged(sd1Var4.m6095k());
                            break;
                        case 6:
                            ce1Var.onPlaybackParametersChanged(sd1Var4.f10385o);
                            break;
                        case 7:
                            ce1Var.onPlayerErrorChanged(sd1Var4.f10376f);
                            break;
                        case 8:
                            ce1Var.onPlayerError(sd1Var4.f10376f);
                            break;
                        default:
                            ce1Var.onTracksChanged((l22) sd1Var4.f10379i.f5244d);
                            break;
                    }
                }
            });
        }
        if (sd1Var2.m6095k() != sd1Var.m6095k()) {
            this.f3704l.m712c(7, new xt0() { // from class: x70
                @Override // p000.xt0
                public final void invoke(Object obj9) {
                    int i110 = i19;
                    sd1 sd1Var4 = sd1Var;
                    ce1 ce1Var = (ce1) obj9;
                    switch (i110) {
                        case 0:
                            ce1Var.onLoadingChanged(sd1Var4.f10377g);
                            ce1Var.onIsLoadingChanged(sd1Var4.f10377g);
                            break;
                        case 1:
                            ce1Var.onPlayerStateChanged(sd1Var4.f10382l, sd1Var4.f10375e);
                            break;
                        case 2:
                            ce1Var.onPlaybackStateChanged(sd1Var4.f10375e);
                            break;
                        case 3:
                            ce1Var.onPlayWhenReadyChanged(sd1Var4.f10382l, sd1Var4.f10383m);
                            break;
                        case 4:
                            ce1Var.onPlaybackSuppressionReasonChanged(sd1Var4.f10384n);
                            break;
                        case 5:
                            ce1Var.onIsPlayingChanged(sd1Var4.m6095k());
                            break;
                        case 6:
                            ce1Var.onPlaybackParametersChanged(sd1Var4.f10385o);
                            break;
                        case 7:
                            ce1Var.onPlayerErrorChanged(sd1Var4.f10376f);
                            break;
                        case 8:
                            ce1Var.onPlayerError(sd1Var4.f10376f);
                            break;
                        default:
                            ce1Var.onTracksChanged((l22) sd1Var4.f10379i.f5244d);
                            break;
                    }
                }
            });
        }
        if (!sd1Var2.f10385o.equals(sd1Var.f10385o)) {
            this.f3704l.m712c(12, new xt0() { // from class: x70
                @Override // p000.xt0
                public final void invoke(Object obj9) {
                    int i110 = i21;
                    sd1 sd1Var4 = sd1Var;
                    ce1 ce1Var = (ce1) obj9;
                    switch (i110) {
                        case 0:
                            ce1Var.onLoadingChanged(sd1Var4.f10377g);
                            ce1Var.onIsLoadingChanged(sd1Var4.f10377g);
                            break;
                        case 1:
                            ce1Var.onPlayerStateChanged(sd1Var4.f10382l, sd1Var4.f10375e);
                            break;
                        case 2:
                            ce1Var.onPlaybackStateChanged(sd1Var4.f10375e);
                            break;
                        case 3:
                            ce1Var.onPlayWhenReadyChanged(sd1Var4.f10382l, sd1Var4.f10383m);
                            break;
                        case 4:
                            ce1Var.onPlaybackSuppressionReasonChanged(sd1Var4.f10384n);
                            break;
                        case 5:
                            ce1Var.onIsPlayingChanged(sd1Var4.m6095k());
                            break;
                        case 6:
                            ce1Var.onPlaybackParametersChanged(sd1Var4.f10385o);
                            break;
                        case 7:
                            ce1Var.onPlayerErrorChanged(sd1Var4.f10376f);
                            break;
                        case 8:
                            ce1Var.onPlayerError(sd1Var4.f10376f);
                            break;
                        default:
                            ce1Var.onTracksChanged((l22) sd1Var4.f10379i.f5244d);
                            break;
                    }
                }
            });
        }
        m2749J();
        this.f3704l.m711b();
        if (sd1Var2.f10386p != sd1Var.f10386p) {
            Iterator it = this.f3705m.iterator();
            while (it.hasNext()) {
                ((c80) it.next()).f1699a.m2752M();
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m2752M() {
        int iM2768o = m2768o();
        ax0 ax0Var = this.f3661D;
        pu0 pu0Var = this.f3660C;
        if (iM2768o != 1) {
            if (iM2768o == 2 || iM2768o == 3) {
                m2753N();
                boolean z = this.f3697g0.f10386p;
                m2767n();
                pu0Var.getClass();
                m2767n();
                ax0Var.getClass();
                return;
            }
            if (iM2768o != 4) {
                l41.m4046o();
                return;
            }
        }
        pu0Var.getClass();
        ax0Var.getClass();
    }

    /* JADX INFO: renamed from: N */
    public final void m2753N() {
        C0073as c0073as = this.f3690d;
        synchronized (c0073as) {
            boolean z = false;
            while (!c0073as.f1039a) {
                try {
                    c0073as.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.f3711s.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.f3711s.getThread().getName();
            int i = z42.f13274a;
            Locale locale = Locale.US;
            String strM3617o = jd0.m3617o("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f3687b0) {
                f40.m2719o(strM3617o);
            } else {
                AbstractC1337qm.m5544j0("ExoPlayerImpl", strM3617o, this.f3689c0 ? null : new IllegalStateException());
                this.f3689c0 = true;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final d21 m2754a() {
        t02 t02VarM2763j = m2763j();
        if (t02VarM2763j.m6176p()) {
            return this.f3695f0;
        }
        z11 z11Var = t02VarM2763j.mo1058m(m2760g(), this.f3684a, 0L).f10182b;
        c21 c21VarM2204a = this.f3695f0.m2204a();
        d21 d21Var = z11Var.f13233d;
        if (d21Var != null) {
            qm0 qm0Var = d21Var.f2727A;
            byte[] bArr = d21Var.f2733f;
            CharSequence charSequence = d21Var.f2728a;
            if (charSequence != null) {
                c21VarM2204a.f1629a = charSequence;
            }
            CharSequence charSequence2 = d21Var.f2729b;
            if (charSequence2 != null) {
                c21VarM2204a.f1630b = charSequence2;
            }
            CharSequence charSequence3 = d21Var.f2730c;
            if (charSequence3 != null) {
                c21VarM2204a.f1631c = charSequence3;
            }
            CharSequence charSequence4 = d21Var.f2731d;
            if (charSequence4 != null) {
                c21VarM2204a.f1632d = charSequence4;
            }
            CharSequence charSequence5 = d21Var.f2732e;
            if (charSequence5 != null) {
                c21VarM2204a.f1633e = charSequence5;
            }
            if (bArr != null) {
                Integer num = d21Var.f2734g;
                c21VarM2204a.f1634f = bArr == null ? null : (byte[]) bArr.clone();
                c21VarM2204a.f1635g = num;
            }
            Integer num2 = d21Var.f2735h;
            if (num2 != null) {
                c21VarM2204a.f1636h = num2;
            }
            Integer num3 = d21Var.f2736i;
            if (num3 != null) {
                c21VarM2204a.f1637i = num3;
            }
            Integer num4 = d21Var.f2737j;
            if (num4 != null) {
                c21VarM2204a.f1638j = num4;
            }
            Boolean bool = d21Var.f2738k;
            if (bool != null) {
                c21VarM2204a.f1639k = bool;
            }
            Integer num5 = d21Var.f2739l;
            if (num5 != null) {
                c21VarM2204a.f1640l = num5;
            }
            Integer num6 = d21Var.f2740m;
            if (num6 != null) {
                c21VarM2204a.f1640l = num6;
            }
            Integer num7 = d21Var.f2741n;
            if (num7 != null) {
                c21VarM2204a.f1641m = num7;
            }
            Integer num8 = d21Var.f2742o;
            if (num8 != null) {
                c21VarM2204a.f1642n = num8;
            }
            Integer num9 = d21Var.f2743p;
            if (num9 != null) {
                c21VarM2204a.f1643o = num9;
            }
            Integer num10 = d21Var.f2744q;
            if (num10 != null) {
                c21VarM2204a.f1644p = num10;
            }
            Integer num11 = d21Var.f2745r;
            if (num11 != null) {
                c21VarM2204a.f1645q = num11;
            }
            CharSequence charSequence6 = d21Var.f2746s;
            if (charSequence6 != null) {
                c21VarM2204a.f1646r = charSequence6;
            }
            CharSequence charSequence7 = d21Var.f2747t;
            if (charSequence7 != null) {
                c21VarM2204a.f1647s = charSequence7;
            }
            CharSequence charSequence8 = d21Var.f2748u;
            if (charSequence8 != null) {
                c21VarM2204a.f1648t = charSequence8;
            }
            Integer num12 = d21Var.f2749v;
            if (num12 != null) {
                c21VarM2204a.f1649u = num12;
            }
            Integer num13 = d21Var.f2750w;
            if (num13 != null) {
                c21VarM2204a.f1650v = num13;
            }
            CharSequence charSequence9 = d21Var.f2751x;
            if (charSequence9 != null) {
                c21VarM2204a.f1651w = charSequence9;
            }
            CharSequence charSequence10 = d21Var.f2752y;
            if (charSequence10 != null) {
                c21VarM2204a.f1652x = charSequence10;
            }
            Integer num14 = d21Var.f2753z;
            if (num14 != null) {
                c21VarM2204a.f1653y = num14;
            }
            if (!qm0Var.isEmpty()) {
                c21VarM2204a.f1654z = qm0.m5567n(qm0Var);
            }
        }
        return new d21(c21VarM2204a);
    }

    /* JADX INFO: renamed from: b */
    public final void m2755b() {
        m2753N();
        m2778z();
        m2748I(null);
        m2775w(0, 0);
    }

    /* JADX INFO: renamed from: c */
    public final af1 m2756c(ze1 ze1Var) {
        int iM2765l = m2765l(this.f3697g0);
        t02 t02Var = this.f3697g0.f10371a;
        if (iM2765l == -1) {
            iM2765l = 0;
        }
        xy1 xy1Var = this.f3716x;
        l80 l80Var = this.f3703k;
        return new af1(l80Var, ze1Var, t02Var, iM2765l, xy1Var, l80Var.f6248p);
    }

    /* JADX INFO: renamed from: d */
    public final long m2757d(sd1 sd1Var) {
        q21 q21Var = sd1Var.f10372b;
        long j = sd1Var.f10373c;
        t02 t02Var = sd1Var.f10371a;
        if (!q21Var.m5438b()) {
            return z42.m7226N(m2762i(sd1Var));
        }
        Object obj = sd1Var.f10372b.f9309a;
        r02 r02Var = this.f3706n;
        t02Var.mo2973g(obj, r02Var);
        if (j == -9223372036854775807L) {
            return z42.m7226N(t02Var.mo1058m(m2765l(sd1Var), this.f3684a, 0L).f10190j);
        }
        return z42.m7226N(j) + z42.m7226N(r02Var.f9653e);
    }

    /* JADX INFO: renamed from: e */
    public final int m2758e() {
        m2753N();
        if (m2772t()) {
            return this.f3697g0.f10372b.f9310b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public final int m2759f() {
        m2753N();
        if (m2772t()) {
            return this.f3697g0.f10372b.f9311c;
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public final int m2760g() {
        m2753N();
        int iM2765l = m2765l(this.f3697g0);
        if (iM2765l == -1) {
            return 0;
        }
        return iM2765l;
    }

    /* JADX INFO: renamed from: h */
    public final long m2761h() {
        m2753N();
        return z42.m7226N(m2762i(this.f3697g0));
    }

    /* JADX INFO: renamed from: i */
    public final long m2762i(sd1 sd1Var) {
        if (sd1Var.f10371a.m6176p()) {
            return z42.m7216D(this.f3701i0);
        }
        long jM6094j = sd1Var.f10386p ? sd1Var.m6094j() : sd1Var.f10389s;
        if (sd1Var.f10372b.m5438b()) {
            return jM6094j;
        }
        t02 t02Var = sd1Var.f10371a;
        Object obj = sd1Var.f10372b.f9309a;
        r02 r02Var = this.f3706n;
        t02Var.mo2973g(obj, r02Var);
        return jM6094j + r02Var.f9653e;
    }

    /* JADX INFO: renamed from: j */
    public final t02 m2763j() {
        m2753N();
        return this.f3697g0.f10371a;
    }

    /* JADX INFO: renamed from: k */
    public final l22 m2764k() {
        m2753N();
        return (l22) this.f3697g0.f10379i.f5244d;
    }

    /* JADX INFO: renamed from: l */
    public final int m2765l(sd1 sd1Var) {
        return sd1Var.f10371a.m6176p() ? this.f3699h0 : sd1Var.f10371a.mo2973g(sd1Var.f10372b.f9309a, this.f3706n).f9651c;
    }

    /* JADX INFO: renamed from: m */
    public final long m2766m() {
        m2753N();
        if (!m2772t()) {
            t02 t02VarM2763j = m2763j();
            if (t02VarM2763j.m6176p()) {
                return -9223372036854775807L;
            }
            return z42.m7226N(t02VarM2763j.mo1058m(m2760g(), this.f3684a, 0L).f10191k);
        }
        sd1 sd1Var = this.f3697g0;
        q21 q21Var = sd1Var.f10372b;
        t02 t02Var = sd1Var.f10371a;
        Object obj = q21Var.f9309a;
        r02 r02Var = this.f3706n;
        t02Var.mo2973g(obj, r02Var);
        return z42.m7226N(r02Var.m5644a(q21Var.f9310b, q21Var.f9311c));
    }

    /* JADX INFO: renamed from: n */
    public final boolean m2767n() {
        m2753N();
        return this.f3697g0.f10382l;
    }

    /* JADX INFO: renamed from: o */
    public final int m2768o() {
        m2753N();
        return this.f3697g0.f10375e;
    }

    /* JADX INFO: renamed from: q */
    public final x00 m2769q() {
        m2753N();
        return this.f3698h.m2171c();
    }

    /* JADX INFO: renamed from: r */
    public final boolean m2770r(int i) {
        m2753N();
        return this.f3671N.f211a.f3306a.get(i);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m2771s() {
        t02 t02VarM2763j = m2763j();
        return !t02VarM2763j.m6176p() && t02VarM2763j.mo1058m(m2760g(), this.f3684a, 0L).m5932a();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        m2753N();
        m2743D(4, 15, imageOutput);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m2772t() {
        m2753N();
        return this.f3697g0.f10372b.m5438b();
    }

    /* JADX INFO: renamed from: u */
    public final sd1 m2773u(sd1 sd1Var, t02 t02Var, Pair pair) {
        List list;
        ki0.m3857c(t02Var.m6176p() || pair != null);
        t02 t02Var2 = sd1Var.f10371a;
        long jM2757d = m2757d(sd1Var);
        sd1 sd1VarM6093h = sd1Var.m6093h(t02Var);
        if (t02Var.m6176p()) {
            q21 q21Var = sd1.f10370u;
            long jM7216D = z42.m7216D(this.f3701i0);
            sd1 sd1VarM6087b = sd1VarM6093h.m6088c(q21Var, jM7216D, jM7216D, jM7216D, 0L, z12.f13236d, this.f3686b, kk1.f5896e).m6087b(q21Var);
            sd1VarM6087b.f10387q = sd1VarM6087b.f10389s;
            return sd1VarM6087b;
        }
        Object obj = sd1VarM6093h.f10372b.f9309a;
        boolean zEquals = obj.equals(pair.first);
        q21 q21Var2 = !zEquals ? new q21(pair.first) : sd1VarM6093h.f10372b;
        long jLongValue = ((Long) pair.second).longValue();
        long jM7216D2 = z42.m7216D(jM2757d);
        if (!t02Var2.m6176p()) {
            jM7216D2 -= t02Var2.mo2973g(obj, this.f3706n).f9653e;
        }
        if (!zEquals || jLongValue < jM7216D2) {
            q21 q21Var3 = q21Var2;
            ki0.m3864h(!q21Var3.m5438b());
            z12 z12Var = !zEquals ? z12.f13236d : sd1VarM6093h.f10378h;
            j22 j22Var = !zEquals ? this.f3686b : sd1VarM6093h.f10379i;
            if (zEquals) {
                list = sd1VarM6093h.f10380j;
            } else {
                om0 om0Var = qm0.f9540b;
                list = kk1.f5896e;
            }
            sd1 sd1VarM6087b2 = sd1VarM6093h.m6088c(q21Var3, jLongValue, jLongValue, jLongValue, 0L, z12Var, j22Var, list).m6087b(q21Var3);
            sd1VarM6087b2.f10387q = jLongValue;
            return sd1VarM6087b2;
        }
        if (jLongValue != jM7216D2) {
            q21 q21Var4 = q21Var2;
            ki0.m3864h(!q21Var4.m5438b());
            long jMax = Math.max(0L, sd1VarM6093h.f10388r - (jLongValue - jM7216D2));
            long j = sd1VarM6093h.f10387q;
            if (sd1VarM6093h.f10381k.equals(sd1VarM6093h.f10372b)) {
                j = jLongValue + jMax;
            }
            sd1 sd1VarM6088c = sd1VarM6093h.m6088c(q21Var4, jLongValue, jLongValue, jLongValue, jMax, sd1VarM6093h.f10378h, sd1VarM6093h.f10379i, sd1VarM6093h.f10380j);
            sd1VarM6088c.f10387q = j;
            return sd1VarM6088c;
        }
        int iMo1054b = t02Var.mo1054b(sd1VarM6093h.f10381k.f9309a);
        if (iMo1054b != -1 && t02Var.mo1055f(iMo1054b, this.f3706n, false).f9651c == t02Var.mo2973g(q21Var2.f9309a, this.f3706n).f9651c) {
            return sd1VarM6093h;
        }
        t02Var.mo2973g(q21Var2.f9309a, this.f3706n);
        boolean zM5438b = q21Var2.m5438b();
        r02 r02Var = this.f3706n;
        long jM5644a = zM5438b ? r02Var.m5644a(q21Var2.f9310b, q21Var2.f9311c) : r02Var.f9652d;
        q21 q21Var5 = q21Var2;
        sd1 sd1VarM6087b3 = sd1VarM6093h.m6088c(q21Var5, sd1VarM6093h.f10389s, sd1VarM6093h.f10389s, sd1VarM6093h.f10374d, jM5644a - sd1VarM6093h.f10389s, sd1VarM6093h.f10378h, sd1VarM6093h.f10379i, sd1VarM6093h.f10380j).m6087b(q21Var5);
        sd1VarM6087b3.f10387q = jM5644a;
        return sd1VarM6087b3;
    }

    /* JADX INFO: renamed from: v */
    public final Pair m2774v(t02 t02Var, int i, long j) {
        if (t02Var.m6176p()) {
            this.f3699h0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f3701i0 = j;
            return null;
        }
        if (i == -1 || i >= t02Var.mo1059o()) {
            i = t02Var.mo2970a(this.f3664G);
            j = z42.m7226N(t02Var.mo1058m(i, this.f3684a, 0L).f10190j);
        }
        return t02Var.m6173i(this.f3684a, this.f3706n, i, z42.m7216D(j));
    }

    /* JADX INFO: renamed from: w */
    public final void m2775w(final int i, final int i2) {
        gt1 gt1Var = this.f3680W;
        if (i == gt1Var.f4319a && i2 == gt1Var.f4320b) {
            return;
        }
        this.f3680W = new gt1(i, i2);
        this.f3704l.m714e(24, new xt0() { // from class: y70
            @Override // p000.xt0
            public final void invoke(Object obj) {
                ((ce1) obj).onSurfaceSizeChanged(i, i2);
            }
        });
        m2743D(2, 14, new gt1(i, i2));
    }

    /* JADX INFO: renamed from: x */
    public final void m2776x() {
        m2753N();
        boolean zM2767n = m2767n();
        int iM2954c = this.f3659B.m2954c(2, zM2767n);
        m2750K(iM2954c, iM2954c == -1 ? 2 : 1, zM2767n);
        sd1 sd1Var = this.f3697g0;
        if (sd1Var.f10375e != 1) {
            return;
        }
        sd1 sd1VarM6090e = sd1Var.m6090e(null);
        sd1 sd1VarM6092g = sd1VarM6090e.m6092g(sd1VarM6090e.f10371a.m6176p() ? 4 : 2);
        this.f3665H++;
        zy1 zy1Var = this.f3703k.f6246n;
        zy1Var.getClass();
        yy1 yy1VarM7385b = zy1.m7385b();
        yy1VarM7385b.f13169a = zy1Var.f13615a.obtainMessage(29);
        yy1VarM7385b.m7164b();
        m2751L(sd1VarM6092g, 1, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: renamed from: y */
    public final void m2777y(ce1 ce1Var) {
        m2753N();
        ce1Var.getClass();
        au0 au0Var = this.f3704l;
        au0Var.m715f();
        CopyOnWriteArraySet<zt0> copyOnWriteArraySet = au0Var.f1049d;
        for (zt0 zt0Var : copyOnWriteArraySet) {
            if (zt0Var.f13558a.equals(ce1Var)) {
                yt0 yt0Var = au0Var.f1048c;
                zt0Var.f13561d = true;
                if (zt0Var.f13560c) {
                    zt0Var.f13560c = false;
                    yt0Var.mo2405a(zt0Var.f13558a, zt0Var.f13559b.m4551c());
                }
                copyOnWriteArraySet.remove(zt0Var);
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m2778z() {
        lu1 lu1Var = this.f3676S;
        c80 c80Var = this.f3717y;
        if (lu1Var != null) {
            af1 af1VarM2756c = m2756c(this.f3718z);
            ki0.m3864h(!af1VarM2756c.f222g);
            af1VarM2756c.f219d = 10000;
            ki0.m3864h(!af1VarM2756c.f222g);
            af1VarM2756c.f220e = null;
            af1VarM2756c.m147c();
            this.f3676S.f6512a.remove(c80Var);
            this.f3676S = null;
        }
        TextureView textureView = this.f3678U;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != c80Var) {
                AbstractC1337qm.m5542i0("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f3678U.setSurfaceTextureListener(null);
            }
            this.f3678U = null;
        }
        SurfaceHolder surfaceHolder = this.f3675R;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(c80Var);
            this.f3675R = null;
        }
    }
}

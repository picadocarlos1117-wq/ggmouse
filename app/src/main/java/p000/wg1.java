package p000;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class wg1 implements j21, z80 {

    /* JADX INFO: renamed from: U */
    public static final Map f12132U;

    /* JADX INFO: renamed from: V */
    public static final be0 f12133V;

    /* JADX INFO: renamed from: A */
    public boolean f12134A;

    /* JADX INFO: renamed from: B */
    public boolean f12135B;

    /* JADX INFO: renamed from: C */
    public boolean f12136C;

    /* JADX INFO: renamed from: D */
    public boolean f12137D;

    /* JADX INFO: renamed from: E */
    public C0599ed f12138E;

    /* JADX INFO: renamed from: F */
    public kq1 f12139F;

    /* JADX INFO: renamed from: G */
    public long f12140G;

    /* JADX INFO: renamed from: H */
    public boolean f12141H;

    /* JADX INFO: renamed from: I */
    public int f12142I;

    /* JADX INFO: renamed from: J */
    public boolean f12143J;

    /* JADX INFO: renamed from: K */
    public boolean f12144K;

    /* JADX INFO: renamed from: L */
    public boolean f12145L;

    /* JADX INFO: renamed from: M */
    public int f12146M;

    /* JADX INFO: renamed from: N */
    public boolean f12147N;

    /* JADX INFO: renamed from: O */
    public long f12148O;

    /* JADX INFO: renamed from: P */
    public long f12149P;

    /* JADX INFO: renamed from: Q */
    public boolean f12150Q;

    /* JADX INFO: renamed from: R */
    public int f12151R;

    /* JADX INFO: renamed from: S */
    public boolean f12152S;

    /* JADX INFO: renamed from: T */
    public boolean f12153T;

    /* JADX INFO: renamed from: a */
    public final Uri f12154a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0807jx f12155b;

    /* JADX INFO: renamed from: c */
    public final g40 f12156c;

    /* JADX INFO: renamed from: d */
    public final bz1 f12157d;

    /* JADX INFO: renamed from: e */
    public final c40 f12158e;

    /* JADX INFO: renamed from: f */
    public final c40 f12159f;

    /* JADX INFO: renamed from: g */
    public final zg1 f12160g;

    /* JADX INFO: renamed from: m */
    public final C0547cy f12161m;

    /* JADX INFO: renamed from: n */
    public final long f12162n;

    /* JADX INFO: renamed from: o */
    public final boolean f12163o;

    /* JADX INFO: renamed from: p */
    public final long f12164p;

    /* JADX INFO: renamed from: q */
    public final C1174o9 f12165q;

    /* JADX INFO: renamed from: r */
    public final C1174o9 f12166r;

    /* JADX INFO: renamed from: s */
    public final C0073as f12167s;

    /* JADX INFO: renamed from: t */
    public final rg1 f12168t;

    /* JADX INFO: renamed from: u */
    public final rg1 f12169u;

    /* JADX INFO: renamed from: v */
    public final Handler f12170v;

    /* JADX INFO: renamed from: w */
    public i21 f12171w;

    /* JADX INFO: renamed from: x */
    public wl0 f12172x;

    /* JADX INFO: renamed from: y */
    public xo1[] f12173y;

    /* JADX INFO: renamed from: z */
    public vg1[] f12174z;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f12132U = Collections.unmodifiableMap(map);
        ae0 ae0Var = new ae0();
        ae0Var.f185a = "icy";
        ae0Var.f197m = v51.m6582l("application/x-icy");
        f12133V = new be0(ae0Var);
    }

    public wg1(Uri uri, InterfaceC0807jx interfaceC0807jx, C1174o9 c1174o9, g40 g40Var, c40 c40Var, bz1 bz1Var, c40 c40Var2, zg1 zg1Var, C0547cy c0547cy, int i, boolean z, long j, fx0 fx0Var) {
        this.f12154a = uri;
        this.f12155b = interfaceC0807jx;
        this.f12156c = g40Var;
        this.f12159f = c40Var;
        this.f12157d = bz1Var;
        this.f12158e = c40Var2;
        this.f12160g = zg1Var;
        this.f12161m = c0547cy;
        this.f12162n = i;
        this.f12163o = z;
        this.f12165q = fx0Var != null ? new C1174o9(fx0Var, 1) : new C1174o9("ProgressiveMediaPeriod", 1);
        this.f12166r = c1174o9;
        this.f12164p = j;
        this.f12167s = new C0073as();
        this.f12168t = new rg1(this, 1);
        this.f12169u = new rg1(this, 2);
        this.f12170v = z42.m7236j(null);
        this.f12174z = new vg1[0];
        this.f12173y = new xo1[0];
        this.f12149P = -9223372036854775807L;
        this.f12142I = 1;
    }

    /* JADX INFO: renamed from: A */
    public final void m6778A(kq1 kq1Var) {
        this.f12139F = this.f12172x == null ? kq1Var : new C0825ke(-9223372036854775807L);
        this.f12140G = kq1Var.mo8j();
        boolean z = !this.f12147N && kq1Var.mo8j() == -9223372036854775807L;
        this.f12141H = z;
        this.f12142I = z ? 7 : 1;
        if (this.f12135B) {
            this.f12160g.m7308t(this.f12140G, kq1Var.mo6c(), this.f12141H);
        } else {
            m6785u();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m6779B() {
        tg1 tg1Var = new tg1(this, this.f12154a, this.f12155b, this.f12166r, this, this.f12167s);
        if (this.f12135B) {
            ki0.m3864h(m6784t());
            long j = this.f12140G;
            if (j != -9223372036854775807L && this.f12149P > j) {
                this.f12152S = true;
                this.f12149P = -9223372036854775807L;
                return;
            }
            kq1 kq1Var = this.f12139F;
            kq1Var.getClass();
            long j2 = kq1Var.mo7h(this.f12149P).f5494a.f7077b;
            long j3 = this.f12149P;
            tg1Var.f10873f.f1280a = j2;
            tg1Var.f10876i = j3;
            tg1Var.f10875h = true;
            tg1Var.f10879l = false;
            for (xo1 xo1Var : this.f12173y) {
                xo1Var.f12680t = this.f12149P;
            }
            this.f12149P = -9223372036854775807L;
        }
        this.f12151R = m6782i();
        int iM1085l = this.f12157d.m1085l(this.f12142I);
        C1174o9 c1174o9 = this.f12165q;
        c1174o9.getClass();
        Looper looperMyLooper = Looper.myLooper();
        ki0.m3866j(looperMyLooper);
        c1174o9.f7701d = null;
        uu0 uu0Var = new uu0(c1174o9, looperMyLooper, tg1Var, this, iM1085l, SystemClock.elapsedRealtime());
        ki0.m3864h(((uu0) c1174o9.f7700c) == null);
        c1174o9.f7700c = uu0Var;
        SystemClock.elapsedRealtime();
        uu0Var.f11424c.getClass();
        uu0Var.f11425d = null;
        fx0 fx0Var = (fx0) c1174o9.f7699b;
        uu0 uu0Var2 = (uu0) c1174o9.f7700c;
        uu0Var2.getClass();
        fx0Var.execute(uu0Var2);
        Uri uri = tg1Var.f10877j.f6535a;
        Map map = Collections.EMPTY_MAP;
        su0 su0Var = new su0();
        b21 b21Var = new b21(-1, null, z42.m7226N(tg1Var.f10876i), z42.m7226N(this.f12140G));
        c40 c40Var = this.f12158e;
        c40Var.m1126a(new s21(c40Var, su0Var, b21Var, 0));
    }

    /* JADX INFO: renamed from: C */
    public final boolean m6780C() {
        return this.f12144K || m6784t();
    }

    /* JADX INFO: renamed from: a */
    public final void m6781a() {
        ki0.m3864h(this.f12135B);
        this.f12138E.getClass();
        this.f12139F.getClass();
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: b */
    public final long mo3529b(n80[] n80VarArr, boolean[] zArr, yo1[] yo1VarArr, boolean[] zArr2, long j) {
        n80 n80Var;
        m6781a();
        C0599ed c0599ed = this.f12138E;
        z12 z12Var = (z12) c0599ed.f3313a;
        boolean[] zArr3 = (boolean[]) c0599ed.f3315c;
        int i = this.f12146M;
        for (int i2 = 0; i2 < n80VarArr.length; i2++) {
            yo1 yo1Var = yo1VarArr[i2];
            if (yo1Var != null && (n80VarArr[i2] == null || !zArr[i2])) {
                int i3 = ((ug1) yo1Var).f11289a;
                ki0.m3864h(zArr3[i3]);
                this.f12146M--;
                zArr3[i3] = false;
                yo1VarArr[i2] = null;
            }
        }
        boolean z = !this.f12143J ? j == 0 || this.f12137D : i != 0;
        for (int i4 = 0; i4 < n80VarArr.length; i4++) {
            if (yo1VarArr[i4] == null && (n80Var = n80VarArr[i4]) != null) {
                ki0.m3864h(n80Var.length() == 1);
                ki0.m3864h(n80Var.mo859e(0) == 0);
                int iIndexOf = z12Var.f13238b.indexOf(n80Var.mo855a());
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                ki0.m3864h(!zArr3[iIndexOf]);
                this.f12146M++;
                zArr3[iIndexOf] = true;
                this.f12145L = n80Var.mo862h().f1347t | this.f12145L;
                yo1VarArr[i4] = new ug1(this, iIndexOf);
                zArr2[i4] = true;
                if (!z) {
                    xo1 xo1Var = this.f12173y[iIndexOf];
                    z = (xo1Var.f12677q + xo1Var.f12679s == 0 || xo1Var.m6945m(j, true)) ? false : true;
                }
            }
        }
        if (this.f12146M == 0) {
            this.f12150Q = false;
            this.f12144K = false;
            this.f12145L = false;
            C1174o9 c1174o9 = this.f12165q;
            if (c1174o9.m4749O()) {
                for (xo1 xo1Var2 : this.f12173y) {
                    xo1Var2.m6938f();
                }
                uu0 uu0Var = (uu0) c1174o9.f7700c;
                ki0.m3866j(uu0Var);
                uu0Var.m6541a(false);
            } else {
                this.f12152S = false;
                for (xo1 xo1Var3 : this.f12173y) {
                    xo1Var3.m6944l(false);
                }
            }
        } else if (z) {
            j = mo3532f(j);
            for (int i5 = 0; i5 < yo1VarArr.length; i5++) {
                if (yo1VarArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.f12143J = true;
        return j;
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: c */
    public final long mo4342c() {
        return mo4345p();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007c A[RETURN] */
    @Override // p000.j21
    /* JADX INFO: renamed from: d */
    public final long mo3530d(long j, lq1 lq1Var) {
        m6781a();
        if (!this.f12139F.mo6c()) {
            return 0L;
        }
        jq1 jq1VarMo7h = this.f12139F.mo7h(j);
        long j2 = jq1VarMo7h.f5494a.f7076a;
        long j3 = jq1VarMo7h.f5495b.f7076a;
        long j4 = lq1Var.f6492b;
        long j5 = lq1Var.f6491a;
        if (j5 == 0 && j4 == 0) {
            return j;
        }
        int i = z42.f13274a;
        long j6 = j - j5;
        if (((j5 ^ j) & (j ^ j6)) < 0) {
            j6 = Long.MIN_VALUE;
        }
        long j7 = j + j4;
        if (((j4 ^ j7) & (j ^ j7)) < 0) {
            j7 = Long.MAX_VALUE;
        }
        boolean z = false;
        boolean z2 = j6 <= j2 && j2 <= j7;
        if (j6 <= j3 && j3 <= j7) {
            z = true;
        }
        if (z2 && z) {
            if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
                return j2;
            }
            return j3;
        }
        if (!z2) {
            if (z) {
                return j3;
            }
            return j6;
        }
        return j2;
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: e */
    public final void mo3531e() throws IOException {
        try {
            C1174o9 c1174o9 = this.f12165q;
            int iM1085l = this.f12157d.m1085l(this.f12142I);
            IOException iOException = (IOException) c1174o9.f7701d;
            if (iOException != null) {
                throw iOException;
            }
            uu0 uu0Var = (uu0) c1174o9.f7700c;
            if (uu0Var != null) {
                if (iM1085l == Integer.MIN_VALUE) {
                    iM1085l = uu0Var.f11422a;
                }
                IOException iOException2 = uu0Var.f11425d;
                if (iOException2 != null && uu0Var.f11426e > iM1085l) {
                    throw iOException2;
                }
            }
            if (this.f12152S && !this.f12135B) {
                throw fc1.m2799a(null, "Loading finished before preparation is complete.");
            }
        } catch (IOException e) {
            if (!this.f12163o) {
                throw e;
            }
            AbstractC1337qm.m5551n("ProgressiveMediaPeriod", "Suppressing preparation error because suppressPrepareError=true", e);
            this.f12134A = true;
            m6778A(new C0825ke(-9223372036854775807L));
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6 A[LOOP:1: B:60:0x00a4->B:61:0x00a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c6 A[LOOP:2: B:65:0x00c4->B:66:0x00c6, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:59:0x00a0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x00bb, please report this as an issue */
    @Override // p000.j21
    /* JADX INFO: renamed from: f */
    public final long mo3532f(long j) {
        int i;
        int i2;
        boolean zM6945m;
        m6781a();
        boolean[] zArr = (boolean[]) this.f12138E.f3314b;
        if (!this.f12139F.mo6c()) {
            j = 0;
        }
        this.f12144K = false;
        boolean z = this.f12148O == j;
        this.f12148O = j;
        if (m6784t()) {
            this.f12149P = j;
            return j;
        }
        if (this.f12142I == 7 || !(this.f12152S || this.f12165q.m4749O())) {
            this.f12150Q = false;
            this.f12149P = j;
            this.f12152S = false;
            this.f12145L = false;
            if (this.f12165q.m4749O()) {
                this.f12165q.f7701d = null;
                for (xo1 xo1Var : this.f12173y) {
                    xo1Var.m6944l(false);
                }
                break;
            }
            for (xo1 xo1Var2 : this.f12173y) {
                xo1Var2.m6938f();
            }
            uu0 uu0Var = (uu0) this.f12165q.f7700c;
            ki0.m3866j(uu0Var);
            uu0Var.m6541a(false);
            return j;
        }
        int length = this.f12173y.length;
        for (int i3 = 0; i3 < length; i3++) {
            xo1 xo1Var3 = this.f12173y[i3];
            int i4 = xo1Var3.f12677q;
            if (xo1Var3.f12679s + i4 != 0 || !z) {
                if (this.f12137D) {
                    synchronized (xo1Var3) {
                        synchronized (xo1Var3) {
                            xo1Var3.f12679s = 0;
                            vo1 vo1Var = xo1Var3.f12661a;
                            vo1Var.f11736e = vo1Var.f11735d;
                        }
                    }
                    int i5 = xo1Var3.f12677q;
                    if (i4 < i5 || i4 > xo1Var3.f12676p + i5) {
                        zM6945m = false;
                    } else {
                        xo1Var3.f12680t = Long.MIN_VALUE;
                        xo1Var3.f12679s = i4 - i5;
                        zM6945m = true;
                    }
                } else {
                    zM6945m = xo1Var3.m6945m(j, false);
                }
                if (!zM6945m && (zArr[i3] || !this.f12136C)) {
                    this.f12150Q = false;
                    this.f12149P = j;
                    this.f12152S = false;
                    this.f12145L = false;
                    if (this.f12165q.m4749O()) {
                        this.f12165q.f7701d = null;
                        while (i < r0) {
                            xo1Var.m6944l(false);
                        }
                        break;
                        break;
                    }
                    while (i2 < r2) {
                        xo1Var2.m6938f();
                    }
                    uu0 uu0Var2 = (uu0) this.f12165q.f7700c;
                    ki0.m3866j(uu0Var2);
                    uu0Var2.m6541a(false);
                    return j;
                }
            }
        }
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    @Override // p000.j21
    /* JADX INFO: renamed from: g */
    public final void mo3533g(long j) {
        long jM6937e;
        long j2;
        int i;
        if (this.f12137D) {
            return;
        }
        m6781a();
        if (m6784t()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.f12138E.f3315c;
        int length = this.f12173y.length;
        int i2 = 0;
        while (i2 < length) {
            xo1 xo1Var = this.f12173y[i2];
            boolean z = zArr[i2];
            vo1 vo1Var = xo1Var.f12661a;
            synchronized (xo1Var) {
                try {
                    int i3 = xo1Var.f12676p;
                    jM6937e = -1;
                    if (i3 != 0) {
                        long[] jArr = xo1Var.f12674n;
                        int i4 = xo1Var.f12678r;
                        if (j < jArr[i4]) {
                            j2 = j;
                        } else {
                            j2 = j;
                            int iM6939g = xo1Var.m6939g(i4, (!z || (i = xo1Var.f12679s) == i3) ? i3 : i + 1, j2, false);
                            if (iM6939g != -1) {
                                jM6937e = xo1Var.m6937e(iM6939g);
                            }
                        }
                    } else {
                        j2 = j;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            vo1Var.m6649a(jM6937e);
            i2++;
            j = j2;
        }
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: h */
    public final boolean mo4343h() {
        boolean z;
        if (!this.f12165q.m4749O()) {
            return false;
        }
        C0073as c0073as = this.f12167s;
        synchronized (c0073as) {
            z = c0073as.f1039a;
        }
        return z;
    }

    /* JADX INFO: renamed from: i */
    public final int m6782i() {
        int i = 0;
        for (xo1 xo1Var : this.f12173y) {
            i += xo1Var.f12677q + xo1Var.f12676p;
        }
        return i;
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: j */
    public final long mo3534j() {
        if (this.f12145L) {
            this.f12145L = false;
            return this.f12148O;
        }
        if (!this.f12144K) {
            return -9223372036854775807L;
        }
        if (!this.f12152S && m6782i() <= this.f12151R) {
            return -9223372036854775807L;
        }
        this.f12144K = false;
        return this.f12148O;
    }

    @Override // p000.z80
    /* JADX INFO: renamed from: k */
    public final void mo748k() {
        this.f12134A = true;
        this.f12170v.post(this.f12168t);
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: l */
    public final void mo3535l(i21 i21Var, long j) {
        this.f12171w = i21Var;
        this.f12167s.m699a();
        m6779B();
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: m */
    public final z12 mo3536m() {
        m6781a();
        return (z12) this.f12138E.f3313a;
    }

    @Override // p000.z80
    /* JADX INFO: renamed from: n */
    public final c22 mo750n(int i, int i2) {
        return m6790z(new vg1(i, false));
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: o */
    public final boolean mo4344o(fv0 fv0Var) {
        if (this.f12152S) {
            return false;
        }
        C1174o9 c1174o9 = this.f12165q;
        if (((IOException) c1174o9.f7701d) != null || this.f12150Q) {
            return false;
        }
        if (this.f12135B && this.f12146M == 0) {
            return false;
        }
        boolean zM699a = this.f12167s.m699a();
        if (c1174o9.m4749O()) {
            return zM699a;
        }
        m6779B();
        return true;
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: p */
    public final long mo4345p() {
        long jM6783s;
        boolean z;
        long j;
        m6781a();
        if (this.f12152S || this.f12146M == 0) {
            return Long.MIN_VALUE;
        }
        if (m6784t()) {
            return this.f12149P;
        }
        if (this.f12136C) {
            int length = this.f12173y.length;
            jM6783s = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                C0599ed c0599ed = this.f12138E;
                if (((boolean[]) c0599ed.f3314b)[i] && ((boolean[]) c0599ed.f3315c)[i]) {
                    xo1 xo1Var = this.f12173y[i];
                    synchronized (xo1Var) {
                        z = xo1Var.f12683w;
                    }
                    if (z) {
                        continue;
                    } else {
                        xo1 xo1Var2 = this.f12173y[i];
                        synchronized (xo1Var2) {
                            j = xo1Var2.f12682v;
                        }
                        jM6783s = Math.min(jM6783s, j);
                    }
                }
            }
        } else {
            jM6783s = Long.MAX_VALUE;
        }
        if (jM6783s == Long.MAX_VALUE) {
            jM6783s = m6783s(false);
        }
        return jM6783s == Long.MIN_VALUE ? this.f12148O : jM6783s;
    }

    @Override // p000.z80
    /* JADX INFO: renamed from: q */
    public final void mo752q(kq1 kq1Var) {
        this.f12170v.post(new RunnableC1467u4(25, this, kq1Var));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX INFO: renamed from: s */
    public final long m6783s(boolean z) {
        xo1 xo1Var;
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < this.f12173y.length; i++) {
            if (z) {
                xo1Var = this.f12173y[i];
                synchronized (xo1Var) {
                    jMax = Math.max(jMax, xo1Var.f12682v);
                }
            } else {
                C0599ed c0599ed = this.f12138E;
                c0599ed.getClass();
                if (((boolean[]) c0599ed.f3315c)[i]) {
                    xo1Var = this.f12173y[i];
                    synchronized (xo1Var) {
                    }
                    jMax = Math.max(jMax, xo1Var.f12682v);
                } else {
                    continue;
                }
            }
        }
        return jMax;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m6784t() {
        return this.f12149P != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public final void m6785u() {
        be0 be0Var;
        k51 k51VarM3802a;
        long j = this.f12164p;
        if (this.f12153T || this.f12135B || !this.f12134A || this.f12139F == null) {
            return;
        }
        xo1[] xo1VarArr = this.f12173y;
        int length = xo1VarArr.length;
        char c = 0;
        int i = 0;
        while (true) {
            be0 be0Var2 = null;
            if (i >= length) {
                C0073as c0073as = this.f12167s;
                synchronized (c0073as) {
                    c0073as.f1039a = false;
                }
                int length2 = this.f12173y.length;
                y12[] y12VarArr = new y12[length2];
                boolean[] zArr = new boolean[length2];
                int i2 = 0;
                while (i2 < length2) {
                    xo1 xo1Var = this.f12173y[i2];
                    synchronized (xo1Var) {
                        be0Var = xo1Var.f12685y ? null : xo1Var.f12686z;
                    }
                    be0Var.getClass();
                    String str = be0Var.f1341n;
                    boolean zM6578h = v51.m6578h(str);
                    boolean z = (zM6578h || v51.m6581k(str)) ? true : c;
                    zArr[i2] = z;
                    char c2 = c;
                    this.f12136C = (this.f12136C ? 1 : 0) | (z ? 1 : 0);
                    this.f12137D = (j != -9223372036854775807L && length2 == 1 && v51.m6579i(str)) ? 1 : c2;
                    wl0 wl0Var = this.f12172x;
                    if (wl0Var != null) {
                        int i3 = wl0Var.f12218a;
                        if (zM6578h || this.f12174z[i2].f11656b) {
                            k51 k51Var = be0Var.f1339l;
                            if (k51Var == null) {
                                f51[] f51VarArr = new f51[1];
                                f51VarArr[c2] = wl0Var;
                                k51VarM3802a = new k51(f51VarArr);
                            } else {
                                f51[] f51VarArr2 = new f51[1];
                                f51VarArr2[c2] = wl0Var;
                                k51VarM3802a = k51Var.m3802a(f51VarArr2);
                            }
                            ae0 ae0VarM969a = be0Var.m969a();
                            ae0VarM969a.f195k = k51VarM3802a;
                            be0Var = new be0(ae0VarM969a);
                        }
                        if (zM6578h && be0Var.f1335h == -1 && be0Var.f1336i == -1 && i3 != -1) {
                            ae0 ae0VarM969a2 = be0Var.m969a();
                            ae0VarM969a2.f192h = i3;
                            be0Var = new be0(ae0VarM969a2);
                        }
                    }
                    int iMo2497d = this.f12156c.mo2497d(be0Var);
                    ae0 ae0VarM969a3 = be0Var.m969a();
                    ae0VarM969a3.f184K = iMo2497d;
                    be0 be0Var3 = new be0(ae0VarM969a3);
                    y12VarArr[i2] = new y12(Integer.toString(i2), be0Var3);
                    this.f12145L = be0Var3.f1347t | this.f12145L;
                    i2++;
                    c = c2;
                }
                z12 z12Var = new z12(y12VarArr);
                C0599ed c0599ed = new C0599ed();
                c0599ed.f3313a = z12Var;
                c0599ed.f3314b = zArr;
                int i4 = z12Var.f13237a;
                c0599ed.f3315c = new boolean[i4];
                c0599ed.f3316d = new boolean[i4];
                this.f12138E = c0599ed;
                if (this.f12137D && this.f12140G == -9223372036854775807L) {
                    this.f12140G = j;
                    this.f12139F = new sg1(this, this.f12139F);
                }
                this.f12160g.m7308t(this.f12140G, this.f12139F.mo6c(), this.f12141H);
                this.f12135B = true;
                i21 i21Var = this.f12171w;
                i21Var.getClass();
                i21Var.mo3331a(this);
                return;
            }
            xo1 xo1Var2 = xo1VarArr[i];
            synchronized (xo1Var2) {
                if (!xo1Var2.f12685y) {
                    be0Var2 = xo1Var2.f12686z;
                }
            }
            if (be0Var2 == null) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m6786v(int i) {
        m6781a();
        C0599ed c0599ed = this.f12138E;
        boolean[] zArr = (boolean[]) c0599ed.f3316d;
        if (zArr[i]) {
            return;
        }
        be0 be0Var = ((z12) c0599ed.f3313a).m7184a(i).f12805d[0];
        b21 b21Var = new b21(v51.m6577g(be0Var.f1341n), be0Var, z42.m7226N(this.f12148O), -9223372036854775807L);
        c40 c40Var = this.f12158e;
        c40Var.m1126a(new C0702h5(11, c40Var, b21Var));
        zArr[i] = true;
    }

    /* JADX INFO: renamed from: w */
    public final void m6787w(int i) {
        m6781a();
        boolean[] zArr = (boolean[]) this.f12138E.f3314b;
        if (this.f12150Q && zArr[i] && !this.f12173y[i].m6941i(false)) {
            this.f12149P = 0L;
            this.f12150Q = false;
            this.f12144K = true;
            this.f12148O = 0L;
            this.f12151R = 0;
            for (xo1 xo1Var : this.f12173y) {
                xo1Var.m6944l(false);
            }
            i21 i21Var = this.f12171w;
            i21Var.getClass();
            i21Var.mo3332i(this);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m6788x(tg1 tg1Var, boolean z) {
        Uri uri = tg1Var.f10869b.f5575c;
        su0 su0Var = new su0();
        this.f12157d.getClass();
        b21 b21Var = new b21(-1, null, z42.m7226N(tg1Var.f10876i), z42.m7226N(this.f12140G));
        c40 c40Var = this.f12158e;
        c40Var.m1126a(new s21(c40Var, su0Var, b21Var, 2));
        if (z) {
            return;
        }
        for (xo1 xo1Var : this.f12173y) {
            xo1Var.m6944l(false);
        }
        if (this.f12146M > 0) {
            i21 i21Var = this.f12171w;
            i21Var.getClass();
            i21Var.mo3332i(this);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m6789y(tg1 tg1Var) {
        kq1 kq1Var;
        if (this.f12140G == -9223372036854775807L && (kq1Var = this.f12139F) != null) {
            boolean zMo6c = kq1Var.mo6c();
            long jM6783s = m6783s(true);
            long j = jM6783s == Long.MIN_VALUE ? 0L : jM6783s + 10000;
            this.f12140G = j;
            this.f12160g.m7308t(j, zMo6c, this.f12141H);
        }
        Uri uri = tg1Var.f10869b.f5575c;
        su0 su0Var = new su0();
        this.f12157d.getClass();
        b21 b21Var = new b21(-1, null, z42.m7226N(tg1Var.f10876i), z42.m7226N(this.f12140G));
        c40 c40Var = this.f12158e;
        c40Var.m1126a(new s21(c40Var, su0Var, b21Var, 1));
        this.f12152S = true;
        i21 i21Var = this.f12171w;
        i21Var.getClass();
        i21Var.mo3332i(this);
    }

    /* JADX INFO: renamed from: z */
    public final c22 m6790z(vg1 vg1Var) {
        int length = this.f12173y.length;
        for (int i = 0; i < length; i++) {
            if (vg1Var.equals(this.f12174z[i])) {
                return this.f12173y[i];
            }
        }
        if (this.f12134A) {
            AbstractC1337qm.m5542i0("ProgressiveMediaPeriod", "Extractor added new track (id=" + vg1Var.f11655a + ") after finishing tracks.");
            return new t20();
        }
        g40 g40Var = this.f12156c;
        g40Var.getClass();
        xo1 xo1Var = new xo1(this.f12161m, g40Var, this.f12159f);
        xo1Var.f12666f = this;
        int i2 = length + 1;
        vg1[] vg1VarArr = (vg1[]) Arrays.copyOf(this.f12174z, i2);
        vg1VarArr[length] = vg1Var;
        int i3 = z42.f13274a;
        this.f12174z = vg1VarArr;
        xo1[] xo1VarArr = (xo1[]) Arrays.copyOf(this.f12173y, i2);
        xo1VarArr[length] = xo1Var;
        this.f12173y = xo1VarArr;
        return xo1Var;
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: r */
    public final void mo4346r(long j) {
    }
}

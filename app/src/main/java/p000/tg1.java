package p000;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class tg1 {

    /* JADX INFO: renamed from: a */
    public final Uri f10868a;

    /* JADX INFO: renamed from: b */
    public final jv1 f10869b;

    /* JADX INFO: renamed from: c */
    public final C1174o9 f10870c;

    /* JADX INFO: renamed from: d */
    public final wg1 f10871d;

    /* JADX INFO: renamed from: e */
    public final C0073as f10872e;

    /* JADX INFO: renamed from: g */
    public volatile boolean f10874g;

    /* JADX INFO: renamed from: i */
    public long f10876i;

    /* JADX INFO: renamed from: j */
    public C1087lx f10877j;

    /* JADX INFO: renamed from: k */
    public c22 f10878k;

    /* JADX INFO: renamed from: l */
    public boolean f10879l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ wg1 f10880m;

    /* JADX INFO: renamed from: f */
    public final bb0 f10873f = new bb0();

    /* JADX INFO: renamed from: h */
    public boolean f10875h = true;

    public tg1(wg1 wg1Var, Uri uri, InterfaceC0807jx interfaceC0807jx, C1174o9 c1174o9, wg1 wg1Var2, C0073as c0073as) {
        this.f10880m = wg1Var;
        this.f10868a = uri;
        this.f10869b = new jv1(interfaceC0807jx);
        this.f10870c = c1174o9;
        this.f10871d = wg1Var2;
        this.f10872e = c0073as;
        su0.f10544a.getAndIncrement();
        this.f10877j = m6271a(0L);
    }

    /* JADX INFO: renamed from: a */
    public final C1087lx m6271a(long j) {
        Map map = Collections.EMPTY_MAP;
        Map map2 = wg1.f12132U;
        Uri uri = this.f10868a;
        ki0.m3867k(uri, "The uri must be set.");
        return new C1087lx(uri, 1, null, map2, j, -1L, 6);
    }

    /* JADX INFO: renamed from: b */
    public final void m6272b() {
        InterfaceC0807jx ul0Var;
        x80 x80Var;
        int i;
        int iMo124b = 0;
        while (iMo124b == 0 && !this.f10874g) {
            try {
                long j = this.f10873f.f1280a;
                C1087lx c1087lxM6271a = m6271a(j);
                this.f10877j = c1087lxM6271a;
                long jMo3053c = this.f10869b.mo3053c(c1087lxM6271a);
                if (this.f10874g) {
                    if (iMo124b != 1 && this.f10870c.m4776y() != -1) {
                        this.f10873f.f1280a = this.f10870c.m4776y();
                    }
                    jv1 jv1Var = this.f10869b;
                    if (jv1Var != null) {
                        try {
                            jv1Var.close();
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    return;
                }
                if (jMo3053c != -1) {
                    jMo3053c += j;
                    wg1 wg1Var = this.f10880m;
                    wg1Var.f12170v.post(new rg1(wg1Var, 0));
                }
                long j2 = jMo3053c;
                this.f10880m.f12172x = wl0.m6807a(this.f10869b.f5573a.mo3714j());
                jv1 jv1Var2 = this.f10869b;
                wl0 wl0Var = this.f10880m.f12172x;
                if (wl0Var == null || (i = wl0Var.f12223f) == -1) {
                    ul0Var = jv1Var2;
                } else {
                    ul0Var = new ul0(jv1Var2, i, this);
                    c22 c22VarM6790z = this.f10880m.m6790z(new vg1(0, true));
                    this.f10878k = c22VarM6790z;
                    c22VarM6790z.mo1117d(wg1.f12133V);
                }
                this.f10870c.m4745K(ul0Var, this.f10868a, this.f10869b.f5573a.mo3714j(), j, j2, this.f10871d);
                if (this.f10880m.f12172x != null && (x80Var = (x80) this.f10870c.f7700c) != null && (x80Var instanceof j61)) {
                    ((j61) x80Var).f5304q = true;
                }
                if (this.f10875h) {
                    C1174o9 c1174o9 = this.f10870c;
                    long j3 = this.f10876i;
                    x80 x80Var2 = (x80) c1174o9.f7700c;
                    x80Var2.getClass();
                    x80Var2.mo126f(j, j3);
                    this.f10875h = false;
                }
                while (iMo124b == 0 && !this.f10874g) {
                    try {
                        C0073as c0073as = this.f10872e;
                        synchronized (c0073as) {
                            while (!c0073as.f1039a) {
                                try {
                                    c0073as.wait();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        C1174o9 c1174o10 = this.f10870c;
                        bb0 bb0Var = this.f10873f;
                        x80 x80Var3 = (x80) c1174o10.f7700c;
                        x80Var3.getClass();
                        C0584dz c0584dz = (C0584dz) c1174o10.f7701d;
                        c0584dz.getClass();
                        iMo124b = x80Var3.mo124b(c0584dz, bb0Var);
                        long jM4776y = this.f10870c.m4776y();
                        if (jM4776y > this.f10880m.f12162n + j) {
                            C0073as c0073as2 = this.f10872e;
                            synchronized (c0073as2) {
                                c0073as2.f1039a = false;
                            }
                            wg1 wg1Var2 = this.f10880m;
                            wg1Var2.f12170v.post(wg1Var2.f12169u);
                            j = jM4776y;
                        }
                    } catch (InterruptedException unused2) {
                        throw new InterruptedIOException();
                    }
                }
                if (iMo124b == 1) {
                    iMo124b = 0;
                } else if (this.f10870c.m4776y() != -1) {
                    this.f10873f.f1280a = this.f10870c.m4776y();
                }
                jv1 jv1Var3 = this.f10869b;
                if (jv1Var3 != null) {
                    try {
                        jv1Var3.close();
                    } catch (IOException unused3) {
                    }
                }
            } catch (Throwable th2) {
                if (iMo124b != 1 && this.f10870c.m4776y() != -1) {
                    this.f10873f.f1280a = this.f10870c.m4776y();
                }
                jv1 jv1Var4 = this.f10869b;
                if (jv1Var4 != null) {
                    try {
                        jv1Var4.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th2;
            }
        }
    }
}

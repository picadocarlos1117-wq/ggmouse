package p000;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class tq0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10924a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vq0 f10925b;

    public /* synthetic */ tq0(vq0 vq0Var, int i) {
        this.f10924a = i;
        this.f10925b = vq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vq0 vq0Var;
        boolean z;
        long jNextLong;
        boolean z2 = true;
        switch (this.f10924a) {
            case 0:
                synchronized (this.f10925b) {
                    try {
                        vq0Var = this.f10925b;
                        if (vq0Var.f11746d != 6) {
                            vq0Var.f11746d = 6;
                        } else {
                            z2 = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (z2) {
                    ((y91) vq0Var.f11745c.f8968a).mo2577b(nv1.f7559n.m4614g("Keepalive failed. The connection is likely gone"));
                    return;
                }
                return;
            default:
                synchronized (this.f10925b) {
                    try {
                        vq0 vq0Var2 = this.f10925b;
                        vq0Var2.f11748f = null;
                        int i = vq0Var2.f11746d;
                        if (i == 2) {
                            vq0Var2.f11746d = 4;
                            vq0Var2.f11747e = vq0Var2.f11743a.schedule(vq0Var2.f11749g, vq0Var2.f11752j, TimeUnit.NANOSECONDS);
                            z = true;
                        } else {
                            if (i == 3) {
                                vq0Var2.f11748f = vq0Var2.f11743a.schedule(vq0Var2.f11750h, vq0Var2.f11751i - vq0Var2.f11744b.m6141a(), TimeUnit.NANOSECONDS);
                                this.f10925b.f11746d = 2;
                            }
                            z = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                if (z) {
                    pn0 pn0Var = this.f10925b.f11745c;
                    y91 y91Var = (y91) pn0Var.f8968a;
                    uq0 uq0Var = new uq0(pn0Var);
                    r20 r20Var = r20.f9658a;
                    synchronized (y91Var.f12899k) {
                        try {
                            p32.m5192w(y91Var.f12897i != null);
                            if (y91Var.f12913y) {
                                pv1 pv1VarM7060l = y91Var.m7060l();
                                Logger logger = yk0.f13000g;
                                try {
                                    r20Var.execute(new xk0(uq0Var, pv1VarM7060l));
                                    break;
                                } catch (Throwable th3) {
                                    yk0.f13000g.log(Level.SEVERE, "Failed to execute PingCallback", th3);
                                }
                                return;
                            }
                            yk0 yk0Var = y91Var.f12912x;
                            if (yk0Var != null) {
                                jNextLong = 0;
                                z2 = false;
                            } else {
                                jNextLong = y91Var.f12892d.nextLong();
                                sv1 sv1Var = (sv1) y91Var.f12893e.get();
                                sv1Var.m6142b();
                                yk0 yk0Var2 = new yk0(jNextLong, sv1Var);
                                y91Var.f12912x = yk0Var2;
                                y91Var.f12885M.getClass();
                                yk0Var = yk0Var2;
                            }
                            if (z2) {
                                y91Var.f12897i.m2733e((int) (jNextLong >>> 32), (int) jNextLong, false);
                            }
                            synchronized (yk0Var) {
                                try {
                                    if (!yk0Var.f13004d) {
                                        yk0Var.f13003c.put(uq0Var, r20Var);
                                        return;
                                    }
                                    pv1 pv1Var = yk0Var.f13005e;
                                    xk0 xk0Var = pv1Var != null ? new xk0(uq0Var, pv1Var) : new xk0(uq0Var, yk0Var.f13006f);
                                    try {
                                        r20Var.execute(xk0Var);
                                        return;
                                    } catch (Throwable th4) {
                                        yk0.f13000g.log(Level.SEVERE, "Failed to execute PingCallback", th4);
                                        return;
                                    }
                                } catch (Throwable th5) {
                                    throw th5;
                                }
                            }
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                }
                return;
        }
    }
}

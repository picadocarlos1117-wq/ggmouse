package p000;

import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class x91 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final qo0 f12501a;

    /* JADX INFO: renamed from: b */
    public final uk0 f12502b;

    /* JADX INFO: renamed from: c */
    public boolean f12503c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ y91 f12504d;

    public x91(y91 y91Var, uk0 uk0Var) {
        this.f12504d = y91Var;
        Level level = Level.FINE;
        this.f12501a = new qo0(10);
        this.f12503c = true;
        this.f12502b = uk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y91 y91Var;
        nv1 nv1VarM4614g;
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName("OkHttpClientTransport");
        while (true) {
            try {
                boolean zM6497c = this.f12502b.m6497c(this);
                y91Var = this.f12504d;
                if (!zM6497c) {
                    break;
                }
                vq0 vq0Var = y91Var.f12879G;
                if (vq0Var != null) {
                    vq0Var.m6651a();
                }
            } catch (Throwable th) {
                try {
                    y91 y91Var2 = this.f12504d;
                    b70 b70Var = b70.PROTOCOL_ERROR;
                    nv1 nv1VarM4613f = nv1.f7558m.m4614g("error in frame handler").m4613f(th);
                    Map map = y91.f12871Q;
                    y91Var2.m7065r(0, b70Var, nv1VarM4613f);
                    try {
                        this.f12502b.close();
                    } catch (IOException e) {
                        e = e;
                        y91.f12872R.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                    } catch (RuntimeException e2) {
                        if (!"bio == null".equals(e2.getMessage())) {
                            throw e2;
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        this.f12502b.close();
                    } catch (IOException e3) {
                        y91.f12872R.log(Level.INFO, "Exception closing frame reader", (Throwable) e3);
                    } catch (RuntimeException e4) {
                        if (!"bio == null".equals(e4.getMessage())) {
                            throw e4;
                        }
                    }
                    this.f12504d.f12896h.m6744e();
                    Thread.currentThread().setName(name);
                    throw th2;
                }
            }
        }
        synchronized (y91Var.f12899k) {
            nv1VarM4614g = this.f12504d.f12910v;
        }
        if (nv1VarM4614g == null) {
            nv1VarM4614g = nv1.f7559n.m4614g("End of stream or IOException");
        }
        this.f12504d.m7065r(0, b70.INTERNAL_ERROR, nv1VarM4614g);
        try {
            this.f12502b.close();
        } catch (IOException e5) {
            e = e5;
            y91.f12872R.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
        } catch (RuntimeException e6) {
            if (!"bio == null".equals(e6.getMessage())) {
                throw e6;
            }
        }
        this.f12504d.f12896h.m6744e();
        Thread.currentThread().setName(name);
    }
}

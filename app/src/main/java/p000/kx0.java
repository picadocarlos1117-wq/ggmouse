package p000;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class kx0 extends AbstractC0610eo {

    /* JADX INFO: renamed from: o */
    public static final k10 f6050o;

    /* JADX INFO: renamed from: a */
    public final ScheduledFuture f6051a;

    /* JADX INFO: renamed from: b */
    public final Executor f6052b;

    /* JADX INFO: renamed from: c */
    public final C1307pt f6053c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f6054d;

    /* JADX INFO: renamed from: e */
    public AbstractC0143co f6055e;

    /* JADX INFO: renamed from: f */
    public AbstractC0610eo f6056f;

    /* JADX INFO: renamed from: g */
    public nv1 f6057g;

    /* JADX INFO: renamed from: h */
    public List f6058h;

    /* JADX INFO: renamed from: i */
    public m10 f6059i;

    /* JADX INFO: renamed from: j */
    public final C1307pt f6060j;

    /* JADX INFO: renamed from: k */
    public final u51 f6061k;

    /* JADX INFO: renamed from: l */
    public final C0022al f6062l;

    /* JADX INFO: renamed from: m */
    public final long f6063m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ lx0 f6064n;

    static {
        Logger.getLogger(kx0.class.getName());
        f6050o = new k10(0);
    }

    public kx0(lx0 lx0Var, C1307pt c1307pt, u51 u51Var, C0022al c0022al) {
        ScheduledFuture<?> scheduledFutureSchedule;
        this.f6064n = lx0Var;
        ox0 ox0Var = lx0Var.f6545l;
        Logger logger = ox0.f8508l0;
        Executor executor = c0022al.f259b;
        executor = executor == null ? ox0Var.f8560p : executor;
        mx0 mx0Var = ox0Var.f8559o;
        C1274ox c1274ox = c0022al.f258a;
        this.f6058h = new ArrayList();
        p32.m5188s(executor, "callExecutor");
        this.f6052b = executor;
        p32.m5188s(mx0Var, "scheduler");
        C1307pt c1307ptM5325b = C1307pt.m5325b();
        this.f6053c = c1307ptM5325b;
        c1307ptM5325b.getClass();
        if (c1274ox == null) {
            scheduledFutureSchedule = null;
        } else {
            long jM5076b = c1274ox.m5076b();
            long jAbs = Math.abs(jM5076b) / 1000000000;
            long jAbs2 = Math.abs(jM5076b) % 1000000000;
            StringBuilder sb = new StringBuilder();
            if (jM5076b < 0) {
                sb.append("ClientCall started after CallOptions deadline was exceeded. Deadline has been exceeded for ");
            } else {
                sb.append("Deadline CallOptions will be exceeded in ");
            }
            sb.append(jAbs);
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
            sb.append("s. ");
            scheduledFutureSchedule = mx0Var.f7130a.schedule(new RunnableC1466u3(6, this, sb), jM5076b, TimeUnit.NANOSECONDS);
        }
        this.f6051a = scheduledFutureSchedule;
        this.f6060j = c1307pt;
        this.f6061k = u51Var;
        this.f6062l = c0022al;
        ox0Var.f8548g0.getClass();
        this.f6063m = System.nanoTime();
    }

    /* JADX INFO: renamed from: a */
    public final void m4005a(nv1 nv1Var, boolean z) {
        AbstractC0143co abstractC0143co;
        boolean z2;
        synchronized (this) {
            try {
                AbstractC0610eo abstractC0610eo = this.f6056f;
                int i = 1;
                if (abstractC0610eo == null) {
                    k10 k10Var = f6050o;
                    z2 = false;
                    p32.m5194y(abstractC0610eo == null, "realCall already set to %s", abstractC0610eo);
                    ScheduledFuture scheduledFuture = this.f6051a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f6056f = k10Var;
                    abstractC0143co = this.f6055e;
                    this.f6057g = nv1Var;
                } else {
                    if (z) {
                        return;
                    }
                    abstractC0143co = null;
                    z2 = true;
                }
                if (z2) {
                    m4006b(new RunnableC1466u3(7, this, nv1Var));
                } else {
                    if (abstractC0143co != null) {
                        this.f6052b.execute(new l10(this, abstractC0143co, nv1Var));
                    }
                    m4007c();
                }
                this.f6064n.f6545l.f8565u.execute(new j10(this, i));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4006b(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f6054d) {
                    runnable.run();
                } else {
                    this.f6058h.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4007c() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.f6058h     // Catch: java.lang.Throwable -> L24
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            r0 = 0
            r3.f6058h = r0     // Catch: java.lang.Throwable -> L24
            r0 = 1
            r3.f6054d = r0     // Catch: java.lang.Throwable -> L24
            m10 r0 = r3.f6059i     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.f6052b
            ho r2 = new ho
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            r0 = move-exception
            goto L44
        L26:
            java.util.List r1 = r3.f6058h     // Catch: java.lang.Throwable -> L24
            r3.f6058h = r0     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r0 = r1.iterator()
        L2f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2f
        L3f:
            r1.clear()
            r0 = r1
            goto L5
        L44:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kx0.m4007c():void");
    }

    @Override // p000.AbstractC0610eo
    public final void cancel(String str, Throwable th) {
        nv1 nv1Var = nv1.f7551f;
        nv1 nv1VarM4614g = str != null ? nv1Var.m4614g(str) : nv1Var.m4614g("Call cancelled without message");
        if (th != null) {
            nv1VarM4614g = nv1VarM4614g.m4613f(th);
        }
        m4005a(nv1VarM4614g, false);
    }

    /* JADX INFO: renamed from: d */
    public final void m4008d() {
        int i;
        C0721ho c0721ho;
        C1307pt c1307ptM5326a = this.f6060j.m5326a();
        try {
            C0022al c0022al = this.f6062l;
            C0101bj c0101bj = rc2.f9888a;
            this.f6064n.f6545l.f8548g0.getClass();
            AbstractC0610eo abstractC0610eoM4318C0 = this.f6064n.m4318C0(this.f6061k, c0022al.m169c(c0101bj, Long.valueOf(System.nanoTime() - this.f6063m)));
            this.f6060j.m5327c(c1307ptM5326a);
            synchronized (this) {
                try {
                    AbstractC0610eo abstractC0610eo = this.f6056f;
                    i = 1;
                    if (abstractC0610eo != null) {
                        c0721ho = null;
                    } else {
                        p32.m5194y(abstractC0610eo == null, "realCall already set to %s", abstractC0610eo);
                        ScheduledFuture scheduledFuture = this.f6051a;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        this.f6056f = abstractC0610eoM4318C0;
                        c0721ho = new C0721ho(this, this.f6053c);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ox0 ox0Var = this.f6064n.f6545l;
            if (c0721ho == null) {
                ox0Var.f8565u.execute(new j10(this, i));
                return;
            }
            Executor executor = this.f6062l.f259b;
            if (executor == null) {
                executor = ox0Var.f8560p;
            }
            executor.execute(new RunnableC1466u3(26, this, c0721ho));
        } catch (Throwable th2) {
            this.f6060j.m5327c(c1307ptM5326a);
            throw th2;
        }
    }

    @Override // p000.AbstractC0610eo
    public final C1437tb getAttributes() {
        AbstractC0610eo abstractC0610eo;
        synchronized (this) {
            abstractC0610eo = this.f6056f;
        }
        return abstractC0610eo != null ? abstractC0610eo.getAttributes() : C1437tb.f10816b;
    }

    @Override // p000.AbstractC0610eo
    public final void halfClose() {
        m4006b(new j10(this, 0));
    }

    @Override // p000.AbstractC0610eo
    public final boolean isReady() {
        if (this.f6054d) {
            return this.f6056f.isReady();
        }
        return false;
    }

    @Override // p000.AbstractC0610eo
    public final void request(int i) {
        if (this.f6054d) {
            this.f6056f.request(i);
        } else {
            m4006b(new RunnableC0120c2(i, 2, this));
        }
    }

    @Override // p000.AbstractC0610eo
    public final void sendMessage(Object obj) {
        if (this.f6054d) {
            this.f6056f.sendMessage(obj);
        } else {
            m4006b(new RunnableC1466u3(8, this, obj));
        }
    }

    @Override // p000.AbstractC0610eo
    public final void setMessageCompression(boolean z) {
        if (this.f6054d) {
            this.f6056f.setMessageCompression(z);
        } else {
            m4006b(new RunnableC1175oa(z, 1, this));
        }
    }

    @Override // p000.AbstractC0610eo
    public final void start(AbstractC0143co abstractC0143co, j51 j51Var) {
        nv1 nv1Var;
        boolean z;
        p32.m5193x(this.f6055e == null, "already started");
        synchronized (this) {
            try {
                p32.m5188s(abstractC0143co, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                this.f6055e = abstractC0143co;
                nv1Var = this.f6057g;
                z = this.f6054d;
                if (!z) {
                    m10 m10Var = new m10(abstractC0143co);
                    this.f6059i = m10Var;
                    abstractC0143co = m10Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (nv1Var != null) {
            this.f6052b.execute(new l10(this, abstractC0143co, nv1Var));
        } else if (z) {
            this.f6056f.start(abstractC0143co, j51Var);
        } else {
            m4006b(new i10(this, abstractC0143co, j51Var, 0));
        }
    }

    public final String toString() {
        C1679zv c1679zvM5176k0 = p32.m5176k0(this);
        c1679zvM5176k0.m7359a(this.f6056f, "realCall");
        return c1679zvM5176k0.toString();
    }
}

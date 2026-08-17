package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: tg */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1442tg {

    /* JADX INFO: renamed from: e */
    public static final Logger f10863e = Logger.getLogger(C1442tg.class.getName());

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f10864a;

    /* JADX INFO: renamed from: b */
    public final ry1 f10865b;

    /* JADX INFO: renamed from: c */
    public p80 f10866c;

    /* JADX INFO: renamed from: d */
    public qo0 f10867d;

    public C1442tg(bz1 bz1Var, mx0 mx0Var, ry1 ry1Var) {
        this.f10864a = mx0Var;
        this.f10865b = ry1Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m6270a(RunnableC1621ya runnableC1621ya) {
        this.f10865b.m5930d();
        if (this.f10866c == null) {
            this.f10866c = bz1.m1078h();
        }
        qo0 qo0Var = this.f10867d;
        if (qo0Var != null) {
            qy1 qy1Var = (qy1) qo0Var.f9548b;
            if (!qy1Var.f9608c && !qy1Var.f9607b) {
                return;
            }
        }
        long jM5230a = this.f10866c.m5230a();
        this.f10867d = this.f10865b.m5929c(runnableC1621ya, jM5230a, TimeUnit.NANOSECONDS, this.f10864a);
        f10863e.log(Level.FINE, "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(jM5230a));
    }
}

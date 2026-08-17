package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class vq0 {

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f11743a;

    /* JADX INFO: renamed from: b */
    public final sv1 f11744b;

    /* JADX INFO: renamed from: c */
    public final pn0 f11745c;

    /* JADX INFO: renamed from: d */
    public int f11746d;

    /* JADX INFO: renamed from: e */
    public ScheduledFuture f11747e;

    /* JADX INFO: renamed from: f */
    public ScheduledFuture f11748f;

    /* JADX INFO: renamed from: g */
    public final tv0 f11749g;

    /* JADX INFO: renamed from: h */
    public final tv0 f11750h;

    /* JADX INFO: renamed from: i */
    public final long f11751i;

    /* JADX INFO: renamed from: j */
    public final long f11752j;

    public vq0(pn0 pn0Var, ScheduledExecutorService scheduledExecutorService, long j, long j2) {
        sv1 sv1Var = new sv1();
        this.f11746d = 1;
        this.f11749g = new tv0(new tq0(this, 0));
        this.f11750h = new tv0(new tq0(this, 1));
        this.f11745c = pn0Var;
        p32.m5188s(scheduledExecutorService, "scheduler");
        this.f11743a = scheduledExecutorService;
        this.f11744b = sv1Var;
        this.f11751i = j;
        this.f11752j = j2;
        sv1Var.f10565a = false;
        sv1Var.m6142b();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m6651a() {
        try {
            sv1 sv1Var = this.f11744b;
            sv1Var.f10565a = false;
            sv1Var.m6142b();
            int i = this.f11746d;
            if (i == 2) {
                this.f11746d = 3;
            } else if (i == 4 || i == 5) {
                ScheduledFuture scheduledFuture = this.f11747e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (this.f11746d == 5) {
                    this.f11746d = 1;
                } else {
                    this.f11746d = 2;
                    p32.m5193x(this.f11748f == null, "There should be no outstanding pingFuture");
                    this.f11748f = this.f11743a.schedule(this.f11750h, this.f11751i, TimeUnit.NANOSECONDS);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m6652b() {
        try {
            int i = this.f11746d;
            if (i == 1) {
                this.f11746d = 2;
                if (this.f11748f == null) {
                    ScheduledExecutorService scheduledExecutorService = this.f11743a;
                    tv0 tv0Var = this.f11750h;
                    long j = this.f11751i;
                    sv1 sv1Var = this.f11744b;
                    this.f11748f = scheduledExecutorService.schedule(tv0Var, j - sv1Var.m6141a(), TimeUnit.NANOSECONDS);
                }
            } else if (i == 5) {
                this.f11746d = 4;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

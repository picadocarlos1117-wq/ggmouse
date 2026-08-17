package p000;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class af1 {

    /* JADX INFO: renamed from: a */
    public final ze1 f216a;

    /* JADX INFO: renamed from: b */
    public final l80 f217b;

    /* JADX INFO: renamed from: c */
    public final xy1 f218c;

    /* JADX INFO: renamed from: d */
    public int f219d;

    /* JADX INFO: renamed from: e */
    public Object f220e;

    /* JADX INFO: renamed from: f */
    public final Looper f221f;

    /* JADX INFO: renamed from: g */
    public boolean f222g;

    /* JADX INFO: renamed from: h */
    public boolean f223h;

    /* JADX INFO: renamed from: i */
    public boolean f224i;

    public af1(l80 l80Var, ze1 ze1Var, t02 t02Var, int i, xy1 xy1Var, Looper looper) {
        this.f217b = l80Var;
        this.f216a = ze1Var;
        this.f221f = looper;
        this.f218c = xy1Var;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m145a(long j) {
        boolean z;
        ki0.m3864h(this.f222g);
        ki0.m3864h(this.f221f.getThread() != Thread.currentThread());
        this.f218c.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (true) {
            z = this.f224i;
            if (z || j <= 0) {
                break;
            }
            this.f218c.getClass();
            wait(j);
            this.f218c.getClass();
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m146b(boolean z) {
        this.f223h = z | this.f223h;
        this.f224i = true;
        notifyAll();
    }

    /* JADX INFO: renamed from: c */
    public final void m147c() {
        ki0.m3864h(!this.f222g);
        this.f222g = true;
        l80 l80Var = this.f217b;
        synchronized (l80Var) {
            if (!l80Var.f6218H && l80Var.f6248p.getThread().isAlive()) {
                l80Var.f6246n.m7386a(14, this).m7164b();
                return;
            }
            AbstractC1337qm.m5542i0("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            m146b(false);
        }
    }
}

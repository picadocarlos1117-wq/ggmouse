package p000;

import android.content.Context;
import android.os.Handler;
import com.example.ssmousepro.ads.RewardedVideoActivity;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: wb */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1548wb implements xx0, j91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12045a;

    /* JADX INFO: renamed from: b */
    public boolean f12046b;

    /* JADX INFO: renamed from: c */
    public final Object f12047c;

    /* JADX INFO: renamed from: d */
    public Object f12048d;

    public C1548wb(RewardedVideoActivity rewardedVideoActivity, Handler handler, c80 c80Var) {
        this.f12045a = 0;
        this.f12047c = rewardedVideoActivity.getApplicationContext();
        this.f12048d = new RunnableC1511vb(this, handler, c80Var);
    }

    /* JADX INFO: renamed from: a */
    public void m6740a() {
        RunnableC1511vb runnableC1511vb = (RunnableC1511vb) this.f12048d;
        Context context = (Context) this.f12047c;
        if (this.f12046b) {
            context.unregisterReceiver(runnableC1511vb);
            this.f12046b = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m6741b(ScheduledFuture scheduledFuture) {
        synchronized (this.f12047c) {
            try {
                if (!this.f12046b) {
                    this.f12048d = scheduledFuture;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m6742c(boolean z) {
        gp0 gp0Var = (gp0) this.f12048d;
        gp0Var.f4271k.execute(new l00(gp0Var, (cp0) this.f12047c, z));
    }

    /* JADX INFO: renamed from: d */
    public void m6743d(nv1 nv1Var) {
        gp0 gp0Var = (gp0) this.f12048d;
        gp0Var.f4269i.mo2842H(2, "{0} SHUTDOWN with {1}", ((cp0) this.f12047c).mo2579g(), gp0.m3033i(nv1Var));
        this.f12046b = true;
        gp0Var.f4271k.execute(new RunnableC1466u3(22, this, nv1Var));
    }

    /* JADX INFO: renamed from: e */
    public void m6744e() {
        p32.m5193x(this.f12046b, "transportShutdown() must be called before transportTerminated().");
        gp0 gp0Var = (gp0) this.f12048d;
        AbstractC1337qm abstractC1337qm = gp0Var.f4269i;
        cp0 cp0Var = (cp0) this.f12047c;
        abstractC1337qm.mo2842H(2, "{0} Terminated", cp0Var.mo2579g());
        ry1 ry1Var = gp0Var.f4271k;
        ry1Var.execute(new l00(gp0Var, cp0Var, false));
        Iterator it = gp0Var.f4270j.iterator();
        if (!it.hasNext()) {
            ry1Var.execute(new ep0(this, 1));
        } else if (it.next() != null) {
            l41.m4035b();
        } else {
            cp0Var.getAttributes();
            throw null;
        }
    }

    @Override // p000.j91
    /* JADX INFO: renamed from: m */
    public void mo777m(Object obj) {
        this.f12046b = true;
        ((zu0) this.f12048d).onLoadFinished((yu0) this.f12047c, obj);
    }

    public String toString() {
        switch (this.f12045a) {
            case 2:
                return ((zu0) this.f12048d).toString();
            default:
                return super.toString();
        }
    }

    public C1548wb(yu0 yu0Var, zu0 zu0Var) {
        this.f12045a = 2;
        this.f12046b = false;
        this.f12047c = yu0Var;
        this.f12048d = zu0Var;
    }

    public C1548wb(gp0 gp0Var, cp0 cp0Var) {
        this.f12045a = 1;
        this.f12048d = gp0Var;
        this.f12046b = false;
        this.f12047c = cp0Var;
    }

    public C1548wb(Object obj) {
        this.f12045a = 3;
        this.f12047c = obj;
    }
}

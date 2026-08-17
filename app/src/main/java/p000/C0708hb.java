package p000;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: hb */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class C0708hb extends v02 {

    /* JADX INFO: renamed from: h */
    public static final ReentrantLock f4496h;

    /* JADX INFO: renamed from: i */
    public static final Condition f4497i;

    /* JADX INFO: renamed from: j */
    public static final long f4498j;

    /* JADX INFO: renamed from: k */
    public static final long f4499k;

    /* JADX INFO: renamed from: l */
    public static C0708hb f4500l;

    /* JADX INFO: renamed from: e */
    public boolean f4501e;

    /* JADX INFO: renamed from: f */
    public C0708hb f4502f;

    /* JADX INFO: renamed from: g */
    public long f4503g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f4496h = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        conditionNewCondition.getClass();
        f4497i = conditionNewCondition;
        f4498j = 60000L;
        f4499k = 60000000000L;
    }

    /* JADX INFO: renamed from: h */
    public final void m3122h() {
        C0708hb c0708hb;
        long j = this.f11476c;
        boolean z = this.f11474a;
        if (j != 0 || z) {
            ReentrantLock reentrantLock = f4496h;
            reentrantLock.lock();
            try {
                if (this.f4501e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f4501e = true;
                if (f4500l == null) {
                    f4500l = new C0708hb();
                    C0597eb c0597eb = new C0597eb("Okio Watchdog");
                    c0597eb.setDaemon(true);
                    c0597eb.start();
                }
                long jNanoTime = System.nanoTime();
                if (j != 0 && z) {
                    this.f4503g = Math.min(j, mo4533c() - jNanoTime) + jNanoTime;
                } else if (j != 0) {
                    this.f4503g = j + jNanoTime;
                } else {
                    if (!z) {
                        throw new AssertionError();
                    }
                    this.f4503g = mo4533c();
                }
                long j2 = this.f4503g - jNanoTime;
                C0708hb c0708hb2 = f4500l;
                c0708hb2.getClass();
                while (true) {
                    c0708hb = c0708hb2.f4502f;
                    if (c0708hb == null || j2 < c0708hb.f4503g - jNanoTime) {
                        break;
                        break;
                    }
                    c0708hb2 = c0708hb;
                }
                this.f4502f = c0708hb;
                c0708hb2.f4502f = this;
                if (c0708hb2 == f4500l) {
                    f4497i.signal();
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m3123i() {
        ReentrantLock reentrantLock = f4496h;
        reentrantLock.lock();
        try {
            if (!this.f4501e) {
                return false;
            }
            this.f4501e = false;
            C0708hb c0708hb = f4500l;
            while (c0708hb != null) {
                C0708hb c0708hb2 = c0708hb.f4502f;
                if (c0708hb2 == this) {
                    c0708hb.f4502f = this.f4502f;
                    this.f4502f = null;
                    return false;
                }
                c0708hb = c0708hb2;
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: j */
    public void mo3124j() {
    }
}

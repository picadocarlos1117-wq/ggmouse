package p000;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public class v02 {

    /* JADX INFO: renamed from: d */
    public static final u02 f11473d = new u02();

    /* JADX INFO: renamed from: a */
    public boolean f11474a;

    /* JADX INFO: renamed from: b */
    public long f11475b;

    /* JADX INFO: renamed from: c */
    public long f11476c;

    /* JADX INFO: renamed from: a */
    public v02 mo4531a() {
        this.f11474a = false;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public v02 mo4532b() {
        this.f11476c = 0L;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public long mo4533c() {
        if (this.f11474a) {
            return this.f11475b;
        }
        f40.m2719o("No deadline");
        return 0L;
    }

    /* JADX INFO: renamed from: d */
    public v02 mo4534d(long j) {
        this.f11474a = true;
        this.f11475b = j;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo4535e() {
        return this.f11474a;
    }

    /* JADX INFO: renamed from: f */
    public void mo4536f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f11474a && this.f11475b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* JADX INFO: renamed from: g */
    public v02 mo4537g(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j >= 0) {
            this.f11476c = timeUnit.toNanos(j);
            return this;
        }
        f40.m2716l(jd0.m3612j("timeout < 0: ", j));
        return null;
    }
}

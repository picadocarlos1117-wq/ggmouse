package p000;

import android.os.SystemClock;

/* JADX INFO: renamed from: py */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1312py {

    /* JADX INFO: renamed from: a */
    public Exception f9226a;

    /* JADX INFO: renamed from: b */
    public long f9227b = -9223372036854775807L;

    /* JADX INFO: renamed from: c */
    public long f9228c = -9223372036854775807L;

    /* JADX INFO: renamed from: a */
    public final void m5379a(Exception exc) throws Exception {
        boolean z;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f9226a == null) {
            this.f9226a = exc;
        }
        if (this.f9227b == -9223372036854775807L) {
            synchronized (C1423sy.f10582j0) {
                z = C1423sy.f10584l0 > 0;
            }
            if (!z) {
                this.f9227b = 200 + jElapsedRealtime;
            }
        }
        long j = this.f9227b;
        if (j == -9223372036854775807L || jElapsedRealtime < j) {
            this.f9228c = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = this.f9226a;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = this.f9226a;
        this.f9226a = null;
        this.f9227b = -9223372036854775807L;
        this.f9228c = -9223372036854775807L;
        throw exc3;
    }
}

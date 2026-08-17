package p000;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: fb */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0634fb implements ft1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3739a;

    /* JADX INFO: renamed from: b */
    public final Object f3740b;

    /* JADX INFO: renamed from: c */
    public final Object f3741c;

    public /* synthetic */ C0634fb(int i, Object obj, Object obj2) {
        this.f3739a = i;
        this.f3740b = obj;
        this.f3741c = obj2;
    }

    @Override // p000.ft1
    /* JADX INFO: renamed from: a */
    public final v02 mo954a() {
        switch (this.f3739a) {
            case 0:
                return (zt1) this.f3740b;
            default:
                return (v02) this.f3741c;
        }
    }

    @Override // p000.ft1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.f3739a;
        Object obj = this.f3740b;
        switch (i) {
            case 0:
                zt1 zt1Var = (zt1) obj;
                C0634fb c0634fb = (C0634fb) this.f3741c;
                zt1Var.m3122h();
                try {
                    try {
                        c0634fb.close();
                        if (zt1Var.m3123i()) {
                            throw zt1Var.m7354k(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!zt1Var.m3123i()) {
                            throw e;
                        }
                        throw zt1Var.m7354k(e);
                    }
                } catch (Throwable th) {
                    zt1Var.m3123i();
                    throw th;
                }
            default:
                ((OutputStream) obj).close();
                return;
        }
    }

    @Override // p000.ft1, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f3739a;
        Object obj = this.f3740b;
        switch (i) {
            case 0:
                zt1 zt1Var = (zt1) obj;
                C0634fb c0634fb = (C0634fb) this.f3741c;
                zt1Var.m3122h();
                try {
                    try {
                        c0634fb.flush();
                        if (zt1Var.m3123i()) {
                            throw zt1Var.m7354k(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!zt1Var.m3123i()) {
                            throw e;
                        }
                        throw zt1Var.m7354k(e);
                    }
                } catch (Throwable th) {
                    zt1Var.m3123i();
                    throw th;
                }
            default:
                ((OutputStream) obj).flush();
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009a A[LOOP:1: B:12:0x0064->B:25:0x009a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x009c A[SYNTHETIC] */
    @Override // p000.ft1
    /* JADX INFO: renamed from: q */
    public final void mo956q(long j, C1073lj c1073lj) {
        long j2;
        zt1 zt1Var;
        int i = this.f3739a;
        Object obj = this.f3740b;
        Object obj2 = this.f3741c;
        switch (i) {
            case 0:
                ua0.m6451h(c1073lj.f6361b, 0L, j);
                for (long j3 = j; j3 > 0; j3 -= j2) {
                    rq1 rq1Var = c1073lj.f6360a;
                    rq1Var.getClass();
                    j2 = 0;
                    try {
                        try {
                            while (j2 < 65536) {
                                j2 += (long) (rq1Var.f10098c - rq1Var.f10097b);
                                if (j2 >= j3) {
                                    j2 = j3;
                                    zt1Var = (zt1) obj;
                                    C0634fb c0634fb = (C0634fb) obj2;
                                    zt1Var.m3122h();
                                    c0634fb.mo956q(j2, c1073lj);
                                    if (!zt1Var.m3123i()) {
                                        throw zt1Var.m7354k(null);
                                    }
                                } else {
                                    rq1Var = rq1Var.f10101f;
                                    rq1Var.getClass();
                                }
                            }
                            c0634fb.mo956q(j2, c1073lj);
                            if (!zt1Var.m3123i()) {
                                throw zt1Var.m7354k(null);
                            }
                        } catch (IOException e) {
                            if (!zt1Var.m3123i()) {
                                throw e;
                            }
                            throw zt1Var.m7354k(e);
                        }
                    } catch (Throwable th) {
                        zt1Var.m3123i();
                        throw th;
                    }
                    zt1Var = (zt1) obj;
                    C0634fb c0634fb2 = (C0634fb) obj2;
                    zt1Var.m3122h();
                }
                return;
            default:
                ua0.m6451h(c1073lj.f6361b, 0L, j);
                long j4 = j;
                while (j4 > 0) {
                    ((v02) obj2).mo4536f();
                    rq1 rq1Var2 = c1073lj.f6360a;
                    rq1Var2.getClass();
                    int iMin = (int) Math.min(j4, rq1Var2.f10098c - rq1Var2.f10097b);
                    ((OutputStream) obj).write(rq1Var2.f10096a, rq1Var2.f10097b, iMin);
                    int i2 = rq1Var2.f10097b + iMin;
                    rq1Var2.f10097b = i2;
                    long j5 = iMin;
                    j4 -= j5;
                    c1073lj.f6361b -= j5;
                    if (i2 == rq1Var2.f10098c) {
                        c1073lj.f6360a = rq1Var2.m5888a();
                        sq1.m6132a(rq1Var2);
                    }
                }
                return;
        }
    }

    public final String toString() {
        switch (this.f3739a) {
            case 0:
                return "AsyncTimeout.sink(" + ((C0634fb) this.f3741c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f3740b) + ')';
        }
    }
}

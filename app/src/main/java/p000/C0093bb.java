package p000;

import java.io.IOException;
import java.net.Socket;

/* JADX INFO: renamed from: bb */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0093bb implements ft1 {

    /* JADX INFO: renamed from: c */
    public final er1 f1269c;

    /* JADX INFO: renamed from: d */
    public final y91 f1270d;

    /* JADX INFO: renamed from: e */
    public final int f1271e;

    /* JADX INFO: renamed from: n */
    public C0634fb f1275n;

    /* JADX INFO: renamed from: o */
    public Socket f1276o;

    /* JADX INFO: renamed from: p */
    public boolean f1277p;

    /* JADX INFO: renamed from: q */
    public int f1278q;

    /* JADX INFO: renamed from: r */
    public int f1279r;

    /* JADX INFO: renamed from: a */
    public final Object f1267a = new Object();

    /* JADX INFO: renamed from: b */
    public final C1073lj f1268b = new C1073lj();

    /* JADX INFO: renamed from: f */
    public boolean f1272f = false;

    /* JADX INFO: renamed from: g */
    public boolean f1273g = false;

    /* JADX INFO: renamed from: m */
    public boolean f1274m = false;

    public C0093bb(er1 er1Var, y91 y91Var) {
        p32.m5188s(er1Var, "executor");
        this.f1269c = er1Var;
        this.f1270d = y91Var;
        this.f1271e = 10000;
    }

    @Override // p000.ft1
    /* JADX INFO: renamed from: a */
    public final v02 mo954a() {
        return v02.f11473d;
    }

    /* JADX INFO: renamed from: c */
    public final void m955c(C0634fb c0634fb, Socket socket) {
        p32.m5193x(this.f1275n == null, "AsyncSink's becomeConnected should only be called once.");
        this.f1275n = c0634fb;
        this.f1276o = socket;
    }

    @Override // p000.ft1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1274m) {
            return;
        }
        this.f1274m = true;
        this.f1269c.execute(new RunnableC1621ya(this, 0));
    }

    @Override // p000.ft1, java.io.Flushable
    public final void flush() throws IOException {
        if (this.f1274m) {
            ca0.m1178j("closed");
            return;
        }
        jc1.m3599c();
        try {
            synchronized (this.f1267a) {
                if (this.f1273g) {
                    jc1.f5363a.getClass();
                    return;
                }
                this.f1273g = true;
                this.f1269c.execute(new C1584xa(this, 1));
                jc1.f5363a.getClass();
            }
        } catch (Throwable th) {
            try {
                jc1.f5363a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p000.ft1
    /* JADX INFO: renamed from: q */
    public final void mo956q(long j, C1073lj c1073lj) throws IOException {
        if (this.f1274m) {
            ca0.m1178j("closed");
            return;
        }
        jc1.m3599c();
        try {
            synchronized (this.f1267a) {
                try {
                    this.f1268b.mo956q(j, c1073lj);
                    int i = this.f1279r + this.f1278q;
                    this.f1279r = i;
                    this.f1278q = 0;
                    boolean z = true;
                    if (this.f1277p || i <= this.f1271e) {
                        if (!this.f1272f && !this.f1273g && this.f1268b.m4201d() > 0) {
                            this.f1272f = true;
                            z = false;
                        }
                        jc1.f5363a.getClass();
                        return;
                    }
                    this.f1277p = true;
                    if (!z) {
                        this.f1269c.execute(new C1584xa(this, 0));
                        jc1.f5363a.getClass();
                    } else {
                        try {
                            this.f1276o.close();
                        } catch (IOException e) {
                            this.f1270d.m7063o(e);
                        }
                        jc1.f5363a.getClass();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                jc1.f5363a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}

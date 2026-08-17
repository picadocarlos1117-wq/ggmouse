package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class f70 implements Closeable {

    /* JADX INFO: renamed from: d */
    public static final Logger f3646d = Logger.getLogger(y91.class.getName());

    /* JADX INFO: renamed from: a */
    public final y91 f3647a;

    /* JADX INFO: renamed from: b */
    public final C1658za f3648b;

    /* JADX INFO: renamed from: c */
    public final qo0 f3649c;

    public f70(y91 y91Var, C1658za c1658za) {
        Level level = Level.FINE;
        this.f3649c = new qo0(10);
        this.f3647a = y91Var;
        this.f3648b = c1658za;
    }

    /* JADX INFO: renamed from: c */
    public final void m2731c(boolean z, int i, C1073lj c1073lj, int i2) {
        qo0 qo0Var = this.f3649c;
        c1073lj.getClass();
        qo0Var.m5590M(2, i, c1073lj, i2, z);
        try {
            vk0 vk0Var = this.f3648b.f13321a;
            synchronized (vk0Var) {
                if (vk0Var.f11697e) {
                    throw new IOException("closed");
                }
                vk0Var.m6639c(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
                if (i2 > 0) {
                    vk0Var.f11693a.mo956q(i2, c1073lj);
                }
            }
        } catch (IOException e) {
            this.f3647a.m7063o(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f3648b.close();
        } catch (IOException e) {
            f3646d.log(e.getClass().equals(IOException.class) ? Level.FINE : Level.INFO, "Failed closing connection", (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2732d(b70 b70Var, byte[] bArr) {
        C1658za c1658za = this.f3648b;
        this.f3649c.m5591N(2, 0, b70Var, C0717hk.m3161h(bArr));
        try {
            c1658za.m7270e(b70Var, bArr);
            c1658za.flush();
        } catch (IOException e) {
            this.f3647a.m7063o(e);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2733e(int i, int i2, boolean z) {
        qo0 qo0Var = this.f3649c;
        if (z) {
            long j = (4294967295L & ((long) i2)) | (((long) i) << 32);
            if (qo0Var.m5588K()) {
                ((Logger) qo0Var.f9548b).log((Level) qo0Var.f9549c, "OUTBOUND PING: ack=true bytes=" + j);
            }
        } else {
            qo0Var.m5592O(2, (4294967295L & ((long) i2)) | (((long) i) << 32));
        }
        try {
            this.f3648b.m7271g(i, i2, z);
        } catch (IOException e) {
            this.f3647a.m7063o(e);
        }
    }

    public final void flush() {
        try {
            this.f3648b.flush();
        } catch (IOException e) {
            this.f3647a.m7063o(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2734g(int i, b70 b70Var) {
        this.f3649c.m5593P(2, i, b70Var);
        try {
            this.f3648b.m7272j(i, b70Var);
        } catch (IOException e) {
            this.f3647a.m7063o(e);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m2735j(int i, long j) {
        this.f3649c.m5595R(2, i, j);
        try {
            this.f3648b.m7274o(i, j);
        } catch (IOException e) {
            this.f3647a.m7063o(e);
        }
    }
}

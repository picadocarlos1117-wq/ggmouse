package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: za */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1658za implements Closeable {

    /* JADX INFO: renamed from: a */
    public final vk0 f13321a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0093bb f13322b;

    public C1658za(C0093bb c0093bb, vk0 vk0Var) {
        this.f13322b = c0093bb;
        this.f13321a = vk0Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m7268c(C1296pi c1296pi) {
        this.f13322b.f1278q++;
        vk0 vk0Var = this.f13321a;
        synchronized (vk0Var) {
            if (vk0Var.f11697e) {
                throw new IOException("closed");
            }
            int i = vk0Var.f11696d;
            if ((c1296pi.f8901a & 32) != 0) {
                i = ((int[]) c1296pi.f8902b)[5];
            }
            vk0Var.f11696d = i;
            vk0Var.m6639c(0, 0, (byte) 4, (byte) 1);
            vk0Var.f11693a.flush();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f13321a.close();
    }

    /* JADX INFO: renamed from: d */
    public final void m7269d() {
        vk0 vk0Var = this.f13321a;
        synchronized (vk0Var) {
            try {
                if (vk0Var.f11697e) {
                    throw new IOException("closed");
                }
                Logger logger = wk0.f12207a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(">> CONNECTION " + wk0.f12208b.mo3165e());
                }
                vk0Var.f11693a.write(wk0.f12208b.mo3171l());
                vk0Var.f11693a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7270e(b70 b70Var, byte[] bArr) {
        vk0 vk0Var = this.f13321a;
        synchronized (vk0Var) {
            try {
                if (vk0Var.f11697e) {
                    throw new IOException("closed");
                }
                if (b70Var.f1246a == -1) {
                    Locale locale = Locale.US;
                    throw new IllegalArgumentException("errorCode.httpCode == -1");
                }
                vk0Var.m6639c(0, bArr.length + 8, (byte) 7, (byte) 0);
                vk0Var.f11693a.writeInt(0);
                vk0Var.f11693a.writeInt(b70Var.f1246a);
                if (bArr.length > 0) {
                    vk0Var.f11693a.write(bArr);
                }
                vk0Var.f11693a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void flush() {
        vk0 vk0Var = this.f13321a;
        synchronized (vk0Var) {
            if (vk0Var.f11697e) {
                throw new IOException("closed");
            }
            vk0Var.f11693a.flush();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m7271g(int i, int i2, boolean z) {
        if (z) {
            this.f13322b.f1278q++;
        }
        vk0 vk0Var = this.f13321a;
        synchronized (vk0Var) {
            if (vk0Var.f11697e) {
                throw new IOException("closed");
            }
            vk0Var.m6639c(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            vk0Var.f11693a.writeInt(i);
            vk0Var.f11693a.writeInt(i2);
            vk0Var.f11693a.flush();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m7272j(int i, b70 b70Var) {
        this.f13322b.f1278q++;
        vk0 vk0Var = this.f13321a;
        synchronized (vk0Var) {
            if (vk0Var.f11697e) {
                throw new IOException("closed");
            }
            if (b70Var.f1246a == -1) {
                throw new IllegalArgumentException();
            }
            vk0Var.m6639c(i, 4, (byte) 3, (byte) 0);
            vk0Var.f11693a.writeInt(b70Var.f1246a);
            vk0Var.f11693a.flush();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m7273l(C1296pi c1296pi) {
        int i;
        vk0 vk0Var = this.f13321a;
        synchronized (vk0Var) {
            try {
                if (vk0Var.f11697e) {
                    throw new IOException("closed");
                }
                int i2 = 0;
                vk0Var.m6639c(0, Integer.bitCount(c1296pi.f8901a) * 6, (byte) 4, (byte) 0);
                while (i2 < 10) {
                    if (c1296pi.m5261g(i2)) {
                        if (i2 == 4) {
                            i = 3;
                        } else {
                            i = i2 == 7 ? 4 : i2;
                        }
                        vk0Var.f11693a.writeShort(i);
                        vk0Var.f11693a.writeInt(((int[]) c1296pi.f8902b)[i2]);
                    }
                    i2++;
                }
                vk0Var.f11693a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m7274o(int i, long j) {
        vk0 vk0Var = this.f13321a;
        synchronized (vk0Var) {
            if (vk0Var.f11697e) {
                throw new IOException("closed");
            }
            if (j == 0 || j > 2147483647L) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j);
            }
            vk0Var.m6639c(i, 4, (byte) 8, (byte) 0);
            vk0Var.f11693a.writeInt((int) j);
            vk0Var.f11693a.flush();
        }
    }
}

package p000;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class uu0 extends Handler implements Runnable {

    /* JADX INFO: renamed from: a */
    public final int f11422a;

    /* JADX INFO: renamed from: b */
    public final tg1 f11423b;

    /* JADX INFO: renamed from: c */
    public wg1 f11424c;

    /* JADX INFO: renamed from: d */
    public IOException f11425d;

    /* JADX INFO: renamed from: e */
    public int f11426e;

    /* JADX INFO: renamed from: f */
    public Thread f11427f;

    /* JADX INFO: renamed from: g */
    public boolean f11428g;

    /* JADX INFO: renamed from: m */
    public volatile boolean f11429m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C1174o9 f11430n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu0(C1174o9 c1174o9, Looper looper, tg1 tg1Var, wg1 wg1Var, int i, long j) {
        super(looper);
        this.f11430n = c1174o9;
        this.f11423b = tg1Var;
        this.f11424c = wg1Var;
        this.f11422a = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m6541a(boolean z) {
        this.f11429m = z;
        this.f11425d = null;
        if (hasMessages(1)) {
            this.f11428g = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f11428g = true;
                    this.f11423b.f10874g = true;
                    Thread thread = this.f11427f;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.f11430n.f7700c = null;
            SystemClock.elapsedRealtime();
            wg1 wg1Var = this.f11424c;
            wg1Var.getClass();
            wg1Var.m6788x(this.f11423b, true);
            this.f11424c = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        long jMin;
        tu0 tu0Var;
        kq1 kq1Var;
        if (this.f11429m) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            SystemClock.elapsedRealtime();
            this.f11424c.getClass();
            this.f11425d = null;
            C1174o9 c1174o9 = this.f11430n;
            fx0 fx0Var = (fx0) c1174o9.f7699b;
            uu0 uu0Var = (uu0) c1174o9.f7700c;
            uu0Var.getClass();
            fx0Var.execute(uu0Var);
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        this.f11430n.f7700c = null;
        SystemClock.elapsedRealtime();
        wg1 wg1Var = this.f11424c;
        wg1Var.getClass();
        if (this.f11428g) {
            wg1Var.m6788x(this.f11423b, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 2) {
            try {
                wg1Var.m6789y(this.f11423b);
                return;
            } catch (RuntimeException e) {
                AbstractC1337qm.m5551n("LoadTask", "Unexpected exception handling load completed", e);
                this.f11430n.f7701d = new xu0(e);
                return;
            }
        }
        if (i2 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f11425d = iOException;
        int i3 = this.f11426e + 1;
        this.f11426e = i3;
        tg1 tg1Var = this.f11423b;
        Uri uri = tg1Var.f10869b.f5575c;
        su0 su0Var = new su0();
        int i4 = z42.f13274a;
        wg1Var.f12157d.getClass();
        if ((iOException instanceof fc1) || (iOException instanceof FileNotFoundException) || (iOException instanceof al0) || (iOException instanceof xu0)) {
            jMin = -9223372036854775807L;
            break;
        }
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i3 - 1) * 1000, 5000);
                break;
            } else {
                if ((cause instanceof C1050kx) && ((C1050kx) cause).f6049a == 2008) {
                    jMin = -9223372036854775807L;
                    break;
                }
                cause = cause.getCause();
            }
        }
        if (jMin == -9223372036854775807L) {
            tu0Var = C1174o9.f7696m;
        } else {
            int iM6782i = wg1Var.m6782i();
            int i5 = iM6782i > wg1Var.f12151R ? 1 : 0;
            if (wg1Var.f12147N || !((kq1Var = wg1Var.f12139F) == null || kq1Var.mo8j() == -9223372036854775807L)) {
                wg1Var.f12151R = iM6782i;
            } else if (!wg1Var.f12135B || wg1Var.m6780C()) {
                wg1Var.f12144K = wg1Var.f12135B;
                wg1Var.f12148O = 0L;
                wg1Var.f12151R = 0;
                for (xo1 xo1Var : wg1Var.f12173y) {
                    xo1Var.m6944l(false);
                }
                tg1Var.f10873f.f1280a = 0L;
                tg1Var.f10876i = 0L;
                tg1Var.f10875h = true;
                tg1Var.f10879l = false;
            } else {
                wg1Var.f12150Q = true;
                tu0Var = C1174o9.f7695g;
            }
            tu0Var = new tu0(i5, jMin);
        }
        int i6 = tu0Var.f11017a;
        boolean z = i6 == 0 || i6 == 1;
        c40 c40Var = wg1Var.f12158e;
        c40Var.m1126a(new t21(c40Var, su0Var, new b21(-1, null, z42.m7226N(tg1Var.f10876i), z42.m7226N(wg1Var.f12140G)), iOException, !z));
        int i7 = tu0Var.f11017a;
        if (i7 == 3) {
            this.f11430n.f7701d = this.f11425d;
            return;
        }
        if (i7 != 2) {
            if (i7 == 1) {
                this.f11426e = 1;
            }
            long jMin2 = tu0Var.f11018b;
            if (jMin2 == -9223372036854775807L) {
                jMin2 = Math.min((this.f11426e - 1) * 1000, 5000);
            }
            C1174o9 c1174o10 = this.f11430n;
            ki0.m3864h(((uu0) c1174o10.f7700c) == null);
            c1174o10.f7700c = this;
            if (jMin2 > 0) {
                sendEmptyMessageDelayed(1, jMin2);
                return;
            }
            SystemClock.elapsedRealtime();
            this.f11424c.getClass();
            this.f11425d = null;
            fx0 fx0Var2 = (fx0) c1174o10.f7699b;
            uu0 uu0Var2 = (uu0) c1174o10.f7700c;
            uu0Var2.getClass();
            fx0Var2.execute(uu0Var2);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.f11428g;
                this.f11427f = Thread.currentThread();
            }
            if (!z) {
                Trace.beginSection("load:".concat(this.f11423b.getClass().getSimpleName()));
                try {
                    this.f11423b.m6272b();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f11427f = null;
                Thread.interrupted();
            }
            if (this.f11429m) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.f11429m) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e2) {
            if (this.f11429m) {
                return;
            }
            AbstractC1337qm.m5551n("LoadTask", "Unexpected exception loading stream", e2);
            obtainMessage(3, new xu0(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.f11429m) {
                return;
            }
            AbstractC1337qm.m5551n("LoadTask", "OutOfMemory error loading stream", e3);
            obtainMessage(3, new xu0(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.f11429m) {
                AbstractC1337qm.m5551n("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        }
    }
}

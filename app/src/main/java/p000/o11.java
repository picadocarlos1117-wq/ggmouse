package p000;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class o11 implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public final Handler f7609a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ p11 f7610b;

    public o11(p11 p11Var, z01 z01Var) {
        this.f7610b = p11Var;
        Handler handlerM7236j = z42.m7236j(this);
        this.f7609a = handlerM7236j;
        z01Var.mo4175l(this, handlerM7236j);
    }

    /* JADX INFO: renamed from: a */
    public final void m4631a(long j) {
        Surface surface;
        p11 p11Var = this.f7610b;
        if (this != p11Var.f8658m1 || p11Var.f3970P == null) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            p11Var.f3950A0 = true;
            return;
        }
        try {
            C1290pc c1290pc = p11Var.f8629J0;
            p11Var.m2918w0(j);
            m62 m62Var = p11Var.f8653h1;
            if (!m62Var.equals(m62.f6671d) && !m62Var.equals(p11Var.f8654i1)) {
                p11Var.f8654i1 = m62Var;
                c1290pc.m5250b(m62Var);
            }
            p11Var.f3954C0.f10574e++;
            c62 c62Var = p11Var.f8632M0;
            boolean z = c62Var.f1690d != 3;
            c62Var.f1690d = 3;
            c62Var.f1697k.getClass();
            c62Var.f1692f = z42.m7216D(SystemClock.elapsedRealtime());
            if (z && (surface = p11Var.f8640U0) != null) {
                Handler handler = c1290pc.f8839a;
                if (handler != null) {
                    handler.post(new j62(c1290pc, surface, SystemClock.elapsedRealtime()));
                }
                p11Var.f8643X0 = true;
            }
            p11Var.mo2903d0(j);
        } catch (t70 e) {
            p11Var.f3952B0 = e;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        int i3 = z42.f13274a;
        m4631a(((((long) i) & 4294967295L) << 32) | (4294967295L & ((long) i2)));
        return true;
    }
}

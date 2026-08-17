package p000;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: hi */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0715hi implements rx1, InterfaceC1385rx {

    /* JADX INFO: renamed from: a */
    public final at1 f4565a;

    /* JADX INFO: renamed from: b */
    public final Object f4566b;

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f4567c;

    /* JADX INFO: renamed from: d */
    public final ArrayDeque f4568d;

    /* JADX INFO: renamed from: e */
    public final C1533vx[] f4569e;

    /* JADX INFO: renamed from: f */
    public final AbstractC1570wx[] f4570f;

    /* JADX INFO: renamed from: g */
    public int f4571g;

    /* JADX INFO: renamed from: h */
    public int f4572h;

    /* JADX INFO: renamed from: i */
    public C1533vx f4573i;

    /* JADX INFO: renamed from: j */
    public AbstractC1459tx f4574j;

    /* JADX INFO: renamed from: k */
    public boolean f4575k;

    /* JADX INFO: renamed from: l */
    public boolean f4576l;

    /* JADX INFO: renamed from: m */
    public long f4577m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f4578n;

    /* JADX INFO: renamed from: o */
    public final Object f4579o;

    public C0715hi(C1533vx[] c1533vxArr, AbstractC1570wx[] abstractC1570wxArr) {
        AbstractC1570wx c0678gi;
        C1533vx c1533vx;
        this.f4566b = new Object();
        this.f4577m = -9223372036854775807L;
        this.f4567c = new ArrayDeque();
        this.f4568d = new ArrayDeque();
        this.f4569e = c1533vxArr;
        this.f4571g = c1533vxArr.length;
        for (int i = 0; i < this.f4571g; i++) {
            C1533vx[] c1533vxArr2 = this.f4569e;
            switch (this.f4578n) {
                case 0:
                    c1533vx = new C1533vx(1);
                    break;
                default:
                    c1533vx = new ux1(1);
                    break;
            }
            c1533vxArr2[i] = c1533vx;
        }
        this.f4570f = abstractC1570wxArr;
        this.f4572h = abstractC1570wxArr.length;
        for (int i2 = 0; i2 < this.f4572h; i2++) {
            AbstractC1570wx[] abstractC1570wxArr2 = this.f4570f;
            switch (this.f4578n) {
                case 0:
                    c0678gi = new C0678gi(this);
                    break;
                default:
                    c0678gi = new C0645fm(this);
                    break;
            }
            abstractC1570wxArr2[i2] = c0678gi;
        }
        at1 at1Var = new at1(this);
        this.f4565a = at1Var;
        at1Var.start();
    }

    @Override // p000.InterfaceC1385rx
    /* JADX INFO: renamed from: a */
    public final void mo3010a(long j) {
        synchronized (this.f4566b) {
            try {
                ki0.m3864h(this.f4571g == this.f4569e.length || this.f4575k);
                this.f4577m = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC1385rx
    /* JADX INFO: renamed from: d */
    public final Object mo3013d() {
        C1533vx c1533vx;
        synchronized (this.f4566b) {
            try {
                AbstractC1459tx abstractC1459tx = this.f4574j;
                if (abstractC1459tx != null) {
                    throw abstractC1459tx;
                }
                ki0.m3864h(this.f4573i == null);
                int i = this.f4571g;
                if (i == 0) {
                    c1533vx = null;
                } else {
                    C1533vx[] c1533vxArr = this.f4569e;
                    int i2 = i - 1;
                    this.f4571g = i2;
                    c1533vx = c1533vxArr[i2];
                }
                this.f4573i = c1533vx;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1533vx;
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC1459tx m3145f(Throwable th) {
        switch (this.f4578n) {
            case 0:
                return new fm0("Unexpected decode error", th);
            default:
                return new sx1("Unexpected decode error", th);
        }
    }

    @Override // p000.InterfaceC1385rx
    public final void flush() {
        synchronized (this.f4566b) {
            try {
                this.f4575k = true;
                C1533vx c1533vx = this.f4573i;
                if (c1533vx != null) {
                    c1533vx.mo5844r();
                    C1533vx[] c1533vxArr = this.f4569e;
                    int i = this.f4571g;
                    this.f4571g = i + 1;
                    c1533vxArr[i] = c1533vx;
                    this.f4573i = null;
                }
                while (!this.f4567c.isEmpty()) {
                    C1533vx c1533vx2 = (C1533vx) this.f4567c.removeFirst();
                    c1533vx2.mo5844r();
                    C1533vx[] c1533vxArr2 = this.f4569e;
                    int i2 = this.f4571g;
                    this.f4571g = i2 + 1;
                    c1533vxArr2[i2] = c1533vx2;
                }
                while (!this.f4568d.isEmpty()) {
                    ((AbstractC1570wx) this.f4568d.removeFirst()).mo2827s();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC1459tx m3146g(C1533vx c1533vx, AbstractC1570wx abstractC1570wx, boolean z) {
        int i = this.f4578n;
        Object obj = this.f4579o;
        switch (i) {
            case 0:
                C0678gi c0678gi = (C0678gi) abstractC1570wx;
                try {
                    ByteBuffer byteBuffer = c1533vx.f11795n;
                    byteBuffer.getClass();
                    ki0.m3864h(byteBuffer.hasArray());
                    ki0.m3857c(byteBuffer.arrayOffset() == 0);
                    byte[] bArrArray = byteBuffer.array();
                    int iRemaining = byteBuffer.remaining();
                    ((f40) obj).getClass();
                    c0678gi.f4192n = f40.m2707b(iRemaining, bArrArray);
                    c0678gi.f12349g = c1533vx.f11797p;
                    return null;
                } catch (fm0 e) {
                    return e;
                }
            default:
                ux1 ux1Var = (ux1) c1533vx;
                C0645fm c0645fm = (C0645fm) abstractC1570wx;
                try {
                    ByteBuffer byteBuffer2 = ux1Var.f11795n;
                    byteBuffer2.getClass();
                    byte[] bArrArray2 = byteBuffer2.array();
                    int iLimit = byteBuffer2.limit();
                    yx1 yx1Var = (yx1) obj;
                    if (z) {
                        yx1Var.reset();
                    }
                    qx1 qx1VarMo4034m = yx1Var.mo4034m(0, iLimit, bArrArray2);
                    long j = ux1Var.f11797p;
                    long j2 = ux1Var.f11449s;
                    c0645fm.f12349g = j;
                    c0645fm.f3850n = qx1VarMo4034m;
                    if (j2 != Long.MAX_VALUE) {
                        j = j2;
                    }
                    c0645fm.f3851o = j;
                    c0645fm.f12350m = false;
                    return null;
                } catch (sx1 e2) {
                    return e2;
                }
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m3147h() {
        boolean z;
        AbstractC1459tx abstractC1459txM3145f;
        synchronized (this.f4566b) {
            while (!this.f4576l) {
                try {
                    if (!this.f4567c.isEmpty() && this.f4572h > 0) {
                        break;
                    }
                    this.f4566b.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f4576l) {
                return false;
            }
            C1533vx c1533vx = (C1533vx) this.f4567c.removeFirst();
            AbstractC1570wx[] abstractC1570wxArr = this.f4570f;
            int i = this.f4572h - 1;
            this.f4572h = i;
            AbstractC1570wx abstractC1570wx = abstractC1570wxArr[i];
            boolean z2 = this.f4575k;
            this.f4575k = false;
            if (c1533vx.m4599i(4)) {
                abstractC1570wx.m4597b(4);
            } else {
                abstractC1570wx.f12349g = c1533vx.f11797p;
                if (c1533vx.m4599i(134217728)) {
                    abstractC1570wx.m4597b(134217728);
                }
                long j = c1533vx.f11797p;
                synchronized (this.f4566b) {
                    long j2 = this.f4577m;
                    z = j2 == -9223372036854775807L || j >= j2;
                }
                if (!z) {
                    abstractC1570wx.f12350m = true;
                }
                try {
                    abstractC1459txM3145f = m3146g(c1533vx, abstractC1570wx, z2);
                } catch (OutOfMemoryError e) {
                    abstractC1459txM3145f = m3145f(e);
                } catch (RuntimeException e2) {
                    abstractC1459txM3145f = m3145f(e2);
                }
                if (abstractC1459txM3145f != null) {
                    synchronized (this.f4566b) {
                        this.f4574j = abstractC1459txM3145f;
                    }
                    return false;
                }
            }
            synchronized (this.f4566b) {
                try {
                    if (this.f4575k || abstractC1570wx.f12350m) {
                        abstractC1570wx.mo2827s();
                    } else {
                        this.f4568d.addLast(abstractC1570wx);
                    }
                    c1533vx.mo5844r();
                    C1533vx[] c1533vxArr = this.f4569e;
                    int i2 = this.f4571g;
                    this.f4571g = i2 + 1;
                    c1533vxArr[i2] = c1533vx;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    @Override // p000.InterfaceC1385rx
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final AbstractC1570wx mo3012c() {
        synchronized (this.f4566b) {
            try {
                AbstractC1459tx abstractC1459tx = this.f4574j;
                if (abstractC1459tx != null) {
                    throw abstractC1459tx;
                }
                if (this.f4568d.isEmpty()) {
                    return null;
                }
                return (AbstractC1570wx) this.f4568d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC1385rx
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void mo3014e(C1533vx c1533vx) {
        synchronized (this.f4566b) {
            try {
                AbstractC1459tx abstractC1459tx = this.f4574j;
                if (abstractC1459tx != null) {
                    throw abstractC1459tx;
                }
                ki0.m3857c(c1533vx == this.f4573i);
                this.f4567c.addLast(c1533vx);
                if (!this.f4567c.isEmpty() && this.f4572h > 0) {
                    this.f4566b.notify();
                }
                this.f4573i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m3150k(AbstractC1570wx abstractC1570wx) {
        synchronized (this.f4566b) {
            abstractC1570wx.mo2826r();
            AbstractC1570wx[] abstractC1570wxArr = this.f4570f;
            int i = this.f4572h;
            this.f4572h = i + 1;
            abstractC1570wxArr[i] = abstractC1570wx;
            if (!this.f4567c.isEmpty() && this.f4572h > 0) {
                this.f4566b.notify();
            }
        }
    }

    @Override // p000.InterfaceC1385rx
    public final void release() {
        synchronized (this.f4566b) {
            this.f4576l = true;
            this.f4566b.notify();
        }
        try {
            this.f4565a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // p000.rx1
    /* JADX INFO: renamed from: b */
    public void mo3011b(long j) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0715hi(yx1 yx1Var) {
        this(new ux1[2], new C0645fm[2]);
        this.f4578n = 1;
        int i = this.f4571g;
        C1533vx[] c1533vxArr = this.f4569e;
        ki0.m3864h(i == c1533vxArr.length);
        for (C1533vx c1533vx : c1533vxArr) {
            c1533vx.m6664t(1024);
        }
        this.f4579o = yx1Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0715hi(f40 f40Var) {
        this(new C1533vx[1], new C0678gi[1]);
        this.f4578n = 0;
        this.f4579o = f40Var;
    }
}

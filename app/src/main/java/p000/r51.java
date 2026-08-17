package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class r51 extends AbstractC0828kh implements Handler.Callback {

    /* JADX INFO: renamed from: A */
    public ki0 f9728A;

    /* JADX INFO: renamed from: B */
    public boolean f9729B;

    /* JADX INFO: renamed from: C */
    public boolean f9730C;

    /* JADX INFO: renamed from: D */
    public long f9731D;

    /* JADX INFO: renamed from: E */
    public k51 f9732E;

    /* JADX INFO: renamed from: F */
    public long f9733F;

    /* JADX INFO: renamed from: w */
    public final bz1 f9734w;

    /* JADX INFO: renamed from: x */
    public final c80 f9735x;

    /* JADX INFO: renamed from: y */
    public final Handler f9736y;

    /* JADX INFO: renamed from: z */
    public final o51 f9737z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r51(c80 c80Var, Looper looper) {
        super(5);
        bz1 bz1Var = bz1.f1580e;
        this.f9735x = c80Var;
        this.f9736y = looper == null ? null : new Handler(looper, this);
        this.f9734w = bz1Var;
        this.f9737z = new o51(1);
        this.f9733F = -9223372036854775807L;
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: B */
    public final int mo2886B(be0 be0Var) {
        if (this.f9734w.m1086m(be0Var)) {
            return AbstractC0828kh.m3828f(be0Var.f1326L == 0 ? 4 : 2, 0, 0, 0);
        }
        return AbstractC0828kh.m3828f(0, 0, 0, 0);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    /* JADX INFO: renamed from: D */
    public final void m5701D(k51 k51Var, ArrayList arrayList) {
        int i = 0;
        while (true) {
            f51[] f51VarArr = k51Var.f5679a;
            if (i >= f51VarArr.length) {
                return;
            }
            be0 be0VarMo2245e = f51VarArr[i].mo2245e();
            if (be0VarMo2245e != null) {
                bz1 bz1Var = this.f9734w;
                if (bz1Var.m1086m(be0VarMo2245e)) {
                    ki0 ki0VarM1080b = bz1Var.m1080b(be0VarMo2245e);
                    byte[] bArrMo2246s = f51VarArr[i].mo2246s();
                    bArrMo2246s.getClass();
                    o51 o51Var = this.f9737z;
                    o51Var.mo5844r();
                    o51Var.m6664t(bArrMo2246s.length);
                    o51Var.f11795n.put(bArrMo2246s);
                    o51Var.m6665u();
                    k51 k51VarM3888s = ki0VarM1080b.m3888s(o51Var);
                    if (k51VarM3888s != null) {
                        m5701D(k51VarM3888s, arrayList);
                    }
                } else {
                    arrayList.add(f51VarArr[i]);
                }
            } else {
                arrayList.add(f51VarArr[i]);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: E */
    public final long m5702E(long j) {
        ki0.m3864h(j != -9223372036854775807L);
        ki0.m3864h(this.f9733F != -9223372036854775807L);
        return j - this.f9733F;
    }

    /* JADX INFO: renamed from: F */
    public final void m5703F(k51 k51Var) {
        c80 c80Var = this.f9735x;
        f80 f80Var = c80Var.f1699a;
        d21 d21Var = f80Var.f3695f0;
        au0 au0Var = f80Var.f3704l;
        c21 c21VarM2204a = d21Var.m2204a();
        int i = 0;
        while (true) {
            f51[] f51VarArr = k51Var.f5679a;
            if (i >= f51VarArr.length) {
                break;
            }
            f51VarArr[i].mo2346p(c21VarM2204a);
            i++;
        }
        f80Var.f3695f0 = new d21(c21VarM2204a);
        d21 d21VarM2754a = f80Var.m2754a();
        if (!d21VarM2754a.equals(f80Var.f3672O)) {
            f80Var.f3672O = d21VarM2754a;
            au0Var.m712c(14, new C1521vl(c80Var, 12));
        }
        au0Var.m712c(28, new C1521vl(k51Var, 13));
        au0Var.m711b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            m5703F((k51) message.obj);
            return true;
        }
        l41.m4046o();
        return false;
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: j */
    public final String mo34j() {
        return "MetadataRenderer";
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: l */
    public final boolean mo35l() {
        return this.f9730C;
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: n */
    public final boolean mo37n() {
        return true;
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: o */
    public final void mo38o() {
        this.f9732E = null;
        this.f9728A = null;
        this.f9733F = -9223372036854775807L;
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: q */
    public final void mo40q(long j, boolean z) {
        this.f9732E = null;
        this.f9729B = false;
        this.f9730C = false;
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: v */
    public final void mo2916v(be0[] be0VarArr, long j, long j2, q21 q21Var) {
        this.f9728A = this.f9734w.m1080b(be0VarArr[0]);
        k51 k51Var = this.f9732E;
        if (k51Var != null) {
            long j3 = k51Var.f5680b;
            long j4 = (this.f9733F + j3) - j2;
            if (j3 != j4) {
                k51Var = new k51(j4, k51Var.f5679a);
            }
            this.f9732E = k51Var;
        }
        this.f9733F = j2;
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: x */
    public final void mo2919x(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.f9729B && this.f9732E == null) {
                o51 o51Var = this.f9737z;
                o51Var.mo5844r();
                C0558d8 c0558d8 = this.f5808c;
                c0558d8.m2267h();
                int iM3833w = m3833w(c0558d8, o51Var, 0);
                if (iM3833w == -4) {
                    if (o51Var.m4599i(4)) {
                        this.f9729B = true;
                    } else if (o51Var.f11797p >= this.f5817q) {
                        o51Var.f7665s = this.f9731D;
                        o51Var.m6665u();
                        ki0 ki0Var = this.f9728A;
                        int i = z42.f13274a;
                        k51 k51VarM3888s = ki0Var.m3888s(o51Var);
                        if (k51VarM3888s != null) {
                            ArrayList arrayList = new ArrayList(k51VarM3888s.f5679a.length);
                            m5701D(k51VarM3888s, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f9732E = new k51(m5702E(o51Var.f11797p), (f51[]) arrayList.toArray(new f51[0]));
                            }
                        }
                    }
                } else if (iM3833w == -5) {
                    be0 be0Var = (be0) c0558d8.f2822c;
                    be0Var.getClass();
                    this.f9731D = be0Var.f1346s;
                }
            }
            k51 k51Var = this.f9732E;
            if (k51Var == null || k51Var.f5680b > m5702E(j)) {
                z = false;
            } else {
                k51 k51Var2 = this.f9732E;
                Handler handler = this.f9736y;
                if (handler != null) {
                    handler.obtainMessage(1, k51Var2).sendToTarget();
                } else {
                    m5703F(k51Var2);
                }
                this.f9732E = null;
                z = true;
            }
            if (this.f9729B && this.f9732E == null) {
                this.f9730C = true;
            }
        }
    }
}

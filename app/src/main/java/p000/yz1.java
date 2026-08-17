package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class yz1 extends AbstractC0828kh implements Handler.Callback {

    /* JADX INFO: renamed from: A */
    public boolean f13188A;

    /* JADX INFO: renamed from: B */
    public int f13189B;

    /* JADX INFO: renamed from: C */
    public rx1 f13190C;

    /* JADX INFO: renamed from: D */
    public ux1 f13191D;

    /* JADX INFO: renamed from: E */
    public C0645fm f13192E;

    /* JADX INFO: renamed from: F */
    public C0645fm f13193F;

    /* JADX INFO: renamed from: G */
    public int f13194G;

    /* JADX INFO: renamed from: H */
    public final Handler f13195H;

    /* JADX INFO: renamed from: I */
    public final c80 f13196I;

    /* JADX INFO: renamed from: J */
    public final C0558d8 f13197J;

    /* JADX INFO: renamed from: K */
    public boolean f13198K;

    /* JADX INFO: renamed from: L */
    public boolean f13199L;

    /* JADX INFO: renamed from: M */
    public be0 f13200M;

    /* JADX INFO: renamed from: N */
    public long f13201N;

    /* JADX INFO: renamed from: O */
    public long f13202O;

    /* JADX INFO: renamed from: P */
    public IOException f13203P;

    /* JADX INFO: renamed from: w */
    public final k50 f13204w;

    /* JADX INFO: renamed from: x */
    public final C1533vx f13205x;

    /* JADX INFO: renamed from: y */
    public InterfaceC1085lv f13206y;

    /* JADX INFO: renamed from: z */
    public final tx1 f13207z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz1(c80 c80Var, Looper looper) {
        super(3);
        pn0 pn0Var = tx1.f11033j;
        this.f13196I = c80Var;
        this.f13195H = looper == null ? null : new Handler(looper, this);
        this.f13207z = pn0Var;
        this.f13204w = new k50((byte) 0, 17);
        this.f13205x = new C1533vx(1);
        this.f13197J = new C0558d8((char) 0, 24);
        this.f13202O = -9223372036854775807L;
        this.f13201N = -9223372036854775807L;
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: B */
    public final int mo2886B(be0 be0Var) {
        boolean zEquals = Objects.equals(be0Var.f1341n, "application/x-media3-cues");
        String str = be0Var.f1341n;
        if (!zEquals) {
            pn0 pn0Var = (pn0) this.f13207z;
            pn0Var.getClass();
            if (!((k50) pn0Var.f8968a).mo744g(be0Var) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return v51.m6580j(str) ? AbstractC0828kh.m3828f(1, 0, 0, 0) : AbstractC0828kh.m3828f(0, 0, 0, 0);
            }
        }
        return AbstractC0828kh.m3828f(be0Var.f1326L == 0 ? 4 : 2, 0, 0, 0);
    }

    /* JADX INFO: renamed from: D */
    public final void m7165D() {
        ki0.m3865i(Objects.equals(this.f13200M.f1341n, "application/cea-608") || Objects.equals(this.f13200M.f1341n, "application/x-mp4-cea-608") || Objects.equals(this.f13200M.f1341n, "application/cea-708"), "Legacy decoding is disabled, can't handle " + this.f13200M.f1341n + " samples (expected application/x-media3-cues).");
    }

    /* JADX INFO: renamed from: E */
    public final long m7166E() {
        if (this.f13194G == -1) {
            return Long.MAX_VALUE;
        }
        this.f13192E.getClass();
        if (this.f13194G >= this.f13192E.mo2825g()) {
            return Long.MAX_VALUE;
        }
        return this.f13192E.mo2823d(this.f13194G);
    }

    /* JADX INFO: renamed from: F */
    public final long m7167F(long j) {
        ki0.m3864h(j != -9223372036854775807L);
        return j - this.f5816p;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    /* JADX INFO: renamed from: G */
    public final void m7168G() {
        rx1 c0715hi;
        byte b = 1;
        this.f13188A = true;
        be0 be0Var = this.f13200M;
        be0Var.getClass();
        k50 k50Var = (k50) ((pn0) this.f13207z).f8968a;
        String str = be0Var.f1341n;
        int i = be0Var.f1322H;
        if (str != null) {
            switch (str.hashCode()) {
                case 930165504:
                    b = !str.equals("application/x-mp4-cea-608") ? (byte) -1 : (byte) 0;
                    break;
                case 1566015601:
                    if (!str.equals("application/cea-608")) {
                        b = -1;
                    }
                    break;
                case 1566016562:
                    b = !str.equals("application/cea-708") ? (byte) -1 : (byte) 2;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                    c0715hi = new C1669zl(str, i);
                    break;
                case 2:
                    c0715hi = new C0572dm(i, be0Var.f1344q);
                    break;
                default:
                    if (k50Var.mo744g(be0Var)) {
                        f40.m2713i(AbstractC1308pu.m5339f("Attempted to create decoder for unsupported MIME type: ", str));
                        return;
                    }
                    yx1 yx1VarMo749l = k50Var.mo749l(be0Var);
                    yx1VarMo749l.getClass().getSimpleName().concat("Decoder");
                    c0715hi = new C0715hi(yx1VarMo749l);
                    break;
                    break;
            }
        } else if (k50Var.mo744g(be0Var)) {
            f40.m2713i(AbstractC1308pu.m5339f("Attempted to create decoder for unsupported MIME type: ", str));
            return;
        } else {
            yx1 yx1VarMo749l2 = k50Var.mo749l(be0Var);
            yx1VarMo749l2.getClass().getSimpleName().concat("Decoder");
            c0715hi = new C0715hi(yx1VarMo749l2);
        }
        this.f13190C = c0715hi;
        c0715hi.mo3010a(this.f5817q);
    }

    /* JADX INFO: renamed from: H */
    public final void m7169H(C1048kv c1048kv) {
        qm0 qm0Var = c1048kv.f6037a;
        c80 c80Var = this.f13196I;
        c80Var.f1699a.f3704l.m714e(27, new C0620ey(qm0Var));
        f80 f80Var = c80Var.f1699a;
        f80Var.f3685a0 = c1048kv;
        f80Var.f3704l.m714e(27, new C1521vl(c1048kv, 11));
    }

    /* JADX INFO: renamed from: I */
    public final void m7170I() {
        this.f13191D = null;
        this.f13194G = -1;
        C0645fm c0645fm = this.f13192E;
        if (c0645fm != null) {
            c0645fm.mo2827s();
            this.f13192E = null;
        }
        C0645fm c0645fm2 = this.f13193F;
        if (c0645fm2 != null) {
            c0645fm2.mo2827s();
            this.f13193F = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            m7169H((C1048kv) message.obj);
            return true;
        }
        l41.m4046o();
        return false;
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: j */
    public final String mo34j() {
        return "TextRenderer";
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: l */
    public final boolean mo35l() {
        return this.f13199L;
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: n */
    public final boolean mo37n() {
        if (this.f13200M != null) {
            if (this.f13203P == null) {
                try {
                    yo1 yo1Var = this.f5814n;
                    yo1Var.getClass();
                    yo1Var.mo3798h();
                } catch (IOException e) {
                    this.f13203P = e;
                }
            }
            if (this.f13203P != null) {
                be0 be0Var = this.f13200M;
                be0Var.getClass();
                if (Objects.equals(be0Var.f1341n, "application/x-media3-cues")) {
                    InterfaceC1085lv interfaceC1085lv = this.f13206y;
                    interfaceC1085lv.getClass();
                    return interfaceC1085lv.mo4286a(this.f13201N) != Long.MIN_VALUE;
                }
                if (!this.f13199L) {
                    if (this.f13198K) {
                        C0645fm c0645fm = this.f13192E;
                        long j = this.f13201N;
                        if (c0645fm == null || c0645fm.mo2823d(c0645fm.mo2825g() - 1) <= j) {
                            C0645fm c0645fm2 = this.f13193F;
                            long j2 = this.f13201N;
                            if ((c0645fm2 == null || c0645fm2.mo2823d(c0645fm2.mo2825g() - 1) <= j2) && this.f13191D != null) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: o */
    public final void mo38o() {
        this.f13200M = null;
        this.f13202O = -9223372036854775807L;
        kk1 kk1Var = kk1.f5896e;
        m7167F(this.f13201N);
        C1048kv c1048kv = new C1048kv(kk1Var);
        Handler handler = this.f13195H;
        if (handler != null) {
            handler.obtainMessage(1, c1048kv).sendToTarget();
        } else {
            m7169H(c1048kv);
        }
        this.f13201N = -9223372036854775807L;
        if (this.f13190C != null) {
            m7170I();
            rx1 rx1Var = this.f13190C;
            rx1Var.getClass();
            rx1Var.release();
            this.f13190C = null;
            this.f13189B = 0;
        }
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: q */
    public final void mo40q(long j, boolean z) {
        this.f13201N = j;
        InterfaceC1085lv interfaceC1085lv = this.f13206y;
        if (interfaceC1085lv != null) {
            interfaceC1085lv.clear();
        }
        kk1 kk1Var = kk1.f5896e;
        m7167F(this.f13201N);
        C1048kv c1048kv = new C1048kv(kk1Var);
        Handler handler = this.f13195H;
        if (handler != null) {
            handler.obtainMessage(1, c1048kv).sendToTarget();
        } else {
            m7169H(c1048kv);
        }
        this.f13198K = false;
        this.f13199L = false;
        this.f13202O = -9223372036854775807L;
        be0 be0Var = this.f13200M;
        if (be0Var == null || Objects.equals(be0Var.f1341n, "application/x-media3-cues")) {
            return;
        }
        if (this.f13189B == 0) {
            m7170I();
            rx1 rx1Var = this.f13190C;
            rx1Var.getClass();
            rx1Var.flush();
            rx1Var.mo3010a(this.f5817q);
            return;
        }
        m7170I();
        rx1 rx1Var2 = this.f13190C;
        rx1Var2.getClass();
        rx1Var2.release();
        this.f13190C = null;
        this.f13189B = 0;
        m7168G();
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: v */
    public final void mo2916v(be0[] be0VarArr, long j, long j2, q21 q21Var) {
        be0 be0Var = be0VarArr[0];
        this.f13200M = be0Var;
        if (Objects.equals(be0Var.f1341n, "application/x-media3-cues")) {
            this.f13206y = this.f13200M.f1323I == 1 ? new m41() : new zj0(2);
            return;
        }
        m7165D();
        if (this.f13190C != null) {
            this.f13189B = 1;
        } else {
            m7168G();
        }
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: x */
    public final void mo2919x(long j, long j2) {
        boolean z;
        C0558d8 c0558d8;
        boolean z2;
        long jMo2823d;
        if (this.f5819s) {
            long j3 = this.f13202O;
            if (j3 != -9223372036854775807L && j >= j3) {
                m7170I();
                this.f13199L = true;
            }
        }
        if (this.f13199L) {
            return;
        }
        be0 be0Var = this.f13200M;
        be0Var.getClass();
        boolean zEquals = Objects.equals(be0Var.f1341n, "application/x-media3-cues");
        Handler handler = this.f13195H;
        C0558d8 c0558d9 = this.f13197J;
        boolean zMo4287b = false;
        zMo4287b = false;
        zMo4287b = false;
        if (zEquals) {
            this.f13206y.getClass();
            if (!this.f13198K) {
                C1533vx c1533vx = this.f13205x;
                if (m3833w(c0558d9, c1533vx, 0) == -4) {
                    if (c1533vx.m4599i(4)) {
                        this.f13198K = true;
                    } else {
                        c1533vx.m6665u();
                        ByteBuffer byteBuffer = c1533vx.f11795n;
                        byteBuffer.getClass();
                        long j4 = c1533vx.f11797p;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.f13204w.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        f40 f40Var = new f40(26);
                        nm0 nm0VarM5566m = qm0.m5566m();
                        for (int i = 0; i < parcelableArrayList.size(); i++) {
                            Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                            bundle2.getClass();
                            nm0VarM5566m.m3901a(f40Var.apply(bundle2));
                        }
                        C1122mv c1122mv = new C1122mv(nm0VarM5566m.m4561g(), j4, bundle.getLong("d"));
                        c1533vx.mo5844r();
                        zMo4287b = this.f13206y.mo4287b(c1122mv, j);
                    }
                }
            }
            long jMo4286a = this.f13206y.mo4286a(this.f13201N);
            if (jMo4286a == Long.MIN_VALUE && this.f13198K && !zMo4287b) {
                this.f13199L = true;
            }
            if (jMo4286a != Long.MIN_VALUE && jMo4286a <= j) {
                zMo4287b = true;
            }
            if (zMo4287b) {
                qm0 qm0VarMo4288c = this.f13206y.mo4288c(j);
                long jMo4289d = this.f13206y.mo4289d(j);
                m7167F(jMo4289d);
                C1048kv c1048kv = new C1048kv(qm0VarMo4288c);
                if (handler != null) {
                    handler.obtainMessage(1, c1048kv).sendToTarget();
                } else {
                    m7169H(c1048kv);
                }
                this.f13206y.mo4290e(jMo4289d);
            }
            this.f13201N = j;
            return;
        }
        m7165D();
        this.f13201N = j;
        if (this.f13193F == null) {
            rx1 rx1Var = this.f13190C;
            rx1Var.getClass();
            rx1Var.mo3011b(j);
            try {
                rx1 rx1Var2 = this.f13190C;
                rx1Var2.getClass();
                this.f13193F = (C0645fm) rx1Var2.mo3012c();
            } catch (sx1 e) {
                AbstractC1337qm.m5551n("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f13200M, e);
                kk1 kk1Var = kk1.f5896e;
                m7167F(this.f13201N);
                C1048kv c1048kv2 = new C1048kv(kk1Var);
                if (handler != null) {
                    handler.obtainMessage(1, c1048kv2).sendToTarget();
                } else {
                    m7169H(c1048kv2);
                }
                m7170I();
                rx1 rx1Var3 = this.f13190C;
                rx1Var3.getClass();
                rx1Var3.release();
                this.f13190C = null;
                this.f13189B = 0;
                m7168G();
                return;
            }
        }
        if (this.f5813m != 2) {
            return;
        }
        if (this.f13192E != null) {
            long jM7166E = m7166E();
            z = false;
            while (jM7166E <= j) {
                this.f13194G++;
                jM7166E = m7166E();
                z = true;
            }
        } else {
            z = false;
        }
        C0645fm c0645fm = this.f13193F;
        if (c0645fm == null) {
            c0558d8 = c0558d9;
            z2 = z;
        } else if (c0645fm.m4599i(4)) {
            if (!z && m7166E() == Long.MAX_VALUE) {
                if (this.f13189B == 2) {
                    m7170I();
                    rx1 rx1Var4 = this.f13190C;
                    rx1Var4.getClass();
                    rx1Var4.release();
                    this.f13190C = null;
                    this.f13189B = 0;
                    m7168G();
                } else {
                    m7170I();
                    this.f13199L = true;
                }
            }
            c0558d8 = c0558d9;
            z2 = z;
        } else {
            c0558d8 = c0558d9;
            if (c0645fm.f12349g <= j) {
                C0645fm c0645fm2 = this.f13192E;
                if (c0645fm2 != null) {
                    z2 = z;
                    c0645fm2.mo2827s();
                }
                z2 = z;
                this.f13194G = c0645fm.mo2822c(j);
                this.f13192E = c0645fm;
                this.f13193F = null;
                z2 = true;
            }
        }
        if (z2) {
            this.f13192E.getClass();
            int iMo2822c = this.f13192E.mo2822c(j);
            if (iMo2822c == 0 || this.f13192E.mo2825g() == 0) {
                jMo2823d = this.f13192E.f12349g;
            } else {
                C0645fm c0645fm3 = this.f13192E;
                jMo2823d = iMo2822c == -1 ? c0645fm3.mo2823d(c0645fm3.mo2825g() - 1) : c0645fm3.mo2823d(iMo2822c - 1);
            }
            m7167F(jMo2823d);
            C1048kv c1048kv3 = new C1048kv(this.f13192E.mo2824e(j));
            if (handler != null) {
                handler.obtainMessage(1, c1048kv3).sendToTarget();
            } else {
                m7169H(c1048kv3);
            }
        }
        if (this.f13189B == 2) {
            return;
        }
        while (!this.f13198K) {
            try {
                ux1 ux1Var = this.f13191D;
                if (ux1Var == null) {
                    rx1 rx1Var5 = this.f13190C;
                    rx1Var5.getClass();
                    ux1Var = (ux1) rx1Var5.mo3013d();
                    if (ux1Var == null) {
                        return;
                    } else {
                        this.f13191D = ux1Var;
                    }
                }
                if (this.f13189B == 1) {
                    ux1Var.f7542b = 4;
                    rx1 rx1Var6 = this.f13190C;
                    rx1Var6.getClass();
                    rx1Var6.mo3014e(ux1Var);
                    this.f13191D = null;
                    this.f13189B = 2;
                    return;
                }
                int iM3833w = m3833w(c0558d8, ux1Var, 0);
                if (iM3833w == -4) {
                    if (ux1Var.m4599i(4)) {
                        this.f13198K = true;
                        this.f13188A = false;
                    } else {
                        be0 be0Var2 = (be0) c0558d8.f2822c;
                        if (be0Var2 == null) {
                            return;
                        }
                        ux1Var.f11449s = be0Var2.f1346s;
                        ux1Var.m6665u();
                        this.f13188A &= !ux1Var.m4599i(1);
                    }
                    if (!this.f13188A) {
                        rx1 rx1Var7 = this.f13190C;
                        rx1Var7.getClass();
                        rx1Var7.mo3014e(ux1Var);
                        this.f13191D = null;
                    }
                } else if (iM3833w == -3) {
                    return;
                }
            } catch (sx1 e2) {
                AbstractC1337qm.m5551n("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f13200M, e2);
                kk1 kk1Var2 = kk1.f5896e;
                m7167F(this.f13201N);
                C1048kv c1048kv4 = new C1048kv(kk1Var2);
                if (handler != null) {
                    handler.obtainMessage(1, c1048kv4).sendToTarget();
                } else {
                    m7169H(c1048kv4);
                }
                m7170I();
                rx1 rx1Var8 = this.f13190C;
                rx1Var8.getClass();
                rx1Var8.release();
                this.f13190C = null;
                this.f13189B = 0;
                m7168G();
                return;
            }
        }
    }
}

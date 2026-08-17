package p000;

import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.fragment.app.AbstractC0056t;
import androidx.fragment.app.C0061y;
import com.example.ssmousepro.injection.InjectionMetrics;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: u3 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1466u3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11105a;

    /* JADX INFO: renamed from: b */
    public final Object f11106b;

    /* JADX INFO: renamed from: c */
    public final Object f11107c;

    public RunnableC1466u3(w20 w20Var, AbstractC1337qm abstractC1337qm) {
        this.f11105a = 19;
        this.f11107c = w20Var;
        p32.m5188s(abstractC1337qm, "savedListener");
        this.f11106b = abstractC1337qm;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0074 A[Catch: all -> 0x0070, TryCatch #1 {all -> 0x0070, blocks: (B:6:0x0015, B:27:0x00a5, B:9:0x0023, B:11:0x0043, B:13:0x004f, B:18:0x005d, B:22:0x0074, B:26:0x0098, B:25:0x0083), top: B:327:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0082  */
    /* JADX WARN: Code duplicated, block: B:25:0x0083 A[Catch: all -> 0x0070, TryCatch #1 {all -> 0x0070, blocks: (B:6:0x0015, B:27:0x00a5, B:9:0x0023, B:11:0x0043, B:13:0x004f, B:18:0x005d, B:22:0x0074, B:26:0x0098, B:25:0x0083), top: B:327:0x0015 }] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        g31 g31Var;
        RunnableC1175oa runnableC1175oa;
        v71 v71Var;
        List listSingletonList;
        cp0 cp0Var;
        nv1 nv1VarMo1258a;
        Object obj;
        km1 km1Var;
        int i = 3;
        C1174o9 c1174o9 = null;
        c1548wb = null;
        C1548wb c1548wb = null;
        c1174o9 = null;
        c1174o9 = null;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        int i2 = 0;
        switch (this.f11105a) {
            case 0:
                C1392s3 c1392s3 = (C1392s3) this.f11106b;
                C1540w3 c1540w3 = (C1540w3) this.f11107c;
                i31 i31Var = c1540w3.f11941c;
                if (i31Var != null && (g31Var = i31Var.f4791e) != null) {
                    g31Var.mo774j(i31Var);
                }
                View view = (View) c1540w3.f11946m;
                if (view != null && view.getWindowToken() != null) {
                    if (c1392s3.m7188b()) {
                        c1540w3.f11957x = c1392s3;
                    } else if (c1392s3.f13258e != null) {
                        c1392s3.m7189d(0, 0, false, false);
                        c1540w3.f11957x = c1392s3;
                    }
                }
                c1540w3.f11959z = null;
                return;
            case 1:
                ((C0007a6) this.f11107c).f65k.unregisterNetworkCallback((C1616y5) this.f11106b);
                return;
            case 2:
                ((C0007a6) this.f11107c).f64j.unregisterReceiver((C1653z5) this.f11106b);
                return;
            case 3:
                pn0 pn0Var = (pn0) this.f11106b;
                Typeface typeface = (Typeface) this.f11107c;
                AbstractC1337qm abstractC1337qm = (AbstractC1337qm) pn0Var.f8968a;
                if (abstractC1337qm != null) {
                    abstractC1337qm.mo4488N(typeface);
                    return;
                }
                return;
            case 4:
                xf0.m6921g((View) this.f11106b, (Rect) this.f11107c);
                return;
            case 5:
                ((m00) this.f11106b).m336a();
                if (AbstractC0056t.m363G(2)) {
                    Objects.toString((C0061y) this.f11107c);
                    return;
                }
                return;
            case 6:
                ((kx0) this.f11107c).m4005a(nv1.f7553h.m4614g(((StringBuilder) this.f11106b).toString()), true);
                return;
            case 7:
                AbstractC0610eo abstractC0610eo = ((kx0) this.f11107c).f6056f;
                nv1 nv1Var = (nv1) this.f11106b;
                abstractC0610eo.cancel(nv1Var.f7563b, nv1Var.f7564c);
                return;
            case 8:
                ((kx0) this.f11107c).f6056f.sendMessage(this.f11106b);
                return;
            case 9:
                ((m10) this.f11107c).f6587a.onHeaders((j51) this.f11106b);
                return;
            case 10:
                ((m10) this.f11107c).f6587a.onMessage(this.f11106b);
                return;
            case 11:
                p32.m5193x(((ox0) ((p10) this.f11107c).f8619h.f8968a).f8530O.get(), "Channel must have been shut down");
                return;
            case 12:
                ((t10) this.f11107c).f10697c.mo1027c((k50) this.f11106b);
                return;
            case 13:
                ((t10) this.f11107c).f10697c.mo1029e((C1681zx) this.f11106b);
                return;
            case 14:
                ((t10) this.f11107c).f10697c.mo1032h((C1274ox) this.f11106b);
                return;
            case 15:
                ((t10) this.f11107c).f10697c.mo1033i((kh1) this.f11106b);
                return;
            case 16:
                ((t10) this.f11107c).f10697c.mo1030f((nv1) this.f11106b);
                return;
            case 17:
                ((s10) this.f11107c).f10195a.mo4770s((pn0) this.f11106b);
                return;
            case 18:
                ((s10) this.f11107c).f10195a.mo4761f((j51) this.f11106b);
                return;
            case 19:
                AbstractC1337qm abstractC1337qm2 = (AbstractC1337qm) this.f11106b;
                w20 w20Var = (w20) this.f11107c;
                String str = w20Var.f11929u;
                ry1 ry1Var = w20Var.f11933y;
                Logger logger = w20.f11911I;
                Level level = Level.FINER;
                if (logger.isLoggable(level)) {
                    logger.finer("Attempting DNS resolution of " + str);
                }
                try {
                    try {
                        zk0 zk0VarM6102a = w20Var.f11925q.m6102a(InetSocketAddress.createUnresolved(str, w20Var.f11930v));
                        a70 a70Var = zk0VarM6102a != null ? new a70(zk0VarM6102a) : null;
                        List list = Collections.EMPTY_LIST;
                        C1437tb c1437tb = C1437tb.f10816b;
                        if (a70Var == null) {
                            C1174o9 c1174o9M6691i0 = w20Var.m6691i0();
                            try {
                                nv1 nv1Var2 = (nv1) c1174o9M6691i0.f7699b;
                                if (nv1Var2 != null) {
                                    abstractC1337qm2.mo3310L(nv1Var2);
                                    runnableC1175oa = new RunnableC1175oa(((nv1) c1174o9M6691i0.f7699b) == null, i, this);
                                } else {
                                    List list2 = (List) c1174o9M6691i0.f7700c;
                                    if (list2 != null) {
                                        list = list2;
                                    }
                                    v71 v71Var2 = (v71) c1174o9M6691i0.f7701d;
                                    v71Var = v71Var2 != null ? v71Var2 : null;
                                    c1174o9 = c1174o9M6691i0;
                                    listSingletonList = list;
                                }
                            } catch (IOException e) {
                                e = e;
                                c1174o9 = c1174o9M6691i0;
                                abstractC1337qm2.mo3310L(nv1.f7559n.m4614g("Unable to resolve host " + str).m4613f(e));
                                runnableC1175oa = new RunnableC1175oa(c1174o9 != null && ((nv1) c1174o9.f7699b) == null, i, this);
                            } catch (Throwable th) {
                                th = th;
                                c1174o9 = c1174o9M6691i0;
                                ry1Var.execute(new RunnableC1175oa(c1174o9 != null && ((nv1) c1174o9.f7699b) == null, i, this));
                                throw th;
                            }
                            ry1Var.execute(runnableC1175oa);
                            return;
                        }
                        if (logger.isLoggable(level)) {
                            logger.finer("Using proxy address " + a70Var);
                        }
                        listSingletonList = Collections.singletonList(a70Var);
                        v71Var = null;
                        abstractC1337qm2.mo3311O(new w71(listSingletonList, c1437tb, v71Var));
                        runnableC1175oa = new RunnableC1175oa(c1174o9 != null && ((nv1) c1174o9.f7699b) == null, i, this);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
                ry1Var.execute(runnableC1175oa);
                return;
            case 20:
                ph0 ph0Var = (ph0) this.f11107c;
                try {
                    ph0Var.onSuccess(hp0.m3227w((vt0) this.f11106b));
                    return;
                } catch (ExecutionException e3) {
                    ph0Var.onFailure(e3.getCause());
                    return;
                } catch (Throwable th3) {
                    ph0Var.onFailure(th3);
                    return;
                }
            case 21:
                dp0 dp0Var = ((gp0) this.f11107c).f4272l;
                SocketAddress socketAddress = (SocketAddress) ((a70) dp0Var.f2989a.get(dp0Var.f2990b)).f81a.get(dp0Var.f2991c);
                dp0 dp0Var2 = ((gp0) this.f11107c).f4272l;
                dp0Var2.f2989a = (List) this.f11106b;
                dp0Var2.m2379d();
                ((gp0) this.f11107c).f4273m = (List) this.f11106b;
                EnumC0651fs enumC0651fs = ((gp0) this.f11107c).f4283w.f4304a;
                EnumC0651fs enumC0651fs2 = EnumC0651fs.f3886b;
                if (enumC0651fs == enumC0651fs2 || ((gp0) this.f11107c).f4283w.f4304a == EnumC0651fs.f3885a) {
                    dp0 dp0Var3 = ((gp0) this.f11107c).f4272l;
                    while (true) {
                        if (i2 < dp0Var3.f2989a.size()) {
                            int iIndexOf = ((a70) dp0Var3.f2989a.get(i2)).f81a.indexOf(socketAddress);
                            if (iIndexOf == -1) {
                                i2++;
                            } else {
                                dp0Var3.f2990b = i2;
                                dp0Var3.f2991c = iIndexOf;
                            }
                        } else {
                            EnumC0651fs enumC0651fs3 = ((gp0) this.f11107c).f4283w.f4304a;
                            gp0 gp0Var = (gp0) this.f11107c;
                            if (enumC0651fs3 == enumC0651fs2) {
                                cp0Var = gp0Var.f4282v;
                                ((gp0) this.f11107c).f4282v = null;
                                ((gp0) this.f11107c).f4272l.m2379d();
                                gp0.m3031a((gp0) this.f11107c, EnumC0651fs.f3888d);
                            } else {
                                gp0Var.f4281u.mo2580h(nv1.f7559n.m4614g("InternalSubchannel closed pending transport due to address change"));
                                gp0 gp0Var2 = (gp0) this.f11107c;
                                gp0Var2.f4281u = null;
                                gp0Var2.f4272l.m2379d();
                                gp0.m3032e((gp0) this.f11107c);
                            }
                        }
                        cp0Var = null;
                    }
                } else {
                    cp0Var = null;
                }
                if (cp0Var != null) {
                    gp0 gp0Var3 = (gp0) this.f11107c;
                    if (gp0Var3.f4277q != null) {
                        gp0Var3.f4278r.mo2580h(nv1.f7559n.m4614g("InternalSubchannel closed transport early due to address change"));
                        ((gp0) this.f11107c).f4277q.m5579B();
                        gp0 gp0Var4 = (gp0) this.f11107c;
                        gp0Var4.f4277q = null;
                        gp0Var4.f4278r = null;
                    }
                    gp0 gp0Var5 = (gp0) this.f11107c;
                    gp0Var5.f4278r = cp0Var;
                    gp0Var5.f4277q = gp0Var5.f4271k.m5929c(new RunnableC1621ya(this, 13), 5L, TimeUnit.SECONDS, gp0Var5.f4266f);
                    return;
                }
                return;
            case 22:
                if (((gp0) ((C1548wb) this.f11107c).f12048d).f4283w.f4304a == EnumC0651fs.f3889e) {
                    return;
                }
                cp0 cp0Var2 = ((gp0) ((C1548wb) this.f11107c).f12048d).f4282v;
                C1548wb c1548wb2 = (C1548wb) this.f11107c;
                cp0 cp0Var3 = (cp0) c1548wb2.f12047c;
                gp0 gp0Var6 = (gp0) c1548wb2.f12048d;
                if (cp0Var2 == cp0Var3) {
                    gp0Var6.f4282v = null;
                    ((gp0) ((C1548wb) this.f11107c).f12048d).f4272l.m2379d();
                    gp0.m3031a((gp0) ((C1548wb) this.f11107c).f12048d, EnumC0651fs.f3888d);
                    return;
                }
                if (gp0Var6.f4281u == cp0Var3) {
                    p32.m5194y(gp0Var6.f4283w.f4304a == EnumC0651fs.f3885a, "Expected state is CONNECTING, actual state is %s", ((gp0) ((C1548wb) this.f11107c).f12048d).f4283w.f4304a);
                    dp0 dp0Var4 = ((gp0) ((C1548wb) this.f11107c).f12048d).f4272l;
                    a70 a70Var2 = (a70) dp0Var4.f2989a.get(dp0Var4.f2990b);
                    int i3 = dp0Var4.f2991c + 1;
                    dp0Var4.f2991c = i3;
                    if (i3 >= a70Var2.f81a.size()) {
                        dp0Var4.f2990b++;
                        dp0Var4.f2991c = 0;
                    }
                    dp0 dp0Var5 = ((gp0) ((C1548wb) this.f11107c).f12048d).f4272l;
                    int i4 = dp0Var5.f2990b;
                    int size = dp0Var5.f2989a.size();
                    gp0 gp0Var7 = (gp0) ((C1548wb) this.f11107c).f12048d;
                    if (i4 < size) {
                        gp0.m3032e(gp0Var7);
                        return;
                    }
                    gp0Var7.f4281u = null;
                    gp0Var7.f4272l.m2379d();
                    gp0 gp0Var8 = (gp0) ((C1548wb) this.f11107c).f12048d;
                    nv1 nv1Var3 = (nv1) this.f11106b;
                    gp0Var8.f4271k.m5930d();
                    p32.m5177l(!nv1Var3.m4612e(), "The error status must not be OK");
                    gp0Var8.m3034f(new C0688gs(EnumC0651fs.f3887c, nv1Var3));
                    if (gp0Var8.f4274n == null) {
                        gp0Var8.f4263c.getClass();
                        gp0Var8.f4274n = bz1.m1078h();
                    }
                    long jM5230a = gp0Var8.f4274n.m5230a();
                    sv1 sv1Var = gp0Var8.f4275o;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    long jM6141a = jM5230a - sv1Var.m6141a();
                    gp0Var8.f4269i.mo2842H(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", gp0.m3033i(nv1Var3), Long.valueOf(jM6141a));
                    p32.m5193x(gp0Var8.f4276p == null, "previous reconnectTask is not done");
                    gp0Var8.f4276p = gp0Var8.f4271k.m5929c(new zo0(gp0Var8, i2), jM6141a, timeUnit, gp0Var8.f4266f);
                    return;
                }
                return;
            case 23:
                hx0 hx0Var = (hx0) this.f11107c;
                nv1 nv1Var4 = (nv1) this.f11106b;
                Logger logger2 = ox0.f8508l0;
                Level level2 = Level.WARNING;
                ox0 ox0Var = hx0Var.f4742j;
                logger2.log(level2, "[{0}] Failed to resolve name. status={1}", new Object[]{ox0Var.f8550i, nv1Var4});
                lx0 lx0Var = ox0Var.f8540Y;
                if (lx0Var.f6542i.get() == ox0.f8514r0) {
                    lx0Var.m4319D0(null);
                }
                if (ox0Var.f8555k0 != 3) {
                    ox0Var.f8538W.mo2842H(3, "Failed to resolve name: {0}", nv1Var4);
                    ox0Var.f8555k0 = 3;
                }
                gx0 gx0Var = hx0Var.f4740h;
                if (gx0Var != ox0Var.f8521F) {
                    return;
                }
                ((nu0) gx0Var.f4357s.f3314b).mo1259n(nv1Var4);
                return;
            case 24:
                C1400sb c1400sb = so0.f10471a;
                hx0 hx0Var2 = (hx0) this.f11107c;
                ox0 ox0Var2 = hx0Var2.f4742j;
                if (ox0Var2.f8519D != hx0Var2.f4741i) {
                    return;
                }
                w71 w71Var = (w71) this.f11106b;
                List list3 = w71Var.f12017a;
                ox0Var2.f8538W.mo2842H(1, "Resolved address: {0}, config={1}", list3, w71Var.f12018b);
                ox0 ox0Var3 = ((hx0) this.f11107c).f4742j;
                if (ox0Var3.f8555k0 != 2) {
                    ox0Var3.f8538W.mo2842H(2, "Address resolved: {0}", list3);
                    ((hx0) this.f11107c).f4742j.f8555k0 = 2;
                }
                w71 w71Var2 = (w71) this.f11106b;
                v71 v71Var3 = w71Var2.f12019c;
                qm1 qm1Var = (qm1) w71Var2.f12018b.f10817a.get(sm1.f10437t);
                so0 so0Var = (so0) ((w71) this.f11106b).f12018b.f10817a.get(c1400sb);
                wx0 wx0Var = (v71Var3 == null || (obj = v71Var3.f11574b) == null) ? null : (wx0) obj;
                nv1 nv1Var5 = v71Var3 != null ? v71Var3.f11573a : null;
                ox0 ox0Var4 = ((hx0) this.f11107c).f4742j;
                int i5 = 25;
                int i6 = 5;
                if (ox0Var4.f8543b0) {
                    if (wx0Var != null) {
                        lx0 lx0Var2 = ox0Var4.f8540Y;
                        if (so0Var != null) {
                            lx0Var2.m4319D0(so0Var);
                            if (wx0Var.m6845b() != null) {
                                ((hx0) this.f11107c).f4742j.f8538W.mo2841G(1, "Method configs in service config will be discarded due to presence ofconfig-selector");
                            }
                        } else {
                            lx0Var2.m4319D0(wx0Var.m6845b());
                        }
                    } else if (nv1Var5 == null) {
                        wx0Var = ox0.f8513q0;
                        ox0Var4.f8540Y.m4319D0(null);
                    } else {
                        if (!ox0Var4.f8542a0) {
                            ox0Var4.f8538W.mo2841G(2, "Fallback to error due to invalid first service config without default config");
                            ((hx0) this.f11107c).mo3310L(v71Var3.f11573a);
                            if (qm1Var != null) {
                                boolean zM4612e = v71Var3.f11573a.m4612e();
                                sm1 sm1Var = qm1Var.f9541a;
                                C1442tg c1442tg = sm1Var.f10439r;
                                if (!zM4612e) {
                                    c1442tg.m6270a(new RunnableC1621ya(sm1Var, i5));
                                    return;
                                }
                                ry1 ry1Var2 = c1442tg.f10865b;
                                ry1Var2.m5930d();
                                ry1Var2.execute(new RunnableC1430t4(c1442tg, i6));
                                return;
                            }
                            return;
                        }
                        wx0Var = ox0Var4.f8541Z;
                    }
                    if (!wx0Var.equals(((hx0) this.f11107c).f4742j.f8541Z)) {
                        ((hx0) this.f11107c).f4742j.f8538W.mo2842H(2, "Service config changed{0}", wx0Var == ox0.f8513q0 ? " to empty" : "");
                        ox0 ox0Var5 = ((hx0) this.f11107c).f4742j;
                        ox0Var5.f8541Z = wx0Var;
                        ox0Var5.f8551i0.f5142a = wx0Var.f12354d;
                    }
                    try {
                        ((hx0) this.f11107c).f4742j.f8542a0 = true;
                    } catch (RuntimeException e4) {
                        ox0.f8508l0.log(Level.WARNING, "[" + ((hx0) this.f11107c).f4742j.f8550i + "] Unexpected exception from parsing service config", (Throwable) e4);
                    }
                    break;
                } else {
                    if (wx0Var != null) {
                        ox0Var4.f8538W.mo2841G(2, "Service config from name resolver discarded by channel settings");
                    }
                    ox0 ox0Var6 = ((hx0) this.f11107c).f4742j;
                    wx0Var = ox0.f8513q0;
                    if (so0Var != null) {
                        ox0Var6.f8538W.mo2841G(2, "Config selector from name resolver discarded by channel settings");
                    }
                    ((hx0) this.f11107c).f4742j.f8540Y.m4319D0(wx0Var.m6845b());
                }
                C1437tb c1437tb2 = ((w71) this.f11106b).f12018b;
                hx0 hx0Var3 = (hx0) this.f11107c;
                if (hx0Var3.f4740h == hx0Var3.f4742j.f8521F) {
                    c1437tb2.getClass();
                    C0558d8 c0558d8 = new C0558d8(c1437tb2, 6);
                    if (c1437tb2.f10817a.containsKey(c1400sb)) {
                        IdentityHashMap identityHashMap = new IdentityHashMap(((C1437tb) c0558d8.f2821b).f10817a);
                        identityHashMap.remove(c1400sb);
                        c0558d8.f2821b = new C1437tb(identityHashMap);
                    }
                    IdentityHashMap identityHashMap2 = (IdentityHashMap) c0558d8.f2822c;
                    if (identityHashMap2 != null) {
                        identityHashMap2.remove(c1400sb);
                    }
                    Map map = wx0Var.f12356f;
                    if (map != null) {
                        c0558d8.m2261J(nu0.f7537c, map);
                        c0558d8.m2266g();
                    }
                    C1437tb c1437tbM2266g = c0558d8.m2266g();
                    C0599ed c0599ed = ((hx0) this.f11107c).f4740h.f4357s;
                    C1437tb c1437tb3 = C1437tb.f10816b;
                    ku0 ku0Var = new ku0(list3, c1437tbM2266g, wx0Var.f12355e);
                    gx0 gx0Var2 = (gx0) c0599ed.f3313a;
                    gr1 gr1Var = (gr1) ku0Var.f6024c;
                    if (gr1Var == null) {
                        try {
                            C0558d8 c0558d9 = (C0558d8) c0599ed.f3316d;
                            String str2 = (String) c0558d9.f2822c;
                            ou0 ou0VarM5611b = ((qu0) c0558d9.f2821b).m5611b(str2);
                            if (ou0VarM5611b == null) {
                                throw new C0710hd("Trying to load '" + str2 + "' because using default policy, but it's unavailable");
                            }
                            gr1Var = new gr1(ou0VarM5611b, null);
                        } catch (C0710hd e5) {
                            gx0Var2.mo2595T(EnumC0651fs.f3887c, new bx0(nv1.f7558m.m4614g(e5.getMessage())));
                            ((nu0) c0599ed.f3314b).mo1260q();
                            c0599ed.f3315c = null;
                            c0599ed.f3314b = new C0673gd(i2);
                            nv1VarMo1258a = nv1.f7550e;
                        }
                    }
                    Object obj2 = gr1Var.f4303b;
                    ou0 ou0Var = gr1Var.f4302a;
                    if (((ou0) c0599ed.f3315c) == null || !ou0Var.mo2844a().equals(((ou0) c0599ed.f3315c).mo2844a())) {
                        gx0Var2.mo2595T(EnumC0651fs.f3885a, new C0636fd(i2));
                        ((nu0) c0599ed.f3314b).mo1260q();
                        c0599ed.f3315c = ou0Var;
                        nu0 nu0Var = (nu0) c0599ed.f3314b;
                        c0599ed.f3314b = ou0Var.mo2845b(gx0Var2);
                        gx0Var2.f4358t.f8538W.mo2842H(2, "Load balancer changed from {0} to {1}", nu0Var.getClass().getSimpleName(), ((nu0) c0599ed.f3314b).getClass().getSimpleName());
                    }
                    if (obj2 != null) {
                        gx0Var2.f4358t.f8538W.mo2842H(1, "Load-balancing config: {0}", obj2);
                    }
                    nv1VarMo1258a = ((nu0) c0599ed.f3314b).mo1258a(new ku0(ku0Var.f6022a, ku0Var.f6023b, obj2));
                    if (qm1Var != null) {
                        boolean zM4612e2 = nv1VarMo1258a.m4612e();
                        sm1 sm1Var2 = qm1Var.f9541a;
                        C1442tg c1442tg2 = sm1Var2.f10439r;
                        if (!zM4612e2) {
                            c1442tg2.m6270a(new RunnableC1621ya(sm1Var2, i5));
                            return;
                        }
                        ry1 ry1Var3 = c1442tg2.f10865b;
                        ry1Var3.m5930d();
                        ry1Var3.execute(new RunnableC1430t4(c1442tg2, i6));
                        return;
                    }
                    return;
                }
                return;
            case 25:
                kx0 kx0Var = (kx0) this.f11106b;
                lx0 lx0Var3 = (lx0) this.f11107c;
                ox0 ox0Var7 = lx0Var3.f6545l;
                if (lx0Var3.f6542i.get() != ox0.f8514r0) {
                    kx0Var.m4008d();
                    return;
                }
                if (ox0Var7.f8525J == null) {
                    ox0Var7.f8525J = new LinkedHashSet();
                    ox0Var7.f8549h0.m2155h(ox0Var7.f8526K, true);
                }
                ox0Var7.f8525J.add(kx0Var);
                return;
            case InjectionMetrics.I_MAX_ACTIVE_REJ /* 26 */:
                ((C0721ho) this.f11106b).run();
                kx0 kx0Var2 = (kx0) this.f11107c;
                kx0Var2.f6064n.f6545l.f8565u.execute(new j10(kx0Var2, z ? 1 : 0));
                return;
            case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                RunnableC0129cb runnableC0129cb = (RunnableC0129cb) this.f11107c;
                Object obj3 = this.f11106b;
                boolean z4 = runnableC0129cb.f1736c.get();
                AbstractC0561db abstractC0561db = runnableC0129cb.f1739f;
                if (z4) {
                    abstractC0561db.dispatchOnCancelled(runnableC0129cb, obj3);
                } else {
                    abstractC0561db.dispatchOnLoadComplete(runnableC0129cb, obj3);
                }
                runnableC0129cb.f1735b = 3;
                return;
            case InjectionMetrics.I_AIM_LOOP_TICKS /* 28 */:
                ((qd0) this.f11106b).accept(this.f11107c);
                return;
            default:
                synchronized (((dx0) ((im1) this.f11107c).f5106c).f3054i) {
                    try {
                        im1 im1Var = (im1) this.f11107c;
                        if (!((C1548wb) im1Var.f5105b).f12046b) {
                            dx0 dx0Var = (dx0) im1Var.f5106c;
                            dx0Var.f3060o = dx0Var.f3060o.m3906a((nm1) this.f11106b);
                            dx0 dx0Var2 = (dx0) ((im1) this.f11107c).f5106c;
                            if (dx0Var2.m2399u(dx0Var2.f3060o)) {
                                om1 om1Var = ((dx0) ((im1) this.f11107c).f5106c).f3058m;
                                if (om1Var != null) {
                                    if (om1Var.f8407d.get() <= om1Var.f8405b) {
                                        z3 = false;
                                    }
                                    if (!z3) {
                                        dx0 dx0Var3 = (dx0) ((im1) this.f11107c).f5106c;
                                        km1Var = dx0Var3.f3060o;
                                        if (km1Var.f5910h) {
                                            km1Var = new km1(km1Var.f5904b, km1Var.f5905c, km1Var.f5906d, km1Var.f5908f, km1Var.f5909g, km1Var.f5903a, true, km1Var.f5907e);
                                        }
                                        dx0Var3.f3060o = km1Var;
                                        ((dx0) ((im1) this.f11107c).f5106c).f3068w = null;
                                    }
                                }
                                dx0 dx0Var4 = (dx0) ((im1) this.f11107c).f5106c;
                                c1548wb = new C1548wb(dx0Var4.f3054i);
                                dx0Var4.f3068w = c1548wb;
                            } else {
                                dx0 dx0Var5 = (dx0) ((im1) this.f11107c).f5106c;
                                km1Var = dx0Var5.f3060o;
                                if (km1Var.f5910h) {
                                    km1Var = new km1(km1Var.f5904b, km1Var.f5905c, km1Var.f5906d, km1Var.f5908f, km1Var.f5909g, km1Var.f5903a, true, km1Var.f5907e);
                                }
                                dx0Var5.f3060o = km1Var;
                                ((dx0) ((im1) this.f11107c).f5106c).f3068w = null;
                            }
                            z2 = false;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                if (z2) {
                    nm1 nm1Var = (nm1) this.f11106b;
                    nm1Var.f7450a.mo1037m(new qo0(16, (dx0) ((im1) this.f11107c).f5106c, nm1Var));
                    ((nm1) this.f11106b).f7450a.mo1030f(nv1.f7551f.m4614g("Unneeded hedging"));
                    return;
                } else {
                    if (c1548wb != null) {
                        dx0 dx0Var6 = (dx0) ((im1) this.f11107c).f5106c;
                        c1548wb.m6741b(dx0Var6.f3049d.schedule(new im1(i2, dx0Var6, c1548wb), dx0Var6.f3052g.f3841b, TimeUnit.NANOSECONDS));
                    }
                    ((dx0) ((im1) this.f11107c).f5106c).m2397s((nm1) this.f11106b);
                    return;
                }
        }
    }

    public String toString() {
        switch (this.f11105a) {
            case 20:
                C1679zv c1679zvM5176k0 = p32.m5176k0(this);
                ph0 ph0Var = (ph0) this.f11107c;
                C1174o9 c1174o9 = new C1174o9(17);
                ((C1174o9) c1679zvM5176k0.f13578e).f7701d = c1174o9;
                c1679zvM5176k0.f13578e = c1174o9;
                c1174o9.f7700c = ph0Var;
                return c1679zvM5176k0.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ RunnableC1466u3(Object obj, Object obj2, int i, boolean z) {
        this.f11105a = i;
        this.f11106b = obj;
        this.f11107c = obj2;
    }

    public /* synthetic */ RunnableC1466u3(int i, Object obj, Object obj2) {
        this.f11105a = i;
        this.f11107c = obj;
        this.f11106b = obj2;
    }

    public RunnableC1466u3(xf0 xf0Var, View view, Rect rect) {
        this.f11105a = 4;
        this.f11106b = view;
        this.f11107c = rect;
    }
}

package p000;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class i10 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4768a;

    /* JADX INFO: renamed from: b */
    public Object f4769b;

    /* JADX INFO: renamed from: c */
    public Object f4770c;

    /* JADX INFO: renamed from: d */
    public Object f4771d;

    public i10(View view, ma2 ma2Var, fa2 fa2Var, ValueAnimator valueAnimator) {
        this.f4768a = 8;
        this.f4770c = view;
        this.f4769b = fa2Var;
        this.f4771d = valueAnimator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        y91 y91Var;
        x91 x91Var;
        Socket socketM7053e;
        om0 om0Var;
        Object r10;
        mb1 mb1Var;
        double d;
        int i;
        SSLSession session = null;
        Object objCall = null;
        boolean z = false;
        switch (this.f4768a) {
            case 0:
                ((kx0) this.f4771d).f6056f.start((AbstractC0143co) this.f4770c, (j51) this.f4769b);
                return;
            case 1:
                ((m10) this.f4771d).f6587a.onClose((nv1) this.f4770c, (j51) this.f4769b);
                return;
            case 2:
                ox0 ox0Var = (ox0) this.f4771d;
                C0765is c0765is = ox0Var.f8570z;
                ri0 ri0Var = (ri0) this.f4770c;
                Executor executor = ox0Var.f8560p;
                EnumC0651fs enumC0651fs = (EnumC0651fs) this.f4769b;
                c0765is.getClass();
                p32.m5188s(executor, "executor");
                p32.m5188s(enumC0651fs, FirebaseAnalytics.Param.SOURCE);
                C0725hs c0725hs = new C0725hs(ri0Var, executor);
                if (((EnumC0651fs) c0765is.f5142a) != enumC0651fs) {
                    executor.execute(ri0Var);
                    return;
                } else {
                    ((ArrayList) c0765is.f5143b).add(c0725hs);
                    return;
                }
            case 3:
                EnumC0651fs enumC0651fs2 = (EnumC0651fs) this.f4769b;
                lu0 lu0Var = (lu0) this.f4770c;
                gx0 gx0Var = (gx0) this.f4771d;
                ox0 ox0Var2 = gx0Var.f4358t;
                if (gx0Var != ox0Var2.f8521F) {
                    return;
                }
                ox0Var2.f8522G = lu0Var;
                ox0Var2.f8528M.m5103f(lu0Var);
                if (enumC0651fs2 != EnumC0651fs.f3889e) {
                    gx0Var.f4358t.f8538W.mo2842H(2, "Entering {0} state with picker: {1}", enumC0651fs2, lu0Var);
                    gx0Var.f4358t.f8570z.m3482b(enumC0651fs2);
                    return;
                }
                return;
            case 4:
                try {
                    ((CountDownLatch) this.f4770c).await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                zi1 zi1Var = new zi1(new w91());
                try {
                    try {
                        y91 y91Var2 = (y91) this.f4771d;
                        zk0 zk0Var = y91Var2.f12887O;
                        if (zk0Var == null) {
                            socketM7053e = y91Var2.f12873A.createSocket(y91Var2.f12889a.getAddress(), ((y91) this.f4771d).f12889a.getPort());
                        } else {
                            SocketAddress socketAddress = zk0Var.f13448a;
                            if (!(socketAddress instanceof InetSocketAddress)) {
                                throw new pv1(nv1.f7558m.m4614g("Unsupported SocketAddress implementation " + ((y91) this.f4771d).f12887O.f13448a.getClass()));
                            }
                            socketM7053e = y91.m7053e(y91Var2, zk0Var.f13449b, (InetSocketAddress) socketAddress, zk0Var.f13450c, zk0Var.f13451d);
                        }
                        y91 y91Var3 = (y91) this.f4771d;
                        SSLSocketFactory sSLSocketFactory = y91Var3.f12874B;
                        Socket socket = socketM7053e;
                        if (sSLSocketFactory != null) {
                            String host = y91Var3.f12890b;
                            URI uriM6629a = vi0.m6629a(host);
                            if (uriM6629a.getHost() != null) {
                                host = uriM6629a.getHost();
                            }
                            SSLSocket sSLSocketM2563a = ea1.m2563a(sSLSocketFactory, socketM7053e, host, ((y91) this.f4771d).m7059k(), ((y91) this.f4771d).f12878F);
                            session = sSLSocketM2563a.getSession();
                            socket = sSLSocketM2563a;
                        }
                        socket.setTcpNoDelay(true);
                        zi1 zi1Var2 = new zi1(p32.m5172i0(socket));
                        try {
                            ((C0093bb) this.f4769b).m955c(p32.m5170h0(socket), socket);
                            y91 y91Var4 = (y91) this.f4771d;
                            C1437tb c1437tb = y91Var4.f12909u;
                            c1437tb.getClass();
                            C0558d8 c0558d8 = new C0558d8(c1437tb, 6);
                            c0558d8.m2261J(rc2.f9889b, socket.getRemoteSocketAddress());
                            c0558d8.m2261J(rc2.f9890c, socket.getLocalSocketAddress());
                            c0558d8.m2261J(rc2.f9891d, session);
                            c0558d8.m2261J(sc2.f10358b, session == null ? iq1.f5130a : iq1.f5131b);
                            y91Var4.f12909u = c0558d8.m2266g();
                            y91 y91Var5 = (y91) this.f4771d;
                            y91Var5.f12895g.getClass();
                            y91Var5.f12908t = new x91(y91Var5, new uk0(zi1Var2));
                            synchronized (((y91) this.f4771d).f12899k) {
                                try {
                                    ((y91) this.f4771d).f12875C = socket;
                                    if (session != null) {
                                        new qo0(session);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                                break;
                            }
                            return;
                        } catch (pv1 e) {
                            e = e;
                            zi1Var = zi1Var2;
                            ((y91) this.f4771d).m7065r(0, b70.INTERNAL_ERROR, e.f9179a);
                            y91Var = (y91) this.f4771d;
                            y91Var.f12895g.getClass();
                            x91Var = new x91(y91Var, new uk0(zi1Var));
                            y91Var.f12908t = x91Var;
                            return;
                        } catch (Exception e2) {
                            e = e2;
                            zi1Var = zi1Var2;
                            ((y91) this.f4771d).m7063o(e);
                            y91Var = (y91) this.f4771d;
                            y91Var.f12895g.getClass();
                            x91Var = new x91(y91Var, new uk0(zi1Var));
                            y91Var.f12908t = x91Var;
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            zi1Var = zi1Var2;
                            y91 y91Var6 = (y91) this.f4771d;
                            y91Var6.f12895g.getClass();
                            y91Var6.f12908t = new x91(y91Var6, new uk0(zi1Var));
                            throw th;
                        }
                    } catch (pv1 e3) {
                        e = e3;
                    } catch (Exception e4) {
                        e = e4;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                break;
            case 5:
                rb1 rb1Var = (rb1) this.f4771d;
                rb1Var.f9878r = Long.valueOf(rb1Var.f9875o.m1083f());
                for (jb1 jb1Var : ((HashMap) ((rb1) this.f4771d).f9872g.f5203b).values()) {
                    qo0 qo0Var = jb1Var.f5350c;
                    ((AtomicLong) qo0Var.f9548b).set(0L);
                    ((AtomicLong) qo0Var.f9549c).set(0L);
                    qo0 qo0Var2 = jb1Var.f5349b;
                    jb1Var.f5349b = jb1Var.f5350c;
                    jb1Var.f5350c = qo0Var2;
                }
                mb1 mb1Var2 = (mb1) this.f4770c;
                AbstractC1337qm abstractC1337qm = (AbstractC1337qm) this.f4769b;
                nm0 nm0VarM5566m = qm0.m5566m();
                if (mb1Var2.f6746e != null) {
                    nm0VarM5566m.m3901a(new kb1(mb1Var2, abstractC1337qm, 1));
                }
                if (mb1Var2.f6747f != null) {
                    nm0VarM5566m.m3901a(new kb1(mb1Var2, abstractC1337qm, 0));
                }
                om0 om0VarListIterator = nm0VarM5566m.m4561g().listIterator(0);
                while (om0VarListIterator.hasNext()) {
                    kb1 kb1Var = (kb1) om0VarListIterator.next();
                    rb1 rb1Var2 = (rb1) this.f4771d;
                    C0771iz c0771iz = rb1Var2.f9872g;
                    long jLongValue = rb1Var2.f9878r.longValue();
                    switch (kb1Var.f5736a) {
                        case 0:
                            om0Var = om0VarListIterator;
                            mb1 mb1Var3 = kb1Var.f5737b;
                            ArrayList arrayListM5759s = rb1.m5759s(c0771iz, mb1Var3.f6747f.f6304d.intValue());
                            int size = arrayListM5759s.size();
                            lb1 lb1Var = mb1Var3.f6747f;
                            if (size >= lb1Var.f6303c.intValue() && arrayListM5759s.size() != 0) {
                                int size2 = arrayListM5759s.size();
                                int i2 = 0;
                                while (i2 < size2) {
                                    Object obj = arrayListM5759s.get(i2);
                                    i2++;
                                    jb1 jb1Var2 = (jb1) obj;
                                    if (c0771iz.m3503d() >= mb1Var3.f6745d.intValue()) {
                                    }
                                    if (jb1Var2.m3589c() >= lb1Var.f6304d.intValue()) {
                                        ArrayList arrayList = arrayListM5759s;
                                        int i3 = size2;
                                        if (((AtomicLong) jb1Var2.f5350c.f9549c).get() / jb1Var2.m3589c() > ((double) lb1Var.f6301a.intValue()) / 100.0d) {
                                            kb1Var.f5738c.mo2842H(1, "FailurePercentage algorithm detected outlier: {0}, failureRate={1}", jb1Var2, Double.valueOf(((AtomicLong) jb1Var2.f5350c.f9549c).get() / jb1Var2.m3589c()));
                                            if (new Random().nextInt(100) < lb1Var.f6302b.intValue()) {
                                                jb1Var2.m3588b(jLongValue);
                                            }
                                        }
                                        arrayListM5759s = arrayList;
                                        size2 = i3;
                                    }
                                    break;
                                }
                            }
                            break;
                        default:
                            mb1 mb1Var4 = kb1Var.f5737b;
                            ArrayList arrayListM5759s2 = rb1.m5759s(c0771iz, mb1Var4.f6746e.f6304d.intValue());
                            int size3 = arrayListM5759s2.size();
                            lb1 lb1Var2 = mb1Var4.f6746e;
                            if (size3 < lb1Var2.f6303c.intValue() || arrayListM5759s2.size() == 0) {
                                om0Var = om0VarListIterator;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            int size4 = arrayListM5759s2.size();
                            for (Object r14 = z; r14 < size4; r14++) {
                                r10 = arrayListM5759s2;
                                jb1 jb1Var3 = (jb1) r10.get(r14);
                                arrayList2.add(Double.valueOf(((AtomicLong) jb1Var3.f5350c.f9548b).get() / jb1Var3.m3589c()));
                                r10 = r10;
                            }
                            r10 = arrayListM5759s2;
                            Object r16 = r10;
                            int size5 = arrayList2.size();
                            double d2 = 0.0d;
                            double dDoubleValue = 0.0d;
                            int i4 = 0;
                            while (i4 < size5) {
                                Object obj2 = arrayList2.get(i4);
                                i4++;
                                dDoubleValue = ((Double) obj2).doubleValue() + dDoubleValue;
                            }
                            double size6 = dDoubleValue / ((double) arrayList2.size());
                            int size7 = arrayList2.size();
                            int i5 = 0;
                            while (i5 < size7) {
                                Object obj3 = arrayList2.get(i5);
                                i5++;
                                double dDoubleValue2 = ((Double) obj3).doubleValue() - size6;
                                d2 = (dDoubleValue2 * dDoubleValue2) + d2;
                            }
                            double dSqrt = Math.sqrt(d2 / ((double) arrayList2.size()));
                            double dIntValue = size6 - (((double) (lb1Var2.f6301a.intValue() / 1000.0f)) * dSqrt);
                            int size8 = r16.size();
                            int i6 = 0;
                            Object r17 = r16;
                            while (true) {
                                if (i6 >= size8) {
                                    om0Var = om0VarListIterator;
                                }
                                om0Var = om0VarListIterator;
                                Object r0 = r17;
                                Object obj4 = r0.get(i6);
                                i6++;
                                jb1 jb1Var4 = (jb1) obj4;
                                double d3 = dSqrt;
                                if (c0771iz.m3503d() >= mb1Var4.f6745d.intValue()) {
                                }
                                if (((AtomicLong) jb1Var4.f5350c.f9548b).get() / jb1Var4.m3589c() < dIntValue) {
                                    mb1Var = mb1Var4;
                                    d = dIntValue;
                                    i = size8;
                                    kb1Var.f5738c.mo2842H(1, "SuccessRate algorithm detected outlier: {0}. Parameters: successRate={1}, mean={2}, stdev={3}, requiredSuccessRate={4}", jb1Var4, Double.valueOf(((AtomicLong) jb1Var4.f5350c.f9548b).get() / jb1Var4.m3589c()), Double.valueOf(size6), Double.valueOf(d3), Double.valueOf(d));
                                    if (new Random().nextInt(100) < lb1Var2.f6302b.intValue()) {
                                        jb1Var4.m3588b(jLongValue);
                                    }
                                } else {
                                    mb1Var = mb1Var4;
                                    d = dIntValue;
                                    i = size8;
                                }
                                mb1Var4 = mb1Var;
                                om0VarListIterator = om0Var;
                                r17 = r0;
                                dIntValue = d;
                                dSqrt = d3;
                                size8 = i;
                                break;
                                break;
                            }
                            break;
                            break;
                    }
                    om0VarListIterator = om0Var;
                    z = false;
                }
                rb1 rb1Var3 = (rb1) this.f4771d;
                C0771iz c0771iz2 = rb1Var3.f9872g;
                Long l = rb1Var3.f9878r;
                for (jb1 jb1Var5 : ((HashMap) c0771iz2.f5203b).values()) {
                    if (!jb1Var5.m3590d()) {
                        int i7 = jb1Var5.f5352e;
                        jb1Var5.f5352e = i7 == 0 ? 0 : i7 - 1;
                    }
                    if (jb1Var5.m3590d()) {
                        if (l.longValue() > Math.min(jb1Var5.f5348a.f6743b.longValue() * ((long) jb1Var5.f5352e), Math.max(jb1Var5.f5348a.f6743b.longValue(), jb1Var5.f5348a.f6744c.longValue())) + jb1Var5.f5351d.longValue()) {
                            jb1Var5.m3591e();
                        }
                    }
                }
                return;
            case 6:
                try {
                    objCall = ((pd0) this.f4770c).call();
                    break;
                } catch (Exception unused2) {
                }
                ((Handler) this.f4771d).post(new RunnableC1466u3((qd0) this.f4769b, objCall, 28, z));
                return;
            case 7:
                ((ry1) this.f4771d).execute((qy1) this.f4770c);
                return;
            default:
                ia2.m3407h((View) this.f4770c, (fa2) this.f4769b);
                ((ValueAnimator) this.f4771d).start();
                return;
        }
    }

    public String toString() {
        switch (this.f4768a) {
            case 7:
                return ((Runnable) this.f4769b).toString() + "(scheduled in SynchronizationContext)";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ i10(Object obj, Object obj2, Object obj3, int i) {
        this.f4768a = i;
        this.f4771d = obj;
        this.f4770c = obj2;
        this.f4769b = obj3;
    }

    public /* synthetic */ i10() {
        this.f4768a = 6;
    }
}

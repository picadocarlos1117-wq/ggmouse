package p000;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class gp0 implements uo0 {

    /* JADX INFO: renamed from: a */
    public final vo0 f4261a;

    /* JADX INFO: renamed from: b */
    public final String f4262b;

    /* JADX INFO: renamed from: c */
    public final bz1 f4263c;

    /* JADX INFO: renamed from: d */
    public final qo0 f4264d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1561wo f4265e;

    /* JADX INFO: renamed from: f */
    public final ScheduledExecutorService f4266f;

    /* JADX INFO: renamed from: g */
    public final ro0 f4267g;

    /* JADX INFO: renamed from: h */
    public final C0599ed f4268h;

    /* JADX INFO: renamed from: i */
    public final AbstractC1337qm f4269i;

    /* JADX INFO: renamed from: j */
    public final List f4270j;

    /* JADX INFO: renamed from: k */
    public final ry1 f4271k;

    /* JADX INFO: renamed from: l */
    public final dp0 f4272l;

    /* JADX INFO: renamed from: m */
    public volatile List f4273m;

    /* JADX INFO: renamed from: n */
    public p80 f4274n;

    /* JADX INFO: renamed from: o */
    public final sv1 f4275o;

    /* JADX INFO: renamed from: p */
    public qo0 f4276p;

    /* JADX INFO: renamed from: q */
    public qo0 f4277q;

    /* JADX INFO: renamed from: r */
    public yx0 f4278r;

    /* JADX INFO: renamed from: u */
    public cp0 f4281u;

    /* JADX INFO: renamed from: v */
    public volatile cp0 f4282v;

    /* JADX INFO: renamed from: x */
    public nv1 f4284x;

    /* JADX INFO: renamed from: s */
    public final ArrayList f4279s = new ArrayList();

    /* JADX INFO: renamed from: t */
    public final yo0 f4280t = new yo0(this, 0);

    /* JADX INFO: renamed from: w */
    public volatile C0688gs f4283w = C0688gs.m3052a(EnumC0651fs.f3888d);

    public gp0(List list, String str, bz1 bz1Var, C1631yk c1631yk, ScheduledExecutorService scheduledExecutorService, ey1 ey1Var, ry1 ry1Var, qo0 qo0Var, ro0 ro0Var, C0599ed c0599ed, C1485um c1485um, vo0 vo0Var, AbstractC1337qm abstractC1337qm, ArrayList arrayList) {
        p32.m5188s(list, "addressGroups");
        p32.m5177l(!list.isEmpty(), "addressGroups is empty");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p32.m5188s(it.next(), "addressGroups contains null entry");
        }
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f4273m = listUnmodifiableList;
        dp0 dp0Var = new dp0();
        dp0Var.f2989a = listUnmodifiableList;
        this.f4272l = dp0Var;
        this.f4262b = str;
        this.f4263c = bz1Var;
        this.f4265e = c1631yk;
        this.f4266f = scheduledExecutorService;
        this.f4275o = (sv1) ey1Var.get();
        this.f4271k = ry1Var;
        this.f4264d = qo0Var;
        this.f4267g = ro0Var;
        this.f4268h = c0599ed;
        p32.m5188s(c1485um, "channelTracer");
        p32.m5188s(vo0Var, "logId");
        this.f4261a = vo0Var;
        p32.m5188s(abstractC1337qm, "channelLogger");
        this.f4269i = abstractC1337qm;
        this.f4270j = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static void m3031a(gp0 gp0Var, EnumC0651fs enumC0651fs) {
        gp0Var.f4271k.m5930d();
        gp0Var.m3034f(C0688gs.m3052a(enumC0651fs));
    }

    /* JADX INFO: renamed from: e */
    public static void m3032e(gp0 gp0Var) {
        SocketAddress socketAddress;
        zk0 zk0Var;
        dp0 dp0Var = gp0Var.f4272l;
        ry1 ry1Var = gp0Var.f4271k;
        ry1Var.m5930d();
        p32.m5193x(gp0Var.f4276p == null, "Should have no reconnectTask scheduled");
        if (dp0Var.f2990b == 0 && dp0Var.f2991c == 0) {
            sv1 sv1Var = gp0Var.f4275o;
            sv1Var.f10565a = false;
            sv1Var.m6142b();
        }
        SocketAddress socketAddress2 = (SocketAddress) ((a70) dp0Var.f2989a.get(dp0Var.f2990b)).f81a.get(dp0Var.f2991c);
        if (socketAddress2 instanceof zk0) {
            zk0Var = (zk0) socketAddress2;
            socketAddress = zk0Var.f13449b;
        } else {
            socketAddress = socketAddress2;
            zk0Var = null;
        }
        C1437tb c1437tb = ((a70) dp0Var.f2989a.get(dp0Var.f2990b)).f82b;
        String str = (String) c1437tb.f10817a.get(a70.f80d);
        C1524vo c1524vo = new C1524vo();
        c1524vo.f11725a = "unknown-authority";
        c1524vo.f11726b = C1437tb.f10816b;
        if (str == null) {
            str = gp0Var.f4262b;
        }
        p32.m5188s(str, "authority");
        c1524vo.f11725a = str;
        c1524vo.f11726b = c1437tb;
        c1524vo.f11727c = zk0Var;
        fp0 fp0Var = new fp0();
        fp0Var.f3877h = gp0Var.f4261a;
        cp0 cp0Var = new cp0(gp0Var.f4265e.mo5746u(socketAddress, c1524vo, fp0Var), gp0Var.f4268h);
        fp0Var.f3877h = cp0Var.mo2579g();
        gp0Var.f4281u = cp0Var;
        gp0Var.f4279s.add(cp0Var);
        Runnable runnableMo2578c = cp0Var.mo2578c(new C1548wb(gp0Var, cp0Var));
        if (runnableMo2578c != null) {
            ry1Var.m5928b(runnableMo2578c);
        }
        gp0Var.f4269i.mo2842H(2, "Started transport {0}", fp0Var.f3877h);
    }

    /* JADX INFO: renamed from: i */
    public static String m3033i(nv1 nv1Var) {
        StringBuilder sb = new StringBuilder();
        mv1 mv1Var = nv1Var.f7562a;
        Throwable th = nv1Var.f7564c;
        sb.append(mv1Var);
        String str = nv1Var.f7563b;
        if (str != null) {
            sb.append("(");
            sb.append(str);
            sb.append(")");
        }
        if (th != null) {
            sb.append("[");
            sb.append(th);
            sb.append("]");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public final void m3034f(C0688gs c0688gs) {
        this.f4271k.m5930d();
        if (this.f4283w.f4304a != c0688gs.f4304a) {
            p32.m5193x(this.f4283w.f4304a != EnumC0651fs.f3889e, "Cannot transition out of SHUTDOWN to " + c0688gs);
            this.f4283w = c0688gs;
            ((mu0) this.f4264d.f9548b).mo1228a(c0688gs);
        }
    }

    @Override // p000.uo0
    /* JADX INFO: renamed from: g */
    public final vo0 mo2579g() {
        return this.f4261a;
    }

    public final String toString() {
        C1679zv c1679zvM5176k0 = p32.m5176k0(this);
        c1679zvM5176k0.m7360b("logId", this.f4261a.f11731c);
        c1679zvM5176k0.m7359a(this.f4273m, "addressGroups");
        return c1679zvM5176k0.toString();
    }
}

package p000;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class rb1 extends nu0 {

    /* JADX INFO: renamed from: t */
    public static final C1400sb f9871t = new C1400sb("addressTrackerKey");

    /* JADX INFO: renamed from: g */
    public final C0771iz f9872g;

    /* JADX INFO: renamed from: m */
    public final ry1 f9873m;

    /* JADX INFO: renamed from: n */
    public final oi0 f9874n;

    /* JADX INFO: renamed from: o */
    public final bz1 f9875o;

    /* JADX INFO: renamed from: p */
    public final ScheduledExecutorService f9876p;

    /* JADX INFO: renamed from: q */
    public qo0 f9877q;

    /* JADX INFO: renamed from: r */
    public Long f9878r;

    /* JADX INFO: renamed from: s */
    public final AbstractC1337qm f9879s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb1(hp0 hp0Var) {
        super(0);
        bz1 bz1Var = bz1.f1582g;
        AbstractC1337qm abstractC1337qmMo3072u = hp0Var.mo3072u();
        this.f9879s = abstractC1337qmMo3072u;
        this.f9874n = new oi0(new ni0(this, hp0Var));
        this.f9872g = new C0771iz();
        ry1 ry1VarMo3070A = hp0Var.mo3070A();
        p32.m5188s(ry1VarMo3070A, "syncContext");
        this.f9873m = ry1VarMo3070A;
        ScheduledExecutorService scheduledExecutorServiceMo3073z = hp0Var.mo3073z();
        p32.m5188s(scheduledExecutorServiceMo3073z, "timeService");
        this.f9876p = scheduledExecutorServiceMo3073z;
        this.f9875o = bz1Var;
        abstractC1337qmMo3072u.mo2841G(1, "OutlierDetection lb created.");
    }

    /* JADX INFO: renamed from: r */
    public static boolean m5758r(List list) {
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((a70) it.next()).f81a.size();
            if (size > 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: s */
    public static ArrayList m5759s(C0771iz c0771iz, int i) {
        ArrayList arrayList = new ArrayList();
        for (jb1 jb1Var : c0771iz.values()) {
            if (jb1Var.m3589c() >= i) {
                arrayList.add(jb1Var);
            }
        }
        return arrayList;
    }

    @Override // p000.nu0
    /* JADX INFO: renamed from: a */
    public final nv1 mo1258a(ku0 ku0Var) {
        oi0 oi0Var = this.f9874n;
        C0771iz c0771iz = this.f9872g;
        AbstractC1337qm abstractC1337qm = this.f9879s;
        abstractC1337qm.mo2842H(1, "Received resolution result: {0}", ku0Var);
        mb1 mb1Var = (mb1) ku0Var.f6024c;
        ArrayList arrayList = new ArrayList();
        Iterator it = ku0Var.f6022a.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((a70) it.next()).f81a);
        }
        c0771iz.keySet().retainAll(arrayList);
        Iterator it2 = ((HashMap) c0771iz.f5203b).values().iterator();
        while (it2.hasNext()) {
            ((jb1) it2.next()).f5348a = mb1Var;
        }
        HashMap map = (HashMap) c0771iz.f5203b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            SocketAddress socketAddress = (SocketAddress) obj;
            if (!map.containsKey(socketAddress)) {
                map.put(socketAddress, new jb1(mb1Var));
            }
        }
        gr1 gr1Var = mb1Var.f6748g;
        Long l = mb1Var.f6742a;
        oi0Var.m4805t(gr1Var.f4302a);
        if (mb1Var.f6746e == null && mb1Var.f6747f == null) {
            qo0 qo0Var = this.f9877q;
            if (qo0Var != null) {
                qo0Var.m5579B();
                this.f9878r = null;
                for (jb1 jb1Var : ((HashMap) c0771iz.f5203b).values()) {
                    if (jb1Var.m3590d()) {
                        jb1Var.m3591e();
                    }
                    jb1Var.f5352e = 0;
                }
            }
        } else {
            Long lValueOf = this.f9878r == null ? l : Long.valueOf(Math.max(0L, l.longValue() - (this.f9875o.m1083f() - this.f9878r.longValue())));
            qo0 qo0Var2 = this.f9877q;
            if (qo0Var2 != null) {
                qo0Var2.m5579B();
                for (jb1 jb1Var2 : ((HashMap) c0771iz.f5203b).values()) {
                    qo0 qo0Var3 = jb1Var2.f5349b;
                    ((AtomicLong) qo0Var3.f9548b).set(0L);
                    ((AtomicLong) qo0Var3.f9549c).set(0L);
                    qo0 qo0Var4 = jb1Var2.f5350c;
                    ((AtomicLong) qo0Var4.f9548b).set(0L);
                    ((AtomicLong) qo0Var4.f9549c).set(0L);
                }
            }
            ry1 ry1Var = this.f9873m;
            i10 i10Var = new i10(this, mb1Var, abstractC1337qm, 5);
            long jLongValue = lValueOf.longValue();
            long jLongValue2 = l.longValue();
            ScheduledExecutorService scheduledExecutorService = this.f9876p;
            ry1Var.getClass();
            qy1 qy1Var = new qy1(i10Var);
            this.f9877q = new qo0(qy1Var, scheduledExecutorService.scheduleWithFixedDelay(new py1(ry1Var, qy1Var, i10Var, jLongValue2), jLongValue, jLongValue2, TimeUnit.NANOSECONDS));
        }
        C1437tb c1437tb = C1437tb.f10816b;
        oi0Var.mo2958o(new ku0(ku0Var.f6022a, ku0Var.f6023b, mb1Var.f6748g.f4303b));
        return nv1.f7550e;
    }

    @Override // p000.nu0
    /* JADX INFO: renamed from: n */
    public final void mo1259n(nv1 nv1Var) {
        this.f9874n.mo1259n(nv1Var);
    }

    @Override // p000.nu0
    /* JADX INFO: renamed from: q */
    public final void mo1260q() {
        this.f9874n.mo1260q();
    }
}

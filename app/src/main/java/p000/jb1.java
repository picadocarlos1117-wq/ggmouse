package p000;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class jb1 {

    /* JADX INFO: renamed from: a */
    public mb1 f5348a;

    /* JADX INFO: renamed from: d */
    public Long f5351d;

    /* JADX INFO: renamed from: e */
    public int f5352e;

    /* JADX INFO: renamed from: b */
    public volatile qo0 f5349b = new qo0(11);

    /* JADX INFO: renamed from: c */
    public qo0 f5350c = new qo0(11);

    /* JADX INFO: renamed from: f */
    public final HashSet f5353f = new HashSet();

    public jb1(mb1 mb1Var) {
        this.f5348a = mb1Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m3587a(qb1 qb1Var) {
        if (m3590d() && !qb1Var.f9472k) {
            qb1Var.m5463D0();
        } else if (!m3590d() && qb1Var.f9472k) {
            qb1Var.f9472k = false;
            C0688gs c0688gs = qb1Var.f9473l;
            if (c0688gs != null) {
                qb1Var.f9474m.mo1228a(c0688gs);
                qb1Var.f9475n.mo2842H(2, "Subchannel unejected: {0}", qb1Var);
            }
        }
        qb1Var.f9471j = this;
        this.f5353f.add(qb1Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m3588b(long j) {
        this.f5351d = Long.valueOf(j);
        this.f5352e++;
        Iterator it = this.f5353f.iterator();
        while (it.hasNext()) {
            ((qb1) it.next()).m5463D0();
        }
    }

    /* JADX INFO: renamed from: c */
    public final long m3589c() {
        return ((AtomicLong) this.f5350c.f9549c).get() + ((AtomicLong) this.f5350c.f9548b).get();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3590d() {
        return this.f5351d != null;
    }

    /* JADX INFO: renamed from: e */
    public final void m3591e() {
        p32.m5193x(this.f5351d != null, "not currently ejected");
        this.f5351d = null;
        for (qb1 qb1Var : this.f5353f) {
            qb1Var.f9472k = false;
            C0688gs c0688gs = qb1Var.f9473l;
            if (c0688gs != null) {
                qb1Var.f9474m.mo1228a(c0688gs);
                qb1Var.f9475n.mo2842H(2, "Subchannel unejected: {0}", qb1Var);
            }
        }
    }

    public final String toString() {
        return "AddressTracker{subchannels=" + this.f5353f + '}';
    }
}

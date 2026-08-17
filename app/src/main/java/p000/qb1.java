package p000;

import java.lang.reflect.Array;
import java.net.SocketAddress;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class qb1 extends le0 {

    /* JADX INFO: renamed from: i */
    public final o21 f9470i;

    /* JADX INFO: renamed from: j */
    public jb1 f9471j;

    /* JADX INFO: renamed from: k */
    public boolean f9472k;

    /* JADX INFO: renamed from: l */
    public C0688gs f9473l;

    /* JADX INFO: renamed from: m */
    public mu0 f9474m;

    /* JADX INFO: renamed from: n */
    public final AbstractC1337qm f9475n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ rb1 f9476o;

    public qb1(rb1 rb1Var, iu0 iu0Var, ek0 ek0Var) {
        this.f9476o = rb1Var;
        mu0 mu0Var = (mu0) iu0Var.m3492b();
        if (mu0Var != null) {
            this.f9474m = mu0Var;
            ck0 ck0Var = new ck0(1, this, mu0Var);
            iu0 iu0VarM3490c = iu0.m3490c();
            iu0VarM3490c.m3493d(iu0Var.f5160b);
            C1437tb c1437tb = iu0Var.f5161c;
            p32.m5188s(c1437tb, "attrs");
            iu0VarM3490c.f5161c = c1437tb;
            Object[][] objArr = iu0Var.f5162d;
            Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length, 2);
            iu0VarM3490c.f5162d = objArr2;
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            iu0VarM3490c.m3491a(ck0Var);
            this.f9470i = ek0Var.mo2597m(new iu0(iu0VarM3490c.f5160b, iu0VarM3490c.f5161c, iu0VarM3490c.f5162d));
        } else {
            this.f9470i = ek0Var.mo2597m(iu0Var);
        }
        this.f9475n = this.f9470i.mo4184F();
    }

    @Override // p000.le0
    /* JADX INFO: renamed from: C0 */
    public final o21 mo2365C0() {
        return this.f9470i;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m5463D0() {
        this.f9472k = true;
        mu0 mu0Var = this.f9474m;
        nv1 nv1Var = nv1.f7559n;
        p32.m5177l(true ^ nv1Var.m4612e(), "The error status must not be OK");
        mu0Var.mo1228a(new C0688gs(EnumC0651fs.f3887c, nv1Var));
        this.f9475n.mo2842H(2, "Subchannel ejected: {0}", this);
    }

    @Override // p000.o21
    public final C1437tb getAttributes() {
        jb1 jb1Var = this.f9471j;
        o21 o21Var = this.f9470i;
        if (jb1Var == null) {
            return o21Var.getAttributes();
        }
        C1437tb attributes = o21Var.getAttributes();
        attributes.getClass();
        jb1 jb1Var2 = this.f9471j;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(rb1.f9871t, jb1Var2);
        for (Map.Entry entry : attributes.f10817a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((C1400sb) entry.getKey(), entry.getValue());
            }
        }
        return new C1437tb(identityHashMap);
    }

    @Override // p000.le0, p000.o21
    /* JADX INFO: renamed from: r0 */
    public final void mo4187r0() {
        jb1 jb1Var = this.f9471j;
        if (jb1Var != null) {
            this.f9471j = null;
            jb1Var.f5353f.remove(this);
        }
        super.mo4187r0();
    }

    @Override // p000.le0
    public final String toString() {
        return "OutlierDetectionSubchannel{addresses=" + this.f9470i.mo4183E() + '}';
    }

    @Override // p000.o21
    /* JADX INFO: renamed from: u0 */
    public final void mo2366u0(mu0 mu0Var) {
        if (this.f9474m != null) {
            mo2365C0().mo2366u0(mu0Var);
            return;
        }
        this.f9474m = mu0Var;
        mo2365C0().mo2366u0(new ck0(1, this, mu0Var));
    }

    @Override // p000.le0, p000.o21
    /* JADX INFO: renamed from: z0 */
    public final void mo4188z0(List list) {
        rb1 rb1Var = this.f9476o;
        if (rb1.m5758r(mo4183E()) && rb1.m5758r(list)) {
            if (rb1Var.f9872g.containsValue(this.f9471j)) {
                jb1 jb1Var = this.f9471j;
                jb1Var.getClass();
                this.f9471j = null;
                jb1Var.f5353f.remove(this);
            }
            SocketAddress socketAddress = (SocketAddress) ((a70) list.get(0)).f81a.get(0);
            if (rb1Var.f9872g.containsKey(socketAddress)) {
                ((jb1) rb1Var.f9872g.get(socketAddress)).m3587a(this);
            }
        } else if (!rb1.m5758r(mo4183E()) || rb1.m5758r(list)) {
            if (!rb1.m5758r(mo4183E()) && rb1.m5758r(list)) {
                SocketAddress socketAddress2 = (SocketAddress) ((a70) list.get(0)).f81a.get(0);
                if (rb1Var.f9872g.containsKey(socketAddress2)) {
                    ((jb1) rb1Var.f9872g.get(socketAddress2)).m3587a(this);
                }
            }
        } else if (rb1Var.f9872g.containsKey(m4693D().f81a.get(0))) {
            jb1 jb1Var2 = (jb1) rb1Var.f9872g.get(m4693D().f81a.get(0));
            jb1Var2.getClass();
            this.f9471j = null;
            jb1Var2.f5353f.remove(this);
            qo0 qo0Var = jb1Var2.f5349b;
            ((AtomicLong) qo0Var.f9548b).set(0L);
            ((AtomicLong) qo0Var.f9549c).set(0L);
            qo0 qo0Var2 = jb1Var2.f5350c;
            ((AtomicLong) qo0Var2.f9548b).set(0L);
            ((AtomicLong) qo0Var2.f9549c).set(0L);
        }
        this.f9470i.mo4188z0(list);
    }
}

package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class p10 implements yx0 {

    /* JADX INFO: renamed from: c */
    public final Executor f8614c;

    /* JADX INFO: renamed from: d */
    public final ry1 f8615d;

    /* JADX INFO: renamed from: e */
    public n10 f8616e;

    /* JADX INFO: renamed from: f */
    public n10 f8617f;

    /* JADX INFO: renamed from: g */
    public n10 f8618g;

    /* JADX INFO: renamed from: h */
    public pn0 f8619h;

    /* JADX INFO: renamed from: j */
    public nv1 f8621j;

    /* JADX INFO: renamed from: k */
    public lu0 f8622k;

    /* JADX INFO: renamed from: l */
    public long f8623l;

    /* JADX INFO: renamed from: a */
    public final vo0 f8612a = vo0.m6645a(p10.class, null);

    /* JADX INFO: renamed from: b */
    public final Object f8613b = new Object();

    /* JADX INFO: renamed from: i */
    public Collection f8620i = new LinkedHashSet();

    public p10(Executor executor, ry1 ry1Var) {
        this.f8614c = executor;
        this.f8615d = ry1Var;
    }

    /* JADX INFO: renamed from: a */
    public final o10 m5101a(yc1 yc1Var, rc2[] rc2VarArr) {
        int size;
        o10 o10Var = new o10(this, yc1Var, rc2VarArr);
        this.f8620i.add(o10Var);
        synchronized (this.f8613b) {
            size = this.f8620i.size();
        }
        if (size == 1) {
            this.f8615d.m5928b(this.f8616e);
        }
        for (rc2 rc2Var : rc2VarArr) {
            rc2Var.mo4526o();
        }
        return o10Var;
    }

    @Override // p000.yx0
    /* JADX INFO: renamed from: b */
    public final void mo2577b(nv1 nv1Var) {
        Collection<o10> collection;
        n10 n10Var;
        mo2580h(nv1Var);
        synchronized (this.f8613b) {
            try {
                collection = this.f8620i;
                n10Var = this.f8618g;
                this.f8618g = null;
                if (!collection.isEmpty()) {
                    this.f8620i = Collections.EMPTY_LIST;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (n10Var != null) {
            for (o10 o10Var : collection) {
                r10 r10VarM6180s = o10Var.m6180s(new f90(nv1Var, EnumC1376ro.f10080b, o10Var.f7607l));
                if (r10VarM6180s != null) {
                    r10VarM6180s.run();
                }
            }
            this.f8615d.execute(n10Var);
        }
    }

    @Override // p000.yx0
    /* JADX INFO: renamed from: c */
    public final Runnable mo2578c(xx0 xx0Var) {
        pn0 pn0Var = (pn0) xx0Var;
        this.f8619h = pn0Var;
        this.f8616e = new n10(pn0Var, 0);
        this.f8617f = new n10(pn0Var, 1);
        this.f8618g = new n10(pn0Var, 2);
        return null;
    }

    @Override // p000.InterfaceC1487uo
    /* JADX INFO: renamed from: d */
    public final InterfaceC1339qo mo2110d(u51 u51Var, j51 j51Var, C0022al c0022al, rc2[] rc2VarArr) {
        InterfaceC1339qo f90Var;
        try {
            yc1 yc1Var = new yc1(u51Var, j51Var, c0022al);
            lu0 lu0Var = null;
            long j = -1;
            while (true) {
                synchronized (this.f8613b) {
                    nv1 nv1Var = this.f8621j;
                    if (nv1Var == null) {
                        lu0 lu0Var2 = this.f8622k;
                        if (lu0Var2 != null) {
                            if (lu0Var != null && j == this.f8623l) {
                                f90Var = m5101a(yc1Var, rc2VarArr);
                                break;
                            }
                            j = this.f8623l;
                            InterfaceC1487uo interfaceC1487uoM6634f = vi0.m6634f(lu0Var2.mo200a(yc1Var), Boolean.TRUE.equals(c0022al.f263f));
                            if (interfaceC1487uoM6634f != null) {
                                f90Var = interfaceC1487uoM6634f.mo2110d(yc1Var.f12953c, yc1Var.f12952b, yc1Var.f12951a, rc2VarArr);
                                break;
                            }
                            lu0Var = lu0Var2;
                        } else {
                            f90Var = m5101a(yc1Var, rc2VarArr);
                            break;
                        }
                    } else {
                        f90Var = new f90(nv1Var, EnumC1376ro.f10079a, rc2VarArr);
                        break;
                    }
                }
            }
            this.f8615d.m5927a();
            return f90Var;
        } catch (Throwable th) {
            this.f8615d.m5927a();
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m5102e() {
        boolean z;
        synchronized (this.f8613b) {
            z = !this.f8620i.isEmpty();
        }
        return z;
    }

    /* JADX INFO: renamed from: f */
    public final void m5103f(lu0 lu0Var) {
        n10 n10Var;
        synchronized (this.f8613b) {
            this.f8622k = lu0Var;
            this.f8623l++;
            if (lu0Var != null && m5102e()) {
                ArrayList arrayList = new ArrayList(this.f8620i);
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    o10 o10Var = (o10) obj;
                    ju0 ju0VarMo200a = lu0Var.mo200a(o10Var.f7605j);
                    C0022al c0022al = o10Var.f7605j.f12951a;
                    InterfaceC1487uo interfaceC1487uoM6634f = vi0.m6634f(ju0VarMo200a, Boolean.TRUE.equals(c0022al.f263f));
                    if (interfaceC1487uoM6634f != null) {
                        Executor executor = this.f8614c;
                        Executor executor2 = c0022al.f259b;
                        if (executor2 != null) {
                            executor = executor2;
                        }
                        C1307pt c1307pt = o10Var.f7606k;
                        C1307pt c1307ptM5326a = c1307pt.m5326a();
                        try {
                            yc1 yc1Var = o10Var.f7605j;
                            InterfaceC1339qo interfaceC1339qoMo2110d = interfaceC1487uoM6634f.mo2110d(yc1Var.f12953c, yc1Var.f12952b, yc1Var.f12951a, o10Var.f7607l);
                            c1307pt.m5327c(c1307ptM5326a);
                            r10 r10VarM6180s = o10Var.m6180s(interfaceC1339qoMo2110d);
                            if (r10VarM6180s != null) {
                                executor.execute(r10VarM6180s);
                            }
                            arrayList2.add(o10Var);
                        } catch (Throwable th) {
                            c1307pt.m5327c(c1307ptM5326a);
                            throw th;
                        }
                    }
                }
                synchronized (this.f8613b) {
                    try {
                        if (m5102e()) {
                            this.f8620i.removeAll(arrayList2);
                            if (this.f8620i.isEmpty()) {
                                this.f8620i = new LinkedHashSet();
                            }
                            if (!m5102e()) {
                                this.f8615d.m5928b(this.f8617f);
                                if (this.f8621j != null && (n10Var = this.f8618g) != null) {
                                    this.f8615d.m5928b(n10Var);
                                    this.f8618g = null;
                                }
                            }
                            this.f8615d.m5927a();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    @Override // p000.uo0
    /* JADX INFO: renamed from: g */
    public final vo0 mo2579g() {
        return this.f8612a;
    }

    @Override // p000.yx0
    /* JADX INFO: renamed from: h */
    public final void mo2580h(nv1 nv1Var) {
        n10 n10Var;
        synchronized (this.f8613b) {
            try {
                if (this.f8621j != null) {
                    return;
                }
                this.f8621j = nv1Var;
                this.f8615d.m5928b(new RunnableC1466u3(11, this, nv1Var));
                if (!m5102e() && (n10Var = this.f8618g) != null) {
                    this.f8615d.m5928b(n10Var);
                    this.f8618g = null;
                }
                this.f8615d.m5927a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package p000;

import android.sun.security.x509.CRLReasonCodeExtension;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class t10 implements InterfaceC1339qo {

    /* JADX INFO: renamed from: a */
    public volatile boolean f10695a;

    /* JADX INFO: renamed from: b */
    public InterfaceC1413so f10696b;

    /* JADX INFO: renamed from: c */
    public InterfaceC1339qo f10697c;

    /* JADX INFO: renamed from: d */
    public nv1 f10698d;

    /* JADX INFO: renamed from: f */
    public s10 f10700f;

    /* JADX INFO: renamed from: g */
    public long f10701g;

    /* JADX INFO: renamed from: h */
    public long f10702h;

    /* JADX INFO: renamed from: e */
    public List f10699e = new ArrayList();

    /* JADX INFO: renamed from: i */
    public ArrayList f10703i = new ArrayList();

    @Override // p000.uv1
    /* JADX INFO: renamed from: a */
    public final void mo1025a(boolean z) {
        p32.m5193x(this.f10696b != null, "May only be called after start");
        if (this.f10695a) {
            this.f10697c.mo1025a(z);
        } else {
            m6177o(new RunnableC1175oa(z, 2, this));
        }
    }

    @Override // p000.uv1
    /* JADX INFO: renamed from: b */
    public final boolean mo1026b() {
        if (this.f10695a) {
            return this.f10697c.mo1026b();
        }
        return false;
    }

    @Override // p000.uv1
    /* JADX INFO: renamed from: c */
    public final void mo1027c(k50 k50Var) {
        p32.m5193x(this.f10696b == null, "May only be called before start");
        this.f10703i.add(new RunnableC1466u3(12, this, k50Var));
    }

    @Override // p000.InterfaceC1339qo
    /* JADX INFO: renamed from: d */
    public final void mo1028d(int i) {
        p32.m5193x(this.f10696b == null, "May only be called before start");
        this.f10703i.add(new q10(this, i, 2));
    }

    @Override // p000.InterfaceC1339qo
    /* JADX INFO: renamed from: e */
    public final void mo1029e(C1681zx c1681zx) {
        p32.m5193x(this.f10696b == null, "May only be called before start");
        p32.m5188s(c1681zx, "decompressorRegistry");
        this.f10703i.add(new RunnableC1466u3(13, this, c1681zx));
    }

    @Override // p000.InterfaceC1339qo
    /* JADX INFO: renamed from: f */
    public void mo1030f(nv1 nv1Var) {
        boolean z = false;
        boolean z2 = true;
        p32.m5193x(this.f10696b != null, "May only be called after start");
        p32.m5188s(nv1Var, CRLReasonCodeExtension.REASON);
        synchronized (this) {
            try {
                InterfaceC1339qo interfaceC1339qo = this.f10697c;
                if (interfaceC1339qo == null) {
                    o81 o81Var = o81.f7686a;
                    if (interfaceC1339qo != null) {
                        z2 = false;
                    }
                    p32.m5194y(z2, "realStream already set to %s", interfaceC1339qo);
                    this.f10697c = o81Var;
                    this.f10702h = System.nanoTime();
                    this.f10698d = nv1Var;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m6177o(new RunnableC1466u3(16, this, nv1Var));
            return;
        }
        m6178p();
        mo4630r(nv1Var);
        this.f10696b.mo4775x(nv1Var, EnumC1376ro.f10079a, new j51());
    }

    @Override // p000.uv1
    public final void flush() {
        p32.m5193x(this.f10696b != null, "May only be called after start");
        if (this.f10695a) {
            this.f10697c.flush();
        } else {
            m6177o(new r10(this, 2));
        }
    }

    @Override // p000.InterfaceC1339qo
    /* JADX INFO: renamed from: g */
    public void mo1031g(zj0 zj0Var) {
        synchronized (this) {
            try {
                if (this.f10696b == null) {
                    return;
                }
                if (this.f10697c != null) {
                    zj0Var.m7315f(Long.valueOf(this.f10702h - this.f10701g), "buffered_nanos");
                    this.f10697c.mo1031g(zj0Var);
                } else {
                    zj0Var.m7315f(Long.valueOf(System.nanoTime() - this.f10701g), "buffered_nanos");
                    zj0Var.f13431b.add("waiting_for_connection");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC1339qo
    public final C1437tb getAttributes() {
        InterfaceC1339qo interfaceC1339qo;
        synchronized (this) {
            interfaceC1339qo = this.f10697c;
        }
        return interfaceC1339qo != null ? interfaceC1339qo.getAttributes() : C1437tb.f10816b;
    }

    @Override // p000.InterfaceC1339qo
    /* JADX INFO: renamed from: h */
    public final void mo1032h(C1274ox c1274ox) {
        p32.m5193x(this.f10696b == null, "May only be called before start");
        this.f10703i.add(new RunnableC1466u3(14, this, c1274ox));
    }

    @Override // p000.uv1
    /* JADX INFO: renamed from: i */
    public final void mo1033i(kh1 kh1Var) {
        p32.m5193x(this.f10696b != null, "May only be called after start");
        if (this.f10695a) {
            this.f10697c.mo1033i(kh1Var);
        } else {
            m6177o(new RunnableC1466u3(15, this, kh1Var));
        }
    }

    @Override // p000.InterfaceC1339qo
    /* JADX INFO: renamed from: j */
    public final void mo1034j() {
        p32.m5193x(this.f10696b != null, "May only be called after start");
        m6177o(new r10(this, 3));
    }

    @Override // p000.uv1
    /* JADX INFO: renamed from: k */
    public final void mo1035k(int i) {
        p32.m5193x(this.f10696b != null, "May only be called after start");
        if (this.f10695a) {
            this.f10697c.mo1035k(i);
        } else {
            m6177o(new q10(this, i, 0));
        }
    }

    @Override // p000.InterfaceC1339qo
    /* JADX INFO: renamed from: l */
    public final void mo1036l(int i) {
        p32.m5193x(this.f10696b == null, "May only be called before start");
        this.f10703i.add(new q10(this, i, 1));
    }

    @Override // p000.InterfaceC1339qo
    /* JADX INFO: renamed from: m */
    public final void mo1037m(InterfaceC1413so interfaceC1413so) {
        nv1 nv1Var;
        boolean z;
        p32.m5188s(interfaceC1413so, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        p32.m5193x(this.f10696b == null, "already started");
        synchronized (this) {
            try {
                nv1Var = this.f10698d;
                z = this.f10695a;
                if (!z) {
                    s10 s10Var = new s10(interfaceC1413so);
                    this.f10700f = s10Var;
                    interfaceC1413so = s10Var;
                }
                this.f10696b = interfaceC1413so;
                this.f10701g = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (nv1Var != null) {
            interfaceC1413so.mo4775x(nv1Var, EnumC1376ro.f10079a, new j51());
        } else if (z) {
            m6179q(interfaceC1413so);
        }
    }

    @Override // p000.uv1
    /* JADX INFO: renamed from: n */
    public final void mo1038n() {
        p32.m5193x(this.f10696b == null, "May only be called before start");
        this.f10703i.add(new r10(this, 0));
    }

    /* JADX INFO: renamed from: o */
    public final void m6177o(Runnable runnable) {
        p32.m5193x(this.f10696b != null, "May only be called after start");
        synchronized (this) {
            try {
                if (this.f10695a) {
                    runnable.run();
                } else {
                    this.f10699e.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002f A[Catch: all -> 0x002d, TryCatch #1 {all -> 0x002d, blocks: (B:11:0x001f, B:13:0x0027, B:14:0x002b, B:18:0x002f, B:19:0x0033), top: B:41:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:23:0x003e A[LOOP:3: B:21:0x0038->B:23:0x003e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x004f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x001f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
    
        if (r0.hasNext() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m6178p() {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r5)
            java.util.List r1 = r5.f10699e     // Catch: java.lang.Throwable -> L50
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L52
            r0 = 0
            r5.f10699e = r0     // Catch: java.lang.Throwable -> L50
            r1 = 1
            r5.f10695a = r1     // Catch: java.lang.Throwable -> L50
            s10 r2 = r5.f10700f     // Catch: java.lang.Throwable -> L50
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L4f
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L1e:
            monitor-enter(r2)
            java.util.List r3 = r2.f10197c     // Catch: java.lang.Throwable -> L2d
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L2f
            r2.f10197c = r0     // Catch: java.lang.Throwable -> L2d
            r2.f10196b = r1     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            return
        L2d:
            r5 = move-exception
            goto L4d
        L2f:
            java.util.List r3 = r2.f10197c     // Catch: java.lang.Throwable -> L2d
            r2.f10197c = r5     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r5 = r3.iterator()
        L38:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L48
            java.lang.Object r4 = r5.next()
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r4.run()
            goto L38
        L48:
            r3.clear()
            r5 = r3
            goto L1e
        L4d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            throw r5
        L4f:
            return
        L50:
            r0 = move-exception
            goto L70
        L52:
            java.util.List r1 = r5.f10699e     // Catch: java.lang.Throwable -> L50
            r5.f10699e = r0     // Catch: java.lang.Throwable -> L50
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L50
            java.util.Iterator r0 = r1.iterator()
        L5b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6b
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L5b
        L6b:
            r1.clear()
            r0 = r1
            goto L5
        L70:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L50
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.t10.m6178p():void");
    }

    /* JADX INFO: renamed from: q */
    public final void m6179q(InterfaceC1413so interfaceC1413so) {
        ArrayList arrayList = this.f10703i;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
        this.f10703i = null;
        this.f10697c.mo1037m(interfaceC1413so);
    }

    /* JADX INFO: renamed from: s */
    public final r10 m6180s(InterfaceC1339qo interfaceC1339qo) {
        synchronized (this) {
            try {
                if (this.f10697c != null) {
                    return null;
                }
                p32.m5188s(interfaceC1339qo, "stream");
                InterfaceC1339qo interfaceC1339qo2 = this.f10697c;
                p32.m5194y(interfaceC1339qo2 == null, "realStream already set to %s", interfaceC1339qo2);
                this.f10697c = interfaceC1339qo;
                this.f10702h = System.nanoTime();
                InterfaceC1413so interfaceC1413so = this.f10696b;
                if (interfaceC1413so == null) {
                    this.f10699e = null;
                    this.f10695a = true;
                }
                if (interfaceC1413so == null) {
                    return null;
                }
                m6179q(interfaceC1413so);
                return new r10(this, 1);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void mo4630r(nv1 nv1Var) {
    }
}

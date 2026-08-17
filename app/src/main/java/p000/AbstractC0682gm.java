package p000;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: gm */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0682gm implements rx1 {

    /* JADX INFO: renamed from: a */
    public final ArrayDeque f4235a = new ArrayDeque();

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f4236b;

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f4237c;

    /* JADX INFO: renamed from: d */
    public C0608em f4238d;

    /* JADX INFO: renamed from: e */
    public long f4239e;

    /* JADX INFO: renamed from: f */
    public long f4240f;

    /* JADX INFO: renamed from: g */
    public long f4241g;

    public AbstractC0682gm() {
        for (int i = 0; i < 10; i++) {
            this.f4235a.add(new C0608em(1));
        }
        this.f4236b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.f4236b;
            C1521vl c1521vl = new C1521vl(this, 1);
            C0645fm c0645fm = new C0645fm();
            c0645fm.f3853q = c1521vl;
            arrayDeque.add(c0645fm);
        }
        this.f4237c = new ArrayDeque();
        this.f4241g = -9223372036854775807L;
    }

    @Override // p000.InterfaceC1385rx
    /* JADX INFO: renamed from: a */
    public final void mo3010a(long j) {
        this.f4241g = j;
    }

    @Override // p000.rx1
    /* JADX INFO: renamed from: b */
    public final void mo3011b(long j) {
        this.f4239e = j;
    }

    @Override // p000.InterfaceC1385rx
    /* JADX INFO: renamed from: d */
    public final Object mo3013d() {
        ki0.m3864h(this.f4238d == null);
        ArrayDeque arrayDeque = this.f4235a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        C0608em c0608em = (C0608em) arrayDeque.pollFirst();
        this.f4238d = c0608em;
        return c0608em;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    @Override // p000.InterfaceC1385rx
    /* JADX INFO: renamed from: e */
    public final void mo3014e(ux1 ux1Var) {
        ki0.m3857c(ux1Var == this.f4238d);
        C0608em c0608em = (C0608em) ux1Var;
        long j = c0608em.f11797p;
        if (j != Long.MIN_VALUE) {
            long j2 = this.f4241g;
            if (j2 == -9223372036854775807L || j >= j2) {
                long j3 = this.f4240f;
                this.f4240f = 1 + j3;
                c0608em.f3383t = j3;
                this.f4237c.add(c0608em);
            } else {
                c0608em.mo5844r();
                this.f4235a.add(c0608em);
            }
        } else {
            long j4 = this.f4240f;
            this.f4240f = 1 + j4;
            c0608em.f3383t = j4;
            this.f4237c.add(c0608em);
        }
        this.f4238d = null;
    }

    /* JADX INFO: renamed from: f */
    public abstract C0719hm mo2367f();

    @Override // p000.InterfaceC1385rx
    public void flush() {
        ArrayDeque arrayDeque;
        this.f4240f = 0L;
        this.f4239e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f4237c;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f4235a;
            if (zIsEmpty) {
                break;
            }
            C0608em c0608em = (C0608em) arrayDeque2.poll();
            int i = z42.f13274a;
            c0608em.mo5844r();
            arrayDeque.add(c0608em);
        }
        C0608em c0608em2 = this.f4238d;
        if (c0608em2 != null) {
            c0608em2.mo5844r();
            arrayDeque.add(c0608em2);
            this.f4238d = null;
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo2368g(C0608em c0608em);

    @Override // p000.InterfaceC1385rx
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0645fm mo3012c() {
        ArrayDeque arrayDeque = this.f4236b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.f4237c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            C0608em c0608em = (C0608em) arrayDeque2.peek();
            int i = z42.f13274a;
            if (c0608em.f11797p > this.f4239e) {
                return null;
            }
            C0608em c0608em2 = (C0608em) arrayDeque2.poll();
            boolean zM4599i = c0608em2.m4599i(4);
            ArrayDeque arrayDeque3 = this.f4235a;
            if (zM4599i) {
                C0645fm c0645fm = (C0645fm) arrayDeque.pollFirst();
                c0645fm.m4597b(4);
                c0608em2.mo5844r();
                arrayDeque3.add(c0608em2);
                return c0645fm;
            }
            mo2368g(c0608em2);
            if (mo2369i()) {
                C0719hm c0719hmMo2367f = mo2367f();
                C0645fm c0645fm2 = (C0645fm) arrayDeque.pollFirst();
                long j = c0608em2.f11797p;
                c0645fm2.f12349g = j;
                c0645fm2.f3850n = c0719hmMo2367f;
                c0645fm2.f3851o = j;
                c0608em2.mo5844r();
                arrayDeque3.add(c0608em2);
                return c0645fm2;
            }
            c0608em2.mo5844r();
            arrayDeque3.add(c0608em2);
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract boolean mo2369i();

    @Override // p000.InterfaceC1385rx
    public void release() {
    }
}

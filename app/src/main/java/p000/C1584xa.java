package p000;

/* JADX INFO: renamed from: xa */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1584xa extends AbstractRunnableC0012ab {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f12505c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0093bb f12506d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1584xa(C0093bb c0093bb, int i) {
        super(c0093bb, 0);
        this.f12505c = i;
        switch (i) {
            case 1:
                this.f12506d = c0093bb;
                super(c0093bb, 0);
                jc1.m3598b();
                break;
            default:
                this.f12506d = c0093bb;
                jc1.m3598b();
                break;
        }
    }

    @Override // p000.AbstractRunnableC0012ab
    /* JADX INFO: renamed from: a */
    public final void mo140a() {
        C0093bb c0093bb;
        int i;
        C0093bb c0093bb2;
        switch (this.f12505c) {
            case 0:
                C1073lj c1073lj = new C1073lj();
                jc1.m3599c();
                try {
                    vm0 vm0Var = jc1.f5363a;
                    vm0Var.getClass();
                    synchronized (this.f12506d.f1267a) {
                        C1073lj c1073lj2 = this.f12506d.f1268b;
                        c1073lj.mo956q(c1073lj2.m4201d(), c1073lj2);
                        c0093bb = this.f12506d;
                        c0093bb.f1272f = false;
                        i = c0093bb.f1279r;
                        break;
                    }
                    c0093bb.f1275n.mo956q(c1073lj.f6361b, c1073lj);
                    synchronized (this.f12506d.f1267a) {
                        this.f12506d.f1279r -= i;
                        break;
                    }
                    vm0Var.getClass();
                    return;
                } catch (Throwable th) {
                    try {
                        jc1.f5363a.getClass();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            default:
                C1073lj c1073lj3 = new C1073lj();
                jc1.m3599c();
                try {
                    vm0 vm0Var2 = jc1.f5363a;
                    vm0Var2.getClass();
                    synchronized (this.f12506d.f1267a) {
                        C1073lj c1073lj4 = this.f12506d.f1268b;
                        c1073lj3.mo956q(c1073lj4.f6361b, c1073lj4);
                        c0093bb2 = this.f12506d;
                        c0093bb2.f1273g = false;
                        break;
                    }
                    c0093bb2.f1275n.mo956q(c1073lj3.f6361b, c1073lj3);
                    this.f12506d.f1275n.flush();
                    vm0Var2.getClass();
                    return;
                } catch (Throwable th3) {
                    try {
                        jc1.f5363a.getClass();
                        break;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
        }
    }
}

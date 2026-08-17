package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class vp0 extends AbstractC1352r0 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f11739d = 0;

    /* JADX INFO: renamed from: e */
    public final Iterator f11740e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f11741f;

    public vp0(jr1 jr1Var) {
        this.f11741f = jr1Var;
        this.f11740e = jr1Var.f5502c.iterator();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p000.AbstractC1352r0
    /* JADX INFO: renamed from: b */
    public final Object mo3480b() {
        int i = this.f11739d;
        Object obj = this.f11741f;
        Iterator it = this.f11740e;
        switch (i) {
            case 0:
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((sf1) obj).apply(next)) {
                        return next;
                    }
                }
                this.f9642b = 3;
                return null;
            default:
                while (it.hasNext()) {
                    Object next2 = it.next();
                    if (((jr1) obj).f5503d.contains(next2)) {
                        return next2;
                    }
                }
                this.f9642b = 3;
                return null;
        }
    }

    public vp0(Iterator it, sf1 sf1Var) {
        this.f11740e = it;
        this.f11741f = sf1Var;
    }
}

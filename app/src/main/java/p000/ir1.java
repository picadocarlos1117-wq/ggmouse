package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ir1 extends AbstractC1352r0 {

    /* JADX INFO: renamed from: d */
    public final Iterator f5139d;

    /* JADX INFO: renamed from: e */
    public final Iterator f5140e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ jr1 f5141f;

    public ir1(jr1 jr1Var) {
        this.f5141f = jr1Var;
        this.f5139d = jr1Var.f5502c.iterator();
        this.f5140e = jr1Var.f5503d.iterator();
    }

    @Override // p000.AbstractC1352r0
    /* JADX INFO: renamed from: b */
    public final Object mo3480b() {
        Object next;
        Iterator it = this.f5139d;
        if (it.hasNext()) {
            return it.next();
        }
        do {
            Iterator it2 = this.f5140e;
            if (!it2.hasNext()) {
                this.f9642b = 3;
                return null;
            }
            next = it2.next();
        } while (this.f5141f.f5502c.contains(next));
        return next;
    }
}

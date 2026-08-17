package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ro1 extends so1 implements Iterator {

    /* JADX INFO: renamed from: a */
    public qo1 f10089a;

    /* JADX INFO: renamed from: b */
    public boolean f10090b = true;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ to1 f10091c;

    public ro1(to1 to1Var) {
        this.f10091c = to1Var;
    }

    @Override // p000.so1
    /* JADX INFO: renamed from: a */
    public final void mo5294a(qo1 qo1Var) {
        qo1 qo1Var2 = this.f10089a;
        if (qo1Var == qo1Var2) {
            qo1 qo1Var3 = qo1Var2.f9553d;
            this.f10089a = qo1Var3;
            this.f10090b = qo1Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f10090b) {
            return this.f10091c.f10913a != null;
        }
        qo1 qo1Var = this.f10089a;
        return (qo1Var == null || qo1Var.f9552c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f10090b) {
            this.f10090b = false;
            this.f10089a = this.f10091c.f10913a;
        } else {
            qo1 qo1Var = this.f10089a;
            this.f10089a = qo1Var != null ? qo1Var.f9552c : null;
        }
        return this.f10089a;
    }
}

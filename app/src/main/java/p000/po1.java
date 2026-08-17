package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class po1 extends so1 implements Iterator {

    /* JADX INFO: renamed from: a */
    public qo1 f8978a;

    /* JADX INFO: renamed from: b */
    public qo1 f8979b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f8980c;

    public po1(qo1 qo1Var, qo1 qo1Var2, int i) {
        this.f8980c = i;
        this.f8978a = qo1Var2;
        this.f8979b = qo1Var;
    }

    @Override // p000.so1
    /* JADX INFO: renamed from: a */
    public final void mo5294a(qo1 qo1Var) {
        qo1 qo1Var2;
        qo1 qo1VarM5295b = null;
        if (this.f8978a == qo1Var && qo1Var == this.f8979b) {
            this.f8979b = null;
            this.f8978a = null;
        }
        qo1 qo1Var3 = this.f8978a;
        if (qo1Var3 == qo1Var) {
            switch (this.f8980c) {
                case 0:
                    qo1Var2 = qo1Var3.f9553d;
                    break;
                default:
                    qo1Var2 = qo1Var3.f9552c;
                    break;
            }
            this.f8978a = qo1Var2;
        }
        qo1 qo1Var4 = this.f8979b;
        if (qo1Var4 == qo1Var) {
            qo1 qo1Var5 = this.f8978a;
            if (qo1Var4 != qo1Var5 && qo1Var5 != null) {
                qo1VarM5295b = m5295b(qo1Var4);
            }
            this.f8979b = qo1VarM5295b;
        }
    }

    /* JADX INFO: renamed from: b */
    public final qo1 m5295b(qo1 qo1Var) {
        switch (this.f8980c) {
            case 0:
                return qo1Var.f9552c;
            default:
                return qo1Var.f9553d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8979b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        qo1 qo1Var = this.f8979b;
        qo1 qo1Var2 = this.f8978a;
        this.f8979b = (qo1Var == qo1Var2 || qo1Var2 == null) ? null : m5295b(qo1Var);
        return qo1Var;
    }
}

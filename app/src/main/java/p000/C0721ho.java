package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ho */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0721ho extends AbstractRunnableC0012ab {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f4622c = 2;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f4623d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0721ho(C1174o9 c1174o9) {
        super(((C0798jo) c1174o9.f7701d).f5469e, 1);
        this.f4623d = c1174o9;
    }

    @Override // p000.AbstractRunnableC0012ab
    /* JADX INFO: renamed from: b */
    public final void mo141b() {
        List list;
        switch (this.f4622c) {
            case 0:
                C1174o9 c1174o9 = (C1174o9) this.f4623d;
                jc1.m3599c();
                try {
                    jc1.m3597a();
                    jc1.f5363a.getClass();
                    if (((nv1) c1174o9.f7700c) == null) {
                        try {
                            ((AbstractC0143co) c1174o9.f7699b).onReady();
                        } catch (Throwable th) {
                            nv1 nv1VarM4614g = nv1.f7551f.m4613f(th).m4614g("Failed to call onReady.");
                            c1174o9.f7700c = nv1VarM4614g;
                            ((C0798jo) c1174o9.f7701d).f5473i.mo1030f(nv1VarM4614g);
                        }
                        break;
                    }
                    jc1.f5363a.getClass();
                    return;
                } catch (Throwable th2) {
                    try {
                        jc1.f5363a.getClass();
                        break;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            case 1:
                ((kx0) this.f4623d).m4007c();
                return;
            default:
                m10 m10Var = (m10) this.f4623d;
                m10Var.getClass();
                List arrayList = new ArrayList();
                while (true) {
                    synchronized (m10Var) {
                        try {
                            if (m10Var.f6589c.isEmpty()) {
                                m10Var.f6589c = null;
                                m10Var.f6588b = true;
                                return;
                            } else {
                                list = m10Var.f6589c;
                                m10Var.f6589c = arrayList;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    list.clear();
                    arrayList = list;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0721ho(kx0 kx0Var, m10 m10Var) {
        super(kx0Var.f6053c, 1);
        this.f4623d = m10Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0721ho(kx0 kx0Var, C1307pt c1307pt) {
        super(c1307pt, 1);
        this.f4623d = kx0Var;
    }
}

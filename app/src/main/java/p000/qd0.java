package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class qd0 implements InterfaceC0615et {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9484a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9485b;

    public /* synthetic */ qd0(Object obj, int i) {
        this.f9484a = i;
        this.f9485b = obj;
    }

    @Override // p000.InterfaceC0615et
    public final void accept(Object obj) {
        switch (this.f9484a) {
            case 0:
                rd0 rd0Var = (rd0) obj;
                if (rd0Var == null) {
                    rd0Var = new rd0(-3);
                }
                ((C0558d8) this.f9485b).m2259H(rd0Var);
                return;
            default:
                rd0 rd0Var2 = (rd0) obj;
                synchronized (sd0.f10368c) {
                    try {
                        zs1 zs1Var = sd0.f10369d;
                        ArrayList arrayList = (ArrayList) zs1Var.getOrDefault((String) this.f9485b, null);
                        if (arrayList == null) {
                            return;
                        }
                        zs1Var.remove((String) this.f9485b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((InterfaceC0615et) arrayList.get(i)).accept(rd0Var2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}

package p000;

import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d20 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2722a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2723b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2724c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f2725d;

    public /* synthetic */ d20(Object obj, int i, int i2, Object obj2) {
        this.f2722a = i2;
        this.f2724c = obj;
        this.f2723b = i;
        this.f2725d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2722a;
        Object obj = this.f2725d;
        int i2 = this.f2723b;
        Object obj2 = this.f2724c;
        switch (i) {
            case 0:
                ((e20) obj2).f3173b.mo743f(i2, obj);
                break;
            default:
                xt0 xt0Var = (xt0) obj;
                for (zt0 zt0Var : (CopyOnWriteArraySet) obj2) {
                    if (!zt0Var.f13561d) {
                        if (i2 != -1) {
                            zt0Var.f13559b.m4550b(i2);
                        }
                        zt0Var.f13560c = true;
                        xt0Var.invoke(zt0Var.f13558a);
                    }
                }
                break;
        }
    }
}

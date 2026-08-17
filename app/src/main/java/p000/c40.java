package p000;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class c40 {

    /* JADX INFO: renamed from: a */
    public final int f1662a;

    /* JADX INFO: renamed from: b */
    public final q21 f1663b;

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList f1664c;

    public /* synthetic */ c40(CopyOnWriteArrayList copyOnWriteArrayList, int i, q21 q21Var) {
        this.f1664c = copyOnWriteArrayList;
        this.f1662a = i;
        this.f1663b = q21Var;
    }

    /* JADX INFO: renamed from: a */
    public void m1126a(InterfaceC0578dt interfaceC0578dt) {
        for (u21 u21Var : this.f1664c) {
            z42.m7219G(u21Var.f11103a, new RunnableC1467u4(20, interfaceC0578dt, u21Var.f11104b));
        }
    }
}

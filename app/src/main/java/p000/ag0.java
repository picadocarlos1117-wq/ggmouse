package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ag0 extends u22 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f227a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f228b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f229c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ArrayList f230d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ bg0 f231e;

    public ag0(bg0 bg0Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f231e = bg0Var;
        this.f227a = obj;
        this.f228b = arrayList;
        this.f229c = obj2;
        this.f230d = arrayList2;
    }

    @Override // p000.s22
    /* JADX INFO: renamed from: b */
    public final void mo149b(t22 t22Var) {
        t22Var.m6218w(this);
    }

    @Override // p000.u22, p000.s22
    /* JADX INFO: renamed from: d */
    public final void mo150d() {
        bg0 bg0Var = this.f231e;
        Object obj = this.f227a;
        if (obj != null) {
            bg0Var.m988s(obj, this.f228b, null);
        }
        Object obj2 = this.f229c;
        if (obj2 != null) {
            bg0Var.m988s(obj2, this.f230d, null);
        }
    }
}

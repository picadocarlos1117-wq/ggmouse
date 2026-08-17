package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class v22 extends u22 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0633fa f11497a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ w22 f11498b;

    public v22(w22 w22Var, C0633fa c0633fa) {
        this.f11498b = w22Var;
        this.f11497a = c0633fa;
    }

    @Override // p000.s22
    /* JADX INFO: renamed from: b */
    public final void mo149b(t22 t22Var) {
        ((ArrayList) this.f11497a.getOrDefault(this.f11498b.f11936b, null)).remove(t22Var);
        t22Var.m6218w(this);
    }
}

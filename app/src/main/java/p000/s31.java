package p000;

import android.view.ActionProvider;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class s31 implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: a */
    public final ActionProvider f10214a;

    /* JADX INFO: renamed from: b */
    public pn0 f10215b;

    public s31(v31 v31Var, ActionProvider actionProvider) {
        this.f10214a = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        pn0 pn0Var = this.f10215b;
        if (pn0Var != null) {
            i31 i31Var = ((r31) pn0Var.f8968a).f9684n;
            i31Var.f4794h = true;
            i31Var.m3353p(true);
        }
    }
}

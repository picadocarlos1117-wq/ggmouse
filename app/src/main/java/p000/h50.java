package p000;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class h50 implements j50 {
    @Override // p000.j50
    /* JADX INFO: renamed from: a */
    public void mo3108a(wy1 wy1Var, wy1 wy1Var2, Window window, View view, boolean z, boolean z2) {
        cb2 cb2Var;
        wy1Var.getClass();
        wy1Var2.getClass();
        window.getClass();
        view.getClass();
        AbstractC1337qm.m5529b0(window, false);
        window.setStatusBarColor(z ? wy1Var.f12360b : wy1Var.f12359a);
        window.setNavigationBarColor(z2 ? wy1Var2.f12360b : wy1Var2.f12359a);
        if (Build.VERSION.SDK_INT >= 30) {
            cb2Var = new cb2(window.getInsetsController());
            cb2Var.f1743r = window;
        } else {
            cb2Var = new cb2(window, view);
        }
        cb2Var.mo1205X(!z);
        cb2Var.mo1204W(!z2);
    }
}

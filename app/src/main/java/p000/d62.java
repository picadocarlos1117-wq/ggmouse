package p000;

import android.hardware.display.DisplayManager;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class d62 implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a */
    public final DisplayManager f2807a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ f62 f2808b;

    public d62(f62 f62Var, DisplayManager displayManager) {
        this.f2808b = f62Var;
        this.f2807a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            f62.m2727a(this.f2808b, this.f2807a.getDisplay(0));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}

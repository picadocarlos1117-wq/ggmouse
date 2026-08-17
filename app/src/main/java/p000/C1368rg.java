package p000;

import android.window.BackEvent;

/* JADX INFO: renamed from: rg */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1368rg {

    /* JADX INFO: renamed from: a */
    public final float f10013a;

    /* JADX INFO: renamed from: b */
    public final float f10014b;

    /* JADX INFO: renamed from: c */
    public final float f10015c;

    /* JADX INFO: renamed from: d */
    public final int f10016d;

    public C1368rg(BackEvent backEvent) {
        backEvent.getClass();
        C1060l6 c1060l6 = C1060l6.f6192a;
        float fM4062d = c1060l6.m4062d(backEvent);
        float fM4063e = c1060l6.m4063e(backEvent);
        float fM4060b = c1060l6.m4060b(backEvent);
        int iM4061c = c1060l6.m4061c(backEvent);
        this.f10013a = fM4062d;
        this.f10014b = fM4063e;
        this.f10015c = fM4060b;
        this.f10016d = iM4061c;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f10013a + ", touchY=" + this.f10014b + ", progress=" + this.f10015c + ", swipeEdge=" + this.f10016d + '}';
    }
}

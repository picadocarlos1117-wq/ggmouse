package p000;

import android.window.BackEvent;

/* JADX INFO: renamed from: l6 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1060l6 {

    /* JADX INFO: renamed from: a */
    public static final C1060l6 f6192a = new C1060l6();

    /* JADX INFO: renamed from: a */
    public final BackEvent m4059a(float f, float f2, float f3, int i) {
        return new BackEvent(f, f2, f3, i);
    }

    /* JADX INFO: renamed from: b */
    public final float m4060b(BackEvent backEvent) {
        backEvent.getClass();
        return backEvent.getProgress();
    }

    /* JADX INFO: renamed from: c */
    public final int m4061c(BackEvent backEvent) {
        backEvent.getClass();
        return backEvent.getSwipeEdge();
    }

    /* JADX INFO: renamed from: d */
    public final float m4062d(BackEvent backEvent) {
        backEvent.getClass();
        return backEvent.getTouchX();
    }

    /* JADX INFO: renamed from: e */
    public final float m4063e(BackEvent backEvent) {
        backEvent.getClass();
        return backEvent.getTouchY();
    }
}

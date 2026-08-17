package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: f6 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0629f6 implements Drawable.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0740i6 f3622a;

    public C0629f6(C0740i6 c0740i6) {
        this.f3622a = c0740i6;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f3622a.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f3622a.scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f3622a.unscheduleSelf(runnable);
    }
}

package p000;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class cz0 implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ az0 f2688a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dz0 f2689b;

    public cz0(dz0 dz0Var, az0 az0Var) {
        this.f2689b = dz0Var;
        this.f2688a = az0Var;
    }

    public final void onBackCancelled() {
        if (this.f2689b.f1576a != null) {
            this.f2688a.mo796d();
        }
    }

    public final void onBackInvoked() {
        this.f2688a.mo793a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.f2689b.f1576a != null) {
            this.f2688a.mo794b(new C1368rg(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.f2689b.f1576a != null) {
            this.f2688a.mo795c(new C1368rg(backEvent));
        }
    }
}

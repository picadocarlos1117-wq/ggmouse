package p000;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ma1 implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ og0 f6729a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ og0 f6730b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mg0 f6731c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ mg0 f6732d;

    public ma1(og0 og0Var, og0 og0Var2, mg0 mg0Var, mg0 mg0Var2) {
        this.f6729a = og0Var;
        this.f6730b = og0Var2;
        this.f6731c = mg0Var;
        this.f6732d = mg0Var2;
    }

    public final void onBackCancelled() {
        this.f6732d.invoke();
    }

    public final void onBackInvoked() {
        this.f6731c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        this.f6730b.invoke(new C1368rg(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        this.f6729a.invoke(new C1368rg(backEvent));
    }
}

package p000;

import androidx.fragment.app.AbstractComponentCallbacksC0048l;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class pe0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8866a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractComponentCallbacksC0048l f8867b;

    public /* synthetic */ pe0(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l, int i) {
        this.f8866a = i;
        this.f8867b = abstractComponentCallbacksC0048l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f8866a;
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = this.f8867b;
        switch (i) {
            case 0:
                abstractComponentCallbacksC0048l.startPostponedEnterTransition();
                break;
            default:
                abstractComponentCallbacksC0048l.callStartTransitionListener(false);
                break;
        }
    }
}

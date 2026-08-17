package p000;

import android.window.OnBackInvokedCallback;

/* JADX INFO: renamed from: j7 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0780j7 implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5310a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5311b;

    public /* synthetic */ C0780j7(Object obj, int i) {
        this.f5310a = i;
        this.f5311b = obj;
    }

    public final void onBackInvoked() {
        int i = this.f5310a;
        Object obj = this.f5311b;
        switch (i) {
            case 0:
                ((LayoutInflaterFactory2C1359r7) obj).m5723D();
                break;
            case 1:
                ((az0) obj).mo793a();
                break;
            case 2:
                ((mg0) obj).invoke();
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}

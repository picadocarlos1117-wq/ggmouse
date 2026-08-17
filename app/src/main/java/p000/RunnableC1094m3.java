package p000;

import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: renamed from: m3 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1094m3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6610a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ActionBarOverlayLayout f6611b;

    public /* synthetic */ RunnableC1094m3(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f6610a = i;
        this.f6611b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6610a;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f6611b;
        switch (i) {
            case 0:
                actionBarOverlayLayout.m226h();
                actionBarOverlayLayout.f401B = actionBarOverlayLayout.f409d.animate().translationY(TouchPipeline.SIZE).setListener(actionBarOverlayLayout.f402C);
                break;
            default:
                actionBarOverlayLayout.m226h();
                actionBarOverlayLayout.f401B = actionBarOverlayLayout.f409d.animate().translationY(-actionBarOverlayLayout.f409d.getHeight()).setListener(actionBarOverlayLayout.f402C);
                break;
        }
    }
}

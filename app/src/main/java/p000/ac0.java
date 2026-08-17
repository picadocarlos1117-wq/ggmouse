package p000;

import com.example.ssmousepro.FloatingService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ac0 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f139a;

    public /* synthetic */ ac0(int i) {
        this.f139a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f139a) {
            case 0:
                return FloatingService.executorDebugExterior$lambda$1(runnable);
            case 1:
                return FloatingService.executorMonitorMapeador$lambda$5(runnable);
            default:
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
        }
    }
}

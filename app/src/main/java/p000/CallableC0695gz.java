package p000;

import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: gz */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC0695gz implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4365a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DefaultHeartBeatController f4366b;

    public /* synthetic */ CallableC0695gz(DefaultHeartBeatController defaultHeartBeatController, int i) {
        this.f4365a = i;
        this.f4366b = defaultHeartBeatController;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f4365a;
        DefaultHeartBeatController defaultHeartBeatController = this.f4366b;
        switch (i) {
            case 0:
                return defaultHeartBeatController.lambda$getHeartBeatsHeader$1();
            default:
                return defaultHeartBeatController.lambda$registerHeartBeat$0();
        }
    }
}

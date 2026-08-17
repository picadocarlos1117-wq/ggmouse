package p000;

import android.os.HandlerThread;

/* JADX INFO: renamed from: kb */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0822kb implements ey1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5730a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f5731b;

    public /* synthetic */ C0822kb(int i, int i2) {
        this.f5730a = i2;
        this.f5731b = i;
    }

    @Override // p000.ey1
    public final Object get() {
        int i = this.f5730a;
        int i2 = this.f5731b;
        switch (i) {
            case 0:
                return new HandlerThread(C1065lb.m4167b(i2, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(C1065lb.m4167b(i2, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}

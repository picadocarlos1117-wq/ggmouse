package p000;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class e62 implements Choreographer.FrameCallback, Handler.Callback {

    /* JADX INFO: renamed from: e */
    public static final e62 f3220e = new e62();

    /* JADX INFO: renamed from: a */
    public volatile long f3221a = -9223372036854775807L;

    /* JADX INFO: renamed from: b */
    public final Handler f3222b;

    /* JADX INFO: renamed from: c */
    public Choreographer f3223c;

    /* JADX INFO: renamed from: d */
    public int f3224d;

    public e62() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i = z42.f13274a;
        Handler handler = new Handler(looper, this);
        this.f3222b = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f3221a = j;
        Choreographer choreographer = this.f3223c;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                this.f3223c = Choreographer.getInstance();
            } catch (RuntimeException e) {
                AbstractC1337qm.m5544j0("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
            return true;
        }
        if (i == 2) {
            Choreographer choreographer = this.f3223c;
            if (choreographer != null) {
                int i2 = this.f3224d + 1;
                this.f3224d = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i != 3) {
            return false;
        }
        Choreographer choreographer2 = this.f3223c;
        if (choreographer2 != null) {
            int i3 = this.f3224d - 1;
            this.f3224d = i3;
            if (i3 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f3221a = -9223372036854775807L;
            }
        }
        return true;
    }
}

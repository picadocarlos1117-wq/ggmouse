package p000;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: jb */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0784jb implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5343a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ o11 f5344b;

    public /* synthetic */ C0784jb(z01 z01Var, o11 o11Var, int i) {
        this.f5343a = i;
        this.f5344b = o11Var;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        int i = this.f5343a;
        o11 o11Var = this.f5344b;
        switch (i) {
            case 0:
                Handler handler = o11Var.f7609a;
                if (z42.f13274a >= 30) {
                    o11Var.m4631a(j);
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                }
                break;
            default:
                Handler handler2 = o11Var.f7609a;
                if (z42.f13274a >= 30) {
                    o11Var.m4631a(j);
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                }
                break;
        }
    }
}

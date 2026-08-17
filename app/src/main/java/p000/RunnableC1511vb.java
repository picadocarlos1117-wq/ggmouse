package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: renamed from: vb */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1511vb extends BroadcastReceiver implements Runnable {

    /* JADX INFO: renamed from: a */
    public final c80 f11599a;

    /* JADX INFO: renamed from: b */
    public final Handler f11600b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1548wb f11601c;

    public RunnableC1511vb(C1548wb c1548wb, Handler handler, c80 c80Var) {
        this.f11601c = c1548wb;
        this.f11600b = handler;
        this.f11599a = c80Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f11600b.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f11601c.f12046b) {
            this.f11599a.f1699a.m2750K(-1, 3, false);
        }
    }
}

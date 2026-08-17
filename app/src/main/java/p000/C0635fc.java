package p000;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: renamed from: fc */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0635fc implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final Handler f3746a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0672gc f3747b;

    public C0635fc(C0672gc c0672gc, Handler handler) {
        this.f3747b = c0672gc;
        this.f3746a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.f3746a.post(new RunnableC0598ec(i, 0, this));
    }
}

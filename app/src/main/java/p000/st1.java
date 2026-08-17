package p000;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class st1 implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0080az f10543a;

    public st1(C0080az c0080az) {
        this.f10543a = c0080az;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        C0080az c0080az = this.f10543a;
        if (message.obj != null) {
            l41.m4035b();
            return false;
        }
        synchronized (c0080az.f1098a) {
            throw null;
        }
    }
}

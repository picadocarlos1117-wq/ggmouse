package p000;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: lh */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1071lh implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            message.obj.getClass();
            l41.m4035b();
            return false;
        }
        if (i != 1) {
            return false;
        }
        message.obj.getClass();
        l41.m4035b();
        return false;
    }
}

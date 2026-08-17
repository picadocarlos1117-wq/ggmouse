package p000;

import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class yy1 {

    /* JADX INFO: renamed from: a */
    public Message f13169a;

    /* JADX INFO: renamed from: a */
    public final void m7163a() {
        this.f13169a = null;
        ArrayList arrayList = zy1.f13614b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7164b() {
        Message message = this.f13169a;
        message.getClass();
        message.sendToTarget();
        m7163a();
    }
}

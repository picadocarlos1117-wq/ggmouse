package p000;

import android.media.AudioTrack;
import android.os.Handler;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.core.Query;
import java.util.List;

/* JADX INFO: renamed from: ky */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1051ky implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6073a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f6074b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f6075c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f6076d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f6077e;

    public /* synthetic */ RunnableC1051ky(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f6073a = i;
        this.f6074b = obj;
        this.f6075c = obj2;
        this.f6076d = obj3;
        this.f6077e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6073a) {
            case 0:
                AudioTrack audioTrack = (AudioTrack) this.f6074b;
                pn0 pn0Var = (pn0) this.f6075c;
                Handler handler = (Handler) this.f6076d;
                C0662g2 c0662g2 = (C0662g2) this.f6077e;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (pn0Var != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new RunnableC1467u4(6, pn0Var, c0662g2));
                    }
                    synchronized (C1423sy.f10582j0) {
                        try {
                            int i = C1423sy.f10584l0 - 1;
                            C1423sy.f10584l0 = i;
                            if (i == 0) {
                                C1423sy.f10583k0.shutdown();
                                C1423sy.f10583k0 = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return;
                } catch (Throwable th2) {
                    if (pn0Var != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new RunnableC1467u4(6, pn0Var, c0662g2));
                    }
                    synchronized (C1423sy.f10582j0) {
                        try {
                            int i2 = C1423sy.f10584l0 - 1;
                            C1423sy.f10584l0 = i2;
                            if (i2 == 0) {
                                C1423sy.f10583k0.shutdown();
                                C1423sy.f10583k0 = null;
                            }
                            throw th2;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            default:
                ((FirestoreClient) this.f6074b).lambda$runAggregateQuery$16((Query) this.f6075c, (List) this.f6076d, (TaskCompletionSource) this.f6077e);
                return;
        }
    }
}

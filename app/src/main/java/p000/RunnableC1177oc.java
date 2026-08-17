package p000;

import com.example.ssmousepro.FloatingService;
import com.example.ssmousepro.FloatingService$listenerEstadoMira$1;
import com.example.ssmousepro.IAimStateListener;
import com.example.ssmousepro.activation.WifiDaemonClient;
import com.google.firebase.firestore.core.FirestoreClient;

/* JADX INFO: renamed from: oc */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1177oc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7742a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f7743b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f7744c;

    public /* synthetic */ RunnableC1177oc(boolean z, int i, Object obj) {
        this.f7742a = i;
        this.f7744c = obj;
        this.f7743b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f7742a;
        boolean z = this.f7743b;
        Object obj = this.f7744c;
        switch (i) {
            case 0:
                c80 c80Var = ((C1290pc) obj).f8840b;
                int i2 = z42.f13274a;
                f80 f80Var = c80Var.f1699a;
                if (f80Var.f3683Z != z) {
                    f80Var.f3683Z = z;
                    f80Var.f3704l.m714e(23, new a80(z, 1));
                    break;
                }
                break;
            case 1:
                ((FirestoreClient) obj).lambda$setIndexAutoCreationEnabled$22(z);
                break;
            case 2:
                FloatingService$listenerEstadoMira$1.onAimStateChanged$lambda$0((FloatingService) obj, z);
                break;
            default:
                WifiDaemonClient.loopEvt$lambda$9((IAimStateListener) obj, z);
                break;
        }
    }
}

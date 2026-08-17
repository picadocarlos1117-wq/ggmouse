package p000;

import android.util.Pair;
import android.view.AttachedSurfaceControl;
import android.view.SurfaceView;
import android.window.SurfaceSyncGroup;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.LoadBundleTask;
import com.google.firebase.firestore.bundle.BundleReader;
import com.google.firebase.firestore.core.AsyncEventListener;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.util.AsyncQueue;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* JADX INFO: renamed from: ta */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1436ta implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10808a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f10809b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f10810c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f10811d;

    public /* synthetic */ RunnableC1436ta(h00 h00Var, C0674ge c0674ge, lv1 lv1Var, C1587xd c1587xd) {
        this.f10808a = 3;
        this.f10809b = h00Var;
        this.f10810c = c0674ge;
        this.f10811d = c1587xd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.f10808a) {
            case 0:
                ((AsyncEventListener) this.f10809b).lambda$onEvent$0(this.f10810c, (FirebaseFirestoreException) this.f10811d);
                return;
            case 1:
                AsyncQueue.lambda$runSync$4((Runnable) this.f10809b, (Throwable[]) this.f10810c, (Semaphore) this.f10811d);
                return;
            case 2:
                AsyncQueue.lambda$callTask$1((Callable) this.f10809b, (Executor) this.f10810c, (TaskCompletionSource) this.f10811d);
                return;
            case 3:
                h00 h00Var = (h00) this.f10809b;
                C0674ge c0674ge = (C0674ge) this.f10810c;
                String str = c0674ge.f4155a;
                C1587xd c1587xd = (C1587xd) this.f10811d;
                h00Var.getClass();
                Logger logger = h00.f4368f;
                try {
                    b32 b32VarM4384a = h00Var.f4371c.m4384a(str);
                    if (b32VarM4384a == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        h00Var.f4373e.m4581l(new g00(h00Var, c0674ge, ((C1558wl) b32VarM4384a).m6806a(c1587xd), i));
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    return;
                }
            case 4:
                C0582dx c0582dx = (C0582dx) this.f10809b;
                p32 p32Var = (p32) this.f10810c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f10811d;
                try {
                    od0 od0VarM6069m = sc2.m6069m(c0582dx.f3037a);
                    if (od0VarM6069m == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    nd0 nd0Var = (nd0) ((s50) od0VarM6069m.f9391b);
                    synchronized (nd0Var.f7376d) {
                        nd0Var.f7378f = threadPoolExecutor;
                        break;
                    }
                    ((s50) od0VarM6069m.f9391b).mo2391a(new v50(p32Var, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    p32Var.mo4711X(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 5:
                ((FirestoreClient) this.f10809b).lambda$loadBundle$19((BundleReader) this.f10810c, (LoadBundleTask) this.f10811d);
                return;
            case 6:
                ((FirestoreClient) this.f10809b).lambda$write$12((List) this.f10810c, (TaskCompletionSource) this.f10811d);
                return;
            case 7:
                ((FirestoreClient) this.f10809b).lambda$getNamedQuery$20((String) this.f10810c, (TaskCompletionSource) this.f10811d);
                return;
            case 8:
                m21 m21Var = (m21) this.f10809b;
                nm0 nm0Var = (nm0) this.f10810c;
                q21 q21Var = (q21) this.f10811d;
                C0808jy c0808jy = m21Var.f6596c;
                kk1 kk1VarM4561g = nm0Var.m4561g();
                C1470u7 c1470u7 = c0808jy.f5591d;
                ee1 ee1Var = c0808jy.f5594g;
                ee1Var.getClass();
                c1470u7.getClass();
                c1470u7.f11142b = qm0.m5567n(kk1VarM4561g);
                if (!kk1VarM4561g.isEmpty()) {
                    c1470u7.f11145e = (q21) kk1VarM4561g.get(0);
                    q21Var.getClass();
                    c1470u7.f11146f = q21Var;
                }
                if (((q21) c1470u7.f11144d) == null) {
                    c1470u7.f11144d = C1470u7.m6395f(ee1Var, (qm0) c1470u7.f11142b, (q21) c1470u7.f11145e, (r02) c1470u7.f11141a);
                }
                c1470u7.m6403k(((f80) ee1Var).m2763j());
                return;
            case 9:
                a31 a31Var = (a31) this.f10809b;
                Pair pair = (Pair) this.f10810c;
                ((C0808jy) a31Var.f42b.f2770i).mo63a(((Integer) pair.first).intValue(), (q21) pair.second, (b21) this.f10811d);
                return;
            default:
                pn0 pn0Var = (pn0) this.f10809b;
                SurfaceView surfaceView = (SurfaceView) this.f10810c;
                RunnableC1430t4 runnableC1430t4 = (RunnableC1430t4) this.f10811d;
                pn0Var.getClass();
                AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
                if (rootSurfaceControl == null) {
                    return;
                }
                SurfaceSyncGroup surfaceSyncGroupM6294b = AbstractC1449tn.m6294b();
                pn0Var.f8968a = surfaceSyncGroupM6294b;
                ki0.m3864h(surfaceSyncGroupM6294b.add(rootSurfaceControl, new RunnableC1059l5(7)));
                runnableC1430t4.run();
                rootSurfaceControl.applyTransactionOnDraw(d11.m2183f());
                return;
        }
    }

    public /* synthetic */ RunnableC1436ta(Object obj, Object obj2, Object obj3, int i) {
        this.f10808a = i;
        this.f10809b = obj;
        this.f10810c = obj2;
        this.f10811d = obj3;
    }
}

package p000;

import android.app.Activity;
import android.app.job.JobParameters;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.Surface;
import android.widget.EditText;
import androidx.fragment.app.AbstractActivityC0053q;
import androidx.media3.p003ui.PlayerView;
import com.example.ssmousepro.FloatingService;
import com.example.ssmousepro.OverlayDisplayBinder;
import com.example.ssmousepro.PlansBottomSheet;
import com.example.ssmousepro.injection.InjectionMetrics;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.LoadBundleTask;
import com.google.firebase.firestore.OnProgressListener;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.bundle.BundleMetadata;
import com.google.firebase.firestore.core.ActivityScope;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.local.LocalStore;
import com.google.firebase.firestore.remote.ConnectivityMonitor;
import com.google.firebase.firestore.remote.RemoteStore;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.BackgroundQueue;
import com.google.firebase.firestore.util.ExponentialBackoff;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: u4 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1467u4 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11113a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f11114b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f11115c;

    public /* synthetic */ RunnableC1467u4(int i, Object obj, Object obj2) {
        this.f11113a = i;
        this.f11115c = obj;
        this.f11114b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        boolean z;
        switch (this.f11113a) {
            case 0:
                ActivityScope.lambda$onFragmentActivityStopCallOnce$1((AbstractActivityC0053q) this.f11115c, (Runnable) this.f11114b);
                return;
            case 1:
                ActivityScope.lambda$onActivityStopCallOnce$0((Activity) this.f11115c, (Runnable) this.f11114b);
                return;
            case 2:
                ExecutorC1361r9 executorC1361r9 = (ExecutorC1361r9) this.f11115c;
                try {
                    ((Runnable) this.f11114b).run();
                    return;
                } finally {
                    executorC1361r9.m5745a();
                }
            case 3:
                ((AsyncQueue) this.f11115c).lambda$runDelayedTasksUntil$6((AsyncQueue.TimerId) this.f11114b);
                return;
            case 4:
                C1290pc c1290pc = (C1290pc) this.f11115c;
                synchronized (((C1422sx) this.f11114b)) {
                }
                c80 c80Var = c1290pc.f8840b;
                int i = z42.f13274a;
                C0808jy c0808jy = c80Var.f1699a.f3710r;
                c0808jy.m3724k(c0808jy.m3720g((q21) c0808jy.f5591d.f11145e), 1013, new C0583dy(16));
                return;
            case 5:
                ((BackgroundQueue) this.f11115c).lambda$execute$0((Runnable) this.f11114b);
                return;
            case 6:
                pn0 pn0Var = (pn0) this.f11115c;
                C0662g2 c0662g2 = (C0662g2) this.f11114b;
                C1290pc c1290pc2 = ((a11) pn0Var.f8968a).f11I0;
                Handler handler = c1290pc2.f8839a;
                if (handler != null) {
                    handler.post(new RunnableC1140nc(c1290pc2, c0662g2, 2));
                    return;
                }
                return;
            case 7:
                f80 f80Var = (f80) this.f11115c;
                i80 i80Var = (i80) this.f11114b;
                int i2 = f80Var.f3665H - i80Var.f4862b;
                f80Var.f3665H = i2;
                boolean z2 = true;
                if (i80Var.f4865e) {
                    f80Var.f3666I = i80Var.f4863c;
                    f80Var.f3667J = true;
                }
                if (i2 == 0) {
                    t02 t02Var = ((sd1) i80Var.f4866f).f10371a;
                    if (!f80Var.f3697g0.f10371a.m6176p() && t02Var.m6176p()) {
                        f80Var.f3699h0 = -1;
                        f80Var.f3701i0 = 0L;
                    }
                    if (!t02Var.m6176p()) {
                        List listAsList = Arrays.asList(((gf1) t02Var).f4181h);
                        ki0.m3864h(listAsList.size() == f80Var.f3707o.size());
                        for (int i3 = 0; i3 < listAsList.size(); i3++) {
                            ((e80) f80Var.f3707o.get(i3)).f3283b = (t02) listAsList.get(i3);
                        }
                    }
                    long j2 = -9223372036854775807L;
                    if (f80Var.f3667J) {
                        if (((sd1) i80Var.f4866f).f10372b.equals(f80Var.f3697g0.f10372b) && ((sd1) i80Var.f4866f).f10374d == f80Var.f3697g0.f10389s) {
                            z2 = false;
                        }
                        if (z2) {
                            if (t02Var.m6176p() || ((sd1) i80Var.f4866f).f10372b.m5438b()) {
                                j2 = ((sd1) i80Var.f4866f).f10374d;
                            } else {
                                sd1 sd1Var = (sd1) i80Var.f4866f;
                                q21 q21Var = sd1Var.f10372b;
                                long j3 = sd1Var.f10374d;
                                Object obj = q21Var.f9309a;
                                r02 r02Var = f80Var.f3706n;
                                t02Var.mo2973g(obj, r02Var);
                                j2 = j3 + r02Var.f9653e;
                            }
                        }
                        j = j2;
                        z = z2;
                    } else {
                        j = -9223372036854775807L;
                        z = false;
                    }
                    f80Var.f3667J = false;
                    f80Var.m2751L((sd1) i80Var.f4866f, 1, z, f80Var.f3666I, j, -1, false);
                    return;
                }
                return;
            case 8:
                ((ExponentialBackoff) this.f11115c).lambda$backoffAndRun$0((Runnable) this.f11114b);
                return;
            case 9:
                ((FirebaseFirestore) this.f11115c).lambda$clearPersistence$5((TaskCompletionSource) this.f11114b);
                return;
            case 10:
                ((FirestoreClient) this.f11115c).lambda$waitForPendingWrites$17((TaskCompletionSource) this.f11114b);
                return;
            case 11:
                ((FirestoreClient) this.f11115c).lambda$new$1((User) this.f11114b);
                return;
            case 12:
                ((FirestoreClient) this.f11115c).lambda$configureFieldIndexes$21((List) this.f11114b);
                return;
            case 13:
                FloatingService.iniciarMonitoramentoDeTela$lambda$346$lambda$345((FloatingService) this.f11115c, (String) this.f11114b);
                return;
            case 14:
                FloatingService.mostrarDialogoNumeroComp$lambda$23$lambda$22((FloatingService) this.f11115c, (EditText) this.f11114b);
                return;
            case 15:
                FloatingService.sincronizarDisplayInjecao$lambda$25((OverlayDisplayBinder.Alvo) this.f11115c, (DisplayMetrics) this.f11114b);
                return;
            case 16:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f11115c;
                JobParameters jobParameters = (JobParameters) this.f11114b;
                int i4 = JobInfoSchedulerService.f1924a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 17:
                ((LoadBundleTask) this.f11115c).lambda$addOnProgressListener$0((OnProgressListener) this.f11114b);
                return;
            case 18:
                ((LocalStore) this.f11115c).lambda$saveBundle$10((BundleMetadata) this.f11114b);
                return;
            case 19:
                ((LocalStore) this.f11115c).lambda$setLastStreamToken$5((AbstractC0753ik) this.f11114b);
                return;
            case 20:
                ((InterfaceC0578dt) this.f11115c).accept((v21) this.f11114b);
                return;
            case 21:
                ((C1460ty) this.f11114b).m6353a(((l81) this.f11115c).m4143d());
                return;
            case 22:
                ((PlansBottomSheet) this.f11115c).mostrarErro((String) this.f11114b);
                return;
            case 23:
                PlansBottomSheet.lambda$7$lambda$6((ul1) this.f11115c, (PlansBottomSheet) this.f11114b);
                return;
            case 24:
                PlayerView.m445a((PlayerView) this.f11115c, (Bitmap) this.f11114b);
                return;
            case 25:
                ((wg1) this.f11115c).m6778A((kq1) this.f11114b);
                return;
            case InjectionMetrics.I_MAX_ACTIVE_REJ /* 26 */:
                ((RemoteStore) this.f11115c).lambda$new$0((ConnectivityMonitor.NetworkStatus) this.f11114b);
                return;
            case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                ((AbstractC1337qm) this.f11115c).mo4488N((Typeface) this.f11114b);
                return;
            case InjectionMetrics.I_AIM_LOOP_TICKS /* 28 */:
                ss1 ss1Var = (ss1) this.f11115c;
                IBinder iBinder = (IBinder) this.f11114b;
                Iterator it = ss1Var.f10539a.iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(ss1Var.f10540b, iBinder);
                }
                return;
            default:
                lu1 lu1Var = (lu1) this.f11115c;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f11114b;
                SurfaceTexture surfaceTexture2 = lu1Var.f6518g;
                Surface surface = lu1Var.f6519m;
                Surface surface2 = new Surface(surfaceTexture);
                lu1Var.f6518g = surfaceTexture;
                lu1Var.f6519m = surface2;
                Iterator it2 = lu1Var.f6512a.iterator();
                while (it2.hasNext()) {
                    ((c80) it2.next()).f1699a.m2748I(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
        }
    }
}

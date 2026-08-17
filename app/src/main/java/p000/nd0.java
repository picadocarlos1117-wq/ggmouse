package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class nd0 implements s50 {

    /* JADX INFO: renamed from: a */
    public final Context f7373a;

    /* JADX INFO: renamed from: b */
    public final hv0 f7374b;

    /* JADX INFO: renamed from: c */
    public final bz1 f7375c;

    /* JADX INFO: renamed from: d */
    public final Object f7376d = new Object();

    /* JADX INFO: renamed from: e */
    public Handler f7377e;

    /* JADX INFO: renamed from: f */
    public ThreadPoolExecutor f7378f;

    /* JADX INFO: renamed from: g */
    public ThreadPoolExecutor f7379g;

    /* JADX INFO: renamed from: h */
    public p32 f7380h;

    public nd0(Context context, hv0 hv0Var) {
        rc2.m5789j(context, "Context cannot be null");
        this.f7373a = context.getApplicationContext();
        this.f7374b = hv0Var;
        this.f7375c = od0.f7760d;
    }

    @Override // p000.s50
    /* JADX INFO: renamed from: a */
    public final void mo2391a(p32 p32Var) {
        synchronized (this.f7376d) {
            this.f7380h = p32Var;
        }
        synchronized (this.f7376d) {
            try {
                if (this.f7380h == null) {
                    return;
                }
                if (this.f7378f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC1638yr("emojiCompat", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f7379g = threadPoolExecutor;
                    this.f7378f = threadPoolExecutor;
                }
                this.f7378f.execute(new RunnableC1430t4(this, 17));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4529b() {
        synchronized (this.f7376d) {
            try {
                this.f7380h = null;
                Handler handler = this.f7377e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f7377e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f7379g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f7378f = null;
                this.f7379g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final yd0 m4530c() {
        try {
            bz1 bz1Var = this.f7375c;
            Context context = this.f7373a;
            hv0 hv0Var = this.f7374b;
            bz1Var.getClass();
            C1296pi c1296piM5146L = p32.m5146L(context, hv0Var);
            int i = c1296piM5146L.f8901a;
            if (i != 0) {
                l41.m4048q(jd0.m3610h(i, "fetchFonts failed (", ")"));
                return null;
            }
            yd0[] yd0VarArr = (yd0[]) c1296piM5146L.f8902b;
            if (yd0VarArr != null && yd0VarArr.length != 0) {
                return yd0VarArr[0];
            }
            l41.m4048q("fetchFonts failed (empty result)");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            l41.m4043l("provider not found", e);
            return null;
        }
    }
}

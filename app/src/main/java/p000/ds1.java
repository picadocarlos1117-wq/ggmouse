package p000;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ds1 {

    /* JADX INFO: renamed from: d */
    public static final ds1 f3007d = new ds1(new pu0(10));

    /* JADX INFO: renamed from: a */
    public final IdentityHashMap f3008a = new IdentityHashMap();

    /* JADX INFO: renamed from: b */
    public final pu0 f3009b;

    /* JADX INFO: renamed from: c */
    public ScheduledExecutorService f3010c;

    public ds1(pu0 pu0Var) {
        this.f3009b = pu0Var;
    }

    /* JADX INFO: renamed from: a */
    public static Object m2384a(cs1 cs1Var) {
        Object obj;
        ds1 ds1Var = f3007d;
        synchronized (ds1Var) {
            try {
                bs1 bs1Var = (bs1) ds1Var.f3008a.get(cs1Var);
                if (bs1Var == null) {
                    bs1Var = new bs1(cs1Var.mo1082e());
                    ds1Var.f3008a.put(cs1Var, bs1Var);
                }
                ScheduledFuture scheduledFuture = bs1Var.f1515c;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    bs1Var.f1515c = null;
                }
                bs1Var.f1514b++;
                obj = bs1Var.f1513a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: b */
    public static void m2385b(cs1 cs1Var, Object obj) {
        ds1 ds1Var = f3007d;
        synchronized (ds1Var) {
            try {
                bs1 bs1Var = (bs1) ds1Var.f3008a.get(cs1Var);
                if (bs1Var == null) {
                    throw new IllegalArgumentException("No cached instance found for " + cs1Var);
                }
                p32.m5177l(obj == bs1Var.f1513a, "Releasing the wrong instance");
                p32.m5193x(bs1Var.f1514b > 0, "Refcount has already reached zero");
                int i = bs1Var.f1514b - 1;
                bs1Var.f1514b = i;
                if (i == 0) {
                    p32.m5193x(bs1Var.f1515c == null, "Destroy task already scheduled");
                    if (ds1Var.f3010c == null) {
                        ds1Var.f3009b.getClass();
                        ds1Var.f3010c = Executors.newSingleThreadScheduledExecutor(vi0.m6633e("grpc-shared-destroyer-%d"));
                    }
                    bs1Var.f1515c = ds1Var.f3010c.schedule(new tv0(new RunnableC1091m0(ds1Var, bs1Var, cs1Var, obj, 4)), 1L, TimeUnit.SECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class qx0 extends WeakReference {

    /* JADX INFO: renamed from: f */
    public static final boolean f9597f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

    /* JADX INFO: renamed from: g */
    public static final RuntimeException f9598g;

    /* JADX INFO: renamed from: a */
    public final ReferenceQueue f9599a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentMap f9600b;

    /* JADX INFO: renamed from: c */
    public final String f9601c;

    /* JADX INFO: renamed from: d */
    public final SoftReference f9602d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f9603e;

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        f9598g = runtimeException;
    }

    public qx0(rx0 rx0Var, ox0 ox0Var, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(rx0Var, referenceQueue);
        this.f9603e = new AtomicBoolean();
        this.f9602d = new SoftReference(f9597f ? new RuntimeException("ManagedChannel allocation site") : f9598g);
        this.f9601c = ox0Var.toString();
        this.f9599a = referenceQueue;
        this.f9600b = concurrentMap;
        concurrentMap.put(this, this);
        m5618a(referenceQueue);
    }

    /* JADX INFO: renamed from: a */
    public static void m5618a(ReferenceQueue referenceQueue) {
        while (true) {
            qx0 qx0Var = (qx0) referenceQueue.poll();
            if (qx0Var == null) {
                return;
            }
            SoftReference softReference = qx0Var.f9602d;
            RuntimeException runtimeException = (RuntimeException) softReference.get();
            super.clear();
            qx0Var.f9600b.remove(qx0Var);
            softReference.clear();
            if (!qx0Var.f9603e.get()) {
                Level level = Level.SEVERE;
                Logger logger = rx0.f10154m;
                if (logger.isLoggable(level)) {
                    LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                    logRecord.setLoggerName(logger.getName());
                    logRecord.setParameters(new Object[]{qx0Var.f9601c});
                    logRecord.setThrown(runtimeException);
                    logger.log(logRecord);
                }
            }
        }
    }

    @Override // java.lang.ref.Reference
    public final void clear() {
        super.clear();
        this.f9600b.remove(this);
        this.f9602d.clear();
        m5618a(this.f9599a);
    }
}

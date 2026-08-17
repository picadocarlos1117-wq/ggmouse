package p000;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: b2 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0084b2 implements vt0 {
    static final AbstractC1390s1 ATOMIC_HELPER;
    private static final Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    volatile C1538w1 listeners;
    volatile Object value;
    volatile C0003a2 waiters;
    static final boolean GENERATE_CANCELLATION_CAUSES = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger log = Logger.getLogger(AbstractC0084b2.class.getName());

    static {
        AbstractC1390s1 c1649z1;
        try {
            c1649z1 = new C1575x1(AtomicReferenceFieldUpdater.newUpdater(C0003a2.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0003a2.class, C0003a2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0084b2.class, C0003a2.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0084b2.class, C1538w1.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0084b2.class, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c1649z1 = new C1649z1();
        }
        ATOMIC_HELPER = c1649z1;
        if (th != null) {
            log.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        NULL = new Object();
    }

    /* JADX INFO: renamed from: b */
    public static void m826b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            log.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static Object m827c(Object obj) throws ExecutionException {
        if (obj instanceof C1427t1) {
            Throwable th = ((C1427t1) obj).f10694b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C1501v1) {
            throw new ExecutionException(((C1501v1) obj).f11478a);
        }
        if (obj == NULL) {
            return null;
        }
        return obj;
    }

    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }

    public static void complete(AbstractC0084b2 abstractC0084b2) {
        C1538w1 c1538w1;
        C1538w1 c1538w2;
        C1538w1 c1538w3 = null;
        while (true) {
            C0003a2 c0003a2 = abstractC0084b2.waiters;
            if (ATOMIC_HELPER.mo5936c(abstractC0084b2, c0003a2, C0003a2.f24c)) {
                while (c0003a2 != null) {
                    Thread thread = c0003a2.f25a;
                    if (thread != null) {
                        c0003a2.f25a = null;
                        LockSupport.unpark(thread);
                    }
                    c0003a2 = c0003a2.f26b;
                }
                abstractC0084b2.afterDone();
                do {
                    c1538w1 = abstractC0084b2.listeners;
                } while (!ATOMIC_HELPER.mo5934a(abstractC0084b2, c1538w1, C1538w1.f11889d));
                while (true) {
                    c1538w2 = c1538w3;
                    c1538w3 = c1538w1;
                    if (c1538w3 == null) {
                        break;
                    }
                    c1538w1 = c1538w3.f11892c;
                    c1538w3.f11892c = c1538w2;
                }
                while (c1538w2 != null) {
                    c1538w3 = c1538w2.f11892c;
                    Runnable runnable = c1538w2.f11890a;
                    if (runnable instanceof RunnableC1612y1) {
                        RunnableC1612y1 runnableC1612y1 = (RunnableC1612y1) runnable;
                        abstractC0084b2 = runnableC1612y1.f12800a;
                        if (abstractC0084b2.value == runnableC1612y1) {
                            if (ATOMIC_HELPER.mo5935b(abstractC0084b2, runnableC1612y1, getFutureValue(runnableC1612y1.f12801b))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m826b(runnable, c1538w2.f11891b);
                    }
                    c1538w2 = c1538w3;
                }
                return;
            }
        }
    }

    public static Object getFutureValue(vt0 vt0Var) {
        if (vt0Var instanceof AbstractC0084b2) {
            Object obj = ((AbstractC0084b2) vt0Var).value;
            if (!(obj instanceof C1427t1)) {
                return obj;
            }
            C1427t1 c1427t1 = (C1427t1) obj;
            if (c1427t1.f10693a) {
                return c1427t1.f10694b != null ? new C1427t1(false, c1427t1.f10694b) : C1427t1.f10692d;
            }
            return obj;
        }
        boolean zIsCancelled = vt0Var.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) && zIsCancelled) {
            return C1427t1.f10692d;
        }
        try {
            Object uninterruptibly = getUninterruptibly(vt0Var);
            return uninterruptibly == null ? NULL : uninterruptibly;
        } catch (CancellationException e) {
            if (zIsCancelled) {
                return new C1427t1(false, e);
            }
            return new C1501v1(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + vt0Var, e));
        } catch (ExecutionException e2) {
            return new C1501v1(e2.getCause());
        } catch (Throwable th) {
            return new C1501v1(th);
        }
    }

    public static <V> V getUninterruptibly(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* JADX INFO: renamed from: a */
    public final void m828a(StringBuilder sb) {
        try {
            Object uninterruptibly = getUninterruptibly(this);
            sb.append("SUCCESS, result=[");
            sb.append(uninterruptibly == this ? "this future" : String.valueOf(uninterruptibly));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // p000.vt0
    public final void addListener(Runnable runnable, Executor executor) {
        checkNotNull(runnable);
        checkNotNull(executor);
        C1538w1 c1538w1 = this.listeners;
        C1538w1 c1538w2 = C1538w1.f11889d;
        if (c1538w1 != c1538w2) {
            C1538w1 c1538w3 = new C1538w1(runnable, executor);
            do {
                c1538w3.f11892c = c1538w1;
                if (ATOMIC_HELPER.mo5934a(this, c1538w1, c1538w3)) {
                    return;
                } else {
                    c1538w1 = this.listeners;
                }
            } while (c1538w1 != c1538w2);
        }
        m826b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C1427t1 c1427t1;
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof RunnableC1612y1)) {
            return false;
        }
        if (GENERATE_CANCELLATION_CAUSES) {
            c1427t1 = new C1427t1(z, new CancellationException("Future.cancel() was called."));
        } else {
            c1427t1 = z ? C1427t1.f10691c : C1427t1.f10692d;
        }
        boolean z2 = false;
        while (true) {
            if (ATOMIC_HELPER.mo5935b(this, obj, c1427t1)) {
                if (z) {
                    this.interruptTask();
                }
                complete(this);
                if (obj instanceof RunnableC1612y1) {
                    vt0 vt0Var = ((RunnableC1612y1) obj).f12801b;
                    if (vt0Var instanceof AbstractC0084b2) {
                        this = (AbstractC0084b2) vt0Var;
                        obj = this.value;
                        if ((obj == null) | (obj instanceof RunnableC1612y1)) {
                            z2 = true;
                        }
                    } else {
                        vt0Var.cancel(z);
                    }
                }
                return true;
            }
            obj = this.value;
            if (!(obj instanceof RunnableC1612y1)) {
                return z2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m829d(C0003a2 c0003a2) {
        c0003a2.f25a = null;
        while (true) {
            C0003a2 c0003a3 = this.waiters;
            if (c0003a3 == C0003a2.f24c) {
                return;
            }
            C0003a2 c0003a4 = null;
            while (c0003a3 != null) {
                C0003a2 c0003a5 = c0003a3.f26b;
                if (c0003a3.f25a != null) {
                    c0003a4 = c0003a3;
                } else if (c0003a4 != null) {
                    c0003a4.f26b = c0003a5;
                    if (c0003a4.f25a == null) {
                    }
                } else if (!ATOMIC_HELPER.mo5936c(this, c0003a3, c0003a5)) {
                }
                c0003a3 = c0003a5;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        C0003a2 c0003a2 = C0003a2.f24c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) && (!(obj instanceof RunnableC1612y1))) {
            return m827c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C0003a2 c0003a3 = this.waiters;
            if (c0003a3 != c0003a2) {
                C0003a2 c0003a4 = new C0003a2();
                z = true;
                while (true) {
                    AbstractC1390s1 abstractC1390s1 = ATOMIC_HELPER;
                    abstractC1390s1.mo5937d(c0003a4, c0003a3);
                    if (abstractC1390s1.mo5936c(this, c0003a3, c0003a4)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m829d(c0003a4);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC1612y1))) {
                                return m827c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m829d(c0003a4);
                        break;
                    }
                    c0003a3 = this.waiters;
                    if (c0003a3 == c0003a2) {
                    }
                }
            }
            return m827c(this.value);
        }
        z = true;
        while (nanos > 0) {
            Object obj3 = this.value;
            if ((obj3 != null ? z : false) && (!(obj3 instanceof RunnableC1612y1))) {
                return m827c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z2 = (jConvert == 0 || nanos2 > 1000) ? z : false;
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z2) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z2) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(AbstractC1308pu.m5340g(strConcat, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof C1427t1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof RunnableC1612y1)) & (obj != null);
    }

    public final void maybePropagateCancellationTo(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String pendingToString() {
        Object obj = this.value;
        if (obj instanceof RunnableC1612y1) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            vt0 vt0Var = ((RunnableC1612y1) obj).f12801b;
            return AbstractC1308pu.m5342i(sb, vt0Var == this ? "this future" : String.valueOf(vt0Var), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public boolean set(Object obj) {
        if (obj == null) {
            obj = NULL;
        }
        if (!ATOMIC_HELPER.mo5935b(this, null, obj)) {
            return false;
        }
        complete(this);
        return true;
    }

    public boolean setException(Throwable th) {
        if (!ATOMIC_HELPER.mo5935b(this, null, new C1501v1((Throwable) checkNotNull(th)))) {
            return false;
        }
        complete(this);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public boolean setFuture(vt0 vt0Var) {
        C1501v1 c1501v1;
        checkNotNull(vt0Var);
        Object obj = this.value;
        if (obj != null) {
            if (obj instanceof C1427t1) {
                vt0Var.cancel(((C1427t1) obj).f10693a);
            }
        } else if (vt0Var.isDone()) {
            if (ATOMIC_HELPER.mo5935b(this, null, getFutureValue(vt0Var))) {
                complete(this);
                return true;
            }
        } else {
            RunnableC1612y1 runnableC1612y1 = new RunnableC1612y1(this, vt0Var);
            if (ATOMIC_HELPER.mo5935b(this, null, runnableC1612y1)) {
                try {
                    vt0Var.addListener(runnableC1612y1, s20.f10205a);
                    return true;
                } catch (Throwable th) {
                    try {
                        c1501v1 = new C1501v1(th);
                    } catch (Throwable unused) {
                        c1501v1 = C1501v1.f11477b;
                    }
                    ATOMIC_HELPER.mo5935b(this, runnableC1612y1, c1501v1);
                    return true;
                }
            }
            obj = this.value;
            if (obj instanceof C1427t1) {
                vt0Var.cancel(((C1427t1) obj).f10693a);
            }
        }
        return false;
    }

    public String toString() {
        String strPendingToString;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m828a(sb);
        } else {
            try {
                strPendingToString = pendingToString();
            } catch (RuntimeException e) {
                strPendingToString = "Exception thrown from implementation: " + e.getClass();
            }
            if (strPendingToString != null && !strPendingToString.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strPendingToString);
                sb.append("]");
            } else if (isDone()) {
                m828a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof C1427t1) && ((C1427t1) obj).f10693a;
    }

    public void afterDone() {
    }

    public void interruptTask() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        C0003a2 c0003a2 = C0003a2.f24c;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC1612y1))) {
                return m827c(obj2);
            }
            C0003a2 c0003a3 = this.waiters;
            if (c0003a3 != c0003a2) {
                C0003a2 c0003a4 = new C0003a2();
                do {
                    AbstractC1390s1 abstractC1390s1 = ATOMIC_HELPER;
                    abstractC1390s1.mo5937d(c0003a4, c0003a3);
                    if (abstractC1390s1.mo5936c(this, c0003a3, c0003a4)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                m829d(c0003a4);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC1612y1))));
                        return m827c(obj);
                    }
                    c0003a3 = this.waiters;
                } while (c0003a3 != c0003a2);
            }
            return m827c(this.value);
        }
        throw new InterruptedException();
    }
}

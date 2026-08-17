package p000;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class i02 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ThreadFactory f4763a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f4764b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AtomicLong f4765c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Boolean f4766d;

    public i02(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool) {
        this.f4763a = threadFactory;
        this.f4764b = str;
        this.f4765c = atomicLong;
        this.f4766d = bool;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f4763a.newThread(runnable);
        Objects.requireNonNull(threadNewThread);
        AtomicLong atomicLong = this.f4765c;
        Objects.requireNonNull(atomicLong);
        threadNewThread.setName(String.format(Locale.ROOT, this.f4764b, Long.valueOf(atomicLong.getAndIncrement())));
        Boolean bool = this.f4766d;
        if (bool != null) {
            threadNewThread.setDaemon(bool.booleanValue());
        }
        return threadNewThread;
    }
}

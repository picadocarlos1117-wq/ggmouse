package p000;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: yr */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC1638yr implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13049a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f13050b;

    public /* synthetic */ ThreadFactoryC1638yr(String str, int i) {
        this.f13049a = i;
        this.f13050b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.f13049a;
        String str = this.f13050b;
        switch (i) {
            case 0:
                Thread thread = new Thread(runnable, str);
                thread.setPriority(10);
                return thread;
            default:
                return new Thread(runnable, str);
        }
    }
}

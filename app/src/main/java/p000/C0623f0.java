package p000;

import io.github.muntashirakon.adb.AbsAdbConnectionManager;
import io.github.muntashirakon.adb.android.AdbMdns;
import java.net.InetAddress;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: f0 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0623f0 implements AdbMdns.OnAdbDaemonDiscoveredListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3504a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AtomicReference f3505b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AtomicInteger f3506c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CountDownLatch f3507d;

    public /* synthetic */ C0623f0(AtomicReference atomicReference, AtomicInteger atomicInteger, CountDownLatch countDownLatch, int i) {
        this.f3504a = i;
        this.f3505b = atomicReference;
        this.f3506c = atomicInteger;
        this.f3507d = countDownLatch;
    }

    @Override // io.github.muntashirakon.adb.android.AdbMdns.OnAdbDaemonDiscoveredListener
    public final void onPortChanged(InetAddress inetAddress, int i) {
        int i2 = this.f3504a;
        CountDownLatch countDownLatch = this.f3507d;
        AtomicInteger atomicInteger = this.f3506c;
        AtomicReference atomicReference = this.f3505b;
        switch (i2) {
            case 0:
                AbsAdbConnectionManager.lambda$autoConnect$0(atomicReference, atomicInteger, countDownLatch, inetAddress, i);
                break;
            case 1:
                AbsAdbConnectionManager.lambda$autoConnect$1(atomicReference, atomicInteger, countDownLatch, inetAddress, i);
                break;
            default:
                AbsAdbConnectionManager.lambda$autoConnect$2(atomicReference, atomicInteger, countDownLatch, inetAddress, i);
                break;
        }
    }
}

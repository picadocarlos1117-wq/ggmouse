package p000;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;

/* JADX INFO: renamed from: eb */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0597eb extends Thread {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3305a = 0;

    public /* synthetic */ C0597eb(String str) {
        super(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f3305a) {
            case 0:
                break;
            default:
                DebugProbesImpl.startWeakRefCleanerThread$lambda$2();
                return;
        }
        while (true) {
            try {
                ReentrantLock reentrantLock = C0708hb.f4496h;
                reentrantLock.lock();
                try {
                    C0708hb c0708hbM3215f = hp0.m3215f();
                    if (c0708hbM3215f == C0708hb.f4500l) {
                        C0708hb.f4500l = null;
                        reentrantLock.unlock();
                        return;
                    } else {
                        reentrantLock.unlock();
                        if (c0708hbM3215f != null) {
                            c0708hbM3215f.mo3124j();
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
        }
    }

    public C0597eb(C1348qx c1348qx) {
    }
}

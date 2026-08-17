package p000;

import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: nb */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1139nb {

    /* JADX INFO: renamed from: g */
    public static final ArrayDeque f7339g = new ArrayDeque();

    /* JADX INFO: renamed from: h */
    public static final Object f7340h = new Object();

    /* JADX INFO: renamed from: a */
    public final MediaCodec f7341a;

    /* JADX INFO: renamed from: b */
    public final HandlerThread f7342b;

    /* JADX INFO: renamed from: c */
    public HandlerC1170o5 f7343c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference f7344d;

    /* JADX INFO: renamed from: e */
    public final C0073as f7345e;

    /* JADX INFO: renamed from: f */
    public boolean f7346f;

    public C1139nb(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C0073as c0073as = new C0073as();
        this.f7341a = mediaCodec;
        this.f7342b = handlerThread;
        this.f7345e = c0073as;
        this.f7344d = new AtomicReference();
    }

    /* JADX INFO: renamed from: b */
    public static C1102mb m4513b() {
        ArrayDeque arrayDeque = f7339g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new C1102mb();
                }
                return (C1102mb) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4514a() {
        if (this.f7346f) {
            try {
                HandlerC1170o5 handlerC1170o5 = this.f7343c;
                handlerC1170o5.getClass();
                handlerC1170o5.removeCallbacksAndMessages(null);
                C0073as c0073as = this.f7345e;
                synchronized (c0073as) {
                    c0073as.f1039a = false;
                }
                HandlerC1170o5 handlerC1170o6 = this.f7343c;
                handlerC1170o6.getClass();
                handlerC1170o6.obtainMessage(3).sendToTarget();
                synchronized (c0073as) {
                    while (!c0073as.f1039a) {
                        c0073as.wait();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                lv1.m4302n(e);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4515c() {
        RuntimeException runtimeException = (RuntimeException) this.f7344d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }
}

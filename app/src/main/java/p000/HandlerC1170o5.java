package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: o5 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC1170o5 extends Handler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7662a;

    /* JADX INFO: renamed from: b */
    public Object f7663b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerC1170o5(Object obj, Looper looper, int i) {
        super(looper);
        this.f7662a = i;
        this.f7663b = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        qo0[] qo0VarArr;
        switch (this.f7662a) {
            case 0:
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f7663b).get(), message.what);
                    return;
                } else {
                    if (i != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
            case 1:
                C1139nb c1139nb = (C1139nb) this.f7663b;
                int i2 = message.what;
                C1102mb c1102mb = null;
                if (i2 == 1) {
                    C1102mb c1102mb2 = (C1102mb) message.obj;
                    try {
                        c1139nb.f7341a.queueInputBuffer(c1102mb2.f6734a, 0, c1102mb2.f6735b, c1102mb2.f6737d, c1102mb2.f6738e);
                        break;
                    } catch (RuntimeException e) {
                        AtomicReference atomicReference = c1139nb.f7344d;
                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                        }
                    }
                    c1102mb = c1102mb2;
                } else if (i2 == 2) {
                    C1102mb c1102mb3 = (C1102mb) message.obj;
                    int i3 = c1102mb3.f6734a;
                    MediaCodec.CryptoInfo cryptoInfo = c1102mb3.f6736c;
                    long j = c1102mb3.f6737d;
                    int i4 = c1102mb3.f6738e;
                    try {
                        synchronized (C1139nb.f7340h) {
                            c1139nb.f7341a.queueSecureInputBuffer(i3, 0, cryptoInfo, j, i4);
                            break;
                        }
                    } catch (RuntimeException e2) {
                        AtomicReference atomicReference2 = c1139nb.f7344d;
                        while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                        }
                    }
                    c1102mb = c1102mb3;
                } else if (i2 == 3) {
                    c1139nb.f7345e.m699a();
                } else if (i2 != 4) {
                    AtomicReference atomicReference3 = c1139nb.f7344d;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(i2));
                    while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                    }
                } else {
                    try {
                        c1139nb.f7341a.setParameters((Bundle) message.obj);
                        break;
                    } catch (RuntimeException e3) {
                        AtomicReference atomicReference4 = c1139nb.f7344d;
                        while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                        }
                    }
                }
                if (c1102mb != null) {
                    ArrayDeque arrayDeque = C1139nb.f7339g;
                    synchronized (arrayDeque) {
                        arrayDeque.add(c1102mb);
                        break;
                    }
                    return;
                }
                return;
            default:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                hv0 hv0Var = (hv0) this.f7663b;
                while (true) {
                    synchronized (((HashMap) hv0Var.f4722c)) {
                        try {
                            size = ((ArrayList) hv0Var.f4724e).size();
                            if (size <= 0) {
                                return;
                            }
                            qo0VarArr = new qo0[size];
                            ((ArrayList) hv0Var.f4724e).toArray(qo0VarArr);
                            ((ArrayList) hv0Var.f4724e).clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        qo0 qo0Var = qo0VarArr[i5];
                        int size2 = ((ArrayList) qo0Var.f9549c).size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            gv0 gv0Var = (gv0) ((ArrayList) qo0Var.f9549c).get(i6);
                            if (!gv0Var.f4335d) {
                                gv0Var.f4333b.onReceive((Context) hv0Var.f4721b, (Intent) qo0Var.f9548b);
                            }
                        }
                    }
                }
                break;
        }
    }
}

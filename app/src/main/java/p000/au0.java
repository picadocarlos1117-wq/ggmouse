package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class au0 {

    /* JADX INFO: renamed from: a */
    public final xy1 f1046a;

    /* JADX INFO: renamed from: b */
    public final zy1 f1047b;

    /* JADX INFO: renamed from: c */
    public final yt0 f1048c;

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArraySet f1049d;

    /* JADX INFO: renamed from: e */
    public final ArrayDeque f1050e;

    /* JADX INFO: renamed from: f */
    public final ArrayDeque f1051f;

    /* JADX INFO: renamed from: g */
    public final Object f1052g;

    /* JADX INFO: renamed from: h */
    public boolean f1053h;

    /* JADX INFO: renamed from: i */
    public final boolean f1054i;

    public au0(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, xy1 xy1Var, yt0 yt0Var, boolean z) {
        this.f1046a = xy1Var;
        this.f1049d = copyOnWriteArraySet;
        this.f1048c = yt0Var;
        this.f1052g = new Object();
        this.f1050e = new ArrayDeque();
        this.f1051f = new ArrayDeque();
        this.f1047b = xy1Var.m6981a(looper, new Handler.Callback() { // from class: wt0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                au0 au0Var = this.f12291a;
                for (zt0 zt0Var : au0Var.f1049d) {
                    yt0 yt0Var2 = au0Var.f1048c;
                    if (!zt0Var.f13561d && zt0Var.f13560c) {
                        eb0 eb0VarM4551c = zt0Var.f13559b.m4551c();
                        zt0Var.f13559b = new C1146ni();
                        zt0Var.f13560c = false;
                        yt0Var2.mo2405a(zt0Var.f13558a, eb0VarM4551c);
                    }
                    if (au0Var.f1047b.f13615a.hasMessages(1)) {
                        break;
                    }
                }
                return true;
            }
        });
        this.f1054i = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m710a(Object obj) {
        obj.getClass();
        synchronized (this.f1052g) {
            try {
                if (this.f1053h) {
                    return;
                }
                this.f1049d.add(new zt0(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m711b() {
        m715f();
        ArrayDeque arrayDeque = this.f1051f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        zy1 zy1Var = this.f1047b;
        Handler handler = zy1Var.f13615a;
        Handler handler2 = zy1Var.f13615a;
        if (!handler.hasMessages(1)) {
            yy1 yy1VarM7385b = zy1.m7385b();
            Message messageObtainMessage = handler2.obtainMessage(1);
            yy1VarM7385b.f13169a = messageObtainMessage;
            messageObtainMessage.getClass();
            handler2.sendMessageAtFrontOfQueue(messageObtainMessage);
            yy1VarM7385b.m7163a();
        }
        ArrayDeque arrayDeque2 = this.f1050e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m712c(int i, xt0 xt0Var) {
        m715f();
        this.f1051f.add(new d20(new CopyOnWriteArraySet(this.f1049d), i, 1, xt0Var));
    }

    /* JADX INFO: renamed from: d */
    public final void m713d() {
        m715f();
        synchronized (this.f1052g) {
            this.f1053h = true;
        }
        for (zt0 zt0Var : this.f1049d) {
            yt0 yt0Var = this.f1048c;
            zt0Var.f13561d = true;
            if (zt0Var.f13560c) {
                zt0Var.f13560c = false;
                yt0Var.mo2405a(zt0Var.f13558a, zt0Var.f13559b.m4551c());
            }
        }
        this.f1049d.clear();
    }

    /* JADX INFO: renamed from: e */
    public final void m714e(int i, xt0 xt0Var) {
        m712c(i, xt0Var);
        m711b();
    }

    /* JADX INFO: renamed from: f */
    public final void m715f() {
        if (this.f1054i) {
            ki0.m3864h(Thread.currentThread() == this.f1047b.f13615a.getLooper().getThread());
        }
    }

    public au0(Looper looper, xy1 xy1Var, yt0 yt0Var) {
        this(new CopyOnWriteArraySet(), looper, xy1Var, yt0Var, true);
    }
}

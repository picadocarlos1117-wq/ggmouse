package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class xc2 {

    /* JADX INFO: renamed from: o */
    public static final HashMap f12561o = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Context f12562a;

    /* JADX INFO: renamed from: b */
    public final pd2 f12563b;

    /* JADX INFO: renamed from: c */
    public final String f12564c;

    /* JADX INFO: renamed from: g */
    public boolean f12568g;

    /* JADX INFO: renamed from: h */
    public final Intent f12569h;

    /* JADX INFO: renamed from: i */
    public final td2 f12570i;

    /* JADX INFO: renamed from: m */
    public wc2 f12574m;

    /* JADX INFO: renamed from: n */
    public IInterface f12575n;

    /* JADX INFO: renamed from: d */
    public final ArrayList f12565d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final HashSet f12566e = new HashSet();

    /* JADX INFO: renamed from: f */
    public final Object f12567f = new Object();

    /* JADX INFO: renamed from: k */
    public final rd2 f12572k = new IBinder.DeathRecipient() { // from class: rd2
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            xc2 xc2Var = this.f9912a;
            int i = 0;
            xc2Var.f12563b.m5254b("reportBinderDeath", new Object[0]);
            if (xc2Var.f12571j.get() != null) {
                l41.m4035b();
                return;
            }
            xc2Var.f12563b.m5254b("%s : Binder has died.", xc2Var.f12564c);
            ArrayList arrayList = xc2Var.f12565d;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((qd2) obj).mo1742a(new RemoteException(String.valueOf(xc2Var.f12564c).concat(" : Binder has died.")));
            }
            xc2Var.f12565d.clear();
            synchronized (xc2Var.f12567f) {
                xc2Var.m6916e();
            }
        }
    };

    /* JADX INFO: renamed from: l */
    public final AtomicInteger f12573l = new AtomicInteger(0);

    /* JADX INFO: renamed from: j */
    public final WeakReference f12571j = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [rd2] */
    public xc2(Context context, pd2 pd2Var, String str, Intent intent, td2 td2Var) {
        this.f12562a = context;
        this.f12563b = pd2Var;
        this.f12564c = str;
        this.f12569h = intent;
        this.f12570i = td2Var;
    }

    /* JADX INFO: renamed from: b */
    public static void m6912b(xc2 xc2Var, qd2 qd2Var) {
        IInterface iInterface = xc2Var.f12575n;
        pd2 pd2Var = xc2Var.f12563b;
        ArrayList arrayList = xc2Var.f12565d;
        int i = 0;
        if (iInterface != null || xc2Var.f12568g) {
            if (!xc2Var.f12568g) {
                qd2Var.run();
                return;
            } else {
                pd2Var.m5254b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(qd2Var);
                return;
            }
        }
        pd2Var.m5254b("Initiate binding to the service.", new Object[0]);
        arrayList.add(qd2Var);
        wc2 wc2Var = new wc2(xc2Var);
        xc2Var.f12574m = wc2Var;
        xc2Var.f12568g = true;
        if (xc2Var.f12562a.bindService(xc2Var.f12569h, wc2Var, 1)) {
            return;
        }
        pd2Var.m5254b("Failed to bind to the service.", new Object[0]);
        xc2Var.f12568g = false;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((qd2) obj).mo1742a(new yc2("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: a */
    public final Handler m6913a() {
        Handler handler;
        HashMap map = f12561o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f12564c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f12564c, 10);
                    handlerThread.start();
                    map.put(this.f12564c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f12564c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* JADX INFO: renamed from: c */
    public final void m6914c(qd2 qd2Var, TaskCompletionSource taskCompletionSource) {
        m6913a().post(new sd2(this, qd2Var.m5486c(), taskCompletionSource, qd2Var));
    }

    /* JADX INFO: renamed from: d */
    public final void m6915d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f12567f) {
            this.f12566e.remove(taskCompletionSource);
        }
        m6913a().post(new vc2(this, 1));
    }

    /* JADX INFO: renamed from: e */
    public final void m6916e() {
        HashSet hashSet = this.f12566e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f12564c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}

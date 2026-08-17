package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class l81 {

    /* JADX INFO: renamed from: e */
    public static l81 f6259e;

    /* JADX INFO: renamed from: a */
    public int f6260a;

    /* JADX INFO: renamed from: b */
    public Object f6261b;

    /* JADX INFO: renamed from: c */
    public Object f6262c;

    /* JADX INFO: renamed from: d */
    public final Object f6263d;

    public l81(Context context) {
        this.f6261b = new Handler(Looper.getMainLooper());
        this.f6262c = new CopyOnWriteArrayList();
        this.f6263d = new Object();
        this.f6260a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C1135n7(this, 2), intentFilter);
    }

    /* JADX INFO: renamed from: a */
    public static void m4140a(l81 l81Var, int i) {
        synchronized (l81Var.f6263d) {
            try {
                if (l81Var.f6260a == i) {
                    return;
                }
                l81Var.f6260a = i;
                for (WeakReference weakReference : (CopyOnWriteArrayList) l81Var.f6262c) {
                    C1460ty c1460ty = (C1460ty) weakReference.get();
                    if (c1460ty != null) {
                        c1460ty.m6353a(i);
                    } else {
                        ((CopyOnWriteArrayList) l81Var.f6262c).remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static synchronized l81 m4141c(Context context) {
        try {
            if (f6259e == null) {
                f6259e = new l81(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6259e;
    }

    /* JADX INFO: renamed from: b */
    public void m4142b(boolean z, ib1 ib1Var, C1073lj c1073lj, boolean z2) {
        p32.m5188s(c1073lj, FirebaseAnalytics.Param.SOURCE);
        int iMin = Math.min(ib1Var.f4913c, ((ib1) ib1Var.f4917g.f6263d).f4913c);
        C1073lj c1073lj2 = ib1Var.f4911a;
        boolean z3 = c1073lj2.f6361b > 0;
        int i = (int) c1073lj.f6361b;
        if (z3 || iMin < i) {
            if (!z3 && iMin > 0) {
                ib1Var.m3417b(iMin, c1073lj, false);
            }
            c1073lj2.mo956q((int) c1073lj.f6361b, c1073lj);
            ib1Var.f4916f = z | ib1Var.f4916f;
        } else {
            ib1Var.m3417b(i, c1073lj, z);
        }
        if (z2) {
            try {
                ((f70) this.f6262c).flush();
            } catch (IOException e) {
                ca0.m1184p(e);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public int m4143d() {
        int i;
        synchronized (this.f6263d) {
            i = this.f6260a;
        }
        return i;
    }

    /* JADX INFO: renamed from: e */
    public void m4144e() {
        HandlerThread handlerThread;
        synchronized (this.f6263d) {
            try {
                ki0.m3864h(this.f6260a > 0);
                int i = this.f6260a - 1;
                this.f6260a = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.f6262c) != null) {
                    handlerThread.quit();
                    this.f6262c = null;
                    this.f6261b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m4145f(ib1 ib1Var, int i) {
        if (ib1Var == null) {
            ((ib1) this.f6263d).m3416a(i);
            m4146g();
            return;
        }
        ib1Var.m3416a(i);
        p71 p71Var = new p71();
        ib1Var.m3418c(Math.min(ib1Var.f4913c, ((ib1) ib1Var.f4917g.f6263d).f4913c), p71Var);
        if (p71Var.f8786b > 0) {
            try {
                ((f70) this.f6262c).flush();
            } catch (IOException e) {
                ca0.m1184p(e);
            }
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: g */
    public void m4146g() {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f6261b
            y91 r0 = (p000.y91) r0
            ib1[] r1 = r0.m7058j()
            java.util.List r2 = java.util.Arrays.asList(r1)
            java.util.Collections.shuffle(r2)
            java.lang.Object r2 = r13.f6263d
            ib1 r2 = (p000.ib1) r2
            int r2 = r2.f4913c
            int r3 = r1.length
        L16:
            r4 = 0
            if (r3 <= 0) goto L6a
            if (r2 <= 0) goto L6a
            float r5 = (float) r2
            float r6 = (float) r3
            float r5 = r5 / r6
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            r6 = r4
            r7 = r6
        L26:
            if (r7 >= r3) goto L68
            if (r2 <= 0) goto L68
            r8 = r1[r7]
            int r9 = r8.f4913c
            lj r10 = r8.f4911a
            long r11 = r10.f6361b
            int r11 = (int) r11
            int r9 = java.lang.Math.min(r9, r11)
            int r9 = java.lang.Math.max(r4, r9)
            int r11 = r8.f4914d
            int r9 = r9 - r11
            int r9 = java.lang.Math.min(r9, r5)
            int r9 = java.lang.Math.min(r2, r9)
            if (r9 <= 0) goto L4e
            int r11 = r8.f4914d
            int r11 = r11 + r9
            r8.f4914d = r11
            int r2 = r2 - r9
        L4e:
            int r9 = r8.f4913c
            long r10 = r10.f6361b
            int r10 = (int) r10
            int r9 = java.lang.Math.min(r9, r10)
            int r9 = java.lang.Math.max(r4, r9)
            int r10 = r8.f4914d
            int r9 = r9 - r10
            if (r9 <= 0) goto L65
            int r9 = r6 + 1
            r1[r6] = r8
            r6 = r9
        L65:
            int r7 = r7 + 1
            goto L26
        L68:
            r3 = r6
            goto L16
        L6a:
            p71 r1 = new p71
            r1.<init>()
            ib1[] r0 = r0.m7058j()
            int r2 = r0.length
            r3 = r4
        L75:
            if (r3 >= r2) goto L83
            r5 = r0[r3]
            int r6 = r5.f4914d
            r5.m3418c(r6, r1)
            r5.f4914d = r4
            int r3 = r3 + 1
            goto L75
        L83:
            int r0 = r1.f8786b
            if (r0 <= 0) goto L93
            java.lang.Object r13 = r13.f6262c     // Catch: java.io.IOException -> L8f
            f70 r13 = (p000.f70) r13     // Catch: java.io.IOException -> L8f
            r13.flush()     // Catch: java.io.IOException -> L8f
            return
        L8f:
            r13 = move-exception
            p000.ca0.m1184p(r13)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.l81.m4146g():void");
    }

    public l81() {
        this.f6263d = new Object();
        this.f6261b = null;
        this.f6262c = null;
        this.f6260a = 0;
    }

    public l81(y91 y91Var, f70 f70Var) {
        this.f6261b = y91Var;
        this.f6262c = f70Var;
        this.f6260a = 65535;
        this.f6263d = new ib1(this, 0, 65535, null);
    }
}

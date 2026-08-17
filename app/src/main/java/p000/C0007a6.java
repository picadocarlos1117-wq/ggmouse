package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.util.Log;

/* JADX INFO: renamed from: a6 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0007a6 extends ww0 {

    /* JADX INFO: renamed from: i */
    public final ww0 f63i;

    /* JADX INFO: renamed from: j */
    public final Context f64j;

    /* JADX INFO: renamed from: k */
    public final ConnectivityManager f65k;

    /* JADX INFO: renamed from: l */
    public final Object f66l = new Object();

    /* JADX INFO: renamed from: m */
    public Runnable f67m;

    public C0007a6(ww0 ww0Var, Context context) {
        this.f63i = ww0Var;
        this.f64j = context;
        if (context == null) {
            this.f65k = null;
            return;
        }
        this.f65k = (ConnectivityManager) context.getSystemService("connectivity");
        try {
            m91I0();
        } catch (SecurityException e) {
            Log.w("AndroidChannelBuilder", "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?", e);
        }
    }

    @Override // p000.ww0
    /* JADX INFO: renamed from: C0 */
    public final boolean mo85C0(long j) {
        return this.f63i.mo85C0(j);
    }

    @Override // p000.ww0
    /* JADX INFO: renamed from: D0 */
    public final void mo86D0() {
        this.f63i.mo86D0();
    }

    @Override // p000.ww0
    /* JADX INFO: renamed from: E0 */
    public final EnumC0651fs mo87E0() {
        return this.f63i.mo87E0();
    }

    @Override // p000.ww0
    /* JADX INFO: renamed from: F0 */
    public final void mo88F0(EnumC0651fs enumC0651fs, ri0 ri0Var) {
        this.f63i.mo88F0(enumC0651fs, ri0Var);
    }

    @Override // p000.ww0
    /* JADX INFO: renamed from: G0 */
    public final ww0 mo89G0() {
        synchronized (this.f66l) {
            try {
                Runnable runnable = this.f67m;
                if (runnable != null) {
                    runnable.run();
                    this.f67m = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f63i.mo89G0();
    }

    @Override // p000.ww0
    /* JADX INFO: renamed from: H0 */
    public final ww0 mo90H0() {
        synchronized (this.f66l) {
            try {
                Runnable runnable = this.f67m;
                if (runnable != null) {
                    runnable.run();
                    this.f67m = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f63i.mo90H0();
    }

    /* JADX INFO: renamed from: I0 */
    public final void m91I0() {
        ConnectivityManager connectivityManager = this.f65k;
        if (connectivityManager != null) {
            C1616y5 c1616y5 = new C1616y5(this);
            connectivityManager.registerDefaultNetworkCallback(c1616y5);
            this.f67m = new RunnableC1466u3(1, this, c1616y5);
        } else {
            C1653z5 c1653z5 = new C1653z5(this);
            this.f64j.registerReceiver(c1653z5, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f67m = new RunnableC1466u3(2, this, c1653z5);
        }
    }

    @Override // p000.o21
    /* JADX INFO: renamed from: Z */
    public final AbstractC0610eo mo92Z(u51 u51Var, C0022al c0022al) {
        return this.f63i.mo92Z(u51Var, c0022al);
    }
}

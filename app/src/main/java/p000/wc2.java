package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class wc2 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xc2 f12065a;

    public /* synthetic */ wc2(xc2 xc2Var) {
        this.f12065a = xc2Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        xc2 xc2Var = this.f12065a;
        xc2Var.f12563b.m5254b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        xc2Var.m6913a().post(new uc2(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        xc2 xc2Var = this.f12065a;
        xc2Var.f12563b.m5254b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        xc2Var.m6913a().post(new vc2(this, 0));
    }
}

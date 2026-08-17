package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: renamed from: z5 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1653z5 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public boolean f13287a = false;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0007a6 f13288b;

    public C1653z5(C0007a6 c0007a6) {
        this.f13288b = c0007a6;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        boolean z = this.f13287a;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        this.f13287a = z2;
        if (!z2 || z) {
            return;
        }
        this.f13288b.f63i.mo86D0();
    }
}

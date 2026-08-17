package p000;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: renamed from: y5 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1616y5 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0007a6 f12844a;

    public C1616y5(C0007a6 c0007a6) {
        this.f12844a = c0007a6;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f12844a.f63i.mo86D0();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        if (z) {
            return;
        }
        this.f12844a.f63i.mo86D0();
    }
}

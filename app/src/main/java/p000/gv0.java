package p000;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class gv0 {

    /* JADX INFO: renamed from: a */
    public final IntentFilter f4332a;

    /* JADX INFO: renamed from: b */
    public final BroadcastReceiver f4333b;

    /* JADX INFO: renamed from: c */
    public boolean f4334c;

    /* JADX INFO: renamed from: d */
    public boolean f4335d;

    public gv0(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        this.f4332a = intentFilter;
        this.f4333b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.f4333b);
        sb.append(" filter=");
        sb.append(this.f4332a);
        if (this.f4335d) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }
}

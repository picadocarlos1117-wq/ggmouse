package p000;

import com.example.ssmousepro.PreferencesActivity;
import com.example.ssmousepro.activation.WifiDaemonClient;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class is1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5144a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f5145b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f5146c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f5147d;

    public /* synthetic */ is1(int i, int i2, int i3, Object obj) {
        this.f5144a = i3;
        this.f5147d = obj;
        this.f5145b = i;
        this.f5146c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5144a;
        int i2 = this.f5146c;
        int i3 = this.f5145b;
        Object obj = this.f5147d;
        switch (i) {
            case 0:
                PreferencesActivity.shizukuPermissionListener$lambda$5(((yf1) ((ns1) ((ks1) obj).f5997a)).f12974a, i3, i2);
                break;
            default:
                WifiDaemonClient.loopEvt$lambda$10((ch0) obj, i3, i2);
                break;
        }
    }
}

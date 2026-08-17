package p000;

import com.example.ssmousepro.activation.WirelessActivationActivity;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jb2 implements og0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5354a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ WirelessActivationActivity f5355b;

    public /* synthetic */ jb2(WirelessActivationActivity wirelessActivationActivity, int i) {
        this.f5354a = i;
        this.f5355b = wirelessActivationActivity;
    }

    @Override // p000.og0
    public final Object invoke(Object obj) {
        int i = this.f5354a;
        WirelessActivationActivity wirelessActivationActivity = this.f5355b;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        switch (i) {
            case 0:
                return WirelessActivationActivity.refreshStatusUi$lambda$6(wirelessActivationActivity, zBooleanValue);
            default:
                return WirelessActivationActivity.onResume$lambda$4(wirelessActivationActivity, zBooleanValue);
        }
    }
}

package p000;

import com.example.ssmousepro.MainActivity;
import com.example.ssmousepro.PlansBottomSheet;
import com.example.ssmousepro.activation.WifiDaemonClient;

/* JADX INFO: renamed from: tq */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1452tq implements mg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10922a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f10923b;

    public /* synthetic */ C1452tq(Object obj, int i) {
        this.f10922a = i;
        this.f10923b = obj;
    }

    @Override // p000.mg0
    public final Object invoke() {
        int i = this.f10922a;
        Object obj = this.f10923b;
        switch (i) {
            case 0:
                ((AbstractActivityC0613er) obj).reportFullyDrawn();
                return null;
            case 1:
                return MainActivity.onResume$lambda$7((MainActivity) obj);
            case 2:
                return PlansBottomSheet._init_$lambda$3((PlansBottomSheet) obj);
            default:
                return Boolean.valueOf(WifiDaemonClient.enviar$lambda$0((String) obj));
        }
    }
}

package p000;

import android.widget.TextView;
import com.example.ssmousepro.FloatingService;
import com.example.ssmousepro.activation.WifiDaemonClient;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dc0 implements mg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2876a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2877b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2878c;

    public /* synthetic */ dc0(int i, Object obj, Object obj2) {
        this.f2876a = i;
        this.f2877b = obj;
        this.f2878c = obj2;
    }

    @Override // p000.mg0
    public final Object invoke() {
        int i = this.f2876a;
        Object obj = this.f2878c;
        Object obj2 = this.f2877b;
        switch (i) {
            case 0:
                return FloatingService.criarWrapperComponente$lambda$159((og0) obj2, (TextView) obj);
            default:
                return WifiDaemonClient.consultar$lambda$1((String) obj2, (String) obj);
        }
    }
}

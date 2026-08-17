package p000;

import android.widget.TextView;
import com.example.ssmousepro.FloatingService;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bc0 implements mg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1289a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FloatingService f1290b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TextView f1291c;

    public /* synthetic */ bc0(FloatingService floatingService, TextView textView, int i) {
        this.f1289a = i;
        this.f1290b = floatingService;
        this.f1291c = textView;
    }

    @Override // p000.mg0
    public final Object invoke() {
        int i = this.f1289a;
        TextView textView = this.f1291c;
        FloatingService floatingService = this.f1290b;
        switch (i) {
            case 0:
                return FloatingService.criarComponenteToque$lambda$98(floatingService, textView);
            case 1:
                return FloatingService.criarAcaoCliqueSimples$lambda$85(floatingService, textView);
            default:
                return FloatingService.criarComponenteToqueRep$lambda$113(floatingService, textView);
        }
    }
}

package p000;

import android.widget.TextView;
import com.example.ssmousepro.FloatingService;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pb0 implements og0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8828a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FloatingService f8829b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TextView f8830c;

    public /* synthetic */ pb0(FloatingService floatingService, TextView textView, int i) {
        this.f8828a = i;
        this.f8829b = floatingService;
        this.f8830c = textView;
    }

    @Override // p000.og0
    public final Object invoke(Object obj) {
        int i = this.f8828a;
        TextView textView = this.f8830c;
        FloatingService floatingService = this.f8829b;
        String str = (String) obj;
        switch (i) {
            case 0:
                return FloatingService.criarAcaoCliqueSimples$lambda$85$lambda$84(floatingService, textView, str);
            case 1:
                return FloatingService.criarComponenteToque$lambda$98$lambda$97(floatingService, textView, str);
            case 2:
                return FloatingService.adicionarTeclaMapeamento$lambda$86(floatingService, textView, str);
            default:
                return FloatingService.criarComponenteToqueRep$lambda$113$lambda$112(floatingService, textView, str);
        }
    }
}

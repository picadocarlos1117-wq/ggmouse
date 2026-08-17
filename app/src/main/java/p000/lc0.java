package p000;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.example.ssmousepro.FloatingService;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lc0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6309a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FloatingService f6310b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FrameLayout f6311c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ TextView f6312d;

    public /* synthetic */ lc0(int i, FrameLayout frameLayout, TextView textView, FloatingService floatingService) {
        this.f6309a = i;
        this.f6310b = floatingService;
        this.f6311c = frameLayout;
        this.f6312d = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f6309a;
        TextView textView = this.f6312d;
        FrameLayout frameLayout = this.f6311c;
        FloatingService floatingService = this.f6310b;
        switch (i) {
            case 0:
                FloatingService.criarComponenteToqueRep$lambda$111(floatingService, frameLayout, textView, view);
                break;
            case 1:
                FloatingService.abrirPainelConfigToque$lambda$225(floatingService, frameLayout, textView, view);
                break;
            default:
                FloatingService.abrirPainelConfigToqueRep$lambda$236(floatingService, frameLayout, textView, view);
                break;
        }
    }
}

package p000;

import android.view.View;
import android.widget.FrameLayout;
import com.example.ssmousepro.FloatingService;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ub0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11247a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FloatingService f11248b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FrameLayout f11249c;

    public /* synthetic */ ub0(int i, FrameLayout frameLayout, FloatingService floatingService) {
        this.f11247a = i;
        this.f11248b = floatingService;
        this.f11249c = frameLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws JSONException {
        int i = this.f11247a;
        FrameLayout frameLayout = this.f11249c;
        FloatingService floatingService = this.f11248b;
        switch (i) {
            case 0:
                floatingService.abrirPainelConfigFps(frameLayout);
                break;
            case 1:
                floatingService.abrirPainelConfigToque(frameLayout);
                break;
            case 2:
                FloatingService.abrirPainelConfigFps$lambda$195(floatingService, frameLayout, view);
                break;
            case 3:
                floatingService.abrirPainelConfigAnalogico(frameLayout);
                break;
            case 4:
                floatingService.abrirPainelConfigToqueRep(frameLayout);
                break;
            case 5:
                FloatingService.abrirPainelConfigToque$lambda$228(floatingService, frameLayout, view);
                break;
            case 6:
                FloatingService.abrirPainelConfigAnalogico$lambda$265(floatingService, frameLayout, view);
                break;
            case 7:
                FloatingService.abrirPainelConfigAnalogico$lambda$261(floatingService, frameLayout, view);
                break;
            default:
                FloatingService.abrirPainelConfigToqueRep$lambda$240(floatingService, frameLayout, view);
                break;
        }
    }
}

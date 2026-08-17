package p000;

import android.view.View;
import com.example.ssmousepro.FloatingService;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nb0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7347a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FloatingService f7348b;

    public /* synthetic */ nb0(FloatingService floatingService, int i) {
        this.f7347a = i;
        this.f7348b = floatingService;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws JSONException {
        int i = this.f7347a;
        FloatingService floatingService = this.f7348b;
        switch (i) {
            case 0:
                FloatingService.abrirMenuConfiguracoes$lambda$36(floatingService, view);
                break;
            case 1:
                floatingService.abrirPainelConfiguracoes();
                break;
            case 2:
                floatingService.minimizarMenuPrincipal();
                break;
            case 3:
                floatingService.fecharPainelConfigFps();
                break;
            case 4:
                floatingService.fecharPainelConfigFps();
                break;
            case 5:
                FloatingService.configurarControlesHud$lambda$70(floatingService, view);
                break;
            case 6:
                floatingService.alternarBandeja();
                break;
            case 7:
                floatingService.adicionarAnalogico();
                break;
            case 8:
                floatingService.adicionarVisaoFps();
                break;
            case 9:
                floatingService.adicionarToqueRepetido();
                break;
            case 10:
                floatingService.salvarMapeamentoHud();
                break;
            case 11:
                floatingService.sairModoEdicaoHud();
                break;
            case 12:
                floatingService.alternarPainelConfig();
                break;
            case 13:
                floatingService.fecharPainelConfigToque();
                break;
            case 14:
                floatingService.fecharPainelConfigToque();
                break;
            case 15:
                floatingService.fecharPainelConfiguracoes();
                break;
            case 16:
                floatingService.fecharPainelConfiguracoes();
                break;
            case 17:
                floatingService.fecharPainelConfigToqueRep();
                break;
            default:
                floatingService.fecharPainelConfigToqueRep();
                break;
        }
    }
}

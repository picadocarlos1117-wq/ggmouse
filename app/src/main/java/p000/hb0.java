package p000;

import com.example.ssmousepro.FloatingService;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hb0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4504a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FloatingService f4505b;

    public /* synthetic */ hb0(FloatingService floatingService, int i) {
        this.f4504a = i;
        this.f4505b = floatingService;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        int i = this.f4504a;
        FloatingService floatingService = this.f4505b;
        switch (i) {
            case 0:
                floatingService.registrarCallbacksDaemon();
                break;
            case 1:
                FloatingService.mostrarConfigResolucoes$lambda$319$lambda$318(floatingService);
                break;
            case 2:
                FloatingService.aguardarCanalInjecao$lambda$12$lambda$11(floatingService);
                break;
            case 3:
                FloatingService.mostrarConfigResolucoes$lambda$317$lambda$316(floatingService);
                break;
            case 4:
                FloatingService.aplicarDpiOverride$lambda$330(floatingService);
                break;
            case 5:
                FloatingService.aguardarResolucaoEReconfigurar$default(floatingService, 0, 1, null);
                break;
            case 6:
                FloatingService.aplicarDpiOverride$lambda$332(floatingService);
                break;
            case 7:
                floatingService.carregarMapeamentoHudSalvo();
                break;
            case 8:
                floatingService.registrarCallbacksDaemon();
                break;
            case 9:
                floatingService.registrarCallbacksDaemon();
                break;
            case 10:
                FloatingService.onStartCommand$lambda$10$lambda$9(floatingService);
                break;
            case 11:
                FloatingService.iniciarMonitoramentoDeTela$lambda$346(floatingService);
                break;
            case 12:
                FloatingService.aguardarResolucaoEReconfigurar$default(floatingService, 0, 1, null);
                break;
            case 13:
                FloatingService.aplicarResolucaoOverride$lambda$327(floatingService);
                break;
            case 14:
                FloatingService.aguardarResolucaoEReconfigurar$default(floatingService, 0, 1, null);
                break;
            case 15:
                FloatingService.aplicarResolucaoOverride$lambda$329(floatingService);
                break;
            case 16:
                FloatingService.ativarEntradaEdicaoHud$lambda$34(floatingService);
                break;
            case 17:
                floatingService.aplicarVisualBolinha();
                break;
            case 18:
                FloatingService.aguardarResolucaoEReconfigurar$default(floatingService, 0, 1, null);
                break;
            case 19:
                FloatingService.agendarReavaliarDisplayOverlay$lambda$26(floatingService);
                break;
            case 20:
                FloatingService.mostrarConfigResolucoes$aoLigarModo$lambda$315(floatingService);
                break;
            case 21:
                FloatingService.aguardarResolucaoEReconfigurar$default(floatingService, 0, 1, null);
                break;
            default:
                FloatingService.ativarTecladoNoDaemon$default(floatingService, false, 1, null);
                break;
        }
    }
}

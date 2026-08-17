package p000;

import com.example.ssmousepro.FloatingService;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cc0 implements mg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1755a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FloatingService f1756b;

    public /* synthetic */ cc0(FloatingService floatingService, int i) {
        this.f1755a = i;
        this.f1756b = floatingService;
    }

    @Override // p000.mg0
    public final Object invoke() {
        int i = this.f1755a;
        FloatingService floatingService = this.f1756b;
        switch (i) {
            case 0:
                return FloatingService.mostrarMenuConfigPrincipal$lambda$295(floatingService);
            case 1:
                return FloatingService.mostrarMenuConfigPrincipal$lambda$296(floatingService);
            case 2:
                return FloatingService.mostrarMenuConfigPrincipal$lambda$297(floatingService);
            case 3:
                return FloatingService.mostrarConfigInterfaces$lambda$304(floatingService);
            case 4:
                return FloatingService.mostrarConfigMonitor$lambda$298(floatingService);
            case 5:
                return FloatingService.mostrarConfigMonitor$lambda$300(floatingService);
            case 6:
                return FloatingService.mostrarConfigMonitor$lambda$302(floatingService);
            case 7:
                return FloatingService.onStartCommand$lambda$10(floatingService);
            case 8:
                return FloatingService.mostrarConfigResolucoes$lambda$314(floatingService);
            default:
                return FloatingService.mostrarConfigResolucoes$lambda$320(floatingService);
        }
    }
}

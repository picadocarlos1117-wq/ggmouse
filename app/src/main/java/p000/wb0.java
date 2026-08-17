package p000;

import android.widget.FrameLayout;
import com.example.ssmousepro.FloatingService;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wb0 implements og0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12049a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FrameLayout f12050b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FloatingService f12051c;

    public /* synthetic */ wb0(int i, FrameLayout frameLayout, FloatingService floatingService) {
        this.f12049a = i;
        this.f12050b = frameLayout;
        this.f12051c = floatingService;
    }

    @Override // p000.og0
    public final Object invoke(Object obj) {
        int i = this.f12049a;
        FloatingService floatingService = this.f12051c;
        FrameLayout frameLayout = this.f12050b;
        switch (i) {
            case 0:
                return FloatingService.vincularCallbacksFpsView$lambda$150(frameLayout, floatingService, ((Float) obj).floatValue());
            case 1:
                return FloatingService.vincularCallbacksFpsView$lambda$151(frameLayout, floatingService, ((Float) obj).floatValue());
            case 2:
                return FloatingService.abrirPainelConfigAnalogico$lambda$250$lambda$249(frameLayout, floatingService, (String) obj);
            case 3:
                return FloatingService.abrirPainelConfigAnalogico$lambda$248$lambda$247(frameLayout, floatingService, (String) obj);
            case 4:
                return FloatingService.abrirPainelConfigAnalogico$lambda$254$lambda$253(frameLayout, floatingService, (String) obj);
            default:
                return FloatingService.abrirPainelConfigAnalogico$lambda$252$lambda$251(frameLayout, floatingService, (String) obj);
        }
    }
}

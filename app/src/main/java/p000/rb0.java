package p000;

import android.widget.FrameLayout;
import android.widget.TextView;
import com.example.ssmousepro.FloatingService;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rb0 implements og0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9867a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FrameLayout f9868b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TextView f9869c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ FloatingService f9870d;

    public /* synthetic */ rb0(TextView textView, FrameLayout frameLayout, FloatingService floatingService) {
        this.f9867a = 0;
        this.f9868b = frameLayout;
        this.f9870d = floatingService;
        this.f9869c = textView;
    }

    @Override // p000.og0
    public final Object invoke(Object obj) {
        int i = this.f9867a;
        FloatingService floatingService = this.f9870d;
        TextView textView = this.f9869c;
        FrameLayout frameLayout = this.f9868b;
        String str = (String) obj;
        switch (i) {
            case 0:
                return FloatingService.abrirPainelConfigToqueRep$lambda$236$lambda$235(frameLayout, floatingService, textView, str);
            case 1:
                return FloatingService.abrirPainelConfigToque$lambda$225$lambda$224(frameLayout, textView, floatingService, str);
            default:
                return FloatingService.criarComponenteToqueRep$lambda$111$lambda$110(frameLayout, textView, floatingService, str);
        }
    }

    public /* synthetic */ rb0(int i, FrameLayout frameLayout, TextView textView, FloatingService floatingService) {
        this.f9867a = i;
        this.f9868b = frameLayout;
        this.f9869c = textView;
        this.f9870d = floatingService;
    }
}

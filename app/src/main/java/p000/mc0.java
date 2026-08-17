package p000;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.example.ssmousepro.FloatingService;
import com.example.ssmousepro.hud.FpsViewHudView;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mc0 implements mg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6751a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FloatingService f6752b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f6753c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f6754d;

    public /* synthetic */ mc0(FloatingService floatingService, View view, Object obj, int i) {
        this.f6751a = i;
        this.f6752b = floatingService;
        this.f6753c = view;
        this.f6754d = obj;
    }

    @Override // p000.mg0
    public final Object invoke() {
        int i = this.f6751a;
        Object obj = this.f6754d;
        View view = this.f6753c;
        FloatingService floatingService = this.f6752b;
        switch (i) {
            case 0:
                return FloatingService.aplicarModoEdicao$lambda$81(floatingService, (TextView) view, (String) obj);
            case 1:
                return FloatingService.aplicarModoEdicao$lambda$82(floatingService, (TextView) view, (String) obj);
            default:
                return FloatingService.vincularCallbacksFpsView$lambda$152(floatingService, (FrameLayout) view, (FpsViewHudView) obj);
        }
    }
}

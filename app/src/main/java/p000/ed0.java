package p000;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.example.ssmousepro.FloatingService;
import com.example.ssmousepro.hud.FpsViewHudView;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ed0 implements og0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3317a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FloatingService f3318b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f3319c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ View f3320d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f3321e;

    public /* synthetic */ ed0(FloatingService floatingService, View view, View view2, Object obj, int i) {
        this.f3317a = i;
        this.f3318b = floatingService;
        this.f3319c = view;
        this.f3320d = view2;
        this.f3321e = obj;
    }

    @Override // p000.og0
    public final Object invoke(Object obj) {
        int i = this.f3317a;
        Object obj2 = this.f3321e;
        View view = this.f3320d;
        View view2 = this.f3319c;
        FloatingService floatingService = this.f3318b;
        switch (i) {
            case 0:
                return FloatingService.mostrarConfigResolucoes$lambda$317(floatingService, (EditText) view2, (EditText) view, (EditText) obj2, ((Boolean) obj).booleanValue());
            case 1:
                return FloatingService.mostrarConfigResolucoes$lambda$319(floatingService, (EditText) view2, (EditText) view, (EditText) obj2, ((Boolean) obj).booleanValue());
            default:
                return FloatingService.capturarTeclaFps$lambda$241(floatingService, (FrameLayout) view2, (FpsViewHudView) view, (og0) obj2, (String) obj);
        }
    }
}

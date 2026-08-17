package p000;

import android.view.KeyEvent;
import android.view.View;
import com.example.ssmousepro.FloatingService;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nc0 implements View.OnKeyListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7356a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FloatingService f7357b;

    public /* synthetic */ nc0(FloatingService floatingService, int i) {
        this.f7356a = i;
        this.f7357b = floatingService;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        int i2 = this.f7356a;
        FloatingService floatingService = this.f7357b;
        switch (i2) {
            case 0:
                return FloatingService.criarListenerCapturaTeclaHud$lambda$286(floatingService, view, i, keyEvent);
            case 1:
                return FloatingService.criarListenerCapturaTeclaHudAnalog$lambda$272(floatingService, view, i, keyEvent);
            default:
                return FloatingService.criarListenerCapturaTeclaHudFps$lambda$245(floatingService, view, i, keyEvent);
        }
    }
}

package p000;

import android.widget.EditText;
import android.widget.FrameLayout;
import com.example.ssmousepro.FloatingService;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gb0 implements og0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4130a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FrameLayout f4131b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ EditText f4132c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ FloatingService f4133d;

    public /* synthetic */ gb0(FrameLayout frameLayout, EditText editText, FloatingService floatingService, int i) {
        this.f4130a = i;
        this.f4131b = frameLayout;
        this.f4132c = editText;
        this.f4133d = floatingService;
    }

    @Override // p000.og0
    public final Object invoke(Object obj) {
        int i = this.f4130a;
        EditText editText = this.f4132c;
        FrameLayout frameLayout = this.f4131b;
        FloatingService floatingService = this.f4133d;
        String str = (String) obj;
        switch (i) {
            case 0:
                return FloatingService.abrirPainelConfigFps$lambda$190$lambda$189(floatingService, frameLayout, editText, str);
            case 1:
                return FloatingService.abrirPainelConfigAnalogico$lambda$258$lambda$257(frameLayout, editText, floatingService, str);
            case 2:
                return FloatingService.vincularUiLowSpeed$lambda$204$lambda$203(frameLayout, editText, floatingService, str);
            case 3:
                return FloatingService.vincularUiAcelLimiar$lambda$214$lambda$213(frameLayout, editText, floatingService, str);
            case 4:
                return FloatingService.vincularUiLowSpeed$lambda$201$lambda$200(frameLayout, editText, floatingService, str);
            default:
                return FloatingService.abrirPainelConfigFps$lambda$188$lambda$187(floatingService, frameLayout, editText, str);
        }
    }

    public /* synthetic */ gb0(FloatingService floatingService, FrameLayout frameLayout, EditText editText, int i) {
        this.f4130a = i;
        this.f4133d = floatingService;
        this.f4131b = frameLayout;
        this.f4132c = editText;
    }
}

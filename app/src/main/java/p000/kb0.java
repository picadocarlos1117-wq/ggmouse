package p000;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.example.ssmousepro.FloatingService;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kb0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5732a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FloatingService f5733b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ EditText f5734c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ FrameLayout f5735d;

    public /* synthetic */ kb0(FloatingService floatingService, EditText editText, FrameLayout frameLayout, int i) {
        this.f5732a = i;
        this.f5733b = floatingService;
        this.f5734c = editText;
        this.f5735d = frameLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f5732a;
        EditText editText = this.f5734c;
        FrameLayout frameLayout = this.f5735d;
        FloatingService floatingService = this.f5733b;
        switch (i) {
            case 0:
                FloatingService.vincularUiLowSpeed$lambda$201(floatingService, editText, frameLayout, view);
                break;
            case 1:
                FloatingService.vincularUiLowSpeed$lambda$204(floatingService, editText, frameLayout, view);
                break;
            case 2:
                FloatingService.abrirPainelConfigFps$lambda$190(floatingService, frameLayout, editText, view);
                break;
            case 3:
                FloatingService.vincularUiAcelLimiar$lambda$214(floatingService, editText, frameLayout, view);
                break;
            case 4:
                FloatingService.abrirPainelConfigAnalogico$lambda$248(floatingService, editText, frameLayout, view);
                break;
            case 5:
                FloatingService.abrirPainelConfigAnalogico$lambda$250(floatingService, editText, frameLayout, view);
                break;
            case 6:
                FloatingService.abrirPainelConfigAnalogico$lambda$252(floatingService, editText, frameLayout, view);
                break;
            case 7:
                FloatingService.abrirPainelConfigAnalogico$lambda$254(floatingService, editText, frameLayout, view);
                break;
            case 8:
                FloatingService.abrirPainelConfigAnalogico$lambda$258(floatingService, editText, frameLayout, view);
                break;
            case 9:
                FloatingService.abrirPainelConfigAnalogico$lambda$263(floatingService, frameLayout, editText, view);
                break;
            case 10:
                FloatingService.abrirPainelConfigAnalogico$lambda$264(floatingService, frameLayout, editText, view);
                break;
            case 11:
                FloatingService.abrirPainelConfigFps$lambda$185(floatingService, frameLayout, editText, view);
                break;
            default:
                FloatingService.abrirPainelConfigFps$lambda$188(floatingService, frameLayout, editText, view);
                break;
        }
    }

    public /* synthetic */ kb0(FloatingService floatingService, FrameLayout frameLayout, EditText editText, int i) {
        this.f5732a = i;
        this.f5733b = floatingService;
        this.f5735d = frameLayout;
        this.f5734c = editText;
    }
}

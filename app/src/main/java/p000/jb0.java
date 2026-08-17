package p000;

import android.widget.CompoundButton;
import android.widget.FrameLayout;
import com.example.ssmousepro.FloatingService;
import com.example.ssmousepro.injection.PipelineMonitorText;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jb0 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5345a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5346b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FloatingService f5347c;

    public /* synthetic */ jb0(FloatingService floatingService, PipelineMonitorText.Campo campo) {
        this.f5345a = 4;
        this.f5347c = floatingService;
        this.f5346b = campo;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) throws JSONException {
        int i = this.f5345a;
        Object obj = this.f5346b;
        FloatingService floatingService = this.f5347c;
        switch (i) {
            case 0:
                FloatingService.vincularUiLowSpeed$lambda$198((FrameLayout) obj, floatingService, compoundButton, z);
                break;
            case 1:
                FloatingService.vincularUiLowSpeed$lambda$199((FrameLayout) obj, floatingService, compoundButton, z);
                break;
            case 2:
                FloatingService.vincularUiAcelLimiar$lambda$212((FrameLayout) obj, floatingService, compoundButton, z);
                break;
            case 3:
                FloatingService.abrirPainelConfigAnalogico$lambda$262((FrameLayout) obj, floatingService, compoundButton, z);
                break;
            default:
                FloatingService.mostrarConfigMonitor$lambda$303(floatingService, (PipelineMonitorText.Campo) obj, compoundButton, z);
                break;
        }
    }

    public /* synthetic */ jb0(int i, FrameLayout frameLayout, FloatingService floatingService) {
        this.f5345a = i;
        this.f5346b = frameLayout;
        this.f5347c = floatingService;
    }
}

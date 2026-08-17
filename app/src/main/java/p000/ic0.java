package p000;

import android.widget.CompoundButton;
import com.example.ssmousepro.FloatingService;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ic0 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4933a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FloatingService f4934b;

    public /* synthetic */ ic0(FloatingService floatingService, int i) {
        this.f4933a = i;
        this.f4934b = floatingService;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.f4933a;
        FloatingService floatingService = this.f4934b;
        switch (i) {
            case 0:
                FloatingService.configurarControlesHud$lambda$78(floatingService, compoundButton, z);
                break;
            default:
                FloatingService.mostrarConfigMonitor$lambda$299(floatingService, compoundButton, z);
                break;
        }
    }
}

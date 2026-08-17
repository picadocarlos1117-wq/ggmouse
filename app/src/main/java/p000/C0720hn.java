package p000;

import android.widget.CompoundButton;
import com.example.ssmousepro.FloatingService;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: hn */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0720hn implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4620a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4621b;

    public /* synthetic */ C0720hn(Object obj, int i) {
        this.f4620a = i;
        this.f4621b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.f4620a;
        Object obj = this.f4621b;
        switch (i) {
            case 0:
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) obj).f2049n;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
                break;
            default:
                FloatingService.criarLinhaSwitchAjusteTela$lambda$321((og0) obj, compoundButton, z);
                break;
        }
    }
}

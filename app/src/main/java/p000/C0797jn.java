package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: jn */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0797jn extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Chip f5455a;

    public C0797jn(Chip chip) {
        this.f5455a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C1077ln c1077ln = this.f5455a.f2045e;
        if (c1077ln != null) {
            c1077ln.getOutline(outline);
        } else {
            outline.setAlpha(TouchPipeline.SIZE);
        }
    }
}

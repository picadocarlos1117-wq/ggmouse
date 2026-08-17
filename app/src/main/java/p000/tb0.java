package p000;

import android.view.View;
import android.widget.FrameLayout;
import com.example.ssmousepro.FloatingService;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tb0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10818a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FloatingService f10819b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FrameLayout f10820c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ FrameLayout f10821d;

    public /* synthetic */ tb0(FloatingService floatingService, FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        this.f10818a = i;
        this.f10819b = floatingService;
        this.f10820c = frameLayout;
        this.f10821d = frameLayout2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f10818a;
        FrameLayout frameLayout = this.f10821d;
        FrameLayout frameLayout2 = this.f10820c;
        FloatingService floatingService = this.f10819b;
        switch (i) {
            case 0:
                FloatingService.criarComponenteFps$lambda$148(floatingService, frameLayout2, frameLayout, view);
                break;
            case 1:
                FloatingService.criarComponenteToque$lambda$95(floatingService, frameLayout2, frameLayout, view);
                break;
            case 2:
                FloatingService.criarComponenteAnalogico$lambda$126(floatingService, frameLayout2, frameLayout, view);
                break;
            default:
                FloatingService.criarComponenteToqueRep$lambda$108(floatingService, frameLayout2, frameLayout, view);
                break;
        }
    }
}

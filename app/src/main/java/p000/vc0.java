package p000;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.example.ssmousepro.FloatingService;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vc0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11622a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FrameLayout f11623b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FloatingService f11624c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ TextView f11625d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ TextView f11626e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ View f11627f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ TextView f11628g;

    public /* synthetic */ vc0(FloatingService floatingService, View view, TextView textView, TextView textView2, FrameLayout frameLayout, TextView textView3) {
        this.f11622a = 2;
        this.f11624c = floatingService;
        this.f11627f = view;
        this.f11625d = textView;
        this.f11626e = textView2;
        this.f11623b = frameLayout;
        this.f11628g = textView3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws JSONException {
        switch (this.f11622a) {
            case 0:
                FloatingService.abrirPainelConfigToque$lambda$222(this.f11623b, this.f11624c, this.f11625d, this.f11626e, this.f11627f, this.f11628g, view);
                break;
            case 1:
                FloatingService.abrirPainelConfigToque$lambda$223(this.f11623b, this.f11624c, this.f11625d, this.f11626e, this.f11627f, this.f11628g, view);
                break;
            case 2:
                FrameLayout frameLayout = this.f11623b;
                TextView textView = this.f11628g;
                FloatingService.abrirPainelConfigToqueRep$lambda$234(this.f11624c, this.f11627f, this.f11625d, this.f11626e, frameLayout, textView, view);
                break;
            default:
                TextView textView2 = this.f11626e;
                TextView textView3 = this.f11628g;
                FrameLayout frameLayout2 = this.f11623b;
                FloatingService.abrirPainelConfigToqueRep$lambda$237(this.f11624c, frameLayout2, this.f11627f, this.f11625d, textView2, textView3, view);
                break;
        }
    }

    public /* synthetic */ vc0(FrameLayout frameLayout, FloatingService floatingService, TextView textView, TextView textView2, View view, TextView textView3, int i) {
        this.f11622a = i;
        this.f11623b = frameLayout;
        this.f11624c = floatingService;
        this.f11625d = textView;
        this.f11626e = textView2;
        this.f11627f = view;
        this.f11628g = textView3;
    }

    public /* synthetic */ vc0(FloatingService floatingService, FrameLayout frameLayout, View view, TextView textView, TextView textView2, TextView textView3) {
        this.f11622a = 3;
        this.f11624c = floatingService;
        this.f11623b = frameLayout;
        this.f11627f = view;
        this.f11625d = textView;
        this.f11626e = textView2;
        this.f11628g = textView3;
    }
}

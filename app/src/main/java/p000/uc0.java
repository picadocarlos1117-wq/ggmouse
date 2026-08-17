package p000;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.example.ssmousepro.FloatingService;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uc0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11255a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TextView f11256b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FloatingService f11257c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ EditText f11258d;

    public /* synthetic */ uc0(int i, EditText editText, TextView textView, FloatingService floatingService) {
        this.f11255a = i;
        this.f11256b = textView;
        this.f11257c = floatingService;
        this.f11258d = editText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f11255a;
        EditText editText = this.f11258d;
        FloatingService floatingService = this.f11257c;
        TextView textView = this.f11256b;
        switch (i) {
            case 0:
                FloatingService.abrirPainelConfigToque$lambda$221(textView, floatingService, editText, view);
                break;
            default:
                FloatingService.abrirPainelConfigToqueRep$lambda$231(textView, floatingService, editText, view);
                break;
        }
    }
}

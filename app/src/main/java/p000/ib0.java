package p000;

import android.widget.EditText;
import android.widget.TextView;
import com.example.ssmousepro.FloatingService;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ib0 implements og0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4907a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FloatingService f4908b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TextView f4909c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ EditText f4910d;

    public /* synthetic */ ib0(int i, EditText editText, TextView textView, FloatingService floatingService) {
        this.f4907a = i;
        this.f4908b = floatingService;
        this.f4909c = textView;
        this.f4910d = editText;
    }

    @Override // p000.og0
    public final Object invoke(Object obj) {
        int i = this.f4907a;
        EditText editText = this.f4910d;
        TextView textView = this.f4909c;
        FloatingService floatingService = this.f4908b;
        String str = (String) obj;
        switch (i) {
            case 0:
                return FloatingService.abrirPainelConfigToqueRep$lambda$231$lambda$230(floatingService, textView, editText, str);
            default:
                return FloatingService.abrirPainelConfigToque$lambda$221$lambda$220(floatingService, textView, editText, str);
        }
    }
}

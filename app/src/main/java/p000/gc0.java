package p000;

import android.widget.EditText;
import com.example.ssmousepro.FloatingService;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gc0 implements og0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4139a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EditText f4140b;

    public /* synthetic */ gc0(EditText editText, int i) {
        this.f4139a = i;
        this.f4140b = editText;
    }

    @Override // p000.og0
    public final Object invoke(Object obj) {
        int i = this.f4139a;
        EditText editText = this.f4140b;
        String str = (String) obj;
        switch (i) {
            case 0:
                return FloatingService.abrirPainelConfigFps$lambda$183$lambda$182(editText, str);
            default:
                return FloatingService.abrirPainelConfigFps$lambda$185$lambda$184(editText, str);
        }
    }
}

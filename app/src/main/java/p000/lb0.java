package p000;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.example.ssmousepro.FloatingService;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lb0 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6297a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FrameLayout f6298b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ EditText f6299c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ FloatingService f6300d;

    public /* synthetic */ lb0(FrameLayout frameLayout, EditText editText, FloatingService floatingService, int i) {
        this.f6297a = i;
        this.f6298b = frameLayout;
        this.f6299c = editText;
        this.f6300d = floatingService;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.f6297a;
        FloatingService floatingService = this.f6300d;
        EditText editText = this.f6299c;
        FrameLayout frameLayout = this.f6298b;
        switch (i) {
            case 0:
                return FloatingService.vincularUiLowSpeed$lambda$202(frameLayout, editText, floatingService, view);
            case 1:
                return FloatingService.vincularUiLowSpeed$lambda$205(frameLayout, editText, floatingService, view);
            default:
                return FloatingService.vincularUiAcelLimiar$lambda$215(frameLayout, editText, floatingService, view);
        }
    }
}

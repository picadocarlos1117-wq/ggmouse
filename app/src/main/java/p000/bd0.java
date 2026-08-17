package p000;

import android.view.View;
import android.widget.FrameLayout;
import com.example.ssmousepro.AtalhosPrefs;
import com.example.ssmousepro.FloatingService;
import com.example.ssmousepro.JogoAdapter;
import com.example.ssmousepro.PreferencesActivity;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bd0 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1310a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1311b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1312c;

    public /* synthetic */ bd0(int i, Object obj, Object obj2) {
        this.f1310a = i;
        this.f1311b = obj;
        this.f1312c = obj2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.f1310a;
        Object obj = this.f1312c;
        Object obj2 = this.f1311b;
        switch (i) {
            case 0:
                return FloatingService.abrirPainelConfigFps$lambda$186((FloatingService) obj2, (FrameLayout) obj, view);
            case 1:
                return JogoAdapter.onBindViewHolder$lambda$1((JogoAdapter.JogoViewHolder) obj2, (JogoAdapter) obj, view);
            default:
                return PreferencesActivity.vincularChipAtalho$lambda$18((PreferencesActivity) obj2, (AtalhosPrefs.Acao) obj, view);
        }
    }
}

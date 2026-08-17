package p000;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.example.ssmousepro.AtalhosPrefs;
import com.example.ssmousepro.FloatingService;
import com.example.ssmousepro.JogoAdapter;
import com.example.ssmousepro.PlansBottomSheet;
import com.example.ssmousepro.PreferencesActivity;
import com.example.ssmousepro.billing.BillingProducts;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ob0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7738a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7739b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f7740c;

    public /* synthetic */ ob0(int i, Object obj, Object obj2) {
        this.f7738a = i;
        this.f7739b = obj;
        this.f7740c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f7738a;
        Object obj = this.f7740c;
        Object obj2 = this.f7739b;
        switch (i) {
            case 0:
                ((FloatingService) obj2).alternarModoDigitar((TextView) obj);
                break;
            case 1:
                ((FrameLayout) obj2).removeView((FrameLayout) obj);
                break;
            case 2:
                JogoAdapter.onBindViewHolder$lambda$0((JogoAdapter.JogoViewHolder) obj2, (JogoAdapter) obj, view);
                break;
            case 3:
                PlansBottomSheet.montarPlanos$lambda$10((PlansBottomSheet) obj2, (BillingProducts.Plan) obj, view);
                break;
            default:
                ((PreferencesActivity) obj2).iniciarCapturaAtalho((AtalhosPrefs.Acao) obj);
                break;
        }
    }
}

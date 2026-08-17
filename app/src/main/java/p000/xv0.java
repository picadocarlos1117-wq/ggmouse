package p000;

import android.view.View;
import com.example.ssmousepro.LoginActivity;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xv0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12735a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LoginActivity f12736b;

    public /* synthetic */ xv0(LoginActivity loginActivity, int i) {
        this.f12735a = i;
        this.f12736b = loginActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f12735a;
        LoginActivity loginActivity = this.f12736b;
        switch (i) {
            case 0:
                LoginActivity.configurarAbas$lambda$4(loginActivity, view);
                break;
            case 1:
                LoginActivity.configurarAbas$lambda$5(loginActivity, view);
                break;
            case 2:
                loginActivity.enviarCodigo();
                break;
            case 3:
                LoginActivity.vincularViews$lambda$2(loginActivity, view);
                break;
            default:
                LoginActivity.vincularViews$lambda$3(loginActivity, view);
                break;
        }
    }
}

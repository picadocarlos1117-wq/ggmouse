package p000;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.example.ssmousepro.FloatingService;
import com.example.ssmousepro.hud.FpsViewHudView;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xc0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12555a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f12556b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f12557c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f12558d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f12559e;

    public /* synthetic */ xc0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f12555a = i;
        this.f12556b = obj;
        this.f12557c = obj2;
        this.f12558d = obj3;
        this.f12559e = obj4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f12555a;
        Object obj = this.f12559e;
        Object obj2 = this.f12558d;
        Object obj3 = this.f12557c;
        Object obj4 = this.f12556b;
        switch (i) {
            case 0:
                FloatingService.abrirPainelConfigFps$lambda$183((FloatingService) obj4, (FrameLayout) obj3, (FpsViewHudView) obj2, (EditText) obj, view);
                break;
            default:
                ge1 ge1Var = (ge1) obj4;
                y12 y12Var = (y12) obj2;
                pe1 pe1Var = (pe1) obj;
                f80 f80Var = (f80) ((ee1) obj3);
                if (f80Var.m2770r(29)) {
                    x00 x00VarM2769q = f80Var.m2769q();
                    x00VarM2769q.getClass();
                    w00 w00Var = new w00(x00VarM2769q);
                    e22 e22Var = new e22(y12Var, qm0.m5570t(Integer.valueOf(pe1Var.f8869b)));
                    y12 y12Var2 = e22Var.f3180a;
                    w00Var.m2922a(y12Var2.f12804c);
                    w00Var.f4038q.put(y12Var2, e22Var);
                    w00Var.m6678f(pe1Var.f8868a.f5652b.f12804c);
                    f80Var.m2747H(new x00(w00Var));
                    String str = pe1Var.f8870c;
                    switch (ge1Var.f4169c) {
                        case 0:
                            ge1Var.f4170d.f9972f.f7391b[1] = str;
                            break;
                    }
                    ge1Var.f4168b.f9987p.dismiss();
                    break;
                }
                break;
        }
    }
}

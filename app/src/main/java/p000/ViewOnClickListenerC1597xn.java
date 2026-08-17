package p000;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.sousasantoslogic.sspro.R;

/* JADX INFO: renamed from: xn */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1597xn implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12651a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f12652b;

    public /* synthetic */ ViewOnClickListenerC1597xn(Object obj, int i) {
        this.f12651a = i;
        this.f12652b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f12651a;
        boolean z = false;
        Object obj = this.f12652b;
        switch (i) {
            case 0:
                C0106bo c0106bo = (C0106bo) obj;
                EditText editText = c0106bo.f1449i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                c0106bo.m6869p();
                return;
            case 1:
                ((p40) obj).m5201t();
                return;
            case 2:
                ((wz0) obj).m6848g();
                throw null;
            case 3:
                gc1 gc1Var = (gc1) obj;
                EditText editText2 = gc1Var.f4142f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = gc1Var.f4142f;
                if (editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    z = true;
                }
                EditText editText4 = gc1Var.f4142f;
                if (z) {
                    editText4.setTransformationMethod(null);
                } else {
                    editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    gc1Var.f4142f.setSelection(selectionEnd);
                }
                gc1Var.m6869p();
                return;
            case 4:
                re1 re1Var = (re1) obj;
                re1Var.m5827k(!re1Var.f9988p0);
                return;
            case 5:
                re1 re1Var2 = ((ge1) obj).f4170d;
                ee1 ee1Var = re1Var2.f9986o0;
                if (ee1Var == null || !((f80) ee1Var).m2770r(29)) {
                    return;
                }
                x00 x00VarM2769q = ((f80) re1Var2.f9986o0).m2769q();
                ee1 ee1Var2 = re1Var2.f9986o0;
                x00VarM2769q.getClass();
                w00 w00Var = new w00(x00VarM2769q);
                w00Var.m2922a(1);
                w00Var.m6678f(1);
                ((f80) ee1Var2).m2747H(new x00(w00Var));
                re1Var2.f9972f.f7391b[1] = re1Var2.getResources().getString(R.string.exo_track_selection_auto);
                re1Var2.f9987p.dismiss();
                return;
            case 6:
                me1 me1Var = (me1) obj;
                re1 re1Var3 = me1Var.f6784d;
                int bindingAdapterPosition = me1Var.getBindingAdapterPosition();
                View view2 = re1Var3.f9943E;
                if (bindingAdapterPosition == 0) {
                    ke1 ke1Var = re1Var3.f9974g;
                    view2.getClass();
                    re1Var3.m5820d(ke1Var, view2);
                    return;
                } else {
                    if (bindingAdapterPosition != 1) {
                        re1Var3.f9987p.dismiss();
                        return;
                    }
                    ge1 ge1Var = re1Var3.f9983n;
                    view2.getClass();
                    re1Var3.m5820d(ge1Var, view2);
                    return;
                }
            case 7:
                re1 re1Var4 = ((ge1) obj).f4170d;
                ee1 ee1Var3 = re1Var4.f9986o0;
                if (ee1Var3 == null || !((f80) ee1Var3).m2770r(29)) {
                    return;
                }
                x00 x00VarM2769q2 = ((f80) re1Var4.f9986o0).m2769q();
                ee1 ee1Var4 = re1Var4.f9986o0;
                x00VarM2769q2.getClass();
                w00 w00Var2 = new w00(x00VarM2769q2);
                w00Var2.m2922a(3);
                w00Var2.f4037p = -3;
                w00Var2.mo2924c(new String[0]);
                w00Var2.f4036o = 0;
                ((f80) ee1Var4).m2747H(new x00(w00Var2));
                re1Var4.f9987p.dismiss();
                return;
            default:
                we1 we1Var = (we1) obj;
                we1Var.m6769g();
                if (view.getId() == R.id.exo_overflow_show) {
                    we1Var.f12110q.start();
                    return;
                } else {
                    if (view.getId() == R.id.exo_overflow_hide) {
                        we1Var.f12111r.start();
                        return;
                    }
                    return;
                }
        }
    }
}

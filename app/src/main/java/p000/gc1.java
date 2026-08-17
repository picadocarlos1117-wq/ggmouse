package p000;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.sousasantoslogic.sspro.R;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class gc1 extends x60 {

    /* JADX INFO: renamed from: e */
    public final int f4141e;

    /* JADX INFO: renamed from: f */
    public EditText f4142f;

    /* JADX INFO: renamed from: g */
    public final ViewOnClickListenerC1597xn f4143g;

    public gc1(w60 w60Var, int i) {
        super(w60Var);
        this.f4141e = R.drawable.design_password_eye;
        this.f4143g = new ViewOnClickListenerC1597xn(this, 3);
        if (i != 0) {
            this.f4141e = i;
        }
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: b */
    public final void mo2955b() {
        m6869p();
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: c */
    public final int mo1008c() {
        return R.string.password_toggle_content_description;
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: d */
    public final int mo1009d() {
        return this.f4141e;
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: f */
    public final View.OnClickListener mo1011f() {
        return this.f4143g;
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: j */
    public final boolean mo2956j() {
        return true;
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: k */
    public final boolean mo2957k() {
        EditText editText = this.f4142f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: l */
    public final void mo1013l(EditText editText) {
        this.f4142f = editText;
        m6869p();
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: q */
    public final void mo1015q() {
        EditText editText = this.f4142f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f4142f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: r */
    public final void mo1016r() {
        EditText editText = this.f4142f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}

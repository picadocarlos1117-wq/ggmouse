package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.android.material.textfield.TextInputLayout;
import com.sousasantoslogic.sspro.R;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class p40 extends x60 {

    /* JADX INFO: renamed from: e */
    public final int f8700e;

    /* JADX INFO: renamed from: f */
    public final int f8701f;

    /* JADX INFO: renamed from: g */
    public final TimeInterpolator f8702g;

    /* JADX INFO: renamed from: h */
    public AutoCompleteTextView f8703h;

    /* JADX INFO: renamed from: i */
    public final ViewOnClickListenerC1597xn f8704i;

    /* JADX INFO: renamed from: j */
    public final ViewOnFocusChangeListenerC1634yn f8705j;

    /* JADX INFO: renamed from: k */
    public final C1521vl f8706k;

    /* JADX INFO: renamed from: l */
    public boolean f8707l;

    /* JADX INFO: renamed from: m */
    public boolean f8708m;

    /* JADX INFO: renamed from: n */
    public boolean f8709n;

    /* JADX INFO: renamed from: o */
    public long f8710o;

    /* JADX INFO: renamed from: p */
    public AccessibilityManager f8711p;

    /* JADX INFO: renamed from: q */
    public ValueAnimator f8712q;

    /* JADX INFO: renamed from: r */
    public ValueAnimator f8713r;

    public p40(w60 w60Var) {
        super(w60Var);
        int i = 1;
        this.f8704i = new ViewOnClickListenerC1597xn(this, i);
        this.f8705j = new ViewOnFocusChangeListenerC1634yn(this, i);
        this.f8706k = new C1521vl(this, 8);
        this.f8710o = Long.MAX_VALUE;
        this.f8701f = rc2.m5790j0(w60Var.getContext(), R.attr.motionDurationShort3, 67);
        this.f8700e = rc2.m5790j0(w60Var.getContext(), R.attr.motionDurationShort3, 50);
        this.f8702g = rc2.m5792k0(w60Var.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0779j6.f5284a);
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: a */
    public final void mo1007a() {
        if (this.f8711p.isTouchExplorationEnabled() && this.f8703h.getInputType() != 0 && !this.f12463d.hasFocus()) {
            this.f8703h.dismissDropDown();
        }
        this.f8703h.post(new RunnableC1430t4(this, 13));
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: c */
    public final int mo1008c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: d */
    public final int mo1009d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: e */
    public final View.OnFocusChangeListener mo1010e() {
        return this.f8705j;
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: f */
    public final View.OnClickListener mo1011f() {
        return this.f8704i;
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: h */
    public final InterfaceC1167o2 mo5196h() {
        return this.f8706k;
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: i */
    public final boolean mo5197i(int i) {
        return i != 0;
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: k */
    public final boolean mo2957k() {
        return this.f8709n;
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: l */
    public final void mo1013l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            l41.m4048q("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
            return;
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f8703h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new n40(this, 0));
        this.f8703h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: o40
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                p40 p40Var = this.f7648a;
                p40Var.f8708m = true;
                p40Var.f8710o = System.currentTimeMillis();
                p40Var.m5200s(false);
            }
        });
        this.f8703h.setThreshold(0);
        TextInputLayout textInputLayout = this.f12460a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f8711p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = i72.f4849a;
            s62.m5998s(this.f12463d, 2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: m */
    public final void mo5198m(C1539w2 c1539w2) {
        AccessibilityNodeInfo accessibilityNodeInfo = c1539w2.f11909a;
        if (this.f8703h.getInputType() == 0) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: n */
    public final void mo5199n(AccessibilityEvent accessibilityEvent) {
        if (this.f8711p.isEnabled() && this.f8703h.getInputType() == 0) {
            boolean z = accessibilityEvent.getEventType() == 32768 && this.f8709n && !this.f8703h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z) {
                m5201t();
                this.f8708m = true;
                this.f8710o = System.currentTimeMillis();
            }
        }
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: q */
    public final void mo1015q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(TouchPipeline.SIZE, 1.0f);
        TimeInterpolator timeInterpolator = this.f8702g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f8701f);
        int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new p00(this, i));
        this.f8713r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, TouchPipeline.SIZE);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f8700e);
        valueAnimatorOfFloat2.addUpdateListener(new p00(this, i));
        this.f8712q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new C1057l3(this, 3));
        this.f8711p = (AccessibilityManager) this.f12462c.getSystemService("accessibility");
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: r */
    public final void mo1016r() {
        AutoCompleteTextView autoCompleteTextView = this.f8703h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f8703h.setOnDismissListener(null);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m5200s(boolean z) {
        if (this.f8709n != z) {
            this.f8709n = z;
            this.f8713r.cancel();
            this.f8712q.start();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m5201t() {
        if (this.f8703h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f8710o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f8708m = false;
        }
        if (this.f8708m) {
            this.f8708m = false;
            return;
        }
        m5200s(!this.f8709n);
        boolean z = this.f8709n;
        AutoCompleteTextView autoCompleteTextView = this.f8703h;
        if (!z) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            this.f8703h.showDropDown();
        }
    }
}

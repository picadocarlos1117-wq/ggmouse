package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.sousasantoslogic.sspro.R;

/* JADX INFO: renamed from: t7 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDialogC1433t7 extends DialogC0650fr implements InterfaceC1580x6 {
    private AbstractC0593e7 mDelegate;
    private final wq0 mKeyDispatcher;

    public AbstractDialogC1433t7(Context context, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        super(context, i2);
        this.mKeyDispatcher = new wq0() { // from class: s7
            @Override // p000.wq0
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f10271a.superDispatchKeyEvent(keyEvent);
            }
        };
        AbstractC0593e7 delegate = getDelegate();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C1359r7) delegate).f9777Y = i;
        delegate.mo2537c();
    }

    @Override // p000.DialogC0650fr, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7 = (LayoutInflaterFactory2C1359r7) getDelegate();
        layoutInflaterFactory2C1359r7.m5736w();
        ((ViewGroup) layoutInflaterFactory2C1359r7.f9758F.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C1359r7.f9794r.m4064a(layoutInflaterFactory2C1359r7.f9793q.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().mo2538e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        wq0 wq0Var = this.mKeyDispatcher;
        if (wq0Var == null) {
            return false;
        }
        return wq0Var.superDispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7 = (LayoutInflaterFactory2C1359r7) getDelegate();
        layoutInflaterFactory2C1359r7.m5736w();
        return (T) layoutInflaterFactory2C1359r7.f9793q.findViewById(i);
    }

    public AbstractC0593e7 getDelegate() {
        if (this.mDelegate == null) {
            ExecutorC1361r9 executorC1361r9 = AbstractC0593e7.f3225a;
            this.mDelegate = new LayoutInflaterFactory2C1359r7(getContext(), getWindow(), this, this);
        }
        return this.mDelegate;
    }

    public AbstractC0737i3 getSupportActionBar() {
        LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7 = (LayoutInflaterFactory2C1359r7) getDelegate();
        layoutInflaterFactory2C1359r7.m5720A();
        return layoutInflaterFactory2C1359r7.f9796t;
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        getDelegate().mo2536a();
    }

    @Override // p000.DialogC0650fr, android.app.Dialog
    public void onCreate(Bundle bundle) {
        LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7 = (LayoutInflaterFactory2C1359r7) getDelegate();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(layoutInflaterFactory2C1359r7.f9792p);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(layoutInflaterFactory2C1359r7);
        } else {
            layoutInflaterFrom.getFactory2();
        }
        super.onCreate(bundle);
        getDelegate().mo2537c();
    }

    @Override // p000.DialogC0650fr, android.app.Dialog
    public void onStop() {
        super.onStop();
        LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7 = (LayoutInflaterFactory2C1359r7) getDelegate();
        layoutInflaterFactory2C1359r7.m5720A();
        AbstractC0737i3 abstractC0737i3 = layoutInflaterFactory2C1359r7.f9796t;
        if (abstractC0737i3 != null) {
            abstractC0737i3.mo2299m(false);
        }
    }

    @Override // p000.InterfaceC1580x6
    public AbstractC0086b4 onWindowStartingSupportActionMode(InterfaceC0005a4 interfaceC0005a4) {
        return null;
    }

    @Override // p000.DialogC0650fr, android.app.Dialog
    public void setContentView(int i) {
        getDelegate().mo2540h(i);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        getDelegate().mo2543l(getContext().getString(i));
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo2539g(i);
    }

    @Override // p000.DialogC0650fr, android.app.Dialog
    public void setContentView(View view) {
        getDelegate().mo2541i(view);
    }

    @Override // p000.DialogC0650fr, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo2542k(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().mo2543l(charSequence);
    }

    @Override // p000.InterfaceC1580x6
    public void onSupportActionModeFinished(AbstractC0086b4 abstractC0086b4) {
    }

    @Override // p000.InterfaceC1580x6
    public void onSupportActionModeStarted(AbstractC0086b4 abstractC0086b4) {
    }
}

package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.sousasantoslogic.sspro.R;

/* JADX INFO: renamed from: fr */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class DialogC0650fr extends Dialog implements ms0, sa1, jp1 {
    private os0 _lifecycleRegistry;
    private final ra1 onBackPressedDispatcher;
    private final ip1 savedStateRegistryController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC0650fr(Context context, int i) {
        super(context, i);
        context.getClass();
        this.savedStateRegistryController = new ip1(this);
        this.onBackPressedDispatcher = new ra1(new RunnableC1430t4(this, 9));
    }

    /* JADX INFO: renamed from: a */
    public static void m2847a(DialogC0650fr dialogC0650fr) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        initializeViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    @Override // p000.ms0
    public fs0 getLifecycle() {
        os0 os0Var = this._lifecycleRegistry;
        if (os0Var != null) {
            return os0Var;
        }
        os0 os0Var2 = new os0(this);
        this._lifecycleRegistry = os0Var2;
        return os0Var2;
    }

    @Override // p000.sa1
    public final ra1 getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override // p000.jp1
    public hp1 getSavedStateRegistry() {
        return this.savedStateRegistryController.f5128b;
    }

    public void initializeViewTreeOwners() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.onBackPressedDispatcher.m5754b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            ra1 ra1Var = this.onBackPressedDispatcher;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            ra1Var.getClass();
            ra1Var.f9861e = onBackInvokedDispatcher;
            ra1Var.m5755c(ra1Var.f9863g);
        }
        this.savedStateRegistryController.m3472b(bundle);
        os0 os0Var = this._lifecycleRegistry;
        if (os0Var == null) {
            os0Var = new os0(this);
            this._lifecycleRegistry = os0Var;
        }
        os0Var.m5053e(ds0.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.savedStateRegistryController.m3473c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        os0 os0Var = this._lifecycleRegistry;
        if (os0Var == null) {
            os0Var = new os0(this);
            this._lifecycleRegistry = os0Var;
        }
        os0Var.m5053e(ds0.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        os0 os0Var = this._lifecycleRegistry;
        if (os0Var == null) {
            os0Var = new os0(this);
            this._lifecycleRegistry = os0Var;
        }
        os0Var.m5053e(ds0.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        initializeViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        initializeViewTreeOwners();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        initializeViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }
}

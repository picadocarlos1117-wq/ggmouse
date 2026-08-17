package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.sousasantoslogic.sspro.R;
import p000.C0694gy;
import p000.DialogC0650fr;
import p000.RunnableC1621ya;
import p000.ay0;
import p000.eu0;
import p000.f40;
import p000.fu0;
import p000.g20;
import p000.gf0;
import p000.gu0;
import p000.h20;
import p000.hu0;
import p000.i20;
import p000.j91;
import p000.jd0;
import p000.of0;
import p000.pf0;
import p000.qo1;
import p000.to1;
import p000.ve0;

/* JADX INFO: renamed from: androidx.fragment.app.g */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0043g extends AbstractComponentCallbacksC0048l implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private boolean mCreatingDialog;
    private Dialog mDialog;
    private boolean mDismissed;
    private Handler mHandler;
    private boolean mShownByMe;
    private boolean mViewDestroyed;
    private Runnable mDismissRunnable = new RunnableC1621ya(this, 8);
    private DialogInterface.OnCancelListener mOnCancelListener = new g20(this);
    private DialogInterface.OnDismissListener mOnDismissListener = new h20(this);
    private int mStyle = 0;
    private int mTheme = 0;
    private boolean mCancelable = true;
    private boolean mShowsDialog = true;
    private int mBackStackId = -1;
    private j91 mObserver = new ay0(this, 24);
    private boolean mDialogCreated = false;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0048l
    public ve0 createFragmentContainer() {
        return new i20(this, super.createFragmentContainer());
    }

    public void dismiss() {
        m350f(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        m350f(true, false, false);
    }

    public void dismissNow() {
        m350f(false, false, true);
    }

    /* JADX INFO: renamed from: f */
    public final void m350f(boolean z, boolean z2, boolean z3) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            if (z3) {
                AbstractC0056t parentFragmentManager = getParentFragmentManager();
                int i = this.mBackStackId;
                if (i < 0) {
                    parentFragmentManager.getClass();
                    f40.m2713i(jd0.m3609g(i, "Bad id: "));
                    return;
                }
                parentFragmentManager.m376N(i, 1);
            } else {
                AbstractC0056t parentFragmentManager2 = getParentFragmentManager();
                int i2 = this.mBackStackId;
                parentFragmentManager2.getClass();
                if (i2 < 0) {
                    f40.m2713i(jd0.m3609g(i2, "Bad id: "));
                    return;
                }
                parentFragmentManager2.m410v(new gf0(parentFragmentManager2, i2), z);
            }
            this.mBackStackId = -1;
            return;
        }
        AbstractC0056t parentFragmentManager3 = getParentFragmentManager();
        parentFragmentManager3.getClass();
        C0037a c0037a = new C0037a(parentFragmentManager3);
        c0037a.f8887o = true;
        AbstractC0056t abstractC0056t = this.mFragmentManager;
        AbstractC0056t abstractC0056t2 = c0037a.f657p;
        if (abstractC0056t != null && abstractC0056t != abstractC0056t2) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0037a.m5255b(new of0(this, 3));
        if (z3) {
            if (c0037a.f8879g) {
                f40.m2719o("This transaction is already being added to the back stack");
                return;
            } else {
                abstractC0056t2.m413y(c0037a, false);
                return;
            }
        }
        if (z) {
            c0037a.m333e(true);
        } else {
            c0037a.m333e(false);
        }
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0048l
    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0048l
    public void onAttach(Context context) {
        Object obj;
        super.onAttach(context);
        hu0 viewLifecycleOwnerLiveData = getViewLifecycleOwnerLiveData();
        j91 j91Var = this.mObserver;
        viewLifecycleOwnerLiveData.getClass();
        hu0.m3291a("observeForever");
        eu0 eu0Var = new eu0(viewLifecycleOwnerLiveData, j91Var);
        to1 to1Var = viewLifecycleOwnerLiveData.f4706b;
        qo1 qo1VarMo5457a = to1Var.mo5457a(j91Var);
        if (qo1VarMo5457a != null) {
            obj = qo1VarMo5457a.f9551b;
        } else {
            qo1 qo1Var = new qo1(j91Var, eu0Var);
            to1Var.f10916d++;
            qo1 qo1Var2 = to1Var.f10914b;
            if (qo1Var2 == null) {
                to1Var.f10913a = qo1Var;
                to1Var.f10914b = qo1Var;
            } else {
                qo1Var2.f9552c = qo1Var;
                qo1Var.f9553d = qo1Var2;
                to1Var.f10914b = qo1Var;
            }
            obj = null;
        }
        gu0 gu0Var = (gu0) obj;
        if (gu0Var instanceof fu0) {
            f40.m2713i("Cannot add the same observer with different lifecycles");
            return;
        }
        if (gu0Var == null) {
            eu0Var.m3057a(true);
        }
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0048l
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (AbstractC0056t.m363G(3)) {
            toString();
        }
        return new DialogC0650fr(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0048l
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0048l
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().mo1070g(this.mObserver);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (AbstractC0056t.m363G(3)) {
            toString();
        }
        m350f(true, true, false);
    }

    public View onFindViewById(int i) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0048l
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        boolean z = this.mShowsDialog;
        if (z && !this.mCreatingDialog) {
            if (z && !this.mDialogCreated) {
                try {
                    this.mCreatingDialog = true;
                    Dialog dialogOnCreateDialog = onCreateDialog(bundle);
                    this.mDialog = dialogOnCreateDialog;
                    if (this.mShowsDialog) {
                        setupDialog(dialogOnCreateDialog, this.mStyle);
                        Context context = getContext();
                        if (context instanceof Activity) {
                            this.mDialog.setOwnerActivity((Activity) context);
                        }
                        this.mDialog.setCancelable(this.mCancelable);
                        this.mDialog.setOnCancelListener(this.mOnCancelListener);
                        this.mDialog.setOnDismissListener(this.mOnDismissListener);
                        this.mDialogCreated = true;
                    } else {
                        this.mDialog = null;
                    }
                    this.mCreatingDialog = false;
                } catch (Throwable th) {
                    this.mCreatingDialog = false;
                    throw th;
                }
            }
            if (AbstractC0056t.m363G(2)) {
                toString();
            }
            Dialog dialog = this.mDialog;
            if (dialog != null) {
                return layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (AbstractC0056t.m363G(2)) {
            toString();
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    public boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0048l
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, bundleOnSaveInstanceState);
        }
        int i = this.mStyle;
        if (i != 0) {
            bundle.putInt(SAVED_STYLE, i);
        }
        int i2 = this.mTheme;
        if (i2 != 0) {
            bundle.putInt(SAVED_THEME, i2);
        }
        boolean z = this.mCancelable;
        if (!z) {
            bundle.putBoolean(SAVED_CANCELABLE, z);
        }
        boolean z2 = this.mShowsDialog;
        if (!z2) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z2);
        }
        int i3 = this.mBackStackId;
        if (i3 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i3);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0048l
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0048l
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0048l
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0048l
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        C0694gy.m3080f("DialogFragment ", this, " does not have a Dialog.");
        return null;
    }

    public void setCancelable(boolean z) {
        this.mCancelable = z;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void setShowsDialog(boolean z) {
        this.mShowsDialog = z;
    }

    public void setStyle(int i, int i2) {
        if (AbstractC0056t.m363G(2)) {
            toString();
        }
        this.mStyle = i;
        if (i == 2 || i == 3) {
            this.mTheme = android.R.style.Theme.Panel;
        }
        if (i2 != 0) {
            this.mTheme = i2;
        }
    }

    public void setupDialog(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(AbstractC0056t abstractC0056t, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        abstractC0056t.getClass();
        C0037a c0037a = new C0037a(abstractC0056t);
        c0037a.f8887o = true;
        c0037a.mo331c(0, this, str, 1);
        c0037a.m333e(false);
    }

    public void showNow(AbstractC0056t abstractC0056t, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        abstractC0056t.getClass();
        C0037a c0037a = new C0037a(abstractC0056t);
        c0037a.f8887o = true;
        c0037a.mo331c(0, this, str, 1);
        if (c0037a.f8879g) {
            f40.m2719o("This transaction is already being added to the back stack");
        } else {
            c0037a.f657p.m413y(c0037a, false);
        }
    }

    public int show(pf0 pf0Var, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        pf0Var.mo331c(0, this, str, 1);
        this.mViewDestroyed = false;
        int iM333e = ((C0037a) pf0Var).m333e(false);
        this.mBackStackId = iM333e;
        return iM333e;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}

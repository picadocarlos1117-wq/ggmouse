package p000;

import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.example.ssmousepro.PlansBottomSheet;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sousasantoslogic.sspro.R;
import io.github.muntashirakon.adb.PairingConnectionCtx;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: wi */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDialogC1555wi extends AbstractDialogC1433t7 {
    private ez0 backOrchestrator;
    private BottomSheetBehavior<FrameLayout> behavior;
    private FrameLayout bottomSheet;
    private AbstractC1333qi bottomSheetCallback;
    boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;
    private FrameLayout container;
    private CoordinatorLayout coordinator;
    boolean dismissWithAnimation;
    private C1518vi edgeToEdgeCallback;
    private boolean edgeToEdgeEnabled;

    public AbstractDialogC1555wi(AbstractActivityC1469u6 abstractActivityC1469u6) {
        TypedValue typedValue = new TypedValue();
        super(abstractActivityC1469u6, abstractActivityC1469u6.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog);
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new C1481ui((PlansBottomSheet) this);
        supportRequestWindowFeature(1);
        this.edgeToEdgeEnabled = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
        this.edgeToEdgeEnabled = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    @Deprecated
    public static void setLightStatusBar(View view, boolean z) {
        int systemUiVisibility = view.getSystemUiVisibility();
        view.setSystemUiVisibility(z ? systemUiVisibility | PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE : systemUiVisibility & (-8193));
    }

    /* JADX INFO: renamed from: b */
    public final void m6795b() {
        if (this.container == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.container = frameLayout;
            this.coordinator = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.container.findViewById(R.id.design_bottom_sheet);
            this.bottomSheet = frameLayout2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorM1648A = BottomSheetBehavior.m1648A(frameLayout2);
            this.behavior = bottomSheetBehaviorM1648A;
            AbstractC1333qi abstractC1333qi = this.bottomSheetCallback;
            ArrayList arrayList = bottomSheetBehaviorM1648A.f1977W;
            if (!arrayList.contains(abstractC1333qi)) {
                arrayList.add(abstractC1333qi);
            }
            this.behavior.m1654F(this.cancelable);
            this.backOrchestrator = new ez0(this.behavior, this.bottomSheet);
        }
    }

    /* JADX INFO: renamed from: c */
    public final FrameLayout m6796c(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m6795b();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.container.findViewById(R.id.coordinator);
        int i2 = 0;
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.edgeToEdgeEnabled) {
            FrameLayout frameLayout = this.bottomSheet;
            ay0 ay0Var = new ay0(this, 11);
            WeakHashMap weakHashMap = i72.f4849a;
            y62.m7020u(frameLayout, ay0Var);
        }
        this.bottomSheet.removeAllViews();
        FrameLayout frameLayout2 = this.bottomSheet;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new ViewOnClickListenerC1407si(this, i2));
        i72.m3378j(this.bottomSheet, new C1444ti(this, i2));
        this.bottomSheet.setOnTouchListener(new ViewOnTouchListenerC1108mh(1));
        return this.container;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> behavior = getBehavior();
        if (!this.dismissWithAnimation || behavior.f1966L == 5) {
            super.cancel();
        } else {
            behavior.m1656H(5);
        }
    }

    public BottomSheetBehavior<FrameLayout> getBehavior() {
        if (this.behavior == null) {
            m6795b();
        }
        return this.behavior;
    }

    public boolean getDismissWithAnimation() {
        return this.dismissWithAnimation;
    }

    public boolean getEdgeToEdgeEnabled() {
        return this.edgeToEdgeEnabled;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.edgeToEdgeEnabled && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.container;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.coordinator;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            AbstractC1337qm.m5529b0(window, !z);
            C1518vi c1518vi = this.edgeToEdgeCallback;
            if (c1518vi != null) {
                c1518vi.m6628e(window);
            }
        }
        ez0 ez0Var = this.backOrchestrator;
        if (ez0Var == null) {
            return;
        }
        View view = ez0Var.f3503c;
        boolean z2 = this.cancelable;
        bz0 bz0Var = ez0Var.f3501a;
        if (z2) {
            if (bz0Var != null) {
                bz0Var.m1074b(ez0Var.f3502b, view, false);
            }
        } else if (bz0Var != null) {
            bz0Var.m1075c(view);
        }
    }

    @Override // p000.AbstractDialogC1433t7, p000.DialogC0650fr, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        bz0 bz0Var;
        C1518vi c1518vi = this.edgeToEdgeCallback;
        if (c1518vi != null) {
            c1518vi.m6628e(null);
        }
        ez0 ez0Var = this.backOrchestrator;
        if (ez0Var == null || (bz0Var = ez0Var.f3501a) == null) {
            return;
        }
        bz0Var.m1075c(ez0Var.f3503c);
    }

    @Override // p000.DialogC0650fr, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
        if (bottomSheetBehavior == null || bottomSheetBehavior.f1966L != 5) {
            return;
        }
        bottomSheetBehavior.m1656H(4);
    }

    public void removeDefaultCallback() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
        bottomSheetBehavior.f1977W.remove(this.bottomSheetCallback);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        ez0 ez0Var;
        super.setCancelable(z);
        if (this.cancelable != z) {
            this.cancelable = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.m1654F(z);
            }
            if (getWindow() == null || (ez0Var = this.backOrchestrator) == null) {
                return;
            }
            View view = ez0Var.f3503c;
            boolean z2 = this.cancelable;
            bz0 bz0Var = ez0Var.f3501a;
            if (z2) {
                if (bz0Var != null) {
                    bz0Var.m1074b(ez0Var.f3502b, view, false);
                }
            } else if (bz0Var != null) {
                bz0Var.m1075c(view);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.cancelable) {
            this.cancelable = true;
        }
        this.canceledOnTouchOutside = z;
        this.canceledOnTouchOutsideSet = true;
    }

    @Override // p000.AbstractDialogC1433t7, p000.DialogC0650fr, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(m6796c(view, 0, null));
    }

    public void setDismissWithAnimation(boolean z) {
        this.dismissWithAnimation = z;
    }

    public boolean shouldWindowCloseOnTouchOutside() {
        if (!this.canceledOnTouchOutsideSet) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
            this.canceledOnTouchOutside = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.canceledOnTouchOutsideSet = true;
        }
        return this.canceledOnTouchOutside;
    }

    @Override // p000.AbstractDialogC1433t7, p000.DialogC0650fr, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(m6796c(null, i, null));
    }

    @Override // p000.AbstractDialogC1433t7, p000.DialogC0650fr, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(m6796c(view, 0, layoutParams));
    }
}

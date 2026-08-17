package p000;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.example.ssmousepro.injection.TouchPipeline;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class da2 extends AbstractC0737i3 implements InterfaceC1131n3 {

    /* JADX INFO: renamed from: y */
    public static final AccelerateInterpolator f2833y = new AccelerateInterpolator();

    /* JADX INFO: renamed from: z */
    public static final DecelerateInterpolator f2834z = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a */
    public Context f2835a;

    /* JADX INFO: renamed from: b */
    public Context f2836b;

    /* JADX INFO: renamed from: c */
    public ActionBarOverlayLayout f2837c;

    /* JADX INFO: renamed from: d */
    public ActionBarContainer f2838d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0079ay f2839e;

    /* JADX INFO: renamed from: f */
    public ActionBarContextView f2840f;

    /* JADX INFO: renamed from: g */
    public final View f2841g;

    /* JADX INFO: renamed from: h */
    public boolean f2842h;

    /* JADX INFO: renamed from: i */
    public ca2 f2843i;

    /* JADX INFO: renamed from: j */
    public ca2 f2844j;

    /* JADX INFO: renamed from: k */
    public C0558d8 f2845k;

    /* JADX INFO: renamed from: l */
    public boolean f2846l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f2847m;

    /* JADX INFO: renamed from: n */
    public int f2848n;

    /* JADX INFO: renamed from: o */
    public boolean f2849o;

    /* JADX INFO: renamed from: p */
    public boolean f2850p;

    /* JADX INFO: renamed from: q */
    public boolean f2851q;

    /* JADX INFO: renamed from: r */
    public boolean f2852r;

    /* JADX INFO: renamed from: s */
    public c82 f2853s;

    /* JADX INFO: renamed from: t */
    public boolean f2854t;

    /* JADX INFO: renamed from: u */
    public boolean f2855u;

    /* JADX INFO: renamed from: v */
    public final aa2 f2856v;

    /* JADX INFO: renamed from: w */
    public final aa2 f2857w;

    /* JADX INFO: renamed from: x */
    public final ba2 f2858x;

    public da2(Activity activity, boolean z) {
        new ArrayList();
        this.f2847m = new ArrayList();
        this.f2848n = 0;
        this.f2849o = true;
        this.f2852r = true;
        this.f2856v = new aa2(this, 0);
        this.f2857w = new aa2(this, 1);
        this.f2858x = new ba2(this);
        View decorView = activity.getWindow().getDecorView();
        m2303q(decorView);
        if (z) {
            return;
        }
        this.f2841g = decorView.findViewById(R.id.content);
    }

    @Override // p000.AbstractC0737i3
    /* JADX INFO: renamed from: b */
    public final boolean mo2292b() {
        j12 j12Var;
        InterfaceC0079ay interfaceC0079ay = this.f2839e;
        if (interfaceC0079ay == null || (j12Var = ((q12) interfaceC0079ay).f9293a.f513R) == null || j12Var.f5238b == null) {
            return false;
        }
        j12 j12Var2 = ((q12) interfaceC0079ay).f9293a.f513R;
        r31 r31Var = j12Var2 == null ? null : j12Var2.f5238b;
        if (r31Var == null) {
            return true;
        }
        r31Var.collapseActionView();
        return true;
    }

    @Override // p000.AbstractC0737i3
    /* JADX INFO: renamed from: c */
    public final void mo2293c(boolean z) {
        if (z == this.f2846l) {
            return;
        }
        this.f2846l = z;
        ArrayList arrayList = this.f2847m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        l41.m4035b();
    }

    @Override // p000.AbstractC0737i3
    /* JADX INFO: renamed from: d */
    public final int mo2294d() {
        return ((q12) this.f2839e).f9294b;
    }

    @Override // p000.AbstractC0737i3
    /* JADX INFO: renamed from: e */
    public final Context mo2295e() {
        if (this.f2836b == null) {
            TypedValue typedValue = new TypedValue();
            this.f2835a.getTheme().resolveAttribute(com.sousasantoslogic.sspro.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f2836b = new ContextThemeWrapper(this.f2835a, i);
            } else {
                this.f2836b = this.f2835a;
            }
        }
        return this.f2836b;
    }

    @Override // p000.AbstractC0737i3
    /* JADX INFO: renamed from: g */
    public final void mo2296g() {
        m2304r(this.f2835a.getResources().getBoolean(com.sousasantoslogic.sspro.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // p000.AbstractC0737i3
    /* JADX INFO: renamed from: i */
    public final boolean mo2297i(int i, KeyEvent keyEvent) {
        i31 i31Var;
        ca2 ca2Var = this.f2843i;
        if (ca2Var == null || (i31Var = ca2Var.f1729d) == null) {
            return false;
        }
        i31Var.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return i31Var.performShortcut(i, keyEvent, 0);
    }

    @Override // p000.AbstractC0737i3
    /* JADX INFO: renamed from: l */
    public final void mo2298l(boolean z) {
        if (this.f2842h) {
            return;
        }
        int i = z ? 4 : 0;
        q12 q12Var = (q12) this.f2839e;
        int i2 = q12Var.f9294b;
        this.f2842h = true;
        q12Var.m5404a((i & 4) | (i2 & (-5)));
    }

    @Override // p000.AbstractC0737i3
    /* JADX INFO: renamed from: m */
    public final void mo2299m(boolean z) {
        c82 c82Var;
        this.f2854t = z;
        if (z || (c82Var = this.f2853s) == null) {
            return;
        }
        c82Var.m1158a();
    }

    @Override // p000.AbstractC0737i3
    /* JADX INFO: renamed from: n */
    public final void mo2300n(CharSequence charSequence) {
        q12 q12Var = (q12) this.f2839e;
        if (q12Var.f9299g) {
            return;
        }
        Toolbar toolbar = q12Var.f9293a;
        q12Var.f9300h = charSequence;
        if ((q12Var.f9294b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (q12Var.f9299g) {
                i72.m3379k(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // p000.AbstractC0737i3
    /* JADX INFO: renamed from: o */
    public final AbstractC0086b4 mo2301o(C0558d8 c0558d8) {
        ca2 ca2Var = this.f2843i;
        if (ca2Var != null) {
            ca2Var.mo834a();
        }
        this.f2837c.setHideOnContentScrollEnabled(false);
        this.f2840f.m216e();
        ca2 ca2Var2 = new ca2(this, this.f2840f.getContext(), c0558d8);
        i31 i31Var = ca2Var2.f1729d;
        i31Var.m3360w();
        try {
            boolean zMo71d = ((InterfaceC0005a4) ca2Var2.f1730e.f2821b).mo71d(ca2Var2, i31Var);
            i31Var.m3359v();
            if (!zMo71d) {
                return null;
            }
            this.f2843i = ca2Var2;
            ca2Var2.mo840h();
            this.f2840f.m214c(ca2Var2);
            m2302p(true);
            return ca2Var2;
        } catch (Throwable th) {
            i31Var.m3359v();
            throw th;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m2302p(boolean z) {
        b82 b82VarM218i;
        b82 b82VarM218i2;
        boolean z2 = this.f2851q;
        if (z) {
            if (!z2) {
                this.f2851q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2837c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m2305s(false);
            }
        } else if (z2) {
            this.f2851q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2837c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m2305s(false);
        }
        ActionBarContainer actionBarContainer = this.f2838d;
        WeakHashMap weakHashMap = i72.f4849a;
        boolean zM6587c = v62.m6587c(actionBarContainer);
        InterfaceC0079ay interfaceC0079ay = this.f2839e;
        if (!zM6587c) {
            if (z) {
                ((q12) interfaceC0079ay).f9293a.setVisibility(4);
                this.f2840f.setVisibility(0);
                return;
            } else {
                ((q12) interfaceC0079ay).f9293a.setVisibility(0);
                this.f2840f.setVisibility(8);
                return;
            }
        }
        if (z) {
            q12 q12Var = (q12) interfaceC0079ay;
            b82VarM218i = i72.m3369a(q12Var.f9293a);
            b82VarM218i.m942a(TouchPipeline.SIZE);
            b82VarM218i.m944c(100L);
            b82VarM218i.m945d(new p12(q12Var, 4));
            b82VarM218i2 = this.f2840f.m218i(0, 200L);
        } else {
            q12 q12Var2 = (q12) interfaceC0079ay;
            b82 b82VarM3369a = i72.m3369a(q12Var2.f9293a);
            b82VarM3369a.m942a(1.0f);
            b82VarM3369a.m944c(200L);
            b82VarM3369a.m945d(new p12(q12Var2, 0));
            b82VarM218i = this.f2840f.m218i(8, 100L);
            b82VarM218i2 = b82VarM3369a;
        }
        c82 c82Var = new c82();
        ArrayList arrayList = c82Var.f1700a;
        arrayList.add(b82VarM218i);
        View view = (View) b82VarM218i.f1254a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) b82VarM218i2.f1254a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(b82VarM218i2);
        c82Var.m1159b();
    }

    /* JADX INFO: renamed from: q */
    public final void m2303q(View view) {
        InterfaceC0079ay wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.sousasantoslogic.sspro.R.id.decor_content_parent);
        this.f2837c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.sousasantoslogic.sspro.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC0079ay) {
            wrapper = (InterfaceC0079ay) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f2839e = wrapper;
        this.f2840f = (ActionBarContextView) view.findViewById(com.sousasantoslogic.sspro.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.sousasantoslogic.sspro.R.id.action_bar_container);
        this.f2838d = actionBarContainer;
        InterfaceC0079ay interfaceC0079ay = this.f2839e;
        if (interfaceC0079ay == null || this.f2840f == null || actionBarContainer == null) {
            f40.m2719o(da2.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((q12) interfaceC0079ay).f9293a.getContext();
        this.f2835a = context;
        if ((((q12) this.f2839e).f9294b & 4) != 0) {
            this.f2842h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f2839e.getClass();
        m2304r(context.getResources().getBoolean(com.sousasantoslogic.sspro.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f2835a.obtainStyledAttributes(null, ki1.f5846a, com.sousasantoslogic.sspro.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2837c;
            if (!actionBarOverlayLayout2.f413m) {
                f40.m2719o("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.f2855u = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f2838d;
            WeakHashMap weakHashMap = i72.f4849a;
            y62.m7018s(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: r */
    public final void m2304r(boolean z) {
        if (z) {
            this.f2838d.setTabContainer(null);
            ((q12) this.f2839e).getClass();
        } else {
            ((q12) this.f2839e).getClass();
            this.f2838d.setTabContainer(null);
        }
        this.f2839e.getClass();
        ((q12) this.f2839e).f9293a.setCollapsible(false);
        this.f2837c.setHasNonEmbeddedTabs(false);
    }

    /* JADX INFO: renamed from: s */
    public final void m2305s(boolean z) {
        boolean z2 = this.f2851q || !this.f2850p;
        boolean z3 = this.f2852r;
        final ba2 ba2Var = this.f2858x;
        View view = this.f2841g;
        if (!z2) {
            if (z3) {
                this.f2852r = false;
                c82 c82Var = this.f2853s;
                if (c82Var != null) {
                    c82Var.m1158a();
                }
                int i = this.f2848n;
                aa2 aa2Var = this.f2856v;
                if (i != 0 || (!this.f2854t && !z)) {
                    aa2Var.mo139f();
                    return;
                }
                this.f2838d.setAlpha(1.0f);
                this.f2838d.setTransitioning(true);
                c82 c82Var2 = new c82();
                float f = -this.f2838d.getHeight();
                if (z) {
                    int[] iArr = {0, 0};
                    this.f2838d.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                b82 b82VarM3369a = i72.m3369a(this.f2838d);
                b82VarM3369a.m946e(f);
                final View view2 = (View) b82VarM3369a.f1254a.get();
                if (view2 != null) {
                    a82.m115a(view2.animate(), ba2Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: z72
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((da2) ba2Var.f1266a).f2838d.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z4 = c82Var2.f1704e;
                ArrayList arrayList = c82Var2.f1700a;
                if (!z4) {
                    arrayList.add(b82VarM3369a);
                }
                if (this.f2849o && view != null) {
                    b82 b82VarM3369a2 = i72.m3369a(view);
                    b82VarM3369a2.m946e(f);
                    if (!c82Var2.f1704e) {
                        arrayList.add(b82VarM3369a2);
                    }
                }
                boolean z5 = c82Var2.f1704e;
                if (!z5) {
                    c82Var2.f1702c = f2833y;
                }
                if (!z5) {
                    c82Var2.f1701b = 250L;
                }
                if (!z5) {
                    c82Var2.f1703d = aa2Var;
                }
                this.f2853s = c82Var2;
                c82Var2.m1159b();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.f2852r = true;
        c82 c82Var3 = this.f2853s;
        if (c82Var3 != null) {
            c82Var3.m1158a();
        }
        this.f2838d.setVisibility(0);
        int i2 = this.f2848n;
        aa2 aa2Var2 = this.f2857w;
        if (i2 == 0 && (this.f2854t || z)) {
            this.f2838d.setTranslationY(TouchPipeline.SIZE);
            float f2 = -this.f2838d.getHeight();
            if (z) {
                int[] iArr2 = {0, 0};
                this.f2838d.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.f2838d.setTranslationY(f2);
            c82 c82Var4 = new c82();
            b82 b82VarM3369a3 = i72.m3369a(this.f2838d);
            b82VarM3369a3.m946e(TouchPipeline.SIZE);
            final View view3 = (View) b82VarM3369a3.f1254a.get();
            if (view3 != null) {
                a82.m115a(view3.animate(), ba2Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: z72
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((da2) ba2Var.f1266a).f2838d.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z6 = c82Var4.f1704e;
            ArrayList arrayList2 = c82Var4.f1700a;
            if (!z6) {
                arrayList2.add(b82VarM3369a3);
            }
            if (this.f2849o && view != null) {
                view.setTranslationY(f2);
                b82 b82VarM3369a4 = i72.m3369a(view);
                b82VarM3369a4.m946e(TouchPipeline.SIZE);
                if (!c82Var4.f1704e) {
                    arrayList2.add(b82VarM3369a4);
                }
            }
            boolean z7 = c82Var4.f1704e;
            if (!z7) {
                c82Var4.f1702c = f2834z;
            }
            if (!z7) {
                c82Var4.f1701b = 250L;
            }
            if (!z7) {
                c82Var4.f1703d = aa2Var2;
            }
            this.f2853s = c82Var4;
            c82Var4.m1159b();
        } else {
            this.f2838d.setAlpha(1.0f);
            this.f2838d.setTranslationY(TouchPipeline.SIZE);
            if (this.f2849o && view != null) {
                view.setTranslationY(TouchPipeline.SIZE);
            }
            aa2Var2.mo139f();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2837c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = i72.f4849a;
            w62.m6726c(actionBarOverlayLayout);
        }
    }

    public da2(Dialog dialog) {
        new ArrayList();
        this.f2847m = new ArrayList();
        this.f2848n = 0;
        this.f2849o = true;
        this.f2852r = true;
        this.f2856v = new aa2(this, 0);
        this.f2857w = new aa2(this, 1);
        this.f2858x = new ba2(this);
        m2303q(dialog.getWindow().getDecorView());
    }
}

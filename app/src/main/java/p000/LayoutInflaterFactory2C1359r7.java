package p000;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.sun.security.util.DerValue;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: r7 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C1359r7 extends AbstractC0593e7 implements g31, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: m0 */
    public static final zs1 f9749m0 = new zs1();

    /* JADX INFO: renamed from: n0 */
    public static final int[] f9750n0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: o0 */
    public static final boolean f9751o0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: p0 */
    public static final boolean f9752p0 = true;

    /* JADX INFO: renamed from: A */
    public ActionBarContextView f9753A;

    /* JADX INFO: renamed from: B */
    public PopupWindow f9754B;

    /* JADX INFO: renamed from: C */
    public RunnableC0630f7 f9755C;

    /* JADX INFO: renamed from: E */
    public boolean f9757E;

    /* JADX INFO: renamed from: F */
    public ViewGroup f9758F;

    /* JADX INFO: renamed from: G */
    public TextView f9759G;

    /* JADX INFO: renamed from: H */
    public View f9760H;

    /* JADX INFO: renamed from: I */
    public boolean f9761I;

    /* JADX INFO: renamed from: J */
    public boolean f9762J;

    /* JADX INFO: renamed from: K */
    public boolean f9763K;

    /* JADX INFO: renamed from: L */
    public boolean f9764L;

    /* JADX INFO: renamed from: M */
    public boolean f9765M;

    /* JADX INFO: renamed from: N */
    public boolean f9766N;

    /* JADX INFO: renamed from: O */
    public boolean f9767O;

    /* JADX INFO: renamed from: P */
    public boolean f9768P;

    /* JADX INFO: renamed from: Q */
    public C1322q7[] f9769Q;

    /* JADX INFO: renamed from: R */
    public C1322q7 f9770R;

    /* JADX INFO: renamed from: S */
    public boolean f9771S;

    /* JADX INFO: renamed from: T */
    public boolean f9772T;

    /* JADX INFO: renamed from: U */
    public boolean f9773U;

    /* JADX INFO: renamed from: V */
    public boolean f9774V;

    /* JADX INFO: renamed from: W */
    public Configuration f9775W;

    /* JADX INFO: renamed from: X */
    public final int f9776X;

    /* JADX INFO: renamed from: Y */
    public int f9777Y;

    /* JADX INFO: renamed from: Z */
    public int f9778Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f9779a0;

    /* JADX INFO: renamed from: b0 */
    public C1098m7 f9780b0;

    /* JADX INFO: renamed from: c0 */
    public C1098m7 f9781c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f9782d0;

    /* JADX INFO: renamed from: e0 */
    public int f9783e0;

    /* JADX INFO: renamed from: g0 */
    public boolean f9785g0;

    /* JADX INFO: renamed from: h0 */
    public Rect f9786h0;

    /* JADX INFO: renamed from: i0 */
    public Rect f9787i0;

    /* JADX INFO: renamed from: j0 */
    public C1063l9 f9788j0;

    /* JADX INFO: renamed from: k0 */
    public OnBackInvokedDispatcher f9789k0;

    /* JADX INFO: renamed from: l0 */
    public OnBackInvokedCallback f9790l0;

    /* JADX INFO: renamed from: o */
    public final Object f9791o;

    /* JADX INFO: renamed from: p */
    public final Context f9792p;

    /* JADX INFO: renamed from: q */
    public Window f9793q;

    /* JADX INFO: renamed from: r */
    public WindowCallbackC1061l7 f9794r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC1580x6 f9795s;

    /* JADX INFO: renamed from: t */
    public AbstractC0737i3 f9796t;

    /* JADX INFO: renamed from: u */
    public ly1 f9797u;

    /* JADX INFO: renamed from: v */
    public CharSequence f9798v;

    /* JADX INFO: renamed from: w */
    public ActionBarOverlayLayout f9799w;

    /* JADX INFO: renamed from: x */
    public C0667g7 f9800x;

    /* JADX INFO: renamed from: y */
    public C0667g7 f9801y;

    /* JADX INFO: renamed from: z */
    public AbstractC0086b4 f9802z;

    /* JADX INFO: renamed from: D */
    public b82 f9756D = null;

    /* JADX INFO: renamed from: f0 */
    public final RunnableC0630f7 f9784f0 = new RunnableC0630f7(this, 0);

    public LayoutInflaterFactory2C1359r7(Context context, Window window, InterfaceC1580x6 interfaceC1580x6, Object obj) {
        AbstractActivityC1469u6 abstractActivityC1469u6;
        this.f9776X = -100;
        this.f9792p = context;
        this.f9795s = interfaceC1580x6;
        this.f9791o = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof AbstractActivityC1469u6) {
                        abstractActivityC1469u6 = (AbstractActivityC1469u6) context;
                        break;
                    } else if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                abstractActivityC1469u6 = null;
                break;
            }
            if (abstractActivityC1469u6 != null) {
                this.f9776X = ((LayoutInflaterFactory2C1359r7) abstractActivityC1469u6.getDelegate()).f9776X;
            }
        }
        if (this.f9776X == -100) {
            String name = this.f9791o.getClass().getName();
            zs1 zs1Var = f9749m0;
            Integer num = (Integer) zs1Var.getOrDefault(name, null);
            if (num != null) {
                this.f9776X = num.intValue();
                zs1Var.remove(this.f9791o.getClass().getName());
            }
        }
        if (window != null) {
            m5730o(window);
        }
        C1507v7.m6594d();
    }

    /* JADX INFO: renamed from: p */
    public static ov0 m5718p(Context context) {
        ov0 ov0Var;
        ov0 ov0Var2;
        if (Build.VERSION.SDK_INT >= 33 || (ov0Var = AbstractC0593e7.f3227c) == null) {
            return null;
        }
        pv0 pv0Var = ov0Var.f8496a;
        ov0 ov0VarM3366b = AbstractC0741i7.m3366b(context.getApplicationContext().getResources().getConfiguration());
        if (pv0Var.f9178a.isEmpty()) {
            ov0Var2 = ov0.f8495b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < ov0VarM3366b.f8496a.f9178a.size() + pv0Var.f9178a.size()) {
                Locale locale = i < pv0Var.f9178a.size() ? pv0Var.f9178a.get(i) : ov0VarM3366b.f8496a.f9178a.get(i - pv0Var.f9178a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            ov0Var2 = new ov0(new pv0(nv0.m4605a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return ov0Var2.f8496a.f9178a.isEmpty() ? ov0VarM3366b : ov0Var2;
    }

    /* JADX INFO: renamed from: t */
    public static Configuration m5719t(Context context, int i, ov0 ov0Var, Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = TouchPipeline.SIZE;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (ov0Var != null) {
            AbstractC0741i7.m3368d(configuration2, ov0Var);
        }
        return configuration2;
    }

    /* JADX INFO: renamed from: A */
    public final void m5720A() {
        m5736w();
        if (this.f9763K && this.f9796t == null) {
            Object obj = this.f9791o;
            if (obj instanceof Activity) {
                this.f9796t = new da2((Activity) obj, this.f9764L);
            } else if (obj instanceof Dialog) {
                this.f9796t = new da2((Dialog) obj);
            }
            AbstractC0737i3 abstractC0737i3 = this.f9796t;
            if (abstractC0737i3 != null) {
                abstractC0737i3.mo2298l(this.f9785g0);
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m5721B(int i) {
        this.f9783e0 = (1 << i) | this.f9783e0;
        if (this.f9782d0) {
            return;
        }
        View decorView = this.f9793q.getDecorView();
        WeakHashMap weakHashMap = i72.f4849a;
        s62.m5992m(decorView, this.f9784f0);
        this.f9782d0 = true;
    }

    /* JADX INFO: renamed from: C */
    public final int m5722C(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            f40.m2719o("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        if (this.f9781c0 == null) {
                            this.f9781c0 = new C1098m7(this, context);
                        }
                        return this.f9781c0.mo4387e();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return m5738y(context).mo4387e();
                }
            }
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m5723D() {
        boolean z = this.f9771S;
        this.f9771S = false;
        C1322q7 c1322q7M5739z = m5739z(0);
        if (!c1322q7M5739z.f9424m) {
            AbstractC0086b4 abstractC0086b4 = this.f9802z;
            if (abstractC0086b4 != null) {
                abstractC0086b4.mo834a();
                return true;
            }
            m5720A();
            AbstractC0737i3 abstractC0737i3 = this.f9796t;
            if (abstractC0737i3 == null || !abstractC0737i3.mo2292b()) {
                return false;
            }
        } else if (!z) {
            m5733s(c1322q7M5739z, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0176, code lost:
    
        if (r2.f4700f.getCount() > 0) goto L88;
     */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5724E(p000.C1322q7 r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.LayoutInflaterFactory2C1359r7.m5724E(q7, android.view.KeyEvent):void");
    }

    /* JADX INFO: renamed from: F */
    public final boolean m5725F(C1322q7 c1322q7, int i, KeyEvent keyEvent) {
        i31 i31Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c1322q7.f9422k || m5726G(c1322q7, keyEvent)) && (i31Var = c1322q7.f9419h) != null) {
            return i31Var.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:74:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0103  */
    /* JADX WARN: Code duplicated, block: B:82:0x0116  */
    /* JADX INFO: renamed from: G */
    public final boolean m5726G(C1322q7 c1322q7, KeyEvent keyEvent) {
        i31 i31Var;
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        Resources.Theme themeNewTheme;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.f9774V) {
            boolean z = c1322q7.f9422k;
            int i = c1322q7.f9412a;
            if (z) {
                return true;
            }
            C1322q7 c1322q8 = this.f9770R;
            if (c1322q8 != null && c1322q8 != c1322q7) {
                m5733s(c1322q8, false);
            }
            Window.Callback callback = this.f9793q.getCallback();
            if (callback != null) {
                c1322q7.f9418g = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (actionBarOverlayLayout4 = this.f9799w) != null) {
                actionBarOverlayLayout4.m229k();
                ((q12) actionBarOverlayLayout4.f410e).f9304l = true;
            }
            if (c1322q7.f9418g == null && (!z2 || !(this.f9796t instanceof o12))) {
                i31 i31Var2 = c1322q7.f9419h;
                if (i31Var2 == null || c1322q7.f9426o) {
                    if (i31Var2 == null) {
                        Context context = this.f9792p;
                        if ((i == 0 || i == 108) && this.f9799w != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.sousasantoslogic.sspro.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(com.sousasantoslogic.sspro.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(com.sousasantoslogic.sspro.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                C0543cu c0543cu = new C0543cu(context, 0);
                                c0543cu.getTheme().setTo(themeNewTheme);
                                context = c0543cu;
                            }
                        }
                        i31 i31Var3 = new i31(context);
                        i31Var3.f4791e = this;
                        i31 i31Var4 = c1322q7.f9419h;
                        if (i31Var3 != i31Var4) {
                            if (i31Var4 != null) {
                                i31Var4.m3355r(c1322q7.f9420i);
                            }
                            c1322q7.f9419h = i31Var3;
                            ht0 ht0Var = c1322q7.f9420i;
                            if (ht0Var != null) {
                                i31Var3.m3339b(ht0Var, i31Var3.f4787a);
                            }
                        }
                        if (c1322q7.f9419h != null) {
                            if (z2 && (actionBarOverlayLayout2 = this.f9799w) != null) {
                                if (this.f9800x == null) {
                                    this.f9800x = new C0667g7(this, 2);
                                }
                                actionBarOverlayLayout2.m230l(c1322q7.f9419h, this.f9800x);
                            }
                            c1322q7.f9419h.m3360w();
                            if (callback.onCreatePanelMenu(i, c1322q7.f9419h)) {
                                c1322q7.f9426o = false;
                            } else {
                                i31Var = c1322q7.f9419h;
                                if (i31Var != null) {
                                    if (i31Var != null) {
                                        i31Var.m3355r(c1322q7.f9420i);
                                    }
                                    c1322q7.f9419h = null;
                                }
                                if (z2 && (actionBarOverlayLayout = this.f9799w) != null) {
                                    actionBarOverlayLayout.m230l(null, this.f9800x);
                                }
                            }
                        }
                    } else {
                        if (z2) {
                            if (this.f9800x == null) {
                                this.f9800x = new C0667g7(this, 2);
                            }
                            actionBarOverlayLayout2.m230l(c1322q7.f9419h, this.f9800x);
                        }
                        c1322q7.f9419h.m3360w();
                        if (callback.onCreatePanelMenu(i, c1322q7.f9419h)) {
                            i31Var = c1322q7.f9419h;
                            if (i31Var != null) {
                                if (i31Var != null) {
                                    i31Var.m3355r(c1322q7.f9420i);
                                }
                                c1322q7.f9419h = null;
                            }
                            if (z2) {
                                actionBarOverlayLayout.m230l(null, this.f9800x);
                            }
                        } else {
                            c1322q7.f9426o = false;
                        }
                    }
                }
                c1322q7.f9419h.m3360w();
                Bundle bundle = c1322q7.f9427p;
                if (bundle != null) {
                    c1322q7.f9419h.m3356s(bundle);
                    c1322q7.f9427p = null;
                }
                if (!callback.onPreparePanel(0, c1322q7.f9418g, c1322q7.f9419h)) {
                    if (z2 && (actionBarOverlayLayout3 = this.f9799w) != null) {
                        actionBarOverlayLayout3.m230l(null, this.f9800x);
                    }
                    c1322q7.f9419h.m3359v();
                    return false;
                }
                c1322q7.f9419h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                c1322q7.f9419h.m3359v();
            }
            c1322q7.f9422k = true;
            c1322q7.f9423l = false;
            this.f9770R = c1322q7;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: H */
    public final void m5727H() {
        if (this.f9757E) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m5728I() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.f9789k0 != null && (m5739z(0).f9424m || this.f9802z != null)) {
                z = true;
            }
            if (z && this.f9790l0 == null) {
                this.f9790l0 = AbstractC0818k7.m3807b(this.f9789k0, this);
            } else {
                if (z || (onBackInvokedCallback = this.f9790l0) == null) {
                    return;
                }
                AbstractC0818k7.m3808c(this.f9789k0, onBackInvokedCallback);
            }
        }
    }

    @Override // p000.AbstractC0593e7
    /* JADX INFO: renamed from: a */
    public final void mo2536a() {
        if (this.f9796t != null) {
            m5720A();
            if (this.f9796t.mo3334f()) {
                return;
            }
            m5721B(0);
        }
    }

    @Override // p000.AbstractC0593e7
    /* JADX INFO: renamed from: c */
    public final void mo2537c() {
        String strM3878z;
        this.f9772T = true;
        m5729n(false, true);
        m5737x();
        Object obj = this.f9791o;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strM3878z = ki0.m3878z(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strM3878z = null;
            }
            if (strM3878z != null) {
                AbstractC0737i3 abstractC0737i3 = this.f9796t;
                if (abstractC0737i3 == null) {
                    this.f9785g0 = true;
                } else {
                    abstractC0737i3.mo2298l(true);
                }
            }
            synchronized (AbstractC0593e7.f3232m) {
                AbstractC0593e7.m2535f(this);
                AbstractC0593e7.f3231g.add(new WeakReference(this));
            }
        }
        this.f9775W = new Configuration(this.f9792p.getResources().getConfiguration());
        this.f9773U = true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // p000.g31
    /* JADX INFO: renamed from: d */
    public final boolean mo768d(i31 i31Var, MenuItem menuItem) {
        C1322q7 c1322q7;
        Window.Callback callback = this.f9793q.getCallback();
        if (callback != null && !this.f9774V) {
            i31 i31VarMo3348k = i31Var.mo3348k();
            C1322q7[] c1322q7Arr = this.f9769Q;
            int length = c1322q7Arr != null ? c1322q7Arr.length : 0;
            for (int i = 0; i < length; i++) {
                c1322q7 = c1322q7Arr[i];
                if (c1322q7 != null && c1322q7.f9419h == i31VarMo3348k) {
                    if (c1322q7 != null) {
                        return callback.onMenuItemSelected(c1322q7.f9412a, menuItem);
                    }
                }
            }
            c1322q7 = null;
            if (c1322q7 != null) {
                return callback.onMenuItemSelected(c1322q7.f9412a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // p000.AbstractC0593e7
    /* JADX INFO: renamed from: e */
    public final void mo2538e() {
        if (this.f9791o instanceof Activity) {
            synchronized (AbstractC0593e7.f3232m) {
                AbstractC0593e7.m2535f(this);
            }
        }
        if (this.f9782d0) {
            this.f9793q.getDecorView().removeCallbacks(this.f9784f0);
        }
        this.f9774V = true;
        if (this.f9776X != -100) {
            Object obj = this.f9791o;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f9749m0.put(this.f9791o.getClass().getName(), Integer.valueOf(this.f9776X));
            } else {
                f9749m0.remove(this.f9791o.getClass().getName());
            }
        } else {
            f9749m0.remove(this.f9791o.getClass().getName());
        }
        AbstractC0737i3 abstractC0737i3 = this.f9796t;
        if (abstractC0737i3 != null) {
            abstractC0737i3.mo3335h();
        }
        C1098m7 c1098m7 = this.f9780b0;
        if (c1098m7 != null) {
            c1098m7.m4714c();
        }
        C1098m7 c1098m8 = this.f9781c0;
        if (c1098m8 != null) {
            c1098m8.m4714c();
        }
    }

    @Override // p000.AbstractC0593e7
    /* JADX INFO: renamed from: g */
    public final boolean mo2539g(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.f9767O && i == 108) {
            return false;
        }
        if (this.f9763K && i == 1) {
            this.f9763K = false;
        }
        if (i == 1) {
            m5727H();
            this.f9767O = true;
            return true;
        }
        if (i == 2) {
            m5727H();
            this.f9761I = true;
            return true;
        }
        if (i == 5) {
            m5727H();
            this.f9762J = true;
            return true;
        }
        if (i == 10) {
            m5727H();
            this.f9765M = true;
            return true;
        }
        if (i == 108) {
            m5727H();
            this.f9763K = true;
            return true;
        }
        if (i != 109) {
            return this.f9793q.requestFeature(i);
        }
        m5727H();
        this.f9764L = true;
        return true;
    }

    @Override // p000.AbstractC0593e7
    /* JADX INFO: renamed from: h */
    public final void mo2540h(int i) {
        m5736w();
        ViewGroup viewGroup = (ViewGroup) this.f9758F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f9792p).inflate(i, viewGroup);
        this.f9794r.m4064a(this.f9793q.getCallback());
    }

    @Override // p000.AbstractC0593e7
    /* JADX INFO: renamed from: i */
    public final void mo2541i(View view) {
        m5736w();
        ViewGroup viewGroup = (ViewGroup) this.f9758F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f9794r.m4064a(this.f9793q.getCallback());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r6.m6696j() != false) goto L20;
     */
    @Override // p000.g31
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo774j(p000.i31 r6) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.LayoutInflaterFactory2C1359r7.mo774j(i31):void");
    }

    @Override // p000.AbstractC0593e7
    /* JADX INFO: renamed from: k */
    public final void mo2542k(View view, ViewGroup.LayoutParams layoutParams) {
        m5736w();
        ViewGroup viewGroup = (ViewGroup) this.f9758F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f9794r.m4064a(this.f9793q.getCallback());
    }

    @Override // p000.AbstractC0593e7
    /* JADX INFO: renamed from: l */
    public final void mo2543l(CharSequence charSequence) {
        this.f9798v = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f9799w;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        AbstractC0737i3 abstractC0737i3 = this.f9796t;
        if (abstractC0737i3 != null) {
            abstractC0737i3.mo2300n(charSequence);
            return;
        }
        TextView textView = this.f9759G;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0153  */
    @Override // p000.AbstractC0593e7
    /* JADX INFO: renamed from: m */
    public final AbstractC0086b4 mo2544m(InterfaceC0005a4 interfaceC0005a4) {
        AbstractC0086b4 abstractC0086b4OnWindowStartingSupportActionMode;
        boolean z;
        ViewGroup viewGroup;
        if (interfaceC0005a4 == null) {
            f40.m2713i("ActionMode callback can not be null.");
            return null;
        }
        AbstractC0086b4 abstractC0086b4 = this.f9802z;
        if (abstractC0086b4 != null) {
            abstractC0086b4.mo834a();
        }
        C0558d8 c0558d8 = new C0558d8(this, interfaceC0005a4);
        m5720A();
        AbstractC0737i3 abstractC0737i3 = this.f9796t;
        InterfaceC1580x6 interfaceC1580x6 = this.f9795s;
        if (abstractC0737i3 != null) {
            AbstractC0086b4 abstractC0086b4Mo2301o = abstractC0737i3.mo2301o(c0558d8);
            this.f9802z = abstractC0086b4Mo2301o;
            if (abstractC0086b4Mo2301o != null) {
                interfaceC1580x6.onSupportActionModeStarted(abstractC0086b4Mo2301o);
            }
        }
        if (this.f9802z == null) {
            b82 b82Var = this.f9756D;
            if (b82Var != null) {
                b82Var.m943b();
            }
            AbstractC0086b4 abstractC0086b5 = this.f9802z;
            if (abstractC0086b5 != null) {
                abstractC0086b5.mo834a();
            }
            if (this.f9774V) {
                abstractC0086b4OnWindowStartingSupportActionMode = null;
            } else {
                try {
                    abstractC0086b4OnWindowStartingSupportActionMode = interfaceC1580x6.onWindowStartingSupportActionMode(c0558d8);
                } catch (AbstractMethodError unused) {
                    abstractC0086b4OnWindowStartingSupportActionMode = null;
                }
            }
            if (abstractC0086b4OnWindowStartingSupportActionMode != null) {
                this.f9802z = abstractC0086b4OnWindowStartingSupportActionMode;
            } else {
                int i = 1;
                if (this.f9753A == null) {
                    boolean z2 = this.f9766N;
                    Context context = this.f9792p;
                    if (z2) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.sousasantoslogic.sspro.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            C0543cu c0543cu = new C0543cu(context, 0);
                            c0543cu.getTheme().setTo(themeNewTheme);
                            context = c0543cu;
                        }
                        this.f9753A = new ActionBarContextView(context, null);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, com.sousasantoslogic.sspro.R.attr.actionModePopupWindowStyle);
                        this.f9754B = popupWindow;
                        nf1.m4545d(popupWindow, 2);
                        this.f9754B.setContentView(this.f9753A);
                        this.f9754B.setWidth(-1);
                        context.getTheme().resolveAttribute(com.sousasantoslogic.sspro.R.attr.actionBarSize, typedValue, true);
                        this.f9753A.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.f9754B.setHeight(-2);
                        this.f9755C = new RunnableC0630f7(this, i);
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) this.f9758F.findViewById(com.sousasantoslogic.sspro.R.id.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            m5720A();
                            AbstractC0737i3 abstractC0737i4 = this.f9796t;
                            Context contextMo2295e = abstractC0737i4 != null ? abstractC0737i4.mo2295e() : null;
                            if (contextMo2295e != null) {
                                context = contextMo2295e;
                            }
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                            this.f9753A = (ActionBarContextView) viewStubCompat.m276a();
                        }
                    }
                }
                if (this.f9753A != null) {
                    b82 b82Var2 = this.f9756D;
                    if (b82Var2 != null) {
                        b82Var2.m943b();
                    }
                    this.f9753A.m216e();
                    Context context2 = this.f9753A.getContext();
                    ActionBarContextView actionBarContextView = this.f9753A;
                    ev1 ev1Var = new ev1();
                    ev1Var.f3447c = context2;
                    ev1Var.f3448d = actionBarContextView;
                    ev1Var.f3449e = c0558d8;
                    i31 i31Var = new i31(actionBarContextView.getContext());
                    i31Var.f4798l = 1;
                    ev1Var.f3452m = i31Var;
                    i31Var.f4791e = ev1Var;
                    if (((InterfaceC0005a4) c0558d8.f2821b).mo71d(ev1Var, i31Var)) {
                        ev1Var.mo840h();
                        this.f9753A.m214c(ev1Var);
                        this.f9802z = ev1Var;
                        if (!this.f9757E || (viewGroup = this.f9758F) == null) {
                            z = false;
                        } else {
                            WeakHashMap weakHashMap = i72.f4849a;
                            if (v62.m6587c(viewGroup)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        ActionBarContextView actionBarContextView2 = this.f9753A;
                        if (z) {
                            actionBarContextView2.setAlpha(TouchPipeline.SIZE);
                            b82 b82VarM3369a = i72.m3369a(this.f9753A);
                            b82VarM3369a.m942a(1.0f);
                            this.f9756D = b82VarM3369a;
                            b82VarM3369a.m945d(new C0704h7(this, i));
                        } else {
                            actionBarContextView2.setAlpha(1.0f);
                            this.f9753A.setVisibility(0);
                            if (this.f9753A.getParent() instanceof View) {
                                View view = (View) this.f9753A.getParent();
                                WeakHashMap weakHashMap2 = i72.f4849a;
                                w62.m6726c(view);
                            }
                        }
                        if (this.f9754B != null) {
                            this.f9793q.getDecorView().post(this.f9755C);
                        }
                    } else {
                        this.f9802z = null;
                    }
                }
            }
            AbstractC0086b4 abstractC0086b6 = this.f9802z;
            if (abstractC0086b6 != null) {
                interfaceC1580x6.onSupportActionModeStarted(abstractC0086b6);
            }
            m5728I();
            this.f9802z = this.f9802z;
        }
        m5728I();
        return this.f9802z;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00c0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public final boolean m5729n(boolean z, boolean z2) {
        int i;
        boolean z3;
        if (this.f9774V) {
            return false;
        }
        int i2 = this.f9776X;
        if (i2 == -100) {
            i2 = AbstractC0593e7.f3226b;
        }
        Context context = this.f9792p;
        int iM5722C = m5722C(context, i2);
        int i3 = Build.VERSION.SDK_INT;
        ov0 ov0VarM5718p = i3 < 33 ? m5718p(context) : null;
        if (!z2 && ov0VarM5718p != null) {
            ov0VarM5718p = AbstractC0741i7.m3366b(context.getResources().getConfiguration());
        }
        Configuration configurationM5719t = m5719t(context, iM5722C, ov0VarM5718p, null, false);
        boolean z4 = this.f9779a0;
        boolean z5 = true;
        Object obj = this.f9791o;
        if (z4 || !(obj instanceof Activity)) {
            this.f9779a0 = true;
            i = this.f9778Z;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i3 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.f9778Z = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    this.f9778Z = 0;
                }
                this.f9779a0 = true;
                i = this.f9778Z;
            }
        }
        Configuration configuration = this.f9775W;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i4 = configuration.uiMode & 48;
        int i5 = configurationM5719t.uiMode & 48;
        ov0 ov0VarM3366b = AbstractC0741i7.m3366b(configuration);
        ov0 ov0VarM3366b2 = ov0VarM5718p == null ? null : AbstractC0741i7.m3366b(configurationM5719t);
        int i6 = i4 != i5 ? UserVerificationMethods.USER_VERIFY_NONE : 0;
        if (ov0VarM3366b2 != null && !ov0VarM3366b.equals(ov0VarM3366b2)) {
            i6 |= 8196;
        }
        if (((~i) & i6) != 0 && z && this.f9772T && ((f9751o0 || this.f9773U) && (obj instanceof Activity))) {
            Activity activity = (Activity) obj;
            if (activity.isChild()) {
                z3 = false;
            } else {
                activity.recreate();
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i6 == 0) {
            z5 = z3;
        } else {
            boolean z6 = (i6 & i) == i6;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i5;
            if (ov0VarM3366b2 != null) {
                AbstractC0741i7.m3368d(configuration2, ov0VarM3366b2);
            }
            resources.updateConfiguration(configuration2, null);
            int i7 = this.f9777Y;
            if (i7 != 0) {
                context.setTheme(i7);
                context.getTheme().applyStyle(this.f9777Y, true);
            }
            if (z6 && (obj instanceof Activity)) {
                Activity activity2 = (Activity) obj;
                if (activity2 instanceof ms0) {
                    if (((os0) ((ms0) activity2).getLifecycle()).f8452d.compareTo(es0.f3435c) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f9773U && !this.f9774V) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (z5 && (obj instanceof AbstractActivityC1469u6)) {
            if ((i6 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                ((AbstractActivityC1469u6) obj).onNightModeChanged(iM5722C);
            }
            if ((i6 & 4) != 0) {
                ((AbstractActivityC1469u6) obj).onLocalesChanged(ov0VarM5718p);
            }
        }
        if (z5 && ov0VarM3366b2 != null) {
            AbstractC0741i7.m3367c(AbstractC0741i7.m3366b(context.getResources().getConfiguration()));
        }
        if (i2 == 0) {
            m5738y(context).m4716h();
        } else {
            C1098m7 c1098m7 = this.f9780b0;
            if (c1098m7 != null) {
                c1098m7.m4714c();
            }
        }
        C1098m7 c1098m8 = this.f9781c0;
        if (i2 == 3) {
            if (c1098m8 == null) {
                this.f9781c0 = new C1098m7(this, context);
            }
            this.f9781c0.m4716h();
        } else if (c1098m8 != null) {
            c1098m8.m4714c();
        }
        return z5;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    /* JADX INFO: renamed from: o */
    public final void m5730o(Window window) {
        Drawable drawableM3663d;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f9793q != null) {
            f40.m2719o("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof WindowCallbackC1061l7) {
            f40.m2719o("AppCompat has already installed itself into the Window");
            return;
        }
        WindowCallbackC1061l7 windowCallbackC1061l7 = new WindowCallbackC1061l7(this, callback);
        this.f9794r = windowCallbackC1061l7;
        window.setCallback(windowCallbackC1061l7);
        Context context = this.f9792p;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f9750n0);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableM3663d = null;
        } else {
            C1507v7 c1507v7M6592a = C1507v7.m6592a();
            synchronized (c1507v7M6592a) {
                drawableM3663d = c1507v7M6592a.f11571a.m3663d(context, resourceId, true);
            }
        }
        if (drawableM3663d != null) {
            window.setBackgroundDrawable(drawableM3663d);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f9793q = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f9789k0) != null) {
            return;
        }
        Object obj = this.f9791o;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f9790l0) != null) {
            AbstractC0818k7.m3808c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f9790l0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f9789k0 = AbstractC0818k7.m3806a(activity);
            } else {
                this.f9789k0 = null;
            }
        } else {
            this.f9789k0 = null;
        }
        m5728I();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View c0631f8;
        View view2 = null;
        if (this.f9788j0 == null) {
            int[] iArr = ki1.f5855j;
            Context context2 = this.f9792p;
            String string = context2.obtainStyledAttributes(iArr).getString(116);
            if (string == null) {
                this.f9788j0 = new C1063l9();
            } else {
                try {
                    this.f9788j0 = (C1063l9) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable unused) {
                    this.f9788j0 = new C1063l9();
                }
            }
        }
        C1063l9 c1063l9 = this.f9788j0;
        int i = q52.f9393a;
        c1063l9.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ki1.f5870y, 0, 0);
        byte b = 4;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.recycle();
        Context c0543cu = (resourceId == 0 || ((context instanceof C0543cu) && ((C0543cu) context).f2620a == resourceId)) ? context : new C0543cu(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                b = !str.equals("RatingBar") ? (byte) -1 : (byte) 0;
                break;
            case -1455429095:
                b = !str.equals("CheckedTextView") ? (byte) -1 : (byte) 1;
                break;
            case -1346021293:
                b = !str.equals("MultiAutoCompleteTextView") ? (byte) -1 : (byte) 2;
                break;
            case -938935918:
                b = !str.equals("TextView") ? (byte) -1 : (byte) 3;
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b = -1;
                }
                break;
            case -658531749:
                b = !str.equals("SeekBar") ? (byte) -1 : (byte) 5;
                break;
            case -339785223:
                b = !str.equals("Spinner") ? (byte) -1 : (byte) 6;
                break;
            case 776382189:
                b = !str.equals("RadioButton") ? (byte) -1 : (byte) 7;
                break;
            case 799298502:
                b = !str.equals("ToggleButton") ? (byte) -1 : (byte) 8;
                break;
            case 1125864064:
                b = !str.equals("ImageView") ? (byte) -1 : (byte) 9;
                break;
            case 1413872058:
                b = !str.equals("AutoCompleteTextView") ? (byte) -1 : (byte) 10;
                break;
            case 1601505219:
                b = !str.equals("CheckBox") ? (byte) -1 : (byte) 11;
                break;
            case 1666676343:
                b = !str.equals("EditText") ? (byte) -1 : DerValue.tag_UTF8String;
                break;
            case 2001146706:
                b = !str.equals("Button") ? (byte) -1 : (byte) 13;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                c0631f8 = new C0631f8(c0543cu, attributeSet);
                break;
            case 1:
                c0631f8 = new C1654z6(c0543cu, attributeSet);
                break;
            case 2:
                c0631f8 = new C0090b8(c0543cu, attributeSet);
                break;
            case 3:
                c0631f8 = c1063l9.mo1728e(c0543cu, attributeSet);
                break;
            case 4:
                c0631f8 = new C1655z7(c0543cu, attributeSet, com.sousasantoslogic.sspro.R.attr.imageButtonStyle);
                break;
            case 5:
                c0631f8 = new C0705h8(c0543cu, attributeSet);
                break;
            case 6:
                c0631f8 = new C1508v8(c0543cu, attributeSet);
                break;
            case 7:
                c0631f8 = c1063l9.mo1727d(c0543cu, attributeSet);
                break;
            case 8:
                c0631f8 = new C0782j9(c0543cu, attributeSet);
                break;
            case 9:
                c0631f8 = new C0009a8(c0543cu, attributeSet, 0);
                break;
            case 10:
                c0631f8 = c1063l9.mo1724a(c0543cu, attributeSet);
                break;
            case 11:
                c0631f8 = c1063l9.mo1726c(c0543cu, attributeSet);
                break;
            case 12:
                c0631f8 = new C1581x7(c0543cu, attributeSet);
                break;
            case 13:
                c0631f8 = c1063l9.mo1725b(c0543cu, attributeSet);
                break;
            default:
                c0631f8 = null;
                break;
        }
        if (c0631f8 == null && context != c0543cu) {
            Object[] objArr = c1063l9.f6272a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c0543cu;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = C1063l9.f6270g;
                        if (i2 < 3) {
                            View viewM4147f = c1063l9.m4147f(c0543cu, str, strArr[i2]);
                            if (viewM4147f != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewM4147f;
                            } else {
                                i2++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewM4147f2 = c1063l9.m4147f(c0543cu, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewM4147f2;
                }
            } catch (Exception unused2) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th) {
                objArr[0] = null;
                objArr[1] = null;
                throw th;
            }
            c0631f8 = view2;
        }
        if (c0631f8 != null) {
            Context context3 = c0631f8.getContext();
            if (context3 instanceof ContextWrapper) {
                WeakHashMap weakHashMap = i72.f4849a;
                if (r62.m5717a(c0631f8)) {
                    TypedArray typedArrayObtainStyledAttributes2 = context3.obtainStyledAttributes(attributeSet, C1063l9.f6266c);
                    String string2 = typedArrayObtainStyledAttributes2.getString(0);
                    if (string2 != null) {
                        c0631f8.setOnClickListener(new ViewOnClickListenerC0820k9(c0631f8, string2));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                }
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes3 = c0543cu.obtainStyledAttributes(attributeSet, C1063l9.f6267d);
                if (typedArrayObtainStyledAttributes3.hasValue(0)) {
                    boolean z = typedArrayObtainStyledAttributes3.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = i72.f4849a;
                    new p62(com.sousasantoslogic.sspro.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).m2411f(c0631f8, Boolean.valueOf(z));
                }
                typedArrayObtainStyledAttributes3.recycle();
                TypedArray typedArrayObtainStyledAttributes4 = c0543cu.obtainStyledAttributes(attributeSet, C1063l9.f6268e);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    i72.m3379k(c0631f8, typedArrayObtainStyledAttributes4.getString(0));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = c0543cu.obtainStyledAttributes(attributeSet, C1063l9.f6269f);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    boolean z2 = typedArrayObtainStyledAttributes5.getBoolean(0, false);
                    WeakHashMap weakHashMap3 = i72.f4849a;
                    new p62(com.sousasantoslogic.sspro.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).m2411f(c0631f8, Boolean.valueOf(z2));
                }
                typedArrayObtainStyledAttributes5.recycle();
            }
        }
        return c0631f8;
    }

    /* JADX INFO: renamed from: q */
    public final void m5731q(int i, C1322q7 c1322q7, i31 i31Var) {
        if (i31Var == null) {
            if (c1322q7 == null && i >= 0) {
                C1322q7[] c1322q7Arr = this.f9769Q;
                if (i < c1322q7Arr.length) {
                    c1322q7 = c1322q7Arr[i];
                }
            }
            if (c1322q7 != null) {
                i31Var = c1322q7.f9419h;
            }
        }
        if ((c1322q7 == null || c1322q7.f9424m) && !this.f9774V) {
            WindowCallbackC1061l7 windowCallbackC1061l7 = this.f9794r;
            Window.Callback callback = this.f9793q.getCallback();
            windowCallbackC1061l7.getClass();
            try {
                windowCallbackC1061l7.f6200e = true;
                callback.onPanelClosed(i, i31Var);
            } finally {
                windowCallbackC1061l7.f6200e = false;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m5732r(i31 i31Var) {
        C1540w3 c1540w3;
        if (this.f9768P) {
            return;
        }
        this.f9768P = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f9799w;
        actionBarOverlayLayout.m229k();
        ActionMenuView actionMenuView = ((q12) actionBarOverlayLayout.f410e).f9293a.f519a;
        if (actionMenuView != null && (c1540w3 = actionMenuView.f437y) != null) {
            c1540w3.m6695g();
            C1392s3 c1392s3 = c1540w3.f11958y;
            if (c1392s3 != null && c1392s3.m7188b()) {
                c1392s3.f13262i.dismiss();
            }
        }
        Window.Callback callback = this.f9793q.getCallback();
        if (callback != null && !this.f9774V) {
            callback.onPanelClosed(108, i31Var);
        }
        this.f9768P = false;
    }

    /* JADX INFO: renamed from: s */
    public final void m5733s(C1322q7 c1322q7, boolean z) {
        C1285p7 c1285p7;
        ActionBarOverlayLayout actionBarOverlayLayout;
        if (z && c1322q7.f9412a == 0 && (actionBarOverlayLayout = this.f9799w) != null) {
            actionBarOverlayLayout.m229k();
            if (((q12) actionBarOverlayLayout.f410e).f9293a.m268p()) {
                m5732r(c1322q7.f9419h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f9792p.getSystemService("window");
        if (windowManager != null && c1322q7.f9424m && (c1285p7 = c1322q7.f9416e) != null) {
            windowManager.removeView(c1285p7);
            if (z) {
                m5731q(c1322q7.f9412a, c1322q7, null);
            }
        }
        c1322q7.f9422k = false;
        c1322q7.f9423l = false;
        c1322q7.f9424m = false;
        c1322q7.f9417f = null;
        c1322q7.f9425n = true;
        if (this.f9770R == c1322q7) {
            this.f9770R = null;
        }
        if (c1322q7.f9412a == 0) {
            m5728I();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    /* JADX WARN: Code duplicated, block: B:21:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:83:0x010d  */
    /* JADX WARN: Code duplicated, block: B:85:0x011b  */
    /* JADX WARN: Code duplicated, block: B:87:0x011f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0127  */
    /* JADX WARN: Code duplicated, block: B:92:0x012e A[RETURN] */
    /* JADX INFO: renamed from: u */
    public final boolean m5734u(KeyEvent keyEvent) {
        int keyCode;
        C1322q7 c1322q7M5739z;
        ActionBarOverlayLayout actionBarOverlayLayout;
        Context context;
        boolean z;
        boolean zM274v;
        boolean zM5726G;
        AudioManager audioManager;
        Toolbar toolbar;
        ActionMenuView actionMenuView;
        C1540w3 c1540w3;
        C1322q7 c1322q7M5739z2;
        Object obj = this.f9791o;
        if (((obj instanceof wq0) || (obj instanceof AbstractDialogC1433t7)) && this.f9793q.getDecorView() != null) {
            WeakHashMap weakHashMap = i72.f4849a;
        }
        if (keyEvent.getKeyCode() == 82) {
            WindowCallbackC1061l7 windowCallbackC1061l7 = this.f9794r;
            Window.Callback callback = this.f9793q.getCallback();
            windowCallbackC1061l7.getClass();
            try {
                windowCallbackC1061l7.f6199d = true;
                boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                windowCallbackC1061l7.f6199d = false;
                if (!zDispatchKeyEvent) {
                    keyCode = keyEvent.getKeyCode();
                    if (keyEvent.getAction() == 0) {
                        if (keyCode != 4) {
                            this.f9771S = (keyEvent.getFlags() & 128) != 0;
                            return false;
                        }
                        if (keyCode == 82) {
                            if (keyEvent.getRepeatCount() == 0) {
                                c1322q7M5739z2 = m5739z(0);
                                if (!c1322q7M5739z2.f9424m) {
                                    m5726G(c1322q7M5739z2, keyEvent);
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    if (keyCode != 4) {
                        if (keyCode == 82) {
                            if (this.f9802z == null) {
                                c1322q7M5739z = m5739z(0);
                                actionBarOverlayLayout = this.f9799w;
                                context = this.f9792p;
                                if (actionBarOverlayLayout != null) {
                                    actionBarOverlayLayout.m229k();
                                    toolbar = ((q12) actionBarOverlayLayout.f410e).f9293a;
                                    if (toolbar.getVisibility() == 0 || (actionMenuView = toolbar.f519a) == null || !actionMenuView.f436x || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                        z = c1322q7M5739z.f9424m;
                                        if (!z || c1322q7M5739z.f9423l) {
                                            m5733s(c1322q7M5739z, true);
                                            zM274v = z;
                                        } else {
                                            if (c1322q7M5739z.f9422k) {
                                                if (c1322q7M5739z.f9426o) {
                                                    c1322q7M5739z.f9422k = false;
                                                    zM5726G = m5726G(c1322q7M5739z, keyEvent);
                                                } else {
                                                    zM5726G = true;
                                                }
                                                if (zM5726G) {
                                                    m5724E(c1322q7M5739z, keyEvent);
                                                    zM274v = true;
                                                }
                                            }
                                            zM274v = false;
                                        }
                                    } else {
                                        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f9799w;
                                        actionBarOverlayLayout2.m229k();
                                        if (((q12) actionBarOverlayLayout2.f410e).f9293a.m268p()) {
                                            ActionBarOverlayLayout actionBarOverlayLayout3 = this.f9799w;
                                            actionBarOverlayLayout3.m229k();
                                            ActionMenuView actionMenuView2 = ((q12) actionBarOverlayLayout3.f410e).f9293a.f519a;
                                            if (actionMenuView2 != null && (c1540w3 = actionMenuView2.f437y) != null && c1540w3.m6695g()) {
                                                zM274v = true;
                                            }
                                        } else if (!this.f9774V && m5726G(c1322q7M5739z, keyEvent)) {
                                            ActionBarOverlayLayout actionBarOverlayLayout4 = this.f9799w;
                                            actionBarOverlayLayout4.m229k();
                                            zM274v = ((q12) actionBarOverlayLayout4.f410e).f9293a.m274v();
                                        }
                                        zM274v = false;
                                    }
                                } else {
                                    z = c1322q7M5739z.f9424m;
                                    if (z) {
                                    }
                                    m5733s(c1322q7M5739z, true);
                                    zM274v = z;
                                }
                                if (zM274v) {
                                    audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                    if (audioManager != null) {
                                        audioManager.playSoundEffect(0);
                                        return true;
                                    }
                                    Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    if (m5723D()) {
                        return false;
                    }
                }
            } catch (Throwable th) {
                windowCallbackC1061l7.f6199d = false;
                throw th;
            }
        } else {
            keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode != 4) {
                    this.f9771S = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        c1322q7M5739z2 = m5739z(0);
                        if (!c1322q7M5739z2.f9424m) {
                            m5726G(c1322q7M5739z2, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.f9802z == null) {
                        c1322q7M5739z = m5739z(0);
                        actionBarOverlayLayout = this.f9799w;
                        context = this.f9792p;
                        if (actionBarOverlayLayout != null) {
                            actionBarOverlayLayout.m229k();
                            toolbar = ((q12) actionBarOverlayLayout.f410e).f9293a;
                            if (toolbar.getVisibility() == 0) {
                                z = c1322q7M5739z.f9424m;
                                if (z) {
                                }
                                m5733s(c1322q7M5739z, true);
                                zM274v = z;
                            } else {
                                z = c1322q7M5739z.f9424m;
                                if (z) {
                                }
                                m5733s(c1322q7M5739z, true);
                                zM274v = z;
                            }
                        } else {
                            z = c1322q7M5739z.f9424m;
                            if (z) {
                            }
                            m5733s(c1322q7M5739z, true);
                            zM274v = z;
                        }
                        if (zM274v) {
                            audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                            if (audioManager != null) {
                                audioManager.playSoundEffect(0);
                                return true;
                            }
                            Log.w("AppCompatDelegate", "Couldn't get audio manager");
                            return true;
                        }
                    }
                }
                return false;
            }
            if (m5723D()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    public final void m5735v(int i) {
        C1322q7 c1322q7M5739z = m5739z(i);
        if (c1322q7M5739z.f9419h != null) {
            Bundle bundle = new Bundle();
            c1322q7M5739z.f9419h.m3357t(bundle);
            if (bundle.size() > 0) {
                c1322q7M5739z.f9427p = bundle;
            }
            c1322q7M5739z.f9419h.m3360w();
            c1322q7M5739z.f9419h.clear();
        }
        c1322q7M5739z.f9426o = true;
        c1322q7M5739z.f9425n = true;
        if ((i == 108 || i == 0) && this.f9799w != null) {
            C1322q7 c1322q7M5739z2 = m5739z(0);
            c1322q7M5739z2.f9422k = false;
            m5726G(c1322q7M5739z2, null);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m5736w() {
        ViewGroup viewGroup;
        if (this.f9757E) {
            return;
        }
        Context context = this.f9792p;
        int[] iArr = ki1.f5855j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            f40.m2719o("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        int i = 0;
        int i2 = 1;
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            mo2539g(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            mo2539g(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            mo2539g(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            mo2539g(10);
        }
        this.f9766N = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        m5737x();
        this.f9793q.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f9767O) {
            viewGroup = this.f9765M ? (ViewGroup) layoutInflaterFrom.inflate(com.sousasantoslogic.sspro.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.sousasantoslogic.sspro.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f9766N) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.sousasantoslogic.sspro.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f9764L = false;
            this.f9763K = false;
        } else if (this.f9763K) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.sousasantoslogic.sspro.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0543cu(context, typedValue.resourceId) : context).inflate(com.sousasantoslogic.sspro.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(com.sousasantoslogic.sspro.R.id.decor_content_parent);
            this.f9799w = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.f9793q.getCallback());
            if (this.f9764L) {
                this.f9799w.m228j(109);
            }
            if (this.f9761I) {
                this.f9799w.m228j(2);
            }
            if (this.f9762J) {
                this.f9799w.m228j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f9763K + ", windowActionBarOverlay: " + this.f9764L + ", android:windowIsFloating: " + this.f9766N + ", windowActionModeOverlay: " + this.f9765M + ", windowNoTitle: " + this.f9767O + " }");
        }
        C0667g7 c0667g7 = new C0667g7(this, i);
        WeakHashMap weakHashMap = i72.f4849a;
        y62.m7020u(viewGroup, c0667g7);
        if (this.f9799w == null) {
            this.f9759G = (TextView) viewGroup.findViewById(com.sousasantoslogic.sspro.R.id.title);
        }
        Method method = h82.f4474a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.sousasantoslogic.sspro.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f9793q.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f9793q.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0667g7(this, i2));
        this.f9758F = viewGroup;
        Object obj = this.f9791o;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f9798v;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f9799w;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                AbstractC0737i3 abstractC0737i3 = this.f9796t;
                if (abstractC0737i3 != null) {
                    abstractC0737i3.mo2300n(title);
                } else {
                    TextView textView = this.f9759G;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f9758F.findViewById(R.id.content);
        View decorView = this.f9793q.getDecorView();
        contentFrameLayout2.f449g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap weakHashMap2 = i72.f4849a;
        if (v62.m6587c(contentFrameLayout2)) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f9757E = true;
        C1322q7 c1322q7M5739z = m5739z(0);
        if (this.f9774V || c1322q7M5739z.f9419h != null) {
            return;
        }
        m5721B(108);
    }

    /* JADX INFO: renamed from: x */
    public final void m5737x() {
        if (this.f9793q == null) {
            Object obj = this.f9791o;
            if (obj instanceof Activity) {
                m5730o(((Activity) obj).getWindow());
            }
        }
        if (this.f9793q != null) {
            return;
        }
        f40.m2719o("We have not been given a Window");
    }

    /* JADX INFO: renamed from: y */
    public final AbstractC1172o7 m5738y(Context context) {
        if (this.f9780b0 == null) {
            if (C1174o9.f7697n == null) {
                Context applicationContext = context.getApplicationContext();
                C1174o9.f7697n = new C1174o9(applicationContext, (LocationManager) applicationContext.getSystemService(FirebaseAnalytics.Param.LOCATION));
            }
            this.f9780b0 = new C1098m7(this, C1174o9.f7697n);
        }
        return this.f9780b0;
    }

    /* JADX INFO: renamed from: z */
    public final C1322q7 m5739z(int i) {
        C1322q7[] c1322q7Arr = this.f9769Q;
        if (c1322q7Arr == null || c1322q7Arr.length <= i) {
            C1322q7[] c1322q7Arr2 = new C1322q7[i + 1];
            if (c1322q7Arr != null) {
                System.arraycopy(c1322q7Arr, 0, c1322q7Arr2, 0, c1322q7Arr.length);
            }
            this.f9769Q = c1322q7Arr2;
            c1322q7Arr = c1322q7Arr2;
        }
        C1322q7 c1322q7 = c1322q7Arr[i];
        if (c1322q7 != null) {
            return c1322q7;
        }
        C1322q7 c1322q8 = new C1322q7();
        c1322q8.f9412a = i;
        c1322q8.f9425n = false;
        c1322q7Arr[i] = c1322q8;
        return c1322q8;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}

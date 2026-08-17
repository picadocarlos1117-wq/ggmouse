package p000;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AbstractActivityC0053q;
import com.example.ssmousepro.injection.TouchPipeline;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: renamed from: u6 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC1469u6 extends AbstractActivityC0053q implements InterfaceC1580x6 {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private AbstractC0593e7 mDelegate;
    private Resources mResources;

    public AbstractActivityC1469u6() {
        getSavedStateRegistry().m3235c(DELEGATE_TAG, new C1395s6(this));
        addOnContextAvailableListener(new C1432t6(this));
    }

    @Override // p000.AbstractActivityC0613er, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m6389d();
        LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7 = (LayoutInflaterFactory2C1359r7) getDelegate();
        layoutInflaterFactory2C1359r7.m5736w();
        ((ViewGroup) layoutInflaterFactory2C1359r7.f9758F.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C1359r7.f9794r.m4064a(layoutInflaterFactory2C1359r7.f9793q.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0188  */
    /* JADX WARN: Code duplicated, block: B:104:0x0197  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:113:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:119:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:120:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:124:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:127:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:152:0x020d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x01f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x01f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x009c  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:68:0x0109  */
    /* JADX WARN: Code duplicated, block: B:71:0x0111  */
    /* JADX WARN: Code duplicated, block: B:74:0x0119  */
    /* JADX WARN: Code duplicated, block: B:77:0x0121  */
    /* JADX WARN: Code duplicated, block: B:80:0x0129  */
    /* JADX WARN: Code duplicated, block: B:83:0x0131  */
    /* JADX WARN: Code duplicated, block: B:86:0x013d  */
    /* JADX WARN: Code duplicated, block: B:89:0x014c  */
    /* JADX WARN: Code duplicated, block: B:92:0x015b  */
    /* JADX WARN: Code duplicated, block: B:95:0x016a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0179  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Configuration configuration;
        Configuration configuration2;
        Configuration configuration3;
        C0543cu c0543cu;
        Resources.Theme theme;
        Method method;
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7 = (LayoutInflaterFactory2C1359r7) getDelegate();
        layoutInflaterFactory2C1359r7.f9772T = true;
        int i41 = layoutInflaterFactory2C1359r7.f9776X;
        if (i41 == -100) {
            i41 = AbstractC0593e7.f3226b;
        }
        int iM5722C = layoutInflaterFactory2C1359r7.m5722C(context, i41);
        if (AbstractC0593e7.m2534b(context) && AbstractC0593e7.m2534b(context)) {
            if (!AbstractC1408sj.m6104a()) {
                synchronized (AbstractC0593e7.f3233n) {
                    try {
                        ov0 ov0Var = AbstractC0593e7.f3227c;
                        if (ov0Var == null) {
                            if (AbstractC0593e7.f3228d == null) {
                                AbstractC0593e7.f3228d = ov0.m5066a(p32.m5161b0(context));
                            }
                            if (!AbstractC0593e7.f3228d.f8496a.f9178a.isEmpty()) {
                                AbstractC0593e7.f3227c = AbstractC0593e7.f3228d;
                            }
                        } else if (!ov0Var.equals(AbstractC0593e7.f3228d)) {
                            ov0 ov0Var2 = AbstractC0593e7.f3227c;
                            AbstractC0593e7.f3228d = ov0Var2;
                            p32.m5159a0(context, ov0Var2.f8496a.f9178a.toLanguageTags());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!AbstractC0593e7.f3230f) {
                AbstractC0593e7.f3225a.execute(new RunnableC0089b7(context, 0));
            }
        }
        ov0 ov0VarM5718p = LayoutInflaterFactory2C1359r7.m5718p(context);
        if (LayoutInflaterFactory2C1359r7.f9752p0 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C1359r7.m5719t(context, iM5722C, ov0VarM5718p, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof C0543cu) {
                    ((C0543cu) context).m2123a(LayoutInflaterFactory2C1359r7.m5719t(context, iM5722C, ov0VarM5718p, null, false));
                } else if (LayoutInflaterFactory2C1359r7.f9751o0) {
                    Configuration configuration4 = new Configuration();
                    configuration4.uiMode = -1;
                    configuration4.fontScale = TouchPipeline.SIZE;
                    configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (configuration.equals(configuration2)) {
                        configuration3 = null;
                    } else {
                        configuration3 = new Configuration();
                        configuration3.fontScale = TouchPipeline.SIZE;
                        if (configuration.diff(configuration2) != 0) {
                            f = configuration.fontScale;
                            f2 = configuration2.fontScale;
                            if (f != f2) {
                                configuration3.fontScale = f2;
                            }
                            i = configuration.mcc;
                            i2 = configuration2.mcc;
                            if (i != i2) {
                                configuration3.mcc = i2;
                            }
                            i3 = configuration.mnc;
                            i4 = configuration2.mnc;
                            if (i3 != i4) {
                                configuration3.mnc = i4;
                            }
                            AbstractC0741i7.m3365a(configuration, configuration2, configuration3);
                            i5 = configuration.touchscreen;
                            i6 = configuration2.touchscreen;
                            if (i5 != i6) {
                                configuration3.touchscreen = i6;
                            }
                            i7 = configuration.keyboard;
                            i8 = configuration2.keyboard;
                            if (i7 != i8) {
                                configuration3.keyboard = i8;
                            }
                            i9 = configuration.keyboardHidden;
                            i10 = configuration2.keyboardHidden;
                            if (i9 != i10) {
                                configuration3.keyboardHidden = i10;
                            }
                            i11 = configuration.navigation;
                            i12 = configuration2.navigation;
                            if (i11 != i12) {
                                configuration3.navigation = i12;
                            }
                            i13 = configuration.navigationHidden;
                            i14 = configuration2.navigationHidden;
                            if (i13 != i14) {
                                configuration3.navigationHidden = i14;
                            }
                            i15 = configuration.orientation;
                            i16 = configuration2.orientation;
                            if (i15 != i16) {
                                configuration3.orientation = i16;
                            }
                            i17 = configuration.screenLayout & 15;
                            i18 = configuration2.screenLayout & 15;
                            if (i17 != i18) {
                                configuration3.screenLayout |= i18;
                            }
                            i19 = configuration.screenLayout & 192;
                            i20 = configuration2.screenLayout & 192;
                            if (i19 != i20) {
                                configuration3.screenLayout |= i20;
                            }
                            i21 = configuration.screenLayout & 48;
                            i22 = configuration2.screenLayout & 48;
                            if (i21 != i22) {
                                configuration3.screenLayout |= i22;
                            }
                            i23 = configuration.screenLayout & 768;
                            i24 = configuration2.screenLayout & 768;
                            if (i23 != i24) {
                                configuration3.screenLayout |= i24;
                            }
                            i25 = configuration.colorMode & 3;
                            i26 = configuration2.colorMode & 3;
                            if (i25 != i26) {
                                configuration3.colorMode |= i26;
                            }
                            i27 = configuration.colorMode & 12;
                            i28 = configuration2.colorMode & 12;
                            if (i27 != i28) {
                                configuration3.colorMode |= i28;
                            }
                            i29 = configuration.uiMode & 15;
                            i30 = configuration2.uiMode & 15;
                            if (i29 != i30) {
                                configuration3.uiMode |= i30;
                            }
                            i31 = configuration.uiMode & 48;
                            i32 = configuration2.uiMode & 48;
                            if (i31 != i32) {
                                configuration3.uiMode |= i32;
                            }
                            i33 = configuration.screenWidthDp;
                            i34 = configuration2.screenWidthDp;
                            if (i33 != i34) {
                                configuration3.screenWidthDp = i34;
                            }
                            i35 = configuration.screenHeightDp;
                            i36 = configuration2.screenHeightDp;
                            if (i35 != i36) {
                                configuration3.screenHeightDp = i36;
                            }
                            i37 = configuration.smallestScreenWidthDp;
                            i38 = configuration2.smallestScreenWidthDp;
                            if (i37 != i38) {
                                configuration3.smallestScreenWidthDp = i38;
                            }
                            i39 = configuration.densityDpi;
                            i40 = configuration2.densityDpi;
                            if (i39 != i40) {
                                configuration3.densityDpi = i40;
                            }
                        }
                    }
                    Configuration configurationM5719t = LayoutInflaterFactory2C1359r7.m5719t(context, iM5722C, ov0VarM5718p, configuration3, true);
                    c0543cu = new C0543cu(context, com.sousasantoslogic.sspro.R.style.Theme_AppCompat_Empty);
                    c0543cu.m2123a(configurationM5719t);
                    if (context.getTheme() != null) {
                        theme = c0543cu.getTheme();
                        if (Build.VERSION.SDK_INT >= 29) {
                            ol1.m5040a(theme);
                        } else {
                            synchronized (ki0.f5842n) {
                                if (!ki0.f5844p) {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    ki0.f5843o = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                    ki0.f5844p = true;
                                }
                                method = ki0.f5843o;
                                if (method != null) {
                                    method.invoke(theme, null);
                                }
                            }
                        }
                    }
                    context = c0543cu;
                }
            }
        } else if (context instanceof C0543cu) {
            try {
                ((C0543cu) context).m2123a(LayoutInflaterFactory2C1359r7.m5719t(context, iM5722C, ov0VarM5718p, null, false));
            } catch (IllegalStateException unused2) {
                if (LayoutInflaterFactory2C1359r7.f9751o0) {
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = TouchPipeline.SIZE;
                    configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = TouchPipeline.SIZE;
                        if (configuration.diff(configuration2) != 0) {
                            f = configuration.fontScale;
                            f2 = configuration2.fontScale;
                            if (f != f2) {
                                configuration3.fontScale = f2;
                            }
                            i = configuration.mcc;
                            i2 = configuration2.mcc;
                            if (i != i2) {
                                configuration3.mcc = i2;
                            }
                            i3 = configuration.mnc;
                            i4 = configuration2.mnc;
                            if (i3 != i4) {
                                configuration3.mnc = i4;
                            }
                            AbstractC0741i7.m3365a(configuration, configuration2, configuration3);
                            i5 = configuration.touchscreen;
                            i6 = configuration2.touchscreen;
                            if (i5 != i6) {
                                configuration3.touchscreen = i6;
                            }
                            i7 = configuration.keyboard;
                            i8 = configuration2.keyboard;
                            if (i7 != i8) {
                                configuration3.keyboard = i8;
                            }
                            i9 = configuration.keyboardHidden;
                            i10 = configuration2.keyboardHidden;
                            if (i9 != i10) {
                                configuration3.keyboardHidden = i10;
                            }
                            i11 = configuration.navigation;
                            i12 = configuration2.navigation;
                            if (i11 != i12) {
                                configuration3.navigation = i12;
                            }
                            i13 = configuration.navigationHidden;
                            i14 = configuration2.navigationHidden;
                            if (i13 != i14) {
                                configuration3.navigationHidden = i14;
                            }
                            i15 = configuration.orientation;
                            i16 = configuration2.orientation;
                            if (i15 != i16) {
                                configuration3.orientation = i16;
                            }
                            i17 = configuration.screenLayout & 15;
                            i18 = configuration2.screenLayout & 15;
                            if (i17 != i18) {
                                configuration3.screenLayout |= i18;
                            }
                            i19 = configuration.screenLayout & 192;
                            i20 = configuration2.screenLayout & 192;
                            if (i19 != i20) {
                                configuration3.screenLayout |= i20;
                            }
                            i21 = configuration.screenLayout & 48;
                            i22 = configuration2.screenLayout & 48;
                            if (i21 != i22) {
                                configuration3.screenLayout |= i22;
                            }
                            i23 = configuration.screenLayout & 768;
                            i24 = configuration2.screenLayout & 768;
                            if (i23 != i24) {
                                configuration3.screenLayout |= i24;
                            }
                            i25 = configuration.colorMode & 3;
                            i26 = configuration2.colorMode & 3;
                            if (i25 != i26) {
                                configuration3.colorMode |= i26;
                            }
                            i27 = configuration.colorMode & 12;
                            i28 = configuration2.colorMode & 12;
                            if (i27 != i28) {
                                configuration3.colorMode |= i28;
                            }
                            i29 = configuration.uiMode & 15;
                            i30 = configuration2.uiMode & 15;
                            if (i29 != i30) {
                                configuration3.uiMode |= i30;
                            }
                            i31 = configuration.uiMode & 48;
                            i32 = configuration2.uiMode & 48;
                            if (i31 != i32) {
                                configuration3.uiMode |= i32;
                            }
                            i33 = configuration.screenWidthDp;
                            i34 = configuration2.screenWidthDp;
                            if (i33 != i34) {
                                configuration3.screenWidthDp = i34;
                            }
                            i35 = configuration.screenHeightDp;
                            i36 = configuration2.screenHeightDp;
                            if (i35 != i36) {
                                configuration3.screenHeightDp = i36;
                            }
                            i37 = configuration.smallestScreenWidthDp;
                            i38 = configuration2.smallestScreenWidthDp;
                            if (i37 != i38) {
                                configuration3.smallestScreenWidthDp = i38;
                            }
                            i39 = configuration.densityDpi;
                            i40 = configuration2.densityDpi;
                            if (i39 != i40) {
                                configuration3.densityDpi = i40;
                            }
                        }
                    } else {
                        configuration3 = null;
                    }
                    Configuration configurationM5719t2 = LayoutInflaterFactory2C1359r7.m5719t(context, iM5722C, ov0VarM5718p, configuration3, true);
                    c0543cu = new C0543cu(context, com.sousasantoslogic.sspro.R.style.Theme_AppCompat_Empty);
                    c0543cu.m2123a(configurationM5719t2);
                    try {
                        if (context.getTheme() != null) {
                            theme = c0543cu.getTheme();
                            if (Build.VERSION.SDK_INT >= 29) {
                                ol1.m5040a(theme);
                            } else {
                                synchronized (ki0.f5842n) {
                                    if (!ki0.f5844p) {
                                        try {
                                            Method declaredMethod2 = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                            ki0.f5843o = declaredMethod2;
                                            declaredMethod2.setAccessible(true);
                                        } catch (NoSuchMethodException unused3) {
                                        }
                                        ki0.f5844p = true;
                                    }
                                    method = ki0.f5843o;
                                    if (method != null) {
                                        try {
                                            method.invoke(theme, null);
                                        } catch (IllegalAccessException | InvocationTargetException unused4) {
                                            ki0.f5843o = null;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (NullPointerException unused5) {
                    }
                    context = c0543cu;
                }
            }
        } else if (LayoutInflaterFactory2C1359r7.f9751o0) {
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = TouchPipeline.SIZE;
            configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = TouchPipeline.SIZE;
                if (configuration.diff(configuration2) != 0) {
                    f = configuration.fontScale;
                    f2 = configuration2.fontScale;
                    if (f != f2) {
                        configuration3.fontScale = f2;
                    }
                    i = configuration.mcc;
                    i2 = configuration2.mcc;
                    if (i != i2) {
                        configuration3.mcc = i2;
                    }
                    i3 = configuration.mnc;
                    i4 = configuration2.mnc;
                    if (i3 != i4) {
                        configuration3.mnc = i4;
                    }
                    AbstractC0741i7.m3365a(configuration, configuration2, configuration3);
                    i5 = configuration.touchscreen;
                    i6 = configuration2.touchscreen;
                    if (i5 != i6) {
                        configuration3.touchscreen = i6;
                    }
                    i7 = configuration.keyboard;
                    i8 = configuration2.keyboard;
                    if (i7 != i8) {
                        configuration3.keyboard = i8;
                    }
                    i9 = configuration.keyboardHidden;
                    i10 = configuration2.keyboardHidden;
                    if (i9 != i10) {
                        configuration3.keyboardHidden = i10;
                    }
                    i11 = configuration.navigation;
                    i12 = configuration2.navigation;
                    if (i11 != i12) {
                        configuration3.navigation = i12;
                    }
                    i13 = configuration.navigationHidden;
                    i14 = configuration2.navigationHidden;
                    if (i13 != i14) {
                        configuration3.navigationHidden = i14;
                    }
                    i15 = configuration.orientation;
                    i16 = configuration2.orientation;
                    if (i15 != i16) {
                        configuration3.orientation = i16;
                    }
                    i17 = configuration.screenLayout & 15;
                    i18 = configuration2.screenLayout & 15;
                    if (i17 != i18) {
                        configuration3.screenLayout |= i18;
                    }
                    i19 = configuration.screenLayout & 192;
                    i20 = configuration2.screenLayout & 192;
                    if (i19 != i20) {
                        configuration3.screenLayout |= i20;
                    }
                    i21 = configuration.screenLayout & 48;
                    i22 = configuration2.screenLayout & 48;
                    if (i21 != i22) {
                        configuration3.screenLayout |= i22;
                    }
                    i23 = configuration.screenLayout & 768;
                    i24 = configuration2.screenLayout & 768;
                    if (i23 != i24) {
                        configuration3.screenLayout |= i24;
                    }
                    i25 = configuration.colorMode & 3;
                    i26 = configuration2.colorMode & 3;
                    if (i25 != i26) {
                        configuration3.colorMode |= i26;
                    }
                    i27 = configuration.colorMode & 12;
                    i28 = configuration2.colorMode & 12;
                    if (i27 != i28) {
                        configuration3.colorMode |= i28;
                    }
                    i29 = configuration.uiMode & 15;
                    i30 = configuration2.uiMode & 15;
                    if (i29 != i30) {
                        configuration3.uiMode |= i30;
                    }
                    i31 = configuration.uiMode & 48;
                    i32 = configuration2.uiMode & 48;
                    if (i31 != i32) {
                        configuration3.uiMode |= i32;
                    }
                    i33 = configuration.screenWidthDp;
                    i34 = configuration2.screenWidthDp;
                    if (i33 != i34) {
                        configuration3.screenWidthDp = i34;
                    }
                    i35 = configuration.screenHeightDp;
                    i36 = configuration2.screenHeightDp;
                    if (i35 != i36) {
                        configuration3.screenHeightDp = i36;
                    }
                    i37 = configuration.smallestScreenWidthDp;
                    i38 = configuration2.smallestScreenWidthDp;
                    if (i37 != i38) {
                        configuration3.smallestScreenWidthDp = i38;
                    }
                    i39 = configuration.densityDpi;
                    i40 = configuration2.densityDpi;
                    if (i39 != i40) {
                        configuration3.densityDpi = i40;
                    }
                }
            } else {
                configuration3 = null;
            }
            Configuration configurationM5719t3 = LayoutInflaterFactory2C1359r7.m5719t(context, iM5722C, ov0VarM5718p, configuration3, true);
            c0543cu = new C0543cu(context, com.sousasantoslogic.sspro.R.style.Theme_AppCompat_Empty);
            c0543cu.m2123a(configurationM5719t3);
            if (context.getTheme() != null) {
                theme = c0543cu.getTheme();
                if (Build.VERSION.SDK_INT >= 29) {
                    ol1.m5040a(theme);
                } else {
                    synchronized (ki0.f5842n) {
                        if (!ki0.f5844p) {
                            Method declaredMethod3 = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            ki0.f5843o = declaredMethod3;
                            declaredMethod3.setAccessible(true);
                            ki0.f5844p = true;
                        }
                        method = ki0.f5843o;
                        if (method != null) {
                            method.invoke(theme, null);
                        }
                    }
                }
            }
            context = c0543cu;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC0737i3 supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo3333a()) {
                super.closeOptionsMenu();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m6389d() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(com.sousasantoslogic.sspro.R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(com.sousasantoslogic.sspro.R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(com.sousasantoslogic.sspro.R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(com.sousasantoslogic.sspro.R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // p000.AbstractActivityC0576dr, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0737i3 supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.mo3336j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7 = (LayoutInflaterFactory2C1359r7) getDelegate();
        layoutInflaterFactory2C1359r7.m5736w();
        return (T) layoutInflaterFactory2C1359r7.f9793q.findViewById(i);
    }

    public AbstractC0593e7 getDelegate() {
        if (this.mDelegate == null) {
            ExecutorC1361r9 executorC1361r9 = AbstractC0593e7.f3225a;
            this.mDelegate = new LayoutInflaterFactory2C1359r7(this, null, this, this);
        }
        return this.mDelegate;
    }

    public InterfaceC0814k3 getDrawerToggleDelegate() {
        ((LayoutInflaterFactory2C1359r7) getDelegate()).getClass();
        return new k50((byte) 0, 9);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7 = (LayoutInflaterFactory2C1359r7) getDelegate();
        if (layoutInflaterFactory2C1359r7.f9797u == null) {
            layoutInflaterFactory2C1359r7.m5720A();
            AbstractC0737i3 abstractC0737i3 = layoutInflaterFactory2C1359r7.f9796t;
            layoutInflaterFactory2C1359r7.f9797u = new ly1(abstractC0737i3 != null ? abstractC0737i3.mo2295e() : layoutInflaterFactory2C1359r7.f9792p);
        }
        return layoutInflaterFactory2C1359r7.f9797u;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i = q52.f9393a;
        }
        return resources == null ? super.getResources() : resources;
    }

    public AbstractC0737i3 getSupportActionBar() {
        LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7 = (LayoutInflaterFactory2C1359r7) getDelegate();
        layoutInflaterFactory2C1359r7.m5720A();
        return layoutInflaterFactory2C1359r7.f9796t;
    }

    public Intent getSupportParentActivityIntent() {
        return ki0.m3876x(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().mo2536a();
    }

    @Override // p000.AbstractActivityC0613er, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7 = (LayoutInflaterFactory2C1359r7) getDelegate();
        if (layoutInflaterFactory2C1359r7.f9763K && layoutInflaterFactory2C1359r7.f9757E) {
            layoutInflaterFactory2C1359r7.m5720A();
            AbstractC0737i3 abstractC0737i3 = layoutInflaterFactory2C1359r7.f9796t;
            if (abstractC0737i3 != null) {
                abstractC0737i3.mo2296g();
            }
        }
        C1507v7 c1507v7M6592a = C1507v7.m6592a();
        Context context = layoutInflaterFactory2C1359r7.f9792p;
        synchronized (c1507v7M6592a) {
            jl1 jl1Var = c1507v7M6592a.f11571a;
            synchronized (jl1Var) {
                ew0 ew0Var = (ew0) jl1Var.f5448b.get(context);
                if (ew0Var != null) {
                    ew0Var.m2645a();
                }
            }
        }
        layoutInflaterFactory2C1359r7.f9775W = new Configuration(layoutInflaterFactory2C1359r7.f9792p.getResources().getConfiguration());
        layoutInflaterFactory2C1359r7.m5729n(false, false);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(lz1 lz1Var) {
        ArrayList arrayList = lz1Var.f6566a;
        AbstractActivityC1469u6 abstractActivityC1469u6 = lz1Var.f6567b;
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = ki0.m3876x(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(abstractActivityC1469u6.getPackageManager());
            }
            int size = arrayList.size();
            try {
                for (Intent intentM3877y = ki0.m3877y(abstractActivityC1469u6, component); intentM3877y != null; intentM3877y = ki0.m3877y(abstractActivityC1469u6, intentM3877y.getComponent())) {
                    arrayList.add(size, intentM3877y);
                }
                arrayList.add(supportParentActivityIntent);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                l41.m4045n(e);
            }
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0053q, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().mo2538e();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.AbstractActivityC0053q, p000.AbstractActivityC0613er, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC0737i3 supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.mo2294d() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // p000.AbstractActivityC0613er, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C1359r7) getDelegate()).m5736w();
    }

    @Override // androidx.fragment.app.AbstractActivityC0053q, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7 = (LayoutInflaterFactory2C1359r7) getDelegate();
        layoutInflaterFactory2C1359r7.m5720A();
        AbstractC0737i3 abstractC0737i3 = layoutInflaterFactory2C1359r7.f9796t;
        if (abstractC0737i3 != null) {
            abstractC0737i3.mo2299m(true);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0053q, android.app.Activity
    public void onStart() {
        super.onStart();
        ((LayoutInflaterFactory2C1359r7) getDelegate()).m5729n(true, false);
    }

    @Override // androidx.fragment.app.AbstractActivityC0053q, android.app.Activity
    public void onStop() {
        super.onStop();
        LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7 = (LayoutInflaterFactory2C1359r7) getDelegate();
        layoutInflaterFactory2C1359r7.m5720A();
        AbstractC0737i3 abstractC0737i3 = layoutInflaterFactory2C1359r7.f9796t;
        if (abstractC0737i3 != null) {
            abstractC0737i3.mo2299m(false);
        }
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        lz1 lz1Var = new lz1(this);
        onCreateSupportNavigateUpTaskStack(lz1Var);
        onPrepareSupportNavigateUpTaskStack(lz1Var);
        ArrayList arrayList = lz1Var.f6566a;
        if (arrayList.isEmpty()) {
            f40.m2719o("No intents added to TaskStackBuilder; cannot startActivities");
            return false;
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        AbstractActivityC1469u6 abstractActivityC1469u6 = lz1Var.f6567b;
        if (!AbstractC0075au.startActivities(abstractActivityC1469u6, intentArr, null)) {
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            abstractActivityC1469u6.startActivity(intent);
        }
        try {
            AbstractC0122c4.m1123a(this);
        } catch (IllegalStateException unused) {
            finish();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().mo2543l(charSequence);
    }

    @Override // p000.InterfaceC1580x6
    public AbstractC0086b4 onWindowStartingSupportActionMode(InterfaceC0005a4 interfaceC0005a4) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC0737i3 supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo3337k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // p000.AbstractActivityC0613er, android.app.Activity
    public void setContentView(int i) {
        m6389d();
        getDelegate().mo2540h(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7 = (LayoutInflaterFactory2C1359r7) getDelegate();
        if (layoutInflaterFactory2C1359r7.f9791o instanceof Activity) {
            layoutInflaterFactory2C1359r7.m5720A();
            AbstractC0737i3 abstractC0737i3 = layoutInflaterFactory2C1359r7.f9796t;
            if (abstractC0737i3 instanceof da2) {
                f40.m2719o("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
                return;
            }
            layoutInflaterFactory2C1359r7.f9797u = null;
            if (abstractC0737i3 != null) {
                abstractC0737i3.mo3335h();
            }
            layoutInflaterFactory2C1359r7.f9796t = null;
            if (toolbar != null) {
                Object obj = layoutInflaterFactory2C1359r7.f9791o;
                o12 o12Var = new o12(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : layoutInflaterFactory2C1359r7.f9798v, layoutInflaterFactory2C1359r7.f9794r);
                layoutInflaterFactory2C1359r7.f9796t = o12Var;
                layoutInflaterFactory2C1359r7.f9794r.f6197b = o12Var.f7613c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                layoutInflaterFactory2C1359r7.f9794r.f6197b = null;
            }
            layoutInflaterFactory2C1359r7.mo2536a();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflaterFactory2C1359r7) getDelegate()).f9777Y = i;
    }

    public AbstractC0086b4 startSupportActionMode(InterfaceC0005a4 interfaceC0005a4) {
        return getDelegate().mo2544m(interfaceC0005a4);
    }

    @Override // androidx.fragment.app.AbstractActivityC0053q
    public void supportInvalidateOptionsMenu() {
        getDelegate().mo2536a();
    }

    public void supportNavigateUpTo(Intent intent) {
        a81.m113b(this, intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo2539g(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return a81.m114c(this, intent);
    }

    @Override // p000.AbstractActivityC0613er, android.app.Activity
    public void setContentView(View view) {
        m6389d();
        getDelegate().mo2541i(view);
    }

    @Override // p000.AbstractActivityC0613er, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m6389d();
        getDelegate().mo2542k(view, layoutParams);
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public void onLocalesChanged(ov0 ov0Var) {
    }

    public void onNightModeChanged(int i) {
    }

    public void onPrepareSupportNavigateUpTaskStack(lz1 lz1Var) {
    }

    @Override // p000.InterfaceC1580x6
    public void onSupportActionModeFinished(AbstractC0086b4 abstractC0086b4) {
    }

    @Override // p000.InterfaceC1580x6
    public void onSupportActionModeStarted(AbstractC0086b4 abstractC0086b4) {
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }
}

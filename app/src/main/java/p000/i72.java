package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.sousasantoslogic.sspro.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i72 {

    /* JADX INFO: renamed from: a */
    public static WeakHashMap f4849a;

    /* JADX INFO: renamed from: b */
    public static Field f4850b;

    /* JADX INFO: renamed from: c */
    public static boolean f4851c;

    /* JADX INFO: renamed from: d */
    public static final int[] f4852d;

    /* JADX INFO: renamed from: e */
    public static final o62 f4853e;

    /* JADX INFO: renamed from: f */
    public static final q62 f4854f;

    static {
        new AtomicInteger(1);
        f4849a = null;
        f4851c = false;
        f4852d = new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        f4853e = new o62();
        f4854f = new q62();
    }

    /* JADX INFO: renamed from: a */
    public static b82 m3369a(View view) {
        if (f4849a == null) {
            f4849a = new WeakHashMap();
        }
        b82 b82Var = (b82) f4849a.get(view);
        if (b82Var != null) {
            return b82Var;
        }
        b82 b82Var2 = new b82(view);
        f4849a.put(view, b82Var2);
        return b82Var2;
    }

    /* JADX INFO: renamed from: b */
    public static View.AccessibilityDelegate m3370b(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return d72.m2247a(view);
        }
        if (f4851c) {
            return null;
        }
        if (f4850b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f4850b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f4851c = true;
                return null;
            }
        }
        try {
            Object obj = f4850b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f4851c = true;
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList m3371c(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: d */
    public static String[] m3372d(C1581x7 c1581x7) {
        return Build.VERSION.SDK_INT >= 31 ? f72.m2736a(c1581x7) : (String[]) c1581x7.getTag(R.id.tag_on_receive_content_mime_types);
    }

    /* JADX INFO: renamed from: e */
    public static void m3373e(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = c72.m1150b(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (v62.m6585a(view) != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                v62.m6591g(accessibilityEventObtain, i);
                if (z) {
                    accessibilityEventObtain.getText().add(c72.m1150b(view));
                    if (s62.m5982c(view) == 0) {
                        s62.m5998s(view, 1);
                    }
                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                        if (s62.m5982c((View) parent) == 4) {
                            s62.m5998s(view, 2);
                            break;
                        }
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        v62.m6589e(view.getParent(), view, view, i);
                        return;
                    } catch (AbstractMethodError e) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            v62.m6591g(accessibilityEventObtain2, i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(c72.m1150b(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static C1120mt m3374f(View view, C1120mt c1120mt) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(c1120mt);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return f72.m2737b(view, c1120mt);
        }
        ya1 ya1Var = (ya1) view.getTag(R.id.tag_on_receive_content_listener);
        za1 za1Var = f4853e;
        if (ya1Var == null) {
            if (view instanceof za1) {
                za1Var = (za1) view;
            }
            return za1Var.mo4713a(c1120mt);
        }
        C1120mt c1120mtM2672a = ((f02) ya1Var).m2672a(view, c1120mt);
        if (c1120mtM2672a == null) {
            return null;
        }
        if (view instanceof za1) {
            za1Var = (za1) view;
        }
        return za1Var.mo4713a(c1120mtM2672a);
    }

    /* JADX INFO: renamed from: g */
    public static void m3375g(View view, int i) {
        ArrayList arrayListM3371c = m3371c(view);
        for (int i2 = 0; i2 < arrayListM3371c.size(); i2++) {
            if (((C1465u2) arrayListM3371c.get(i2)).m6372a() == i) {
                arrayListM3371c.remove(i2);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m3376h(View view, C1465u2 c1465u2, InterfaceC0700h3 interfaceC0700h3) {
        C1056l2 c1056l2;
        C1465u2 c1465u3 = new C1465u2(null, c1465u2.f11100b, null, interfaceC0700h3, c1465u2.f11101c);
        View.AccessibilityDelegate accessibilityDelegateM3370b = m3370b(view);
        if (accessibilityDelegateM3370b == null) {
            c1056l2 = null;
        } else {
            c1056l2 = accessibilityDelegateM3370b instanceof C0775j2 ? ((C0775j2) accessibilityDelegateM3370b).f5240a : new C1056l2(accessibilityDelegateM3370b);
        }
        if (c1056l2 == null) {
            c1056l2 = new C1056l2();
        }
        m3378j(view, c1056l2);
        m3375g(view, c1465u3.m6372a());
        m3371c(view).add(c1465u3);
        m3373e(view, 0);
    }

    /* JADX INFO: renamed from: i */
    public static void m3377i(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            d72.m2249c(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m3378j(View view, C1056l2 c1056l2) {
        if (c1056l2 == null && (m3370b(view) instanceof C0775j2)) {
            c1056l2 = new C1056l2();
        }
        view.setAccessibilityDelegate(c1056l2 == null ? null : c1056l2.f6144b);
    }

    /* JADX INFO: renamed from: k */
    public static void m3379k(View view, CharSequence charSequence) {
        new p62(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).m2411f(view, charSequence);
        q62 q62Var = f4854f;
        if (charSequence == null) {
            q62Var.f9411a.remove(view);
            view.removeOnAttachStateChangeListener(q62Var);
            s62.m5994o(view.getViewTreeObserver(), q62Var);
        } else {
            q62Var.f9411a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(q62Var);
            if (v62.m6586b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(q62Var);
            }
        }
    }
}

package p000;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.sousasantoslogic.sspro.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l2 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class C1056l2 {

    /* JADX INFO: renamed from: c */
    public static final View.AccessibilityDelegate f6142c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a */
    public final View.AccessibilityDelegate f6143a;

    /* JADX INFO: renamed from: b */
    public final C0775j2 f6144b;

    public C1056l2(View.AccessibilityDelegate accessibilityDelegate) {
        this.f6143a = accessibilityDelegate;
        this.f6144b = new C0775j2(this);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo158a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f6143a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: b */
    public ay0 mo159b(View view) {
        AccessibilityNodeProvider accessibilityNodeProviderM3750a = AbstractC0813k2.m3750a(this.f6143a, view);
        if (accessibilityNodeProviderM3750a != null) {
            return new ay0(accessibilityNodeProviderM3750a, 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void mo160c(View view, AccessibilityEvent accessibilityEvent) {
        this.f6143a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: d */
    public void mo161d(View view, C1539w2 c1539w2) {
        this.f6143a.onInitializeAccessibilityNodeInfo(view, c1539w2.f11909a);
    }

    /* JADX INFO: renamed from: e */
    public void mo162e(View view, AccessibilityEvent accessibilityEvent) {
        this.f6143a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo163f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f6143a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: g */
    public boolean mo164g(View view, int i, Bundle bundle) {
        boolean zM3751b;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 < list.size()) {
                C1465u2 c1465u2 = (C1465u2) list.get(i2);
                if (c1465u2.m6372a() == i) {
                    Class cls = c1465u2.f11101c;
                    InterfaceC0700h3 interfaceC0700h3 = c1465u2.f11102d;
                    if (interfaceC0700h3 != null) {
                        if (cls != null) {
                            try {
                                if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                    throw null;
                                }
                                throw new ClassCastException();
                            } catch (Exception e) {
                                Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e);
                            }
                        }
                        zM3751b = interfaceC0700h3.mo3095a(view);
                        break;
                    }
                } else {
                    i2++;
                }
            }
            zM3751b = false;
            break;
        }
        if (!zM3751b) {
            zM3751b = AbstractC0813k2.m3751b(this.f6143a, view, i, bundle);
        }
        if (zM3751b || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return zM3751b;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i4 = 0; clickableSpanArr != null && i4 < clickableSpanArr.length; i4++) {
                if (clickableSpan.equals(clickableSpanArr[i4])) {
                    clickableSpan.onClick(view);
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: h */
    public void mo165h(View view, int i) {
        this.f6143a.sendAccessibilityEvent(view, i);
    }

    /* JADX INFO: renamed from: i */
    public void mo166i(View view, AccessibilityEvent accessibilityEvent) {
        this.f6143a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C1056l2() {
        this(f6142c);
    }
}

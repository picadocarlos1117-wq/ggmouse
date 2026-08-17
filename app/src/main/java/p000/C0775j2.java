package p000;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.sousasantoslogic.sspro.R;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: j2 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0775j2 extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a */
    public final C1056l2 f5240a;

    public C0775j2(C1056l2 c1056l2) {
        this.f5240a = c1056l2;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f5240a.mo158a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        ay0 ay0VarMo159b = this.f5240a.mo159b(view);
        if (ay0VarMo159b != null) {
            return (AccessibilityNodeProvider) ay0VarMo159b.f1096b;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f5240a.mo160c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        C1539w2 c1539w2 = new C1539w2(accessibilityNodeInfo);
        WeakHashMap weakHashMap = i72.f4849a;
        accessibilityNodeInfo.setScreenReaderFocusable(Boolean.valueOf(c72.m1152d(view)).booleanValue());
        accessibilityNodeInfo.setHeading(Boolean.valueOf(c72.m1151c(view)).booleanValue());
        accessibilityNodeInfo.setPaneTitle(c72.m1150b(view));
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            tag = e72.m2545a(view);
        } else {
            tag = view.getTag(R.id.tag_state_description);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag;
        int i2 = AbstractC1408sj.f10416a;
        if (i >= 30) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        } else {
            AbstractC1502v2.m6552a(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f5240a.mo161d(view, c1539w2);
        accessibilityNodeInfo.getText();
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            c1539w2.m6685b((C1465u2) list.get(i3));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f5240a.mo162e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f5240a.mo163f(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f5240a.mo164g(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.f5240a.mo165h(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f5240a.mo166i(view, accessibilityEvent);
    }
}

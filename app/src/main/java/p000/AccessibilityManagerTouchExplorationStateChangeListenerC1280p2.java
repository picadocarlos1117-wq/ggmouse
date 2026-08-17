package p000;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: p2 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC1280p2 implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1167o2 f8667a;

    public AccessibilityManagerTouchExplorationStateChangeListenerC1280p2(InterfaceC1167o2 interfaceC1167o2) {
        this.f8667a = interfaceC1167o2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC1280p2) {
            return this.f8667a.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC1280p2) obj).f8667a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8667a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        p40 p40Var = (p40) ((C1521vl) this.f8667a).f11701b;
        AutoCompleteTextView autoCompleteTextView = p40Var.f8703h;
        if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
            return;
        }
        CheckableImageButton checkableImageButton = p40Var.f12463d;
        int i = z ? 2 : 1;
        WeakHashMap weakHashMap = i72.f4849a;
        s62.m5998s(checkableImageButton, i);
    }
}

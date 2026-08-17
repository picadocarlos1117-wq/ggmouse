package p000;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: renamed from: n2 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1130n2 {
    /* JADX INFO: renamed from: a */
    public static boolean m4497a(AccessibilityManager accessibilityManager, InterfaceC1167o2 interfaceC1167o2) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC1280p2(interfaceC1167o2));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4498b(AccessibilityManager accessibilityManager, InterfaceC1167o2 interfaceC1167o2) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC1280p2(interfaceC1167o2));
    }
}

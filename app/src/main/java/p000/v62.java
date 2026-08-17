package p000;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v62 {
    /* JADX INFO: renamed from: a */
    public static int m6585a(View view) {
        return view.getAccessibilityLiveRegion();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m6586b(View view) {
        return view.isAttachedToWindow();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m6587c(View view) {
        return view.isLaidOut();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m6588d(View view) {
        return view.isLayoutDirectionResolved();
    }

    /* JADX INFO: renamed from: e */
    public static void m6589e(ViewParent viewParent, View view, View view2, int i) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
    }

    /* JADX INFO: renamed from: f */
    public static void m6590f(View view, int i) {
        view.setAccessibilityLiveRegion(i);
    }

    /* JADX INFO: renamed from: g */
    public static void m6591g(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }
}

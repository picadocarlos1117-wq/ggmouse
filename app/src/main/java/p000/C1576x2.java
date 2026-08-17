package p000;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: renamed from: x2 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1576x2 extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: a */
    public final ay0 f12430a;

    public C1576x2(ay0 ay0Var) {
        this.f12430a = ay0Var;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.f12430a.getClass();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C1539w2 c1539w2Mo781q = this.f12430a.mo781q(i);
        if (c1539w2Mo781q == null) {
            return null;
        }
        return c1539w2Mo781q.f11909a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f12430a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        C1539w2 c1539w2Mo783s = this.f12430a.mo783s(i);
        if (c1539w2Mo783s == null) {
            return null;
        }
        return c1539w2Mo783s.f11909a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.f12430a.mo762A(i, i2, bundle);
    }
}

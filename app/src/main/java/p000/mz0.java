package p000;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class mz0 extends C1056l2 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f7150d;

    @Override // p000.C1056l2
    /* JADX INFO: renamed from: c */
    public void mo160c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f7150d) {
            case 3:
                super.mo160c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                AbstractC1613y2.m6991c(accessibilityEvent, nestedScrollView.getScrollX());
                AbstractC1613y2.m6992d(accessibilityEvent, nestedScrollView.getScrollRange());
                break;
            default:
                super.mo160c(view, accessibilityEvent);
                break;
        }
    }

    @Override // p000.C1056l2
    /* JADX INFO: renamed from: d */
    public final void mo161d(View view, C1539w2 c1539w2) {
        int scrollRange;
        int i = this.f7150d;
        View.AccessibilityDelegate accessibilityDelegate = this.f6143a;
        switch (i) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = c1539w2.f11909a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo(null);
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c1539w2.f11909a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setScrollable(false);
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo3 = c1539w2.f11909a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCollectionInfo(null);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo4 = c1539w2.f11909a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityNodeInfo4.setClassName(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    accessibilityNodeInfo4.setScrollable(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        c1539w2.m6685b(C1465u2.f11093g);
                        c1539w2.m6685b(C1465u2.f11097k);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        c1539w2.m6685b(C1465u2.f11092f);
                        c1539w2.m6685b(C1465u2.f11098l);
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    @Override // p000.C1056l2
    /* JADX INFO: renamed from: g */
    public boolean mo164g(View view, int i, Bundle bundle) {
        int iMin;
        switch (this.f7150d) {
            case 3:
                if (super.mo164g(view, i, bundle)) {
                    return true;
                }
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                if (nestedScrollView.isEnabled()) {
                    int height = nestedScrollView.getHeight();
                    Rect rect = new Rect();
                    if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                        height = rect.height();
                    }
                    if (i == 4096) {
                        iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                        if (iMin != nestedScrollView.getScrollY()) {
                            nestedScrollView.m323u(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    } else if (i == 8192 || i == 16908344) {
                        int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                        if (iMax != nestedScrollView.getScrollY()) {
                            nestedScrollView.m323u(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    } else if (i == 16908346) {
                        iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                        if (iMin != nestedScrollView.getScrollY()) {
                            nestedScrollView.m323u(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    }
                }
                return false;
            default:
                return super.mo164g(view, i, bundle);
        }
    }
}

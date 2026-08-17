package p000;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.sousasantoslogic.sspro.R;
import io.github.muntashirakon.adb.AdbProtocol;

/* JADX INFO: renamed from: ti */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1444ti extends C1056l2 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f10892d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f10893e;

    public /* synthetic */ C1444ti(Object obj, int i) {
        this.f10892d = i;
        this.f10893e = obj;
    }

    @Override // p000.C1056l2
    /* JADX INFO: renamed from: c */
    public void mo160c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f10892d) {
            case 1:
                super.mo160c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f10893e).f2072d);
                break;
            default:
                super.mo160c(view, accessibilityEvent);
                break;
        }
    }

    @Override // p000.C1056l2
    /* JADX INFO: renamed from: d */
    public final void mo161d(View view, C1539w2 c1539w2) {
        int i;
        int i2 = this.f10892d;
        Object obj = this.f10893e;
        View.AccessibilityDelegate accessibilityDelegate = this.f6143a;
        switch (i2) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = c1539w2.f11909a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                if (((AbstractDialogC1555wi) obj).cancelable) {
                    c1539w2.m6684a(AdbProtocol.MAX_PAYLOAD_V3);
                    accessibilityNodeInfo.setDismissable(true);
                } else {
                    accessibilityNodeInfo.setDismissable(false);
                }
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c1539w2.f11909a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.f2073e);
                accessibilityNodeInfo2.setChecked(checkableImageButton.f2072d);
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo3 = c1539w2.f11909a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i3 = MaterialButtonToggleGroup.f2028p;
                if (view instanceof MaterialButton) {
                    int i4 = 0;
                    for (int i5 = 0; i5 < materialButtonToggleGroup.getChildCount(); i5++) {
                        if (materialButtonToggleGroup.getChildAt(i5) == view) {
                            i = i4;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i5) instanceof MaterialButton) && materialButtonToggleGroup.m1677c(i5)) {
                                i4++;
                            }
                        }
                    }
                    i = -1;
                } else {
                    i = -1;
                }
                accessibilityNodeInfo3.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).f2025t));
                break;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo4 = c1539w2.f11909a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                qz0 qz0Var = (qz0) obj;
                accessibilityNodeInfo4.setHintText(qz0Var.f9632q.getVisibility() == 0 ? qz0Var.getString(R.string.mtrl_picker_toggle_to_year_selection) : qz0Var.getString(R.string.mtrl_picker_toggle_to_day_selection));
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo5 = c1539w2.f11909a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo5);
                accessibilityNodeInfo5.setCheckable(((NavigationMenuItemView) obj).f2078C);
                break;
        }
    }

    @Override // p000.C1056l2
    /* JADX INFO: renamed from: g */
    public boolean mo164g(View view, int i, Bundle bundle) {
        switch (this.f10892d) {
            case 0:
                if (i == 1048576) {
                    AbstractDialogC1555wi abstractDialogC1555wi = (AbstractDialogC1555wi) this.f10893e;
                    if (abstractDialogC1555wi.cancelable) {
                        abstractDialogC1555wi.cancel();
                        return true;
                    }
                }
                return super.mo164g(view, i, bundle);
            default:
                return super.mo164g(view, i, bundle);
        }
    }
}

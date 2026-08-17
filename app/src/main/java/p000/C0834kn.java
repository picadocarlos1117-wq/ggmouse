package p000;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.android.material.chip.Chip;
import com.sousasantoslogic.sspro.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: kn */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0834kn extends C1056l2 {

    /* JADX INFO: renamed from: o */
    public static final Rect f5911o = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: p */
    public static final bz1 f5912p = new bz1(22);

    /* JADX INFO: renamed from: q */
    public static final k50 f5913q = new k50((byte) 0, 23);

    /* JADX INFO: renamed from: h */
    public final AccessibilityManager f5918h;

    /* JADX INFO: renamed from: i */
    public final Chip f5919i;

    /* JADX INFO: renamed from: j */
    public o80 f5920j;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Chip f5924n;

    /* JADX INFO: renamed from: d */
    public final Rect f5914d = new Rect();

    /* JADX INFO: renamed from: e */
    public final Rect f5915e = new Rect();

    /* JADX INFO: renamed from: f */
    public final Rect f5916f = new Rect();

    /* JADX INFO: renamed from: g */
    public final int[] f5917g = new int[2];

    /* JADX INFO: renamed from: k */
    public int f5921k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l */
    public int f5922l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m */
    public int f5923m = Integer.MIN_VALUE;

    public C0834kn(Chip chip, Chip chip2) {
        this.f5924n = chip;
        this.f5919i = chip2;
        this.f5918h = (AccessibilityManager) chip2.getContext().getSystemService("accessibility");
        chip2.setFocusable(true);
        WeakHashMap weakHashMap = i72.f4849a;
        if (s62.m5982c(chip2) == 0) {
            s62.m5998s(chip2, 1);
        }
    }

    @Override // p000.C1056l2
    /* JADX INFO: renamed from: b */
    public final ay0 mo159b(View view) {
        if (this.f5920j == null) {
            this.f5920j = new o80(this);
        }
        return this.f5920j;
    }

    @Override // p000.C1056l2
    /* JADX INFO: renamed from: d */
    public final void mo161d(View view, C1539w2 c1539w2) {
        AccessibilityNodeInfo accessibilityNodeInfo = c1539w2.f11909a;
        this.f6143a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = this.f5924n;
        C1077ln c1077ln = chip.f2045e;
        accessibilityNodeInfo.setCheckable(c1077ln != null && c1077ln.f6421V);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        accessibilityNodeInfo.setClassName(chip.getAccessibilityClassName());
        accessibilityNodeInfo.setText(chip.getText());
    }

    /* JADX INFO: renamed from: j */
    public final boolean m3911j(int i) {
        if (this.f5922l != i) {
            return false;
        }
        this.f5922l = Integer.MIN_VALUE;
        if (i == 1) {
            Chip chip = this.f5924n;
            chip.f2053r = false;
            chip.refreshDrawableState();
        }
        m3917p(i, 8);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final C1539w2 m3912k(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        C1539w2 c1539w2 = new C1539w2(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        accessibilityNodeInfoObtain.setClassName("android.view.View");
        Rect rect = f5911o;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        Chip chip = this.f5919i;
        accessibilityNodeInfoObtain.setParent(chip);
        AccessibilityNodeInfo accessibilityNodeInfo = c1539w2.f11909a;
        if (i == 1) {
            Chip chip2 = this.f5924n;
            CharSequence closeIconContentDescription = chip2.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip2.getText();
                accessibilityNodeInfo.setContentDescription(chip2.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            accessibilityNodeInfo.setBoundsInParent(chip2.getCloseIconTouchBoundsInt());
            c1539w2.m6685b(C1465u2.f11091e);
            accessibilityNodeInfo.setEnabled(chip2.isEnabled());
        } else {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f2041B);
        }
        if (c1539w2.m6688f() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            l41.m4048q("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        Rect rect2 = this.f5915e;
        c1539w2.m6687e(rect2);
        if (rect2.equals(rect)) {
            l41.m4048q("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
            return null;
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            l41.m4048q("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        if ((actions & 128) != 0) {
            l41.m4048q("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        accessibilityNodeInfoObtain.setPackageName(chip.getContext().getPackageName());
        c1539w2.f11910b = i;
        accessibilityNodeInfoObtain.setSource(chip, i);
        if (this.f5921k == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            c1539w2.m6684a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            c1539w2.m6684a(64);
        }
        boolean z = this.f5922l == i;
        if (z) {
            c1539w2.m6684a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            c1539w2.m6684a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z);
        int[] iArr = this.f5917g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f5914d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            c1539w2.m6687e(rect3);
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f5916f;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                accessibilityNodeInfoObtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (parent instanceof View) {
                        View view = (View) parent;
                        if (view.getAlpha() > TouchPipeline.SIZE && view.getVisibility() == 0) {
                            parent = view.getParent();
                        }
                    }
                    if (parent != null) {
                        accessibilityNodeInfoObtain.setVisibleToUser(true);
                    }
                }
            }
        }
        return c1539w2;
    }

    /* JADX INFO: renamed from: l */
    public final void m3913l(ArrayList arrayList) {
        C1077ln c1077ln;
        arrayList.add(0);
        Rect rect = Chip.f2041B;
        Chip chip = this.f5924n;
        if (!chip.m1687c() || (c1077ln = chip.f2045e) == null || !c1077ln.f6415P || chip.f2048m == null) {
            return;
        }
        arrayList.add(1);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0145  */
    /* JADX INFO: renamed from: m */
    public final boolean m3914m(int i, Rect rect) {
        int i2;
        Object obj;
        C1539w2 c1539w2;
        ArrayList arrayList = new ArrayList();
        m3913l(arrayList);
        ju1 ju1Var = new ju1();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ju1Var.m3712c(((Integer) arrayList.get(i3)).intValue(), m3912k(((Integer) arrayList.get(i3)).intValue()));
        }
        int i4 = this.f5922l;
        int i5 = Integer.MIN_VALUE;
        C1539w2 c1539w3 = i4 == Integer.MIN_VALUE ? null : (C1539w2) ju1Var.m3711b(i4);
        bz1 bz1Var = f5912p;
        k50 k50Var = f5913q;
        Chip chip = this.f5919i;
        int i6 = -1;
        if (i == 1 || i == 2) {
            WeakHashMap weakHashMap = i72.f4849a;
            boolean z = t62.m6240d(chip) == 1;
            k50Var.getClass();
            int i7 = ju1Var.f5534c;
            ArrayList arrayList2 = new ArrayList(i7);
            for (int i8 = 0; i8 < i7; i8++) {
                arrayList2.add((C1539w2) ju1Var.f5533b[i8]);
            }
            Collections.sort(arrayList2, new ld0(z, bz1Var));
            if (i == 1) {
                i2 = 0;
                int size = arrayList2.size();
                if (c1539w3 != null) {
                    size = arrayList2.indexOf(c1539w3);
                }
                int i9 = size - 1;
                obj = i9 >= 0 ? arrayList2.get(i9) : null;
            } else {
                if (i != 2) {
                    f40.m2713i("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    return false;
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (c1539w3 == null ? -1 : arrayList2.lastIndexOf(c1539w3)) + 1;
                obj = iLastIndexOf < size2 ? arrayList2.get(iLastIndexOf) : null;
                i2 = 0;
            }
            c1539w2 = (C1539w2) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                f40.m2713i("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            Rect rect2 = new Rect();
            int i10 = this.f5922l;
            if (i10 != Integer.MIN_VALUE) {
                m3915n(i10).m6687e(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = chip.getWidth();
                int height = chip.getHeight();
                if (i == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i != 130) {
                        f40.m2713i("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                    rect2.set(0, -1, width, -1);
                }
            }
            Rect rect3 = new Rect(rect2);
            if (i == 17) {
                rect3.offset(rect2.width() + 1, 0);
            } else if (i == 33) {
                rect3.offset(0, rect2.height() + 1);
            } else if (i == 66) {
                rect3.offset(-(rect2.width() + 1), 0);
            } else {
                if (i != 130) {
                    f40.m2713i("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return false;
                }
                rect3.offset(0, -(rect2.height() + 1));
            }
            k50Var.getClass();
            int i11 = ju1Var.f5534c;
            Rect rect4 = new Rect();
            c1539w2 = null;
            for (int i12 = 0; i12 < i11; i12++) {
                C1539w2 c1539w4 = (C1539w2) ju1Var.f5533b[i12];
                if (c1539w4 != c1539w3) {
                    bz1Var.getClass();
                    c1539w4.m6687e(rect4);
                    if (AbstractC1337qm.m5509D(i, rect2, rect4)) {
                        if (!AbstractC1337qm.m5509D(i, rect2, rect3) || AbstractC1337qm.m5530c(i, rect2, rect4, rect3)) {
                            rect3.set(rect4);
                            c1539w2 = c1539w4;
                        } else if (!AbstractC1337qm.m5530c(i, rect2, rect3, rect4)) {
                            int iM5512I = AbstractC1337qm.m5512I(i, rect2, rect4);
                            int iM5513J = AbstractC1337qm.m5513J(i, rect2, rect4);
                            int i13 = (iM5513J * iM5513J) + (iM5512I * 13 * iM5512I);
                            int iM5512I2 = AbstractC1337qm.m5512I(i, rect2, rect3);
                            int iM5513J2 = AbstractC1337qm.m5513J(i, rect2, rect3);
                            if (i13 < (iM5513J2 * iM5513J2) + (iM5512I2 * 13 * iM5512I2)) {
                                rect3.set(rect4);
                                c1539w2 = c1539w4;
                            }
                        }
                    }
                }
            }
            i2 = 0;
        }
        C1539w2 c1539w5 = c1539w2;
        if (c1539w5 != null) {
            for (int i14 = i2; i14 < ju1Var.f5534c; i14++) {
                if (ju1Var.f5533b[i14] == c1539w5) {
                    i6 = i14;
                    break;
                }
            }
            i5 = ju1Var.f5532a[i6];
        }
        return m3916o(i5);
    }

    /* JADX INFO: renamed from: n */
    public final C1539w2 m3915n(int i) {
        if (i != -1) {
            return m3912k(i);
        }
        Chip chip = this.f5919i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        C1539w2 c1539w2 = new C1539w2(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = i72.f4849a;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        m3913l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            l41.m4048q("Views cannot have both real and virtual children");
            return null;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c1539w2.f11909a.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
        }
        return c1539w2;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m3916o(int i) {
        int i2;
        Chip chip = this.f5919i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i2 = this.f5922l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m3911j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f5922l = i;
        if (i == 1) {
            Chip chip2 = this.f5924n;
            chip2.f2053r = true;
            chip2.refreshDrawableState();
        }
        m3917p(i, 8);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m3917p(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.f5918h.isEnabled() || (parent = (view = this.f5919i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            C1539w2 c1539w2M3915n = m3915n(i);
            accessibilityEventObtain.getText().add(c1539w2M3915n.m6688f());
            AccessibilityNodeInfo accessibilityNodeInfo = c1539w2M3915n.f11909a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                l41.m4048q("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                return;
            } else {
                accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
                AbstractC1650z2.m7185a(accessibilityEventObtain, view, i);
                accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
            }
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}

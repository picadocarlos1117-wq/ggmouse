package p000;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import com.example.ssmousepro.OverlayDisplayBinder;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.github.muntashirakon.adb.AdbProtocol;
import io.github.muntashirakon.adb.PairingConnectionCtx;

/* JADX INFO: renamed from: u2 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1465u2 {

    /* JADX INFO: renamed from: e */
    public static final C1465u2 f11091e;

    /* JADX INFO: renamed from: f */
    public static final C1465u2 f11092f;

    /* JADX INFO: renamed from: g */
    public static final C1465u2 f11093g;

    /* JADX INFO: renamed from: h */
    public static final C1465u2 f11094h;

    /* JADX INFO: renamed from: i */
    public static final C1465u2 f11095i;

    /* JADX INFO: renamed from: j */
    public static final C1465u2 f11096j;

    /* JADX INFO: renamed from: k */
    public static final C1465u2 f11097k;

    /* JADX INFO: renamed from: l */
    public static final C1465u2 f11098l;

    /* JADX INFO: renamed from: a */
    public final Object f11099a;

    /* JADX INFO: renamed from: b */
    public final int f11100b;

    /* JADX INFO: renamed from: c */
    public final Class f11101c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0700h3 f11102d;

    static {
        new C1465u2(1);
        new C1465u2(2);
        new C1465u2(4);
        new C1465u2(8);
        f11091e = new C1465u2(16);
        new C1465u2(32);
        new C1465u2(64);
        new C1465u2(128);
        new C1465u2(AbstractC0004a3.class, 256);
        new C1465u2(AbstractC0004a3.class, UserVerificationMethods.USER_VERIFY_NONE);
        new C1465u2(AbstractC0085b3.class, 1024);
        new C1465u2(AbstractC0085b3.class, 2048);
        f11092f = new C1465u2(4096);
        f11093g = new C1465u2(PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE);
        new C1465u2(PairingConnectionCtx.PairingPacketHeader.MAX_PAYLOAD_SIZE);
        new C1465u2(32768);
        new C1465u2(65536);
        new C1465u2(AbstractC0626f3.class, OverlayDisplayBinder.FLAG_EXTERNAL_DEX_HOSTING);
        f11094h = new C1465u2(AdbProtocol.MAX_PAYLOAD_V2);
        f11095i = new C1465u2(524288);
        f11096j = new C1465u2(AdbProtocol.MAX_PAYLOAD_V3);
        new C1465u2(AbstractC0663g3.class, 2097152);
        new C1465u2(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new C1465u2(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, AbstractC0553d3.class);
        f11097k = new C1465u2(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new C1465u2(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f11098l = new C1465u2(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new C1465u2(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        int i = Build.VERSION.SDK_INT;
        new C1465u2(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new C1465u2(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new C1465u2(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new C1465u2(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new C1465u2(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new C1465u2(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, AbstractC0589e3.class);
        new C1465u2(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, AbstractC0121c3.class);
        new C1465u2(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null, null);
        new C1465u2(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null, null);
        new C1465u2(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new C1465u2(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new C1465u2(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new C1465u2(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new C1465u2(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new C1465u2(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
    }

    public C1465u2(Object obj, int i, String str, InterfaceC0700h3 interfaceC0700h3, Class cls) {
        this.f11100b = i;
        this.f11102d = interfaceC0700h3;
        if (obj == null) {
            this.f11099a = new AccessibilityNodeInfo.AccessibilityAction(i, str);
        } else {
            this.f11099a = obj;
        }
        this.f11101c = cls;
    }

    /* JADX INFO: renamed from: a */
    public final int m6372a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f11099a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1465u2)) {
            return false;
        }
        Object obj2 = ((C1465u2) obj).f11099a;
        Object obj3 = this.f11099a;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f11099a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strM6683d = C1539w2.m6683d(this.f11100b);
        if (strM6683d.equals("ACTION_UNKNOWN")) {
            Object obj = this.f11099a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strM6683d = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strM6683d);
        return sb.toString();
    }

    public C1465u2(Class cls, int i) {
        this(null, i, null, null, cls);
    }

    public C1465u2(int i) {
        this(null, i, null, null, null);
    }
}

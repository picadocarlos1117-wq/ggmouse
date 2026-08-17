package p000;

import android.content.Context;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l7 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class WindowCallbackC1061l7 implements Window.Callback {

    /* JADX INFO: renamed from: a */
    public final Window.Callback f6196a;

    /* JADX INFO: renamed from: b */
    public n12 f6197b;

    /* JADX INFO: renamed from: c */
    public boolean f6198c;

    /* JADX INFO: renamed from: d */
    public boolean f6199d;

    /* JADX INFO: renamed from: e */
    public boolean f6200e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LayoutInflaterFactory2C1359r7 f6201f;

    public WindowCallbackC1061l7(LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7, Window.Callback callback) {
        this.f6201f = layoutInflaterFactory2C1359r7;
        if (callback != null) {
            this.f6196a = callback;
        } else {
            f40.m2713i("Window callback may not be null");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4064a(Window.Callback callback) {
        try {
            this.f6198c = true;
            callback.onContentChanged();
        } finally {
            this.f6198c = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4065b(int i, Menu menu) {
        return this.f6196a.onMenuOpened(i, menu);
    }

    /* JADX INFO: renamed from: c */
    public final void m4066c(int i, Menu menu) {
        this.f6196a.onPanelClosed(i, menu);
    }

    /* JADX INFO: renamed from: d */
    public final void m4067d(List list, Menu menu, int i) {
        w92.m6733a(this.f6196a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f6196a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.f6199d;
        Window.Callback callback = this.f6196a;
        if (z) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.f6201f.m5734u(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.f6196a.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7 = this.f6201f;
            layoutInflaterFactory2C1359r7.m5720A();
            AbstractC0737i3 abstractC0737i3 = layoutInflaterFactory2C1359r7.f9796t;
            if (abstractC0737i3 == null || !abstractC0737i3.mo2297i(keyCode, keyEvent)) {
                C1322q7 c1322q7 = layoutInflaterFactory2C1359r7.f9770R;
                if (c1322q7 == null || !layoutInflaterFactory2C1359r7.m5725F(c1322q7, keyEvent.getKeyCode(), keyEvent)) {
                    if (layoutInflaterFactory2C1359r7.f9770R == null) {
                        C1322q7 c1322q7M5739z = layoutInflaterFactory2C1359r7.m5739z(0);
                        layoutInflaterFactory2C1359r7.m5726G(c1322q7M5739z, keyEvent);
                        boolean zM5725F = layoutInflaterFactory2C1359r7.m5725F(c1322q7M5739z, keyEvent.getKeyCode(), keyEvent);
                        c1322q7M5739z.f9422k = false;
                        if (zM5725F) {
                        }
                    }
                    return false;
                }
                C1322q7 c1322q8 = layoutInflaterFactory2C1359r7.f9770R;
                if (c1322q8 != null) {
                    c1322q8.f9423l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f6196a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f6196a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f6196a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f6196a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f6196a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f6196a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f6198c) {
            this.f6196a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof i31)) {
            return this.f6196a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        n12 n12Var = this.f6197b;
        if (n12Var != null) {
            View view = i == 0 ? new View(n12Var.f7172a.f7611a.f9293a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.f6196a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f6196a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f6196a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        m4065b(i, menu);
        if (i == 108) {
            LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7 = this.f6201f;
            layoutInflaterFactory2C1359r7.m5720A();
            AbstractC0737i3 abstractC0737i3 = layoutInflaterFactory2C1359r7.f9796t;
            if (abstractC0737i3 != null) {
                abstractC0737i3.mo2293c(true);
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f6200e) {
            this.f6196a.onPanelClosed(i, menu);
            return;
        }
        m4066c(i, menu);
        LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7 = this.f6201f;
        if (i == 108) {
            layoutInflaterFactory2C1359r7.m5720A();
            AbstractC0737i3 abstractC0737i3 = layoutInflaterFactory2C1359r7.f9796t;
            if (abstractC0737i3 != null) {
                abstractC0737i3.mo2293c(false);
                return;
            }
            return;
        }
        if (i == 0) {
            C1322q7 c1322q7M5739z = layoutInflaterFactory2C1359r7.m5739z(i);
            if (c1322q7M5739z.f9424m) {
                layoutInflaterFactory2C1359r7.m5733s(c1322q7M5739z, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        x92.m6877a(this.f6196a, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        i31 i31Var = menu instanceof i31 ? (i31) menu : null;
        if (i == 0 && i31Var == null) {
            return false;
        }
        if (i31Var != null) {
            i31Var.f4810x = true;
        }
        n12 n12Var = this.f6197b;
        if (n12Var != null && i == 0) {
            o12 o12Var = n12Var.f7172a;
            if (!o12Var.f7614d) {
                o12Var.f7611a.f9304l = true;
                o12Var.f7614d = true;
            }
        }
        boolean zOnPreparePanel = this.f6196a.onPreparePanel(i, view, menu);
        if (i31Var != null) {
            i31Var.f4810x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        i31 i31Var = this.f6201f.m5739z(0).f9419h;
        if (i31Var != null) {
            m4067d(list, i31Var, i);
        } else {
            m4067d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return v92.m6611a(this.f6196a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f6196a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.f6196a.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (i != 0) {
            return v92.m6612b(this.f6196a, callback, i);
        }
        LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7 = this.f6201f;
        Context context = layoutInflaterFactory2C1359r7.f9792p;
        C0599ed c0599ed = new C0599ed();
        c0599ed.f3314b = context;
        c0599ed.f3313a = callback;
        c0599ed.f3315c = new ArrayList();
        c0599ed.f3316d = new zs1();
        AbstractC0086b4 abstractC0086b4Mo2544m = layoutInflaterFactory2C1359r7.mo2544m(c0599ed);
        if (abstractC0086b4Mo2544m != null) {
            return c0599ed.m2568g(abstractC0086b4Mo2544m);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f6196a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}

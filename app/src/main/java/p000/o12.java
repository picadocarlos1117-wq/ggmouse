package p000;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class o12 extends AbstractC0737i3 {

    /* JADX INFO: renamed from: a */
    public final q12 f7611a;

    /* JADX INFO: renamed from: b */
    public final Window.Callback f7612b;

    /* JADX INFO: renamed from: c */
    public final n12 f7613c;

    /* JADX INFO: renamed from: d */
    public boolean f7614d;

    /* JADX INFO: renamed from: e */
    public boolean f7615e;

    /* JADX INFO: renamed from: f */
    public boolean f7616f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f7617g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final l72 f7618h = new l72(this, 1);

    public o12(Toolbar toolbar, CharSequence charSequence, WindowCallbackC1061l7 windowCallbackC1061l7) {
        n12 n12Var = new n12(this);
        q12 q12Var = new q12(toolbar, false);
        this.f7611a = q12Var;
        windowCallbackC1061l7.getClass();
        this.f7612b = windowCallbackC1061l7;
        q12Var.f9303k = windowCallbackC1061l7;
        toolbar.setOnMenuItemClickListener(n12Var);
        boolean z = q12Var.f9299g;
        if (!z) {
            q12Var.f9300h = charSequence;
            if ((q12Var.f9294b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (z) {
                    i72.m3379k(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.f7613c = new n12(this);
    }

    @Override // p000.AbstractC0737i3
    /* JADX INFO: renamed from: a */
    public final boolean mo3333a() {
        C1540w3 c1540w3;
        ActionMenuView actionMenuView = this.f7611a.f9293a.f519a;
        return (actionMenuView == null || (c1540w3 = actionMenuView.f437y) == null || !c1540w3.m6695g()) ? false : true;
    }

    @Override // p000.AbstractC0737i3
    /* JADX INFO: renamed from: b */
    public final boolean mo2292b() {
        r31 r31Var;
        j12 j12Var = this.f7611a.f9293a.f513R;
        if (j12Var == null || (r31Var = j12Var.f5238b) == null) {
            return false;
        }
        if (j12Var == null) {
            r31Var = null;
        }
        if (r31Var == null) {
            return true;
        }
        r31Var.collapseActionView();
        return true;
    }

    @Override // p000.AbstractC0737i3
    /* JADX INFO: renamed from: c */
    public final void mo2293c(boolean z) {
        if (z == this.f7616f) {
            return;
        }
        this.f7616f = z;
        ArrayList arrayList = this.f7617g;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        l41.m4035b();
    }

    @Override // p000.AbstractC0737i3
    /* JADX INFO: renamed from: d */
    public final int mo2294d() {
        return this.f7611a.f9294b;
    }

    @Override // p000.AbstractC0737i3
    /* JADX INFO: renamed from: e */
    public final Context mo2295e() {
        return this.f7611a.f9293a.getContext();
    }

    @Override // p000.AbstractC0737i3
    /* JADX INFO: renamed from: f */
    public final boolean mo3334f() {
        q12 q12Var = this.f7611a;
        Toolbar toolbar = q12Var.f9293a;
        l72 l72Var = this.f7618h;
        toolbar.removeCallbacks(l72Var);
        Toolbar toolbar2 = q12Var.f9293a;
        WeakHashMap weakHashMap = i72.f4849a;
        s62.m5992m(toolbar2, l72Var);
        return true;
    }

    @Override // p000.AbstractC0737i3
    /* JADX INFO: renamed from: h */
    public final void mo3335h() {
        this.f7611a.f9293a.removeCallbacks(this.f7618h);
    }

    @Override // p000.AbstractC0737i3
    /* JADX INFO: renamed from: i */
    public final boolean mo2297i(int i, KeyEvent keyEvent) {
        Menu menuM4632p = m4632p();
        if (menuM4632p == null) {
            return false;
        }
        menuM4632p.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuM4632p.performShortcut(i, keyEvent, 0);
    }

    @Override // p000.AbstractC0737i3
    /* JADX INFO: renamed from: j */
    public final boolean mo3336j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo3337k();
        }
        return true;
    }

    @Override // p000.AbstractC0737i3
    /* JADX INFO: renamed from: k */
    public final boolean mo3337k() {
        return this.f7611a.f9293a.m274v();
    }

    @Override // p000.AbstractC0737i3
    /* JADX INFO: renamed from: n */
    public final void mo2300n(CharSequence charSequence) {
        q12 q12Var = this.f7611a;
        if (q12Var.f9299g) {
            return;
        }
        Toolbar toolbar = q12Var.f9293a;
        q12Var.f9300h = charSequence;
        if ((q12Var.f9294b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (q12Var.f9299g) {
                i72.m3379k(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final Menu m4632p() {
        boolean z = this.f7615e;
        q12 q12Var = this.f7611a;
        if (!z) {
            C1146ni c1146ni = new C1146ni(this);
            n12 n12Var = new n12(this);
            Toolbar toolbar = q12Var.f9293a;
            toolbar.f514S = c1146ni;
            toolbar.f515T = n12Var;
            ActionMenuView actionMenuView = toolbar.f519a;
            if (actionMenuView != null) {
                actionMenuView.f438z = c1146ni;
                actionMenuView.f427A = n12Var;
            }
            this.f7615e = true;
        }
        return q12Var.f9293a.getMenu();
    }

    @Override // p000.AbstractC0737i3
    /* JADX INFO: renamed from: g */
    public final void mo2296g() {
    }

    @Override // p000.AbstractC0737i3
    /* JADX INFO: renamed from: l */
    public final void mo2298l(boolean z) {
    }

    @Override // p000.AbstractC0737i3
    /* JADX INFO: renamed from: m */
    public final void mo2299m(boolean z) {
    }
}

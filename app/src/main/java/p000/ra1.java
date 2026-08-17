package p000;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ra1 {

    /* JADX INFO: renamed from: a */
    public final Runnable f9857a;

    /* JADX INFO: renamed from: b */
    public final C1620y9 f9858b = new C1620y9();

    /* JADX INFO: renamed from: c */
    public ia1 f9859c;

    /* JADX INFO: renamed from: d */
    public final OnBackInvokedCallback f9860d;

    /* JADX INFO: renamed from: e */
    public OnBackInvokedDispatcher f9861e;

    /* JADX INFO: renamed from: f */
    public boolean f9862f;

    /* JADX INFO: renamed from: g */
    public boolean f9863g;

    public ra1(Runnable runnable) {
        OnBackInvokedCallback onBackInvokedCallbackM4163a;
        this.f9857a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                onBackInvokedCallbackM4163a = na1.f7334a.m4512a(new ja1(this, 0), new ja1(this, 1), new ka1(this, 0), new ka1(this, 1));
            } else {
                onBackInvokedCallbackM4163a = la1.f6286a.m4163a(new ka1(this, 2));
            }
            this.f9860d = onBackInvokedCallbackM4163a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5753a(ms0 ms0Var, ia1 ia1Var) {
        ia1Var.getClass();
        fs0 lifecycle = ms0Var.getLifecycle();
        if (((os0) lifecycle).f8452d == es0.f3433a) {
            return;
        }
        ia1Var.addCancellable(new oa1(this, lifecycle, ia1Var));
        m5756d();
        ia1Var.setEnabledChangedCallback$activity_release(new qa1(0, this, ra1.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0));
    }

    /* JADX INFO: renamed from: b */
    public final void m5754b() {
        Object objPrevious;
        C1620y9 c1620y9 = this.f9858b;
        ListIterator listIterator = c1620y9.listIterator(c1620y9.mo701a());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((ia1) objPrevious).isEnabled());
        ia1 ia1Var = (ia1) objPrevious;
        this.f9859c = null;
        if (ia1Var != null) {
            ia1Var.handleOnBackPressed();
        } else {
            this.f9857a.run();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5755c(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f9861e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f9860d) == null) {
            return;
        }
        la1 la1Var = la1.f6286a;
        if (z && !this.f9862f) {
            la1Var.m4164b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f9862f = true;
        } else {
            if (z || !this.f9862f) {
                return;
            }
            la1Var.m4165c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f9862f = false;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5756d() {
        boolean z = this.f9863g;
        boolean z2 = false;
        C1620y9 c1620y9 = this.f9858b;
        if (c1620y9 == null || !c1620y9.isEmpty()) {
            Iterator it = c1620y9.iterator();
            while (it.hasNext()) {
                if (((ia1) it.next()).isEnabled()) {
                    z2 = true;
                    break;
                }
            }
        }
        this.f9863g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        m5755c(z2);
    }
}

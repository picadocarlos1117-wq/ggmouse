package p000;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class j31 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, f41 {

    /* JADX INFO: renamed from: a */
    public nx1 f5251a;

    /* JADX INFO: renamed from: b */
    public DialogInterfaceC1394s5 f5252b;

    /* JADX INFO: renamed from: c */
    public ht0 f5253c;

    @Override // p000.f41
    /* JADX INFO: renamed from: a */
    public final void mo766a(i31 i31Var, boolean z) {
        DialogInterfaceC1394s5 dialogInterfaceC1394s5;
        if ((z || i31Var == this.f5251a) && (dialogInterfaceC1394s5 = this.f5252b) != null) {
            dialogInterfaceC1394s5.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        nx1 nx1Var = this.f5251a;
        ht0 ht0Var = this.f5253c;
        if (ht0Var.f4700f == null) {
            ht0Var.f4700f = new gt0(ht0Var);
        }
        nx1Var.m3354q(ht0Var.f4700f.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f5253c.mo2928a(this.f5251a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        nx1 nx1Var = this.f5251a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f5252b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f5252b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                nx1Var.m3340c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return nx1Var.performShortcut(i, keyEvent, 0);
    }

    @Override // p000.f41
    /* JADX INFO: renamed from: r */
    public final boolean mo782r(i31 i31Var) {
        return false;
    }
}

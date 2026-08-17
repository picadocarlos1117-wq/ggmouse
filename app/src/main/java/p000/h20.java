package p000;

import android.content.DialogInterface;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0043g;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class h20 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0043g f4395a;

    public h20(DialogInterfaceOnCancelListenerC0043g dialogInterfaceOnCancelListenerC0043g) {
        this.f4395a = dialogInterfaceOnCancelListenerC0043g;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0043g dialogInterfaceOnCancelListenerC0043g = this.f4395a;
        if (dialogInterfaceOnCancelListenerC0043g.mDialog != null) {
            dialogInterfaceOnCancelListenerC0043g.onDismiss(dialogInterfaceOnCancelListenerC0043g.mDialog);
        }
    }
}

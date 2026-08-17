package p000;

import android.content.DialogInterface;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0043g;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class g20 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0043g f4019a;

    public g20(DialogInterfaceOnCancelListenerC0043g dialogInterfaceOnCancelListenerC0043g) {
        this.f4019a = dialogInterfaceOnCancelListenerC0043g;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0043g dialogInterfaceOnCancelListenerC0043g = this.f4019a;
        if (dialogInterfaceOnCancelListenerC0043g.mDialog != null) {
            dialogInterfaceOnCancelListenerC0043g.onCancel(dialogInterfaceOnCancelListenerC0043g.mDialog);
        }
    }
}

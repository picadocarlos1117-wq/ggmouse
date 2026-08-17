package p000;

import android.view.Menu;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class l72 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6208a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f6209b;

    public /* synthetic */ l72(Object obj, int i) {
        this.f6208a = i;
        this.f6209b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6208a;
        Object obj = this.f6209b;
        switch (i) {
            case 0:
                ((m72) obj).m4402n(0);
                return;
            default:
                o12 o12Var = (o12) obj;
                Window.Callback callback = o12Var.f7612b;
                Menu menuM4632p = o12Var.m4632p();
                i31 i31Var = menuM4632p instanceof i31 ? (i31) menuM4632p : null;
                if (i31Var != null) {
                    i31Var.m3360w();
                }
                try {
                    menuM4632p.clear();
                    if (!callback.onCreatePanelMenu(0, menuM4632p) || !callback.onPreparePanel(0, null, menuM4632p)) {
                        menuM4632p.clear();
                    }
                    if (i31Var != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (i31Var != null) {
                        i31Var.m3359v();
                    }
                }
                break;
        }
    }
}

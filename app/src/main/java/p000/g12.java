package p000;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g12 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4011a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Toolbar f4012b;

    public /* synthetic */ g12(Toolbar toolbar, int i) {
        this.f4011a = i;
        this.f4012b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4011a;
        Toolbar toolbar = this.f4012b;
        switch (i) {
            case 0:
                j12 j12Var = toolbar.f513R;
                r31 r31Var = j12Var == null ? null : j12Var.f5238b;
                if (r31Var != null) {
                    r31Var.collapseActionView();
                }
                break;
            default:
                toolbar.m266n();
                break;
        }
    }
}

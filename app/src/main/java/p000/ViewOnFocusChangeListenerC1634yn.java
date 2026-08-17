package p000;

import android.view.View;

/* JADX INFO: renamed from: yn */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC1634yn implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13029a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x60 f13030b;

    public /* synthetic */ ViewOnFocusChangeListenerC1634yn(x60 x60Var, int i) {
        this.f13029a = i;
        this.f13030b = x60Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.f13029a;
        x60 x60Var = this.f13030b;
        switch (i) {
            case 0:
                C0106bo c0106bo = (C0106bo) x60Var;
                c0106bo.m1017s(c0106bo.m1018t());
                break;
            default:
                p40 p40Var = (p40) x60Var;
                p40Var.f8707l = z;
                p40Var.m6869p();
                if (!z) {
                    p40Var.m5200s(false);
                    p40Var.f8708m = false;
                }
                break;
        }
    }
}

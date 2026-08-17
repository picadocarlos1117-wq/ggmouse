package p000;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class c90 extends u22 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1719a;

    /* JADX INFO: renamed from: b */
    public Object f1720b;

    public /* synthetic */ c90(Object obj, int i) {
        this.f1719a = i;
        this.f1720b = obj;
    }

    @Override // p000.s22
    /* JADX INFO: renamed from: b */
    public final void mo149b(t22 t22Var) {
        switch (this.f1719a) {
            case 0:
                View view = (View) this.f1720b;
                i82 i82Var = g82.f4100a;
                i82Var.mo3577f0(view, 1.0f);
                i82Var.getClass();
                t22Var.m6218w(this);
                break;
            case 1:
                ((t22) this.f1720b).mo6221z();
                t22Var.m6218w(this);
                break;
            default:
                y22 y22Var = (y22) this.f1720b;
                int i = y22Var.f12814E - 1;
                y22Var.f12814E = i;
                if (i == 0) {
                    y22Var.f12815F = false;
                    y22Var.m6213n();
                }
                t22Var.m6218w(this);
                break;
        }
    }

    @Override // p000.u22, p000.s22
    /* JADX INFO: renamed from: d */
    public void mo150d() {
        switch (this.f1719a) {
            case 2:
                y22 y22Var = (y22) this.f1720b;
                if (!y22Var.f12815F) {
                    y22Var.m6203G();
                    y22Var.f12815F = true;
                }
                break;
        }
    }

    public /* synthetic */ c90() {
        this.f1719a = 2;
    }
}

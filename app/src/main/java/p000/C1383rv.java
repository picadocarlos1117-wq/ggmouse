package p000;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: rv */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1383rv extends DataSetObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10137a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f10138b;

    public /* synthetic */ C1383rv(Object obj, int i) {
        this.f10137a = i;
        this.f10138b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int i = this.f10137a;
        Object obj = this.f10138b;
        switch (i) {
            case 0:
                cy1 cy1Var = (cy1) obj;
                cy1Var.f10556a = true;
                cy1Var.notifyDataSetChanged();
                break;
            default:
                ot0 ot0Var = (ot0) obj;
                if (ot0Var.f8470E.isShowing()) {
                    ot0Var.mo3059g();
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        int i = this.f10137a;
        Object obj = this.f10138b;
        switch (i) {
            case 0:
                cy1 cy1Var = (cy1) obj;
                cy1Var.f10556a = false;
                cy1Var.notifyDataSetInvalidated();
                break;
            default:
                ((ot0) obj).dismiss();
                break;
        }
    }
}

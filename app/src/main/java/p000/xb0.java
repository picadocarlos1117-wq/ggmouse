package p000;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xb0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12513a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mg0 f12514b;

    public /* synthetic */ xb0(mg0 mg0Var, int i) {
        this.f12513a = i;
        this.f12514b = mg0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f12513a;
        mg0 mg0Var = this.f12514b;
        switch (i) {
            case 0:
                mg0Var.invoke();
                break;
            case 1:
                mg0Var.invoke();
                break;
            default:
                mg0Var.invoke();
                break;
        }
    }
}

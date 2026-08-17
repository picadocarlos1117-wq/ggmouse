package p000;

import android.content.Context;
import android.view.View;
import com.sousasantoslogic.sspro.R;

/* JADX INFO: renamed from: s3 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1392s3 extends z31 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f10211l = 1;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C1540w3 f10212m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1392s3(C1540w3 c1540w3, Context context, nx1 nx1Var, View view) {
        super(context, nx1Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f10212m = c1540w3;
        if ((nx1Var.f7580A.f9694x & 32) != 32) {
            View view2 = c1540w3.f11947n;
            this.f13258e = view2 == null ? (View) c1540w3.f11946m : view2;
        }
        ay0 ay0Var = c1540w3.f11938B;
        this.f13261h = ay0Var;
        w31 w31Var = this.f13262i;
        if (w31Var != null) {
            w31Var.mo2932f(ay0Var);
        }
    }

    @Override // p000.z31
    /* JADX INFO: renamed from: c */
    public final void mo5970c() {
        int i = this.f10211l;
        C1540w3 c1540w3 = this.f10212m;
        switch (i) {
            case 0:
                c1540w3.f11958y = null;
                super.mo5970c();
                break;
            default:
                i31 i31Var = c1540w3.f11941c;
                if (i31Var != null) {
                    i31Var.m3340c(true);
                }
                c1540w3.f11957x = null;
                super.mo5970c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1392s3(C1540w3 c1540w3, Context context, i31 i31Var, View view) {
        super(context, i31Var, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f10212m = c1540w3;
        this.f13259f = 8388613;
        ay0 ay0Var = c1540w3.f11938B;
        this.f13261h = ay0Var;
        w31 w31Var = this.f13262i;
        if (w31Var != null) {
            w31Var.mo2932f(ay0Var);
        }
    }
}

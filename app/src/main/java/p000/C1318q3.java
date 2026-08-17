package p000;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: renamed from: q3 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1318q3 extends ge0 {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f9317o = 0;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ View f9318p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1318q3(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f9318p = actionMenuItemView;
    }

    @Override // p000.ge0
    /* JADX INFO: renamed from: b */
    public final us1 mo2962b() {
        C1392s3 c1392s3;
        int i = this.f9317o;
        View view = this.f9318p;
        switch (i) {
            case 0:
                AbstractC1355r3 abstractC1355r3 = ((ActionMenuItemView) view).f345q;
                if (abstractC1355r3 == null || (c1392s3 = ((C1429t3) abstractC1355r3).f10733a.f11958y) == null) {
                    return null;
                }
                return c1392s3.m7187a();
            default:
                C1392s3 c1392s4 = ((C1503v3) view).f11499d.f11957x;
                if (c1392s4 == null) {
                    return null;
                }
                return c1392s4.m7187a();
        }
    }

    @Override // p000.ge0
    /* JADX INFO: renamed from: c */
    public final boolean mo2963c() {
        us1 us1VarMo2962b;
        int i = this.f9317o;
        View view = this.f9318p;
        switch (i) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                h31 h31Var = actionMenuItemView.f343o;
                return h31Var != null && h31Var.mo208a(actionMenuItemView.f340g) && (us1VarMo2962b = mo2962b()) != null && us1VarMo2962b.mo3058b();
            default:
                ((C1503v3) view).f11499d.m6697l();
                return true;
        }
    }

    @Override // p000.ge0
    /* JADX INFO: renamed from: d */
    public boolean mo2964d() {
        switch (this.f9317o) {
            case 1:
                C1540w3 c1540w3 = ((C1503v3) this.f9318p).f11499d;
                if (c1540w3.f11959z != null) {
                    return false;
                }
                c1540w3.m6695g();
                return true;
            default:
                return super.mo2964d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1318q3(C1503v3 c1503v3, C1503v3 c1503v4) {
        super(c1503v4);
        this.f9318p = c1503v3;
    }
}

package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class he1 implements ce1, View.OnClickListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ re1 f4554a;

    public he1(re1 re1Var) {
        this.f4554a = re1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        re1 re1Var = this.f4554a;
        ImageView imageView = re1Var.f9937B;
        View view2 = re1Var.f9945G;
        View view3 = re1Var.f9944F;
        View view4 = re1Var.f9943E;
        we1 we1Var = re1Var.f9962a;
        ee1 ee1Var = re1Var.f9986o0;
        if (ee1Var == null) {
            return;
        }
        we1Var.m6769g();
        if (re1Var.f9993s == view) {
            f80 f80Var = (f80) ee1Var;
            if (f80Var.m2770r(9)) {
                f80Var.m2741B();
                return;
            }
            return;
        }
        if (re1Var.f9991r == view) {
            f80 f80Var2 = (f80) ee1Var;
            if (f80Var2.m2770r(7)) {
                f80Var2.m2742C();
                return;
            }
            return;
        }
        if (re1Var.f9997u == view) {
            f80 f80Var3 = (f80) ee1Var;
            if (f80Var3.m2768o() == 4 || !f80Var3.m2770r(12)) {
                return;
            }
            f80Var3.m2753N();
            long jM2761h = f80Var3.m2761h() + f80Var3.f3714v;
            long jM2766m = f80Var3.m2766m();
            if (jM2766m != -9223372036854775807L) {
                jM2761h = Math.min(jM2761h, jM2766m);
            }
            f80Var3.m2740A(f80Var3.m2760g(), false, Math.max(jM2761h, 0L));
            return;
        }
        if (re1Var.f9999v == view) {
            f80 f80Var4 = (f80) ee1Var;
            if (f80Var4.m2770r(11)) {
                f80Var4.m2753N();
                long jM2761h2 = f80Var4.m2761h() + (-f80Var4.f3713u);
                long jM2766m2 = f80Var4.m2766m();
                if (jM2766m2 != -9223372036854775807L) {
                    jM2761h2 = Math.min(jM2761h2, jM2766m2);
                }
                f80Var4.m2740A(f80Var4.m2760g(), false, Math.max(jM2761h2, 0L));
                return;
            }
            return;
        }
        if (re1Var.f9995t == view) {
            if (z42.m7224L(ee1Var, re1Var.f9994s0)) {
                z42.m7249w(ee1Var);
                return;
            }
            f80 f80Var5 = (f80) ee1Var;
            if (f80Var5.m2770r(1)) {
                f80Var5.m2745F(false);
                return;
            }
            return;
        }
        if (re1Var.f10005y == view) {
            f80 f80Var6 = (f80) ee1Var;
            if (f80Var6.m2770r(15)) {
                f80Var6.m2753N();
                int i = f80Var6.f3663F;
                int i2 = re1Var.f10004x0;
                for (int i3 = 1; i3 <= 2; i3++) {
                    int i4 = (i + i3) % 3;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 != 2 || (i2 & 2) == 0) {
                            }
                        } else if ((i2 & 1) == 0) {
                        }
                    }
                    i = i4;
                }
                f80Var6.m2746G(i);
                return;
            }
            return;
        }
        if (re1Var.f10007z != view) {
            if (view4 == view) {
                we1Var.m6768f();
                re1Var.m5820d(re1Var.f9972f, view4);
                return;
            }
            if (view3 == view) {
                we1Var.m6768f();
                re1Var.m5820d(re1Var.f9974g, view3);
                return;
            } else if (view2 == view) {
                we1Var.m6768f();
                re1Var.m5820d(re1Var.f9983n, view2);
                return;
            } else {
                if (imageView == view) {
                    we1Var.m6768f();
                    re1Var.m5820d(re1Var.f9981m, imageView);
                    return;
                }
                return;
            }
        }
        f80 f80Var7 = (f80) ee1Var;
        if (f80Var7.m2770r(14)) {
            f80Var7.m2753N();
            boolean z = !f80Var7.f3664G;
            au0 au0Var = f80Var7.f3704l;
            f80Var7.m2753N();
            if (f80Var7.f3664G != z) {
                f80Var7.f3664G = z;
                zy1 zy1Var = f80Var7.f3703k.f6246n;
                zy1Var.getClass();
                yy1 yy1VarM7385b = zy1.m7385b();
                yy1VarM7385b.f13169a = zy1Var.f13615a.obtainMessage(12, z ? 1 : 0, 0);
                yy1VarM7385b.m7164b();
                au0Var.m712c(9, new a80(z, 0));
                f80Var7.m2749J();
                au0Var.m711b();
            }
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        re1 re1Var = this.f4554a;
        if (re1Var.f9942D0) {
            re1Var.f9962a.m6769g();
        }
    }

    @Override // p000.ce1
    public final void onEvents(ee1 ee1Var, be1 be1Var) {
        boolean zM971a = be1Var.m971a(4, 5, 13);
        re1 re1Var = this.f4554a;
        if (zM971a) {
            re1Var.m5829m();
        }
        if (be1Var.m971a(4, 5, 7, 13)) {
            re1Var.m5831o();
        }
        if (be1Var.m971a(8, 13)) {
            re1Var.m5832p();
        }
        if (be1Var.m971a(9, 13)) {
            re1Var.m5834r();
        }
        if (be1Var.m971a(8, 9, 11, 0, 16, 17, 13)) {
            re1Var.m5828l();
        }
        if (be1Var.m971a(11, 0, 13)) {
            re1Var.m5835s();
        }
        if (be1Var.m971a(12, 13)) {
            re1Var.m5830n();
        }
        if (be1Var.m971a(2, 13)) {
            re1Var.m5836t();
        }
    }
}

package p000;

import android.view.View;
import androidx.recyclerview.widget.AbstractC0066e;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class yb1 extends nj1 {

    /* JADX INFO: renamed from: a */
    public RecyclerView f12928a;

    /* JADX INFO: renamed from: b */
    public final tt1 f12929b = new tt1(this);

    /* JADX INFO: renamed from: c */
    public fb1 f12930c;

    /* JADX INFO: renamed from: d */
    public fb1 f12931d;

    /* JADX INFO: renamed from: b */
    public static int m7071b(View view, q50 q50Var) {
        return ((q50Var.mo2786c(view) / 2) + q50Var.mo2788e(view)) - ((q50Var.mo2795l() / 2) + q50Var.mo2794k());
    }

    /* JADX INFO: renamed from: c */
    public static View m7072c(AbstractC0066e abstractC0066e, q50 q50Var) {
        int iM678v = abstractC0066e.m678v();
        View view = null;
        if (iM678v == 0) {
            return null;
        }
        int iMo2795l = (q50Var.mo2795l() / 2) + q50Var.mo2794k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iM678v; i2++) {
            View viewM677u = abstractC0066e.m677u(i2);
            int iAbs = Math.abs(((q50Var.mo2786c(viewM677u) / 2) + q50Var.mo2788e(viewM677u)) - iMo2795l);
            if (iAbs < i) {
                view = viewM677u;
                i = iAbs;
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: a */
    public final int[] m7073a(AbstractC0066e abstractC0066e, View view) {
        int[] iArr = new int[2];
        if (abstractC0066e.mo534d()) {
            iArr[0] = m7071b(view, m7074d(abstractC0066e));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0066e.mo536e()) {
            iArr[1] = m7071b(view, m7075e(abstractC0066e));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    /* JADX INFO: renamed from: d */
    public final q50 m7074d(AbstractC0066e abstractC0066e) {
        fb1 fb1Var = this.f12931d;
        if (fb1Var == null || ((AbstractC0066e) fb1Var.f9391b) != abstractC0066e) {
            this.f12931d = new fb1(abstractC0066e, 0);
        }
        return this.f12931d;
    }

    /* JADX INFO: renamed from: e */
    public final q50 m7075e(AbstractC0066e abstractC0066e) {
        fb1 fb1Var = this.f12930c;
        if (fb1Var == null || ((AbstractC0066e) fb1Var.f9391b) != abstractC0066e) {
            this.f12930c = new fb1(abstractC0066e, 1);
        }
        return this.f12930c;
    }

    /* JADX INFO: renamed from: f */
    public final void m7076f() {
        AbstractC0066e layoutManager;
        View viewM7072c;
        RecyclerView recyclerView = this.f12928a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        if (layoutManager.mo536e()) {
            viewM7072c = m7072c(layoutManager, m7075e(layoutManager));
        } else {
            viewM7072c = layoutManager.mo534d() ? m7072c(layoutManager, m7074d(layoutManager)) : null;
        }
        if (viewM7072c == null) {
            return;
        }
        int[] iArrM7073a = m7073a(layoutManager, viewM7072c);
        int i = iArrM7073a[0];
        if (i == 0 && iArrM7073a[1] == 0) {
            return;
        }
        this.f12928a.m584f0(i, iArrM7073a[1], false);
    }
}

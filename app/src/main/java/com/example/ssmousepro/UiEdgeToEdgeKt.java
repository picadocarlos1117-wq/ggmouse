package com.example.ssmousepro;

import android.view.View;
import java.util.WeakHashMap;
import p000.AbstractActivityC1469u6;
import p000.bb2;
import p000.i72;
import p000.lv1;
import p000.un0;
import p000.y62;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class UiEdgeToEdgeKt {
    public static final void aplicarPaddingSistema(AbstractActivityC1469u6 abstractActivityC1469u6) {
        abstractActivityC1469u6.getClass();
        View viewFindViewById = abstractActivityC1469u6.findViewById(android.R.id.content);
        lv1 lv1Var = new lv1(10);
        WeakHashMap weakHashMap = i72.f4849a;
        y62.m7020u(viewFindViewById, lv1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bb2 aplicarPaddingSistema$lambda$0(View view, bb2 bb2Var) {
        view.getClass();
        bb2Var.getClass();
        un0 un0VarMo6018f = bb2Var.f1285a.mo6018f(7);
        un0VarMo6018f.getClass();
        view.setPadding(un0VarMo6018f.f11368a, un0VarMo6018f.f11369b, un0VarMo6018f.f11370c, un0VarMo6018f.f11371d);
        return bb2Var;
    }
}

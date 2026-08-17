package p000;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class x62 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public bb2 f12465a = null;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f12466b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ha1 f12467c;

    public x62(View view, ha1 ha1Var) {
        this.f12466b = view;
        this.f12467c = ha1Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        bb2 bb2VarM960g = bb2.m960g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        ha1 ha1Var = this.f12467c;
        if (i < 30) {
            y62.m7000a(windowInsets, this.f12466b);
            if (bb2VarM960g.equals(this.f12465a)) {
                return ha1Var.mo786v(view, bb2VarM960g).m965f();
            }
        }
        this.f12465a = bb2VarM960g;
        bb2 bb2VarMo786v = ha1Var.mo786v(view, bb2VarM960g);
        if (i >= 30) {
            return bb2VarMo786v.m965f();
        }
        WeakHashMap weakHashMap = i72.f4849a;
        w62.m6726c(view);
        return bb2VarMo786v.m965f();
    }
}

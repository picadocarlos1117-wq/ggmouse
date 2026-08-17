package p000;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.example.ssmousepro.injection.TouchPipeline;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ha2 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public final lj0 f4494a;

    /* JADX INFO: renamed from: b */
    public bb2 f4495b;

    public ha2(View view, lj0 lj0Var) {
        bb2 bb2VarMo4787b;
        this.f4494a = lj0Var;
        WeakHashMap weakHashMap = i72.f4849a;
        bb2 bb2VarM7254a = z62.m7254a(view);
        if (bb2VarM7254a != null) {
            int i = Build.VERSION.SDK_INT;
            bb2VarMo4787b = (i >= 30 ? new qa2(bb2VarM7254a) : i >= 29 ? new pa2(bb2VarM7254a) : new oa2(bb2VarM7254a)).mo4787b();
        } else {
            bb2VarMo4787b = null;
        }
        this.f4495b = bb2VarMo4787b;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (!view.isLaidOut()) {
            this.f4495b = bb2.m960g(view, windowInsets);
            return ia2.m3408i(view, windowInsets);
        }
        bb2 bb2VarM960g = bb2.m960g(view, windowInsets);
        ya2 ya2Var = bb2VarM960g.f1285a;
        if (this.f4495b == null) {
            WeakHashMap weakHashMap = i72.f4849a;
            this.f4495b = z62.m7254a(view);
        }
        if (this.f4495b == null) {
            this.f4495b = bb2VarM960g;
            return ia2.m3408i(view, windowInsets);
        }
        lj0 lj0VarM3409j = ia2.m3409j(view);
        if (lj0VarM3409j != null && Objects.equals((WindowInsets) lj0VarM3409j.f6364c, windowInsets)) {
            return ia2.m3408i(view, windowInsets);
        }
        bb2 bb2Var = this.f4495b;
        int i = 0;
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if (!ya2Var.mo6018f(i2).equals(bb2Var.f1285a.mo6018f(i2))) {
                i |= i2;
            }
        }
        if (i == 0) {
            return ia2.m3408i(view, windowInsets);
        }
        bb2 bb2Var2 = this.f4495b;
        ma2 ma2Var = new ma2(i, (i & 8) != 0 ? ya2Var.mo6018f(8).f11371d > bb2Var2.f1285a.mo6018f(8).f11371d ? ia2.f4904e : ia2.f4905f : ia2.f4906g, 160L);
        ma2Var.f6733a.mo3816d(TouchPipeline.SIZE);
        ValueAnimator duration = ValueAnimator.ofFloat(TouchPipeline.SIZE, 1.0f).setDuration(ma2Var.f6733a.mo3813a());
        un0 un0VarMo6018f = ya2Var.mo6018f(i);
        un0 un0VarMo6018f2 = bb2Var2.f1285a.mo6018f(i);
        int iMin = Math.min(un0VarMo6018f.f11368a, un0VarMo6018f2.f11368a);
        int i3 = un0VarMo6018f.f11369b;
        int i4 = un0VarMo6018f2.f11369b;
        int iMin2 = Math.min(i3, i4);
        int i5 = un0VarMo6018f.f11370c;
        int i6 = un0VarMo6018f2.f11370c;
        int iMin3 = Math.min(i5, i6);
        int i7 = un0VarMo6018f.f11371d;
        int i8 = i;
        int i9 = un0VarMo6018f2.f11371d;
        fa2 fa2Var = new fa2(0, un0.m6514b(iMin, iMin2, iMin3, Math.min(i7, i9)), un0.m6514b(Math.max(un0VarMo6018f.f11368a, un0VarMo6018f2.f11368a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
        ia2.m3405f(view, windowInsets, false);
        duration.addUpdateListener(new ga2(ma2Var, bb2VarM960g, bb2Var2, i8, view));
        duration.addListener(new q22(ma2Var, view, 2));
        bb1.m958a(view, new i10(view, ma2Var, fa2Var, duration));
        this.f4495b = bb2VarM960g;
        return ia2.m3408i(view, windowInsets);
    }
}

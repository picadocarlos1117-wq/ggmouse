package p000;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import com.example.ssmousepro.injection.TouchPipeline;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ja2 extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: a */
    public final lj0 f5339a;

    /* JADX INFO: renamed from: b */
    public List f5340b;

    /* JADX INFO: renamed from: c */
    public ArrayList f5341c;

    /* JADX INFO: renamed from: d */
    public final HashMap f5342d;

    public ja2(lj0 lj0Var) {
        super(0);
        this.f5342d = new HashMap();
        this.f5339a = lj0Var;
    }

    /* JADX INFO: renamed from: a */
    public final ma2 m3586a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.f5342d;
        ma2 ma2Var = (ma2) map.get(windowInsetsAnimation);
        if (ma2Var == null) {
            ma2Var = new ma2(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                ma2Var.f6733a = new ka2(windowInsetsAnimation);
            }
            map.put(windowInsetsAnimation, ma2Var);
        }
        return ma2Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        m3586a(windowInsetsAnimation);
        ((View) this.f5339a.f6365d).setTranslationY(TouchPipeline.SIZE);
        this.f5342d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        m3586a(windowInsetsAnimation);
        lj0 lj0Var = this.f5339a;
        View view = (View) lj0Var.f6365d;
        int[] iArr = (int[]) lj0Var.f6366e;
        view.getLocationOnScreen(iArr);
        lj0Var.f6362a = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f5341c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f5341c = arrayList2;
            this.f5340b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationM5423m = AbstractC1317q2.m5423m(list.get(size));
            ma2 ma2VarM3586a = m3586a(windowInsetsAnimationM5423m);
            ma2VarM3586a.f6733a.mo3816d(windowInsetsAnimationM5423m.getFraction());
            this.f5341c.add(ma2VarM3586a);
        }
        bb2 bb2VarM960g = bb2.m960g(null, windowInsets);
        this.f5339a.m4222c(bb2VarM960g, this.f5340b);
        return bb2VarM960g.m965f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        m3586a(windowInsetsAnimation);
        un0 un0VarM6515c = un0.m6515c(bounds.getLowerBound());
        un0 un0VarM6515c2 = un0.m6515c(bounds.getUpperBound());
        lj0 lj0Var = this.f5339a;
        View view = (View) lj0Var.f6365d;
        int[] iArr = (int[]) lj0Var.f6366e;
        view.getLocationOnScreen(iArr);
        int i = lj0Var.f6362a - iArr[1];
        lj0Var.f6363b = i;
        view.setTranslationY(i);
        AbstractC1317q2.m5426p();
        return AbstractC1317q2.m5421k(un0VarM6515c.m6516d(), un0VarM6515c2.m6516d());
    }
}

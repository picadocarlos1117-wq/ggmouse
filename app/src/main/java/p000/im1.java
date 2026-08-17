package p000;

import android.view.View;
import androidx.fragment.app.C0042f;
import androidx.fragment.app.C0061y;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class im1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5104a;

    /* JADX INFO: renamed from: b */
    public final Object f5105b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f5106c;

    public im1(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.f5104a = 4;
        this.f5106c = swipeDismissBehavior;
        this.f5105b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5104a) {
            case 0:
                dx0 dx0Var = (dx0) this.f5106c;
                nm1 nm1VarM2395q = dx0Var.m2395q(dx0Var.f3060o.f5907e, false);
                if (nm1VarM2395q != null) {
                    ((dx0) this.f5106c).f3047b.execute(new RunnableC1466u3(29, this, nm1VarM2395q));
                    break;
                }
                break;
            case 1:
                ((dx0) ((qo0) this.f5106c).f9549c).f3066u.mo4761f((j51) this.f5105b);
                break;
            case 2:
                ((dx0) ((qo0) this.f5106c).f9549c).f3066u.mo4770s((pn0) this.f5105b);
                break;
            case 3:
                C0042f c0042f = (C0042f) this.f5106c;
                ArrayList arrayList = c0042f.f683b;
                C0061y c0061y = (C0061y) this.f5105b;
                arrayList.remove(c0061y);
                c0042f.f684c.remove(c0061y);
                break;
            default:
                m72 m72Var = ((SwipeDismissBehavior) this.f5106c).f1948a;
                if (m72Var != null && m72Var.m4394f()) {
                    View view = (View) this.f5105b;
                    WeakHashMap weakHashMap = i72.f4849a;
                    s62.m5992m(view, this);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ im1(int i, Object obj, Object obj2) {
        this.f5104a = i;
        this.f5106c = obj;
        this.f5105b = obj2;
    }
}

package p000;

import android.database.Observable;
import androidx.recyclerview.widget.AbstractC0064c;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class fj1 extends Observable {
    /* JADX INFO: renamed from: a */
    public final boolean m2815a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    /* JADX INFO: renamed from: b */
    public final void m2816b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((sj1) ((gj1) ((Observable) this).mObservers.get(size))).f10419a;
            recyclerView.m589i(null);
            recyclerView.f918l0.f12198f = true;
            recyclerView.m573V(true);
            if (!recyclerView.f908e.m7201l()) {
                recyclerView.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2817c(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            sj1 sj1Var = (sj1) ((gj1) ((Observable) this).mObservers.get(size));
            RecyclerView recyclerView = sj1Var.f10419a;
            recyclerView.m589i(null);
            C1652z4 c1652z4 = recyclerView.f908e;
            ArrayList arrayList = (ArrayList) c1652z4.f13268c;
            if (i != i2) {
                arrayList.add(c1652z4.m7203n(8, i, i2, null));
                c1652z4.f13266a |= 8;
                if (arrayList.size() == 1) {
                    sj1Var.m6106a();
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2818d(int i, int i2, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            sj1 sj1Var = (sj1) ((gj1) ((Observable) this).mObservers.get(size));
            RecyclerView recyclerView = sj1Var.f10419a;
            recyclerView.m589i(null);
            C1652z4 c1652z4 = recyclerView.f908e;
            ArrayList arrayList = (ArrayList) c1652z4.f13268c;
            if (i2 >= 1) {
                arrayList.add(c1652z4.m7203n(4, i, i2, obj));
                c1652z4.f13266a = 4 | c1652z4.f13266a;
                if (arrayList.size() == 1) {
                    sj1Var.m6106a();
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2819e(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            sj1 sj1Var = (sj1) ((gj1) ((Observable) this).mObservers.get(size));
            RecyclerView recyclerView = sj1Var.f10419a;
            recyclerView.m589i(null);
            C1652z4 c1652z4 = recyclerView.f908e;
            ArrayList arrayList = (ArrayList) c1652z4.f13268c;
            if (i2 >= 1) {
                arrayList.add(c1652z4.m7203n(1, i, i2, null));
                c1652z4.f13266a |= 1;
                if (arrayList.size() == 1) {
                    sj1Var.m6106a();
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2820f(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            sj1 sj1Var = (sj1) ((gj1) ((Observable) this).mObservers.get(size));
            RecyclerView recyclerView = sj1Var.f10419a;
            recyclerView.m589i(null);
            C1652z4 c1652z4 = recyclerView.f908e;
            ArrayList arrayList = (ArrayList) c1652z4.f13268c;
            if (i2 >= 1) {
                arrayList.add(c1652z4.m7203n(2, i, i2, null));
                c1652z4.f13266a |= 2;
                if (arrayList.size() == 1) {
                    sj1Var.m6106a();
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2821g() {
        AbstractC0064c abstractC0064c;
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((sj1) ((gj1) ((Observable) this).mObservers.get(size))).f10419a;
            if (recyclerView.f906d != null && (abstractC0064c = recyclerView.f929r) != null && abstractC0064c.canRestoreState()) {
                recyclerView.requestLayout();
            }
        }
    }
}

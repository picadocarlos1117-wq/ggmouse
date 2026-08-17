package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class bg0 extends xf0 {
    @Override // p000.xf0
    /* JADX INFO: renamed from: a */
    public final void mo974a(View view, Object obj) {
        ((t22) obj).mo6206b(view);
    }

    @Override // p000.xf0
    /* JADX INFO: renamed from: b */
    public final void mo975b(Object obj, ArrayList arrayList) {
        t22 t22Var = (t22) obj;
        if (t22Var == null) {
            return;
        }
        int i = 0;
        if (t22Var instanceof y22) {
            y22 y22Var = (y22) t22Var;
            int size = y22Var.f12812C.size();
            while (i < size) {
                mo975b((i < 0 || i >= y22Var.f12812C.size()) ? null : (t22) y22Var.f12812C.get(i), arrayList);
                i++;
            }
            return;
        }
        if (xf0.m6922h(t22Var.f10717e) && xf0.m6922h(t22Var.f10718f)) {
            int size2 = arrayList.size();
            while (i < size2) {
                t22Var.mo6206b((View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // p000.xf0
    /* JADX INFO: renamed from: c */
    public final void mo976c(ViewGroup viewGroup, Object obj) {
        x22.m6862a(viewGroup, (t22) obj);
    }

    @Override // p000.xf0
    /* JADX INFO: renamed from: e */
    public final boolean mo977e(Object obj) {
        return obj instanceof t22;
    }

    @Override // p000.xf0
    /* JADX INFO: renamed from: f */
    public final Object mo978f(Object obj) {
        if (obj != null) {
            return ((t22) obj).clone();
        }
        return null;
    }

    @Override // p000.xf0
    /* JADX INFO: renamed from: i */
    public final Object mo979i(Object obj, Object obj2, Object obj3) {
        t22 t22Var = (t22) obj;
        t22 t22Var2 = (t22) obj2;
        t22 t22Var3 = (t22) obj3;
        if (t22Var != null && t22Var2 != null) {
            y22 y22Var = new y22();
            y22Var.m6996I(t22Var);
            y22Var.m6996I(t22Var2);
            y22Var.f12813D = false;
            t22Var = y22Var;
        } else if (t22Var == null) {
            t22Var = t22Var2 != null ? t22Var2 : null;
        }
        if (t22Var3 == null) {
            return t22Var;
        }
        y22 y22Var2 = new y22();
        if (t22Var != null) {
            y22Var2.m6996I(t22Var);
        }
        y22Var2.m6996I(t22Var3);
        return y22Var2;
    }

    @Override // p000.xf0
    /* JADX INFO: renamed from: j */
    public final Object mo980j(Object obj, Object obj2) {
        y22 y22Var = new y22();
        if (obj != null) {
            y22Var.m6996I((t22) obj);
        }
        y22Var.m6996I((t22) obj2);
        return y22Var;
    }

    @Override // p000.xf0
    /* JADX INFO: renamed from: k */
    public final void mo981k(Object obj, View view, ArrayList arrayList) {
        ((t22) obj).m6205a(new zf0(arrayList, view));
    }

    @Override // p000.xf0
    /* JADX INFO: renamed from: l */
    public final void mo982l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((t22) obj).m6205a(new ag0(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // p000.xf0
    /* JADX INFO: renamed from: m */
    public final void mo983m(View view, Object obj) {
        if (view != null) {
            xf0.m6921g(view, new Rect());
            ((t22) obj).mo6198B(new yf0());
        }
    }

    @Override // p000.xf0
    /* JADX INFO: renamed from: n */
    public final void mo984n(Object obj, Rect rect) {
        ((t22) obj).mo6198B(new yf0());
    }

    @Override // p000.xf0
    /* JADX INFO: renamed from: p */
    public final void mo985p(Object obj, View view, ArrayList arrayList) {
        y22 y22Var = (y22) obj;
        ArrayList arrayList2 = y22Var.f10718f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            xf0.m6920d((View) arrayList.get(i), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        mo975b(y22Var, arrayList);
    }

    @Override // p000.xf0
    /* JADX INFO: renamed from: q */
    public final void mo986q(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        y22 y22Var = (y22) obj;
        if (y22Var != null) {
            ArrayList arrayList3 = y22Var.f10718f;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            m988s(y22Var, arrayList, arrayList2);
        }
    }

    @Override // p000.xf0
    /* JADX INFO: renamed from: r */
    public final Object mo987r(Object obj) {
        if (obj == null) {
            return null;
        }
        y22 y22Var = new y22();
        y22Var.m6996I((t22) obj);
        return y22Var;
    }

    /* JADX INFO: renamed from: s */
    public final void m988s(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        t22 t22Var = (t22) obj;
        int i = 0;
        if (t22Var instanceof y22) {
            y22 y22Var = (y22) t22Var;
            int size = y22Var.f12812C.size();
            while (i < size) {
                m988s((i < 0 || i >= y22Var.f12812C.size()) ? null : (t22) y22Var.f12812C.get(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (xf0.m6922h(t22Var.f10717e)) {
            ArrayList arrayList3 = t22Var.f10718f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    t22Var.mo6206b((View) arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    t22Var.mo6219x((View) arrayList.get(size3));
                }
            }
        }
    }
}

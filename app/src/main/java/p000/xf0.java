package p000;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.example.ssmousepro.injection.TouchPipeline;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xf0 {
    /* JADX INFO: renamed from: d */
    public static void m6920d(View view, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == view) {
                return;
            }
        }
        WeakHashMap weakHashMap = i72.f4849a;
        if (y62.m7010k(view) != null) {
            list.add(view);
        }
        for (int i2 = size; i2 < list.size(); i2++) {
            View view2 = (View) list.get(i2);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            if (y62.m7010k(childAt) == null) {
                                break;
                            }
                            list.add(childAt);
                            break;
                        } else if (list.get(i4) == childAt) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m6921g(View view, Rect rect) {
        WeakHashMap weakHashMap = i72.f4849a;
        if (v62.m6586b(view)) {
            RectF rectF = new RectF();
            rectF.set(TouchPipeline.SIZE, TouchPipeline.SIZE, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m6922h(List list) {
        return list == null || list.isEmpty();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo974a(View view, Object obj);

    /* JADX INFO: renamed from: b */
    public abstract void mo975b(Object obj, ArrayList arrayList);

    /* JADX INFO: renamed from: c */
    public abstract void mo976c(ViewGroup viewGroup, Object obj);

    /* JADX INFO: renamed from: e */
    public abstract boolean mo977e(Object obj);

    /* JADX INFO: renamed from: f */
    public abstract Object mo978f(Object obj);

    /* JADX INFO: renamed from: i */
    public abstract Object mo979i(Object obj, Object obj2, Object obj3);

    /* JADX INFO: renamed from: j */
    public abstract Object mo980j(Object obj, Object obj2);

    /* JADX INFO: renamed from: k */
    public abstract void mo981k(Object obj, View view, ArrayList arrayList);

    /* JADX INFO: renamed from: l */
    public abstract void mo982l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    /* JADX INFO: renamed from: m */
    public abstract void mo983m(View view, Object obj);

    /* JADX INFO: renamed from: n */
    public abstract void mo984n(Object obj, Rect rect);

    /* JADX INFO: renamed from: o */
    public void mo6623o(Object obj, RunnableC1466u3 runnableC1466u3) throws Throwable {
        runnableC1466u3.run();
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo985p(Object obj, View view, ArrayList arrayList);

    /* JADX INFO: renamed from: q */
    public abstract void mo986q(Object obj, ArrayList arrayList, ArrayList arrayList2);

    /* JADX INFO: renamed from: r */
    public abstract Object mo987r(Object obj);
}

package p000;

import android.view.View;
import androidx.recyclerview.widget.AbstractC0064c;
import androidx.recyclerview.widget.AbstractC0068g;
import androidx.recyclerview.widget.RecyclerView;
import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class dj1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView f2954a;

    public /* synthetic */ dj1(RecyclerView recyclerView) {
        this.f2954a = recyclerView;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    /* JADX INFO: renamed from: a */
    public void m2362a(AbstractC0068g abstractC0068g, g21 g21Var, g21 g21Var2) {
        boolean zM5623g;
        abstractC0068g.setIsRecyclable(false);
        RecyclerView recyclerView = this.f2954a;
        C1350qz c1350qz = (C1350qz) recyclerView.f893Q;
        if (g21Var != null) {
            c1350qz.getClass();
            int i = g21Var.f4020a;
            int i2 = g21Var2.f4020a;
            if (i == i2 && g21Var.f4021b == g21Var2.f4021b) {
                c1350qz.m5627l(abstractC0068g);
                abstractC0068g.itemView.setAlpha(TouchPipeline.SIZE);
                c1350qz.f9612i.add(abstractC0068g);
                zM5623g = true;
            } else {
                zM5623g = c1350qz.m5623g(abstractC0068g, i, g21Var.f4021b, i2, g21Var2.f4021b);
            }
        } else {
            c1350qz.m5627l(abstractC0068g);
            abstractC0068g.itemView.setAlpha(TouchPipeline.SIZE);
            c1350qz.f9612i.add(abstractC0068g);
            zM5623g = true;
        }
        if (zM5623g) {
            recyclerView.m571T();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2363b(AbstractC0068g abstractC0068g, g21 g21Var, g21 g21Var2) {
        boolean zM5623g;
        RecyclerView recyclerView = this.f2954a;
        recyclerView.f904c.m694l(abstractC0068g);
        recyclerView.m583f(abstractC0068g);
        abstractC0068g.setIsRecyclable(false);
        C1350qz c1350qz = (C1350qz) recyclerView.f893Q;
        c1350qz.getClass();
        int i = g21Var.f4020a;
        int i2 = g21Var.f4021b;
        View view = abstractC0068g.itemView;
        int left = g21Var2 == null ? view.getLeft() : g21Var2.f4020a;
        int top = g21Var2 == null ? view.getTop() : g21Var2.f4021b;
        if (abstractC0068g.isRemoved() || (i == left && i2 == top)) {
            c1350qz.m5627l(abstractC0068g);
            c1350qz.f9611h.add(abstractC0068g);
            zM5623g = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zM5623g = c1350qz.m5623g(abstractC0068g, i, i2, left, top);
        }
        if (zM5623g) {
            recyclerView.m571T();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m2364c(int i) {
        RecyclerView recyclerView = this.f2954a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            AbstractC0068g abstractC0068gM547J = RecyclerView.m547J(childAt);
            AbstractC0064c abstractC0064c = recyclerView.f929r;
            if (abstractC0064c != null && abstractC0068gM547J != null) {
                abstractC0064c.onViewDetachedFromWindow(abstractC0068gM547J);
            }
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}

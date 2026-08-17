package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.AbstractC0065d;
import androidx.recyclerview.widget.AbstractC0068g;
import com.example.ssmousepro.injection.TouchPipeline;
import java.util.ArrayList;

/* JADX INFO: renamed from: qz */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1350qz extends AbstractC0065d {

    /* JADX INFO: renamed from: s */
    public static TimeInterpolator f9609s;

    /* JADX INFO: renamed from: g */
    public boolean f9610g;

    /* JADX INFO: renamed from: h */
    public ArrayList f9611h;

    /* JADX INFO: renamed from: i */
    public ArrayList f9612i;

    /* JADX INFO: renamed from: j */
    public ArrayList f9613j;

    /* JADX INFO: renamed from: k */
    public ArrayList f9614k;

    /* JADX INFO: renamed from: l */
    public ArrayList f9615l;

    /* JADX INFO: renamed from: m */
    public ArrayList f9616m;

    /* JADX INFO: renamed from: n */
    public ArrayList f9617n;

    /* JADX INFO: renamed from: o */
    public ArrayList f9618o;

    /* JADX INFO: renamed from: p */
    public ArrayList f9619p;

    /* JADX INFO: renamed from: q */
    public ArrayList f9620q;

    /* JADX INFO: renamed from: r */
    public ArrayList f9621r;

    /* JADX INFO: renamed from: h */
    public static void m5622h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC0068g) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0065d
    /* JADX INFO: renamed from: a */
    public final boolean mo646a(AbstractC0068g abstractC0068g, AbstractC0068g abstractC0068g2, g21 g21Var, g21 g21Var2) {
        int i;
        int i2;
        int i3 = g21Var.f4020a;
        int i4 = g21Var.f4021b;
        if (abstractC0068g2.shouldIgnore()) {
            int i5 = g21Var.f4020a;
            i2 = g21Var.f4021b;
            i = i5;
        } else {
            i = g21Var2.f4020a;
            i2 = g21Var2.f4021b;
        }
        if (abstractC0068g == abstractC0068g2) {
            return m5623g(abstractC0068g, i3, i4, i, i2);
        }
        float translationX = abstractC0068g.itemView.getTranslationX();
        float translationY = abstractC0068g.itemView.getTranslationY();
        float alpha = abstractC0068g.itemView.getAlpha();
        m5627l(abstractC0068g);
        abstractC0068g.itemView.setTranslationX(translationX);
        abstractC0068g.itemView.setTranslationY(translationY);
        abstractC0068g.itemView.setAlpha(alpha);
        m5627l(abstractC0068g2);
        abstractC0068g2.itemView.setTranslationX(-((int) ((i - i3) - translationX)));
        abstractC0068g2.itemView.setTranslationY(-((int) ((i2 - i4) - translationY)));
        abstractC0068g2.itemView.setAlpha(TouchPipeline.SIZE);
        ArrayList arrayList = this.f9614k;
        C1276oz c1276oz = new C1276oz();
        c1276oz.f8583a = abstractC0068g;
        c1276oz.f8584b = abstractC0068g2;
        c1276oz.f8585c = i3;
        c1276oz.f8586d = i4;
        c1276oz.f8587e = i;
        c1276oz.f8588f = i2;
        arrayList.add(c1276oz);
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0065d
    /* JADX INFO: renamed from: d */
    public final void mo648d(AbstractC0068g abstractC0068g) {
        ArrayList arrayList = this.f9615l;
        ArrayList arrayList2 = this.f9616m;
        ArrayList arrayList3 = this.f9617n;
        View view = abstractC0068g.itemView;
        view.animate().cancel();
        ArrayList arrayList4 = this.f9613j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C1313pz) arrayList4.get(size)).f9233a == abstractC0068g) {
                view.setTranslationY(TouchPipeline.SIZE);
                view.setTranslationX(TouchPipeline.SIZE);
                m647c(abstractC0068g);
                arrayList4.remove(size);
            }
        }
        m5625j(this.f9614k, abstractC0068g);
        if (this.f9611h.remove(abstractC0068g)) {
            view.setAlpha(1.0f);
            m647c(abstractC0068g);
        }
        if (this.f9612i.remove(abstractC0068g)) {
            view.setAlpha(1.0f);
            m647c(abstractC0068g);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            m5625j(arrayList5, abstractC0068g);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            for (int size4 = arrayList6.size() - 1; size4 >= 0; size4--) {
                if (((C1313pz) arrayList6.get(size4)).f9233a == abstractC0068g) {
                    view.setTranslationY(TouchPipeline.SIZE);
                    view.setTranslationX(TouchPipeline.SIZE);
                    m647c(abstractC0068g);
                    arrayList6.remove(size4);
                    if (!arrayList6.isEmpty()) {
                        break;
                    }
                    arrayList2.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(abstractC0068g)) {
                view.setAlpha(1.0f);
                m647c(abstractC0068g);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f9620q.remove(abstractC0068g);
        this.f9618o.remove(abstractC0068g);
        this.f9621r.remove(abstractC0068g);
        this.f9619p.remove(abstractC0068g);
        m5624i();
    }

    @Override // androidx.recyclerview.widget.AbstractC0065d
    /* JADX INFO: renamed from: e */
    public final void mo649e() {
        ArrayList arrayList = this.f9614k;
        ArrayList arrayList2 = this.f9617n;
        ArrayList arrayList3 = this.f9615l;
        ArrayList arrayList4 = this.f9616m;
        ArrayList arrayList5 = this.f9612i;
        ArrayList arrayList6 = this.f9611h;
        ArrayList arrayList7 = this.f9613j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1313pz c1313pz = (C1313pz) arrayList7.get(size);
            View view = c1313pz.f9233a.itemView;
            view.setTranslationY(TouchPipeline.SIZE);
            view.setTranslationX(TouchPipeline.SIZE);
            m647c(c1313pz.f9233a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            m647c((AbstractC0068g) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractC0068g abstractC0068g = (AbstractC0068g) arrayList5.get(size3);
            abstractC0068g.itemView.setAlpha(1.0f);
            m647c(abstractC0068g);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
            C1276oz c1276oz = (C1276oz) arrayList.get(size4);
            AbstractC0068g abstractC0068g2 = c1276oz.f8583a;
            if (abstractC0068g2 != null) {
                m5626k(c1276oz, abstractC0068g2);
            }
            AbstractC0068g abstractC0068g3 = c1276oz.f8584b;
            if (abstractC0068g3 != null) {
                m5626k(c1276oz, abstractC0068g3);
            }
        }
        arrayList.clear();
        if (mo650f()) {
            for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList4.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    C1313pz c1313pz2 = (C1313pz) arrayList8.get(size6);
                    View view2 = c1313pz2.f9233a.itemView;
                    view2.setTranslationY(TouchPipeline.SIZE);
                    view2.setTranslationX(TouchPipeline.SIZE);
                    m647c(c1313pz2.f9233a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList4.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList3.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    AbstractC0068g abstractC0068g4 = (AbstractC0068g) arrayList9.get(size8);
                    abstractC0068g4.itemView.setAlpha(1.0f);
                    m647c(abstractC0068g4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList3.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList2.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C1276oz c1276oz2 = (C1276oz) arrayList10.get(size10);
                    AbstractC0068g abstractC0068g5 = c1276oz2.f8583a;
                    if (abstractC0068g5 != null) {
                        m5626k(c1276oz2, abstractC0068g5);
                    }
                    AbstractC0068g abstractC0068g6 = c1276oz2.f8584b;
                    if (abstractC0068g6 != null) {
                        m5626k(c1276oz2, abstractC0068g6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList2.remove(arrayList10);
                    }
                }
            }
            m5622h(this.f9620q);
            m5622h(this.f9619p);
            m5622h(this.f9618o);
            m5622h(this.f9621r);
            ArrayList arrayList11 = this.f977b;
            if (arrayList11.size() <= 0) {
                arrayList11.clear();
            } else {
                arrayList11.get(0).getClass();
                l41.m4035b();
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0065d
    /* JADX INFO: renamed from: f */
    public final boolean mo650f() {
        return (this.f9612i.isEmpty() && this.f9614k.isEmpty() && this.f9613j.isEmpty() && this.f9611h.isEmpty() && this.f9619p.isEmpty() && this.f9620q.isEmpty() && this.f9618o.isEmpty() && this.f9621r.isEmpty() && this.f9616m.isEmpty() && this.f9615l.isEmpty() && this.f9617n.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m5623g(AbstractC0068g abstractC0068g, int i, int i2, int i3, int i4) {
        View view = abstractC0068g.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC0068g.itemView.getTranslationY());
        m5627l(abstractC0068g);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            m647c(abstractC0068g);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.f9613j;
        C1313pz c1313pz = new C1313pz();
        c1313pz.f9233a = abstractC0068g;
        c1313pz.f9234b = translationX;
        c1313pz.f9235c = translationY;
        c1313pz.f9236d = i3;
        c1313pz.f9237e = i4;
        arrayList.add(c1313pz);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m5624i() {
        if (mo650f()) {
            return;
        }
        ArrayList arrayList = this.f977b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            l41.m4035b();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m5625j(ArrayList arrayList, AbstractC0068g abstractC0068g) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1276oz c1276oz = (C1276oz) arrayList.get(size);
            if (m5626k(c1276oz, abstractC0068g) && c1276oz.f8583a == null && c1276oz.f8584b == null) {
                arrayList.remove(c1276oz);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m5626k(C1276oz c1276oz, AbstractC0068g abstractC0068g) {
        if (c1276oz.f8584b == abstractC0068g) {
            c1276oz.f8584b = null;
        } else {
            if (c1276oz.f8583a != abstractC0068g) {
                return false;
            }
            c1276oz.f8583a = null;
        }
        abstractC0068g.itemView.setAlpha(1.0f);
        abstractC0068g.itemView.setTranslationX(TouchPipeline.SIZE);
        abstractC0068g.itemView.setTranslationY(TouchPipeline.SIZE);
        m647c(abstractC0068g);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final void m5627l(AbstractC0068g abstractC0068g) {
        if (f9609s == null) {
            f9609s = new ValueAnimator().getInterpolator();
        }
        abstractC0068g.itemView.animate().setInterpolator(f9609s);
        mo648d(abstractC0068g);
    }
}

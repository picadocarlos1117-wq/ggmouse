package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.sousasantoslogic.sspro.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import p000.AbstractC1308pu;
import p000.C0092ba;
import p000.C0558d8;
import p000.C0596ea;
import p000.C0599ed;
import p000.C0633fa;
import p000.C1112ml;
import p000.RunnableC1466u3;
import p000.RunnableC1621ya;
import p000.bb1;
import p000.ca0;
import p000.i72;
import p000.im1;
import p000.j00;
import p000.jd0;
import p000.k00;
import p000.k50;
import p000.l00;
import p000.m00;
import p000.n72;
import p000.qf0;
import p000.re0;
import p000.ue0;
import p000.v62;
import p000.vf0;
import p000.wf0;
import p000.xf0;
import p000.y62;
import p000.zs1;

/* JADX INFO: renamed from: androidx.fragment.app.f */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0042f {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f682a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f683b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ArrayList f684c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public boolean f685d = false;

    /* JADX INFO: renamed from: e */
    public boolean f686e = false;

    public C0042f(ViewGroup viewGroup) {
        this.f682a = viewGroup;
    }

    /* JADX INFO: renamed from: a */
    public static void m338a(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (n72.m4504b(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                m338a(arrayList, childAt);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m339e(C0633fa c0633fa, View view) {
        WeakHashMap weakHashMap = i72.f4849a;
        String strM7010k = y62.m7010k(view);
        if (strM7010k != null) {
            c0633fa.put(strM7010k, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    m339e(c0633fa, childAt);
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static C0042f m340h(ViewGroup viewGroup, k50 k50Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0042f) {
            return (C0042f) tag;
        }
        k50Var.getClass();
        C0042f c0042f = new C0042f(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0042f);
        return c0042f;
    }

    /* JADX INFO: renamed from: i */
    public static C0042f m341i(ViewGroup viewGroup, AbstractC0056t abstractC0056t) {
        return m340h(viewGroup, abstractC0056t.m371F());
    }

    /* JADX INFO: renamed from: k */
    public static void m342k(C0633fa c0633fa, Collection collection) {
        Iterator it = ((C0092ba) c0633fa.entrySet()).iterator();
        while (true) {
            C0596ea c0596ea = (C0596ea) it;
            if (!c0596ea.hasNext()) {
                return;
            }
            c0596ea.next();
            View view = (View) c0596ea.getValue();
            WeakHashMap weakHashMap = i72.f4849a;
            if (!collection.contains(y62.m7010k(view))) {
                c0596ea.remove();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m343b(int i, int i2, C0059w c0059w) {
        synchronized (this.f683b) {
            try {
                C1112ml c1112ml = new C1112ml();
                C0061y c0061yM346f = m346f(c0059w.f760c);
                if (c0061yM346f != null) {
                    c0061yM346f.m442c(i, i2);
                    return;
                }
                C0061y c0061y = new C0061y(i, i2, c0059w, c1112ml);
                this.f683b.add(c0061y);
                c0061y.f770d.add(new RunnableC0039c(this, c0061y));
                c0061y.f770d.add(new im1(3, this, c0061y));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:212:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:216:0x0604  */
    /* JADX WARN: Code duplicated, block: B:219:0x060e  */
    /* JADX WARN: Code duplicated, block: B:222:0x0618  */
    /* JADX WARN: Code duplicated, block: B:226:0x0632  */
    /* JADX WARN: Code duplicated, block: B:231:0x0643  */
    /* JADX WARN: Code duplicated, block: B:232:0x0646  */
    /* JADX WARN: Code duplicated, block: B:235:0x064c  */
    /* JADX WARN: Code duplicated, block: B:238:0x0678  */
    /* JADX WARN: Code duplicated, block: B:242:0x069f  */
    /* JADX WARN: Code duplicated, block: B:246:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:252:0x06c6  */
    /* JADX WARN: Code duplicated, block: B:256:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:257:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:259:0x0705  */
    /* JADX WARN: Code duplicated, block: B:263:0x071c A[LOOP:7: B:262:0x071a->B:263:0x071c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:266:0x0739  */
    /* JADX WARN: Code duplicated, block: B:297:0x063e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x05fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x060a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x0614 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x062a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x06bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x06ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x06cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x06c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final void m344c(ArrayList arrayList, boolean z) throws Throwable {
        int i;
        int i2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        HashMap map;
        C0061y c0061y;
        int i3;
        zs1 zs1Var;
        ArrayList arrayList4;
        int i4;
        C0061y c0061y2;
        Object obj;
        Object obj2;
        ArrayList arrayList5;
        View view;
        View view2;
        int i5;
        HashMap map2;
        View view3;
        int i6;
        Object obj3;
        View view4;
        View view5;
        boolean zContainsValue;
        Context context;
        ArrayList arrayList6;
        int size;
        int i7;
        int i8;
        ViewGroup viewGroup;
        boolean z2;
        ArrayList arrayList7;
        int size2;
        int i9;
        int size3;
        int i10;
        C0040d c0040d;
        C0061y c0061y3;
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l;
        View view6;
        Animation animation;
        int i11;
        C0040d c0040d2;
        boolean z3;
        C0558d8 c0558d8M335c;
        Animator animator;
        C0061y c0061y4;
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l2;
        boolean z4;
        ArrayList arrayList8;
        int size4 = arrayList.size();
        int i12 = 0;
        C0061y c0061y5 = null;
        C0061y c0061y6 = null;
        while (true) {
            i = 2;
            i2 = 1;
            if (i12 >= size4) {
                break;
            }
            Object obj4 = arrayList.get(i12);
            i12++;
            C0061y c0061y7 = (C0061y) obj4;
            int iM3605c = jd0.m3605c(c0061y7.f769c.mView);
            int iM5359z = AbstractC1308pu.m5359z(c0061y7.f767a);
            if (iM5359z != 0) {
                if (iM5359z != 1) {
                    if (iM5359z == 2 || iM5359z == 3) {
                    }
                } else if (iM3605c != 2) {
                    c0061y6 = c0061y7;
                }
            }
            if (iM3605c == 2 && c0061y5 == null) {
                c0061y5 = c0061y7;
            }
        }
        if (AbstractC0056t.m363G(2)) {
            Objects.toString(c0061y5);
            Objects.toString(c0061y6);
        }
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList(arrayList);
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l3 = ((C0061y) arrayList.get(arrayList.size() - 1)).f769c;
        int size5 = arrayList.size();
        int i13 = 0;
        while (i13 < size5) {
            Object obj5 = arrayList.get(i13);
            i13++;
            int i14 = i2;
            re0 re0Var = ((C0061y) obj5).f769c.mAnimationInfo;
            int i15 = i;
            re0 re0Var2 = abstractComponentCallbacksC0048l3.mAnimationInfo;
            re0Var.f9916b = re0Var2.f9916b;
            re0Var.f9917c = re0Var2.f9917c;
            re0Var.f9918d = re0Var2.f9918d;
            re0Var.f9919e = re0Var2.f9919e;
            i = i15;
            i2 = i14;
        }
        int i16 = i;
        int i17 = i2;
        int size6 = arrayList.size();
        int i18 = 0;
        while (i18 < size6) {
            Object obj6 = arrayList.get(i18);
            i18++;
            C0061y c0061y8 = (C0061y) obj6;
            C1112ml c1112ml = new C1112ml();
            c0061y8.m443d();
            HashSet hashSet = c0061y8.f771e;
            hashSet.add(c1112ml);
            C0040d c0040d3 = new C0040d(c0061y8, c1112ml);
            c0040d3.f678d = false;
            c0040d3.f677c = z;
            arrayList9.add(c0040d3);
            C1112ml c1112ml2 = new C1112ml();
            c0061y8.m443d();
            hashSet.add(c1112ml2);
            arrayList10.add(new m00(c0061y8, c1112ml2, z, (!z ? c0061y8 == c0061y6 : c0061y8 == c0061y5) ? 0 : i17));
            c0061y8.f770d.add(new RunnableC0039c(this, arrayList11, c0061y8));
        }
        HashMap map3 = new HashMap();
        int size7 = arrayList10.size();
        int i19 = 0;
        xf0 xf0Var = null;
        while (i19 < size7) {
            Object obj7 = arrayList10.get(i19);
            i19++;
            m00 m00Var = (m00) obj7;
            boolean zM337b = m00Var.m337b();
            AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l4 = m00Var.f680a.f769c;
            Object obj8 = m00Var.f6576c;
            if (!zM337b) {
                xf0 xf0VarM4341c = m00Var.m4341c(obj8);
                Object obj9 = m00Var.f6578e;
                xf0 xf0VarM4341c2 = m00Var.m4341c(obj9);
                int i20 = size7;
                if (xf0VarM4341c != null && xf0VarM4341c2 != null && xf0VarM4341c != xf0VarM4341c2) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + abstractComponentCallbacksC0048l4 + " returned Transition " + obj8 + " which uses a different Transition  type than its shared element transition " + obj9);
                }
                if (xf0VarM4341c == null) {
                    xf0VarM4341c = xf0VarM4341c2;
                }
                if (xf0Var == null) {
                    xf0Var = xf0VarM4341c;
                } else if (xf0VarM4341c != null && xf0Var != xf0VarM4341c) {
                    ca0.m1182n("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ", abstractComponentCallbacksC0048l4, " returned Transition ", obj8, " which uses a different Transition  type than other Fragments.");
                    return;
                }
                size7 = i20;
                i19 = i19;
            }
        }
        ViewGroup viewGroup2 = this.f682a;
        if (xf0Var == null) {
            int size8 = arrayList10.size();
            int i21 = 0;
            while (i21 < size8) {
                Object obj10 = arrayList10.get(i21);
                i21++;
                m00 m00Var2 = (m00) obj10;
                map3.put(m00Var2.f680a, Boolean.FALSE);
                m00Var2.m336a();
            }
            map = map3;
            arrayList2 = arrayList9;
            c0061y = c0061y6;
            arrayList3 = arrayList11;
        } else {
            View view7 = new View(viewGroup2.getContext());
            Rect rect = new Rect();
            ArrayList arrayList12 = new ArrayList();
            ArrayList arrayList13 = new ArrayList();
            C0633fa c0633fa = new C0633fa();
            int size9 = arrayList10.size();
            arrayList2 = arrayList9;
            int i22 = 0;
            Object obj11 = null;
            int i23 = 0;
            View view8 = null;
            while (i22 < size9) {
                Object obj12 = arrayList10.get(i22);
                int i24 = i22 + 1;
                Object obj13 = ((m00) obj12).f6578e;
                if (obj13 == null || c0061y5 == null) {
                    i5 = size9;
                } else {
                    i5 = size9;
                    AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l5 = c0061y5.f769c;
                    if (c0061y6 != null) {
                        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l6 = c0061y6.f769c;
                        Object objMo987r = xf0Var.mo987r(xf0Var.mo978f(obj13));
                        arrayList11 = arrayList11;
                        ArrayList<String> sharedElementSourceNames = abstractComponentCallbacksC0048l6.getSharedElementSourceNames();
                        arrayList10 = arrayList10;
                        ArrayList<String> sharedElementSourceNames2 = abstractComponentCallbacksC0048l5.getSharedElementSourceNames();
                        HashMap map4 = map3;
                        ArrayList<String> sharedElementTargetNames = abstractComponentCallbacksC0048l5.getSharedElementTargetNames();
                        View view9 = view7;
                        Rect rect2 = rect;
                        int i25 = 0;
                        while (i25 < sharedElementTargetNames.size()) {
                            int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i25));
                            ArrayList<String> arrayList14 = sharedElementTargetNames;
                            if (iIndexOf != -1) {
                                sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i25));
                            }
                            i25++;
                            sharedElementTargetNames = arrayList14;
                        }
                        ArrayList<String> sharedElementTargetNames2 = abstractComponentCallbacksC0048l6.getSharedElementTargetNames();
                        if (z) {
                            abstractComponentCallbacksC0048l5.getEnterTransitionCallback();
                            abstractComponentCallbacksC0048l6.getExitTransitionCallback();
                        } else {
                            abstractComponentCallbacksC0048l5.getExitTransitionCallback();
                            abstractComponentCallbacksC0048l6.getEnterTransitionCallback();
                        }
                        int i26 = 0;
                        for (int size10 = sharedElementSourceNames.size(); i26 < size10; size10 = size10) {
                            c0633fa.put(sharedElementSourceNames.get(i26), sharedElementTargetNames2.get(i26));
                            i26++;
                        }
                        if (AbstractC0056t.m363G(i16)) {
                            int size11 = sharedElementTargetNames2.size();
                            for (int i27 = 0; i27 < size11; i27++) {
                                sharedElementTargetNames2.get(i27);
                            }
                            int size12 = sharedElementSourceNames.size();
                            for (int i28 = 0; i28 < size12; i28++) {
                                sharedElementSourceNames.get(i28);
                            }
                        }
                        C0633fa c0633fa2 = new C0633fa();
                        m339e(c0633fa2, abstractComponentCallbacksC0048l5.mView);
                        c0633fa2.m2779k(sharedElementSourceNames);
                        c0633fa.m2779k(c0633fa2.keySet());
                        C0633fa c0633fa3 = new C0633fa();
                        m339e(c0633fa3, abstractComponentCallbacksC0048l6.mView);
                        c0633fa3.m2779k(sharedElementTargetNames2);
                        c0633fa3.m2779k(c0633fa.values());
                        vf0 vf0Var = qf0.f9494a;
                        int i29 = c0633fa.f13557c - 1;
                        while (i29 >= 0) {
                            AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l7 = abstractComponentCallbacksC0048l5;
                            if (!c0633fa3.containsKey((String) c0633fa.m7352j(i29))) {
                                c0633fa.m7351i(i29);
                            }
                            i29--;
                            abstractComponentCallbacksC0048l5 = abstractComponentCallbacksC0048l7;
                        }
                        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l8 = abstractComponentCallbacksC0048l5;
                        m342k(c0633fa2, c0633fa.keySet());
                        m342k(c0633fa3, c0633fa.values());
                        if (c0633fa.isEmpty()) {
                            arrayList12.clear();
                            arrayList13.clear();
                            arrayList13 = arrayList13;
                            view3 = view9;
                            rect = rect2;
                            map2 = map4;
                            obj11 = null;
                        } else {
                            if (z) {
                                abstractComponentCallbacksC0048l8.getEnterTransitionCallback();
                            } else {
                                abstractComponentCallbacksC0048l6.getEnterTransitionCallback();
                            }
                            bb1.m958a(viewGroup2, new l00(c0061y6, c0061y5, z, c0633fa3));
                            arrayList12.addAll(c0633fa2.values());
                            if (sharedElementSourceNames.isEmpty()) {
                                i6 = 0;
                                obj3 = null;
                                view4 = view8;
                            } else {
                                i6 = 0;
                                obj3 = null;
                                view4 = (View) c0633fa2.getOrDefault(sharedElementSourceNames.get(0), null);
                                xf0Var.mo983m(view4, objMo987r);
                            }
                            arrayList13.addAll(c0633fa3.values());
                            if (sharedElementTargetNames2.isEmpty() || (view5 = (View) c0633fa3.getOrDefault(sharedElementTargetNames2.get(i6), obj3)) == null) {
                                rect = rect2;
                            } else {
                                rect = rect2;
                                bb1.m958a(viewGroup2, new RunnableC1466u3(xf0Var, view5, rect));
                                i23 = i17;
                            }
                            view3 = view9;
                            xf0Var.mo985p(objMo987r, view3, arrayList12);
                            ArrayList arrayList15 = arrayList13;
                            xf0Var.mo982l(objMo987r, null, null, objMo987r, arrayList15);
                            arrayList13 = arrayList15;
                            Boolean bool = Boolean.TRUE;
                            map2 = map4;
                            map2.put(c0061y5, bool);
                            map2.put(c0061y6, bool);
                            view8 = view4;
                            obj11 = objMo987r;
                        }
                    }
                    size9 = i5;
                    view7 = view3;
                    arrayList13 = arrayList13;
                    map3 = map2;
                    arrayList10 = arrayList10;
                    arrayList11 = arrayList11;
                    i22 = i24;
                }
                map2 = map3;
                view3 = view7;
                size9 = i5;
                view7 = view3;
                arrayList13 = arrayList13;
                map3 = map2;
                arrayList10 = arrayList10;
                arrayList11 = arrayList11;
                i22 = i24;
            }
            ArrayList arrayList16 = arrayList10;
            ArrayList arrayList17 = arrayList13;
            arrayList3 = arrayList11;
            map = map3;
            View view10 = view7;
            ArrayList arrayList18 = new ArrayList();
            int size13 = arrayList16.size();
            zs1 zs1Var2 = c0633fa;
            Object objMo980j = null;
            Object objMo980j2 = null;
            int i30 = 0;
            while (i30 < size13) {
                ArrayList arrayList19 = arrayList16;
                size13 = size13;
                m00 m00Var3 = (m00) arrayList19.get(i30);
                boolean zM337b2 = m00Var3.m337b();
                i30++;
                C0061y c0061y9 = m00Var3.f680a;
                if (zM337b2) {
                    map.put(c0061y9, Boolean.FALSE);
                    m00Var3.m336a();
                    arrayList16 = arrayList19;
                } else {
                    Object objMo978f = xf0Var.mo978f(m00Var3.f6576c);
                    int i31 = (obj11 == null || !(c0061y9 == c0061y5 || c0061y9 == c0061y6)) ? 0 : i17;
                    if (objMo978f == null) {
                        if (i31 == 0) {
                            map.put(c0061y9, Boolean.FALSE);
                            m00Var3.m336a();
                        }
                        view = view10;
                        c0061y2 = c0061y6;
                        obj = obj11;
                        view2 = view8;
                    } else {
                        c0061y2 = c0061y6;
                        ArrayList arrayList20 = new ArrayList();
                        obj = obj11;
                        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l9 = c0061y9.f769c;
                        Object obj14 = objMo980j2;
                        m338a(arrayList20, abstractComponentCallbacksC0048l9.mView);
                        if (i31 != 0) {
                            if (c0061y9 == c0061y5) {
                                arrayList20.removeAll(arrayList12);
                            } else {
                                arrayList20.removeAll(arrayList17);
                            }
                        }
                        if (arrayList20.isEmpty()) {
                            xf0Var.mo974a(view10, objMo978f);
                            view = view10;
                            arrayList5 = arrayList20;
                            obj2 = objMo978f;
                        } else {
                            xf0Var.mo975b(objMo978f, arrayList20);
                            xf0Var.mo982l(objMo978f, objMo978f, arrayList20, null, null);
                            obj2 = objMo978f;
                            arrayList5 = arrayList20;
                            view = view10;
                            if (c0061y9.f767a == 3) {
                                arrayList3.remove(c0061y9);
                                ArrayList arrayList21 = new ArrayList(arrayList5);
                                arrayList21.remove(abstractComponentCallbacksC0048l9.mView);
                                xf0Var.mo981k(obj2, abstractComponentCallbacksC0048l9.mView, arrayList21);
                                bb1.m958a(viewGroup2, new RunnableC1621ya(arrayList5, 5));
                            }
                        }
                        if (c0061y9.f767a == i16) {
                            arrayList18.addAll(arrayList5);
                            if (i23 != 0) {
                                xf0Var.mo984n(obj2, rect);
                            }
                            view2 = view8;
                        } else {
                            view2 = view8;
                            xf0Var.mo983m(view2, obj2);
                        }
                        map.put(c0061y9, Boolean.TRUE);
                        if (m00Var3.f6577d) {
                            objMo980j = xf0Var.mo980j(objMo980j, obj2);
                            objMo980j2 = obj14;
                        } else {
                            objMo980j2 = xf0Var.mo980j(obj14, obj2);
                        }
                    }
                    view8 = view2;
                    view10 = view;
                    arrayList16 = arrayList19;
                    obj11 = obj;
                    c0061y6 = c0061y2;
                    i16 = 2;
                }
            }
            C0061y c0061y10 = c0061y6;
            ArrayList arrayList22 = arrayList16;
            Object objMo979i = xf0Var.mo979i(objMo980j, objMo980j2, obj11);
            if (objMo979i != null) {
                int size14 = arrayList22.size();
                int i32 = 0;
                while (i32 < size14) {
                    arrayList22 = arrayList22;
                    Object obj15 = arrayList22.get(i32);
                    i32++;
                    m00 m00Var4 = (m00) obj15;
                    boolean zM337b3 = m00Var4.m337b();
                    C0061y c0061y11 = m00Var4.f680a;
                    if (!zM337b3) {
                        Object obj16 = m00Var4.f6576c;
                        C0061y c0061y12 = c0061y10;
                        int i33 = (obj11 == null || !(c0061y11 == c0061y5 || c0061y11 == c0061y12)) ? 0 : i17;
                        if (obj16 != null || i33 != 0) {
                            WeakHashMap weakHashMap = i72.f4849a;
                            if (v62.m6587c(viewGroup2)) {
                                xf0Var.mo6623o(objMo979i, new RunnableC1466u3(m00Var4, c0061y11, 5, false));
                            } else {
                                if (AbstractC0056t.m363G(2)) {
                                    Objects.toString(viewGroup2);
                                    Objects.toString(c0061y11);
                                }
                                m00Var4.m336a();
                            }
                        }
                        i32 = i32;
                        size14 = size14;
                        c0061y10 = c0061y12;
                    }
                }
                c0061y = c0061y10;
                WeakHashMap weakHashMap2 = i72.f4849a;
                if (v62.m6587c(viewGroup2)) {
                    qf0.m5487a(4, arrayList18);
                    ArrayList arrayList23 = new ArrayList();
                    int size15 = arrayList17.size();
                    for (int i34 = 0; i34 < size15; i34++) {
                        View view11 = (View) arrayList17.get(i34);
                        WeakHashMap weakHashMap3 = i72.f4849a;
                        arrayList23.add(y62.m7010k(view11));
                        y62.m7021v(view11, null);
                    }
                    if (AbstractC0056t.m363G(2)) {
                        int size16 = arrayList12.size();
                        int i35 = 0;
                        while (i35 < size16) {
                            Object obj17 = arrayList12.get(i35);
                            i35++;
                            View view12 = (View) obj17;
                            Objects.toString(view12);
                            y62.m7010k(view12);
                        }
                        int size17 = arrayList17.size();
                        int i36 = 0;
                        while (i36 < size17) {
                            Object obj18 = arrayList17.get(i36);
                            i36++;
                            View view13 = (View) obj18;
                            Objects.toString(view13);
                            y62.m7010k(view13);
                        }
                    }
                    xf0Var.mo976c(viewGroup2, objMo979i);
                    int size18 = arrayList17.size();
                    ArrayList arrayList24 = new ArrayList();
                    int i37 = 0;
                    while (i37 < size18) {
                        View view14 = (View) arrayList12.get(i37);
                        WeakHashMap weakHashMap4 = i72.f4849a;
                        String strM7010k = y62.m7010k(view14);
                        arrayList24.add(strM7010k);
                        if (strM7010k == null) {
                            zs1Var = zs1Var2;
                            i4 = size18;
                            arrayList4 = arrayList24;
                        } else {
                            y62.m7021v(view14, null);
                            zs1Var = zs1Var2;
                            String str = (String) zs1Var.getOrDefault(strM7010k, null);
                            arrayList4 = arrayList24;
                            int i38 = 0;
                            while (true) {
                                i4 = size18;
                                if (i38 >= size18) {
                                    break;
                                }
                                if (str.equals(arrayList23.get(i38))) {
                                    y62.m7021v((View) arrayList17.get(i38), strM7010k);
                                    break;
                                } else {
                                    i38++;
                                    size18 = i4;
                                }
                            }
                        }
                        i37++;
                        zs1Var2 = zs1Var;
                        size18 = i4;
                        arrayList24 = arrayList4;
                    }
                    bb1.m958a(viewGroup2, new wf0(size18, arrayList17, arrayList23, arrayList12, arrayList24));
                    i3 = 0;
                    qf0.m5487a(0, arrayList18);
                    xf0Var.mo986q(obj11, arrayList12, arrayList17);
                }
                zContainsValue = map.containsValue(Boolean.TRUE);
                context = viewGroup2.getContext();
                arrayList6 = new ArrayList();
                size = arrayList2.size();
                i7 = i3;
                i8 = i7;
                while (i8 < size) {
                    arrayList2 = arrayList2;
                    Object obj19 = arrayList2.get(i8);
                    i8++;
                    c0040d2 = (C0040d) obj19;
                    if (c0040d2.m337b()) {
                        c0040d2.m336a();
                    } else {
                        c0558d8M335c = c0040d2.m335c(context);
                        if (c0558d8M335c == null) {
                            c0040d2.m336a();
                        } else {
                            animator = (Animator) c0558d8M335c.f2822c;
                            if (animator == null) {
                                arrayList6.add(c0040d2);
                            } else {
                                c0061y4 = c0040d2.f680a;
                                abstractComponentCallbacksC0048l2 = c0061y4.f769c;
                                z3 = zContainsValue;
                                if (Boolean.TRUE.equals(map.get(c0061y4))) {
                                    if (AbstractC0056t.m363G(2)) {
                                        Objects.toString(abstractComponentCallbacksC0048l2);
                                    }
                                    c0040d2.m336a();
                                    zContainsValue = z3;
                                } else {
                                    if (c0061y4.f767a == 3) {
                                        z4 = i17;
                                    } else {
                                        z4 = 0;
                                    }
                                    arrayList8 = arrayList3;
                                    if (z4 != 0) {
                                        arrayList8.remove(c0061y4);
                                    }
                                    View view15 = abstractComponentCallbacksC0048l2.mView;
                                    viewGroup2.startViewTransition(view15);
                                    ViewGroup viewGroup3 = viewGroup2;
                                    animator.addListener(new j00(viewGroup3, view15, z4, c0061y4, c0040d2));
                                    animator.setTarget(view15);
                                    animator.start();
                                    if (AbstractC0056t.m363G(2)) {
                                        c0061y4.toString();
                                    }
                                    c0040d2.f681b.m4429a(new C0558d8(18, animator, c0061y4));
                                    arrayList3 = arrayList8;
                                    viewGroup2 = viewGroup3;
                                    i7 = i17;
                                    zContainsValue = z3;
                                }
                            }
                        }
                    }
                    z3 = zContainsValue;
                    zContainsValue = z3;
                }
                viewGroup = viewGroup2;
                z2 = zContainsValue;
                arrayList7 = arrayList3;
                size2 = arrayList6.size();
                i9 = 0;
                while (i9 < size2) {
                    Object obj20 = arrayList6.get(i9);
                    i9++;
                    c0040d = (C0040d) obj20;
                    c0061y3 = c0040d.f680a;
                    abstractComponentCallbacksC0048l = c0061y3.f769c;
                    if (z2) {
                        if (AbstractC0056t.m363G(2)) {
                            Objects.toString(abstractComponentCallbacksC0048l);
                        }
                        c0040d.m336a();
                    } else if (i7 != 0) {
                        if (AbstractC0056t.m363G(2)) {
                            Objects.toString(abstractComponentCallbacksC0048l);
                        }
                        c0040d.m336a();
                    } else {
                        view6 = abstractComponentCallbacksC0048l.mView;
                        C0558d8 c0558d8M335c2 = c0040d.m335c(context);
                        c0558d8M335c2.getClass();
                        animation = (Animation) c0558d8M335c2.f2821b;
                        animation.getClass();
                        i11 = i17;
                        if (c0061y3.f767a != i11) {
                            view6.startAnimation(animation);
                            c0040d.m336a();
                        } else {
                            viewGroup.startViewTransition(view6);
                            ue0 ue0Var = new ue0(animation, viewGroup, view6);
                            ue0Var.setAnimationListener(new k00(c0061y3, viewGroup, view6, c0040d));
                            view6.startAnimation(ue0Var);
                            if (AbstractC0056t.m363G(2)) {
                                c0061y3.toString();
                            }
                        }
                        c0040d.f681b.m4429a(new C0599ed(view6, viewGroup, c0040d, c0061y3));
                        i17 = i11;
                    }
                }
                size3 = arrayList7.size();
                i10 = 0;
                while (i10 < size3) {
                    Object obj21 = arrayList7.get(i10);
                    i10++;
                    C0061y c0061y13 = (C0061y) obj21;
                    jd0.m3603a(c0061y13.f769c.mView, c0061y13.f767a);
                }
                arrayList7.clear();
                if (AbstractC0056t.m363G(2)) {
                    Objects.toString(c0061y5);
                    Objects.toString(c0061y);
                }
            }
            c0061y = c0061y10;
        }
        i3 = 0;
        zContainsValue = map.containsValue(Boolean.TRUE);
        context = viewGroup2.getContext();
        arrayList6 = new ArrayList();
        size = arrayList2.size();
        i7 = i3;
        i8 = i7;
        while (i8 < size) {
            arrayList2 = arrayList2;
            Object obj110 = arrayList2.get(i8);
            i8++;
            c0040d2 = (C0040d) obj110;
            if (c0040d2.m337b()) {
                c0040d2.m336a();
            } else {
                c0558d8M335c = c0040d2.m335c(context);
                if (c0558d8M335c == null) {
                    c0040d2.m336a();
                } else {
                    animator = (Animator) c0558d8M335c.f2822c;
                    if (animator == null) {
                        arrayList6.add(c0040d2);
                    } else {
                        c0061y4 = c0040d2.f680a;
                        abstractComponentCallbacksC0048l2 = c0061y4.f769c;
                        z3 = zContainsValue;
                        if (Boolean.TRUE.equals(map.get(c0061y4))) {
                            if (AbstractC0056t.m363G(2)) {
                                Objects.toString(abstractComponentCallbacksC0048l2);
                            }
                            c0040d2.m336a();
                            zContainsValue = z3;
                        } else {
                            if (c0061y4.f767a == 3) {
                                z4 = i17;
                            } else {
                                z4 = 0;
                            }
                            arrayList8 = arrayList3;
                            if (z4 != 0) {
                                arrayList8.remove(c0061y4);
                            }
                            View view16 = abstractComponentCallbacksC0048l2.mView;
                            viewGroup2.startViewTransition(view16);
                            ViewGroup viewGroup4 = viewGroup2;
                            animator.addListener(new j00(viewGroup4, view16, z4, c0061y4, c0040d2));
                            animator.setTarget(view16);
                            animator.start();
                            if (AbstractC0056t.m363G(2)) {
                                c0061y4.toString();
                            }
                            c0040d2.f681b.m4429a(new C0558d8(18, animator, c0061y4));
                            arrayList3 = arrayList8;
                            viewGroup2 = viewGroup4;
                            i7 = i17;
                            zContainsValue = z3;
                        }
                    }
                }
            }
            z3 = zContainsValue;
            zContainsValue = z3;
        }
        viewGroup = viewGroup2;
        z2 = zContainsValue;
        arrayList7 = arrayList3;
        size2 = arrayList6.size();
        i9 = 0;
        while (i9 < size2) {
            Object obj22 = arrayList6.get(i9);
            i9++;
            c0040d = (C0040d) obj22;
            c0061y3 = c0040d.f680a;
            abstractComponentCallbacksC0048l = c0061y3.f769c;
            if (z2) {
                if (AbstractC0056t.m363G(2)) {
                    Objects.toString(abstractComponentCallbacksC0048l);
                }
                c0040d.m336a();
            } else if (i7 != 0) {
                if (AbstractC0056t.m363G(2)) {
                    Objects.toString(abstractComponentCallbacksC0048l);
                }
                c0040d.m336a();
            } else {
                view6 = abstractComponentCallbacksC0048l.mView;
                C0558d8 c0558d8M335c3 = c0040d.m335c(context);
                c0558d8M335c3.getClass();
                animation = (Animation) c0558d8M335c3.f2821b;
                animation.getClass();
                i11 = i17;
                if (c0061y3.f767a != i11) {
                    view6.startAnimation(animation);
                    c0040d.m336a();
                } else {
                    viewGroup.startViewTransition(view6);
                    ue0 ue0Var2 = new ue0(animation, viewGroup, view6);
                    ue0Var2.setAnimationListener(new k00(c0061y3, viewGroup, view6, c0040d));
                    view6.startAnimation(ue0Var2);
                    if (AbstractC0056t.m363G(2)) {
                        c0061y3.toString();
                    }
                }
                c0040d.f681b.m4429a(new C0599ed(view6, viewGroup, c0040d, c0061y3));
                i17 = i11;
            }
        }
        size3 = arrayList7.size();
        i10 = 0;
        while (i10 < size3) {
            Object obj23 = arrayList7.get(i10);
            i10++;
            C0061y c0061y14 = (C0061y) obj23;
            jd0.m3603a(c0061y14.f769c.mView, c0061y14.f767a);
        }
        arrayList7.clear();
        if (AbstractC0056t.m363G(2)) {
            Objects.toString(c0061y5);
            Objects.toString(c0061y);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m345d() {
        if (this.f686e) {
            return;
        }
        ViewGroup viewGroup = this.f682a;
        WeakHashMap weakHashMap = i72.f4849a;
        if (!v62.m6586b(viewGroup)) {
            m347g();
            this.f685d = false;
            return;
        }
        synchronized (this.f683b) {
            try {
                if (!this.f683b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f684c);
                    this.f684c.clear();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        C0061y c0061y = (C0061y) obj;
                        if (AbstractC0056t.m363G(2)) {
                            Objects.toString(c0061y);
                        }
                        c0061y.m440a();
                        if (!c0061y.f773g) {
                            this.f684c.add(c0061y);
                        }
                    }
                    m349l();
                    ArrayList arrayList2 = new ArrayList(this.f683b);
                    this.f683b.clear();
                    this.f684c.addAll(arrayList2);
                    AbstractC0056t.m363G(2);
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        ((C0061y) obj2).m443d();
                    }
                    m344c(arrayList2, this.f685d);
                    this.f685d = false;
                    AbstractC0056t.m363G(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final C0061y m346f(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l) {
        ArrayList arrayList = this.f683b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C0061y c0061y = (C0061y) obj;
            if (c0061y.f769c.equals(abstractComponentCallbacksC0048l) && !c0061y.f772f) {
                return c0061y;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m347g() {
        AbstractC0056t.m363G(2);
        ViewGroup viewGroup = this.f682a;
        WeakHashMap weakHashMap = i72.f4849a;
        boolean zM6586b = v62.m6586b(viewGroup);
        synchronized (this.f683b) {
            try {
                m349l();
                ArrayList arrayList = this.f683b;
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((C0061y) obj).m443d();
                }
                ArrayList arrayList2 = new ArrayList(this.f684c);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    C0061y c0061y = (C0061y) obj2;
                    if (AbstractC0056t.m363G(2)) {
                        if (!zM6586b) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Container ");
                            sb.append(this.f682a);
                            sb.append(" is not attached to window. ");
                        }
                        Objects.toString(c0061y);
                    }
                    c0061y.m440a();
                }
                ArrayList arrayList3 = new ArrayList(this.f683b);
                int size3 = arrayList3.size();
                while (i < size3) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    C0061y c0061y2 = (C0061y) obj3;
                    if (AbstractC0056t.m363G(2)) {
                        if (!zM6586b) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Container ");
                            sb2.append(this.f682a);
                            sb2.append(" is not attached to window. ");
                        }
                        Objects.toString(c0061y2);
                    }
                    c0061y2.m440a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m348j() {
        synchronized (this.f683b) {
            try {
                m349l();
                this.f686e = false;
                for (int size = this.f683b.size() - 1; size >= 0; size--) {
                    C0061y c0061y = (C0061y) this.f683b.get(size);
                    int iM3605c = jd0.m3605c(c0061y.f769c.mView);
                    if (c0061y.f767a == 2 && iM3605c != 2) {
                        this.f686e = c0061y.f769c.isPostponed();
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m349l() {
        ArrayList arrayList = this.f683b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C0061y c0061y = (C0061y) obj;
            if (c0061y.f768b == 2) {
                c0061y.m442c(jd0.m3604b(c0061y.f769c.requireView().getVisibility()), 1);
            }
        }
    }
}

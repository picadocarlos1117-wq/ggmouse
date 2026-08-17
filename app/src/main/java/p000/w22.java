package p000;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class w22 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public t22 f11935a;

    /* JADX INFO: renamed from: b */
    public ViewGroup f11936b;

    /* JADX WARN: Code duplicated, block: B:103:0x0220  */
    /* JADX WARN: Code duplicated, block: B:105:0x022e  */
    /* JADX WARN: Code duplicated, block: B:109:0x024c  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:138:0x01f8 A[EDGE_INSN: B:138:0x01f8->B:93:0x01f8 BREAK  A[LOOP:1: B:18:0x0085->B:92:0x01ef], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    /* JADX WARN: Code duplicated, block: B:166:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x0239 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0054 A[LOOP:0: B:15:0x0052->B:16:0x0054, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x008a  */
    /* JADX WARN: Code duplicated, block: B:22:0x008e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0091  */
    /* JADX WARN: Code duplicated, block: B:26:0x0094  */
    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:49:0x0101  */
    /* JADX WARN: Code duplicated, block: B:51:0x0114  */
    /* JADX WARN: Code duplicated, block: B:63:0x015a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0161  */
    /* JADX WARN: Code duplicated, block: B:67:0x0171  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:82:0x01be  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:98:0x020d  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i;
        C0599ed c0599ed;
        C0599ed c0599ed2;
        C0633fa c0633fa;
        C0633fa c0633fa2;
        int i2;
        int[] iArr;
        boolean z;
        int i3;
        int i4;
        C0633fa c0633faM6195p;
        int i5;
        Animator animator;
        r22 r22Var;
        View view;
        z22 z22Var;
        z22 z22Var2;
        int i6;
        C0599ed c0599ed3;
        boolean z2;
        int i7;
        View view2;
        z22 z22Var3;
        C0633fa c0633fa3;
        int i8;
        int i9;
        View view3;
        View view4;
        SparseArray sparseArray;
        int size;
        int i10;
        View view5;
        View view6;
        ew0 ew0Var;
        int iM2649e;
        int i11;
        View view7;
        C0599ed c0599ed4;
        int size2;
        int i12;
        t22 t22Var = this.f11935a;
        ViewGroup viewGroup = this.f11936b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z3 = true;
        if (!x22.f12435c.remove(viewGroup)) {
            return true;
        }
        C0633fa c0633faM6863b = x22.m6863b();
        ArrayList arrayList2 = (ArrayList) c0633faM6863b.getOrDefault(viewGroup, null);
        if (arrayList2 != null) {
            arrayList = arrayList2.size() > 0 ? new ArrayList(arrayList2) : null;
            arrayList2.add(t22Var);
            t22Var.m6205a(new v22(this, c0633faM6863b));
            i = 0;
            t22Var.m6209h(viewGroup, false);
            if (arrayList != null) {
                size2 = arrayList.size();
                i12 = 0;
                while (i12 < size2) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    ((t22) obj).mo6220y(viewGroup);
                }
            }
            t22Var.f10723p = new ArrayList();
            t22Var.f10724q = new ArrayList();
            c0599ed = t22Var.f10719g;
            c0599ed2 = t22Var.f10720m;
            c0633fa = new C0633fa((C0633fa) c0599ed.f3313a);
            c0633fa2 = new C0633fa((C0633fa) c0599ed2.f3313a);
            i2 = 0;
            while (true) {
                iArr = t22Var.f10722o;
                if (i2 < iArr.length) {
                    break;
                }
                i6 = iArr[i2];
                if (i6 != z3) {
                    c0599ed3 = c0599ed2;
                    z2 = z3;
                    for (i7 = c0633fa.f13557c - 1; i7 >= 0; i7--) {
                        view2 = (View) c0633fa.m7350h(i7);
                        if (view2 == null && t22Var.m6216t(view2) && (z22Var3 = (z22) c0633fa2.remove(view2)) != null && t22Var.m6216t(z22Var3.f13248b)) {
                            t22Var.f10723p.add((z22) c0633fa.m7351i(i7));
                            t22Var.f10724q.add(z22Var3);
                        }
                    }
                } else if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 == 4) {
                            ew0Var = (ew0) c0599ed.f3315c;
                            ew0 ew0Var2 = (ew0) c0599ed2.f3315c;
                            iM2649e = ew0Var.m2649e();
                            i11 = i;
                            while (i11 < iM2649e) {
                                view7 = (View) ew0Var.m2650f(i11);
                                if (view7 == null && t22Var.m6216t(view7)) {
                                    if (ew0Var.f3455a) {
                                        ew0Var.m2646b();
                                    }
                                    c0599ed4 = c0599ed2;
                                    View view8 = (View) ew0Var2.m2647c(ew0Var.f3456b[i11]);
                                    if (view8 != null && t22Var.m6216t(view8)) {
                                        z22 z22Var4 = (z22) c0633fa.getOrDefault(view7, null);
                                        z22 z22Var5 = (z22) c0633fa2.getOrDefault(view8, null);
                                        if (z22Var4 != null && z22Var5 != null) {
                                            t22Var.f10723p.add(z22Var4);
                                            t22Var.f10724q.add(z22Var5);
                                            c0633fa.remove(view7);
                                            c0633fa2.remove(view8);
                                        }
                                    }
                                } else {
                                    c0599ed4 = c0599ed2;
                                }
                                i11++;
                                c0599ed2 = c0599ed4;
                            }
                        }
                        c0599ed3 = c0599ed2;
                    } else {
                        sparseArray = (SparseArray) c0599ed.f3314b;
                        c0599ed3 = c0599ed2;
                        SparseArray sparseArray2 = (SparseArray) c0599ed3.f3314b;
                        size = sparseArray.size();
                        i10 = 0;
                        while (i10 < size) {
                            view5 = (View) sparseArray.valueAt(i10);
                            if (view5 == null && t22Var.m6216t(view5) && (view6 = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && t22Var.m6216t(view6)) {
                                z22 z22Var6 = (z22) c0633fa.getOrDefault(view5, null);
                                z22 z22Var7 = (z22) c0633fa2.getOrDefault(view6, null);
                                if (z22Var6 != null && z22Var7 != null) {
                                    t22Var.f10723p.add(z22Var6);
                                    t22Var.f10724q.add(z22Var7);
                                    c0633fa.remove(view5);
                                    c0633fa2.remove(view6);
                                }
                            }
                            i10++;
                            z3 = z3;
                        }
                    }
                    z2 = z3;
                } else {
                    c0599ed3 = c0599ed2;
                    z2 = z3;
                    c0633fa3 = (C0633fa) c0599ed.f3316d;
                    C0633fa c0633fa4 = (C0633fa) c0599ed3.f3316d;
                    i8 = c0633fa3.f13557c;
                    for (i9 = 0; i9 < i8; i9++) {
                        view3 = (View) c0633fa3.m7352j(i9);
                        if (view3 == null && t22Var.m6216t(view3) && (view4 = (View) c0633fa4.getOrDefault(c0633fa3.m7350h(i9), null)) != null && t22Var.m6216t(view4)) {
                            z22 z22Var8 = (z22) c0633fa.getOrDefault(view3, null);
                            z22 z22Var9 = (z22) c0633fa2.getOrDefault(view4, null);
                            if (z22Var8 != null && z22Var9 != null) {
                                t22Var.f10723p.add(z22Var8);
                                t22Var.f10724q.add(z22Var9);
                                c0633fa.remove(view3);
                                c0633fa2.remove(view4);
                            }
                        }
                    }
                }
                i2++;
                c0599ed2 = c0599ed3;
                z3 = z2;
                i = 0;
            }
            z = z3;
            for (i3 = 0; i3 < c0633fa.f13557c; i3++) {
                z22Var2 = (z22) c0633fa.m7352j(i3);
                if (t22Var.m6216t(z22Var2.f13248b)) {
                    t22Var.f10723p.add(z22Var2);
                    t22Var.f10724q.add(null);
                }
            }
            for (i4 = 0; i4 < c0633fa2.f13557c; i4++) {
                z22Var = (z22) c0633fa2.m7352j(i4);
                if (t22Var.m6216t(z22Var.f13248b)) {
                    t22Var.f10724q.add(z22Var);
                    t22Var.f10723p.add(null);
                }
            }
            c0633faM6195p = t22.m6195p();
            int i13 = c0633faM6195p.f13557c;
            i82 i82Var = g82.f4100a;
            WindowId windowId = viewGroup.getWindowId();
            i5 = i13 - 1;
            while (i5 >= 0) {
                animator = (Animator) c0633faM6195p.m7350h(i5);
                if (animator == null && (r22Var = (r22) c0633faM6195p.getOrDefault(animator, null)) != null && (view = r22Var.f9660a) != null && r22Var.f9663d.f3304a.equals(windowId)) {
                    z22 z22Var10 = r22Var.f9662c;
                    boolean z4 = z;
                    z22 z22VarM6215r = t22Var.m6215r(view, z4);
                    z22 z22VarM6214o = t22Var.m6214o(view, z4);
                    if (z22VarM6215r == null && z22VarM6214o == null) {
                        z22VarM6214o = (z22) ((C0633fa) t22Var.f10720m.f3313a).getOrDefault(view, null);
                    }
                    if ((z22VarM6215r != null || z22VarM6214o != null) && r22Var.f9664e.mo2562s(z22Var10, z22VarM6214o)) {
                        if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            c0633faM6195p.remove(animator);
                        }
                    }
                }
                i5--;
                z = true;
            }
            t22Var.mo6212m(viewGroup, t22Var.f10719g, t22Var.f10720m, t22Var.f10723p, t22Var.f10724q);
            t22Var.mo6221z();
            return true;
        }
        arrayList2 = new ArrayList();
        c0633faM6863b.put(viewGroup, arrayList2);
        arrayList2.add(t22Var);
        t22Var.m6205a(new v22(this, c0633faM6863b));
        i = 0;
        t22Var.m6209h(viewGroup, false);
        if (arrayList != null) {
            size2 = arrayList.size();
            i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList.get(i12);
                i12++;
                ((t22) obj2).mo6220y(viewGroup);
            }
        }
        t22Var.f10723p = new ArrayList();
        t22Var.f10724q = new ArrayList();
        c0599ed = t22Var.f10719g;
        c0599ed2 = t22Var.f10720m;
        c0633fa = new C0633fa((C0633fa) c0599ed.f3313a);
        c0633fa2 = new C0633fa((C0633fa) c0599ed2.f3313a);
        i2 = 0;
        while (true) {
            iArr = t22Var.f10722o;
            if (i2 < iArr.length) {
                break;
                break;
            }
            i6 = iArr[i2];
            if (i6 != z3) {
                c0599ed3 = c0599ed2;
                z2 = z3;
                while (i7 >= 0) {
                    view2 = (View) c0633fa.m7350h(i7);
                    if (view2 == null) {
                    }
                }
            } else if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 == 4) {
                        ew0Var = (ew0) c0599ed.f3315c;
                        ew0 ew0Var3 = (ew0) c0599ed2.f3315c;
                        iM2649e = ew0Var.m2649e();
                        i11 = i;
                        while (i11 < iM2649e) {
                            view7 = (View) ew0Var.m2650f(i11);
                            if (view7 == null) {
                                c0599ed4 = c0599ed2;
                            } else {
                                c0599ed4 = c0599ed2;
                            }
                            i11++;
                            c0599ed2 = c0599ed4;
                        }
                    }
                    c0599ed3 = c0599ed2;
                } else {
                    sparseArray = (SparseArray) c0599ed.f3314b;
                    c0599ed3 = c0599ed2;
                    SparseArray sparseArray3 = (SparseArray) c0599ed3.f3314b;
                    size = sparseArray.size();
                    i10 = 0;
                    while (i10 < size) {
                        view5 = (View) sparseArray.valueAt(i10);
                        if (view5 == null) {
                        }
                        i10++;
                        z3 = z3;
                    }
                }
                z2 = z3;
            } else {
                c0599ed3 = c0599ed2;
                z2 = z3;
                c0633fa3 = (C0633fa) c0599ed.f3316d;
                C0633fa c0633fa5 = (C0633fa) c0599ed3.f3316d;
                i8 = c0633fa3.f13557c;
                while (i9 < i8) {
                    view3 = (View) c0633fa3.m7352j(i9);
                    if (view3 == null) {
                    }
                }
            }
            i2++;
            c0599ed2 = c0599ed3;
            z3 = z2;
            i = 0;
        }
        z = z3;
        while (i3 < c0633fa.f13557c) {
            z22Var2 = (z22) c0633fa.m7352j(i3);
            if (t22Var.m6216t(z22Var2.f13248b)) {
                t22Var.f10723p.add(z22Var2);
                t22Var.f10724q.add(null);
            }
        }
        while (i4 < c0633fa2.f13557c) {
            z22Var = (z22) c0633fa2.m7352j(i4);
            if (t22Var.m6216t(z22Var.f13248b)) {
                t22Var.f10724q.add(z22Var);
                t22Var.f10723p.add(null);
            }
        }
        c0633faM6195p = t22.m6195p();
        int i14 = c0633faM6195p.f13557c;
        i82 i82Var2 = g82.f4100a;
        WindowId windowId2 = viewGroup.getWindowId();
        i5 = i14 - 1;
        while (i5 >= 0) {
            animator = (Animator) c0633faM6195p.m7350h(i5);
            if (animator == null) {
            }
            i5--;
            z = true;
        }
        t22Var.mo6212m(viewGroup, t22Var.f10719g, t22Var.f10720m, t22Var.f10723p, t22Var.f10724q);
        t22Var.mo6221z();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f11936b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        x22.f12435c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) x22.m6863b().getOrDefault(viewGroup, null);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((t22) obj).mo6220y(viewGroup);
            }
        }
        this.f11935a.m6210i(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}

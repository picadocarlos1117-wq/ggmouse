package p000;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t22 implements Cloneable {

    /* JADX INFO: renamed from: p */
    public ArrayList f10723p;

    /* JADX INFO: renamed from: q */
    public ArrayList f10724q;

    /* JADX INFO: renamed from: x */
    public sc2 f10731x;

    /* JADX INFO: renamed from: z */
    public static final int[] f10712z = {2, 1, 3, 4};

    /* JADX INFO: renamed from: A */
    public static final pu0 f10710A = new pu0(13);

    /* JADX INFO: renamed from: B */
    public static final ThreadLocal f10711B = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final String f10713a = getClass().getName();

    /* JADX INFO: renamed from: b */
    public long f10714b = -1;

    /* JADX INFO: renamed from: c */
    public long f10715c = -1;

    /* JADX INFO: renamed from: d */
    public TimeInterpolator f10716d = null;

    /* JADX INFO: renamed from: e */
    public final ArrayList f10717e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ArrayList f10718f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public C0599ed f10719g = new C0599ed(12);

    /* JADX INFO: renamed from: m */
    public C0599ed f10720m = new C0599ed(12);

    /* JADX INFO: renamed from: n */
    public y22 f10721n = null;

    /* JADX INFO: renamed from: o */
    public final int[] f10722o = f10712z;

    /* JADX INFO: renamed from: r */
    public final ArrayList f10725r = new ArrayList();

    /* JADX INFO: renamed from: s */
    public int f10726s = 0;

    /* JADX INFO: renamed from: t */
    public boolean f10727t = false;

    /* JADX INFO: renamed from: u */
    public boolean f10728u = false;

    /* JADX INFO: renamed from: v */
    public ArrayList f10729v = null;

    /* JADX INFO: renamed from: w */
    public ArrayList f10730w = new ArrayList();

    /* JADX INFO: renamed from: y */
    public pu0 f10732y = f10710A;

    /* JADX INFO: renamed from: c */
    public static void m6194c(C0599ed c0599ed, View view, z22 z22Var) {
        C0633fa c0633fa = (C0633fa) c0599ed.f3313a;
        C0633fa c0633fa2 = (C0633fa) c0599ed.f3316d;
        SparseArray sparseArray = (SparseArray) c0599ed.f3314b;
        ew0 ew0Var = (ew0) c0599ed.f3315c;
        c0633fa.put(view, z22Var);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = i72.f4849a;
        String strM7010k = y62.m7010k(view);
        if (strM7010k != null) {
            if (c0633fa2.containsKey(strM7010k)) {
                c0633fa2.put(strM7010k, null);
            } else {
                c0633fa2.put(strM7010k, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (ew0Var.f3455a) {
                    ew0Var.m2646b();
                }
                if (AbstractC1337qm.m5536f(ew0Var.f3458d, itemIdAtPosition, ew0Var.f3456b) < 0) {
                    s62.m5997r(view, true);
                    ew0Var.m2648d(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) ew0Var.m2647c(itemIdAtPosition);
                if (view2 != null) {
                    s62.m5997r(view2, false);
                    ew0Var.m2648d(itemIdAtPosition, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static C0633fa m6195p() {
        ThreadLocal threadLocal = f10711B;
        C0633fa c0633fa = (C0633fa) threadLocal.get();
        if (c0633fa != null) {
            return c0633fa;
        }
        C0633fa c0633fa2 = new C0633fa();
        threadLocal.set(c0633fa2);
        return c0633fa2;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m6196u(z22 z22Var, z22 z22Var2, String str) {
        Object obj = z22Var.f13247a.get(str);
        Object obj2 = z22Var2.f13247a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* JADX INFO: renamed from: A */
    public void mo6197A(long j) {
        this.f10715c = j;
    }

    /* JADX INFO: renamed from: B */
    public void mo6198B(sc2 sc2Var) {
        this.f10731x = sc2Var;
    }

    /* JADX INFO: renamed from: C */
    public void mo6199C(TimeInterpolator timeInterpolator) {
        this.f10716d = timeInterpolator;
    }

    /* JADX INFO: renamed from: D */
    public void mo6200D(pu0 pu0Var) {
        if (pu0Var == null) {
            this.f10732y = f10710A;
        } else {
            this.f10732y = pu0Var;
        }
    }

    /* JADX INFO: renamed from: F */
    public void mo6202F(long j) {
        this.f10714b = j;
    }

    /* JADX INFO: renamed from: G */
    public final void m6203G() {
        if (this.f10726s == 0) {
            ArrayList arrayList = this.f10729v;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f10729v.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((s22) arrayList2.get(i)).mo150d();
                }
            }
            this.f10728u = false;
        }
        this.f10726s++;
    }

    /* JADX INFO: renamed from: H */
    public String mo6204H(String str) {
        StringBuilder sbM5344k = AbstractC1308pu.m5344k(str);
        sbM5344k.append(getClass().getSimpleName());
        sbM5344k.append("@");
        sbM5344k.append(Integer.toHexString(hashCode()));
        sbM5344k.append(": ");
        String string = sbM5344k.toString();
        if (this.f10715c != -1) {
            StringBuilder sbM5346m = AbstractC1308pu.m5346m(string, "dur(");
            sbM5346m.append(this.f10715c);
            sbM5346m.append(") ");
            string = sbM5346m.toString();
        }
        if (this.f10714b != -1) {
            StringBuilder sbM5346m2 = AbstractC1308pu.m5346m(string, "dly(");
            sbM5346m2.append(this.f10714b);
            sbM5346m2.append(") ");
            string = sbM5346m2.toString();
        }
        if (this.f10716d != null) {
            StringBuilder sbM5346m3 = AbstractC1308pu.m5346m(string, "interp(");
            sbM5346m3.append(this.f10716d);
            sbM5346m3.append(") ");
            string = sbM5346m3.toString();
        }
        ArrayList arrayList = this.f10717e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f10718f;
        if (size <= 0 && arrayList2.size() <= 0) {
            return string;
        }
        String strConcat = string.concat("tgts(");
        if (arrayList.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (i > 0) {
                    strConcat = strConcat.concat(", ");
                }
                StringBuilder sbM5344k2 = AbstractC1308pu.m5344k(strConcat);
                sbM5344k2.append(arrayList.get(i));
                strConcat = sbM5344k2.toString();
            }
        }
        if (arrayList2.size() > 0) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                if (i2 > 0) {
                    strConcat = strConcat.concat(", ");
                }
                StringBuilder sbM5344k3 = AbstractC1308pu.m5344k(strConcat);
                sbM5344k3.append(arrayList2.get(i2));
                strConcat = sbM5344k3.toString();
            }
        }
        return strConcat.concat(")");
    }

    /* JADX INFO: renamed from: a */
    public void m6205a(s22 s22Var) {
        if (this.f10729v == null) {
            this.f10729v = new ArrayList();
        }
        this.f10729v.add(s22Var);
    }

    /* JADX INFO: renamed from: b */
    public void mo6206b(View view) {
        this.f10718f.add(view);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo2558d(z22 z22Var);

    /* JADX INFO: renamed from: e */
    public final void m6207e(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            z22 z22Var = new z22(view);
            if (z) {
                mo2559g(z22Var);
            } else {
                mo2558d(z22Var);
            }
            z22Var.f13249c.add(this);
            mo6208f(z22Var);
            if (z) {
                m6194c(this.f10719g, view, z22Var);
            } else {
                m6194c(this.f10720m, view, z22Var);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m6207e(viewGroup.getChildAt(i), z);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo2559g(z22 z22Var);

    /* JADX INFO: renamed from: h */
    public final void m6209h(ViewGroup viewGroup, boolean z) {
        m6210i(z);
        ArrayList arrayList = this.f10717e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f10718f;
        if (size <= 0 && arrayList2.size() <= 0) {
            m6207e(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                z22 z22Var = new z22(viewFindViewById);
                if (z) {
                    mo2559g(z22Var);
                } else {
                    mo2558d(z22Var);
                }
                z22Var.f13249c.add(this);
                mo6208f(z22Var);
                if (z) {
                    m6194c(this.f10719g, viewFindViewById, z22Var);
                } else {
                    m6194c(this.f10720m, viewFindViewById, z22Var);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            z22 z22Var2 = new z22(view);
            if (z) {
                mo2559g(z22Var2);
            } else {
                mo2558d(z22Var2);
            }
            z22Var2.f13249c.add(this);
            mo6208f(z22Var2);
            if (z) {
                m6194c(this.f10719g, view, z22Var2);
            } else {
                m6194c(this.f10720m, view, z22Var2);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m6210i(boolean z) {
        if (z) {
            ((C0633fa) this.f10719g.f3313a).clear();
            ((SparseArray) this.f10719g.f3314b).clear();
            ((ew0) this.f10719g.f3315c).m2645a();
        } else {
            ((C0633fa) this.f10720m.f3313a).clear();
            ((SparseArray) this.f10720m.f3314b).clear();
            ((ew0) this.f10720m.f3315c).m2645a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public t22 clone() {
        try {
            t22 t22Var = (t22) super.clone();
            t22Var.f10730w = new ArrayList();
            t22Var.f10719g = new C0599ed(12);
            t22Var.f10720m = new C0599ed(12);
            t22Var.f10723p = null;
            t22Var.f10724q = null;
            return t22Var;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public Animator mo2560l(ViewGroup viewGroup, z22 z22Var, z22 z22Var2) {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public void mo6212m(ViewGroup viewGroup, C0599ed c0599ed, C0599ed c0599ed2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorMo2560l;
        int i;
        int i2;
        View view;
        z22 z22Var;
        Animator animator;
        C0633fa c0633faM6195p = m6195p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            z22 z22Var2 = (z22) arrayList.get(i3);
            z22 z22Var3 = (z22) arrayList2.get(i3);
            z22 z22Var4 = null;
            if (z22Var2 != null && !z22Var2.f13249c.contains(this)) {
                z22Var2 = null;
            }
            if (z22Var3 != null && !z22Var3.f13249c.contains(this)) {
                z22Var3 = null;
            }
            if (!(z22Var2 == null && z22Var3 == null) && ((z22Var2 == null || z22Var3 == null || mo2562s(z22Var2, z22Var3)) && (animatorMo2560l = mo2560l(viewGroup, z22Var2, z22Var3)) != null)) {
                String str = this.f10713a;
                if (z22Var3 != null) {
                    view = z22Var3.f13248b;
                    String[] strArrMo2561q = mo2561q();
                    if (strArrMo2561q == null || strArrMo2561q.length <= 0) {
                        i = size;
                        i2 = i3;
                        z22Var = null;
                    } else {
                        z22Var = new z22(view);
                        z22 z22Var5 = (z22) ((C0633fa) c0599ed2.f3313a).getOrDefault(view, null);
                        i = size;
                        if (z22Var5 != null) {
                            int i4 = 0;
                            while (i4 < strArrMo2561q.length) {
                                String str2 = strArrMo2561q[i4];
                                z22Var.f13247a.put(str2, z22Var5.f13247a.get(str2));
                                i4++;
                                i3 = i3;
                                z22Var5 = z22Var5;
                            }
                        }
                        i2 = i3;
                        int i5 = c0633faM6195p.f13557c;
                        int i6 = 0;
                        while (true) {
                            if (i6 < i5) {
                                r22 r22Var = (r22) c0633faM6195p.getOrDefault((Animator) c0633faM6195p.m7350h(i6), null);
                                if (r22Var.f9662c != null && r22Var.f9660a == view && r22Var.f9661b.equals(str) && r22Var.f9662c.equals(z22Var)) {
                                    animator = null;
                                    break;
                                }
                                i6++;
                            }
                        }
                        animatorMo2560l = animator;
                        z22Var4 = z22Var;
                    }
                    animator = animatorMo2560l;
                    animatorMo2560l = animator;
                    z22Var4 = z22Var;
                } else {
                    i = size;
                    i2 = i3;
                    view = z22Var2.f13248b;
                }
                if (animatorMo2560l != null) {
                    i82 i82Var = g82.f4100a;
                    ea2 ea2Var = new ea2(viewGroup);
                    r22 r22Var2 = new r22();
                    r22Var2.f9660a = view;
                    r22Var2.f9661b = str;
                    r22Var2.f9662c = z22Var4;
                    r22Var2.f9663d = ea2Var;
                    r22Var2.f9664e = this;
                    c0633faM6195p.put(animatorMo2560l, r22Var2);
                    this.f10730w.add(animatorMo2560l);
                }
            } else {
                i = size;
                i2 = i3;
            }
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator2 = (Animator) this.f10730w.get(sparseIntArray.keyAt(i7));
                animator2.setStartDelay(animator2.getStartDelay() + (((long) sparseIntArray.valueAt(i7)) - Long.MAX_VALUE));
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m6213n() {
        int i = this.f10726s - 1;
        this.f10726s = i;
        if (i == 0) {
            ArrayList arrayList = this.f10729v;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f10729v.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((s22) arrayList2.get(i2)).mo149b(this);
                }
            }
            for (int i3 = 0; i3 < ((ew0) this.f10719g.f3315c).m2649e(); i3++) {
                View view = (View) ((ew0) this.f10719g.f3315c).m2650f(i3);
                if (view != null) {
                    WeakHashMap weakHashMap = i72.f4849a;
                    s62.m5997r(view, false);
                }
            }
            for (int i4 = 0; i4 < ((ew0) this.f10720m.f3315c).m2649e(); i4++) {
                View view2 = (View) ((ew0) this.f10720m.f3315c).m2650f(i4);
                if (view2 != null) {
                    WeakHashMap weakHashMap2 = i72.f4849a;
                    s62.m5997r(view2, false);
                }
            }
            this.f10728u = true;
        }
    }

    /* JADX INFO: renamed from: o */
    public final z22 m6214o(View view, boolean z) {
        y22 y22Var = this.f10721n;
        if (y22Var != null) {
            return y22Var.m6214o(view, z);
        }
        ArrayList arrayList = z ? this.f10723p : this.f10724q;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            z22 z22Var = (z22) arrayList.get(i);
            if (z22Var == null) {
                return null;
            }
            if (z22Var.f13248b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (z22) (z ? this.f10724q : this.f10723p).get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public String[] mo2561q() {
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final z22 m6215r(View view, boolean z) {
        y22 y22Var = this.f10721n;
        if (y22Var != null) {
            return y22Var.m6215r(view, z);
        }
        return (z22) ((C0633fa) (z ? this.f10719g : this.f10720m).f3313a).getOrDefault(view, null);
    }

    /* JADX INFO: renamed from: s */
    public boolean mo2562s(z22 z22Var, z22 z22Var2) {
        if (z22Var != null && z22Var2 != null) {
            String[] strArrMo2561q = mo2561q();
            if (strArrMo2561q != null) {
                for (String str : strArrMo2561q) {
                    if (m6196u(z22Var, z22Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = z22Var.f13247a.keySet().iterator();
                while (it.hasNext()) {
                    if (m6196u(z22Var, z22Var2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m6216t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f10717e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f10718f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return mo6204H("");
    }

    /* JADX INFO: renamed from: v */
    public void mo6217v(View view) {
        if (this.f10728u) {
            return;
        }
        C0633fa c0633faM6195p = m6195p();
        int i = c0633faM6195p.f13557c;
        i82 i82Var = g82.f4100a;
        WindowId windowId = view.getWindowId();
        for (int i2 = i - 1; i2 >= 0; i2--) {
            r22 r22Var = (r22) c0633faM6195p.m7352j(i2);
            if (r22Var.f9660a != null && r22Var.f9663d.f3304a.equals(windowId)) {
                ((Animator) c0633faM6195p.m7350h(i2)).pause();
            }
        }
        ArrayList arrayList = this.f10729v;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f10729v.clone();
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((s22) arrayList2.get(i3)).mo4507a();
            }
        }
        this.f10727t = true;
    }

    /* JADX INFO: renamed from: w */
    public void m6218w(s22 s22Var) {
        ArrayList arrayList = this.f10729v;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(s22Var);
        if (this.f10729v.size() == 0) {
            this.f10729v = null;
        }
    }

    /* JADX INFO: renamed from: x */
    public void mo6219x(View view) {
        this.f10718f.remove(view);
    }

    /* JADX INFO: renamed from: y */
    public void mo6220y(View view) {
        if (this.f10727t) {
            if (!this.f10728u) {
                C0633fa c0633faM6195p = m6195p();
                int i = c0633faM6195p.f13557c;
                i82 i82Var = g82.f4100a;
                WindowId windowId = view.getWindowId();
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    r22 r22Var = (r22) c0633faM6195p.m7352j(i2);
                    if (r22Var.f9660a != null && r22Var.f9663d.f3304a.equals(windowId)) {
                        ((Animator) c0633faM6195p.m7350h(i2)).resume();
                    }
                }
                ArrayList arrayList = this.f10729v;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f10729v.clone();
                    int size = arrayList2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((s22) arrayList2.get(i3)).mo4508e();
                    }
                }
            }
            this.f10727t = false;
        }
    }

    /* JADX INFO: renamed from: z */
    public void mo6221z() {
        m6203G();
        C0633fa c0633faM6195p = m6195p();
        ArrayList arrayList = this.f10730w;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (c0633faM6195p.containsKey(animator)) {
                m6203G();
                if (animator != null) {
                    animator.addListener(new q22(this, c0633faM6195p));
                    long j = this.f10715c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.f10714b;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f10716d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C1057l3(this, 7));
                    animator.start();
                }
            }
        }
        this.f10730w.clear();
        m6213n();
    }

    /* JADX INFO: renamed from: E */
    public void mo6201E() {
    }

    /* JADX INFO: renamed from: f */
    public void mo6208f(z22 z22Var) {
    }
}

package androidx.fragment.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0056t;
import com.sousasantoslogic.sspro.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p000.AbstractC1308pu;
import p000.AbstractC1356r4;
import p000.C0558d8;
import p000.C1058l4;
import p000.C1169o4;
import p000.C1405sg;
import p000.C1489uq;
import p000.InterfaceC0615et;
import p000.InterfaceC1393s4;
import p000.RunnableC1621ya;
import p000.ab1;
import p000.af0;
import p000.bf0;
import p000.ca0;
import p000.cf0;
import p000.df0;
import p000.es0;
import p000.f40;
import p000.ff0;
import p000.hp1;
import p000.if0;
import p000.jd0;
import p000.jp1;
import p000.k31;
import p000.k50;
import p000.kf0;
import p000.ms0;
import p000.nf0;
import p000.of0;
import p000.pn0;
import p000.ra1;
import p000.sa1;
import p000.ta1;
import p000.ve0;
import p000.w72;
import p000.wa1;
import p000.wv0;
import p000.xa1;
import p000.xe0;
import p000.ye0;
import p000.ze0;

/* JADX INFO: renamed from: androidx.fragment.app.t */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0056t {

    /* JADX INFO: renamed from: A */
    public C1169o4 f699A;

    /* JADX INFO: renamed from: B */
    public C1169o4 f700B;

    /* JADX INFO: renamed from: C */
    public ArrayDeque f701C;

    /* JADX INFO: renamed from: D */
    public boolean f702D;

    /* JADX INFO: renamed from: E */
    public boolean f703E;

    /* JADX INFO: renamed from: F */
    public boolean f704F;

    /* JADX INFO: renamed from: G */
    public boolean f705G;

    /* JADX INFO: renamed from: H */
    public boolean f706H;

    /* JADX INFO: renamed from: I */
    public ArrayList f707I;

    /* JADX INFO: renamed from: J */
    public ArrayList f708J;

    /* JADX INFO: renamed from: K */
    public ArrayList f709K;

    /* JADX INFO: renamed from: L */
    public C0057u f710L;

    /* JADX INFO: renamed from: M */
    public final RunnableC1621ya f711M;

    /* JADX INFO: renamed from: b */
    public boolean f713b;

    /* JADX INFO: renamed from: d */
    public ArrayList f715d;

    /* JADX INFO: renamed from: e */
    public ArrayList f716e;

    /* JADX INFO: renamed from: g */
    public ra1 f718g;

    /* JADX INFO: renamed from: l */
    public final C0558d8 f723l;

    /* JADX INFO: renamed from: m */
    public final CopyOnWriteArrayList f724m;

    /* JADX INFO: renamed from: n */
    public final ye0 f725n;

    /* JADX INFO: renamed from: o */
    public final ye0 f726o;

    /* JADX INFO: renamed from: p */
    public final ye0 f727p;

    /* JADX INFO: renamed from: q */
    public final ye0 f728q;

    /* JADX INFO: renamed from: r */
    public final bf0 f729r;

    /* JADX INFO: renamed from: s */
    public int f730s;

    /* JADX INFO: renamed from: t */
    public xe0 f731t;

    /* JADX INFO: renamed from: u */
    public ve0 f732u;

    /* JADX INFO: renamed from: v */
    public AbstractComponentCallbacksC0048l f733v;

    /* JADX INFO: renamed from: w */
    public AbstractComponentCallbacksC0048l f734w;

    /* JADX INFO: renamed from: x */
    public final cf0 f735x;

    /* JADX INFO: renamed from: y */
    public final k50 f736y;

    /* JADX INFO: renamed from: z */
    public C1169o4 f737z;

    /* JADX INFO: renamed from: a */
    public final ArrayList f712a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final C0060x f714c = new C0060x();

    /* JADX INFO: renamed from: f */
    public final LayoutInflaterFactory2C0055s f717f = new LayoutInflaterFactory2C0055s(this);

    /* JADX INFO: renamed from: h */
    public final af0 f719h = new af0(this);

    /* JADX INFO: renamed from: i */
    public final AtomicInteger f720i = new AtomicInteger();

    /* JADX INFO: renamed from: j */
    public final Map f721j = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: k */
    public final Map f722k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [ye0] */
    /* JADX WARN: Type inference failed for: r0v13, types: [ye0] */
    /* JADX WARN: Type inference failed for: r0v14, types: [ye0] */
    /* JADX WARN: Type inference failed for: r0v15, types: [ye0] */
    public AbstractC0056t() {
        Collections.synchronizedMap(new HashMap());
        this.f723l = new C0558d8(this);
        this.f724m = new CopyOnWriteArrayList();
        final int i = 0;
        this.f725n = new InterfaceC0615et(this) { // from class: ye0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC0056t f12968b;

            {
                this.f12968b = this;
            }

            @Override // p000.InterfaceC0615et
            public final void accept(Object obj) {
                int i2 = i;
                AbstractC0056t abstractC0056t = this.f12968b;
                switch (i2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (abstractC0056t.m372I()) {
                            abstractC0056t.m396h(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (abstractC0056t.m372I() && num.intValue() == 80) {
                            abstractC0056t.m400l(false);
                            break;
                        }
                        break;
                    case 2:
                        w61 w61Var = (w61) obj;
                        if (abstractC0056t.m372I()) {
                            abstractC0056t.m401m(w61Var.f12012a, false);
                        }
                        break;
                    default:
                        ed1 ed1Var = (ed1) obj;
                        if (abstractC0056t.m372I()) {
                            abstractC0056t.m406r(ed1Var.f3322a, false);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f726o = new InterfaceC0615et(this) { // from class: ye0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC0056t f12968b;

            {
                this.f12968b = this;
            }

            @Override // p000.InterfaceC0615et
            public final void accept(Object obj) {
                int i3 = i2;
                AbstractC0056t abstractC0056t = this.f12968b;
                switch (i3) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (abstractC0056t.m372I()) {
                            abstractC0056t.m396h(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (abstractC0056t.m372I() && num.intValue() == 80) {
                            abstractC0056t.m400l(false);
                            break;
                        }
                        break;
                    case 2:
                        w61 w61Var = (w61) obj;
                        if (abstractC0056t.m372I()) {
                            abstractC0056t.m401m(w61Var.f12012a, false);
                        }
                        break;
                    default:
                        ed1 ed1Var = (ed1) obj;
                        if (abstractC0056t.m372I()) {
                            abstractC0056t.m406r(ed1Var.f3322a, false);
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f727p = new InterfaceC0615et(this) { // from class: ye0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC0056t f12968b;

            {
                this.f12968b = this;
            }

            @Override // p000.InterfaceC0615et
            public final void accept(Object obj) {
                int i4 = i3;
                AbstractC0056t abstractC0056t = this.f12968b;
                switch (i4) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (abstractC0056t.m372I()) {
                            abstractC0056t.m396h(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (abstractC0056t.m372I() && num.intValue() == 80) {
                            abstractC0056t.m400l(false);
                            break;
                        }
                        break;
                    case 2:
                        w61 w61Var = (w61) obj;
                        if (abstractC0056t.m372I()) {
                            abstractC0056t.m401m(w61Var.f12012a, false);
                        }
                        break;
                    default:
                        ed1 ed1Var = (ed1) obj;
                        if (abstractC0056t.m372I()) {
                            abstractC0056t.m406r(ed1Var.f3322a, false);
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.f728q = new InterfaceC0615et(this) { // from class: ye0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC0056t f12968b;

            {
                this.f12968b = this;
            }

            @Override // p000.InterfaceC0615et
            public final void accept(Object obj) {
                int i5 = i4;
                AbstractC0056t abstractC0056t = this.f12968b;
                switch (i5) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (abstractC0056t.m372I()) {
                            abstractC0056t.m396h(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (abstractC0056t.m372I() && num.intValue() == 80) {
                            abstractC0056t.m400l(false);
                            break;
                        }
                        break;
                    case 2:
                        w61 w61Var = (w61) obj;
                        if (abstractC0056t.m372I()) {
                            abstractC0056t.m401m(w61Var.f12012a, false);
                        }
                        break;
                    default:
                        ed1 ed1Var = (ed1) obj;
                        if (abstractC0056t.m372I()) {
                            abstractC0056t.m406r(ed1Var.f3322a, false);
                        }
                        break;
                }
            }
        };
        this.f729r = new bf0(this);
        this.f730s = -1;
        this.f735x = new cf0(this);
        this.f736y = new k50((byte) 0, 25);
        this.f701C = new ArrayDeque();
        this.f711M = new RunnableC1621ya(this, 12);
    }

    /* JADX INFO: renamed from: G */
    public static boolean m363G(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* JADX INFO: renamed from: H */
    public static boolean m364H(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l) {
        if (abstractComponentCallbacksC0048l.mHasMenu && abstractComponentCallbacksC0048l.mMenuVisible) {
            return true;
        }
        ArrayList arrayListM436e = abstractComponentCallbacksC0048l.mChildFragmentManager.f714c.m436e();
        int size = arrayListM436e.size();
        boolean zM364H = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayListM436e.get(i);
            i++;
            AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l2 = (AbstractComponentCallbacksC0048l) obj;
            if (abstractComponentCallbacksC0048l2 != null) {
                zM364H = m364H(abstractComponentCallbacksC0048l2);
            }
            if (zM364H) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m365J(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l) {
        if (abstractComponentCallbacksC0048l == null) {
            return true;
        }
        AbstractC0056t abstractC0056t = abstractComponentCallbacksC0048l.mFragmentManager;
        return abstractComponentCallbacksC0048l.equals(abstractC0056t.f734w) && m365J(abstractC0056t.f733v);
    }

    /* JADX INFO: renamed from: A */
    public final AbstractComponentCallbacksC0048l m366A(int i) {
        C0060x c0060x = this.f714c;
        ArrayList arrayList = c0060x.f763a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = (AbstractComponentCallbacksC0048l) arrayList.get(size);
            if (abstractComponentCallbacksC0048l != null && abstractComponentCallbacksC0048l.mFragmentId == i) {
                return abstractComponentCallbacksC0048l;
            }
        }
        for (C0059w c0059w : c0060x.f764b.values()) {
            if (c0059w != null) {
                AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l2 = c0059w.f760c;
                if (abstractComponentCallbacksC0048l2.mFragmentId == i) {
                    return abstractComponentCallbacksC0048l2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public final AbstractComponentCallbacksC0048l m367B(String str) {
        C0060x c0060x = this.f714c;
        ArrayList arrayList = c0060x.f763a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = (AbstractComponentCallbacksC0048l) arrayList.get(size);
            if (abstractComponentCallbacksC0048l != null && str.equals(abstractComponentCallbacksC0048l.mTag)) {
                return abstractComponentCallbacksC0048l;
            }
        }
        for (C0059w c0059w : c0060x.f764b.values()) {
            if (c0059w != null) {
                AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l2 = c0059w.f760c;
                if (str.equals(abstractComponentCallbacksC0048l2.mTag)) {
                    return abstractComponentCallbacksC0048l2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: C */
    public final void m368C() {
        for (C0042f c0042f : m393e()) {
            if (c0042f.f686e) {
                m363G(2);
                c0042f.f686e = false;
                c0042f.m345d();
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final ViewGroup m369D(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l) {
        ViewGroup viewGroup = abstractComponentCallbacksC0048l.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0048l.mContainerId <= 0 || !this.f732u.mo353c()) {
            return null;
        }
        View viewMo352b = this.f732u.mo352b(abstractComponentCallbacksC0048l.mContainerId);
        if (viewMo352b instanceof ViewGroup) {
            return (ViewGroup) viewMo352b;
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final cf0 m370E() {
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = this.f733v;
        return abstractComponentCallbacksC0048l != null ? abstractComponentCallbacksC0048l.mFragmentManager.m370E() : this.f735x;
    }

    /* JADX INFO: renamed from: F */
    public final k50 m371F() {
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = this.f733v;
        return abstractComponentCallbacksC0048l != null ? abstractComponentCallbacksC0048l.mFragmentManager.m371F() : this.f736y;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m372I() {
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = this.f733v;
        if (abstractComponentCallbacksC0048l == null) {
            return true;
        }
        return abstractComponentCallbacksC0048l.isAdded() && this.f733v.getParentFragmentManager().m372I();
    }

    /* JADX INFO: renamed from: K */
    public final void m373K(int i, boolean z) {
        xe0 xe0Var;
        if (this.f731t == null && i != -1) {
            f40.m2719o("No activity");
            return;
        }
        if (z || i != this.f730s) {
            this.f730s = i;
            C0060x c0060x = this.f714c;
            HashMap map = c0060x.f764b;
            ArrayList arrayList = c0060x.f763a;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                C0059w c0059w = (C0059w) map.get(((AbstractComponentCallbacksC0048l) obj).mWho);
                if (c0059w != null) {
                    c0059w.m427i();
                }
            }
            for (C0059w c0059w2 : map.values()) {
                if (c0059w2 != null) {
                    c0059w2.m427i();
                    AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = c0059w2.f760c;
                    if (abstractComponentCallbacksC0048l.mRemoving && !abstractComponentCallbacksC0048l.isInBackStack()) {
                        if (abstractComponentCallbacksC0048l.mBeingSaved && !c0060x.f765c.containsKey(abstractComponentCallbacksC0048l.mWho)) {
                            c0059w2.m430l();
                        }
                        c0060x.m439h(c0059w2);
                    }
                }
            }
            ArrayList arrayListM435d = c0060x.m435d();
            int size2 = arrayListM435d.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayListM435d.get(i3);
                i3++;
                C0059w c0059w3 = (C0059w) obj2;
                AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l2 = c0059w3.f760c;
                if (abstractComponentCallbacksC0048l2.mDeferStart) {
                    if (this.f713b) {
                        this.f706H = true;
                    } else {
                        abstractComponentCallbacksC0048l2.mDeferStart = false;
                        c0059w3.m427i();
                    }
                }
            }
            if (this.f702D && (xe0Var = this.f731t) != null && this.f730s == 7) {
                ((C0052p) xe0Var).f695e.invalidateMenu();
                this.f702D = false;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m374L() {
        if (this.f731t == null) {
            return;
        }
        this.f703E = false;
        this.f704F = false;
        this.f710L.f744g = false;
        for (AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l : this.f714c.m437f()) {
            if (abstractComponentCallbacksC0048l != null) {
                abstractComponentCallbacksC0048l.noteStateNotSaved();
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public final boolean m375M() {
        return m376N(-1, 0);
    }

    /* JADX INFO: renamed from: N */
    public final boolean m376N(int i, int i2) {
        m412x(false);
        m411w(true);
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = this.f734w;
        if (abstractComponentCallbacksC0048l != null && i < 0 && abstractComponentCallbacksC0048l.getChildFragmentManager().m375M()) {
            return true;
        }
        boolean zM377O = m377O(this.f707I, this.f708J, i, i2);
        if (zM377O) {
            this.f713b = true;
            try {
                m379Q(this.f707I, this.f708J);
                m392d();
            } catch (Throwable th) {
                m392d();
                throw th;
            }
        }
        m388Z();
        boolean z = this.f706H;
        C0060x c0060x = this.f714c;
        if (z) {
            this.f706H = false;
            ArrayList arrayListM435d = c0060x.m435d();
            int size = arrayListM435d.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayListM435d.get(i3);
                i3++;
                C0059w c0059w = (C0059w) obj;
                AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l2 = c0059w.f760c;
                if (abstractComponentCallbacksC0048l2.mDeferStart) {
                    if (this.f713b) {
                        this.f706H = true;
                    } else {
                        abstractComponentCallbacksC0048l2.mDeferStart = false;
                        c0059w.m427i();
                    }
                }
            }
        }
        c0060x.f764b.values().removeAll(Collections.singleton(null));
        return zM377O;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m377O(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        ArrayList arrayList3 = this.f715d;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                size = z ? 0 : this.f715d.size() - 1;
            } else {
                int size2 = this.f715d.size() - 1;
                while (size2 >= 0) {
                    C0037a c0037a = (C0037a) this.f715d.get(size2);
                    if (i >= 0 && i == c0037a.f659r) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z) {
                    size = size2;
                    while (size > 0) {
                        C0037a c0037a2 = (C0037a) this.f715d.get(size - 1);
                        if (i < 0 || i != c0037a2.f659r) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f715d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f715d.size() - 1; size3 >= size; size3--) {
            arrayList.add((C0037a) this.f715d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX INFO: renamed from: P */
    public final void m378P(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l) {
        if (m363G(2)) {
            Objects.toString(abstractComponentCallbacksC0048l);
        }
        boolean zIsInBackStack = abstractComponentCallbacksC0048l.isInBackStack();
        if (abstractComponentCallbacksC0048l.mDetached && zIsInBackStack) {
            return;
        }
        C0060x c0060x = this.f714c;
        synchronized (c0060x.f763a) {
            c0060x.f763a.remove(abstractComponentCallbacksC0048l);
        }
        abstractComponentCallbacksC0048l.mAdded = false;
        if (m364H(abstractComponentCallbacksC0048l)) {
            this.f702D = true;
        }
        abstractComponentCallbacksC0048l.mRemoving = true;
        m386X(abstractComponentCallbacksC0048l);
    }

    /* JADX INFO: renamed from: Q */
    public final void m379Q(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            f40.m2719o("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((C0037a) arrayList.get(i)).f8887o) {
                if (i2 != i) {
                    m414z(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0037a) arrayList.get(i2)).f8887o) {
                        i2++;
                    }
                }
                m414z(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            m414z(arrayList, arrayList2, i2, size);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m380R(Parcelable parcelable) {
        C0558d8 c0558d8;
        int i;
        int i2;
        C0059w c0059w;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f731t.f12589b.getClassLoader());
                this.f722k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f731t.f12589b.getClassLoader());
                arrayList.add((C0058v) bundle.getParcelable("state"));
            }
        }
        C0060x c0060x = this.f714c;
        HashMap map = c0060x.f765c;
        HashMap map2 = c0060x.f764b;
        map.clear();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            C0058v c0058v = (C0058v) obj;
            map.put(c0058v.f746b, c0058v);
        }
        if0 if0Var = (if0) bundle3.getParcelable("state");
        if (if0Var == null) {
            return;
        }
        map2.clear();
        ArrayList arrayList2 = if0Var.f5001a;
        int size2 = arrayList2.size();
        int i4 = 0;
        while (true) {
            c0558d8 = this.f723l;
            i = 2;
            if (i4 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i4);
            i4++;
            C0058v c0058v2 = (C0058v) c0060x.f765c.remove((String) obj2);
            if (c0058v2 != null) {
                AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = (AbstractComponentCallbacksC0048l) this.f710L.f739b.get(c0058v2.f746b);
                if (abstractComponentCallbacksC0048l != null) {
                    if (m363G(2)) {
                        abstractComponentCallbacksC0048l.toString();
                    }
                    c0059w = new C0059w(c0558d8, c0060x, abstractComponentCallbacksC0048l, c0058v2);
                } else {
                    c0059w = new C0059w(this.f723l, this.f714c, this.f731t.f12589b.getClassLoader(), m370E(), c0058v2);
                }
                AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l2 = c0059w.f760c;
                abstractComponentCallbacksC0048l2.mFragmentManager = this;
                if (m363G(2)) {
                    abstractComponentCallbacksC0048l2.toString();
                }
                c0059w.m428j(this.f731t.f12589b.getClassLoader());
                c0060x.m438g(c0059w);
                c0059w.f762e = this.f730s;
            }
        }
        C0057u c0057u = this.f710L;
        c0057u.getClass();
        ArrayList arrayList3 = new ArrayList(c0057u.f739b.values());
        int size3 = arrayList3.size();
        int i5 = 0;
        while (i5 < size3) {
            Object obj3 = arrayList3.get(i5);
            i5++;
            AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l3 = (AbstractComponentCallbacksC0048l) obj3;
            if (map2.get(abstractComponentCallbacksC0048l3.mWho) == null) {
                if (m363G(2)) {
                    abstractComponentCallbacksC0048l3.toString();
                    Objects.toString(if0Var.f5001a);
                }
                this.f710L.m418e(abstractComponentCallbacksC0048l3);
                abstractComponentCallbacksC0048l3.mFragmentManager = this;
                C0059w c0059w2 = new C0059w(c0558d8, c0060x, abstractComponentCallbacksC0048l3);
                c0059w2.f762e = 1;
                c0059w2.m427i();
                abstractComponentCallbacksC0048l3.mRemoving = true;
                c0059w2.m427i();
            }
        }
        ArrayList arrayList4 = if0Var.f5002b;
        c0060x.f763a.clear();
        if (arrayList4 != null) {
            int size4 = arrayList4.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList4.get(i6);
                i6++;
                String str3 = (String) obj4;
                AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048lM433b = c0060x.m433b(str3);
                if (abstractComponentCallbacksC0048lM433b == null) {
                    f40.m2719o(jd0.m3615m("No instantiated fragment for (", str3, ")"));
                    return;
                } else {
                    if (m363G(2)) {
                        abstractComponentCallbacksC0048lM433b.toString();
                    }
                    c0060x.m432a(abstractComponentCallbacksC0048lM433b);
                }
            }
        }
        if (if0Var.f5003c != null) {
            this.f715d = new ArrayList(if0Var.f5003c.length);
            int i7 = 0;
            while (true) {
                C0038b[] c0038bArr = if0Var.f5003c;
                if (i7 >= c0038bArr.length) {
                    break;
                }
                C0038b c0038b = c0038bArr[i7];
                ArrayList arrayList5 = c0038b.f661b;
                C0037a c0037a = new C0037a(this);
                int[] iArr = c0038b.f660a;
                int i8 = 0;
                int i9 = 0;
                while (i8 < iArr.length) {
                    of0 of0Var = new of0();
                    int i10 = i8 + 1;
                    of0Var.f7772a = iArr[i8];
                    if (m363G(i)) {
                        Objects.toString(c0037a);
                        int i11 = iArr[i10];
                    }
                    int i12 = i;
                    of0Var.f7779h = es0.values()[c0038b.f662c[i9]];
                    of0Var.f7780i = es0.values()[c0038b.f663d[i9]];
                    int i13 = i8 + 2;
                    of0Var.f7774c = iArr[i10] != 0;
                    int i14 = iArr[i13];
                    of0Var.f7775d = i14;
                    int i15 = iArr[i8 + 3];
                    of0Var.f7776e = i15;
                    int i16 = i8 + 5;
                    int i17 = iArr[i8 + 4];
                    of0Var.f7777f = i17;
                    i8 += 6;
                    int i18 = iArr[i16];
                    of0Var.f7778g = i18;
                    c0037a.f8874b = i14;
                    c0037a.f8875c = i15;
                    c0037a.f8876d = i17;
                    c0037a.f8877e = i18;
                    c0037a.m5255b(of0Var);
                    i9++;
                    i = i12;
                }
                int i19 = i;
                c0037a.f8878f = c0038b.f664e;
                c0037a.f8880h = c0038b.f665f;
                c0037a.f8879g = true;
                c0037a.f8881i = c0038b.f667m;
                c0037a.f8882j = c0038b.f668n;
                c0037a.f8883k = c0038b.f669o;
                c0037a.f8884l = c0038b.f670p;
                c0037a.f8885m = c0038b.f671q;
                c0037a.f8886n = c0038b.f672r;
                c0037a.f8887o = c0038b.f673s;
                c0037a.f659r = c0038b.f666g;
                for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                    String str4 = (String) arrayList5.get(i20);
                    if (str4 != null) {
                        ((of0) c0037a.f8873a.get(i20)).f7773b = c0060x.m433b(str4);
                    }
                }
                c0037a.m332d(1);
                if (m363G(i19)) {
                    c0037a.toString();
                    PrintWriter printWriter = new PrintWriter(new wv0());
                    c0037a.m334f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f715d.add(c0037a);
                i7++;
                i = i19;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.f715d = null;
        }
        this.f720i.set(if0Var.f5004d);
        String str5 = if0Var.f5005e;
        if (str5 != null) {
            AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048lM433b2 = c0060x.m433b(str5);
            this.f734w = abstractComponentCallbacksC0048lM433b2;
            m405q(abstractComponentCallbacksC0048lM433b2);
        }
        ArrayList arrayList6 = if0Var.f5006f;
        if (arrayList6 != null) {
            for (int i21 = i2; i21 < arrayList6.size(); i21++) {
                this.f721j.put((String) arrayList6.get(i21), (C1405sg) if0Var.f5007g.get(i21));
            }
        }
        this.f701C = new ArrayDeque(if0Var.f5008m);
    }

    /* JADX INFO: renamed from: S */
    public final Bundle m381S() {
        int i;
        ArrayList arrayList;
        C0038b[] c0038bArr;
        int size;
        Bundle bundle = new Bundle();
        m368C();
        Iterator it = m393e().iterator();
        while (it.hasNext()) {
            ((C0042f) it.next()).m347g();
        }
        m412x(true);
        this.f703E = true;
        this.f710L.f744g = true;
        C0060x c0060x = this.f714c;
        c0060x.getClass();
        HashMap map = c0060x.f764b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (C0059w c0059w : map.values()) {
            if (c0059w != null) {
                AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = c0059w.f760c;
                c0059w.m430l();
                arrayList2.add(abstractComponentCallbacksC0048l.mWho);
                if (m363G(2)) {
                    abstractComponentCallbacksC0048l.toString();
                    Objects.toString(abstractComponentCallbacksC0048l.mSavedFragmentState);
                }
            }
        }
        C0060x c0060x2 = this.f714c;
        c0060x2.getClass();
        ArrayList arrayList3 = new ArrayList(c0060x2.f765c.values());
        if (arrayList3.isEmpty()) {
            m363G(2);
            return bundle;
        }
        C0060x c0060x3 = this.f714c;
        synchronized (c0060x3.f763a) {
            try {
                i = 0;
                if (c0060x3.f763a.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(c0060x3.f763a.size());
                    ArrayList arrayList4 = c0060x3.f763a;
                    int size2 = arrayList4.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj = arrayList4.get(i2);
                        i2++;
                        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l2 = (AbstractComponentCallbacksC0048l) obj;
                        arrayList.add(abstractComponentCallbacksC0048l2.mWho);
                        if (m363G(2)) {
                            abstractComponentCallbacksC0048l2.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList5 = this.f715d;
        if (arrayList5 == null || (size = arrayList5.size()) <= 0) {
            c0038bArr = null;
        } else {
            c0038bArr = new C0038b[size];
            for (int i3 = 0; i3 < size; i3++) {
                c0038bArr[i3] = new C0038b((C0037a) this.f715d.get(i3));
                if (m363G(2)) {
                    Objects.toString(this.f715d.get(i3));
                }
            }
        }
        if0 if0Var = new if0();
        if0Var.f5005e = null;
        ArrayList arrayList6 = new ArrayList();
        if0Var.f5006f = arrayList6;
        ArrayList arrayList7 = new ArrayList();
        if0Var.f5007g = arrayList7;
        if0Var.f5001a = arrayList2;
        if0Var.f5002b = arrayList;
        if0Var.f5003c = c0038bArr;
        if0Var.f5004d = this.f720i.get();
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l3 = this.f734w;
        if (abstractComponentCallbacksC0048l3 != null) {
            if0Var.f5005e = abstractComponentCallbacksC0048l3.mWho;
        }
        arrayList6.addAll(this.f721j.keySet());
        arrayList7.addAll(this.f721j.values());
        if0Var.f5008m = new ArrayList(this.f701C);
        bundle.putParcelable("state", if0Var);
        for (String str : this.f722k.keySet()) {
            bundle.putBundle(AbstractC1308pu.m5339f("result_", str), (Bundle) this.f722k.get(str));
        }
        int size3 = arrayList3.size();
        while (i < size3) {
            Object obj2 = arrayList3.get(i);
            i++;
            C0058v c0058v = (C0058v) obj2;
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("state", c0058v);
            bundle.putBundle("fragment_" + c0058v.f746b, bundle2);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: T */
    public final void m382T() {
        synchronized (this.f712a) {
            try {
                if (this.f712a.size() == 1) {
                    this.f731t.f12590c.removeCallbacks(this.f711M);
                    this.f731t.f12590c.post(this.f711M);
                    m388Z();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m383U(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l, boolean z) {
        ViewGroup viewGroupM369D = m369D(abstractComponentCallbacksC0048l);
        if (viewGroupM369D == null || !(viewGroupM369D instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupM369D).setDrawDisappearingViewsLast(!z);
    }

    /* JADX INFO: renamed from: V */
    public final void m384V(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l, es0 es0Var) {
        if (abstractComponentCallbacksC0048l.equals(this.f714c.m433b(abstractComponentCallbacksC0048l.mWho)) && (abstractComponentCallbacksC0048l.mHost == null || abstractComponentCallbacksC0048l.mFragmentManager == this)) {
            abstractComponentCallbacksC0048l.mMaxState = es0Var;
        } else {
            ca0.m1181m("Fragment ", abstractComponentCallbacksC0048l, " is not an active fragment of FragmentManager ", this);
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m385W(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l) {
        if (abstractComponentCallbacksC0048l != null) {
            if (!abstractComponentCallbacksC0048l.equals(this.f714c.m433b(abstractComponentCallbacksC0048l.mWho)) || (abstractComponentCallbacksC0048l.mHost != null && abstractComponentCallbacksC0048l.mFragmentManager != this)) {
                ca0.m1181m("Fragment ", abstractComponentCallbacksC0048l, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l2 = this.f734w;
        this.f734w = abstractComponentCallbacksC0048l;
        m405q(abstractComponentCallbacksC0048l2);
        m405q(this.f734w);
    }

    /* JADX INFO: renamed from: X */
    public final void m386X(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l) {
        ViewGroup viewGroupM369D = m369D(abstractComponentCallbacksC0048l);
        if (viewGroupM369D != null) {
            if (abstractComponentCallbacksC0048l.getPopExitAnim() + abstractComponentCallbacksC0048l.getPopEnterAnim() + abstractComponentCallbacksC0048l.getExitAnim() + abstractComponentCallbacksC0048l.getEnterAnim() > 0) {
                if (viewGroupM369D.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupM369D.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0048l);
                }
                ((AbstractComponentCallbacksC0048l) viewGroupM369D.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(abstractComponentCallbacksC0048l.getPopDirection());
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m387Y(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new wv0());
        xe0 xe0Var = this.f731t;
        if (xe0Var == null) {
            try {
                m409u("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            ((C0052p) xe0Var).f695e.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m388Z() {
        synchronized (this.f712a) {
            try {
                if (!this.f712a.isEmpty()) {
                    this.f719h.setEnabled(true);
                    return;
                }
                af0 af0Var = this.f719h;
                ArrayList arrayList = this.f715d;
                af0Var.setEnabled((arrayList != null ? arrayList.size() : 0) > 0 && m365J(this.f733v));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0059w m389a(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l) {
        String str = abstractComponentCallbacksC0048l.mPreviousWho;
        if (str != null) {
            nf0.m4541c(abstractComponentCallbacksC0048l, str);
        }
        if (m363G(2)) {
            abstractComponentCallbacksC0048l.toString();
        }
        C0059w c0059wM394f = m394f(abstractComponentCallbacksC0048l);
        abstractComponentCallbacksC0048l.mFragmentManager = this;
        C0060x c0060x = this.f714c;
        c0060x.m438g(c0059wM394f);
        if (!abstractComponentCallbacksC0048l.mDetached) {
            c0060x.m432a(abstractComponentCallbacksC0048l);
            abstractComponentCallbacksC0048l.mRemoving = false;
            if (abstractComponentCallbacksC0048l.mView == null) {
                abstractComponentCallbacksC0048l.mHiddenChanged = false;
            }
            if (m364H(abstractComponentCallbacksC0048l)) {
                this.f702D = true;
            }
        }
        return c0059wM394f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final void m390b(xe0 xe0Var, ve0 ve0Var, AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l) {
        ms0 ms0Var;
        if (this.f731t != null) {
            f40.m2719o("Already attached");
            return;
        }
        this.f731t = xe0Var;
        this.f732u = ve0Var;
        this.f733v = abstractComponentCallbacksC0048l;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f724m;
        if (abstractComponentCallbacksC0048l != null) {
            copyOnWriteArrayList.add(new df0(abstractComponentCallbacksC0048l));
        } else if (xe0Var instanceof kf0) {
            copyOnWriteArrayList.add((kf0) xe0Var);
        }
        if (this.f733v != null) {
            m388Z();
        }
        if (xe0Var instanceof sa1) {
            sa1 sa1Var = (sa1) xe0Var;
            ra1 onBackPressedDispatcher = sa1Var.getOnBackPressedDispatcher();
            this.f718g = onBackPressedDispatcher;
            if (abstractComponentCallbacksC0048l != null) {
                ms0Var = sa1Var;
                ms0Var = abstractComponentCallbacksC0048l;
            }
            ms0Var = sa1Var;
            onBackPressedDispatcher.m5753a(ms0Var, this.f719h);
        }
        int i = 0;
        if (abstractComponentCallbacksC0048l != null) {
            C0057u c0057u = abstractComponentCallbacksC0048l.mFragmentManager.f710L;
            HashMap map = c0057u.f740c;
            C0057u c0057u2 = (C0057u) map.get(abstractComponentCallbacksC0048l.mWho);
            if (c0057u2 == null) {
                c0057u2 = new C0057u(c0057u.f742e);
                map.put(abstractComponentCallbacksC0048l.mWho, c0057u2);
            }
            this.f710L = c0057u2;
        } else if (xe0Var instanceof w72) {
            this.f710L = (C0057u) new pn0(((w72) xe0Var).getViewModelStore(), C0057u.f738h).m5287h(C0057u.class);
        } else {
            this.f710L = new C0057u(false);
        }
        C0057u c0057u3 = this.f710L;
        int i2 = 1;
        c0057u3.f744g = this.f703E || this.f704F;
        this.f714c.f766d = c0057u3;
        Object obj = this.f731t;
        if ((obj instanceof jp1) && abstractComponentCallbacksC0048l == null) {
            hp1 savedStateRegistry = ((jp1) obj).getSavedStateRegistry();
            savedStateRegistry.m3235c("android:support:fragments", new C1489uq(this, 1));
            Bundle bundleM3233a = savedStateRegistry.m3233a("android:support:fragments");
            if (bundleM3233a != null) {
                m380R(bundleM3233a);
            }
        }
        Object obj2 = this.f731t;
        if (obj2 instanceof InterfaceC1393s4) {
            AbstractC1356r4 activityResultRegistry = ((InterfaceC1393s4) obj2).getActivityResultRegistry();
            String strConcat = "FragmentManager:".concat(abstractComponentCallbacksC0048l != null ? AbstractC1308pu.m5342i(new StringBuilder(), abstractComponentCallbacksC0048l.mWho, ":") : "");
            int i3 = 2;
            this.f737z = activityResultRegistry.m5690c(strConcat.concat("StartActivityForResult"), new C1058l4(i3), new ze0(this, i2));
            this.f699A = activityResultRegistry.m5690c(strConcat.concat("StartIntentSenderForResult"), new C1058l4(4), new ze0(this, i3));
            this.f700B = activityResultRegistry.m5690c(strConcat.concat("RequestPermissions"), new C1058l4(i), new ze0(this, i));
        }
        Object obj3 = this.f731t;
        if (obj3 instanceof ta1) {
            ((ta1) obj3).addOnConfigurationChangedListener(this.f725n);
        }
        Object obj4 = this.f731t;
        if (obj4 instanceof ab1) {
            ((ab1) obj4).addOnTrimMemoryListener(this.f726o);
        }
        Object obj5 = this.f731t;
        if (obj5 instanceof wa1) {
            ((wa1) obj5).addOnMultiWindowModeChangedListener(this.f727p);
        }
        Object obj6 = this.f731t;
        if (obj6 instanceof xa1) {
            ((xa1) obj6).addOnPictureInPictureModeChangedListener(this.f728q);
        }
        Object obj7 = this.f731t;
        if ((obj7 instanceof k31) && abstractComponentCallbacksC0048l == null) {
            ((k31) obj7).addMenuProvider(this.f729r);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m391c(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l) {
        if (m363G(2)) {
            Objects.toString(abstractComponentCallbacksC0048l);
        }
        if (abstractComponentCallbacksC0048l.mDetached) {
            abstractComponentCallbacksC0048l.mDetached = false;
            if (abstractComponentCallbacksC0048l.mAdded) {
                return;
            }
            this.f714c.m432a(abstractComponentCallbacksC0048l);
            if (m363G(2)) {
                abstractComponentCallbacksC0048l.toString();
            }
            if (m364H(abstractComponentCallbacksC0048l)) {
                this.f702D = true;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m392d() {
        this.f713b = false;
        this.f708J.clear();
        this.f707I.clear();
    }

    /* JADX INFO: renamed from: e */
    public final HashSet m393e() {
        HashSet hashSet = new HashSet();
        ArrayList arrayListM435d = this.f714c.m435d();
        int size = arrayListM435d.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM435d.get(i);
            i++;
            ViewGroup viewGroup = ((C0059w) obj).f760c.mContainer;
            if (viewGroup != null) {
                hashSet.add(C0042f.m340h(viewGroup, m371F()));
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: f */
    public final C0059w m394f(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l) {
        String str = abstractComponentCallbacksC0048l.mWho;
        C0060x c0060x = this.f714c;
        C0059w c0059w = (C0059w) c0060x.f764b.get(str);
        if (c0059w != null) {
            return c0059w;
        }
        C0059w c0059w2 = new C0059w(this.f723l, c0060x, abstractComponentCallbacksC0048l);
        c0059w2.m428j(this.f731t.f12589b.getClassLoader());
        c0059w2.f762e = this.f730s;
        return c0059w2;
    }

    /* JADX INFO: renamed from: g */
    public final void m395g(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l) {
        if (m363G(2)) {
            Objects.toString(abstractComponentCallbacksC0048l);
        }
        if (abstractComponentCallbacksC0048l.mDetached) {
            return;
        }
        abstractComponentCallbacksC0048l.mDetached = true;
        if (abstractComponentCallbacksC0048l.mAdded) {
            if (m363G(2)) {
                abstractComponentCallbacksC0048l.toString();
            }
            C0060x c0060x = this.f714c;
            synchronized (c0060x.f763a) {
                c0060x.f763a.remove(abstractComponentCallbacksC0048l);
            }
            abstractComponentCallbacksC0048l.mAdded = false;
            if (m364H(abstractComponentCallbacksC0048l)) {
                this.f702D = true;
            }
            m386X(abstractComponentCallbacksC0048l);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m396h(boolean z, Configuration configuration) {
        if (z && (this.f731t instanceof ta1)) {
            m387Y(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l : this.f714c.m437f()) {
            if (abstractComponentCallbacksC0048l != null) {
                abstractComponentCallbacksC0048l.performConfigurationChanged(configuration);
                if (z) {
                    abstractComponentCallbacksC0048l.mChildFragmentManager.m396h(true, configuration);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m397i(MenuItem menuItem) {
        if (this.f730s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l : this.f714c.m437f()) {
            if (abstractComponentCallbacksC0048l != null && abstractComponentCallbacksC0048l.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m398j(Menu menu, MenuInflater menuInflater) {
        if (this.f730s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l : this.f714c.m437f()) {
            if (abstractComponentCallbacksC0048l != null && abstractComponentCallbacksC0048l.isMenuVisible() && abstractComponentCallbacksC0048l.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(abstractComponentCallbacksC0048l);
                z = true;
            }
        }
        if (this.f716e != null) {
            for (int i = 0; i < this.f716e.size(); i++) {
                AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l2 = (AbstractComponentCallbacksC0048l) this.f716e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0048l2)) {
                    abstractComponentCallbacksC0048l2.onDestroyOptionsMenu();
                }
            }
        }
        this.f716e = arrayList;
        return z;
    }

    /* JADX INFO: renamed from: k */
    public final void m399k() {
        boolean zIsChangingConfigurations = true;
        this.f705G = true;
        m412x(true);
        Iterator it = m393e().iterator();
        while (it.hasNext()) {
            ((C0042f) it.next()).m347g();
        }
        xe0 xe0Var = this.f731t;
        boolean z = xe0Var instanceof w72;
        C0060x c0060x = this.f714c;
        if (z) {
            zIsChangingConfigurations = c0060x.f766d.f743f;
        } else {
            AbstractActivityC0053q abstractActivityC0053q = xe0Var.f12589b;
            if (abstractActivityC0053q != null) {
                zIsChangingConfigurations = true ^ abstractActivityC0053q.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it2 = this.f721j.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = ((C1405sg) it2.next()).f10400a;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    C0057u c0057u = c0060x.f766d;
                    c0057u.getClass();
                    m363G(3);
                    c0057u.m417d((String) obj);
                }
            }
        }
        m408t(-1);
        Object obj2 = this.f731t;
        if (obj2 instanceof ab1) {
            ((ab1) obj2).removeOnTrimMemoryListener(this.f726o);
        }
        Object obj3 = this.f731t;
        if (obj3 instanceof ta1) {
            ((ta1) obj3).removeOnConfigurationChangedListener(this.f725n);
        }
        Object obj4 = this.f731t;
        if (obj4 instanceof wa1) {
            ((wa1) obj4).removeOnMultiWindowModeChangedListener(this.f727p);
        }
        Object obj5 = this.f731t;
        if (obj5 instanceof xa1) {
            ((xa1) obj5).removeOnPictureInPictureModeChangedListener(this.f728q);
        }
        Object obj6 = this.f731t;
        if ((obj6 instanceof k31) && this.f733v == null) {
            ((k31) obj6).removeMenuProvider(this.f729r);
        }
        this.f731t = null;
        this.f732u = null;
        this.f733v = null;
        if (this.f718g != null) {
            this.f719h.remove();
            this.f718g = null;
        }
        C1169o4 c1169o4 = this.f737z;
        if (c1169o4 != null) {
            c1169o4.m4710b();
            this.f699A.m4710b();
            this.f700B.m4710b();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m400l(boolean z) {
        if (z && (this.f731t instanceof ab1)) {
            m387Y(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l : this.f714c.m437f()) {
            if (abstractComponentCallbacksC0048l != null) {
                abstractComponentCallbacksC0048l.performLowMemory();
                if (z) {
                    abstractComponentCallbacksC0048l.mChildFragmentManager.m400l(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m401m(boolean z, boolean z2) {
        if (z2 && (this.f731t instanceof wa1)) {
            m387Y(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l : this.f714c.m437f()) {
            if (abstractComponentCallbacksC0048l != null) {
                abstractComponentCallbacksC0048l.performMultiWindowModeChanged(z);
                if (z2) {
                    abstractComponentCallbacksC0048l.mChildFragmentManager.m401m(z, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m402n() {
        ArrayList arrayListM436e = this.f714c.m436e();
        int size = arrayListM436e.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM436e.get(i);
            i++;
            AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = (AbstractComponentCallbacksC0048l) obj;
            if (abstractComponentCallbacksC0048l != null) {
                abstractComponentCallbacksC0048l.onHiddenChanged(abstractComponentCallbacksC0048l.isHidden());
                abstractComponentCallbacksC0048l.mChildFragmentManager.m402n();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m403o(MenuItem menuItem) {
        if (this.f730s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l : this.f714c.m437f()) {
            if (abstractComponentCallbacksC0048l != null && abstractComponentCallbacksC0048l.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final void m404p(Menu menu) {
        if (this.f730s < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l : this.f714c.m437f()) {
            if (abstractComponentCallbacksC0048l != null) {
                abstractComponentCallbacksC0048l.performOptionsMenuClosed(menu);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m405q(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l) {
        if (abstractComponentCallbacksC0048l != null) {
            if (abstractComponentCallbacksC0048l.equals(this.f714c.m433b(abstractComponentCallbacksC0048l.mWho))) {
                abstractComponentCallbacksC0048l.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m406r(boolean z, boolean z2) {
        if (z2 && (this.f731t instanceof xa1)) {
            m387Y(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l : this.f714c.m437f()) {
            if (abstractComponentCallbacksC0048l != null) {
                abstractComponentCallbacksC0048l.performPictureInPictureModeChanged(z);
                if (z2) {
                    abstractComponentCallbacksC0048l.mChildFragmentManager.m406r(z, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m407s(Menu menu) {
        boolean z = false;
        if (this.f730s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l : this.f714c.m437f()) {
            if (abstractComponentCallbacksC0048l != null && abstractComponentCallbacksC0048l.isMenuVisible() && abstractComponentCallbacksC0048l.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: t */
    public final void m408t(int i) {
        try {
            this.f713b = true;
            for (C0059w c0059w : this.f714c.f764b.values()) {
                if (c0059w != null) {
                    c0059w.f762e = i;
                }
            }
            m373K(i, false);
            Iterator it = m393e().iterator();
            while (it.hasNext()) {
                ((C0042f) it.next()).m347g();
            }
            this.f713b = false;
            m412x(true);
        } catch (Throwable th) {
            this.f713b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = this.f733v;
        if (abstractComponentCallbacksC0048l != null) {
            sb.append(abstractComponentCallbacksC0048l.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f733v)));
            sb.append("}");
        } else {
            xe0 xe0Var = this.f731t;
            if (xe0Var != null) {
                sb.append(xe0Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f731t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m409u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String strM3614l = jd0.m3614l(str, "    ");
        C0060x c0060x = this.f714c;
        ArrayList arrayList = c0060x.f763a;
        String strM3614l2 = jd0.m3614l(str, "    ");
        HashMap map = c0060x.f764b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0059w c0059w : map.values()) {
                printWriter.print(str);
                if (c0059w != null) {
                    AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = c0059w.f760c;
                    printWriter.println(abstractComponentCallbacksC0048l);
                    abstractComponentCallbacksC0048l.dump(strM3614l2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l2 = (AbstractComponentCallbacksC0048l) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0048l2.toString());
            }
        }
        ArrayList arrayList2 = this.f716e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l3 = (AbstractComponentCallbacksC0048l) this.f716e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0048l3.toString());
            }
        }
        ArrayList arrayList3 = this.f715d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                C0037a c0037a = (C0037a) this.f715d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(c0037a.toString());
                c0037a.m334f(strM3614l, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f720i.get());
        synchronized (this.f712a) {
            try {
                int size4 = this.f712a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (ff0) this.f712a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f731t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f732u);
        if (this.f733v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f733v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f730s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f703E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f704F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f705G);
        if (this.f702D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f702D);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m410v(ff0 ff0Var, boolean z) {
        if (!z) {
            if (this.f731t == null) {
                if (this.f705G) {
                    f40.m2719o("FragmentManager has been destroyed");
                    return;
                } else {
                    f40.m2719o("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (this.f703E || this.f704F) {
                f40.m2719o("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.f712a) {
            try {
                if (this.f731t == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f712a.add(ff0Var);
                    m382T();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m411w(boolean z) {
        if (this.f713b) {
            f40.m2719o("FragmentManager is already executing transactions");
            return;
        }
        if (this.f731t == null) {
            if (this.f705G) {
                f40.m2719o("FragmentManager has been destroyed");
                return;
            } else {
                f40.m2719o("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.f731t.f12590c.getLooper()) {
            f40.m2719o("Must be called from main thread of fragment host");
            return;
        }
        if (!z && (this.f703E || this.f704F)) {
            f40.m2719o("Can not perform this action after onSaveInstanceState");
        } else if (this.f707I == null) {
            this.f707I = new ArrayList();
            this.f708J = new ArrayList();
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m412x(boolean z) {
        boolean zMo330a;
        ArrayList arrayList;
        m411w(z);
        boolean z2 = false;
        while (true) {
            ArrayList arrayList2 = this.f707I;
            ArrayList arrayList3 = this.f708J;
            synchronized (this.f712a) {
                if (this.f712a.isEmpty()) {
                    zMo330a = false;
                } else {
                    try {
                        int size = this.f712a.size();
                        int i = 0;
                        zMo330a = false;
                        while (true) {
                            arrayList = this.f712a;
                            if (i >= size) {
                                break;
                            }
                            zMo330a |= ((ff0) arrayList.get(i)).mo330a(arrayList2, arrayList3);
                            i++;
                            throw th;
                        }
                        arrayList.clear();
                        this.f731t.f12590c.removeCallbacks(this.f711M);
                    } catch (Throwable th) {
                        this.f712a.clear();
                        this.f731t.f12590c.removeCallbacks(this.f711M);
                        throw th;
                    }
                }
            }
            if (!zMo330a) {
                break;
            }
            this.f713b = true;
            try {
                m379Q(this.f707I, this.f708J);
                m392d();
                z2 = true;
            } catch (Throwable th2) {
                m392d();
                throw th2;
            }
        }
        m388Z();
        if (this.f706H) {
            this.f706H = false;
            ArrayList arrayListM435d = this.f714c.m435d();
            int size2 = arrayListM435d.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj = arrayListM435d.get(i2);
                i2++;
                C0059w c0059w = (C0059w) obj;
                AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = c0059w.f760c;
                if (abstractComponentCallbacksC0048l.mDeferStart) {
                    if (this.f713b) {
                        this.f706H = true;
                    } else {
                        abstractComponentCallbacksC0048l.mDeferStart = false;
                        c0059w.m427i();
                    }
                }
            }
        }
        this.f714c.f764b.values().removeAll(Collections.singleton(null));
        return z2;
    }

    /* JADX INFO: renamed from: y */
    public final void m413y(C0037a c0037a, boolean z) {
        if (z && (this.f731t == null || this.f705G)) {
            return;
        }
        m411w(z);
        c0037a.mo330a(this.f707I, this.f708J);
        this.f713b = true;
        try {
            m379Q(this.f707I, this.f708J);
            m392d();
            m388Z();
            boolean z2 = this.f706H;
            C0060x c0060x = this.f714c;
            if (z2) {
                this.f706H = false;
                ArrayList arrayListM435d = c0060x.m435d();
                int size = arrayListM435d.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListM435d.get(i);
                    i++;
                    C0059w c0059w = (C0059w) obj;
                    AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = c0059w.f760c;
                    if (abstractComponentCallbacksC0048l.mDeferStart) {
                        if (this.f713b) {
                            this.f706H = true;
                        } else {
                            abstractComponentCallbacksC0048l.mDeferStart = false;
                            c0059w.m427i();
                        }
                    }
                }
            }
            c0060x.f764b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            m392d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x022d A[PHI: r14
  0x022d: PHI (r14v14 int) = (r14v13 int), (r14v15 int) binds: [B:99:0x021d, B:104:0x0229] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0180  */
    /* JADX WARN: Code duplicated, block: B:65:0x0186  */
    /* JADX INFO: renamed from: z */
    public final void m414z(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        int i6;
        boolean z4 = ((C0037a) arrayList.get(i)).f8887o;
        ArrayList arrayList3 = this.f709K;
        if (arrayList3 == null) {
            this.f709K = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.f709K;
        C0060x c0060x = this.f714c;
        arrayList4.addAll(c0060x.m437f());
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = this.f734w;
        int i7 = i;
        boolean z5 = false;
        while (true) {
            int i8 = 1;
            if (i7 >= i2) {
                boolean z6 = z4;
                this.f709K.clear();
                if (!z6 && this.f730s >= 1) {
                    for (int i9 = i; i9 < i2; i9++) {
                        ArrayList arrayList5 = ((C0037a) arrayList.get(i9)).f8873a;
                        int size = arrayList5.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList5.get(i10);
                            i10++;
                            AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l2 = ((of0) obj).f7773b;
                            if (abstractComponentCallbacksC0048l2 != null && abstractComponentCallbacksC0048l2.mFragmentManager != null) {
                                c0060x.m438g(m394f(abstractComponentCallbacksC0048l2));
                            }
                        }
                    }
                }
                for (int i11 = i; i11 < i2; i11++) {
                    C0037a c0037a = (C0037a) arrayList.get(i11);
                    if (!((Boolean) arrayList2.get(i11)).booleanValue()) {
                        c0037a.m332d(1);
                        AbstractC0056t abstractC0056t = c0037a.f657p;
                        ArrayList arrayList6 = c0037a.f8873a;
                        int size2 = arrayList6.size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            of0 of0Var = (of0) arrayList6.get(i12);
                            AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l3 = of0Var.f7773b;
                            if (abstractComponentCallbacksC0048l3 != null) {
                                abstractComponentCallbacksC0048l3.mBeingSaved = false;
                                abstractComponentCallbacksC0048l3.setPopDirection(false);
                                abstractComponentCallbacksC0048l3.setNextTransition(c0037a.f8878f);
                                abstractComponentCallbacksC0048l3.setSharedElementNames(c0037a.f8885m, c0037a.f8886n);
                            }
                            switch (of0Var.f7772a) {
                                case 1:
                                    abstractComponentCallbacksC0048l3.setAnimations(of0Var.f7775d, of0Var.f7776e, of0Var.f7777f, of0Var.f7778g);
                                    abstractC0056t.m383U(abstractComponentCallbacksC0048l3, false);
                                    abstractC0056t.m389a(abstractComponentCallbacksC0048l3);
                                    break;
                                case 2:
                                default:
                                    ca0.m1174f(of0Var.f7772a, "Unknown cmd: ");
                                    break;
                                case 3:
                                    abstractComponentCallbacksC0048l3.setAnimations(of0Var.f7775d, of0Var.f7776e, of0Var.f7777f, of0Var.f7778g);
                                    abstractC0056t.m378P(abstractComponentCallbacksC0048l3);
                                    break;
                                case 4:
                                    abstractComponentCallbacksC0048l3.setAnimations(of0Var.f7775d, of0Var.f7776e, of0Var.f7777f, of0Var.f7778g);
                                    abstractC0056t.getClass();
                                    if (m363G(2)) {
                                        Objects.toString(abstractComponentCallbacksC0048l3);
                                    }
                                    if (!abstractComponentCallbacksC0048l3.mHidden) {
                                        abstractComponentCallbacksC0048l3.mHidden = true;
                                        abstractComponentCallbacksC0048l3.mHiddenChanged = !abstractComponentCallbacksC0048l3.mHiddenChanged;
                                        abstractC0056t.m386X(abstractComponentCallbacksC0048l3);
                                    }
                                    break;
                                case 5:
                                    abstractComponentCallbacksC0048l3.setAnimations(of0Var.f7775d, of0Var.f7776e, of0Var.f7777f, of0Var.f7778g);
                                    abstractC0056t.m383U(abstractComponentCallbacksC0048l3, false);
                                    if (m363G(2)) {
                                        Objects.toString(abstractComponentCallbacksC0048l3);
                                    }
                                    if (abstractComponentCallbacksC0048l3.mHidden) {
                                        abstractComponentCallbacksC0048l3.mHidden = false;
                                        abstractComponentCallbacksC0048l3.mHiddenChanged = !abstractComponentCallbacksC0048l3.mHiddenChanged;
                                    }
                                    break;
                                case 6:
                                    abstractComponentCallbacksC0048l3.setAnimations(of0Var.f7775d, of0Var.f7776e, of0Var.f7777f, of0Var.f7778g);
                                    abstractC0056t.m395g(abstractComponentCallbacksC0048l3);
                                    break;
                                case 7:
                                    abstractComponentCallbacksC0048l3.setAnimations(of0Var.f7775d, of0Var.f7776e, of0Var.f7777f, of0Var.f7778g);
                                    abstractC0056t.m383U(abstractComponentCallbacksC0048l3, false);
                                    abstractC0056t.m391c(abstractComponentCallbacksC0048l3);
                                    break;
                                case 8:
                                    abstractC0056t.m385W(abstractComponentCallbacksC0048l3);
                                    break;
                                case 9:
                                    abstractC0056t.m385W(null);
                                    break;
                                case 10:
                                    abstractC0056t.m384V(abstractComponentCallbacksC0048l3, of0Var.f7780i);
                                    break;
                            }
                            return;
                        }
                    }
                    c0037a.m332d(-1);
                    AbstractC0056t abstractC0056t2 = c0037a.f657p;
                    ArrayList arrayList7 = c0037a.f8873a;
                    boolean z7 = true;
                    for (int size3 = arrayList7.size() - 1; size3 >= 0; size3--) {
                        of0 of0Var2 = (of0) arrayList7.get(size3);
                        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l4 = of0Var2.f7773b;
                        if (abstractComponentCallbacksC0048l4 != null) {
                            abstractComponentCallbacksC0048l4.mBeingSaved = false;
                            abstractComponentCallbacksC0048l4.setPopDirection(z7);
                            int i13 = c0037a.f8878f;
                            int i14 = 8194;
                            int i15 = 4097;
                            if (i13 != 4097) {
                                if (i13 != 8194) {
                                    i14 = 4100;
                                    i15 = 8197;
                                    if (i13 != 8197) {
                                        if (i13 == 4099) {
                                            i14 = 4099;
                                        } else if (i13 != 4100) {
                                            i14 = 0;
                                        } else {
                                            i14 = i15;
                                        }
                                    }
                                } else {
                                    i14 = i15;
                                }
                            }
                            abstractComponentCallbacksC0048l4.setNextTransition(i14);
                            abstractComponentCallbacksC0048l4.setSharedElementNames(c0037a.f8886n, c0037a.f8885m);
                        }
                        switch (of0Var2.f7772a) {
                            case 1:
                                abstractComponentCallbacksC0048l4.setAnimations(of0Var2.f7775d, of0Var2.f7776e, of0Var2.f7777f, of0Var2.f7778g);
                                z7 = true;
                                abstractC0056t2.m383U(abstractComponentCallbacksC0048l4, true);
                                abstractC0056t2.m378P(abstractComponentCallbacksC0048l4);
                                break;
                            case 2:
                            default:
                                ca0.m1174f(of0Var2.f7772a, "Unknown cmd: ");
                                break;
                            case 3:
                                abstractComponentCallbacksC0048l4.setAnimations(of0Var2.f7775d, of0Var2.f7776e, of0Var2.f7777f, of0Var2.f7778g);
                                abstractC0056t2.m389a(abstractComponentCallbacksC0048l4);
                                z7 = true;
                                break;
                            case 4:
                                abstractComponentCallbacksC0048l4.setAnimations(of0Var2.f7775d, of0Var2.f7776e, of0Var2.f7777f, of0Var2.f7778g);
                                abstractC0056t2.getClass();
                                if (m363G(2)) {
                                    Objects.toString(abstractComponentCallbacksC0048l4);
                                }
                                if (abstractComponentCallbacksC0048l4.mHidden) {
                                    abstractComponentCallbacksC0048l4.mHidden = false;
                                    abstractComponentCallbacksC0048l4.mHiddenChanged = !abstractComponentCallbacksC0048l4.mHiddenChanged;
                                }
                                z7 = true;
                                break;
                            case 5:
                                abstractComponentCallbacksC0048l4.setAnimations(of0Var2.f7775d, of0Var2.f7776e, of0Var2.f7777f, of0Var2.f7778g);
                                abstractC0056t2.m383U(abstractComponentCallbacksC0048l4, true);
                                if (m363G(2)) {
                                    Objects.toString(abstractComponentCallbacksC0048l4);
                                }
                                if (!abstractComponentCallbacksC0048l4.mHidden) {
                                    abstractComponentCallbacksC0048l4.mHidden = true;
                                    abstractComponentCallbacksC0048l4.mHiddenChanged = !abstractComponentCallbacksC0048l4.mHiddenChanged;
                                    abstractC0056t2.m386X(abstractComponentCallbacksC0048l4);
                                }
                                z7 = true;
                                break;
                            case 6:
                                abstractComponentCallbacksC0048l4.setAnimations(of0Var2.f7775d, of0Var2.f7776e, of0Var2.f7777f, of0Var2.f7778g);
                                abstractC0056t2.m391c(abstractComponentCallbacksC0048l4);
                                z7 = true;
                                break;
                            case 7:
                                abstractComponentCallbacksC0048l4.setAnimations(of0Var2.f7775d, of0Var2.f7776e, of0Var2.f7777f, of0Var2.f7778g);
                                abstractC0056t2.m383U(abstractComponentCallbacksC0048l4, true);
                                abstractC0056t2.m395g(abstractComponentCallbacksC0048l4);
                                z7 = true;
                                break;
                            case 8:
                                abstractC0056t2.m385W(null);
                                z7 = true;
                                break;
                            case 9:
                                abstractC0056t2.m385W(abstractComponentCallbacksC0048l4);
                                z7 = true;
                                break;
                            case 10:
                                abstractC0056t2.m384V(abstractComponentCallbacksC0048l4, of0Var2.f7779h);
                                z7 = true;
                                break;
                        }
                        return;
                    }
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i16 = i; i16 < i2; i16++) {
                    C0037a c0037a2 = (C0037a) arrayList.get(i16);
                    if (zBooleanValue) {
                        for (int size4 = c0037a2.f8873a.size() - 1; size4 >= 0; size4--) {
                            AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l5 = ((of0) c0037a2.f8873a.get(size4)).f7773b;
                            if (abstractComponentCallbacksC0048l5 != null) {
                                m394f(abstractComponentCallbacksC0048l5).m427i();
                            }
                        }
                    } else {
                        ArrayList arrayList8 = c0037a2.f8873a;
                        int size5 = arrayList8.size();
                        int i17 = 0;
                        while (i17 < size5) {
                            Object obj2 = arrayList8.get(i17);
                            i17++;
                            AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l6 = ((of0) obj2).f7773b;
                            if (abstractComponentCallbacksC0048l6 != null) {
                                m394f(abstractComponentCallbacksC0048l6).m427i();
                            }
                        }
                    }
                }
                m373K(this.f730s, true);
                HashSet<C0042f> hashSet = new HashSet();
                for (int i18 = i; i18 < i2; i18++) {
                    ArrayList arrayList9 = ((C0037a) arrayList.get(i18)).f8873a;
                    int size6 = arrayList9.size();
                    int i19 = 0;
                    while (i19 < size6) {
                        Object obj3 = arrayList9.get(i19);
                        i19++;
                        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l7 = ((of0) obj3).f7773b;
                        if (abstractComponentCallbacksC0048l7 != null && (viewGroup = abstractComponentCallbacksC0048l7.mContainer) != null) {
                            hashSet.add(C0042f.m340h(viewGroup, m371F()));
                        }
                    }
                }
                for (C0042f c0042f : hashSet) {
                    c0042f.f685d = zBooleanValue;
                    c0042f.m348j();
                    c0042f.m345d();
                }
                for (int i20 = i; i20 < i2; i20++) {
                    C0037a c0037a3 = (C0037a) arrayList.get(i20);
                    if (((Boolean) arrayList2.get(i20)).booleanValue() && c0037a3.f659r >= 0) {
                        c0037a3.f659r = -1;
                    }
                    c0037a3.getClass();
                }
                return;
            }
            C0037a c0037a4 = (C0037a) arrayList.get(i7);
            boolean zBooleanValue2 = ((Boolean) arrayList2.get(i7)).booleanValue();
            ArrayList arrayList10 = this.f709K;
            if (zBooleanValue2) {
                z = z4;
                i3 = i7;
                z2 = z5;
                int i21 = 1;
                ArrayList arrayList11 = c0037a4.f8873a;
                int size7 = arrayList11.size() - 1;
                while (size7 >= 0) {
                    of0 of0Var3 = (of0) arrayList11.get(size7);
                    int i22 = of0Var3.f7772a;
                    if (i22 == i21) {
                        arrayList10.remove(of0Var3.f7773b);
                    } else if (i22 != 3) {
                        switch (i22) {
                            case 6:
                                arrayList10.add(of0Var3.f7773b);
                                break;
                            case 7:
                                arrayList10.remove(of0Var3.f7773b);
                                break;
                            case 8:
                                abstractComponentCallbacksC0048l = null;
                                break;
                            case 9:
                                abstractComponentCallbacksC0048l = of0Var3.f7773b;
                                break;
                            case 10:
                                of0Var3.f7780i = of0Var3.f7779h;
                                break;
                        }
                    } else {
                        arrayList10.add(of0Var3.f7773b);
                    }
                    size7--;
                    i21 = 1;
                }
            } else {
                ArrayList arrayList12 = c0037a4.f8873a;
                int i23 = 0;
                while (i23 < arrayList12.size()) {
                    of0 of0Var4 = (of0) arrayList12.get(i23);
                    int i24 = of0Var4.f7772a;
                    if (i24 != i8) {
                        if (i24 != 2) {
                            if (i24 == 3 || i24 == 6) {
                                z4 = z4;
                                arrayList10.remove(of0Var4.f7773b);
                                AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l8 = of0Var4.f7773b;
                                if (abstractComponentCallbacksC0048l8 == abstractComponentCallbacksC0048l) {
                                    arrayList12.add(i23, new of0(abstractComponentCallbacksC0048l8, 9));
                                    i23++;
                                    i5 = i7;
                                    z3 = z5;
                                    i4 = 1;
                                    abstractComponentCallbacksC0048l = null;
                                }
                            } else if (i24 == 7) {
                                i4 = 1;
                            } else if (i24 != 8) {
                                z4 = z4;
                            } else {
                                z4 = z4;
                                arrayList12.add(i23, new of0(abstractComponentCallbacksC0048l, 9, 0));
                                of0Var4.f7774c = true;
                                i23++;
                                abstractComponentCallbacksC0048l = of0Var4.f7773b;
                            }
                            i5 = i7;
                            z3 = z5;
                            i4 = 1;
                        } else {
                            z4 = z4;
                            AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l9 = of0Var4.f7773b;
                            int i25 = abstractComponentCallbacksC0048l9.mContainerId;
                            int size8 = arrayList10.size() - 1;
                            boolean z8 = false;
                            while (size8 >= 0) {
                                int i26 = i7;
                                AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l10 = (AbstractComponentCallbacksC0048l) arrayList10.get(size8);
                                boolean z9 = z5;
                                if (abstractComponentCallbacksC0048l10.mContainerId != i25) {
                                    i25 = i25;
                                } else if (abstractComponentCallbacksC0048l10 == abstractComponentCallbacksC0048l9) {
                                    i25 = i25;
                                    z8 = true;
                                } else {
                                    if (abstractComponentCallbacksC0048l10 == abstractComponentCallbacksC0048l) {
                                        i6 = 0;
                                        arrayList12.add(i23, new of0(abstractComponentCallbacksC0048l10, 9, 0));
                                        i23++;
                                        abstractComponentCallbacksC0048l = null;
                                    } else {
                                        i6 = 0;
                                    }
                                    of0 of0Var5 = new of0(abstractComponentCallbacksC0048l10, 3, i6);
                                    of0Var5.f7775d = of0Var4.f7775d;
                                    of0Var5.f7777f = of0Var4.f7777f;
                                    of0Var5.f7776e = of0Var4.f7776e;
                                    of0Var5.f7778g = of0Var4.f7778g;
                                    arrayList12.add(i23, of0Var5);
                                    arrayList10.remove(abstractComponentCallbacksC0048l10);
                                    i23++;
                                    abstractComponentCallbacksC0048l = abstractComponentCallbacksC0048l;
                                }
                                size8--;
                                i25 = i25;
                                z5 = z9;
                                i7 = i26;
                            }
                            i5 = i7;
                            z3 = z5;
                            i4 = 1;
                            if (z8) {
                                arrayList12.remove(i23);
                                i23--;
                            } else {
                                of0Var4.f7772a = 1;
                                of0Var4.f7774c = true;
                                arrayList10.add(abstractComponentCallbacksC0048l9);
                            }
                        }
                        i23 += i4;
                        i8 = i4;
                        z4 = z4;
                        z5 = z3;
                        i7 = i5;
                    } else {
                        i4 = i8;
                    }
                    i5 = i7;
                    z3 = z5;
                    arrayList10.add(of0Var4.f7773b);
                    i23 += i4;
                    i8 = i4;
                    z4 = z4;
                    z5 = z3;
                    i7 = i5;
                }
                z = z4;
                i3 = i7;
                z2 = z5;
            }
            z5 = z2 || c0037a4.f8879g;
            i7 = i3 + 1;
            z4 = z;
        }
    }
}

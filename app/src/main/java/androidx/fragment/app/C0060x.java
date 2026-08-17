package androidx.fragment.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p000.C0694gy;

/* JADX INFO: renamed from: androidx.fragment.app.x */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0060x {

    /* JADX INFO: renamed from: a */
    public final ArrayList f763a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final HashMap f764b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f765c = new HashMap();

    /* JADX INFO: renamed from: d */
    public C0057u f766d;

    /* JADX INFO: renamed from: a */
    public final void m432a(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l) {
        if (this.f763a.contains(abstractComponentCallbacksC0048l)) {
            C0694gy.m3081g(abstractComponentCallbacksC0048l, "Fragment already added: ");
            return;
        }
        synchronized (this.f763a) {
            this.f763a.add(abstractComponentCallbacksC0048l);
        }
        abstractComponentCallbacksC0048l.mAdded = true;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractComponentCallbacksC0048l m433b(String str) {
        C0059w c0059w = (C0059w) this.f764b.get(str);
        if (c0059w != null) {
            return c0059w.f760c;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractComponentCallbacksC0048l m434c(String str) {
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048lFindFragmentByWho;
        for (C0059w c0059w : this.f764b.values()) {
            if (c0059w != null && (abstractComponentCallbacksC0048lFindFragmentByWho = c0059w.f760c.findFragmentByWho(str)) != null) {
                return abstractComponentCallbacksC0048lFindFragmentByWho;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final ArrayList m435d() {
        ArrayList arrayList = new ArrayList();
        for (C0059w c0059w : this.f764b.values()) {
            if (c0059w != null) {
                arrayList.add(c0059w);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final ArrayList m436e() {
        ArrayList arrayList = new ArrayList();
        for (C0059w c0059w : this.f764b.values()) {
            if (c0059w != null) {
                arrayList.add(c0059w.f760c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final List m437f() {
        ArrayList arrayList;
        if (this.f763a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f763a) {
            arrayList = new ArrayList(this.f763a);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public final void m438g(C0059w c0059w) {
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = c0059w.f760c;
        String str = abstractComponentCallbacksC0048l.mWho;
        HashMap map = this.f764b;
        if (map.get(str) != null) {
            return;
        }
        map.put(abstractComponentCallbacksC0048l.mWho, c0059w);
        if (abstractComponentCallbacksC0048l.mRetainInstanceChangedWhileDetached) {
            boolean z = abstractComponentCallbacksC0048l.mRetainInstance;
            C0057u c0057u = this.f766d;
            if (z) {
                c0057u.m416c(abstractComponentCallbacksC0048l);
            } else {
                c0057u.m418e(abstractComponentCallbacksC0048l);
            }
            abstractComponentCallbacksC0048l.mRetainInstanceChangedWhileDetached = false;
        }
        if (AbstractC0056t.m363G(2)) {
            abstractComponentCallbacksC0048l.toString();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m439h(C0059w c0059w) {
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = c0059w.f760c;
        if (abstractComponentCallbacksC0048l.mRetainInstance) {
            this.f766d.m418e(abstractComponentCallbacksC0048l);
        }
        if (((C0059w) this.f764b.put(abstractComponentCallbacksC0048l.mWho, null)) != null && AbstractC0056t.m363G(2)) {
            abstractComponentCallbacksC0048l.toString();
        }
    }
}

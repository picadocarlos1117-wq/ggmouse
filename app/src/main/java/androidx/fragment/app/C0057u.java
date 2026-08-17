package androidx.fragment.app;

import java.util.HashMap;
import java.util.Iterator;
import p000.jf0;
import p000.r72;
import p000.v72;

/* JADX INFO: renamed from: androidx.fragment.app.u */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0057u extends r72 {

    /* JADX INFO: renamed from: h */
    public static final jf0 f738h = new jf0(0);

    /* JADX INFO: renamed from: e */
    public final boolean f742e;

    /* JADX INFO: renamed from: b */
    public final HashMap f739b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f740c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashMap f741d = new HashMap();

    /* JADX INFO: renamed from: f */
    public boolean f743f = false;

    /* JADX INFO: renamed from: g */
    public boolean f744g = false;

    public C0057u(boolean z) {
        this.f742e = z;
    }

    @Override // p000.r72
    /* JADX INFO: renamed from: b */
    public final void mo415b() {
        if (AbstractC0056t.m363G(3)) {
            toString();
        }
        this.f743f = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m416c(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l) {
        if (this.f744g) {
            AbstractC0056t.m363G(2);
            return;
        }
        String str = abstractComponentCallbacksC0048l.mWho;
        HashMap map = this.f739b;
        if (map.containsKey(str)) {
            return;
        }
        map.put(abstractComponentCallbacksC0048l.mWho, abstractComponentCallbacksC0048l);
        if (AbstractC0056t.m363G(2)) {
            abstractComponentCallbacksC0048l.toString();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m417d(String str) {
        HashMap map = this.f740c;
        C0057u c0057u = (C0057u) map.get(str);
        if (c0057u != null) {
            c0057u.mo415b();
            map.remove(str);
        }
        HashMap map2 = this.f741d;
        v72 v72Var = (v72) map2.get(str);
        if (v72Var != null) {
            v72Var.m6597a();
            map2.remove(str);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m418e(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l) {
        if (this.f744g) {
            AbstractC0056t.m363G(2);
        } else {
            if (this.f739b.remove(abstractComponentCallbacksC0048l.mWho) == null || !AbstractC0056t.m363G(2)) {
                return;
            }
            abstractComponentCallbacksC0048l.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0057u.class == obj.getClass()) {
            C0057u c0057u = (C0057u) obj;
            if (this.f739b.equals(c0057u.f739b) && this.f740c.equals(c0057u.f740c) && this.f741d.equals(c0057u.f741d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f741d.hashCode() + ((this.f740c.hashCode() + (this.f739b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f739b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f740c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f741d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}

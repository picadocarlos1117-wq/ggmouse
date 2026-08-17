package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class to1 implements Iterable {

    /* JADX INFO: renamed from: a */
    public qo1 f10913a;

    /* JADX INFO: renamed from: b */
    public qo1 f10914b;

    /* JADX INFO: renamed from: c */
    public final WeakHashMap f10915c = new WeakHashMap();

    /* JADX INFO: renamed from: d */
    public int f10916d = 0;

    /* JADX INFO: renamed from: a */
    public qo1 mo5457a(Object obj) {
        qo1 qo1Var = this.f10913a;
        while (qo1Var != null && !qo1Var.f9550a.equals(obj)) {
            qo1Var = qo1Var.f9552c;
        }
        return qo1Var;
    }

    /* JADX INFO: renamed from: b */
    public Object mo5458b(Object obj) {
        qo1 qo1VarMo5457a = mo5457a(obj);
        if (qo1VarMo5457a == null) {
            return null;
        }
        this.f10916d--;
        WeakHashMap weakHashMap = this.f10915c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((so1) it.next()).mo5294a(qo1VarMo5457a);
            }
        }
        qo1 qo1Var = qo1VarMo5457a.f9553d;
        qo1 qo1Var2 = qo1VarMo5457a.f9552c;
        if (qo1Var != null) {
            qo1Var.f9552c = qo1Var2;
        } else {
            this.f10913a = qo1Var2;
        }
        qo1 qo1Var3 = qo1VarMo5457a.f9552c;
        if (qo1Var3 != null) {
            qo1Var3.f9553d = qo1Var;
        } else {
            this.f10914b = qo1Var;
        }
        qo1VarMo5457a.f9552c = null;
        qo1VarMo5457a.f9553d = null;
        return qo1VarMo5457a.f9551b;
    }

    public final boolean equals(Object obj) {
        po1 po1Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof to1)) {
            return false;
        }
        to1 to1Var = (to1) obj;
        if (this.f10916d != to1Var.f10916d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = to1Var.iterator();
        while (true) {
            po1Var = (po1) it;
            if (!po1Var.hasNext()) {
                break;
            }
            po1 po1Var2 = (po1) it2;
            if (!po1Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) po1Var.next();
            Object next = po1Var2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (po1Var.hasNext() || ((po1) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            po1 po1Var = (po1) it;
            if (!po1Var.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) po1Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        po1 po1Var = new po1(this.f10913a, this.f10914b, 0);
        this.f10915c.put(po1Var, Boolean.FALSE);
        return po1Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            po1 po1Var = (po1) it;
            if (!po1Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) po1Var.next()).toString());
            if (po1Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}

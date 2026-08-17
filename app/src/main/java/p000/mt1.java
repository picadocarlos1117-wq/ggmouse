package p000;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class mt1 extends AbstractMap {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f7095g = 0;

    /* JADX INFO: renamed from: a */
    public final int f7096a;

    /* JADX INFO: renamed from: b */
    public List f7097b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c */
    public Map f7098c;

    /* JADX INFO: renamed from: d */
    public boolean f7099d;

    /* JADX INFO: renamed from: e */
    public volatile C0092ba f7100e;

    /* JADX INFO: renamed from: f */
    public Map f7101f;

    public mt1(int i) {
        this.f7096a = i;
        Map map = Collections.EMPTY_MAP;
        this.f7098c = map;
        this.f7101f = map;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final int m4453a(Comparable comparable) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int size = this.f7097b.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = comparable.compareTo(((pt1) this.f7097b.get(i3)).f9159a);
                if (iCompareTo < 0) {
                    i4 = i3 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i3;
                    }
                    i = i3 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((pt1) this.f7097b.get(i4)).f9159a);
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = comparable.compareTo(((pt1) this.f7097b.get(i3)).f9159a);
                    if (iCompareTo < 0) {
                        i4 = i3 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i3;
                        }
                        i = i3 + 1;
                    }
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }

    /* JADX INFO: renamed from: b */
    public final void m4454b() {
        if (this.f7099d) {
            lv1.m4291b();
        }
    }

    /* JADX INFO: renamed from: c */
    public final Map.Entry m4455c(int i) {
        return (Map.Entry) this.f7097b.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m4454b();
        if (!this.f7097b.isEmpty()) {
            this.f7097b.clear();
        }
        if (this.f7098c.isEmpty()) {
            return;
        }
        this.f7098c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m4453a(comparable) >= 0 || this.f7098c.containsKey(comparable);
    }

    /* JADX INFO: renamed from: d */
    public final Iterable m4456d() {
        return this.f7098c.isEmpty() ? o21.f7633h : this.f7098c.entrySet();
    }

    /* JADX INFO: renamed from: e */
    public final SortedMap m4457e() {
        m4454b();
        if (this.f7098c.isEmpty() && !(this.f7098c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f7098c = treeMap;
            this.f7101f = treeMap.descendingMap();
        }
        return (SortedMap) this.f7098c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f7100e == null) {
            this.f7100e = new C0092ba(1, this);
        }
        return this.f7100e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt1)) {
            return super.equals(obj);
        }
        mt1 mt1Var = (mt1) obj;
        int size = size();
        if (size == mt1Var.size()) {
            int size2 = this.f7097b.size();
            if (size2 != mt1Var.f7097b.size()) {
                return ((AbstractSet) entrySet()).equals(mt1Var.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (m4455c(i).equals(mt1Var.m4455c(i))) {
                }
            }
            if (size2 != size) {
                return this.f7098c.equals(mt1Var.f7098c);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m4454b();
        int iM4453a = m4453a(comparable);
        if (iM4453a >= 0) {
            return ((pt1) this.f7097b.get(iM4453a)).setValue(obj);
        }
        m4454b();
        boolean zIsEmpty = this.f7097b.isEmpty();
        int i = this.f7096a;
        if (zIsEmpty && !(this.f7097b instanceof ArrayList)) {
            this.f7097b = new ArrayList(i);
        }
        int i2 = -(iM4453a + 1);
        if (i2 >= i) {
            return m4457e().put(comparable, obj);
        }
        if (this.f7097b.size() == i) {
            pt1 pt1Var = (pt1) this.f7097b.remove(i - 1);
            m4457e().put(pt1Var.f9159a, pt1Var.f9160b);
        }
        this.f7097b.add(i2, new pt1(this, comparable, obj));
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final Object m4459g(int i) {
        m4454b();
        Object obj = ((pt1) this.f7097b.remove(i)).f9160b;
        if (!this.f7098c.isEmpty()) {
            Iterator it = m4457e().entrySet().iterator();
            List list = this.f7097b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new pt1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM4453a = m4453a(comparable);
        return iM4453a >= 0 ? ((pt1) this.f7097b.get(iM4453a)).f9160b : this.f7098c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f7097b.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((pt1) this.f7097b.get(i)).hashCode();
        }
        return this.f7098c.size() > 0 ? this.f7098c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m4454b();
        Comparable comparable = (Comparable) obj;
        int iM4453a = m4453a(comparable);
        if (iM4453a >= 0) {
            return m4459g(iM4453a);
        }
        if (this.f7098c.isEmpty()) {
            return null;
        }
        return this.f7098c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f7098c.size() + this.f7097b.size();
    }
}

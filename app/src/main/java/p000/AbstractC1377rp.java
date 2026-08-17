package p000;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: rp */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1377rp extends AbstractC1599xp {
    /* JADX INFO: renamed from: A0 */
    public static long[] m5866A0(List list) {
        list.getClass();
        long[] jArr = new long[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    /* JADX INFO: renamed from: B0 */
    public static final List m5867B0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m5877x0(iterable, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: C0 */
    public static Set m5868C0(Collection collection) {
        collection.getClass();
        if (collection instanceof Collection) {
            return new LinkedHashSet(collection);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m5877x0(collection, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: D0 */
    public static Set m5869D0(Collection collection) {
        collection.getClass();
        if (collection instanceof Collection) {
            Collection collection2 = collection;
            int size = collection2.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(qy0.m5619i0(collection2.size()));
                    m5877x0(collection, linkedHashSet);
                    return linkedHashSet;
                }
                Set setSingleton = Collections.singleton(collection instanceof List ? ((List) collection).get(0) : collection2.iterator().next());
                setSingleton.getClass();
                return setSingleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            m5877x0(collection, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set setSingleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                setSingleton2.getClass();
                return setSingleton2;
            }
        }
        return q60.f9397a;
    }

    /* JADX INFO: renamed from: q0 */
    public static Object m5870q0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: r0 */
    public static Object m5871r0(int i, List list) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    /* JADX INFO: renamed from: s0 */
    public static final void m5872s0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, og0 og0Var) {
        iterable.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            rc2.m5778b(sb, obj, og0Var);
        }
        sb.append(charSequence3);
    }

    /* JADX INFO: renamed from: t0 */
    public static String m5873t0(Iterable iterable, String str, String str2, String str3, og0 og0Var, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            og0Var = null;
        }
        iterable.getClass();
        StringBuilder sb = new StringBuilder();
        m5872s0(iterable, sb, str4, str5, str6, "...", og0Var);
        return sb.toString();
    }

    /* JADX INFO: renamed from: u0 */
    public static Object m5874u0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: v0 */
    public static List m5875v0(int i, List list) {
        Object next;
        list.getClass();
        if (i < 0) {
            f40.m2716l(jd0.m3610h(i, "Requested element count ", " is less than zero."));
            return null;
        }
        n60 n60Var = n60.f7259a;
        if (i == 0) {
            return n60Var;
        }
        if (list instanceof Collection) {
            if (i >= list.size()) {
                return m5879z0(list);
            }
            if (i == 1) {
                if (list instanceof List) {
                    next = m5870q0(list);
                } else {
                    Iterator it = list.iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException("Collection is empty.");
                    }
                    next = it.next();
                }
                return AbstractC1337qm.m5511F(next);
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            arrayList.add(it2.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        int size = arrayList.size();
        if (size != 0) {
            return size != 1 ? arrayList : AbstractC1337qm.m5511F(arrayList.get(0));
        }
        return n60Var;
    }

    /* JADX INFO: renamed from: w0 */
    public static byte[] m5876w0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            bArr[i] = ((Number) obj).byteValue();
            i++;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: x0 */
    public static final void m5877x0(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* JADX INFO: renamed from: y0 */
    public static int[] m5878y0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            iArr[i] = ((Number) obj).intValue();
            i++;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: z0 */
    public static List m5879z0(Iterable iterable) {
        iterable.getClass();
        boolean z = iterable instanceof Collection;
        n60 n60Var = n60.f7259a;
        if (!z) {
            List listM5867B0 = m5867B0(iterable);
            ArrayList arrayList = (ArrayList) listM5867B0;
            int size = arrayList.size();
            if (size != 0) {
                return size != 1 ? listM5867B0 : AbstractC1337qm.m5511F(arrayList.get(0));
            }
            return n60Var;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return n60Var;
        }
        if (size2 != 1) {
            return new ArrayList(collection);
        }
        return AbstractC1337qm.m5511F(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }
}

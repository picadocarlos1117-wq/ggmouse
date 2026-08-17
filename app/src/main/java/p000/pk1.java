package p000;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class pk1 implements Map, Serializable {

    /* JADX INFO: renamed from: g */
    public static final pk1 f8924g = new pk1(null, new Object[0], 0);

    /* JADX INFO: renamed from: a */
    public transient mk1 f8925a;

    /* JADX INFO: renamed from: b */
    public transient nk1 f8926b;

    /* JADX INFO: renamed from: c */
    public transient ok1 f8927c;

    /* JADX INFO: renamed from: d */
    public final transient Object f8928d;

    /* JADX INFO: renamed from: e */
    public final transient Object[] f8929e;

    /* JADX INFO: renamed from: f */
    public final transient int f8930f;

    public pk1(Object obj, Object[] objArr, int i) {
        this.f8928d = obj;
        this.f8929e = objArr;
        this.f8930f = i;
    }

    /* JADX INFO: renamed from: a */
    public static pk1 m5273a(Map map) {
        if ((map instanceof pk1) && !(map instanceof SortedMap)) {
            return (pk1) map;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        C0082b0 c0082b0 = new C0082b0(setEntrySet != null ? setEntrySet.size() : 4);
        if (setEntrySet != null) {
            int size = setEntrySet.size() * 2;
            Object[] objArr = (Object[]) c0082b0.f1104c;
            if (size > objArr.length) {
                c0082b0.f1104c = Arrays.copyOf(objArr, km0.m3900f(objArr.length, size));
            }
        }
        for (Map.Entry entry : setEntrySet) {
            c0082b0.m811n(entry.getKey(), entry.getValue());
        }
        return c0082b0.m803d();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final tm0 entrySet() {
        mk1 mk1Var = this.f8925a;
        if (mk1Var != null) {
            return mk1Var;
        }
        mk1 mk1Var2 = new mk1(this, this.f8929e, this.f8930f);
        this.f8925a = mk1Var2;
        return mk1Var2;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final lm0 values() {
        ok1 ok1Var = this.f8927c;
        if (ok1Var != null) {
            return ok1Var;
        }
        ok1 ok1Var2 = new ok1(this.f8929e, 1, this.f8930f);
        this.f8927c = ok1Var2;
        return ok1Var2;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return AbstractC1337qm.m5554q(this, obj);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.f8929e;
            if (this.f8930f == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f8928d;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iM5533d0 = AbstractC1337qm.m5533d0(obj.hashCode());
                    while (true) {
                        int i = iM5533d0 & length;
                        int i2 = bArr[i] & 255;
                        if (i2 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i2])) {
                            obj2 = objArr[i2 ^ 1];
                        } else {
                            iM5533d0 = i + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iM5533d1 = AbstractC1337qm.m5533d0(obj.hashCode());
                    while (true) {
                        int i3 = iM5533d1 & length2;
                        int i4 = sArr[i3] & 65535;
                        if (i4 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i4])) {
                            obj2 = objArr[i4 ^ 1];
                        } else {
                            iM5533d1 = i3 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iM5533d2 = AbstractC1337qm.m5533d0(obj.hashCode());
                    while (true) {
                        int i5 = iM5533d2 & length3;
                        int i6 = iArr[i5];
                        if (i6 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i6])) {
                            obj2 = objArr[i6 ^ 1];
                        } else {
                            iM5533d2 = i5 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return sc2.m6080x(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        nk1 nk1Var = this.f8926b;
        if (nk1Var != null) {
            return nk1Var;
        }
        nk1 nk1Var2 = new nk1(this, new ok1(this.f8929e, 0, this.f8930f));
        this.f8926b = nk1Var2;
        return nk1Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f8930f;
    }

    public final String toString() {
        int i = this.f8930f;
        sc2.m6060d(i, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
        sb.append('{');
        AbstractC0570dk it = ((mk1) entrySet()).iterator();
        boolean z = true;
        while (true) {
            om0 om0Var = (om0) it;
            if (!om0Var.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) om0Var.next();
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
    }
}

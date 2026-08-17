package p000;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class iy0 extends LinkedHashMap {

    /* JADX INFO: renamed from: b */
    public static final iy0 f5198b;

    /* JADX INFO: renamed from: a */
    public boolean f5199a = true;

    static {
        iy0 iy0Var = new iy0();
        f5198b = iy0Var;
        iy0Var.f5199a = false;
    }

    /* JADX INFO: renamed from: a */
    public static int m3497a(Object obj) {
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof ho0)) {
                return obj.hashCode();
            }
            lv1.m4291b();
            return 0;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = no0.f7481a;
        int i = length;
        for (byte b : bArr) {
            i = (i * 31) + b;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public final void m3498b() {
        if (this.f5199a) {
            return;
        }
        lv1.m4291b();
    }

    /* JADX INFO: renamed from: c */
    public final iy0 m3499c() {
        if (isEmpty()) {
            return new iy0();
        }
        iy0 iy0Var = new iy0(this);
        iy0Var.f5199a = true;
        return iy0Var;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m3498b();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM3497a = 0;
        for (Map.Entry entry : entrySet()) {
            iM3497a += m3497a(entry.getValue()) ^ m3497a(entry.getKey());
        }
        return iM3497a;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m3498b();
        Charset charset = no0.f7481a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m3498b();
        for (Object obj : map.keySet()) {
            Charset charset = no0.f7481a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m3498b();
        return super.remove(obj);
    }
}

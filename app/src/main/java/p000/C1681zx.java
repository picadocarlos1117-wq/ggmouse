package p000;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: zx */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1681zx {

    /* JADX INFO: renamed from: c */
    public static final C0101bj f13595c = new C0101bj(String.valueOf(','));

    /* JADX INFO: renamed from: d */
    public static final C1681zx f13596d = new C1681zx(k50.f5671c, false, new C1681zx(new k50((byte) 0, 14), true, new C1681zx()));

    /* JADX INFO: renamed from: a */
    public final Map f13597a;

    /* JADX INFO: renamed from: b */
    public final byte[] f13598b;

    public C1681zx(k50 k50Var, boolean z, C1681zx c1681zx) {
        String strM3801v = k50Var.m3801v();
        p32.m5177l(!strM3801v.contains(","), "Comma is currently not allowed in message encoding");
        int size = c1681zx.f13597a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(c1681zx.f13597a.containsKey(k50Var.m3801v()) ? size : size + 1);
        for (C1644yx c1644yx : c1681zx.f13597a.values()) {
            String strM3801v2 = c1644yx.f13159a.m3801v();
            if (!strM3801v2.equals(strM3801v)) {
                linkedHashMap.put(strM3801v2, new C1644yx(c1644yx.f13159a, c1644yx.f13160b));
            }
        }
        linkedHashMap.put(strM3801v, new C1644yx(k50Var, z));
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.f13597a = mapUnmodifiableMap;
        HashSet hashSet = new HashSet(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            if (((C1644yx) entry.getValue()).f13160b) {
                hashSet.add((String) entry.getKey());
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        C0101bj c0101bj = f13595c;
        c0101bj.getClass();
        Iterator it = setUnmodifiableSet.iterator();
        StringBuilder sb = new StringBuilder();
        c0101bj.m996a(sb, it);
        this.f13598b = sb.toString().getBytes(Charset.forName("US-ASCII"));
    }

    public C1681zx() {
        this.f13597a = new LinkedHashMap(0);
        this.f13598b = new byte[0];
    }
}

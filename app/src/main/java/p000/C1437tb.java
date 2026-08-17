package p000;

import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: renamed from: tb */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1437tb {

    /* JADX INFO: renamed from: b */
    public static final C1437tb f10816b = new C1437tb(new IdentityHashMap());

    /* JADX INFO: renamed from: a */
    public final IdentityHashMap f10817a;

    public C1437tb(IdentityHashMap identityHashMap) {
        this.f10817a = identityHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1437tb.class != obj.getClass()) {
            return false;
        }
        IdentityHashMap identityHashMap = ((C1437tb) obj).f10817a;
        IdentityHashMap identityHashMap2 = this.f10817a;
        if (identityHashMap2.size() != identityHashMap.size()) {
            return false;
        }
        for (Map.Entry entry : identityHashMap2.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey()) || !hr1.m3275k(entry.getValue(), identityHashMap.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.f10817a.entrySet()) {
            iHashCode += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return iHashCode;
    }

    public final String toString() {
        return this.f10817a.toString();
    }
}

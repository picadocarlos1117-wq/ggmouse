package p000;

import com.google.common.collect.AbstractC0360a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class y61 extends AbstractC0360a implements Serializable {

    /* JADX INFO: renamed from: d */
    public transient Map f12852d;

    /* JADX INFO: renamed from: e */
    public transient int f12853e;

    /* JADX INFO: renamed from: f */
    public transient x61 f12854f;

    @Override // com.google.common.collect.AbstractC0360a
    /* JADX INFO: renamed from: a */
    public final Map mo1795a() {
        Map c0551d1;
        Map map = this.f2366c;
        if (map != null) {
            return map;
        }
        Map map2 = this.f12852d;
        if (map2 instanceof NavigableMap) {
            c0551d1 = new C0002a1(this, (NavigableMap) map2);
        } else {
            c0551d1 = map2 instanceof SortedMap ? new C0551d1(this, (SortedMap) map2) : new C1611y0(this, map2);
        }
        this.f2366c = c0551d1;
        return c0551d1;
    }

    /* JADX INFO: renamed from: c */
    public final void m6999c() {
        Map map = this.f12852d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f12853e = 0;
    }
}

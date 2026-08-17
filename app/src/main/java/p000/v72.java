package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class v72 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f11575a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m6597a() {
        LinkedHashMap linkedHashMap = this.f11575a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((r72) it.next()).m5741a();
        }
        linkedHashMap.clear();
    }
}

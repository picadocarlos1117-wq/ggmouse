package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class lz1 implements Iterable {

    /* JADX INFO: renamed from: a */
    public final ArrayList f6566a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final AbstractActivityC1469u6 f6567b;

    public lz1(AbstractActivityC1469u6 abstractActivityC1469u6) {
        this.f6567b = abstractActivityC1469u6;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f6566a.iterator();
    }
}

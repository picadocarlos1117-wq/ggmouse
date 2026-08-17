package p000;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: m1 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1092m1 extends AbstractList implements List {
    /* JADX INFO: renamed from: a */
    public abstract int mo701a();

    /* JADX INFO: renamed from: b */
    public abstract Object mo702b(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return mo702b(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo701a();
    }
}

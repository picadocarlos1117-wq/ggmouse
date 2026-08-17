package p000;

import androidx.fragment.app.AbstractC0056t;
import androidx.fragment.app.AbstractComponentCallbacksC0048l;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class gf0 implements ff0 {

    /* JADX INFO: renamed from: a */
    public final int f4172a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0056t f4173b;

    public gf0(AbstractC0056t abstractC0056t, int i) {
        this.f4173b = abstractC0056t;
        this.f4172a = i;
    }

    @Override // p000.ff0
    /* JADX INFO: renamed from: a */
    public final boolean mo330a(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC0056t abstractC0056t = this.f4173b;
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = abstractC0056t.f734w;
        int i = this.f4172a;
        if (abstractComponentCallbacksC0048l == null || i >= 0 || !abstractComponentCallbacksC0048l.getChildFragmentManager().m376N(-1, 0)) {
            return abstractC0056t.m377O(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}

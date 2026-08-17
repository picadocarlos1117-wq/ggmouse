package p000;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class bn1 extends lu0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f1442a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f1443b;

    /* JADX INFO: renamed from: c */
    public final int f1444c;

    public bn1(ArrayList arrayList, AtomicInteger atomicInteger) {
        p32.m5177l(!arrayList.isEmpty(), "empty list");
        this.f1442a = arrayList;
        p32.m5188s(atomicInteger, FirebaseAnalytics.Param.INDEX);
        this.f1443b = atomicInteger;
        int size = arrayList.size();
        int iHashCode = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            iHashCode += ((lu0) obj).hashCode();
        }
        this.f1444c = iHashCode;
    }

    @Override // p000.lu0
    /* JADX INFO: renamed from: a */
    public final ju0 mo200a(yc1 yc1Var) {
        int andIncrement = this.f1443b.getAndIncrement() & Integer.MAX_VALUE;
        ArrayList arrayList = this.f1442a;
        return ((lu0) arrayList.get(andIncrement % arrayList.size())).mo200a(yc1Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bn1)) {
            return false;
        }
        bn1 bn1Var = (bn1) obj;
        ArrayList arrayList = bn1Var.f1442a;
        if (bn1Var == this) {
            return true;
        }
        if (this.f1444c != bn1Var.f1444c || this.f1443b != bn1Var.f1443b) {
            return false;
        }
        ArrayList arrayList2 = this.f1442a;
        return arrayList2.size() == arrayList.size() && new HashSet(arrayList2).containsAll(arrayList);
    }

    public final int hashCode() {
        return this.f1444c;
    }

    public final String toString() {
        C1679zv c1679zv = new C1679zv(bn1.class.getSimpleName());
        c1679zv.m7359a(this.f1442a, "subchannelPickers");
        return c1679zv.toString();
    }
}

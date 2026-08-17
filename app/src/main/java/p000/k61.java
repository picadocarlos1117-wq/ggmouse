package p000;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class k61 extends nu0 {

    /* JADX INFO: renamed from: g */
    public final long f5682g;

    /* JADX INFO: renamed from: m */
    public final ArrayList f5683m;

    /* JADX INFO: renamed from: n */
    public final ArrayList f5684n;

    public k61(int i, long j) {
        super(i, 3);
        this.f5682g = j;
        this.f5683m = new ArrayList();
        this.f5684n = new ArrayList();
    }

    /* JADX INFO: renamed from: r */
    public final k61 m3804r(int i) {
        ArrayList arrayList = this.f5684n;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            k61 k61Var = (k61) arrayList.get(i2);
            if (k61Var.f7542b == i) {
                return k61Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final l61 m3805s(int i) {
        ArrayList arrayList = this.f5683m;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            l61 l61Var = (l61) arrayList.get(i2);
            if (l61Var.f7542b == i) {
                return l61Var;
            }
        }
        return null;
    }

    @Override // p000.nu0
    public final String toString() {
        return nu0.m4596h(this.f7542b) + " leaves: " + Arrays.toString(this.f5683m.toArray()) + " containers: " + Arrays.toString(this.f5684n.toArray());
    }
}

package p000;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class m41 implements InterfaceC1085lv {

    /* JADX INFO: renamed from: b */
    public static final C1564wr f6636b = new C1564wr(new C1667zj(new l41(0), z71.f13301b), new C1667zj(new l41(1), z71.f13302c));

    /* JADX INFO: renamed from: a */
    public final ArrayList f6637a = new ArrayList();

    @Override // p000.InterfaceC1085lv
    /* JADX INFO: renamed from: a */
    public final long mo4286a(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f6637a;
            if (i >= arrayList.size()) {
                break;
            }
            long j2 = ((C1122mv) arrayList.get(i)).f7104b;
            long j3 = ((C1122mv) arrayList.get(i)).f7106d;
            if (j < j2) {
                if (jMin != -9223372036854775807L) {
                    jMin = Math.min(jMin, j2);
                    break;
                }
                jMin = j2;
                break;
            }
            if (j < j3) {
                jMin = jMin == -9223372036854775807L ? j3 : Math.min(jMin, j3);
            }
            i++;
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // p000.InterfaceC1085lv
    /* JADX INFO: renamed from: b */
    public final boolean mo4287b(C1122mv c1122mv, long j) {
        long j2 = c1122mv.f7104b;
        ki0.m3857c(j2 != -9223372036854775807L);
        ki0.m3857c(c1122mv.f7105c != -9223372036854775807L);
        boolean z = j2 <= j && j < c1122mv.f7106d;
        ArrayList arrayList = this.f6637a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((C1122mv) arrayList.get(size)).f7104b) {
                arrayList.add(size + 1, c1122mv);
                return z;
            }
        }
        arrayList.add(0, c1122mv);
        return z;
    }

    @Override // p000.InterfaceC1085lv
    /* JADX INFO: renamed from: c */
    public final qm0 mo4288c(long j) {
        ArrayList arrayList = this.f6637a;
        if (!arrayList.isEmpty()) {
            if (j >= ((C1122mv) arrayList.get(0)).f7104b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    C1122mv c1122mv = (C1122mv) arrayList.get(i);
                    if (j >= c1122mv.f7104b && j < c1122mv.f7106d) {
                        arrayList2.add(c1122mv);
                    }
                    if (j < c1122mv.f7104b) {
                        break;
                    }
                }
                om0 om0Var = qm0.f9540b;
                C1564wr c1564wr = f6636b;
                c1564wr.getClass();
                Object[] array = arrayList2.toArray();
                o21.m4665k(array.length, array);
                Arrays.sort(array, c1564wr);
                kk1 kk1VarM5565k = qm0.m5565k(array.length, array);
                nm0 nm0VarM5566m = qm0.m5566m();
                for (int i2 = 0; i2 < kk1VarM5565k.f5898d; i2++) {
                    nm0VarM5566m.m3904d(((C1122mv) kk1VarM5565k.get(i2)).f7103a);
                }
                return nm0VarM5566m.m4561g();
            }
        }
        om0 om0Var2 = qm0.f9540b;
        return kk1.f5896e;
    }

    @Override // p000.InterfaceC1085lv
    public final void clear() {
        this.f6637a.clear();
    }

    @Override // p000.InterfaceC1085lv
    /* JADX INFO: renamed from: d */
    public final long mo4289d(long j) {
        ArrayList arrayList = this.f6637a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((C1122mv) arrayList.get(0)).f7104b) {
            return -9223372036854775807L;
        }
        long jMax = ((C1122mv) arrayList.get(0)).f7104b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j2 = ((C1122mv) arrayList.get(i)).f7104b;
            long j3 = ((C1122mv) arrayList.get(i)).f7106d;
            if (j3 > j) {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            } else {
                jMax = Math.max(jMax, j3);
            }
        }
        return jMax;
    }

    @Override // p000.InterfaceC1085lv
    /* JADX INFO: renamed from: e */
    public final void mo4290e(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6637a;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((C1122mv) arrayList.get(i)).f7104b;
            if (j > j2 && j > ((C1122mv) arrayList.get(i)).f7106d) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }
}

package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: nv */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1159nv implements qx1 {

    /* JADX INFO: renamed from: c */
    public static final C1667zj f7546c = new C1667zj(new f40(28), z71.f13301b);

    /* JADX INFO: renamed from: a */
    public final qm0 f7547a;

    /* JADX INFO: renamed from: b */
    public final long[] f7548b;

    /* JADX WARN: Code duplicated, block: B:37:0x00de  */
    public C1159nv(kk1 kk1Var) {
        int i = kk1Var.f5898d;
        long j = -9223372036854775807L;
        int i2 = 0;
        if (i == 1) {
            om0 om0VarListIterator = kk1Var.listIterator(0);
            Object next = om0VarListIterator.next();
            if (om0VarListIterator.hasNext()) {
                StringBuilder sb = new StringBuilder("expected one element but was: <");
                sb.append(next);
                while (i2 < 4 && om0VarListIterator.hasNext()) {
                    sb.append(", ");
                    sb.append(om0VarListIterator.next());
                    i2++;
                }
                if (om0VarListIterator.hasNext()) {
                    sb.append(", ...");
                }
                sb.append('>');
                throw new IllegalArgumentException(sb.toString());
            }
            C1122mv c1122mv = (C1122mv) next;
            long j2 = c1122mv.f7104b;
            long j3 = c1122mv.f7105c;
            long j4 = j2 == -9223372036854775807L ? 0L : j2;
            qm0 qm0Var = c1122mv.f7103a;
            if (j3 == -9223372036854775807L) {
                this.f7547a = qm0.m5570t(qm0Var);
                this.f7548b = new long[]{j4};
                return;
            } else {
                om0 om0Var = qm0.f9540b;
                this.f7547a = qm0.m5571u(qm0Var, kk1.f5896e);
                this.f7548b = new long[]{j4, j3 + j4};
                return;
            }
        }
        long[] jArr = new long[i * 2];
        this.f7548b = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        C1667zj c1667zj = f7546c;
        c1667zj.getClass();
        Object[] array = kk1Var.toArray();
        o21.m4665k(array.length, array);
        Arrays.sort(array, c1667zj);
        kk1 kk1VarM5565k = qm0.m5565k(array.length, array);
        int i3 = 0;
        while (i2 < kk1VarM5565k.f5898d) {
            C1122mv c1122mv2 = (C1122mv) kk1VarM5565k.get(i2);
            long j5 = c1122mv2.f7104b;
            long j6 = c1122mv2.f7105c;
            qm0 qm0Var2 = c1122mv2.f7103a;
            j5 = j5 == j ? 0L : j5;
            long j7 = j5 + j6;
            if (i3 != 0) {
                int i4 = i3 - 1;
                long j8 = this.f7548b[i4];
                if (j8 < j5) {
                    this.f7548b[i3] = j5;
                    arrayList.add(qm0Var2);
                    i3++;
                } else if (j8 == j5 && ((qm0) arrayList.get(i4)).isEmpty()) {
                    arrayList.set(i4, qm0Var2);
                } else {
                    AbstractC1337qm.m5542i0("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                    this.f7548b[i4] = j5;
                    arrayList.set(i4, qm0Var2);
                }
            } else {
                this.f7548b[i3] = j5;
                arrayList.add(qm0Var2);
                i3++;
            }
            if (j6 != j) {
                this.f7548b[i3] = j7;
                arrayList.add(kk1.f5896e);
                i3++;
            }
            i2++;
            j = j;
        }
        this.f7547a = qm0.m5567n(arrayList);
    }

    @Override // p000.qx1
    /* JADX INFO: renamed from: c */
    public final int mo2822c(long j) {
        int iM7227a = z42.m7227a(this.f7548b, j, false);
        if (iM7227a < this.f7547a.size()) {
            return iM7227a;
        }
        return -1;
    }

    @Override // p000.qx1
    /* JADX INFO: renamed from: d */
    public final long mo2823d(int i) {
        ki0.m3857c(i < this.f7547a.size());
        return this.f7548b[i];
    }

    @Override // p000.qx1
    /* JADX INFO: renamed from: e */
    public final List mo2824e(long j) {
        int iM7230d = z42.m7230d(this.f7548b, j, false);
        if (iM7230d != -1) {
            return (qm0) this.f7547a.get(iM7230d);
        }
        om0 om0Var = qm0.f9540b;
        return kk1.f5896e;
    }

    @Override // p000.qx1
    /* JADX INFO: renamed from: g */
    public final int mo2825g() {
        return this.f7547a.size();
    }
}

package p000;

import java.util.List;

/* JADX INFO: renamed from: tr */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1453tr implements yq1 {

    /* JADX INFO: renamed from: a */
    public final kk1 f10928a;

    /* JADX INFO: renamed from: b */
    public long f10929b;

    public C1453tr(List list, List list2) {
        nm0 nm0VarM5566m = qm0.m5566m();
        ki0.m3857c(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            nm0VarM5566m.m3901a(new C1416sr((yq1) list.get(i), (List) list2.get(i)));
        }
        this.f10928a = nm0VarM5566m.m4561g();
        this.f10929b = -9223372036854775807L;
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: c */
    public final long mo4342c() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            kk1 kk1Var = this.f10928a;
            if (i >= kk1Var.f5898d) {
                break;
            }
            long jMo4342c = ((C1416sr) kk1Var.get(i)).f10492a.mo4342c();
            if (jMo4342c != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo4342c);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: h */
    public final boolean mo4343h() {
        int i = 0;
        while (true) {
            kk1 kk1Var = this.f10928a;
            if (i >= kk1Var.f5898d) {
                return false;
            }
            if (((C1416sr) kk1Var.get(i)).f10492a.mo4343h()) {
                return true;
            }
            i++;
        }
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: o */
    public final boolean mo4344o(fv0 fv0Var) {
        boolean zMo4344o;
        boolean z = false;
        do {
            long jMo4342c = mo4342c();
            if (jMo4342c == Long.MIN_VALUE) {
                return z;
            }
            int i = 0;
            zMo4344o = false;
            while (true) {
                kk1 kk1Var = this.f10928a;
                if (i >= kk1Var.f5898d) {
                    break;
                }
                long jMo4342c2 = ((C1416sr) kk1Var.get(i)).f10492a.mo4342c();
                boolean z2 = jMo4342c2 != Long.MIN_VALUE && jMo4342c2 <= fv0Var.f3901a;
                if (jMo4342c2 == jMo4342c || z2) {
                    zMo4344o |= ((C1416sr) kk1Var.get(i)).f10492a.mo4344o(fv0Var);
                }
                i++;
            }
            z |= zMo4344o;
        } while (zMo4344o);
        return z;
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: p */
    public final long mo4345p() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            kk1 kk1Var = this.f10928a;
            if (i >= kk1Var.f5898d) {
                break;
            }
            C1416sr c1416sr = (C1416sr) kk1Var.get(i);
            long jMo4345p = c1416sr.f10492a.mo4345p();
            qm0 qm0Var = c1416sr.f10493b;
            if ((qm0Var.contains(1) || qm0Var.contains(2) || qm0Var.contains(4)) && jMo4345p != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo4345p);
            }
            if (jMo4345p != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jMo4345p);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.f10929b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.f10929b;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: r */
    public final void mo4346r(long j) {
        int i = 0;
        while (true) {
            kk1 kk1Var = this.f10928a;
            if (i >= kk1Var.f5898d) {
                return;
            }
            ((C1416sr) kk1Var.get(i)).mo4346r(j);
            i++;
        }
    }
}

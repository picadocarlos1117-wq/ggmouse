package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class zj0 implements InterfaceC1085lv {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13430a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f13431b;

    public zj0(int i) {
        this.f13430a = i;
        switch (i) {
            case 1:
                this.f13431b = new ArrayList();
                break;
            case 2:
                this.f13431b = new ArrayList();
                break;
            default:
                this.f13431b = new ArrayList(20);
                break;
        }
    }

    @Override // p000.InterfaceC1085lv
    /* JADX INFO: renamed from: a */
    public long mo4286a(long j) {
        ArrayList arrayList = this.f13431b;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((C1122mv) arrayList.get(0)).f7104b) {
            return ((C1122mv) arrayList.get(0)).f7104b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            C1122mv c1122mv = (C1122mv) arrayList.get(i);
            long j2 = c1122mv.f7104b;
            long j3 = c1122mv.f7104b;
            if (j < j2) {
                long j4 = ((C1122mv) arrayList.get(i - 1)).f7106d;
                return (j4 == -9223372036854775807L || j4 <= j || j4 >= j3) ? j3 : j4;
            }
        }
        long j5 = ((C1122mv) sc2.m6076t(arrayList)).f7106d;
        if (j5 == -9223372036854775807L || j >= j5) {
            return Long.MIN_VALUE;
        }
        return j5;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    @Override // p000.InterfaceC1085lv
    /* JADX INFO: renamed from: b */
    public boolean mo4287b(C1122mv c1122mv, long j) {
        boolean z;
        long j2 = c1122mv.f7104b;
        ki0.m3857c(j2 != -9223372036854775807L);
        if (j2 <= j) {
            long j3 = c1122mv.f7106d;
            if (j3 == -9223372036854775807L || j < j3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        ArrayList arrayList = this.f13431b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((C1122mv) arrayList.get(size)).f7104b) {
                arrayList.add(size + 1, c1122mv);
                return z;
            }
            if (((C1122mv) arrayList.get(size)).f7104b <= j) {
                z = false;
            }
        }
        arrayList.add(0, c1122mv);
        return z;
    }

    @Override // p000.InterfaceC1085lv
    /* JADX INFO: renamed from: c */
    public qm0 mo4288c(long j) {
        int iM7316g = m7316g(j);
        if (iM7316g == 0) {
            om0 om0Var = qm0.f9540b;
            return kk1.f5896e;
        }
        C1122mv c1122mv = (C1122mv) this.f13431b.get(iM7316g - 1);
        long j2 = c1122mv.f7106d;
        if (j2 == -9223372036854775807L || j < j2) {
            return c1122mv.f7103a;
        }
        om0 om0Var2 = qm0.f9540b;
        return kk1.f5896e;
    }

    @Override // p000.InterfaceC1085lv
    public void clear() {
        this.f13431b.clear();
    }

    @Override // p000.InterfaceC1085lv
    /* JADX INFO: renamed from: d */
    public long mo4289d(long j) {
        ArrayList arrayList = this.f13431b;
        if (arrayList.isEmpty() || j < ((C1122mv) arrayList.get(0)).f7104b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((C1122mv) arrayList.get(i)).f7104b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                C1122mv c1122mv = (C1122mv) arrayList.get(i - 1);
                long j3 = c1122mv.f7106d;
                return (j3 == -9223372036854775807L || j3 > j) ? c1122mv.f7104b : j3;
            }
        }
        C1122mv c1122mv2 = (C1122mv) sc2.m6076t(arrayList);
        long j4 = c1122mv2.f7106d;
        return (j4 == -9223372036854775807L || j < j4) ? c1122mv2.f7104b : j4;
    }

    @Override // p000.InterfaceC1085lv
    /* JADX INFO: renamed from: e */
    public void mo4290e(long j) {
        int iM7316g = m7316g(j);
        if (iM7316g == 0) {
            return;
        }
        ArrayList arrayList = this.f13431b;
        long j2 = ((C1122mv) arrayList.get(iM7316g - 1)).f7106d;
        if (j2 == -9223372036854775807L || j2 >= j) {
            iM7316g--;
        }
        arrayList.subList(0, iM7316g).clear();
    }

    /* JADX INFO: renamed from: f */
    public void m7315f(Object obj, String str) {
        this.f13431b.add(str + "=" + obj);
    }

    /* JADX INFO: renamed from: g */
    public int m7316g(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f13431b;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j < ((C1122mv) arrayList.get(i)).f7104b) {
                return i;
            }
            i++;
        }
    }

    public String toString() {
        switch (this.f13430a) {
            case 1:
                return this.f13431b.toString();
            default:
                return super.toString();
        }
    }
}

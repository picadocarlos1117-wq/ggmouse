package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: bp */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0107bp extends mb2 {

    /* JADX INFO: renamed from: l */
    public final long f1498l;

    /* JADX INFO: renamed from: m */
    public final boolean f1499m;

    /* JADX INFO: renamed from: n */
    public final ArrayList f1500n;

    /* JADX INFO: renamed from: o */
    public final s02 f1501o;

    /* JADX INFO: renamed from: p */
    public C1672zo f1502p;

    /* JADX INFO: renamed from: q */
    public C0070ap f1503q;

    /* JADX INFO: renamed from: r */
    public long f1504r;

    /* JADX INFO: renamed from: s */
    public long f1505s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0107bp(AbstractC0791jh abstractC0791jh, long j, boolean z) {
        super(abstractC0791jh);
        abstractC0791jh.getClass();
        this.f1498l = j;
        this.f1499m = z;
        this.f1500n = new ArrayList();
        this.f1501o = new s02();
    }

    /* JADX INFO: renamed from: A */
    public final void m1019A(t02 t02Var) {
        long j;
        s02 s02Var = this.f1501o;
        t02Var.m6175n(0, s02Var);
        long j2 = s02Var.f10194n;
        C1672zo c1672zo = this.f1502p;
        long j3 = this.f1498l;
        ArrayList arrayList = this.f1500n;
        if (c1672zo == null || arrayList.isEmpty()) {
            this.f1504r = j2;
            this.f1505s = j3 != Long.MIN_VALUE ? j2 + j3 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C1635yo c1635yo = (C1635yo) arrayList.get(i);
                long j4 = this.f1504r;
                long j5 = this.f1505s;
                c1635yo.f13040e = j4;
                c1635yo.f13041f = j5;
            }
            j = 0;
        } else {
            j = this.f1504r - j2;
            j3 = j3 == Long.MIN_VALUE ? Long.MIN_VALUE : this.f1505s - j2;
        }
        try {
            C1672zo c1672zo2 = new C1672zo(t02Var, j, j3);
            this.f1502p = c1672zo2;
            m3638l(c1672zo2);
        } catch (C0070ap e) {
            this.f1503q = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((C1635yo) arrayList.get(i2)).f13042g = this.f1503q;
            }
        }
    }

    @Override // p000.AbstractC0791jh
    /* JADX INFO: renamed from: a */
    public final j21 mo1020a(q21 q21Var, C0547cy c0547cy, long j) {
        C1635yo c1635yo = new C1635yo(this.f6749k.mo1020a(q21Var, c0547cy, j), this.f1499m, this.f1504r, this.f1505s);
        this.f1500n.add(c1635yo);
        return c1635yo;
    }

    @Override // p000.AbstractC1234or, p000.AbstractC0791jh
    /* JADX INFO: renamed from: i */
    public final void mo1021i() throws C0070ap {
        C0070ap c0070ap = this.f1503q;
        if (c0070ap != null) {
            throw c0070ap;
        }
        super.mo1021i();
    }

    @Override // p000.AbstractC0791jh
    /* JADX INFO: renamed from: m */
    public final void mo1022m(j21 j21Var) {
        ArrayList arrayList = this.f1500n;
        ki0.m3864h(arrayList.remove(j21Var));
        this.f6749k.mo1022m(((C1635yo) j21Var).f13036a);
        if (arrayList.isEmpty()) {
            C1672zo c1672zo = this.f1502p;
            c1672zo.getClass();
            m1019A(c1672zo.f6780b);
        }
    }

    @Override // p000.AbstractC1234or, p000.AbstractC0791jh
    /* JADX INFO: renamed from: o */
    public final void mo1023o() {
        super.mo1023o();
        this.f1503q = null;
        this.f1502p = null;
    }

    @Override // p000.mb2
    /* JADX INFO: renamed from: y */
    public final void mo1024y(t02 t02Var) {
        if (this.f1503q != null) {
            return;
        }
        m1019A(t02Var);
    }
}

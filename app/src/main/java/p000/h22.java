package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class h22 {

    /* JADX INFO: renamed from: a */
    public final int f4423a;

    /* JADX INFO: renamed from: b */
    public final int f4424b;

    /* JADX INFO: renamed from: c */
    public final int f4425c;

    /* JADX INFO: renamed from: d */
    public final int f4426d;

    /* JADX INFO: renamed from: e */
    public final int f4427e;

    /* JADX INFO: renamed from: f */
    public final int f4428f;

    /* JADX INFO: renamed from: g */
    public final boolean f4429g;

    /* JADX INFO: renamed from: h */
    public final qm0 f4430h;

    /* JADX INFO: renamed from: i */
    public final qm0 f4431i;

    /* JADX INFO: renamed from: j */
    public final int f4432j;

    /* JADX INFO: renamed from: k */
    public final int f4433k;

    /* JADX INFO: renamed from: l */
    public final qm0 f4434l;

    /* JADX INFO: renamed from: m */
    public final f22 f4435m;

    /* JADX INFO: renamed from: n */
    public final qm0 f4436n;

    /* JADX INFO: renamed from: o */
    public final int f4437o;

    /* JADX INFO: renamed from: p */
    public final int f4438p;

    /* JADX INFO: renamed from: q */
    public final pk1 f4439q;

    /* JADX INFO: renamed from: r */
    public final tm0 f4440r;

    static {
        new h22(new g22());
        z42.m7252z(1);
        z42.m7252z(2);
        z42.m7252z(3);
        z42.m7252z(4);
        AbstractC1308pu.m5349p(5, 6, 7, 8, 9);
        AbstractC1308pu.m5349p(10, 11, 12, 13, 14);
        AbstractC1308pu.m5349p(15, 16, 17, 18, 19);
        AbstractC1308pu.m5349p(20, 21, 22, 23, 24);
        AbstractC1308pu.m5349p(25, 26, 27, 28, 29);
        z42.m7252z(30);
        z42.m7252z(31);
    }

    public h22(g22 g22Var) {
        this.f4423a = g22Var.f4022a;
        this.f4424b = g22Var.f4023b;
        this.f4425c = g22Var.f4024c;
        this.f4426d = g22Var.f4025d;
        this.f4427e = g22Var.f4026e;
        this.f4428f = g22Var.f4027f;
        this.f4429g = g22Var.f4028g;
        this.f4430h = g22Var.f4029h;
        this.f4431i = g22Var.f4030i;
        this.f4432j = g22Var.f4031j;
        this.f4433k = g22Var.f4032k;
        this.f4434l = g22Var.f4033l;
        this.f4435m = g22Var.f4034m;
        this.f4436n = g22Var.f4035n;
        this.f4437o = g22Var.f4036o;
        this.f4438p = g22Var.f4037p;
        this.f4439q = pk1.m5273a(g22Var.f4038q);
        this.f4440r = tm0.m6292n(g22Var.f4039r);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h22 h22Var = (h22) obj;
        if (this.f4423a != h22Var.f4423a || this.f4424b != h22Var.f4424b || this.f4425c != h22Var.f4425c || this.f4426d != h22Var.f4426d || this.f4429g != h22Var.f4429g || this.f4427e != h22Var.f4427e || this.f4428f != h22Var.f4428f || !this.f4430h.equals(h22Var.f4430h) || !this.f4431i.equals(h22Var.f4431i) || this.f4432j != h22Var.f4432j || this.f4433k != h22Var.f4433k || !this.f4434l.equals(h22Var.f4434l) || !this.f4435m.equals(h22Var.f4435m) || !this.f4436n.equals(h22Var.f4436n) || this.f4437o != h22Var.f4437o || this.f4438p != h22Var.f4438p) {
            return false;
        }
        pk1 pk1Var = h22Var.f4439q;
        pk1 pk1Var2 = this.f4439q;
        pk1Var2.getClass();
        return AbstractC1337qm.m5554q(pk1Var2, pk1Var) && this.f4440r.equals(h22Var.f4440r);
    }

    public int hashCode() {
        int iHashCode = (this.f4434l.hashCode() + ((((((this.f4431i.hashCode() + ((this.f4430h.hashCode() + ((((((((((((((this.f4423a + 31) * 31) + this.f4424b) * 31) + this.f4425c) * 31) + this.f4426d) * 28629151) + (this.f4429g ? 1 : 0)) * 31) + this.f4427e) * 31) + this.f4428f) * 31)) * 961)) * 961) + this.f4432j) * 31) + this.f4433k) * 31)) * 31;
        this.f4435m.getClass();
        return this.f4440r.hashCode() + ((this.f4439q.hashCode() + ((((((this.f4436n.hashCode() + ((iHashCode + 29791) * 31)) * 31) + this.f4437o) * 31) + this.f4438p) * 28629151)) * 31);
    }
}

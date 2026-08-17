package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ni0 extends he0 {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f7412s = 0;

    /* JADX INFO: renamed from: t */
    public Object f7413t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ nu0 f7414u;

    public ni0(rb1 rb1Var, hp0 hp0Var) {
        this.f7414u = rb1Var;
        this.f7413t = new ek0(hp0Var, 0);
    }

    @Override // p000.he0, p000.hp0
    /* JADX INFO: renamed from: T */
    public final void mo2595T(EnumC0651fs enumC0651fs, lu0 lu0Var) {
        switch (this.f7412s) {
            case 0:
                nu0 nu0Var = (nu0) this.f7413t;
                oi0 oi0Var = (oi0) this.f7414u;
                nu0 nu0Var2 = oi0Var.f7802q;
                EnumC0651fs enumC0651fs2 = EnumC0651fs.f3886b;
                if (nu0Var == nu0Var2) {
                    p32.m5193x(oi0Var.f7805t, "there's pending lb while current lb has been out of READY");
                    oi0Var.f7803r = enumC0651fs;
                    oi0Var.f7804s = lu0Var;
                    if (enumC0651fs == enumC0651fs2) {
                        oi0Var.m4804s();
                    }
                } else if (nu0Var == oi0Var.f7800o) {
                    boolean z = enumC0651fs == enumC0651fs2;
                    oi0Var.f7805t = z;
                    if (z || nu0Var2 == oi0Var.f7797g) {
                        oi0Var.f7798m.mo2595T(enumC0651fs, lu0Var);
                    } else {
                        oi0Var.m4804s();
                    }
                }
                break;
            default:
                ((ek0) this.f7413t).mo2595T(enumC0651fs, new vc1(lu0Var));
                break;
        }
    }

    @Override // p000.he0
    /* JADX INFO: renamed from: U */
    public final hp0 mo2596U() {
        switch (this.f7412s) {
            case 0:
                return ((oi0) this.f7414u).f7798m;
            default:
                return (ek0) this.f7413t;
        }
    }

    @Override // p000.he0, p000.hp0
    /* JADX INFO: renamed from: m */
    public o21 mo2597m(iu0 iu0Var) {
        switch (this.f7412s) {
            case 1:
                rb1 rb1Var = (rb1) this.f7414u;
                C0771iz c0771iz = rb1Var.f9872g;
                qb1 qb1Var = new qb1(rb1Var, iu0Var, (ek0) this.f7413t);
                List list = iu0Var.f5160b;
                if (rb1.m5758r(list) && c0771iz.containsKey(((a70) list.get(0)).f81a.get(0))) {
                    jb1 jb1Var = (jb1) c0771iz.get(((a70) list.get(0)).f81a.get(0));
                    jb1Var.m3587a(qb1Var);
                    if (jb1Var.f5351d != null) {
                        qb1Var.m5463D0();
                    }
                }
                return qb1Var;
            default:
                return super.mo2597m(iu0Var);
        }
    }

    public ni0(oi0 oi0Var) {
        this.f7414u = oi0Var;
    }
}

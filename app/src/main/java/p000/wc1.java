package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class wc1 extends nu0 {

    /* JADX INFO: renamed from: g */
    public final hp0 f12062g;

    /* JADX INFO: renamed from: m */
    public o21 f12063m;

    /* JADX INFO: renamed from: n */
    public EnumC0651fs f12064n;

    public wc1(hp0 hp0Var) {
        super(0);
        this.f12064n = EnumC0651fs.f3888d;
        this.f12062g = hp0Var;
    }

    @Override // p000.nu0
    /* JADX INFO: renamed from: a */
    public final nv1 mo1258a(ku0 ku0Var) {
        Boolean bool;
        List list = ku0Var.f6022a;
        if (list.isEmpty()) {
            nv1 nv1VarM4614g = nv1.f7559n.m4614g("NameResolver returned no usable address. addrs=" + list + ", attrs=" + ku0Var.f6023b);
            mo1259n(nv1VarM4614g);
            return nv1VarM4614g;
        }
        Object obj = ku0Var.f6024c;
        if ((obj instanceof uc1) && (bool = ((uc1) obj).f11259a) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(list);
            Collections.shuffle(arrayList, new Random());
            list = arrayList;
        }
        o21 o21Var = this.f12063m;
        if (o21Var == null) {
            iu0 iu0VarM3490c = iu0.m3490c();
            iu0VarM3490c.m3493d(list);
            iu0 iu0Var = new iu0(iu0VarM3490c.f5160b, iu0VarM3490c.f5161c, iu0VarM3490c.f5162d);
            hp0 hp0Var = this.f12062g;
            o21 o21VarMo2597m = hp0Var.mo2597m(iu0Var);
            o21VarMo2597m.mo2366u0(new ck0(2, this, o21VarMo2597m));
            this.f12063m = o21VarMo2597m;
            vc1 vc1Var = new vc1(ju0.m3709b(o21VarMo2597m, null));
            EnumC0651fs enumC0651fs = EnumC0651fs.f3885a;
            this.f12064n = enumC0651fs;
            hp0Var.mo2595T(enumC0651fs, vc1Var);
            o21VarMo2597m.mo4186q0();
        } else {
            o21Var.mo4188z0(list);
        }
        return nv1.f7550e;
    }

    @Override // p000.nu0
    /* JADX INFO: renamed from: n */
    public final void mo1259n(nv1 nv1Var) {
        o21 o21Var = this.f12063m;
        if (o21Var != null) {
            o21Var.mo4187r0();
            this.f12063m = null;
        }
        vc1 vc1Var = new vc1(ju0.m3708a(nv1Var));
        EnumC0651fs enumC0651fs = EnumC0651fs.f3887c;
        this.f12064n = enumC0651fs;
        this.f12062g.mo2595T(enumC0651fs, vc1Var);
    }

    @Override // p000.nu0
    /* JADX INFO: renamed from: p */
    public final void mo4604p() {
        o21 o21Var = this.f12063m;
        if (o21Var != null) {
            o21Var.mo4186q0();
        }
    }

    @Override // p000.nu0
    /* JADX INFO: renamed from: q */
    public final void mo1260q() {
        o21 o21Var = this.f12063m;
        if (o21Var != null) {
            o21Var.mo4187r0();
        }
    }
}

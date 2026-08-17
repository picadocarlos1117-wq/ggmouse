package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ck0 implements mu0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1851a;

    /* JADX INFO: renamed from: b */
    public final Object f1852b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1853c;

    public /* synthetic */ ck0(int i, Object obj, Object obj2) {
        this.f1851a = i;
        this.f1853c = obj;
        this.f1852b = obj2;
    }

    @Override // p000.mu0
    /* JADX INFO: renamed from: a */
    public final void mo1228a(C0688gs c0688gs) {
        lu0 vc1Var;
        int i = this.f1851a;
        Object obj = this.f1852b;
        Object obj2 = this.f1853c;
        switch (i) {
            case 0:
                ((mu0) obj).mo1228a(c0688gs);
                ((dk0) obj2).f2957j.mo1228a(c0688gs);
                break;
            case 1:
                qb1 qb1Var = (qb1) obj2;
                qb1Var.f9473l = c0688gs;
                if (!qb1Var.f9472k) {
                    ((mu0) obj).mo1228a(c0688gs);
                }
                break;
            default:
                wc1 wc1Var = (wc1) obj2;
                hp0 hp0Var = wc1Var.f12062g;
                o21 o21Var = (o21) obj;
                EnumC0651fs enumC0651fs = c0688gs.f4304a;
                if (enumC0651fs != EnumC0651fs.f3889e) {
                    EnumC0651fs enumC0651fs2 = EnumC0651fs.f3888d;
                    EnumC0651fs enumC0651fs3 = EnumC0651fs.f3887c;
                    if (enumC0651fs == enumC0651fs3 || enumC0651fs == enumC0651fs2) {
                        hp0Var.mo3071K();
                    }
                    if (wc1Var.f12064n == enumC0651fs3) {
                        if (enumC0651fs != EnumC0651fs.f3885a) {
                            if (enumC0651fs == enumC0651fs2) {
                                wc1Var.mo4604p();
                            }
                            break;
                        }
                    }
                    int iOrdinal = enumC0651fs.ordinal();
                    if (iOrdinal == 0) {
                        vc1Var = new vc1(ju0.f5526e);
                    } else if (iOrdinal == 1) {
                        vc1Var = new vc1(ju0.m3709b(o21Var, null));
                    } else if (iOrdinal == 2) {
                        vc1Var = new vc1(ju0.m3708a(c0688gs.f4305b));
                    } else if (iOrdinal != 3) {
                        l41.m4038g(enumC0651fs, "Unsupported state:");
                    } else {
                        vc1Var = new rc1(wc1Var, o21Var);
                    }
                    wc1Var.f12064n = enumC0651fs;
                    hp0Var.mo2595T(enumC0651fs, vc1Var);
                    break;
                }
                break;
        }
    }
}

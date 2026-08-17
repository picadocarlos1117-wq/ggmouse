package p000;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class nh1 {

    /* JADX INFO: renamed from: c */
    public static final nh1 f7407c = new nh1();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f7409b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final ay0 f7408a = new ay0(0);

    /* JADX INFO: renamed from: a */
    public final qp1 m4549a(Class cls) {
        qp1 qp1VarM876A;
        Class cls2;
        no0.m4572a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f7409b;
        qp1 qp1Var = (qp1) concurrentHashMap.get(cls);
        if (qp1Var != null) {
            return qp1Var;
        }
        ay0 ay0Var = this.f7408a;
        ay0Var.getClass();
        Class cls3 = tp1.f10919a;
        if (!fi0.class.isAssignableFrom(cls) && (cls2 = tp1.f10919a) != null && !cls2.isAssignableFrom(cls)) {
            f40.m2713i("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
            return null;
        }
        si1 si1VarMo6703a = ((zx0) ay0Var.f1096b).mo6703a(cls);
        if ((si1VarMo6703a.f10415d & 2) == 2) {
            if (fi0.class.isAssignableFrom(cls)) {
                qp1VarM876A = new c51(tp1.f10921c, w80.f12024a, si1VarMo6703a.f10412a);
            } else {
                b42 b42Var = tp1.f10920b;
                v80 v80Var = w80.f12025b;
                if (v80Var == null) {
                    f40.m2719o("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                qp1VarM876A = new c51(b42Var, v80Var, si1VarMo6703a.f10412a);
            }
        } else if (fi0.class.isAssignableFrom(cls)) {
            qp1VarM876A = AbstractC1308pu.m5359z(si1VarMo6703a.m6103a()) != 1 ? b51.m876A(si1VarMo6703a, n81.f7305b, ft0.f3895b, tp1.f10921c, w80.f12024a, ky0.f6079b) : b51.m876A(si1VarMo6703a, n81.f7305b, ft0.f3895b, tp1.f10921c, null, ky0.f6079b);
        } else if (AbstractC1308pu.m5359z(si1VarMo6703a.m6103a()) != 1) {
            m81 m81Var = n81.f7304a;
            dt0 dt0Var = ft0.f3894a;
            b42 b42Var2 = tp1.f10920b;
            v80 v80Var2 = w80.f12025b;
            if (v80Var2 == null) {
                f40.m2719o("Protobuf runtime is not correctly loaded.");
                return null;
            }
            qp1VarM876A = b51.m876A(si1VarMo6703a, m81Var, dt0Var, b42Var2, v80Var2, ky0.f6078a);
        } else {
            qp1VarM876A = b51.m876A(si1VarMo6703a, n81.f7304a, ft0.f3894a, tp1.f10920b, null, ky0.f6078a);
        }
        qp1 qp1Var2 = (qp1) concurrentHashMap.putIfAbsent(cls, qp1VarM876A);
        return qp1Var2 != null ? qp1Var2 : qp1VarM876A;
    }
}

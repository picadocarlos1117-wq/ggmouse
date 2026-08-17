package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class xc1 extends ou0 {

    /* JADX INFO: renamed from: a */
    public static final boolean f12560a;

    static {
        f12560a = !p32.m5152S(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST")) && Boolean.parseBoolean(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST"));
    }

    @Override // p000.ou0
    /* JADX INFO: renamed from: a */
    public final String mo2844a() {
        return "pick_first";
    }

    @Override // p000.ou0
    /* JADX INFO: renamed from: b */
    public final nu0 mo2845b(hp0 hp0Var) {
        return f12560a ? new tc1(hp0Var) : new wc1(hp0Var);
    }

    @Override // p000.ou0
    /* JADX INFO: renamed from: c */
    public final v71 mo2846c(Map map) {
        try {
            return new v71(new uc1(AbstractC1337qm.m5557t("shuffleAddressList", map)));
        } catch (RuntimeException e) {
            return new v71(nv1.f7559n.m4613f(e).m4614g("Failed parsing configuration for pick_first"));
        }
    }
}

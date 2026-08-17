package p000;

import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class dk0 extends le0 {

    /* JADX INFO: renamed from: i */
    public final o21 f2956i;

    /* JADX INFO: renamed from: j */
    public final mu0 f2957j;

    public dk0(o21 o21Var, mu0 mu0Var) {
        p32.m5188s(o21Var, "delegate");
        this.f2956i = o21Var;
        p32.m5188s(mu0Var, "healthListener");
        this.f2957j = mu0Var;
    }

    @Override // p000.le0
    /* JADX INFO: renamed from: C0 */
    public final o21 mo2365C0() {
        return this.f2956i;
    }

    @Override // p000.o21
    public final C1437tb getAttributes() {
        C1437tb attributes = this.f2956i.getAttributes();
        attributes.getClass();
        Boolean bool = Boolean.TRUE;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(nu0.f7539e, bool);
        for (Map.Entry entry : attributes.f10817a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((C1400sb) entry.getKey(), entry.getValue());
            }
        }
        return new C1437tb(identityHashMap);
    }

    @Override // p000.o21
    /* JADX INFO: renamed from: u0 */
    public final void mo2366u0(mu0 mu0Var) {
        this.f2956i.mo2366u0(new ck0(0, this, mu0Var));
    }
}

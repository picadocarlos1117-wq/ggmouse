package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class rc1 extends lu0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9884a = 0;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f9885b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public final Object f9886c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ nu0 f9887d;

    public rc1(wc1 wc1Var, o21 o21Var) {
        this.f9887d = wc1Var;
        p32.m5188s(o21Var, "subchannel");
        this.f9886c = o21Var;
    }

    @Override // p000.lu0
    /* JADX INFO: renamed from: a */
    public final ju0 mo200a(yc1 yc1Var) {
        int i = this.f9884a;
        nu0 nu0Var = this.f9887d;
        AtomicBoolean atomicBoolean = this.f9885b;
        switch (i) {
            case 0:
                if (atomicBoolean.compareAndSet(false, true)) {
                    ry1 ry1VarMo3070A = ((tc1) nu0Var).f10831g.mo3070A();
                    tc1 tc1Var = (tc1) this.f9886c;
                    Objects.requireNonNull(tc1Var);
                    ry1VarMo3070A.execute(new RunnableC1430t4(tc1Var, 21));
                }
                break;
            default:
                if (atomicBoolean.compareAndSet(false, true)) {
                    ((wc1) nu0Var).f12062g.mo3070A().execute(new RunnableC1621ya(this, 22));
                }
                break;
        }
        return ju0.f5526e;
    }

    public rc1(tc1 tc1Var, tc1 tc1Var2) {
        this.f9887d = tc1Var;
        this.f9886c = tc1Var2;
    }
}

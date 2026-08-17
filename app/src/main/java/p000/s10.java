package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class s10 implements InterfaceC1413so {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1413so f10195a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f10196b;

    /* JADX INFO: renamed from: c */
    public List f10197c = new ArrayList();

    public s10(InterfaceC1413so interfaceC1413so) {
        this.f10195a = interfaceC1413so;
    }

    /* JADX INFO: renamed from: a */
    public final void m5939a(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f10196b) {
                    runnable.run();
                } else {
                    this.f10197c.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC1413so
    /* JADX INFO: renamed from: f */
    public final void mo4761f(j51 j51Var) {
        m5939a(new RunnableC1466u3(18, this, j51Var));
    }

    @Override // p000.InterfaceC1413so
    /* JADX INFO: renamed from: p */
    public final void mo4768p() {
        if (this.f10196b) {
            this.f10195a.mo4768p();
        } else {
            m5939a(new RunnableC1621ya(this, 7));
        }
    }

    @Override // p000.InterfaceC1413so
    /* JADX INFO: renamed from: s */
    public final void mo4770s(pn0 pn0Var) {
        if (this.f10196b) {
            this.f10195a.mo4770s(pn0Var);
        } else {
            m5939a(new RunnableC1466u3(17, this, pn0Var));
        }
    }

    @Override // p000.InterfaceC1413so
    /* JADX INFO: renamed from: x */
    public final void mo4775x(nv1 nv1Var, EnumC1376ro enumC1376ro, j51 j51Var) {
        m5939a(new RunnableC1091m0(this, nv1Var, enumC1376ro, j51Var, 2));
    }
}

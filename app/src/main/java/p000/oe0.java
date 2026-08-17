package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class oe0 extends AbstractC1095m4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f7768a;

    public oe0(AtomicReference atomicReference) {
        this.f7768a = atomicReference;
    }

    @Override // p000.AbstractC1095m4
    /* JADX INFO: renamed from: a */
    public final void mo4381a(Object obj) {
        AbstractC1095m4 abstractC1095m4 = (AbstractC1095m4) this.f7768a.get();
        if (abstractC1095m4 != null) {
            abstractC1095m4.mo4381a(obj);
        } else {
            f40.m2719o("Operation cannot be started before fragment is in created state");
        }
    }
}

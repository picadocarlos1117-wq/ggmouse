package p000;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class q90 extends to1 {

    /* JADX INFO: renamed from: e */
    public final HashMap f9446e = new HashMap();

    @Override // p000.to1
    /* JADX INFO: renamed from: a */
    public final qo1 mo5457a(Object obj) {
        return (qo1) this.f9446e.get(obj);
    }

    @Override // p000.to1
    /* JADX INFO: renamed from: b */
    public final Object mo5458b(Object obj) {
        Object objMo5458b = super.mo5458b(obj);
        this.f9446e.remove(obj);
        return objMo5458b;
    }
}

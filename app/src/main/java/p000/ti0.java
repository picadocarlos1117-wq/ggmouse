package p000;

import java.net.ProxySelector;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ti0 implements ey1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10894a;

    @Override // p000.ey1
    public final Object get() {
        switch (this.f10894a) {
            case 0:
                return new sv1();
            default:
                return ProxySelector.getDefault();
        }
    }
}

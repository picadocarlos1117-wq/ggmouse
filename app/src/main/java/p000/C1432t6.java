package p000;

import android.view.LayoutInflater;

/* JADX INFO: renamed from: t6 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1432t6 implements ua1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractActivityC1469u6 f10766a;

    public C1432t6(AbstractActivityC1469u6 abstractActivityC1469u6) {
        this.f10766a = abstractActivityC1469u6;
    }

    @Override // p000.ua1
    /* JADX INFO: renamed from: a */
    public final void mo360a(AbstractActivityC0613er abstractActivityC0613er) {
        AbstractActivityC1469u6 abstractActivityC1469u6 = this.f10766a;
        AbstractC0593e7 delegate = abstractActivityC1469u6.getDelegate();
        LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7 = (LayoutInflaterFactory2C1359r7) delegate;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(layoutInflaterFactory2C1359r7.f9792p);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(layoutInflaterFactory2C1359r7);
        } else {
            layoutInflaterFrom.getFactory2();
        }
        abstractActivityC1469u6.getSavedStateRegistry().m3233a("androidx:appcompat");
        delegate.mo2537c();
    }
}

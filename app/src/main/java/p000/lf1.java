package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class lf1 extends kf1 {

    /* JADX INFO: renamed from: c */
    public final Object f6343c;

    public lf1() {
        super(12);
        this.f6343c = new Object();
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: a */
    public final Object mo3822a() {
        Object objMo3822a;
        synchronized (this.f6343c) {
            objMo3822a = super.mo3822a();
        }
        return objMo3822a;
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: c */
    public final boolean mo3824c(Object obj) {
        boolean zMo3824c;
        synchronized (this.f6343c) {
            zMo3824c = super.mo3824c(obj);
        }
        return zMo3824c;
    }
}

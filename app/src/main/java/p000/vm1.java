package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class vm1 extends AbstractC0570dk {

    /* JADX INFO: renamed from: b */
    public final wm1 f11715b;

    /* JADX INFO: renamed from: c */
    public AbstractC0570dk f11716c;

    public vm1(xm1 xm1Var) {
        super(0);
        this.f11715b = new wm1(xm1Var);
        this.f11716c = m6643b();
    }

    @Override // p000.AbstractC0570dk
    /* JADX INFO: renamed from: a */
    public final byte mo1227a() {
        AbstractC0570dk abstractC0570dk = this.f11716c;
        if (abstractC0570dk == null) {
            ca0.m1185q();
            return (byte) 0;
        }
        byte bMo1227a = abstractC0570dk.mo1227a();
        if (!this.f11716c.hasNext()) {
            this.f11716c = m6643b();
        }
        return bMo1227a;
    }

    /* JADX INFO: renamed from: b */
    public final C0138ck m6643b() {
        wm1 wm1Var = this.f11715b;
        if (wm1Var.hasNext()) {
            return new C0138ck(wm1Var.m6808a());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11716c != null;
    }
}
